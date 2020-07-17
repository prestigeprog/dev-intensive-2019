package ru.skillbranch.Devintensive.utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?, String?> {

        val parts: List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        return firstName to lastName
    }



    fun toInitials(firstName: String?, lastName: String?): String? {
        val firstLetter = firstName?.firstOrNull()
        val secondLetter = lastName?.firstOrNull()
        return "$firstLetter$secondLetter"


    }

}