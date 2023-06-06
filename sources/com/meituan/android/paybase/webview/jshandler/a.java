package com.meituan.android.paybase.webview.jshandler;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static HashMap<String, Object> a(String str, String str2, long j, String str3) {
        Object[] objArr = {str, str2, new Long(j), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34c900646de782d14e2acb3cd9b377bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34c900646de782d14e2acb3cd9b377bf");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bridge_name", str);
        hashMap.put("bridge_url", str2);
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("pay_bridge_unique_id", str3);
        return hashMap;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e60e8c93e05760756776aa018c6b568", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e60e8c93e05760756776aa018c6b568");
        }
        return Uri.parse(str).getScheme() + "://" + Uri.parse(str).getHost() + Uri.parse(str).getPath();
    }
}
