package com.sankuai.waimai.store.util.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.report.j;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.util.monitor.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1331b {
        public IMonitor a;
        public String b;
        public String c;
        public boolean d = true;
        public String e;
        public Map<String, String> f;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "315ff5635c82f90416e74e7f6b85c760", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "315ff5635c82f90416e74e7f6b85c760") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final C1331b b;
        public final j c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107594c7b114c56d60e15d5f2ed4a1a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107594c7b114c56d60e15d5f2ed4a1a7");
                return;
            }
            this.b = new C1331b();
            this.c = new j();
        }

        public final a a(IMonitor iMonitor) {
            this.b.a = iMonitor;
            return this;
        }

        public final a a(String str) {
            this.b.b = str;
            return this;
        }

        public final a b(String str) {
            this.b.c = str;
            return this;
        }

        public final a c(String str) {
            this.b.e = str;
            return this;
        }

        public final a a(boolean z) {
            this.b.d = z;
            return this;
        }

        public final a a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9047d15ab0fd3ba601cb1e6f2fb49981", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9047d15ab0fd3ba601cb1e6f2fb49981");
            }
            if (map == null) {
                return this;
            }
            if (this.b.f == null) {
                this.b.f = new HashMap();
            }
            this.b.f.putAll(map);
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d72a26d93e2350c44e380aa2df75cf8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d72a26d93e2350c44e380aa2df75cf8");
            }
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (this.b.f == null) {
                this.b.f = new HashMap();
            }
            this.b.f.put(str, str2);
            return this;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03c495624ba152f226caf2eae80e5e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03c495624ba152f226caf2eae80e5e1");
                return;
            }
            try {
                if (this.b.a == null) {
                    throw new RuntimeException("监控上报类不能为空");
                }
                this.c.a(this.b);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }
}
