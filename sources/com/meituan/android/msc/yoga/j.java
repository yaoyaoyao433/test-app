package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum j {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);
    
    public static ChangeQuickRedirect a;
    final int f;

    public static j valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b35ba399aba12e88472b46b6d28bbbb", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b35ba399aba12e88472b46b6d28bbbb") : (j) Enum.valueOf(j.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b36557dc83a05b54c1da75bb4308bac", RobustBitConfig.DEFAULT_VALUE) ? (j[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b36557dc83a05b54c1da75bb4308bac") : (j[]) values().clone();
    }

    j(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef213d834aeb0466aa9818f98cbde6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef213d834aeb0466aa9818f98cbde6b");
        } else {
            this.f = i;
        }
    }
}
