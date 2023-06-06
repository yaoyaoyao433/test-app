package com.sankuai.xm.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceHolder;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.android.privacy.interfaces.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.o;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a;
    protected Executor b;
    a c;
    Handler d;
    protected c e;
    v f;
    public p g;
    SurfaceHolder h;
    String i;
    String j;
    public Context k;
    private Camera.Size l;
    private SurfaceHolder.Callback m;
    private MediaRecorder.OnErrorListener n;
    private MediaRecorder.OnInfoListener o;
    private AudioManager.AudioRecordingCallback p;

    public boolean a(String str, String str2, Pair<Integer, Integer> pair, int i, int i2) {
        return false;
    }

    public static /* synthetic */ void a(d dVar, p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "0b5a97a04264c57b9a0a089e060f5dd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "0b5a97a04264c57b9a0a089e060f5dd4");
        } else if (pVar != null) {
            try {
                pVar.c();
            } catch (Exception e) {
                b.a(e, "cancelAutoFocus error", new Object[0]);
            }
        }
    }

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "486dd7d3582ec5a6cea604f8610a70ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "486dd7d3582ec5a6cea604f8610a70ef");
            return;
        }
        this.i = "";
        this.j = "";
        this.m = new SurfaceHolder.Callback() { // from class: com.sankuai.xm.recorder.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Object[] objArr2 = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68d3b0136499d15f53896e8cf5fe5561", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68d3b0136499d15f53896e8cf5fe5561");
                    return;
                }
                d.this.h = surfaceHolder;
                b.b("VideoRecorder.surfaceChanged format: " + i + " width: " + i2 + " height: " + i3, new Object[0]);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                Object[] objArr2 = {surfaceHolder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "917bbd0b94039b543da13093477f008c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "917bbd0b94039b543da13093477f008c");
                    return;
                }
                d.this.h = surfaceHolder;
                b.b("VideoRecorder.surfaceCreated", new Object[0]);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Object[] objArr2 = {surfaceHolder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8aee897fbb5da5731cd3a55480491a9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8aee897fbb5da5731cd3a55480491a9");
                    return;
                }
                d.this.h = null;
                d.this.f = null;
                b.b("VideoRecorder.surfaceDestroyed", new Object[0]);
            }
        };
        this.n = new MediaRecorder.OnErrorListener() { // from class: com.sankuai.xm.recorder.d.5
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaRecorder.OnErrorListener
            public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
                Object[] objArr2 = {mediaRecorder, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d76f702bc7b018baca65d6c15ebae1a2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d76f702bc7b018baca65d6c15ebae1a2");
                } else {
                    b.d("VideoRecorder onError what: %s, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        };
        this.o = new MediaRecorder.OnInfoListener() { // from class: com.sankuai.xm.recorder.d.6
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaRecorder.OnInfoListener
            public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
                Object[] objArr2 = {mediaRecorder, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e77ee6e283acdcb8406e8f4a0d0e7ac", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e77ee6e283acdcb8406e8f4a0d0e7ac");
                } else {
                    b.b("VideoRecorder onInfo what: %d, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        };
        this.e = cVar;
        com.sankuai.xm.threadpool.scheduler.a b = com.sankuai.xm.threadpool.scheduler.a.b();
        Object[] objArr2 = {"video_rec", null};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.threadpool.scheduler.a.b;
        this.b = PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "ad677e3e6c745a319dbe4a5eadcb7e7d", 6917529027641081856L) ? (ExecutorService) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "ad677e3e6c745a319dbe4a5eadcb7e7d") : com.sankuai.android.jarvis.c.a(com.sankuai.xm.threadpool.scheduler.a.b("video_rec"));
        this.d = new Handler(Looper.getMainLooper());
        this.c = a.INIT;
    }

    public final void a(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c04b23ffaf805ed661b8c956da0bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c04b23ffaf805ed661b8c956da0bcd");
        } else if (this.c != a.INIT) {
            a(0, "preview. not in INIT state!");
        } else if (surfaceHolder == null) {
            a(1, "preview. surfaceHolder is null");
        } else {
            this.h = surfaceHolder;
            this.h.addCallback(this.m);
            this.h.setType(3);
            try {
                this.g = Privacy.createCamera("jcyf-e4b399808a333f25", 0);
                if (this.g != null) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(0, cameraInfo);
                    this.g.b(cameraInfo.orientation);
                    Camera.Parameters b = this.g.b();
                    this.l = e.a(b.getSupportedVideoSizes(), b.getSupportedPreviewSizes(), 448, TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                    b.setPreviewSize(this.l.width, this.l.height);
                    List<String> supportedFocusModes = b.getSupportedFocusModes();
                    if (!com.sankuai.xm.base.util.b.a(supportedFocusModes) && supportedFocusModes.contains("continuous-video")) {
                        b.setFocusMode("continuous-video");
                    }
                    this.g.a(b);
                    this.g.a(this.h);
                    this.g.d();
                    this.g.a(new Camera.AutoFocusCallback() { // from class: com.sankuai.xm.recorder.d.8
                        public static ChangeQuickRedirect a;

                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad508feae2fb061b8aef17d44246c30c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad508feae2fb061b8aef17d44246c30c");
                            } else if (z) {
                                d.a(d.this, d.this.g);
                            }
                        }
                    });
                }
                this.c = a.PREVIEW;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f270de1ecf0e3615551c60656ac2047b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f270de1ecf0e3615551c60656ac2047b");
                } else {
                    this.d.post(new Runnable() { // from class: com.sankuai.xm.recorder.d.11
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b744db16ece8267c1500bb0d12fb684", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b744db16ece8267c1500bb0d12fb684");
                            } else if (d.this.e != null) {
                                d.this.e.a();
                                b.b("reportPreview", new Object[0]);
                            }
                        }
                    });
                }
            } catch (Exception e) {
                b.a(e, "preview error.", new Object[0]);
                a(2, "preview. camera init error");
                d();
                f();
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ca75e635ffccabd7b1867bbafbfc65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ca75e635ffccabd7b1867bbafbfc65");
        } else if (this.c != a.PREVIEW) {
            a(0, "startRecordVideo. not in PREVIEW state!");
        } else if (TextUtils.isEmpty(str)) {
            a(1, "startRecordVideo folder is invalid");
        } else if (this.g == null) {
            a(3, "startRecordVideo. recorder init error");
            e();
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            String uuid = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20e660a4aaa854ee9a95db7e0967842a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20e660a4aaa854ee9a95db7e0967842a") : UUID.randomUUID().toString();
            this.i = str + uuid + ".mp4";
            this.j = str + uuid + ".jpg";
            this.f = Privacy.createMediaRecorder("jcyf-e4b399808a333f25");
            this.f.c();
            this.f.a(this.g);
            try {
                this.g.h();
            } catch (RuntimeException e) {
                b.a(e, "mCamera.unlock exception", new Object[0]);
            }
            this.f.i(1);
            this.f.c(1);
            this.f.e(2);
            this.f.f(2);
            this.f.a(3);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (!(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1ceef8aa5a30f90c59c9b4a72f950f3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1ceef8aa5a30f90c59c9b4a72f950f3")).booleanValue() : Build.MODEL.equals("M5s"))) {
                this.f.a(this.l.width, this.l.height);
                this.f.h(30);
            }
            this.f.g(1048576);
            this.f.a(this.h.getSurface());
            this.f.a(this.i);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
            this.f.d(cameraInfo.orientation);
            this.f.a(this.n);
            this.f.a(this.o);
            try {
                if (Build.VERSION.SDK_INT > 28 && this.k != null && this.p == null) {
                    AudioManager audioManager = (AudioManager) this.k.getSystemService("audio");
                    synchronized (this) {
                        if (audioManager != null && this.p == null) {
                            this.p = new AudioManager.AudioRecordingCallback() { // from class: com.sankuai.xm.recorder.d.9
                                public static ChangeQuickRedirect a;

                                @Override // android.media.AudioManager.AudioRecordingCallback
                                public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                                    Object[] objArr4 = {list};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "265010c46ca52043e18d6e25ba9e5098", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "265010c46ca52043e18d6e25ba9e5098");
                                    } else {
                                        b.b("onRecordingConfigChanged conf size:%s", Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
                                    }
                                }
                            };
                            audioManager.registerAudioRecordingCallback(this.p, this.d);
                        }
                    }
                }
                this.f.d();
                this.f.a();
                this.c = a.RECORDING;
                final String str2 = this.i;
                final String str3 = this.j;
                Object[] objArr4 = {str2, str3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bc0688ad562f626249ab0b9690802d42", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bc0688ad562f626249ab0b9690802d42");
                } else {
                    this.d.post(new Runnable() { // from class: com.sankuai.xm.recorder.d.12
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "781cc57805c47631e275116d115096d3", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "781cc57805c47631e275116d115096d3");
                            } else if (d.this.e != null) {
                                d.this.e.a(str2, str3);
                                b.b("reportStart videoPath: %s, screenshotPath: %s", str2, str3);
                            }
                        }
                    });
                }
            } catch (Exception e2) {
                b.a(e2, "startRecord exception", new Object[0]);
                if (Build.VERSION.SDK_INT > 28 && com.sankuai.xm.recorder.a.a(this.k)) {
                    a(7, "startRecordVideo. some process is recording.");
                } else {
                    a(3, "preview. recorder init error: " + e2.getMessage());
                }
                e();
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4e67564d0df8651ae0258afff6048e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4e67564d0df8651ae0258afff6048e");
        } else if (this.c != a.RECORDING) {
            a(0, "cancelRecordVideo. not RECORDING state!");
        } else {
            if (this.i != null) {
                k.t(this.i);
                k.t(this.j);
            }
            e();
            this.c = a.PREVIEW;
            final String str = this.i;
            final String str2 = this.j;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fd5eabc4a481b691dbf381d1a78b14", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fd5eabc4a481b691dbf381d1a78b14");
            } else {
                this.d.post(new Runnable() { // from class: com.sankuai.xm.recorder.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62cfafabe54d7504621925a6be8eb5ee", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62cfafabe54d7504621925a6be8eb5ee");
                        } else if (d.this.e != null) {
                            d.this.e.b(str, str2);
                            b.b("reportCancel videoPath: %s, screenshotPath: %s", str, str2);
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4744d1a777581479ff085813fe543f9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4744d1a777581479ff085813fe543f9e");
        } else if (this.c == a.STOPPING) {
        } else {
            if (this.c != a.RECORDING) {
                a(0, "stopRecordVideo. not RECORDING state!");
                return;
            }
            this.c = a.STOPPING;
            e();
            com.sankuai.waimai.launcher.util.aop.b.a(this.b, new Runnable() { // from class: com.sankuai.xm.recorder.d.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4b8d2aa2057134ad37b2f5239984434", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4b8d2aa2057134ad37b2f5239984434");
                        return;
                    }
                    final d dVar = d.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3f62fe5c4e4e2f314c75310924bb88bf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3f62fe5c4e4e2f314c75310924bb88bf");
                    } else if (TextUtils.isEmpty(dVar.i)) {
                        dVar.a(5, "record file path is empty");
                    } else if (!k.o(dVar.i)) {
                        dVar.a(5, "record file not exist: " + dVar.i);
                    } else {
                        final int p = (int) k.p(dVar.i);
                        if (p <= 0) {
                            dVar.a(5, "record file not valid. len:" + p);
                        } else {
                            final int b = e.b(dVar.i);
                            if (b <= 0) {
                                dVar.a(5, "record file not valid. duration:" + b);
                            } else if (b < 1000 && b > 0) {
                                dVar.a(6, "record duration too short:" + b);
                            } else {
                                final Pair<Integer, Integer> a2 = e.a(dVar.i);
                                if (a2 == null || ((Integer) a2.first).intValue() <= 0 || ((Integer) a2.second).intValue() <= 0) {
                                    dVar.a(5, "record file not valid. size:" + a2);
                                } else {
                                    String str = dVar.i;
                                    String str2 = dVar.j;
                                    Object[] objArr4 = {str, str2};
                                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "42e942354fdb3e108aeeb0d54e89a4e1", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "42e942354fdb3e108aeeb0d54e89a4e1");
                                    } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && k.o(str)) {
                                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                        try {
                                            mediaMetadataRetriever.setDataSource(str);
                                        } catch (Exception e) {
                                            b.a(e, "generateThumb", new Object[0]);
                                        }
                                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                                        mediaMetadataRetriever.release();
                                        if (frameAtTime != null) {
                                            try {
                                                OutputStream r = o.r(str2);
                                                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, r);
                                                r.flush();
                                                r.close();
                                            } catch (IOException e2) {
                                                b.a(e2, "generateThumb", new Object[0]);
                                            }
                                        }
                                    }
                                    final String str3 = dVar.i;
                                    final String str4 = dVar.j;
                                    Object[] objArr5 = {str3, str4, a2, Integer.valueOf(b), Integer.valueOf(p)};
                                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                    if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "768d7200b555fe2079a9644389f74ca6", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "768d7200b555fe2079a9644389f74ca6");
                                    } else if (!dVar.a(str3, str4, a2, b, p)) {
                                        dVar.d.post(new Runnable() { // from class: com.sankuai.xm.recorder.d.3
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                short s;
                                                short s2;
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "93eb048d5c141ccf5f53c3675ee4abe9", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "93eb048d5c141ccf5f53c3675ee4abe9");
                                                } else if (d.this.e != null) {
                                                    if (a2 != null) {
                                                        s = (short) ((Integer) a2.first).intValue();
                                                        s2 = (short) ((Integer) a2.second).intValue();
                                                    } else {
                                                        s = 0;
                                                        s2 = 0;
                                                    }
                                                    d.this.e.a(str3, str4, b, p, s, s2, 1048576, 30);
                                                    b.b("reportEnd videoPath: %s, screenshotPath: %s, duration: %d, len: %d, w: %d,h: %d", str3, str4, Integer.valueOf(b), Integer.valueOf(p), Short.valueOf(s), Short.valueOf(s2));
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                    d.this.c = a.PREVIEW;
                }
            });
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689da71bae266d5fd8f538b637659e22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689da71bae266d5fd8f538b637659e22");
        } else if (this.c == a.INIT) {
            a(0, "releaseRecorder. alread in INIT stage!");
        } else {
            e();
            d();
            f();
            this.c = a.INIT;
            this.i = "";
            this.j = "";
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3eda300996e3c122e88607afabe67c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3eda300996e3c122e88607afabe67c3");
        } else if (this.g != null) {
            try {
                this.g.e();
                this.g.g();
                this.g.f();
            } catch (Exception e) {
                b.a(e, "VideoRecorder releaseCamera exception", new Object[0]);
            } finally {
                this.g = null;
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1479603082eb2a2cc9cd602ff861bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1479603082eb2a2cc9cd602ff861bd");
        } else if (this.f != null) {
            try {
                if (Build.VERSION.SDK_INT > 28 && this.k != null && this.p != null) {
                    AudioManager audioManager = (AudioManager) this.k.getSystemService("audio");
                    synchronized (this) {
                        if (audioManager != null && this.p != null) {
                            audioManager.unregisterAudioRecordingCallback(this.p);
                        }
                        this.p = null;
                    }
                }
                if (this.c != a.INIT && this.c != a.PREVIEW) {
                    this.f.b();
                }
                this.f.e();
                this.f = null;
            } catch (Exception e) {
                b.a(e, "releaseMediaRecorder: error", new Object[0]);
                a(4, "releaseMediaRecorder MediaRecorder stop or release error");
                this.f.c();
                this.f.e();
                this.f = null;
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc53a62f1546be4dd26de36299c5ef1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc53a62f1546be4dd26de36299c5ef1");
        } else if (this.h != null) {
            this.h.removeCallback(this.m);
            this.h = null;
        }
    }

    void a(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63468271705b8ff8337961cdcb1c08a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63468271705b8ff8337961cdcb1c08a0");
        } else {
            this.d.post(new Runnable() { // from class: com.sankuai.xm.recorder.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f1104d11023857e425d1456bce4de03", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f1104d11023857e425d1456bce4de03");
                    } else if (d.this.e != null) {
                        d.this.e.a(i, str);
                        b.d("reportError errCode: %d, errMsg: %s", Integer.valueOf(i), str);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        INIT,
        PREVIEW,
        RECORDING,
        STOPPING;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17edda249fec45f541acdd0339ac4d1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17edda249fec45f541acdd0339ac4d1e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b07124e205f832190b77407c8e589618", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b07124e205f832190b77407c8e589618") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cd2f72dc38a8f89b8c41d4837f34bb2", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cd2f72dc38a8f89b8c41d4837f34bb2") : (a[]) values().clone();
        }
    }
}
