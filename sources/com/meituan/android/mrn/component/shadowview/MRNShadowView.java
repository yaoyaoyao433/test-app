package com.meituan.android.mrn.component.shadowview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.yoga.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNShadowView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Path A;
    private RectF B;
    private float[] C;
    private float D;
    float b;
    float c;
    float d;
    float e;
    private int f;
    private float g;
    private float h;
    private float i;
    private RectF j;
    private RectF k;
    private RectF l;
    private RectF m;
    private RectF n;
    private RectF o;
    private RectF p;
    private RectF q;
    private final List<Shader> r;
    private final List<Shader> s;
    private final List<Shader> t;
    private final List<Shader> u;
    private Shader v;
    private Shader w;
    private Shader x;
    private Shader y;
    private Paint z;

    public MRNShadowView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52461eb36fc9e0e972fb60767be53d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52461eb36fc9e0e972fb60767be53d1");
            return;
        }
        this.f = 0;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = new Paint(1);
        this.A = new Path();
        this.B = new RectF();
        this.C = new float[8];
        this.D = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }

    public MRNShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36b9b08f8842648f5daeb609015e658e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36b9b08f8842648f5daeb609015e658e");
            return;
        }
        this.f = 0;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = new Paint(1);
        this.A = new Path();
        this.B = new RectF();
        this.C = new float[8];
        this.D = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da6a9b3f11424b049935d3e42e9dc6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da6a9b3f11424b049935d3e42e9dc6f");
            return;
        }
        try {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20d2be35f85a79dceb15246629d026b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20d2be35f85a79dceb15246629d026b2");
            } else {
                this.z.reset();
                this.z.setAntiAlias(true);
                a(canvas, this.r, this.j, 180.0f);
                a(canvas, this.s, this.k, 270.0f);
                a(canvas, this.u, this.m, 0.0f);
                a(canvas, this.t, this.l, 90.0f);
                this.z.setShader(null);
                this.z.setShader(this.x);
                canvas.drawRect(this.n, this.z);
                this.z.setShader(null);
                this.z.setShader(this.v);
                canvas.drawRect(this.o, this.z);
                this.z.setShader(null);
                this.z.setShader(this.y);
                canvas.drawRect(this.p, this.z);
                this.z.setShader(null);
                this.z.setShader(this.w);
                canvas.drawRect(this.q, this.z);
                this.z.setShader(null);
                this.z.setColor(this.f);
                canvas.drawPath(this.A, this.z);
                canvas.clipPath(this.A);
            }
        } catch (Throwable unused) {
            Log.e("MRNShadowView", "dispatchDraw: fail with exception");
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f82c9d3bee3a13049c0f20dd5c0ddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f82c9d3bee3a13049c0f20dd5c0ddb");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    private float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef43fc434d728dc5a0e0b003a72aac1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef43fc434d728dc5a0e0b003a72aac1")).floatValue();
        }
        if (b.a(f)) {
            if (b.a(this.D)) {
                return 0.0f;
            }
            return this.D;
        }
        return f;
    }

    public void setShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdaa9d56fc986b3f3ce643a45cf4ec9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdaa9d56fc986b3f3ce643a45cf4ec9c");
        } else {
            a(Color.argb((Color.alpha(i) * 70) / 100, Color.red(i), Color.green(i), Color.blue(i)), this.h, this.i, this.g);
        }
    }

    public void setShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34e074d4a58190afafe685c36d3eb61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34e074d4a58190afafe685c36d3eb61");
        } else {
            a(this.f, this.h, this.i, f);
        }
    }

    public void setShadowOffsetX(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f5d4e84802b7dcde108b4588a9ae21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f5d4e84802b7dcde108b4588a9ae21");
        } else {
            a(this.f, f, this.i, this.g);
        }
    }

    public void setShadowOffsetY(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a510d51839ae2fc219cbedb610ba0511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a510d51839ae2fc219cbedb610ba0511");
        } else {
            a(this.f, this.h, f, this.g);
        }
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b2947d2a86e112ede21b8dc3033bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b2947d2a86e112ede21b8dc3033bd1");
            return;
        }
        this.D = f;
        a();
    }

    private void a(int i, float f, float f2, float f3) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b594d14dcc069bcb432e51cd4ca1eecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b594d14dcc069bcb432e51cd4ca1eecc");
            return;
        }
        setWillNotDraw(false);
        this.f = i;
        this.h = f;
        this.i = f2;
        this.g = f3;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c966cbf8a975ead73e148bed113ede5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c966cbf8a975ead73e148bed113ede5");
            return;
        }
        try {
            int width = getWidth();
            int height = getHeight();
            c(width, height);
            a(this.r, this.j, width, height, this.C[0]);
            a(this.s, this.k, width, height, this.C[2]);
            a(this.u, this.m, width, height, this.C[4]);
            a(this.t, this.l, width, height, this.C[6]);
            b(height);
            a(width);
            b(width, height);
            a(width, height);
            postInvalidate();
        } catch (Throwable unused) {
            Log.e("MRNShadowView", "updateShadow: fail with exception");
        }
    }

    private void a(Canvas canvas, List<Shader> list, RectF rectF, float f) {
        Object[] objArr = {canvas, list, rectF, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3b09515de4475f0548170abf3ac3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3b09515de4475f0548170abf3ac3d4");
        } else if (list.size() > 0) {
            float size = 90.0f / list.size();
            for (int i = 0; i < list.size(); i++) {
                this.z.setShader(list.get(i));
                canvas.drawArc(rectF, f + (i * size), size, true, this.z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9 A[LOOP:0: B:18:0x00d3->B:20:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107 A[LOOP:1: B:21:0x0103->B:23:0x0107, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<android.graphics.Shader> r27, android.graphics.RectF r28, int r29, int r30, float r31) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.shadowview.MRNShadowView.a(java.util.List, android.graphics.RectF, int, int, float):void");
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffedee9271a8f71f382711418417c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffedee9271a8f71f382711418417c88");
            return;
        }
        int[] iArr = {0, this.f};
        float f = (this.g - this.h) + 0.0f + this.C[0];
        float f2 = (i - (this.g + this.h)) - this.C[2];
        float f3 = (this.g - this.i) + 0.0f;
        this.v = new LinearGradient(0.0f, 0.0f, 0.0f, f3, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.o.set(f, 0.0f, f2, f3);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ad94fd30627d09cd7a5812d03c5c29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ad94fd30627d09cd7a5812d03c5c29");
            return;
        }
        int[] iArr = {this.f, 0};
        float f = (this.g - this.h) + 0.0f + this.C[6];
        float f2 = i2;
        float f3 = f2 - (this.g + this.i);
        float f4 = (i - (this.g + this.h)) - this.C[4];
        this.w = new LinearGradient(0.0f, f3, 0.0f, f2, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.q.set(f, f3, f4, f2);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d429995ad4c1a1b14ebb5b8b1d4a5d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d429995ad4c1a1b14ebb5b8b1d4a5d9a");
            return;
        }
        int[] iArr = {0, this.f};
        float f = (this.g - this.i) + 0.0f + this.C[0];
        float f2 = (this.g - this.h) + 0.0f;
        float f3 = (i - (this.g + this.i)) - this.C[6];
        this.x = new LinearGradient(0.0f, 0.0f, f2, 0.0f, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.n.set(0.0f, f, f2, f3);
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "599e676619f0201485adc4caa6457a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "599e676619f0201485adc4caa6457a2f");
            return;
        }
        int[] iArr = {this.f, 0};
        float f = i;
        float f2 = f - (this.g + this.h);
        float f3 = (this.g - this.i) + 0.0f + this.C[2];
        float f4 = (i2 - (this.g + this.i)) - this.C[4];
        this.y = new LinearGradient(f2, 0.0f, f, 0.0f, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.p.set(f2, f3, f, f4);
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c8ffeea8986431d545f42b1cdd5b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c8ffeea8986431d545f42b1cdd5b7c");
            return;
        }
        float f = i - (this.g + this.h);
        float f2 = i2 - (this.g + this.i);
        this.A.rewind();
        this.B.set((this.g - this.h) + 0.0f, (this.g - this.i) + 0.0f, f, f2);
        float[] fArr = this.C;
        float[] fArr2 = this.C;
        float a2 = a(this.b);
        fArr2[1] = a2;
        fArr[0] = a2;
        float[] fArr3 = this.C;
        float[] fArr4 = this.C;
        float a3 = a(this.c);
        fArr4[3] = a3;
        fArr3[2] = a3;
        float[] fArr5 = this.C;
        float[] fArr6 = this.C;
        float a4 = a(this.e);
        fArr6[5] = a4;
        fArr5[4] = a4;
        float[] fArr7 = this.C;
        float[] fArr8 = this.C;
        float a5 = a(this.d);
        fArr8[7] = a5;
        fArr7[6] = a5;
        this.A.addRoundRect(this.B, this.C, Path.Direction.CW);
    }
}
