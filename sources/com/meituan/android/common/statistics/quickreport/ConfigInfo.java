package com.meituan.android.common.statistics.quickreport;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConfigInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Set<String> bo;
    private Set<String> bp;
    private int cnfver;
    private Set<String> envInfo;
    private Set<String> evsInfo;
    private String fileName;
    private boolean hasAQ;
    private boolean hasAS;
    private Set<String> mc;
    private Set<String> me;
    private Set<String> pv;

    public ConfigInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cb1e637d69e519001510d1e1716da3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cb1e637d69e519001510d1e1716da3b");
        } else {
            this.cnfver = -1;
        }
    }

    public int getCnfver() {
        return this.cnfver;
    }

    public boolean getAS() {
        return this.hasAS;
    }

    public boolean getAQ() {
        return this.hasAQ;
    }

    public Set<String> getPV() {
        return this.pv;
    }

    public Set<String> getME() {
        return this.me;
    }

    public Set<String> getMC() {
        return this.mc;
    }

    public Set<String> getBO() {
        return this.bo;
    }

    public Set<String> getBP() {
        return this.bp;
    }

    public Set<String> getEnvInfo() {
        return this.envInfo;
    }

    public Set<String> getEvsInfo() {
        return this.evsInfo;
    }

    public String getFileName() {
        return this.fileName;
    }

    public boolean containsConfig(Set<String> set, String str) {
        Object[] objArr = {set, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9a4a429b30f00fbded8dcf27ba257bf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9a4a429b30f00fbded8dcf27ba257bf")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || set == null || set.size() == 0) {
            return false;
        }
        return set.contains(str);
    }

    public static ConfigInfo getConfigInfoFromJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c97623fcc3a683e342c40e3c9b4b2467", 6917529027641081856L)) {
            return (ConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c97623fcc3a683e342c40e3c9b4b2467");
        }
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject == null) {
            return new ConfigInfo();
        }
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.cnfver = jSONObject.optInt("cnfver");
        configInfo.fileName = jSONObject.optString(QuickReportConstants.CONFIG_FILE_NAME);
        JSONObject optJSONObject = jSONObject.optJSONObject(QuickReportConstants.QUICK_REPORT);
        if (optJSONObject == null) {
            return configInfo;
        }
        configInfo.hasAS = optJSONObject.optBoolean(QuickReportConstants.HAS_AS);
        configInfo.hasAQ = optJSONObject.optBoolean(QuickReportConstants.HAS_AQ);
        configInfo.pv = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.PV_CONFIG));
        configInfo.me = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.ME_CONFIG));
        configInfo.mc = getRealQuickConfig(optJSONObject.optJSONArray("MC"));
        configInfo.bo = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.BO_CONFIG));
        configInfo.bp = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.BP_CONFIG));
        configInfo.envInfo = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.ENV_INFO));
        configInfo.evsInfo = getRealQuickConfig(optJSONObject.optJSONArray(QuickReportConstants.EVS_INFO));
        return configInfo;
    }

    private static Set<String> getRealQuickConfig(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc6485493f82269398be5357080304f7", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc6485493f82269398be5357080304f7");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    hashSet.add(string);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashSet;
    }
}
