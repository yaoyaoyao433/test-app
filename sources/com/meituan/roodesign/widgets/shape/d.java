package com.meituan.roodesign.widgets.shape;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;

    public void a(@NonNull k kVar, float f, float f2, float f3) {
        Object[] objArr = {kVar, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11dbe7c3ce74b18b2b6e5f0bdfff574e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11dbe7c3ce74b18b2b6e5f0bdfff574e");
        }
    }

    public final void a(@NonNull k kVar, float f, float f2, @NonNull RectF rectF, @NonNull c cVar) {
        Object[] objArr = {kVar, Float.valueOf(90.0f), Float.valueOf(f2), rectF, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a63c71023b1422bfe00e85aefa970e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a63c71023b1422bfe00e85aefa970e");
        } else {
            a(kVar, 90.0f, f2, cVar.a(rectF));
        }
    }
}
