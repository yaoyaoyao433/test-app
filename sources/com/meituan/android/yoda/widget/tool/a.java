package com.meituan.android.yoda.widget.tool;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final CameraManager b;
    private final ViewGroup c;

    private a(CameraManager cameraManager, ViewGroup viewGroup) {
        this.b = cameraManager;
        this.c = viewGroup;
    }

    public static Runnable a(CameraManager cameraManager, ViewGroup viewGroup) {
        Object[] objArr = {cameraManager, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e59b0b87a7ef1e05f8c7ead52d548c04", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e59b0b87a7ef1e05f8c7ead52d548c04") : new a(cameraManager, viewGroup);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd40ab38b89d8032341ae5d58a9cd1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd40ab38b89d8032341ae5d58a9cd1f");
        } else {
            CameraManager.lambda$openCamera$9(this.b, this.c);
        }
    }
}
