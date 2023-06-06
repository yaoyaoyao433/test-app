package com.meituan.android.httpdns;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.httpdns.a implements com.squareup.okhttp.o {
    public static ChangeQuickRedirect e;

    @Deprecated
    private g(r rVar, w wVar, m mVar, c cVar, IDnsListener iDnsListener) {
        super(rVar, wVar, mVar, cVar, iDnsListener);
        Object[] objArr = {rVar, wVar, mVar, cVar, iDnsListener};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51da55ba8bc110ecc8d0b06424718c3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51da55ba8bc110ecc8d0b06424718c3b");
        }
    }

    @Override // com.squareup.okhttp.o
    public final List<InetAddress> lookup(String str) throws UnknownHostException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a962a5f9a01042f219311097245fe681", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a962a5f9a01042f219311097245fe681") : a(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public c b;
        private r c;
        private List<String> d;
        private w e;
        private m f;
        private IDnsListener g;

        public final g a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f89e3bb13e38b8ccae4509db8a4d8282", 6917529027641081856L)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f89e3bb13e38b8ccae4509db8a4d8282");
            }
            if (!com.sankuai.meituan.serviceloader.b.a()) {
                com.sankuai.meituan.serviceloader.b.a(context);
            }
            if (this.c == null) {
                this.c = r.a;
            }
            if (this.e == null) {
                this.e = new w();
            }
            s a2 = t.a(context);
            if (context != null) {
                NetworkStateReceiver.initNetworkStateReceiver(context);
            }
            if (this.f == null) {
                this.f = new m(this.c, a2, new f(), new l(context));
            }
            if (this.b == null) {
                this.b = new b(this.d);
            }
            if (this.g == null) {
                this.g = k.a(context);
            }
            return new g(this.c, this.e, this.f, this.b, this.g);
        }
    }
}
