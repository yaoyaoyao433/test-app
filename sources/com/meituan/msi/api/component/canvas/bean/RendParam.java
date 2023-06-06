package com.meituan.msi.api.component.canvas.bean;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RendParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JsonArray data;
    public String method;

    public RendParam(JsonObject jsonObject) {
        this.method = jsonObject.get("method").getAsString();
        this.data = jsonObject.get("data").getAsJsonArray();
    }
}
