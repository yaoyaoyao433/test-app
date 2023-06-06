package com.dianping.logreportswitcher;

import android.content.Context;
import com.dianping.logreportswitcher.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Context b;
    com.dianping.logreportswitcher.b c;
    public com.dianping.logreportswitcher.utils.d d;
    private AtomicBoolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public static final c a = new c();
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329a53e4d7d0acc12aa094b76355e7b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329a53e4d7d0acc12aa094b76355e7b6");
            return;
        }
        this.e = new AtomicBoolean(true);
        this.d = com.dianping.logreportswitcher.utils.d.a();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341efa4f63eab32746c90225caa7ff15", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341efa4f63eab32746c90225caa7ff15")).booleanValue() : this.c == null || this.c.c();
    }

    public final void a(Context context, com.dianping.logreportswitcher.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7dff158a25a48dbb96d35728550acd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7dff158a25a48dbb96d35728550acd");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = bVar;
        if (this.e.get()) {
            this.e.set(false);
            com.dianping.logreportswitcher.utils.d dVar = this.d;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.logreportswitcher.utils.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6d5031a9063cbe3e6bc084fab55815fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6d5031a9063cbe3e6bc084fab55815fe");
            } else {
                dVar.c = f.a(context);
                long b2 = com.dianping.logreportswitcher.utils.b.b("config_app_verison", -1L);
                if (dVar.c > 0 && dVar.c == b2) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.logreportswitcher.utils.d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "903fa7ff79b7dcd6b2b806acb74af5b4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "903fa7ff79b7dcd6b2b806acb74af5b4");
                    } else {
                        for (String str : com.dianping.logreportswitcher.a.a) {
                            if (com.dianping.logreportswitcher.utils.b.e(str)) {
                                com.dianping.logreportswitcher.utils.d.a().a(str, Boolean.valueOf(com.dianping.logreportswitcher.utils.b.b(str, true)));
                            }
                        }
                        com.dianping.logreportswitcher.utils.d.a().a("hertz_config_key", com.dianping.logreportswitcher.utils.b.f("hertz_config_key"));
                        com.dianping.logreportswitcher.utils.d.a().a("cfg_req_interval_key", Long.valueOf(com.dianping.logreportswitcher.utils.b.b("cfg_req_interval_key", 300000L)));
                        com.dianping.logreportswitcher.utils.d.a().a("appproperties_key", com.dianping.logreportswitcher.utils.b.f("appproperties_key"));
                        com.dianping.logreportswitcher.utils.d.a().a("sample_config_key", com.dianping.logreportswitcher.utils.b.f("sample_config_key"));
                        com.dianping.logreportswitcher.utils.d.a().a("metric_sample_config_key", com.dianping.logreportswitcher.utils.b.f("metric_sample_config_key"));
                        com.dianping.logreportswitcher.utils.d.a().a("config_modified_time_key", Long.valueOf(com.dianping.logreportswitcher.utils.b.d("config_modified_time_key")));
                        com.dianping.logreportswitcher.utils.d.a().a("config_version_key", com.dianping.logreportswitcher.utils.b.f("config_version_key"));
                    }
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.logreportswitcher.utils.d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "391ad72c2bd37c25f671102aa915bbc3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "391ad72c2bd37c25f671102aa915bbc3");
                    } else {
                        for (String str2 : com.dianping.logreportswitcher.a.a) {
                            com.dianping.logreportswitcher.utils.b.c(str2);
                        }
                        com.dianping.logreportswitcher.utils.b.a("hertz_config_key");
                        com.dianping.logreportswitcher.utils.b.b("cfg_req_interval_key");
                        com.dianping.logreportswitcher.utils.b.a("appproperties_key");
                        com.dianping.logreportswitcher.utils.b.a("sample_config_key");
                        com.dianping.logreportswitcher.utils.b.a("metric_sample_config_key");
                        com.dianping.logreportswitcher.utils.b.b("config_modified_time_key");
                        com.dianping.logreportswitcher.utils.b.a("config_version_key");
                    }
                }
            }
            if (com.dianping.logreportswitcher.utils.c.a(context)) {
                d.b("LogReportSwitcher", "1 > close cat , init fetch config ");
                final int nextInt = new Random().nextInt(60000) + 1;
                final ScheduledExecutorService c = com.sankuai.android.jarvis.c.c("LogReportSwitcher.checkUpdate");
                c.schedule(new Runnable() { // from class: com.dianping.logreportswitcher.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "12a671d229f0df7347fd02a206f9e1a9", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "12a671d229f0df7347fd02a206f9e1a9");
                            return;
                        }
                        d.b("LogReportSwitcher", "1 > init fetch time : " + nextInt);
                        com.dianping.logreportswitcher.utils.c.a(c.this.c);
                        c.shutdown();
                    }
                }, nextInt, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29027fc221cd9892dd69997088fc0ce2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29027fc221cd9892dd69997088fc0ce2")).booleanValue() : a(str, true);
    }

    private boolean a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a646a04fb0215a83d59f0f30ea77ee2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a646a04fb0215a83d59f0f30ea77ee2")).booleanValue();
        }
        com.dianping.logreportswitcher.utils.c.b(this.c);
        if (!com.dianping.logreportswitcher.a.a.contains(str)) {
            d.a("LogReportSwitcher", "illegal type:" + str);
            return false;
        }
        return this.d.a(str, true);
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0998721b41d73f3bdbaaa5a8520b93a6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0998721b41d73f3bdbaaa5a8520b93a6") : this.d.c("appproperties_key");
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f36f831904929e68c03fea8ae9eb370c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f36f831904929e68c03fea8ae9eb370c") : this.d.c("metric_sample_config_key");
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f534705ed51aba5bbf8a278f238402", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f534705ed51aba5bbf8a278f238402") : this.d.c("config_version_key");
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b677c0036b6cc5f2edc6efd012279d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b677c0036b6cc5f2edc6efd012279d");
            return;
        }
        try {
            if (com.dianping.logreportswitcher.utils.d.a().a(str) > 0) {
                com.dianping.logreportswitcher.utils.d.a().b();
                com.dianping.logreportswitcher.utils.d.a().b(str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
