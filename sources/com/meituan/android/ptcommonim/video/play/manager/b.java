package com.meituan.android.ptcommonim.video.play.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final float c;

    private b(a aVar, float f) {
        this.b = aVar;
        this.c = f;
    }

    public static Runnable a(a aVar, float f) {
        Object[] objArr = {aVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31a426834f852fdb8e0be77981e97ce1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31a426834f852fdb8e0be77981e97ce1") : new b(aVar, f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2563763d11770d563bdda964bea84d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2563763d11770d563bdda964bea84d3d");
            return;
        }
        a aVar = this.b;
        float f = this.c;
        Object[] objArr2 = {aVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aca37267804d3b7422b52b477b129bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aca37267804d3b7422b52b477b129bd5");
        } else if (aVar.g != null) {
            aVar.g.a((int) (f * 100.0f));
        }
    }
}
