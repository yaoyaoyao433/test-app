package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dianping.picassomodule.widget.scroll.transformer.VerticalPagerTransformer;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DirectionalViewPager extends ViewPager {
    public static ChangeQuickRedirect f;
    private ComponentScrollEventHelper a;
    public boolean g;

    public DirectionalViewPager(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f6f32457ce73a28e849ee1b657f3c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f6f32457ce73a28e849ee1b657f3c8");
        }
    }

    public DirectionalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee12b38490061eb515558cc736d94e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee12b38490061eb515558cc736d94e5");
        } else {
            this.g = false;
        }
    }

    public void setVertical(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe72bdfa1905bbef36c1986faa309f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe72bdfa1905bbef36c1986faa309f5");
            return;
        }
        this.g = z;
        if (this.g) {
            setPageTransformer(false, new VerticalPagerTransformer());
        }
    }

    public void setScrollEventHandler(ComponentScrollEventHelper componentScrollEventHelper) {
        this.a = componentScrollEventHelper;
    }

    private MotionEvent a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bf9c3cf8654881ceb46037d15cfe7f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MotionEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bf9c3cf8654881ceb46037d15cfe7f3");
        }
        float width = getWidth();
        float height = getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ec6d5c4d2d02699eb2c5689ba4bf3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ec6d5c4d2d02699eb2c5689ba4bf3e");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25c02518432394a2ed4ad976989bdeb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25c02518432394a2ed4ad976989bdeb")).booleanValue();
        }
        if (this.g) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(a(motionEvent));
            a(motionEvent);
            return onInterceptTouchEvent;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59f55f1ce6280499bb33ffefc65538b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59f55f1ce6280499bb33ffefc65538b")).booleanValue();
        }
        if (this.a != null) {
            if (this.a.needDragEvent()) {
                this.a.handleEndDragByTouchEvent(motionEvent);
            }
            if (this.a.needMomentumEvent()) {
                this.a.handleMomentumScrollAndDragEndByEvent(motionEvent);
            }
        }
        if (this.g) {
            return super.onTouchEvent(a(motionEvent));
        }
        return super.onTouchEvent(motionEvent);
    }
}
