package com.meituan.phoenix_okhttp;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.phoenix.base.b<x, t.a, z> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.phoenix.base.b
    public final /* synthetic */ z a(x xVar, String str, t.a aVar) throws IOException {
        x xVar2 = xVar;
        t.a aVar2 = aVar;
        Object[] objArr = {xVar2, str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21afba655b841b6f1e96dc2317562909", RobustBitConfig.DEFAULT_VALUE) ? (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21afba655b841b6f1e96dc2317562909") : aVar2.a(xVar2.f().a(xVar2.a.i().b(str).b()).a());
    }

    @Override // com.meituan.phoenix.base.b
    public final /* synthetic */ com.meituan.phoenix.data.e b(@NonNull z zVar) {
        z zVar2 = zVar;
        Object[] objArr = {zVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd053d2a1d3e831b4fbd7dcd2df335c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.phoenix.data.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd053d2a1d3e831b4fbd7dcd2df335c5");
        }
        com.meituan.phoenix.data.e eVar = new com.meituan.phoenix.data.e();
        eVar.a = zVar2.c();
        eVar.b = zVar2.c;
        return eVar;
    }

    public a(Context context, @NonNull com.meituan.phoenix.core.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3044d1e11143745a57bd1bf19da50664", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3044d1e11143745a57bd1bf19da50664");
        }
    }
}
