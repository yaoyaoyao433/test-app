package com.sankuai.meituan.mapfoundation.starship;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.a;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.o;
import com.sankuai.meituan.retrofit2.q;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public Map<String, String> d;
    public Map<String, String> e;
    public a.InterfaceC0602a f;

    public g(final aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730f2825d151a16019adc27205282fbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730f2825d151a16019adc27205282fbf");
            return;
        }
        this.b = ajVar.e;
        this.c = ajVar.f;
        this.d = new HashMap();
        if (ajVar.g != null) {
            for (q qVar : ajVar.g) {
                this.d.put(qVar.b, qVar.c);
            }
        }
        this.e = new HashMap();
        Uri parse = Uri.parse(ajVar.e);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                this.e.put(str, parse.getQueryParameter(str));
            }
        }
        if (ajVar.h instanceof o) {
            o oVar = (o) ajVar.h;
            for (int i = 0; i < oVar.a(); i++) {
                this.e.put(oVar.a(i), oVar.c(i));
            }
        }
        if (ajVar.h != null) {
            this.f = new a.InterfaceC0602a() { // from class: com.sankuai.meituan.mapfoundation.starship.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapfoundation.starship.a.InterfaceC0602a
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfbed6823519e152f846021e8e9157c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfbed6823519e152f846021e8e9157c2") : ajVar.h.contentType();
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.a.InterfaceC0602a
                public final long b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb3fc95337770324bfcbebb1920c6892", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb3fc95337770324bfcbebb1920c6892")).longValue() : ajVar.h.contentLength();
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.a.InterfaceC0602a
                public final void a(OutputStream outputStream) throws IOException {
                    Object[] objArr2 = {outputStream};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32e26c89069ac3f381c8a637ba489b7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32e26c89069ac3f381c8a637ba489b7f");
                    } else {
                        ajVar.h.writeTo(outputStream);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.a
    public final String a() {
        return this.b;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.a
    public final Map<String, String> b() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.a
    public final Map<String, String> c() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.a
    public final a.InterfaceC0602a d() {
        return this.f;
    }
}
