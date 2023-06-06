package com.tencent.ugc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioRecord;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.audio.TXCAudioUGCRecorder;
import com.tencent.liteav.audio.TXCUGCBGMPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.audio.h;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.basic.c.b;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.i;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.o;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.e;
import com.tencent.liteav.beauty.f;
import com.tencent.liteav.capturer.a;
import com.tencent.liteav.k;
import com.tencent.liteav.muxer.c;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.videoediter.ffmpeg.b;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.liteav.videoencoder.d;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.ugc.TXUGCPartsManager;
import com.tencent.ugc.TXVideoEditConstants;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXUGCRecord implements g, b, o, f, d, TXUGCPartsManager.IPartsManagerListener {
    private static final int DEFAULT_CHANNEL = 1;
    public static float ENCODE_SPEED_FAST = 1.25f;
    public static float ENCODE_SPEED_FASTEST = 2.0f;
    public static float ENCODE_SPEED_SLOW = 0.8f;
    public static float ENCODE_SPEED_SLOWEST = 0.5f;
    private static final String OUTPUT_DIR_NAME = "TXUGC";
    private static final String OUTPUT_TEMP_DIR_NAME = "TXUGCParts";
    private static final String OUTPUT_VIDEO_COVER_NAME = "TXUGCCover.jpg";
    private static final String OUTPUT_VIDEO_NAME = "TXUGCRecord.mp4";
    public static float PLAY_SPEED_FAST = 0.8f;
    public static float PLAY_SPEED_FASTEST = 0.5f;
    public static float PLAY_SPEED_SLOW = 1.25f;
    public static float PLAY_SPEED_SLOWEST = 2.0f;
    private static final int STATE_NO_PERMISSION = -1;
    private static final int STATE_RECORDING = 1;
    private static final int STATE_RECORD_INIT = 1;
    private static final int STATE_RECORD_PAUSE = 3;
    private static final int STATE_RECORD_RECORDING = 2;
    private static final int STATE_SUCCESS = 0;
    private static final String TAG = "TXUGCRecord";
    private static TXUGCRecord instance;
    private long mBGMEndTime;
    private String mBGMPath;
    private boolean mBGMPlayStop;
    private long mBGMStartTime;
    private TXBeautyManager mBeautyManager;
    private CopyOnWriteArrayList<Long> mBgmPartBytesList;
    private Context mContext;
    private int mCropHeight;
    private int mCropWidth;
    private long mCurrentRecordDuration;
    private VideoCustomProcessListener mCustomProcessListener;
    private int mDisplayType;
    private Handler mMainHandler;
    private int mMaxDuration;
    private int mMinDuration;
    private int mRecordRetCode;
    private TXCloudVideoView mTXCloudVideoView;
    private com.tencent.liteav.videoediter.ffmpeg.b mTXFFQuickJoiner;
    private TXUGCPartsManager mTXUGCPartsManager;
    private TXVideoEditConstants.TXRect mTxWaterMarkRect;
    private i mUGCLicenceControl;
    private boolean mUseSWEncoder;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXCGLSurfaceView mVideoView;
    private Bitmap mWatermarkBitmap;
    private volatile int mRecordState = 1;
    private int mFps = 20;
    private int mGop = 3;
    private final int AAC_FRAME_SIZE = 4096;
    private long mRecordStartTime = 0;
    private long mEncodePcmDataSize = 0;
    private boolean mStartMuxer = false;
    private boolean mRecording = false;
    private boolean needCompose = false;
    private String mSaveDir = null;
    private String mVideoFileCurTempPath = null;
    private String mVideoFilePath = null;
    private String mVideoFileTempDir = null;
    private String mCoverCurTempPath = null;
    private String mCoverPath = null;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private a.EnumC1450a mCameraResolution = a.EnumC1450a.RESOLUTION_540_960;
    private AtomicBoolean mStartPreview = new AtomicBoolean(false);
    private boolean mCapturing = false;
    private k mConfig = new k();
    private com.tencent.liteav.capturer.a mCameraCapture = null;
    private e mVideoPreprocessor = null;
    private com.tencent.liteav.videoencoder.b mVideoEncoder = null;
    private c mMP4Muxer = null;
    private com.tencent.liteav.videoediter.a.c mTXMultiMediaComposer = null;
    private int mRenderRotationReadyChange = -1;
    private int mCameraOrientationReadyChange = -1;
    private int mRenderMode = 0;
    private boolean isReachedMaxDuration = false;
    private h mBGMNotifyProxy = null;
    private TXRecordCommon.ITXBGMNotify mBGMNotify = null;
    private boolean mBGMDeletePart = false;
    private int mRecordSpeed = 2;
    private boolean mInitCompelete = false;
    private boolean mSnapshotRunning = false;
    private int mVoiceChangerType = 0;
    private float mSpecialRadio = 0.5f;
    private boolean mSmartLicenseSupport = true;
    private a mTouchFocusRunnable = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i, int i2, int i3);

        void onTextureDestroyed();
    }

    @Override // com.tencent.liteav.beauty.f
    public void didProcessFrame(byte[] bArr, int i, int i2, int i3, long j) {
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onBufferProcess(byte[] bArr, float[] fArr) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeDataIn(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFinished(int i, long j, long j2) {
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onRestartEncoder(int i) {
    }

    public static synchronized TXUGCRecord getInstance(Context context) {
        TXUGCRecord tXUGCRecord;
        synchronized (TXUGCRecord.class) {
            if (instance == null) {
                instance = new TXUGCRecord(context);
            }
            tXUGCRecord = instance;
        }
        return tXUGCRecord;
    }

    protected TXUGCRecord(Context context) {
        this.mUseSWEncoder = false;
        if (context != null) {
            this.mContext = context.getApplicationContext();
            this.mMainHandler = new Handler(this.mContext.getMainLooper());
            TXCCommonUtil.setAppContext(this.mContext);
            TXCLog.init();
            this.mTXUGCPartsManager = new TXUGCPartsManager(this.mContext);
            this.mBgmPartBytesList = new CopyOnWriteArrayList<>();
            LicenceCheck.a().a((com.tencent.liteav.basic.license.f) null, this.mContext);
        }
        this.mUseSWEncoder = com.tencent.liteav.basic.util.g.h();
        initFileAndFolder();
        this.mUGCLicenceControl = new i(this.mContext);
        this.mBeautyManager = new com.tencent.liteav.beauty.b(this.mUGCLicenceControl);
        TXCAudioEngineJNI.nativeUseSysAudioDevice(true);
    }

    private void initFileAndFolder() {
        this.mSaveDir = getDefaultDir();
        this.mVideoFilePath = this.mSaveDir + File.separator + OUTPUT_VIDEO_NAME;
        this.mCoverPath = this.mSaveDir + File.separator + OUTPUT_VIDEO_COVER_NAME;
        this.mVideoFileTempDir = this.mSaveDir + File.separator + OUTPUT_TEMP_DIR_NAME;
        File file = new File(this.mVideoFileTempDir);
        if (!file.exists()) {
            file.mkdir();
        }
        this.mVideoFileCurTempPath = this.mVideoFileTempDir + File.separator + String.format("temp_TXUGC_%s.mp4", getTimeString());
        File file2 = new File(this.mVideoFilePath);
        if (file2.exists()) {
            file2.delete();
        }
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.ugc.TXUGCPartsManager.IPartsManagerListener
    public void onDeleteLastPart() {
        if (this.mBgmPartBytesList.size() != 0) {
            this.mBgmPartBytesList.remove(this.mBgmPartBytesList.size() - 1);
            this.mBGMDeletePart = true;
            if (this.mBgmPartBytesList.size() > 0) {
                this.mEncodePcmDataSize = this.mBgmPartBytesList.get(this.mBgmPartBytesList.size() - 1).longValue();
            } else {
                this.mEncodePcmDataSize = 0L;
            }
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager.IPartsManagerListener
    public void onDeleteAllParts() {
        TXCLog.i(TAG, "onDeleteAllParts");
        this.mBgmPartBytesList.clear();
        this.mBGMDeletePart = false;
        this.mEncodePcmDataSize = 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        private float b;
        private float c;

        private a() {
        }

        public void a(float f, float f2) {
            this.b = f;
            this.c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TXUGCRecord.this.mTXCloudVideoView == null) {
                return;
            }
            if (TXUGCRecord.this.mCameraCapture != null && TXUGCRecord.this.mConfig.f) {
                TXUGCRecord.this.mCameraCapture.a(this.b / TXUGCRecord.this.mTXCloudVideoView.getWidth(), this.c / TXUGCRecord.this.mTXCloudVideoView.getHeight());
            }
            if (TXUGCRecord.this.mConfig.f) {
                TXUGCRecord.this.mTXCloudVideoView.onTouchFocus((int) this.b, (int) this.c);
            }
        }
    }

    public int startCameraSimplePreview(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig, TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null || tXUGCSimpleConfig == null) {
            TXCLog.e(TAG, "startCameraPreview: invalid param");
            return -1;
        }
        this.mConfig.u = tXUGCSimpleConfig.needEdit;
        this.mConfig.a = tXUGCSimpleConfig.videoQuality;
        this.mConfig.o = tXUGCSimpleConfig.isFront;
        this.mConfig.f = tXUGCSimpleConfig.touchFocus;
        this.mMinDuration = tXUGCSimpleConfig.minDuration;
        this.mMaxDuration = tXUGCSimpleConfig.maxDuration;
        startCameraPreviewInternal(tXCloudVideoView, this.mConfig);
        return 0;
    }

    public int startCameraCustomPreview(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig, TXCloudVideoView tXCloudVideoView) {
        this.mConfig.u = tXUGCCustomConfig.needEdit;
        if (tXCloudVideoView == null || tXUGCCustomConfig == null) {
            TXCLog.e(TAG, "startCameraPreview: invalid param");
            return -1;
        }
        this.mConfig.a = -1;
        if (tXUGCCustomConfig.videoBitrate < 600) {
            tXUGCCustomConfig.videoBitrate = 600;
        }
        if (tXUGCCustomConfig.needEdit) {
            this.mConfig.d = 10000;
        } else {
            this.mConfig.d = tXUGCCustomConfig.videoBitrate;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bj, this.mConfig.d, "");
        if (tXUGCCustomConfig.videoFps < 15) {
            tXUGCCustomConfig.videoFps = 15;
        } else if (tXUGCCustomConfig.videoFps > 30) {
            tXUGCCustomConfig.videoFps = 30;
        }
        this.mConfig.c = tXUGCCustomConfig.videoFps;
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bk, this.mConfig.c, "");
        if (tXUGCCustomConfig.videoGop <= 0) {
            tXUGCCustomConfig.videoGop = 1;
        } else if (tXUGCCustomConfig.videoGop > 10) {
            tXUGCCustomConfig.videoGop = 10;
        }
        if (tXUGCCustomConfig.needEdit) {
            this.mConfig.e = 0;
        } else {
            this.mConfig.e = tXUGCCustomConfig.videoGop;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bl, this.mConfig.e, "");
        if (tXUGCCustomConfig.audioSampleRate != 8000 && tXUGCCustomConfig.audioSampleRate != 16000 && tXUGCCustomConfig.audioSampleRate != 32000 && tXUGCCustomConfig.audioSampleRate != 44100 && tXUGCCustomConfig.audioSampleRate != 48000) {
            this.mConfig.t = 48000;
        } else {
            this.mConfig.t = tXUGCCustomConfig.audioSampleRate;
        }
        this.mConfig.b = tXUGCCustomConfig.videoResolution;
        this.mConfig.o = tXUGCCustomConfig.isFront;
        this.mConfig.f = tXUGCCustomConfig.touchFocus;
        this.mConfig.q = tXUGCCustomConfig.enableHighResolutionCapture;
        this.mMinDuration = tXUGCCustomConfig.minDuration;
        this.mMaxDuration = tXUGCCustomConfig.maxDuration;
        this.mConfig.u = tXUGCCustomConfig.needEdit;
        startCameraPreviewInternal(tXCloudVideoView, this.mConfig);
        return 0;
    }

    public void setVideoResolution(int i) {
        if (this.mRecordState != 1) {
            TXCLog.e(TAG, "setVideoResolution err, state not init");
        } else if (this.mTXCloudVideoView == null) {
            TXCLog.e(TAG, "setVideoResolution, mTXCloudVideoView is null");
        } else if (this.mConfig.b == i) {
            TXCLog.i(TAG, "setVideoResolution, resolution not change");
        } else {
            this.mConfig.a = -1;
            this.mConfig.b = i;
            stopCameraPreview();
            startCameraPreviewInternal(this.mTXCloudVideoView, this.mConfig);
        }
    }

    public void setVideoBitrate(int i) {
        if (this.mRecordState != 1) {
            TXCLog.e(TAG, "setVideoBitrate err, state not init");
            return;
        }
        this.mConfig.a = -1;
        this.mConfig.d = i;
    }

    public void stopCameraPreview() {
        this.mStartPreview.set(false);
        try {
            TXCLog.i(TAG, "ugcRecord, stopCameraPreview");
            synchronized (this) {
                this.mCapturing = false;
                if (this.mCameraCapture != null) {
                    this.mCameraCapture.g();
                }
            }
            if (this.mVideoView != null) {
                this.mVideoView.b(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TXUGCRecord.this.mVideoPreprocessor != null) {
                            TXUGCRecord.this.mVideoPreprocessor.b();
                        }
                    }
                });
                this.mVideoView.b(false);
                this.mVideoView = null;
            }
            if (this.mCustomProcessListener != null) {
                this.mCustomProcessListener.onTextureDestroyed();
            }
        } catch (Exception e) {
            TXCLog.e(TAG, "stop camera preview failed.", e);
        }
    }

    public TXUGCPartsManager getPartsManager() {
        return this.mTXUGCPartsManager;
    }

    public void setMute(boolean z) {
        TXCAudioUGCRecorder.getInstance().setMute(z);
    }

    public int startRecord() {
        TXCAudioEngineJNI.nativeUseSysAudioDevice(true);
        if (Build.VERSION.SDK_INT < 18) {
            TXCLog.e(TAG, "API level is too low (record need 18, current is " + Build.VERSION.SDK_INT + CommonConstant.Symbol.BRACKET_RIGHT);
            return -3;
        } else if (this.mRecording) {
            TXCLog.e(TAG, "startRecord: there is existing uncompleted record task");
            return -1;
        } else {
            try {
                TXCDRApi.initCrashReport(this.mContext);
                this.mCoverCurTempPath = this.mCoverPath;
                File file = new File(this.mCoverPath);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e) {
                TXCLog.e(TAG, "delete file failed.", e);
            }
            return startRecordInternal(true);
        }
    }

    public int startRecord(String str, String str2) {
        TXCAudioEngineJNI.nativeUseSysAudioDevice(true);
        if (Build.VERSION.SDK_INT < 18) {
            TXCLog.e(TAG, "API level is too low (record need 18, current is " + Build.VERSION.SDK_INT + CommonConstant.Symbol.BRACKET_RIGHT);
            return -3;
        } else if (this.mRecording) {
            TXCLog.e(TAG, "startRecord: there is existing uncompleted record task");
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            TXCLog.e(TAG, "startRecord: init videoRecord failed, videoFilePath is empty");
            return -2;
        } else {
            this.mVideoFilePath = str;
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            String defaultDir = getDefaultDir();
            this.mVideoFileTempDir = defaultDir + File.separator + OUTPUT_TEMP_DIR_NAME;
            File file2 = new File(this.mVideoFileTempDir);
            if (!file2.exists()) {
                file2.mkdir();
            }
            this.mVideoFileCurTempPath = this.mVideoFileTempDir + File.separator + String.format("temp_TXUGC_%s.mp4", getTimeString());
            this.mCoverPath = str2;
            this.mCoverCurTempPath = str2;
            return startRecordInternal(true);
        }
    }

    public int startRecord(String str, String str2, String str3) {
        TXCAudioEngineJNI.nativeUseSysAudioDevice(true);
        if (Build.VERSION.SDK_INT < 18) {
            TXCLog.e(TAG, "API level is too low (record need 18, current is " + Build.VERSION.SDK_INT + CommonConstant.Symbol.BRACKET_RIGHT);
            return -3;
        } else if (this.mRecording) {
            TXCLog.e(TAG, "startRecord: there is existing uncompleted record task");
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            TXCLog.e(TAG, "startRecord: init videoRecord failed, videoFilePath is empty");
            return -2;
        } else {
            this.mVideoFilePath = str;
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.mVideoFileTempDir = str2;
            } else {
                String defaultDir = getDefaultDir();
                this.mVideoFileTempDir = defaultDir + File.separator + OUTPUT_TEMP_DIR_NAME;
            }
            File file2 = new File(this.mVideoFileTempDir);
            if (!file2.exists()) {
                file2.mkdir();
            }
            this.mVideoFileCurTempPath = this.mVideoFileTempDir + File.separator + String.format("temp_TXUGC_%s.mp4", getTimeString());
            this.mCoverPath = str3;
            this.mCoverCurTempPath = str3;
            return startRecordInternal(true);
        }
    }

    private int startRecordInternal(boolean z) {
        if (!this.mInitCompelete) {
            TXCLog.i(TAG, "startRecordInternal, mInitCompelete = " + this.mInitCompelete);
            return -4;
        } else if (checkLicenseMatch()) {
            TXCAudioUGCRecorder.getInstance().setAECType(0, this.mContext);
            TXCAudioUGCRecorder.getInstance().setListener(this);
            TXCAudioUGCRecorder.getInstance().setChannels(1);
            TXCAudioUGCRecorder.getInstance().setSampleRate(this.mConfig.t);
            if (z) {
                TXCAudioUGCRecorder.getInstance().startRecord(this.mContext);
            }
            switch (this.mRecordSpeed) {
                case 0:
                    TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_SLOWEST);
                    break;
                case 1:
                    TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_SLOW);
                    break;
                case 2:
                    TXCAudioUGCRecorder.getInstance().setSpeedRate(1.0f);
                    break;
                case 3:
                    TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_FAST);
                    break;
                case 4:
                    TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_FASTEST);
                    break;
            }
            if (this.mVideoEncoder != null) {
                this.mVideoWidth = 0;
                this.mVideoHeight = 0;
            }
            this.mUseSWEncoder = this.mConfig.g < 1280 && this.mConfig.h < 1280;
            if (this.mMP4Muxer == null) {
                this.mMP4Muxer = new c(this.mContext, this.mUseSWEncoder ? 0 : 2);
            }
            File file = new File(this.mVideoFileCurTempPath);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    TXCLog.e(TAG, "create new file failed.", e);
                }
            }
            TXCLog.i(TAG, "startRecord");
            this.mMP4Muxer.a(this.mRecordSpeed);
            this.mMP4Muxer.a(this.mVideoFileCurTempPath);
            addAudioTrack();
            TXCDRApi.txReportDAU(this.mContext.getApplicationContext(), com.tencent.liteav.basic.datareport.a.av);
            this.mRecordState = 2;
            this.mRecording = true;
            this.mRecordStartTime = 0L;
            TXCAudioUGCRecorder.getInstance().resume();
            return 0;
        } else {
            return -5;
        }
    }

    public int stopRecord() {
        TXCLog.i(TAG, "stopRecord called, mRecording = " + this.mRecording + ", needCompose = " + this.needCompose);
        if (this.mRecording) {
            this.needCompose = true;
            return stopRecordForClip();
        }
        int quickJoiner = quickJoiner();
        if (quickJoiner != 0) {
            callbackRecordFail(quickJoiner);
        }
        this.mBgmPartBytesList.clear();
        this.mEncodePcmDataSize = 0L;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int quickJoiner() {
        if (this.mTXFFQuickJoiner == null) {
            this.mTXFFQuickJoiner = new com.tencent.liteav.videoediter.ffmpeg.b("compose");
        }
        this.mTXFFQuickJoiner.a(new b.a() { // from class: com.tencent.ugc.TXUGCRecord.7
            @Override // com.tencent.liteav.videoediter.ffmpeg.b.a
            public void a(com.tencent.liteav.videoediter.ffmpeg.b bVar, int i, String str) {
                if (i == 0) {
                    TXUGCRecord.this.callbackRecordSuccess();
                } else if (i == 1) {
                    TXUGCRecord.this.callbackRecordFail(-7);
                    TXLog.e(TXUGCRecord.TAG, "quickJoiner, quick joiner result cancel");
                } else if (i == -1) {
                    TXUGCRecord.this.callbackRecordFail(-8);
                    TXLog.e(TXUGCRecord.TAG, "quickJoiner, quick joiner result verify fail");
                } else if (i == -2) {
                    TXUGCRecord.this.callbackRecordFail(-9);
                    TXLog.e(TXUGCRecord.TAG, "quickJoiner, quick joiner result err");
                }
                bVar.a((b.a) null);
                bVar.c();
                bVar.d();
                TXUGCRecord.this.mTXFFQuickJoiner = null;
                TXUGCRecord.this.mRecordState = 1;
            }

            @Override // com.tencent.liteav.videoediter.ffmpeg.b.a
            public void a(com.tencent.liteav.videoediter.ffmpeg.b bVar, float f) {
                TXCLog.i(TXUGCRecord.TAG, "joiner progress " + f);
            }
        });
        if (this.mTXFFQuickJoiner.a(this.mTXUGCPartsManager.getPartsPathList()) != 0) {
            TXLog.e(TAG, "quickJoiner, quick joiner set src path err");
            destroyQuickJoiner();
            return -4;
        } else if (this.mTXFFQuickJoiner.a(this.mVideoFilePath) != 0) {
            TXLog.e(TAG, "quickJoiner, quick joiner set dst path err, mVideoFilePath = " + this.mVideoFilePath);
            destroyQuickJoiner();
            return -5;
        } else {
            int b = this.mTXFFQuickJoiner.b();
            TXCLog.i(TAG, "quickJoiner start");
            if (b != 0) {
                TXLog.e(TAG, "quickJoiner, quick joiner start fail");
                destroyQuickJoiner();
                return -6;
            }
            return 0;
        }
    }

    private void destroyQuickJoiner() {
        if (this.mTXFFQuickJoiner != null) {
            this.mTXFFQuickJoiner.a((b.a) null);
            this.mTXFFQuickJoiner.c();
            this.mTXFFQuickJoiner.d();
        }
        this.mTXFFQuickJoiner = null;
        this.mRecordState = 1;
    }

    public void release() {
        TXCLog.i(TAG, "release");
        TXCAudioUGCRecorder.getInstance().stopRecord();
        TXCAudioUGCRecorder.getInstance().setChangerType(0);
        TXCAudioUGCRecorder.getInstance().setReverbType(0);
        TXCAudioUGCRecorder.getInstance().setSpeedRate(1.0f);
        this.mTXCloudVideoView = null;
        this.mRecordState = 1;
        this.mRenderMode = 0;
        if (this.mVideoPreprocessor != null) {
            this.mVideoPreprocessor.a((f) null);
        }
        TXCAudioEngineJNI.nativeUseSysAudioDevice(false);
        this.mRecordStartTime = 0L;
        this.mEncodePcmDataSize = 0L;
        this.mStartMuxer = false;
        this.mRecording = false;
        this.needCompose = false;
        this.isReachedMaxDuration = false;
        this.mSnapshotRunning = false;
        this.mCapturing = false;
        this.mCurrentRecordDuration = 0L;
        this.mBGMDeletePart = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int stopRecordForClip() {
        int i;
        TXCLog.i(TAG, "stopRecordForClip");
        if (!this.mRecording) {
            TXCLog.e(TAG, "stopRecordForClip: there is no existing uncompleted record task");
            return -2;
        }
        TXCAudioUGCRecorder.getInstance().pause();
        if (this.mVideoEncoder != null) {
            this.mVideoEncoder.c();
        }
        this.mStartMuxer = false;
        stopEncoder(this.mVideoEncoder);
        this.mVideoEncoder = null;
        synchronized (this) {
            this.mRecording = false;
            if (this.mMP4Muxer != null) {
                i = this.mMP4Muxer.b();
                this.mMP4Muxer = null;
            } else {
                i = 0;
            }
        }
        File file = new File(this.mVideoFileCurTempPath);
        if (i != 0) {
            if (file.exists()) {
                asyncDeleteFile(this.mVideoFileCurTempPath);
                this.mVideoFileCurTempPath = null;
            }
            TXCLog.e(TAG, "stopRecordForClip, maybe mMP4Muxer not write data");
            if (!TextUtils.isEmpty(this.mBGMPath)) {
                this.mBGMDeletePart = true;
            }
            if (!this.needCompose && !this.isReachedMaxDuration) {
                return -3;
            }
        }
        if (TextUtils.isEmpty(this.mVideoFileCurTempPath) || !file.exists() || file.length() == 0 || this.mCurrentRecordDuration < 150) {
            TXCLog.e(TAG, "stopRecordForClip, file err ---> path = " + this.mVideoFileCurTempPath + ", mCurrentRecordDuration(ms) too short = " + this.mCurrentRecordDuration);
            if (!TextUtils.isEmpty(this.mBGMPath)) {
                this.mBGMDeletePart = true;
            }
            if (file.exists()) {
                asyncDeleteFile(this.mVideoFileCurTempPath);
            }
            if (!this.needCompose && !this.isReachedMaxDuration) {
                return -3;
            }
        } else {
            TXCLog.i(TAG, "stopRecordForClip, tempVideoFile exist, path = " + this.mVideoFileCurTempPath + ", length = " + file.length());
            PartInfo partInfo = new PartInfo();
            partInfo.setPath(this.mVideoFileCurTempPath);
            partInfo.setDuration(this.mCurrentRecordDuration);
            this.mTXUGCPartsManager.addClipInfo(partInfo);
            if (!TextUtils.isEmpty(this.mBGMPath)) {
                this.mBgmPartBytesList.add(Long.valueOf(this.mEncodePcmDataSize));
                this.mBGMDeletePart = false;
            }
            callbackEvent(1, null);
        }
        String str = this.mCoverCurTempPath;
        if (!TextUtils.isEmpty(this.mCoverCurTempPath)) {
            this.mCoverCurTempPath = null;
        }
        asyncGenCoverAndDetermineCompose(str);
        return 0;
    }

    private void asyncGenCoverAndDetermineCompose(final String str) {
        new Thread(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TXUGCRecord.this.mVideoFileCurTempPath) && !TextUtils.isEmpty(str)) {
                        com.tencent.liteav.basic.util.g.a(TXUGCRecord.this.mVideoFileCurTempPath, str);
                    }
                } catch (Exception e) {
                    TXCLog.e(TXUGCRecord.TAG, "gen video thumb failed.", e);
                }
                TXUGCRecord.this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.i(TXUGCRecord.TAG, "stopRecordForClip, isReachedMaxDuration = " + TXUGCRecord.this.isReachedMaxDuration + ", needCompose = " + TXUGCRecord.this.needCompose);
                        if (TXUGCRecord.this.isReachedMaxDuration) {
                            TXUGCRecord.this.mRecordRetCode = 2;
                            int quickJoiner = TXUGCRecord.this.quickJoiner();
                            if (quickJoiner != 0) {
                                TXUGCRecord.this.callbackRecordFail(quickJoiner);
                            }
                        } else if (TXUGCRecord.this.needCompose) {
                            TXUGCRecord.this.mRecordRetCode = 0;
                            TXUGCRecord.this.needCompose = false;
                            int quickJoiner2 = TXUGCRecord.this.quickJoiner();
                            if (quickJoiner2 != 0) {
                                TXUGCRecord.this.callbackRecordFail(quickJoiner2);
                            }
                        }
                    }
                });
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackRecordFail(int i) {
        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
        tXRecordResult.retCode = i;
        tXRecordResult.descMsg = "record video failed";
        if (this.mVideoRecordListener != null) {
            this.mVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackRecordSuccess() {
        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
        if (this.mTXUGCPartsManager.getDuration() < this.mMinDuration) {
            this.mRecordRetCode = 1;
        }
        tXRecordResult.retCode = this.mRecordRetCode;
        tXRecordResult.descMsg = "record success";
        tXRecordResult.videoPath = this.mVideoFilePath;
        tXRecordResult.coverPath = this.mCoverPath;
        if (this.mVideoRecordListener != null) {
            this.mVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    private String getDefaultDir() {
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            File externalFilesDir = this.mContext.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                Log.e(TAG, "getDefaultDir sdcardDir is null");
                return null;
            }
            String str = externalFilesDir + File.separator + OUTPUT_DIR_NAME;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            return str;
        }
        File filesDir = this.mContext.getFilesDir();
        if (filesDir != null) {
            return filesDir.getPath();
        }
        return null;
    }

    private String getTimeString() {
        return new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date(System.currentTimeMillis()));
    }

    private void asyncDeleteFile(final String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTask() { // from class: com.tencent.ugc.TXUGCRecord.9
                @Override // android.os.AsyncTask
                protected Object doInBackground(Object[] objArr) {
                    File file = new File(str);
                    if (file.isFile() && file.exists()) {
                        file.delete();
                        return null;
                    }
                    return null;
                }
            }, AsyncTask.SERIAL_EXECUTOR, new Object[0]);
        } catch (Exception e) {
            TXCLog.e(TAG, "asyncDeleteFile, exception = " + e);
        }
    }

    public int pauseRecord() {
        if (!this.mRecording) {
            TXCLog.e(TAG, "pauseRecord: there is no existing uncompleted record task");
            return -2;
        }
        TXCLog.i(TAG, "pauseRecord called");
        this.mRecordState = 3;
        return stopRecordForClip();
    }

    public int resumeRecord() {
        if (this.mRecording) {
            TXCLog.e(TAG, "resumeRecord: there is existing uncompleted record task");
            return -1;
        }
        TXCLog.i(TAG, "resumeRecord called");
        this.mVideoFileCurTempPath = this.mVideoFileTempDir + File.separator + String.format("temp_TXUGC_%s.mp4", getTimeString());
        int startRecordInternal = startRecordInternal(false);
        callbackEvent(2, null);
        return startRecordInternal;
    }

    private void changeRecordSpeed() {
        switch (this.mRecordSpeed) {
            case 0:
                TXCUGCBGMPlayer.getInstance().setSpeedRate(PLAY_SPEED_SLOWEST);
                TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_SLOWEST);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bm, this.mRecordSpeed, "SLOWEST");
                return;
            case 1:
                TXCUGCBGMPlayer.getInstance().setSpeedRate(PLAY_SPEED_SLOW);
                TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_SLOW);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bm, this.mRecordSpeed, "SLOW");
                return;
            case 2:
                TXCUGCBGMPlayer.getInstance().setSpeedRate(1.0f);
                TXCAudioUGCRecorder.getInstance().setSpeedRate(1.0f);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bm, this.mRecordSpeed, "NORMAL");
                return;
            case 3:
                TXCUGCBGMPlayer.getInstance().setSpeedRate(PLAY_SPEED_FAST);
                TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_FAST);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bm, this.mRecordSpeed, "FAST");
                return;
            case 4:
                TXCUGCBGMPlayer.getInstance().setSpeedRate(PLAY_SPEED_FASTEST);
                TXCAudioUGCRecorder.getInstance().setSpeedRate(ENCODE_SPEED_FASTEST);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bc);
                TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bm, this.mRecordSpeed, "FASTEST");
                return;
            default:
                return;
        }
    }

    public boolean setMicVolume(float f) {
        TXCAudioUGCRecorder.getInstance().setVolume(f);
        return true;
    }

    public boolean switchCamera(final boolean z) {
        this.mConfig.o = z;
        if (this.mVideoView != null) {
            final TXCGLSurfaceView tXCGLSurfaceView = this.mVideoView;
            this.mVideoView.b(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.10
                @Override // java.lang.Runnable
                public void run() {
                    if (TXUGCRecord.this.mCameraCapture != null && tXCGLSurfaceView != null) {
                        TXUGCRecord.this.mCameraCapture.g();
                        tXCGLSurfaceView.a(false);
                        TXUGCRecord.this.mCameraCapture.a(tXCGLSurfaceView.getSurfaceTexture());
                        if (TXUGCRecord.this.mCameraCapture.d(z) == 0) {
                            TXUGCRecord.this.mCapturing = true;
                        } else {
                            TXUGCRecord.this.mCapturing = false;
                            TXUGCRecord.this.callbackEvent(3, null);
                        }
                        tXCGLSurfaceView.a(TXUGCRecord.this.mConfig.c, true);
                    }
                    TXUGCRecord.this.setWatermark(TXUGCRecord.this.mWatermarkBitmap, TXUGCRecord.this.mTxWaterMarkRect);
                }
            });
            return true;
        }
        return true;
    }

    public void setAspectRatio(int i) {
        this.mDisplayType = i;
        if (i == 0) {
            this.mCropWidth = this.mConfig.g;
            this.mCropHeight = this.mConfig.h;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.be);
        } else if (i == 1) {
            this.mCropHeight = (((int) ((this.mConfig.g * 4.0f) / 3.0f)) / 16) * 16;
            this.mCropWidth = this.mConfig.g;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bd);
        } else if (i == 2) {
            this.mCropHeight = this.mConfig.g;
            this.mCropWidth = this.mConfig.g;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bc);
        } else if (i == 3) {
            this.mCropHeight = (this.mConfig.g * 9) / 16;
            this.mCropHeight = ((this.mCropHeight + 15) / 16) * 16;
            this.mCropWidth = this.mConfig.g;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bq);
        } else if (i == 4) {
            this.mCropHeight = (((int) ((this.mConfig.g * 3.0f) / 4.0f)) / 16) * 16;
            this.mCropWidth = this.mConfig.g;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.br);
        }
    }

    private boolean checkLicenseMatch() {
        int a2 = LicenceCheck.a().a((com.tencent.liteav.basic.license.f) null, this.mContext);
        if (a2 != 0) {
            TXCLog.e(TAG, "checkLicenseMatch, checkErrCode = " + a2);
            return false;
        } else if (LicenceCheck.a().b() != 2 || this.mSmartLicenseSupport) {
            return true;
        } else {
            TXCLog.e(TAG, "checkLicenseMatch, called UnSupported method!");
            return true;
        }
    }

    private boolean isSmartLicense() {
        LicenceCheck.a().a((com.tencent.liteav.basic.license.f) null, this.mContext);
        if (LicenceCheck.a().b() == -1) {
            TXCLog.i(TAG, "isSmartLicense, license type is = " + LicenceCheck.a().b());
            this.mSmartLicenseSupport = false;
        } else if (LicenceCheck.a().b() == 2) {
            return true;
        }
        return false;
    }

    public void snapshot(final TXRecordCommon.ITXSnapshotListener iTXSnapshotListener) {
        if (!checkLicenseMatch() || this.mSnapshotRunning || iTXSnapshotListener == null) {
            return;
        }
        this.mSnapshotRunning = true;
        if (this.mVideoView != null) {
            this.mVideoView.a(new p() { // from class: com.tencent.ugc.TXUGCRecord.11
                @Override // com.tencent.liteav.basic.opengl.p
                public void onTakePhotoComplete(Bitmap bitmap) {
                    iTXSnapshotListener.onSnapshot(bitmap);
                }
            });
        }
        this.mSnapshotRunning = false;
    }

    public void setRecordSpeed(int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setRecordSpeed is not supported in UGC_Smart license");
            return;
        }
        this.mRecordSpeed = i;
        if (TextUtils.isEmpty(this.mBGMPath)) {
            return;
        }
        changeRecordSpeed();
    }

    public void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setVideoProcessListener is not supported in UGC_Smart license");
        } else {
            this.mCustomProcessListener = videoCustomProcessListener;
        }
    }

    public void setReverb(int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setReverb is not supported in UGC_Smart license");
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bp, i, "");
        TXCAudioUGCRecorder.getInstance().setReverbType(i);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aA);
    }

    public void setVoiceChangerType(int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setVoiceChangerType is not supported in UGC_Smart license");
            return;
        }
        this.mVoiceChangerType = i;
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bo, i, "");
        TXCAudioUGCRecorder.getInstance().setChangerType(i);
    }

    public int setBGM(String str) {
        TXCAudioEngineJNI.nativeUseSysAudioDevice(true);
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGM is not supported in UGC_Smart license");
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            TXCLog.e(TAG, "setBGM, path is empty");
            stopBGM();
            TXCUGCBGMPlayer.getInstance().setOnPlayListener(null);
            return 0;
        } else {
            this.mBGMPath = str;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bn);
            if (this.mBGMNotifyProxy == null) {
                this.mBGMNotifyProxy = new h() { // from class: com.tencent.ugc.TXUGCRecord.12
                    @Override // com.tencent.liteav.audio.h
                    public void onPlayStart() {
                        TXUGCRecord.this.mBGMPlayStop = false;
                        if (TXUGCRecord.this.mBGMNotify != null) {
                            TXUGCRecord.this.mBGMNotify.onBGMStart();
                        }
                    }

                    @Override // com.tencent.liteav.audio.h
                    public void onPlayEnd(int i) {
                        if (TXUGCRecord.this.mBGMNotify != null) {
                            TXUGCRecord.this.mBGMNotify.onBGMComplete(0);
                        }
                        TXUGCRecord.this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.12.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (TXUGCRecord.this.mRecording) {
                                    TXCUGCBGMPlayer.getInstance().stopPlay();
                                    TXCUGCBGMPlayer.getInstance().playFromTime(TXUGCRecord.this.mBGMStartTime, TXUGCRecord.this.mBGMEndTime);
                                    TXCUGCBGMPlayer.getInstance().startPlay(TXUGCRecord.this.mBGMPath, true);
                                }
                            }
                        });
                    }

                    @Override // com.tencent.liteav.audio.h
                    public void onPlayProgress(long j, long j2) {
                        if (TXUGCRecord.this.mBGMNotify != null) {
                            TXUGCRecord.this.mBGMNotify.onBGMProgress(j, j2);
                        }
                    }
                };
            }
            TXCUGCBGMPlayer.getInstance().setOnPlayListener(this.mBGMNotifyProxy);
            return (int) TXCUGCBGMPlayer.getInstance().getDurationMS(str);
        }
    }

    public void setBGMNofify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMNofify is not supported in UGC_Smart license");
        } else if (iTXBGMNotify == null) {
            this.mBGMNotify = null;
        } else {
            this.mBGMNotify = iTXBGMNotify;
        }
    }

    public boolean playBGMFromTime(int i, int i2) {
        boolean z = false;
        if (isSmartLicense()) {
            TXCLog.e(TAG, "playBGMFromTime is not supported in UGC_Smart license");
            return false;
        } else if (TextUtils.isEmpty(this.mBGMPath)) {
            TXCLog.e(TAG, "playBGMFromTime, path is empty");
            return false;
        } else if (i < 0 || i2 < 0) {
            TXCLog.e(TAG, "playBGMFromTime, time is negative number");
            return false;
        } else if (i >= i2) {
            TXCLog.e(TAG, "playBGMFromTime, start time is bigger than end time");
            return false;
        } else {
            long j = i;
            this.mBGMStartTime = j;
            long j2 = i2;
            this.mBGMEndTime = j2;
            this.mBGMDeletePart = false;
            this.mTXUGCPartsManager.setPartsManagerObserver(this);
            changeRecordSpeed();
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aB);
            if (TXCAudioUGCRecorder.getInstance().isRecording()) {
                TXCAudioUGCRecorder.getInstance().enableBGMRecord(true);
            }
            TXCUGCBGMPlayer.getInstance().playFromTime(j, j2);
            TXCUGCBGMPlayer tXCUGCBGMPlayer = TXCUGCBGMPlayer.getInstance();
            String str = this.mBGMPath;
            if (TXCAudioUGCRecorder.getInstance().isRecording() && !TXCAudioUGCRecorder.getInstance().isPaused()) {
                z = true;
            }
            tXCUGCBGMPlayer.startPlay(str, z);
            return true;
        }
    }

    public boolean stopBGM() {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "stopBGM is not supported in UGC_Smart license");
            return false;
        }
        this.mBGMPath = null;
        this.mTXUGCPartsManager.removePartsManagerObserver(this);
        TXCUGCBGMPlayer.getInstance().stopPlay();
        TXCAudioUGCRecorder.getInstance().enableBGMRecord(false);
        TXCUGCBGMPlayer.getInstance().setOnPlayListener(null);
        return true;
    }

    public boolean pauseBGM() {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "pauseBGM is not supported in UGC_Smart license");
            return false;
        }
        TXCUGCBGMPlayer.getInstance().pause();
        return true;
    }

    public boolean resumeBGM() {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "resumeBGM is not supported in UGC_Smart license");
            return false;
        } else if (TextUtils.isEmpty(this.mBGMPath)) {
            TXCLog.e(TAG, "resumeBGM, mBGMPath is empty");
            return false;
        } else {
            changeRecordSpeed();
            if (this.mBGMDeletePart) {
                long longValue = this.mBgmPartBytesList.size() > 0 ? this.mBgmPartBytesList.get(this.mBgmPartBytesList.size() - 1).longValue() : 0L;
                TXCLog.i(TAG, "resumeBGM, curBGMBytesProgress = " + longValue);
                if (this.mBGMPlayStop) {
                    TXCUGCBGMPlayer.getInstance().startPlay(this.mBGMPath, TXCAudioUGCRecorder.getInstance().isRecording());
                }
                TXCAudioUGCRecorder.getInstance().clearCache();
                TXCUGCBGMPlayer.getInstance().seekBytes(longValue);
            }
            TXCUGCBGMPlayer.getInstance().resume();
            return true;
        }
    }

    public boolean seekBGM(int i, int i2) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "seekBGM is not supported in UGC_Smart license");
            return false;
        }
        TXCUGCBGMPlayer.getInstance().playFromTime(i, i2);
        return true;
    }

    public boolean setBGMVolume(float f) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMVolume is not supported in UGC_Smart license");
            return false;
        }
        TXCUGCBGMPlayer.getInstance().setVolume(f);
        return true;
    }

    public int getMusicDuration(String str) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "getMusicDuration is not supported in UGC_Smart license");
            return 0;
        }
        return (int) TXCUGCBGMPlayer.getInstance().getDurationMS(str);
    }

    public void setWatermark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setWatermark is not supported in UGC_Smart license");
            return;
        }
        if (this.mVideoPreprocessor != null && bitmap != null && tXRect != null) {
            this.mVideoPreprocessor.a(bitmap, tXRect.x, tXRect.y, tXRect.width);
        }
        this.mWatermarkBitmap = bitmap;
        this.mTxWaterMarkRect = tXRect;
    }

    @Deprecated
    public void setMotionTmpl(String str) {
        this.mBeautyManager.setMotionTmpl(str);
    }

    @Deprecated
    public void setMotionMute(boolean z) {
        this.mBeautyManager.setMotionMute(z);
    }

    @TargetApi(18)
    @Deprecated
    public void setGreenScreenFile(String str, boolean z) {
        if (Build.VERSION.SDK_INT < 18) {
            return;
        }
        getBeautyManager().setGreenScreenFile(str);
    }

    @Deprecated
    public void setFaceVLevel(int i) {
        this.mBeautyManager.setFaceVLevel(i);
    }

    @Deprecated
    public void setFaceShortLevel(int i) {
        this.mBeautyManager.setFaceShortLevel(i);
    }

    @Deprecated
    public void setChinLevel(int i) {
        this.mBeautyManager.setChinLevel(i);
    }

    @Deprecated
    public void setNoseSlimLevel(int i) {
        this.mBeautyManager.setNoseSlimLevel(i);
    }

    @Deprecated
    public void setEyeScaleLevel(float f) {
        this.mBeautyManager.setEyeScaleLevel((int) f);
    }

    @Deprecated
    public void setFaceScaleLevel(float f) {
        this.mBeautyManager.setFaceSlimLevel((int) f);
    }

    @Deprecated
    public void setBeautyStyle(int i) {
        this.mBeautyManager.setBeautyStyle(i);
    }

    @Deprecated
    public void setBeautyDepth(int i, int i2, int i3, int i4) {
        this.mBeautyManager.setBeautyStyle(i);
        this.mBeautyManager.setBeautyLevel(i2);
        this.mBeautyManager.setWhitenessLevel(i3);
        this.mBeautyManager.setRuddyLevel(i4);
    }

    @Deprecated
    public void setFilter(Bitmap bitmap) {
        getBeautyManager().setFilter(bitmap);
    }

    public void setFilter(Bitmap bitmap, float f, Bitmap bitmap2, float f2, float f3) {
        if (this.mVideoPreprocessor != null) {
            this.mVideoPreprocessor.a(f3, bitmap, f, bitmap2, f2);
        }
    }

    @Deprecated
    public void setSpecialRatio(float f) {
        this.mSpecialRadio = f;
        getBeautyManager().setFilterStrength(f);
    }

    private void setSharpenLevel(int i) {
        if (this.mVideoPreprocessor != null) {
            this.mVideoPreprocessor.f(i);
        }
    }

    public boolean toggleTorch(boolean z) {
        if (this.mCameraCapture != null) {
            this.mCameraCapture.a(z);
            return true;
        }
        return true;
    }

    public int getMaxZoom() {
        if (this.mCameraCapture == null) {
            return 0;
        }
        return this.mCameraCapture.f();
    }

    public boolean setZoom(int i) {
        if (this.mCameraCapture != null) {
            return this.mCameraCapture.b(i);
        }
        return false;
    }

    public void setFocusPosition(float f, float f2) {
        this.mTouchFocusRunnable.a(f, f2);
        this.mMainHandler.postDelayed(this.mTouchFocusRunnable, 100L);
    }

    public void setVideoRenderMode(int i) {
        if (i == 1) {
            this.mRenderMode = 1;
        } else {
            this.mRenderMode = 0;
        }
    }

    private int startCameraPreviewInternal(TXCloudVideoView tXCloudVideoView, k kVar) {
        TXCLog.i(TAG, "ugcRecord, startCameraPreviewInternal");
        this.mStartPreview.set(true);
        if (this.mTXCloudVideoView != null) {
            this.mTXCloudVideoView.removeVideoView();
            this.mTXCloudVideoView.removeFocusIndicatorView();
        }
        this.mTXCloudVideoView = tXCloudVideoView;
        initConfig();
        calcVideoEncInfo();
        initModules();
        this.mInitCompelete = false;
        this.mVideoView.setRendMode(this.mRenderMode);
        this.mVideoView.setSurfaceTextureListener(this);
        return 0;
    }

    public void setHomeOrientation(int i) {
        this.mCameraOrientationReadyChange = i;
        resetRotation();
    }

    public void setRenderRotation(int i) {
        this.mRenderRotationReadyChange = i;
        resetRotation();
    }

    private void resetRotation() {
        if (this.mVideoView != null) {
            this.mVideoView.b(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.13
                @Override // java.lang.Runnable
                public void run() {
                    if (TXUGCRecord.this.mRenderRotationReadyChange != -1) {
                        TXUGCRecord.this.mConfig.s = TXUGCRecord.this.mRenderRotationReadyChange;
                        TXUGCRecord.this.mRenderRotationReadyChange = -1;
                    }
                    if (TXUGCRecord.this.mCameraOrientationReadyChange != -1) {
                        TXUGCRecord.this.mConfig.r = TXUGCRecord.this.mCameraOrientationReadyChange;
                        TXUGCRecord.this.mCameraCapture.c(TXUGCRecord.this.mConfig.r);
                        TXUGCRecord.this.mCameraOrientationReadyChange = -1;
                    }
                }
            });
            return;
        }
        this.mConfig.s = this.mRenderRotationReadyChange;
        this.mConfig.r = this.mCameraOrientationReadyChange;
    }

    @TargetApi(16)
    private void addAudioTrack() {
        MediaFormat a2 = com.tencent.liteav.basic.util.g.a(TXCAudioUGCRecorder.getInstance().getSampleRate(), TXCAudioUGCRecorder.getInstance().getChannels(), 2);
        if (this.mMP4Muxer != null) {
            this.mMP4Muxer.b(a2);
        }
    }

    private void initModules() {
        this.mVideoView = this.mTXCloudVideoView.getGLSurfaceView();
        if (this.mVideoView == null) {
            this.mVideoView = new TXCGLSurfaceView(this.mTXCloudVideoView.getContext());
            this.mTXCloudVideoView.addVideoView(this.mVideoView);
        }
        if (this.mCameraCapture == null) {
            this.mCameraCapture = new com.tencent.liteav.capturer.a();
        }
        this.mCameraCapture.a(this.mConfig.q ? a.EnumC1450a.RESOLUTION_HIGHEST : this.mCameraResolution);
        this.mCameraCapture.a(this.mConfig.c);
        if (this.mVideoPreprocessor == null) {
            this.mVideoPreprocessor = new e(this.mContext, true);
        }
        this.mVideoPreprocessor.a((f) this);
        this.mVideoEncoder = null;
        this.mBeautyManager.setPreprocessor(this.mVideoPreprocessor);
    }

    private boolean startCapture(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            TXCLog.i(TAG, "startCapture, mCapturing = " + this.mCapturing + ", mCameraCapture = " + this.mCameraCapture);
            if (surfaceTexture == null || this.mCapturing) {
                return false;
            }
            this.mCameraCapture.a(surfaceTexture);
            this.mCameraCapture.a(this.mConfig.c);
            this.mCameraCapture.c(this.mConfig.f);
            TXCLog.i(TAG, "startCapture, setHomeOriention = " + this.mConfig.r);
            this.mCameraCapture.c(this.mConfig.r);
            if (this.mCameraCapture.d(this.mConfig.o) == 0) {
                this.mCapturing = true;
                if (this.mVideoView != null) {
                    this.mVideoView.setFPS(this.mConfig.c);
                    this.mVideoView.setSurfaceTextureListener(this);
                    this.mVideoView.setNotifyListener(this);
                    this.mVideoView.a(this.mConfig.c, true);
                }
                return true;
            }
            this.mCapturing = false;
            TXLog.e(TAG, "startCapture fail!");
            onRecordError();
            return false;
        }
    }

    private void stopEncoder(final com.tencent.liteav.videoencoder.b bVar) {
        if (this.mVideoView != null) {
            this.mVideoView.b(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bVar != null) {
                            bVar.a();
                            bVar.a((d) null);
                        }
                    } catch (Exception e) {
                        TXCLog.e(TXUGCRecord.TAG, "stop encoder failed.", e);
                    }
                }
            });
        }
    }

    private void startEncoder(int i, int i2) {
        TXCLog.i(TAG, "New encode size width = " + i + " height = " + i2 + ", mVideoView = " + this.mVideoView);
        stopEncoder(this.mVideoEncoder);
        this.mVideoEncoder = null;
        EGLContext eglGetCurrentContext = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        tXSVideoEncoderParam.fps = this.mConfig.c;
        tXSVideoEncoderParam.fullIFrame = this.mConfig.u;
        tXSVideoEncoderParam.glContext = eglGetCurrentContext;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        if (this.mUseSWEncoder) {
            this.mVideoEncoder = new com.tencent.liteav.videoencoder.b(2);
            tXSVideoEncoderParam.encoderMode = 1;
            tXSVideoEncoderParam.encoderProfile = 3;
        } else {
            this.mVideoEncoder = new com.tencent.liteav.videoencoder.b(1);
            tXSVideoEncoderParam.encoderMode = 3;
            tXSVideoEncoderParam.encoderProfile = 1;
        }
        tXSVideoEncoderParam.record = true;
        if (this.mConfig.u) {
            if (this.mUseSWEncoder) {
                this.mVideoEncoder.c(24000);
            } else {
                this.mVideoEncoder.c(15000);
            }
        } else {
            this.mVideoEncoder.c(this.mConfig.d);
        }
        tXSVideoEncoderParam.realTime = true;
        tXSVideoEncoderParam.enableBlackList = false;
        this.mVideoEncoder.a((d) this);
        this.mVideoEncoder.a(tXSVideoEncoderParam);
    }

    private void encodeFrame(int i, int i2, int i3) {
        if (this.mVideoEncoder == null || this.mVideoWidth != i2 || this.mVideoHeight != i3) {
            startEncoder(i2, i3);
        }
        this.mVideoEncoder.a(i, i2, i3, TXCTimeUtil.getTimeTick());
    }

    private void onRecordError() {
        if (this.mVideoRecordListener == null || !this.mRecording) {
            return;
        }
        this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.2
            @Override // java.lang.Runnable
            public void run() {
                TXUGCRecord.this.stopRecordForClip();
            }
        });
        TXCUGCBGMPlayer.getInstance().pause();
        this.mRecording = false;
        this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.3
            @Override // java.lang.Runnable
            public void run() {
                TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                tXRecordResult.descMsg = "record video failed";
                tXRecordResult.retCode = -1;
                if (TXUGCRecord.this.mVideoRecordListener != null) {
                    TXUGCRecord.this.mVideoRecordListener.onRecordComplete(tXRecordResult);
                }
            }
        });
    }

    private void initConfig() {
        if (this.mConfig.a >= 0) {
            switch (this.mConfig.a) {
                case 0:
                    this.mConfig.b = 0;
                    this.mConfig.g = 360;
                    this.mConfig.h = jw.h;
                    this.mConfig.d = 2400;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_360_640;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bf);
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bj, 2400, "");
                    break;
                case 1:
                    this.mConfig.b = 1;
                    this.mConfig.g = 540;
                    this.mConfig.h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    this.mConfig.d = 6500;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_540_960;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bg);
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bj, 6500, "");
                    break;
                case 2:
                    this.mConfig.b = 2;
                    this.mConfig.g = 720;
                    this.mConfig.h = 1280;
                    this.mConfig.d = 9600;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_720_1280;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bh);
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bj, 9600, "");
                    break;
                default:
                    this.mConfig.b = 1;
                    this.mConfig.g = 540;
                    this.mConfig.h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    this.mConfig.d = 6500;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_540_960;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bg);
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bj, 6500, "");
                    break;
            }
            this.mConfig.c = this.mFps;
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bk, this.mFps, "");
        } else {
            switch (this.mConfig.b) {
                case 0:
                    this.mConfig.g = 360;
                    this.mConfig.h = jw.h;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_360_640;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bf, 360, "360x640");
                    break;
                case 1:
                    this.mConfig.g = 540;
                    this.mConfig.h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_540_960;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bg, 540, "540x960");
                    break;
                case 2:
                    this.mConfig.g = 720;
                    this.mConfig.h = 1280;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_720_1280;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bh, 720, "720x1280");
                    break;
                case 3:
                    this.mConfig.g = 1080;
                    this.mConfig.h = 1920;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_HIGHEST;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bi, 1080, "1080x1920");
                    break;
                default:
                    this.mConfig.g = 540;
                    this.mConfig.h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                    this.mCameraResolution = a.EnumC1450a.RESOLUTION_540_960;
                    TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bg, 720, "720x1280");
                    break;
            }
        }
        TXCLog.w(TAG, "record:camera init record param, width:" + this.mConfig.g + ",height:" + this.mConfig.h + ",bitrate:" + this.mConfig.d + ",fps:" + this.mConfig.c);
    }

    private void calcVideoEncInfo() {
        int i;
        if (this.mConfig.h == 0) {
            return;
        }
        double d = this.mConfig.g / this.mConfig.h;
        this.mConfig.g = ((this.mConfig.g + 15) / 16) * 16;
        this.mConfig.h = ((this.mConfig.h + 15) / 16) * 16;
        double d2 = this.mConfig.g / this.mConfig.h;
        double d3 = (this.mConfig.g + 16) / this.mConfig.h;
        double d4 = (this.mConfig.g - 16) / this.mConfig.h;
        k kVar = this.mConfig;
        double d5 = d2 - d;
        double d6 = d3 - d;
        if (Math.abs(d5) < Math.abs(d6)) {
            i = Math.abs(d5) < Math.abs(d4 - d) ? this.mConfig.g : this.mConfig.g - 16;
        } else {
            i = Math.abs(d6) < Math.abs(d4 - d) ? this.mConfig.g + 16 : this.mConfig.g - 16;
        }
        kVar.g = i;
    }

    private boolean onRecordProgress(long j) {
        if (this.mRecordSpeed != 2) {
            if (this.mRecordSpeed == 3) {
                j = ((float) j) / ENCODE_SPEED_FAST;
            } else if (this.mRecordSpeed == 4) {
                j = ((float) j) / ENCODE_SPEED_FASTEST;
            } else if (this.mRecordSpeed == 1) {
                j = ((float) j) / ENCODE_SPEED_SLOW;
            } else if (this.mRecordSpeed == 0) {
                j = ((float) j) / ENCODE_SPEED_SLOWEST;
            }
        }
        this.mCurrentRecordDuration = j;
        final long duration = this.mTXUGCPartsManager.getDuration() + this.mCurrentRecordDuration;
        this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.4
            @Override // java.lang.Runnable
            public void run() {
                if (TXUGCRecord.this.mVideoRecordListener != null) {
                    TXUGCRecord.this.mVideoRecordListener.onRecordProgress(duration);
                }
            }
        });
        if (duration >= this.mMaxDuration) {
            this.isReachedMaxDuration = true;
            TXCLog.i(TAG, "onRecordProgress ReachMacDuration mMaxDuration= " + this.mMaxDuration);
            this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.5
                @Override // java.lang.Runnable
                public void run() {
                    TXUGCRecord.this.stopRecordForClip();
                }
            });
            return false;
        }
        this.isReachedMaxDuration = false;
        return true;
    }

    private int getSreenRotation() {
        return (this.mContext == null || this.mContext.getResources().getConfiguration().orientation != 2) ? 0 : 90;
    }

    private int getRecordState() {
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, minBufferSize * 100);
        short[] sArr = new short[minBufferSize];
        try {
            audioRecord.startRecording();
            if (audioRecord.getRecordingState() != 3) {
                audioRecord.stop();
                audioRecord.release();
                TXCLog.e("CheckAudioPermission", "The audio recorder is in use");
                return 1;
            } else if (audioRecord.read(sArr, 0, minBufferSize) <= 0) {
                audioRecord.stop();
                audioRecord.release();
                TXCLog.e("CheckAudioPermission", "The audio recording result is empty");
                return -1;
            } else {
                audioRecord.stop();
                audioRecord.release();
                return 0;
            }
        } catch (Exception unused) {
            audioRecord.release();
            TXCLog.e("CheckAudioPermission", "Unable to enter the initial state of audio recording");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackEvent(final int i, final Bundle bundle) {
        this.mMainHandler.post(new Runnable() { // from class: com.tencent.ugc.TXUGCRecord.6
            @Override // java.lang.Runnable
            public void run() {
                if (TXUGCRecord.this.mVideoRecordListener != null) {
                    TXUGCRecord.this.mVideoRecordListener.onRecordEvent(i, bundle);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        synchronized (this) {
            if (this.mMP4Muxer != null && this.mRecording) {
                this.mEncodePcmDataSize += 4096;
                this.mMP4Muxer.a(bArr, 0, bArr.length, j * 1000, 0);
            } else {
                TXCLog.e(TAG, "onRecordEncData err!");
            }
        }
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordError(int i, String str) {
        if (i == -1) {
            TXLog.e(TAG, "onRecordError, audio no mic permit");
            onRecordError();
        }
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.i(TAG, "ugcRecord, onSurfaceTextureAvailable, surfaceTexture = " + surfaceTexture + ", mCapturing = " + this.mCapturing + ", mStartPreview = " + this.mStartPreview.get());
        if (this.mStartPreview.get() && surfaceTexture != null) {
            if (startCapture(surfaceTexture)) {
                if (TXCAudioUGCRecorder.getInstance().isRecording()) {
                    this.mInitCompelete = true;
                    TXCLog.i(TAG, "onSurfaceTextureAvailable mInitCompelete = true");
                    return;
                } else if (getRecordState() == -1) {
                    callbackEvent(4, null);
                }
            } else {
                callbackEvent(3, null);
            }
            this.mInitCompelete = true;
        }
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        TXCLog.i(TAG, "ugcRecord, onSurfaceTextureDestroy, surfaceTexture = " + surfaceTexture + ", mCapturing = " + this.mCapturing);
        if (this.mCustomProcessListener != null) {
            this.mCustomProcessListener.onTextureDestroyed();
        }
        if (this.mVideoPreprocessor != null) {
            this.mVideoPreprocessor.b();
        }
        if (this.mVideoEncoder != null) {
            this.mVideoEncoder.a();
            this.mVideoEncoder.a((d) null);
            this.mVideoEncoder = null;
        }
    }

    @Override // com.tencent.liteav.beauty.f
    public int willAddWatermark(int i, int i2, int i3) {
        if (this.mCustomProcessListener != null) {
            i = this.mCustomProcessListener.onTextureCustomProcess(i, i2, i3);
        }
        if (this.mVideoView != null) {
            this.mVideoView.a(i, false, this.mConfig.s, i2, i3, this.mCameraCapture.i());
        }
        return i;
    }

    @Override // com.tencent.liteav.beauty.f
    public void didProcessFrame(int i, int i2, int i3, long j) {
        if (this.mRecording) {
            encodeFrame(i, i2, i3);
        }
    }

    public void didDetectFacePoints(float[] fArr) {
        if (this.mCustomProcessListener != null) {
            this.mCustomProcessListener.onDetectFacePoints(fArr);
        }
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeNAL(TXSNALPacket tXSNALPacket, int i) {
        if (i == 0) {
            synchronized (this) {
                if (this.mMP4Muxer == null) {
                    return;
                }
                if (tXSNALPacket != null && tXSNALPacket.nalData != null) {
                    if (!this.mStartMuxer) {
                        if (tXSNALPacket.nalType == 0) {
                            MediaFormat a2 = com.tencent.liteav.basic.util.g.a(tXSNALPacket.nalData, this.mVideoWidth, this.mVideoHeight);
                            if (a2 != null) {
                                this.mMP4Muxer.a(a2);
                                this.mMP4Muxer.a();
                                this.mStartMuxer = true;
                                this.mRecordStartTime = 0L;
                                TXLog.i(TAG, "onEncodeNAL, mMP4Muxer.start(), mStartMuxer = true");
                            }
                        }
                    }
                    recordVideoData(tXSNALPacket, tXSNALPacket.nalData);
                }
                return;
            }
        }
        TXCLog.e(TAG, "onEncodeNAL error: " + i);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFormat(MediaFormat mediaFormat) {
        synchronized (this) {
            TXCLog.i(TAG, "onEncodeFormat: " + mediaFormat.toString());
            if (this.mMP4Muxer != null) {
                this.mMP4Muxer.a(mediaFormat);
                if (!this.mStartMuxer) {
                    this.mMP4Muxer.a();
                    this.mStartMuxer = true;
                    TXCLog.i(TAG, "onEncodeFormat, mMP4Muxer.start(), mStartMuxer = true");
                }
            }
        }
    }

    private void recordVideoData(TXSNALPacket tXSNALPacket, byte[] bArr) {
        int i;
        if (this.mRecordStartTime == 0) {
            this.mRecordStartTime = tXSNALPacket.pts;
        }
        if (tXSNALPacket.info == null) {
            i = tXSNALPacket.nalType == 0 ? 1 : 0;
        } else {
            i = tXSNALPacket.info.flags;
        }
        if (onRecordProgress(tXSNALPacket.pts - this.mRecordStartTime)) {
            this.mMP4Muxer.b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, i);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.o
    public int onTextureProcess(int i, float[] fArr) {
        if (this.mVideoPreprocessor != null) {
            int i2 = this.mConfig.g;
            int i3 = this.mConfig.h;
            int i4 = this.mCropWidth;
            int i5 = this.mCropHeight;
            if (this.mConfig.r == 2 || this.mConfig.r == 0) {
                i2 = this.mConfig.h;
                i3 = this.mConfig.g;
                i4 = this.mCropHeight;
                i5 = this.mCropWidth;
            }
            if (this.mDisplayType != 0) {
                this.mVideoPreprocessor.a(com.tencent.liteav.basic.util.g.a(this.mCameraCapture.j(), this.mCameraCapture.k(), this.mCropHeight, this.mCropWidth));
                this.mVideoPreprocessor.a(i4, i5);
                this.mVideoView.setRendMode(1);
            } else {
                this.mVideoPreprocessor.a(com.tencent.liteav.basic.util.g.a(this.mCameraCapture.j(), this.mCameraCapture.k(), this.mConfig.h, this.mConfig.g));
                this.mVideoPreprocessor.a(i2, i3);
                this.mVideoView.setRendMode(this.mRenderMode);
            }
            this.mVideoPreprocessor.b(false);
            this.mVideoPreprocessor.a(fArr);
            this.mVideoPreprocessor.a(this.mConfig.r);
            this.mVideoPreprocessor.a(i, this.mCameraCapture.j(), this.mCameraCapture.k(), this.mCameraCapture.h(), 4, 0);
        }
        return 0;
    }

    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }
}
