package com.meituan.android.neohybrid.v2.neo.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.neohybrid.neo.http.NeoRequestService;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.neohybrid.util.n;
import com.meituan.android.neohybrid.v2.neo.http.a;
import com.meituan.android.paybase.utils.y;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements f<ap> {
    public static ChangeQuickRedirect a;
    WeakReference<com.meituan.android.neohybrid.neo.http.a> b;
    WeakReference<com.meituan.android.neohybrid.neo.report.f> c;
    int d;
    String e;
    String f;
    public Map<String, String> g;
    Map<String, Object> h;
    private long i;
    private Map<String, String> j;
    private JsonElement k;
    private long l;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2992b9ec9cded149d7c614b49c09ad2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2992b9ec9cded149d7c614b49c09ad2a");
        } else {
            this.d = 703710;
        }
    }

    public final b a() {
        String str;
        Call<ap> postJson;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3e22f11fbde13d42ba832822fb1559", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3e22f11fbde13d42ba832822fb1559");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7f93560ee29b0acdc6e02c9916080d3", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7f93560ee29b0acdc6e02c9916080d3");
        } else {
            if ((TextUtils.isEmpty(this.e) || this.e.startsWith(AbsApiFactory.HTTP) || this.e.startsWith(AbsApiFactory.HTTPS)) && (TextUtils.isEmpty(this.f) || this.f.startsWith("/"))) {
                if (TextUtils.isEmpty(this.e)) {
                    this.e = com.meituan.android.neohybrid.init.a.e();
                }
                str = this.e + this.f;
            } else {
                str = null;
            }
        }
        if (str == null) {
            com.meituan.android.neohybrid.exception.a.a("Illegal params", "NeoRetrofitService_request");
            return this;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9849c854eec598328f366b51acc874d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9849c854eec598328f366b51acc874d2");
        } else {
            if (this.j == null) {
                this.j = new HashMap();
            }
            if (this.l > 0) {
                this.j.put("neo_header_shark_limit_time", String.valueOf(this.l));
            }
        }
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "87a49395f3c86ad435eadeb9ee9e4512", RobustBitConfig.DEFAULT_VALUE)) {
            postJson = (Call) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "87a49395f3c86ad435eadeb9ee9e4512");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.neohybrid.v2.neo.http.a.a;
            NeoRequestService neoRequestService = (NeoRequestService) (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "cf67869697d108fc234e7e1b659f2abe", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "cf67869697d108fc234e7e1b659f2abe") : a.C0313a.a().b).a(NeoRequestService.class);
            if (this.h != null) {
                postJson = neoRequestService.postForm(str, this.g, this.j, this.h);
            } else {
                postJson = neoRequestService.postJson(str, this.g, this.j, this.k);
            }
        }
        postJson.a(this);
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "65c8a42b5b33e2b972cce401cf14b26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "65c8a42b5b33e2b972cce401cf14b26b");
        } else {
            this.i = System.currentTimeMillis();
            com.meituan.android.neohybrid.neo.report.f c = c();
            if (c != null) {
                c.a("b_pay_hybrid_request_start_mv", "hybrid_request_start", com.meituan.android.neohybrid.neo.report.a.c("domain", this.e).b("path", this.f));
            }
            HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("request_path", this.f).b;
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_common_network_start_sc", hashMap);
            com.meituan.android.neohybrid.neo.report.c.a("paybiz_common_network_start", hashMap);
        }
        return this;
    }

    private com.meituan.android.neohybrid.neo.http.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3ce562341b900494da8d74d7eb7c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.http.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3ce562341b900494da8d74d7eb7c9d");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    private com.meituan.android.neohybrid.neo.report.f c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c697382afc5dd558e730c522dccedc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.report.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c697382afc5dd558e730c522dccedc7");
        }
        if (this.c != null) {
            return this.c.get();
        }
        return null;
    }

    private void a(Response<ap> response, Throwable th) {
        String str;
        int i;
        Object[] objArr = {response, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7b338e646478d9e3988f7fb8c782ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7b338e646478d9e3988f7fb8c782ed");
            return;
        }
        Object[] objArr2 = {response, th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        com.meituan.android.neohybrid.exception.b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89f4347d012b5ffc961c12810ec8421e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89f4347d012b5ffc961c12810ec8421e");
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.i;
            if (response != null) {
                str = response.c();
                i = response.b();
            } else {
                str = null;
                i = -2;
            }
            if (th != null) {
                str = th.getMessage();
            }
            com.meituan.android.neohybrid.neo.report.f c = c();
            if (c != null) {
                HashMap<String, Object> b = com.meituan.android.neohybrid.neo.report.a.c("domain", this.e).a("path", this.f).a("duration", Long.valueOf(currentTimeMillis)).b(MonitorManager.ERR_MSG, str);
                b.putAll(y.a(this.f));
                c.a("b_pay_hybrid_request_fail_mv", "hybrid_request_fail", b);
            }
            HashMap<String, Object> b2 = com.meituan.android.neohybrid.neo.report.a.c("is_from_web", Boolean.TRUE).a("request_path", this.f).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i)).a(NetLogConstants.Details.ERROR_MSG, str).b("duration", Long.valueOf(currentTimeMillis));
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_common_network_fail_sc", b2);
            com.meituan.android.neohybrid.neo.report.c.a("paybiz_common_network_fail", b2);
        }
        com.meituan.android.neohybrid.neo.http.a b3 = b();
        if (b3 == null) {
            return;
        }
        if (response != null) {
            ap e = response.e();
            bVar = new com.meituan.android.neohybrid.exception.b(response.b(), response.c(), e != null ? e.string() : StringUtil.NULL);
        } else if (th != null) {
            bVar = new com.meituan.android.neohybrid.exception.b(th);
        }
        try {
            b3.onRequestFail(this.d, bVar);
        } catch (Exception e2) {
            com.meituan.android.neohybrid.exception.a.a(e2, "NeoRetrofitService_onResponseFail");
        }
    }

    private Object a(String str, com.meituan.android.neohybrid.neo.http.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a713fc1ae08df176646e2e26322dc8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a713fc1ae08df176646e2e26322dc8");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Type a2 = g.a(aVar, com.meituan.android.neohybrid.neo.http.a.class);
        if (a2 == null) {
            com.meituan.android.neohybrid.exception.a.a("serializedType is null", "NeoRetrofitService_getCallbackSerializeType");
            return null;
        } else if (a2 == String.class) {
            return str;
        } else {
            try {
                return com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, a2);
            } catch (Exception e) {
                com.meituan.android.neohybrid.exception.a.a(e, "NeoRetrofitService_getCallbackSerializeType");
                return null;
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onResponse(Call<ap> call, Response<ap> response) {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a5bc89109d9b17761eea63c3952690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a5bc89109d9b17761eea63c3952690");
        } else if (!response.f()) {
            a(response, (Throwable) null);
        } else {
            Object[] objArr2 = {response};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8991500c187d167851584aae63dca65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8991500c187d167851584aae63dca65");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8f137c73d4ee95bea78a1c4c1ab53e44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8f137c73d4ee95bea78a1c4c1ab53e44");
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.i;
                com.meituan.android.neohybrid.neo.report.f c = c();
                if (c != null) {
                    HashMap<String, Object> b = com.meituan.android.neohybrid.neo.report.a.c("domain", this.e).a("path", this.f).b("duration", Long.valueOf(currentTimeMillis));
                    b.putAll(y.a(this.f));
                    c.a("b_pay_hybrid_request_succ_mv", "hybrid_request_succ", b);
                }
                HashMap<String, Object> b2 = com.meituan.android.neohybrid.neo.report.a.c("is_from_web", Boolean.TRUE).a("request_path", this.f).b("duration", Long.valueOf(currentTimeMillis));
                com.meituan.android.neohybrid.neo.report.b.a("b_pay_common_network_succ_sc", b2);
                com.meituan.android.neohybrid.neo.report.c.a("paybiz_common_network_succ", b2);
            }
            com.meituan.android.neohybrid.neo.http.a b3 = b();
            if (b3 != null) {
                Object a2 = a(response.e().string(), b3);
                try {
                    if (a2 != null) {
                        b3.onRequestSucc(this.d, a2);
                    } else {
                        b3.onRequestFail(this.d, new com.meituan.android.neohybrid.exception.b("serializedResponse is null"));
                    }
                } catch (Exception e) {
                    com.meituan.android.neohybrid.exception.a.a(e, "NeoRetrofitService_onResponseSuccess");
                }
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onFailure(Call<ap> call, Throwable th) {
        Object[] objArr = {call, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2b7502c2f4df27f898b13a3040d0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2b7502c2f4df27f898b13a3040d0da");
        } else {
            a((Response<ap>) null, th);
        }
    }

    public static a a(com.meituan.android.neohybrid.neo.http.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27deead50a7d14c90473ba6dfad3559", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27deead50a7d14c90473ba6dfad3559") : new a().a(aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae6667bc50b3101a9f04bf4bed7ac75", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae6667bc50b3101a9f04bf4bed7ac75");
            } else {
                this.b = new b();
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f3c4d0dd36134d1e0d35800dcda256", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f3c4d0dd36134d1e0d35800dcda256");
            }
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            try {
                Uri parse = Uri.parse(str);
                String a2 = n.a(parse);
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71c54b2a086143662c3c323681b52add", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71c54b2a086143662c3c323681b52add");
                } else {
                    this.b.e = a2;
                }
                Map<String, String> b = n.b(parse);
                Object[] objArr3 = {b};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b95b12bc9afb611ce05c5718cc5003fc", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar2 = (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b95b12bc9afb611ce05c5718cc5003fc");
                } else if (b != null) {
                    if (this.b.g == null) {
                        this.b.g = new HashMap();
                    }
                    this.b.g.putAll(b);
                }
                String path = parse.getPath();
                Object[] objArr4 = {path};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cb9276398fcb6729f17a5b3c33f7adb8", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar3 = (a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cb9276398fcb6729f17a5b3c33f7adb8");
                } else {
                    this.b.f = path;
                }
            } catch (Exception e) {
                com.meituan.android.neohybrid.exception.a.a(e, "NeoRetrofitService_Builder_url");
            }
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f632a2637e511dc06b727b13676214", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f632a2637e511dc06b727b13676214");
            }
            this.b.h = map;
            return this;
        }

        public final a a(com.meituan.android.neohybrid.neo.http.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6303adf2e85591b090b58101b95e52cf", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6303adf2e85591b090b58101b95e52cf");
            }
            this.b.b = new WeakReference<>(aVar);
            return this;
        }

        public final a a(com.meituan.android.neohybrid.neo.report.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a644d4b2ee6f8dbfbd2aae3a23cb8a2", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a644d4b2ee6f8dbfbd2aae3a23cb8a2");
            }
            this.b.c = new WeakReference<>(fVar);
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bdb402a93cf6e506633c77b0789aaa5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bdb402a93cf6e506633c77b0789aaa5");
            }
            this.b.d = i;
            return this;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add4693b7286dd169db3a06b5a16ad9a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add4693b7286dd169db3a06b5a16ad9a") : this.b.a();
        }
    }
}
