package com.meituan.msc.jse.bridge;

import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IMessageInterface {
    JSONArray getConfig(String str);

    void invoke(String str, String str2, JSONArray jSONArray);

    Object invokeSync(String str, String str2, JSONArray jSONArray);
}
