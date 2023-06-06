package com.meituan.android.yoda.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final String d;

    private f(b bVar, String str, String str2) {
        this.b = bVar;
        this.c = str;
        this.d = str2;
    }

    public static Runnable a(b bVar, String str, String str2) {
        Object[] objArr = {bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6067fef1c56dad5211d2e17f832d6d5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6067fef1c56dad5211d2e17f832d6d5") : new f(bVar, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228d6f500930d449cc80da8fa5e90211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228d6f500930d449cc80da8fa5e90211");
        } else {
            b.a(this.b, this.c, this.d);
        }
    }
}
