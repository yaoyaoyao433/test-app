package io.socket.client;

import io.socket.client.c;
import io.socket.emitter.a;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class b {
    private static final Logger b = Logger.getLogger(b.class.getName());
    private static final ConcurrentHashMap<String, c> c = new ConcurrentHashMap<>();
    public static int a = io.socket.parser.c.a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a extends c.C1523c {
        public boolean a;
        public boolean b = true;
    }

    private b() {
    }

    public static e a(String str, a aVar) throws URISyntaxException {
        return a(new URI(str), aVar);
    }

    private static e a(URI uri, a aVar) {
        final c cVar;
        if (aVar == null) {
            aVar = new a();
        }
        URL a2 = g.a(uri);
        try {
            URI uri2 = a2.toURI();
            String a3 = g.a(a2);
            if (aVar.a || !aVar.b || (c.containsKey(a3) && c.get(a3).e.containsKey(a2.getPath()))) {
                b.fine(String.format("ignoring socket cache for %s", uri2));
                cVar = new c(uri2, aVar);
            } else {
                if (!c.containsKey(a3)) {
                    b.fine(String.format("new io instance for %s", uri2));
                    c.putIfAbsent(a3, new c(uri2, aVar));
                }
                cVar = c.get(a3);
            }
            String query = a2.getQuery();
            if (query != null && (aVar.m == null || aVar.m.isEmpty())) {
                aVar.m = query;
            }
            String path = a2.getPath();
            e eVar = cVar.e.get(path);
            if (eVar == null) {
                final e eVar2 = new e(cVar, path, aVar);
                e putIfAbsent = cVar.e.putIfAbsent(path, eVar2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                eVar2.a("connecting", new a.InterfaceC1525a() { // from class: io.socket.client.c.11
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        cVar.q.add(eVar2);
                    }
                });
                eVar2.a("connect", new a.InterfaceC1525a() { // from class: io.socket.client.c.12
                    @Override // io.socket.emitter.a.InterfaceC1525a
                    public final void a(Object... objArr) {
                        eVar2.b = cVar.d.b;
                    }
                });
                return eVar2;
            }
            return eVar;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
