package com.meituan.android.okhttp3dns;

import android.content.Context;
import com.meituan.android.httpdns.IDnsListener;
import com.meituan.android.httpdns.NetworkStateReceiver;
import com.meituan.android.httpdns.b;
import com.meituan.android.httpdns.c;
import com.meituan.android.httpdns.f;
import com.meituan.android.httpdns.k;
import com.meituan.android.httpdns.l;
import com.meituan.android.httpdns.m;
import com.meituan.android.httpdns.r;
import com.meituan.android.httpdns.s;
import com.meituan.android.httpdns.t;
import com.meituan.android.httpdns.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import okhttp3.Dns;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.httpdns.a implements Dns {
    public static ChangeQuickRedirect e;

    private a(r rVar, w wVar, m mVar, c cVar, IDnsListener iDnsListener) {
        super(rVar, wVar, mVar, cVar, iDnsListener);
        Object[] objArr = {rVar, wVar, mVar, cVar, iDnsListener};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ceb811d177f5bd8029b46481b7d7e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ceb811d177f5bd8029b46481b7d7e6");
        }
    }

    @Override // okhttp3.Dns
    public final List<InetAddress> lookup(String str) throws UnknownHostException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ba8cddd7137e66e235635e0c84af38", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ba8cddd7137e66e235635e0c84af38") : a(str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.okhttp3dns.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0319a {
        public static ChangeQuickRedirect a;
        private r b;
        private List<String> c;
        private w d;
        private m e;
        private c f;
        private IDnsListener g;

        public final C0319a a(r rVar) {
            this.b = rVar;
            return this;
        }

        public final a a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f45f03e3959c5f927d7d79868076bf", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f45f03e3959c5f927d7d79868076bf");
            }
            if (this.b == null) {
                this.b = r.a;
            }
            if (this.d == null) {
                this.d = new w();
            }
            s a2 = t.a(context);
            if (context != null) {
                NetworkStateReceiver.initNetworkStateReceiver(context);
            }
            if (this.e == null) {
                this.e = new m(this.b, a2, new f(), new l(context));
            }
            if (this.f == null) {
                this.f = new b(this.c);
            }
            if (this.g == null) {
                this.g = k.a(context);
            }
            return new a(this.b, this.d, this.e, this.f, this.g);
        }
    }
}
