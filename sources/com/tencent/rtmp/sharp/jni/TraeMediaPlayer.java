package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TraeMediaPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public static final int TRAE_MEDIAPLAER_DATASOURCE_FILEPATH = 2;
    public static final int TRAE_MEDIAPLAER_DATASOURCE_RSID = 0;
    public static final int TRAE_MEDIAPLAER_DATASOURCE_URI = 1;
    public static final int TRAE_MEDIAPLAER_STOP = 100;
    private Context _context;
    private OnCompletionListener mCallback;
    private MediaPlayer mMediaPlay = null;
    private int _streamType = 0;
    private boolean _hasCall = false;
    private boolean _loop = false;
    private int _durationMS = -1;
    int _loopCount = 0;
    boolean _ringMode = false;
    private Timer _watchTimer = null;
    private TimerTask _watchTimertask = null;
    private int _prevVolume = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnCompletionListener {
        void onCompletion();
    }

    public TraeMediaPlayer(Context context, OnCompletionListener onCompletionListener) {
        this._context = context;
        this.mCallback = onCompletionListener;
    }

    public boolean playRing(int i, int i2, Uri uri, String str, boolean z, int i3, boolean z2, boolean z3, int i4) {
        int i5;
        Throwable th;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("TraeMediaPlay | playRing datasource:");
            sb.append(i);
            sb.append(" rsid:");
            sb.append(i2);
            sb.append(" uri:");
            sb.append(uri);
            sb.append(" filepath:");
            sb.append(str);
            sb.append(" loop:");
            sb.append(z ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" :loopCount");
            sb.append(i3);
            sb.append(" ringMode:");
            sb.append(z2 ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" hasCall:");
            sb.append(z3);
            sb.append(" cst:");
            sb.append(i4);
            QLog.e("TRAE", 2, sb.toString());
        }
        if (!z && i3 <= 0) {
            if (QLog.isColorLevel()) {
                StringBuilder sb2 = new StringBuilder("TraeMediaPlay | playRing err datasource:");
                sb2.append(i);
                sb2.append(" loop:");
                sb2.append(z ? "Y" : ErrorCode.ERROR_TYPE_N);
                sb2.append(" :loopCount");
                sb2.append(i3);
                QLog.e("TRAE", 2, sb2.toString());
            }
            return false;
        }
        try {
            try {
                try {
                    try {
                        if (this.mMediaPlay != null) {
                            if (this.mMediaPlay.isPlaying()) {
                                return false;
                            }
                            try {
                                try {
                                    this.mMediaPlay.release();
                                    this.mMediaPlay = null;
                                } catch (Exception e) {
                                    if (QLog.isColorLevel()) {
                                        try {
                                            QLog.e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
                                            mediaPlayer2 = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            mediaPlayer = null;
                                            this.mMediaPlay = mediaPlayer;
                                            throw th;
                                        }
                                    } else {
                                        mediaPlayer2 = null;
                                    }
                                    this.mMediaPlay = mediaPlayer2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                mediaPlayer = null;
                                this.mMediaPlay = mediaPlayer;
                                throw th;
                            }
                        }
                        if (this._watchTimer != null) {
                            this._watchTimer.cancel();
                            this._watchTimer = null;
                            this._watchTimertask = null;
                        }
                        AudioManager audioManager = (AudioManager) this._context.getSystemService("audio");
                        this.mMediaPlay = new MediaPlayer();
                        if (this.mMediaPlay == null) {
                            this.mMediaPlay.release();
                            this.mMediaPlay = null;
                            return false;
                        }
                        this.mMediaPlay.setOnCompletionListener(this);
                        this.mMediaPlay.setOnErrorListener(this);
                        switch (i) {
                            case 0:
                                if (QLog.isColorLevel()) {
                                    QLog.e("TRAE", 2, "TraeMediaPlay | rsid:" + i2);
                                }
                                AssetFileDescriptor openRawResourceFd = this._context.getResources().openRawResourceFd(i2);
                                if (openRawResourceFd == null) {
                                    if (QLog.isColorLevel()) {
                                        QLog.e("TRAE", 2, "TraeMediaPlay | afd == null rsid:" + i2);
                                    }
                                    this.mMediaPlay.release();
                                    this.mMediaPlay = null;
                                    return false;
                                }
                                this.mMediaPlay.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                                openRawResourceFd.close();
                                break;
                            case 1:
                                if (QLog.isColorLevel()) {
                                    QLog.e("TRAE", 2, "TraeMediaPlay | uri:" + uri);
                                }
                                this.mMediaPlay.setDataSource(this._context, uri);
                                break;
                            case 2:
                                if (QLog.isColorLevel()) {
                                    QLog.e("TRAE", 2, "TraeMediaPlay | FilePath:" + str);
                                }
                                this.mMediaPlay.setDataSource(str);
                                break;
                            default:
                                if (QLog.isColorLevel()) {
                                    QLog.e("TRAE", 2, "TraeMediaPlay | err datasource:" + i);
                                }
                                this.mMediaPlay.release();
                                this.mMediaPlay = null;
                                break;
                        }
                        if (this.mMediaPlay == null) {
                            return false;
                        }
                        this._ringMode = z2;
                        if (this._ringMode) {
                            this._streamType = 2;
                            i5 = 1;
                        } else {
                            this._streamType = 0;
                            i5 = Build.VERSION.SDK_INT >= 11 ? 3 : 0;
                        }
                        this._hasCall = z3;
                        if (this._hasCall) {
                            this._streamType = i4;
                        }
                        this.mMediaPlay.setAudioStreamType(this._streamType);
                        this.mMediaPlay.prepare();
                        this.mMediaPlay.setLooping(z);
                        this.mMediaPlay.start();
                        this._loop = z;
                        if (this._loop) {
                            this._loopCount = 1;
                            this._durationMS = -1;
                        } else {
                            this._loopCount = i3;
                            this._durationMS = this._loopCount * this.mMediaPlay.getDuration();
                        }
                        this._loopCount--;
                        if (!this._hasCall) {
                            audioManager.setMode(i5);
                        }
                        if (this._durationMS > 0) {
                            this._watchTimer = new Timer();
                            this._watchTimertask = new TimerTask() { // from class: com.tencent.rtmp.sharp.jni.TraeMediaPlayer.1
                                @Override // java.util.TimerTask, java.lang.Runnable
                                public void run() {
                                    if (TraeMediaPlayer.this.mMediaPlay != null) {
                                        if (QLog.isColorLevel()) {
                                            QLog.e("TRAE", 2, "TraeMediaPlay | play timeout");
                                        }
                                        if (TraeMediaPlayer.this.mCallback != null) {
                                            TraeMediaPlayer.this.mCallback.onCompletion();
                                        }
                                    }
                                }
                            };
                            this._watchTimer.schedule(this._watchTimertask, this._durationMS + 1000);
                        }
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "TraeMediaPlay | DurationMS:" + this.mMediaPlay.getDuration() + " loop:" + z);
                        }
                        return true;
                    } catch (Exception e2) {
                        if (QLog.isColorLevel()) {
                            QLog.d("TRAE", 2, "TraeMediaPlay | Except: " + e2.getLocalizedMessage() + StringUtil.SPACE + e2.getMessage());
                        }
                        try {
                            this.mMediaPlay.release();
                        } catch (Exception unused) {
                        }
                        this.mMediaPlay = null;
                        return false;
                    }
                } catch (IllegalStateException e3) {
                    if (QLog.isColorLevel()) {
                        QLog.d("TRAE", 2, "TraeMediaPlay | IllegalStateException: " + e3.getLocalizedMessage() + StringUtil.SPACE + e3.getMessage());
                    }
                    this.mMediaPlay.release();
                    this.mMediaPlay = null;
                    return false;
                }
            } catch (IOException e4) {
                if (QLog.isColorLevel()) {
                    QLog.d("TRAE", 2, "TraeMediaPlay | IOException: " + e4.getLocalizedMessage() + StringUtil.SPACE + e4.getMessage());
                }
                this.mMediaPlay.release();
                this.mMediaPlay = null;
                return false;
            }
        } catch (IllegalArgumentException e5) {
            if (QLog.isColorLevel()) {
                QLog.d("TRAE", 2, "TraeMediaPlay | IllegalArgumentException: " + e5.getLocalizedMessage() + StringUtil.SPACE + e5.getMessage());
            }
            this.mMediaPlay.release();
            this.mMediaPlay = null;
            return false;
        } catch (SecurityException e6) {
            if (QLog.isColorLevel()) {
                QLog.d("TRAE", 2, "TraeMediaPlay | SecurityException: " + e6.getLocalizedMessage() + StringUtil.SPACE + e6.getMessage());
            }
            this.mMediaPlay.release();
            this.mMediaPlay = null;
            return false;
        }
    }

    public void stopRing() {
        if (QLog.isColorLevel()) {
            QLog.d("TRAE", 2, "TraeMediaPlay stopRing ");
        }
        if (this.mMediaPlay == null) {
            return;
        }
        if (this.mMediaPlay.isPlaying()) {
            this.mMediaPlay.stop();
        }
        this.mMediaPlay.reset();
        try {
            if (this._watchTimer != null) {
                this._watchTimer.cancel();
                this._watchTimer = null;
                this._watchTimertask = null;
            }
            this.mMediaPlay.release();
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
            }
        }
        this.mMediaPlay = null;
        this._durationMS = -1;
    }

    public int getStreamType() {
        return this._streamType;
    }

    public int getDuration() {
        return this._durationMS;
    }

    public boolean hasCall() {
        return this._hasCall;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " loopCount:" + this._loopCount + " _loop:" + this._loop);
        if (this._loop) {
            if (QLog.isColorLevel()) {
                QLog.d("TRAE", 2, "loop play,continue...");
                return;
            }
            return;
        }
        try {
            if (this._loopCount <= 0) {
                volumeUndo();
                if (this.mMediaPlay.isPlaying()) {
                    this.mMediaPlay.stop();
                }
                this.mMediaPlay.reset();
                this.mMediaPlay.release();
                this.mMediaPlay = null;
                if (this.mCallback != null) {
                    this.mCallback.onCompletion();
                }
            } else {
                this.mMediaPlay.start();
                this._loopCount--;
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "stop play failed." + e.getMessage());
            }
        }
        AudioDeviceInterface.LogTraceExit();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AudioDeviceInterface.LogTraceEntry(" cb:" + this.mCallback + " arg1:" + i + " arg2:" + i2);
        try {
            this.mMediaPlay.release();
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "release MediaPlayer failed." + e.getMessage());
            }
        }
        this.mMediaPlay = null;
        if (this.mCallback != null) {
            this.mCallback.onCompletion();
        }
        AudioDeviceInterface.LogTraceExit();
        return false;
    }

    private void volumeDo() {
        if (this.mMediaPlay == null || !this._ringMode || this._streamType == 2) {
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) this._context.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(this._streamType);
            int streamMaxVolume = audioManager.getStreamMaxVolume(this._streamType);
            int streamVolume2 = audioManager.getStreamVolume(2);
            int streamMaxVolume2 = audioManager.getStreamMaxVolume(2);
            int i = (int) (((streamVolume2 * 1.0d) / streamMaxVolume2) * streamMaxVolume);
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "TraeMediaPlay volumeDo currV:" + streamVolume + " maxV:" + streamMaxVolume + " currRV:" + streamVolume2 + " maxRV:" + streamMaxVolume2 + " setV:" + i);
            }
            int i2 = i + 1;
            if (i2 < streamMaxVolume) {
                streamMaxVolume = i2;
            }
            audioManager.setStreamVolume(this._streamType, streamMaxVolume, 0);
            this._prevVolume = streamVolume;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "set stream volume failed." + e.getMessage());
            }
        }
    }

    private void volumeUndo() {
        if (this.mMediaPlay == null || !this._ringMode || this._streamType == 2 || this._prevVolume == -1) {
            return;
        }
        try {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "TraeMediaPlay volumeUndo _prevVolume:" + this._prevVolume);
            }
            ((AudioManager) this._context.getSystemService("audio")).setStreamVolume(this._streamType, this._prevVolume, 0);
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "set stream volume failed." + e.getMessage());
            }
        }
    }
}
