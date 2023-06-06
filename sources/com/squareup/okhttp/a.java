package com.squareup.okhttp;

import com.squareup.okhttp.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public final s a;
    public final o b;
    public final SocketFactory c;
    public final b d;
    public final List<w> e;
    public final List<l> f;
    public final ProxySelector g;
    public final Proxy h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final g k;

    public a(String str, int i, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<w> list, List<l> list2, ProxySelector proxySelector) {
        this.a = new s.a().a(sSLSocketFactory != null ? "https" : "http").b(str).a(i).b();
        if (oVar == null) {
            throw new IllegalArgumentException("dns == null");
        }
        this.b = oVar;
        if (socketFactory == null) {
            throw new IllegalArgumentException("socketFactory == null");
        }
        this.c = socketFactory;
        if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        this.d = bVar;
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.e = com.squareup.okhttp.internal.j.a(list);
        if (list2 == null) {
            throw new IllegalArgumentException("connectionSpecs == null");
        }
        this.f = com.squareup.okhttp.internal.j.a(list2);
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = gVar;
    }

    @Deprecated
    public final String a() {
        return this.a.b;
    }

    @Deprecated
    public final int b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && com.squareup.okhttp.internal.j.a(this.h, aVar.h) && com.squareup.okhttp.internal.j.a(this.i, aVar.i) && com.squareup.okhttp.internal.j.a(this.j, aVar.j) && com.squareup.okhttp.internal.j.a(this.k, aVar.k);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + (this.h != null ? this.h.hashCode() : 0)) * 31) + (this.i != null ? this.i.hashCode() : 0)) * 31) + (this.j != null ? this.j.hashCode() : 0)) * 31) + (this.k != null ? this.k.hashCode() : 0);
    }
}
