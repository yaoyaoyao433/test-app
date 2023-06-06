package com.meituan.android.privacy.interfaces;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;
/* compiled from: ProGuard */
@RequiresPermission(PermissionGuard.PERMISSION_CAMERA)
/* loaded from: classes3.dex */
public interface p {
    void a();

    void a(int i);

    void a(SurfaceTexture surfaceTexture) throws IOException;

    void a(Camera.AutoFocusCallback autoFocusCallback);

    void a(Camera.Parameters parameters);

    void a(Camera.PreviewCallback previewCallback);

    void a(Camera camera);

    void a(SurfaceHolder surfaceHolder) throws IOException;

    void a(byte[] bArr);

    Camera.Parameters b();

    void b(int i);

    void b(Camera.PreviewCallback previewCallback);

    void c();

    void c(Camera.PreviewCallback previewCallback);

    void d();

    void e();

    void f();

    void g();

    void h();

    Camera i();
}
