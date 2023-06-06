package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.beauty.NativeLoad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends j {
    private int r;
    private int s;
    private float t;
    private String u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.r = -1;
        this.s = -1;
        this.t = 4.0f;
        this.u = "SmoothHorizontal";
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        this.a = NativeLoad.nativeLoadGLProgram(13);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        super.a();
        r();
        return true;
    }

    public void r() {
        this.r = GLES20.glGetUniformLocation(q(), "texelWidthOffset");
        this.s = GLES20.glGetUniformLocation(q(), "texelHeightOffset");
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.t = 2.0f;
            } else {
                this.t = 4.0f;
            }
        } else if (i < 540) {
            this.t = 2.0f;
        } else {
            this.t = 4.0f;
        }
        String str = this.u;
        TXCLog.i(str, "m_textureRation " + this.t);
        a(this.r, this.t / ((float) i));
        a(this.s, this.t / ((float) i2));
    }
}
