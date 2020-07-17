package ru.skillbranch.Devintensive.extensions

import ru.skillbranch.Devintensive.models.User
import ru.skillbranch.Devintensive.models.UserView
import ru.skillbranch.Devintensive.utils.Utils
import java.util.*

fun User.toUserView() : UserView {

    val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)
    val status = if(lastVisit == null) "none" else if (isOnline) "online" else "poslednii raz bil ${lastVisit.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        nickName = nickName,
        initials = initials,
        status = status
    )
}


