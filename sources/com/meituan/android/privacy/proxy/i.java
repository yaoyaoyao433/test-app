package com.meituan.android.privacy.proxy;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements com.meituan.android.privacy.interfaces.p {
    public static ChangeQuickRedirect a;
    private Camera b;
    private String c;
    private u d;

    public i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0241a36067cae698f1b29e263db1de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0241a36067cae698f1b29e263db1de");
            return;
        }
        this.c = str;
        this.d = new u();
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a() {
        Camera open;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1801d8db612484eb3c1c2611f70c4b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1801d8db612484eb3c1c2611f70c4b4c");
        } else if (z.a(PermissionGuard.PERMISSION_CAMERA, this.c, z.c)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d95412b6e702229b5c6693c09d9b5e9e", RobustBitConfig.DEFAULT_VALUE)) {
                open = (Camera) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d95412b6e702229b5c6693c09d9b5e9e");
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
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(int i) {
        Camera open;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6270eb7457ebbe0f25d6f3dff52ace7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6270eb7457ebbe0f25d6f3dff52ace7c");
        } else if (z.a(PermissionGuard.PERMISSION_CAMERA, this.c, z.c)) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "643b1bfb51d3e137ebcbfed61aa792e0", RobustBitConfig.DEFAULT_VALUE)) {
                open = (Camera) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "643b1bfb51d3e137ebcbfed61aa792e0");
            } else if (Camera.getNumberOfCameras() == 0) {
                throw new IllegalArgumentException("DefCamera: No camera found");
            } else {
                open = Camera.open(i);
            }
            this.b = open;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera camera) {
        Object[] objArr = {camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e6bd76e90dc6cc17cb98011118bb1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e6bd76e90dc6cc17cb98011118bb1a");
        } else if (z.a(PermissionGuard.PERMISSION_CAMERA, this.c, z.c)) {
            this.b = camera;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final Camera.Parameters b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a27e884f4e34bdcdadafd0b9df72a2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Parameters) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a27e884f4e34bdcdadafd0b9df72a2f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9811acdc01b77013de2abe59ee538d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9811acdc01b77013de2abe59ee538d6d");
        } else if (this.b != null) {
            this.b.setParameters(parameters);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(SurfaceHolder surfaceHolder) throws IOException {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b235b7c0265ddaf99a89518826cf73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b235b7c0265ddaf99a89518826cf73");
        } else if (this.b != null) {
            this.b.setPreviewDisplay(surfaceHolder);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(SurfaceTexture surfaceTexture) throws IOException {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "284a95e6e05c7b89e6200b0493d9dc0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "284a95e6e05c7b89e6200b0493d9dc0e");
        } else if (this.b != null) {
            this.b.setPreviewTexture(surfaceTexture);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera.AutoFocusCallback autoFocusCallback) {
        Object[] objArr = {autoFocusCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7477aab099fb908449bd58f002cf0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7477aab099fb908449bd58f002cf0c3");
        } else if (this.b != null) {
            this.b.autoFocus(autoFocusCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66c4f0f2cbe27676ae01a2905f6a36a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66c4f0f2cbe27676ae01a2905f6a36a");
        } else if (this.b != null) {
            this.b.cancelAutoFocus();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fad581ef7d08aad4676863acfe56b73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fad581ef7d08aad4676863acfe56b73");
        } else if (this.b != null) {
            this.b.startPreview();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27038199fee17a46e8595cdc48934ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27038199fee17a46e8595cdc48934ac");
        } else if (this.b != null) {
            this.b.stopPreview();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7d96eeb9233a288b534b3c7ff8fab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7d96eeb9233a288b534b3c7ff8fab3");
        } else if (this.b != null) {
            this.b.release();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a67188b676bcf5cd049d2739937aead5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a67188b676bcf5cd049d2739937aead5");
        } else if (this.b != null) {
            this.b.lock();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b762e4a7729241bea6318fce22219245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b762e4a7729241bea6318fce22219245");
        } else if (this.b != null) {
            this.b.unlock();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2b99656dd37deab7507e9182b0fe47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2b99656dd37deab7507e9182b0fe47");
        } else if (this.b != null) {
            this.b.setPreviewCallback(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void b(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a542d859577da14d9b469100477bba8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a542d859577da14d9b469100477bba8a");
        } else if (this.b != null) {
            this.b.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44a356fce3a40e906042cb10c4c4fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44a356fce3a40e906042cb10c4c4fbc");
        } else if (this.b != null) {
            this.b.addCallbackBuffer(bArr);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void c(Camera.PreviewCallback previewCallback) {
        Object[] objArr = {previewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f8dbaf6f12fa9233b7869d6630573a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f8dbaf6f12fa9233b7869d6630573a");
        } else if (this.b != null) {
            this.b.setOneShotPreviewCallback(previewCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122370f789ed1b8adf3caf8603bd5576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122370f789ed1b8adf3caf8603bd5576");
        } else if (this.b != null) {
            this.b.setDisplayOrientation(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.p
    public final Camera i() {
        return this.b;
    }
}
