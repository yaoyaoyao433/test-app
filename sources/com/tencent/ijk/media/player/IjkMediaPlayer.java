package com.tencent.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.annotations.AccessedByNative;
import com.tencent.ijk.media.player.annotations.CalledByNative;
import com.tencent.ijk.media.player.misc.IAndroidIO;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
import com.tencent.ijk.media.player.misc.IjkTrackInfo;
import com.tencent.ijk.media.player.pragma.DebugLog;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IjkMediaPlayer extends AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_AVDELAY = 10004;
    public static final int FFP_PROP_FLOAT_AVDIFF = 10005;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_LOGICAL_FILE_SIZE = 20209;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int IJK_LOG_DEBUG = 3;
    public static final int IJK_LOG_DEFAULT = 1;
    public static final int IJK_LOG_ERROR = 6;
    public static final int IJK_LOG_FATAL = 7;
    public static final int IJK_LOG_INFO = 4;
    public static final int IJK_LOG_SILENT = 8;
    public static final int IJK_LOG_UNKNOWN = 0;
    public static final int IJK_LOG_VERBOSE = 2;
    public static final int IJK_LOG_WARN = 5;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_HEVC_VIDEO_DECODER_ERROR = 211;
    private static final int MEDIA_HLS_KEY_ERROR = 210;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_VIDEO_DECODER_ERROR = 212;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    private static final String TAG = "com.tencent.ijk.media.player.IjkMediaPlayer";
    private int mBitrateIndex;
    private String mDataSource;
    private EventHandler mEventHandler;
    @AccessedByNative
    private int mListenerContext;
    @AccessedByNative
    private long mNativeAndroidIO;
    @AccessedByNative
    private long mNativeMediaDataSource;
    @AccessedByNative
    private long mNativeMediaPlayer;
    @AccessedByNative
    private int mNativeSurfaceTexture;
    private OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: com.tencent.ijk.media.player.IjkMediaPlayer.1
        @Override // com.tencent.ijk.media.player.IjkLibLoader
        public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            System.loadLibrary(str);
        }
    };
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnNativeInvokeListener {
        public static final String ARG_ERROR = "error";
        public static final String ARG_FAMILIY = "family";
        public static final String ARG_FD = "fd";
        public static final String ARG_HTTP_CODE = "http_code";
        public static final String ARG_IP = "ip";
        public static final String ARG_OFFSET = "offset";
        public static final String ARG_PORT = "port";
        public static final String ARG_RETRY_COUNTER = "retry_counter";
        public static final String ARG_SEGMENT_INDEX = "segment_index";
        public static final String ARG_URL = "url";
        public static final int CTRL_DID_DNS_RESOLVE = 131106;
        public static final int CTRL_DID_TCP_OPEN = 131074;
        public static final int CTRL_WILL_CONCAT_RESOLVE_SEGMENT = 131079;
        public static final int CTRL_WILL_DNS_RESOLVE = 131105;
        public static final int CTRL_WILL_HTTP_OPEN = 131075;
        public static final int CTRL_WILL_LIVE_OPEN = 131077;
        public static final int CTRL_WILL_TCP_OPEN = 131073;
        public static final int EVENT_DID_HTTP_OPEN = 2;
        public static final int EVENT_DID_HTTP_SEEK = 4;
        public static final int EVENT_WILL_HTTP_OPEN = 1;
        public static final int EVENT_WILL_HTTP_SEEK = 3;

        boolean onNativeInvoke(int i, Bundle bundle);
    }

    private native String _getAudioCodecInfo();

    private static native String _getColorFormatName(int i);

    private native int _getLoopCount();

    private native Bundle _getMediaMeta();

    private native float _getPropertyFloat(int i, float f);

    private native long _getPropertyLong(int i, long j);

    private native String _getVideoCodecInfo();

    private native void _injectCacheNode(int i, long j, long j2, long j3, long j4);

    private native void _pause() throws IllegalStateException;

    /* JADX INFO: Access modifiers changed from: private */
    public native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setAudioVolume(int i);

    private native void _setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSourceFd(int i) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setFrameAtTime(String str, long j, long j2, int i, int i2) throws IllegalArgumentException, IllegalStateException;

    private native void _setLoopCount(int i);

    private native void _setOption(int i, String str, long j);

    private native void _setOption(int i, String str, String str2);

    private native void _setPropertyFloat(int i, float f);

    private native void _setPropertyLong(int i, long j);

    private native void _setStreamSelected(int i, boolean z);

    private native void _setVideoSurface(Surface surface);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    public final native void _prepareAsync() throws IllegalStateException;

    public final native void _set_bitrate_index(int i);

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native int getAudioSessionId();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native long getCurrentPosition();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native long getDuration();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final boolean isPlayable() {
        return true;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native boolean isPlaying();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native void seekTo(long j) throws IllegalStateException;

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setAudioStreamType(int i) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setKeepInBackground(boolean z) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setLogEnabled(boolean z) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final native void setVolume(float f, float f2);

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                ijkLibLoader.loadLibrary("txffmpeg");
                ijkLibLoader.loadLibrary("txsdl");
                ijkLibLoader.loadLibrary("txplayer");
                mIsLibLoaded = true;
            }
        }
    }

    private static void initNativeOnce() {
        synchronized (IjkMediaPlayer.class) {
            if (!mIsNativeInitialized) {
                native_init();
                mIsNativeInitialized = true;
            }
        }
    }

    public IjkMediaPlayer() {
        this(sLocalLibLoader);
    }

    public IjkMediaPlayer(IjkLibLoader ijkLibLoader) {
        this.mWakeLock = null;
        initPlayer(ijkLibLoader);
    }

    private void initPlayer(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        initNativeOnce();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(this, myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        native_setup(new WeakReference(this));
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        _setVideoSurface(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        updateSurfaceScreenOn();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
        this.mSurface = surface;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final Surface getSurface() {
        return this.mSurface;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        setDataSource(context, uri, (Map<String, String>) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        setDataSource(r8.toString(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        return;
     */
    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDataSource(android.content.Context r7, android.net.Uri r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            r6 = this;
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L14
            java.lang.String r7 = r8.getPath()
            r6.setDataSource(r7)
            return
        L14:
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "settings"
            java.lang.String r1 = r8.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            int r8 = android.media.RingtoneManager.getDefaultType(r8)
            android.net.Uri r8 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r7, r8)
            if (r8 == 0) goto L33
            goto L3b
        L33:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Failed to resolve default ringtone"
            r7.<init>(r8)
            throw r7
        L3b:
            r0 = 0
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L80 java.lang.SecurityException -> L84
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r7 = r7.openAssetFileDescriptor(r8, r1)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L80 java.lang.SecurityException -> L84
            if (r7 != 0) goto L4e
            if (r7 == 0) goto L4d
            r7.close()
        L4d:
            return
        L4e:
            long r0 = r7.getDeclaredLength()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L60
            java.io.FileDescriptor r0 = r7.getFileDescriptor()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            r6.setDataSource(r0)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            goto L70
        L60:
            java.io.FileDescriptor r1 = r7.getFileDescriptor()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            long r2 = r7.getStartOffset()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            long r4 = r7.getDeclaredLength()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
            r0 = r6
            r0.setDataSource(r1, r2, r4)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L81 java.lang.SecurityException -> L85
        L70:
            if (r7 == 0) goto L75
            r7.close()
        L75:
            return
        L76:
            r8 = move-exception
            goto L7a
        L78:
            r8 = move-exception
            r7 = r0
        L7a:
            if (r7 == 0) goto L7f
            r7.close()
        L7f:
            throw r8
        L80:
            r7 = r0
        L81:
            if (r7 == 0) goto L8a
            goto L87
        L84:
            r7 = r0
        L85:
            if (r7 == 0) goto L8a
        L87:
            r7.close()
        L8a:
            java.lang.String r7 = r8.toString()
            r6.setDataSource(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ijk.media.player.IjkMediaPlayer.setDataSource(android.content.Context, android.net.Uri, java.util.Map):void");
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mDataSource = str;
        _setDataSource(str, null, null);
    }

    public final void setDataSource(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(CommonConstant.Symbol.COLON);
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getValue());
                }
                sb.append(StringUtil.CRLF_STRING);
                setOption(1, "headers", sb.toString());
                setOption(1, "protocol_whitelist", "async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data,ijkhttpcache,ijklongurl");
            }
        }
        setDataSource(str);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(13)
    public final void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
        if (Build.VERSION.SDK_INT < 12) {
            try {
                Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                _setDataSourceFd(declaredField.getInt(fileDescriptor));
                return;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            _setDataSourceFd(dup.getFd());
        } finally {
            dup.close();
        }
    }

    private void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException, IllegalArgumentException, IllegalStateException {
        setDataSource(fileDescriptor);
    }

    @Override // com.tencent.ijk.media.player.AbstractMediaPlayer, com.tencent.ijk.media.player.IMediaPlayer
    public final void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setDataSource(iMediaDataSource);
    }

    public final void setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setAndroidIOCallback(iAndroidIO);
    }

    public final void injectCacheNode(int i, long j, long j2, long j3, long j4) {
        _injectCacheNode(i, j, j2, j3, j4);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final String getDataSource() {
        return this.mDataSource;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void prepareAsync() throws IllegalStateException {
        _prepareAsync();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void start() throws IllegalStateException {
        stayAwake(true);
        _start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void stop() throws IllegalStateException {
        stayAwake(false);
        _stop();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void pause() throws IllegalStateException {
        stayAwake(false);
        _pause();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @SuppressLint({"Wakelock"})
    public final void setWakeMode(Context context, int i) {
        boolean z;
        if (this.mWakeLock != null) {
            if (this.mWakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        this.mWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, IjkMediaPlayer.class.getName());
        this.mWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Wakelock"})
    public void stayAwake(boolean z) {
        if (this.mWakeLock != null) {
            if (z && !this.mWakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.setKeepScreenOn(this.mScreenOnWhilePlaying && this.mStayAwake);
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final IjkTrackInfo[] getTrackInfo() {
        IjkMediaMeta parse;
        Bundle mediaMeta = getMediaMeta();
        if (mediaMeta == null || (parse = IjkMediaMeta.parse(mediaMeta)) == null || parse.mStreams == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IjkMediaMeta.IjkStreamMeta> it = parse.mStreams.iterator();
        while (it.hasNext()) {
            IjkMediaMeta.IjkStreamMeta next = it.next();
            IjkTrackInfo ijkTrackInfo = new IjkTrackInfo(next);
            if (next.mType.equalsIgnoreCase("video")) {
                ijkTrackInfo.setTrackType(1);
            } else if (next.mType.equalsIgnoreCase("audio")) {
                ijkTrackInfo.setTrackType(2);
            } else if (next.mType.equalsIgnoreCase("timedtext")) {
                ijkTrackInfo.setTrackType(3);
            }
            arrayList.add(ijkTrackInfo);
        }
        return (IjkTrackInfo[]) arrayList.toArray(new IjkTrackInfo[arrayList.size()]);
    }

    public final int getSelectedTrack(int i) {
        switch (i) {
            case 1:
                return (int) _getPropertyLong(FFP_PROP_INT64_SELECTED_VIDEO_STREAM, -1L);
            case 2:
                return (int) _getPropertyLong(FFP_PROP_INT64_SELECTED_AUDIO_STREAM, -1L);
            case 3:
                return (int) _getPropertyLong(FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM, -1L);
            default:
                return -1;
        }
    }

    public final void selectTrack(int i) {
        _setStreamSelected(i, true);
    }

    public final void deselectTrack(int i) {
        _setStreamSelected(i, false);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final int getVideoWidth() {
        return this.mVideoWidth;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final int getVideoHeight() {
        return this.mVideoHeight;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        resetListeners();
        new Thread(new Runnable() { // from class: com.tencent.ijk.media.player.IjkMediaPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                IjkMediaPlayer.this._release();
            }
        }).start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void reset() {
        stayAwake(false);
        _reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setLooping(boolean z) {
        int i = !z ? 1 : 0;
        setOption(4, "loop", i);
        _setLoopCount(i);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final boolean isLooping() {
        return _getLoopCount() != 1;
    }

    public final void setSpeed(float f) {
        _setPropertyFloat(10003, f);
    }

    public final float getSpeed() {
        return _getPropertyFloat(10003, 0.0f);
    }

    public final int getVideoDecoder() {
        return (int) _getPropertyLong(20003, 0L);
    }

    public final float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat(10002, 0.0f);
    }

    public final float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat(10001, 0.0f);
    }

    public final long getVideoCachedDuration() {
        return _getPropertyLong(20005, 0L);
    }

    public final long getAudioCachedDuration() {
        return _getPropertyLong(20006, 0L);
    }

    public final long getVideoCachedBytes() {
        return _getPropertyLong(20007, 0L);
    }

    public final long getAudioCachedBytes() {
        return _getPropertyLong(20008, 0L);
    }

    public final long getVideoCachedPackets() {
        return _getPropertyLong(20009, 0L);
    }

    public final long getAudioCachedPackets() {
        return _getPropertyLong(20010, 0L);
    }

    public final long getAsyncStatisticBufBackwards() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS, 0L);
    }

    public final long getAsyncStatisticBufForwards() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS, 0L);
    }

    public final long getAsyncStatisticBufCapacity() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY, 0L);
    }

    public final long getTrafficStatisticByteCount() {
        return _getPropertyLong(FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT, 0L);
    }

    public final long getCacheStatisticPhysicalPos() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS, 0L);
    }

    public final long getCacheStatisticFileForwards() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS, 0L);
    }

    public final long getCacheStatisticFilePos() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS, 0L);
    }

    public final long getCacheStatisticCountBytes() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES, 0L);
    }

    public final long getFileSize() {
        return _getPropertyLong(FFP_PROP_INT64_LOGICAL_FILE_SIZE, 0L);
    }

    public final long getBitRate() {
        return _getPropertyLong(20100, 0L);
    }

    public final float getAVDelay() {
        return _getPropertyFloat(10004, 0.0f);
    }

    public final float getAVDiff() {
        return _getPropertyFloat(10005, 0.0f);
    }

    public final long getTcpSpeed() {
        return _getPropertyLong(20200, 0L);
    }

    public final long getSeekLoadDuration() {
        return _getPropertyLong(FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION, 0L);
    }

    public final float getDropFrameRate() {
        return _getPropertyFloat(10007, 0.0f);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setRate(float f) {
        setSpeed(f);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final float getRate() {
        return getSpeed();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setAudioVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        _setAudioVolume(i);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final MediaInfo getMediaInfo() {
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        String _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            String[] split = _getVideoCodecInfo.split(CommonConstant.Symbol.COMMA);
            if (split.length >= 2) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = split[1];
            } else if (split.length > 0) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        String _getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getAudioCodecInfo)) {
            String[] split2 = _getAudioCodecInfo.split(CommonConstant.Symbol.COMMA);
            if (split2.length >= 2) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = split2[1];
            } else if (split2.length > 0) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = IjkMediaMeta.parse(_getMediaMeta());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mediaInfo;
    }

    public final void setOption(int i, String str, String str2) {
        _setOption(i, str, str2);
    }

    public final void setOption(int i, String str, long j) {
        _setOption(i, str, j);
    }

    public final Bundle getMediaMeta() {
        return _getMediaMeta();
    }

    public static String getColorFormatName(int i) {
        return _getColorFormatName(i);
    }

    protected final void finalize() throws Throwable {
        super.finalize();
        native_finalize();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class EventHandler extends Handler {
        private final WeakReference<IjkMediaPlayer> mWeakPlayer;

        public EventHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(ijkMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkMediaPlayer ijkMediaPlayer = this.mWeakPlayer.get();
            if (ijkMediaPlayer != null) {
                if (ijkMediaPlayer.mNativeMediaPlayer != 0) {
                    int i = message.what;
                    if (i == 200) {
                        if (message.arg1 == 3) {
                            DebugLog.i(IjkMediaPlayer.TAG, "Info: MEDIA_INFO_VIDEO_RENDERING_START\n");
                        }
                        ijkMediaPlayer.notifyOnInfo(message.arg1, message.arg2);
                        return;
                    } else if (i == 10001) {
                        ijkMediaPlayer.mVideoSarNum = message.arg1;
                        ijkMediaPlayer.mVideoSarDen = message.arg2;
                        ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                        return;
                    } else {
                        switch (i) {
                            case 0:
                                return;
                            case 1:
                                ijkMediaPlayer.notifyOnPrepared();
                                return;
                            case 2:
                                ijkMediaPlayer.stayAwake(false);
                                ijkMediaPlayer.notifyOnCompletion();
                                return;
                            case 3:
                                long j = message.arg1;
                                if (j < 0) {
                                    j = 0;
                                }
                                long duration = ijkMediaPlayer.getDuration();
                                long j2 = duration > 0 ? (j * 100) / duration : 0L;
                                if (j2 >= 100) {
                                    j2 = 100;
                                }
                                ijkMediaPlayer.notifyOnBufferingUpdate((int) j2);
                                return;
                            case 4:
                                ijkMediaPlayer.notifyOnSeekComplete();
                                return;
                            case 5:
                                ijkMediaPlayer.mVideoWidth = message.arg1;
                                ijkMediaPlayer.mVideoHeight = message.arg2;
                                ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                                return;
                            default:
                                switch (i) {
                                    case 99:
                                        if (message.obj == null) {
                                            ijkMediaPlayer.notifyOnTimedText(null);
                                            return;
                                        } else {
                                            ijkMediaPlayer.notifyOnTimedText(new IjkTimedText(new Rect(0, 0, 1, 1), (String) message.obj));
                                            return;
                                        }
                                    case 100:
                                        DebugLog.e(IjkMediaPlayer.TAG, "Error (" + message.arg1 + CommonConstant.Symbol.COMMA + message.arg2 + CommonConstant.Symbol.BRACKET_RIGHT);
                                        if (!ijkMediaPlayer.notifyOnError(message.arg1, message.arg2)) {
                                            ijkMediaPlayer.notifyOnCompletion();
                                        }
                                        ijkMediaPlayer.stayAwake(false);
                                        return;
                                    default:
                                        switch (i) {
                                            case 210:
                                                ijkMediaPlayer.notifyHLSKeyError();
                                                return;
                                            case 211:
                                                ijkMediaPlayer.notifyHevcVideoDecoderError();
                                                return;
                                            case 212:
                                                ijkMediaPlayer.notifyVideoDecoderError();
                                                return;
                                            default:
                                                DebugLog.e(IjkMediaPlayer.TAG, "Unknown message type " + message.what);
                                                return;
                                        }
                                }
                        }
                    }
                }
            }
            DebugLog.w(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events");
        }
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        if (i == 200 && i2 == 2) {
            ijkMediaPlayer.start();
        }
        if (ijkMediaPlayer.mEventHandler != null) {
            ijkMediaPlayer.mEventHandler.sendMessage(ijkMediaPlayer.mEventHandler.obtainMessage(i, i2, i3, obj2));
        }
    }

    public final void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public final void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i, Bundle bundle) {
        OnControlMessageListener onControlMessageListener;
        if (obj == null || !(obj instanceof WeakReference)) {
            throw new IllegalStateException("<null weakThiz>.onNativeInvoke()");
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get();
        if (ijkMediaPlayer == null) {
            throw new IllegalStateException("<null weakPlayer>.onNativeInvoke()");
        }
        OnNativeInvokeListener onNativeInvokeListener = ijkMediaPlayer.mOnNativeInvokeListener;
        if (onNativeInvokeListener == null || !onNativeInvokeListener.onNativeInvoke(i, bundle)) {
            if (i == 131079 && (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) != null) {
                int i2 = bundle.getInt(OnNativeInvokeListener.ARG_SEGMENT_INDEX, -1);
                if (i2 < 0) {
                    throw new InvalidParameterException("onNativeInvoke(invalid segment index)");
                }
                String onControlResolveSegmentUrl = onControlMessageListener.onControlResolveSegmentUrl(i2);
                if (onControlResolveSegmentUrl == null) {
                    throw new RuntimeException(new IOException("onNativeInvoke() = <NULL newUrl>"));
                }
                bundle.putString("url", onControlResolveSegmentUrl);
                return true;
            }
            return false;
        }
        return true;
    }

    public final void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    @Override // com.tencent.ijk.media.player.AbstractMediaPlayer
    public final void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return null;
        }
        OnMediaCodecSelectListener onMediaCodecSelectListener = ijkMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(ijkMediaPlayer, str, i, i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static final DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener
        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
            String[] supportedTypes;
            IjkMediaCodecInfo ijkMediaCodecInfo;
            if (Build.VERSION.SDK_INT >= 16 && !TextUtils.isEmpty(str)) {
                String unused = IjkMediaPlayer.TAG;
                int i3 = 2;
                String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i), Integer.valueOf(i2));
                ArrayList arrayList = new ArrayList();
                int codecCount = MediaCodecList.getCodecCount();
                int i4 = 0;
                while (i4 < codecCount) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
                    String unused2 = IjkMediaPlayer.TAG;
                    String.format(Locale.US, "  found codec: %s", codecInfoAt.getName());
                    if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        int length = supportedTypes.length;
                        int i5 = 0;
                        while (i5 < length) {
                            String str2 = supportedTypes[i5];
                            if (!TextUtils.isEmpty(str2)) {
                                String unused3 = IjkMediaPlayer.TAG;
                                String.format(Locale.US, "    mime: %s", str2);
                                if (str2.equalsIgnoreCase(str) && (ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str)) != null) {
                                    arrayList.add(ijkMediaCodecInfo);
                                    String unused4 = IjkMediaPlayer.TAG;
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = codecInfoAt.getName();
                                    objArr[1] = Integer.valueOf(ijkMediaCodecInfo.mRank);
                                    String.format(locale, "candidate codec: %s rank=%d", objArr);
                                    ijkMediaCodecInfo.dumpProfileLevels(str);
                                }
                            }
                            i5++;
                            i3 = 2;
                        }
                    }
                    i4++;
                    i3 = 2;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                IjkMediaCodecInfo ijkMediaCodecInfo2 = (IjkMediaCodecInfo) arrayList.get(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IjkMediaCodecInfo ijkMediaCodecInfo3 = (IjkMediaCodecInfo) it.next();
                    if (ijkMediaCodecInfo3.mRank > ijkMediaCodecInfo2.mRank) {
                        ijkMediaCodecInfo2 = ijkMediaCodecInfo3;
                    }
                }
                if (ijkMediaCodecInfo2.mRank < 600) {
                    String unused5 = IjkMediaPlayer.TAG;
                    String.format(Locale.US, "unaccetable codec: %s", ijkMediaCodecInfo2.mCodecInfo.getName());
                    return null;
                }
                String unused6 = IjkMediaPlayer.TAG;
                String.format(Locale.US, "selected codec: %s rank=%d", ijkMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(ijkMediaCodecInfo2.mRank));
                return ijkMediaCodecInfo2.mCodecInfo.getName();
            }
            return null;
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final int getBitrateIndex() {
        return this.mBitrateIndex;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final void setBitrateIndex(int i) {
        this.mBitrateIndex = i;
        _set_bitrate_index(i);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public final ArrayList<IjkBitrateItem> getSupportedBitrates() {
        return getMediaInfo().mMeta.mBitrateItems;
    }
}
