package com.tencent.mapsdk.internal;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jt<Key, Value> {
    private int a;
    private jt<Key, Value>.a b;
    private jt<Key, Value>.a c;
    private HashMap<Key, jt<Key, Value>.a> d = new HashMap<>();

    private jt(int i) {
        this.a = i;
    }

    private void a(Key key, Value value) {
        if (!this.d.containsKey(key)) {
            if (this.d.size() >= this.a) {
                a();
            }
            jt<Key, Value>.a aVar = new a(this, key, value, (byte) 0);
            if (this.c == null) {
                this.c = aVar;
                this.b = aVar;
            } else {
                this.c.d = aVar;
                aVar.c = this.c;
                this.c = aVar;
            }
            this.d.put(key, aVar);
            return;
        }
        jt<Key, Value>.a aVar2 = this.b;
        while (true) {
            if (aVar2 == null) {
                aVar2 = null;
                break;
            } else if (aVar2.a.equals(key)) {
                break;
            } else {
                aVar2 = aVar2.d;
            }
        }
        if (aVar2 != null) {
            a((a) aVar2);
        }
    }

    private boolean a() {
        jt<Key, Value>.a aVar = this.b;
        this.b = this.b.d;
        this.b.c = null;
        Key key = aVar.a;
        return (key == null || this.d.remove(key) == null) ? false : true;
    }

    private Value a(Key key) {
        jt<Key, Value>.a aVar = this.d.get(key);
        if (aVar == null) {
            return null;
        }
        a((a) aVar);
        return aVar.b;
    }

    private boolean b(Key key) {
        return this.d.remove(key) != null;
    }

    private boolean b() {
        return a();
    }

    private boolean c() {
        return this.d.isEmpty();
    }

    private int d() {
        return this.d.size();
    }

    private void e() {
        this.d.clear();
        this.c = null;
        this.b = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b.c != null) {
            System.out.println("header的pre不为NULL!");
        }
        sb.append("header: \n");
        for (jt<Key, Value>.a aVar = this.b; aVar != null; aVar = aVar.d) {
            sb.append(aVar.a + "->");
        }
        sb.append("\ntail: \n");
        if (this.c.d != null) {
            System.out.println("tail的next不为NULL!");
        }
        for (jt<Key, Value>.a aVar2 = this.c; aVar2 != null; aVar2 = aVar2.c) {
            sb.append(aVar2.a + "<-");
        }
        sb.append("\n");
        return sb.toString();
    }

    private jt<Key, Value>.a c(Key key) {
        for (jt<Key, Value>.a aVar = this.b; aVar != null; aVar = aVar.d) {
            if (aVar.a.equals(key)) {
                return aVar;
            }
        }
        return null;
    }

    private void a(jt<Key, Value>.a aVar) {
        if (aVar == null || this.c == aVar) {
            return;
        }
        if (this.b == aVar) {
            this.b = this.b.d;
            this.b.c = null;
        } else {
            aVar.c.d = aVar.d;
            aVar.d.c = aVar.c;
        }
        this.c.d = aVar;
        aVar.c = this.c;
        this.c = aVar;
        this.c.d = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a {
        Key a;
        Value b;
        jt<Key, Value>.a c;
        jt<Key, Value>.a d;

        /* synthetic */ a(jt jtVar, Object obj, Object obj2, byte b) {
            this(obj, obj2);
        }

        private a(Key key, Value value) {
            this.a = key;
            this.b = value;
        }
    }
}
