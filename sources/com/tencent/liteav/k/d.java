package com.tencent.liteav.k;

import android.opengl.GLES20;
import com.meituan.metrics.common.Constants;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.k.n;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends com.tencent.liteav.basic.opengl.j {
    private com.tencent.liteav.basic.opengl.j r;
    private int s;
    private int t;
    private int u;
    private float v;

    public d() {
        super("attribute vec4 position;  \nattribute vec4 inputTextureCoordinate;\nuniform vec2 step;  \nvarying vec2 textureCoordinate;  \nvarying vec2 oneBackCoord;  \nvarying vec2 twoBackCoord;  \nvarying vec2 threeBackCoord;  \nvarying vec2 fourBackCoord;  \nvarying vec2 oneForwardCoord;  \nvarying vec2 twoForwardCoord;  \nvarying vec2 threeForwardCoord;  \nvarying vec2 fourForwardCoord;  \nvoid main() {  \n\tgl_Position = position;  \n\tvec2 coord = inputTextureCoordinate.xy;  \n\ttextureCoordinate = coord;  \n\toneBackCoord = coord.xy - step;  \n\ttwoBackCoord = coord.xy - 2.0 * step;  \n\tthreeBackCoord = coord.xy - 3.0 * step;  \n\tfourBackCoord = coord.xy - 4.0 * step;  \n\toneForwardCoord = coord.xy + step;  \n\ttwoForwardCoord = coord.xy + 2.0 * step;  \n\tthreeForwardCoord = coord.xy + 3.0 * step;  \n\tfourForwardCoord = coord.xy + 4.0 * step;  \n}  \n", "precision mediump float;  \nuniform sampler2D inputImageTexture;  \nvarying vec2 textureCoordinate;  \nvarying vec2 oneBackCoord;  \nvarying vec2 twoBackCoord;  \nvarying vec2 threeBackCoord;  \nvarying vec2 fourBackCoord;  \nvarying vec2 oneForwardCoord;  \nvarying vec2 twoForwardCoord;  \nvarying vec2 threeForwardCoord;  \nvarying vec2 fourForwardCoord;  \nvoid main() {   \n\tlowp vec4 fragmentColor = texture2D(inputImageTexture, textureCoordinate) * 0.18;  \n\tfragmentColor += texture2D(inputImageTexture, oneBackCoord) * 0.15;  \n\tfragmentColor += texture2D(inputImageTexture, twoBackCoord) * 0.12;  \n\tfragmentColor += texture2D(inputImageTexture, threeBackCoord) * 0.09;  \n\tfragmentColor += texture2D(inputImageTexture, fourBackCoord) * 0.05;  \n\tfragmentColor += texture2D(inputImageTexture, oneForwardCoord) * 0.15;  \n\tfragmentColor += texture2D(inputImageTexture, twoForwardCoord) * 0.12;  \n\tfragmentColor += texture2D(inputImageTexture, threeForwardCoord) * 0.09;  \n\tfragmentColor += texture2D(inputImageTexture, fourForwardCoord) * 0.05;  \n\tgl_FragColor = fragmentColor;  \n}  \n");
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = 0.0f;
        this.o = true;
        this.r = new com.tencent.liteav.basic.opengl.j("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision lowp float;  \nvarying vec2 textureCoordinate;  \n\tuniform sampler2D inputImageTexture;  \n\tuniform float shift;  \n\tuniform float alpha;  \n\tvoid main() { vec4 colorShift = texture2D(inputImageTexture, textureCoordinate + vec2(shift, 0.0));  \n\tvec4 color = texture2D(inputImageTexture, textureCoordinate + vec2(shift * 0.1, 0.0));  \n\tgl_FragColor = vec4(mix(colorShift.rgb, color.rgb, alpha), color.a);  \n}  \n");
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (super.a()) {
            this.u = GLES20.glGetUniformLocation(this.a, Constants.SPEED_METER_STEP);
            if (!this.r.c()) {
                e();
                return false;
            }
            this.s = GLES20.glGetUniformLocation(this.r.q(), "shift");
            this.t = GLES20.glGetUniformLocation(this.r.q(), "alpha");
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        if (this.r != null) {
            this.r.a(i, i2);
        }
        if (i == 0 || this.v == 0.0d) {
            return;
        }
        a(this.u, new float[]{this.v / this.e, 0.0f});
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void e() {
        super.e();
        this.r.e();
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(boolean z) {
        this.r.a(z);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i, int i2, int i3) {
        if (this.g) {
            GLES20.glBindFramebuffer(36160, this.m);
            a(i, this.h, this.i);
            if (this.l instanceof j.a) {
                this.l.a(i3);
            }
            if (i2 != this.m) {
                return this.r.a(this.n, i2, i3);
            }
            return this.r.a(this.n);
        }
        return -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int b(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.g) {
            GLES20.glBindFramebuffer(36160, this.m);
            a(i, floatBuffer, floatBuffer2);
            if (this.l instanceof j.a) {
                this.l.a(i);
            }
            this.r.b(this.n);
            return 1;
        }
        return -1;
    }

    public void a(n.e eVar) {
        a(eVar.b, eVar.a, eVar.c);
    }

    private void a(float f, float f2, float f3) {
        this.v = f;
        if (this.e != 0) {
            a(this.u, new float[]{f / this.e, 0.0f});
        }
        this.r.a(this.t, f3);
        this.r.a(this.s, f2);
    }
}
