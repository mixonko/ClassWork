package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.SearchParams
import com.pvt.cleanproject.domein.entity.Student

interface SearchStudentUseCase {
    fun search(params: SearchParams): List<Student>
}