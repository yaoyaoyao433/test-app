package com.tencent.liteav.basic.a;

import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private final LinkedList<Runnable> a = new LinkedList<>();

    public void a(Runnable runnable) {
        synchronized (this.a) {
            this.a.add(runnable);
        }
    }

    public void a() {
        LinkedList linkedList;
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new LinkedList(this.a);
                this.a.clear();
            }
        }
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }
}
