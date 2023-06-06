package com.squareup.okhttp.internal.http;

import com.meituan.robust.common.CommonConstant;
import com.squareup.okhttp.ab;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q {
    final com.squareup.okhttp.a a;
    final com.squareup.okhttp.internal.i b;
    private Proxy c;
    private InetSocketAddress d;
    private List<Proxy> e;
    private int f;
    private int h;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<ab> i = new ArrayList();

    public q(com.squareup.okhttp.a aVar, com.squareup.okhttp.internal.i iVar) {
        this.e = Collections.emptyList();
        this.a = aVar;
        this.b = iVar;
        com.squareup.okhttp.s sVar = aVar.a;
        Proxy proxy = aVar.h;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            this.e = new ArrayList();
            List<Proxy> select = this.a.g.select(sVar.b());
            if (select != null) {
                this.e.addAll(select);
            }
            this.e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.e.add(Proxy.NO_PROXY);
        }
        this.f = 0;
    }

    public final boolean a() {
        return d() || c() || e();
    }

    public final ab b() throws IOException {
        while (true) {
            if (!d()) {
                if (!c()) {
                    if (!e()) {
                        throw new NoSuchElementException();
                    }
                    return this.i.remove(0);
                } else if (!c()) {
                    throw new SocketException("No route to " + this.a.a() + "; exhausted proxy configurations: " + this.e);
                } else {
                    List<Proxy> list = this.e;
                    int i = this.f;
                    this.f = i + 1;
                    Proxy proxy = list.get(i);
                    a(proxy);
                    this.c = proxy;
                }
            }
            if (!d()) {
                throw new SocketException("No route to " + this.a.a() + "; exhausted inet socket addresses: " + this.g);
            }
            List<InetSocketAddress> list2 = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            this.d = list2.get(i2);
            ab abVar = new ab(this.a, this.c, this.d);
            if (!this.b.c(abVar)) {
                return abVar;
            }
            this.i.add(abVar);
        }
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private void a(Proxy proxy) throws IOException {
        String a;
        int b;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            a = this.a.a();
            b = this.a.b();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            InetAddress address2 = inetSocketAddress.getAddress();
            if (address2 == null) {
                a = inetSocketAddress.getHostName();
            } else {
                a = address2.getHostAddress();
            }
            b = inetSocketAddress.getPort();
        }
        if (b <= 0 || b > 65535) {
            throw new SocketException("No route to " + a + CommonConstant.Symbol.COLON + b + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(a, b));
        } else {
            List<InetAddress> lookup = this.a.b.lookup(a);
            int size = lookup.size();
            for (int i = 0; i < size; i++) {
                this.g.add(new InetSocketAddress(lookup.get(i), b));
            }
        }
        this.h = 0;
    }

    private boolean d() {
        return this.h < this.g.size();
    }

    private boolean e() {
        return !this.i.isEmpty();
    }
}
