package com.meituan.android.paybase.retrofit;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ae;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect b;

    public abstract boolean a(@NonNull com.meituan.android.paybase.retrofit.b bVar, Exception exc);

    public abstract ar b();

    public static /* synthetic */ String a(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36890df8493a3d961f15bcbfe1ec0dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36890df8493a3d961f15bcbfe1ec0dc2");
        }
        if (call == null || call.e() == null || call.e().b() == null) {
            return null;
        }
        String b2 = call.e().b();
        if (Uri.parse(b2) == null) {
            return null;
        }
        return Uri.parse(b2).getPath();
    }

    public final <S> S a(Class<S> cls, com.meituan.android.paybase.retrofit.b bVar, int i) {
        Object[] objArr = {cls, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c9c0792be25dab25bf2f4a89bedc08", RobustBitConfig.DEFAULT_VALUE)) {
            return (S) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c9c0792be25dab25bf2f4a89bedc08");
        }
        if (b() == null) {
            throw new NullPointerException("Retrofit is not init !");
        }
        return (S) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(b().a(cls), bVar, i, this));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b<S> implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private S b;
        private WeakReference<com.meituan.android.paybase.retrofit.b> c;
        private int d;
        private a e;

        public static /* synthetic */ void a(b bVar, Call call, com.meituan.android.paybase.retrofit.b bVar2, Exception exc, long j) {
            Object[] objArr = {call, bVar2, exc, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2048039ff7b45c0215672a3587fca45e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2048039ff7b45c0215672a3587fca45e");
                return;
            }
            String a2 = a.a(call);
            long currentTimeMillis = System.currentTimeMillis() - j;
            Object[] objArr2 = {a2, new Long(currentTimeMillis), exc};
            ChangeQuickRedirect changeQuickRedirect2 = a.b;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8ac05b996d37896dfe81f46c84d479de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8ac05b996d37896dfe81f46c84d479de");
            } else if (!TextUtils.isEmpty(a2) && exc != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("request_path", a2);
                hashMap.put("duration", Long.valueOf(currentTimeMillis));
                hashMap.put("is_from_web", Boolean.FALSE);
                String message = exc.getMessage();
                if (exc instanceof PayException) {
                    ae.a(null, "b_pay_common_network_succ_sc", hashMap, ae.b, null, true);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_succ", hashMap, null, null);
                    PayException payException = (PayException) exc;
                    int code = payException.getCode();
                    int level = payException.getLevel();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    hashMap2.put(NetLogConstants.Details.ERROR_MSG, message);
                    hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(code));
                    hashMap2.put("error_level", Integer.valueOf(level));
                    ae.a(null, "b_pay_common_network_status_fail_sc", hashMap2, ae.b, null, true);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_status_fail", hashMap2, null, null);
                } else {
                    hashMap.put(NetLogConstants.Details.ERROR_MSG, message);
                    hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, -2);
                    ae.a(null, "b_pay_common_network_fail_sc", hashMap, ae.b, null, true);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_fail", hashMap, null, null);
                }
            }
            boolean z = exc instanceof PayException;
            if (!z) {
                HashMap<String, Object> hashMap3 = new a.c().b;
                hashMap3.put("message", exc.getMessage());
                if (call != null && call.e() != null) {
                    hashMap3.put("url", call.e().b());
                }
                com.meituan.android.paybase.common.analyse.a.a("b_x354czlt", hashMap3);
            }
            if (!bVar.e.a(bVar2, exc)) {
                bVar2.onRequestException(bVar.d, exc);
                return;
            }
            int code2 = z ? ((PayException) exc).getCode() : -1;
            String str = "";
            if (call != null && call.e() != null) {
                str = call.e().b();
            }
            a.c cVar = new a.c();
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.d);
            a.c a3 = cVar.a("tag", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(code2);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_f8nn0tvh_mv", a3.a("code", sb2.toString()).a("url", str).b);
        }

        public b(S s, com.meituan.android.paybase.retrofit.b bVar, int i, a aVar) {
            Object[] objArr = {s, bVar, Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06dbe3d1fab491b00d2086f8befed5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06dbe3d1fab491b00d2086f8befed5b");
                return;
            }
            this.b = s;
            this.c = new WeakReference<>(bVar);
            this.d = i;
            this.e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public com.meituan.android.paybase.retrofit.b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736dd5d7c4d8286e6d3fd72f07324333", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.paybase.retrofit.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736dd5d7c4d8286e6d3fd72f07324333");
            }
            com.meituan.android.paybase.retrofit.b bVar = this.c.get();
            if (bVar == null) {
                return new C0336a();
            }
            if ((bVar instanceof Activity) && ((Activity) bVar).isFinishing()) {
                return new C0336a();
            }
            if (bVar instanceof Fragment) {
                Fragment fragment = (Fragment) bVar;
                if (!fragment.isAdded() || fragment.getActivity().isFinishing()) {
                    return new C0336a();
                }
            }
            return bVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "052fcb365c87ab534c11bf6d770d5caa", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "052fcb365c87ab534c11bf6d770d5caa");
            }
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "a01733e28aaf0a60d6a94418b1938d87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "a01733e28aaf0a60d6a94418b1938d87");
            } else {
                a().onRequestStart(this.d);
            }
            Call call = (Call) method.invoke(this.b, objArr);
            final long currentTimeMillis = System.currentTimeMillis();
            String a2 = a.a(call);
            Object[] objArr4 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a.b;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect3, true, "107aa6863980c2215cad92e28258fe32", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect3, true, "107aa6863980c2215cad92e28258fe32");
            } else if (!TextUtils.isEmpty(a2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("request_path", a2);
                ae.a(null, "b_pay_common_network_start_sc", hashMap, ae.b, null, true);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_start", hashMap, null, null);
            }
            call.a(new f() { // from class: com.meituan.android.paybase.retrofit.a.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call call2, Response response) {
                    Object[] objArr5 = {call2, response};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "46d8ab5f9db24590b77b4d4850be4b73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "46d8ab5f9db24590b77b4d4850be4b73");
                        return;
                    }
                    com.meituan.android.paybase.retrofit.b a3 = b.this.a();
                    String a4 = a.a(call2);
                    if (response.f()) {
                        a3.onRequestSucc(b.this.d, response.e());
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        Object[] objArr6 = {a4, new Long(currentTimeMillis2)};
                        ChangeQuickRedirect changeQuickRedirect5 = a.b;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect5, true, "22da36c2f9c2631d5965fbf57f534112", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect5, true, "22da36c2f9c2631d5965fbf57f534112");
                        } else if (!TextUtils.isEmpty(a4)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("request_path", a4);
                            hashMap2.put("duration", Long.valueOf(currentTimeMillis2));
                            hashMap2.put("is_from_web", Boolean.FALSE);
                            ae.a(null, "b_pay_common_network_succ_sc", hashMap2, ae.b, null, true);
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_succ", hashMap2, null, null);
                            ae.a(null, "b_pay_common_network_status_succ_sc", hashMap2, ae.b, null, true);
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_network_status_succ", hashMap2, null, null);
                        }
                    } else {
                        b.a(b.this, call2, a3, new Exception(response.c()), currentTimeMillis);
                    }
                    a3.onRequestFinal(b.this.d);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call call2, Throwable th) {
                    Exception exc;
                    Object[] objArr5 = {call2, th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "003e94e9eecb71016f16f71c611553ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "003e94e9eecb71016f16f71c611553ab");
                        return;
                    }
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th.getMessage());
                    }
                    com.meituan.android.paybase.retrofit.b a3 = b.this.a();
                    b.a(b.this, call2, a3, exc, currentTimeMillis);
                    a3.onRequestFinal(b.this.d);
                }
            });
            return call;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.retrofit.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0336a implements com.meituan.android.paybase.retrofit.b {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestFinal(int i) {
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestStart(int i) {
        }

        public C0336a() {
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestSucc(int i, Object obj) {
            Object[] objArr = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac1206dcd5673a75283449cc9ee42ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac1206dcd5673a75283449cc9ee42ab");
                return;
            }
            a.c a2 = new a.c().a(KnbConstants.PARAMS_SCENE, "successful");
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_lkm6949n_mv", a2.a("tag", sb.toString()).a(CommonConstant.File.CLASS, obj != null ? obj.getClass().getName() : "obj_is_null").b);
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public final void onRequestException(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89e250ca6329bdf1ec99b5347fed335", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89e250ca6329bdf1ec99b5347fed335");
                return;
            }
            a.c a2 = new a.c().a(KnbConstants.PARAMS_SCENE, "failed");
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_lkm6949n_mv", a2.a("tag", sb.toString()).b);
        }
    }
}
