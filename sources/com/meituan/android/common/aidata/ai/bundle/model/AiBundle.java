package com.meituan.android.common.aidata.ai.bundle.model;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.BundleUtil;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.AutoPredictManager;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.FeatureConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.ModelConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.OperatorMergeConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessConfig;
import com.meituan.android.common.aidata.cep.js.CepCallJsConfig;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.android.common.aidata.jsengine.instance.JSInstance;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiBundle {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private String bundleVersion;
    private boolean isChecked;
    private JSConfig jsConfig;
    private volatile String jsContent;
    private String jsContentPath;
    public int loadFrom;
    private Collection<OperatorMergeConfig> localMergeOptionConfig;
    private String mBiz;
    private CachedBundle mCachedBundle;
    private JSInstance mDebugJSInstance;
    private FeatureConfig mFeatureConfig;
    private JSInstance mJSInstance;
    private JSInstance mPostProcessDebugJSInstance;
    private JSInstance mPostProcessJSInstance;
    private TensorConfig mTensorConfig;
    private ModelConfig modelConfig;
    private final byte[] parseJsByPathLock;
    private final byte[] parsePostJsByPathLock;
    private volatile String postProcessFileJsContent;
    private String postProcessFilePath;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface JsType {
        public static final int TYPE_CEP_CALL_JS = 3;
        public static final int TYPE_FEATURE_OPERATOR = 1;
        public static final int TYPE_FEATURE_PRODUCE = 2;
        public static final int TYPE_UNKNOWN = 0;
    }

    public AiBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "602b512fc285cf53f4880e8e0047ba67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "602b512fc285cf53f4880e8e0047ba67");
            return;
        }
        this.parseJsByPathLock = new byte[0];
        this.parsePostJsByPathLock = new byte[0];
        this.isChecked = false;
    }

    public AiBundle(CachedBundle cachedBundle) {
        Object[] objArr = {cachedBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b4debe9fab8713afed69bae6c3149b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b4debe9fab8713afed69bae6c3149b");
            return;
        }
        this.parseJsByPathLock = new byte[0];
        this.parsePostJsByPathLock = new byte[0];
        this.isChecked = false;
        if (cachedBundle != null) {
            this.mCachedBundle = cachedBundle;
            if (this.mCachedBundle.getModelConfigFilePath() != null) {
                parseMLModelData();
            } else {
                parseJSData();
            }
            this.mJSInstance = new JSInstance();
            this.mDebugJSInstance = new JSInstance();
        }
    }

    private void parseJSData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a346bafe41d948a7e187d469ffd14f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a346bafe41d948a7e187d469ffd14f");
            return;
        }
        try {
            this.jsConfig = JSConfig.fromJson(new JSONObject(BundleUtil.readFileAsString(this.mCachedBundle.getJsConfigFilePath())));
            this.bundleName = this.jsConfig.bundleScene;
            this.bundleVersion = this.jsConfig.bundleVersion;
        } catch (Exception unused) {
        }
        this.jsContentPath = this.mCachedBundle.getJsFilePath();
        if (this.jsConfig == null || this.jsConfig.bundleType != 3) {
            return;
        }
        CepCallJsManager.getInstance().registerJS(this, this.jsConfig);
    }

    public void parseMLModelData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcb7879ad57bad41c2b8da0c09ae505e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcb7879ad57bad41c2b8da0c09ae505e");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(BundleUtil.readFileAsString(this.mCachedBundle.getModelConfigFilePath()));
            this.modelConfig = new ModelConfig();
            this.modelConfig.setModelFileType(jSONObject.optString("modelFileType"));
            this.modelConfig.setModelType(jSONObject.optString("modelType"));
            this.bundleName = jSONObject.optString("modelName");
            this.modelConfig.setModelName(this.bundleName);
            this.bundleVersion = jSONObject.optString("modelVersion");
            this.modelConfig.setModelVersion(this.bundleVersion);
            this.mFeatureConfig = FeatureConfig.fromJson(jSONObject);
            this.mTensorConfig = TensorConfig.fromJson(jSONObject);
            if ("aidata-js".equals(this.modelConfig.getModelFileType())) {
                this.jsContentPath = this.mCachedBundle.getModelFilePath();
            } else {
                this.jsContentPath = this.mCachedBundle.getAutoPredictFilePath();
            }
            this.postProcessFilePath = this.mCachedBundle.getModelPostProcessFilePath();
            if (!TextUtils.isEmpty(this.postProcessFilePath)) {
                this.mPostProcessJSInstance = new JSInstance();
                this.mPostProcessDebugJSInstance = new JSInstance();
            }
            AutoPredictManager.getInstance().registerAutoPredict(this, this.bundleName, jSONObject.optJSONArray(CepCallJsManager.JS_PARAM_KEY_CEP), jSONObject.optString("autoPredictModuleName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getJsContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7053edcce87a1f72172bd7e43b0b3b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7053edcce87a1f72172bd7e43b0b3b7");
        }
        if (!TextUtils.isEmpty(this.jsContent)) {
            return this.jsContent;
        }
        synchronized (this.parseJsByPathLock) {
            if (TextUtils.isEmpty(this.jsContent)) {
                this.jsContent = BundleUtil.readFileAsString(this.jsContentPath);
            }
        }
        return this.jsContent;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public String getBundleVersion() {
        return this.bundleVersion;
    }

    @Nullable
    public FeatureConfig getFeatureConfig() {
        return this.mFeatureConfig;
    }

    public TensorConfig getTensorConfig() {
        return this.mTensorConfig;
    }

    public String getPostProcessFileJsContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e330a5949b6b7748de1f460dc97df9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e330a5949b6b7748de1f460dc97df9f");
        }
        if (!TextUtils.isEmpty(this.postProcessFileJsContent)) {
            return this.postProcessFileJsContent;
        }
        synchronized (this.parsePostJsByPathLock) {
            if (TextUtils.isEmpty(this.postProcessFileJsContent)) {
                this.postProcessFileJsContent = BundleUtil.readFileAsString(this.postProcessFilePath);
            }
        }
        return this.postProcessFileJsContent;
    }

    public boolean isMLBundleValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e0d47b74c831f44948122a711b42f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e0d47b74c831f44948122a711b42f8")).booleanValue();
        }
        if (this.mCachedBundle == null || this.modelConfig == null) {
            return false;
        }
        if (ModelConfig.ModelFileType.TYPE_TF_LITE.equals(this.modelConfig.getModelFileType()) || "mtnn".equals(this.modelConfig.getModelFileType())) {
            if (this.mTensorConfig == null || this.mTensorConfig.input == null || this.mTensorConfig.input.isEmpty() || this.mFeatureConfig == null || this.mFeatureConfig.featureList == null || this.mFeatureConfig.featureList.isEmpty()) {
                return false;
            }
        } else if (this.mFeatureConfig == null || this.mFeatureConfig.featureList.isEmpty()) {
            return false;
        }
        return true;
    }

    public CachedBundle getCachedBundle() {
        return this.mCachedBundle;
    }

    public String getBundleFilePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea9f922e73b70a309766497b8b2d5d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea9f922e73b70a309766497b8b2d5d6") : this.mCachedBundle != null ? this.mCachedBundle.getBundleFilePath() : "";
    }

    public JSConfig getJsConfig() {
        return this.jsConfig;
    }

    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public boolean checkValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b55a785e6ee2e50ad10a87fbf878fe8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b55a785e6ee2e50ad10a87fbf878fe8")).booleanValue();
        }
        if (!this.isChecked) {
            if (!isMLBundleValid() || this.mCachedBundle == null || !this.mCachedBundle.isModelValid()) {
                return false;
            }
            this.isChecked = true;
        }
        return true;
    }

    public Collection<OperatorMergeConfig> getLocalMergeOptionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d92faaf11ee63745460544129a69d77f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d92faaf11ee63745460544129a69d77f");
        }
        if (this.localMergeOptionConfig != null && this.localMergeOptionConfig.size() > 0) {
            return this.localMergeOptionConfig;
        }
        if (this.mFeatureConfig != null) {
            synchronized (this) {
                this.localMergeOptionConfig = this.mFeatureConfig.createLocalMergeOperatorConfig();
            }
        }
        return this.localMergeOptionConfig;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class JSConfig {
        private static final String KEY_BUNDLE_SCENE = "bundleName";
        private static final String KEY_BUNDLE_TYPE = "bundleType";
        private static final String KEY_BUNDLE_VERSION = "version";
        public static ChangeQuickRedirect changeQuickRedirect;
        private String bundleScene;
        private int bundleType;
        private String bundleVersion;

        public JSConfig() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb8008cb5cbed98568bc709edcdfcb3c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb8008cb5cbed98568bc709edcdfcb3c");
            } else {
                this.bundleType = 0;
            }
        }

        public static JSConfig fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            JSConfig jSConfig = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3de7db4c884b3ec4e0476a54296d438", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3de7db4c884b3ec4e0476a54296d438");
            }
            if (jSONObject != null) {
                int optInt = jSONObject.optInt(KEY_BUNDLE_TYPE, 0);
                String optString = jSONObject.optString("bundleName");
                String str = "";
                switch (optInt) {
                    case 1:
                        BundleInfo jSBundleInfo = ResourceConfigManager.getInstance().getJSBundleInfo(optString);
                        if (jSBundleInfo != null) {
                            str = jSBundleInfo.getBundleVersion();
                            break;
                        }
                        break;
                    case 2:
                        jSConfig = new JSFeatureConfig().init(jSONObject);
                        break;
                    case 3:
                        jSConfig = new CepCallJsConfig().init(jSONObject);
                        break;
                    default:
                        jSConfig = new JSConfig();
                        break;
                }
                if (jSConfig == null) {
                    jSConfig = new JSConfig();
                }
                jSConfig.bundleType = optInt;
                jSConfig.bundleScene = optString;
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.optString("version");
                }
                jSConfig.bundleVersion = str;
                new StringBuilder("parse jsConfig info : ").append(jSConfig);
            }
            return jSConfig;
        }

        public int getBundleType() {
            return this.bundleType;
        }

        public String getBundleScene() {
            return this.bundleScene;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "711ea0297d1c5349d9caf834e511b304", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "711ea0297d1c5349d9caf834e511b304");
            }
            return "JSConfig{bundleType=" + this.bundleType + ", bundleScene='" + this.bundleScene + "', bundleVersion='" + this.bundleVersion + "'}";
        }
    }

    public JSInstance getJSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71b0f9cbcc7f149080ab394fa7310fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71b0f9cbcc7f149080ab394fa7310fc");
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
            return this.mDebugJSInstance;
        }
        return this.mJSInstance;
    }

    public JSInstance getPostProcessJSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8a002565ff213a70599ba2c4d6919cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8a002565ff213a70599ba2c4d6919cd");
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
            return this.mPostProcessDebugJSInstance;
        }
        return this.mPostProcessJSInstance;
    }

    public void setBiz(String str) {
        List<MLFeatureProcessConfig> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56bc507b21527a85a7e83c73090956f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56bc507b21527a85a7e83c73090956f");
            return;
        }
        this.mBiz = str;
        if (this.mFeatureConfig == null || (list = this.mFeatureConfig.featureList) == null) {
            return;
        }
        for (MLFeatureProcessConfig mLFeatureProcessConfig : list) {
            mLFeatureProcessConfig.setBizName(str);
            List<OperatorConfig> operatorRuleList = mLFeatureProcessConfig.getOperatorRuleList();
            if (operatorRuleList != null) {
                for (OperatorConfig operatorConfig : operatorRuleList) {
                    operatorConfig.bizName = str;
                }
            }
        }
    }

    public String getPostProcessFilePath() {
        return this.postProcessFilePath;
    }

    public void resetDebugInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6e855fde9b89468f3ccc46eb119030f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6e855fde9b89468f3ccc46eb119030f");
            return;
        }
        this.mDebugJSInstance = new JSInstance();
        this.mPostProcessDebugJSInstance = new JSInstance();
    }

    public String getBiz() {
        return this.mBiz;
    }

    public boolean isJsBundleValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77332cb18e7735acd71e4cab5880027a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77332cb18e7735acd71e4cab5880027a")).booleanValue() : (TextUtils.isEmpty(this.jsContentPath) || this.jsConfig == null) ? false : true;
    }

    public boolean isAutoJSBundleInValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe7f90ef1e9bdc8763574bfa7496f81b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe7f90ef1e9bdc8763574bfa7496f81b")).booleanValue() : this.jsConfig == null || TextUtils.isEmpty(this.jsConfig.bundleScene) || this.jsConfig.bundleType != 3 || TextUtils.isEmpty(this.jsContentPath);
    }
}
