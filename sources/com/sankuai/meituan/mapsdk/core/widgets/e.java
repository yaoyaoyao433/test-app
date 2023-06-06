package com.sankuai.meituan.mapsdk.core.widgets;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b {
    public static ChangeQuickRedirect a;

    public e(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d943e53b8daf648dd3a3bdac28f1ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d943e53b8daf648dd3a3bdac28f1ef");
        } else {
            this.d.add(new c(this));
        }
    }

    public final void a(@NonNull Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "863e23a6d0848e39f38dc2b1e6f0a364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "863e23a6d0848e39f38dc2b1e6f0a364");
            return;
        }
        c cVar = this.d.get(0);
        if (cVar == null) {
            return;
        }
        cVar.f = cVar.e;
        cVar.g = bitmap;
        cVar.e = c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba57409b62c69cd68cbe5f65335f080f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba57409b62c69cd68cbe5f65335f080f");
        } else {
            c cVar2 = this.d.get(0);
            if (cVar2 != null) {
                cVar2.a();
                this.l = cVar2.b;
                this.m = cVar2.c;
            }
        }
        b();
        if (h.a(cVar.d)) {
            this.g.b(cVar);
        } else {
            this.g.a(cVar);
        }
    }
}
