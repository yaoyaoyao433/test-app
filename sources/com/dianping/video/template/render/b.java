package com.dianping.video.template.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.dianping.video.videofilter.gpuimage.f;
import com.dianping.video.videofilter.gpuimage.r;
import com.dianping.video.videofilter.gpuimage.s;
import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public f b;
    public r c;
    public FloatBuffer d;
    public FloatBuffer e;

    public b(int i, int i2, Bitmap bitmap, String str) {
        this(i, i2, null, null, true);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34cccc869010449b4656fa1a46995f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34cccc869010449b4656fa1a46995f9");
        }
    }

    private b(int i, int i2, Bitmap bitmap, String str, boolean z) {
        Bitmap bitmap2;
        int i3;
        Bitmap createBitmap;
        Bitmap createBitmap2;
        char c;
        Bitmap bitmap3 = bitmap;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bitmap3, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e88b9f505730b00908af3f2f2bc005", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e88b9f505730b00908af3f2f2bc005");
            return;
        }
        if (bitmap3 != null) {
            Object[] objArr2 = {str, 22, -1, bitmap3, 30};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.util.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26aac1f787b2e5fd3dde34770b111f55", RobustBitConfig.DEFAULT_VALUE)) {
                createBitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26aac1f787b2e5fd3dde34770b111f55");
            } else {
                Paint paint = new Paint(1);
                paint.setTextSize(22.0f);
                paint.setAntiAlias(true);
                paint.setColor(-1);
                paint.setFakeBoldText(true);
                paint.setShadowLayer(6.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
                Rect rect = new Rect();
                paint.getTextBounds(str, 0, str.length(), rect);
                int width = rect.width();
                Bitmap createBitmap3 = Bitmap.createBitmap(width, 30, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap3);
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                canvas.drawText(str, 0.0f, (((30 - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top, paint);
                if (bitmap.getHeight() != 30) {
                    float height = 30.0f / bitmap.getHeight();
                    Object[] objArr3 = {bitmap3, Float.valueOf(height)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.util.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "dce800efe0d1a73b4576bfa78ba7fadd", RobustBitConfig.DEFAULT_VALUE)) {
                        createBitmap2 = (Bitmap) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "dce800efe0d1a73b4576bfa78ba7fadd");
                    } else if (bitmap3 == null) {
                        createBitmap2 = null;
                    } else {
                        int width2 = bitmap.getWidth();
                        int height2 = bitmap.getHeight();
                        Matrix matrix = new Matrix();
                        matrix.setScale(height, height);
                        bitmap2 = createBitmap3;
                        i3 = width;
                        createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
                        createBitmap2.equals(bitmap3);
                        bitmap3 = createBitmap2;
                    }
                    bitmap2 = createBitmap3;
                    i3 = width;
                    bitmap3 = createBitmap2;
                } else {
                    bitmap2 = createBitmap3;
                    i3 = width;
                }
                createBitmap = Bitmap.createBitmap(i3 + bitmap3.getWidth(), 30, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawBitmap(bitmap2, bitmap3.getWidth(), 0.0f, paint);
                paint.setColor(-1);
                canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                bitmap2.recycle();
                bitmap3.recycle();
            }
            this.c = new r(i, i2);
            r rVar = this.c;
            float width3 = (i - createBitmap.getWidth()) - 20;
            float width4 = createBitmap.getWidth();
            float height3 = createBitmap.getHeight();
            Object[] objArr4 = {Float.valueOf(width3), Float.valueOf(20.0f), Float.valueOf(width4), Float.valueOf(height3)};
            ChangeQuickRedirect changeQuickRedirect4 = r.a;
            if (PatchProxy.isSupport(objArr4, rVar, changeQuickRedirect4, false, "b2b7c12dddfb7579d09ebc6d105ae384", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, rVar, changeQuickRedirect4, false, "b2b7c12dddfb7579d09ebc6d105ae384");
                c = 0;
            } else {
                float f = ((width3 / rVar.r) * 2.0f) - 1.0f;
                float f2 = 1.0f - ((20.0f / rVar.s) * 2.0f);
                float f3 = (((width3 + width4) / rVar.r) * 2.0f) - 1.0f;
                float f4 = 1.0f - (((height3 + 20.0f) / rVar.s) * 2.0f);
                c = 0;
                float[] fArr = {f, f4, f3, f4, f, f2, f3, f2};
                float[] a2 = v.a(u.NORMAL, false, false);
                rVar.c = ByteBuffer.allocateDirect(a2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                rVar.c.put(a2).position(0);
                rVar.b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                rVar.b.put(fArr).position(0);
            }
            r rVar2 = this.c;
            Object[] objArr5 = new Object[1];
            objArr5[c] = createBitmap;
            ChangeQuickRedirect changeQuickRedirect5 = r.a;
            if (PatchProxy.isSupport(objArr5, rVar2, changeQuickRedirect5, false, "17beee39284cd3e9586dd1f77e6c84b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, rVar2, changeQuickRedirect5, false, "17beee39284cd3e9586dd1f77e6c84b6");
            } else if (createBitmap == null || !createBitmap.isRecycled()) {
                rVar2.q = s.a(createBitmap, rVar2.q);
            }
        }
        this.b = new f();
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        this.b.b();
        GLES20.glUseProgram(this.b.h());
        this.b.a(i, i2);
        if (this.c != null) {
            this.c.b();
            GLES20.glUseProgram(this.c.h());
            this.c.a(i, i2);
        }
        float[] a3 = v.a(u.NORMAL, false, true);
        this.e = ByteBuffer.allocateDirect(a3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.e.put(a3).position(0);
        this.d = ByteBuffer.allocateDirect(com.dianping.video.template.utils.b.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.d.put(com.dianping.video.template.utils.b.a).position(0);
    }
}
