package com.sankuai.meituan.mapsdk.core.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.constraint.R;
import android.text.TextPaint;
import android.util.SparseArray;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.f;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private static final int p = com.sankuai.meituan.mapsdk.core.utils.d.b(1.0f);
    private static final int q = com.sankuai.meituan.mapsdk.core.utils.d.b(11.0f);
    private static final int r = com.sankuai.meituan.mapsdk.core.utils.d.b(1.0f);
    private static final int s = com.sankuai.meituan.mapsdk.core.utils.d.b(14.67f);
    private static final int t = com.sankuai.meituan.mapsdk.core.utils.d.b(2.0f);
    private static final int u = com.sankuai.meituan.mapsdk.core.utils.d.b(0.67f);
    private static final int v = t * 2;
    private static final int[] w = {1000000, 500000, 200000, BlankConfig.MAX_SAMPLE, RequestIDMap.OP_TYPE_GESTURE.OP_TYPE_SAVE_GESTURE, 30000, UserCenter.TYPE_LOGOUT_NEGATIVE, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5};
    private c A;
    private c B;
    private SparseArray<Bitmap> C;
    private float D;
    private f x;
    private c y;
    private c z;

    public a(d dVar) {
        super(dVar);
        Bitmap createBitmap;
        Bitmap createBitmap2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d6a7a269435f1a30e4117d2793cb7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d6a7a269435f1a30e4117d2793cb7d");
            return;
        }
        this.C = new SparseArray<>();
        this.x = (f) this.f.getProjection().getIProjection();
        this.y = new c(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99a0308bd53f41049800c3b99cfa19da", RobustBitConfig.DEFAULT_VALUE)) {
            createBitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99a0308bd53f41049800c3b99cfa19da");
        } else {
            int i = v;
            createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Path path = new Path();
            path.moveTo(p, p);
            path.lineTo(p, t + p);
            path.lineTo(t + p, t + p);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint.setStrokeWidth(u * 3);
            paint.setStrokeCap(Paint.Cap.SQUARE);
            canvas.drawPath(path, paint);
            path.lineTo(v, t + p);
            paint.setColor(-14671840);
            paint.setStrokeWidth(u);
            paint.setStrokeCap(Paint.Cap.SQUARE);
            canvas.drawPath(path, paint);
        }
        Bitmap bitmap = createBitmap;
        this.y.g = bitmap;
        this.y.e = c();
        this.y.l.gravity = 8388691;
        this.z = new c(this);
        this.z.e = c();
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        this.z.g = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        this.z.l.gravity = 8388693;
        this.A = new c(this);
        this.A.e = c();
        c cVar = this.A;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3864e08f8ceab2046dc4f928de04de6d", RobustBitConfig.DEFAULT_VALUE)) {
            createBitmap2 = (Bitmap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3864e08f8ceab2046dc4f928de04de6d");
        } else {
            createBitmap2 = Bitmap.createBitmap(1, t, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Path path2 = new Path();
            path2.moveTo(0.0f, p);
            path2.lineTo(1.0f, p);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setDither(true);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(u * 3);
            paint2.setStrokeCap(Paint.Cap.SQUARE);
            canvas2.drawPath(path2, paint2);
            paint2.setColor(-14671840);
            paint2.setStrokeWidth(u);
            paint2.setStrokeCap(Paint.Cap.SQUARE);
            canvas2.drawPath(path2, paint2);
        }
        cVar.g = createBitmap2;
        this.A.l.gravity = 81;
        this.B = new c(this);
        this.B.l.gravity = 49;
        this.d.add(this.y);
        this.d.add(this.z);
        this.d.add(this.A);
        this.d.add(this.B);
        CameraPosition cameraPosition = this.f.getCameraPosition();
        if (cameraPosition != null) {
            a(cameraPosition.zoom);
        }
    }

    public final void a(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1ed5419b8ddc16d8ed87686b4d6211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1ed5419b8ddc16d8ed87686b4d6211");
        } else if (this.x == null || f == this.D) {
        } else {
            this.D = f;
            float f3 = 2.0f;
            float f4 = 19.0f;
            if (this.f.getZoomMode() != ac.MEITUAN) {
                f3 = 3.0f;
                f4 = 20.0f;
            }
            if (f < f3) {
                f = f3;
            }
            if (f > f4) {
                f = f4;
            }
            double d = f;
            double a2 = this.x.a(com.sankuai.meituan.mapsdk.core.b.a.latitude, d);
            int i = (int) ((d + 1.0E-4d) - f3);
            if (i > w.length - 1) {
                i = w.length - 1;
            }
            this.B.g = c(i);
            this.B.e = b(i);
            try {
                f2 = ((float) (w[i] / a2)) - (v * 2);
            } catch (IndexOutOfBoundsException unused) {
                f2 = ((float) (w[17] / a2)) - (v * 2);
                com.sankuai.meituan.mapsdk.mapcore.report.f.a(this.f.c.getContext(), 3, this.f.o, getClass(), "updateScale", 5100L, Thread.currentThread() + " ScaleWidget updateScale 数组越界, 数组长度：" + w.length + " textIndex:" + i, (String) null, 1.0f);
            }
            this.A.a(Math.max(f2, 0.0f), 1.0f);
            d();
            b();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d049b7a022c1f506cccb4dcda0d7588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d049b7a022c1f506cccb4dcda0d7588");
            return;
        }
        for (c cVar : this.d) {
            cVar.a();
        }
        this.l = this.y.b + this.A.b + this.z.b;
        this.m = s;
    }

    @Override // com.sankuai.meituan.mapsdk.core.widgets.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cd74ca3a710b221f23259ec7bd5494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cd74ca3a710b221f23259ec7bd5494");
            return;
        }
        super.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b00a1b78cae53db9b2a8b96842194798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b00a1b78cae53db9b2a8b96842194798");
            return;
        }
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            this.f.d.removeImage(b(this.C.keyAt(i)));
        }
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e20123586005a91cfb54ddc35ec48b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e20123586005a91cfb54ddc35ec48b");
        }
        return "MTMAP_SCALE_TEXT_" + (i + 20);
    }

    private Bitmap c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d66c2435bd5c73874dbf8350b371d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d66c2435bd5c73874dbf8350b371d1");
        }
        Bitmap bitmap = this.C.get(i);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap d = d(i);
        this.C.put(i, d);
        this.f.d.addImage(b(i), d);
        return d;
    }

    private Bitmap d(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7d54903e3a6f2e5cceb6cc432349c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7d54903e3a6f2e5cceb6cc432349c5");
        }
        int i2 = w[i];
        if (i2 < 1000) {
            str = i2 + this.f.c.getContext().getResources().getString(R.string.mtmapsdk_scale_unit_meter);
        } else {
            str = (i2 / 1000) + this.f.c.getContext().getString(R.string.mtmapsdk_scale_unit_kilometer);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextSize(q);
        textPaint.setFakeBoldText(true);
        textPaint.setStrokeWidth(r);
        int measureText = ((int) textPaint.measureText(str)) + r;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        Bitmap createBitmap = Bitmap.createBitmap(measureText, ((int) (fontMetrics.descent - fontMetrics.ascent)) + r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, r / 4.0f, (-fontMetrics.ascent) + (r / 2.0f), textPaint);
        textPaint.setColor(-14671840);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, r / 4.0f, (-fontMetrics.ascent) + (r / 2.0f), textPaint);
        return createBitmap;
    }
}
