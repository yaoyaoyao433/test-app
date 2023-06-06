package com.meituan.android.downloadmanager.util;

import com.meituan.android.common.babel.Babel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, int i, String str2, String str3) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "323e7726b9c5bd32459d17acf4cc8f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "323e7726b9c5bd32459d17acf4cc8f2f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("rawUrl", str);
        hashMap.put("reportType", str3);
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("cause", str2);
        Babel.log("update-downloadmanager", "update-downloadmanager", hashMap);
    }
}
