package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.dianping.agentsdk.pagecontainer.f;
import com.dianping.shield.feature.FloatCoverViewControlInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopBottomViewDelegate extends PageContainerBaseDelegate<ViewGroup> implements f, FloatCoverViewControlInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected RelativeLayout floatCoverLayout;
    protected ViewGroup mBottomCellContainer;
    protected ViewGroup mBottomView;
    protected boolean mHasSetBottom;
    protected boolean mHasSetTop;

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bacebd39bc36dd997c6477d78b07d71f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bacebd39bc36dd997c6477d78b07d71f");
        }
    }

    public TopBottomViewDelegate(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c86125505318ff737cd0bd0e7b0b854b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c86125505318ff737cd0bd0e7b0b854b");
            return;
        }
        this.mHasSetTop = false;
        this.mHasSetBottom = false;
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e217ec2b9b686f7a8853f9afcf38fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e217ec2b9b686f7a8853f9afcf38fd");
            return;
        }
        this.floatCoverLayout = (RelativeLayout) getRootView().findViewById(R.id.floatcover_layout);
        this.mBottomView = (ViewGroup) getRootView().findViewById(R.id.bottom_view);
        this.mBottomCellContainer = new LinearLayout(getContext());
        this.mBottomCellContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.mBottomView.setVisibility(8);
        this.mBottomView.addView(this.mBottomCellContainer);
        this.mHasSetBottom = false;
        this.mHasSetTop = false;
    }

    public View getBottomViewContainer() {
        return this.mBottomCellContainer;
    }

    @Override // com.dianping.agentsdk.pagecontainer.f
    public boolean setBottomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5203576ad8022c3bfd9ac5db249e50e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5203576ad8022c3bfd9ac5db249e50e")).booleanValue();
        }
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.mBottomCellContainer.removeAllViews();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            this.mBottomCellContainer.addView(view, layoutParams);
            this.mBottomView.setVisibility(0);
            this.mHasSetBottom = true;
            return true;
        }
        this.mBottomCellContainer.removeAllViews();
        this.mBottomView.setVisibility(8);
        return false;
    }

    @Override // com.dianping.shield.feature.FloatCoverViewControlInterface
    public void addViewFloatCoverView(View view, RelativeLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd494a3edd5f175c1871d12515159d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd494a3edd5f175c1871d12515159d2");
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.floatCoverLayout.addView(view, layoutParams);
        }
    }

    @Override // com.dianping.shield.feature.FloatCoverViewControlInterface
    public void removeFloatCoverView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784ebbb905e1d7faa6f1f343818130f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784ebbb905e1d7faa6f1f343818130f3");
        } else if (view != null) {
            this.floatCoverLayout.removeView(view);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8856e8ff69156bfd8d0ca0c94950f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8856e8ff69156bfd8d0ca0c94950f9");
            return;
        }
        if (this.mBottomView != null) {
            this.mBottomView.removeView(this.mBottomCellContainer);
        }
        if (this.floatCoverLayout != null) {
            this.floatCoverLayout.removeAllViews();
            this.floatCoverLayout = null;
        }
        this.mBottomView = null;
        this.mBottomCellContainer = null;
        this.mHasSetTop = false;
        this.mHasSetBottom = false;
        super.shieldRecycle();
    }
}
