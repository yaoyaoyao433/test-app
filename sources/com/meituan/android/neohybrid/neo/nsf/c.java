package com.meituan.android.neohybrid.neo.nsf;

import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void onCallbackFail(int i, String str);

        void onCallbackSucc(String str, JSONObject jSONObject);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(String str, int i, String str2);

        boolean b(String str, JSONObject jSONObject);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.nsf.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0307c {
        void a(com.meituan.android.neohybrid.neo.nsf.b bVar);
    }
}
