package com.other

import android.net.Uri

/**
 * @author 侯中州
 * @CreateDate: 2020/8/11 10:07
 * @Description: URI参数解析
 */
object UriParseUtils {
    /**
     * @return 协议
     */
    fun getScheme(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.scheme
    }

    /**
     * * @return 域名+端口号+路径+参数
     */
    fun getSchemeSpecificPart(url: String): String {
        val mUri = Uri.parse(url)
        return mUri.schemeSpecificPart
    }

    /**
     * * @return 域名+端口号
     */
    fun getAuthority(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.authority
    }

    /**
     * * @return 域名
     */
    fun getHost(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.host
    }

    /**
     * * @return 端口号
     */
    fun getPort(url: String): Int {
        val mUri = Uri.parse(url)
        return mUri.port
    }

    /**
     * * @return fragment最后的
     */
    fun getFragment(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.fragment
    }

    /**
     * * @return 路径
     */
    fun getPath(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.path
    }

    /**
     * * @return 参数
     */
    fun getQuery(url: String): String? {
        val mUri = Uri.parse(url)
        return mUri.query
    }

    /**
     * * @return 根据参数的 key，取出相应的值
     */
    fun getQueryParameter(url: String, key: String?): String? {
        val mUri = Uri.parse(url)
        return mUri.getQueryParameter(key)
    }

    /**
     * * @return 获取所有参数key
     */
    fun getQueryAll(url: String): List<String> {
        val mUri = Uri.parse(url)
        return mUri.queryParameterNames.toList()
    }

    /**
     * * @return 依次提取出Path的各个部分的字符串，以字符串数组的形式输出
     */
    fun getPathSegments(url: String): List<String> {
        val mUri = Uri.parse(url)
        return mUri.pathSegments
    }
}