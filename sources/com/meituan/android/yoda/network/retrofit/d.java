package com.meituan.android.yoda.network.retrofit;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Network;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.singleton.i;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.android.yoda.network.a;
import com.meituan.android.yoda.util.x;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import com.squareup.okhttp.v;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.meituan.android.yoda.network.a {
    public static ChangeQuickRedirect d;
    private volatile ar e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static d a = new d(null);
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(Network network, String str, String str2, String str3, String str4, h<String> hVar, boolean z) {
    }

    public /* synthetic */ d(AnonymousClass1 anonymousClass1) {
        this();
    }

    public d() {
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a32ed377d129f1574ea57c23194081c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a32ed377d129f1574ea57c23194081c");
            return;
        }
        a.InterfaceC0637a interfaceC0637a = null;
        try {
            interfaceC0637a = i.a("okhttp");
        } catch (Throwable unused) {
        }
        if (interfaceC0637a == null) {
            com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "createRetrofit, RetrofitCallFactorySingleton init failed.", true);
            v vVar = new v();
            OkHttp2Wrapper.addInterceptorToClient(vVar);
            this.e = new ar.a().a(com.meituan.android.yoda.plugins.d.a().d()).a(com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(com.sankuai.waimai.launcher.util.aop.b.a(vVar))).a(b.a()).a(new MtRetrofitInterceptor()).a();
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "createRetrofit, RetrofitCallFactorySingleton init OK.", true);
        this.e = new ar.a().a(com.meituan.android.yoda.plugins.d.a().d()).a(interfaceC0637a).a(b.a()).a();
    }

    private YodaApiRetrofitService f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51620451d7fed35e1bbc793a6d687f3f", RobustBitConfig.DEFAULT_VALUE) ? (YodaApiRetrofitService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51620451d7fed35e1bbc793a6d687f3f") : (YodaApiRetrofitService) this.e.a(YodaApiRetrofitService.class);
    }

    @Override // com.meituan.android.yoda.network.a
    /* renamed from: b */
    public final d a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4bf44ff40ec594601219bee71653ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4bf44ff40ec594601219bee71653ee");
        }
        if (this.e == null) {
            e();
        }
        return this;
    }

    @Override // com.meituan.android.yoda.network.a
    public final com.meituan.android.yoda.network.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0839f7001ac8330a292a0c18792901", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.yoda.network.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0839f7001ac8330a292a0c18792901");
        }
        e();
        return this;
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, h<YodaResult> hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "150a0e151134d00a19b2ab999555eaa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "150a0e151134d00a19b2ab999555eaa0");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "getPageData, requestCode = " + str, true);
        a("yoda_pagedata", "getPageData", f().getPageData(str, d(), 4, b), str, hVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.network.retrofit.d$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements f<Bitmap> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ long b;
        public final /* synthetic */ h c;
        public final /* synthetic */ String d;

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onResponse(Call<Bitmap> call, Response<Bitmap> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42dfede76b530959befc9b008b259ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42dfede76b530959befc9b008b259ab");
                return;
            }
            com.meituan.android.yoda.monitor.report.a.a("yoda_info", response.b(), 0, 0, (int) (System.currentTimeMillis() - this.b), null, response.a());
            StringBuilder sb = new StringBuilder("captchaBitmap onResponse,response:");
            sb.append(response == null ? null : response.e());
            com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", sb.toString(), true);
            if (response == null) {
                this.c.a(this.d, x.c());
                com.meituan.android.yoda.monitor.report.b.a("yoda_info", 10025, 0, 0, (int) (System.currentTimeMillis() - this.b), null, null);
                return;
            }
            a.C0380a c0380a = new a.C0380a();
            if (response.d() != null) {
                Iterator<q> it = response.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    q next = it.next();
                    if (next != null && "Picinfo".equals(next.a())) {
                        c0380a.b = x.b(next.b());
                        break;
                    }
                }
            }
            c0380a.a = response.e();
            this.c.a(this.d, (String) c0380a);
            com.meituan.android.yoda.monitor.report.b.a("yoda_info", 200, 0, 0, (int) (System.currentTimeMillis() - this.b), null, response.a());
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onFailure(Call<Bitmap> call, Throwable th) {
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d907932aa152e7a23f0fab6c370315", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d907932aa152e7a23f0fab6c370315");
                return;
            }
            StringBuilder sb = new StringBuilder("captchaBitmap onFailure,throwable:");
            sb.append(th == null ? null : th.getLocalizedMessage());
            com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", sb.toString(), true);
            com.meituan.android.yoda.monitor.report.b.a("yoda_info", 10024, 0, 0, (int) (System.currentTimeMillis() - this.b), null, null);
            this.c.a(this.d, x.c());
        }
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ff117947b2fb0f3e1621a7aefe7253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ff117947b2fb0f3e1621a7aefe7253");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "requestInfo, requestCode = " + str3, true);
        HashMap<String, String> a2 = a(i, str3, str4, z, hashMap);
        a2.put("fePortraitUIType", String.valueOf(com.meituan.android.yoda.config.ui.d.a().f()));
        a("yoda_info", str, f().yodaRequest(str2, "info", a2), str3, hVar);
    }

    @Override // com.meituan.android.yoda.network.a
    public final void b(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeafe8055dfe2517b154e25da97b0a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeafe8055dfe2517b154e25da97b0a3");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "requestVerify, requestCode = " + str3, true);
        a("yoda_verify", str, f().yodaRequest(str2, "verify", a(i, str3, str4, z, hashMap)), str3, hVar);
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, int i, String str2, String str3, String str4, File file, String str5, boolean z, HashMap<String, String> hashMap, h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, file, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec707729dfa20f5d41277a70b8692157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec707729dfa20f5d41277a70b8692157");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "requestVerify, requestCode = " + str3, true);
        HashMap<String, String> a2 = a(i, str3, str4, z, hashMap);
        ae.b a3 = ae.b.a("voicedata", file.getName(), al.a(file, "audio/wav"));
        ArrayList arrayList = new ArrayList();
        for (String str6 : a2.keySet()) {
            arrayList.add(ae.b.a(str6, null, al.a(a2.get(str6).getBytes(), "multipart/form-data")));
        }
        a("yoda_verify", str, f().yodaRequest(str2, "verify", a3, arrayList), str3, hVar);
    }

    private void a(final String str, final String str2, Call<YodaResult> call, final String str3, final h<YodaResult> hVar) {
        Object[] objArr = {str, str2, call, str3, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa709a6d5d67b5de90821b3e943c044d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa709a6d5d67b5de90821b3e943c044d");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        call.a(new f<YodaResult>() { // from class: com.meituan.android.yoda.network.retrofit.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<YodaResult> call2, Response<YodaResult> response) {
                Object[] objArr2 = {call2, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "790338192a4b45b23a468e0a1d31ecf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "790338192a4b45b23a468e0a1d31ecf5");
                    return;
                }
                String str4 = "";
                if (response != null && response.e() != null) {
                    str4 = response.e().toString();
                }
                com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", str2 + " onResponse, requestCode = " + str3 + ", response = " + str4, true);
                if (response != null && response.e() != null) {
                    YodaResult e = response.e();
                    com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", str2 + " onResponse, requestCode = " + str3 + ", yodaResult = " + e.toString(), true);
                    com.meituan.android.yoda.monitor.report.a.a(str, response.b(), 0, 0, (int) (System.currentTimeMillis() - currentTimeMillis), e, response.a());
                    com.meituan.android.yoda.monitor.report.b.a(str, 200, 0, 0, (int) (System.currentTimeMillis() - currentTimeMillis), response.e(), response.a());
                    if (e.status == 1 && hVar != null) {
                        hVar.a(str3, (String) e);
                        return;
                    } else if (e.error != null && hVar != null) {
                        hVar.a(str3, e.error);
                        return;
                    }
                } else if (response != null) {
                    com.meituan.android.yoda.monitor.report.b.a(str, response.b(), 0, 0, (int) (System.currentTimeMillis() - currentTimeMillis), null, response.a());
                } else {
                    com.meituan.android.yoda.monitor.report.b.a(str, 10025, 0, 0, (int) (System.currentTimeMillis() - currentTimeMillis), null, null);
                }
                if (hVar != null) {
                    hVar.a(str3, x.a());
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<YodaResult> call2, Throwable th) {
                Object[] objArr2 = {call2, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61fedc1fea3533aca81c555fd845ffd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61fedc1fea3533aca81c555fd845ffd0");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", str2 + " onFailure, requestCode = " + str3 + ", error = " + th.getMessage(), true);
                com.meituan.android.yoda.monitor.report.b.a(str, 10024, 0, 0, (int) (System.currentTimeMillis() - currentTimeMillis), null, null);
                if (hVar != null) {
                    hVar.a(str3, x.a(th));
                }
            }
        });
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(final String str, String str2, final h<ap> hVar) {
        Object[] objArr = {str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c1550f6b5e7e7b7a45438267975360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c1550f6b5e7e7b7a45438267975360");
            return;
        }
        Object[] objArr2 = {str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf06650d7adf70419afe9c1516e8b2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf06650d7adf70419afe9c1516e8b2b6");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str);
        ((MtsiApiRetrofitService) this.e.a(MtsiApiRetrofitService.class)).mtsiVerify(str2, hashMap).a(new f<ap>() { // from class: com.meituan.android.yoda.network.retrofit.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2bb2f5d29ac608ba6aa3d8cbada579d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2bb2f5d29ac608ba6aa3d8cbada579d");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "postForMtsiCheck, onResponse, requestCode = " + str, true);
                if (response == null || hVar == null || response.b() != 200) {
                    return;
                }
                hVar.a(str, (String) response.e());
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cfd0dfbc35001ff4715ccdff780d50aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cfd0dfbc35001ff4715ccdff780d50aa");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("RetrofitNetworkHelperImpl", "postForMtsiCheck, onFailure, requestCode = " + str + ", reason = " + th.getMessage(), true);
                hVar.a(str, x.a(th));
            }
        });
    }
}
