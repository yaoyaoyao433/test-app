package com.sankuai.waimai.alita.core.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ModelConfig {
    private static final String KEY_MODEL_FILE_TYPE = "modelFileType";
    private static final String KEY_MODEL_TYPE = "modelType";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String modelFileType;
    private String modelType;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface AlitaModelFileType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface AlitaModelType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ModelFileType {
        public static final String TYPE_ALITA_JS = "alita-js";
        public static final String TYPE_MNN = "mnn";
        public static final String TYPE_MTNN = "mtnn";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ModelType {
        public static final String TYPE_NN = "nn";
        public static final String TYPE_UNKNOWN = "unknown";
        public static final String TYPE_XGB = "xgb";
    }

    public ModelConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbd549c85bc1504adf61757b620915fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbd549c85bc1504adf61757b620915fa");
        } else {
            this.modelType = "unknown";
        }
    }

    public static ModelConfig fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f89c6d1a2a549cc8c74fd447ee771d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModelConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f89c6d1a2a549cc8c74fd447ee771d1");
        }
        if (jSONObject != null) {
            ModelConfig modelConfig = new ModelConfig();
            modelConfig.modelType = jSONObject.optString(KEY_MODEL_TYPE, "unknown");
            modelConfig.modelFileType = jSONObject.optString(KEY_MODEL_FILE_TYPE, "");
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
