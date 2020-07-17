package ru.skillbranch.Devintensive.utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?, String?> {
        //TODO FIX!!!
        val parts: List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, devider: String = " "): String {
        TODO("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val firstName: String? = firstName?.let{it.first().toUpperCase().toString()}
        val lastName: String? = lastName?.let{it.first().toUpperCase().toString()}
        if (firstName.equals(null) && lastName.equals(null)){
            return null
        } else if (firstName!=null && lastName==null) {
            return "$firstName"
        } else if (firstName==null && lastName!=null) {
            return "$lastName"
        } else {
            return "$firstName$lastName"
        }


    }
}