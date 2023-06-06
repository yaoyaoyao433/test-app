package com.sankuai.meituan.android.knb.listener;

import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnMessageReceiveListener {
    String messageType();

    void onMessageReceive(JSONObject jSONObject);
}
