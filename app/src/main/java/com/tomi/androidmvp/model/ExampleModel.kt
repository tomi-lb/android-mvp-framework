package com.tomi.androidmvp.model

/**
 * Created by tomi on 2019/8/27
 */
class ExampleModel {

    /**
     * 获取数据，可以是从数据库，网络等地方获取
     */
    fun fackRequest() : String {
        Thread.sleep(3 * 1000)
        return "this is model result"
    }
}