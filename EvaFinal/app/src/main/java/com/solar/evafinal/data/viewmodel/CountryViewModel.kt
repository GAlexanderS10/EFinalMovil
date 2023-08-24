package com.solar.evafinal.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.solar.evafinal.data.retrofit.RetrofitClient
import com.solar.evafinal.model.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CountryViewModel: ViewModel() {

    private var _getCountries = MutableLiveData<List<Country>>()
    val getCountries: LiveData<List<Country>> get() = _getCountries

    fun getCountries(){
        viewModelScope.launch(Dispatchers.IO) {
            val response  = RetrofitClient.countryService.getAllCountries()
            withContext(Dispatchers.Main){
                _getCountries.value = response.body()
            }
        }
    }

}