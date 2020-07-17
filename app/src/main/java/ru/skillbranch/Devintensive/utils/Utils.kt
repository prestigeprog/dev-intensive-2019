package ru.skillbranch.Devintensive.utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?, String?> {

        val parts: List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        return firstName to lastName
    }



    fun toInitials(firstName: String?, lastName: String?): String? {
        val firstLetter: String? = firstName?.let{it.first().toUpperCase().toString()}
        val lastLetter: String? = lastName?.let{it.first().toUpperCase().toString()}
        if (firstLetter.equals(null) && lastLetter.equals(null)){
            return null
        } else if (firstLetter!=null && lastLetter==null) {
            return "$firstLetter"
        } else if (firstLetter==null && lastLetter!=null) {
            return "$lastLetter"
        } else {
            return "$firstLetter$lastLetter"
        }


    }
}