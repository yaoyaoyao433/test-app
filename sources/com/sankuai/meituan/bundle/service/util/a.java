package com.sankuai.meituan.bundle.service.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"bundle_service_download"};

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58aa5301bfdda4aaa86d8855da93a227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58aa5301bfdda4aaa86d8855da93a227");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        com.dianping.networklog.c.a(sb.toString(), 35, b);
    }
}
