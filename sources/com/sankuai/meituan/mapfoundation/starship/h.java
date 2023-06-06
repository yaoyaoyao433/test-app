package com.sankuai.meituan.mapfoundation.starship;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.b;
import com.sankuai.meituan.retrofit2.q;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements b {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public Map<String, String> e;
    public b.a f;

    public h(final com.sankuai.meituan.retrofit2.raw.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21d9e07bf41b5b7e995a3ae3381405d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21d9e07bf41b5b7e995a3ae3381405d");
            return;
        }
        this.c = bVar.url();
        this.b = bVar.code();
        this.d = bVar.reason();
        this.e = new HashMap();
        if (bVar.headers() != null) {
            for (q qVar : bVar.headers()) {
                this.e.put(qVar.b, qVar.c);
            }
        }
        if (bVar.body() != null) {
            this.f = new b.a() { // from class: com.sankuai.meituan.mapfoundation.starship.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapfoundation.starship.b.a
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f79ca1fd1f8838a3ea361900a8961a49", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f79ca1fd1f8838a3ea361900a8961a49") : bVar.body().contentType();
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.b.a
                public final long b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d1d3025898ec644990711a0b85b991b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d1d3025898ec644990711a0b85b991b")).longValue() : bVar.body().contentLength();
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.b.a
                public final InputStream c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7122d545e23a66503bc8b08a8016eec", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7122d545e23a66503bc8b08a8016eec") : bVar.body().source();
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.b.a
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38419d5c3f09ce13dc9afa4cbac1e0c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38419d5c3f09ce13dc9afa4cbac1e0c9");
                    } else {
                        bVar.body().close();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.b
    public final int a() {
        return this.b;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.b
    public final Map<String, String> b() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.b
    public final b.a c() {
        return this.f;
    }
}
