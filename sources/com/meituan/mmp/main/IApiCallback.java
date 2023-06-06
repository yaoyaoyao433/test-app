package com.meituan.mmp.main;

import android.support.annotation.Keep;
import com.meituan.mmp.lib.model.Event;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IApiCallback {
    Event getEvent();

    void onCancel();

    @Deprecated
    void onFail();

    void onFail(JSONObject jSONObject);

    void onSuccess(JSONObject jSONObject);
}
