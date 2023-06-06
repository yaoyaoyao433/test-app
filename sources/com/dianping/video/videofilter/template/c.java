package com.dianping.video.videofilter.template;

import android.opengl.GLES20;
import android.util.Log;
import com.dianping.titans.service.FileUtil;
import com.dianping.video.videofilter.gpuimage.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends a {
    public static ChangeQuickRedirect s;
    public int t;
    private int[] u;
    private int[] v;
    private e w;

    public c() {
        this("attribute vec4 position;\nattribute vec2 texCoord;\n\nvarying vec2 texCoordVarying;\n\nvoid main() {\n  gl_Position = position;\n  texCoordVarying = texCoord;\n}", "precision highp float;\nvarying highp vec2 texCoordVarying;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture1;\nvoid main(){\n    vec2 inputuv  = vec2(texCoordVarying.x * 0.5, texCoordVarying.y);\n    vec2 maskuv = vec2(0.5 + 0.5 * texCoordVarying.x, texCoordVarying.y);\n    vec4 inputColor = texture2D(inputImageTexture1, inputuv);\n    vec4 maskColor = texture2D(inputImageTexture1, maskuv);\n    vec4 bgcolor = texture2D(inputImageTexture, texCoordVarying);\n    gl_FragColor = vec4(bgcolor.rgb * (vec3(1.0) - maskColor.rgb) + inputColor.rgb, 1.0);\n}");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c912a2a5f9da22d9a2dbb1a882125a8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c912a2a5f9da22d9a2dbb1a882125a8e");
        }
    }

    private c(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2e668ec57944fbe94b1771fe3796e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2e668ec57944fbe94b1771fe3796e9");
        } else {
            this.t = -1;
        }
    }

    @Override // com.dianping.video.videofilter.template.a, com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc3e380d6d1be7ae67de45c666440e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc3e380d6d1be7ae67de45c666440e8");
            return;
        }
        super.a();
        this.w = new e();
        this.w.b();
    }

    @Override // com.dianping.video.videofilter.template.a, com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40745dc8e41e8469cb31b9e8f86476d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40745dc8e41e8469cb31b9e8f86476d7");
            return;
        }
        super.a(i, i2);
        this.w.a(i, i2);
        if (this.u != null) {
            j();
        }
        a(i, i2, 1);
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), 1};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58676e907a82db91877273015e40dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58676e907a82db91877273015e40dd3");
            return;
        }
        this.u = new int[1];
        this.v = new int[1];
        for (int i4 = 0; i4 <= 0; i4++) {
            GLES20.glGenFramebuffers(1, this.u, 0);
            GLES20.glGenTextures(1, this.v, 0);
            GLES20.glBindTexture(3553, this.v[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i * 2, i2, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.u[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.v[0], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.dianping.video.videofilter.template.a, com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e86725ccb281e33fa8796fea7fce36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e86725ccb281e33fa8796fea7fce36");
        } else if (this.t == -1) {
            Log.e("DynamicTemplateFilter", "draw error! video texture not be set.");
        } else {
            int[] iArr = new int[4];
            GLES20.glGetIntegerv(2978, iArr, 0);
            GLES20.glViewport(0, 0, this.n * 2, this.o);
            GLES20.glBindFramebuffer(36160, this.u[0]);
            this.w.a(this.t, this.c, this.q);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
            Integer[] numArr = {Integer.valueOf(this.v[0])};
            Object[] objArr2 = {numArr};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "597093bb8d4da60baddcad08fa1d6352", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "597093bb8d4da60baddcad08fa1d6352");
            } else {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                Collections.addAll(this.b, numArr);
            }
            super.a(i, floatBuffer, floatBuffer2);
        }
    }

    @Override // com.dianping.video.videofilter.template.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f2e115c59b623344dd58935d41dc204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f2e115c59b623344dd58935d41dc204");
            return;
        }
        super.j();
        if (this.v != null) {
            GLES20.glDeleteTextures(this.v.length, this.v, 0);
            this.v = null;
        }
        if (this.u != null) {
            GLES20.glDeleteFramebuffers(this.u.length, this.u, 0);
            this.u = null;
        }
    }

    @Override // com.dianping.video.videofilter.template.a, com.dianping.video.videofilter.gpuimage.f
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d5b3b45847bc25961200489684de81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d5b3b45847bc25961200489684de81");
            return;
        }
        super.e();
        this.w.d();
    }
}
