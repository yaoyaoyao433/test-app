package com.taobao.gcanvas.surface;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.surface.GTextureViewCallback;
import com.taobao.gcanvas.util.GLog;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GTextureView extends TextureView {
    private Set<Integer> bindTextures;
    private GTextureViewCallback mCallback;

    public void pause() {
    }

    public void resume() {
    }

    public void sendEvent() {
    }

    public GTextureView(Context context, String str) {
        this(context, str, new GTextureViewCallback.Config());
    }

    public GTextureView(Context context, String str, GTextureViewCallback.Config config) {
        super(context);
        this.bindTextures = new HashSet();
        init(str, config);
    }

    public GTextureView(Context context, String str, GTextureViewCallback.Config config, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bindTextures = new HashSet();
        init(str, config);
    }

    public GTextureView(Context context, String str, GTextureViewCallback.Config config, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bindTextures = new HashSet();
        init(str, config);
    }

    @TargetApi(21)
    public GTextureView(Context context, String str, GTextureViewCallback.Config config, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.bindTextures = new HashSet();
        init(str, config);
    }

    public void setBackgroundColor(String str) {
        if (this.mCallback != null) {
            this.mCallback.setBackgroundColor(str);
        }
    }

    public void addSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == null || this.mCallback == null) {
            return;
        }
        this.mCallback.addSurfaceTextureListener(surfaceTextureListener);
    }

    public void removeSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == null || this.mCallback == null) {
            return;
        }
        this.mCallback.removeSurfaceTextureListener(surfaceTextureListener);
    }

    public void clearSurfaceTextureListener() {
        if (this.mCallback != null) {
            this.mCallback.clearSurfaceTextureListener();
        }
    }

    private void init(String str, GTextureViewCallback.Config config) {
        GCanvasJNI.setAssetResource(getContext());
        this.mCallback = new GTextureViewCallback(this, str, config);
        setSurfaceTextureListener(this.mCallback);
        setOpaque(false);
        setLayerType(2, null);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        GLog.d("on window visibility changed.visibility=" + i);
    }

    public void requestExit() {
        GLog.d("on request Exit in GSurfaceView.");
        if (this.mCallback != null) {
            GLog.d("start to request Exit.");
            this.mCallback.onRequestExit();
        }
        this.bindTextures.clear();
    }

    public String getCanvasKey() {
        return this.mCallback != null ? this.mCallback.getKey() : "";
    }

    public void addBindTexture(int i) {
        this.bindTextures.add(Integer.valueOf(i));
    }

    public boolean hasBindTexture(int i) {
        return this.bindTextures.contains(Integer.valueOf(i));
    }
}
