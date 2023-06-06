package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTGeolocationPermissions {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Callback {
        void invoke(String str, boolean z, boolean z2);
    }

    public void allow(String str) {
    }

    public void clear(String str) {
    }

    public void clearAll() {
    }

    public void getAllowed(String str, MTValueCallback<Boolean> mTValueCallback) {
    }

    public void getOrigins(MTValueCallback<Set<String>> mTValueCallback) {
    }

    public static MTGeolocationPermissions getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a137ec86036f8ccb7e56110802f50b9f", RobustBitConfig.DEFAULT_VALUE) ? (MTGeolocationPermissions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a137ec86036f8ccb7e56110802f50b9f") : MTWebViewFactory.getProvider().getGeolocationPermissions();
    }
}
