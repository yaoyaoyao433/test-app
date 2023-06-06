package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements com.squareup.okhttp.b {
    public static final com.squareup.okhttp.b a = new a();

    @Override // com.squareup.okhttp.b
    public final x a(Proxy proxy, z zVar) throws IOException {
        PasswordAuthentication requestPasswordAuthentication;
        List<com.squareup.okhttp.h> h = zVar.h();
        x xVar = zVar.a;
        com.squareup.okhttp.s sVar = xVar.a;
        int size = h.size();
        for (int i = 0; i < size; i++) {
            com.squareup.okhttp.h hVar = h.get(i);
            if ("Basic".equalsIgnoreCase(hVar.a) && (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(sVar.b, a(proxy, sVar), sVar.c, sVar.a, hVar.b, hVar.a, sVar.a(), Authenticator.RequestorType.SERVER)) != null) {
                return xVar.f().a("Authorization", com.squareup.okhttp.m.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
            }
        }
        return null;
    }

    @Override // com.squareup.okhttp.b
    public final x b(Proxy proxy, z zVar) throws IOException {
        List<com.squareup.okhttp.h> h = zVar.h();
        x xVar = zVar.a;
        com.squareup.okhttp.s sVar = xVar.a;
        int size = h.size();
        for (int i = 0; i < size; i++) {
            com.squareup.okhttp.h hVar = h.get(i);
            if ("Basic".equalsIgnoreCase(hVar.a)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), a(proxy, sVar), inetSocketAddress.getPort(), sVar.a, hVar.b, hVar.a, sVar.a(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return xVar.f().a("Proxy-Authorization", com.squareup.okhttp.m.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
                }
            }
        }
        return null;
    }

    private static InetAddress a(Proxy proxy, com.squareup.okhttp.s sVar) throws IOException {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(sVar.b) : ((InetSocketAddress) proxy.address()).getAddress();
    }
}
