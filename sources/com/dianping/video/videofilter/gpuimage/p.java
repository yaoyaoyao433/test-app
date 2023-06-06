package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class p extends f {
    public static ChangeQuickRedirect a;
    private int b;
    private float c;

    public p() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float scale;\n\nvoid main() {\n   vec2 newTextureCoordinate = vec2((scale - 1.0) *0.3 + textureCoordinate.x / scale ,(scale - 1.0) *0.7 + textureCoordinate.y /scale);\n\n   vec4 textureColor = texture2D(inputImageTexture, newTextureCoordinate);\n\n   vec4 shiftColor1 = texture2D(inputImageTexture, newTextureCoordinate+vec2(-0.05 * (scale - 1.0), - 0.05 *(scale - 1.0)));\n\n   vec4 shiftColor2 = texture2D(inputImageTexture, newTextureCoordinate+vec2(-0.1 * (scale - 1.0), - 0.1 *(scale - 1.0)));\n\n   vec4 blend3DColor = vec4(shiftColor2.r, textureColor.g, shiftColor1.b, 1.0);\n\n   vec4 originalColor = texture2D(inputImageTexture, textureCoordinate);\n\n  gl_FragColor = mix(originalColor, blend3DColor, 0.7);\n}");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c160824e48978bb28b3c1abcef7b065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c160824e48978bb28b3c1abcef7b065");
        }
    }

    private p(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d06278b8e1d3c1270c0284bf6d28bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d06278b8e1d3c1270c0284bf6d28bb");
        } else {
            this.c = 1.0f;
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9e557a04f6c513aa29a10d434d9171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9e557a04f6c513aa29a10d434d9171");
            return;
        }
        super.a();
        this.b = GLES20.glGetUniformLocation(h(), "scale");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fbfa1be41f213b7a9bba3d9b63fb72c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fbfa1be41f213b7a9bba3d9b63fb72c");
            return;
        }
        super.c();
        a(this.c);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1873d794318f17018ba86d7587e4f26d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1873d794318f17018ba86d7587e4f26d");
            return;
        }
        this.c = f;
        a(this.b, this.c);
    }
}
