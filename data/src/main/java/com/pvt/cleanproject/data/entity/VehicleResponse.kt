package com.pvt.cleanproject.data.entity

import com.pvt.cleanproject.data.entity.vehicle.CoordinateResponse

class VehicleResponse(

    val id: Int,
    val coordinate: CoordinateResponse,
    val fleetType: String,
    val heading: Double
)
