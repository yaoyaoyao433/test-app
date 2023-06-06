package com.meituan.mmp.lib.api.location;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.auth.d;
import com.meituan.mmp.lib.api.auth.f;
import com.meituan.mmp.lib.map.c;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.utils.ad;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.ab;
import com.meituan.msi.provider.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RequestLocationModule extends ServiceApi {
    public static ChangeQuickRedirect a = null;
    public static String h = "gps";
    public static String i = "wifi";
    public static String j = "network";
    public static String l = "unknown";
    public final ConcurrentHashMap<String, b> m;
    public f n;
    private final Set<String> o;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public IApiCallback a;
        public JSONObject b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public c a;
        public a b;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean d() {
        return true;
    }

    public RequestLocationModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ed35c86778f4eeb622d2bd33862143", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ed35c86778f4eeb622d2bd33862143");
            return;
        }
        this.m = new ConcurrentHashMap<>();
        this.o = new CopyOnWriteArraySet();
        this.n = d.a();
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        boolean z;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2016841c4c4af23af2fd489750f78fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2016841c4c4af23af2fd489750f78fda");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1274080896) {
            if (str.equals("stopLocationUpdate")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == -340613664) {
            if (str.equals("startLocationUpdate")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -316023509) {
            if (hashCode == 1273954094 && str.equals("startLocationUpdateBackground")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("getLocation")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7b46ed47d74987d50968da741dfb8a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7b46ed47d74987d50968da741dfb8a9");
                    return;
                }
                k().a("getLocation");
                com.meituan.mmp.lib.trace.b.c("getLocation start");
                String token = AbsApi.getToken(jSONObject);
                Object[] objArr3 = {(byte) 0, token, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc207fe18ba2046dbee8a360f999529b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc207fe18ba2046dbee8a360f999529b")).booleanValue();
                } else if (b(false, token)) {
                    z = true;
                } else {
                    iApiCallback.onFail(codeJson(-1, "system location permissions denied"));
                    com.meituan.mmp.lib.trace.b.c("getLocation failed due to permissions");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("result", "no permission");
                    k().a("getLocation", hashMap);
                    z = false;
                }
                if (z) {
                    com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
                    cVar.b = getToken(jSONObject);
                    cVar.a = c.a.normal;
                    com.meituan.mmp.lib.map.c a2 = com.meituan.mmp.lib.api.location.a.a(getActivity(), cVar);
                    if (a2 != null) {
                        a(a2, jSONObject, iApiCallback, false);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(-1, "activity is destroyed"));
                        return;
                    }
                }
                return;
            case 1:
                a(jSONObject, iApiCallback);
                return;
            case 2:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b500d279a644bf3caa9399e8db4d452a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b500d279a644bf3caa9399e8db4d452a");
                    return;
                } else if (!a(true, AbsApi.getToken(jSONObject), iApiCallback)) {
                    com.meituan.mmp.lib.trace.b.d("RequestLocationModule", "startLocationUpdateBackground permission deny");
                    return;
                } else {
                    String token2 = getToken(jSONObject);
                    b bVar = this.m.get(token2);
                    if (bVar == null) {
                        com.meituan.mmp.lib.map.c a3 = a(jSONObject, c.a.instant_background);
                        if (a3 != null) {
                            b bVar2 = new b();
                            bVar2.a = a3;
                            this.m.put(token2, bVar2);
                            a(a3, jSONObject, iApiCallback, true);
                            iApiCallback.onSuccess(null);
                        } else {
                            iApiCallback.onFail(codeJson(-1, "startLocationUpdateBackground failed, activity is destroyed"));
                        }
                    } else {
                        iApiCallback.onSuccess(null);
                        bVar.b = null;
                    }
                    this.o.remove(token2);
                    return;
                }
            case 3:
                Object[] objArr5 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "767e367d2c30a2b3ddd51c314c49470d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "767e367d2c30a2b3ddd51c314c49470d");
                    return;
                }
                String token3 = getToken(jSONObject);
                b bVar3 = this.m.get(token3);
                if (bVar3 != null) {
                    a(bVar3.a, token3, iApiCallback);
                    this.m.remove(token3);
                    return;
                } else if (this.o.contains(token3)) {
                    iApiCallback.onSuccess(null);
                    return;
                } else {
                    iApiCallback.onFail(codeJson(-1, "location not started, invoke startLocationUpdate or startLocationUpdateBackground first!"));
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa69bcb81c0eecf7fdd14de3a08696c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa69bcb81c0eecf7fdd14de3a08696c") : new String[]{"getLocation", "startLocationUpdate", "startLocationUpdateBackground", "stopLocationUpdate"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6391bd0c7a4a0fa0bbd984a34c1f0272", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6391bd0c7a4a0fa0bbd984a34c1f0272") : new String[]{"getLocation", "startLocationUpdate", "startLocationUpdateBackground", "stopLocationUpdate", "onLocationChange"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r14.equals("startLocationUpdateBackground") == false) goto L21;
     */
    @Override // com.meituan.mmp.lib.api.InternalApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] a(java.lang.String r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.mmp.lib.api.location.RequestLocationModule.a
            java.lang.String r12 = "1c7867a6a465cc405ca56b8fe9691d9d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            java.lang.String[] r14 = (java.lang.String[]) r14
            return r14
        L21:
            r1 = -1
            int r2 = r14.hashCode()
            r3 = -340613664(0xffffffffebb2a5e0, float:-4.3194424E26)
            if (r2 == r3) goto L4b
            r3 = -316023509(0xffffffffed29dd2b, float:-3.2856464E27)
            if (r2 == r3) goto L40
            r3 = 1273954094(0x4beeff2e, float:3.1325788E7)
            if (r2 == r3) goto L36
            goto L56
        L36:
            java.lang.String r2 = "startLocationUpdateBackground"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L56
            goto L57
        L40:
            java.lang.String r0 = "getLocation"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L56
            r0 = 0
            goto L57
        L4b:
            java.lang.String r0 = "startLocationUpdate"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = -1
        L57:
            switch(r0) {
                case 0: goto L66;
                case 1: goto L5f;
                case 2: goto L5f;
                default: goto L5a;
            }
        L5a:
            java.lang.String[] r14 = super.a(r14, r15)
            return r14
        L5f:
            java.lang.String r14 = "Locate.continuous"
            java.lang.String[] r14 = new java.lang.String[]{r14}
            return r14
        L66:
            java.lang.String r14 = "Locate.once"
            java.lang.String[] r14 = new java.lang.String[]{r14}
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.location.RequestLocationModule.a(java.lang.String, org.json.JSONObject):java.lang.String[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e79a8fe99864195dfd45e72f0c143c", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e79a8fe99864195dfd45e72f0c143c") : getAppConfig().h;
    }

    private void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155208c7561b0b0d6850a81e6a6af516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155208c7561b0b0d6850a81e6a6af516");
        } else if (a(false, AbsApi.getToken(jSONObject), iApiCallback)) {
            String token = getToken(jSONObject);
            b bVar = this.m.get(token);
            if (bVar == null) {
                com.meituan.mmp.lib.map.c a2 = a(jSONObject, c.a.instant_forground);
                if (a2 != null) {
                    b bVar2 = new b();
                    bVar2.a = a2;
                    a aVar = new a();
                    aVar.a = iApiCallback;
                    aVar.b = jSONObject;
                    bVar2.b = aVar;
                    this.m.put(token, bVar2);
                    a(a2, jSONObject, iApiCallback, true);
                    iApiCallback.onSuccess(null);
                } else {
                    iApiCallback.onFail(codeJson(-1, "startLocationUpdate failed, activity is destroyed"));
                }
            } else if (bVar.a == null) {
                com.meituan.mmp.lib.map.c a3 = a(jSONObject, c.a.instant_forground);
                if (a3 != null) {
                    a(a3, jSONObject, iApiCallback, true);
                    bVar.a = a3;
                    iApiCallback.onSuccess(null);
                } else {
                    iApiCallback.onFail(codeJson(-1, "startLocationUpdate failed, activity is destroyed"));
                }
            } else {
                a aVar2 = new a();
                aVar2.a = iApiCallback;
                aVar2.b = jSONObject;
                bVar.b = aVar2;
                iApiCallback.onSuccess(null);
            }
            this.o.remove(token);
        }
    }

    private void a(com.meituan.mmp.lib.map.c cVar, String str, @NonNull IApiCallback iApiCallback) {
        Object[] objArr = {cVar, str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b922b9139cd1123f578b61296c41544f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b922b9139cd1123f578b61296c41544f");
        } else if (cVar == null) {
            iApiCallback.onFail(codeJson(-1, "location not started, invoke startLocationUpdate or startLocationUpdateBackground first!"));
        } else {
            this.o.add(str);
            cVar.a();
            iApiCallback.onSuccess(null);
        }
    }

    private void a(@NonNull final com.meituan.mmp.lib.map.c cVar, JSONObject jSONObject, final IApiCallback iApiCallback, final boolean z) {
        String optString;
        Object[] objArr = {cVar, jSONObject, iApiCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1c7c4f14bd64e574316391ac110a67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1c7c4f14bd64e574316391ac110a67");
            return;
        }
        if (z) {
            optString = jSONObject.optString("type", "gcj02");
        } else {
            optString = jSONObject.optString("type", "wgs84");
        }
        ab.c("startLocation");
        final Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.api.location.RequestLocationModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b25accff16251ff68a0dfb01686aa081", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b25accff16251ff68a0dfb01686aa081");
                } else {
                    RequestLocationModule.this.k().b("startLocation.timeout", (Map<String, Object>) null);
                }
            }
        };
        com.meituan.mmp.lib.executor.a.b(runnable, 7000L);
        final String token = AbsApi.getToken(jSONObject);
        cVar.a(new com.meituan.mmp.lib.map.b() { // from class: com.meituan.mmp.lib.api.location.RequestLocationModule.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.map.b
            public final void a(int i2, com.meituan.msi.api.location.a aVar, String str) {
                Object[] objArr2 = {Integer.valueOf(i2), aVar, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15a18ba2beac1d32ec1ae0a7c54d1961", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15a18ba2beac1d32ec1ae0a7c54d1961");
                    return;
                }
                ab.d("startLocation");
                com.meituan.mmp.lib.trace.b.c("getLocation successed");
                com.meituan.mmp.lib.executor.a.f(runnable);
                if (i2 != 0 || aVar == null) {
                    if (!RequestLocationModule.this.b(RequestLocationModule.this.j(), token)) {
                        str = "auth denied";
                    }
                    if (aVar == null) {
                        str = "location is null!";
                    }
                    iApiCallback.onFail(AbsApi.codeJson(i2, str));
                    RequestLocationModule.this.a(z, str);
                    return;
                }
                if (!z) {
                    cVar.a();
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, aVar.h);
                    jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, aVar.g);
                    jSONObject2.put("speed", aVar.f);
                    jSONObject2.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, aVar.e);
                    jSONObject2.put(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE, aVar.d);
                    jSONObject2.put("verticalAccuracy", aVar.c);
                    jSONObject2.put("horizontalAccuracy", 0);
                    jSONObject2.put("provider", aVar.a);
                    jSONObject2.put("_mtGotTimestamp", aVar.j);
                    jSONObject2.put("mtTimestamp", aVar.i);
                    if (!z) {
                        iApiCallback.onSuccess(jSONObject2);
                        RequestLocationModule.this.a(z, "success");
                        return;
                    }
                    if (!RequestLocationModule.this.isInnerApp() && RequestLocationModule.this.n != null) {
                        if (!RequestLocationModule.this.a(false)) {
                            RequestLocationModule.this.b(iApiCallback);
                            return;
                        } else if (!RequestLocationModule.this.a(true)) {
                            RequestLocationModule.this.a(iApiCallback);
                            return;
                        }
                    }
                    RequestLocationModule.this.a("onLocationChange", jSONObject2.toString(), 0);
                } catch (JSONException e) {
                    com.meituan.mmp.lib.trace.b.d("RequestLocationModule", "getLocation assemble result exception!");
                    iApiCallback.onFail(AbsApi.codeJson(-1, e.toString()));
                    RequestLocationModule.this.a(z, "getLocation assemble result exception");
                }
            }
        }, optString);
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1de71f3fcd7e83b557a8a99eff23777", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1de71f3fcd7e83b557a8a99eff23777")).booleanValue();
        }
        for (b bVar : this.m.values()) {
            if (bVar != null && bVar.b == null && bVar.a != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff420ea4a3120ea957ad729ec4d44d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff420ea4a3120ea957ad729ec4d44d7");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            b value = it.next().getValue();
            if (value.b == null) {
                a(value.a, key, iApiCallback);
                it.remove();
            }
        }
    }

    public final void b(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb51182fcaa961054f295bccdf81160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb51182fcaa961054f295bccdf81160");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (value.b != null) {
                value.b = null;
                a(value.a, it.next().getKey(), iApiCallback);
                it.remove();
            }
        }
    }

    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47635efbe7acaaf192f41ba657801d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47635efbe7acaaf192f41ba657801d5");
        } else if (z) {
        } else {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("result", str);
            k().a("getLocation", hashMap);
        }
    }

    @Nullable
    private com.meituan.mmp.lib.map.c a(JSONObject jSONObject, c.a aVar) {
        Object[] objArr = {jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a59769c64b39e697ea8d2cda22c61b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.map.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a59769c64b39e697ea8d2cda22c61b");
        }
        com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
        cVar.b = getToken(jSONObject);
        cVar.a = aVar;
        return com.meituan.mmp.lib.api.location.a.a(getActivity(), cVar);
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9886e420d8dd3e38d89456097f64b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9886e420d8dd3e38d89456097f64b1c");
            return;
        }
        super.onPause();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c2aaa3321a00ae34e116549d6b1efa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c2aaa3321a00ae34e116549d6b1efa2");
            return;
        }
        for (Map.Entry<String, b> entry : this.m.entrySet()) {
            b value = entry.getValue();
            if (value != null && value.b != null && value.b.a != null) {
                a(value.a, entry.getKey(), value.b.a);
                value.a = null;
                this.m.remove(entry.getKey());
            } else {
                com.meituan.mmp.lib.trace.b.d("RequestLocationModule", "pauseForegroundLocationLoaders locationData or callback is null");
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a52c256f6c9a93e53581c06a1d7b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a52c256f6c9a93e53581c06a1d7b83");
            return;
        }
        super.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75c2ab2b0f383c91982e0f3db89406d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75c2ab2b0f383c91982e0f3db89406d4");
            return;
        }
        for (b bVar : this.m.values()) {
            if (bVar.b != null && bVar.b.a != null) {
                a(bVar.b.b, bVar.b.a);
            }
        }
    }

    private boolean a(boolean z, String str, IApiCallback iApiCallback) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b66a2e7f24b6e461a293183d81e297", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b66a2e7f24b6e461a293183d81e297")).booleanValue();
        }
        if (!ad.a(getContext())) {
            iApiCallback.onFail(codeJson(-1, "system location provider is not enabled"));
            com.meituan.mmp.lib.trace.b.c("getLocation failed due to provider");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("result", "provider is not enabled");
            k().a("getLocation", hashMap);
            return false;
        } else if (b(z, str)) {
            return true;
        } else {
            iApiCallback.onFail(codeJson(-1, "system location permissions denied"));
            com.meituan.mmp.lib.trace.b.c("getLocation failed due to permissions");
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("result", "no permission");
            k().a("getLocation", hashMap2);
            return false;
        }
    }

    public final boolean b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7524a26f1674268c5bb7cf48de9728be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7524a26f1674268c5bb7cf48de9728be")).booleanValue();
        }
        if (z) {
            return ad.b(getContext(), str);
        }
        return ad.a(getContext(), str);
    }

    public final boolean a(boolean z) {
        Boolean bool;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d6d740628c7ba5264eb880fcaa2e44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d6d740628c7ba5264eb880fcaa2e44")).booleanValue();
        }
        String str = z ? "scope.userLocationBackground" : "scope.userLocation";
        Map<String, Boolean> hashMap = new HashMap<>();
        if (this.n != null) {
            hashMap = this.n.a(getContext(), getAppId());
        }
        if (hashMap == null || (bool = hashMap.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d8a7a0ec4101be5640e68363c4d18e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d8a7a0ec4101be5640e68363c4d18e1");
            return;
        }
        super.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ef28676f89c230518d5710e6878f8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ef28676f89c230518d5710e6878f8b0");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (value.a != null) {
                value.a.a();
            }
            it.remove();
        }
    }
}
