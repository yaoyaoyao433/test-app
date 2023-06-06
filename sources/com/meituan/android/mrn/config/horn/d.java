package com.meituan.android.mrn.config.horn;

import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static d b = new d();

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d60772976ed0d3482627f174182a2fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d60772976ed0d3482627f174182a2fc");
            return;
        }
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {"enable", cls, bool, "容器标准化总开关"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc683333f068c624025a37487783ddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc683333f068c624025a37487783ddc");
        } else {
            t.a("enable", cls, bool, "mrn-container-plugin-switch_android", "容器标准化总开关");
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d466b58358d304bf0bc5843bfb2e7bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d466b58358d304bf0bc5843bfb2e7bd")).booleanValue() : ((Boolean) t.b.a("enable")).booleanValue();
    }
}
