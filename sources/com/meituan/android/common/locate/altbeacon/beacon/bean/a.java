package com.meituan.android.common.locate.altbeacon.beacon.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String a;
    public int b;
    public int c;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5562c80c5d4de0b6ba916a66c919f9fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5562c80c5d4de0b6ba916a66c919f9fc");
        }
        return "BeaconNetConfBean{uuid='" + this.a + "', major=" + this.b + ", minor=" + this.c + '}';
    }
}
