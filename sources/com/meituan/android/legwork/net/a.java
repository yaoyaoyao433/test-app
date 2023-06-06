package com.meituan.android.legwork.net;

import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect b;

    public abstract aj a(aj ajVar);

    public abstract i.a a();

    public abstract a.InterfaceC0637a b();

    public abstract String d();

    public final ar c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6323c7c1cb3df3ab0ce92c52c9d75190", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6323c7c1cb3df3ab0ce92c52c9d75190") : new ar.a().a(d()).a(b()).a(f.a(rx.schedulers.a.e())).a(a()).a(new Interceptor() { // from class: com.meituan.android.legwork.net.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.Interceptor
            public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04958ad580d2406f7a3c672b032b1c24", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04958ad580d2406f7a3c672b032b1c24");
                }
                aj a2 = a.this.a(aVar.request());
                com.sankuai.meituan.retrofit2.raw.b a3 = aVar.a(a2);
                a aVar2 = a.this;
                Object[] objArr3 = {a2, a3};
                ChangeQuickRedirect changeQuickRedirect3 = a.b;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "9db0f16bc1eccc3f13c13e94a37667b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "9db0f16bc1eccc3f13c13e94a37667b1");
                } else {
                    try {
                        if (!a2.b().contains("report/metrics")) {
                            URL url = new URL(a2.b());
                            x.d("AbstractRetrofit.logResponse()", "API response，path: " + url.getPath() + ",response:" + aVar2.a(a3.body().contentType(), a3.body().source()));
                        }
                    } catch (Throwable th) {
                        x.a(th);
                    }
                }
                return a3;
            }
        }).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:56|57|(9:61|(1:11)|12|13|14|15|(3:17|(1:19)(1:39)|20)(1:40)|(3:22|(1:24)(1:36)|25)(1:37)|(3:27|28|30)(1:34)))|14|15|(0)(0)|(0)(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:6|7|(6:(3:56|57|(9:61|(1:11)|12|13|14|15|(3:17|(1:19)(1:39)|20)(1:40)|(3:22|(1:24)(1:36)|25)(1:37)|(3:27|28|30)(1:34)))|14|15|(0)(0)|(0)(0)|(0)(0))|9|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        com.meituan.android.legwork.utils.x.a(r12);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
        r12 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: Throwable -> 0x0066, TryCatch #7 {Throwable -> 0x0066, blocks: (B:21:0x0059, B:28:0x0070, B:32:0x0089, B:31:0x0083, B:26:0x006a), top: B:74:0x0059, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: Throwable -> 0x00c7, TRY_ENTER, TryCatch #6 {Throwable -> 0x00c7, blocks: (B:20:0x0048, B:36:0x0094, B:40:0x00b1), top: B:76:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r12, java.io.InputStream r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.net.a.a(java.lang.String, java.io.InputStream):java.lang.String");
    }
}
