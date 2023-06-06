package com.meituan.roodesign.widgets.shape;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.shape.k;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends d {
    public static ChangeQuickRedirect b;
    public float c;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07dfe288ab5a89629a5e413f2b4ce5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07dfe288ab5a89629a5e413f2b4ce5f");
        } else {
            this.c = -1.0f;
        }
    }

    @Override // com.meituan.roodesign.widgets.shape.d
    public final void a(@NonNull k kVar, float f, float f2, float f3) {
        Object[] objArr = {kVar, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2943a5ea0dffa33ae51befe3929c54b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2943a5ea0dffa33ae51befe3929c54b2");
            return;
        }
        kVar.a(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        Object[] objArr2 = {Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f4), Float.valueOf(f4), Float.valueOf(180.0f), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "dd68ff52e46af53235e32724be5a4ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "dd68ff52e46af53235e32724be5a4ead");
            return;
        }
        k.c cVar = new k.c(0.0f, 0.0f, f4, f4);
        cVar.f = 180.0f;
        cVar.g = f;
        kVar.h.add(cVar);
        k.a aVar = new k.a(cVar);
        float f5 = f + 180.0f;
        boolean z = f < 0.0f;
        kVar.a(aVar, z ? 0.0f : 180.0f, z ? (f5 + 180.0f) % 360.0f : f5);
        float f6 = (f4 + 0.0f) * 0.5f;
        float f7 = (f4 - 0.0f) / 2.0f;
        double d = f5;
        kVar.d = (((float) Math.cos(Math.toRadians(d))) * f7) + f6;
        kVar.e = f6 + (f7 * ((float) Math.sin(Math.toRadians(d))));
    }
}
