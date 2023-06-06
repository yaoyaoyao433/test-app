package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "quadraticCurveTo";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8645eeeebff72188df31c9d09e29ca51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8645eeeebff72188df31c9d09e29ca51")).booleanValue();
        }
        if (dArr == null || dArr.length < 4) {
            return false;
        }
        path.quadTo(com.meituan.msi.util.f.a(dArr, 0), com.meituan.msi.util.f.a(dArr, 1), com.meituan.msi.util.f.a(dArr, 2), com.meituan.msi.util.f.a(dArr, 3));
        return true;
    }
}
