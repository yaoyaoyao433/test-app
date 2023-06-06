package com.dianping.shield.component.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScPullToRefreshCustomizedHeaderView extends ScBaseRefreshHeaderView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinearLayout mRefreshViewContainer;
    private FrameLayout mRootView;

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bec4b5329943df480af3c4236ecdf489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bec4b5329943df480af3c4236ecdf489");
        }
    }

    public ScPullToRefreshCustomizedHeaderView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a0b75b40535f38335d9908358a114d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a0b75b40535f38335d9908358a114d6");
        }
    }

    public ScPullToRefreshCustomizedHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39968e83e365fbf0d5d0f37bbf9225cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39968e83e365fbf0d5d0f37bbf9225cb");
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void initView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb2dfe5844b99b20d9e0644968ed9764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb2dfe5844b99b20d9e0644968ed9764");
            return;
        }
        this.mRootView = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.shieldc_pull_to_refresh_header_refreshview, (ViewGroup) this, false);
        this.mRefreshViewContainer = (LinearLayout) this.mRootView.findViewById(R.id.refresh_view_container);
        this.mRefreshViewContainer.removeAllViews();
        addView(this.mRootView, new FrameLayout.LayoutParams(-1, 0));
    }

    public void setRefreshView(View view, @Nullable FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d29862a062dc620c2fb6c8d038459115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d29862a062dc620c2fb6c8d038459115");
            return;
        }
        if (layoutParams != null) {
            this.mRefreshViewContainer.setLayoutParams(layoutParams);
        }
        this.mRefreshViewContainer.removeAllViews();
        this.mRefreshViewContainer.addView(view);
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onPullY(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5369dce8a7fd63ba53a3a1236bdf9b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5369dce8a7fd63ba53a3a1236bdf9b67");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mRootView.getLayoutParams();
        layoutParams.height = i;
        this.mRootView.setLayoutParams(layoutParams);
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1116af2e28a58e1d6d875f5e5330fb1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1116af2e28a58e1d6d875f5e5330fb1a");
        } else if (isLoading()) {
        } else {
            this.isLoading = true;
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onRefreshComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71ec037db534443276d5e2857690627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71ec037db534443276d5e2857690627");
        } else {
            setSuccess();
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f387b8d6bccbcbbc94ebce7ea5d77ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f387b8d6bccbcbbc94ebce7ea5d77ff8");
        } else if (this.onRefreshCompleteListener != null) {
            this.onRefreshCompleteListener.onRefreshComplete();
        }
    }
}
