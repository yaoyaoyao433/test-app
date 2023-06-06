package com.meituan.metrics.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsLocalSwitchConfigManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsLocalSwitchConfigManager instance;
    private boolean localSwCommonVal;
    private HashMap<String, MetricsLocalSwitchConfig> localSwConfigMap;

    public MetricsLocalSwitchConfigManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e155757941d9786162b537fc0d64ee2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e155757941d9786162b537fc0d64ee2f");
            return;
        }
        this.localSwConfigMap = new HashMap<>();
        this.localSwCommonVal = true;
    }

    public static MetricsLocalSwitchConfigManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42d8a7c01c2ac89ad90ee7096cd867fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLocalSwitchConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42d8a7c01c2ac89ad90ee7096cd867fa");
        }
        if (instance == null) {
            synchronized (MetricsLocalSwitchConfigManager.class) {
                if (instance == null) {
                    instance = new MetricsLocalSwitchConfigManager();
                }
            }
        }
        return instance;
    }

    public void setLocalSwitch(boolean z) {
        this.localSwCommonVal = z;
    }

    public boolean getCommonLocalSw() {
        return this.localSwCommonVal;
    }

    public void updateConfig(MetricsLocalSwitchConfig metricsLocalSwitchConfig) {
        Object[] objArr = {metricsLocalSwitchConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6862a048f19c40a3e67e8f3b784a0e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6862a048f19c40a3e67e8f3b784a0e3f");
        } else {
            this.localSwConfigMap.put(metricsLocalSwitchConfig.getActivitySw(), metricsLocalSwitchConfig);
        }
    }

    public void removeConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88c96df9988b89c30e426ecc88ed165f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88c96df9988b89c30e426ecc88ed165f");
        } else {
            this.localSwConfigMap.remove(str);
        }
    }

    public MetricsLocalSwitchConfig getLocalSwitchConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd7b18d48755564d801db009be3bb9d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLocalSwitchConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd7b18d48755564d801db009be3bb9d2");
        }
        if (this.localSwConfigMap.containsKey(str)) {
            return this.localSwConfigMap.get(str);
        }
        return new MetricsLocalSwitchConfig(str, this.localSwCommonVal);
    }

    public boolean getFPSSw(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92da87acd16fc37a1db8df0fdecef13e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92da87acd16fc37a1db8df0fdecef13e")).booleanValue();
        }
        MetricsLocalSwitchConfig metricsLocalSwitchConfig = this.localSwConfigMap.get(str);
        if (metricsLocalSwitchConfig != null) {
            return metricsLocalSwitchConfig.getFPSSw();
        }
        return this.localSwCommonVal;
    }

    public boolean getCPUSw(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03c690481b1400c57fd7647d7de21cec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03c690481b1400c57fd7647d7de21cec")).booleanValue();
        }
        MetricsLocalSwitchConfig metricsLocalSwitchConfig = this.localSwConfigMap.get(str);
        if (metricsLocalSwitchConfig != null) {
            return metricsLocalSwitchConfig.getCPUSw();
        }
        return this.localSwCommonVal;
    }

    public boolean getMemSw(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c1ef0609bcbc6d275cef531a920a442", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c1ef0609bcbc6d275cef531a920a442")).booleanValue();
        }
        MetricsLocalSwitchConfig metricsLocalSwitchConfig = this.localSwConfigMap.get(str);
        if (metricsLocalSwitchConfig != null) {
            return metricsLocalSwitchConfig.getMemSw();
        }
        return this.localSwCommonVal;
    }

    public boolean getLagSw(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "affce59ddf581612a68d2df7a25e0096", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "affce59ddf581612a68d2df7a25e0096")).booleanValue();
        }
        MetricsLocalSwitchConfig metricsLocalSwitchConfig = this.localSwConfigMap.get(str);
        if (metricsLocalSwitchConfig != null) {
            return metricsLocalSwitchConfig.getLagSw();
        }
        return this.localSwCommonVal;
    }

    public boolean getSampleSw(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1d04375f836f76bdce305f4e3969d14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1d04375f836f76bdce305f4e3969d14")).booleanValue();
        }
        MetricsLocalSwitchConfig metricsLocalSwitchConfig = this.localSwConfigMap.get(str);
        if (metricsLocalSwitchConfig != null) {
            return metricsLocalSwitchConfig.getMemSw() & metricsLocalSwitchConfig.getFPSSw() & metricsLocalSwitchConfig.getCPUSw();
        }
        return this.localSwCommonVal;
    }
}
