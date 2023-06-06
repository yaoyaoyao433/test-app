package com.dianping.shield.component.utils;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CustomPullToRefreshEngine {
    public static ChangeQuickRedirect changeQuickRedirect;
    private CommonPageContainer commonPageContainer;
    private CustomPullToRefreshBaseView customPullToRefreshBaseView;
    private CommonPageContainer.OnRefreshListener onRefreshListener;
    private int refreshHeight;

    public CustomPullToRefreshEngine(CommonPageContainer commonPageContainer, CustomPullToRefreshBaseView customPullToRefreshBaseView) {
        Object[] objArr = {commonPageContainer, customPullToRefreshBaseView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a70eeb1b5c8ec01e1d04aa0d146ae83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a70eeb1b5c8ec01e1d04aa0d146ae83");
            return;
        }
        this.commonPageContainer = commonPageContainer;
        this.customPullToRefreshBaseView = customPullToRefreshBaseView;
        this.commonPageContainer.setPageContainerType(CommonPageContainer.CommonPageContainerType.PULL_TO_X);
        this.commonPageContainer.setPullToRefreshMode(CommonPageContainer.PullToRefreshMode.PULL_DOWN);
        this.refreshHeight = aq.a(commonPageContainer.getContext(), 80.0f);
        commonPageContainer.setRefreshView(customPullToRefreshBaseView);
        commonPageContainer.addContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.utils.CustomPullToRefreshEngine.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
            public void offsetChanged(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "12893f62ed055a471d61e5ca6ac5f282", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "12893f62ed055a471d61e5ca6ac5f282");
                } else if (CustomPullToRefreshEngine.this.commonPageContainer.getPullToRefreshMode() != CommonPageContainer.PullToRefreshMode.PULL_DOWN) {
                } else {
                    int i3 = -i2;
                    if (CustomPullToRefreshEngine.this.commonPageContainer.isDraging()) {
                        if (i3 > CustomPullToRefreshEngine.this.refreshHeight) {
                            CustomPullToRefreshEngine.this.commonPageContainer.setContentInset(CustomPullToRefreshEngine.this.refreshHeight);
                            CustomPullToRefreshEngine.this.customPullToRefreshBaseView.setState(1);
                        } else {
                            CustomPullToRefreshEngine.this.commonPageContainer.setContentInset(0);
                            CustomPullToRefreshEngine.this.customPullToRefreshBaseView.setState(0);
                        }
                    } else if (i3 > CustomPullToRefreshEngine.this.refreshHeight) {
                        CustomPullToRefreshEngine.this.customPullToRefreshBaseView.setState(2);
                    } else if (i3 == CustomPullToRefreshEngine.this.refreshHeight) {
                        if (CustomPullToRefreshEngine.this.customPullToRefreshBaseView.getState() == 2 && CustomPullToRefreshEngine.this.onRefreshListener != null) {
                            CustomPullToRefreshEngine.this.onRefreshListener.onRefresh(CustomPullToRefreshEngine.this.commonPageContainer.getAgentContainerView());
                        }
                    } else if (i3 == 0) {
                        CustomPullToRefreshEngine.this.customPullToRefreshBaseView.setState(0);
                    }
                    if (i3 >= 0) {
                        CustomPullToRefreshEngine.this.customPullToRefreshBaseView.setY(i3);
                    }
                }
            }
        });
    }

    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c652e376fc13d8db955f8edcb7091f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c652e376fc13d8db955f8edcb7091f25");
            return;
        }
        if (this.customPullToRefreshBaseView != null && this.customPullToRefreshBaseView.getState() == 2) {
            this.customPullToRefreshBaseView.setState(3);
        }
        if (this.commonPageContainer != null) {
            this.commonPageContainer.setContentInset(0);
            this.commonPageContainer.updateHeaderView(true);
        }
    }

    public void setOnRefreshListener(CommonPageContainer.OnRefreshListener onRefreshListener) {
        this.onRefreshListener = onRefreshListener;
    }
}
