package com.dianping.shield.component.widgets.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.dianping.agentsdk.framework.ab;
import com.dianping.voyager.widgets.container.LoadErrorEmptyView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class CommonBasePageContainer implements ab {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RelativeLayout contentParent;
    private ViewGroup contentView;
    private LoadErrorEmptyView loadDataErrorView;
    private Context mContext;
    private LoadErrorEmptyView.a mLoadErrorEmptyModel;
    private LoadErrorEmptyView.b mLoadRetryListener;
    private FrameLayout pageNodeView;
    protected View rootView;

    @Override // com.dianping.agentsdk.framework.ab
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8def7cf9484b32eebea130950edc75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8def7cf9484b32eebea130950edc75c");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf5945abd1fc03fa596aefc994b9a2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf5945abd1fc03fa596aefc994b9a2d0");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "962fa792aab9b6e996b8fdbef89c7eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "962fa792aab9b6e996b8fdbef89c7eb7");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a2f6623a35a64d46867d5da720afd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a2f6623a35a64d46867d5da720afd1");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d7b4b85849af4f25a8866d76a0bbda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d7b4b85849af4f25a8866d76a0bbda0");
        }
    }

    public CommonBasePageContainer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "131a8f385466a7dfabeb1b018ce9a7af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "131a8f385466a7dfabeb1b018ce9a7af");
        } else {
            this.mContext = context;
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1211de2c0eaec8a130d4cbb3123e4241", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1211de2c0eaec8a130d4cbb3123e4241");
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.mContext).inflate(R.layout.voyager_pagecontainer_base_layout, viewGroup, false);
        if (this.rootView != null) {
            if (this.pageNodeView != null) {
                this.pageNodeView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            }
        } else {
            this.rootView = frameLayout;
            this.loadDataErrorView = (LoadErrorEmptyView) this.rootView.findViewById(R.id.load_data_view);
            this.loadDataErrorView.setVisibility(8);
            this.loadDataErrorView.setModel(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.d, LoadErrorEmptyView.c.LOADING));
            this.loadDataErrorView.setRetryListener(new LoadErrorEmptyView.b() { // from class: com.dianping.shield.component.widgets.container.CommonBasePageContainer.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.voyager.widgets.container.LoadErrorEmptyView.b
                public void loadRetry(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c53570922f9847e26e79905d7e0b2df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c53570922f9847e26e79905d7e0b2df");
                    } else if (CommonBasePageContainer.this.mLoadRetryListener != null) {
                        CommonBasePageContainer.this.mLoadRetryListener.loadRetry(view);
                    }
                }
            });
            if (this.mLoadErrorEmptyModel != null) {
                this.loadDataErrorView.setModel(this.mLoadErrorEmptyModel);
                if (this.mLoadErrorEmptyModel.f == LoadErrorEmptyView.c.SUCCESS) {
                    this.loadDataErrorView.setVisibility(8);
                    this.contentParent.setVisibility(0);
                } else {
                    this.loadDataErrorView.setVisibility(0);
                    this.contentParent.setVisibility(8);
                }
            }
        }
        this.contentParent = (RelativeLayout) frameLayout.findViewById(R.id.content_layout);
        if (this.contentParent != null) {
            this.contentParent.addView(this.contentView, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.rootView;
    }

    public void setNodeModeView(View view, FrameLayout frameLayout) {
        this.rootView = view;
        this.pageNodeView = frameLayout;
    }

    public void setCoustomContentView(ViewGroup viewGroup) {
        this.contentView = viewGroup;
    }

    public void setLoadDataErrorView(LoadErrorEmptyView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d92dadb3ba496f9deb2613c601572715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d92dadb3ba496f9deb2613c601572715");
            return;
        }
        this.mLoadErrorEmptyModel = aVar;
        if (this.loadDataErrorView == null || this.contentParent == null) {
            return;
        }
        if (aVar == null) {
            if (this.loadDataErrorView.getVisibility() != 8) {
                this.contentParent.setVisibility(0);
                this.loadDataErrorView.setVisibility(8);
                this.loadDataErrorView.setModel(new LoadErrorEmptyView.a("", LoadErrorEmptyView.c.SUCCESS));
                return;
            }
            return;
        }
        if (aVar.f == LoadErrorEmptyView.c.SUCCESS) {
            this.contentParent.setVisibility(0);
            this.loadDataErrorView.setVisibility(8);
        } else {
            this.contentParent.setVisibility(8);
            this.loadDataErrorView.setVisibility(0);
        }
        this.loadDataErrorView.setModel(aVar);
    }

    public void setLoadRetryListener(LoadErrorEmptyView.b bVar) {
        this.mLoadRetryListener = bVar;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8942126ebdf86e50968b2861ab65740b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8942126ebdf86e50968b2861ab65740b");
        } else {
            setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.d, LoadErrorEmptyView.c.LOADING));
        }
    }

    public void setError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3e6c9db8b1f2ef8b2c697a1752ac6ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3e6c9db8b1f2ef8b2c697a1752ac6ea");
        } else {
            setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.b, LoadErrorEmptyView.c.ERROR));
        }
    }

    public void setEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a2a23339791e36e977d4112942a6be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a2a23339791e36e977d4112942a6be1");
        } else {
            setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.c, LoadErrorEmptyView.c.EMPTY));
        }
    }

    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "823fc2a99e9332e8dee6f499decf6b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "823fc2a99e9332e8dee6f499decf6b3d");
        } else {
            setLoadDataErrorView(new LoadErrorEmptyView.a("", LoadErrorEmptyView.c.SUCCESS));
        }
    }
}
