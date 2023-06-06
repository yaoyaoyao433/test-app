package com.meituan.android.pike.taskqueue;

import com.meituan.android.pike.taskqueue.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends b {
    public static ChangeQuickRedirect i;

    @Override // com.meituan.android.pike.taskqueue.b
    public final a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6236602aa96c9b5d02dab6f4eab261", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6236602aa96c9b5d02dab6f4eab261") : new d();
    }

    @Override // com.meituan.android.pike.taskqueue.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601487eeda925155a27129667c220344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601487eeda925155a27129667c220344");
            return;
        }
        LinkedList linkedList = new LinkedList();
        synchronized (this.f) {
            linkedList.addAll(this.g);
            this.g.clear();
        }
        while (!linkedList.isEmpty()) {
            b.a aVar = (b.a) linkedList.poll();
            if (a(aVar)) {
                b(aVar);
            } else {
                c(aVar);
            }
        }
    }

    @Override // com.meituan.android.pike.taskqueue.b
    public final long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f6dbc5a164af691cb072bd26df5d50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f6dbc5a164af691cb072bd26df5d50")).longValue();
        }
        Queue<b.a> f = f();
        while (!f.isEmpty()) {
            b.a poll = f.poll();
            if (a(poll)) {
                b(poll);
            } else {
                c(poll);
                if (poll.d) {
                    a(poll.b, poll.c, poll.d, poll.e);
                }
            }
        }
        return g();
    }

    private Queue<b.a> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351420a7eaca86d38566dc39d7d19950", RobustBitConfig.DEFAULT_VALUE)) {
            return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351420a7eaca86d38566dc39d7d19950");
        }
        LinkedList linkedList = new LinkedList();
        long a = f.a();
        synchronized (this.f) {
            while (!this.h.isEmpty() && this.h.peek().a() <= a) {
                linkedList.add(this.h.poll());
            }
        }
        return linkedList;
    }

    private long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3507396103547c78d5076fc2a6182394", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3507396103547c78d5076fc2a6182394")).longValue();
        }
        synchronized (this.f) {
            if (this.h.isEmpty()) {
                return Long.MAX_VALUE;
            }
            long a = f.a();
            long a2 = this.h.peek().a();
            return a2 > a ? a2 - a : 0L;
        }
    }
}
