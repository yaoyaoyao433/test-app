package com.tencent.liteav.beauty.b;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends com.tencent.liteav.basic.opengl.j {
    private static String z = "BulgeDistortion";
    private float r;
    private int s;
    private float t;
    private int u;
    private PointF v;
    private int w;
    private float x;
    private int y;

    public e() {
        this(0.5f, 0.3f, new PointF(0.5f, 0.5f));
    }

    public e(float f, float f2, PointF pointF) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\n\nuniform highp float aspectRatio;\nuniform highp vec2 center;\nuniform highp float radius;\nuniform highp float scale;\n\nvoid main()\n{\nhighp vec2 textureCoordinateToUse = vec2(textureCoordinate.x, (textureCoordinate.y * aspectRatio + 0.5 - 0.5 * aspectRatio));\nhighp float dist = distance(center, textureCoordinateToUse);\ntextureCoordinateToUse = textureCoordinate;\n\nif (dist < radius)\n{\ntextureCoordinateToUse -= center;\nhighp float percent = 1.0 - ((radius - dist) / radius) * scale;\npercent = percent * percent;\n\ntextureCoordinateToUse = textureCoordinateToUse * percent;\ntextureCoordinateToUse += center;\n}\n\ngl_FragColor = texture2D(inputImageTexture, textureCoordinateToUse );    \n}\n");
        this.t = f;
        this.r = f2;
        this.v = pointF;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (!super.a()) {
            TXCLog.e(z, "TXCGPUBulgeDistortionFilter init Failed!");
            return false;
        }
        this.s = GLES20.glGetUniformLocation(q(), "scale");
        this.u = GLES20.glGetUniformLocation(q(), "radius");
        this.w = GLES20.glGetUniformLocation(q(), "center");
        this.y = GLES20.glGetUniformLocation(q(), AspectRatio.LOWER_CASE_NAME);
        return true;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
        a(this.t);
        b(this.r);
        a(this.v);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        this.x = i2 / i;
        c(this.x);
        super.a(i, i2);
    }

    private void c(float f) {
        this.x = f;
        a(this.y, f);
    }

    public void a(float f) {
        this.t = f;
        a(this.u, f);
    }

    public void b(float f) {
        this.r = f;
        a(this.s, f);
    }

    public void a(PointF pointF) {
        this.v = pointF;
        a(this.w, pointF);
    }
}
