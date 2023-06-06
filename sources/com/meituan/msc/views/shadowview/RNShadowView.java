package com.meituan.msc.views.shadowview;

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
import com.meituan.android.msc.yoga.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNShadowView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private final Path A;
    private final RectF B;
    private final float[] C;
    private float D;
    float b;
    float c;
    float d;
    float e;
    private final List<Shader> f;
    private final List<Shader> g;
    private final List<Shader> h;
    private final List<Shader> i;
    private int j;
    private float k;
    private float l;
    private float m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private Shader v;
    private Shader w;
    private Shader x;
    private Shader y;
    private final Paint z;

    public RNShadowView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c3fc8dda6b8aa4fc39ece9e95bc05a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c3fc8dda6b8aa4fc39ece9e95bc05a");
            return;
        }
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = 0;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
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

    public RNShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdcc3b15174e751bcf2bb301da1a19d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdcc3b15174e751bcf2bb301da1a19d2");
            return;
        }
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = 0;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78e24893377c01dc47ee561b42886d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78e24893377c01dc47ee561b42886d1");
            return;
        }
        try {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14b7cd10be0b8d9aeea40a16124e2e9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14b7cd10be0b8d9aeea40a16124e2e9b");
            } else {
                this.z.reset();
                this.z.setAntiAlias(true);
                a(canvas, this.f, this.n, 180.0f);
                a(canvas, this.g, this.o, 270.0f);
                a(canvas, this.i, this.q, 0.0f);
                a(canvas, this.h, this.p, 90.0f);
                this.z.setShader(null);
                this.z.setShader(this.x);
                canvas.drawRect(this.r, this.z);
                this.z.setShader(null);
                this.z.setShader(this.v);
                canvas.drawRect(this.s, this.z);
                this.z.setShader(null);
                this.z.setShader(this.y);
                canvas.drawRect(this.t, this.z);
                this.z.setShader(null);
                this.z.setShader(this.w);
                canvas.drawRect(this.u, this.z);
                this.z.setShader(null);
                this.z.setColor(this.j);
                canvas.drawPath(this.A, this.z);
                canvas.clipPath(this.A);
            }
        } catch (Throwable unused) {
            Log.e("MSCShadowView", "dispatchDraw: fail with exception");
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa504d462967dbd8901a14c779fd313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa504d462967dbd8901a14c779fd313");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    private float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278e12f9830a85491631361ea40772e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278e12f9830a85491631361ea40772e6")).floatValue();
        }
        if (f.a(f)) {
            if (f.a(this.D)) {
                return 0.0f;
            }
            return this.D;
        }
        return f;
    }

    public void setShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319ab84910cb2b84bfdd38fb04924b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319ab84910cb2b84bfdd38fb04924b3c");
        } else {
            a(Color.argb((Color.alpha(i) * 70) / 100, Color.red(i), Color.green(i), Color.blue(i)), this.l, this.m, this.k);
        }
    }

    public void setShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff39ac14940c20249c7068f01d1e86ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff39ac14940c20249c7068f01d1e86ab");
        } else {
            a(this.j, this.l, this.m, f);
        }
    }

    public void setShadowOffsetX(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5858f1e2949ddd7ec2e4d6b95fab1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5858f1e2949ddd7ec2e4d6b95fab1f");
        } else {
            a(this.j, f, this.m, this.k);
        }
    }

    public void setShadowOffsetY(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6d491dcc5f363174baec56dc714b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6d491dcc5f363174baec56dc714b89");
        } else {
            a(this.j, this.l, f, this.k);
        }
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897243f251147c41629118867527616b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897243f251147c41629118867527616b");
            return;
        }
        this.D = f;
        a();
    }

    private void a(int i, float f, float f2, float f3) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93abd6d67356a2140336a184d8f5c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93abd6d67356a2140336a184d8f5c5a");
            return;
        }
        setWillNotDraw(false);
        this.j = i;
        this.l = f;
        this.m = f2;
        this.k = f3;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7313f162946723774da27e63b27c0896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7313f162946723774da27e63b27c0896");
            return;
        }
        try {
            int width = getWidth();
            int height = getHeight();
            c(width, height);
            a(this.f, this.n, width, height, this.C[0]);
            a(this.g, this.o, width, height, this.C[2]);
            a(this.i, this.q, width, height, this.C[4]);
            a(this.h, this.p, width, height, this.C[6]);
            b(height);
            a(width);
            b(width, height);
            a(width, height);
            postInvalidate();
        } catch (Throwable unused) {
            Log.e("MSCShadowView", "updateShadow: fail with exception");
        }
    }

    private void a(Canvas canvas, List<Shader> list, RectF rectF, float f) {
        Object[] objArr = {canvas, list, rectF, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58c4b439ea1639c3a7eab898f4bd0c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58c4b439ea1639c3a7eab898f4bd0c6");
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
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.shadowview.RNShadowView.a(java.util.List, android.graphics.RectF, int, int, float):void");
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f00b162c5490fd7edca9fe06f89ea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f00b162c5490fd7edca9fe06f89ea4");
            return;
        }
        int[] iArr = {0, this.j};
        float f = (this.k - this.l) + 0.0f + this.C[0];
        float f2 = (i - (this.k + this.l)) - this.C[2];
        float f3 = (this.k - this.m) + 0.0f;
        this.v = new LinearGradient(0.0f, 0.0f, 0.0f, f3, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s.set(f, 0.0f, f2, f3);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e444456500fd7aa86df004d4917d32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e444456500fd7aa86df004d4917d32d");
            return;
        }
        int[] iArr = {this.j, 0};
        float f = (this.k - this.l) + 0.0f + this.C[6];
        float f2 = i2;
        float f3 = f2 - (this.k + this.m);
        float f4 = (i - (this.k + this.l)) - this.C[4];
        this.w = new LinearGradient(0.0f, f3, 0.0f, f2, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.u.set(f, f3, f4, f2);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "debf365df07b8402ea5202a2a7f7e362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "debf365df07b8402ea5202a2a7f7e362");
            return;
        }
        int[] iArr = {0, this.j};
        float f = (this.k - this.m) + 0.0f + this.C[0];
        float f2 = (this.k - this.l) + 0.0f;
        float f3 = (i - (this.k + this.m)) - this.C[6];
        this.x = new LinearGradient(0.0f, 0.0f, f2, 0.0f, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.r.set(0.0f, f, f2, f3);
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b29fa64251c4466ba69b119b87f115b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b29fa64251c4466ba69b119b87f115b");
            return;
        }
        int[] iArr = {this.j, 0};
        float f = i;
        float f2 = f - (this.k + this.l);
        float f3 = (this.k - this.m) + 0.0f + this.C[2];
        float f4 = (i2 - (this.k + this.m)) - this.C[4];
        this.y = new LinearGradient(f2, 0.0f, f, 0.0f, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.t.set(f2, f3, f, f4);
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "613f90f5d942e8df3e0398e29c463d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "613f90f5d942e8df3e0398e29c463d6f");
            return;
        }
        float f = i - (this.k + this.l);
        float f2 = i2 - (this.k + this.m);
        this.A.rewind();
        this.B.set((this.k - this.l) + 0.0f, (this.k - this.m) + 0.0f, f, f2);
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
