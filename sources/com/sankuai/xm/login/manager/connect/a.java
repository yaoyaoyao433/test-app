package com.sankuai.xm.login.manager.connect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private final int b;
    private AtomicInteger c;

    private long a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f629319810883a96bd1015c00a68922e", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f629319810883a96bd1015c00a68922e")).longValue();
        }
        long j = 1;
        long j2 = 0;
        if (i == 0) {
            j = 0;
        } else if (i != 1) {
            int i2 = 2;
            long j3 = 1;
            j = 0;
            while (i2 <= i) {
                j = j2 + j3;
                i2++;
                j2 = j3;
                j3 = j;
            }
        }
        return j * 1000;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd39c5f7cbc0ba80a598b3f7b7e3fc6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd39c5f7cbc0ba80a598b3f7b7e3fc6e");
            return;
        }
        this.b = 3;
        this.c = new AtomicInteger(0);
    }

    @Override // com.sankuai.xm.login.manager.connect.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c80001db5013302f65efe136ea74b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c80001db5013302f65efe136ea74b6");
        } else {
            this.c.getAndSet(0);
        }
    }

    @Override // com.sankuai.xm.login.manager.connect.c
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8f1025f8f51b69fd0eb630fcc4f227", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8f1025f8f51b69fd0eb630fcc4f227")).intValue() : this.c.incrementAndGet();
    }

    @Override // com.sankuai.xm.login.manager.connect.c
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae46d479887acfb5cd37ab76c92cf09d", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae46d479887acfb5cd37ab76c92cf09d")).longValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eda4bda11b44b2e1a797c0146a1d290", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eda4bda11b44b2e1a797c0146a1d290")).intValue() : this.c.addAndGet(0);
        com.sankuai.xm.login.d.b("DefaultRetryPolicy::getNextRetryDelay:: " + intValue);
        if (f.m().i()) {
            return a(intValue);
        }
        if (intValue > 3) {
            com.sankuai.xm.login.d.a("DefaultRetryPolicy::getNextRetryDelay:: retry_count > " + intValue);
            return Long.MAX_VALUE;
        }
        Object[] objArr3 = {Integer.valueOf(intValue)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "558f8afe6e2411f02ea3651f63c93e60", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "558f8afe6e2411f02ea3651f63c93e60")).longValue();
        }
        if (intValue == 0) {
            return 0L;
        }
        return ((int) Math.pow(2.0d, intValue - 1)) * 1000;
    }
}
