package com.hhmedic.android.sdk.module.h5;

import android.text.TextUtils;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.hhmedic.android.sdk.config.HHConfig;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHModuleUrl {
    private static final String test = "https://test.hh-medic.com";

    private static String addCommonParams(String str, HashMap<String, Object> hashMap) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String commonParams = HHNetConfig.commonParams(hashMap);
        if (str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
            return str + "&" + commonParams;
        }
        return str + CommonConstant.Symbol.QUESTION_MARK + commonParams;
    }

    public static String getMedicDetailUrl(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", HHConfig.getPid());
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("userToken", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("patientUserToken", str3);
        }
        hashMap.put("mrid", str);
        return addCommonParams(getMedicHost() + "/ehrweb/view/?module=detail", hashMap);
    }

    static String getMedicHost() {
        return HHConfig.isTest() ? test : "https://e.hh-medic.com";
    }
}
