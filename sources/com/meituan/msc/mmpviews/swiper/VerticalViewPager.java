package com.meituan.msc.mmpviews.swiper;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VerticalViewPager extends ViewPager {
    public static ChangeQuickRedirect b;
    private boolean a;
    private GestureDetector c;
    private ViewPager.PageTransformer d;

    public VerticalViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f30ffbe59c2b802ff0d630c9d3eec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f30ffbe59c2b802ff0d630c9d3eec9");
        } else {
            this.a = false;
        }
    }

    public void setOrientation(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e544c96aab83bf6529058a749caabb36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e544c96aab83bf6529058a749caabb36");
            return;
        }
        this.a = z;
        if (this.a) {
            this.d = new VerticalPageTransformer();
            setPageTransformer(true, this.d);
            this.c = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.meituan.msc.mmpviews.swiper.VerticalViewPager.1
                public static ChangeQuickRedirect a;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61bde4119673c348e5e5abcf55801281", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61bde4119673c348e5e5abcf55801281")).booleanValue() : Math.abs(f2) > Math.abs(f);
                }
            });
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0d1d50f49382f959e4b346a857c451", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0d1d50f49382f959e4b346a857c451")).booleanValue() : !canScrollVertically(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.a;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b76b8e6b1ca417927798a6220dfb85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b76b8e6b1ca417927798a6220dfb85")).booleanValue();
        }
        if (!this.a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(a(motionEvent));
        a(motionEvent);
        if (this.a && this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        return onInterceptTouchEvent;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da4764602ff5f66656f637592e3c886", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da4764602ff5f66656f637592e3c886")).booleanValue();
        }
        if (!this.a) {
            return super.onTouchEvent(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(a(motionEvent));
        a(motionEvent);
        if (this.a && this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf895f4a8865a34b9b65ed92b54c6c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf895f4a8865a34b9b65ed92b54c6c03");
        } else {
            super.onSizeChanged(i - getPageMargin(), i2, i3 - getPageMargin(), i4);
        }
    }

    private MotionEvent a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7081a100b7ec89dd82d82a375134f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MotionEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7081a100b7ec89dd82d82a375134f7");
        }
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
        public static ChangeQuickRedirect a;

        public VerticalPageTransformer() {
        }

        @Override // android.support.v4.view.ViewPager.PageTransformer
        public final void transformPage(View view, float f) {
            Object[] objArr = {view, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347352eec7c27b6202b0c98a06e506cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347352eec7c27b6202b0c98a06e506cb");
                return;
            }
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

    public ViewPager.PageTransformer getPageTransformer() {
        return this.d;
    }
}
