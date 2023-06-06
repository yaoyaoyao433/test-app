package com.meituan.android.common.aidata.feature.utils;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiFeatureListenerUtil<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void callSuccess(IFeatureListener iFeatureListener, FeatureResult featureResult) {
        Object[] objArr = {iFeatureListener, featureResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b65d7aec30d765d49fab97d9465118a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b65d7aec30d765d49fab97d9465118a4");
        } else if (iFeatureListener != null) {
            iFeatureListener.onSuccess(featureResult);
        }
    }

    public static void callFailed(IFeatureListener iFeatureListener) {
        Object[] objArr = {iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb9c78feb4101ad32f15928a704ba046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb9c78feb4101ad32f15928a704ba046");
        } else {
            callFailed(iFeatureListener, null);
        }
    }

    public static void callFailed(IFeatureListener iFeatureListener, @Nullable Exception exc) {
        Object[] objArr = {iFeatureListener, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cce53a5deb61651140806062ec2b6bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cce53a5deb61651140806062ec2b6bfe");
        } else if (iFeatureListener != null) {
            iFeatureListener.onFailed(exc);
        }
    }
}
