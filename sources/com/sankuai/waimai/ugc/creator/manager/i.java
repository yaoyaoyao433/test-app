package com.sankuai.waimai.ugc.creator.manager;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static volatile i d;
    public com.sankuai.waimai.ugc.creator.config.a b;
    private boolean c;

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf7b0d9e00746df7eb5783236cb21eaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf7b0d9e00746df7eb5783236cb21eaf");
        }
        if (d == null) {
            synchronized (i.class) {
                if (d == null) {
                    d = new i();
                }
            }
        }
        return d;
    }

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e52626f67702ff5834692e061cee419", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e52626f67702ff5834692e061cee419");
        } else {
            this.c = false;
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64450d4188af4b5d059fde9697d03c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64450d4188af4b5d059fde9697d03c5e");
        } else {
            a().c = true;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "466092e5c249f02375c070d2a7f7ded8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "466092e5c249f02375c070d2a7f7ded8")).booleanValue() : a().c;
    }

    @NonNull
    public final com.sankuai.waimai.ugc.creator.config.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5be5b979adb45c374e94746eef4fcdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ugc.creator.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5be5b979adb45c374e94746eef4fcdc");
        }
        if (this.b == null) {
            this.b = new com.sankuai.waimai.ugc.creator.config.a();
        }
        return this.b;
    }
}
