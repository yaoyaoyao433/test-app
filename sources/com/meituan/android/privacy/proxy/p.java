package com.meituan.android.privacy.proxy;

import android.media.MediaRecorder;
import android.view.Surface;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements com.meituan.android.privacy.interfaces.v {
    public static ChangeQuickRedirect a;
    MediaRecorder b;
    private u c;
    private String d;

    public p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7de36fe50dafe660c61478aa3436082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7de36fe50dafe660c61478aa3436082");
            return;
        }
        this.b = null;
        this.d = str;
        this.c = new u();
        if (z.a(PermissionGuard.PERMISSION_MICROPHONE, str, z.d)) {
            this.b = new MediaRecorder();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380ad35181ffaaed34c4786f95710610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380ad35181ffaaed34c4786f95710610");
        } else if (this.b != null) {
            this.c.a("md.start", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.p.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a6aaef84825f22172596949edb4773b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a6aaef84825f22172596949edb4773b");
                    }
                    p.this.b.start();
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2512d99d903bcfd4a89b3187f3ebbc65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2512d99d903bcfd4a89b3187f3ebbc65");
        } else if (this.b != null) {
            this.c.a("md.stop", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.p.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cd38152db7d1906bdbe1eb350701759", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cd38152db7d1906bdbe1eb350701759");
                    }
                    p.this.b.stop();
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba7421d3730121bfda8526fd68bc65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba7421d3730121bfda8526fd68bc65d");
        } else if (this.b != null) {
            this.b.reset();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void d() throws IllegalStateException, IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44853b4c997b48aaf27b2a5dbc83554d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44853b4c997b48aaf27b2a5dbc83554d");
        } else if (this.b != null) {
            this.c.a("md.prepare", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.p.3
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.privacy.proxy.u.a
                /* renamed from: b */
                public Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc0455f0648503a82c0b76919e357ac5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc0455f0648503a82c0b76919e357ac5");
                    }
                    try {
                        p.this.b.prepare();
                        return null;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2153636ea812d6b4f665c398b64dfcd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2153636ea812d6b4f665c398b64dfcd4");
        } else if (this.b != null) {
            this.b.setAudioEncoder(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void b(int i) {
        Object[] objArr = {16000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd9526ed731a74488a594b3da818148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd9526ed731a74488a594b3da818148");
        } else if (this.b != null) {
            this.b.setAudioSamplingRate(16000);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void c(int i) throws IllegalStateException {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87311367798af40690a6b15e995d711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87311367798af40690a6b15e995d711");
        } else if (this.b != null) {
            this.b.setAudioSource(1);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(String str) throws IllegalStateException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8577b30e1e21a42c302d4c82e5a11dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8577b30e1e21a42c302d4c82e5a11dbc");
        } else if (this.b != null) {
            this.b.setOutputFile(str);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5328c84569a42d7bd87e449959b71ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5328c84569a42d7bd87e449959b71ab");
        } else if (this.b != null) {
            this.b.setPreviewDisplay(surface);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa74626aa24ef74c557e0dfde32f434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa74626aa24ef74c557e0dfde32f434");
        } else if (this.b != null) {
            this.b.setOrientationHint(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(MediaRecorder.OnErrorListener onErrorListener) {
        Object[] objArr = {onErrorListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8398718a3b9ee8d71a996e1468c5aae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8398718a3b9ee8d71a996e1468c5aae1");
        } else if (this.b != null) {
            this.b.setOnErrorListener(onErrorListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(MediaRecorder.OnInfoListener onInfoListener) {
        Object[] objArr = {onInfoListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eedd089f3ce72386475f1625c552c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eedd089f3ce72386475f1625c552c83");
        } else if (this.b != null) {
            this.b.setOnInfoListener(onInfoListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void e(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306cf38bff55d96f44c53d07e8084d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306cf38bff55d96f44c53d07e8084d2a");
        } else if (this.b != null) {
            this.b.setOutputFormat(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void f(int i) throws IllegalStateException {
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac5d2df8b9998f268428965857eaaed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac5d2df8b9998f268428965857eaaed");
        } else if (this.b != null) {
            this.b.setVideoEncoder(2);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void g(int i) {
        Object[] objArr = {1048576};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30892074aa6e00bbf9dfb38f409e933c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30892074aa6e00bbf9dfb38f409e933c");
        } else if (this.b != null) {
            this.b.setVideoEncodingBitRate(1048576);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void h(int i) throws IllegalStateException {
        Object[] objArr = {30};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249ce1408706ea2b23c69939039ee394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249ce1408706ea2b23c69939039ee394");
        } else if (this.b != null) {
            this.b.setVideoFrameRate(30);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void i(int i) throws IllegalStateException {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f403d56effd7f35d537dd00a5458ab3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f403d56effd7f35d537dd00a5458ab3d");
        } else if (this.b != null) {
            this.b.setVideoSource(1);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(int i, int i2) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d473a997fee7147a19428e39eaf60536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d473a997fee7147a19428e39eaf60536");
        } else if (this.b != null) {
            this.b.setVideoSize(i, i2);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(com.meituan.android.privacy.interfaces.p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a3cf6c647fe7ab1cbb65efef27ebaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a3cf6c647fe7ab1cbb65efef27ebaa");
        } else if (this.b != null) {
            this.b.setCamera(pVar.i());
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void j(int i) throws IllegalArgumentException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6dc5027bec4bf2219ced961e31da2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6dc5027bec4bf2219ced961e31da2d");
        } else if (this.b != null) {
            this.b.setMaxDuration(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fa38350043f20a7fed6b136a08f387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fa38350043f20a7fed6b136a08f387");
        } else if (this.b != null) {
            this.b.release();
            this.b = null;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final int f() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1957f90e47d95c0710ac78d2d1c779b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1957f90e47d95c0710ac78d2d1c779b8")).intValue();
        }
        if (this.b != null) {
            return this.b.getMaxAmplitude();
        }
        return 0;
    }
}
