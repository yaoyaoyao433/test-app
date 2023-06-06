package com.tencent.liteav.k;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m extends com.tencent.liteav.basic.opengl.j {
    private static String r = " precision mediump float;\n varying mediump vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform float scale;\n \n void main(void) {\n       float x = 0.5 + (textureCoordinate.x - 0.5) / scale; \n       float y = 0.5 + (textureCoordinate.y - 0.5) / scale; \n       if (x < 0.0 || x > 1.0 || y < 0.0 || y > 1.0) { \n           gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0); \n       } else { \n           gl_FragColor = texture2D(inputImageTexture, vec2(x, y)); \n       } \n }\n";
    private static String s = "GuidRefilne";
    private int t;

    public m() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", r);
        this.t = -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (!super.a()) {
            TXCLog.e(s, "onInit failed");
            return false;
        }
        this.t = GLES20.glGetUniformLocation(this.a, "scale");
        a(1.0f);
        return true;
    }

    public void a(float f) {
        a(this.t, f);
    }
}
