package com.tencent.liteav.basic.opengl;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Build;
import com.dianping.titans.service.FileUtil;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCOpenGlUtils {
    private static float[] f = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static float[] g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private static float[] h = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private static float[] i = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static float[] j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static FloatBuffer a = a(f);
    public static FloatBuffer b = a(g);
    public static FloatBuffer c = a(h);
    public static FloatBuffer d = a(i);
    public static FloatBuffer e = a(j);
    private static int k = 2;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public int[] a = null;
        public int[] b = null;
        public int c = -1;
        public int d = -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
    }

    public static native void nativeCopyDataFromByteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i2);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i2, int i3, int i4, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(ByteBuffer byteBuffer, int i2, int i3, int i4, int[] iArr);

    public static void a(int i2) {
        k = i2;
    }

    public static final int a() {
        return k;
    }

    public static void a(a[] aVarArr) {
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    a(aVar);
                }
            }
        }
    }

    public static a[] a(a[] aVarArr, int i2, int i3, int i4) {
        if (aVarArr == null) {
            aVarArr = new a[i2];
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            aVarArr[i5] = a(aVarArr[i5], i3, i4);
        }
        return aVarArr;
    }

    public static a a(a aVar, int i2, int i3) {
        if (aVar == null) {
            aVar = new a();
        }
        if (aVar.a == null) {
            aVar.a = new int[1];
        }
        if (aVar.b == null) {
            aVar.b = new int[1];
        }
        aVar.c = i2;
        aVar.d = i3;
        a(aVar.a, aVar.b, aVar.c, aVar.d);
        return aVar;
    }

    public static a a(a aVar) {
        if (aVar != null) {
            if (aVar.a != null) {
                GLES20.glDeleteFramebuffers(1, aVar.a, 0);
                aVar.a = null;
            }
            if (aVar.b != null) {
                GLES20.glDeleteTextures(1, aVar.b, 0);
                aVar.b = null;
            }
            return null;
        }
        return aVar;
    }

    public static int a(int i2, int i3, int i4, int i5, int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729);
        GLES20.glTexImage2D(3553, 0, i4, i2, i3, 0, i5, 5121, null);
        return iArr[0];
    }

    public static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int a(int i2, int i3, int i4, int i5, IntBuffer intBuffer) {
        int c2 = c();
        GLES20.glBindTexture(3553, c2);
        GLES20.glTexImage2D(3553, 0, i4, i2, i3, 0, i5, 5121, intBuffer);
        GLES20.glBindTexture(3553, 0);
        return c2;
    }

    public static int a(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, i5, (IntBuffer) null);
    }

    public static int a(Bitmap bitmap, int i2, boolean z) {
        int[] iArr = new int[1];
        if (i2 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i2);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i2;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static int a(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int[] iArr = new int[1];
        if (i4 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, byteBuffer);
        } else {
            GLES20.glBindTexture(3553, i4);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i2, i3, 6408, 5121, byteBuffer);
            iArr[0] = i4;
        }
        return iArr[0];
    }

    public static int a(int i2, int i3, int[] iArr) {
        GLES30.glGenBuffers(1, iArr, 0);
        GLES30.glBindBuffer(35051, iArr[0]);
        GLES30.glBufferData(35051, i2 * i3 * 4, null, 35049);
        GLES30.glBindBuffer(35051, 0);
        return iArr[0];
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void a(int[] iArr, int[] iArr2, int i2, int i3) {
        GLES20.glGenFramebuffers(1, iArr, 0);
        iArr2[0] = a(i2, i3, 6408, 6408, iArr2);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static int c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static int a(String str, int i2) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            TXCLog.w("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(glCreateShader));
            return 0;
        }
        return glCreateShader;
    }

    public static int a(String str, String str2) {
        int[] iArr = new int[1];
        int a2 = a(str, 35633);
        if (a2 == 0) {
            TXCLog.w("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int a3 = a(str2, 35632);
        if (a3 == 0) {
            TXCLog.w("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a3);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            TXCLog.w("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(a2);
        GLES20.glDeleteShader(a3);
        return glCreateProgram;
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            TXCLog.e("OpenGlUtils", str + ": glError 0x" + Integer.toHexString(glGetError));
        }
    }

    public static int d() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static void b(int i2) {
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        }
    }

    public static void c(int i2) {
        if (i2 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
    }

    public static void a(int i2, int i3) {
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static void d(int i2) {
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static Object e() {
        if (Build.VERSION.SDK_INT >= 17) {
            return EGL14.eglGetCurrentContext();
        }
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public static void a(ByteBuffer byteBuffer, int i2, int i3, int i4, int[] iArr) {
        if (byteBuffer.isDirect()) {
            nativeLoadYuv420ByteBufferToTextures(byteBuffer, i2, i3, i4, iArr);
        } else {
            nativeLoadYuv420ByteArrayToTextures(byteBuffer.array(), i2, i3, i4, iArr);
        }
    }

    public static void a(e.a aVar, int i2, int i3, Object obj) {
        if (aVar == e.a.RGBA) {
            a(0, 0, i2, i3, obj);
        } else if (i3 % 8 == 0) {
            a(0, 0, i2, (i3 * 3) / 8, obj);
        } else {
            int i4 = ((i3 * 3) + 7) / 8;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i4 * 4);
            a(0, 0, i2, i4, allocateDirect);
            if (obj instanceof ByteBuffer) {
                nativeCopyDataFromByteBufferToByteBuffer(allocateDirect, (ByteBuffer) obj, ((i2 * i3) * 3) / 2);
            } else {
                nativeCopyDataFromByteBufferToByteArray(allocateDirect, (byte[]) obj, ((i2 * i3) * 3) / 2);
            }
        }
    }

    private static void a(int i2, int i3, int i4, int i5, Object obj) {
        GLES20.glFinish();
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            byteBuffer.position(0);
            GLES20.glReadPixels(i2, i3, i4, i5, 6408, 5121, byteBuffer);
            return;
        }
        GLES20.glReadPixels(i2, i3, i4, i5, 6408, 5121, ByteBuffer.wrap((byte[]) obj));
    }
}
