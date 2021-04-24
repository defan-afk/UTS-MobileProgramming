package getar.uts18090023.NmusikStore.activity.login

import getar.uts18090023.NmusikStore.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}