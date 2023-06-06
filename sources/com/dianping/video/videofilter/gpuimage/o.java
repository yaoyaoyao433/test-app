package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o extends f {
    public static ChangeQuickRedirect a;
    private int b;
    private float c;
    private int q;
    private float r;

    public o() {
        this("attribute vec4 position;\n   attribute vec4 inputTextureCoordinate;\n   attribute vec4 inputTextureCoordinate2;\n   varying vec2 textureCoordinate;\n   varying vec2 textureCoordinate2;\n   void main()\n{\n   gl_Position = position;\n   textureCoordinate = inputTextureCoordinate.xy;\n   textureCoordinate2 = inputTextureCoordinate2.xy;\n}", "varying highp vec2 textureCoordinate;\nvarying highp vec2 textureCoordinate2;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform lowp float mixturePercent;\nuniform highp float scale;\nvoid main()\n{\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   highp vec2 textureCoordinateToUse = textureCoordinate;\n   highp vec2 center = vec2(0.5, 0.5);\n   textureCoordinateToUse -= center;\n   textureCoordinateToUse = textureCoordinateToUse / scale;\n   textureCoordinateToUse += center;\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinateToUse );\n   gl_FragColor = mix(textureColor, textureColor2, mixturePercent);\n}");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a279a01e56e14b0cf64df54edd8942", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a279a01e56e14b0cf64df54edd8942");
        }
    }

    private o(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7c44213a873e1faca35b5755a3f291", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7c44213a873e1faca35b5755a3f291");
            return;
        }
        this.c = 1.0f;
        this.r = 0.5f;
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38339dd15d8689c4e5ac607f408da96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38339dd15d8689c4e5ac607f408da96");
            return;
        }
        super.a();
        this.b = GLES20.glGetUniformLocation(h(), "scale");
        this.q = GLES20.glGetUniformLocation(h(), "mixturePercent");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6635aaa55e5f124c722baadf2ebdf43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6635aaa55e5f124c722baadf2ebdf43");
            return;
        }
        super.c();
        a(this.c);
        b(this.r);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4010575496d888742286615f1b37e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4010575496d888742286615f1b37e2");
            return;
        }
        this.c = f;
        a(this.b, this.c);
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5d0f146941174bde9f018a5fb51d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5d0f146941174bde9f018a5fb51d80");
            return;
        }
        this.r = f;
        a(this.q, this.r);
    }
}
