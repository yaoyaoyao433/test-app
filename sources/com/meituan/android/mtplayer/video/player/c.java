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
public final class c extends a {
    @Override // com.meituan.android.mtplayer.video.player.d
    public final long getCurrentPosition() {
        return 0L;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final long getDuration() {
        return 0L;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getPlayerType() {
        return 0;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getVideoHeight() {
        return 0;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final int getVideoWidth() {
        return 0;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final boolean isPlaying() {
        return false;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void pause() throws IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void prepareAsync() throws IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void release() {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void reset() {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void seekTo(int i) throws IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setAudioStreamType(int i) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setPlayerSpeed(float f) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setSurface(Surface surface) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setVolume(float f, float f2) {
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void start() throws IllegalStateException {
    }
}
