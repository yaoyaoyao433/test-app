package com.meituan.android.privacy.interfaces.def;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements com.meituan.android.privacy.interfaces.p {
    public static ChangeQuickRedirect a;
    private Camera b;

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a() throws IllegalArgumentException {
        Camera open;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816a463dd74abded3485b21dd9c13697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816a463dd74abded3485b21dd9c13697");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "463144904002b4d1f88a8f4564d60ebe", RobustBitConfig.DEFAULT_VALUE)) {
            open = (Camera) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "463144904002b4d1f88a8f4564d60ebe");
        } else {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras == 0) {
                throw new IllegalArgumentException("DefCamera: No camera found");
            }
            int i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
            if (i < numberOfCameras) {
                open = Camera.open(i);
            } else {
                open = Camera.open(0);
            }
        }
        this.b = open;
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(int i) throws IllegalArgumentException {
        Camera open;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4eb771a980352ceb0224dab79d7d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4eb771a980352ceb0224dab79d7d98");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "746bb47be9aa9e715ca88060a176521a", RobustBitConfig.DEFAULT_VALUE)) {
            open = (Camera) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "746bb47be9aa9e715ca88060a176521a");
        } else if (Camera.getNumberOfCameras() == 0) {
            throw new IllegalArgumentException("DefCamera: No camera found");
        } else {
            open = Camera.open(i);
        }
        this.b = open;
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera camera) {
        this.b = camera;
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final Camera.Parameters b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2e5682b274d765faa94c4313c00d13", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Parameters) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2e5682b274d765faa94c4313c00d13");
        }
        if (this.b != null) {
            return this.b.getParameters();
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera.Parameters parameters) {
        Object[] objArr = {parameters};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b8e48fe0a5cd8fbd0339e17c75ead0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b8e48fe0a5cd8fbd0339e17c75ead0");
        } else if (this.b != null) {
            this.b.setParameters(parameters);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(SurfaceHolder surfaceHolder) throws IOException {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3d212ca33ef36875e194f6673967b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3d212ca33ef36875e194f6673967b2");
        } else if (this.b != null) {
            this.b.setPreviewDisplay(surfaceHolder);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(SurfaceTexture surfaceTexture) throws IOException {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf258b5b79a3d61f183ba54a55b2b788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf258b5b79a3d61f183ba54a55b2b788");
        } else if (this.b != null) {
            this.b.setPreviewTexture(surfaceTexture);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera.AutoFocusCallback autoFocusCallback) {
        Object[] objArr = {autoFocusCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3324c392ba988d7533d13a53a055a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3324c392ba988d7533d13a53a055a8b");
        } else if (this.b != null) {
            this.b.autoFocus(autoFocusCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae248bccaf28d63a5b0002e6a47cf33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae248bccaf28d63a5b0002e6a47cf33");
        } else if (this.b != null) {
            this.b.cancelAutoFocus();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a013e4dd54ec8d4eb5c8a1cf072e98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a013e4dd54ec8d4eb5c8a1cf072e98b");
        } else if (this.b != null) {
            this.b.startPreview();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101a1146acf2744460e0dffab58b01ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101a1146acf2744460e0dffab58b01ae");
        } else if (this.b != null) {
            this.b.stopPreview();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674e9d2051b71a31785257b6cf3950a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674e9d2051b71a31785257b6cf3950a0");
        } else if (this.b != null) {
            this.b.release();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef6ca660f93da119e23a30452ccdb85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef6ca660f93da119e23a30452ccdb85");
        } else if (this.b != null) {
            this.b.lock();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db773992c353d4ab4215cf7589275e78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db773992c353d4ab4215cf7589275e78");
        } else if (this.b != null) {
            this.b.unlock();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503aa774a6632bd28f28aea5fb6173fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503aa774a6632bd28f28aea5fb6173fe");
        } else if (this.b != null) {
            this.b.setPreviewCallback(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void b(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b298a025585bc0d91472c09c4325ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b298a025585bc0d91472c09c4325ff5");
        } else if (this.b != null) {
            this.b.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901c5eb1943d1d024365b2254d47141b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901c5eb1943d1d024365b2254d47141b");
        } else if (this.b != null) {
            this.b.addCallbackBuffer(bArr);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void c(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0831823dfc3acfddb18fbab464f263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0831823dfc3acfddb18fbab464f263");
        } else if (this.b != null) {
            this.b.setOneShotPreviewCallback(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa13979a4dfff8d9ba6c605253631ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa13979a4dfff8d9ba6c605253631ac");
        } else if (this.b != null) {
            this.b.setDisplayOrientation(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final Camera i() {
        return this.b;
    }
}
