package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import com.meituan.android.common.aidata.ai.mlmodel.predictor.mtnn.ImagePredictorProducerMTNN;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PredictorInitializer {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void initPredictor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "336a15df59df5b305939a5191cdf63f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "336a15df59df5b305939a5191cdf63f8");
            return;
        }
        ModelPredictorManager.getInstance().registerModelPredictorProducer(new ModelPredictorProducerXGB());
        ModelPredictorManager.getInstance().registerModelPredictorProducer(new ImagePredictorProducerMTNN());
    }
}
