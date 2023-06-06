package com.meituan.android.common.metricx.helpers;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ContextProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mApplicationContext;
    private Context mContext;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class _Inner {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static ContextProvider wrapper = new ContextProvider();
    }

    public static ContextProvider getInstance() {
        return _Inner.wrapper;
    }

    public void updateContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fac6c69aa2aa4b8a5d06d2ef4c2e68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fac6c69aa2aa4b8a5d06d2ef4c2e68c");
        } else if (context == null || this.mApplicationContext != null) {
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (this.mApplicationContext == null) {
                    initAppBus(applicationContext);
                }
                this.mApplicationContext = applicationContext;
                this.mContext = applicationContext;
                return;
            }
            this.mContext = context;
        }
    }

    private void initAppBus(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "024c64256593af67c2f89207662e3b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "024c64256593af67c2f89207662e3b56");
        } else if (context instanceof Application) {
            AppBus.getInstance().init((Application) context);
            UserActionsProvider.getInstance().init(context);
        }
    }

    public Context getContext() {
        return this.mApplicationContext == null ? this.mContext : this.mApplicationContext;
    }

    public ContextProvider() {
    }
}
