package com.meituan.android.mtplayer.video.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.mtplayer.video.player.a {
    public static ChangeQuickRedirect a;
    private final MediaPlayer b;
    private final a c;

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getPlayerType() {
        return 0;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c5e9d566fe549c4d9e8306443db9f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c5e9d566fe549c4d9e8306443db9f1");
            return;
        }
        this.b = new MediaPlayer();
        this.b.setAudioStreamType(3);
        this.c = new a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "465151093100bdf7103a6af192af4c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "465151093100bdf7103a6af192af4c59");
            return;
        }
        this.b.setOnPreparedListener(this.c);
        this.b.setOnCompletionListener(this.c);
        this.b.setOnBufferingUpdateListener(this.c);
        this.b.setOnSeekCompleteListener(this.c);
        this.b.setOnVideoSizeChangedListener(this.c);
        this.b.setOnErrorListener(this.c);
        this.b.setOnInfoListener(this.c);
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71098fdf0108c4f276fa6d6c5e2fe4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71098fdf0108c4f276fa6d6c5e2fe4bb");
        } else {
            this.b.setDisplay(surfaceHolder);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setSurface(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6718305d43a7599e5427801972a39cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6718305d43a7599e5427801972a39cc");
        } else {
            this.b.setSurface(surface);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3f36a80541846fc1b7c8112c0ee740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3f36a80541846fc1b7c8112c0ee740");
        } else {
            this.b.setDataSource(str);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Object[] objArr = {context, uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b66f88ef8ba68ece9870fe465f80b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b66f88ef8ba68ece9870fe465f80b7");
        } else {
            this.b.setDataSource(context, uri, map);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException {
        Object[] objArr = {fileDescriptor, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3263c6cefdd063c77f9a45b1b6d2ec8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3263c6cefdd063c77f9a45b1b6d2ec8c");
        } else {
            this.b.setDataSource(fileDescriptor, j, j2);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void prepareAsync() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffc800e9a5004f7dac5f5ec6f55ef55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffc800e9a5004f7dac5f5ec6f55ef55");
        } else {
            this.b.prepareAsync();
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void start() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342338f9273be210cdbc93935b3dd180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342338f9273be210cdbc93935b3dd180");
        } else {
            this.b.start();
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void pause() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c2c942d9bcf742e9e84d02749774ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c2c942d9bcf742e9e84d02749774ea");
        } else {
            this.b.pause();
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setScreenOnWhilePlaying(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a62ad768ab00c41aa2d2b64bd81a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a62ad768ab00c41aa2d2b64bd81a08");
        } else {
            this.b.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getVideoWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2daf3efa7e76b3517dbb5acc8ff9fc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2daf3efa7e76b3517dbb5acc8ff9fc")).intValue() : this.b.getVideoWidth();
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getVideoHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd692998f9348bf44ab06c9805604215", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd692998f9348bf44ab06c9805604215")).intValue() : this.b.getVideoHeight();
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final boolean isPlaying() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae125705709b28813fad17c48840fabf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae125705709b28813fad17c48840fabf")).booleanValue();
        }
        try {
            return this.b.isPlaying();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void seekTo(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77efd536293ee1c7663a03c93a518ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77efd536293ee1c7663a03c93a518ce5");
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.b.seekTo(i, 3);
        } else {
            this.b.seekTo(i);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final long getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d4707c617ac7d25828f49bac6caca9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d4707c617ac7d25828f49bac6caca9")).longValue();
        }
        try {
            return this.b.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final long getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2b890a2c1c9dd8f469cde0b2e21ee0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2b890a2c1c9dd8f469cde0b2e21ee0")).longValue();
        }
        try {
            return this.b.getDuration();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4317a52b86701a3cefe5a00f060ce22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4317a52b86701a3cefe5a00f060ce22");
            return;
        }
        this.b.release();
        releaseListeners();
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cd531e1161d63c57dc49bec7780470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cd531e1161d63c57dc49bec7780470");
        } else {
            this.b.reset();
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setVolume(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac76f9f72ed9ea333e7bd69cc5284845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac76f9f72ed9ea333e7bd69cc5284845");
        } else {
            this.b.setVolume(f, f2);
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setPlayerSpeed(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e169226c658d36b112fa1ae25cc5bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e169226c658d36b112fa1ae25cc5bf");
        } else if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            try {
                this.b.setPlaybackParams(playbackParams);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setAudioStreamType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda061d7e58c1ca494ebb61add3e6382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda061d7e58c1ca494ebb61add3e6382");
        } else {
            this.b.setAudioStreamType(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<b> b;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728217f0efcac699187a41ad05daca2b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728217f0efcac699187a41ad05daca2b");
            } else {
                this.b = new WeakReference<>(bVar);
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100b0d4e781db7a1d46a8695068936a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100b0d4e781db7a1d46a8695068936a0");
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            bVar.notifyOnPrepared();
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98055e0493d91d1d5807b6701335d00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98055e0493d91d1d5807b6701335d00");
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            bVar.notifyOnCompletion();
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dce88337dc302eaeb80e1a0d0a49fde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dce88337dc302eaeb80e1a0d0a49fde");
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            bVar.notifyOnBufferingUpdate(i);
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505b08d21584745177dc7e2bd20631c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505b08d21584745177dc7e2bd20631c6");
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            bVar.notifyOnSeekComplete();
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dfd085f676a310a9ecb531e54b395e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dfd085f676a310a9ecb531e54b395e");
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            bVar.notifyOnVideoSizeChanged(i, i2, 1, 1);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df80989bf6ae0bb44683704c303fc35", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df80989bf6ae0bb44683704c303fc35")).booleanValue();
            }
            b bVar = this.b.get();
            return bVar != null && bVar.notifyOnError(i, i2);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0735f3d88b14e2940ffda884d10674d9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0735f3d88b14e2940ffda884d10674d9")).booleanValue();
            }
            b bVar = this.b.get();
            return bVar != null && bVar.notifyOnInfo(i, i2);
        }
    }
}
