package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.login.net.taskqueue.b;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends b {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.xm.login.net.taskqueue.b
    public a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396e9f451382572f3344eb06a4c8306e", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396e9f451382572f3344eb06a4c8306e") : new e();
    }

    @Override // com.sankuai.xm.login.net.taskqueue.b
    public final void f() {
        b.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6109522357634e10ecc1026547bd67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6109522357634e10ecc1026547bd67");
            return;
        }
        LinkedList linkedList = new LinkedList();
        synchronized (this.i) {
            linkedList.addAll(this.j);
            this.j.clear();
        }
        while (true) {
            synchronized (this.i) {
                if (linkedList.isEmpty()) {
                    return;
                }
                aVar = (b.a) linkedList.poll();
            }
            if (aVar != null) {
                if (a(aVar)) {
                    b(aVar);
                } else {
                    c(aVar);
                }
            }
        }
    }

    @Override // com.sankuai.xm.login.net.taskqueue.b
    public final long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4350e510a7969fcfb75c9ab463457e", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4350e510a7969fcfb75c9ab463457e")).longValue();
        }
        Queue<b.a> a = a();
        while (!a.isEmpty()) {
            b.a poll = a.poll();
            if (poll != null) {
                if (a(poll)) {
                    b(poll);
                } else {
                    c(poll);
                    if (poll.d) {
                        a(poll.b, poll.c, poll.d, poll.e);
                    }
                }
            }
        }
        return h();
    }

    private Queue<b.a> a() {
        b.a peek;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a708338e6402e4326777a9761183cfa1", 6917529027641081856L)) {
            return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a708338e6402e4326777a9761183cfa1");
        }
        LinkedList linkedList = new LinkedList();
        long a = g.a();
        synchronized (this.i) {
            while (this.k != null && !this.k.isEmpty() && ((peek = this.k.peek()) == null || peek.a() <= a)) {
                b.a poll = this.k.poll();
                if (poll != null) {
                    linkedList.add(poll);
                }
            }
        }
        return linkedList;
    }

    private long h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4817ff2db7d12dd8107e25ce102c2d99", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4817ff2db7d12dd8107e25ce102c2d99")).longValue();
        }
        synchronized (this.i) {
            if (this.k != null && !this.k.isEmpty()) {
                long a = g.a();
                b.a peek = this.k.peek();
                if (peek == null) {
                    return 100000000999L;
                }
                long a2 = peek.a();
                return a2 > a ? a2 - a : 0L;
            }
            return 100000000999L;
        }
    }
}
