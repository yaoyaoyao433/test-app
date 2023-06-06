package com.meituan.mmp.lib.msi;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.msi.h;
import com.meituan.mmp.lib.utils.w;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.systeminfo.SystemInfoResponse;
import com.meituan.msi.api.websocket.WebSocketApi;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.module.ApiModule;
import com.meituan.msi.module.OnWindowInfoChangedEvent;
import com.meituan.msi.page.IPage;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.RequestApi;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o implements com.meituan.mmp.lib.api.k, com.meituan.msi.dispather.d {
    public static ChangeQuickRedirect a;
    com.meituan.mmp.lib.api.h b;
    public ApiPortal c;
    ContainerInfo d;
    @Nullable
    com.meituan.mmp.lib.a e;
    public com.meituan.mmp.lib.config.a f;
    final com.meituan.mmp.lib.engine.m g;
    l h;
    public ConcurrentHashMap<Integer, a> i;
    private com.meituan.mmp.lib.interfaces.a j;
    private com.meituan.msi.context.d k;
    private e l;
    private j m;
    private a n;
    private com.meituan.mmp.lib.msi.a o;
    private com.meituan.msi.api.h p;

    @Override // com.meituan.mmp.lib.api.k
    public final void a() {
    }

    public static /* synthetic */ void a(o oVar, com.meituan.mmp.lib.a aVar, int i, Intent intent, com.meituan.msi.context.b bVar) {
        Object[] objArr = {aVar, Integer.valueOf(i), intent, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, oVar, changeQuickRedirect, false, "9e6317547f63af16f12e5a611971c49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, oVar, changeQuickRedirect, false, "9e6317547f63af16f12e5a611971c49a");
        } else if (aVar == null) {
            com.meituan.mmp.lib.trace.b.b("MsiApisManager", "startActivityForResult,controller null");
            bVar.onFail(2, "activity is empty");
        } else {
            a remove = oVar.i.remove(Integer.valueOf(aVar.L));
            if (remove != null && bVar != null) {
                bVar.onActivityResult(0, new Intent());
            } else {
                remove = new a(i, bVar);
            }
            oVar.i.put(Integer.valueOf(aVar.L), remove);
            aVar.a(intent, 113);
        }
    }

    public o(com.meituan.mmp.lib.engine.m mVar, com.meituan.mmp.lib.api.h hVar) {
        Object[] objArr = {mVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41ec37cbd98054a2496f0a5a54ce840", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41ec37cbd98054a2496f0a5a54ce840");
            return;
        }
        h.b bVar = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.j = null;
        this.k = new d();
        this.l = null;
        this.m = null;
        this.n = null;
        this.i = new ConcurrentHashMap<>();
        this.g = mVar;
        this.b = hVar;
        if (mVar != null) {
            this.f = mVar.d;
            this.j = mVar.h;
        }
        this.d = new ContainerInfo("1.24.0.4.231.7-wm", ContainerInfo.ENV_MMP, this.f != null ? this.f.c() : "unknown");
        this.l = new e();
        this.m = new j(this.f);
        this.h = new l(mVar);
        this.p = new b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb83d50288555388181968b2f257f220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb83d50288555388181968b2f257f220");
            return;
        }
        ApiPortal.a aVar = new ApiPortal.a();
        aVar.a(this.k);
        aVar.a(this.m);
        aVar.a(this.l);
        aVar.a(new com.meituan.mmp.lib.msi.f(this.f));
        if (this.g != null && this.g.h != null) {
            bVar = this.g.h.h;
        }
        aVar.a(new com.meituan.mmp.lib.msi.c(bVar));
        aVar.a(new com.meituan.mmp.lib.msi.embed.a(this.g));
        final com.meituan.mmp.lib.map.d iLocationLoaderProvider = MMPEnvHelper.getILocationLoaderProvider();
        aVar.a(new com.meituan.msi.location.c() { // from class: com.meituan.mmp.lib.msi.o.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.location.c
            public final com.meituan.msi.location.b a(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
                Object[] objArr3 = {activity, cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "958b43dd57199bff8a628cfdda41035a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "958b43dd57199bff8a628cfdda41035a");
                }
                com.meituan.mmp.lib.map.c a2 = iLocationLoaderProvider.a(activity, cVar);
                o oVar = o.this;
                Object[] objArr4 = {a2, cVar};
                ChangeQuickRedirect changeQuickRedirect4 = o.a;
                if (PatchProxy.isSupport(objArr4, oVar, changeQuickRedirect4, false, "aace6c7af3ddb78dc270c0266e925aba", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr4, oVar, changeQuickRedirect4, false, "aace6c7af3ddb78dc270c0266e925aba");
                }
                com.meituan.mmp.lib.devtools.automator.c a3 = com.meituan.mmp.lib.devtools.automator.d.a();
                if (a3 != null) {
                    return a3.a(new p(a2), cVar);
                }
                return new p(a2);
            }
        });
        aVar.a(new com.meituan.msi.context.a() { // from class: com.meituan.mmp.lib.msi.o.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.context.a
            public final Activity a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f017cc1f3f70e8cf924447b482774bac", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Activity) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f017cc1f3f70e8cf924447b482774bac");
                }
                if (o.this.e != null) {
                    return o.this.e.f;
                }
                return null;
            }

            @Override // com.meituan.msi.context.a
            public final Context b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c0f35b56a3545863df9583835ea8d73", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c0f35b56a3545863df9583835ea8d73") : MMPEnvHelper.getContext();
            }

            @Override // com.meituan.msi.context.a
            public final d.b c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a0acafc8a531c681e97388eafce5d04", RobustBitConfig.DEFAULT_VALUE)) {
                    return (d.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a0acafc8a531c681e97388eafce5d04");
                }
                if (o.this.e != null) {
                    return o.this.e.e();
                }
                return null;
            }

            @Override // com.meituan.msi.context.a
            public final void a(int i, Intent intent, com.meituan.msi.context.b bVar2) {
                Object[] objArr3 = {Integer.valueOf(i), intent, bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b50bf234e540fdd1be48efdc91a8c044", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b50bf234e540fdd1be48efdc91a8c044");
                } else {
                    o.a(o.this, o.this.e, i, intent, bVar2);
                }
            }
        });
        aVar.a(new com.meituan.mmp.lib.msi.d(this.g));
        aVar.a(new n(this.g));
        aVar.a(new m(this.h));
        if (this.g != null) {
            aVar.a(new com.meituan.mmp.lib.msi.e(this.g.d, this.g));
        }
        aVar.a(new g(this.g));
        aVar.a(this);
        if (this.g != null) {
            aVar.a(new k(this.g.d));
        }
        aVar.a(new i(this.b, this.e));
        aVar.a(this.b.k);
        aVar.a(this.p);
        aVar.a(new com.meituan.msi.context.g() { // from class: com.meituan.mmp.lib.msi.o.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.context.g
            public final void a(Intent intent, NavActivityInfo navActivityInfo, @Nullable com.meituan.msi.context.b bVar2) {
                Object[] objArr3 = {intent, navActivityInfo, null};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbc7f61d46a660202a8efb53f931ff9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbc7f61d46a660202a8efb53f931ff9a");
                } else {
                    o.a(o.this, o.this.g.c(navActivityInfo.pageId), navActivityInfo.code, intent, null);
                }
            }
        });
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1cc3c09bf9176bdf0145fc8acea7ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1cc3c09bf9176bdf0145fc8acea7ac8");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(DefaultValue.DEFAULT_VALUE_REQUEST_TIMEOUT, Integer.valueOf(this.f.j()));
            hashMap.put(DefaultValue.DEFAULT_VALUE_UPLOAD_TIMEOUT, Integer.valueOf(this.f.j("uploadFile")));
            hashMap.put(DefaultValue.DEFAULT_VALUE_DOWNLOAD_TIMEOUT, Integer.valueOf(this.f.j("downloadFile")));
            aVar.a(hashMap);
        }
        Object[] objArr4 = {aVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "155c615180fe9eae340c9dea33f4e5b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "155c615180fe9eae340c9dea33f4e5b4");
        } else {
            Object[] objArr5 = {aVar};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bef38f17ed7d03552d155d87a73d2570", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bef38f17ed7d03552d155d87a73d2570");
            } else {
                aVar.a(SocialConstants.TYPE_REQUEST, new com.meituan.msi.interceptor.a<Object>() { // from class: com.meituan.mmp.lib.msi.o.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.interceptor.a
                    public final Object a(ApiRequest apiRequest, Object obj) {
                        return obj;
                    }

                    @Override // com.meituan.msi.interceptor.a
                    public final void a(ApiRequest apiRequest) {
                        RequestApi requestApi;
                        com.meituan.msi.api.request.RequestApi requestApi2;
                        boolean z;
                        boolean z2;
                        Interceptor a2;
                        Object[] objArr6 = {apiRequest};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "04436de434ba39c075b62b7aefedf78f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "04436de434ba39c075b62b7aefedf78f");
                            return;
                        }
                        o oVar = o.this;
                        Object[] objArr7 = {apiRequest};
                        ChangeQuickRedirect changeQuickRedirect7 = o.a;
                        if (PatchProxy.isSupport(objArr7, oVar, changeQuickRedirect7, false, "8eaf71815b2bdadece2aed22a7e56416", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, oVar, changeQuickRedirect7, false, "8eaf71815b2bdadece2aed22a7e56416");
                            return;
                        }
                        IMsiApi apiImpl = apiRequest.getApiImpl();
                        if (apiImpl instanceof com.meituan.msi.api.request.RequestApi) {
                            com.meituan.msi.api.request.RequestApi requestApi3 = (com.meituan.msi.api.request.RequestApi) apiImpl;
                            if (requestApi3.a()) {
                                return;
                            }
                            requestApi2 = requestApi3;
                            requestApi = null;
                        } else if (!(apiImpl instanceof RequestApi)) {
                            return;
                        } else {
                            requestApi = (RequestApi) apiImpl;
                            if (requestApi.a()) {
                                return;
                            }
                            requestApi2 = null;
                        }
                        if (oVar.f.a()) {
                            z = com.meituan.mmp.lib.config.b.g();
                            z2 = true;
                        } else {
                            z = false;
                            z2 = false;
                        }
                        boolean z3 = z && oVar.f.g;
                        String format = String.format("https://mmp.meituan.com/%s/%s/service", oVar.g.b, oVar.f.g());
                        String a3 = com.meituan.mmp.lib.config.a.b != null ? w.a(com.meituan.mmp.lib.config.a.b) : "";
                        com.meituan.mmp.lib.devtools.e eVar = oVar.g.m;
                        ArrayList arrayList = new ArrayList();
                        if (eVar != null && (a2 = eVar.a(MMPEnvHelper.getContext())) != null) {
                            arrayList.add(a2);
                        }
                        if (requestApi2 != null) {
                            requestApi2.a(a3, format, z2, z3, arrayList);
                        } else if (requestApi != null) {
                            requestApi.a(a3, format, z2, z3, arrayList);
                        }
                    }
                });
            }
            Object[] objArr6 = {aVar};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9c8759d88053fceaf6fba386146ca57f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9c8759d88053fceaf6fba386146ca57f");
            } else {
                aVar.a("connectSocket", new com.meituan.msi.interceptor.a<Object>() { // from class: com.meituan.mmp.lib.msi.o.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.interceptor.a
                    public final Object a(ApiRequest apiRequest, Object obj) {
                        return obj;
                    }

                    @Override // com.meituan.msi.interceptor.a
                    public final void a(ApiRequest apiRequest) {
                        WebSocketApi webSocketApi;
                        Object[] objArr7 = {apiRequest};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d77d726ba4d6759cfd36935d6cf71339", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d77d726ba4d6759cfd36935d6cf71339");
                            return;
                        }
                        o oVar = o.this;
                        Object[] objArr8 = {apiRequest};
                        ChangeQuickRedirect changeQuickRedirect8 = o.a;
                        if (PatchProxy.isSupport(objArr8, oVar, changeQuickRedirect8, false, "5b07456cedec3be147b2e893b5347953", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, oVar, changeQuickRedirect8, false, "5b07456cedec3be147b2e893b5347953");
                            return;
                        }
                        IMsiApi apiImpl = apiRequest.getApiImpl();
                        com.sankuai.meituan.kernel.net.msi.WebSocketApi webSocketApi2 = null;
                        if (apiImpl instanceof WebSocketApi) {
                            webSocketApi = (WebSocketApi) apiImpl;
                            if (webSocketApi.a()) {
                                return;
                            }
                        } else if (!(apiImpl instanceof com.sankuai.meituan.kernel.net.msi.WebSocketApi)) {
                            return;
                        } else {
                            com.sankuai.meituan.kernel.net.msi.WebSocketApi webSocketApi3 = (com.sankuai.meituan.kernel.net.msi.WebSocketApi) apiImpl;
                            if (webSocketApi3.a()) {
                                return;
                            }
                            webSocketApi2 = webSocketApi3;
                            webSocketApi = null;
                        }
                        String format = String.format("https://mmp.meituan.com/%s/%s/service", oVar.g.b, oVar.f.g());
                        String a2 = com.meituan.mmp.lib.config.a.b != null ? w.a(com.meituan.mmp.lib.config.a.b) : "";
                        if (webSocketApi != null) {
                            webSocketApi.a(a2, format);
                        } else if (webSocketApi2 != null) {
                            webSocketApi2.a(a2, format);
                        }
                    }
                });
            }
            Object[] objArr7 = {aVar};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aee54cbb79de223b3c6905e3332a78f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aee54cbb79de223b3c6905e3332a78f8");
            } else {
                f fVar = new f();
                aVar.a("getSystemInfoAsync", fVar);
                aVar.a("getSystemInfo", fVar);
                aVar.a("getSystemInfoSync", fVar);
            }
        }
        this.c = aVar.a();
        this.o = new com.meituan.mmp.lib.msi.a(this.c, this.g);
        this.c.a().a();
    }

    public StringRequestData a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d16d75d9f480a25b1c15322893d991d", RobustBitConfig.DEFAULT_VALUE) ? (StringRequestData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d16d75d9f480a25b1c15322893d991d") : new StringRequestData.Builder().requestData(str).nativeStartTime(System.currentTimeMillis()).build();
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a(int i, int i2, Intent intent) {
        a remove;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95dcaf6081637d635dc76f4fd69486f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95dcaf6081637d635dc76f4fd69486f5");
        } else if (this.e == null || (remove = this.i.remove(Integer.valueOf(this.e.L))) == null || remove.b == null || i != 113) {
        } else {
            remove.b.onActivityResult(i2, intent);
        }
    }

    public final void a(@NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25db713b56582320147fa67260892c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25db713b56582320147fa67260892c3");
        } else if (this.c != null && this.g.r != null) {
            this.c.a(this.g.r.f, strArr, str, interfaceC0498a);
        } else {
            com.meituan.mmp.lib.trace.b.d("MsiApisManager", "requestPermissions failed,apiPortal:" + this.c + ",context:" + this.g.r);
        }
    }

    @Override // com.meituan.msi.dispather.d
    public final void a(EventType eventType, String str, final String str2, BroadcastEvent broadcastEvent) {
        Object[] objArr = {eventType, str, str2, broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7664f841ffb8f48909ff1c89f4d3e66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7664f841ffb8f48909ff1c89f4d3e66b");
        } else if (this.o.a(str, str2, this.f)) {
        } else {
            com.meituan.mmp.lib.trace.b.b("MMPMsi", "EventType:" + eventType + " DispatchEvent to Js " + str2);
            if (eventType != EventType.VIEW_EVENT) {
                if (this.j != null) {
                    this.j.a(str2);
                }
            } else if (broadcastEvent != null) {
                Map<String, String> uiData = broadcastEvent.getUiData();
                final int i = -1;
                if (uiData != null) {
                    String str3 = uiData.get("pageId");
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            Integer valueOf = Integer.valueOf(str3);
                            if (valueOf != null) {
                                i = valueOf.intValue();
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                final com.meituan.mmp.lib.api.h hVar = this.b;
                Object[] objArr2 = {Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.h.a;
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "69434c065ebfa409374b6319afeacc9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "69434c065ebfa409374b6319afeacc9e");
                } else if (hVar.b.s == null || hVar.b.s.isEmpty()) {
                    com.meituan.mmp.lib.trace.b.a("MMPMsi", "msiDispatchEvent: no activity avaiable.", str2);
                } else {
                    com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.api.h.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c5e76973dc916ffa8afabf99fae46c46", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c5e76973dc916ffa8afabf99fae46c46");
                                return;
                            }
                            for (com.meituan.mmp.lib.a aVar : hVar.b.s) {
                                if (aVar != null && aVar.y() != null) {
                                    aVar.y().a(str2, i);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.meituan.msi.dispather.d
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6a82114a98cb2cd02f1c753d52a7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6a82114a98cb2cd02f1c753d52a7e9");
        } else {
            this.o.a(str, str2, this.f);
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2807e2fafa5c27759b5843745f9d6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2807e2fafa5c27759b5843745f9d6bf");
        } else if (this.c != null) {
            this.c.a("onConfigurationChanged", configuration);
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a(@NonNull com.meituan.mmp.lib.a aVar) {
        this.e = aVar;
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void b(com.meituan.mmp.lib.a aVar) {
        if (this.e == aVar) {
            this.e = null;
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0294a20e5e54f0250adafa1c46b4818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0294a20e5e54f0250adafa1c46b4818");
            return;
        }
        if (this.c != null && this.c.a() != null) {
            this.c.a().d();
        }
        this.e = null;
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ee42d284035e749b5c4a3e80dc1df5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ee42d284035e749b5c4a3e80dc1df5");
        } else if (this.c == null || this.c.a() == null) {
        } else {
            this.c.a().c();
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed10442bfabec9b48062bdb4f232fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed10442bfabec9b48062bdb4f232fd6");
        } else if (this.c == null || this.c.a() == null) {
        } else {
            this.c.a().b();
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e5f01696e6d51ea169c0f2cf3994d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e5f01696e6d51ea169c0f2cf3994d9");
        } else if (this.n == null || this.n.b == null) {
        } else {
            this.n.b.onActivityResult(0, new Intent());
            this.n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        com.meituan.msi.context.b b;
        private int c;

        public a(int i, @Nullable com.meituan.msi.context.b bVar) {
            Object[] objArr = {Integer.valueOf(i), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c0a2fb5ea249bd2f54dde41aa81cbe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c0a2fb5ea249bd2f54dde41aa81cbe");
                return;
            }
            this.c = i;
            this.b = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class d implements com.meituan.msi.context.d {
        public static ChangeQuickRedirect a;

        private d() {
            Object[] objArr = {o.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59373745c2cf42ad13ab58d6057b4da4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59373745c2cf42ad13ab58d6057b4da4");
            }
        }

        @Override // com.meituan.msi.context.d
        public final ContainerInfo a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6519beebe38b7de8fc1827ba2939c10d", RobustBitConfig.DEFAULT_VALUE) ? (ContainerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6519beebe38b7de8fc1827ba2939c10d") : o.this.d;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements com.meituan.msi.api.c<String> {
        public static ChangeQuickRedirect a;
        private com.meituan.mmp.lib.interfaces.a c;

        @Override // com.meituan.msi.api.c
        public final /* synthetic */ void a(String str) {
            String str2 = str;
            Object[] objArr = {str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d0f0d59059912b76059b75fe063df1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d0f0d59059912b76059b75fe063df1");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("MMPMsi", "CallBack#onFail " + str2);
            this.c.a(str2);
        }

        @Override // com.meituan.msi.api.c
        public final /* synthetic */ void b(String str) {
            String str2 = str;
            Object[] objArr = {str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c625079c28204e73ee08e1dfb7e7c5f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c625079c28204e73ee08e1dfb7e7c5f0");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("MMPMsi", "CallBack#onSuccess " + str2);
            this.c.a(str2);
        }

        public c(com.meituan.mmp.lib.interfaces.a aVar) {
            Object[] objArr = {o.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf707e9d35d33b8b10b1484ef821fd3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf707e9d35d33b8b10b1484ef821fd3");
            } else {
                this.c = aVar;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class e implements com.meituan.msi.context.h {
        public static ChangeQuickRedirect a;

        public e() {
        }

        @Override // com.meituan.msi.context.h
        public final IPage a(int i) {
            com.meituan.mmp.lib.page.e a2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38ad359003108b5f57547c48f4f14e1", RobustBitConfig.DEFAULT_VALUE)) {
                return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38ad359003108b5f57547c48f4f14e1");
            }
            o oVar = o.this;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "72f5224b834efd2d9d19f6340f95e63e", RobustBitConfig.DEFAULT_VALUE)) {
                return (IPage) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "72f5224b834efd2d9d19f6340f95e63e");
            }
            if (oVar.g == null || (a2 = oVar.g.a(i)) == null) {
                return null;
            }
            return new q(a2);
        }

        @Override // com.meituan.msi.context.h
        public final IPage a() {
            ab abVar;
            com.meituan.mmp.lib.page.e e;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453a892a684d5829491d3187635aee7c", RobustBitConfig.DEFAULT_VALUE)) {
                return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453a892a684d5829491d3187635aee7c");
            }
            if (o.this.b == null || (abVar = o.this.b.c) == null || (e = abVar.e()) == null) {
                return null;
            }
            return new q(e);
        }

        @Override // com.meituan.msi.context.h
        public final String b() {
            ab abVar;
            com.meituan.mmp.lib.page.e e;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0123fd8a404ac318c8d05691eb9fe4c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0123fd8a404ac318c8d05691eb9fe4c8");
            }
            o oVar = o.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "b6c5ea2e74dd7daf9e55ac407c9ff0ad", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "b6c5ea2e74dd7daf9e55ac407c9ff0ad");
            }
            if (oVar.g == null || (abVar = oVar.g.q) == null || (e = abVar.e()) == null) {
                return null;
            }
            return e.getPagePath();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class f implements com.meituan.msi.interceptor.a<SystemInfoResponse> {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msi.interceptor.a
        public final void a(ApiRequest<?> apiRequest) {
        }

        @Override // com.meituan.msi.interceptor.a
        public final /* synthetic */ SystemInfoResponse a(ApiRequest apiRequest, SystemInfoResponse systemInfoResponse) {
            SystemInfoResponse systemInfoResponse2 = systemInfoResponse;
            Object[] objArr = {apiRequest, systemInfoResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae031f616bc6b0b68c081278064f2c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (SystemInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae031f616bc6b0b68c081278064f2c1");
            }
            if (systemInfoResponse2 != null && MMPEnvHelper.getCustomServiceEngineClazz() == com.meituan.mmp.lib.service.c.class) {
                systemInfoResponse2.V8 = 1;
            }
            return systemInfoResponse2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b implements com.meituan.msi.api.h {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {o.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ad044eab720727550cec63cf2b5ef8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ad044eab720727550cec63cf2b5ef8");
            }
        }

        @Override // com.meituan.msi.api.h
        public final void a(ApiModule apiModule) {
            Object[] objArr = {apiModule};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c54bcd8edd36bf915b6e548ebeffe9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c54bcd8edd36bf915b6e548ebeffe9b");
            } else if (apiModule instanceof OnWindowInfoChangedEvent) {
                ((OnWindowInfoChangedEvent) apiModule).a(o.this.h);
            }
        }
    }
}
