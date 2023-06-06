package com.sankuai.xm.im.cache;

import android.support.annotation.NonNull;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.xm.base.util.q;
import com.sankuai.xm.im.IMClient;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends q {
    public static ChangeQuickRedirect h;
    private static volatile a i;
    private boolean j;
    private long k;
    private C1385a l;

    public static a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb9adf62d882b9ce342a136646f0b029", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb9adf62d882b9ce342a136646f0b029");
        }
        if (i == null) {
            synchronized (IMClient.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72cffce8905e5126a2ca3a54a709eaf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72cffce8905e5126a2ca3a54a709eaf2");
            return;
        }
        this.j = true;
        this.l = new C1385a();
        a("cache_valid_config", false, true);
    }

    public final boolean a(long j) {
        long c;
        int i2;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2b7e4aca4b36c3ebbb843a1440b21e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2b7e4aca4b36c3ebbb843a1440b21e")).booleanValue();
        }
        if (b(j)) {
            long n = com.sankuai.xm.base.f.m().n();
            int i3 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if ((i3 == 0 || n == -1 || (i3 > 0 && n < e())) && ((c = DBProxy.l().c(j)) == 0 || (i2 > 0 && c < e()))) {
                return true;
            }
            this.l.c = 2;
            com.sankuai.xm.im.utils.a.a("CacheStatusController", "cacheValid", "invalid, reason:%s, interval=%d", Integer.valueOf(this.l.c), Long.valueOf(n));
            return false;
        }
        return true;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ceb717eb065bb6d7586cd45de236043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ceb717eb065bb6d7586cd45de236043");
        } else if (this.l.c == 2) {
            IMClient.a().a(-1);
            this.l.c = 1;
        }
    }

    private synchronized boolean b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb09579986113acd18a83d8fea33abc7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb09579986113acd18a83d8fea33abc7")).booleanValue();
        }
        if (this.l.b != 0 && (this.l.b == j || j == 0)) {
            return this.j && this.l.c == 0;
        }
        com.sankuai.xm.im.utils.a.a("CacheStatusController", PayLabelConstants.KEY_LABEL_CHECK, "status.uid=%d, uid=%d", Long.valueOf(this.l.b), Long.valueOf(j));
        C1385a c1385a = this.l;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = C1385a.a;
        if (PatchProxy.isSupport(objArr2, c1385a, changeQuickRedirect2, false, "f58b1730ed41ba98dfdcfa45bbd21837", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, c1385a, changeQuickRedirect2, false, "f58b1730ed41ba98dfdcfa45bbd21837");
        } else {
            c1385a.b = j;
            c1385a.c = 0;
        }
        return this.j;
    }

    private long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb77aea0be4a1f9c84f253091c776a9", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb77aea0be4a1f9c84f253091c776a9")).longValue();
        }
        if (this.k == 0) {
            try {
                a(new JSONObject(com.sankuai.xm.base.hornconfig.a.a().a("cache_valid_config")));
            } catch (JSONException unused) {
                this.k = 2592000000L;
            }
        }
        return this.k;
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "086ff61d39b0955bfa2c88a584bb0bef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "086ff61d39b0955bfa2c88a584bb0bef");
            return;
        }
        super.b();
        a(this.f);
    }

    private void a(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62380c1df48d9d9ceb93e616f78868ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62380c1df48d9d9ceb93e616f78868ad");
            return;
        }
        this.j = jSONObject.optBoolean(MarketingModel.TYPE_ENTER_DIALOG, true);
        long optLong = jSONObject.optLong("interval", 2592000000L);
        long j = optLong >= DDLoadConstants.CACHE_INVALID_TIME ? optLong : 2592000000L;
        this.k = j;
        com.sankuai.xm.im.utils.a.a("CacheStatusController", "parseConfig", "%s, interval=%d", jSONObject, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1385a {
        public static ChangeQuickRedirect a;
        public volatile long b;
        public volatile int c;

        private C1385a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b572b8c0729106b114ab40777ec2077b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b572b8c0729106b114ab40777ec2077b");
            }
        }
    }
}
