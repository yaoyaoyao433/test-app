package com.xiaomi.push;

import java.util.LinkedList;
/* loaded from: classes6.dex */
public final class an {
    private LinkedList<a> a = new LinkedList<>();

    /* loaded from: classes6.dex */
    public static class a {
        private static final an d = new an();
        public int a = 0;
        public String b;
        public Object c;

        a(int i, Object obj) {
            this.c = obj;
        }
    }

    public final synchronized int a() {
        return this.a.size();
    }

    public final synchronized LinkedList<a> b() {
        LinkedList<a> linkedList;
        linkedList = this.a;
        this.a = new LinkedList<>();
        return linkedList;
    }

    public final synchronized void a(Object obj) {
        this.a.add(new a(0, obj));
        if (this.a.size() > 100) {
            this.a.removeFirst();
        }
    }
}
