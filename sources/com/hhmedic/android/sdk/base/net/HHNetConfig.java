package com.hhmedic.android.sdk.base.net;

import com.dianping.titans.utils.Constants;
import com.hhmedic.android.sdk.base.BaseConfig;
import com.hhmedic.android.sdk.base.utils.HHStringUtils;
import com.hhmedic.android.sdk.base.utils.secret.HHCheckSumBuilder;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHNetConfig {
    public static final String APP_TYPE = "Android";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final String ENCODE = "UTF-8";
    public static final String JSON = "application/json; charset=utf-8";
    public static final String VIDEO_TYPE = "TRTC";

    public static String url(boolean z) {
        return z ? "https://test.hh-medic.com/familyapp" : "https://sdk01.hh-medic.com/familyapp";
    }

    public static HashMap<String, String> getRequestHeader() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("APPTYPE", "mini");
        hashMap.put("Content-Type", JSON);
        String valueOf = String.valueOf(System.currentTimeMillis());
        String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
        String checkSum = HHCheckSumBuilder.getCheckSum("QWERBck0bOeR9rSJ", valueOf, valueOf2);
        hashMap.put("Nonce", valueOf);
        hashMap.put("CurTime", valueOf2);
        hashMap.put("CheckSum", checkSum);
        return hashMap;
    }

    public static String commonParams(HashMap<String, Object> hashMap) {
        return HHStringUtils.createLinkString(params(hashMap), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, Object> params(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(Constants.MULTI_PROCESS_PID, BaseConfig.getPid());
        hashMap.put("sdkProductId", BaseConfig.getPid());
        hashMap.put("actionSource", "Android");
        hashMap.put("random", String.valueOf(System.currentTimeMillis()));
        hashMap.put("sdk_version", BaseConfig.getSdkVersion());
        hashMap.put("videoType", VIDEO_TYPE);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String url() {
        return url(BaseConfig.isTest);
    }
}
