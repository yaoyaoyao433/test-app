package com.meituan.android.common.aidata.jsengine.modules.autopredict;

import com.meituan.android.common.aidata.jsengine.modules.AbstractNativeModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIDataModule extends AbstractNativeModule {
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_ERROR = "error";
    public static final String KEY_MSG = "msg";
    public static final String MODULE_METHOD_GET_FEATURES = "getFeatures";
    public static final String MODULE_METHOD_PREDICT = "predict";
    private static final String MODULE_NAME = "aidata_module";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeModule
    public String name() {
        return MODULE_NAME;
    }

    public AIDataModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45100fefae79e5eacaef1d61ba99244", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45100fefae79e5eacaef1d61ba99244");
            return;
        }
        addNativeMethod(MODULE_METHOD_PREDICT, new PredictMethod());
        addNativeMethod(MODULE_METHOD_GET_FEATURES, new GetFeatureMethod());
    }
}
