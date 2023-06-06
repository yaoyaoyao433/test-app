package com.dianping.video.videofilter.template;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends a {
    public b() {
        super("attribute vec4 position;\nattribute vec2 texCoord;\n\nvarying vec2 texCoordVarying;\n\nvoid main() {\n  gl_Position = position;\n  texCoordVarying = texCoord;\n}", "varying highp vec2 texCoordVarying;\nuniform sampler2D inputImageTexture;\n\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture, texCoordVarying);\n}");
    }

    public b(String str, String str2) {
        super(str, str2);
    }
}
