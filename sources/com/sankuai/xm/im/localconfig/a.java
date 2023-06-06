package com.sankuai.xm.im.localconfig;

import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.q;
import com.sankuai.xm.im.IMClient;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends q {
    public static ChangeQuickRedirect h;
    private static a i;
    private boolean j;
    private long k;
    private int l;
    private long m;
    private boolean n;
    private long o;
    private boolean p;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436bbe4ce4dfb1fc1cdc8497f4fbf171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436bbe4ce4dfb1fc1cdc8497f4fbf171");
            return;
        }
        this.j = true;
        this.k = MetricsAnrManager.ANR_THRESHOLD;
        this.l = 15;
        this.m = 300000L;
        this.n = true;
        this.o = MetricsAnrManager.ANR_THRESHOLD;
        this.p = true;
    }

    public static a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40f0d3a96a6fdd1c769ed387698200e4", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40f0d3a96a6fdd1c769ed387698200e4");
        }
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f1af49645cf0e9cd5f3b75890aa369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f1af49645cf0e9cd5f3b75890aa369");
        } else {
            super.a("message_retry", true, true);
        }
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c834bbfc91aab1783a70720ce000e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c834bbfc91aab1783a70720ce000e3");
            return;
        }
        synchronized (this) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.e.length()) {
                    z = false;
                    break;
                }
                JSONObject jSONObject = this.e.getJSONObject(i2);
                if (((short) jSONObject.optLong("appid", 0L)) == IMClient.a().g()) {
                    this.j = jSONObject.optInt("isopen", 1) == 1;
                    this.n = jSONObject.optInt("sendmsgretry", 1) == 1;
                    this.p = jSONObject.optInt("loginretry", 1) == 1;
                    this.l = jSONObject.optInt("retrycount", 15);
                    this.k = jSONObject.optLong("retrytime", MetricsAnrManager.ANR_THRESHOLD);
                    this.m = jSONObject.optLong("totaltime", 300000L);
                    this.o = jSONObject.optLong("sendmsgretrytime", MetricsAnrManager.ANR_THRESHOLD);
                    z = true;
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f583a6eb08bcebf22c825643b9868964", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f583a6eb08bcebf22c825643b9868964");
            return;
        }
        synchronized (this) {
            this.j = true;
            this.k = MetricsAnrManager.ANR_THRESHOLD;
            this.l = 15;
            this.m = 300000L;
            this.n = true;
            this.o = MetricsAnrManager.ANR_THRESHOLD;
            this.p = true;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this) {
            z = this.j && this.n;
        }
        return z;
    }

    public final boolean g() {
        boolean z;
        synchronized (this) {
            z = this.j && this.p;
        }
        return z;
    }

    public final long h() {
        long j;
        synchronized (this) {
            j = this.k;
        }
        return j;
    }

    public final long i() {
        long j;
        synchronized (this) {
            j = this.o;
        }
        return j;
    }

    public final long j() {
        long j;
        synchronized (this) {
            j = this.m;
        }
        return j;
    }

    public final int k() {
        int i2;
        synchronized (this) {
            i2 = this.l;
        }
        return i2;
    }
}
