package com.meituan.msi.api.video.compress.render;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final float[] k = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public final FloatBuffer b;
    public final float[] c;
    public final float[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    private final int l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4addef00a13c50bbaef451f2e63e544", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4addef00a13c50bbaef451f2e63e544");
            return;
        }
        this.c = new float[16];
        this.d = new float[16];
        this.f = -1234567;
        this.l = 0;
        this.b = ByteBuffer.allocateDirect(k.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.b.put(k).position(0);
        Matrix.setIdentityM(this.d, 0);
    }

    public int a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e249b7b806d9d5ff3eed2b7a87ce45bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e249b7b806d9d5ff3eed2b7a87ce45bf")).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f0f6e3ba65e22e66abc72b9b12e6d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f0f6e3ba65e22e66abc72b9b12e6d04");
            return;
        }
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + glGetError);
    }
}
