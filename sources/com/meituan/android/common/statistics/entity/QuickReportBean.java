package com.meituan.android.common.statistics.entity;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.quickreport.ConfigInfo;
import com.meituan.android.common.statistics.quickreport.QuickReportConfigManager;
import com.meituan.android.common.statistics.session.ScidManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuickReportBean {
    private static final String EVS_KEY = "evs.";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONObject getQuickReportEvent(JSONObject jSONObject) {
        Set<String> evsInfo;
        Set<String> envInfo;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71b5bbba70ff01232ad9a2900d0372f6", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71b5bbba70ff01232ad9a2900d0372f6");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            String optString = jSONObject.optString("category");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject2.put("category", optString);
            }
            String optString2 = jSONObject.optString("app");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject2.put("app", optString2);
            }
            String optString3 = jSONObject.optString(Constants.Environment.KEY_APPNM);
            if (!TextUtils.isEmpty(optString3)) {
                jSONObject2.put(Constants.Environment.KEY_APPNM, optString3);
            }
            String optString4 = jSONObject.optString("msid");
            if (!TextUtils.isEmpty(optString4)) {
                jSONObject2.put("msid", optString4);
            }
            String optString5 = jSONObject.optString(Constants.Environment.KEY_APP_SESSION);
            if (!TextUtils.isEmpty(optString5)) {
                jSONObject2.put(Constants.Environment.KEY_APP_SESSION, optString5);
            }
            String optString6 = jSONObject.optString("uid");
            if (!TextUtils.isEmpty(optString6)) {
                jSONObject2.put("uid", optString6);
            }
            String optString7 = jSONObject.optString(Constants.Environment.KEY_UNION_ID);
            if (!TextUtils.isEmpty(optString7)) {
                jSONObject2.put(Constants.Environment.KEY_UNION_ID, optString7);
            }
            String optString8 = jSONObject.optString("uuid");
            if (!TextUtils.isEmpty(optString8)) {
                jSONObject2.put("uuid", optString8);
            }
            String optString9 = jSONObject.optString(Constants.Environment.KEY_CT);
            if (!TextUtils.isEmpty(optString9)) {
                jSONObject2.put(Constants.Environment.KEY_CT, optString9);
            }
            String optString10 = jSONObject.optString("os");
            if (!TextUtils.isEmpty(optString10)) {
                jSONObject2.put("os", optString10);
            }
            String optString11 = jSONObject.optString(Constants.Environment.KEY_BUILD_VERSION);
            if (!TextUtils.isEmpty(optString11)) {
                jSONObject2.put(Constants.Environment.KEY_BUILD_VERSION, optString11);
            }
            String optString12 = jSONObject.optString("sdk_ver");
            if (!TextUtils.isEmpty(optString12)) {
                jSONObject2.put("sdk_ver", optString12);
            }
            String optString13 = jSONObject.optString(Constants.Environment.KEY_UTM);
            if (!TextUtils.isEmpty(optString13)) {
                jSONObject2.put(Constants.Environment.KEY_UTM, new JSONObject(optString13));
            }
            jSONObject2.put(Constants.Environment.KEY_LX_DICT, String.valueOf(ConfigManager.getInstance(Statistics.getContext()).isEncReport()));
            ConfigInfo configInfo = QuickReportConfigManager.getInstance(Statistics.getContext()).getConfigInfo();
            if (configInfo != null && (envInfo = configInfo.getEnvInfo()) != null && envInfo.size() > 0) {
                for (String str : envInfo) {
                    String optString14 = jSONObject.optString(str);
                    if (!TextUtils.isEmpty(optString14)) {
                        jSONObject2.put(str, optString14);
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("evs");
            if (optJSONObject != null) {
                String optString15 = optJSONObject.optString("lat");
                if (!TextUtils.isEmpty(optString15)) {
                    jSONObject2.put("evs.lat", optString15);
                }
                String optString16 = optJSONObject.optString("lng");
                if (!TextUtils.isEmpty(optString16)) {
                    jSONObject2.put("evs.lng", optString16);
                }
                String optString17 = optJSONObject.optString("locate_tm");
                if (!TextUtils.isEmpty(optString17)) {
                    jSONObject2.put("evs.locate_tm", optString17);
                }
                jSONObject2.put("evs.seq", optJSONObject.optLong("seq"));
                String optString18 = optJSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
                if (!TextUtils.isEmpty(optString18)) {
                    jSONObject2.put("evs.req_id", optString18);
                }
                jSONObject2.put("evs.tm", optJSONObject.optLong("tm"));
                jSONObject2.put("evs.stm", optJSONObject.optLong("stm"));
                String optString19 = optJSONObject.optString("val_cid");
                if (!TextUtils.isEmpty(optString19)) {
                    jSONObject2.put("evs.val_cid", optString19);
                }
                String optString20 = optJSONObject.optString("val_bid");
                if (!TextUtils.isEmpty(optString20)) {
                    jSONObject2.put("evs.val_bid", optString20);
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray(Constants.EventInfoConsts.KEY_SFROM);
                if (optJSONArray != null) {
                    jSONObject2.put("evs.s_from", optJSONArray);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("val_lab");
                if (optJSONObject2 != null) {
                    jSONObject2.put("evs.val_lab", optJSONObject2);
                }
                String optString21 = optJSONObject.optString("val_ref");
                if (!TextUtils.isEmpty(optString21)) {
                    jSONObject2.put("evs.val_ref", optString21);
                }
                String optString22 = optJSONObject.optString("nm");
                if (!TextUtils.isEmpty(optString22)) {
                    jSONObject2.put("evs.nm", optString22);
                }
                jSONObject2.put("evs.fseq", ScidManager.getQseq());
                if (configInfo != null && (evsInfo = configInfo.getEvsInfo()) != null && evsInfo.size() > 0) {
                    for (String str2 : evsInfo) {
                        String optString23 = optJSONObject.optString(str2);
                        if (!TextUtils.isEmpty(optString23)) {
                            jSONObject2.put(EVS_KEY + str2, optString23);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }
}
