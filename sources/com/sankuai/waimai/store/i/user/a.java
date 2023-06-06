package com.sankuai.waimai.store.i.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    void a(EnumC1205a enumC1205a);

    void a(b bVar);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.i.user.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1205a {
        LOGIN,
        LOGOUT,
        CANCEL,
        BIND_FAILED;
        
        public static ChangeQuickRedirect a;

        EnumC1205a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df50df4a1c9f0f15882241506be0434", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df50df4a1c9f0f15882241506be0434");
            }
        }

        public static EnumC1205a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c53e517072a02493c05c415a1b1a8ca1", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1205a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c53e517072a02493c05c415a1b1a8ca1") : (EnumC1205a) Enum.valueOf(EnumC1205a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1205a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55d60187f8d6439af11f6066ec02188f", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1205a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55d60187f8d6439af11f6066ec02188f") : (EnumC1205a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum b {
        INFO,
        PHONE;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a501a9b7a85c916f1de62498ddd05a34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a501a9b7a85c916f1de62498ddd05a34");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9a01db0711546ab536ac523d1b925a8", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9a01db0711546ab536ac523d1b925a8") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e2f7e4d9e161dcc1f871e4ef09359ed", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e2f7e4d9e161dcc1f871e4ef09359ed") : (b[]) values().clone();
        }
    }
}
