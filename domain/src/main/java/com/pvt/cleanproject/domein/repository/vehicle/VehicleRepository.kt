package com.pvt.cleanproject.domein.repository.vehicle

import com.pvt.cleanproject.domein.entity.vehicle.CoordinateParam
import com.pvt.cleanproject.domein.entity.vehicle.Vehicle

interface VehicleRepository {

    fun fetch(param: CoordinateParam) : List <Vehicle>

}