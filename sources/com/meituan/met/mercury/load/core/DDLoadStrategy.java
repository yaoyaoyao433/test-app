package com.meituan.met.mercury.load.core;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public enum DDLoadStrategy {
    LOCAL_FIRST,
    NET_FIRST,
    LOCAL_ONLY,
    NET_ONLY,
    SPECIFIED,
    REMOTE_BUNDLES,
    LOCAL_OR_NET,
    LOCAL_DOWNLOAD,
    PRELOAD_META,
    CACHEMETA_OR_NET;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static DDLoadStrategy valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40536d6f4f95f8fdd20365347322b667", RobustBitConfig.DEFAULT_VALUE) ? (DDLoadStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40536d6f4f95f8fdd20365347322b667") : (DDLoadStrategy) Enum.valueOf(DDLoadStrategy.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DDLoadStrategy[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "822fac841a5026e7c9bcb99452cfcee0", RobustBitConfig.DEFAULT_VALUE) ? (DDLoadStrategy[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "822fac841a5026e7c9bcb99452cfcee0") : (DDLoadStrategy[]) values().clone();
    }

    DDLoadStrategy() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b2babad2293cb0239d7b1fe6e609f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b2babad2293cb0239d7b1fe6e609f6");
        }
    }
}
