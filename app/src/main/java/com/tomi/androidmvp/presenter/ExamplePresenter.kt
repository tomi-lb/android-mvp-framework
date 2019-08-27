package com.tomi.androidmvp.presenter

import com.tomi.androidmvp.base.BasePresenter
import com.tomi.androidmvp.base.IBaseView
import com.tomi.androidmvp.contract.ExampleContract
import com.tomi.androidmvp.model.ExampleModel
import com.tomi.androidmvp.util.MainHandler

/**
 * Created by tomi on 2019/8/27
 */
class ExamplePresenter: BasePresenter<ExampleContract.View>(), ExampleContract.Presenter {
    var model = ExampleModel()

    override fun commit() {
        Thread(Runnable {
            var result = model.fackRequest()
            MainHandler.mInstance.runOnUiThread(Runnable { mView?.updateUI(result) })
        }).start()
    }
}