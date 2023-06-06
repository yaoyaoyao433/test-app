package com.meituan.roodesign.widgets.shape;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.shape.k;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;

    public final void a(float f, float f2, float f3, @NonNull k kVar) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f48e71ab20ce5acc201b4a9ad110f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f48e71ab20ce5acc201b4a9ad110f2");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "1bfbd06f2ebbddf908268a6c30238d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "1bfbd06f2ebbddf908268a6c30238d92");
            return;
        }
        k.d dVar = new k.d();
        dVar.b = f;
        dVar.c = 0.0f;
        kVar.h.add(dVar);
        k.b bVar = new k.b(dVar, kVar.d, kVar.e);
        kVar.a(bVar, bVar.a() + 270.0f, bVar.a() + 270.0f);
        kVar.d = f;
        kVar.e = 0.0f;
    }
}
