package com.sankuai.waimai.foundation.core;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @NonNull
    private static b b = b.RELEASE;
    @NonNull
    private static EnumC0945a c = EnumC0945a.NONE;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        DEBUG,
        DEVELOP,
        RELEASE;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2dd65d84f7b01a9e2dc908d87bc426", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2dd65d84f7b01a9e2dc908d87bc426");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fff9ee2f20a5a987e2cb1bc179e39e9", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fff9ee2f20a5a987e2cb1bc179e39e9") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a73d3649fd07c9a0bf8f0d5a5045c9d1", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a73d3649fd07c9a0bf8f0d5a5045c9d1") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0945a {
        WM_APP,
        MT_APP,
        DP_APP,
        NONE;
        
        public static ChangeQuickRedirect a;

        EnumC0945a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6a9c9e196c8579f3838657dc903b1d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6a9c9e196c8579f3838657dc903b1d");
            }
        }

        public static EnumC0945a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e01cea97a9ce2f5dc22b6f2aae6d2887", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0945a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e01cea97a9ce2f5dc22b6f2aae6d2887") : (EnumC0945a) Enum.valueOf(EnumC0945a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0945a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd753328f152ea2058a064b8a98d38b1", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0945a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd753328f152ea2058a064b8a98d38b1") : (EnumC0945a[]) values().clone();
        }
    }

    public static void a(@NonNull b bVar) {
        if (bVar == null) {
            bVar = b.RELEASE;
        }
        b = bVar;
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "024376804a9d2c132fbf6629208e2578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "024376804a9d2c132fbf6629208e2578");
        } else if (c != EnumC0945a.NONE) {
        } else {
            String packageName = context.getPackageName();
            if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                c = EnumC0945a.WM_APP;
            } else if ("com.sankuai.meituan".equals(packageName)) {
                c = EnumC0945a.MT_APP;
            } else if (packageName == null || !packageName.startsWith("com.dianping.v1")) {
            } else {
                c = EnumC0945a.DP_APP;
            }
        }
    }

    public static void a(@NonNull EnumC0945a enumC0945a) {
        c = enumC0945a;
    }

    public static boolean a() {
        return b == b.DEBUG;
    }

    public static boolean b() {
        return b == b.DEBUG || b == b.DEVELOP;
    }

    public static boolean c() {
        return b == b.RELEASE;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7073bebfbde3709be5cc269229f3593", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7073bebfbde3709be5cc269229f3593")).booleanValue();
        }
        g();
        return c == EnumC0945a.WM_APP;
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6743c7843d6c7de122d5275a0daa79a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6743c7843d6c7de122d5275a0daa79a4")).booleanValue();
        }
        g();
        return c == EnumC0945a.MT_APP;
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34a72ceee70d1acadf9107e8b179f98f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34a72ceee70d1acadf9107e8b179f98f")).booleanValue();
        }
        g();
        return c == EnumC0945a.DP_APP;
    }

    private static void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5243dfe3a3b84cd3c266f93e3065017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5243dfe3a3b84cd3c266f93e3065017");
        } else if (c == EnumC0945a.NONE) {
            if (com.meituan.android.singleton.b.a == null) {
                throw new RuntimeException("initBusinessType should be done first");
            }
            a(com.meituan.android.singleton.b.a);
        }
    }
}
