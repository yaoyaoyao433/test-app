package com.dianping.sdk.pike.agg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    Map<String, String> d;
    int e;
    long f;
    ExecutorService g;

    public static /* synthetic */ void a(c cVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f9e0da87634c1efef41d2dad4e263a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f9e0da87634c1efef41d2dad4e263a5a");
        } else {
            cVar.f = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public Map<String, String> b;
        private String c;
        private String d;
        private int e;
        private long f;
        private ExecutorService g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e7e24ee6b03bacb544b8997a8f1561", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e7e24ee6b03bacb544b8997a8f1561");
                return;
            }
            this.c = "";
            this.d = "";
            this.b = new HashMap();
            this.e = 10;
            this.f = 1L;
            this.g = null;
        }

        public final a a(String str) {
            if (str != null) {
                this.c = str;
            }
            return this;
        }

        public final a b(String str) {
            if (str != null) {
                this.d = str;
            }
            return this;
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12be7a331b93dbcb51d29a69af36e545", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12be7a331b93dbcb51d29a69af36e545");
            }
            c cVar = new c();
            cVar.b = this.c;
            cVar.c = this.d;
            cVar.d = this.b;
            cVar.e = this.e;
            c.a(cVar, this.f);
            cVar.g = this.g;
            return cVar;
        }
    }
}
