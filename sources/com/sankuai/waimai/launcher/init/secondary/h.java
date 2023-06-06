package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends AbsInit {
    public static ChangeQuickRedirect a;
    private static final List<String> b = Arrays.asList("cmcc", "market", "meituaninternaltest");

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CheckUpdateInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c7849cb4d1fc11bed43c7a893a0a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c7849cb4d1fc11bed43c7a893a0a47");
            return;
        }
        final com.meituan.android.upgrade.e a2 = com.meituan.android.upgrade.e.a();
        com.meituan.android.upgrade.b bVar = new com.meituan.android.upgrade.b() { // from class: com.sankuai.waimai.launcher.init.secondary.h.1
            public static ChangeQuickRedirect a;
            private boolean c = false;

            @Override // com.meituan.android.upgrade.b
            public final String a() {
                return "waimai";
            }

            @Override // com.meituan.android.upgrade.b
            public final String b() {
                return "638c81261479c2104ede3f2518e91725";
            }

            @Override // com.meituan.android.upgrade.b
            public final String k() {
                return "meituanwaimai";
            }

            @Override // com.meituan.android.upgrade.b
            public final long g() {
                return com.meituan.android.base.a.e;
            }

            @Override // com.meituan.android.upgrade.b
            public final a.InterfaceC0637a c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2ca10994fa0604d26b10d699e5a93d3", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2ca10994fa0604d26b10d699e5a93d3") : com.meituan.android.singleton.i.a("oknv");
            }

            @Override // com.meituan.android.upgrade.b
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "435cacce0b47dea8fa28ec2fc9326a99", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "435cacce0b47dea8fa28ec2fc9326a99") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            }

            @Override // com.meituan.android.upgrade.b
            public final String e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13e8246882bead0d66b934db4e339960", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13e8246882bead0d66b934db4e339960");
                }
                if (this.c) {
                    return "";
                }
                this.c = true;
                String c = com.sankuai.waimai.platform.b.A().c();
                this.c = false;
                return c;
            }

            @Override // com.meituan.android.upgrade.b
            public final String i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cf252d7b0102ff59fe8728e82771335", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cf252d7b0102ff59fe8728e82771335") : String.valueOf(com.meituan.android.singleton.a.a().b());
            }

            @Override // com.meituan.android.upgrade.b
            public final String h() {
                return com.meituan.android.base.a.f;
            }

            @Override // com.meituan.android.upgrade.b
            public final com.meituan.android.upgrade.f f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd1423b5ec2b537e60a5dcf7a282c7fd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.android.upgrade.f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd1423b5ec2b537e60a5dcf7a282c7fd");
                }
                com.meituan.android.upgrade.f fVar = new com.meituan.android.upgrade.f();
                fVar.j = R.drawable.wm_ic_launcher;
                fVar.m = R.drawable.wm_ic_launcher;
                fVar.l = R.drawable.wm_ic_launcher;
                fVar.r = "您已连接Wi-Fi，可以放心下载";
                return fVar;
            }

            @Override // com.meituan.android.upgrade.b
            public final boolean j() {
                com.meituan.android.base.setting.a aVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89caaaab5f1c78fe15bb7f2e876dcc24", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89caaaab5f1c78fe15bb7f2e876dcc24")).booleanValue();
                }
                if (!h.b.contains(com.meituan.android.base.a.f)) {
                    boolean a3 = com.sankuai.android.spawn.utils.d.a(com.meituan.android.singleton.b.a);
                    boolean a4 = h.this.a();
                    Context context = com.meituan.android.singleton.b.a;
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.base.setting.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2c0bdefcd6fab37e931dad4457d35ca2", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (com.meituan.android.base.setting.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2c0bdefcd6fab37e931dad4457d35ca2");
                    } else {
                        if (com.meituan.android.base.setting.a.c == null) {
                            com.meituan.android.base.setting.a.c = new com.meituan.android.base.setting.a(context);
                        }
                        aVar = com.meituan.android.base.setting.a.c;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.base.setting.a.a;
                    boolean booleanValue = PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "dd43500def5a1d27b27f21a8883b8c41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "dd43500def5a1d27b27f21a8883b8c41")).booleanValue() : aVar.b.b("settings_auto_download_mode", true, "settings");
                    if (a3 && a4 && booleanValue) {
                        return true;
                    }
                }
                return false;
            }
        };
        Object[] objArr2 = {application, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.upgrade.e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4f371279626230d6187905b72f9ffe47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4f371279626230d6187905b72f9ffe47");
        } else if (application == null) {
            throw new IllegalArgumentException("context and config can not be null");
        } else {
            a2.b = application.getApplicationContext();
            a2.c = bVar;
            Application application2 = (Application) a2.b;
            Object[] objArr3 = {application2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.upgrade.e.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "c5dd74af22abe095ff53ef4012b092e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "c5dd74af22abe095ff53ef4012b092e2");
            } else if (application2 != null) {
                com.meituan.android.uptodate.util.h a3 = com.meituan.android.uptodate.util.h.a();
                Object[] objArr4 = {application2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.uptodate.util.h.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "59b766664d0e70b41bb3a785190b00a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "59b766664d0e70b41bb3a785190b00a9");
                } else if (application2 != null) {
                    application2.registerActivityLifecycleCallbacks(a3.b);
                }
            }
            a2.e = bVar.g();
            if (a2.e <= 0) {
                try {
                    a2.e = com.meituan.android.uptodate.util.g.a(a2.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (a2.e != a2.d().b("current_version_code", 0L)) {
                a2.d().a("current_version_code", a2.e);
                a2.d().a("current_version_exists_time", System.currentTimeMillis());
            }
            com.meituan.android.uptodate.util.e.a("UpgradeManager.init(）");
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.upgrade.e.a;
            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "941a4dc82596c01e5bfccac81803e3fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "941a4dc82596c01e5bfccac81803e3fd");
            } else {
                a2.i.schedule(new Runnable() { // from class: com.meituan.android.upgrade.e.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f59b4ee64702c8810e0349e0fcb76e30", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f59b4ee64702c8810e0349e0fcb76e30");
                        } else {
                            e.d(a2);
                        }
                    }
                }, 5L, TimeUnit.SECONDS);
            }
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4bc7acdb2b5db1172af4666fc8a81a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4bc7acdb2b5db1172af4666fc8a81a")).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }
}
