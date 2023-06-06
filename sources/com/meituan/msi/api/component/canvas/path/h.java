package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "moveTo";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc63b12c0c9dbaf66f4c906119caf46a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc63b12c0c9dbaf66f4c906119caf46a")).booleanValue();
        }
        if (dArr == null || dArr.length < 2) {
            return false;
        }
        path.moveTo(com.meituan.msi.util.f.a(dArr, 0), com.meituan.msi.util.f.a(dArr, 1));
        return true;
    }
}
