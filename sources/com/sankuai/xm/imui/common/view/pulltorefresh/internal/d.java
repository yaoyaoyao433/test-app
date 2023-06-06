package com.sankuai.xm.imui.common.view.pulltorefresh.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends c {
    public static ChangeQuickRedirect g;
    private final Animation h;
    private final Matrix i;
    private final boolean j;
    private float k;
    private float l;

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.c
    public final int getDefaultDrawableResId() {
        return R.drawable.xm_sdk_default_indicator_rotate;
    }

    public d(Context context, e.c cVar, e.i iVar, TypedArray typedArray) {
        super(context, cVar, iVar, typedArray);
        Object[] objArr = {context, cVar, iVar, typedArray};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8ad790a5e2d3408d30ad2da7c55427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8ad790a5e2d3408d30ad2da7c55427");
            return;
        }
        this.j = typedArray.getBoolean(15, true);
        this.c.setScaleType(ImageView.ScaleType.MATRIX);
        this.i = new Matrix();
        this.c.setImageMatrix(this.i);
        this.h = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.h.setInterpolator(b);
        this.h.setDuration(1200L);
        this.h.setRepeatCount(-1);
        this.h.setRepeatMode(1);
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.c
    public final void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e9ec8e6ed8f84fdb71ba78ba748ef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e9ec8e6ed8f84fdb71ba78ba748ef3");
        } else if (drawable != null) {
            this.k = drawable.getIntrinsicWidth() / 2.0f;
            this.l = drawable.getIntrinsicHeight() / 2.0f;
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.c
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693ce368a5f57b137715067fc6bcc2b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693ce368a5f57b137715067fc6bcc2b3");
            return;
        }
        this.i.setRotate(this.j ? f * 90.0f : Math.max(0.0f, Math.min(180.0f, (f * 360.0f) - 180.0f)), this.k, this.l);
        this.c.setImageMatrix(this.i);
        this.c.setVisibility(0);
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff823ffc67093cb8372fb8a21f055a3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff823ffc67093cb8372fb8a21f055a3d");
        } else {
            this.c.startAnimation(this.h);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deaec203a32f2315def9bad8adc7dd9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deaec203a32f2315def9bad8adc7dd9d");
            return;
        }
        this.c.clearAnimation();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3087b892406166964da5ce109d9bd3c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3087b892406166964da5ce109d9bd3c1");
        } else if (this.i != null) {
            this.i.reset();
            this.c.setImageMatrix(this.i);
        }
    }
}
