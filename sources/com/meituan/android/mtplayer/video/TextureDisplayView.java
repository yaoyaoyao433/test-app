package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class TextureDisplayView extends TextureView implements d {
    public static ChangeQuickRedirect a;
    private Surface b;
    private SurfaceTexture c;
    private b d;
    private com.meituan.android.mtplayer.video.b e;
    private k f;
    private e g;

    @Override // com.meituan.android.mtplayer.video.d
    public final boolean a() {
        return false;
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void b(int i, int i2) {
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final View getView() {
        return this;
    }

    public TextureDisplayView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c89905e81243f6b768ee7c5ef7e3a08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c89905e81243f6b768ee7c5ef7e3a08");
        } else {
            b();
        }
    }

    public TextureDisplayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513985f67f75fdd310486fccbd22a64b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513985f67f75fdd310486fccbd22a64b");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2333990a3ddf7e15078a7b858bc98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2333990a3ddf7e15078a7b858bc98b");
            return;
        }
        this.d = new b();
        this.e = new a();
        setSurfaceTextureListener(this.d);
        this.f = new k();
        this.g = new e();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final Bitmap getVideoBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad65a9b0b989addfb7482c3848c94730", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad65a9b0b989addfb7482c3848c94730") : getBitmap();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3394a181165f5a547f160e240d70c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3394a181165f5a547f160e240d70c4");
        } else {
            b.a(this.d, cVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12a532153846e653ee80d4abcf32738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12a532153846e653ee80d4abcf32738");
        } else {
            b.b(this.d, cVar);
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03524f97c987bc3deedc897c6688a12a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03524f97c987bc3deedc897c6688a12a");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.f.a(i, i2);
            requestLayout();
        }
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setVideoDisplayMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26f582392918dcf8864674b95998e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26f582392918dcf8864674b95998e2b");
            return;
        }
        this.f.g = i;
        this.g.b = i;
        requestLayout();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setVideoRotation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4721774d720cd6d855e6420007c6a39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4721774d720cd6d855e6420007c6a39");
            return;
        }
        this.f.d = i;
        requestLayout();
    }

    @Override // com.meituan.android.mtplayer.video.d
    public final void setDisplayOpaque(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a83ee134dc9d32f5ab9d638369cf1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a83ee134dc9d32f5ab9d638369cf1a8");
        } else {
            setOpaque(z);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be54ab0d830901ccee64814d68f94cbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be54ab0d830901ccee64814d68f94cbf");
            return;
        }
        this.f.b(i, i2);
        setMeasuredDimension(this.f.e, this.f.f);
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be38458e045cdd8eea7e8d805d61fe26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be38458e045cdd8eea7e8d805d61fe26");
            return;
        }
        Rect a2 = this.g.a(i, i2, i3, i4);
        super.layout(a2.left, a2.top, a2.right, a2.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class a implements com.meituan.android.mtplayer.video.b {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {TextureDisplayView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaff9e116582a5620fcfd513bb2548f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaff9e116582a5620fcfd513bb2548f9");
            }
        }

        @Override // com.meituan.android.mtplayer.video.b
        public final void a(com.meituan.android.mtplayer.video.player.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73db6f9d39cb11e5ca469861f7565e29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73db6f9d39cb11e5ca469861f7565e29");
            } else if (dVar == null) {
            } else {
                if (TextureDisplayView.this.b == null) {
                    TextureDisplayView textureDisplayView = TextureDisplayView.this;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    Surface surface = null;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a05fff3e31feef2c39f8593c8bb18190", RobustBitConfig.DEFAULT_VALUE)) {
                        surface = (Surface) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a05fff3e31feef2c39f8593c8bb18190");
                    } else if (TextureDisplayView.this.b == null || !TextureDisplayView.this.b.isValid()) {
                        if (TextureDisplayView.this.b != null) {
                            TextureDisplayView.this.b.release();
                            TextureDisplayView.this.b = null;
                        }
                        if (TextureDisplayView.this.c != null) {
                            TextureDisplayView.this.b = new Surface(TextureDisplayView.this.c);
                            surface = TextureDisplayView.this.b;
                        }
                    } else {
                        surface = TextureDisplayView.this.b;
                    }
                    textureDisplayView.b = surface;
                }
                dVar.setSurface(TextureDisplayView.this.b);
            }
        }

        @Override // com.meituan.android.mtplayer.video.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7361c18d611643595a370ea294a3500", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7361c18d611643595a370ea294a3500");
                return;
            }
            if (TextureDisplayView.this.b != null) {
                TextureDisplayView.this.b.release();
                TextureDisplayView.this.b = null;
            }
            if (Build.VERSION.SDK_INT < 21 || TextureDisplayView.this.c == null) {
                return;
            }
            TextureDisplayView.this.c.release();
            TextureDisplayView.this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements TextureView.SurfaceTextureListener {
        public static ChangeQuickRedirect a;
        private boolean c;
        private int d;
        private int e;
        private List<c> f;

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private b() {
            Object[] objArr = {TextureDisplayView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29bfc8575506ac7ddfcf5c2f8d42250", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29bfc8575506ac7ddfcf5c2f8d42250");
            } else {
                this.f = new ArrayList();
            }
        }

        public static /* synthetic */ void a(b bVar, c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a5ddefd0dff8cbb376e74f51a08e7cd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a5ddefd0dff8cbb376e74f51a08e7cd7");
                return;
            }
            bVar.f.add(cVar);
            if (TextureDisplayView.this.c != null) {
                cVar.a(TextureDisplayView.this.e, bVar.d, bVar.e);
            }
            if (bVar.c) {
                cVar.a(TextureDisplayView.this.e, 0, bVar.d, bVar.e);
            }
        }

        public static /* synthetic */ void b(b bVar, c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "6478df349f8a98471917ec25c4c7713f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "6478df349f8a98471917ec25c4c7713f");
            } else {
                bVar.f.remove(cVar);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa20a8558b5c8853247ab10b0b3dfef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa20a8558b5c8853247ab10b0b3dfef");
                return;
            }
            if (TextureDisplayView.this.c == null) {
                TextureDisplayView.this.c = surfaceTexture;
            } else {
                TextureDisplayView.this.setSurfaceTexture(TextureDisplayView.this.c);
            }
            this.c = false;
            this.d = 0;
            this.e = 0;
            for (c cVar : this.f) {
                cVar.a(TextureDisplayView.this.e, this.d, this.e);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e4d7c2d7679c53285824ecf4fc18fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e4d7c2d7679c53285824ecf4fc18fe");
                return;
            }
            this.c = true;
            this.d = i;
            this.e = i2;
            for (c cVar : this.f) {
                cVar.a(TextureDisplayView.this.e, 0, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Object[] objArr = {surfaceTexture};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d1378b530e7feafe930591c7fffa7c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d1378b530e7feafe930591c7fffa7c")).booleanValue();
            }
            this.c = false;
            this.d = 0;
            this.e = 0;
            if (TextureDisplayView.this.b != null) {
                TextureDisplayView.this.b.release();
                TextureDisplayView.this.b = null;
            }
            for (c cVar : this.f) {
                cVar.a(TextureDisplayView.this.e);
            }
            if (Build.VERSION.SDK_INT < 21) {
                TextureDisplayView.this.c = null;
            }
            return TextureDisplayView.this.c == null;
        }
    }
}
