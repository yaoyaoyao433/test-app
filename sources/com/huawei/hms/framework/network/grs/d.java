package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.c.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    private static final String a = "d";
    private static ExecutorService b = ExecutorsUtils.newCachedThreadPool("GRS_GrsClient-Init");
    private GrsBaseInfo c;
    private boolean d = false;
    private final Object e = new Object();
    private Context f;
    private m g;
    private com.huawei.hms.framework.network.grs.a.a h;
    private com.huawei.hms.framework.network.grs.a.c i;
    private com.huawei.hms.framework.network.grs.a.c j;
    private a k;
    private Future<Boolean> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, GrsBaseInfo grsBaseInfo) {
        this.f = context.getApplicationContext();
        a(grsBaseInfo);
        if (this.d) {
            return;
        }
        synchronized (this.e) {
            if (!this.d) {
                GrsBaseInfo grsBaseInfo2 = this.c;
                this.l = b.submit(new c(this, this.f, grsBaseInfo2, context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(GrsBaseInfo grsBaseInfo) {
        a(grsBaseInfo);
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.c = grsBaseInfo.m6clone();
        } catch (CloneNotSupportedException e) {
            Logger.w(a, "GrsClient catch CloneNotSupportedException", e);
            this.c = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(a, "sp's content is empty.");
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith("time")) {
                String a2 = this.i.a(str, "");
                long j = 0;
                if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
                    try {
                        j = Long.parseLong(a2);
                    } catch (NumberFormatException e) {
                        Logger.w(a, "convert expire time from String to Long catch NumberFormatException.", e);
                    }
                }
                if (!a(j)) {
                    Logger.i(a, "init interface auto clear some invalid sp's data.");
                    this.i.a(str.substring(0, str.length() - 4));
                    this.i.a(str);
                }
            }
        }
    }

    private boolean a(long j) {
        return System.currentTimeMillis() - j <= 604800000;
    }

    private boolean d() {
        try {
            if (this.l != null) {
                return this.l.get(10L, TimeUnit.SECONDS).booleanValue();
            }
            return false;
        } catch (InterruptedException e) {
            Logger.w(a, "init compute task interrupted.", e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(a, "init compute task canceled.");
            return false;
        } catch (ExecutionException e2) {
            Logger.w(a, "init compute task failed.", e2);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(a, "init compute task timed out");
            return false;
        } catch (Exception e3) {
            Logger.w(a, "init compute task occur unknown Exception", e3);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        if (this.c == null || str == null || str2 == null) {
            Logger.w(a, "invalid para!");
            return null;
        } else if (d()) {
            return this.k.a(str, str2, this.f);
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> a(String str) {
        if (this.c != null && str != null) {
            return d() ? this.k.a(str, this.f) : new HashMap();
        }
        Logger.w(a, "invalid para!");
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(a, "IQueryUrlsCallBack is must not null for process continue.");
        } else if (this.c == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (d()) {
            this.k.a(str, iQueryUrlsCallBack, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(a, "IQueryUrlCallBack is must not null for process continue.");
        } else if (this.c == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (d()) {
            this.k.a(str, str2, iQueryUrlCallBack, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass() && (obj instanceof d)) {
            return this.c.compare(((d) obj).c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (d()) {
            String grsParasKey = this.c.getGrsParasKey(false, true, this.f);
            this.i.a(grsParasKey);
            com.huawei.hms.framework.network.grs.a.c cVar = this.i;
            cVar.a(grsParasKey + "time");
            this.g.a(grsParasKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!d() || (grsBaseInfo = this.c) == null || (context = this.f) == null) {
            return false;
        }
        this.h.a(grsBaseInfo, context);
        return true;
    }
}
