package com.meituan.msc.modules.page.view.coverview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.common.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewNormalContainer extends ViewBaseContainer {
    public static ChangeQuickRedirect a;

    public CoverViewNormalContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fe2d0e97210ee6783e75c4cfe03099", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fe2d0e97210ee6783e75c4cfe03099");
        }
    }

    public CoverViewNormalContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34aa05636fdc56c254496c01fc2337e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34aa05636fdc56c254496c01fc2337e5");
        }
    }

    @Override // com.meituan.msc.modules.page.view.coverview.ViewBaseContainer, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfdb79bc5fc2cf6f8e1ab0acd9727f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfdb79bc5fc2cf6f8e1ab0acd9727f6");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.meituan.msc.modules.page.view.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1173892f56e6b16f863a2555ef57e82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1173892f56e6b16f863a2555ef57e82f");
        } else {
            super.removeView(view);
        }
    }

    @Override // com.meituan.msc.modules.page.view.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7651c717605d8bcd4d4d34c86c61a420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7651c717605d8bcd4d4d34c86c61a420");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // com.meituan.msc.modules.page.view.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ca2e43c56239881931370ff06ce2c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ca2e43c56239881931370ff06ce2c8");
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cec96342e34f2e91c4eab443658fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cec96342e34f2e91c4eab443658fbd")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            x.a(getContext(), getWindowToken(), 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
