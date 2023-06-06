package com.meituan.android.neohybrid.neo.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.neohybrid.neo.http.b;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.neohybrid.util.n;
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
public final class c implements f<ap> {
    public static ChangeQuickRedirect a;
    WeakReference<com.meituan.android.neohybrid.neo.http.a> b;
    WeakReference<com.meituan.android.neohybrid.neo.report.f> c;
    int d;
    String e;
    String f;
    public Map<String, String> g;
    Map<String, String> h;
    Map<String, Object> i;
    private long j;
    private JsonElement k;
    private long l;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ceb97c8c257f4b3aad754e150a084cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ceb97c8c257f4b3aad754e150a084cb");
        } else {
            this.d = 703710;
        }
    }

    public final c a() {
        String str;
        Call<ap> postJson;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c451378e1035c19d15fd3e72cab3910", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c451378e1035c19d15fd3e72cab3910");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b884b50c233b7de87bcd1f16eb8aa95d", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b884b50c233b7de87bcd1f16eb8aa95d");
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79372ad716d62b0e261637405d0d37bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79372ad716d62b0e261637405d0d37bc");
        } else {
            if (this.h == null) {
                this.h = new HashMap();
            }
            if (this.l > 0) {
                this.h.put("neo_header_shark_limit_time", String.valueOf(this.l));
            }
        }
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c4cadeafc6ec4afc57e66823a94db8b0", RobustBitConfig.DEFAULT_VALUE)) {
            postJson = (Call) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c4cadeafc6ec4afc57e66823a94db8b0");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b.a;
            NeoRequestService neoRequestService = (NeoRequestService) (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1f17304afe9b8e4d5d680b7c4429bc7e", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1f17304afe9b8e4d5d680b7c4429bc7e") : b.a.a().b).a(NeoRequestService.class);
            if (this.i != null) {
                postJson = neoRequestService.postForm(str, this.g, this.h, this.i);
            } else {
                postJson = neoRequestService.postJson(str, this.g, this.h, this.k);
            }
        }
        postJson.a(this);
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8e546bccd6aace2fc767eb81275ea9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8e546bccd6aace2fc767eb81275ea9f9");
        } else {
            this.j = System.currentTimeMillis();
            com.meituan.android.neohybrid.neo.report.f c = c();
            if (c != null) {
                c.a("b_pay_hybrid_request_start_mv", "hybrid_request_start", com.meituan.android.neohybrid.neo.report.a.c("domain", this.e).b("path", this.f));
                c.a("b_pay_common_network_start_sc", "paybiz_common_network_start", com.meituan.android.neohybrid.neo.report.a.c("request_path", this.f).b);
            }
        }
        return this;
    }

    private com.meituan.android.neohybrid.neo.http.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91ec3c2968de054a34ee3f45b9422e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.http.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91ec3c2968de054a34ee3f45b9422e3");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    private com.meituan.android.neohybrid.neo.report.f c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ddd02cb5f619947119dee3998857cf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.report.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ddd02cb5f619947119dee3998857cf4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f92e80b82afeabdd7a6c5c3771e6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f92e80b82afeabdd7a6c5c3771e6cf");
            return;
        }
        Object[] objArr2 = {response, th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        com.meituan.android.neohybrid.exception.b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37781dbef669dfef6e500275e05ed968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37781dbef669dfef6e500275e05ed968");
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
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
                c.a("b_pay_common_network_fail_sc", "paybiz_common_network_fail", com.meituan.android.neohybrid.neo.report.a.c("is_from_web", Boolean.TRUE).a("request_path", this.f).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i)).a(NetLogConstants.Details.ERROR_MSG, str).b("duration", Long.valueOf(currentTimeMillis)));
            }
        }
        com.meituan.android.neohybrid.neo.http.a b2 = b();
        if (b2 == null) {
            return;
        }
        if (response != null) {
            ap e = response.e();
            bVar = new com.meituan.android.neohybrid.exception.b(response.b(), response.c(), e != null ? e.string() : StringUtil.NULL);
        } else if (th != null) {
            bVar = new com.meituan.android.neohybrid.exception.b(th);
        }
        try {
            b2.onRequestFail(this.d, bVar);
        } catch (Exception e2) {
            com.meituan.android.neohybrid.exception.a.a(e2, "NeoRetrofitService_onResponseFail");
        }
    }

    private Object a(String str, com.meituan.android.neohybrid.neo.http.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5905d8ccd913f3dbe186f12602e7cb4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5905d8ccd913f3dbe186f12602e7cb4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb9f89335e7c083adf291ac44ae56ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb9f89335e7c083adf291ac44ae56ec");
        } else if (!response.f()) {
            a(response, (Throwable) null);
        } else {
            Object[] objArr2 = {response};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc33541f3abb7deb46a6aab28f67f121", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc33541f3abb7deb46a6aab28f67f121");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4c5a3db07d3f2e47174a67aba675a79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4c5a3db07d3f2e47174a67aba675a79");
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.j;
                com.meituan.android.neohybrid.neo.report.f c = c();
                if (c != null) {
                    HashMap<String, Object> b = com.meituan.android.neohybrid.neo.report.a.c("domain", this.e).a("path", this.f).b("duration", Long.valueOf(currentTimeMillis));
                    b.putAll(y.a(this.f));
                    c.a("b_pay_hybrid_request_succ_mv", "hybrid_request_succ", b);
                    c.a("b_pay_common_network_succ_sc", "paybiz_common_network_succ", com.meituan.android.neohybrid.neo.report.a.c("is_from_web", Boolean.TRUE).a("request_path", this.f).b("duration", Long.valueOf(currentTimeMillis)));
                }
            }
            com.meituan.android.neohybrid.neo.http.a b2 = b();
            if (b2 != null) {
                Object a2 = a(response.e().string(), b2);
                try {
                    if (a2 != null) {
                        b2.onRequestSucc(this.d, a2);
                    } else {
                        b2.onRequestFail(this.d, new com.meituan.android.neohybrid.exception.b("serializedResponse is null"));
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a92950894e4e5a87bb143bdae4fb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a92950894e4e5a87bb143bdae4fb27");
        } else {
            a((Response<ap>) null, th);
        }
    }

    public static a a(com.meituan.android.neohybrid.neo.http.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312c8ddf8506e24def3d4f16b6ecf88c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312c8ddf8506e24def3d4f16b6ecf88c") : new a().a(aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public c b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72aec945a92dd250b187accaa9364d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72aec945a92dd250b187accaa9364d1");
            } else {
                this.b = new c();
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2550dab910e23b4b4e0b118221b8da51", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2550dab910e23b4b4e0b118221b8da51");
            }
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            try {
                Uri parse = Uri.parse(str);
                String a2 = n.a(parse);
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd88a1e812427a8df768730b0885a84a", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd88a1e812427a8df768730b0885a84a");
                } else {
                    this.b.e = a2;
                }
                Map<String, String> b = n.b(parse);
                Object[] objArr3 = {b};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8431154e288c5f6248d23dc3a2ac13f", RobustBitConfig.DEFAULT_VALUE)) {
                    a aVar2 = (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8431154e288c5f6248d23dc3a2ac13f");
                } else if (b != null) {
                    if (this.b.g == null) {
                        this.b.g = new HashMap();
                    }
                    this.b.g.putAll(b);
                }
                b(parse.getPath());
            } catch (Exception e) {
                com.meituan.android.neohybrid.exception.a.a(e, "NeoRetrofitService_Builder_url");
            }
            return this;
        }

        public final a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb3974872140f47ddaefb6da9640312", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb3974872140f47ddaefb6da9640312");
            }
            this.b.f = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5000e6e983cb853e377f4dad3969e5ff", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5000e6e983cb853e377f4dad3969e5ff");
            }
            if (map == null) {
                return this;
            }
            if (this.b.h == null) {
                this.b.h = new HashMap();
            }
            this.b.h.putAll(map);
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb9cfa2bdcb684672592a4368f6fcf1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb9cfa2bdcb684672592a4368f6fcf1");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return this;
            }
            if (this.b.h == null) {
                this.b.h = new HashMap();
            }
            this.b.h.put(str, str2);
            return this;
        }

        public final a b(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb6a1341c05dc9507c7f33b9c87cca7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb6a1341c05dc9507c7f33b9c87cca7");
            }
            this.b.i = map;
            return this;
        }

        public final a a(com.meituan.android.neohybrid.neo.http.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb533a76a9d0a41b14f783d871856e65", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb533a76a9d0a41b14f783d871856e65");
            }
            this.b.b = new WeakReference<>(aVar);
            return this;
        }

        public final a a(com.meituan.android.neohybrid.neo.report.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1826e5aa6320416d52fcd8a2de5ac4a7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1826e5aa6320416d52fcd8a2de5ac4a7");
            }
            this.b.c = new WeakReference<>(fVar);
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736df1b77e5ab404d42aa144bb427159", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736df1b77e5ab404d42aa144bb427159");
            }
            this.b.d = i;
            return this;
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ef094323d7d4ffe08473237566bfd4", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ef094323d7d4ffe08473237566bfd4") : this.b.a();
        }
    }
}
