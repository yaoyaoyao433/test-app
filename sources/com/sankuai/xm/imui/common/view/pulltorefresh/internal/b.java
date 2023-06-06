package com.sankuai.xm.imui.common.view.pulltorefresh.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class b extends FrameLayout implements Animation.AnimationListener {
    public static ChangeQuickRedirect a;
    private final Animation b;
    private final Animation c;
    private Animation d;
    private Animation e;
    private ImageView f;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public b(Context context, e.c cVar) {
        super(context);
        int i;
        int i2;
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0451a8c2178c30659176ea91b8150b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0451a8c2178c30659176ea91b8150b1");
            return;
        }
        this.f = new ImageView(context);
        Drawable drawable = getResources().getDrawable(R.drawable.xm_sdk_default_indicator_arrow);
        this.f.setImageDrawable(null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.xm_sdk_indicator_internal_padding);
        this.f.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.f);
        if (AnonymousClass1.a[cVar.ordinal()] != 1) {
            i = R.anim.xm_sdk_slide_in_from_top;
            i2 = R.anim.xm_sdk_slide_out_to_top;
        } else {
            i = R.anim.xm_sdk_slide_in_from_bottom;
            this.f.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f, drawable.getIntrinsicWidth() / 2.0f, drawable.getIntrinsicHeight() / 2.0f);
            this.f.setImageMatrix(matrix);
            i2 = R.anim.xm_sdk_slide_out_to_bottom;
        }
        this.f.setVisibility(4);
        this.d = AnimationUtils.loadAnimation(context, i);
        this.d.setAnimationListener(this);
        this.e = AnimationUtils.loadAnimation(context, i2);
        this.e.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.b = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.b.setInterpolator(linearInterpolator);
        this.b.setDuration(150L);
        this.b.setFillAfter(true);
        this.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.c.setInterpolator(linearInterpolator);
        this.c.setDuration(150L);
        this.c.setFillAfter(true);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.view.pulltorefresh.internal.b$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[e.c.valuesCustom().length];

        static {
            try {
                a[e.c.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.c.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1f0801c485f6741dd87854257e99cc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1f0801c485f6741dd87854257e99cc")).booleanValue();
        }
        Animation animation = getAnimation();
        return animation != null ? this.d == animation : getVisibility() == 0;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4af23a6041e59f417c303b191703ba28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4af23a6041e59f417c303b191703ba28");
        } else {
            startAnimation(this.e);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49699a56c670d71f7edfb459a6dc4b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49699a56c670d71f7edfb459a6dc4b9b");
            return;
        }
        this.f.clearAnimation();
        startAnimation(this.d);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb8065c0fd11ca01c90552af5a5419a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb8065c0fd11ca01c90552af5a5419a");
            return;
        }
        if (animation == this.e) {
            this.f.clearAnimation();
            setVisibility(8);
        } else if (animation == this.d) {
            setVisibility(0);
        }
        clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85f10fb9200bc46b43521e974e29be50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85f10fb9200bc46b43521e974e29be50");
        } else {
            setVisibility(0);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6895b3c4f9a3624e84775ceb75737d43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6895b3c4f9a3624e84775ceb75737d43");
        } else {
            this.f.startAnimation(this.b);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504b294c0bad11b60d8c3d121982fbae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504b294c0bad11b60d8c3d121982fbae");
        } else {
            this.f.startAnimation(this.c);
        }
    }
}
