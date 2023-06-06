package com.meituan.android.common.aidata.ai.base;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.IAiFeatureListener;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureListenerUtil<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void callSuccess(IAiFeatureListener iAiFeatureListener, FeatureResult featureResult) {
        Object[] objArr = {iAiFeatureListener, featureResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c764009f60177d330aad4d65a849af00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c764009f60177d330aad4d65a849af00");
        } else if (iAiFeatureListener != null) {
            iAiFeatureListener.onSuccess(featureResult);
        }
    }

    public static void callFailed(IAiFeatureListener iAiFeatureListener) {
        Object[] objArr = {iAiFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afc3e49bae3ebae2c84dcd6e3d5806b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afc3e49bae3ebae2c84dcd6e3d5806b2");
        } else {
            callFailed(iAiFeatureListener, null);
        }
    }

    public static void callFailed(IAiFeatureListener iAiFeatureListener, @Nullable BlueException blueException) {
        Object[] objArr = {iAiFeatureListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2adbed72ebeee02136cee481dc672da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2adbed72ebeee02136cee481dc672da");
        } else if (iAiFeatureListener != null) {
            iAiFeatureListener.onFailed(blueException);
        }
    }
}
