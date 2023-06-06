package com.reactnativecommunity.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VerticalViewPager extends ViewPager {
    private boolean a;
    private GestureDetector b;

    public VerticalViewPager(Context context) {
        super(context);
        this.a = false;
    }

    public void setOrientation(boolean z) {
        this.a = z;
        if (this.a) {
            setPageTransformer(true, new VerticalPageTransformer());
            this.b = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.reactnativecommunity.viewpager.VerticalViewPager.1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return Math.abs(f2) > Math.abs(f);
                }
            });
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        return !canScrollVertically(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.a;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(a(motionEvent));
        a(motionEvent);
        if (this.a && this.b.onTouchEvent(motionEvent)) {
            return true;
        }
        return onInterceptTouchEvent;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(a(motionEvent));
        a(motionEvent);
        if (this.a && this.b.onTouchEvent(motionEvent)) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i - getPageMargin(), i2, i3 - getPageMargin(), i4);
    }

    private MotionEvent a(MotionEvent motionEvent) {
        if (this.a) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        }
        return motionEvent;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class VerticalPageTransformer implements ViewPager.PageTransformer {
        private VerticalPageTransformer() {
        }

        @Override // android.support.v4.view.ViewPager.PageTransformer
        public final void transformPage(View view, float f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (f >= -1.0f && f <= 1.0f) {
                view.setAlpha(1.0f);
                view.setTranslationX(width * (-f));
                view.setTranslationY(f * height);
                return;
            }
            view.setAlpha(0.0f);
        }
    }
}
