package com.taobao.gcanvas.surface;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.util.GCanvasUtil;
import com.taobao.gcanvas.util.GLog;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GTextureViewCallback implements TextureView.SurfaceTextureListener {
    private String mBackgroundColor;
    private Config mConfig;
    private ArrayList<TextureView.SurfaceTextureListener> mDelegateLists;
    private final String mKey;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureView mTextureview;

    private native void onRenderExit(String str);

    private native void onSurfaceChanged(String str, Surface surface, int i, int i2, int i3, String str2);

    private native void onSurfaceCreated(String str, Surface surface);

    private native void onSurfaceDestroyed(String str, Surface surface);

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    static {
        GCanvasJNI.load();
    }

    public GTextureViewCallback(TextureView textureView, String str) {
        this(textureView, str, new Config());
    }

    public GTextureViewCallback(TextureView textureView, String str, @NonNull Config config) {
        this.mBackgroundColor = "#00000000";
        this.mKey = str;
        this.mTextureview = textureView;
        this.mConfig = config;
    }

    public void setBackgroundColor(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mBackgroundColor = str;
    }

    public void addSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mDelegateLists == null) {
            this.mDelegateLists = new ArrayList<>(1);
        }
        if (this.mDelegateLists.contains(surfaceTextureListener)) {
            return;
        }
        this.mDelegateLists.add(surfaceTextureListener);
    }

    public void removeSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mDelegateLists == null) {
            return;
        }
        this.mDelegateLists.remove(surfaceTextureListener);
    }

    public void clearSurfaceTextureListener() {
        if (this.mDelegateLists != null) {
            this.mDelegateLists.clear();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    @TargetApi(16)
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        GLog.d("on surfaceTexture Available.");
        if (this.mSurface == null) {
            this.mSurface = new Surface(surfaceTexture);
            this.mSurfaceTexture = surfaceTexture;
        } else if (this.mSurfaceTexture != surfaceTexture) {
            this.mTextureview.setSurfaceTexture(this.mSurfaceTexture);
        }
        onSurfaceChanged(this.mKey, this.mSurface, 0, i, i2, this.mBackgroundColor);
        if (this.mConfig != null && this.mConfig.useDefaultContextType) {
            GCanvasJNI.setContextType(this.mKey, 0, this.mConfig.enableMsaa);
        }
        GCanvasJNI.setDevicePixelRatio(this.mKey, GCanvasUtil.getScaledDensity(this.mTextureview.getContext()));
        if (GCanvasJNI.sendEvent(this.mKey) && (this.mTextureview instanceof GTextureView)) {
            GLog.d("start to send event in GSurfaceCallback.");
            ((GTextureView) this.mTextureview).sendEvent();
        }
        if (this.mDelegateLists != null) {
            Iterator<TextureView.SurfaceTextureListener> it = this.mDelegateLists.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        GLog.d("on surfaceTexture changed.");
        if (this.mSurface == null) {
            this.mSurface = new Surface(surfaceTexture);
            this.mSurfaceTexture = surfaceTexture;
        }
        onSurfaceChanged(this.mKey, this.mSurface, 0, i, i2, this.mBackgroundColor);
        if (this.mDelegateLists != null) {
            Iterator<TextureView.SurfaceTextureListener> it = this.mDelegateLists.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        GLog.d("on surfaceTexture destroyed.");
        if (this.mSurfaceTexture == null && this.mSurface == null) {
            return true;
        }
        onSurfaceDestroyed(this.mKey, this.mSurface);
        if (this.mDelegateLists != null) {
            Iterator<TextureView.SurfaceTextureListener> it = this.mDelegateLists.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceTextureDestroyed(surfaceTexture);
            }
            return false;
        }
        return false;
    }

    public void onRequestExit() {
        GLog.d("on RequestExit");
        if (this.mSurface != null && this.mSurface.isValid()) {
            this.mSurface.release();
            this.mSurface = null;
        }
        if (this.mSurfaceTexture != null) {
            this.mSurfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        onRenderExit(this.mKey);
    }

    public String getKey() {
        return this.mKey;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Config {
        private boolean enableMsaa;
        private boolean useDefaultContextType = true;

        public Config() {
        }

        public Config(boolean z) {
            this.enableMsaa = z;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static class Builder {
            Config config = new Config();

            public Builder useDefaultContextType(boolean z) {
                this.config.useDefaultContextType = z;
                return this;
            }

            public Builder enableMsaa(boolean z) {
                this.config.enableMsaa = z;
                return this;
            }

            public Config build() {
                return this.config;
            }
        }
    }
}
