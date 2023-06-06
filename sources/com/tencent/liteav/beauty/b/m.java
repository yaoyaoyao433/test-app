package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m {
    private static String j = "GPUGreenScreen";
    private int a;
    private int b;
    private boolean c;
    private ah d;
    private boolean e;
    private com.tencent.liteav.basic.opengl.k f;
    private g g;
    private x h;
    private boolean i;
    private com.tencent.liteav.basic.c.b k;

    public int a(int i) {
        return i;
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        TXCLog.i(j, "set notify");
        this.k = bVar;
    }

    private void b() {
        TXCLog.i(j, "come into destroyPlayer");
        if (this.d != null) {
            this.d.a();
        }
        this.d = null;
        this.e = false;
        this.i = false;
        TXCLog.i(j, "come out destroyPlayer");
    }

    public void a() {
        TXCLog.i(j, "come into GreenScreen destroy");
        b();
        c();
        if (this.f != null) {
            this.f.e();
            this.f = null;
        }
        if (this.g != null) {
            this.g.e();
            this.g = null;
        }
        if (this.h != null) {
            this.h.e();
            this.h = null;
        }
        this.c = false;
        TXCLog.i(j, "come out GreenScreen destroy");
    }

    private void c() {
        if (this.b != -1 && this.b != this.a) {
            GLES20.glDeleteTextures(1, new int[]{this.b}, 0);
            this.b = -1;
        }
        if (this.a != -1) {
            GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
            this.a = -1;
        }
    }
}
