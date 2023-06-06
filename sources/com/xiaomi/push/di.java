package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class di implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ dh e;

    public di(dh dhVar, String str, Context context, String str2, String str3) {
        this.e = dhVar;
        this.a = str;
        this.b = context;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dh dhVar;
        dj djVar;
        Context context;
        if (TextUtils.isEmpty(this.a)) {
            dc.a(this.b, StringUtil.NULL, 1008, "A receive a incorrect message with empty info");
            return;
        }
        try {
            dc.a(this.b, this.a, 1001, "get message");
            JSONObject jSONObject = new JSONObject(this.a);
            String optString = jSONObject.optString("action");
            String optString2 = jSONObject.optString("awakened_app_packagename");
            String optString3 = jSONObject.optString("awake_app_packagename");
            String optString4 = jSONObject.optString("awake_app");
            String optString5 = jSONObject.optString("awake_type");
            int optInt = jSONObject.optInt("awake_foreground", 0);
            if (this.c.equals(optString3) && this.d.equals(optString4)) {
                if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                    dc.a(this.b, this.a, 1008, "A receive a incorrect message with empty type");
                    return;
                }
                this.e.c = optString3;
                this.e.b = optString4;
                dg dgVar = new dg();
                dgVar.b = optString;
                dgVar.a = optString2;
                dgVar.e = optInt;
                dgVar.d = this.a;
                if ("service".equals(optString5)) {
                    if (!TextUtils.isEmpty(optString)) {
                        dh dhVar2 = this.e;
                        dhVar2.g.get(dj.SERVICE_ACTION).a(this.b, dgVar);
                        return;
                    }
                    dgVar.c = "com.xiaomi.mipush.sdk.PushMessageHandler";
                    dhVar = this.e;
                    djVar = dj.SERVICE_COMPONENT;
                    context = this.b;
                } else if (dj.ACTIVITY.e.equals(optString5)) {
                    dhVar = this.e;
                    djVar = dj.ACTIVITY;
                    context = this.b;
                } else if (!dj.PROVIDER.e.equals(optString5)) {
                    Context context2 = this.b;
                    String str = this.a;
                    dc.a(context2, str, 1008, "A receive a incorrect message with unknown type " + optString5);
                    return;
                } else {
                    dhVar = this.e;
                    djVar = dj.PROVIDER;
                    context = this.b;
                }
                dhVar.g.get(djVar).a(context, dgVar);
                return;
            }
            Context context3 = this.b;
            String str2 = this.a;
            dc.a(context3, str2, 1008, "A receive a incorrect message with incorrect package info" + optString3);
        } catch (JSONException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            dc.a(this.b, this.a, 1008, "A meet a exception when receive the message");
        }
    }
}
