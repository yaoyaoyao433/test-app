package com.handmark.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.handmark.pulltorefresh.library.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends LoadingView {
    private static int a = 1;
    private static int b = 2;
    private int c;
    private ImageView d;
    private ImageView e;
    private Drawable f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;

    @SuppressLint({"NewApi"})
    public a(Context context, c.a aVar, TypedArray typedArray) {
        super(context);
        Drawable drawable;
        this.i = true;
        this.j = true;
        this.k = false;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_center_header, this);
        this.d = (ImageView) viewGroup.findViewById(R.id.pull_to_refresh_image);
        this.d.setImageResource(R.drawable.pull_image);
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        layoutParams = layoutParams == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 0));
        this.g = this.d.getMeasuredHeight();
        if (typedArray.hasValue(1) && (drawable = typedArray.getDrawable(1)) != null) {
            if (Build.VERSION.SDK_INT < 16) {
                setBackgroundDrawable(drawable);
            } else {
                setBackground(drawable);
            }
        }
        this.f = getResources().getDrawable(R.drawable.pull_end_animation);
        this.h = this.f.getIntrinsicHeight();
        this.e = (ImageView) viewGroup.findViewById(R.id.refreshing_image);
        this.e.setImageResource(R.drawable.refreshing_center_animation);
        a();
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void a() {
        this.c = a;
        a(this.d, false);
        if (this.i) {
            c();
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(4);
        }
        a(this.e, false);
        this.e.setVisibility(4);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void b() {
        if (this.i) {
            this.d.setVisibility(4);
            a(this.d, false);
        }
        if (this.j) {
            this.e.setVisibility(0);
            a(this.e, true);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void a(float f) {
        if (!this.i || this.k) {
            return;
        }
        float f2 = f * this.g;
        if (a == this.c) {
            if (f2 < this.g) {
                setPullImageHeight((int) f2);
                return;
            }
            this.d.setLayoutParams(new RelativeLayout.LayoutParams(-2, this.h));
            this.d.setImageDrawable(this.f);
            a(this.d, true);
            this.c = b;
        } else if (b != this.c || f2 > this.g) {
        } else {
            c();
            this.c = a;
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void setFrameImageBackground(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void setFrameImageVisibility(int i) {
        if (i == 0) {
            this.j = true;
        } else {
            this.j = false;
        }
        this.e.setVisibility(i);
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void setPullImageDrawable(Drawable drawable) {
        if (drawable != null) {
            this.k = true;
            this.d.setImageDrawable(drawable);
        }
    }

    @Override // com.handmark.pulltorefresh.library.internal.LoadingView
    public final void setPullImageVisibility(int i) {
        if (i == 0) {
            this.i = true;
        } else {
            this.i = false;
        }
        this.d.setVisibility(i);
    }

    private void setPullImageHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        layoutParams.height = i;
        this.d.setLayoutParams(layoutParams);
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, R.id.refreshing_image);
        this.d.setLayoutParams(layoutParams);
        if (this.k) {
            Drawable drawable = this.d.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                animationDrawable.stop();
                animationDrawable.selectDrawable(0);
                return;
            }
            return;
        }
        this.d.setImageResource(R.drawable.pull_image);
    }

    private static void a(ImageView imageView, boolean z) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.stop();
            if (z) {
                animationDrawable.start();
            }
        }
    }
}
