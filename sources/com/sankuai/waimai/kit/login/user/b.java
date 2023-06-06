package com.sankuai.waimai.kit.login.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {
    void a(a aVar);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        LOGIN,
        LOGOUT,
        CANCEL,
        BIND_FAILED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5db0baf68e82135258aa43ff68259e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5db0baf68e82135258aa43ff68259e9");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a309aa793060d29ed2e671358bd56f6c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a309aa793060d29ed2e671358bd56f6c") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ff2ffc825ec8ca0bbed5ecba86bf36a", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ff2ffc825ec8ca0bbed5ecba86bf36a") : (a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.kit.login.user.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0982b {
        INFO,
        PHONE;
        
        public static ChangeQuickRedirect a;

        EnumC0982b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf19a4d6825da3e53a42f24fda5fc17d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf19a4d6825da3e53a42f24fda5fc17d");
            }
        }

        public static EnumC0982b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5e4989859b35dee28884092d8df24ff", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0982b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5e4989859b35dee28884092d8df24ff") : (EnumC0982b) Enum.valueOf(EnumC0982b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0982b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d5bab459fd83c8477d86b20039bbcc5", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0982b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d5bab459fd83c8477d86b20039bbcc5") : (EnumC0982b[]) values().clone();
        }
    }
}
