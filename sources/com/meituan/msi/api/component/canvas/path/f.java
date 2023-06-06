package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "bezierCurveTo";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9522a62f326d8b0f82312a706b76f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9522a62f326d8b0f82312a706b76f9")).booleanValue();
        }
        if (dArr == null || dArr.length < 6) {
            return false;
        }
        path.cubicTo(com.meituan.msi.util.f.a(dArr, 0), com.meituan.msi.util.f.a(dArr, 1), com.meituan.msi.util.f.a(dArr, 2), com.meituan.msi.util.f.a(dArr, 3), com.meituan.msi.util.f.a(dArr, 4), com.meituan.msi.util.f.a(dArr, 5));
        return true;
    }
}
