package com.viewpagerindicator;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IconPageIndicator extends HorizontalScrollView implements PageIndicator {
    private final b a;
    private ViewPager b;
    private ViewPager.OnPageChangeListener c;
    private Runnable d;
    private int e;

    static /* synthetic */ Runnable a(IconPageIndicator iconPageIndicator, Runnable runnable) {
        iconPageIndicator.d = null;
        return null;
    }

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    private IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, null);
        setHorizontalScrollBarEnabled(false);
        this.a = new b(context, R.attr.vpiIconPageIndicatorStyle);
        addView(this.a, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null) {
            post(this.d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            removeCallbacks(this.d);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (this.c != null) {
            this.c.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.c != null) {
            this.c.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        setCurrentItem(i);
        if (this.c != null) {
            this.c.onPageSelected(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.b == viewPager) {
            return;
        }
        if (this.b != null) {
            this.b.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.b = viewPager;
        viewPager.setOnPageChangeListener(this);
        a();
    }

    private void a() {
        this.a.removeAllViews();
        a aVar = (a) this.b.getAdapter();
        int a = aVar.a();
        for (int i = 0; i < a; i++) {
            ImageView imageView = new ImageView(getContext(), null, R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(aVar.a(i));
            this.a.addView(imageView);
        }
        if (this.e > a) {
            this.e = a - 1;
        }
        setCurrentItem(this.e);
        requestLayout();
    }

    public void setCurrentItem(int i) {
        if (this.b == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.e = i;
        this.b.setCurrentItem(i);
        int childCount = this.a.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.a.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.a.getChildAt(i);
                if (this.d != null) {
                    removeCallbacks(this.d);
                }
                this.d = new Runnable() { // from class: com.viewpagerindicator.IconPageIndicator.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        IconPageIndicator.this.smoothScrollTo(childAt2.getLeft() - ((IconPageIndicator.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        IconPageIndicator.a(IconPageIndicator.this, null);
                    }
                };
                post(this.d);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.c = onPageChangeListener;
    }
}
