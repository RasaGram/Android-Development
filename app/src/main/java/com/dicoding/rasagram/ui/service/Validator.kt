package com.dicoding.rasagram.ui.service


object Validator {
    fun validateUsername(fName:String) : ValidationResult {
        return ValidationResult(
            (!fName.isNullOrEmpty() && fName.length >= 4)
        )
    }
    fun validateEmail(fEmail:String): ValidationResult {
        val isValidEmail = !fEmail.isNullOrEmpty() && fEmail.endsWith("@gmail.com")
        return ValidationResult(isValidEmail)
    }
    fun validatePassword(fPassword:String): ValidationResult {
        return ValidationResult(
            (!fPassword.isNullOrEmpty() && fPassword.length >= 8)
        )
    }
}

data class ValidationResult(
    val status :Boolean = false
)