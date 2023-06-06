package com.meituan.android.common.aidata.ai.mlmodel;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.FeatureConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.OperatorMergeConfig;
import com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessConfig;
import com.meituan.android.common.aidata.async.AsyncArrayList;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.jsengine.instance.InstanceContainer;
import com.meituan.android.common.aidata.jsengine.instance.JSInstance;
import com.meituan.android.common.aidata.jsengine.instance.JSInstanceManager;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.resources.bean.BundleWaitTime;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AiBundle aiBundle;
    public JSONObject autoPredictInfo;
    private String bundleVersion;
    private final List<BundleWaitTime> bundleWaitTimeList;
    private final List<Exception> errorList;
    public JSONObject feature;
    public int featureSize;
    public IFeatureListener iFeatureListener;
    public boolean isGetFeature;
    public boolean isPredictSuccess;
    public IPredictionJsonListener listener;
    private String modelFilePath;
    public String modelName;
    public String modelUniqueId;
    public Map<String, JSONArray> operatorFeature;
    public JSFeatureOutParamsCallback outParamsCallback;
    public long startPostProcessTime;
    public long startTime;
    public String tensorInputStandardFeature;

    public MLContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df012a045aed17593a92dc41136a82a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df012a045aed17593a92dc41136a82a1");
            return;
        }
        this.modelName = "";
        this.bundleWaitTimeList = new AsyncArrayList();
        this.modelFilePath = StringUtil.NULL;
        this.isGetFeature = false;
        this.isPredictSuccess = false;
        this.startPostProcessTime = 0L;
        this.featureSize = 0;
        this.errorList = new AsyncArrayList();
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "014fc3a7783e0e1cff97039d41a23f91", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "014fc3a7783e0e1cff97039d41a23f91")).booleanValue() : this.aiBundle != null && this.aiBundle.isMLBundleValid() && this.aiBundle.getCachedBundle().isModelValid();
    }

    public String getModelBundleVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "769793149fbf1b14e9f8b48d6ee4e50c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "769793149fbf1b14e9f8b48d6ee4e50c");
        }
        if (this.bundleVersion != null) {
            return this.bundleVersion;
        }
        if (this.aiBundle == null || this.aiBundle.getModelConfig() == null) {
            return "-999";
        }
        String modelVersion = this.aiBundle.getModelConfig().getModelVersion();
        this.bundleVersion = modelVersion;
        return modelVersion;
    }

    public String getBiz() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f90290d8033eabe559929557f8c5627d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f90290d8033eabe559929557f8c5627d") : this.aiBundle == null ? "" : this.aiBundle.getBiz();
    }

    public int getLoadType() {
        if (this.aiBundle == null) {
            return -999;
        }
        return this.aiBundle.loadFrom;
    }

    public String getModelFilePath() {
        return this.modelFilePath;
    }

    public List<MLFeatureProcessConfig> getFeatureList() {
        FeatureConfig featureConfig;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db42539cf382fdc313ae7b16cc36604d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db42539cf382fdc313ae7b16cc36604d");
        }
        if (this.aiBundle == null || (featureConfig = this.aiBundle.getFeatureConfig()) == null) {
            return null;
        }
        return featureConfig.featureList;
    }

    public void addBundleWaitTime(BundleWaitTime bundleWaitTime) {
        Object[] objArr = {bundleWaitTime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2990c14977406c06a9bd94afe4c18cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2990c14977406c06a9bd94afe4c18cb7");
        } else if (bundleWaitTime != null) {
            this.bundleWaitTimeList.add(bundleWaitTime);
        }
    }

    public int computeBundleWaitTime(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98955ce4ac9a88f00b42ddd5c5f2930f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98955ce4ac9a88f00b42ddd5c5f2930f")).intValue();
        }
        if (this.bundleWaitTimeList == null || this.bundleWaitTimeList.isEmpty()) {
            return 0;
        }
        HashMap hashMap = new HashMap();
        for (BundleWaitTime bundleWaitTime : this.bundleWaitTimeList) {
            if (bundleWaitTime != null) {
                BundleWaitTime bundleWaitTime2 = (BundleWaitTime) hashMap.get(bundleWaitTime.bundleName);
                if (bundleWaitTime2 != null && !bundleWaitTime2.isStart) {
                    bundleWaitTime2.isStart = true;
                    bundleWaitTime.isStart = false;
                }
                hashMap.put(bundleWaitTime.bundleName, bundleWaitTime);
            }
        }
        BundleWaitTime bundleWaitTime3 = null;
        HashMap hashMap2 = new HashMap();
        for (BundleWaitTime bundleWaitTime4 : this.bundleWaitTimeList) {
            if (bundleWaitTime4 != null) {
                if (bundleWaitTime3 != null && bundleWaitTime3.isStart) {
                    if (!bundleWaitTime4.isStart && TextUtils.equals(bundleWaitTime4.bundleName, bundleWaitTime3.bundleName)) {
                        long j2 = bundleWaitTime4.time - bundleWaitTime3.time;
                        int i2 = (int) (i + j2);
                        if (j > 500) {
                            hashMap2.put(bundleWaitTime4.bundleName, Long.valueOf(j2));
                        }
                        i = i2;
                    }
                }
                bundleWaitTime3 = bundleWaitTime4;
            }
        }
        if (j > 500) {
            CatMonitorManager.getInstance().recordModelPredictLongTime(hashMap2);
        }
        return i;
    }

    public void setAiBundle(AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f70ebb9ed7f0dc6a8ed0874fb42377d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f70ebb9ed7f0dc6a8ed0874fb42377d4");
            return;
        }
        this.aiBundle = aiBundle;
        if (this.aiBundle == null) {
            return;
        }
        if (this.aiBundle.getTensorConfig() != null) {
            this.tensorInputStandardFeature = this.aiBundle.getTensorConfig().tensorInputStandardFeature;
        }
        if (this.aiBundle.getCachedBundle() == null) {
            return;
        }
        this.modelFilePath = this.aiBundle.getCachedBundle().getModelFilePath();
    }

    public void addErrorList(List<Exception> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b240d9926eec167809239771bf0f9ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b240d9926eec167809239771bf0f9ff2");
        } else {
            this.errorList.addAll(list);
        }
    }

    public void addError(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f07960536f2825119f8098439dee706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f07960536f2825119f8098439dee706");
        } else {
            this.errorList.add(exc);
        }
    }

    public String getErrorDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eec4353accd72dd0e2f58e861ef2cb8e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eec4353accd72dd0e2f58e861ef2cb8e") : AppUtil.getErrorContent(this.errorList);
    }

    public boolean isFrameWorkSupportMerge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2a2533733dd247f830a12fe55ed32a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2a2533733dd247f830a12fe55ed32a2")).booleanValue();
        }
        JSInstanceManager headJSInstanceManager = InstanceContainer.getInstance().getHeadJSInstanceManager();
        return (this.aiBundle == null || headJSInstanceManager == null || !headJSInstanceManager.isSupportBatch()) ? false : true;
    }

    public Collection<OperatorMergeConfig> getMergeOptionList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8131f3576e51ae00d69c1db131e1c209", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8131f3576e51ae00d69c1db131e1c209");
        }
        if (this.aiBundle != null) {
            return this.aiBundle.getLocalMergeOptionConfig();
        }
        return null;
    }

    public boolean isPostProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc3962a60bd48e9edcfbf90562120198", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc3962a60bd48e9edcfbf90562120198")).booleanValue() : (this.aiBundle == null || TextUtils.isEmpty(this.aiBundle.getPostProcessFilePath())) ? false : true;
    }

    public JSInstance getPostProcessJSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "164c9e0f9a5812106d29f8f5e5d691e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "164c9e0f9a5812106d29f8f5e5d691e0");
        }
        if (this.aiBundle != null) {
            return this.aiBundle.getPostProcessJSInstance();
        }
        return null;
    }

    public String getPostProcessJSContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43772a6c146beb73ff824b9cc978a641", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43772a6c146beb73ff824b9cc978a641");
        }
        if (this.aiBundle != null) {
            return this.aiBundle.getPostProcessFileJsContent();
        }
        return null;
    }
}
