package com.meituan.mmp.lib.api.mdns;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.mdns.a;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MDNSApi extends ServiceApi {
    public static ChangeQuickRedirect a;
    private final Map<String, a.InterfaceC0398a> h;
    private com.meituan.mmp.lib.api.mdns.a i;

    public MDNSApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e404ab377ba0b923e3a07fd2101b23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e404ab377ba0b923e3a07fd2101b23");
            return;
        }
        this.h = new ConcurrentHashMap();
        this.i = new com.meituan.mmp.lib.api.mdns.a();
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135b144dd618b829ce96a5978794a8b8", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135b144dd618b829ce96a5978794a8b8") : new String[]{"operateLocalServicesScan"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f2a57860cda0aeb44d0b9f6e89dc3a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f2a57860cda0aeb44d0b9f6e89dc3a") : new String[]{"operateLocalServicesScan", "onLocalServiceEvent"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d196ebed9a3337075d9c2478854fd18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d196ebed9a3337075d9c2478854fd18");
        } else if ("operateLocalServicesScan".equals(str)) {
            String optString = jSONObject.optString("action");
            if (TextUtils.equals("start", optString)) {
                final String optString2 = jSONObject.optString("serviceType");
                if (TextUtils.isEmpty(optString2)) {
                    iApiCallback.onFail(a("fail:invalid param"));
                    return;
                }
                Object[] objArr2 = {optString2, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "689bc83844de25a5db791ce89fd9afd7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "689bc83844de25a5db791ce89fd9afd7");
                    return;
                }
                synchronized (this.h) {
                    for (String str2 : this.h.keySet()) {
                        if (str2.contains(getAppId())) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("errMsg", "fail:scan task already exist");
                            } catch (JSONException unused) {
                            }
                            iApiCallback.onFail(jSONObject2);
                            return;
                        }
                    }
                    NsdManager a2 = com.meituan.mmp.lib.api.mdns.a.a();
                    final a aVar = new a();
                    aVar.b = iApiCallback;
                    a.e eVar = new a.e(aVar);
                    this.i.b.put(aVar, eVar);
                    a2.discoverServices(optString2, 1, eVar);
                    Map<String, a.InterfaceC0398a> map = this.h;
                    map.put(getAppId() + "#" + optString2, aVar);
                    c.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.mdns.MDNSApi.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7439a92dffe4bf96dc5ffff27ee3206", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7439a92dffe4bf96dc5ffff27ee3206");
                                return;
                            }
                            Map map2 = MDNSApi.this.h;
                            map2.remove(MDNSApi.this.getAppId() + "#" + optString2);
                            MDNSApi.this.i.a(aVar);
                            MDNSApi.this.a((a.b) null, "stopScan");
                        }
                    }, 30000L);
                }
            } else if (TextUtils.equals("stop", optString)) {
                a(iApiCallback);
            } else {
                iApiCallback.onFail(a("fail:invalid param"));
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d5a535fe736cc1a9be5b99415735b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d5a535fe736cc1a9be5b99415735b4");
        } else {
            a((IApiCallback) null);
        }
    }

    private JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daeb7cc792ac6b9472c91d962192f0fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daeb7cc792ac6b9472c91d962192f0fd");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private void a(@Nullable IApiCallback iApiCallback) {
        boolean z = false;
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491408fc0f5b7cb6e1e80cda247db9ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491408fc0f5b7cb6e1e80cda247db9ea");
            return;
        }
        synchronized (this.h) {
            for (a.InterfaceC0398a interfaceC0398a : this.h.values()) {
                ((a) interfaceC0398a).b = iApiCallback;
                this.i.a(interfaceC0398a);
                z = true;
            }
            if (!z && iApiCallback != null) {
                iApiCallback.onFail(a("fail:task not found"));
            }
            this.h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab0eaaa2be568d8d6197ca9d6fa1735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab0eaaa2be568d8d6197ca9d6fa1735");
            return;
        }
        synchronized (a.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", str);
                if (TextUtils.equals(str, "found") || TextUtils.equals(str, "lost") || TextUtils.equals(str, "resolveFail")) {
                    jSONObject.put("serviceType", bVar.b);
                    jSONObject.put("serviceName", bVar.a);
                    if (!TextUtils.equals(str, "resolveFail")) {
                        jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, bVar.c);
                        jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(bVar.d));
                    }
                }
            } catch (JSONException unused) {
            }
            a("onLocalServiceEvent", jSONObject.toString(), 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements a.InterfaceC0398a {
        public static ChangeQuickRedirect a;
        IApiCallback b;

        public a() {
            Object[] objArr = {MDNSApi.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea6f7b09b14af4e90a1ad36697506fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea6f7b09b14af4e90a1ad36697506fc");
            }
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c389d06474381e4f7376024ab20a8fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c389d06474381e4f7376024ab20a8fe");
            } else if (this.b != null) {
                this.b.onFail();
            }
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e3363637a5d05fb5a5c65af664ea38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e3363637a5d05fb5a5c65af664ea38");
            } else if (this.b != null) {
                this.b.onFail();
            }
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a937755d9a9b0af86b898e288f7cec2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a937755d9a9b0af86b898e288f7cec2d");
            } else if (this.b != null) {
                this.b.onSuccess(null);
            }
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d45558d2c3931d32b737fc02bec06c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d45558d2c3931d32b737fc02bec06c");
                return;
            }
            if (this.b != null) {
                this.b.onSuccess(null);
            }
            MDNSApi.this.a((a.b) null, "stopScan");
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void a(a.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2eb16100c34111d0beac27fe6da71d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2eb16100c34111d0beac27fe6da71d6");
                return;
            }
            a.d dVar = new a.d() { // from class: com.meituan.mmp.lib.api.mdns.MDNSApi.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.mdns.a.d
                public final void a(a.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c275c53f05041b220fb5a3282f8f530", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c275c53f05041b220fb5a3282f8f530");
                    } else {
                        MDNSApi.this.a(bVar2, "resolveFail");
                    }
                }

                @Override // com.meituan.mmp.lib.api.mdns.a.d
                public final void b(a.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd805c7969b721a80c745889cbe6e248", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd805c7969b721a80c745889cbe6e248");
                    } else {
                        MDNSApi.this.a(bVar2, "found");
                    }
                }
            };
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceName(bVar.a);
            nsdServiceInfo.setServiceType(bVar.b);
            com.meituan.mmp.lib.api.mdns.a.a().resolveService(nsdServiceInfo, new a.c(dVar));
        }

        @Override // com.meituan.mmp.lib.api.mdns.a.InterfaceC0398a
        public final void b(a.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b43f2b4f463bff94c9fcb2557206a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b43f2b4f463bff94c9fcb2557206a0");
            } else {
                MDNSApi.this.a(bVar, "lost");
            }
        }
    }
}
