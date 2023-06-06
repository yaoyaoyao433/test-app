package com.meituan.android.mrn.component.pullrefresh;

import android.view.View;
import com.alipay.sdk.widget.d;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.f;
import com.handmark.pulltorefresh.library.c;
import com.handmark.pulltorefresh.library.internal.LoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PullRefreshManager extends ViewGroupManager<b> {
    private static final String REACT_CLASS = "RCTPullRefresh";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hasLoading;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public PullRefreshManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44685a4dac3c641471d60604e66c2572", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44685a4dac3c641471d60604e66c2572");
        } else {
            this.hasLoading = false;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(b bVar, View view, int i) {
        Object[] objArr = {bVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1870cda223e1baebeaf61ab60b0803c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1870cda223e1baebeaf61ab60b0803c3");
        } else if (view instanceof LoadingView) {
            bVar.a((LoadingView) view);
            this.hasLoading = true;
        } else {
            super.addView((PullRefreshManager) bVar, view, 0);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ea20eb67e663f509ce6956b75f08f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ea20eb67e663f509ce6956b75f08f69");
        } else if (!this.hasLoading) {
            bVar.getRefreshableView().removeViewAt(i);
        } else if (i > 0) {
            bVar.getRefreshableView().removeViewAt(i - 1);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284869599ca609a542999ed7fdc41de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284869599ca609a542999ed7fdc41de8");
        } else {
            bVar.getRefreshableView().removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f33a253373d604e0f8f5be8b3cb6ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f33a253373d604e0f8f5be8b3cb6ae");
        }
        if (this.hasLoading) {
            if (i == 0) {
                return bVar.getLoadingView();
            }
            int i2 = i - 1;
            if (i2 < 0 || i2 >= bVar.getRefreshableView().getChildCount()) {
                return null;
            }
            return bVar.getRefreshableView().getChildAt(i2);
        }
        return bVar.getRefreshableView().getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbfb773157e7809029cccf815075433", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbfb773157e7809029cccf815075433")).intValue();
        }
        if (!this.hasLoading) {
            return bVar.getRefreshableView().getChildCount();
        }
        return bVar.getRefreshableView().getChildCount() + 1;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6278eea03c287b8c751da4417d7ce1ee", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6278eea03c287b8c751da4417d7ce1ee") : new b(aoVar);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(b bVar, Boolean bool) {
        Object[] objArr = {bVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d1401a780294038fd4d744d9ab00656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d1401a780294038fd4d744d9ab00656");
        } else if (!bool.booleanValue()) {
            bVar.i();
        } else {
            bVar.setRefreshing(true);
        }
    }

    @ReactProp(defaultBoolean = true, name = "pullRefreshEnabled")
    public void setPullRefreshEnabled(b bVar, Boolean bool) {
        Object[] objArr = {bVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a29fd8624b7723d38d5a8d98fcf37f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a29fd8624b7723d38d5a8d98fcf37f2");
        } else {
            bVar.setMode(bool.booleanValue() ? c.a.PULL_DOWN_TO_REFRESH : c.a.DISABLED);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, b bVar) {
        Object[] objArr = {aoVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf96357ff2cdb1b3395930b2dbb9a51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf96357ff2cdb1b3395930b2dbb9a51");
            return;
        }
        super.addEventEmitters(aoVar, (ao) bVar);
        bVar.setOnRefreshListener(new c.InterfaceC0157c<f>() { // from class: com.meituan.android.mrn.component.pullrefresh.PullRefreshManager.1
            public static ChangeQuickRedirect a;

            @Override // com.handmark.pulltorefresh.library.c.InterfaceC0157c
            public final void a(c<f> cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49d94f4215f70d664b0b46fcea66c207", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49d94f4215f70d664b0b46fcea66c207");
                } else {
                    a.a(cVar);
                }
            }
        });
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828887e5f8835965753bdb8ccd0b10c7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828887e5f8835965753bdb8ccd0b10c7") : com.facebook.react.common.c.b().a(d.p, com.facebook.react.common.c.a("registrationName", d.p)).a();
    }
}
