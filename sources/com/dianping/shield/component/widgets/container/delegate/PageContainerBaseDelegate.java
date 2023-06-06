package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class PageContainerBaseDelegate<T extends ViewGroup> implements ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private T agentContainerView;
    private Context context;
    private View rootView;

    public abstract void onCreate();

    public abstract void onDestroy();

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public T getAgentContainerView() {
        return this.agentContainerView;
    }

    public PageContainerBaseDelegate(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b2f7bf5b1db709c20e293ca488586f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b2f7bf5b1db709c20e293ca488586f7");
        } else {
            this.context = context;
        }
    }

    public void setAgentContainerView(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91f7139da093f6b294263df469f96ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91f7139da093f6b294263df469f96ac2");
            return;
        }
        this.agentContainerView = t;
        onCreate();
    }

    public Context getContext() {
        return this.context;
    }

    public View getRootView() {
        return this.rootView;
    }

    public void setRootView(View view) {
        this.rootView = view;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        this.agentContainerView = null;
        this.rootView = null;
    }
}
