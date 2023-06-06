package com.meituan.android.common.aidata.ai.mlmodel.predictor.mtnn;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorParser;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.base.AbsPredictor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.itc.android.mtnn.b;
import com.meituan.itc.android.mtnn.c;
import com.meituan.itc.android.mtnn.d;
import com.meituan.itc.android.mtnn.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiDataMTNNPredictor extends AbsPredictor {
    public static final String TAG = "AiDataMTNNPredictor";
    public static ChangeQuickRedirect changeQuickRedirect;
    private d mInterpreter;
    private final String mModelFilePath;

    public AiDataMTNNPredictor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc87c0fbb62f99cd89f2b941600fd5db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc87c0fbb62f99cd89f2b941600fd5db");
            return;
        }
        this.mModelFilePath = str;
        createPredictor(str);
    }

    private void createPredictor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c54cdb36643a85438d58794fc4dd3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c54cdb36643a85438d58794fc4dd3bd");
            return;
        }
        d.a(NVLinker.getAppID(), AIData.getContext());
        d.a aVar = new d.a();
        aVar.a = c.FORWARD_CPU.g;
        aVar.b = 2;
        aVar.c = null;
        try {
            this.mInterpreter = d.a(str, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logInterpreter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abbcd7fcc028cbeb59aea897d44f10e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abbcd7fcc028cbeb59aea897d44f10e2");
            return;
        }
        try {
            Log.e("AiData", "Interpreter: " + this.mInterpreter + ", [Tensor]convert_scores: " + this.mInterpreter.b("convert_scores") + ", [Tensor]Squeeze: " + this.mInterpreter.b("Squeeze") + ", [Tensor]anchors: " + this.mInterpreter.b("anchors") + ", [Tensor]pv: " + this.mInterpreter.a("pv"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.AbsPredictor
    public void doPredict(@NonNull MLContext mLContext, @NonNull List<AiTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, list, list2, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4a100204571eb8acbd551679c9d1aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4a100204571eb8acbd551679c9d1aa5");
            return;
        }
        StringBuilder sb = new StringBuilder("Aidata ");
        sb.append(TAG);
        sb.append(" doPredict begin");
        if (this.mInterpreter == null) {
            createPredictor(this.mModelFilePath);
        }
        if (this.mInterpreter != null) {
            List<AiTensor> createOutputHolder = createOutputHolder(list2);
            if (!checkDataValid(list, createOutputHolder)) {
                callFailed(iPredictionListener, new BlueException("Ai Tensor not valid", BaseRaptorUploader.ERROR_INVALID_FEATURE_CONFIG));
                return;
            }
            try {
                reshapeModel(list);
                writeInputTensor(list);
                Object b = this.mInterpreter.b();
                readOutputTensor(createOutputHolder);
                JSONObject convertCallbackResult = convertCallbackResult(createOutputHolder);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errCode", b);
                jSONObject.put("result", convertCallbackResult);
                if (list != null && list.size() > 0) {
                    int[] shape = list.get(0).getShape();
                    if (shape != null && shape.length > 0) {
                        mLContext.featureSize = shape[0];
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AiTensor aiTensor : list) {
                        jSONArray.put(aiTensor.toJsonObject());
                    }
                    jSONObject.put("inputAiTensor", jSONArray);
                }
                jSONObject.put(RaptorUploaderImpl.FEATURE_SIZE, mLContext.featureSize);
                this.mInterpreter.a();
                this.mInterpreter = null;
                mLContext.isPredictSuccess = b == b.NO_ERROR;
                if (mLContext.isPredictSuccess) {
                    if (mLContext.isPostProcess()) {
                        addResultExtra(jSONObject, convertCallbackResult);
                    }
                    callSuccess(iPredictionListener, jSONObject);
                    return;
                }
                callFailed(iPredictionListener, new BlueException(jSONObject.toString()));
                return;
            } catch (Exception e) {
                callFailed(iPredictionListener, new BlueException(e.getMessage(), BaseRaptorUploader.ERROR_INVALID_TENSOR_OUTPUT));
                return;
            }
        }
        callFailed(iPredictionListener, new BlueException("MTNN Predictor Create Failed", BaseRaptorUploader.ERROR_FAILED_CREATE_PREDICTOR));
    }

    private void addResultExtra(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ce0ecbd37fe069d3fb58a2dd55ebf1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ce0ecbd37fe069d3fb58a2dd55ebf1e");
        } else if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
        } else {
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private List<AiTensor> createOutputHolder(List<TensorConfig.TensorConfigItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f1458145f52f4f3a4cf5cbea56fb55d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f1458145f52f4f3a4cf5cbea56fb55d");
        }
        try {
            return AiTensorParser.createOutputTensorList(list);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean checkDataValid(List<AiTensor> list, List<AiTensor> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b09ce406d2c87583e0058b379ad606b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b09ce406d2c87583e0058b379ad606b")).booleanValue() : AiTensorUtils.checkInputValid(list) && AiTensorUtils.checkOutputValid(list2);
    }

    private void writeInputTensor(List<AiTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25469e21a0991e146d5fe70d2162e9e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25469e21a0991e146d5fe70d2162e9e5");
            return;
        }
        for (AiTensor aiTensor : list) {
            if (aiTensor != null) {
                f a = this.mInterpreter.a(aiTensor.getName());
                if (a == null) {
                    throw new Exception("inputTensor is null, name=" + aiTensor.getName());
                } else if (aiTensor.getDataType() == null) {
                    throw new Exception("inputTensor value type not support, name=" + aiTensor.getName());
                } else {
                    switch (aiTensor.getDataType()) {
                        case INT32:
                            a.b(aiTensor.getIntData());
                            continue;
                        case FLOAT32:
                            a.a(aiTensor.getFloatData());
                            continue;
                    }
                }
            }
        }
    }

    private void readOutputTensor(List<AiTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f5a90cccc52d282b27b814b839c7d78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f5a90cccc52d282b27b814b839c7d78");
            return;
        }
        for (AiTensor aiTensor : list) {
            f b = this.mInterpreter.b(aiTensor.getName());
            if (b == null) {
                throw new Exception("outputTensor is null, name=" + aiTensor.getName());
            } else if (aiTensor.getDataType() == null) {
                throw new Exception("outputTensor value type not support, name=" + aiTensor.getName());
            } else {
                switch (aiTensor.getDataType()) {
                    case INT32:
                        aiTensor.setIntData(b.c());
                        break;
                    case FLOAT32:
                        aiTensor.setFloatData(b.b());
                        break;
                }
            }
        }
    }

    private JSONObject convertCallbackResult(List<AiTensor> list) throws JSONException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e10de76c58ecfc0a04b07ac3087c95", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e10de76c58ecfc0a04b07ac3087c95");
        }
        JSONObject jSONObject = null;
        if (!list.isEmpty()) {
            jSONObject = new JSONObject();
            for (AiTensor aiTensor : list) {
                switch (aiTensor.getDataType()) {
                    case INT32:
                        JSONArray jSONArray = new JSONArray();
                        int[] intData = aiTensor.getIntData();
                        if (intData != null) {
                            for (int i : intData) {
                                jSONArray.put(i);
                            }
                        }
                        jSONObject.put(aiTensor.getName(), jSONArray);
                        break;
                    case FLOAT32:
                        JSONArray jSONArray2 = new JSONArray();
                        float[] floatData = aiTensor.getFloatData();
                        if (floatData != null) {
                            for (float f : floatData) {
                                jSONArray2.put(f);
                            }
                        }
                        jSONObject.put(aiTensor.getName(), jSONArray2);
                        break;
                }
            }
        }
        return jSONObject;
    }

    public void reshapeModel(List<AiTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d1a9bf4cf46c60bcc39b32b550b1831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d1a9bf4cf46c60bcc39b32b550b1831");
            return;
        }
        for (AiTensor aiTensor : list) {
            if (aiTensor != null) {
                f a = this.mInterpreter.a(aiTensor.getName());
                if (a == null) {
                    throw new Exception("inputTensor is null, name=" + aiTensor.getName());
                }
                PrintStream printStream = System.out;
                printStream.println("MTNNPredictor writeInputTensor " + aiTensor.getName() + ", origin shape=" + Arrays.toString(a.a()));
                if (aiTensor.getShape() != null) {
                    a.a(aiTensor.getShape());
                }
                PrintStream printStream2 = System.out;
                printStream2.println("MTNNPredictor writeInputTensor " + aiTensor.getName() + ", reshape shape=" + Arrays.toString(a.a()));
            }
        }
        this.mInterpreter.c();
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd4e6febaf7f0128bff58b4e0289cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd4e6febaf7f0128bff58b4e0289cfd");
        } else if (this.mInterpreter != null) {
            this.mInterpreter.a();
            this.mInterpreter = null;
        }
    }
}
