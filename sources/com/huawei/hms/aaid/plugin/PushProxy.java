package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hmf.tasks.f;
import com.huawei.hms.common.ApiException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    f<Void> subscribe(Context context, String str, String str2);

    f<Void> turnOff(Context context, String str);

    f<Void> turnOn(Context context, String str);

    f<Void> unsubscribe(Context context, String str, String str2);
}
