package ru.skillbranch.Devintensive.extensions

import ru.skillbranch.Devintensive.models.User
import ru.skillbranch.Devintensive.models.UserView
import ru.skillbranch.Devintensive.utils.Utils
import java.util.*

fun User.toUserView() : UserView {

    val initials = Utils.toInitials(firstName, lastName)
    val status = if(lastVisit == null) "none" else if (isOnline) "online" else "poslednii raz bil 2 days ago}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        nickName = "ff",
        initials = initials,
        status = status
    )
}



