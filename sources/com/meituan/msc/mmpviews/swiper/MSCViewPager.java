package com.meituan.msc.mmpviews.swiper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.events.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCViewPager extends VerticalViewPager {
    public static ChangeQuickRedirect a;
    private Rect c;

    public MSCViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0343d8b979d8929bd29333a7059c12a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0343d8b979d8929bd29333a7059c12a3");
        } else {
            this.c = new Rect();
        }
    }

    @Override // com.meituan.msc.mmpviews.swiper.VerticalViewPager, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f597dae1cd0f835a4e9b542fdc83e2b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f597dae1cd0f835a4e9b542fdc83e2b6")).booleanValue();
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                d.a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            g.e("MSCViewPager", "Error intercepting touch event.", e);
        }
        return false;
    }

    @Override // com.meituan.msc.mmpviews.swiper.VerticalViewPager, android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41153173ada53ea9ee692d76539ea16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41153173ada53ea9ee692d76539ea16")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            g.e("MSCViewPager", "Error handling touch event.", e);
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3cea61b6b6a383f293de05a3f6ee807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3cea61b6b6a383f293de05a3f6ee807");
            return;
        }
        super.onAttachedToWindow();
        requestLayout();
        post(new Runnable() { // from class: com.meituan.msc.mmpviews.swiper.MSCViewPager.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a448eb195fc168e8bca751fd3f56eca6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a448eb195fc168e8bca751fd3f56eca6");
                } else {
                    MSCViewPager.this.a();
                }
            }
        });
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a49ce7ae0bdcca4b4fbe2cf3043f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a49ce7ae0bdcca4b4fbe2cf3043f25");
            return;
        }
        getDrawingRect(this.c);
        canvas.clipRect(this.c);
        super.onDraw(canvas);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "622a811e89e006ddf8a88f6ac409f77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "622a811e89e006ddf8a88f6ac409f77d");
            return;
        }
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d0b76d868f4fdf32952925504473b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d0b76d868f4fdf32952925504473b0");
            return;
        }
        super.setCurrentItem(i, z);
        if (getPageTransformer() == null || ((ViewPagerAdapter) getAdapter()).d == null) {
            return;
        }
        getPageTransformer().transformPage(((ViewPagerAdapter) getAdapter()).d, 0.0f);
    }
}
