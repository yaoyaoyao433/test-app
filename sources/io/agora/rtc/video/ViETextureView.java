package io.agora.rtc.video;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.internal.Logging;
import io.agora.rtc.video.GLTextureView;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class ViETextureView extends GLTextureView implements GLTextureView.Renderer {
    private static final boolean DEBUG = false;
    private static String TAG = "ViETextureView";
    private int mLastRotation;
    private ReentrantLock nativeFunctionLock;
    private boolean nativeFunctionsRegisted;
    private int nativeGLPragram;
    private boolean nativeGLResourceUpdated;
    private int[] nativeGLTextureId;
    private long nativeObject;
    private boolean openGLCreated;
    private boolean surfaceCreated;
    private int viewHeight;
    private int viewWidth;

    private native int CreateOpenGLNative(long j, int i, int i2);

    private native void DrawNative(long j);

    private native void OnCfgChangedNative(long j, int i);

    @Override // io.agora.rtc.video.GLTextureView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    @Override // io.agora.rtc.video.GLTextureView.Renderer
    public void onSurfaceDestroyed(GL10 gl10) {
    }

    public static boolean UseOpenGL2(Object obj) {
        return ViETextureView.class.isInstance(obj);
    }

    public ViETextureView(Context context) {
        super(context);
        this.surfaceCreated = false;
        this.openGLCreated = false;
        this.nativeFunctionsRegisted = false;
        this.nativeFunctionLock = new ReentrantLock();
        this.nativeObject = 0L;
        this.viewWidth = 0;
        this.viewHeight = 0;
        this.nativeGLPragram = 0;
        this.nativeGLTextureId = new int[]{0, 0, 0};
        this.nativeGLResourceUpdated = false;
        this.mLastRotation = -1;
        init(false, 0, 0);
    }

    public ViETextureView(Context context, boolean z, int i, int i2) {
        super(context);
        this.surfaceCreated = false;
        this.openGLCreated = false;
        this.nativeFunctionsRegisted = false;
        this.nativeFunctionLock = new ReentrantLock();
        this.nativeObject = 0L;
        this.viewWidth = 0;
        this.viewHeight = 0;
        this.nativeGLPragram = 0;
        this.nativeGLTextureId = new int[]{0, 0, 0};
        this.nativeGLResourceUpdated = false;
        this.mLastRotation = -1;
        init(z, i, i2);
    }

    private void init(boolean z, int i, int i2) {
        setEGLContextFactory(new ContextFactory());
        setEGLConfigChooser(z ? new ConfigChooser(8, 8, 8, 8, i, i2) : new ConfigChooser(5, 6, 5, 0, i, i2));
        setRenderer(this);
        setRenderMode(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class ContextFactory implements GLTextureView.EGLContextFactory {
        private static int EGL_CONTEXT_CLIENT_VERSION = 12440;

        private ContextFactory() {
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            ViETextureView.checkEglError("Before eglCreateContext", egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            ViETextureView.checkEglError("After eglCreateContext", egl10);
            return eglCreateContext;
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglError(String str, EGL10 egl10) {
        while (true) {
            int eglGetError = egl10.eglGetError();
            if (eglGetError == 12288) {
                return;
            }
            try {
                Logging.e(TAG, String.format("%s: EGL error: 0x%x", str, Integer.valueOf(eglGetError)));
            } catch (Exception unused) {
                Log.e("AGORA_SDK", "egl error!!, video may not displayed!!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class ConfigChooser implements GLTextureView.EGLConfigChooser {
        private static int EGL_OPENGL_ES2_BIT = 4;
        private static int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, EGL_OPENGL_ES2_BIT, 12344};
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue = new int[1];

        public ConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                Logging.w(ViETextureView.TAG, "no configurations found");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, eGLConfigArr, i, iArr);
            return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        private void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            Logging.w(ViETextureView.TAG, String.format("%d configurations", Integer.valueOf(length)));
            for (int i = 0; i < length; i++) {
                Logging.w(ViETextureView.TAG, String.format("Configuration %d:\n", Integer.valueOf(i)));
                printConfig(egl10, eGLDisplay, eGLConfigArr[i]);
            }
        }

        private void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
            String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
            int[] iArr2 = new int[1];
            for (int i = 0; i < 33; i++) {
                int i2 = iArr[i];
                String str = strArr[i];
                if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, iArr2)) {
                    Logging.w(ViETextureView.TAG, String.format("  %s: %d\n", str, Integer.valueOf(iArr2[0])));
                } else {
                    do {
                    } while (egl10.eglGetError() != 12288);
                }
            }
        }
    }

    public static boolean IsSupported(Context context) {
        return ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
    }

    @Override // io.agora.rtc.video.GLTextureView.Renderer
    public void onDrawFrame(GL10 gl10) {
        updateOrientation();
        this.nativeFunctionLock.lock();
        if (!this.nativeFunctionsRegisted || !this.surfaceCreated) {
            this.nativeFunctionLock.unlock();
            return;
        }
        if (!this.openGLCreated) {
            if (CreateOpenGLNative(this.nativeObject, this.viewWidth, this.viewHeight) != 0) {
                return;
            }
            this.openGLCreated = true;
        }
        DrawNative(this.nativeObject);
        this.nativeFunctionLock.unlock();
    }

    @Override // io.agora.rtc.video.GLTextureView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.surfaceCreated = true;
        this.viewWidth = i;
        this.viewHeight = i2;
        StringBuilder sb = new StringBuilder("Surface changed to width ");
        sb.append(i);
        sb.append(" height ");
        sb.append(i2);
        this.nativeFunctionLock.lock();
        try {
            if (this.nativeFunctionsRegisted && CreateOpenGLNative(this.nativeObject, i, i2) == 0) {
                this.openGLCreated = true;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.nativeFunctionLock.unlock();
            throw th;
        }
        this.nativeFunctionLock.unlock();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateOrientation();
    }

    private int checkOrientation() {
        Display defaultDisplay;
        if (getContext() != null && getContext().getSystemService("window") != null && (defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay()) != null) {
            try {
                return defaultDisplay.getRotation();
            } catch (RuntimeException unused) {
                Logging.e(TAG, "checkOrientation display getRotation throwout exception");
                return this.mLastRotation;
            }
        }
        return this.mLastRotation;
    }

    private void updateOrientation() {
        int checkOrientation = checkOrientation();
        if (checkOrientation != this.mLastRotation) {
            this.nativeFunctionLock.lock();
            if (this.nativeFunctionsRegisted) {
                OnCfgChangedNative(this.nativeObject, checkOrientation);
            }
            this.mLastRotation = checkOrientation;
            this.nativeFunctionLock.unlock();
        }
    }

    public void RegisterNativeObject(long j) {
        this.nativeFunctionLock.lock();
        this.nativeObject = j;
        this.nativeFunctionsRegisted = true;
        this.nativeFunctionLock.unlock();
    }

    public void DeRegisterNativeObject() {
        this.nativeFunctionLock.lock();
        this.nativeFunctionsRegisted = false;
        this.openGLCreated = false;
        this.nativeObject = 0L;
        this.nativeFunctionLock.unlock();
        releaseOpenGLResource();
    }

    public void ReDraw() {
        if (this.surfaceCreated) {
            requestRender();
        }
    }

    public void UpdateOpenGLResource(int[] iArr) {
        this.nativeGLPragram = iArr[0];
        int i = 0;
        while (i < 3) {
            int i2 = i + 1;
            this.nativeGLTextureId[i] = iArr[i2];
            i = i2;
        }
        this.nativeGLResourceUpdated = true;
        String str = TAG;
        Logging.i(str, "UpdateOpenGLResource, program = " + iArr[0] + " texture[0~2] = " + iArr[1] + " ," + iArr[2] + " ," + iArr[3]);
    }

    public void releaseOpenGLResource() {
        if (this.nativeGLResourceUpdated) {
            queueEvent(new Runnable() { // from class: io.agora.rtc.video.ViETextureView.1
                @Override // java.lang.Runnable
                public void run() {
                    String str = ViETextureView.TAG;
                    Logging.i(str, "releaseOpenGLResource, value = " + ViETextureView.this.nativeGLPragram + " ," + ViETextureView.this.nativeGLTextureId[0] + " ," + ViETextureView.this.nativeGLTextureId[1] + " ," + ViETextureView.this.nativeGLTextureId[2]);
                    GLES20.glDeleteProgram(ViETextureView.this.nativeGLPragram);
                    GLES20.glDeleteTextures(3, ViETextureView.this.nativeGLTextureId, 0);
                    int glGetError = GLES20.glGetError();
                    if (glGetError != 0) {
                        String str2 = ViETextureView.TAG;
                        Logging.e(str2, "glDelete error: " + glGetError);
                    }
                }
            });
            this.nativeGLResourceUpdated = false;
        }
    }
}
