package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import android.os.Build;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.b.ae;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends ae {
    private String A;
    private int r;
    private int s;
    private int t;
    private int x;
    private float y;
    private float z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.x = -1;
        this.y = 2.0f;
        this.z = 0.5f;
        this.A = "SmoothVertical";
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        if (Build.BRAND.equals("samsung") && Build.MODEL.equals("GT-I9500") && Build.VERSION.RELEASE.equals("4.3")) {
            this.a = NativeLoad.nativeLoadGLProgram(15);
        } else {
            this.a = NativeLoad.nativeLoadGLProgram(5);
        }
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
        this.z = f;
        String str = this.A;
        TXCLog.i(str, "setBeautyLevel " + f);
        a(this.t, f);
    }

    public void r() {
        this.r = GLES20.glGetUniformLocation(q(), "texelWidthOffset");
        this.s = GLES20.glGetUniformLocation(q(), "texelHeightOffset");
        this.t = GLES20.glGetUniformLocation(q(), "smoothDegree");
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.y = 2.0f;
            } else {
                this.y = 4.0f;
            }
        } else if (i < 540) {
            this.y = 2.0f;
        } else {
            this.y = 4.0f;
        }
        String str = this.A;
        TXCLog.i(str, "m_textureRation " + this.y);
        a(this.r, this.y / ((float) i));
        a(this.s, this.y / ((float) i2));
    }
}
