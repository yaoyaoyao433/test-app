package com.meituan.android.paybase.moduleinterface;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.moduleinterface.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0334a {
        MV,
        MC,
        SC;
        
        public static ChangeQuickRedirect a;

        EnumC0334a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a979541a0ff679753f6d948a8c2d4fbe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a979541a0ff679753f6d948a8c2d4fbe");
            }
        }

        public static EnumC0334a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddce58d060d83e6506269baa71018bfc", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0334a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddce58d060d83e6506269baa71018bfc") : (EnumC0334a) Enum.valueOf(EnumC0334a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0334a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6448223d935c9e2276460e2e33d164a", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0334a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6448223d935c9e2276460e2e33d164a") : (EnumC0334a[]) values().clone();
        }
    }
}
