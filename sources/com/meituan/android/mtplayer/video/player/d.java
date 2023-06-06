package com.meituan.android.mtplayer.video.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(d dVar, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(d dVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        boolean a(d dVar, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mtplayer.video.player.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0298d {
        boolean a(d dVar, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface e {
        void a(d dVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface f {
        void a(d dVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface g {
        void a(d dVar, int i, int i2, int i3, int i4);
    }

    long getCurrentPosition();

    long getDuration();

    int getPlayerType();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(int i) throws IllegalStateException;

    void setAudioStreamType(int i);

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException;

    void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDisplay(SurfaceHolder surfaceHolder);

    void setOnBufferingUpdateListener(a aVar);

    void setOnCompletionListener(b bVar);

    void setOnErrorListener(c cVar);

    void setOnInfoListener(InterfaceC0298d interfaceC0298d);

    void setOnPreparedListener(e eVar);

    void setOnSeekCompleteListener(f fVar);

    void setOnVideoSizeChangedListener(g gVar);

    void setOption(int i, String str, long j);

    void setPlayerSpeed(float f2);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void setVolume(float f2, float f3);

    void start() throws IllegalStateException;
}
