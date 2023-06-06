package com.tencent.liteav.basic.opengl;

import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    private final int a;
    private final int b;
    private int c = -1;
    private int d = -1;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a() {
        this.c = TXCOpenGlUtils.a((ByteBuffer) null, this.a, this.b, -1);
        this.d = TXCOpenGlUtils.d();
        TXCOpenGlUtils.a(this.c, this.d);
        TXCLog.i("GLFrameBuffer", "create frameBufferId: %d, textureId: %d", Integer.valueOf(this.d), Integer.valueOf(this.c));
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e() {
        TXCLog.i("GLFrameBuffer", "destroy frameBufferId: %d, textureId: %d", Integer.valueOf(this.d), Integer.valueOf(this.c));
        TXCOpenGlUtils.c(this.c);
        this.c = -1;
        TXCOpenGlUtils.b(this.d);
        this.d = -1;
    }
}
