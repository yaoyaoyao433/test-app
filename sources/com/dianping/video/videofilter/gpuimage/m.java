package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends f {
    public static ChangeQuickRedirect a;
    public float[] b;
    public float[] c;
    public float[] q;
    private int r;
    private int s;
    private int t;

    public m() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 texSize;\nuniform vec2 fboSize;\nuniform vec2 canvasScale;\n\nconst vec4 black = vec4(0.0, 0.0, 0.0, 1.0);\nconst vec2 boundMin = vec2(0.0, 0.0);\nconst vec2 boundMax = vec2(1.0, 1.0);\n\nbool inBounds(vec2 p) {\n return all(lessThan(boundMin, p)) && all(lessThan(p, boundMax));\n}\n\nvec2 getTexCoord(){\n    if (texSize.x * fboSize.y > texSize.y * fboSize.x) {\n       float width = texSize.x * (fboSize.y / texSize.y);\n       float scale = fboSize.x / width;\n       float xoffset = (1. - scale) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(scale, 1.) + vec2(xoffset , 0.);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    } else {\n       float height = texSize.y * (fboSize.x / texSize.x);\n       float scale = fboSize.y / height;\n       float yoffset = (1. - scale) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(1., scale) + vec2(0. , yoffset);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    }\n}\n\nvoid main() {\n    vec2 texCoord = getTexCoord();\n    if (inBounds(texCoord)) {\n        gl_FragColor = texture2D(inputImageTexture, texCoord);\n    } else {\n        gl_FragColor = black;\n    }\n}");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149c0b434bc727704e8e16e219a984cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149c0b434bc727704e8e16e219a984cd");
        }
    }

    private m(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09713bc372d38b591c9380939765e8dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09713bc372d38b591c9380939765e8dc");
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d10e3c0cd64af30134e94702661fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d10e3c0cd64af30134e94702661fc5");
            return;
        }
        super.a();
        this.r = GLES20.glGetUniformLocation(h(), "texSize");
        this.s = GLES20.glGetUniformLocation(h(), "fboSize");
        this.t = GLES20.glGetUniformLocation(h(), "canvasScale");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f987dd4b9a6627c39c1b7840f630b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f987dd4b9a6627c39c1b7840f630b0");
            return;
        }
        super.c();
        a(this.r, this.b);
        a(this.s, this.c);
        a(this.t, this.q);
    }

    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1721866a3de8f7a445673447a8f7814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1721866a3de8f7a445673447a8f7814");
        } else {
            this.b = new float[]{f, f2};
        }
    }
}
