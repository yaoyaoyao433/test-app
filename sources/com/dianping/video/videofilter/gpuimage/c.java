package com.dianping.video.videofilter.gpuimage;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends j {
    public c() {
        super("varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }");
    }
}
