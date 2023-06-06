package com.tencent.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
import com.tencent.ijk.media.player.misc.ITrackInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_FIRST_VIDEO_PACKET = 10011;
    public static final int MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE = 10100;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnHLSKeyErrorListener {
        void onHLSKeyError(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnHevcVideoDecoderErrorListener {
        void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnTimedTextListener {
        void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnVideoDecoderErrorListener {
        void onVideoDecoderError(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4);
    }

    int getAudioSessionId();

    int getBitrateIndex();

    long getCurrentPosition();

    String getDataSource();

    long getDuration();

    MediaInfo getMediaInfo();

    float getRate();

    ArrayList<IjkBitrateItem> getSupportedBitrates();

    Surface getSurface();

    ITrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isLooping();

    @Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(long j) throws IllegalStateException;

    void setAudioStreamType(int i);

    void setAudioVolume(int i);

    void setBitrateIndex(int i);

    void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    @TargetApi(14)
    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(IMediaDataSource iMediaDataSource);

    void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException;

    void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDisplay(SurfaceHolder surfaceHolder);

    @Deprecated
    void setKeepInBackground(boolean z);

    @Deprecated
    void setLogEnabled(boolean z);

    void setLooping(boolean z);

    void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(OnCompletionListener onCompletionListener);

    void setOnErrorListener(OnErrorListener onErrorListener);

    void setOnHLSKeyErrorListener(OnHLSKeyErrorListener onHLSKeyErrorListener);

    void setOnHevcVideoDecoderErrorListener(OnHevcVideoDecoderErrorListener onHevcVideoDecoderErrorListener);

    void setOnInfoListener(OnInfoListener onInfoListener);

    void setOnPreparedListener(OnPreparedListener onPreparedListener);

    void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    void setOnTimedTextListener(OnTimedTextListener onTimedTextListener);

    void setOnVideoDecoderErrorListener(OnVideoDecoderErrorListener onVideoDecoderErrorListener);

    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setRate(float f);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    @Deprecated
    void setWakeMode(Context context, int i);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;
}
