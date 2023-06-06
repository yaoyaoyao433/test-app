package com.squareup.okhttp.internal;

import com.squareup.okhttp.l;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public boolean a;
    public boolean b;
    private final List<l> c;
    private int d = 0;

    public a(List<l> list) {
        this.c = list;
    }

    public final l a(SSLSocket sSLSocket) throws IOException {
        l lVar;
        int i = this.d;
        int size = this.c.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.c.get(i);
            if (lVar.a(sSLSocket)) {
                this.d = i + 1;
                break;
            }
            i++;
        }
        if (lVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.b + ", modes=" + this.c + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.a = b(sSLSocket);
        d.b.a(lVar, sSLSocket, this.b);
        return lVar;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.d; i < this.c.size(); i++) {
            if (this.c.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
