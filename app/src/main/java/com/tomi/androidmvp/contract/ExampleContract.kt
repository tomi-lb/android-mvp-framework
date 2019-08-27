package com.tomi.androidmvp.contract

import com.tomi.androidmvp.base.IBaseView
import com.tomi.androidmvp.base.IPresenter

/**
 * Created by tomi on 2019/8/27
 */
interface ExampleContract {
    interface View : IBaseView {
        fun updateUI(result : String)
    }

    interface Presenter : IPresenter<View> {
        fun commit()
    }
}