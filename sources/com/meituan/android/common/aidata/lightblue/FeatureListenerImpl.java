package com.meituan.android.common.aidata.lightblue;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureListenerImpl implements IFeatureListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IGetFeatureListener mGetFeatureListener;

    public void setGetFeatureListener(IGetFeatureListener iGetFeatureListener) {
        this.mGetFeatureListener = iGetFeatureListener;
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureListener
    public void onSuccess(@Nullable FeatureResult featureResult) {
        Object[] objArr = {featureResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b8b846febc6b0eaa583324c8c088d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b8b846febc6b0eaa583324c8c088d81");
        } else if (this.mGetFeatureListener == null || featureResult == null) {
        } else {
            this.mGetFeatureListener.onSuccess(featureResult.getJsonString());
        }
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureListener
    public void onFailed(@Nullable Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beee32b442848cb88da120edff376697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beee32b442848cb88da120edff376697");
        } else if (this.mGetFeatureListener != null) {
            this.mGetFeatureListener.onFailed(exc);
        }
    }
}
