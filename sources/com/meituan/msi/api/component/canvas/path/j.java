package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "rect";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d609b229483043a04d5a45d4e5070d27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d609b229483043a04d5a45d4e5070d27")).booleanValue();
        }
        if (dArr == null || dArr.length < 4) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(dArr, 0);
        float a3 = com.meituan.msi.util.f.a(dArr, 1);
        path.addRect(a2, a3, a2 + com.meituan.msi.util.f.a(dArr, 2), com.meituan.msi.util.f.a(dArr, 3) + a3, Path.Direction.CW);
        return true;
    }
}
