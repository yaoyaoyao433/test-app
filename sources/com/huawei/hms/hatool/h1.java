package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h1 {
    public String a;
    public m b;

    public h1(String str) {
        this.a = str;
        this.b = new m(str);
        i.c().a(this.a, this.b);
    }

    public void a(int i) {
        y.a("hmsSdk", "HiAnalyticsInstance.onReport() is execute.TAG: %s,TYPE: %d", this.a, Integer.valueOf(i));
        g1.a().a(this.a, i);
    }

    public void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        y.a("hmsSdk", "HiAnalyticsInstance.onEvent(int type, String eventId, Map<String, String> mapValue) is execute.TAG: %s,TYPE: %d", this.a, Integer.valueOf(i));
        if (q0.a(str) || !c(i)) {
            y.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.a + ", TYPE: " + i);
            return;
        }
        if (!q0.a(linkedHashMap)) {
            y.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g1.a().a(this.a, i, str, linkedHashMap);
    }

    public void a(Context context, String str, String str2) {
        y.c("hmsSdk", "HiAnalyticsInstance.onEvent(eventId, mapValue) is execute.TAG : " + this.a);
        if (context == null) {
            y.e("hmsSdk", "context is null in onevent ");
        } else if (q0.a(str) || !c(0)) {
            y.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.a);
        } else {
            if (!q0.a("value", str2, 65536)) {
                y.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.a);
                str2 = "";
            }
            g1.a().a(this.a, context, str, str2);
        }
    }

    public void a(k kVar) {
        y.c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.a);
        if (kVar != null) {
            this.b.a(kVar);
            return;
        }
        y.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
        this.b.a((k) null);
    }

    public final k b(int i) {
        switch (i) {
            case 0:
                return this.b.c();
            case 1:
                return this.b.b();
            case 2:
                return this.b.d();
            case 3:
                return this.b.a();
            default:
                return null;
        }
    }

    public void b(k kVar) {
        y.c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.a);
        if (kVar != null) {
            this.b.b(kVar);
            return;
        }
        this.b.b(null);
        y.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
    }

    public final boolean c(int i) {
        if (i == 2) {
            if ("_default_config_tag".equals(this.a)) {
                return true;
            }
            y.e("hmsSdk", "verifyURL(): type: preins. Only default config can report Pre-install data.");
            return false;
        }
        k b = b(i);
        if (b == null || TextUtils.isEmpty(b.h())) {
            y.e("hmsSdk", "verifyURL(): URL check failed. type: " + i);
            return false;
        }
        return true;
    }
}
