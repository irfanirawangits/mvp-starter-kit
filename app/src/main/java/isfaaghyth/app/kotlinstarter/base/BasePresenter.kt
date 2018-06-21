package isfaaghyth.app.kotlinstarter.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import isfaaghyth.app.kotlinstarter.network.Routes

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
open class BasePresenter<V> {
    protected var view: V? = null
    protected var service: Routes? = null
    var compositeDisposable: CompositeDisposable? = null

    fun attachView(view: V) {
        this.view = view

    }

    fun dettachView() {
        this.view = view
        if (compositeDisposable != null)
            compositeDisposable!!.clear()
        stopSubscribe()
    }

    fun subscribe(disposable: Disposable) {
        if (compositeDisposable == null)
            compositeDisposable = CompositeDisposable()
        compositeDisposable!!.add(disposable)
    }

    fun stopSubscribe() {
        if (compositeDisposable != null)
            compositeDisposable!!.clear()
    }
}