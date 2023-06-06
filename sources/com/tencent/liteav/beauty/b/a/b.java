package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.b.ae;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends ae {
    private int r;
    private int s;
    private int t;
    private final String x;

    public b() {
        super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.x = "BeautyBlend";
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        this.a = NativeLoad.nativeLoadGLProgram(12);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }

    @Override // com.tencent.liteav.beauty.b.ae, com.tencent.liteav.basic.opengl.j
    public boolean a() {
        super.a();
        r();
        return true;
    }

    public void a(float f) {
        TXCLog.i("BeautyBlend", "setBrightLevel " + f);
        a(this.s, f);
    }

    public void b(float f) {
        new StringBuilder("setRuddyLevel level ").append(f);
        a(this.t, f / 2.0f);
    }

    private void r() {
        this.s = GLES20.glGetUniformLocation(q(), "whiteDegree");
        this.r = GLES20.glGetUniformLocation(q(), "contrast");
        this.t = GLES20.glGetUniformLocation(q(), "ruddyDegree");
    }
}
