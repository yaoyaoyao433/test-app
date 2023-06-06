package com.dianping.shield.component.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScTitleBarContainer extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mIsTransparentTitleBar;
    private View mPageView;
    private View mTitleBar;

    public ScTitleBarContainer(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa915183984fa5d32d62bcc8afae0bf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa915183984fa5d32d62bcc8afae0bf3");
        }
    }

    public ScTitleBarContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c701fc6640cdb7d1718aa62b353ea2ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c701fc6640cdb7d1718aa62b353ea2ed");
        }
    }

    public ScTitleBarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f19b5c5b0dba1738f406e147aa375542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f19b5c5b0dba1738f406e147aa375542");
        }
    }

    public ScTitleBarContainer(Context context, View view, View view2, boolean z) {
        this(context);
        Object[] objArr = {context, view, view2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a169117b372d3b29a8ae94493d70880", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a169117b372d3b29a8ae94493d70880");
            return;
        }
        this.mTitleBar = view;
        this.mPageView = view2;
        this.mIsTransparentTitleBar = z;
        updateLayout();
    }

    public boolean isIsTransparentTitleBar() {
        return this.mIsTransparentTitleBar;
    }

    public void setIsTransparentTitleBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "667f2b5eaf1ae394c058ccb30220af4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "667f2b5eaf1ae394c058ccb30220af4f");
        } else if (this.mIsTransparentTitleBar != z) {
            this.mIsTransparentTitleBar = z;
            updateLayout();
        }
    }

    public void setTitleBar(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d316abacf4dbaca8b7f990327fbb1288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d316abacf4dbaca8b7f990327fbb1288");
            return;
        }
        this.mTitleBar = view;
        updateLayout();
    }

    public void setPageView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7def3da434e178dcf6bdaf75d61d194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7def3da434e178dcf6bdaf75d61d194");
            return;
        }
        this.mPageView = view;
        updateLayout();
    }

    private void updateLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3953470ac298a44faa0de5c64601f8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3953470ac298a44faa0de5c64601f8ee");
            return;
        }
        removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, -1);
        addView(this.mTitleBar, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (!this.mIsTransparentTitleBar) {
            layoutParams2.addRule(3, this.mTitleBar.getId());
        }
        addView(this.mPageView, layoutParams2);
        bringChildToFront(this.mTitleBar);
    }
}
