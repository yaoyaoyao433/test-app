package com.meituan.android.yoda.plugins;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.util.ArraySet;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.yoda.YodaFaceDetectionResponseListener;
import com.meituan.android.yoda.interfaces.e;
import com.meituan.android.yoda.util.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final d h = new d();
    public final AtomicReference<c> b;
    public Set<e> c;
    public List<YodaFaceDetectionResponseListener> d;
    public Context e;
    public String f;
    public final a g;
    private final AtomicReference<a> i;
    private DFPInfoProvider j;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35986aa34c3ea47be5f890a07e509ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35986aa34c3ea47be5f890a07e509ea2");
            return;
        }
        this.i = new AtomicReference<>();
        this.b = new AtomicReference<>();
        this.c = new ArraySet();
        this.d = new CopyOnWriteArrayList();
        this.e = null;
        this.f = "";
        this.j = null;
        this.g = new a() { // from class: com.meituan.android.yoda.plugins.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.plugins.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7eee46d8ce0b503c56759e2e1610308", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7eee46d8ce0b503c56759e2e1610308");
                }
                if (d.this.j == null && d.this.e != null) {
                    d.this.j = new b(d.this.e);
                }
                return MTGuard.deviceFingerprintData(d.this.j);
            }
        };
    }

    public static d a() {
        return h;
    }

    public final d a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553b1944685cb6930d42be21ec7a986a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553b1944685cb6930d42be21ec7a986a");
        }
        this.i.compareAndSet(null, aVar);
        return this;
    }

    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6691876aa5318c2b781f2e752e449f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6691876aa5318c2b781f2e752e449f");
        }
        if (this.b.get() == null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getNetEnvHook, user env hook = null", true);
            return new c();
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getNetEnvHook, env = " + this.b.get().getNetEnv(), true);
        return this.b.get();
    }

    public final d a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f4f411e6833d639e6a0da0653b3a49", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f4f411e6833d639e6a0da0653b3a49");
        }
        if (cVar == null || this.b.get() == null || this.b.get().getNetEnv() != cVar.getNetEnv()) {
            com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "registerNetEnvHook, env = " + cVar.getNetEnv(), true);
            this.b.set(cVar);
            if (cVar != null && cVar.getNetEnv() != 1) {
                q.a();
            }
            for (e eVar : this.c) {
                eVar.a();
            }
            return this;
        }
        return this;
    }

    public final d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7156a929962c4d9ee319e9f9d26a546e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7156a929962c4d9ee319e9f9d26a546e");
        }
        com.meituan.android.yoda.network.a.a().b();
        return this;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b37d9d805380ab3943dff4fe8ff4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b37d9d805380ab3943dff4fe8ff4c6");
        }
        switch (b().getNetEnv()) {
            case 2:
                com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getURL,mode is stage环境", true);
                return "https://verify.inf.st.meituan.com/";
            case 3:
                com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getURL,mode is 线下dev环境", true);
                return "https://verify.inf.dev.meituan.com/";
            case 4:
                com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getURL,mode is 线下ppe环境", true);
                return "https://verify.inf.test.meituan.com/";
            case 5:
                com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getURL,mode is 线下test环境", true);
                return "https://verify.inf.test.meituan.com/";
            default:
                com.meituan.android.yoda.monitor.log.a.a("YodaPlugins", "getURL,mode is 线上环境", true);
                return "https://verify.meituan.com/";
        }
    }
}
