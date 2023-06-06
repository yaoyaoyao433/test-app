package com.sankuai.meituan.mapfoundation.starship;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.d;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.al;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements d.a {
    public static ChangeQuickRedirect a;
    public a b;
    public aj c;
    public com.sankuai.meituan.retrofit2.raw.b d;
    public Interceptor.a e;

    public e(aj ajVar, Interceptor.a aVar) {
        Object[] objArr = {ajVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20fd07f486b973cf759ac8b3500cd0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20fd07f486b973cf759ac8b3500cd0c");
            return;
        }
        this.c = ajVar;
        this.e = aVar;
        this.b = new g(ajVar);
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.d.a
    public final a a() {
        return this.b;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.d.a
    public final b a(a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0c6bca831b1f7f9b07e980b66316c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0c6bca831b1f7f9b07e980b66316c1");
        }
        this.c = a(this.c, aVar);
        this.d = this.e.a(this.c);
        return new h(this.d);
    }

    private aj a(aj ajVar, a aVar) {
        Object[] objArr = {ajVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01de52bc881e8015e4d6d73e957cd69d", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01de52bc881e8015e4d6d73e957cd69d");
        }
        aj.a a2 = ajVar.a();
        for (String str : aVar.b().keySet()) {
            a2.c(str);
            a2.b(str, aVar.b().get(str));
        }
        Uri.Builder clearQuery = Uri.parse(ajVar.e).buildUpon().clearQuery();
        for (String str2 : aVar.c().keySet()) {
            clearQuery.appendQueryParameter(str2, aVar.c().get(str2));
        }
        a2.b = clearQuery.toString();
        if (aVar.d() != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                aVar.d().a(byteArrayOutputStream);
                a2.d = al.a(byteArrayOutputStream.toByteArray(), aVar.d().a());
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a2.a();
    }
}
