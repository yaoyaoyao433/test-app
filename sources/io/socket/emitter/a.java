package io.socket.emitter;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a {
    private ConcurrentMap<String, ConcurrentLinkedQueue<InterfaceC1525a>> a = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* renamed from: io.socket.emitter.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC1525a {
        void a(Object... objArr);
    }

    public final a a(String str, InterfaceC1525a interfaceC1525a) {
        ConcurrentLinkedQueue<InterfaceC1525a> putIfAbsent;
        ConcurrentLinkedQueue<InterfaceC1525a> concurrentLinkedQueue = this.a.get(str);
        if (concurrentLinkedQueue == null && (putIfAbsent = this.a.putIfAbsent(str, (concurrentLinkedQueue = new ConcurrentLinkedQueue<>()))) != null) {
            concurrentLinkedQueue = putIfAbsent;
        }
        concurrentLinkedQueue.add(interfaceC1525a);
        return this;
    }

    public final a b(String str, InterfaceC1525a interfaceC1525a) {
        a(str, new b(str, interfaceC1525a));
        return this;
    }

    public final a c() {
        this.a.clear();
        return this;
    }

    public final a a(String str) {
        this.a.remove(str);
        return this;
    }

    public final a c(String str, InterfaceC1525a interfaceC1525a) {
        ConcurrentLinkedQueue<InterfaceC1525a> concurrentLinkedQueue = this.a.get(str);
        if (concurrentLinkedQueue != null) {
            Iterator<InterfaceC1525a> it = concurrentLinkedQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (a(interfaceC1525a, it.next())) {
                    it.remove();
                    break;
                }
            }
        }
        return this;
    }

    private static boolean a(InterfaceC1525a interfaceC1525a, InterfaceC1525a interfaceC1525a2) {
        if (interfaceC1525a.equals(interfaceC1525a2)) {
            return true;
        }
        if (interfaceC1525a2 instanceof b) {
            return interfaceC1525a.equals(((b) interfaceC1525a2).b);
        }
        return false;
    }

    public a a(String str, Object... objArr) {
        ConcurrentLinkedQueue<InterfaceC1525a> concurrentLinkedQueue = this.a.get(str);
        if (concurrentLinkedQueue != null) {
            Iterator<InterfaceC1525a> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                it.next().a(objArr);
            }
        }
        return this;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class b implements InterfaceC1525a {
        public final String a;
        public final InterfaceC1525a b;

        public b(String str, InterfaceC1525a interfaceC1525a) {
            this.a = str;
            this.b = interfaceC1525a;
        }

        @Override // io.socket.emitter.a.InterfaceC1525a
        public final void a(Object... objArr) {
            a.this.c(this.a, this);
            this.b.a(objArr);
        }
    }
}
