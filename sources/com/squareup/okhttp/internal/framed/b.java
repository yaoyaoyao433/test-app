package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b extends Closeable {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, int i2, List<f> list) throws IOException;

        void a(int i, long j);

        void a(int i, com.squareup.okhttp.internal.framed.a aVar);

        void a(int i, com.squareup.okhttp.internal.framed.a aVar, okio.f fVar);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, okio.e eVar, int i2) throws IOException;

        void a(boolean z, n nVar);

        void a(boolean z, boolean z2, int i, int i2, List<f> list, g gVar);
    }

    void a() throws IOException;

    boolean a(a aVar) throws IOException;
}
