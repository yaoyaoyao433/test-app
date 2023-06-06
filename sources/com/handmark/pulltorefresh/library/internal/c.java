package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.support.constraint.R;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends FrameLayout implements Animation.AnimationListener {
    private Animation a;
    private Animation b;
    private ImageView c;
    private final Animation d;
    private final Animation e;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public c(Context context, c.a aVar) {
        super(context);
        int i;
        int i2;
        this.c = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.indicator_internal_padding);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize;
        layoutParams.topMargin = dimensionPixelSize;
        addView(this.c, layoutParams);
        if (AnonymousClass1.a[aVar.ordinal()] == 1) {
            i = R.anim.slide_in_from_bottom;
            i2 = R.anim.slide_out_to_bottom;
            setBackgroundResource(R.drawable.indicator_bg_bottom);
            this.c.setImageResource(R.drawable.pull_refresh_arrow_up);
        } else {
            i = R.anim.slide_in_from_top;
            i2 = R.anim.slide_out_to_top;
            setBackgroundResource(R.drawable.indicator_bg_top);
            this.c.setImageResource(R.drawable.pull_refresh_arrow_down);
        }
        this.a = AnimationUtils.loadAnimation(context, i);
        this.a.setAnimationListener(this);
        this.b = AnimationUtils.loadAnimation(context, i2);
        this.b.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.d = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.d.setInterpolator(linearInterpolator);
        this.d.setDuration(150L);
        this.d.setFillAfter(true);
        this.e = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.e.setInterpolator(linearInterpolator);
        this.e.setDuration(150L);
        this.e.setFillAfter(true);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.handmark.pulltorefresh.library.internal.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[c.a.values().length];

        static {
            try {
                a[c.a.PULL_UP_TO_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.a.PULL_DOWN_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final boolean a() {
        Animation animation = getAnimation();
        return animation != null ? this.a == animation : getVisibility() == 0;
    }

    public final void b() {
        startAnimation(this.b);
    }

    public final void c() {
        this.c.clearAnimation();
        startAnimation(this.a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.b) {
            this.c.clearAnimation();
            setVisibility(8);
        } else if (animation == this.a) {
            setVisibility(0);
        }
        clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        setVisibility(0);
    }

    public final void d() {
        this.c.startAnimation(this.d);
    }

    public final void e() {
        this.c.startAnimation(this.e);
    }
}
