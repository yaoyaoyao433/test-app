package com.meituan.msc.modules.preload;

import android.os.SystemClock;
import com.meituan.msc.common.utils.o;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RuntimePreloadReporter {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface PreloadType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends com.meituan.msc.modules.reporter.f {
        public static ChangeQuickRedirect d;
        private final h e;

        public static b a(h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0330970ba6f00106f5273af4db06667", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0330970ba6f00106f5273af4db06667") : new b(hVar);
        }

        private b(h hVar) {
            super(com.meituan.msc.modules.reporter.a.a(hVar));
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff53dba8501b54ae28382569fae8c05f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff53dba8501b54ae28382569fae8c05f");
            } else {
                this.e = hVar;
            }
        }

        public final void a(h hVar, String str, @PreloadType String str2) {
            Object[] objArr = {hVar, str, str2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f04f09515d9ed93af2307abc69d9613", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f04f09515d9ed93af2307abc69d9613");
            } else {
                b("msc.runtime.preload.success.rate").a(1.0d).a("pagePath", str).a("preloadType", str2).a("loadType", hVar.r.C()).a("isReuseBasePreload", Boolean.valueOf(hVar.E)).b();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends MSCReporter {
        public static ChangeQuickRedirect d;

        public static a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad1af969a8473194c795ffb59f24c53f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad1af969a8473194c795ffb59f24c53f") : new a();
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8a331be5ce6682afef678135806379", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8a331be5ce6682afef678135806379");
            } else {
                a("sdkVersion", "1.18.23.2");
            }
        }

        public final void a(h hVar, long j, String str, @PreloadType String str2) {
            Object[] objArr = {hVar, new Long(j), str, str2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399a9379c132cbfd9e514a34a2f221d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399a9379c132cbfd9e514a34a2f221d1");
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - j;
            if (j2 <= 0) {
                com.meituan.msc.modules.reporter.g.d(hVar.b, "reportPreloadDurationError, startTime:", Long.valueOf(j), "endTime:", Long.valueOf(elapsedRealtime), "duration:", Long.valueOf(j2));
            }
            b("msc.runtime.preload.duration").a(com.meituan.msc.modules.reporter.a.a(hVar).a()).a("preloadType", str2).a("pagePath", str).a("isReuseBasePreload", Boolean.valueOf(hVar.E)).a(j2).b();
        }

        public final void f(@PreloadType String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441489ad9bc36fa8cd791c0c38ed5ad0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441489ad9bc36fa8cd791c0c38ed5ad0");
            } else {
                b("msc.runtime.preload.start.count").a("preloadType", str).b();
            }
        }

        public final void a(String str, String str2, @PreloadType String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37351a10622f9921ebae7fe3930f85d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37351a10622f9921ebae7fe3930f85d");
            } else {
                b("msc.runtime.preload.start.count").a("preloadType", str3).a("mscAppId", str).a("pagePath", str2).b();
            }
        }

        public final void a(Throwable th, String str, String str2, @PreloadType String str3) {
            Object[] objArr = {th, str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f13c0e9e5b6c6b755898da60f8fa9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f13c0e9e5b6c6b755898da60f8fa9c");
            } else {
                b("msc.runtime.preload.success.rate").a(0.0d).a("mscAppId", str).a("pagePath", str2).a("preloadType", str3).a("errorCode", Integer.valueOf(o.a(th))).a("errorMsg", o.b(th)).b();
            }
        }
    }
}
