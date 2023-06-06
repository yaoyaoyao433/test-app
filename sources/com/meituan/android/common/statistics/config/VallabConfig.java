package com.meituan.android.common.statistics.config;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VallabConfig {
    public static final String KEY_VALLAB_CONFIG_VER = "conf_ver";
    public static final String KEY_VALLAB_LEN_CONFIG_LIST = "vallab_length_config_list";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile VallabConfig instance;
    private Context mContext;
    private String mVallabConfVer;
    private Map<String, Long> mVallabLenMap;

    public VallabConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a33b43fef93ee043915ec378f4482a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a33b43fef93ee043915ec378f4482a4");
            return;
        }
        this.mContext = null;
        this.mVallabConfVer = null;
        this.mVallabLenMap = null;
        this.mContext = context;
        this.mVallabLenMap = Collections.synchronizedMap(new HashMap());
    }

    public static VallabConfig getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6c7afef8f00648d2e05536396b392cd", 6917529027641081856L)) {
            return (VallabConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6c7afef8f00648d2e05536396b392cd");
        }
        if (instance == null) {
            synchronized (VallabConfig.class) {
                if (instance == null) {
                    instance = new VallabConfig(context.getApplicationContext());
                }
            }
        }
        return instance;
    }

    public void updateVallabCacheConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ac36b0c4a7f6761e34486c9a81ac6e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ac36b0c4a7f6761e34486c9a81ac6e5");
            return;
        }
        LogUtil.log("=========== updateVallabCacheConfig: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(KEY_VALLAB_CONFIG_VER, ""))) {
                this.mVallabConfVer = jSONObject.optString(KEY_VALLAB_CONFIG_VER, "");
            }
            String optString = jSONObject.optString(KEY_VALLAB_LEN_CONFIG_LIST, "");
            if (optString != null) {
                parseVallabLenConfigList(optString);
            }
        } catch (JSONException unused) {
        }
    }

    private void parseVallabLenConfigList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "806e95dea2621bc3c38f0d9eab109d73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "806e95dea2621bc3c38f0d9eab109d73");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("bid", "");
                    if (!TextUtils.isEmpty(optString)) {
                        this.mVallabLenMap.put(optString, Long.valueOf(jSONObject.optLong("length", ConfigManager.getInstance(this.mContext).getVallabMaxLength())));
                    }
                }
            } catch (JSONException unused) {
            }
        } else {
            this.mVallabLenMap.clear();
        }
    }

    public long getVallabLen(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abe1f4e970967b3378ba7d6fd0074f50", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abe1f4e970967b3378ba7d6fd0074f50")).longValue();
        }
        long vallabMaxLength = ConfigManager.getInstance(this.mContext).getVallabMaxLength();
        if (this.mVallabLenMap.containsKey(str)) {
            long longValue = this.mVallabLenMap.get(str).longValue();
            return longValue <= 0 ? vallabMaxLength : longValue;
        }
        return vallabMaxLength;
    }
}
