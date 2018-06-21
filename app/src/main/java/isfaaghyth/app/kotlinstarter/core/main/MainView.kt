package isfaaghyth.app.kotlinstarter.core.main

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface MainView {
    fun onSuccess(data: String)
    fun onError(err: String)
}