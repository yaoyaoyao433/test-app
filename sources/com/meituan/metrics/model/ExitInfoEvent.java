package com.meituan.metrics.model;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ExitInfoEvent extends AbstractEvent {
    private static final int MAX_BYTES = 512000;
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private final ApplicationExitInfo mInfo;
    private String traceUrl;

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getEventType() {
        return Constants.EXIT_INFO_TYPE;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.EXIT_INFO_TYPE;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return 1.0d;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return null;
    }

    public ExitInfoEvent(ApplicationExitInfo applicationExitInfo, String str) {
        Object[] objArr = {applicationExitInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c026df31642a2eff67d041815b11d14d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c026df31642a2eff67d041815b11d14d");
            return;
        }
        this.mInfo = applicationExitInfo;
        this.traceUrl = str;
    }

    public void convertToJson(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88f1ce19c2d5ea919dbbb83691059894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88f1ce19c2d5ea919dbbb83691059894");
        } else if (Build.VERSION.SDK_INT >= 30) {
            map.put("crash_process", this.mInfo.getProcessName());
            map.put("description", this.mInfo.getDescription());
            map.put("importance", Integer.valueOf(this.mInfo.getImportance()));
            map.put("pss", Long.valueOf(this.mInfo.getPss()));
            map.put("rss", Long.valueOf(this.mInfo.getRss()));
            map.put("status", Integer.valueOf(this.mInfo.getStatus()));
            map.put("reason", getReason());
            map.put(DeviceInfo.TM, Long.valueOf(this.mInfo.getTimestamp()));
            if (TextUtils.isEmpty(this.traceUrl)) {
                return;
            }
            map.put("trace", this.traceUrl);
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private String getReason() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e90ca521b31c8bb886b7ee762084c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e90ca521b31c8bb886b7ee762084c59");
        }
        if (Build.VERSION.SDK_INT < 30) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        switch (this.mInfo.getReason()) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return "ANR";
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case 11:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case 13:
                return "OTHER KILLS BY SYSTEM";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
