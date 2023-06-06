package com.meituan.mmp.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;

    private j(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static Runnable a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66f72044666648f9e5ab35523ce3da26", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66f72044666648f9e5ab35523ce3da26") : new j(aVar, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7928a45ef1cacf03b19b227a7f830a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7928a45ef1cacf03b19b227a7f830a59");
        } else {
            a.a(this.b, this.c);
        }
    }
}
