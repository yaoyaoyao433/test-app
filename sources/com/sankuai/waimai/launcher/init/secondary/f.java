package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CSInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df486d6f02231cb12fb5fddcfc1aa5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df486d6f02231cb12fb5fddcfc1aa5be");
        } else {
            application.registerActivityLifecycleCallbacks(com.meituan.android.customerservice.kit.utils.d.a());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b05604d1f909c913a02f6d0102458f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b05604d1f909c913a02f6d0102458f5");
            return;
        }
        com.meituan.android.customerservice.channel.voip.utils.b.b = new com.meituan.android.customerservice.channel.voip.utils.a() { // from class: com.sankuai.waimai.launcher.init.secondary.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e34f767a738b6b5c9dfa5ea04b0f147", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e34f767a738b6b5c9dfa5ea04b0f147")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1bf33e9ed6f76e394f743b384f87a82", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1bf33e9ed6f76e394f743b384f87a82") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "771bee91db546183a37cd231b11bd985", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "771bee91db546183a37cd231b11bd985") : com.sankuai.waimai.platform.domain.manager.user.a.i().g();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2c9c15e320450354d0b2ce4b5babdcc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2c9c15e320450354d0b2ce4b5babdcc") : com.sankuai.waimai.platform.domain.manager.user.a.i().f();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final boolean e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "661b97d600cc4ec3736bcbba060f7548", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "661b97d600cc4ec3736bcbba060f7548")).booleanValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final String f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4dfe21551b17676c910842dbc6bc408", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4dfe21551b17676c910842dbc6bc408") : com.sankuai.waimai.platform.b.A().i();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final int g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cc6380b489e5173fe3b9fc50085e842", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cc6380b489e5173fe3b9fc50085e842")).intValue() : com.sankuai.waimai.config.a.a().d();
            }

            @Override // com.meituan.android.customerservice.channel.voip.utils.a
            public final String h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5013328215348a6f3aed9df3e9ce1e1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5013328215348a6f3aed9df3e9ce1e1a") : com.sankuai.waimai.foundation.location.v2.g.a().n() != null ? com.sankuai.waimai.foundation.location.v2.g.a().n().getCityName() : "";
            }
        };
        com.meituan.android.customerservice.channel.voip.d a2 = com.meituan.android.customerservice.channel.voip.d.a();
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.channel.voip.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "737be4f9559d78d618245f08c24061e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "737be4f9559d78d618245f08c24061e5");
        } else {
            a2.b = application.getApplicationContext();
            com.meituan.android.customerservice.channel.voip.c.a().b = a2.b;
            a2.b.registerReceiver(a2.e, new IntentFilter("csc:csc_voip_status"));
        }
        UserCenter.getInstance(application).loginEventObservable().c(new rx.functions.b<UserCenter.c>() { // from class: com.sankuai.waimai.launcher.init.secondary.f.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(UserCenter.c cVar) {
                UserCenter.c cVar2 = cVar;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ba91e2060167cccad27b4c6a95c845e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ba91e2060167cccad27b4c6a95c845e");
                } else if (cVar2.b == UserCenter.d.logout) {
                    com.meituan.android.customerservice.channel.voip.d a3 = com.meituan.android.customerservice.channel.voip.d.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.customerservice.channel.voip.d.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "4f5d7fac51fa67a9205f77292a0f96a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "4f5d7fac51fa67a9205f77292a0f96a8");
                    } else {
                        com.meituan.android.customerservice.utils.c.a(a3.getClass(), "send logout broadcast");
                        Intent intent = new Intent();
                        intent.setAction("voip_login_out_action");
                        LocalBroadcastManager.getInstance(a3.b).sendBroadcast(intent);
                    }
                    if (com.meituan.android.customerservice.floating.a.b != null) {
                        com.meituan.android.customerservice.floating.a.b.c("all");
                    }
                }
            }
        });
        com.meituan.android.customerservice.utils.b.b = new com.meituan.android.customerservice.utils.a() { // from class: com.sankuai.waimai.launcher.init.secondary.f.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.utils.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7cd01a201ea2041985ab1a6215d06a2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7cd01a201ea2041985ab1a6215d06a2")).booleanValue();
                }
                if (com.sankuai.waimai.foundation.core.a.b()) {
                    return com.sankuai.waimai.platform.net.c.a().c();
                }
                return false;
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final String b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6461642f239f3fd34032f7f29af471b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6461642f239f3fd34032f7f29af471b5") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final String c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ece689551431294c47babf5ea9242384", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ece689551431294c47babf5ea9242384") : com.sankuai.waimai.platform.b.A().i();
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final int d() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10cc9e01502d47a59bca6b11ceb66a8c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10cc9e01502d47a59bca6b11ceb66a8c")).intValue() : com.dianping.nvnetwork.g.a();
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final String e() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "848398e64291f2601e09961d28a75a4a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "848398e64291f2601e09961d28a75a4a") : com.dianping.nvnetwork.g.j();
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final void a(Context context, String str) {
                Object[] objArr3 = {context, str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c68a414cd034014c3ca334c86176997c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c68a414cd034014c3ca334c86176997c");
                } else {
                    com.sankuai.waimai.router.a.a(new com.sankuai.waimai.router.core.j(context, str).a("com.sankuai.waimai.router.activity.flags", (String) Integer.valueOf((int) com.tencent.mapsdk.internal.y.a)));
                }
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final HashMap<String, int[]> f() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14a06bc2cd02508bd3346768174b9fa2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (HashMap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14a06bc2cd02508bd3346768174b9fa2");
                }
                HashMap<String, int[]> hashMap = new HashMap<>();
                hashMap.put("im", new int[]{85, com.sankuai.waimai.foundation.utils.g.a(application.getApplicationContext(), 4.0f), com.sankuai.waimai.foundation.utils.g.a(application.getApplicationContext(), 166.0f)});
                return hashMap;
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final HashMap<String, Boolean> g() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b83db26576bb40707d0525a70ef12d5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (HashMap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b83db26576bb40707d0525a70ef12d5");
                }
                HashMap<String, Boolean> hashMap = new HashMap<>();
                hashMap.put("im", Boolean.FALSE);
                return hashMap;
            }

            @Override // com.meituan.android.customerservice.utils.a
            public final Drawable h() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca205f7e04ab97476274a2ff593e2648", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca205f7e04ab97476274a2ff593e2648") : com.meituan.android.singleton.b.a.getDrawable(R.drawable.cs_floating_icon);
            }
        };
        com.meituan.android.customerservice.floating.a.a(application.getApplicationContext());
    }
}
