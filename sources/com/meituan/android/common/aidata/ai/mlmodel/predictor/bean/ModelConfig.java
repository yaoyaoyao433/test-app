package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ModelConfig {
    private static final String KEY_MODEL_FILE_TYPE = "modelFileType";
    public static final String KEY_MODEL_NAME = "modelName";
    private static final String KEY_MODEL_TYPE = "modelType";
    public static final String KEY_MODEL_VERSION = "modelVersion";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String modelFileType;
    private String modelName;
    private String modelType;
    private String modelVersion;
    private boolean post_processing;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AiModelFileType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AiModelType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ModelFileType {
        public static final String TYPE_AI_JS = "aidata-js";
        public static final String TYPE_MNN = "mnn";
        public static final String TYPE_MTNN = "mtnn";
        public static final String TYPE_TF_LITE = "tflite";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ModelType {
        public static final String TYPE_NN = "nn";
        public static final String TYPE_UNKNOWN = "unknown";
        public static final String TYPE_XGB = "xgb";
    }

    public ModelConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "089fea99b13db3a9e2a9fcf8b5141d60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "089fea99b13db3a9e2a9fcf8b5141d60");
        } else {
            this.modelType = "unknown";
        }
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String str) {
        this.modelName = str;
    }

    public String getModelVersion() {
        return this.modelVersion;
    }

    public void setModelVersion(String str) {
        this.modelVersion = str;
    }

    public static ModelConfig fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29bc6e2b4659d7e1dead7512b1f11e50", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModelConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29bc6e2b4659d7e1dead7512b1f11e50");
        }
        if (jSONObject != null) {
            ModelConfig modelConfig = new ModelConfig();
            modelConfig.modelType = jSONObject.optString(KEY_MODEL_TYPE, "unknown");
            modelConfig.modelFileType = jSONObject.optString(KEY_MODEL_FILE_TYPE, "");
            modelConfig.modelName = jSONObject.optString("modelName");
            modelConfig.modelVersion = jSONObject.optString("modelVersion");
            return modelConfig;
        }
        return null;
    }

    public String getModelType() {
        return this.modelType;
    }

    public void setModelType(String str) {
        this.modelType = str;
    }

    public String getModelFileType() {
        return this.modelFileType;
    }

    public void setModelFileType(String str) {
        this.modelFileType = str;
    }
}
