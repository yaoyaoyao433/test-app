package com.meituan.msc.jse.bridge;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface LoadJSCodeCacheCallback {
    void onLoad(String str, String str2, LoadStatus loadStatus);

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public enum LoadStatus {
        loaded,
        nonexistent,
        invalid,
        unsupported;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static LoadStatus valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbc9829cfc044e0e2f20365b048d1fe6", RobustBitConfig.DEFAULT_VALUE) ? (LoadStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbc9829cfc044e0e2f20365b048d1fe6") : (LoadStatus) Enum.valueOf(LoadStatus.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LoadStatus[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef0558cb6df3d379131350ab291fbb5e", RobustBitConfig.DEFAULT_VALUE) ? (LoadStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef0558cb6df3d379131350ab291fbb5e") : (LoadStatus[]) values().clone();
        }

        LoadStatus() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10acd20864ecf00b67be33740be1acf0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10acd20864ecf00b67be33740be1acf0");
            }
        }
    }
}
