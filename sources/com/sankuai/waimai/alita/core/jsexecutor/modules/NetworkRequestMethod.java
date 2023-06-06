package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NetworkRequestMethod extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    private static final SparseArray<String> b;
    public static ChangeQuickRedirect c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface JSRequestService {
        @GET
        rx.d<ap> get(@Url String str, @QueryMap Map<String, String> map, @HeaderMap Map<String, String> map2);

        @POST
        @FormUrlEncoded
        rx.d<ap> postForm(@Url String str, @FieldMap Map<String, String> map, @HeaderMap Map<String, String> map2);

        @POST
        rx.d<ap> postJSON(@Url String str, @Body Map<String, String> map, @HeaderMap Map<String, String> map2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("parametersEncoding")
        public int a;
        @SerializedName("host")
        public String b;
        @SerializedName("test_host")
        public String c;
        @SerializedName("path")
        public String d;
        @SerializedName("biz")
        public String e;
        @SerializedName("parameters")
        public Map<String, String> f;
        @SerializedName("method")
        public String g = "post";
        @SerializedName("postFailover")
        public boolean h = false;
        @SerializedName("headerParameters")
        public Map<String, String> i;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public String a() {
        return "networkMethod";
    }

    public void b(a aVar) {
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        b = sparseArray;
        sparseArray.put(0, PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
        b.put(1, PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(final String str, String str2, final String str3, final m mVar) {
        char c2;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcbcf065034a793618d061b633195f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcbcf065034a793618d061b633195f00");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            com.sankuai.waimai.alita.core.utils.c.a("JsBridge " + a() + ": taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
            a aVar = (a) com.sankuai.waimai.alita.core.utils.k.a().fromJson(str2, (Class<Object>) a.class);
            if (aVar == null || TextUtils.isEmpty(aVar.b) || TextUtils.isEmpty(aVar.d)) {
                return;
            }
            final String a2 = a(aVar);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74c0936387bb5f1248bad67ab564be3e", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = 0;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74c0936387bb5f1248bad67ab564be3e");
            } else {
                c2 = 0;
                b.c.a(JSRequestService.class, new com.sankuai.waimai.alita.platform.network.a() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.platform.network.a
                    public final String c() {
                        return a2;
                    }

                    @Override // com.sankuai.waimai.alita.platform.network.a
                    public final Gson d() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0eca8acfb98bd82ab8426885b70e1e6", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0eca8acfb98bd82ab8426885b70e1e6") : new GsonBuilder().create();
                    }
                });
            }
            b(aVar);
            rx.j<ap> jVar = new rx.j<ap>() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    ap apVar = (ap) obj;
                    Object[] objArr3 = {apVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c701d28a9bc9ddacf5fb877d7e332ba4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c701d28a9bc9ddacf5fb877d7e332ba4");
                        return;
                    }
                    try {
                        String string = apVar.string();
                        if (TextUtils.isEmpty(string)) {
                            NetworkRequestMethod.this.a(mVar, str3, "data is null");
                        } else {
                            NetworkRequestMethod.this.a(str, mVar, str3, new JSONObject(string));
                        }
                    } catch (Exception e) {
                        NetworkRequestMethod.this.a(mVar, str3, e.getMessage());
                    }
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4c8c108ddbbe7f9f2150106666fd0db0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4c8c108ddbbe7f9f2150106666fd0db0");
                        return;
                    }
                    com.sankuai.waimai.alita.core.utils.c.a("JsBridge " + NetworkRequestMethod.this.a() + " httpRequest | onCompleted");
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8306465abe72ef67ddbdc659436b914", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8306465abe72ef67ddbdc659436b914");
                    } else {
                        NetworkRequestMethod.this.a(mVar, str3, th.getMessage());
                    }
                }
            };
            Object[] objArr3 = new Object[2];
            objArr3[c2] = aVar;
            objArr3[1] = jVar;
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4bcdb76c0e477d5c5a30383318e6f6b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4bcdb76c0e477d5c5a30383318e6f6b0");
            } else if (b.indexOfKey(aVar.a) < 0) {
                jVar.onError(new IllegalArgumentException("不支持的 parametersEncoding: " + aVar.a));
            } else {
                rx.d<ap> dVar = null;
                if ("get".equals(aVar.g)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", b.get(aVar.a));
                    if (aVar.i != null && !aVar.i.isEmpty()) {
                        hashMap.putAll(aVar.i);
                    }
                    dVar = ((JSRequestService) b.a(JSRequestService.class)).get(aVar.d, aVar.f, hashMap);
                } else if ("post".equals(aVar.g)) {
                    HashMap hashMap2 = new HashMap();
                    if (aVar.h) {
                        hashMap2.put("post-fail-over", "true");
                    }
                    if (aVar.i != null && !aVar.i.isEmpty()) {
                        hashMap2.putAll(aVar.i);
                    }
                    if (aVar.a == 0) {
                        dVar = ((JSRequestService) b.a(JSRequestService.class)).postForm(aVar.d, aVar.f, hashMap2);
                    } else if (aVar.a == 1) {
                        dVar = ((JSRequestService) b.a(JSRequestService.class)).postJSON(aVar.d, aVar.f, hashMap2);
                    } else {
                        jVar.onError(new IllegalArgumentException("不支持的 parametersEncoding 值: " + aVar.a));
                    }
                } else {
                    jVar.onError(new IllegalArgumentException("不支持的 http 请求方法：" + aVar.g));
                }
                if (dVar != null) {
                    b.a(dVar, jVar, "ALITA_JS_NETWORKREQUEST", false);
                }
            }
        }
    }

    public String a(a aVar) {
        return aVar.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static final WeakHashMap<Object, HashSet<rx.j>> c = new WeakHashMap<>();
        public static final Object b = new Object();

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static abstract class AbstractC0707b<T> extends rx.j<T> {
        }

        public static <T> T a(Class<T> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa37f50fe547721b301a2608918e7d41", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa37f50fe547721b301a2608918e7d41") : (T) c.a(cls).a(cls);
        }

        public static <T> rx.k a(rx.d<T> dVar, rx.j<T> jVar, Object obj, boolean z) {
            Object[] objArr = {dVar, jVar, obj, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9950faad27580dd3b218d1de64adc609", RobustBitConfig.DEFAULT_VALUE)) {
                return (rx.k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9950faad27580dd3b218d1de64adc609");
            }
            rx.d b2 = dVar.d(new a(jVar)).b(rx.schedulers.a.e());
            d dVar2 = new d(jVar);
            synchronized (c) {
                HashSet<rx.j> hashSet = c.get(obj);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    c.put(obj, hashSet);
                }
                hashSet.add(dVar2);
            }
            return rx.d.a(dVar2, b2);
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class d<T> extends rx.j<T> {
            public static ChangeQuickRedirect a;
            private final rx.j<T> b;

            public d(rx.j<T> jVar) {
                Object[] objArr = {jVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358e2b7825ca2e2d50a19d71c3cef52c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358e2b7825ca2e2d50a19d71c3cef52c");
                } else {
                    this.b = jVar;
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2412d57ec065ccb3458e0d7b38b96733", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2412d57ec065ccb3458e0d7b38b96733");
                    return;
                }
                synchronized (b.c) {
                    for (HashSet hashSet : b.c.values()) {
                        hashSet.remove(this);
                    }
                }
                if (this.b != null) {
                    this.b.onCompleted();
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr = {th};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829a151cc58463aa13319a00c5437007", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829a151cc58463aa13319a00c5437007");
                } else if (this.b != null) {
                    this.b.onError(th);
                }
            }

            @Override // rx.e
            public final void onNext(T t) {
                Object[] objArr = {t};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2a978b478e5602f7c1af82d96ca7c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2a978b478e5602f7c1af82d96ca7c6");
                } else if (this.b != null) {
                    try {
                        this.b.onNext(t);
                    } catch (Throwable unused) {
                        com.sankuai.waimai.alita.core.utils.c.a("Failed to process network response");
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class a<T> implements rx.functions.g<T, T> {
            public static ChangeQuickRedirect a;
            private final AbstractC0707b<T> b;

            public a(rx.j<T> jVar) {
                Object[] objArr = {jVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b494665f51a1926f61c9353f7ce12992", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b494665f51a1926f61c9353f7ce12992");
                } else {
                    this.b = jVar instanceof AbstractC0707b ? (AbstractC0707b) jVar : null;
                }
            }

            @Override // rx.functions.g
            public final T call(T t) {
                Object[] objArr = {t};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e039c6aea826cb1c322ac3497fb92d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e039c6aea826cb1c322ac3497fb92d") : this.b != null ? t : t;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class c {
            public static ChangeQuickRedirect a;
            private static volatile com.meituan.android.singleton.e<ar> b;
            private static ConcurrentHashMap<Class, com.meituan.android.singleton.e<ar>> c = new ConcurrentHashMap<>();

            public static void a(Class cls, com.meituan.android.singleton.e<ar> eVar) {
                Object[] objArr = {cls, eVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3440730a882c82d971b353a899929e64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3440730a882c82d971b353a899929e64");
                } else {
                    c.put(cls, eVar);
                }
            }

            public static ar a(Class cls) {
                Object[] objArr = {cls};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f93b06334c3dd8fe8d4f89435f160848", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f93b06334c3dd8fe8d4f89435f160848");
                }
                com.meituan.android.singleton.e<ar> eVar = c.get(cls);
                if (eVar == null) {
                    eVar = b;
                }
                return eVar.b();
            }
        }
    }
}
