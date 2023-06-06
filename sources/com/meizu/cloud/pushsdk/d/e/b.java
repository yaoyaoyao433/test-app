package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class b {
    public static final String a = "b";
    public long c;
    public final long d;
    public final long e;
    private String f;
    private String g;
    private String h;
    private int i;
    private final Context k;
    private final String j = "SQLITE";
    public final AtomicBoolean b = new AtomicBoolean(false);

    private boolean c() {
        return com.meizu.cloud.pushsdk.d.f.a.a("snowplow_session_vars", a(), this.k);
    }

    public final Map a() {
        HashMap hashMap = new HashMap(8);
        hashMap.put(DeviceInfo.USER_ID, this.f);
        hashMap.put("sessionId", this.g);
        hashMap.put("previousSessionId", this.h);
        hashMap.put("sessionIndex", Integer.valueOf(this.i));
        getClass();
        hashMap.put("storageMechanism", "SQLITE");
        return hashMap;
    }

    public void b() {
        this.h = this.g;
        this.g = e.b();
        this.i++;
        com.meizu.cloud.pushsdk.d.f.c.b(a, "Session information is updated:", new Object[0]);
        com.meizu.cloud.pushsdk.d.f.c.b(a, " + Session ID: %s", this.g);
        com.meizu.cloud.pushsdk.d.f.c.b(a, " + Previous Session ID: %s", this.h);
        com.meizu.cloud.pushsdk.d.f.c.b(a, " + Session Index: %s", Integer.valueOf(this.i));
        c();
    }

    public b(long j, long j2, TimeUnit timeUnit, Context context) {
        this.g = null;
        this.i = 0;
        this.d = timeUnit.toMillis(j);
        this.e = timeUnit.toMillis(j2);
        this.k = context;
        Map a2 = com.meizu.cloud.pushsdk.d.f.a.a("snowplow_session_vars", this.k);
        if (a2 != null) {
            try {
                String obj = a2.get(DeviceInfo.USER_ID).toString();
                String obj2 = a2.get("sessionId").toString();
                int intValue = ((Integer) a2.get("sessionIndex")).intValue();
                this.f = obj;
                this.i = intValue;
                this.g = obj2;
            } catch (Exception e) {
                com.meizu.cloud.pushsdk.d.f.c.a(a, "Exception occurred retrieving session info from file: %s", e.getMessage());
            }
            b();
            this.c = System.currentTimeMillis();
            com.meizu.cloud.pushsdk.d.f.c.c(a, "Tracker Session Object created.", new Object[0]);
        }
        this.f = e.b();
        b();
        this.c = System.currentTimeMillis();
        com.meizu.cloud.pushsdk.d.f.c.c(a, "Tracker Session Object created.", new Object[0]);
    }
}
