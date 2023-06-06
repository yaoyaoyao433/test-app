package com.tencent.liteav.l;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.beauty.b.z;
import com.tencent.liteav.beauty.f;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private Context h;
    private z[] a = null;
    private j[] b = null;
    private b c = null;
    private com.tencent.liteav.basic.e.a[] d = null;
    private float[] e = null;
    private int f = 0;
    private int g = 0;
    private final Queue<Runnable> i = new LinkedList();
    private String j = "CombineProcessor";
    private f k = new f() { // from class: com.tencent.liteav.l.a.4
        @Override // com.tencent.liteav.beauty.f
        public void didProcessFrame(byte[] bArr, int i, int i2, int i3, long j) {
        }

        @Override // com.tencent.liteav.beauty.f
        public int willAddWatermark(int i, int i2, int i3) {
            return 0;
        }

        @Override // com.tencent.liteav.beauty.f
        public void didProcessFrame(int i, int i2, int i3, long j) {
            a.this.d[a.this.g].b = 0;
            a.this.d[a.this.g].a = i;
            a.this.d[a.this.g].c = i2;
            a.this.d[a.this.g].d = i3;
        }
    };

    public a(Context context) {
        this.h = null;
        this.h = context.getApplicationContext();
    }

    public void a(final int i, final int i2) {
        a(new Runnable() { // from class: com.tencent.liteav.l.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null) {
                    a.this.c.a(i, i2);
                }
            }
        });
    }

    public void b(final int i, final int i2) {
        a(new Runnable() { // from class: com.tencent.liteav.l.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null) {
                    a.this.c.b(i, i2);
                }
            }
        });
    }

    public void a(final com.tencent.liteav.basic.opengl.a aVar) {
        a(new Runnable() { // from class: com.tencent.liteav.l.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c != null) {
                    a.this.c.a(aVar);
                }
            }
        });
    }

    public int a(com.tencent.liteav.basic.e.a[] aVarArr, int i) {
        if (aVarArr == null || aVarArr.length <= 0) {
            Log.e(this.j, "frames is null or no frames!");
            return -1;
        }
        if (this.f < aVarArr.length) {
            this.f = aVarArr.length;
            b();
        }
        a(aVarArr);
        a(this.i);
        this.d = (com.tencent.liteav.basic.e.a[]) aVarArr.clone();
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            if (this.a[i2] != null && aVarArr[i2].e != null) {
                this.a[i2].a(aVarArr[i2].e.b, aVarArr[i2].e.a);
                this.a[i2].b(aVarArr[i2].e.c);
                GLES20.glViewport(0, 0, aVarArr[i2].g.c, aVarArr[i2].g.d);
                this.d[i2].a = this.a[i2].a(this.d[i2].a);
            }
            if (this.b[i2] != null && aVarArr[i2].f != null) {
                this.b[i2].a(m.e, this.b[i2].a(aVarArr[i2].c, aVarArr[i2].d, null, aVarArr[i2].f, 0));
                GLES20.glViewport(0, 0, aVarArr[i2].g.c, aVarArr[i2].g.d);
                this.d[i2].a = this.b[i2].a(this.d[i2].a);
            }
        }
        return this.c.a(this.d, i);
    }

    private void a(Runnable runnable) {
        synchronized (this.i) {
            this.i.add(runnable);
        }
    }

    private void a(Queue<Runnable> queue) {
        Runnable poll;
        while (true) {
            synchronized (queue) {
                poll = queue.isEmpty() ? null : queue.poll();
            }
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    private void a(com.tencent.liteav.basic.e.a[] aVarArr) {
        if (this.a == null) {
            this.a = new z[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                this.a[i] = new z();
                this.a[i].a(true);
                if (!this.a[i].c()) {
                    TXCLog.e(this.j, "mRotateScaleFilter[i] failed!");
                    return;
                }
            }
        }
        if (this.a != null) {
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                if (this.a[i2] != null) {
                    this.a[i2].a(aVarArr[i2].g.c, aVarArr[i2].g.d);
                }
            }
        }
        if (this.b == null) {
            this.b = new j[aVarArr.length];
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                this.b[i3] = new j();
                this.b[i3].a(true);
                if (!this.b[i3].c()) {
                    TXCLog.e(this.j, "mCropFilter.init failed!");
                    return;
                }
                if (this.b[i3] != null) {
                    this.b[i3].a(aVarArr[i3].g.c, aVarArr[i3].g.d);
                }
            }
        }
        if (this.c == null) {
            this.c = new b();
        }
    }

    private void b() {
        if (this.a != null) {
            for (int i = 0; i < this.a.length; i++) {
                if (this.a[i] != null) {
                    this.a[i].e();
                    this.a[i] = null;
                }
            }
            this.a = null;
        }
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                if (this.b[i2] != null) {
                    this.b[i2].e();
                    this.b[i2] = null;
                }
            }
            this.b = null;
        }
        if (this.c != null) {
            this.c.a();
            this.c = null;
        }
    }

    public void a() {
        b();
    }
}
