package io.agora.rtc.gl;

import android.opengl.GLES20;
import io.agora.rtc.gl.RendererCommon;
import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GlRectDrawer implements RendererCommon.GlDrawer {
    private static final FloatBuffer FULL_RECTANGLE_BUF = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEX_BUF = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final String OES_FRAGMENT_SHADER_STRING = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n";
    private static final String RGB_FRAGMENT_SHADER_STRING = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n";
    private static final String VERTEX_SHADER_STRING = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    private static final String YUV_FRAGMENT_SHADER_STRING = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n";
    private FloatBuffer mTexCoordinate = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private FloatBuffer mPosCoordinate = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private final Map<String, Shader> shaders = new IdentityHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Shader {
        public final GlShader glShader;
        public final int texMatrixLocation;

        public Shader(String str) {
            this.glShader = new GlShader(GlRectDrawer.VERTEX_SHADER_STRING, str);
            this.texMatrixLocation = this.glShader.getUniformLocation("texMatrix");
        }
    }

    @Override // io.agora.rtc.gl.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(OES_FRAGMENT_SHADER_STRING, fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // io.agora.rtc.gl.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(RGB_FRAGMENT_SHADER_STRING, fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // io.agora.rtc.gl.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        prepareShader(YUV_FRAGMENT_SHADER_STRING, fArr);
        for (int i7 = 0; i7 < 3; i7++) {
            GLES20.glActiveTexture(33984 + i7);
            GLES20.glBindTexture(3553, iArr[i7]);
        }
        drawRectangle(i3, i4, i5, i6);
        for (int i8 = 0; i8 < 3; i8++) {
            GLES20.glActiveTexture(i8 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    private void drawRectangle(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void prepareShader(String str, float[] fArr) {
        Shader shader;
        if (this.shaders.containsKey(str)) {
            shader = this.shaders.get(str);
        } else {
            Shader shader2 = new Shader(str);
            this.shaders.put(str, shader2);
            shader2.glShader.useProgram();
            if (YUV_FRAGMENT_SHADER_STRING.equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("v_tex"), 2);
            } else if (RGB_FRAGMENT_SHADER_STRING.equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("rgb_tex"), 0);
            } else if (OES_FRAGMENT_SHADER_STRING.equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("oes_tex"), 0);
            } else {
                throw new IllegalStateException("Unknown fragment shader: " + str);
            }
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            shader2.glShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUF);
            shader2.glShader.setVertexAttribArray("in_tc", 2, FULL_RECTANGLE_TEX_BUF);
            shader = shader2;
        }
        shader.glShader.useProgram();
        GLES20.glUniformMatrix4fv(shader.texMatrixLocation, 1, false, fArr, 0);
    }

    private void prepareShader(String str, float[] fArr, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Shader shader;
        if (this.shaders.containsKey(str)) {
            shader = this.shaders.get(str);
        } else {
            Shader shader2 = new Shader(str);
            this.shaders.put(str, shader2);
            shader2.glShader.useProgram();
            if (str == YUV_FRAGMENT_SHADER_STRING) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("v_tex"), 2);
            } else if (str == RGB_FRAGMENT_SHADER_STRING) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("rgb_tex"), 0);
            } else if (str == OES_FRAGMENT_SHADER_STRING) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("oes_tex"), 0);
            } else {
                throw new IllegalStateException("Unknown fragment shader: " + str);
            }
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            shader = shader2;
        }
        shader.glShader.setVertexAttribArray("in_pos", 2, floatBuffer2);
        shader.glShader.setVertexAttribArray("in_tc", 2, floatBuffer);
        shader.glShader.useProgram();
        GLES20.glUniformMatrix4fv(shader.texMatrixLocation, 1, false, fArr, 0);
    }

    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray(i2, i3, i8, i9));
        if (i8 != i6 || i9 != i7) {
            this.mPosCoordinate = GlUtil.createFloatBuffer(ComputePosVertexAttribArray(i6, i7, i8, i9));
        } else {
            this.mPosCoordinate = FULL_RECTANGLE_BUF;
        }
        prepareShader(OES_FRAGMENT_SHADER_STRING, fArr, this.mTexCoordinate, this.mPosCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(36197, 0);
    }

    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        float[] ComputeVertexAttribArray = ComputeVertexAttribArray(i2, i3, i8, i9);
        if (i8 != i6 || i9 != i7) {
            this.mPosCoordinate = GlUtil.createFloatBuffer(ComputePosVertexAttribArray(i6, i7, i8, i9));
        } else {
            this.mPosCoordinate = FULL_RECTANGLE_BUF;
        }
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray);
        prepareShader(RGB_FRAGMENT_SHADER_STRING, fArr, this.mTexCoordinate, this.mPosCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(3553, 0);
    }

    private float[] ComputeVertexAttribArray(int i, int i2, int i3, int i4) {
        float f = i3 / i4;
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 >= f) {
            float f4 = ((f2 - (f3 * f)) / 2.0f) / f2;
            float f5 = 1.0f - f4;
            return new float[]{f4, 0.0f, f5, 0.0f, f4, 1.0f, f5, 1.0f};
        }
        float f6 = ((f3 - (f2 / f)) / 2.0f) / f3;
        float f7 = 1.0f - f6;
        return new float[]{0.0f, f6, 1.0f, f6, 0.0f, f7, 1.0f, f7};
    }

    private float[] ComputePosVertexAttribArray(int i, int i2, int i3, int i4) {
        float f = i2 == i4 ? -1.0f : (((i2 - i4) * 2.0f) / i2) - 1.0f;
        float f2 = i == i3 ? 1.0f : ((i3 * 2.0f) / i) - 1.0f;
        return new float[]{-1.0f, f, f2, f, -1.0f, 1.0f, f2, 1.0f};
    }

    @Override // io.agora.rtc.gl.RendererCommon.GlDrawer
    public void release() {
        for (Shader shader : this.shaders.values()) {
            shader.glShader.release();
        }
        this.shaders.clear();
    }
}
