package com.meituan.mmp.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum q {
    LAUNCH_ERROR(1),
    PAGE_NOT_FOUND(2);
    
    public static ChangeQuickRedirect a;
    public int d;

    public static q valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70705f99dcf9c2540ad2264334ad3116", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70705f99dcf9c2540ad2264334ad3116") : (q) Enum.valueOf(q.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6acf30a4cff6572b4dd2e1bad4341d22", RobustBitConfig.DEFAULT_VALUE) ? (q[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6acf30a4cff6572b4dd2e1bad4341d22") : (q[]) values().clone();
    }

    q(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13766760ee32b55e52423e8035f6179c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13766760ee32b55e52423e8035f6179c");
        } else {
            this.d = i;
        }
    }
}
