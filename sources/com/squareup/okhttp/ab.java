package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ab {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ab(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            return this.a.equals(abVar.a) && this.b.equals(abVar.b) && this.c.equals(abVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
