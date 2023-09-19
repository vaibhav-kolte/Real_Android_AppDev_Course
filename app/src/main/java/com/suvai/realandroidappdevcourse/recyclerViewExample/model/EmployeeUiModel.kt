package com.suvai.realandroidappdevcourse.recyclerViewExample.model

import com.suvai.realandroidappdevcourse.recyclerViewExample.EmployeeGender
import com.suvai.realandroidappdevcourse.recyclerViewExample.EmployeeRole

data class EmployeeUiModel(
    val name: String,
    val biography: String,
    val role: EmployeeRole,
    val gender: EmployeeGender,
    val imageUrl: String
)
