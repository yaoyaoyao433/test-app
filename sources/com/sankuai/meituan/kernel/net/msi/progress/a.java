package com.sankuai.meituan.kernel.net.msi.progress;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;
    private final b b;

    public a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be6f4dfc58e77702cad42fa4a04b6765", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be6f4dfc58e77702cad42fa4a04b6765");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44c5d153593b54627405f32e81baadd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44c5d153593b54627405f32e81baadd");
        }
        com.sankuai.meituan.retrofit2.raw.b a2 = aVar.a(aVar.request());
        b.a aVar2 = new b.a(a2);
        aVar2.e = new c(a2.body(), this.b);
        return aVar2.a();
    }
}
