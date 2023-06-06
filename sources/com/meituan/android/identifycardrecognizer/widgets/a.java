package com.meituan.android.identifycardrecognizer.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.support.v7.graphics.b;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends SurfaceView implements SurfaceHolder.Callback {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;
    private final SurfaceHolder e;
    private final Camera f;
    private final InterfaceC0262a g;
    private Camera.Size h;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.identifycardrecognizer.widgets.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0262a {
        void a(boolean z);

        void a(float[] fArr);
    }

    public a(Context context, Camera camera, Camera.Size size, InterfaceC0262a interfaceC0262a) {
        super(context);
        Object[] objArr = {context, camera, size, interfaceC0262a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9d9318328b4ca5fb9052cf90179c02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9d9318328b4ca5fb9052cf90179c02");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.g = interfaceC0262a;
        this.h = size;
        this.f = camera;
        this.e = getHolder();
        this.e.addCallback(this);
        this.e.setType(3);
        setOnClickListener(b.a(this));
    }

    public static /* synthetic */ void a(a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "670e694b22aad51aa4dfb93a0ecc3c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "670e694b22aad51aa4dfb93a0ecc3c12");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "43b5b52d2a5c67258940d41be8e35fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "43b5b52d2a5c67258940d41be8e35fa1");
            return;
        }
        try {
            Camera.Parameters parameters = aVar.f.getParameters();
            if (aVar.d) {
                Object[] objArr3 = {parameters};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a0542983159e1169df782dc8b67a6987", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a0542983159e1169df782dc8b67a6987")).booleanValue() : parameters.getSupportedFocusModes().contains(FpsEvent.TYPE_SCROLL_AUTO)) {
                    try {
                        aVar.f.autoFocus(c.a(aVar));
                    } catch (Exception e) {
                        com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_autoFocus").a("message", e.getMessage()).b);
                    }
                }
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_autoFocus").a("message", e2.getMessage()).b);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a2ad6529ae55446e0c24d0ed43e1cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a2ad6529ae55446e0c24d0ed43e1cc");
            return;
        }
        try {
            this.f.setPreviewDisplay(surfaceHolder);
            this.f.startPreview();
        } catch (Throwable th) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_surfaceCreated").a("message", th.getMessage()).b);
            new StringBuilder("Error setting camera preview: ").append(th.getMessage());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee293036bc9c8887e9d0279fd98b179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee293036bc9c8887e9d0279fd98b179");
            return;
        }
        this.d = false;
        this.f.setPreviewCallback(null);
        this.e.removeCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object[] objArr = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f611c81ee168a9baee005d4303325279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f611c81ee168a9baee005d4303325279");
        } else if (this.e.getSurface() == null) {
        } else {
            try {
                this.f.setPreviewCallbackWithBuffer(null);
                this.f.stopPreview();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_surfaceChanged").a("message", e.getMessage()).b);
            }
            try {
                this.f.setPreviewCallbackWithBuffer(new AnonymousClass1());
                this.f.setPreviewDisplay(this.e);
                this.f.addCallbackBuffer(new byte[((this.h.width * this.h.height) * ImageFormat.getBitsPerPixel(17)) / 8]);
                this.f.startPreview();
                this.d = true;
                this.f.cancelAutoFocus();
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_surfaceChanged").a("message", e2.getMessage()).b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.identifycardrecognizer.widgets.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Camera.PreviewCallback {
        public static ChangeQuickRedirect a;
        public long b;
        public float c;

        public AnonymousClass1() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            Object[] objArr = {bArr, camera};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4d591c409f4246713a999e4a65675f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4d591c409f4246713a999e4a65675f8");
                return;
            }
            a.this.f.addCallbackBuffer(bArr);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.b < 1000) {
                return;
            }
            this.b = currentTimeMillis;
            Bitmap a2 = a.this.a(bArr, camera);
            if (a2 != null) {
                b.a a3 = android.support.v7.graphics.b.a(a2);
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                a3.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ac582d23a3e87a4888b0f54d4d833484", RobustBitConfig.DEFAULT_VALUE) ? (b.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ac582d23a3e87a4888b0f54d4d833484") : new d(this));
            }
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, android.support.v7.graphics.b bVar) {
            b.d a2;
            Object[] objArr = {anonymousClass1, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "327f6b364f95ea28dcfcdfb1dbe0fa3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "327f6b364f95ea28dcfcdfb1dbe0fa3f");
            } else if (bVar == null || (a2 = bVar.a()) == null) {
            } else {
                if (a.this.g != null) {
                    a.this.g.a(a2.a());
                }
                if (Math.abs(a2.a()[2] - anonymousClass1.c) < 0.2d) {
                    return;
                }
                anonymousClass1.c = a2.a()[2];
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, Camera camera) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c45ca52a8621d9690544db33856071c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c45ca52a8621d9690544db33856071c");
            return;
        }
        new StringBuilder("onAutoFocus:").append(z);
        if (aVar.g != null) {
            aVar.g.a(z);
        }
        if (z) {
            aVar.f.cancelAutoFocus();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a368300346e7f5fd77c82863d6e9176", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a368300346e7f5fd77c82863d6e9176")).booleanValue() : super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(byte[] bArr, Camera camera) {
        Bitmap bitmap;
        YuvImage yuvImage;
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {bArr, camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d53a8555136164b324256426017025", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d53a8555136164b324256426017025");
        }
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                yuvImage = new YuvImage(bArr, 17, i, i2, null);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    if (!yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 60, byteArrayOutputStream)) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e) {
                            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_byte2bitmap").a("message", e.getMessage()).b);
                        }
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inSampleSize = 2;
                    bitmap = com.sankuai.waimai.launcher.util.image.a.a(byteArray, 0, byteArray.length, options);
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_byte2bitmap").a("message", e2.getMessage()).b);
                        }
                        return createBitmap;
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_byte2bitmap").a("message", e.getMessage()).b);
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                                return bitmap;
                            } catch (IOException e4) {
                                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_byte2bitmap").a("message", e4.getMessage()).b);
                                return bitmap;
                            }
                        }
                        return bitmap;
                    }
                } catch (Exception e5) {
                    e = e5;
                    bitmap = null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException e6) {
                        com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraPreview_byte2bitmap").a("message", e6.getMessage()).b);
                    }
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            bitmap = null;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c574b013bf61406770b136469f342507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c574b013bf61406770b136469f342507");
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.b == 0 || this.c == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (this.c * size) / this.b);
        }
    }
}
