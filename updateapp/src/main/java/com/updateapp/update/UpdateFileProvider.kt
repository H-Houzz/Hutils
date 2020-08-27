package com.updateapp.update

import androidx.core.content.FileProvider
import com.updateapp.extension.log
import com.updateapp.extension.yes
import com.updateapp.util.GlobalContextProvider

/**
 * desc: UpdateFileProvider
 * time: 2019/7/10
 * @author Teprinciple
 */
class UpdateFileProvider : FileProvider() {
    override fun onCreate(): Boolean {
        val result = super.onCreate()
        (GlobalContextProvider.mContext == null && context != null).yes {
            GlobalContextProvider.mContext = context
            log("内部Provider初始化context：" + GlobalContextProvider.mContext)
        }
        return result
    }
}