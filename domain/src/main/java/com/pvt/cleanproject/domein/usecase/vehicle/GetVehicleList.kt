package com.pvt.cleanproject.domein.usecase.vehicle

import com.pvt.cleanproject.domein.entity.vehicle.Vehicle

interface GetVehicleList {

    fun get() : List<Vehicle>
}