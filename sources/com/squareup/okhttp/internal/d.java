package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.http.s;
import com.squareup.okhttp.k;
import com.squareup.okhttp.l;
import com.squareup.okhttp.r;
import com.squareup.okhttp.v;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d {
    public static final Logger a = Logger.getLogger(v.class.getName());
    public static d b;

    public abstract e a(v vVar);

    public abstract i a(k kVar);

    public abstract com.squareup.okhttp.internal.io.b a(k kVar, com.squareup.okhttp.a aVar, s sVar);

    public abstract void a(l lVar, SSLSocket sSLSocket, boolean z);

    public abstract void a(r.a aVar, String str);

    public abstract boolean a(k kVar, com.squareup.okhttp.internal.io.b bVar);

    public abstract void b(k kVar, com.squareup.okhttp.internal.io.b bVar);
}
