package com.sankuai.meituan.mapfoundation.starship;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements Interceptor {
    public static ChangeQuickRedirect a;
    public d b;

    public f(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8c2f03c30937a29cc15dee19b4bcfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8c2f03c30937a29cc15dee19b4bcfe");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73763821add04232635a729435050262", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73763821add04232635a729435050262");
        }
        final e eVar = new e(aVar.request(), aVar);
        final b a2 = this.b.a(eVar);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b956eabf64f4f020cbe828895d42de5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b956eabf64f4f020cbe828895d42de5f");
        }
        com.sankuai.meituan.retrofit2.raw.b bVar = eVar.d;
        Object[] objArr3 = {bVar, a2};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "15d0a85e670ee39ffa71cb64ab89f846", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "15d0a85e670ee39ffa71cb64ab89f846");
        }
        b.a aVar2 = new b.a(bVar);
        aVar2.c = a2.a();
        for (String str : a2.b().keySet()) {
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "b89c62b2750a2aa3b28cb1ce63f81df7", 6917529027641081856L)) {
                b.a aVar3 = (b.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "b89c62b2750a2aa3b28cb1ce63f81df7");
            } else {
                aVar2.f.a(str);
            }
            String str2 = a2.b().get(str);
            Object[] objArr5 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "1a0802eb8812a3a8cccdd11e5f22c148", 6917529027641081856L)) {
                b.a aVar4 = (b.a) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "1a0802eb8812a3a8cccdd11e5f22c148");
            } else {
                aVar2.f.a(str, str2);
            }
        }
        if (a2.c() != null) {
            aVar2.e = new ap() { // from class: com.sankuai.meituan.mapfoundation.starship.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.ap
                public final String contentType() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "adfc261603fdf72ecc32ff01dc781329", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "adfc261603fdf72ecc32ff01dc781329") : a2.c().a();
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final long contentLength() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "58f21dcc52f388af4945e91d3c6493dd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "58f21dcc52f388af4945e91d3c6493dd")).longValue() : a2.c().b();
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final InputStream source() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cd54dd5f193eadabb9af6ebd059e7958", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cd54dd5f193eadabb9af6ebd059e7958") : a2.c().c();
                }

                @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "955d2c1d8dd94e6a18dc75f7c5726d51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "955d2c1d8dd94e6a18dc75f7c5726d51");
                    } else {
                        a2.c().d();
                    }
                }
            };
        }
        return aVar2.a();
    }
}
