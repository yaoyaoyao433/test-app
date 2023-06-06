package com.tencent.liteav.capturer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.d.c;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.e;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback {
    private Camera c;
    private b e;
    private int h;
    private int i;
    private int j;
    private int k;
    private SurfaceTexture l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int q;
    private int r;
    private Matrix a = new Matrix();
    private int b = 0;
    private boolean d = true;
    private int f = 15;
    private int g = 1;
    private boolean p = false;
    private boolean s = false;
    private boolean t = false;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.capturer.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC1450a {
        RESOLUTION_INVALID(-1, -1),
        RESOLUTION_180_320(TXLiveConstants.RENDER_ROTATION_180, jw.e),
        RESOLUTION_270_480(270, jw.g),
        RESOLUTION_320_480(jw.e, jw.g),
        RESOLUTION_360_640(360, jw.h),
        RESOLUTION_540_960(540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM),
        RESOLUTION_720_1280(720, 1280),
        RESOLUTION_1080_1920(1080, 1920),
        RESOLUTION_HIGHEST(1080, 1920);
        
        private final int mHeight;
        private final int mWidth;

        EnumC1450a(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.mWidth;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b() {
            return this.mHeight;
        }
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.l = surfaceTexture;
    }

    public Camera.Parameters a() {
        if (this.c == null) {
            return null;
        }
        try {
            return this.c.getParameters();
        } catch (Exception e) {
            TXCLog.e("TXCCameraCapturer", "getCameraParameters error ", e);
            return null;
        }
    }

    public boolean b() {
        Camera.Parameters a;
        return this.c != null && (a = a()) != null && a.getMaxZoom() > 0 && a.isZoomSupported();
    }

    public boolean c() {
        Camera.Parameters a;
        List<String> supportedFlashModes;
        return (this.c == null || (a = a()) == null || (supportedFlashModes = a.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    public boolean d() {
        return this.m;
    }

    public boolean e() {
        Camera.Parameters a;
        return (this.c == null || (a = a()) == null || a.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    public boolean a(boolean z) {
        this.o = z;
        if (this.c != null) {
            boolean z2 = true;
            Camera.Parameters a = a();
            if (a == null) {
                return false;
            }
            List<String> supportedFlashModes = a.getSupportedFlashModes();
            if (z) {
                if (supportedFlashModes != null && supportedFlashModes.contains("torch")) {
                    TXCLog.i("TXCCameraCapturer", "set FLASH_MODE_TORCH");
                    a.setFlashMode("torch");
                }
                z2 = false;
            } else {
                if (supportedFlashModes != null && supportedFlashModes.contains("off")) {
                    TXCLog.i("TXCCameraCapturer", "set FLASH_MODE_OFF");
                    a.setFlashMode("off");
                }
                z2 = false;
            }
            try {
                this.c.setParameters(a);
                return z2;
            } catch (Exception e) {
                TXCLog.e("TXCCameraCapturer", "setParameters failed.", e);
                return false;
            }
        }
        return false;
    }

    public void a(EnumC1450a enumC1450a) {
        if (enumC1450a != EnumC1450a.RESOLUTION_INVALID) {
            this.q = enumC1450a.a();
            this.r = enumC1450a.b();
        }
        TXCLog.i("TXCCameraCapturer", "set resolution " + enumC1450a);
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(boolean z) {
        this.t = z;
        TXCLog.i("TXCCameraCapturer", "set performance mode to " + z);
    }

    public void a(float f, float f2) {
        if (this.s) {
            try {
                this.c.cancelAutoFocus();
                Camera.Parameters parameters = this.c.getParameters();
                if (this.m) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(a(f, f2, 2.0f), 1000));
                    parameters.setFocusAreas(arrayList);
                }
                if (this.n) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new Camera.Area(a(f, f2, 3.0f), 1000));
                    parameters.setMeteringAreas(arrayList2);
                }
                try {
                    this.c.setParameters(parameters);
                    this.c.autoFocus(this);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
    }

    public void c(boolean z) {
        this.s = z;
    }

    private Rect a(float f, float f2, float f3) {
        float f4 = f3 * 200.0f;
        if (this.d) {
            f = 1.0f - f;
        }
        int i = 0;
        while (i < this.j / 90) {
            float f5 = (-(-(f2 - 0.5f))) + 0.5f;
            i++;
            f2 = (-(f - 0.5f)) + 0.5f;
            f = f5;
        }
        int i2 = (int) ((f * 2000.0f) - 1000.0f);
        int i3 = (int) ((f2 * 2000.0f) - 1000.0f);
        if (i2 < -1000) {
            i2 = -1000;
        }
        if (i3 < -1000) {
            i3 = -1000;
        }
        int i4 = (int) f4;
        int i5 = i2 + i4;
        int i6 = i4 + i3;
        if (i5 > 1000) {
            i5 = 1000;
        }
        if (i6 > 1000) {
            i6 = 1000;
        }
        return new Rect(i2, i3, i5, i6);
    }

    public int f() {
        Camera.Parameters a = a();
        if (a == null || a.getMaxZoom() <= 0 || !a.isZoomSupported()) {
            return 0;
        }
        return a.getMaxZoom();
    }

    public boolean b(int i) {
        if (this.c != null) {
            Camera.Parameters a = a();
            if (a != null && a.getMaxZoom() > 0 && a.isZoomSupported()) {
                if (i >= 0 && i <= a.getMaxZoom()) {
                    try {
                        a.setZoom(i);
                        this.c.setParameters(a);
                        return true;
                    } catch (Exception e) {
                        TXCLog.e("TXCCameraCapturer", "set zoom failed.", e);
                        return false;
                    }
                }
                TXCLog.e("TXCCameraCapturer", "invalid zoom value : " + i + ", while max zoom is " + a.getMaxZoom());
                return false;
            }
            TXCLog.e("TXCCameraCapturer", "camera not support zoom!");
            return false;
        }
        return false;
    }

    public void a(boolean z, int i, int i2) {
        this.p = z;
        this.q = i;
        this.r = i2;
        TXCLog.i("TXCCameraCapturer", "setCaptureBuffer %b, width: %d, height: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void a(float f) {
        if (this.c != null) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < -1.0f) {
                f = -1.0f;
            }
            Camera.Parameters a = a();
            if (a == null) {
                TXCLog.e("TXCCameraCapturer", "camera setExposureCompensation camera parameter is null");
                return;
            }
            int minExposureCompensation = a.getMinExposureCompensation();
            int maxExposureCompensation = a.getMaxExposureCompensation();
            if (minExposureCompensation != 0 && maxExposureCompensation != 0) {
                int e = c.a().e();
                float f2 = maxExposureCompensation;
                float f3 = f * f2;
                if (e != 0 && e <= maxExposureCompensation && e >= minExposureCompensation) {
                    TXCLog.i("TXCCameraCapturer", "camera setExposureCompensation: " + e);
                    a.setExposureCompensation(e);
                } else if (f3 <= f2 && f3 >= minExposureCompensation) {
                    TXCLog.i("TXCCameraCapturer", "camera setExposureCompensation: " + f3);
                    a.setExposureCompensation((int) f3);
                }
            } else {
                TXCLog.e("TXCCameraCapturer", "camera not support setExposureCompensation!");
            }
            try {
                this.c.setParameters(a);
            } catch (Exception e2) {
                TXCLog.e("TXCCameraCapturer", "setExposureCompensation failed.", e2);
            }
        }
    }

    public void c(int i) {
        TXCLog.w("TXCCameraCapturer", "vsize setHomeOrientation " + i);
        this.g = i;
        this.j = (((this.k + (-90)) + (this.g * 90)) + 360) % 360;
    }

    public int d(boolean z) {
        try {
            TXCLog.i("TXCCameraCapturer", "trtc_capture: start capture");
            if (this.l == null) {
                return -2;
            }
            if (this.c != null) {
                g();
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
                Camera.getCameraInfo(i3, cameraInfo);
                TXCLog.i("TXCCameraCapturer", "camera index " + i3 + ", facing = " + cameraInfo.facing);
                if (cameraInfo.facing == 1 && i == -1) {
                    i = i3;
                }
                if (cameraInfo.facing == 0 && i2 == -1) {
                    i2 = i3;
                }
            }
            TXCLog.i("TXCCameraCapturer", "camera front, id = " + i);
            TXCLog.i("TXCCameraCapturer", "camera back , id = " + i2);
            if (i == -1 && i2 != -1) {
                i = i2;
            }
            if (i2 == -1 && i != -1) {
                i2 = i;
            }
            this.d = z;
            if (this.d) {
                this.c = Camera.open(i);
            } else {
                this.c = Camera.open(i2);
            }
            Camera.Parameters parameters = this.c.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.s && supportedFocusModes != null && supportedFocusModes.contains(FpsEvent.TYPE_SCROLL_AUTO)) {
                TXCLog.i("TXCCameraCapturer", "support FOCUS_MODE_AUTO");
                parameters.setFocusMode(FpsEvent.TYPE_SCROLL_AUTO);
            } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                TXCLog.i("TXCCameraCapturer", "support FOCUS_MODE_CONTINUOUS_VIDEO");
                parameters.setFocusMode("continuous-video");
            }
            if (Build.VERSION.SDK_INT >= 14) {
                if (parameters.getMaxNumFocusAreas() > 0) {
                    this.m = true;
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    this.n = true;
                }
            }
            if (this.p) {
                parameters.setPreviewFormat(17);
                this.c.setPreviewCallback(this);
            }
            e b = b(this.t, this.q, this.r);
            e a = a(parameters, Math.max(b.a, b.b), Math.min(b.a, b.b));
            this.h = a.a;
            this.i = a.b;
            parameters.setPreviewSize(this.h, this.i);
            int[] e = e(this.f);
            if (e != null) {
                parameters.setPreviewFpsRange(e[0], e[1]);
            } else {
                parameters.setPreviewFrameRate(d(this.f));
            }
            if (!this.d) {
                i = i2;
            }
            this.k = f(i);
            this.j = (((this.k - 90) + (this.g * 90)) + 360) % 360;
            this.c.setDisplayOrientation(0);
            TXCLog.i("TXCCameraCapturer", "vsize camera orientation " + this.k + ", preview " + this.j + ", home orientation " + this.g);
            this.c.setPreviewTexture(this.l);
            this.c.setParameters(parameters);
            this.c.setErrorCallback(this);
            this.c.startPreview();
            return 0;
        } catch (IOException e2) {
            TXCLog.e("TXCCameraCapturer", "open camera failed." + e2.getMessage());
            return -1;
        } catch (Exception e3) {
            TXCLog.e("TXCCameraCapturer", "open camera failed." + e3.getMessage());
            return -1;
        }
    }

    private static e b(boolean z, int i, int i2) {
        if (z) {
            return new e(i, i2);
        }
        e[] eVarArr = {new e(1080, 1920)};
        float min = Math.min(i, i2);
        float max = Math.max(i, i2);
        int i3 = 0;
        while (true) {
            if (i3 > 0) {
                break;
            }
            e eVar = eVarArr[0];
            if (min <= eVar.a && max <= eVar.b) {
                float min2 = Math.min(eVar.a / min, eVar.b / max);
                i = (int) (i * min2);
                i2 = (int) (i2 * min2);
                break;
            }
            i3++;
        }
        return new e(i, i2);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(bArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.SurfaceTexture, android.hardware.Camera] */
    public void g() {
        if (this.c != null) {
            try {
                try {
                    this.c.setErrorCallback(null);
                    this.c.setPreviewCallback(null);
                    this.c.stopPreview();
                    this.c.release();
                } catch (Exception e) {
                    TXCLog.e("TXCCameraCapturer", "stop capture failed.", e);
                }
            } finally {
                this.c = null;
                this.l = null;
            }
        }
    }

    public int h() {
        return this.j;
    }

    public boolean i() {
        return this.d;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public Camera l() {
        return this.c;
    }

    private static e a(Camera.Parameters parameters, int i, int i2) {
        TXCLog.d("TXCCameraCapturer", "camera preview wanted: %d x %d", Integer.valueOf(i), Integer.valueOf(i2));
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        float f = (i * 1.0f) / i2;
        ArrayList<Camera.Size> arrayList = new ArrayList();
        int i3 = Integer.MAX_VALUE;
        for (Camera.Size size : supportedPreviewSizes) {
            TXCLog.d("TXCCameraCapturer", "camera support preview size: %dx%d", Integer.valueOf(size.width), Integer.valueOf(size.height));
            int round = (size.width < 640 || size.height < 480) ? Integer.MAX_VALUE : Math.round(Math.abs(((size.width * 1.0f) / size.height) - f) * 10.0f);
            if (round < i3) {
                arrayList.clear();
                arrayList.add(size);
                i3 = round;
            } else if (round == i3) {
                arrayList.add(size);
            }
        }
        Collections.sort(arrayList, new Comparator<Camera.Size>() { // from class: com.tencent.liteav.capturer.a.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(Camera.Size size2, Camera.Size size3) {
                return (size3.width * size3.height) - (size2.width * size2.height);
            }
        });
        Camera.Size size2 = (Camera.Size) arrayList.get(0);
        float f2 = i * i2;
        float f3 = 2.14748365E9f;
        for (Camera.Size size3 : arrayList) {
            TXCLog.i("TXCCameraCapturer", "size in same buck: %dx%d", Integer.valueOf(size3.width), Integer.valueOf(size3.height));
            float f4 = size3.width * size3.height;
            if (f4 / f2 >= 0.9d) {
                float f5 = f4 - f2;
                if (Math.abs(f5) < f3) {
                    f3 = Math.abs(f5);
                    size2 = size3;
                }
            }
        }
        TXCLog.i("TXCCameraCapturer", "best match preview size: %d x %d", Integer.valueOf(size2.width), Integer.valueOf(size2.height));
        return new e(size2.width, size2.height);
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        if (z) {
            TXCLog.i("TXCCameraCapturer", "AUTO focus success");
        } else {
            TXCLog.i("TXCCameraCapturer", "AUTO focus failed");
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i, Camera camera) {
        TXCLog.w("TXCCameraCapturer", "camera catch error " + i);
        if ((i == 1 || i == 2 || i == 100) && this.e != null) {
            this.e.m();
        }
    }

    private int d(int i) {
        Camera.Parameters a = a();
        if (a == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = a.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null) {
            TXCLog.e("TXCCameraCapturer", "getSupportedFPS error");
            return 1;
        }
        int intValue = supportedPreviewFrameRates.get(0).intValue();
        for (int i2 = 0; i2 < supportedPreviewFrameRates.size(); i2++) {
            int intValue2 = supportedPreviewFrameRates.get(i2).intValue();
            if (Math.abs(intValue2 - i) - Math.abs(intValue - i) < 0) {
                intValue = intValue2;
            }
        }
        TXCLog.i("TXCCameraCapturer", "choose fps=" + intValue);
        return intValue;
    }

    private int[] e(int i) {
        List<int[]> supportedPreviewFpsRange;
        int i2 = i * 1000;
        String str = "camera supported preview fps range: wantFPS = " + i2 + "\n";
        Camera.Parameters a = a();
        if (a == null || (supportedPreviewFpsRange = a.getSupportedPreviewFpsRange()) == null || supportedPreviewFpsRange.size() <= 0) {
            return null;
        }
        int[] iArr = supportedPreviewFpsRange.get(0);
        Collections.sort(supportedPreviewFpsRange, new Comparator<int[]>() { // from class: com.tencent.liteav.capturer.a.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(int[] iArr2, int[] iArr3) {
                return iArr2[1] - iArr3[1];
            }
        });
        for (int[] iArr2 : supportedPreviewFpsRange) {
            str = str + "camera supported preview fps range: " + iArr2[0] + " - " + iArr2[1] + "\n";
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            if (next[0] <= i2 && i2 <= next[1]) {
                iArr = next;
                break;
            }
        }
        TXCLog.i("TXCCameraCapturer", str + "choose preview fps range: " + iArr[0] + " - " + iArr[1]);
        return iArr;
    }

    private int f(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        StringBuilder sb = new StringBuilder("vsize camera orientation ");
        sb.append(cameraInfo.orientation);
        sb.append(", front ");
        sb.append(cameraInfo.facing == 1);
        TXCLog.i("TXCCameraCapturer", sb.toString());
        int i2 = cameraInfo.orientation;
        if (i2 == 0 || i2 == 180) {
            i2 += 90;
        }
        if (cameraInfo.facing == 1) {
            return (360 - i2) % 360;
        }
        return (i2 + 360) % 360;
    }
}
