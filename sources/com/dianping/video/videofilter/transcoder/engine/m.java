package com.dianping.video.videofilter.transcoder.engine;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a;
    FloatBuffer b;
    float[] c;
    float[] d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    private final float[] k;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b27ca68db506deb6fd81075ee085e5a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b27ca68db506deb6fd81075ee085e5a0");
            return;
        }
        this.k = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.c = new float[16];
        this.d = new float[16];
        this.f = -12345;
        this.b = ByteBuffer.allocateDirect(this.k.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.b.put(this.k).position(0);
        Matrix.setIdentityM(this.d, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11dbbff3e360f569e3742bd679f021ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11dbbff3e360f569e3742bd679f021ee")).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("TextureRender", "Could not compile shader " + i + CommonConstant.Symbol.COLON);
            StringBuilder sb = new StringBuilder(StringUtil.SPACE);
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e("TextureRender", sb.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015c0195146f2660c6c5d77258b16f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015c0195146f2660c6c5d77258b16f58");
            return;
        }
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        Log.e("TextureRender", str + ": glError " + glGetError);
        throw new RuntimeException(str + ": glError " + glGetError);
    }
}
