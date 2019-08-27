package com.tomi.androidmvp.ui.activity

import android.os.Bundle
import com.tomi.androidmvp.R
import com.tomi.androidmvp.base.BaseActivity
import com.tomi.androidmvp.contract.ExampleContract
import com.tomi.androidmvp.presenter.ExamplePresenter
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity : BaseActivity<ExampleContract.View, ExamplePresenter>(), ExampleContract.View {
    override fun getLayout(): Int {
        return R.layout.activity_example
    }

    override fun createPresenter(): ExamplePresenter {
        return ExamplePresenter()
    }

    override fun updateUI(result: String) {
        tv_result.text = result
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_commit.setOnClickListener {
            tv_result.text = "loading..."
            mPresenter?.commit()
        }
    }

}
