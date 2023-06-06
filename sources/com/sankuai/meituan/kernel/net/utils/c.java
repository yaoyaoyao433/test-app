package com.sankuai.meituan.kernel.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5ce6ac667e6be5ed61be501fcb94d98", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5ce6ac667e6be5ed61be501fcb94d98");
        }
        HashMap hashMap = new HashMap(3);
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                if (TextUtils.isEmpty(host)) {
                    host = "portm.sankuai.com";
                }
                String queryParameter = parse.getQueryParameter("token");
                String queryParameter2 = parse.getQueryParameter("user");
                hashMap.put("portm_host", host);
                hashMap.put("Portm-Token", queryParameter);
                hashMap.put("Portm-User", queryParameter2);
            } catch (Throwable unused) {
                hashMap.clear();
            }
        }
        return hashMap;
    }
}
