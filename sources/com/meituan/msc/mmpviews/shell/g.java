package com.meituan.msc.mmpviews.shell;

import com.meituan.msc.uimanager.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final ah b;
    final ah c;

    public g(ah ahVar, ah ahVar2) {
        Object[] objArr = {ahVar, ahVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00308a4ca70461c8a578301ceefcfcf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00308a4ca70461c8a578301ceefcfcf3");
            return;
        }
        this.b = ahVar;
        this.c = ahVar2;
    }
}
