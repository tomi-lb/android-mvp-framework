package com.tomi.androidmvp.base

import android.app.Activity
import android.os.Bundle

/**
 * Created by tomi on 2019/8/27
 */
abstract class BaseActivity<K : IBaseView, V : BasePresenter<K>> : Activity(), IBaseView {
    var mPresenter: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mPresenter = createPresenter()
        mPresenter?.attachView(this as K)
        setContentView(getLayout())
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dismissLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    abstract fun getLayout(): Int
    abstract fun createPresenter(): V
}