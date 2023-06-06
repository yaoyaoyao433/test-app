package com.sankuai.waimai.foundation.location;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;
    private static volatile b c;
    private static volatile a d = a.wm_app;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        wm_app,
        mt,
        dp;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d029fc552ebe25b38609f38c1e52b907", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d029fc552ebe25b38609f38c1e52b907");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e3a85467d0a42d52f47567ca8ccd098", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e3a85467d0a42d52f47567ca8ccd098") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e0c79aff7492671d0678cbc21ab1b64", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e0c79aff7492671d0678cbc21ab1b64") : (a[]) values().clone();
        }
    }

    public static void a(Context context, boolean z, a aVar, b bVar) throws Exception {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d182ee707b36f091afbe7b7bd669a4bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d182ee707b36f091afbe7b7bd669a4bd");
            return;
        }
        d = aVar;
        b = z;
        com.sankuai.waimai.foundation.location.utils.b.a(z);
        c = bVar;
    }

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return d == a.wm_app;
    }

    public static b c() {
        return c;
    }
}
