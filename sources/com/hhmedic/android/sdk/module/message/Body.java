package com.hhmedic.android.sdk.module.message;

import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.utils.Logger;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Body implements Serializable {
    public String command;
    public String orderId;
    public String source = "App";
    public long uuid;

    public Body() {
    }

    public Body(String str, String str2) {
        this.command = str;
        this.orderId = str2;
    }

    public static Body get(String str) {
        try {
            return (Body) new Gson().fromJson(str, (Class<Object>) Body.class);
        } catch (Exception e) {
            Logger.e("HH:Parser body json error:" + e.getLocalizedMessage());
            return new Body();
        }
    }
}
