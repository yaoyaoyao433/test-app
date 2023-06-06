package com.squareup.okhttp.internal.http;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.sankuai.titans.proxy.util.Constants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static boolean a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals(OneIdNetworkTool.PUT) || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return str.equals("POST") || str.equals(OneIdNetworkTool.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean c(String str) {
        return b(str) || str.equals(Constants.KEY_METHOD_OPTIONS) || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }
}
