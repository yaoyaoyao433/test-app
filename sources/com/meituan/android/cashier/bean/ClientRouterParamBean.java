package com.meituan.android.cashier.bean;

import android.os.Build;
import com.dianping.titans.offline.OfflineCenter;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.common.r;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.neo.offline.b;
import com.meituan.android.neohybrid.util.p;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.settings.d;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ClientRouterParamBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7703098101040821743L;
    @SerializedName("app_display_type")
    private String appDisplayType;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION)
    private String appVersion;
    @SerializedName("chrome_version")
    private String chromeVersion;
    @SerializedName("chrome_version_core")
    private String chromeVersionCore;
    @SerializedName("config_debug")
    private String configDebug;
    @SerializedName("debug")
    private String debug;
    @SerializedName("device_id")
    private String deviceID;
    @SerializedName("device_level")
    private String deviceLevel;
    @SerializedName("device_model")
    private String deviceModel;
    @SerializedName("device_type")
    private String deviceType;
    @SerializedName("global_offline_hybrid_cashier")
    private List<String> globalOfflineHybridCashier;
    @SerializedName("global_offline_hybrid_mtp")
    private List<String> globalOfflineHybridMtp;
    @SerializedName("global_offline_neo")
    private List<String> globalOfflineNeo;
    @SerializedName("net_status")
    private String netStatus;
    @SerializedName("package_name")
    private String newPackageName;
    @SerializedName("os_version")
    private String osVersion;
    @SerializedName("packageName")
    private String packageName;
    @SerializedName("pay_token")
    private String payToken;
    @SerializedName("token")
    private String token;
    @SerializedName("tradeno")
    private String tradeno;
    @SerializedName("user_id")
    private String userId;

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String getConfigDebug() {
        return this.configDebug;
    }

    public void setConfigDebug(String str) {
        this.configDebug = str;
    }

    public String getNetStatus() {
        return this.netStatus;
    }

    public void setNetStatus(String str) {
        this.netStatus = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public List<String> getGlobalOfflineNeo() {
        return this.globalOfflineNeo;
    }

    public void setGlobalOfflineNeo(List<String> list) {
        this.globalOfflineNeo = list;
    }

    public List<String> getGlobalOfflineHybridMtp() {
        return this.globalOfflineHybridMtp;
    }

    public void setGlobalOfflineHybridMtp(List<String> list) {
        this.globalOfflineHybridMtp = list;
    }

    public List<String> getGlobalOfflineHybridCashier() {
        return this.globalOfflineHybridCashier;
    }

    public void setGlobalOfflineHybridCashier(List<String> list) {
        this.globalOfflineHybridCashier = list;
    }

    public String getAppDisplayType() {
        return this.appDisplayType;
    }

    public void setAppDisplayType(String str) {
        this.appDisplayType = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public void setPayToken(String str) {
        this.payToken = str;
    }

    public String getTradeno() {
        return this.tradeno;
    }

    public void setTradeno(String str) {
        this.tradeno = str;
    }

    public String getDebug() {
        return this.debug;
    }

    public void setDebug(String str) {
        this.debug = str;
    }

    public String getDeviceLevel() {
        return this.deviceLevel;
    }

    public void setDeviceLevel(String str) {
        this.deviceLevel = str;
    }

    public String getChromeVersion() {
        return this.chromeVersion;
    }

    public void setChromeVersion(String str) {
        this.chromeVersion = str;
    }

    public String getChromeVersionCore() {
        return this.chromeVersionCore;
    }

    public void setChromeVersionCore(String str) {
        this.chromeVersionCore = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public String getNewPackageName() {
        return this.newPackageName;
    }

    public void setNewPackageName(String str) {
        this.newPackageName = str;
    }

    private static List<String> getAvailableOffline(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e14f60b5d8b21b49cbc817790231c75", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e14f60b5d8b21b49cbc817790231c75");
        }
        if (i.a((Collection) list)) {
            return new ArrayList();
        }
        ArrayList<String> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        if (i.a((Collection) arrayList)) {
            return arrayList2;
        }
        for (String str2 : arrayList) {
            if (b.a(str, str2)) {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }

    public static ClientRouterParamBean createClientRouterParamBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c3015957370fcd5238b4db0552c0d41", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClientRouterParamBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c3015957370fcd5238b4db0552c0d41");
        }
        ClientRouterParamBean clientRouterParamBean = new ClientRouterParamBean();
        try {
            if (OfflineCenter.getInstance() != null) {
                clientRouterParamBean.setGlobalOfflineNeo(getAvailableOffline("global_offline_neo", OfflineCenter.getInstance().getOfflineUrlFromScope("global_offline_neo")));
                clientRouterParamBean.setGlobalOfflineHybridCashier(getAvailableOffline("global_offline_hybrid_cashier", OfflineCenter.getInstance().getOfflineUrlFromScope("global_offline_hybrid_cashier")));
                clientRouterParamBean.setGlobalOfflineHybridMtp(getAvailableOffline("global_offline_hybrid_mtp", OfflineCenter.getInstance().getOfflineUrlFromScope("global_offline_hybrid_mtp")));
            }
        } catch (Exception e) {
            a.a(e, "ClientRouterParamBean", (Map<String, Object>) null);
        }
        clientRouterParamBean.setDeviceType(Build.MODEL);
        clientRouterParamBean.setAppDisplayType(r.c());
        clientRouterParamBean.setPackageName(com.meituan.android.paybase.config.a.d().a().getPackageName());
        clientRouterParamBean.setNetStatus(AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
        clientRouterParamBean.setUserId(com.meituan.android.paybase.config.a.d().i());
        clientRouterParamBean.setConfigDebug(String.valueOf(d.a()));
        clientRouterParamBean.setDebug(com.meituan.android.neohybrid.init.a.h() ? "1" : "0");
        clientRouterParamBean.setDeviceLevel(String.valueOf(DeviceUtil.getDeviceLevel(com.meituan.android.neohybrid.init.a.d())));
        clientRouterParamBean.setChromeVersion(p.b(com.meituan.android.neohybrid.init.a.d()));
        clientRouterParamBean.setChromeVersionCore(p.a(com.meituan.android.neohybrid.init.a.d()));
        clientRouterParamBean.setAppVersion(com.meituan.android.paybase.config.a.d().l());
        clientRouterParamBean.setDeviceModel(Build.MODEL);
        clientRouterParamBean.setDeviceID(com.meituan.android.paybase.config.a.d().h());
        clientRouterParamBean.setOsVersion(com.meituan.android.paybase.config.a.d().e());
        clientRouterParamBean.setNewPackageName(com.meituan.android.paybase.config.a.d().a().getPackageName());
        return clientRouterParamBean;
    }
}
