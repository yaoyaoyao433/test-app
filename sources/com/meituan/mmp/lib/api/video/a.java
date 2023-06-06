package com.meituan.mmp.lib.api.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import com.meituan.mmp.lib.api.video.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    b.e b;
    b.InterfaceC0400b c;
    b.a d;
    b.g e;
    b.c f;
    b.d g;
    private final MediaPlayer h;
    private final C0399a i;
    private final Object j;
    private boolean k;
    private b.f l;
    private boolean m;
    private boolean n;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f457b54f4c5bdfb6a3ef085bfe43c0fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f457b54f4c5bdfb6a3ef085bfe43c0fa");
            return;
        }
        this.j = new Object();
        this.m = false;
        this.n = false;
        synchronized (this.j) {
            this.h = new MediaPlayer();
        }
        this.h.setAudioStreamType(3);
        this.i = new C0399a(this);
        h();
    }

    @Override // com.meituan.mmp.lib.api.video.b
    @TargetApi(14)
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3809e00976a6add254f0d1d30e309445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3809e00976a6add254f0d1d30e309445");
        } else {
            this.h.setSurface(surface);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3efcbbe44b85f845d16d24a0389705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3efcbbe44b85f845d16d24a0389705");
            return;
        }
        this.m = z;
        if (this.h == null || !this.h.isPlaying()) {
            return;
        }
        if (z) {
            this.h.setVolume(0.0f, 0.0f);
        } else {
            this.h.setVolume(0.5f, 0.5f);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    @TargetApi(14)
    public final void a(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Object[] objArr = {context, uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "009bb54f5d8c2629b334350c91b07210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "009bb54f5d8c2629b334350c91b07210");
            return;
        }
        this.h.reset();
        if (Build.VERSION.SDK_INT >= 29) {
            this.h.setDataSource(context, uri, map, null);
        } else {
            this.h.setDataSource(context, uri, map);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58c54f5807a2a5bef0d55f169782bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58c54f5807a2a5bef0d55f169782bc5");
        } else {
            this.h.prepareAsync();
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e10baebe71aeb5bb80f26064a702adab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e10baebe71aeb5bb80f26064a702adab");
            return;
        }
        this.h.start();
        if (this.m) {
            this.h.setVolume(0.0f, 0.0f);
        } else {
            this.h.setVolume(0.5f, 0.5f);
        }
        if (this.n) {
            this.h.setLooping(true);
        } else {
            this.h.setLooping(false);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void c() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d753fb46aba6218d27cece9189cbd4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d753fb46aba6218d27cece9189cbd4e");
        } else {
            this.h.pause();
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(long j) throws IllegalStateException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc51add1043ac4047bff4f779a38194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc51add1043ac4047bff4f779a38194");
        } else {
            this.h.seekTo((int) j);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5321aa9fb823d1f56bfbc11d6da595", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5321aa9fb823d1f56bfbc11d6da595")).longValue();
        }
        try {
            return this.h.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d5a321af038fa7899c0068955cc50f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d5a321af038fa7899c0068955cc50f")).longValue();
        }
        try {
            return this.h.getDuration();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a97a14df9d640a78024a853c0a2cf82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a97a14df9d640a78024a853c0a2cf82");
            return;
        }
        this.k = true;
        try {
            this.h.release();
        } catch (Exception unused) {
        }
        i();
        h();
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc40c071ef61820b8aa92db2cedccd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc40c071ef61820b8aa92db2cedccd01");
            return;
        }
        try {
            this.h.reset();
        } catch (IllegalStateException unused) {
        }
        i();
        h();
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f038c3a1205910088e805bf3cc25f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f038c3a1205910088e805bf3cc25f7");
            return;
        }
        this.n = z;
        try {
            this.h.setLooping(z);
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(int i) {
        Object[] objArr = {3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9e48994d9d8e771cf74acf7b3ca1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9e48994d9d8e771cf74acf7b3ca1b3");
        } else {
            this.h.setAudioStreamType(3);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673185231f1b789bf7e58dc59a3336ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673185231f1b789bf7e58dc59a3336ae");
            return;
        }
        this.h.setOnPreparedListener(this.i);
        this.h.setOnBufferingUpdateListener(this.i);
        this.h.setOnCompletionListener(this.i);
        this.h.setOnSeekCompleteListener(this.i);
        this.h.setOnVideoSizeChangedListener(this.i);
        this.h.setOnErrorListener(this.i);
        this.h.setOnInfoListener(this.i);
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.InterfaceC0400b interfaceC0400b) {
        this.c = interfaceC0400b;
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.a aVar) {
        this.d = aVar;
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.g gVar) {
        this.e = gVar;
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.c cVar) {
        this.f = cVar;
    }

    @Override // com.meituan.mmp.lib.api.video.b
    public final void a(b.d dVar) {
        this.g = dVar;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5adc874bd0ff16c4bcc5a76bf21bb1e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5adc874bd0ff16c4bcc5a76bf21bb1e2");
            return;
        }
        this.b = null;
        this.d = null;
        this.c = null;
        this.l = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0399a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        public static ChangeQuickRedirect a;
        public final WeakReference<a> b;

        public C0399a(a aVar) {
            Object[] objArr = {a.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f7190e51db0057ea106264171dab56", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f7190e51db0057ea106264171dab56");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            boolean z;
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb6628385bb2301a1fb52c5b15a5368", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb6628385bb2301a1fb52c5b15a5368")).booleanValue();
            }
            if (this.b.get() != null) {
                a aVar = a.this;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e60fe8530c66a5fc6d20377ae429f14b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e60fe8530c66a5fc6d20377ae429f14b")).booleanValue();
                } else {
                    z = aVar.g != null && aVar.g.a(aVar, i, i2);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            boolean z;
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7a5198f287c5fac0c06439f949032b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7a5198f287c5fac0c06439f949032b")).booleanValue();
            }
            if (this.b.get() != null) {
                a aVar = a.this;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1a97effabf74191f50221c7853948090", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1a97effabf74191f50221c7853948090")).booleanValue();
                } else {
                    z = aVar.f != null && aVar.f.a(aVar, i, i2);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c63f0534e36fa0ce122b5031ede288", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c63f0534e36fa0ce122b5031ede288");
            } else if (this.b.get() == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), 1, 1};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c5b99f7023ea521801976adeb0d8957f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c5b99f7023ea521801976adeb0d8957f");
                } else if (aVar.e != null) {
                    aVar.e.a(aVar, i, i2, 1, 1);
                }
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69dc53b9d4d1d0667005a60ab6e11059", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69dc53b9d4d1d0667005a60ab6e11059");
            } else if (this.b.get() == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8645c7d136226f5cda90c0250e7b916b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8645c7d136226f5cda90c0250e7b916b");
                }
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10143e463a84d2c44b250b7a26d05c56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10143e463a84d2c44b250b7a26d05c56");
            } else if (this.b.get() == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "77433de6dac3395a73f7c645b5a4371b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "77433de6dac3395a73f7c645b5a4371b");
                } else if (aVar.d != null) {
                    aVar.d.a(aVar, i);
                }
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e867c1829211eb894d851b3af7f4e8ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e867c1829211eb894d851b3af7f4e8ef");
            } else if (this.b.get() == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c7a3d84f0c02abbf3d7f24ada8417cbf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c7a3d84f0c02abbf3d7f24ada8417cbf");
                } else if (aVar.c != null) {
                    aVar.c.a(aVar);
                }
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a777a4ba0e8edd15c27162d6e55addc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a777a4ba0e8edd15c27162d6e55addc");
            } else if (this.b.get() == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1ac7893c684d8bde9e59c5cf66b190e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1ac7893c684d8bde9e59c5cf66b190e9");
                } else if (aVar.b != null) {
                    aVar.b.a(aVar);
                }
            }
        }
    }
}
