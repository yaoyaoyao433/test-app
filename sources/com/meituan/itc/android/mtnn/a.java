package com.meituan.itc.android.mtnn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    DataFormat_UNKNOW(-1),
    DataFormat_NCHW(0),
    DataFormat_NHWC(1);
    
    public static ChangeQuickRedirect a;
    int e;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d9ebc08dbd97236e5e5a1086dcd23c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d9ebc08dbd97236e5e5a1086dcd23c") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fdcda56efc8dd0f20c3ac11c7702e76", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fdcda56efc8dd0f20c3ac11c7702e76") : (a[]) values().clone();
    }

    a(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a502b6fcfa96553a981ab4599d955da2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a502b6fcfa96553a981ab4599d955da2");
        } else {
            this.e = i;
        }
    }
}
