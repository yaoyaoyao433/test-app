package com.dianping.imagemanager.image.cache.disklrucache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final Map<String, C0078a> b;
    private final b c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca30688a3aef5dd631d0b3a51ff03873", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca30688a3aef5dd631d0b3a51ff03873");
            return;
        }
        this.b = new HashMap();
        this.c = new b();
    }

    public final void a(String str) {
        C0078a c0078a;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3832d80ff048b74d6f12949f95335ced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3832d80ff048b74d6f12949f95335ced");
            return;
        }
        synchronized (this) {
            c0078a = this.b.get(str);
            if (c0078a == null) {
                c0078a = this.c.a();
                this.b.put(str, c0078a);
            }
            c0078a.b++;
        }
        c0078a.a.lock();
    }

    public final void b(String str) {
        C0078a c0078a;
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad5d875a6bd9594b792763ae0a648a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad5d875a6bd9594b792763ae0a648a8");
            return;
        }
        synchronized (this) {
            c0078a = this.b.get(str);
            if (c0078a != null && c0078a.b > 0) {
                int i2 = c0078a.b - 1;
                c0078a.b = i2;
                if (i2 == 0) {
                    C0078a remove = this.b.remove(str);
                    if (!remove.equals(c0078a)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0078a + ", but actually removed: " + remove + ", key: " + str);
                    }
                    b bVar = this.c;
                    Object[] objArr2 = {remove};
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "741691ab444eb037e2d5c042e8e65add", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "741691ab444eb037e2d5c042e8e65add");
                    } else {
                        synchronized (bVar.b) {
                            if (bVar.b.size() < 10) {
                                bVar.b.offer(remove);
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Cannot release a lock that is not held, key: ");
            sb.append(str);
            sb.append(", interestedThreads: ");
            if (c0078a != null) {
                i = c0078a.b;
            }
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        c0078a.a.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.image.cache.disklrucache.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078a {
        public final Lock a;
        public int b;

        public C0078a() {
            this.a = new ReentrantLock();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        final Queue<C0078a> b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c5b18ad7f32500ce541f7fc148bc25", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c5b18ad7f32500ce541f7fc148bc25");
            } else {
                this.b = new ArrayDeque();
            }
        }

        public final C0078a a() {
            C0078a poll;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e9a8a91e33d545a9e8b72e9a6f67d9", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0078a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e9a8a91e33d545a9e8b72e9a6f67d9");
            }
            synchronized (this.b) {
                poll = this.b.poll();
            }
            return poll == null ? new C0078a() : poll;
        }
    }
}
