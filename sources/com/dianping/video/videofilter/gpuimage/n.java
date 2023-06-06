package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class n extends f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int q;
    private int r;
    private int s;

    public n() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform highp vec2 scanLineJitter;\nuniform highp vec2 verticalJump;\nuniform highp float horizontalShake;\nuniform highp vec2 colorDrift;\n\n\nprecision highp float;\n\nfloat nrand(float x, float y)\n{\n    return fract(sin(dot(vec2(x, y), vec2(12.9898, 78.233))) * 43758.5453);\n}\n\nvoid main(){\n    float u = textureCoordinate.x;\n    float v = textureCoordinate.y;\n    float time = scanLineJitter.y;\n    //scan line jitter\n    float jitter = nrand(v,time) * 2.0 - 1.0;\n    jitter *= step(scanLineJitter.y,abs(jitter)) * scanLineJitter.x;\n\n    //vertical\n    float jump = mix(v,fract(v + verticalJump.y),verticalJump.x);\n\n    //shake\n    float shake = (nrand(time,2.0) - 0.5 ) * horizontalShake;\n\n    //color\n    float drift = sin(jump + colorDrift.y) * colorDrift.x;\n\n\n    vec2 cord1 = vec2(u + jitter + shake, jump);\n    vec2 cord2 = vec2(u + jitter + shake + drift, jump);\n\n    vec4 scr1 = texture2D(inputImageTexture, fract(cord1));\n    vec4 scr2 = texture2D(inputImageTexture, fract(cord2));\n\n    vec4 finalShakeColor = vec4(scr1.r,scr2.g,scr1.b,1.0);\n    \n    vec2 nv =  0.5 + (textureCoordinate - 0.5)*(0.98 + 0.001*sin(0.95*time));\n    //偏移\n    vec3 col;\n    col.r = texture2D(inputImageTexture,vec2( nv.x + 0.008, nv.y)).x;\n    col.g = texture2D(inputImageTexture,vec2( nv.x + 0.000, nv.y)).y;\n    col.b = texture2D(inputImageTexture,vec2( nv.x - 0.008, nv.y)).z;\n\n    //限制到 0-1\n    col = clamp(col * 0.5 + 0.5 * col * col * 1.2, 0.0, 1.0);\n    col *= 0.6 + 0.4*16.0*nv.x*nv.y*(1.0-nv.x)*(1.0-nv.y);\n\n    //颜色变暗 和闪烁\n    col *= vec3(0.9,1.0,0.7);\n    col *= 0.8 + 0.2 * sin(10.0 * time + nv.y * 900.0);\n    col *= 1.0 - 0.07 * nrand(time,tan(time));\n\n    vec4 finalColor = vec4(col.xyz,1.0);\n    gl_FragColor = mix(finalShakeColor, finalColor, 0.4);\n\n}\n");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b52376e8f3a8067585f27e481645a838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b52376e8f3a8067585f27e481645a838");
        }
    }

    private n(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ff16d4d78aaf0eaf2cfc8b3d3d15b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ff16d4d78aaf0eaf2cfc8b3d3d15b5");
        } else {
            this.s = 0;
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19327ed3a6ba81b9c7e55bd0d7d268bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19327ed3a6ba81b9c7e55bd0d7d268bc");
            return;
        }
        super.a();
        this.b = GLES20.glGetUniformLocation(h(), "scanLineJitter");
        this.c = GLES20.glGetUniformLocation(h(), "verticalJump");
        this.q = GLES20.glGetUniformLocation(h(), "colorDrift");
        this.r = GLES20.glGetUniformLocation(h(), "horizontalShake");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4170bdbb1350f43300e6b75a147362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4170bdbb1350f43300e6b75a147362");
            return;
        }
        super.c();
        a(0.0f, 0.0f);
        Object[] objArr2 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37315443815facf0edb556ed513db097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37315443815facf0edb556ed513db097");
        } else {
            a(this.c, new float[]{0.0f, 0.0f});
        }
        Object[] objArr3 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40e2aa4152ed39d8af1f334f71147b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40e2aa4152ed39d8af1f334f71147b76");
        } else {
            a(this.q, new float[]{0.0f, 0.0f});
        }
        a(0.005f);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cfba60d4c94cdde4db5a75af5745bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cfba60d4c94cdde4db5a75af5745bf");
        } else {
            a(this.r, f);
        }
    }

    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a4be2fa0efd03cbe18f85a99607552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a4be2fa0efd03cbe18f85a99607552");
        } else {
            a(this.b, new float[]{f, f2});
        }
    }
}
