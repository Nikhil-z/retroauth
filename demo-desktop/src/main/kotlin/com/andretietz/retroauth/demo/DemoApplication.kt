package com.andretietz.retroauth.demo

import tornadofx.App
import tornadofx.launch

class DemoApplication : App(MainView::class)

fun main() {
  launch<DemoApplication>()
}
