package com.meituan.android.cube.core;

import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class h extends f {
    public static ChangeQuickRedirect f;
    public Fragment g;

    public h(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c117621df345658bf6cdbbd1a8519b00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c117621df345658bf6cdbbd1a8519b00");
        } else {
            this.g = fragment;
        }
    }

    @CallSuper
    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f812ff08de0e1e4560690b422a9699b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f812ff08de0e1e4560690b422a9699b");
            return;
        }
        com.meituan.android.cube.debug.b.a(p() + "→onDestroyView", new Object[0]);
    }
}
