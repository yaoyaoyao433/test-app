package com.sankuai.waimai.ugc.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.image.adapter.ImagePreviewAdapter;
import uk.co.senab.photoview.PhotoView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PhotoViewPager extends ViewPager {
    public static ChangeQuickRedirect a;
    private boolean b;

    public PhotoViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed0554d1fed1bf202a97da5a461ffb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed0554d1fed1bf202a97da5a461ffb8");
        } else {
            this.b = false;
        }
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f19c1834c31884e8d7567c78eab8f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f19c1834c31884e8d7567c78eab8f3");
        } else {
            this.b = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        PhotoView photoView;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72ae15054fab661c7bfd4aec6a5c8ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72ae15054fab661c7bfd4aec6a5c8ad0");
        } else if (this.b) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (z) {
            PagerAdapter adapter = getAdapter();
            if (adapter == null || !(adapter instanceof ImagePreviewAdapter)) {
                return;
            }
            int currentItem = getCurrentItem();
            ImagePreviewAdapter imagePreviewAdapter = (ImagePreviewAdapter) adapter;
            Object[] objArr2 = {Integer.valueOf(currentItem)};
            ChangeQuickRedirect changeQuickRedirect2 = ImagePreviewAdapter.c;
            if (PatchProxy.isSupport(objArr2, imagePreviewAdapter, changeQuickRedirect2, false, "aabe74215e8dfe3ec128f38547ef2fe5", RobustBitConfig.DEFAULT_VALUE)) {
                photoView = (PhotoView) PatchProxy.accessDispatch(objArr2, imagePreviewAdapter, changeQuickRedirect2, false, "aabe74215e8dfe3ec128f38547ef2fe5");
            } else {
                int a2 = ImagePreviewAdapter.a(currentItem);
                photoView = a2 < imagePreviewAdapter.e.size() ? imagePreviewAdapter.e.get(a2) : null;
            }
            if (photoView == null || photoView.getScale() <= 1.0f) {
                return;
            }
            super.requestDisallowInterceptTouchEvent(true);
        } else {
            super.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b22fd1d2060039970c5495c5179be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b22fd1d2060039970c5495c5179be")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e14c5f272ae10ea8ecdcdb4638b02a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e14c5f272ae10ea8ecdcdb4638b02a")).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813544d2adafef7e4140b46c16c9f36b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813544d2adafef7e4140b46c16c9f36b")).booleanValue();
        }
        if (this.b && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e0b2d11d8d689c45f25c3fb048f1cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e0b2d11d8d689c45f25c3fb048f1cd")).booleanValue() : super.performClick();
    }

    public void setIsDisallowInterceptTouchEvent(boolean z) {
        this.b = z;
    }
}
