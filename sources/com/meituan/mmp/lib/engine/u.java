package com.meituan.mmp.lib.engine;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.network.RequestModule;
import com.meituan.mmp.lib.api.network.RequestPrefetchApi;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.ad;
import com.meituan.mmp.lib.utils.ao;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.msi.provider.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u {
    public static ChangeQuickRedirect a;
    final com.meituan.mmp.lib.config.a b;
    a c;
    com.sankuai.meituan.retrofit2.m d;
    volatile String e;
    volatile b f;
    private final k g;
    private volatile JSONObject h;
    private volatile IApiCallback i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public double a;
        public double b;

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        NOT_STARTED,
        PREPARING_DATA,
        REQUESTING,
        SUCCESS,
        FAIL,
        CANCELED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9dcf1561f134172bca31c704b75dbd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9dcf1561f134172bca31c704b75dbd");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f428b66ad46d9eb8692f5c685b9d6135", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f428b66ad46d9eb8692f5c685b9d6135") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed1a94f9c5ed1b75b4460036087c4bee", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed1a94f9c5ed1b75b4460036087c4bee") : (b[]) values().clone();
        }
    }

    public u(com.meituan.mmp.lib.config.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183daff4b790d6a29e981960c97dc69e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183daff4b790d6a29e981960c97dc69e");
            return;
        }
        this.f = b.NOT_STARTED;
        this.b = aVar;
        this.g = kVar;
    }

    public final synchronized void a(IApiCallback iApiCallback, boolean z) {
        String str;
        Object[] objArr = {iApiCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9f008db6967a928fd286bdea2bf3e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9f008db6967a928fd286bdea2bf3e0");
            return;
        }
        if (this.f == b.NOT_STARTED) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "fetch not started"));
            str = "notStarted";
        } else if (this.f == b.SUCCESS) {
            iApiCallback.onSuccess(this.h);
            str = "success";
        } else if (this.f == b.FAIL) {
            iApiCallback.onFail(AbsApi.codeJson(-1, this.e));
            str = "fail";
        } else {
            if (z) {
                this.i = iApiCallback;
            } else {
                iApiCallback.onFail(AbsApi.codeJson(-1, "fetching"));
            }
            str = "fetching";
        }
        this.b.h.a("mmp.launch.point.request.prefetch.get", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", str));
    }

    synchronized void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852e1f5fb3acb21b108aa106ea45d127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852e1f5fb3acb21b108aa106ea45d127");
        } else if (b()) {
        } else {
            this.f = b.SUCCESS;
            this.h = jSONObject;
            com.meituan.mmp.lib.trace.b.b("RequestPrefetchManager", "request prefetch for " + this.b.c() + " success");
            this.b.h.a("mmp.duration.request.prefetch.request", com.meituan.mmp.lib.utils.v.a("state", "success"));
            this.b.h.a("mmp.launch.point.request.prefetch.end", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", "success"));
            if (this.i != null) {
                this.i.onSuccess(jSONObject);
                this.i = null;
                return;
            }
            if (this.g != null) {
                this.g.a("onBackgroundFetchData", jSONObject.toString(), 0);
            }
        }
    }

    synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e60b17a7c095f6ac056b9a0022aeaa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e60b17a7c095f6ac056b9a0022aeaa4");
        } else if (b()) {
        } else {
            this.f = b.FAIL;
            this.e = str;
            com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "request prefetch for " + this.b.c() + " fail: " + str);
            this.b.h.a("mmp.duration.request.prefetch.request", com.meituan.mmp.lib.utils.v.a("state", "fail", "reason", str));
            this.b.h.a("mmp.launch.point.request.prefetch.end", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", "fail"));
            if (this.i != null) {
                this.i.onFail(AbsApi.codeJson(-1, str));
                this.i = null;
            }
        }
    }

    public final synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2190fa289a507a7a4610812cf8f4778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2190fa289a507a7a4610812cf8f4778");
        } else if (b()) {
        } else {
            this.f = b.CANCELED;
            this.e = "canceled";
            com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "request prefetch for " + this.b.c() + " fail: " + this.e);
            this.b.h.a("mmp.duration.request.prefetch.request", com.meituan.mmp.lib.utils.v.a("state", "cancel"));
            this.b.h.a("mmp.launch.point.request.prefetch.end", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", "cancel"));
            if (this.i != null) {
                this.i.onFail(AbsApi.codeJson(-1, this.e));
                this.i = null;
            }
            com.sankuai.meituan.retrofit2.m mVar = this.d;
            if (mVar != null) {
                mVar.cancel();
                this.d = null;
            }
        }
    }

    public final boolean a() {
        return this.f != b.NOT_STARTED;
    }

    boolean b() {
        return this.f == b.SUCCESS || this.f == b.FAIL || this.f == b.CANCELED;
    }

    public final void a(final Activity activity, final String str, final int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84f6bbde4d0dd7c69eccd96fbf5a354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84f6bbde4d0dd7c69eccd96fbf5a354");
        } else {
            a.c.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.u.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String query;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "632dfc332667e5afe94bde72e9bfd0b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "632dfc332667e5afe94bde72e9bfd0b8");
                        return;
                    }
                    ab.a("RequestPrefetchManager-startPrefetch");
                    final u uVar = u.this;
                    Activity activity2 = activity;
                    String str2 = str;
                    int i2 = i;
                    Object[] objArr3 = {activity2, str2, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = u.a;
                    if (PatchProxy.isSupport(objArr3, uVar, changeQuickRedirect3, false, "255cd2be7a05736a4a90f3ff97d6e1ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, uVar, changeQuickRedirect3, false, "255cd2be7a05736a4a90f3ff97d6e1ac");
                    } else if (com.meituan.mmp.lib.config.b.H()) {
                        if (uVar.f != b.NOT_STARTED) {
                            com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "prefetch already started");
                        } else if (uVar.b.l == null) {
                            com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "prefetch needs appProp: " + uVar.b.c());
                        } else {
                            final MMPAppProp.ExternalConfig.RequestPrefetchConfig requestPrefetchConfig = uVar.b.l.getRequestPrefetchConfig();
                            if (requestPrefetchConfig != null && !TextUtils.isEmpty(requestPrefetchConfig.url)) {
                                com.meituan.mmp.lib.trace.b.b("RequestPrefetchManager", "start RequestPrefetch: " + uVar.b.c());
                                uVar.f = b.PREPARING_DATA;
                                uVar.b.h.c("mmp.launch.point.request.prefetch.start");
                                String p = com.meituan.mmp.lib.config.a.p(str2);
                                Object[] objArr4 = {str2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.config.a.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "73d14adfb4a08f769e924b4a2c419f19", RobustBitConfig.DEFAULT_VALUE)) {
                                    query = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "73d14adfb4a08f769e924b4a2c419f19");
                                } else if (TextUtils.isEmpty(str2)) {
                                    query = "";
                                } else {
                                    query = Uri.parse("mmp://www.meituan.com/" + str2).getQuery();
                                    if (TextUtils.isEmpty(query)) {
                                        query = "";
                                    }
                                }
                                final RequestPrefetchParams requestPrefetchParams = new RequestPrefetchParams(p, query, i2);
                                if (requestPrefetchConfig.locationConfig != null && requestPrefetchConfig.locationConfig.enable) {
                                    final Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.engine.u.2
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4fce441ce86b24227f6dd90a53c36163", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4fce441ce86b24227f6dd90a53c36163");
                                            } else {
                                                u.this.a(requestPrefetchConfig, requestPrefetchParams);
                                            }
                                        }
                                    };
                                    Object[] objArr5 = {activity2, requestPrefetchConfig, runnable};
                                    ChangeQuickRedirect changeQuickRedirect5 = u.a;
                                    if (PatchProxy.isSupport(objArr5, uVar, changeQuickRedirect5, false, "5e1c6706503d0ce561b5cb71d45d82af", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, uVar, changeQuickRedirect5, false, "5e1c6706503d0ce561b5cb71d45d82af");
                                    } else {
                                        com.meituan.mmp.lib.trace.b.c("getLocation starting");
                                        uVar.b.h.a("mmp.duration.request.prefetch.locate");
                                        final String str3 = requestPrefetchConfig.locationConfig.sceneToken;
                                        if (!ad.a(MMPEnvHelper.getContext(), str3)) {
                                            if (!com.meituan.mmp.lib.config.b.b()) {
                                                com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "location failed, auth denied before request location");
                                                uVar.b.h.a("mmp.duration.request.prefetch.locate", com.meituan.mmp.lib.utils.v.a("state", "fail", "reason", "auth denied before request location"));
                                                uVar.a("auth denied before request location");
                                            } else {
                                                runnable.run();
                                            }
                                        } else {
                                            String str4 = !TextUtils.isEmpty(requestPrefetchConfig.locationConfig.type) ? requestPrefetchConfig.locationConfig.type : "wgs84";
                                            com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
                                            cVar.b = str3;
                                            cVar.a = c.a.normal;
                                            final com.meituan.mmp.lib.map.c a2 = com.meituan.mmp.lib.api.location.a.a(activity2, cVar);
                                            if (a2 == null) {
                                                if (!com.meituan.mmp.lib.config.b.b()) {
                                                    uVar.a("location failed, mini program is not in the foreground");
                                                } else {
                                                    runnable.run();
                                                }
                                                uVar.b.h.a("mmp.duration.request.prefetch.locate", com.meituan.mmp.lib.utils.v.a("state", "fail", "reason", "location failed, mini program is not in the foreground"));
                                            } else {
                                                a2.a(new com.meituan.mmp.lib.map.b() { // from class: com.meituan.mmp.lib.engine.u.4
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.meituan.mmp.lib.map.b
                                                    public final void a(int i3, com.meituan.msi.api.location.a aVar, String str5) {
                                                        Object[] objArr6 = {Integer.valueOf(i3), aVar, str5};
                                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "28968878715a85ec7cf548d191f97a34", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "28968878715a85ec7cf548d191f97a34");
                                                            return;
                                                        }
                                                        a2.a();
                                                        if (i3 == 0 && aVar != null) {
                                                            a aVar2 = new a();
                                                            aVar2.b = aVar.h;
                                                            aVar2.a = aVar.g;
                                                            u.this.c = aVar2;
                                                            u.this.b.h.a("mmp.duration.request.prefetch.locate", com.meituan.mmp.lib.utils.v.a("state", "success"));
                                                        } else {
                                                            if (!ad.a(MMPEnvHelper.getContext(), str3)) {
                                                                str5 = "auth denied after request location";
                                                            }
                                                            if (aVar == null) {
                                                                str5 = "location is null!";
                                                            }
                                                            com.meituan.mmp.lib.trace.b.d("RequestPrefetchManager", "location failed, " + i3 + ", " + str5);
                                                            u.this.b.h.a("mmp.duration.request.prefetch.locate", com.meituan.mmp.lib.utils.v.a("state", "fail", "reason", str5));
                                                            if (!com.meituan.mmp.lib.config.b.b()) {
                                                                u.this.a(u.this.e);
                                                                return;
                                                            }
                                                        }
                                                        runnable.run();
                                                    }
                                                }, str4);
                                            }
                                        }
                                    }
                                } else {
                                    uVar.a(requestPrefetchConfig, requestPrefetchParams);
                                }
                                if (requestPrefetchConfig.timeout > 0) {
                                    com.meituan.mmp.lib.executor.a.b.schedule(new Runnable() { // from class: com.meituan.mmp.lib.engine.u.3
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bfb42b3785497b924bb036ed4a86a8bd", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bfb42b3785497b924bb036ed4a86a8bd");
                                            } else if (u.this.b()) {
                                            } else {
                                                com.meituan.mmp.lib.trace.b.e("request prefetch timeout: " + requestPrefetchConfig.timeout + "ms, " + u.this.b.c());
                                                u uVar2 = u.this;
                                                uVar2.a("timeout: " + requestPrefetchConfig.timeout + "ms");
                                            }
                                        }
                                    }, requestPrefetchConfig.timeout, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    }
                    ab.a();
                }
            });
        }
    }

    void a(final MMPAppProp.ExternalConfig.RequestPrefetchConfig requestPrefetchConfig, final RequestPrefetchParams requestPrefetchParams) {
        HashMap hashMap;
        com.meituan.mmp.main.h mMPUserCenter;
        Object[] objArr = {requestPrefetchConfig, requestPrefetchParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3e9e23b47258c7c395826980d3c5c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3e9e23b47258c7c395826980d3c5c4");
            return;
        }
        this.f = b.REQUESTING;
        com.meituan.mmp.lib.trace.b.b("RequestPrefetchManager", "start request: " + this.b.c());
        boolean z = requestPrefetchConfig.enableShark;
        String a2 = RequestPrefetchApi.a(this.b);
        if (TextUtils.isEmpty(a2) && (mMPUserCenter = MMPEnvHelper.getMMPUserCenter()) != null && mMPUserCenter.a()) {
            a2 = mMPUserCenter.b();
        }
        aj.a a3 = new aj.a().a("retrofit-mt-request-timeout", String.valueOf(requestPrefetchConfig.timeout)).a("Referer", String.format("https://mmp.meituan.com/%s/%s/service", this.b.c(), this.b.g()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("appid", this.b.c());
        hashMap2.put("version", this.b.l.getVersion());
        if (!TextUtils.isEmpty(a2)) {
            hashMap2.put("token", a2);
            a3.a("t", a2);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        hashMap2.put(DeviceInfo.TM, String.valueOf(currentTimeMillis));
        hashMap2.put("appVersion", MMPEnvHelper.getEnvInfo().getAppVersionName());
        if (!TextUtils.isEmpty(requestPrefetchParams.path)) {
            hashMap2.put("path", requestPrefetchParams.path);
        }
        if (!TextUtils.isEmpty(requestPrefetchParams.query)) {
            hashMap2.put(SearchIntents.EXTRA_QUERY, requestPrefetchParams.query);
        }
        hashMap2.put(KnbConstants.PARAMS_SCENE, String.valueOf(requestPrefetchParams.scene));
        hashMap2.put("uuid", MMPEnvHelper.getEnvInfo().getUUID());
        hashMap2.put("os", "android");
        hashMap2.put("osVersion", Build.VERSION.RELEASE);
        if (MMPEnvHelper.getCityController() != null) {
            hashMap2.put("cityId", String.valueOf(MMPEnvHelper.getCityController().a()));
        }
        if (this.c != null) {
            hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(this.c.a));
            hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(this.c.b));
        }
        if (requestPrefetchConfig.keyMap != null) {
            hashMap = new HashMap();
            for (Map.Entry entry : hashMap2.entrySet()) {
                String str = requestPrefetchConfig.keyMap.get(entry.getKey());
                if (str != null) {
                    hashMap.put(str, entry.getValue());
                } else {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            hashMap = hashMap2;
        }
        a3.b(ao.a(requestPrefetchConfig.url, hashMap)).a("GET");
        a.InterfaceC0637a a4 = com.meituan.mmp.main.j.a(z);
        List<Interceptor> b2 = com.meituan.mmp.main.j.b(!z);
        if (this.b.a()) {
            b2.addAll(com.meituan.mmp.main.j.a(requestPrefetchConfig.enableSecuritySign, requestPrefetchConfig.enableSecuritySiua));
        }
        com.sankuai.meituan.retrofit2.m mVar = new com.sankuai.meituan.retrofit2.m(a4, b2);
        mVar.b = a3.a();
        mVar.a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.meituan.mmp.lib.engine.u.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c52a9273ab53536118da69200a1057c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c52a9273ab53536118da69200a1057c");
                    return;
                }
                u.this.d = null;
                u.this.b.h.a("mmp.duration.request.prefetch.request", com.meituan.mmp.lib.utils.v.a("state", "fail"));
                u.this.a(RequestModule.a(th));
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42eeee7510c5ea255679029f2b626ead", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42eeee7510c5ea255679029f2b626ead");
                    return;
                }
                u.this.d = null;
                u.this.b.h.a("mmp.duration.request.prefetch.request", com.meituan.mmp.lib.utils.v.a("state", "success"));
                try {
                    JSONObject jSONObject = new JSONObject();
                    ap e = response.e() != null ? response.e() : response.g();
                    if (e != null) {
                        jSONObject.put("fetchedData", e.string());
                    }
                    jSONObject.put("fetchType", "pre");
                    jSONObject.put("url", requestPrefetchConfig.url);
                    jSONObject.put("timeStamp", currentTimeMillis);
                    if (!TextUtils.isEmpty(requestPrefetchParams.path)) {
                        jSONObject.put("path", requestPrefetchParams.path);
                    }
                    if (!TextUtils.isEmpty(requestPrefetchParams.query)) {
                        jSONObject.put(SearchIntents.EXTRA_QUERY, requestPrefetchParams.query);
                    }
                    jSONObject.put(KnbConstants.PARAMS_SCENE, requestPrefetchParams.scene);
                    u.this.a(jSONObject);
                } catch (JSONException e2) {
                    com.meituan.mmp.lib.trace.b.a(e2);
                    u.this.a(e2.toString());
                }
            }
        });
        this.d = mVar;
        this.b.h.a("mmp.duration.request.prefetch.request");
    }
}
