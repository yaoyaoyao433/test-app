package com.dianping.video.videofilter.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class q extends f {
    public static ChangeQuickRedirect b = null;
    protected static boolean c = true;
    private ByteBuffer a;
    public int q;
    public int r;
    public int s;
    protected Bitmap t;

    public q(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0278794d8d5b1844319237b47d5e9ac5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0278794d8d5b1844319237b47d5e9ac5");
        }
    }

    private q(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da469936246ccde57d7015d7ef8904a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da469936246ccde57d7015d7ef8904a");
            return;
        }
        this.s = -1;
        u uVar = u.NORMAL;
        Object[] objArr2 = {uVar, (byte) 0, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3513ec25a3e00820a916b54a18876680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3513ec25a3e00820a916b54a18876680");
            return;
        }
        float[] a = v.a(uVar, false, false);
        ByteBuffer order = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        asFloatBuffer.put(a);
        asFloatBuffer.flip();
        this.a = order;
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53343471ac1757eaa5a3aabbffffd729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53343471ac1757eaa5a3aabbffffd729");
            return;
        }
        super.a();
        this.q = GLES20.glGetAttribLocation(h(), "inputTextureCoordinate2");
        this.r = GLES20.glGetUniformLocation(h(), "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(this.q);
        if (this.t == null || this.t.isRecycled()) {
            return;
        }
        a(this.t);
    }

    public final void a(final Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8212f87a902d63da32f6b7c4c02bbe97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8212f87a902d63da32f6b7c4c02bbe97");
        } else if (bitmap == null || !bitmap.isRecycled()) {
            this.t = bitmap;
            if (this.t == null) {
                return;
            }
            a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.q.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28ea2ade3abe7b4ed1c62f5baf7d296d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28ea2ade3abe7b4ed1c62f5baf7d296d");
                    } else if (q.this.s != -1 || bitmap == null || bitmap.isRecycled()) {
                    } else {
                        GLES20.glActiveTexture(33987);
                        q.this.s = s.a(bitmap, -1, false);
                        if (q.c) {
                            new StringBuilder("GPUImage textureId=").append(q.this.s);
                        }
                    }
                }
            });
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a080c72e34a91c15a8d4c97176d27ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a080c72e34a91c15a8d4c97176d27ca");
            return;
        }
        super.e();
        GLES20.glDeleteTextures(1, new int[]{this.s}, 0);
        this.s = -1;
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966e2e38cdf1ef3d53da2afc1124dcc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966e2e38cdf1ef3d53da2afc1124dcc5");
            return;
        }
        GLES20.glEnableVertexAttribArray(this.q);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.s);
        GLES20.glUniform1i(this.r, 3);
        this.a.position(0);
        GLES20.glVertexAttribPointer(this.q, 2, 5126, false, 0, (Buffer) this.a);
    }
}
