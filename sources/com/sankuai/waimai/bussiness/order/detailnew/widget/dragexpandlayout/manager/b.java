package com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        Normal,
        Expanding,
        Expanded;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7c3e4d0b5aad3f1b56ca68d6979dd1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7c3e4d0b5aad3f1b56ca68d6979dd1");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1642236ef5eca7ce8d6dfe4fec55c07f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1642236ef5eca7ce8d6dfe4fec55c07f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1b166aa4fc150966839fd86aa6b530b", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1b166aa4fc150966839fd86aa6b530b") : (a[]) values().clone();
        }
    }
}
