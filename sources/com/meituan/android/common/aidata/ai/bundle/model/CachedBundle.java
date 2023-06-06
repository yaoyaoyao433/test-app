package com.meituan.android.common.aidata.ai.bundle.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CachedBundle {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String autoPredictFilePath;
    private String autoRunStrategyPath;
    private String bundleFilePath;
    private String bundleName;
    private String bundleVersion;
    private String dataFilePath;
    private String envFilePath;
    private String featureConfigFilePath;
    private String jsConfigFilePath;
    private String jsFilePath;
    private String modelConfigFilePath;
    private String modelFilePath;
    private String modelPostProcessFilePath;
    private String tensorConfigFilePath;

    public String getBundleName() {
        return this.bundleName;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public String getBundleVersion() {
        return this.bundleVersion;
    }

    public void setBundleVersion(String str) {
        this.bundleVersion = str;
    }

    public String getBundleFilePath() {
        return this.bundleFilePath;
    }

    public void setBundleFilePath(String str) {
        this.bundleFilePath = str;
    }

    public String getEnvFilePath() {
        return this.envFilePath;
    }

    public void setEnvFilePath(String str) {
        this.envFilePath = str;
    }

    public String getJsFilePath() {
        return this.jsFilePath;
    }

    public void setJsFilePath(String str) {
        this.jsFilePath = str;
    }

    public String getDataFilePath() {
        return this.dataFilePath;
    }

    public void setDataFilePath(String str) {
        this.dataFilePath = str;
    }

    public String getJsConfigFilePath() {
        return this.jsConfigFilePath;
    }

    public void setJsConfigFilePath(String str) {
        this.jsConfigFilePath = str;
    }

    public String getAutoRunStrategyPath() {
        return this.autoRunStrategyPath;
    }

    public void setAutoRunStrategyPath(String str) {
        this.autoRunStrategyPath = str;
    }

    public String getModelFilePath() {
        return this.modelFilePath;
    }

    public void setModelFilePath(String str) {
        this.modelFilePath = str;
    }

    public String getModelConfigFilePath() {
        return this.modelConfigFilePath;
    }

    public void setModelConfigFilePath(String str) {
        this.modelConfigFilePath = str;
    }

    public String getTensorConfigFilePath() {
        return this.tensorConfigFilePath;
    }

    public void setTensorConfigFilePath(String str) {
        this.tensorConfigFilePath = str;
    }

    public String getFeatureConfigFilePath() {
        return this.featureConfigFilePath;
    }

    public void setFeatureConfigFilePath(String str) {
        this.featureConfigFilePath = str;
    }

    public String getModelPostProcessFilePath() {
        return this.modelPostProcessFilePath;
    }

    public void setModelPostProcessFilePath(String str) {
        this.modelPostProcessFilePath = str;
    }

    public void setAutoPredictFilePath(String str) {
        this.autoPredictFilePath = str;
    }

    public String getAutoPredictFilePath() {
        return this.autoPredictFilePath;
    }

    public boolean isJSValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f3784c851f03938267dee6ec100f88f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f3784c851f03938267dee6ec100f88f")).booleanValue();
        }
        if (TextUtils.isEmpty(this.jsFilePath)) {
            return false;
        }
        File file = new File(this.jsFilePath);
        return file.exists() && file.isFile() && file.length() > 0;
    }

    public boolean isModelValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "def2c956fc0fc4481e66c90dae993886", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "def2c956fc0fc4481e66c90dae993886")).booleanValue();
        }
        if (TextUtils.isEmpty(this.modelConfigFilePath)) {
            return false;
        }
        File file = new File(this.modelConfigFilePath);
        return file.exists() && file.isFile() && file.length() > 0;
    }

    public boolean isBundleValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67335c4a55949d2ef7ea1acc19c3e840", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67335c4a55949d2ef7ea1acc19c3e840")).booleanValue() : isJSValid() || isModelValid();
    }
}
