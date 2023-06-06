package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SurfaceRenderView extends SurfaceView implements com.tencent.liteav.txcvodplayer.a {
    private c a;
    private b b;

    @Override // com.tencent.liteav.txcvodplayer.a
    public View getView() {
        return this;
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public boolean shouldWaitForResize() {
        return true;
    }

    public SurfaceRenderView(Context context) {
        super(context);
        a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.a = new c(this);
        this.b = new b(this);
        getHolder().addCallback(this.b);
        getHolder().setType(0);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.a.a(i, i2);
        getHolder().setFixedSize(i, i2);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSampleAspectRatio(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.a.b(i, i2);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoRotation(int i) {
        TXCLog.e("", "SurfaceView doesn't support rotation (" + i + ")!\n");
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setAspectRatio(int i) {
        this.a.b(i);
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        this.a.c(i, i2);
        setMeasuredDimension(this.a.a(), this.a.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements a.b {
        private SurfaceRenderView a;
        private SurfaceHolder b;

        public a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.a = surfaceRenderView;
            this.b = surfaceHolder;
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        public final void a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 16 && (iMediaPlayer instanceof ISurfaceTextureHolder)) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.b);
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @NonNull
        public final com.tencent.liteav.txcvodplayer.a a() {
            return this.a;
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void addRenderCallback(a.InterfaceC1464a interfaceC1464a) {
        this.b.a(interfaceC1464a);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void removeRenderCallback(a.InterfaceC1464a interfaceC1464a) {
        this.b.b(interfaceC1464a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b implements SurfaceHolder.Callback {
        private SurfaceHolder a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private WeakReference<SurfaceRenderView> f;
        private Map<a.InterfaceC1464a, Object> g = new ConcurrentHashMap();

        public b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f = new WeakReference<>(surfaceRenderView);
        }

        public final void a(@NonNull a.InterfaceC1464a interfaceC1464a) {
            a aVar;
            this.g.put(interfaceC1464a, interfaceC1464a);
            if (this.a != null) {
                aVar = new a(this.f.get(), this.a);
                interfaceC1464a.a(aVar, this.d, this.e);
            } else {
                aVar = null;
            }
            if (this.b) {
                if (aVar == null) {
                    aVar = new a(this.f.get(), this.a);
                }
                interfaceC1464a.a(aVar, this.c, this.d, this.e);
            }
        }

        public final void b(@NonNull a.InterfaceC1464a interfaceC1464a) {
            this.g.remove(interfaceC1464a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.a = surfaceHolder;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            a aVar = new a(this.f.get(), this.a);
            for (a.InterfaceC1464a interfaceC1464a : this.g.keySet()) {
                interfaceC1464a.a(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.a = null;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            a aVar = new a(this.f.get(), this.a);
            for (a.InterfaceC1464a interfaceC1464a : this.g.keySet()) {
                interfaceC1464a.a(aVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.a = surfaceHolder;
            this.b = true;
            this.c = i;
            this.d = i2;
            this.e = i3;
            a aVar = new a(this.f.get(), this.a);
            for (a.InterfaceC1464a interfaceC1464a : this.g.keySet()) {
                interfaceC1464a.a(aVar, i, i2, i3);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
        }
    }
}
