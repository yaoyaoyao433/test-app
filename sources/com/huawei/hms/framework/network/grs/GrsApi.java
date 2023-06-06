package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GrsApi {
    private static final String TAG = "GrsApi";
    private static GrsClient grsClient;

    public static void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(TAG, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else {
            grsClient2.ayncGetGrsUrl(str, str2, iQueryUrlCallBack);
        }
    }

    public static void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(TAG, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else {
            grsClient2.ayncGetGrsUrls(str, iQueryUrlsCallBack);
        }
    }

    public static void clearSp() {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null) {
            Logger.w(TAG, "GrsApi.clearSp return because grsClient is null.");
        } else {
            grsClient2.clearSp();
        }
    }

    public static boolean forceExpire() {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null) {
            Logger.w(TAG, "GrsApi.forceExpire return false because grsClient is null.");
            return false;
        }
        return grsClient2.forceExpire();
    }

    @Deprecated
    public static CountryCodeBean getCountryCode(Context context, boolean z) {
        return a.a(context, z);
    }

    public static int grsSdkInit(Context context, GrsBaseInfo grsBaseInfo) {
        grsClient = new GrsClient(context, grsBaseInfo);
        return 0;
    }

    public static String synGetGrsUrl(String str, String str2) {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null || str2 == null) {
            Logger.w(TAG, "GrsApi.synGetGrsUrl method maybe grsSdkInit has not completed and grsClient is null.");
            return null;
        }
        return grsClient2.synGetGrsUrl(str, str2);
    }

    public static Map<String, String> synGetGrsUrls(String str) {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null) {
            Logger.w(TAG, "GrsApi.synGetGrsUrls method maybe grsSdkInit has not completed and grsClient is null.");
            return new HashMap();
        }
        return grsClient2.synGetGrsUrls(str);
    }
}
