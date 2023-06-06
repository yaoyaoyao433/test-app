package com.meituan.msc.modules.api.msi;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.container.s;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.k;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.module.ApiModule;
import com.meituan.msi.module.OnWindowInfoChangedEvent;
import com.meituan.msi.page.IPage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g extends k implements com.meituan.msc.modules.api.msi.permission.a, com.meituan.msi.dispather.d {
    public static ChangeQuickRedirect a;
    protected ApiPortal b;
    public com.meituan.msc.modules.api.msi.permission.d c;
    protected f d;
    private ContainerInfo e;
    private h f;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8424a3e5cddcdf73ebcb242a625470", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8424a3e5cddcdf73ebcb242a625470");
            return;
        }
        this.b = null;
        this.e = null;
        this.f = null;
    }

    public static /* synthetic */ String a(g gVar, Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "c0add77692c5b729236c28f813bfd765", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "c0add77692c5b729236c28f813bfd765") : (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdbf6ba6c8836d2471b6c35b674fe396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdbf6ba6c8836d2471b6c35b674fe396");
            return;
        }
        this.f = hVar;
        this.c = new com.meituan.msc.modules.api.msi.permission.d(hVar);
        this.e = new ContainerInfo("1.0.1.18.23.2", ContainerInfo.ENV_MSC, hVar.a());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "159573a6c0e4f0ab1f448e6f920d3b72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "159573a6c0e4f0ab1f448e6f920d3b72");
        } else {
            ApiPortal.a aVar = new ApiPortal.a();
            aVar.a(new a());
            aVar.a(new com.meituan.msc.modules.api.msi.env.b(this.f));
            aVar.a(new b());
            aVar.a(new com.meituan.msc.modules.api.msi.env.a(this.f));
            final com.meituan.msc.modules.api.map.c iLocationLoaderProvider = MSCEnvHelper.getILocationLoaderProvider();
            aVar.a(new com.meituan.msi.location.c() { // from class: com.meituan.msc.modules.api.msi.g.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.location.c
                public final com.meituan.msi.location.b a(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
                    Object[] objArr3 = {activity, cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6afe7ca8b533844c255faac3b7466931", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6afe7ca8b533844c255faac3b7466931");
                    }
                    com.meituan.msc.modules.api.map.b a2 = iLocationLoaderProvider.a(activity, cVar);
                    g gVar = g.this;
                    Object[] objArr4 = {a2, cVar};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "b070d400d0514165a0aa3b6b925a4e10", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "b070d400d0514165a0aa3b6b925a4e10");
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.devtools.automator.b.a;
                    com.meituan.msc.modules.devtools.automator.a aVar2 = null;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "34958f995c42ea721cc2d884c03f72d8", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (com.meituan.msc.modules.devtools.automator.a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "34958f995c42ea721cc2d884c03f72d8");
                    } else {
                        List a3 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msc.modules.devtools.automator.a.class, "mock_location_loader_creator");
                        if (a3 != null && !a3.isEmpty()) {
                            aVar2 = (com.meituan.msc.modules.devtools.automator.a) a3.get(0);
                        }
                    }
                    if (aVar2 != null) {
                        return aVar2.a(new com.meituan.msc.modules.api.msi.env.d(a2), cVar);
                    }
                    return new com.meituan.msc.modules.api.msi.env.d(a2);
                }
            });
            aVar.a(new com.meituan.msi.context.a() { // from class: com.meituan.msc.modules.api.msi.g.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.context.a
                public final Activity a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2730945ab6f65997ffb7c79a4995008a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Activity) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2730945ab6f65997ffb7c79a4995008a");
                    }
                    q b2 = g.this.f.b();
                    if (b2 == null) {
                        com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getActivity,msc app exit");
                        return null;
                    }
                    return b2.c();
                }

                @Override // com.meituan.msi.context.a
                public final Context b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "091387c58d631eb056863747c1b74d03", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "091387c58d631eb056863747c1b74d03") : MSCEnvHelper.getContext();
                }

                @Override // com.meituan.msi.context.a
                public final d.b c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "813539c2353f20909106da6eaf975ff1", RobustBitConfig.DEFAULT_VALUE)) {
                        return (d.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "813539c2353f20909106da6eaf975ff1");
                    }
                    if (g.this.f.b() == null || g.this.f.b().e() == null) {
                        com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getLifecycleState,msc app exit");
                        return null;
                    }
                    return g.this.f.b().e().I();
                }

                @Override // com.meituan.msi.context.a
                public final void a(int i, Intent intent, final com.meituan.msi.context.b bVar) {
                    Object[] objArr3 = {Integer.valueOf(i), intent, bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57168526d70e5f28159abffac25a9280", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57168526d70e5f28159abffac25a9280");
                        return;
                    }
                    s sVar = (s) g.this.f.c(s.class);
                    if (sVar == null) {
                        com.meituan.msc.modules.reporter.g.d("MsiApisManager", "IActivityContext startActivityForResult,msc app exit");
                    } else {
                        sVar.a(intent, 113, new s.a() { // from class: com.meituan.msc.modules.api.msi.g.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msc.modules.container.s.a
                            public final void a(int i2, Intent intent2) {
                                Object[] objArr4 = {Integer.valueOf(i2), intent2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f93bbff7fbe60421c832ee037e900933", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f93bbff7fbe60421c832ee037e900933");
                                    return;
                                }
                                com.meituan.msc.modules.reporter.g.d("MsiApisManager", "IActivityContext startActivityForResult onActivityResult", Integer.valueOf(i2), g.a(g.this, intent2));
                                bVar.onActivityResult(i2, intent2);
                            }

                            @Override // com.meituan.msc.modules.container.s.a
                            public final void a(int i2, String str) {
                                Object[] objArr4 = {2, str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ed6510384f54f6c455e6c3f30f53ef1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ed6510384f54f6c455e6c3f30f53ef1");
                                    return;
                                }
                                com.meituan.msc.modules.reporter.g.d("MsiApisManager", "IActivityContext startActivityForResult onFail", 2, str);
                                bVar.onFail(2, str);
                            }
                        });
                    }
                }
            });
            aVar.a(new com.meituan.msc.modules.api.msi.interceptor.a(this.f));
            aVar.a(new com.meituan.msc.modules.api.msi.interceptor.d());
            final com.meituan.msc.modules.api.msi.interceptor.c cVar = new com.meituan.msc.modules.api.msi.interceptor.c(this.f);
            aVar.a(new com.meituan.msc.modules.api.msi.interceptor.b(cVar));
            aVar.a(this);
            aVar.a(new com.meituan.msc.modules.api.msi.env.c(this.f));
            aVar.a(this.c.c);
            aVar.a(this.c.b);
            aVar.a(new com.meituan.msi.api.h() { // from class: com.meituan.msc.modules.api.msi.g.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.h
                public final void a(ApiModule apiModule) {
                    Object[] objArr3 = {apiModule};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c713eed08d05366b63d5ac8ab3eb377e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c713eed08d05366b63d5ac8ab3eb377e");
                    } else if (apiModule instanceof OnWindowInfoChangedEvent) {
                        ((OnWindowInfoChangedEvent) apiModule).a(cVar);
                    }
                }
            });
            aVar.a(new com.meituan.msi.context.g() { // from class: com.meituan.msc.modules.api.msi.g.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.context.g
                public final void a(Intent intent, NavActivityInfo navActivityInfo, @Nullable com.meituan.msi.context.b bVar) {
                    Object[] objArr3 = {intent, navActivityInfo, null};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8455d2e289708fb6915154abdffde04a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8455d2e289708fb6915154abdffde04a");
                        return;
                    }
                    s sVar = (s) g.this.f.c(s.class);
                    if (sVar == null) {
                        com.meituan.msc.modules.reporter.g.d("MsiApisManager", "INavActivity startActivityForResult,msc app exit");
                    } else if (navActivityInfo.code == -1) {
                        sVar.a(intent);
                    } else {
                        sVar.a(intent, 113, navActivityInfo, (s.a) null);
                    }
                }
            });
            aVar.a(f());
            aVar.a(new com.meituan.msc.modules.api.msi.embed.a(this.f));
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4777bc197ed6555adf052318996c5957", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4777bc197ed6555adf052318996c5957");
            } else {
                new com.meituan.msc.modules.api.msi.hook.b().a(aVar, this.f);
                new com.meituan.msc.modules.api.msi.hook.c().a(aVar, this.f);
                new com.meituan.msc.modules.api.msi.hook.a().a(aVar, this.f);
            }
            this.b = aVar.a();
            this.d = new f(this.b, this.f);
            this.b.a().a();
        }
        hVar.a("pagePause", new com.meituan.msc.modules.manager.q<com.meituan.msc.modules.page.e>() { // from class: com.meituan.msc.modules.api.msi.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(com.meituan.msc.modules.manager.f<com.meituan.msc.modules.page.e> fVar) {
                com.meituan.msc.modules.page.e eVar;
                Object[] objArr4 = {fVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2f58c9bd043caf93f318731f63d5f6c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2f58c9bd043caf93f318731f63d5f6c8");
                } else if (g.this.b == null || g.this.b.b() == null || (eVar = fVar.c) == null) {
                } else {
                    g.this.b.b().b(eVar.d());
                }
            }
        });
        hVar.a("pageResume", new com.meituan.msc.modules.manager.q<com.meituan.msc.modules.page.e>() { // from class: com.meituan.msc.modules.api.msi.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(com.meituan.msc.modules.manager.f<com.meituan.msc.modules.page.e> fVar) {
                com.meituan.msc.modules.page.e eVar;
                Object[] objArr4 = {fVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1cfc7f9015f196d56e03a2268a9c0013", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1cfc7f9015f196d56e03a2268a9c0013");
                } else if (g.this.b == null || g.this.b.b() == null || (eVar = fVar.c) == null) {
                } else {
                    g.this.b.b().a(eVar.d());
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(com.meituan.msc.modules.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e727a2b3f5b3a93cabe7b5ec609cf1c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e727a2b3f5b3a93cabe7b5ec609cf1c8");
        } else {
            this.e.containerId = this.f.a();
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e477ab2f37d06b50c3e72bc1c952c42e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e477ab2f37d06b50c3e72bc1c952c42e");
        }
        StringRequestData b2 = b(str);
        if (this.b == null) {
            return null;
        }
        return this.b.a(b2);
    }

    private StringRequestData b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c45de69b49c593d745ed5089a3cfce7", RobustBitConfig.DEFAULT_VALUE) ? (StringRequestData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c45de69b49c593d745ed5089a3cfce7") : new StringRequestData.Builder().requestData(str).nativeStartTime(System.currentTimeMillis()).build();
    }

    public final String a(String str, com.meituan.msi.api.c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cc10ae5a5641210f227b86329cdd57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cc10ae5a5641210f227b86329cdd57");
        }
        StringRequestData b2 = b(str);
        if (this.b == null) {
            return null;
        }
        this.b.a(b2, cVar);
        return null;
    }

    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514547343edf3c012b4e0f3bff7a5b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514547343edf3c012b4e0f3bff7a5b04");
        } else if (this.b != null) {
            this.b.a(i, strArr, iArr);
        }
    }

    @Override // com.meituan.msi.dispather.d
    public void a(EventType eventType, String str, String str2, BroadcastEvent broadcastEvent) {
        Object[] objArr = {eventType, str, str2, broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d68934677b73511faeff0632859cf68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d68934677b73511faeff0632859cf68");
        } else if (this.d.a(str, str2)) {
        }
    }

    @Override // com.meituan.msi.dispather.d
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d73ab62bfbbfd73ff65b9f8ebac5d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d73ab62bfbbfd73ff65b9f8ebac5d53");
        } else {
            this.d.b(str, str2);
        }
    }

    public final void O_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aeac9ffee373ab727ceb9d4579fa125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aeac9ffee373ab727ceb9d4579fa125");
        } else if (this.b == null || this.b.a() == null) {
        } else {
            this.b.a().d();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01167c24c8994e8c90cc405caad22683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01167c24c8994e8c90cc405caad22683");
        } else if (this.b == null || this.b.a() == null) {
        } else {
            this.b.a().c();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a215fbf1fb6a5a6ce5d2a288f865cb57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a215fbf1fb6a5a6ce5d2a288f865cb57");
        } else if (this.b == null || this.b.a() == null) {
        } else {
            this.b.a().b();
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde6f0bb429c6fc2579c5e20d01302bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde6f0bb429c6fc2579c5e20d01302bf");
            return;
        }
        super.L_();
        this.f.c("pagePause");
        this.f.c("pageResume");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements com.meituan.msi.context.d {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53fbad1040ce1981bd3a5fbf276892b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53fbad1040ce1981bd3a5fbf276892b8");
            }
        }

        @Override // com.meituan.msi.context.d
        public final ContainerInfo a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d3e314c175c8848ee0dd98e6987dff", RobustBitConfig.DEFAULT_VALUE) ? (ContainerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d3e314c175c8848ee0dd98e6987dff") : g.this.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b implements com.meituan.msi.context.h {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.msi.context.h
        public final IPage a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fc5b3e08d912ba87f5f31c05d2c51a", RobustBitConfig.DEFAULT_VALUE)) {
                return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fc5b3e08d912ba87f5f31c05d2c51a");
            }
            q b = g.this.U_().b();
            if (b == null) {
                com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getPageById,msc app exit");
                return null;
            }
            com.meituan.msc.modules.page.e b2 = b.b(i);
            if (b2 == null) {
                return null;
            }
            return new com.meituan.msc.modules.api.msi.env.e(b2);
        }

        @Override // com.meituan.msi.context.h
        public final IPage a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bded065cc84a18d5053fce377f1362e", RobustBitConfig.DEFAULT_VALUE)) {
                return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bded065cc84a18d5053fce377f1362e");
            }
            q b = g.this.U_().b();
            if (b == null) {
                com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getTopPage,msc app exit");
                return null;
            }
            com.meituan.msc.modules.page.e g = b.g();
            if (g == null) {
                return null;
            }
            return new com.meituan.msc.modules.api.msi.env.e(g);
        }

        @Override // com.meituan.msi.context.h
        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89dcd5a6f2af19d3595d7a4f4ac03df4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89dcd5a6f2af19d3595d7a4f4ac03df4");
            }
            q b = g.this.U_().b();
            if (b == null) {
                com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getCurrentPagePath,msc app exit");
                return "";
            }
            com.meituan.msc.modules.page.e g = b.g();
            if (g != null) {
                return g.f();
            }
            return null;
        }
    }

    public final Map<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c296a261bf6b151ca5b10c4a6828c93", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c296a261bf6b151ca5b10c4a6828c93");
        }
        HashMap hashMap = new HashMap();
        if (this.f.r != null) {
            hashMap.put(DefaultValue.DEFAULT_VALUE_REQUEST_TIMEOUT, Integer.valueOf(this.f.r.d()));
            hashMap.put(DefaultValue.DEFAULT_VALUE_UPLOAD_TIMEOUT, Integer.valueOf(this.f.r.a("uploadFile")));
            hashMap.put(DefaultValue.DEFAULT_VALUE_DOWNLOAD_TIMEOUT, Integer.valueOf(this.f.r.a("downloadFile")));
        } else {
            com.meituan.msc.modules.reporter.g.d("MsiApisManager", "getRequestDefaultConfig,msc app exit");
        }
        return hashMap;
    }
}
