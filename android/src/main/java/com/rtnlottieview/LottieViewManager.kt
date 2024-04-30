package com.rtnlottieview

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RTNLottieViewManagerInterface
import com.facebook.react.viewmanagers.RTNLottieViewManagerDelegate

@ReactModule(name = LottieViewManager.NAME)
class LottieViewManager(context: ReactApplicationContext) : SimpleViewManager<LottieView>(), RTNLottieViewManagerInterface<LottieView> {
  private val delegate: ViewManagerDelegate<LottieView> = RTNLottieViewManagerDelegate(this)

  override fun getDelegate(): ViewManagerDelegate<LottieView> = delegate

  override fun getName(): String = NAME

  override fun createViewInstance(context: ThemedReactContext): LottieView = LottieView(context)

  @ReactProp(name = "text")
  override fun setText(view: LottieView, text: String?) {
    view.text = text
  }

  companion object {
    const val NAME = "RTNLottieView"
  }
}