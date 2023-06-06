package com.sankuai.waimai.imbase.constant;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.constant.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0958a {
        IM_NOTIFY_CONFIGURE,
        IM_ACTIVITY_MESSAGE;
        
        public static ChangeQuickRedirect a;

        EnumC0958a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf2c48167a167368b804bf8644c1c76", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf2c48167a167368b804bf8644c1c76");
            }
        }

        public static EnumC0958a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b69089cac39fa378d39a275e3fc4d99", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0958a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b69089cac39fa378d39a275e3fc4d99") : (EnumC0958a) Enum.valueOf(EnumC0958a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0958a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d2f6a4187ccbface8ed90a523fc35f2", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0958a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d2f6a4187ccbface8ed90a523fc35f2") : (EnumC0958a[]) values().clone();
        }
    }
}
