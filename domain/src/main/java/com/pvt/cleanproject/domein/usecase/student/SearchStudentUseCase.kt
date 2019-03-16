package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.student.SearchParams
import com.pvt.cleanproject.domein.entity.student.Student

interface SearchStudentUseCase {
    fun search(params: SearchParams): List<Student>
}