package com.tencent.mapsdk.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Hashtable;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ly {
    public static final int a = 0;
    private int b = 100;
    private a<String> c = new a<>();
    private Hashtable<String, Integer> d = new Hashtable<>();
    private IntBuffer e;

    public ly() {
        b();
    }

    private synchronized void b() {
        if (this.e == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.b * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.e = allocateDirect.asIntBuffer();
        }
    }

    private synchronized void a(String str, int i) {
        Object obj;
        if (this.d.size() == this.b) {
            b();
            if (this.e == null) {
                return;
            }
            a<String> aVar = this.c;
            if (aVar.d == aVar.c) {
                obj = null;
            } else {
                aVar.c %= aVar.a;
                obj = aVar.b[aVar.c];
                aVar.b[aVar.c] = null;
                aVar.c++;
            }
            Integer remove = this.d.remove((String) obj);
            if (this.e.position() < this.b) {
                this.e.put(remove.intValue());
            }
        }
        a<String> aVar2 = this.c;
        if (!((aVar2.d + 1) % aVar2.a == aVar2.c)) {
            aVar2.d %= aVar2.a;
            Object[] objArr = aVar2.b;
            int i2 = aVar2.d;
            aVar2.d = i2 + 1;
            objArr[i2] = str;
        }
        this.d.put(str, Integer.valueOf(i));
    }

    private synchronized int a(String str) {
        Integer num = this.d.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private synchronized void b(GL10 gl10) {
        if (this.e == null) {
            return;
        }
        int position = this.e.position();
        if (position > 0) {
            this.e.rewind();
            gl10.glDeleteTextures(position, this.e);
            this.e.clear();
        }
    }

    public final synchronized void a() {
        this.d.clear();
        this.c.a();
        if (this.e != null) {
            this.e.clear();
        }
    }

    public final synchronized void a(GL10 gl10) {
        if (this.e != null) {
            for (String str : this.d.keySet()) {
                this.e.put(this.d.get(str).intValue());
            }
            b(gl10);
        }
        this.d.clear();
        this.c.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<E> {
        int a = 100;
        Object[] b = new Object[100];
        int d = 0;
        int c = 0;

        private void b() {
            this.d = 0;
            this.c = 0;
        }

        public final void a() {
            b();
            for (int i = 0; i < this.b.length; i++) {
                this.b[i] = null;
            }
        }

        private boolean d() {
            return (this.d + 1) % this.a == this.c;
        }

        private boolean e() {
            return this.d == this.c;
        }

        private boolean a(E e) {
            if ((this.d + 1) % this.a == this.c) {
                return false;
            }
            this.d %= this.a;
            Object[] objArr = this.b;
            int i = this.d;
            this.d = i + 1;
            objArr[i] = e;
            return true;
        }

        private E c() {
            if (this.d == this.c) {
                return null;
            }
            this.c %= this.a;
            E e = (E) this.b[this.c];
            this.b[this.c] = null;
            this.c++;
            return e;
        }
    }
}
