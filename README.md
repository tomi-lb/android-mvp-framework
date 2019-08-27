# android-mvp-framework

基于Kotlin实现的一个MVP架构框架，没有任何第三方库和多余代码，纯手工打造，帮助大家把MVP的模式运用到项目组织中。该项目可作为项目基类框架使用，代码中有一个实例，完整的走完了MVP的所有流程，后续扩展可参考该实例进行。

MVP的代码流程

用户对View进行操作，View交给Presenter处理，Presenter决定调用哪个Model，Model处理完数据后通知Presenter，Presenter又通过它持有的view引用来更新UI。


