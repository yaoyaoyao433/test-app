package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class CommonParamsInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appName;
    private String appVersion;
    private String areaCode;
    private String bAppKey;
    private String business;
    private String businessId;
    private String category;
    private String chargingState;
    private String ditingIdentifyCode;
    private String encodeTtId;
    private String errorApi;
    private String errorApiParams;
    private String errorApiResponse;
    private String errorApiTrace;
    private String errorCode;
    private String errorModule;
    private String errorType;
    private String exts;
    private boolean isProd;
    private boolean isScreenshotsReport;
    private String level;
    private String os;
    private String owlProject;
    private String pageId;
    private String pageType;
    private String projectPrincipal;
    private String raptorProject;
    private String reportProject;
    private String ringMode;
    private String samplingRate;
    private int showTimeHour;
    private int showTimeMin;
    private String simCard;
    private String step;
    private String ttId;
    private String unionId;
    private String userId;
    private String uuid;

    public CommonParamsInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9ae91cbaee5913cf28593cf5e128a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9ae91cbaee5913cf28593cf5e128a9");
            return;
        }
        this.isProd = true;
        this.pageType = "native";
        this.simCard = "unknown";
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String str) {
        this.areaCode = str;
    }

    public String getReportProject() {
        return this.reportProject;
    }

    public void setReportProject(String str) {
        this.reportProject = str;
    }

    public String getRaptorProject() {
        return this.raptorProject;
    }

    public void setRaptorProject(String str) {
        this.raptorProject = str;
    }

    public boolean isScreenshotsReport() {
        return this.isScreenshotsReport;
    }

    public void setScreenshotsReport(boolean z) {
        this.isScreenshotsReport = z;
    }

    public boolean isProd() {
        return this.isProd;
    }

    public void setProd(boolean z) {
        this.isProd = z;
    }

    public String getPageType() {
        return this.pageType;
    }

    public void setPageType(String str) {
        this.pageType = str;
    }

    public String getOwlProject() {
        return this.owlProject;
    }

    public void setOwlProject(String str) {
        this.owlProject = str;
    }

    public String getDitingIdentifyCode() {
        return this.ditingIdentifyCode;
    }

    public void setDitingIdentifyCode(String str) {
        this.ditingIdentifyCode = str;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public void setErrorType(String str) {
        this.errorType = str;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public String getSamplingRate() {
        return this.samplingRate;
    }

    public void setSamplingRate(String str) {
        this.samplingRate = str;
    }

    public String getBusiness() {
        return this.business;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public String getTtId() {
        return this.ttId;
    }

    public void setTtId(String str) {
        this.ttId = str;
    }

    public String getProjectPrincipal() {
        return this.projectPrincipal;
    }

    public void setProjectPrincipal(String str) {
        this.projectPrincipal = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String str) {
        this.unionId = str;
    }

    public String getPageId() {
        return this.pageId;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public String getEncodeTtId() {
        return this.encodeTtId;
    }

    public void setEncodeTtId(String str) {
        this.encodeTtId = str;
    }

    public String getbAppKey() {
        return this.bAppKey;
    }

    public void setbAppKey(String str) {
        this.bAppKey = str;
    }

    public String getExts() {
        return this.exts;
    }

    public void setExts(String str) {
        this.exts = str;
    }

    public String getErrorModule() {
        return this.errorModule;
    }

    public void setErrorModule(String str) {
        this.errorModule = str;
    }

    public String getStep() {
        return this.step;
    }

    public void setStep(String str) {
        this.step = str;
    }

    public String getErrorApi() {
        return this.errorApi;
    }

    public void setErrorApi(String str) {
        this.errorApi = str;
    }

    public String getErrorApiParams() {
        return this.errorApiParams;
    }

    public void setErrorApiParams(String str) {
        this.errorApiParams = str;
    }

    public String getErrorApiTrace() {
        return this.errorApiTrace;
    }

    public void setErrorApiTrace(String str) {
        this.errorApiTrace = str;
    }

    public String getErrorApiResponse() {
        return this.errorApiResponse;
    }

    public void setErrorApiResponse(String str) {
        this.errorApiResponse = str;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public String getChargingState() {
        return this.chargingState;
    }

    public void setChargingState(String str) {
        this.chargingState = str;
    }

    public String getRingMode() {
        return this.ringMode;
    }

    public void setRingMode(String str) {
        this.ringMode = str;
    }

    public int getShowTimeHour() {
        return this.showTimeHour;
    }

    public void setShowTimeHour(int i) {
        this.showTimeHour = i;
    }

    public int getShowTimeMin() {
        return this.showTimeMin;
    }

    public void setShowTimeMin(int i) {
        this.showTimeMin = i;
    }

    public String getSimCard() {
        return this.simCard;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public void updateBusinessId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2090c9212a32459c5cb983b35cc106e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2090c9212a32459c5cb983b35cc106e9");
            return;
        }
        String str = "";
        if (!TextUtils.isEmpty(this.exts)) {
            try {
                str = new JSONObject(this.exts).optString("businessId");
            } catch (Exception unused) {
            }
        }
        this.businessId = str;
    }
}
