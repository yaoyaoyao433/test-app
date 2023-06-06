package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LightingAnimationView extends View {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    private final Paint d;
    private final Path e;
    private ValueAnimator f;
    private int g;
    private final Path h;
    private final RectF i;
    private int[] j;
    private float[] k;
    private int l;
    private float m;
    private int n;

    public LightingAnimationView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10496f99d565b49d3fec3d5ab656814", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10496f99d565b49d3fec3d5ab656814");
        }
    }

    public LightingAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1179138d2023e8953c8a343eb9436098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1179138d2023e8953c8a343eb9436098");
        }
    }

    public LightingAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ace3c7845a11c83846388791e5306a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ace3c7845a11c83846388791e5306a");
            return;
        }
        this.d = new Paint();
        this.e = new Path();
        this.f = null;
        this.g = -1;
        this.h = new Path();
        this.i = new RectF();
        this.j = new int[]{ViewCompat.MEASURED_SIZE_MASK, 1308622847, 1308622847, ViewCompat.MEASURED_SIZE_MASK};
        this.k = new float[]{0.0f, 0.4f, 0.5f, 1.0f};
        this.l = 1;
        this.b = 1600;
        this.c = -1;
        this.m = 0.45f;
        this.n = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.la_colors, R.attr.la_positions, R.attr.la_play_mode, R.attr.la_repeat, R.attr.la_duration, R.attr.la_radius, R.attr.la_k, R.attr.la_w});
            String string = obtainStyledAttributes.getString(0);
            String string2 = obtainStyledAttributes.getString(1);
            if (string != null && string2 != null) {
                String[] split = string.split(CommonConstant.Symbol.COMMA);
                String[] split2 = string2.split(CommonConstant.Symbol.COMMA);
                int length = split.length;
                if (length == split2.length) {
                    this.j = new int[length];
                    this.k = new float[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        this.j[i2] = Color.parseColor(split[i2]);
                        this.k[i2] = Float.parseFloat(split2[i2]);
                    }
                }
            }
            this.l = obtainStyledAttributes.getInt(2, this.l);
            this.c = obtainStyledAttributes.getInt(3, this.c);
            if (this.c < 0 && this.c != -1) {
                this.c = -1;
            }
            this.b = obtainStyledAttributes.getInt(4, this.b);
            this.g = obtainStyledAttributes.getDimensionPixelSize(5, this.g);
            this.m = obtainStyledAttributes.getFloat(6, this.m);
            this.n = obtainStyledAttributes.getDimensionPixelSize(7, this.n);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5956b024dc170dd6640de0d3c14b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5956b024dc170dd6640de0d3c14b94");
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.l == 1) {
            a(size, size2, this.c, this.b);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce60b2436842bef798ff9599500de5a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce60b2436842bef798ff9599500de5a9");
            return;
        }
        super.onDraw(canvas);
        this.h.reset();
        if (this.g < 0) {
            this.g = getHeight() / 2;
        }
        this.i.set(0.0f, 0.0f, getWidth(), getHeight());
        this.h.addRoundRect(this.i, this.g, this.g, Path.Direction.CW);
        canvas.clipPath(this.h);
        canvas.drawPath(this.e, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, long j) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae6d19cf245f6cf7a5f3e88851615b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae6d19cf245f6cf7a5f3e88851615b6");
            return;
        }
        this.e.moveTo(0.0f, 0.0f);
        float f = i;
        this.e.lineTo(f, 0.0f);
        float f2 = i2;
        this.e.lineTo(f, f2);
        this.e.lineTo(0.0f, f2);
        this.e.close();
        final float f3 = this.m;
        if (this.n < 0) {
            this.n = i / 3;
        }
        final float f4 = this.n;
        StringBuilder sb = new StringBuilder();
        sb.append(f4);
        sb.append("==");
        sb.append(i);
        if (this.f != null) {
            this.f.cancel();
        }
        float f5 = 2.0f * f4;
        this.f = ValueAnimator.ofFloat(0.0f - f5, f + f5);
        this.f.setRepeatCount(i3);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setDuration(j);
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.LightingAnimationView.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e8144b208ce9563a61d3e773602672a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e8144b208ce9563a61d3e773602672a");
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LightingAnimationView.this.d.setShader(new LinearGradient(floatValue, f3 * floatValue, floatValue + f4, (f4 + floatValue) * f3, LightingAnimationView.this.j, LightingAnimationView.this.k, Shader.TileMode.CLAMP));
                LightingAnimationView.this.invalidate();
            }
        });
        this.f.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2fbb2d30da412bee2f29fcdaaaecfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2fbb2d30da412bee2f29fcdaaaecfe3");
            return;
        }
        super.onDetachedFromWindow();
        if (this.f != null) {
            this.f.cancel();
        }
        this.f = null;
    }

    public int getRadius() {
        return this.g;
    }

    public void setRadius(int i) {
        this.g = i;
    }

    public float getMk() {
        return this.m;
    }

    public void setMk(float f) {
        this.m = f;
    }

    public int getMw() {
        return this.n;
    }

    public void setMw(int i) {
        this.n = i;
    }
}
