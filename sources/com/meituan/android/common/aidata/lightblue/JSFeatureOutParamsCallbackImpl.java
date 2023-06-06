package com.meituan.android.common.aidata.lightblue;

import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSFeatureOutParamsCallbackImpl implements JSFeatureOutParamsCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IJSFeatureOutParams mJSFeatureOutParams;

    public void setJSFeatureOutParams(IJSFeatureOutParams iJSFeatureOutParams) {
        this.mJSFeatureOutParams = iJSFeatureOutParams;
    }

    @Override // com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback
    public JSONObject getOutParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "648f75bafc08e771b13cefc0c23da24b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "648f75bafc08e771b13cefc0c23da24b");
        }
        if (this.mJSFeatureOutParams != null) {
            return this.mJSFeatureOutParams.getOutParams(str);
        }
        return null;
    }
}
