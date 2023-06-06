package com.tencent.liteav.k;

import com.tencent.liteav.beauty.b.aj;
import com.tencent.liteav.beauty.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class l extends aj {
    private String x;

    public l(String str, String str2) {
        super(str, str2);
        this.x = "WatermarkTexture";
        this.t = true;
        this.u = 770;
    }

    public l() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public void a(e.f[] fVarArr) {
        if (this.r == null) {
            this.r = new aj.a[fVarArr.length];
        }
        for (int i = 0; i < fVarArr.length; i++) {
            if (this.r[i] == null) {
                this.r[i] = new aj.a();
            }
            if (this.r[i].d == null) {
                this.r[i].d = new int[1];
            }
            a(fVarArr[i].f, fVarArr[i].g, fVarArr[i].b, fVarArr[i].c, fVarArr[i].d, i);
            this.r[i].d[0] = fVarArr[i].e;
        }
    }
}
