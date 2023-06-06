package com.meituan.android.neohybrid.util;

import android.webkit.WebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static synchronized WebViewClient a(KNBWebCompat kNBWebCompat) {
        synchronized (c.class) {
            Object[] objArr = {kNBWebCompat};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c2159195647913835b76bfa9a96a2e4", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebViewClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c2159195647913835b76bfa9a96a2e4");
            } else if (kNBWebCompat == null) {
                return null;
            } else {
                Field a2 = g.a(kNBWebCompat, d.a());
                if (a2 == null) {
                    return null;
                }
                Object a3 = g.a(kNBWebCompat, a2);
                if (a3 == null) {
                    return null;
                }
                Field a4 = g.a(a3, a3.getClass().getSuperclass(), e.a());
                if (a4 == null) {
                    return null;
                }
                Object a5 = g.a(a3, a4);
                if (a5 instanceof WebViewClient) {
                    return (WebViewClient) a5;
                }
                return null;
            }
        }
    }
}
