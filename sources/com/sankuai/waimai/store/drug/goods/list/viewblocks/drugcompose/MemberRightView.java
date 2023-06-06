package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MemberRightView extends View {
    public static ChangeQuickRedirect a;
    private final int b;
    @Nullable
    private final Drawable c;
    @Nullable
    private final Drawable d;
    private final Rect e;
    private final RectF f;
    private String g;
    private final Paint h;
    private final int i;
    private final Path j;

    public MemberRightView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acc37c12ead734aa2266906034c9727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acc37c12ead734aa2266906034c9727");
        }
    }

    public MemberRightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb5929141d23e326406567f68d254c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb5929141d23e326406567f68d254c4");
        }
    }

    public MemberRightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417519ba48697cb9f31e38702f1fe65f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417519ba48697cb9f31e38702f1fe65f");
            return;
        }
        this.e = new Rect();
        this.f = new RectF();
        this.h = new Paint(5);
        this.j = new Path();
        this.h.setStyle(Paint.Style.FILL);
        this.h.setAntiAlias(true);
        this.c = ContextCompat.getDrawable(getContext(), R.drawable.wm_drug_poi_member_logo);
        this.d = ContextCompat.getDrawable(getContext(), R.drawable.wm_drug_compose_poi_member_arrow);
        this.b = a(8.0f);
        this.i = a(20.0f);
        this.h.setTextSize(a(11.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4a5edf012c2be7c6ee407b7bc191b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4a5edf012c2be7c6ee407b7bc191b8");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0922c6472eb66558c6cf1c18c31bb8f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0922c6472eb66558c6cf1c18c31bb8f9");
            i2 = 1;
            f = 0.0f;
            i = 2;
        } else {
            this.j.reset();
            int width = (int) (getWidth() - a());
            Paint paint = this.h;
            float f2 = width;
            float width2 = getWidth();
            Object[] objArr3 = {Float.valueOf(f2), Float.valueOf(width2), -8099502, -11386830};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            f = 0.0f;
            i = 2;
            paint.setShader(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "057275877f2eea13df93bde3c9bd1cfc", RobustBitConfig.DEFAULT_VALUE) ? (LinearGradient) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "057275877f2eea13df93bde3c9bd1cfc") : new LinearGradient(f2, 0.0f, width2, 0.0f, -8099502, -11386830, Shader.TileMode.CLAMP));
            float a2 = width + a(15.0f);
            this.j.moveTo(a2, 0.0f);
            float a3 = a2 - a(9.0f);
            this.f.set(a3, 0.0f, (a(9.0f) * 2) + a3, a(9.0f) * 2);
            this.j.arcTo(this.f, -90.0f, -60.0f);
            this.j.lineTo(f2, this.i);
            this.j.lineTo(getWidth() - (this.i / 2), this.i);
            this.f.set(getWidth() - this.i, 0.0f, getWidth(), this.i);
            this.j.arcTo(this.f, 90.0f, -180.0f);
            this.j.close();
            canvas.drawPath(this.j, this.h);
            i2 = 1;
        }
        Object[] objArr4 = new Object[i2];
        objArr4[0] = canvas;
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3b05cc93ff0390574372e04c14cf9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3b05cc93ff0390574372e04c14cf9b5");
            return;
        }
        this.f.set(f, f, getWidth(), getHeight());
        int drawablePadding = getDrawablePadding();
        Object[] objArr5 = new Object[i];
        objArr5[0] = canvas;
        objArr5[1] = Integer.valueOf(drawablePadding);
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6f2ff2584694c890fec5bd43a4264562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6f2ff2584694c890fec5bd43a4264562");
            return;
        }
        this.h.setShader(null);
        int i3 = (this.i - this.b) / 2;
        int i4 = (this.i + this.b) / 2;
        this.e.set(drawablePadding, i3, this.b + drawablePadding, i4);
        a(this.c, canvas);
        this.h.setColor(-268849);
        String str = this.g;
        float a4 = drawablePadding + this.b + a(3.0f);
        float f3 = i4;
        Object[] objArr6 = new Object[4];
        objArr6[0] = str;
        objArr6[1] = canvas;
        objArr6[i] = Float.valueOf(a4);
        objArr6[3] = Float.valueOf(f3);
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ead3f15dd2f5e2ae979500cecfd09674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ead3f15dd2f5e2ae979500cecfd09674");
        } else if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, a4, f3, this.h);
        }
        this.e.set(((getWidth() - getDrawablePadding()) - this.b) + b(), i3, (getWidth() - getDrawablePadding()) + b(), i4);
        a(this.d, canvas);
    }

    private void a(Drawable drawable, Canvas canvas) {
        Object[] objArr = {drawable, canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234d4258ee064866c936277302448459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234d4258ee064866c936277302448459");
        } else if (drawable == null) {
        } else {
            drawable.setBounds(this.e);
            drawable.draw(canvas);
        }
    }

    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fb7c42286927f6835474474233cd85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fb7c42286927f6835474474233cd85");
            return;
        }
        this.g = str;
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50009570f6883c9b879801e88c871530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50009570f6883c9b879801e88c871530");
        } else {
            setMeasuredDimension(Math.min(View.MeasureSpec.getSize(i), (int) a()), this.i);
        }
    }

    private int getDrawablePadding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b5cd8845f3e4963641cf9dbe44be0d0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b5cd8845f3e4963641cf9dbe44be0d0")).intValue() : a(8.0f);
    }

    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b1ac43919ebc0f0ae3ad0ad5d1f55b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b1ac43919ebc0f0ae3ad0ad5d1f55b")).floatValue();
        }
        if (TextUtils.isEmpty(this.g)) {
            this.g = getContext().getString(R.string.wm_sc_member_ship);
        }
        return this.h.measureText(this.g) + (getDrawablePadding() * 2) + a(4.0f) + (this.b * 2);
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6cac466d78d21e88c103a4b7e530748", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6cac466d78d21e88c103a4b7e530748")).intValue() : a(2.0f);
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a55061e48eecad098525818da7f0ca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a55061e48eecad098525818da7f0ca")).intValue() : com.sankuai.shangou.stone.util.h.a(getContext(), f);
    }
}
