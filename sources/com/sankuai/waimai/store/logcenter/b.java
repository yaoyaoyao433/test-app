package com.sankuai.waimai.store.logcenter;

import android.support.annotation.NonNull;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ar;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @NonNull
    private ar b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fda80f5b9072222f5739b13317e2d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fda80f5b9072222f5739b13317e2d3");
            return;
        }
        this.b = new ar.a().a("http://localhost/").a(i.a(new com.sankuai.meituan.kernel.net.d() { // from class: com.sankuai.waimai.store.logcenter.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.d
            public final void a(@NonNull OkHttpClient.Builder builder) {
                Object[] objArr2 = {builder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0dee7f198f6cbee0e5085cf0e3444dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0dee7f198f6cbee0e5085cf0e3444dc");
                } else {
                    builder.connectTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).addInterceptor(new Interceptor() { // from class: com.sankuai.waimai.store.logcenter.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr3 = {chain};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97c6758dd8e726bbe51b6aac5c88c056", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97c6758dd8e726bbe51b6aac5c88c056") : chain.proceed(chain.request());
                        }
                    });
                }
            }
        })).a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends j<Void> {
        public static ChangeQuickRedirect a;
        private final f b;
        @NonNull
        private final List<Object> c;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            Object[] objArr = {(Void) obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eab65e10793eb2b6ee6baf4236c1fe5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eab65e10793eb2b6ee6baf4236c1fe5");
            } else if (this.b != null) {
                this.b.a(this.c);
            }
        }

        private a(f fVar, @NotNull List<Object> list) {
            Object[] objArr = {fVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ebe4814be77ff112a03cd67bab4d2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ebe4814be77ff112a03cd67bab4d2c");
                return;
            }
            this.b = fVar;
            this.c = list;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38fb1ee061395b287b2c1455e8702481", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38fb1ee061395b287b2c1455e8702481");
            } else if (this.b != null) {
                this.b.d();
            }
        }
    }

    public final void a(@NonNull Map<String, Object> map, f fVar, @NonNull List<Object> list) {
        Object[] objArr = {map, fVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fd698f69ba7a257c327c85f73fad96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fd698f69ba7a257c327c85f73fad96");
            return;
        }
        fVar.c();
        final String a2 = com.sankuai.waimai.store.util.i.a(map);
        if (a2 == null || "".equals(a2)) {
            return;
        }
        rx.d.a(new a(fVar, list), rx.d.a((d.a) new d.a<Void>() { // from class: com.sankuai.waimai.store.logcenter.b.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98f8abddb387fe3cec7c333c8fac6d0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98f8abddb387fe3cec7c333c8fac6d0a");
                    return;
                }
                ak a3 = b.a(a2);
                if (a3 == null) {
                    jVar.onError(new Throwable("create body failed !"));
                } else if (b.this.a(a3)) {
                    jVar.onNext(null);
                } else {
                    jVar.onError(new Throwable("send body failed !"));
                }
            }
        }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    boolean a(@NonNull ak akVar) {
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bfc9759f863c05c04b709b0990c3eec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bfc9759f863c05c04b709b0990c3eec")).booleanValue();
        }
        Call<Void> reportLog = ((RequestApiService) this.b.a(RequestApiService.class)).reportLog("https://rt-health-trace-log.dreport.meituan.net/", akVar);
        if (reportLog != null) {
            try {
                com.sankuai.meituan.retrofit2.Response<Void> a2 = reportLog.a();
                if (a2 != null) {
                    if (a2.b() == 200) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static ak a(@NonNull String str) {
        byte[] bArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2652642a4092f044565c15e3d8ce95cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2652642a4092f044565c15e3d8ce95cb");
        }
        try {
            bArr = str.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return al.a(bArr, "application/json; charset=UTF-8");
    }
}
