package com.squareup.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface o {
    public static final o d = new o() { // from class: com.squareup.okhttp.o.1
        @Override // com.squareup.okhttp.o
        public final List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            return Arrays.asList(InetAddress.getAllByName(str));
        }
    };

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
