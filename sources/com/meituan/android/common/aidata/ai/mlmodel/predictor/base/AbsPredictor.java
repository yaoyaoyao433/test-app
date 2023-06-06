package com.meituan.android.common.aidata.ai.mlmodel.predictor.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorParser;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.TensorParseException;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsPredictor implements IPredictor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void doPredict(@NonNull MLContext mLContext, @NonNull List<AiTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable IPredictionListener iPredictionListener);

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor
    public void predict(@NonNull MLContext mLContext, @NonNull Map<String, JSONArray> map, @NonNull List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, String str, @Nullable IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, map, list, list2, str, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff2ee6fd6e2cc6a1927d281280c993f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff2ee6fd6e2cc6a1927d281280c993f");
            return;
        }
        try {
            doPredict(mLContext, AiTensorParser.createInputTensorList(map, list, str), list2, iPredictionListener);
        } catch (TensorParseException e) {
            callFailed(iPredictionListener, e);
        }
    }

    public void callSuccess(@Nullable IPredictionListener iPredictionListener, Object obj) {
        Object[] objArr = {iPredictionListener, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd24697e9e9da717582782bbab68e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd24697e9e9da717582782bbab68e7e");
        } else if (iPredictionListener != null) {
            iPredictionListener.onSuccess(obj);
        }
    }

    public void callFailed(@Nullable IPredictionListener iPredictionListener, BlueException blueException) {
        Object[] objArr = {iPredictionListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b62023eb40fcd80e4f82c95e081a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b62023eb40fcd80e4f82c95e081a40");
        } else if (iPredictionListener != null) {
            iPredictionListener.onFailed(blueException);
        }
    }
}
