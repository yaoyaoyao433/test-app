package com.sankuai.meituan.animplayer;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.animplayer.j;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, j {
    public static ChangeQuickRedirect a;
    private final MediaPlayer b;
    private j.a c;
    private j.d d;
    private j.b e;
    private j.c f;

    @Override // com.sankuai.meituan.animplayer.j
    public final String g() {
        return "default";
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8bac535613179197142f764cafa68e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8bac535613179197142f764cafa68e");
            return;
        }
        this.b = new MediaPlayer();
        this.b.setOnCompletionListener(this);
        this.b.setOnErrorListener(this);
        this.b.setOnPreparedListener(this);
        this.b.setOnInfoListener(this);
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(j.a aVar) {
        this.c = aVar;
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(j.d dVar) {
        this.d = dVar;
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(j.b bVar) {
        this.e = bVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af29dd7ba42e2a572dbda61ebf015e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af29dd7ba42e2a572dbda61ebf015e0");
        } else if (this.c != null) {
            this.c.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c1720239dfc13d8361cb04b4d43c40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c1720239dfc13d8361cb04b4d43c40")).booleanValue();
        }
        if (this.e != null) {
            this.e.a(i, i2, null);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208f0faf5f2c33f939fe6b4e34a57ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208f0faf5f2c33f939fe6b4e34a57ffa");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42dd2733441ebf01c0d6b5d47975319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42dd2733441ebf01c0d6b5d47975319");
        } else {
            this.b.setSurface(surface);
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bddcedb0d0e9a5a386cf9a43b89fc114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bddcedb0d0e9a5a386cf9a43b89fc114");
        } else {
            this.b.setDataSource(str);
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        Object[] objArr = {assetFileDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0439f53ee27b371104ea0f91838088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0439f53ee27b371104ea0f91838088");
        } else if (assetFileDescriptor.getDeclaredLength() < 0) {
            this.b.setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            this.b.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5636d15a8e8674ced5cbd85647173380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5636d15a8e8674ced5cbd85647173380");
        } else {
            this.b.prepareAsync();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(long j) throws IllegalStateException {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "212557dbe6762ba76e891b8dce166fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "212557dbe6762ba76e891b8dce166fbb");
        } else {
            this.b.seekTo(0);
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bf8934c572815894f87a1847f86a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bf8934c572815894f87a1847f86a80");
        } else {
            this.b.start();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6da03a82406e6bc9cf759bedbc57814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6da03a82406e6bc9cf759bedbc57814");
        } else {
            this.b.pause();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e19d9f7db3ee03e16016fd7f4da79b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e19d9f7db3ee03e16016fd7f4da79b");
        } else {
            this.b.stop();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e16e09261f8aec18772fa5bf4d2a29d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e16e09261f8aec18772fa5bf4d2a29d");
        } else {
            this.b.reset();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "875ce993213e043da2d4f02e0af5875a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "875ce993213e043da2d4f02e0af5875a");
        } else {
            this.b.release();
        }
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c90b91ded49834b99f9c3fdd34a0bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c90b91ded49834b99f9c3fdd34a0bd")).booleanValue() : this.b.isPlaying();
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(j.c cVar) {
        this.f = cVar;
    }

    @Override // com.sankuai.meituan.animplayer.j
    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b149b0d6470e415ab7554884c0ee0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b149b0d6470e415ab7554884c0ee0fd");
        } else {
            this.b.setVolume(f, f2);
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9286ef24dbe4f705dc8a227e1bd4f398", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9286ef24dbe4f705dc8a227e1bd4f398")).booleanValue();
        }
        if (this.f != null) {
            return this.f.a(i, i2);
        }
        return false;
    }
}
