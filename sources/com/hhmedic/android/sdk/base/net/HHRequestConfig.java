package com.hhmedic.android.sdk.base.net;

import android.text.TextUtils;
import com.hhmedic.android.sdk.base.BaseConfig;
import com.hhmedic.android.sdk.base.utils.HHStringUtils;
import com.hhmedic.android.sdk.config.HHConfig;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HHRequestConfig {
    public static final int GET = 1;
    public static final int POST = 2;
    protected HashMap<String, Object> mBody;
    public byte[] mBodyByte;
    protected HashMap<String, Object> mParams;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface NetMethod {
    }

    protected HashMap<String, Object> addSign(HashMap<String, Object> hashMap) {
        return hashMap;
    }

    public String extensionUrl() {
        return null;
    }

    public int getRequestMethod() {
        return 2;
    }

    public boolean needUserInfo() {
        return true;
    }

    public abstract Type parserJsonType();

    public abstract String serverApiPath();

    public HHRequestConfig(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        this.mBody = hashMap2;
        this.mParams = hashMap;
    }

    protected String appVersion() {
        return BaseConfig.getAppVersion();
    }

    public boolean print() {
        return BaseConfig.canPrintLog;
    }

    public String getRequestUrl() {
        String str = getBaseUrl() + serverApiPath();
        String paramsString = paramsString();
        if (str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
            return str + "&" + paramsString;
        }
        return str + CommonConstant.Symbol.QUESTION_MARK + paramsString;
    }

    private HashMap<String, Object> createParams() {
        return HHNetConfig.params(addBaseUserInfo());
    }

    private String paramsString() {
        return HHStringUtils.createLinkString(addSign(createParams()), true);
    }

    private String getBaseUrl() {
        if (!TextUtils.isEmpty(extensionUrl())) {
            return extensionUrl();
        }
        return HHNetConfig.url();
    }

    private HashMap<String, Object> addBaseUserInfo() {
        if (this.mParams == null) {
            this.mParams = new HashMap<>();
        }
        if (TextUtils.isEmpty(appVersion())) {
            this.mParams.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, HHConfig.APP_VERSION);
        } else {
            this.mParams.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, appVersion());
        }
        HashMap<String, Object> hashMap = this.mParams;
        if (needUserInfo()) {
            long uuid = HHNetUserInfo.uuid();
            if (uuid > 0) {
                hashMap.put("uuid", Long.valueOf(uuid));
            }
            String userToken = HHNetUserInfo.getUserToken();
            if (!TextUtils.isEmpty(userToken)) {
                hashMap.put("userToken", userToken);
            }
        }
        return hashMap;
    }
}
