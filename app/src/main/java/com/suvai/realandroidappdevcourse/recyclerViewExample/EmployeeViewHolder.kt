package com.suvai.realandroidappdevcourse.recyclerViewExample

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.suvai.realandroidappdevcourse.R
import com.suvai.realandroidappdevcourse.recyclerViewExample.model.EmployeeUiModel

private val FEMALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9793;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private val MALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9794;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}

private const val UNKNOWN_SYMBOL = "?"

class EmployeeViewHolder(containerView: View, private val imageLoader: Glide) :
    ViewHolder(containerView) {
    private val employeeNameView: TextView by lazy {
        containerView.findViewById(R.id.item_employee_name)
    }
    private val employeeRoleView: TextView by lazy {
        containerView.findViewById(R.id.item_employee_role)
    }
    private val employeeBioView: TextView by lazy {
        containerView.findViewById(R.id.item_employee_biography)
    }
    private val employeeGenderView: TextView by lazy {
        containerView.findViewById(R.id.item_employee_gender)
    }
    private val employeePhotoView: ImageView by lazy {
        containerView.findViewById(R.id.photo)
    }

    fun bindData(employeeData: EmployeeUiModel) {
        Glide.with(employeeGenderView.context).load(employeeData.imageUrl).into(employeePhotoView);

//        imageLoader.loadImage(employeeData.imageUrl, employeePhotoView)
        employeeNameView.text = employeeData.name
        employeeRoleView.text = when (employeeData.role) {
            EmployeeRole.HumanResources -> "Human Resources"
            EmployeeRole.Security -> "Security"
            EmployeeRole.Technology -> "Technology"
        }
        employeeBioView.text = employeeData.biography
        employeeGenderView.text = when (employeeData.gender) {
            EmployeeGender.Female -> FEMALE_SYMBOL
            EmployeeGender.Male -> MALE_SYMBOL
            EmployeeGender.Unknown -> UNKNOWN_SYMBOL
        }
    }
}