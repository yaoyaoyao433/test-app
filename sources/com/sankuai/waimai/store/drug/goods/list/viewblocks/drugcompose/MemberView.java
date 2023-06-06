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
public class MemberView extends View {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    private final int d;
    @Nullable
    private final Drawable e;
    @Nullable
    private final Drawable f;
    private final Rect g;
    private final RectF h;
    private final Paint i;
    private final int j;
    private final Path k;

    public MemberView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db57361e9118f9a73264bb9eac07ed78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db57361e9118f9a73264bb9eac07ed78");
        }
    }

    public MemberView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d439765f49e2a7df0e0e491b155a37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d439765f49e2a7df0e0e491b155a37");
        }
    }

    public MemberView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957ed4ba74c466c6ef5ce5f745b1a82a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957ed4ba74c466c6ef5ce5f745b1a82a");
            return;
        }
        this.g = new Rect();
        this.h = new RectF();
        this.i = new Paint(5);
        this.k = new Path();
        this.i.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
        this.e = ContextCompat.getDrawable(getContext(), R.drawable.wm_drug_poi_member_logo);
        this.f = ContextCompat.getDrawable(getContext(), R.drawable.wm_drug_compose_poi_member_arrow);
        this.d = a(8.0f);
        this.j = a(20.0f);
        this.i.setTextSize(a(11.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a51a554679122ef82fb2c09a0ad9039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a51a554679122ef82fb2c09a0ad9039");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5c6d128e0e6b95631055cbccbbf2dfb", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5c6d128e0e6b95631055cbccbbf2dfb")).booleanValue();
        } else {
            z = !TextUtils.isEmpty(this.b);
        }
        if (!z) {
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "484631857ae1155156435b1cce017f79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "484631857ae1155156435b1cce017f79");
                return;
            }
            this.i.setShader(a(0.0f, getWidth(), -8099502, -11386830));
            this.h.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(this.h, this.j, this.j, this.i);
            a(canvas, getDrawablePadding());
            return;
        }
        this.i.setShader(a(0.0f, a(), -2593, -4144));
        this.h.set(0.0f, 0.0f, (int) (a() + this.j), getHeight());
        canvas.drawRoundRect(this.h, this.j, this.j, this.i);
        this.i.setShader(null);
        this.i.setColor(-10333892);
        a(this.b, canvas, getDrawablePadding(), (this.j + this.d) / 2);
        Object[] objArr4 = {canvas};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "88750216468fdb77170239841d026bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "88750216468fdb77170239841d026bc6");
        } else {
            this.k.reset();
            int width = (int) (getWidth() - b());
            float f = width;
            this.i.setShader(a(f, getWidth(), -8099502, -11386830));
            float a2 = width + a(15.0f);
            this.k.moveTo(a2, 0.0f);
            float a3 = a2 - a(9.0f);
            this.h.set(a3, 0.0f, (a(9.0f) * 2) + a3, a(9.0f) * 2);
            this.k.arcTo(this.h, -90.0f, -60.0f);
            this.k.lineTo(f, this.j);
            this.k.lineTo(getWidth() - (this.j / 2), this.j);
            this.h.set(getWidth() - this.j, 0.0f, getWidth(), this.j);
            this.k.arcTo(this.h, 90.0f, -180.0f);
            this.k.close();
            canvas.drawPath(this.k, this.i);
        }
        a(canvas, (int) ((getWidth() - b()) + a(10.0f)));
    }

    private void a(Canvas canvas, int i) {
        Object[] objArr = {canvas, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0027608f3bdd777e4f0de3234af55abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0027608f3bdd777e4f0de3234af55abb");
            return;
        }
        this.i.setShader(null);
        int i2 = (this.j - this.d) / 2;
        int i3 = (this.j + this.d) / 2;
        this.g.set(i, i2, this.d + i, i3);
        a(this.e, canvas);
        this.i.setColor(-268849);
        a(this.c, canvas, i + this.d + a(3.0f), i3);
        this.g.set(((getWidth() - getDrawablePadding()) - this.d) + c(), i2, (getWidth() - getDrawablePadding()) + c(), i3);
        a(this.f, canvas);
    }

    private void a(String str, Canvas canvas, float f, float f2) {
        Object[] objArr = {str, canvas, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640e7faa055c238c39c3d1a43a1bfec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640e7faa055c238c39c3d1a43a1bfec6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            canvas.drawText(str, f, f2, this.i);
        }
    }

    private LinearGradient a(float f, float f2, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b41b4730205853ad12d3b5be3424cd3", RobustBitConfig.DEFAULT_VALUE) ? (LinearGradient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b41b4730205853ad12d3b5be3424cd3") : new LinearGradient(f, 0.0f, f2, 0.0f, i, i2, Shader.TileMode.CLAMP);
    }

    private void a(Drawable drawable, Canvas canvas) {
        Object[] objArr = {drawable, canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18121530598cf2b8968a0cbae25a31b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18121530598cf2b8968a0cbae25a31b6");
        } else if (drawable == null) {
        } else {
            drawable.setBounds(this.g);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7cd2ffe3be9b460f8e42e2a9ead783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7cd2ffe3be9b460f8e42e2a9ead783");
        } else {
            setMeasuredDimension(Math.min(View.MeasureSpec.getSize(i), (int) (a() + b())), this.j);
        }
    }

    private int getDrawablePadding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d618cce0c953f00f9fb0800cb2fbfa3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d618cce0c953f00f9fb0800cb2fbfa3")).intValue() : a(8.0f);
    }

    private float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ed47d93fa39ee66492b7a1c4b636d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ed47d93fa39ee66492b7a1c4b636d4")).floatValue();
        }
        if (TextUtils.isEmpty(this.b)) {
            return 0.0f;
        }
        return this.i.measureText(this.b) + getDrawablePadding();
    }

    private float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af87226e34b38a051597ee2f8d39c75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af87226e34b38a051597ee2f8d39c75")).floatValue();
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = getContext().getString(R.string.wm_sc_member_ship);
        }
        return this.i.measureText(this.c) + (getDrawablePadding() * 2) + a(4.0f) + (this.d * 2);
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989bbf580e3c0238fc76d5c8d2707e61", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989bbf580e3c0238fc76d5c8d2707e61")).intValue() : a(2.0f);
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588d3706f64d2dde3a5c4e0052aff22e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588d3706f64d2dde3a5c4e0052aff22e")).intValue() : com.sankuai.shangou.stone.util.h.a(getContext(), f);
    }
}
