package com.meituan.android.neohybrid.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum t {
    BASE,
    NATIVE_SIDE_RENDER,
    PRE_LOAD;
    
    public static ChangeQuickRedirect a;

    t() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7638210efbc8476fd312e34ff5a01b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7638210efbc8476fd312e34ff5a01b");
        }
    }

    public static t valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46c1c2a3bddb9d137147ffa6c0d1b09c", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46c1c2a3bddb9d137147ffa6c0d1b09c") : (t) Enum.valueOf(t.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbaead0f448558ed910fb60d010a564d", RobustBitConfig.DEFAULT_VALUE) ? (t[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbaead0f448558ed910fb60d010a564d") : (t[]) values().clone();
    }
}
