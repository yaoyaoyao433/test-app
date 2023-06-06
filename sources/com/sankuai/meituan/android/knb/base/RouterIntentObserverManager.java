package com.sankuai.meituan.android.knb.base;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RouterIntentObserverManager {
    private static final int PER_APPID_MAX_COUNT = 4;
    private static final String TAG = "RouterIntentObserverManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final RouterIntentObserverManager instance = new RouterIntentObserverManager();
    private static Class sDefaultClass;
    private ArrayList<ObserverBean> mListeners;

    public RouterIntentObserverManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e399dadc5ae2389578ef270163cfb25c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e399dadc5ae2389578ef270163cfb25c");
        } else {
            this.mListeners = new ArrayList<>();
        }
    }

    public static RouterIntentObserverManager self() {
        return instance;
    }

    public boolean addObserver(@Nullable String str, @Nullable IRouterObserver iRouterObserver, @Nullable Class cls) {
        Object[] objArr = {str, iRouterObserver, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e170c6e70787f7ad3c346fe99624f23d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e170c6e70787f7ad3c346fe99624f23d")).booleanValue();
        }
        if (BaseKNBWebViewActivity.class.isAssignableFrom(cls) && !checkFullByAppid(str)) {
            this.mListeners.add(new ObserverBean(str, iRouterObserver, cls));
            return true;
        }
        return false;
    }

    private boolean checkFullByAppid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0cb0c9bf25268448e376d99f6f07c18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0cb0c9bf25268448e376d99f6f07c18")).booleanValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mListeners.size(); i2++) {
            if (TextUtils.equals(str, this.mListeners.get(i2).appid)) {
                i++;
            }
        }
        return i >= 4;
    }

    public void setDefaultClass(Class cls) {
        if (cls != null) {
            sDefaultClass = cls;
        }
    }

    public void removeObserver(IRouterObserver iRouterObserver) {
        Object[] objArr = {iRouterObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a034e1bdb7ae4535df9fbc981fc748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a034e1bdb7ae4535df9fbc981fc748");
            return;
        }
        for (int i = 0; i < this.mListeners.size(); i++) {
            if (iRouterObserver == this.mListeners.get(i).observer) {
                this.mListeners.remove(i);
                return;
            }
        }
    }

    public Class publish(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd372b7a5368d7a35a71808d3e52f3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd372b7a5368d7a35a71808d3e52f3d");
        }
        for (int i = 0; i < this.mListeners.size(); i++) {
            ObserverBean observerBean = this.mListeners.get(i);
            if (observerBean != null && observerBean.observer.check(new Intent(intent))) {
                return observerBean.containerCls;
            }
        }
        return sDefaultClass;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class ObserverBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appid;
        public Class containerCls;
        public IRouterObserver observer;

        public ObserverBean(String str, IRouterObserver iRouterObserver, Class cls) {
            this.observer = iRouterObserver;
            this.containerCls = cls;
        }
    }
}
