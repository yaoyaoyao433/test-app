package io.socket.client;

import io.socket.emitter.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    public static a a(final io.socket.emitter.a aVar, final String str, final a.InterfaceC1525a interfaceC1525a) {
        aVar.a(str, interfaceC1525a);
        return new a() { // from class: io.socket.client.d.1
            @Override // io.socket.client.d.a
            public final void a() {
                io.socket.emitter.a.this.c(str, interfaceC1525a);
            }
        };
    }
}
