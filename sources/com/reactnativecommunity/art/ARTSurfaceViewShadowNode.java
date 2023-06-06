package com.reactnativecommunity.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView.SurfaceTextureListener, LifecycleEventListener {
    @Nullable
    Surface a;
    @Nullable
    private Integer b;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.b = num;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        a(false);
        uIViewOperationQueue.a(getReactTag(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.a == null || !this.a.isValid()) {
            a(this);
            return;
        }
        try {
            Canvas lockCanvas = this.a.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.b != null) {
                lockCanvas.drawColor(this.b.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.a(lockCanvas, paint, 1.0f);
                if (z) {
                    aRTVirtualNode.markUpdated();
                } else {
                    aRTVirtualNode.markUpdateSeen();
                }
            }
            if (this.a == null) {
                return;
            }
            this.a.unlockCanvasAndPost(lockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e) {
            com.facebook.common.logging.a.d("ReactNative", e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    private void a(af afVar) {
        for (int i = 0; i < afVar.getChildCount(); i++) {
            af childAt = afVar.getChildAt(i);
            childAt.markUpdateSeen();
            a(childAt);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void setThemedContext(ao aoVar) {
        super.setThemedContext(aoVar);
        if (Build.VERSION.SDK_INT > 24) {
            aoVar.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void dispose() {
        super.dispose();
        if (Build.VERSION.SDK_INT > 24) {
            getThemedContext().removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        a(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = new Surface(surfaceTexture);
        a(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.release();
        this.a = null;
        return true;
    }
}
