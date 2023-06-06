package com.meituan.msi.api.audio;

import android.media.MediaPlayer;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.api.audio.AudioApi;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AudioWrapper {
    public static final int MSI_MEDIA_ERROR_SYSTEM = Integer.MIN_VALUE;
    public static final short STATUS_AUDIO_BUFFERING = 1;
    public static final short STATUS_AUDIO_PLAYING = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean bAutoPlay;
    private boolean bInitialized;
    private boolean bPauseByContainerPause;
    private volatile boolean bPlaying;
    private boolean bPlayingPrepared;
    private short bufferAudioStatus;
    private long bufferLastPos;
    public float bufferd;
    public String currentSrc;
    public e eventDispatcher;
    private AudioApi.a mAudioHandler;
    public MediaPlayer mediaPlayer;
    private a playStatus;
    private float startTime;
    private String taskId;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        IDLE,
        INITIALIZED,
        PLAY_PREPARED,
        PLAYING,
        PAUSE,
        STOP,
        END,
        ERROR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bef8dc7d991b7fa4b4ee9d4b8e5d69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bef8dc7d991b7fa4b4ee9d4b8e5d69");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f73ab4a5249f82e68a88e1174f47ff30", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f73ab4a5249f82e68a88e1174f47ff30") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd162090f2e28b59d4f884915ca5c321", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd162090f2e28b59d4f884915ca5c321") : (a[]) values().clone();
        }
    }

    public AudioWrapper(MediaPlayer mediaPlayer, e eVar, String str, AudioApi.a aVar) {
        Object[] objArr = {mediaPlayer, eVar, str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3df6b7cf3790f3ce246e7b95a6c92d17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3df6b7cf3790f3ce246e7b95a6c92d17");
            return;
        }
        this.bufferd = 0.0f;
        this.bufferLastPos = 0L;
        this.bufferAudioStatus = (short) 0;
        this.bPlaying = false;
        this.bPauseByContainerPause = false;
        this.bAutoPlay = false;
        this.startTime = 0.0f;
        this.bPlayingPrepared = false;
        this.mAudioHandler = null;
        this.bInitialized = false;
        this.playStatus = a.IDLE;
        this.currentSrc = "";
        this.mediaPlayer = mediaPlayer;
        this.eventDispatcher = eVar;
        this.taskId = str;
        this.startTime = 0.0f;
        this.bAutoPlay = false;
        this.mAudioHandler = aVar;
        setListener();
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67cb150ce4396f9f4ea784b4459cee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67cb150ce4396f9f4ea784b4459cee6");
            return;
        }
        this.startTime = 0.0f;
        this.bufferAudioStatus = (short) 0;
        this.bufferd = 0.0f;
        this.bufferLastPos = 0L;
        this.bPlayingPrepared = false;
        this.playStatus = a.IDLE;
        try {
            if (this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
            this.mediaPlayer.reset();
        } catch (Exception e) {
            this.playStatus = a.ERROR;
            com.meituan.msi.log.a.a("AudioWrapper reset error: " + e.getMessage());
        }
        this.bInitialized = false;
    }

    public a getPlayStatus() {
        return this.playStatus;
    }

    public void setPlayingPrepared(boolean z) {
        this.bPlayingPrepared = z;
    }

    public void setAudioProperty(SetAudioProperty setAudioProperty) {
        Object[] objArr = {setAudioProperty};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b07d3bcc70d31d572476c41d25d77f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b07d3bcc70d31d572476c41d25d77f3");
            return;
        }
        this.bAutoPlay = setAudioProperty.autoplay;
        this.startTime = setAudioProperty.startTime;
        this.currentSrc = setAudioProperty.src;
    }

    public void setInitialized(boolean z) {
        this.bInitialized = z;
        this.playStatus = a.INITIALIZED;
    }

    public boolean isInitialized() {
        return this.bInitialized;
    }

    public GetAudioProperty getAudioProperty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d311b7357bff9ec25f9ebaa13f395f8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetAudioProperty) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d311b7357bff9ec25f9ebaa13f395f8b");
        }
        if (this.bPlayingPrepared) {
            GetAudioProperty getAudioProperty = new GetAudioProperty();
            getAudioProperty.duration = this.mediaPlayer.getDuration() / 1000.0f;
            getAudioProperty.currentTime = this.mediaPlayer.getCurrentPosition() / 1000.0f;
            getAudioProperty.paused = !this.mediaPlayer.isPlaying();
            getAudioProperty.buffered = this.bufferd;
            return getAudioProperty;
        }
        return null;
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27cf14884fb231e5ddcbb51ff8171448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27cf14884fb231e5ddcbb51ff8171448");
            return;
        }
        this.bPlaying = false;
        this.bPauseByContainerPause = false;
        this.bAutoPlay = false;
        if (this.mediaPlayer == null || !this.bInitialized) {
            return;
        }
        try {
            this.mediaPlayer.stop();
            sendEvent("InnerAudioContext.onStop", null);
            this.playStatus = a.STOP;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        this.mediaPlayer.release();
    }

    public boolean pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df6cb8aad1116ca747fb061b30cb3d17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df6cb8aad1116ca747fb061b30cb3d17")).booleanValue();
        }
        this.bPlaying = false;
        this.bPauseByContainerPause = false;
        this.bAutoPlay = false;
        if (this.mediaPlayer == null || !this.bInitialized) {
            return false;
        }
        this.mediaPlayer.pause();
        sendEvent("InnerAudioContext.onPause", null);
        this.playStatus = a.PAUSE;
        return true;
    }

    public void onContainerPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed2a55b219d76d02041bad471bf7c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed2a55b219d76d02041bad471bf7c41");
        } else if (this.bPlaying) {
            pause();
            this.bPauseByContainerPause = true;
        }
    }

    public void onContainerResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82a99ee5e72fec2075d61df319508533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82a99ee5e72fec2075d61df319508533");
        } else if (this.bPauseByContainerPause) {
            start();
        }
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bb24dd48c2be6e09787cdd1dcc92964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bb24dd48c2be6e09787cdd1dcc92964");
        } else if (this.bPlaying) {
        } else {
            this.bPlaying = true;
            this.bPauseByContainerPause = false;
            if (this.mediaPlayer == null || !this.bInitialized) {
                return;
            }
            if (this.bPlayingPrepared) {
                startInner();
                return;
            }
            try {
                this.mediaPlayer.prepare();
                this.bPlayingPrepared = true;
                this.playStatus = a.PLAY_PREPARED;
                startInner();
            } catch (Exception unused) {
                this.playStatus = a.ERROR;
                com.meituan.msi.log.a.a("prepare failed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9afb6ca750e6d0078ea8076ccbc8c832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9afb6ca750e6d0078ea8076ccbc8c832");
            return;
        }
        this.bPlaying = true;
        if (this.mediaPlayer == null || !this.bPlayingPrepared) {
            return;
        }
        try {
            this.mediaPlayer.start();
            sendEvent("InnerAudioContext.onPlay", null);
            this.playStatus = a.PLAYING;
        } catch (IllegalStateException unused) {
            this.playStatus = a.ERROR;
            sendEvent("InnerAudioContext.onError", null);
        }
    }

    public void seekTo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdc0bc2b9ed47814ce917c3a21204623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdc0bc2b9ed47814ce917c3a21204623");
        } else if (this.mediaPlayer == null || !this.bPlayingPrepared) {
        } else {
            this.mediaPlayer.seekTo(i);
            sendEvent("InnerAudioContext.onSeeking", null);
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01f6f58613aedcb260596142ba9326c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01f6f58613aedcb260596142ba9326c1");
            return;
        }
        this.bPlaying = false;
        this.bPauseByContainerPause = false;
        this.bAutoPlay = false;
        this.bPlayingPrepared = false;
        if (this.mediaPlayer == null || !this.bInitialized) {
            return;
        }
        if (this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
            sendEvent("InnerAudioContext.onPause", null);
            this.playStatus = a.PAUSE;
        }
        try {
            this.mediaPlayer.stop();
            sendEvent("InnerAudioContext.onStop", null);
            this.playStatus = a.STOP;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            this.mediaPlayer.prepare();
            this.mediaPlayer.seekTo(0);
            this.playStatus = a.PLAY_PREPARED;
            this.bPlayingPrepared = true;
        } catch (IOException e2) {
            this.playStatus = a.ERROR;
            e2.printStackTrace();
        }
        setListener();
    }

    public void setListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720bd4ddb0ff679eb7493e9611992b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720bd4ddb0ff679eb7493e9611992b56");
        } else if (this.mediaPlayer == null) {
        } else {
            this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.meituan.msi.api.audio.AudioWrapper.1
                public static ChangeQuickRedirect a;

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    Object[] objArr2 = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83daa6fd03ccfc57379e6938c7d4467a", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83daa6fd03ccfc57379e6938c7d4467a")).booleanValue();
                    }
                    AudioWrapper.this.playStatus = a.ERROR;
                    AudioWrapper.this.sendEvent("InnerAudioContext.onError", AudioWrapper.this.getErrorEvent(i2));
                    return true;
                }
            });
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.meituan.msi.api.audio.AudioWrapper.2
                public static ChangeQuickRedirect a;

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    Object[] objArr2 = {mediaPlayer};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e565cadfb1d24b27160382c5ac003ea2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e565cadfb1d24b27160382c5ac003ea2");
                        return;
                    }
                    AudioWrapper.this.bPlayingPrepared = true;
                    AudioWrapper.this.playStatus = a.PLAY_PREPARED;
                    if (AudioWrapper.this.startTime > 0.0f) {
                        AudioWrapper.this.seekTo((int) (AudioWrapper.this.startTime * 1000.0f));
                    }
                    AudioWrapper.this.sendEvent("InnerAudioContext.onCanplay", null);
                    if (AudioWrapper.this.bAutoPlay) {
                        if (AudioWrapper.this.mAudioHandler == null || AudioWrapper.this.mAudioHandler.a()) {
                            AudioWrapper.this.startInner();
                        }
                    }
                }
            });
            this.mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.meituan.msi.api.audio.AudioWrapper.3
                public static ChangeQuickRedirect a;

                @Override // android.media.MediaPlayer.OnBufferingUpdateListener
                public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                    Object[] objArr2 = {mediaPlayer, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54c71e807d87ffbbfc50c75610aeb2a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54c71e807d87ffbbfc50c75610aeb2a8");
                    } else if (!mediaPlayer.isPlaying()) {
                        AudioWrapper.this.bufferAudioStatus = (short) 0;
                    } else {
                        AudioWrapper.this.bufferd = (mediaPlayer.getDuration() * i) / 100000.0f;
                        if (AudioWrapper.this.bufferLastPos == mediaPlayer.getCurrentPosition()) {
                            if (AudioWrapper.this.bufferAudioStatus != 1) {
                                AudioWrapper.this.bufferAudioStatus = (short) 1;
                                AudioWrapper.this.sendEvent("InnerAudioContext.onWaiting", null);
                            }
                        } else if (AudioWrapper.this.bufferAudioStatus != 2) {
                            AudioWrapper.this.bufferAudioStatus = (short) 2;
                            AudioWrapper.this.sendEvent("InnerAudioContext.onPlay", null);
                        }
                        AudioWrapper.this.bufferLastPos = mediaPlayer.getCurrentPosition();
                    }
                }
            });
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.meituan.msi.api.audio.AudioWrapper.4
                public static ChangeQuickRedirect a;

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    Object[] objArr2 = {mediaPlayer};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8e2af565d7a8f1d39a2e0bd93b024bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8e2af565d7a8f1d39a2e0bd93b024bd");
                        return;
                    }
                    AudioWrapper.this.bPlaying = false;
                    AudioWrapper.this.playStatus = a.END;
                    AudioWrapper.this.sendEvent("InnerAudioContext.onEnded", null);
                }
            });
            this.mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.meituan.msi.api.audio.AudioWrapper.5
                public static ChangeQuickRedirect a;

                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    Object[] objArr2 = {mediaPlayer};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d00f1b2bff9b3e5f81cd37fdf75c6d06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d00f1b2bff9b3e5f81cd37fdf75c6d06");
                        return;
                    }
                    AudioWrapper.this.sendEvent("InnerAudioContext.onSeeked", null);
                    if (mediaPlayer.isPlaying()) {
                        AudioWrapper.this.sendEvent("InnerAudioContext.onPlay", null);
                    } else {
                        AudioWrapper.this.sendEvent("InnerAudioContext.onPause", null);
                    }
                }
            });
        }
    }

    public void sendEvent(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e44ad2ffe9ca4d82f176f6906ff1bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e44ad2ffe9ca4d82f176f6906ff1bd0");
        } else if (this.eventDispatcher != null) {
            BroadcastEvent broadcastEvent = new BroadcastEvent(str, obj);
            broadcastEvent.setTaskId(this.taskId);
            this.eventDispatcher.a(broadcastEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioErrorEvent getErrorEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e505600d3ca32dd22b0ec3c48039e1c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AudioErrorEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e505600d3ca32dd22b0ec3c48039e1c0");
        }
        AudioErrorEvent audioErrorEvent = new AudioErrorEvent();
        if (i == Integer.MIN_VALUE) {
            audioErrorEvent.errCode = 10001;
            audioErrorEvent.errMsg = "系统错误";
        } else if (i == -1010 || i == -1007) {
            audioErrorEvent.errCode = 10004;
            audioErrorEvent.errMsg = "格式错误";
        } else if (i == -1004) {
            audioErrorEvent.errCode = 10003;
            audioErrorEvent.errMsg = "文件错误";
        } else if (i == -110) {
            audioErrorEvent.errCode = 10002;
            audioErrorEvent.errMsg = "网络错误";
        } else {
            audioErrorEvent.errCode = -1;
            audioErrorEvent.errMsg = "未知错误";
        }
        return audioErrorEvent;
    }
}
