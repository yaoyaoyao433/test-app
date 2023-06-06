package com.tencent.liteav;

import android.opengl.GLES20;
import com.dianping.titans.js.JsBridgeResult;
import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends com.tencent.liteav.basic.opengl.j {
    private int r;

    public g() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform lowp float mode; \n \nvoid main() \n{ \n    highp vec2 position = textureCoordinate; \n     \n    if (mode <= 0.5) \n    { \n        if (position.x > 0.5) \n        { \n            position.x = 1.0 - position.x; \n        } \n    } \n    else \n    { \n        if (position.x > 0.5) \n        { \n            position.x = position.x - 0.5; \n        } \n        else \n        { \n            position.x = 0.5 - position.x; \n        } \n    } \n     \n    gl_FragColor = texture2D(inputImageTexture, position); \n} \n");
        this.r = -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.r = GLES20.glGetUniformLocation(this.a, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        return a;
    }

    public void a(n.j jVar) {
        a(this.r, jVar.a);
    }
}
