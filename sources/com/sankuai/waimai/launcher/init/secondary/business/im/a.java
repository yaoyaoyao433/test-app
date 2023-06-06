package com.sankuai.waimai.launcher.init.secondary.business.im;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.f;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.business.page.home.im.HomePageImApi;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.imbase.push.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.imui.session.SessionActivity;
import com.sankuai.xm.network.setting.e;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ImInit";
    }

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c37fa3b15d845aa37c97df99b62bc90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c37fa3b15d845aa37c97df99b62bc90f");
            return;
        }
        final long a2 = b.a(com.sankuai.waimai.imbase.singleton.a.a);
        final long b = b.b(com.sankuai.waimai.imbase.singleton.a.a);
        com.sankuai.waimai.imbase.configuration.a.a().a(new IMClient.g<com.sankuai.xm.ui.entity.b>() { // from class: com.sankuai.waimai.launcher.init.secondary.business.im.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.g
            public final /* synthetic */ void a(com.sankuai.xm.ui.entity.b bVar) {
                com.sankuai.xm.ui.entity.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1628746ca130540dcc52ab67a76e292d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1628746ca130540dcc52ab67a76e292d");
                } else if (bVar2 == null || bVar2.e == null || bVar2.c <= 0 || bVar2.e.getMsgId() == 0) {
                } else {
                    if (bVar2.e.getMsgId() == a2) {
                        b.a(bVar2.e);
                    } else if (bVar2.e.getMsgId() != b) {
                        b.a(bVar2.e);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24fa52d1adeef5c837324bb8209f431f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24fa52d1adeef5c837324bb8209f431f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2abfa1adfd0ec94427f9b46518a1200f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2abfa1adfd0ec94427f9b46518a1200f");
            return;
        }
        com.sankuai.waimai.imbase.b d = com.sankuai.waimai.imbase.b.d();
        com.sankuai.waimai.imbase.a aVar = new com.sankuai.waimai.imbase.a() { // from class: com.sankuai.waimai.launcher.init.secondary.business.im.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cec9c537e29ac604c0bd19bd624db183", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cec9c537e29ac604c0bd19bd624db183");
                    return;
                }
                long j = 500;
                Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
                if (b != null && com.sankuai.waimai.launcher.config.a.a().a(com.sankuai.waimai.foundation.utils.activity.a.a().b())) {
                    j = MetricsAnrManager.ANR_THRESHOLD;
                } else if (b != null && (b.getWindow() == null || b.getWindow().getDecorView() == null || b.getWindow().getDecorView().getWindowToken() == null)) {
                    j = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
                }
                c.c("").schedule(new Runnable() { // from class: com.sankuai.waimai.launcher.init.secondary.business.im.a.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b3d480dcd2bae46a4a11ffa20c8d362e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b3d480dcd2bae46a4a11ffa20c8d362e");
                        } else {
                            a.a();
                        }
                    }
                }, j, TimeUnit.MILLISECONDS);
            }

            @Override // com.sankuai.waimai.imbase.a
            public final void a(Activity activity) {
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb464576d18cc14f3b40e8b645f66c31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb464576d18cc14f3b40e8b645f66c31");
                } else if (activity == null) {
                } else {
                    Intent intent = new Intent(activity, MainActivity.class);
                    intent.putExtra("fragment_id", 0);
                    activity.startActivity(intent);
                }
            }

            @Override // com.sankuai.waimai.imbase.a
            public final boolean b(Activity activity) {
                boolean c;
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "117ee8c786b94861f6fb447b0d80c027", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "117ee8c786b94861f6fb447b0d80c027")).booleanValue();
                }
                if (!(activity instanceof SessionActivity) && !com.sankuai.waimai.launcher.config.a.a().a(activity)) {
                    com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
                    Object[] objArr4 = {activity};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.config.a.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "37e417d8f6bb7611b7fae52138571f0a", RobustBitConfig.DEFAULT_VALUE)) {
                        c = ((Boolean) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "37e417d8f6bb7611b7fae52138571f0a")).booleanValue();
                    } else {
                        c = a2.b != null ? a2.b.c(activity) : false;
                    }
                    if (!c && !com.sankuai.waimai.business.im.api.msgcenter.a.a().isMsgCenter(activity)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.sankuai.waimai.imbase.a
            public final void a(Context context, String str, String str2, String str3, int i, JSONObject jSONObject) {
                Object[] objArr3 = {context, str, str2, str3, Integer.valueOf(i), jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "222fa505d0ea0050404bb900c2653f20", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "222fa505d0ea0050404bb900c2653f20");
                    return;
                }
                com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
                Object[] objArr4 = {context, str, str2, str3, Integer.valueOf(i), jSONObject};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.config.a.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "1cfa2c72adaed34d3a77144840aa2d10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "1cfa2c72adaed34d3a77144840aa2d10");
                } else if (a2.b != null) {
                    a2.b.a(context, str, str2, str3, i, jSONObject);
                }
            }

            @Override // com.sankuai.waimai.imbase.a
            public final void a(long j, String str) {
                Object[] objArr3 = {new Long(j), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c77458c4abe0879652eabca1689e2e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c77458c4abe0879652eabca1689e2e5");
                } else if (TextUtils.isEmpty(str) || j <= 0 || !com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HomePageImApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HomePageImApi.class)).readUploadSystemMsg(j, str), null, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                }
            }

            @Override // com.sankuai.waimai.imbase.a
            public final e c() {
                int i;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62b2f9098194d2e33263d4e112467d5a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62b2f9098194d2e33263d4e112467d5a");
                }
                com.sankuai.waimai.platform.net.c a2 = com.sankuai.waimai.platform.net.c.a();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.net.c.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "37a4c70582a72681c7779b63511348c4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (e) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "37a4c70582a72681c7779b63511348c4");
                }
                i = a2.m.k;
                switch (i) {
                    case 0:
                        return e.ENV_RELEASE;
                    case 1:
                        return e.ENV_STAGING;
                    case 2:
                        return e.ENV_TEST;
                    default:
                        return e.ENV_TEST;
                }
            }

            @Override // com.sankuai.waimai.imbase.a
            public final void a(long j) {
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "655a634265cb2e3edc769b09d49ad096", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "655a634265cb2e3edc769b09d49ad096");
                } else {
                    com.sankuai.waimai.business.user.api.user.a.c = j;
                }
            }

            @Override // com.sankuai.waimai.imbase.a
            public final String b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e475cae50521d0c1000d49cc904f8f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e475cae50521d0c1000d49cc904f8f0") : f.d(com.meituan.android.singleton.b.a);
            }
        };
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.b.a;
        if (PatchProxy.isSupport(objArr3, d, changeQuickRedirect3, false, "72fd33481b746c8f34578fdf95811d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, d, changeQuickRedirect3, false, "72fd33481b746c8f34578fdf95811d82");
            return;
        }
        d.c++;
        d.d = false;
        d.b = aVar;
    }
}
