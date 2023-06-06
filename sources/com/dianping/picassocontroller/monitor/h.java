package com.dianping.picassocontroller.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15af0d69a043f43529109e909f4f35af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15af0d69a043f43529109e909f4f35af");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("picasso_id", str);
        hashMap.put("project_name", a(str));
        hashMap.put("js_version", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("PicassoJSException", Float.valueOf(1.0f));
        a(context, hashMap, hashMap2);
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1050ad08bf377913a7653f0ac043399e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1050ad08bf377913a7653f0ac043399e");
        }
        if (TextUtils.isEmpty(str) || str.indexOf(47) < 0) {
            return null;
        }
        return str.substring(0, str.indexOf(47));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r24, java.util.Map<java.lang.String, java.lang.String> r25, java.util.HashMap<java.lang.String, java.lang.Float> r26) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picassocontroller.monitor.h.a(android.content.Context, java.util.Map, java.util.HashMap):void");
    }
}
