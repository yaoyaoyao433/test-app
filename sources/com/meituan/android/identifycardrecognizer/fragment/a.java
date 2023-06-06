package com.meituan.android.identifycardrecognizer.fragment;

import android.hardware.Camera;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Camera.PictureCallback {
    public static ChangeQuickRedirect a;
    private final BaseCaptureFragment b;

    private a(BaseCaptureFragment baseCaptureFragment) {
        this.b = baseCaptureFragment;
    }

    public static Camera.PictureCallback a(BaseCaptureFragment baseCaptureFragment) {
        Object[] objArr = {baseCaptureFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6407058845234e5c0990a5afb427e8a6", RobustBitConfig.DEFAULT_VALUE) ? (Camera.PictureCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6407058845234e5c0990a5afb427e8a6") : new a(baseCaptureFragment);
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        Object[] objArr = {bArr, camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9a1d8088c7379fde09b27a91a73129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9a1d8088c7379fde09b27a91a73129");
        } else {
            BaseCaptureFragment.a(this.b, bArr, camera);
        }
    }
}
