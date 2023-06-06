package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    final Map<com.bumptech.glide.load.c, a> a = new HashMap();
    final b b = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.bumptech.glide.load.c cVar) {
        a aVar;
        synchronized (this) {
            aVar = this.a.get(cVar);
            if (aVar != null && aVar.b > 0) {
                int i = aVar.b - 1;
                aVar.b = i;
                if (i == 0) {
                    a remove = this.a.remove(cVar);
                    if (!remove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", key: " + cVar);
                    }
                    b bVar = this.b;
                    synchronized (bVar.a) {
                        if (bVar.a.size() < 10) {
                            bVar.a.offer(remove);
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Cannot release a lock that is not held, key: ");
            sb.append(cVar);
            sb.append(", interestedThreads: ");
            sb.append(aVar == null ? 0 : aVar.b);
            throw new IllegalArgumentException(sb.toString());
        }
        aVar.a.unlock();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        final Lock a;
        int b;

        private a() {
            this.a = new ReentrantLock();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        final Queue<a> a;

        private b() {
            this.a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }
    }
}
