package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "closePath";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d46f0c024f471f6dae9cc3e12ad1850", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d46f0c024f471f6dae9cc3e12ad1850")).booleanValue();
        }
        path.close();
        return true;
    }
}
