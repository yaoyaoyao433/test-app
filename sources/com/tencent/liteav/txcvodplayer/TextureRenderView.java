package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.ijk.media.player.ISurfaceTextureHost;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@TargetApi(14)
/* loaded from: classes6.dex */
public class TextureRenderView extends TextureView implements com.tencent.liteav.txcvodplayer.a {
    private static final String TAG = "TextureRenderView";
    private c mMeasureHelper;
    private b mSurfaceCallback;

    @Override // com.tencent.liteav.txcvodplayer.a
    public View getView() {
        return this;
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public boolean shouldWaitForResize() {
        return false;
    }

    public TextureRenderView(Context context) {
        super(context);
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @TargetApi(21)
    public TextureRenderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(Context context) {
        this.mMeasureHelper = new c(this);
        this.mSurfaceCallback = new b(this);
        setSurfaceTextureListener(this.mSurfaceCallback);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            this.mSurfaceCallback.a();
            super.onDetachedFromWindow();
            this.mSurfaceCallback.b();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mSurfaceCallback.c();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.mMeasureHelper.a(i, i2);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSampleAspectRatio(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.mMeasureHelper.b(i, i2);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoRotation(int i) {
        this.mMeasureHelper.a(i);
        setRotation(i);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setAspectRatio(int i) {
        this.mMeasureHelper.b(i);
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.mMeasureHelper.c(i, i2);
        setMeasuredDimension(this.mMeasureHelper.a(), this.mMeasureHelper.b());
    }

    public a.b getSurfaceHolder() {
        return new a(this, this.mSurfaceCallback.a, this.mSurfaceCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements a.b {
        private TextureRenderView a;
        private SurfaceTexture b;
        private ISurfaceTextureHost c;
        private Surface d;

        public a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.a = textureRenderView;
            this.b = surfaceTexture;
            this.c = iSurfaceTextureHost;
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @TargetApi(16)
        public final void a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16 && (iMediaPlayer instanceof ISurfaceTextureHolder)) {
                ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
                this.a.mSurfaceCallback.a(false);
                if (this.a.getSurfaceTexture() != null) {
                    this.b = this.a.getSurfaceTexture();
                }
                try {
                    SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        iSurfaceTextureHolder.setSurfaceTextureHost(this.a.mSurfaceCallback);
                        this.a.setSurfaceTexture(surfaceTexture);
                        this.a.mSurfaceCallback.a(surfaceTexture);
                    } else {
                        if (this.d != null) {
                            iMediaPlayer.setSurface(this.d);
                        }
                        iSurfaceTextureHolder.setSurfaceTexture(this.b);
                        iSurfaceTextureHolder.setSurfaceTextureHost(this.a.mSurfaceCallback);
                    }
                    this.d = iMediaPlayer.getSurface();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.d = b();
            iMediaPlayer.setSurface(this.d);
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @NonNull
        public final com.tencent.liteav.txcvodplayer.a a() {
            return this.a;
        }

        @Nullable
        public final Surface b() {
            if (this.b == null) {
                return null;
            }
            if (this.d == null) {
                this.d = new Surface(this.b);
            }
            return this.d;
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void addRenderCallback(a.InterfaceC1464a interfaceC1464a) {
        this.mSurfaceCallback.a(interfaceC1464a);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void removeRenderCallback(a.InterfaceC1464a interfaceC1464a) {
        this.mSurfaceCallback.b(interfaceC1464a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {
        private SurfaceTexture a;
        private boolean b;
        private int c;
        private int d;
        private WeakReference<TextureRenderView> h;
        private boolean e = true;
        private boolean f = false;
        private boolean g = false;
        private Map<a.InterfaceC1464a, Object> i = new ConcurrentHashMap();

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public b(@NonNull TextureRenderView textureRenderView) {
            this.h = new WeakReference<>(textureRenderView);
        }

        public final void a(boolean z) {
            this.e = z;
        }

        public final void a(SurfaceTexture surfaceTexture) {
            this.a = surfaceTexture;
        }

        public final void a(@NonNull a.InterfaceC1464a interfaceC1464a) {
            a aVar;
            this.i.put(interfaceC1464a, interfaceC1464a);
            if (this.a != null) {
                aVar = new a(this.h.get(), this.a, this);
                interfaceC1464a.a(aVar, this.c, this.d);
            } else {
                aVar = null;
            }
            if (this.b) {
                if (aVar == null) {
                    aVar = new a(this.h.get(), this.a, this);
                }
                interfaceC1464a.a(aVar, 0, this.c, this.d);
            }
        }

        public final void b(@NonNull a.InterfaceC1464a interfaceC1464a) {
            this.i.remove(interfaceC1464a);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.a = surfaceTexture;
            this.b = false;
            this.c = 0;
            this.d = 0;
            a aVar = new a(this.h.get(), surfaceTexture, this);
            for (a.InterfaceC1464a interfaceC1464a : this.i.keySet()) {
                interfaceC1464a.a(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            this.a = surfaceTexture;
            this.b = true;
            this.c = i;
            this.d = i2;
            a aVar = new a(this.h.get(), surfaceTexture, this);
            for (a.InterfaceC1464a interfaceC1464a : this.i.keySet()) {
                interfaceC1464a.a(aVar, 0, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.a = surfaceTexture;
            this.b = false;
            this.c = 0;
            this.d = 0;
            a aVar = new a(this.h.get(), surfaceTexture, this);
            for (a.InterfaceC1464a interfaceC1464a : this.i.keySet()) {
                interfaceC1464a.a(aVar);
            }
            TXCLog.i(TextureRenderView.TAG, "onSurfaceTextureDestroyed: destroy: " + this.e);
            return this.e;
        }

        @Override // com.tencent.ijk.media.player.ISurfaceTextureHost
        public final void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: null");
            } else if (this.g) {
                if (surfaceTexture != this.a) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                } else if (!this.e) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                } else {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                }
            } else if (this.f) {
                if (surfaceTexture != this.a) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                } else if (!this.e) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    a(true);
                } else {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                }
            } else if (surfaceTexture != this.a) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (!this.e) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                a(true);
            } else {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: will released by TextureView");
            }
        }

        public final void a() {
            TXCLog.i(TextureRenderView.TAG, "willDetachFromWindow()");
            this.f = true;
        }

        public final void b() {
            TXCLog.i(TextureRenderView.TAG, "didDetachFromWindow()");
            this.g = true;
        }

        public final void c() {
            TXCLog.i(TextureRenderView.TAG, "onAttachFromWindow()");
            this.f = false;
            this.g = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }
}
