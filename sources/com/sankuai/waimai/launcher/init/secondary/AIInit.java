package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.b;
import com.sankuai.waimai.alita.modules.f;
import com.sankuai.waimai.alita.platform.init.h;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AIInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context appContext;
    private com.sankuai.waimai.alita.platform.debug.e debugSetting;
    private com.sankuai.waimai.alita.platform.init.h globalConfig;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "AIInit";
    }

    public AIInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bee6b2024aaddcf666f600d0b75efd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bee6b2024aaddcf666f600d0b75efd1");
            return;
        }
        this.globalConfig = new com.sankuai.waimai.alita.platform.init.a() { // from class: com.sankuai.waimai.launcher.init.secondary.AIInit.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String a() {
                return "waimai";
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String g() {
                return "DP";
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "031ca34f0e7942b4ebc46fc0dc2deb0c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "031ca34f0e7942b4ebc46fc0dc2deb0c")).intValue() : AIInit.this.getAlitaVersion();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38edeeba8f831e46c445c544d3f4fdda", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38edeeba8f831e46c445c544d3f4fdda") : com.sankuai.waimai.platform.b.A().i();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c15f7f8f825467518c11ff3da678d6f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c15f7f8f825467518c11ff3da678d6f") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final int e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b84fe69650b47986788f6f16e8ab19be", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b84fe69650b47986788f6f16e8ab19be")).intValue() : com.sankuai.waimai.config.a.a().d();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f26552e60b49df4caae1d1cccf870d1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f26552e60b49df4caae1d1cccf870d1") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0bd2c21cc778065c7a5f053367d29ba5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0bd2c21cc778065c7a5f053367d29ba5") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String j() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c9b5eb2c7b263f5e30ec2dd06c00de60", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c9b5eb2c7b263f5e30ec2dd06c00de60") : com.sankuai.waimai.platform.domain.manager.user.a.i().g();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f9508659090b95258ea24b203b03c88", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f9508659090b95258ea24b203b03c88") : com.sankuai.waimai.platform.b.A().h();
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final h.a l() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62ace9b0e4b5fba159e7de8e765caaa0", RobustBitConfig.DEFAULT_VALUE) ? (h.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62ace9b0e4b5fba159e7de8e765caaa0") : com.sankuai.waimai.foundation.core.a.b() ? h.a.DEVELOP : h.a.RELEASE;
            }

            @Override // com.sankuai.waimai.alita.platform.init.a, com.sankuai.waimai.alita.platform.init.h
            public final String h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa76e001d5bcc8469c6ea2ea7007368d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa76e001d5bcc8469c6ea2ea7007368d") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
            }
        };
        this.debugSetting = new com.sankuai.waimai.alita.platform.debug.e() { // from class: com.sankuai.waimai.launcher.init.secondary.AIInit.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.platform.debug.e
            public final boolean a() {
                boolean z;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca12ed5f195e25ce913ef447fa252e4b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca12ed5f195e25ce913ef447fa252e4b")).booleanValue();
                }
                Context context = AIInit.this.appContext;
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.d.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "11b1a5b527615e1255505c5b4f22c66a", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "11b1a5b527615e1255505c5b4f22c66a")).booleanValue();
                } else {
                    z = com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "alita_debug", false);
                }
                return !z;
            }

            @Override // com.sankuai.waimai.alita.platform.debug.e
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f0d05260265a443966abd486e91c139", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f0d05260265a443966abd486e91c139")).booleanValue();
                }
                Context context = AIInit.this.appContext;
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.d.a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "5dfa224a936f52e63842e3b9415f2d53", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "5dfa224a936f52e63842e3b9415f2d53")).booleanValue() : com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "alita_log_enable", false);
            }

            @Override // com.sankuai.waimai.alita.platform.debug.e
            public final boolean c() {
                boolean z;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56ae76f88e3b1d374d9e04a240b07444", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56ae76f88e3b1d374d9e04a240b07444")).booleanValue();
                }
                if (!com.sankuai.waimai.foundation.core.a.c()) {
                    Context context = AIInit.this.appContext;
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.d.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "acb7ec863a83dec360ed3f42f2d3246e", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "acb7ec863a83dec360ed3f42f2d3246e")).booleanValue();
                    } else {
                        z = com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "alita_horn_develop", true);
                    }
                    if (z) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.sankuai.waimai.alita.platform.debug.e
            public final boolean d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8b2ccae0565c28cb433587f4372a8e8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8b2ccae0565c28cb433587f4372a8e8")).booleanValue();
                }
                Context context = AIInit.this.appContext;
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.d.a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "4093d3b7bb3b54f74f46d72253ae62b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "4093d3b7bb3b54f74f46d72253ae62b0")).booleanValue() : com.sankuai.waimai.foundation.core.a.b() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "alita_data_download_develop", false);
            }
        };
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaca8e4f1339065118af584d1753d4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaca8e4f1339065118af584d1753d4f8");
            return;
        }
        this.appContext = application;
        com.squareup.okhttp.v vVar = new com.squareup.okhttp.v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        com.squareup.okhttp.v a = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        a.a(30L, TimeUnit.SECONDS);
        a.b(30L, TimeUnit.SECONDS);
        a.c(30L, TimeUnit.SECONDS);
        com.meituan.phoenix.b.a("wm_cdn_alita_config").a(new com.sankuai.waimai.platform.net.phoenix.monitor.a()).a(new com.meituan.phoenix_okhttp.c(a));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.platform.init.d.a;
        final com.sankuai.waimai.alita.platform.init.d dVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "64aa22d6be060e90b52b3580068f80f1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.platform.init.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "64aa22d6be060e90b52b3580068f80f1") : new com.sankuai.waimai.alita.platform.init.d();
        dVar.b = this.globalConfig;
        dVar.c = this.debugSetting;
        dVar.d = a;
        dVar.e = com.meituan.android.singleton.i.a("oknv");
        com.sankuai.waimai.alita.platform.a.a().a(application.getApplicationContext(), dVar, new com.sankuai.waimai.alita.platform.init.i() { // from class: com.sankuai.waimai.launcher.init.secondary.AIInit.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.platform.init.i
            public final void a(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d378794ce92d68070719a7b26bed384b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d378794ce92d68070719a7b26bed384b");
                } else if (z) {
                    com.sankuai.waimai.alita.b.a().a(dVar);
                    final com.sankuai.waimai.alita.b a2 = com.sankuai.waimai.alita.b.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.b.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "ebff5dd2d07c7e96468f11877188f81f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "ebff5dd2d07c7e96468f11877188f81f");
                        return;
                    }
                    com.sankuai.waimai.alita.platform.init.b a3 = com.sankuai.waimai.alita.platform.init.b.a();
                    a3.b = "waimai";
                    a3.d = new com.sankuai.waimai.alita.platform.init.f() { // from class: com.sankuai.waimai.alita.b.3
                    };
                    com.sankuai.waimai.alita.platform.init.b a4 = a3.a(new com.sankuai.waimai.alita.platform.init.j() { // from class: com.sankuai.waimai.alita.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.platform.init.j
                        public final List<com.sankuai.waimai.alita.core.jsexecutor.modules.b> a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "db69c0684e87993aeea0498b8dad4c91", RobustBitConfig.DEFAULT_VALUE)) {
                                return (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "db69c0684e87993aeea0498b8dad4c91");
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new f());
                            arrayList.add(new com.sankuai.waimai.alita.modules.e());
                            return arrayList;
                        }
                    });
                    a4.e = new com.sankuai.waimai.alita.platform.init.g() { // from class: com.sankuai.waimai.alita.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.platform.init.g
                        public final com.sankuai.waimai.alita.platform.init.e a() {
                            return null;
                        }

                        @Override // com.sankuai.waimai.alita.platform.init.g
                        public final com.sankuai.waimai.alita.platform.init.e b() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "62d2087637b2cebc2b15063b2decef86", RobustBitConfig.DEFAULT_VALUE)) {
                                return (com.sankuai.waimai.alita.platform.init.e) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "62d2087637b2cebc2b15063b2decef86");
                            }
                            new com.sankuai.waimai.alita.platform.init.e();
                            return null;
                        }
                    };
                    com.sankuai.waimai.platform.utils.l.a(new b.AnonymousClass4(a4), 3000, "start_alita_tag");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAlitaVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfa7394561e8c24772a54e1e4219def0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfa7394561e8c24772a54e1e4219def0")).intValue();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\d+").matcher(com.sankuai.waimai.platform.b.A().i());
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group != null) {
                arrayList.add(Integer.valueOf(group));
            }
        }
        return (((Integer) arrayList.get(0)).intValue() * 100000000) + (((Integer) arrayList.get(1)).intValue() * 10000) + (((Integer) arrayList.get(2)).intValue() * 100);
    }
}
