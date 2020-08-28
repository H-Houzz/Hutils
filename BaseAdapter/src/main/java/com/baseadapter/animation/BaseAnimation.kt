package com.baseadapter.animation

import android.animation.Animator
import android.view.View

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
interface BaseAnimation {
    fun animators(view: View): Array<Animator>
}