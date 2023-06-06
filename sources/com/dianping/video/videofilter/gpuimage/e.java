package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e extends f {
    public static ChangeQuickRedirect a;
    private int b;
    private boolean c;
    private int q;
    private int r;
    private volatile float s;

    public e() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nuniform lowp float vf;\nvoid main() {\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * vf;\n}\n");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a964ac52333efaefadb110f40c499771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a964ac52333efaefadb110f40c499771");
            return;
        }
        this.c = true;
        this.s = 1.0f;
        this.c = com.dianping.video.constant.b.a;
        if (this.c) {
            Matrix.setIdentityM(this.i, 0);
            a("attribute vec4 position;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix * position;\n    textureCoordinate = (uSTMatrix * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nuniform lowp float vf;\nvoid main() {\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * vf;\n}\n");
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d743dd278ccb5e9a4d594166c04173c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d743dd278ccb5e9a4d594166c04173c");
            return;
        }
        super.a();
        this.b = GLES20.glGetUniformLocation(this.j, "vf");
        if (this.c) {
            this.q = GLES20.glGetUniformLocation(this.j, "uMVPMatrix");
            if (this.q == -1) {
                throw new RuntimeException("Could not get attrib location for uMVPMatrix");
            }
            this.r = GLES20.glGetUniformLocation(this.j, "uSTMatrix");
            if (this.r == -1) {
                throw new RuntimeException("Could not get attrib location for uSTMatrix");
            }
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d1acb241f0e7367bba8c57e1b6b00d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d1acb241f0e7367bba8c57e1b6b00d2");
            return;
        }
        GLES20.glUseProgram(this.j);
        g();
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.k);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.m);
        GLES20.glUniform1f(this.b, this.s);
        if (this.c) {
            Matrix.setIdentityM(this.h, 0);
            GLES20.glUniformMatrix4fv(this.q, 1, false, this.h, 0);
            GLES20.glUniformMatrix4fv(this.r, 1, false, this.i, 0);
        }
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.l, 0);
        }
        f();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.k);
        GLES20.glDisableVertexAttribArray(this.m);
        GLES20.glBindTexture(3553, 0);
    }
}
