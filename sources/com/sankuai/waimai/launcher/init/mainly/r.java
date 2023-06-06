package com.sankuai.waimai.launcher.init.mainly;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.config.a;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class r extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "MsiInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a530a1cb5021fd321af45d8754775b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a530a1cb5021fd321af45d8754775b");
            return;
        }
        com.meituan.msi.log.a.a("msi_init start ");
        long currentTimeMillis = System.currentTimeMillis();
        com.meituan.msi.a.a(application, new com.meituan.msi.provider.d() { // from class: com.sankuai.waimai.launcher.init.mainly.r.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.provider.d
            public final String a() {
                return "10320";
            }

            @Override // com.meituan.msi.provider.d
            public final String c() {
                return "waimai";
            }

            @Override // com.meituan.msi.provider.d
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22567643de3225916fba7d37cf16779f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22567643de3225916fba7d37cf16779f") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.meituan.msi.provider.d
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "521da3d4f52c6209eeb67ee55fbd001b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "521da3d4f52c6209eeb67ee55fbd001b") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.meituan.msi.provider.d
            public final String e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49066f963765a4c45b3546d616925b26", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49066f963765a4c45b3546d616925b26") : com.sankuai.waimai.platform.b.A().B();
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "749f1d2f0b216bdcd6e571e9d652d730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "749f1d2f0b216bdcd6e571e9d652d730");
        } else {
            a.InterfaceC0637a a2 = com.meituan.android.singleton.i.a("defaultnvnetwork");
            final com.meituan.msi.api.network.a aVar = new com.meituan.msi.api.network.a() { // from class: com.sankuai.waimai.launcher.init.mainly.r.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.network.a
                public final double a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ecb515c6e1b64861730210246fc6c7e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ecb515c6e1b64861730210246fc6c7e")).doubleValue();
                    }
                    com.dianping.nvnetwork.shark.monitor.h a3 = com.dianping.nvnetwork.shark.monitor.h.a();
                    if (a3 != null) {
                        return a3.b();
                    }
                    return -1.0d;
                }

                @Override // com.meituan.msi.api.network.a
                public final double b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39c31dff9c6468c69a1ceb982708ea94", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39c31dff9c6468c69a1ceb982708ea94")).doubleValue();
                    }
                    com.dianping.nvnetwork.shark.monitor.h a3 = com.dianping.nvnetwork.shark.monitor.h.a();
                    if (a3 != null) {
                        return a3.d();
                    }
                    return -1.0d;
                }
            };
            com.meituan.msi.util.l.a(a2, aVar);
            com.sankuai.meituan.kernel.net.msi.config.b.a().a(new a.C0590a().a(a2).a(new com.sankuai.meituan.kernel.net.msi.c() { // from class: com.sankuai.waimai.launcher.init.mainly.r.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.kernel.net.msi.c
                public final double c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f4d0aab0195ae5773e3dea07a10c31e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f4d0aab0195ae5773e3dea07a10c31e")).doubleValue();
                    }
                    return -1.0d;
                }

                @Override // com.sankuai.meituan.kernel.net.msi.c
                public final double a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a41ec21f168f8c5e997d9cd142cc05b", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a41ec21f168f8c5e997d9cd142cc05b")).doubleValue() : aVar.a();
                }

                @Override // com.sankuai.meituan.kernel.net.msi.c
                public final double b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9b7d0ac76d91025033130bf08159355", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9b7d0ac76d91025033130bf08159355")).doubleValue() : aVar.b();
                }
            }).a());
        }
        com.meituan.msi.a.a(new com.meituan.msi.location.c() { // from class: com.sankuai.waimai.launcher.init.mainly.r.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.location.c
            public final com.meituan.msi.location.b a(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
                Object[] objArr3 = {activity, cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe4e1d2a4b30a1c242f253020a9e8a45", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe4e1d2a4b30a1c242f253020a9e8a45") : new com.sankuai.waimai.mmp.d(activity, cVar);
            }
        });
        com.meituan.msi.a.a(new com.meituan.msi.api.setting.a() { // from class: com.sankuai.waimai.launcher.init.mainly.r.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.setting.a
            public final com.meituan.msi.api.setting.c a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d15dd051a34be95945bf6cb166a60fc2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.api.setting.c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d15dd051a34be95945bf6cb166a60fc2") : new com.meituan.msi.api.setting.c(TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().b(), "0"), TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().c(), "0"));
            }
        });
        com.meituan.msi.a.a(11);
        com.meituan.android.msi.knb.event.a.a().b();
        com.meituan.msi.a.a(com.sankuai.meituan.takeoutnew.a.a);
        com.meituan.msi.log.a.a("msi_init cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
