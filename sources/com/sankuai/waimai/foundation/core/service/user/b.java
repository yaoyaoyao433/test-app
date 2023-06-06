package com.sankuai.waimai.foundation.core.service.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    void onAccountInfoUpdate(EnumC0948b enumC0948b);

    void onChanged(a aVar);

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        LOGIN,
        LOGOUT,
        CANCEL,
        BIND_FAILED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824cf8d822c7ab946e249922e6a4d38e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824cf8d822c7ab946e249922e6a4d38e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13f84772af1ab079a9f63ef072d694af", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13f84772af1ab079a9f63ef072d694af") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4e412bcd3a9a9834414d9f961aff021", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4e412bcd3a9a9834414d9f961aff021") : (a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.core.service.user.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0948b {
        INFO,
        PHONE;
        
        public static ChangeQuickRedirect a;

        EnumC0948b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965177c78cc6055491830a36b76d7712", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965177c78cc6055491830a36b76d7712");
            }
        }

        public static EnumC0948b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4503947d57e8d8ef988b4f9f06a27cc", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0948b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4503947d57e8d8ef988b4f9f06a27cc") : (EnumC0948b) Enum.valueOf(EnumC0948b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0948b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1320375efed0f2e8d693bf538b15ae54", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0948b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1320375efed0f2e8d693bf538b15ae54") : (EnumC0948b[]) values().clone();
        }
    }
}
