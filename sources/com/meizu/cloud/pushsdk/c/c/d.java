package com.meizu.cloud.pushsdk.c.c;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.sankuai.titans.proxy.util.Constants;
/* loaded from: classes3.dex */
public final class d {
    public static boolean a(String str) {
        return "POST".equals(str) || OneIdNetworkTool.PUT.equals(str) || "PATCH".equals(str) || "PROPPATCH".equals(str) || "REPORT".equals(str);
    }

    public static boolean b(String str) {
        return a(str) || Constants.KEY_METHOD_OPTIONS.equals(str) || "DELETE".equals(str) || "PROPFIND".equals(str) || "MKCOL".equals(str) || "LOCK".equals(str);
    }
}
