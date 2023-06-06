package com.meituan.android.yoda.widget.tool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final CameraManager b;
    private final String c;

    private b(CameraManager cameraManager, String str) {
        this.b = cameraManager;
        this.c = str;
    }

    public static Runnable a(CameraManager cameraManager, String str) {
        Object[] objArr = {cameraManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f7ed0e45db6c32741e07b98fc74a90f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f7ed0e45db6c32741e07b98fc74a90f") : new b(cameraManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154907fa8d928b41fff692707e1485aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154907fa8d928b41fff692707e1485aa");
        } else {
            CameraManager.lambda$processSuccessResult$11(this.b, this.c);
        }
    }
}
