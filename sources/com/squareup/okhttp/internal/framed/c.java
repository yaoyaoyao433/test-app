package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface c extends Closeable {
    void a() throws IOException;

    void a(int i, long j) throws IOException;

    void a(int i, a aVar) throws IOException;

    void a(int i, a aVar, byte[] bArr) throws IOException;

    void a(n nVar) throws IOException;

    void a(boolean z, int i, int i2) throws IOException;

    void a(boolean z, int i, okio.c cVar, int i2) throws IOException;

    void a(boolean z, boolean z2, int i, int i2, List<f> list) throws IOException;

    void b() throws IOException;

    void b(n nVar) throws IOException;

    int c();
}
