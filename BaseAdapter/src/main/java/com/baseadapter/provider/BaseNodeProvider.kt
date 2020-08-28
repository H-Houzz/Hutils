package com.baseadapter.provider

import com.baseadapter.BaseNodeAdapter
import com.baseadapter.entity.node.BaseNode

abstract class BaseNodeProvider : BaseItemProvider<BaseNode>() {

    override fun getAdapter(): BaseNodeAdapter? {
        return super.getAdapter() as? BaseNodeAdapter
    }

}