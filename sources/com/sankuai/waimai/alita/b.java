package com.sankuai.waimai.alita;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.base.b;
import com.sankuai.waimai.alita.core.base.b;
import com.sankuai.waimai.alita.core.base.g;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.core.datadownload.AlitaTriggerDataDownloadCallback;
import com.sankuai.waimai.alita.core.datadownload.c;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.feature.c;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.persona.c;
import com.sankuai.waimai.alita.platform.a;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public com.sankuai.waimai.ai.base.b b;
    private com.sankuai.waimai.ai.base.a d;

    public static /* synthetic */ List a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "384653e666edce4a2c36ac6245fc7c52", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "384653e666edce4a2c36ac6245fc7c52");
        }
        ArrayList arrayList = new ArrayList();
        ABStrategy strategy = ABTestManager.getInstance().getStrategy("poilist_dynamicPaging_exp", null);
        if (strategy != null && !TextUtils.isEmpty(strategy.getParamWithKey(Constants.JSBundleConstants.KEY_BUNDLE_ID))) {
            arrayList.add(strategy.getParamWithKey(Constants.JSBundleConstants.KEY_BUNDLE_ID));
        }
        ABStrategy strategy2 = ABTestManager.getInstance().getStrategy("mix_dynamicPaging_exp", null);
        if (strategy2 != null && !TextUtils.isEmpty(strategy2.getParamWithKey(Constants.JSBundleConstants.KEY_BUNDLE_ID))) {
            arrayList.add(strategy2.getParamWithKey(Constants.JSBundleConstants.KEY_BUNDLE_ID));
        }
        arrayList.add("alita_waimai-rank-novelty-rt-feature-consume");
        return arrayList;
    }

    public static /* synthetic */ void a(b bVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b18a5ab7cc0700895dba04c4091c5547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b18a5ab7cc0700895dba04c4091c5547");
        } else {
            com.sankuai.waimai.platform.utils.sharedpreference.a.a(j);
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a015a7f87bb3eaba5709cdf075a5ea7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a015a7f87bb3eaba5709cdf075a5ea7d");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public final void a(com.sankuai.waimai.alita.platform.init.d dVar) {
        com.sankuai.waimai.alita.base.b bVar;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a738b71e7852b9ad9b78c689d677e334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a738b71e7852b9ad9b78c689d677e334");
            return;
        }
        this.b = com.sankuai.waimai.ai.base.b.a();
        this.d = new com.sankuai.waimai.ai.base.a();
        this.d.c = this.b;
        com.sankuai.waimai.ai.base.a aVar = this.d;
        com.sankuai.waimai.ai.plugin.a aVar2 = new com.sankuai.waimai.ai.plugin.a();
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ai.base.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "497246e9a1ab5c878c85653c2f469880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "497246e9a1ab5c878c85653c2f469880");
        } else {
            aVar.b.a((com.sankuai.waimai.alita.base.d<String, com.sankuai.waimai.ai.base.c>) aVar2);
            aVar2.b = aVar;
        }
        e eVar = new e("waimai");
        c cVar = new c();
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9067f502020f8ed9a747fa7b4fa21995", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.alita.base.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9067f502020f8ed9a747fa7b4fa21995");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.base.b.a;
            b.a aVar3 = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2d1f80bfd8cbb1937db64e1acadafbe7", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2d1f80bfd8cbb1937db64e1acadafbe7") : new b.a();
            aVar3.b = dVar.b.a();
            aVar3.c = dVar.b.c();
            aVar3.d = String.valueOf(dVar.b.b());
            aVar3.e = String.valueOf(dVar.b.b());
            aVar3.f = dVar.b.d();
            aVar3.g = "android";
            aVar3.h = dVar.b.k();
            aVar3.i = dVar.b.e();
            aVar3.j = dVar.b.f();
            aVar3.k = dVar.b.g();
            aVar3.l = dVar.b.h();
            aVar3.m = dVar.b.i();
            aVar3.n = dVar.b.j();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
            bVar = PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "db40273878ed3ad18bb54830b6e0be03", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.base.b) PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "db40273878ed3ad18bb54830b6e0be03") : new com.sankuai.waimai.alita.base.b(aVar3);
        }
        cVar.b = bVar;
        eVar.a(cVar);
        eVar.a(com.sankuai.waimai.ai.uat.feature.a.b());
        eVar.a(com.sankuai.waimai.ai.uat.feature.b.b());
        this.b.a(com.sankuai.waimai.ai.uat.feature.b.b());
        this.b.a(com.sankuai.waimai.ai.uat.feature.a.b());
        com.sankuai.waimai.alita.persona.b bVar2 = new com.sankuai.waimai.alita.persona.b("waimai");
        com.sankuai.waimai.alita.persona.c a2 = com.sankuai.waimai.alita.persona.c.a();
        Object[] objArr6 = {bVar2};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.alita.persona.c.a;
        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "57c928bc6696e160f7e9ccd5c95d575e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "57c928bc6696e160f7e9ccd5c95d575e");
        } else {
            a2.b.a((com.sankuai.waimai.alita.base.d<String, c.a>) new c.a(bVar2));
        }
        com.sankuai.waimai.ai.persona.poi.b bVar3 = new com.sankuai.waimai.ai.persona.poi.b();
        com.sankuai.waimai.ai.persona.poi.a aVar4 = new com.sankuai.waimai.ai.persona.poi.a();
        bVar2.a(bVar3);
        bVar2.a(aVar4);
        com.sankuai.waimai.alita.platform.a a3 = com.sankuai.waimai.alita.platform.a.a();
        Object[] objArr7 = {eVar};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.alita.platform.a.a;
        if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "54f56df41f155de39fec31a5dd95a8eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "54f56df41f155de39fec31a5dd95a8eb");
        } else if (!a3.c()) {
            com.sankuai.waimai.alita.core.utils.c.a("Alita 功能关闭");
        } else if (!"waimai".equals(eVar.c)) {
            com.sankuai.waimai.alita.core.utils.c.a("外卖过期接口，其他BG不要调用");
        } else {
            com.sankuai.waimai.alita.core.feature.c a4 = com.sankuai.waimai.alita.core.feature.c.a();
            Object[] objArr8 = {eVar};
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.alita.core.feature.c.a;
            if (PatchProxy.isSupport(objArr8, a4, changeQuickRedirect8, false, "f14e829151a4b4b869a8267eea7b6c52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect8, false, "f14e829151a4b4b869a8267eea7b6c52");
            } else {
                a4.b.a((g<String, c.a>) new c.a(eVar));
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.b$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.sankuai.waimai.alita.platform.init.b b;

        public AnonymousClass4(com.sankuai.waimai.alita.platform.init.b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df898753bf24a04c958998eb860c056e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df898753bf24a04c958998eb860c056e");
                return;
            }
            com.sankuai.waimai.alita.core.datadownload.b a2 = com.sankuai.waimai.alita.core.datadownload.b.a();
            AlitaTriggerDataDownloadCallback alitaTriggerDataDownloadCallback = new AlitaTriggerDataDownloadCallback() { // from class: com.sankuai.waimai.alita.b.4.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.datadownload.AlitaTriggerDataDownloadCallback
                @Nullable
                public final com.sankuai.waimai.alita.core.datadownload.c a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db056b2e2975f328b42d92787c335074", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.sankuai.waimai.alita.core.datadownload.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db056b2e2975f328b42d92787c335074");
                    }
                    c.a a3 = com.sankuai.waimai.alita.core.datadownload.c.a(b.this.a(i));
                    String o = com.sankuai.waimai.platform.b.A().o();
                    Object[] objArr3 = {o};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "9c0cc2f0382d4b354d545fcbeec7819a", RobustBitConfig.DEFAULT_VALUE)) {
                        a3 = (c.a) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "9c0cc2f0382d4b354d545fcbeec7819a");
                    } else {
                        a3.a("ctype", o);
                    }
                    String token = UserCenter.getInstance(com.meituan.android.singleton.b.a).getToken();
                    Object[] objArr4 = {token};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "5bcc1f5cdd3c2bd87fd3e7f2f99b65ef", RobustBitConfig.DEFAULT_VALUE)) {
                        a3 = (c.a) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "5bcc1f5cdd3c2bd87fd3e7f2f99b65ef");
                    } else {
                        a3.a("token", token);
                    }
                    a3.b = new com.sankuai.waimai.alita.core.datadownload.d() { // from class: com.sankuai.waimai.alita.b.4.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.datadownload.d
                        public final void a(@NonNull com.sankuai.waimai.alita.core.datadownload.net.a aVar) {
                            Object[] objArr5 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "22f5c4bcaffd03625cc33ded6400b83d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "22f5c4bcaffd03625cc33ded6400b83d");
                            } else {
                                b.a(b.this, System.currentTimeMillis());
                            }
                        }
                    };
                    return a3.a();
                }
            };
            Object[] objArr2 = {"waimai", alitaTriggerDataDownloadCallback};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.datadownload.b.c;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9c398e04a3aa0e4376ff6a1f7e196ab6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9c398e04a3aa0e4376ff6a1f7e196ab6");
            } else if (!AlitaBizConfigUtil.b(4, "waimai")) {
                com.sankuai.waimai.alita.core.datadownload.a a3 = a2.a("waimai");
                if (a3 == null) {
                    a3 = new com.sankuai.waimai.alita.core.datadownload.a("waimai");
                    Object[] objArr3 = {a3};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.base.b.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3ac47bef8307c9f75d867fdf67a835f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3ac47bef8307c9f75d867fdf67a835f0");
                    } else {
                        a2.b.a((g<String, b.a<T>>) new b.a(a3));
                    }
                }
                a3.d = alitaTriggerDataDownloadCallback;
            }
            com.sankuai.waimai.alita.platform.a.a().a(this.b, new a.InterfaceC0717a() { // from class: com.sankuai.waimai.alita.b.4.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.platform.a.InterfaceC0717a
                public final void a(String str, int i, String str2) {
                    Object[] objArr4 = {str, Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "75e84ada17ca20e25850b68f65a1c9ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "75e84ada17ca20e25850b68f65a1c9ce");
                    } else if (i == 0) {
                        com.sankuai.waimai.alita.core.event.autorunner.b a4 = com.sankuai.waimai.alita.core.event.autorunner.b.a();
                        List<String> a5 = b.a(b.this);
                        com.sankuai.waimai.alita.platform.debug.b.a("AlitaEngine.register(): onComplete(): 加载业务自己投放的JsBundle: ");
                        for (String str3 : a5) {
                            if (!TextUtils.isEmpty(str3)) {
                                com.sankuai.waimai.alita.platform.debug.b.a("AlitaEngine.register(): onComplete(): 加载业务自己投放的JsBundle: bundleName = " + str3);
                                a4.a("waimai", str3);
                            }
                        }
                        a4.a(new com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception>() { // from class: com.sankuai.waimai.alita.b.4.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.tasklistener.b
                            public final void a(@NonNull Map<String, b.d<Boolean>> map) {
                                Object[] objArr5 = {map};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "50fd78cd290bdbeea7102c98a7ce4986", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "50fd78cd290bdbeea7102c98a7ce4986");
                                } else if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                                    com.sankuai.waimai.alita.platform.debug.b.a("AlitaEngine.setupBundle(): onAllTaskComplete(): 业务自己投放的JsBundle加载完成: ");
                                    for (Map.Entry<String, b.d<Boolean>> entry : map.entrySet()) {
                                        b.d<Boolean> value = entry.getValue();
                                        StringBuilder sb = new StringBuilder("AlitaEngine.setupBundle(): onAllTaskComplete(): 业务自己投放的JsBundle加载完成: bundle名称 = ");
                                        sb.append(entry.getKey());
                                        sb.append(", 加载结果 = ");
                                        sb.append((value.b == null || !value.b.booleanValue()) ? "失败" : "成功");
                                        sb.append(", 加载状态 = ");
                                        sb.append(com.sankuai.waimai.alita.core.tasklistener.b.a(value.a));
                                        com.sankuai.waimai.alita.platform.debug.b.a(sb.toString());
                                    }
                                    com.sankuai.waimai.alita.platform.debug.b.a("AlitaEngine.setupBundle(): onAllTaskComplete(): 业务自己投放的JsBundle加载完成: ----------------");
                                }
                            }
                        });
                        com.sankuai.waimai.alita.alitarule.a a6 = com.sankuai.waimai.alita.alitarule.a.a();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.alitarule.a.a;
                        if (PatchProxy.isSupport(objArr5, a6, changeQuickRedirect5, false, "ec73b5e4de80e89af4b9d0a0cff17e9d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, a6, changeQuickRedirect5, false, "ec73b5e4de80e89af4b9d0a0cff17e9d");
                        } else {
                            if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                a6.b();
                            }
                            com.sankuai.waimai.platform.domain.manager.user.a.i().a(a6.b);
                        }
                        AlitaRealTimeEventCenter.getInstance().addEventListener("waimai", new com.sankuai.waimai.alita.core.event.c() { // from class: com.sankuai.waimai.alita.b.4.2.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.event.c
                            public final void a(com.sankuai.waimai.alita.core.event.a aVar) {
                                Object[] objArr6 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "48952b75e1cf9ddbfcc5155a21404ca5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "48952b75e1cf9ddbfcc5155a21404ca5");
                                } else if ("AS".equalsIgnoreCase(aVar.a())) {
                                    com.sankuai.waimai.alita.platform.a a7 = com.sankuai.waimai.alita.platform.a.a();
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.alita.platform.a.a;
                                    if (PatchProxy.isSupport(objArr7, a7, changeQuickRedirect7, false, "ef47115dab381a34e564c415043361d2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, a7, changeQuickRedirect7, false, "ef47115dab381a34e564c415043361d2");
                                        return;
                                    }
                                    for (String str4 : com.sankuai.waimai.alita.platform.a.b.keySet()) {
                                        AlitaAutoRunManager a8 = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(str4);
                                        if (a8 != null) {
                                            Object[] objArr8 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect8 = AlitaAutoRunManager.a;
                                            if (PatchProxy.isSupport(objArr8, a8, changeQuickRedirect8, false, "69d6c14be82bb083657fa24cea95e93d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, a8, changeQuickRedirect8, false, "69d6c14be82bb083657fa24cea95e93d");
                                            } else if (a8.e != null && !a8.e.isEmpty()) {
                                                for (Map.Entry<String, com.sankuai.waimai.alita.core.event.autorunner.d> entry : a8.e.entrySet()) {
                                                    com.sankuai.waimai.alita.core.event.autorunner.d value = entry.getValue();
                                                    if (value != null) {
                                                        value.e = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if ("AQ".equalsIgnoreCase(aVar.a())) {
                                    com.sankuai.waimai.alita.platform.a a9 = com.sankuai.waimai.alita.platform.a.a();
                                    Object[] objArr9 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.alita.platform.a.a;
                                    if (PatchProxy.isSupport(objArr9, a9, changeQuickRedirect9, false, "b45f54598336e29ae43431fefef35ef7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr9, a9, changeQuickRedirect9, false, "b45f54598336e29ae43431fefef35ef7");
                                        return;
                                    }
                                    for (String str5 : com.sankuai.waimai.alita.platform.a.b.keySet()) {
                                        AlitaAutoRunManager a10 = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(str5);
                                        if (a10 != null) {
                                            Object[] objArr10 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect10 = AlitaAutoRunManager.a;
                                            if (PatchProxy.isSupport(objArr10, a10, changeQuickRedirect10, false, "3f1a04d867d6095a7a67e5dea206cbd4", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr10, a10, changeQuickRedirect10, false, "3f1a04d867d6095a7a67e5dea206cbd4");
                                            } else if (a10.e != null && !a10.e.isEmpty()) {
                                                for (Map.Entry<String, com.sankuai.waimai.alita.core.event.autorunner.d> entry2 : a10.e.entrySet()) {
                                                    com.sankuai.waimai.alita.core.event.autorunner.d value2 = entry2.getValue();
                                                    if (value2 != null) {
                                                        value2.e = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        long time;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8722120fbc875f4331aa0ee3c4fce7c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8722120fbc875f4331aa0ee3c4fce7c3")).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            long longValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91b755141566067e1a2f0c4c32070c64", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91b755141566067e1a2f0c4c32070c64")).longValue() : com.sankuai.waimai.platform.utils.sharedpreference.a.q();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
            time = simpleDateFormat.parse(simpleDateFormat.format(new Date(longValue))).getTime() + 10800000;
            if (longValue > time) {
                time += 86400000;
            }
        } catch (Exception unused) {
        }
        return System.currentTimeMillis() > time;
    }
}
