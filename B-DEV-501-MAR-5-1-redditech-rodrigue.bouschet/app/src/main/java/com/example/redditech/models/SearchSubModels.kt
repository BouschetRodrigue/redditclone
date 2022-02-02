package com.example.redditech.models

import com.example.redditech.utils.DataProvider
import org.json.JSONArray
import org.json.JSONObject

object SearchSubModels {
    private var dataHot: JSONObject? = null
    private var dataNew: JSONObject? = null
    private var dataBest: JSONObject? = null

    fun getNewData(): JSONArray {
        val data = dataNew!!.getJSONObject("data")
        val array = data.getJSONArray("children")
        return (array)
    }

    fun getHotData(): JSONArray {
        val data = dataHot!!.getJSONObject("data")
        DataProvider.afterName = data.optString("after")
        val array = data.getJSONArray("children")
        return (array)
    }

    fun getBestData(): JSONArray {
        val data = dataBest!!.getJSONObject("data")
        DataProvider.afterName = data.optString("after")
        val array = data.getJSONArray("children")
        return (array)
    }

}