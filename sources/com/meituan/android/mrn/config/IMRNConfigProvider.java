package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class IMRNConfigProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract String getBizName();

    public Map<String, String> getBusinessMetricsTag(String str) {
        return null;
    }

    public List<com.facebook.react.i> getBusinessReactPackage() {
        return null;
    }

    public List<com.facebook.react.i> getGlobalReactPackage() {
        return null;
    }

    public List<Interceptor> getInterceptors(String str) {
        return null;
    }

    public List<ae> getReactPackageKeyList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f2762ba612d9b89c17bdcf0850087d1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f2762ba612d9b89c17bdcf0850087d1") : getDefaultPackageKeyList();
    }

    public List<ae> getDefaultPackageKeyList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66dbc09d7298acea4b279bfb55850406", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66dbc09d7298acea4b279bfb55850406") : Collections.singletonList(new ae(getBizName(), null));
    }
}
