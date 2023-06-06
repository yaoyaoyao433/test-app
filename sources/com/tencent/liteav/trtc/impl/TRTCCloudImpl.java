package com.tencent.liteav.trtc.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.TXCSoundEffectPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.c;
import com.tencent.liteav.audio.d;
import com.tencent.liteav.audio.e;
import com.tencent.liteav.audio.f;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.audio.h;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.basic.c.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.e;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.d;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.i;
import com.tencent.liteav.j;
import com.tencent.liteav.screencapture.a;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.liteav.u;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import com.tencent.trtc.TRTCSubCloud;
import com.unionpay.tsmservice.data.Constant;
import io.agora.rtc.internal.RtcEngineEvent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCCloudImpl extends TRTCCloud implements SurfaceHolder.Callback, TXCRenderAndDec.b, c, d, e, f, g, h, b, d.a, a.InterfaceC1461a, u {
    private static final int DEFAULT_FPS_FOR_SCREEN_CAPTURE = 10;
    private static final int DEFAULT_GOP_FOR_SCREEN_CAPTURE = 3;
    private static final String KEY_CONFIG_ADJUST_RESOLUTION = "config_adjust_resolution";
    private static final String KEY_CONFIG_FPS = "config_fps";
    private static final String KEY_CONFIG_GOP = "config_gop";
    private static final int MIN_VOLUME_EVALUATION_INTERVAL_MS = 100;
    private static final int RECV_MODE_AUTO_AUDIO_ONLY = 2;
    private static final int RECV_MODE_AUTO_AUDIO_VIDEO = 1;
    private static final int RECV_MODE_AUTO_VIDEO_ONLY = 3;
    private static final int RECV_MODE_MANUAL = 4;
    private static final int RECV_MODE_UNKNOWN = 0;
    protected static final int ROOM_STATE_ENTRING = 1;
    private static final int ROOM_STATE_IN = 2;
    protected static final int ROOM_STATE_OUT = 0;
    private static final int STATE_INTERVAL = 2000;
    private static final String TAG = "TRTCCloudImpl";
    private static TRTCCloudImpl sInstance;
    protected int mAppScene;
    private int mAudioCaptureVolume;
    public TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private int mAudioPlayoutVolume;
    public int mAudioVolumeEvalInterval;
    private TRTCCloud.BGMNotify mBGMNotify;
    private int mBackground;
    private com.tencent.liteav.basic.c.a mCallback;
    protected com.tencent.liteav.d mCaptureAndEnc;
    private long mCaptureFrameCount;
    private int mCodecType;
    protected i mConfig;
    public Context mContext;
    private int mCurrentOrientation;
    public HashMap<Integer, TRTCCloudImpl> mCurrentPublishClouds;
    public int mCurrentRole;
    private boolean mCustomRemoteRender;
    private TRTCCustomTextureUtil mCustomVideoUtil;
    protected int mDebugType;
    private TXDeviceManagerImpl mDeviceManager;
    private TXDeviceManagerImpl.TXDeviceManagerListener mDeviceManagerListener;
    private Display mDisplay;
    private boolean mEnableCustomAudioCapture;
    private boolean mEnableCustomVideoCapture;
    protected boolean mEnableEosMode;
    private boolean mEnableSmallStream;
    private boolean mEnableSoftAEC;
    private boolean mEnableSoftAGC;
    private boolean mEnableSoftANS;
    private View mFloatingWindow;
    private int mFramework;
    private boolean mIsAudioCapturing;
    public boolean mIsExitOldRoom;
    private boolean mIsVideoCapturing;
    private boolean mKeepAVCaptureWhenEnterRoomFailed;
    private long mLastCaptureCalculateTS;
    private long mLastCaptureFrameCount;
    private long mLastLogCustomCmdMsgTs;
    private long mLastLogSEIMsgTs;
    private long mLastSendMsgTimeMs;
    public long mLastStateTimeMs;
    private final Bundle mLatestParamsOfBigEncoder;
    private final Bundle mLatestParamsOfSmallEncoder;
    private Handler mListenerHandler;
    private com.tencent.liteav.basic.util.f mMainHandler;
    public Object mNativeLock;
    public long mNativeRtcContext;
    private int mNetType;
    private DisplayOrientationDetector mOrientationEventListener;
    private boolean mOverrideFPSFromUser;
    public int mPerformanceMode;
    public int mPriorStreamType;
    private int mQosMode;
    private int mQosPreference;
    private long mRecvCustomCmdMsgCountInPeriod;
    public int mRecvMode;
    private long mRecvSEIMsgCountInPeriod;
    protected HashMap<String, RenderListenerAdapter> mRenderListenerMap;
    public TRTCRoomInfo mRoomInfo;
    public int mRoomState;
    public Handler mSDKHandler;
    private int mSendMsgCount;
    private int mSendMsgSize;
    private int mSensorMode;
    private final TRTCCloudDef.TRTCVideoEncParam mSmallEncParam;
    private int mSoftAECLevel;
    private int mSoftAGCLevel;
    private int mSoftANSLevel;
    private StatusTask mStatusNotifyTask;
    private Set<Integer> mStreamTypes;
    public ArrayList<WeakReference<TRTCCloudImpl>> mSubClouds;
    private Surface mSurfaceFromTextureView;
    public TRTCCloudListener mTRTCListener;
    public int mTargetRole;
    private final TextureView.SurfaceTextureListener mTextureViewListener;
    private final TRTCVideoPreprocessListenerAdapter mVideoPreprocessListenerAdapter;
    private int mVideoRenderMirror;
    private TRTCVideoServerConfig mVideoServerConfig;
    private VideoSourceType mVideoSourceType;
    private VolumeLevelNotifyTask mVolumeLevelNotifyTask;
    final TXAudioEffectManager.TXVoiceReverbType[] reverbTypes;
    final TXAudioEffectManager.TXVoiceChangerType[] voiceChangerTypes;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum VideoSourceType {
        NONE,
        CAMERA,
        SCREEN,
        CUSTOM
    }

    private String getQosValue(int i) {
        switch (i) {
            case 0:
                return "HOLD";
            case 1:
                return Constant.TOKENIZATION_PROVIDER;
            case 2:
                return "DOWN";
            default:
                return "ERR";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNumericRoom(int i) {
        return (i == 0 || i == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeCancelDownStream(long j, long j2, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeChangeRole(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeConnectOtherRoom(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeDisconnectOtherRoom(long j);

    private native void nativeEnableBlackStream(long j, boolean z);

    private native void nativeEnableSmallStream(long j, boolean z);

    private native void nativeMuteUpstream(long j, int i, boolean z);

    private native void nativePushVideo(long j, int i, int i2, int i3, byte[] bArr, long j2, long j3, long j4, long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReenterRoom(long j, int i);

    private native int nativeRemoveUpstream(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeRequestDownStream(long j, long j2, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSendCustomCmdMsg(long j, int i, byte[] bArr, boolean z, boolean z2);

    private native void nativeSendJsonCmd(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSendSEIMsg(long j, byte[] bArr, int i);

    private native void nativeSetAllowSwitchToHighPerformanceMode(long j, boolean z);

    private native void nativeSetAudioEncodeConfiguration(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDataReportDeviceInfo(String str, String str2, int i);

    private native void nativeSetEncodedDataProcessingListener(long j, long j2);

    private native void nativeSetHeartBeatTimeoutSec(long j, int i);

    private native boolean nativeSetSEIPayloadType(long j, int i);

    private native void nativeSetVideoEncoderConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7);

    private native void nativeSetVideoQuality(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartPublishCDNStream(long j, TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartPublishing(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartSpeedTest(long j, int i, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopPublishCDNStream(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopPublishing(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopSpeedTest(long j);

    private native void nativeUpdatePrivateMapKey(long j, String str);

    private void onSendCustomCmdMsgResult(int i, int i2, int i3, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int translateStreamType(int i) {
        if (i != 7) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                    return 1;
                default:
                    return 0;
            }
        }
        return 2;
    }

    protected native int nativeAddUpstream(long j, int i);

    public native long nativeCreateContext(int i, int i2, int i3);

    public native void nativeDestroyContext(long j);

    public native int nativeEnterRoom(long j, long j2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, String str4, String str5, int i6, String str6, String str7);

    /* JADX INFO: Access modifiers changed from: protected */
    public native int nativeExitRoom(long j);

    public native void nativeInit(long j, int i, String str, String str2, byte[] bArr);

    protected native void nativeSetMixTranscodingConfig(long j, TRTCTranscodingConfigInner tRTCTranscodingConfigInner);

    public native int nativeSetPriorRemoteVideoStreamType(long j, int i);

    public native void nativeSwitchRoom(long j, long j2, String str, String str2, String str3);

    public void onAudioJitterBufferError(String str, int i, String str2) {
    }

    @Override // com.tencent.liteav.d.a
    public void onBackgroudPushStop() {
    }

    @Override // com.tencent.liteav.d.a
    public void onEncVideoFormat(MediaFormat mediaFormat) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    static /* synthetic */ long access$8608(TRTCCloudImpl tRTCCloudImpl) {
        long j = tRTCCloudImpl.mRecvSEIMsgCountInPeriod;
        tRTCCloudImpl.mRecvSEIMsgCountInPeriod = 1 + j;
        return j;
    }

    public static TRTCCloud sharedInstance(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            if (sInstance == null) {
                sInstance = new TRTCCloudImpl(context);
            }
            tRTCCloudImpl = sInstance;
        }
        return tRTCCloudImpl;
    }

    public static void destroySharedInstance() {
        synchronized (TRTCCloudImpl.class) {
            if (sInstance != null) {
                TXCLog.i(TAG, "trtc_api destroy instance self:" + sInstance.hashCode());
                sInstance.destroy();
                sInstance = null;
            }
        }
    }

    protected TRTCCloudImpl(Context context) {
        this.reverbTypes = new TXAudioEffectManager.TXVoiceReverbType[]{TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
        this.voiceChangerTypes = new TXAudioEffectManager.TXVoiceChangerType[]{TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
        this.mNativeLock = new Object();
        this.mAudioFrameListener = null;
        this.mPriorStreamType = 2;
        this.mEnableSmallStream = false;
        this.mVideoRenderMirror = 0;
        this.mCustomRemoteRender = false;
        this.mAudioVolumeEvalInterval = 0;
        this.mSmallEncParam = new TRTCCloudDef.TRTCVideoEncParam();
        this.mQosMode = 1;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mSoftAECLevel = 100;
        this.mSoftANSLevel = 100;
        this.mSoftAGCLevel = 100;
        this.mAudioCaptureVolume = 100;
        this.mAudioPlayoutVolume = 100;
        this.mCustomVideoUtil = null;
        this.mEnableCustomAudioCapture = false;
        this.mEnableCustomVideoCapture = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mLastCaptureCalculateTS = 0L;
        this.mCaptureFrameCount = 0L;
        this.mLastCaptureFrameCount = 0L;
        this.mVideoPreprocessListenerAdapter = new TRTCVideoPreprocessListenerAdapter();
        this.mPerformanceMode = 0;
        this.mCurrentOrientation = -1;
        this.mFloatingWindow = null;
        this.mOverrideFPSFromUser = false;
        this.mLatestParamsOfBigEncoder = new Bundle();
        this.mLatestParamsOfSmallEncoder = new Bundle();
        this.mFramework = 1;
        this.mTextureViewListener = new TextureView.SurfaceTextureListener() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("startLocalPreview surfaceCreated " + surfaceTexture);
                TRTCCloudImpl.this.mSurfaceFromTextureView = new Surface(surfaceTexture);
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mSurfaceFromTextureView);
                TRTCCloudImpl.this.mCaptureAndEnc.a(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TRTCCloudImpl.this.apiLog("startLocalPreview surfaceChanged %s width: %d, height: %d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
                TRTCCloudImpl.this.mCaptureAndEnc.a(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TRTCCloudImpl.this.apiLog("startLocalPreview surfaceDestroyed %s", surfaceTexture);
                TRTCCloudImpl.this.mCaptureAndEnc.a((Surface) null);
                if (TRTCCloudImpl.this.mSurfaceFromTextureView != null) {
                    TRTCCloudImpl.this.mSurfaceFromTextureView.release();
                    TRTCCloudImpl.this.mSurfaceFromTextureView = null;
                }
                return true;
            }
        };
        this.mKeepAVCaptureWhenEnterRoomFailed = false;
        this.mCallback = new com.tencent.liteav.basic.c.a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.2
            @Override // com.tencent.liteav.basic.c.a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.i(TRTCCloudImpl.TAG, "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                onEventInternal(str, i, str2, str3);
                Monitor.a(2, i, str2, str3, 0, 0);
            }

            void onEventInternal(String str, int i, String str2, String str3) {
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onWarning(String str, int i, String str2, String str3) {
                TXCLog.i(TRTCCloudImpl.TAG, "onWarning => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                onEventInternal(str, i, str2, str3);
                Monitor.a(4, i, str2, str3, 0, 0);
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.e(TRTCCloudImpl.TAG, "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str3 != null ? str3 : "");
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.a(3, i, str2, str3, 0, 0);
            }
        };
        this.mDeviceManagerListener = new TXDeviceManagerImpl.TXDeviceManagerListener() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.3
            @Override // com.tencent.liteav.device.TXDeviceManagerImpl.TXDeviceManagerListener
            public void onSwitchCamera() {
                TRTCCloudImpl.this.mConfig.m = !TRTCCloudImpl.this.mConfig.m;
                TRTCCloudImpl.this.updateOrientation();
            }
        };
        this.mSubClouds = new ArrayList<>();
        this.mCurrentPublishClouds = new HashMap<>();
        this.mVolumeLevelNotifyTask = null;
        this.mDebugType = 0;
        this.mStatusNotifyTask = null;
        this.mNetType = -1;
        this.mBackground = -1;
        init(context, null);
        TXCCommonUtil.setAppContext(this.mContext);
        TXCLog.init();
        TRTCAudioServerConfig loadFromSharedPreferences = TRTCAudioServerConfig.loadFromSharedPreferences(context);
        TXCLog.i(TAG, "audio config from shared preference: %s", loadFromSharedPreferences);
        TXCAudioEngine.CreateInstanceWithoutInitDevice(this.mContext, TXCAudioEngine.buildTRAEConfig(context, Boolean.valueOf(loadFromSharedPreferences.enableOpenSL), loadFromSharedPreferences.isLowLatencySampleRateSupported, loadFromSharedPreferences.lowLatencySampleRateBlockTime));
        TXCAudioEngine.getInstance().clean();
        TXCAudioEngine.getInstance().setAudioCaptureDataListener(this);
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.mCallback));
        TXCAudioEngine.getInstance().enableAutoRestartDevice(loadFromSharedPreferences.enableAutoRestartDevice);
        TXCAudioEngine.getInstance().setMaxSelectedPlayStreams(loadFromSharedPreferences.maxSelectedPlayStreams);
        TXCAudioEngineJNI.nativeSetAudioPlayoutTunnelEnabled(true);
        this.mCaptureAndEnc = new com.tencent.liteav.d(context);
        this.mCaptureAndEnc.j(2);
        this.mCaptureAndEnc.a(this.mConfig);
        this.mCaptureAndEnc.j(true);
        this.mCaptureAndEnc.h(true);
        this.mCaptureAndEnc.a((b) this);
        this.mCaptureAndEnc.a((d.a) this);
        this.mCaptureAndEnc.setID("18446744073709551615");
        this.mCaptureAndEnc.i(true);
        this.mDeviceManager.setCaptureAndEnc(this.mCaptureAndEnc);
        this.mDeviceManager.setDeviceManagerListener(this.mDeviceManagerListener);
        TXCKeyPointReportProxy.a(this.mContext);
        apiLog("reset audio volume");
        setAudioCaptureVolume(100);
        setAudioPlayoutVolume(100);
        TXCSoundEffectPlayer.getInstance().setSoundEffectListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TRTCCloudImpl(Context context, Handler handler) {
        this.reverbTypes = new TXAudioEffectManager.TXVoiceReverbType[]{TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
        this.voiceChangerTypes = new TXAudioEffectManager.TXVoiceChangerType[]{TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
        this.mNativeLock = new Object();
        this.mAudioFrameListener = null;
        this.mPriorStreamType = 2;
        this.mEnableSmallStream = false;
        this.mVideoRenderMirror = 0;
        this.mCustomRemoteRender = false;
        this.mAudioVolumeEvalInterval = 0;
        this.mSmallEncParam = new TRTCCloudDef.TRTCVideoEncParam();
        this.mQosMode = 1;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mSoftAECLevel = 100;
        this.mSoftANSLevel = 100;
        this.mSoftAGCLevel = 100;
        this.mAudioCaptureVolume = 100;
        this.mAudioPlayoutVolume = 100;
        this.mCustomVideoUtil = null;
        this.mEnableCustomAudioCapture = false;
        this.mEnableCustomVideoCapture = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mLastCaptureCalculateTS = 0L;
        this.mCaptureFrameCount = 0L;
        this.mLastCaptureFrameCount = 0L;
        this.mVideoPreprocessListenerAdapter = new TRTCVideoPreprocessListenerAdapter();
        this.mPerformanceMode = 0;
        this.mCurrentOrientation = -1;
        this.mFloatingWindow = null;
        this.mOverrideFPSFromUser = false;
        this.mLatestParamsOfBigEncoder = new Bundle();
        this.mLatestParamsOfSmallEncoder = new Bundle();
        this.mFramework = 1;
        this.mTextureViewListener = new TextureView.SurfaceTextureListener() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("startLocalPreview surfaceCreated " + surfaceTexture);
                TRTCCloudImpl.this.mSurfaceFromTextureView = new Surface(surfaceTexture);
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mSurfaceFromTextureView);
                TRTCCloudImpl.this.mCaptureAndEnc.a(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TRTCCloudImpl.this.apiLog("startLocalPreview surfaceChanged %s width: %d, height: %d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
                TRTCCloudImpl.this.mCaptureAndEnc.a(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TRTCCloudImpl.this.apiLog("startLocalPreview surfaceDestroyed %s", surfaceTexture);
                TRTCCloudImpl.this.mCaptureAndEnc.a((Surface) null);
                if (TRTCCloudImpl.this.mSurfaceFromTextureView != null) {
                    TRTCCloudImpl.this.mSurfaceFromTextureView.release();
                    TRTCCloudImpl.this.mSurfaceFromTextureView = null;
                }
                return true;
            }
        };
        this.mKeepAVCaptureWhenEnterRoomFailed = false;
        this.mCallback = new com.tencent.liteav.basic.c.a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.2
            @Override // com.tencent.liteav.basic.c.a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.i(TRTCCloudImpl.TAG, "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                onEventInternal(str, i, str2, str3);
                Monitor.a(2, i, str2, str3, 0, 0);
            }

            void onEventInternal(String str, int i, String str2, String str3) {
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onWarning(String str, int i, String str2, String str3) {
                TXCLog.i(TRTCCloudImpl.TAG, "onWarning => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                onEventInternal(str, i, str2, str3);
                Monitor.a(4, i, str2, str3, 0, 0);
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.e(TRTCCloudImpl.TAG, "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str3 != null ? str3 : "");
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.a(3, i, str2, str3, 0, 0);
            }
        };
        this.mDeviceManagerListener = new TXDeviceManagerImpl.TXDeviceManagerListener() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.3
            @Override // com.tencent.liteav.device.TXDeviceManagerImpl.TXDeviceManagerListener
            public void onSwitchCamera() {
                TRTCCloudImpl.this.mConfig.m = !TRTCCloudImpl.this.mConfig.m;
                TRTCCloudImpl.this.updateOrientation();
            }
        };
        this.mSubClouds = new ArrayList<>();
        this.mCurrentPublishClouds = new HashMap<>();
        this.mVolumeLevelNotifyTask = null;
        this.mDebugType = 0;
        this.mStatusNotifyTask = null;
        this.mNetType = -1;
        this.mBackground = -1;
        init(context, handler);
        this.mCurrentRole = 21;
        this.mTargetRole = 21;
    }

    private void init(Context context, Handler handler) {
        this.mCurrentPublishClouds.put(2, this);
        this.mCurrentPublishClouds.put(3, this);
        this.mCurrentPublishClouds.put(7, this);
        this.mCurrentPublishClouds.put(1, this);
        this.mContext = context.getApplicationContext();
        this.mConfig = new i();
        this.mConfig.k = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_640_360;
        this.mConfig.X = 90;
        this.mConfig.j = 0;
        this.mConfig.P = true;
        this.mConfig.h = 15;
        this.mConfig.K = false;
        this.mConfig.T = false;
        this.mConfig.U = false;
        this.mConfig.a = 368;
        this.mConfig.b = jw.h;
        this.mConfig.c = 750;
        this.mConfig.e = 0;
        this.mConfig.W = false;
        this.mRoomInfo = new TRTCRoomInfo();
        this.mRoomInfo.bigEncSize.a = 368;
        this.mRoomInfo.bigEncSize.b = jw.h;
        this.mMainHandler = new com.tencent.liteav.basic.util.f(context.getMainLooper());
        this.mListenerHandler = new Handler(context.getMainLooper());
        if (handler != null) {
            this.mSDKHandler = handler;
        } else {
            HandlerThread handlerThread = new HandlerThread("TRTCCloudApi");
            handlerThread.start();
            this.mSDKHandler = new Handler(handlerThread.getLooper());
        }
        this.mDeviceManager = new TXDeviceManagerImpl(this.mSDKHandler);
        this.mStatusNotifyTask = new StatusTask(this);
        this.mLastSendMsgTimeMs = 0L;
        this.mSendMsgCount = 0;
        this.mSendMsgSize = 0;
        this.mSensorMode = 2;
        this.mAppScene = 0;
        this.mQosPreference = 2;
        this.mQosMode = 1;
        this.mOrientationEventListener = new DisplayOrientationDetector(this.mContext, this);
        this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.mRenderListenerMap = new HashMap<>();
        this.mStreamTypes = new HashSet();
        synchronized (this.mNativeLock) {
            int[] sDKVersion = TXCCommonUtil.getSDKVersion();
            this.mNativeRtcContext = nativeCreateContext(sDKVersion.length > 0 ? sDKVersion[0] : 0, sDKVersion.length >= 2 ? sDKVersion[1] : 0, sDKVersion.length >= 3 ? sDKVersion[2] : 0);
        }
        apiLog("trtc cloud create");
        this.mRoomState = 0;
        this.mVideoSourceType = VideoSourceType.NONE;
        this.mIsAudioCapturing = false;
        this.mIsVideoCapturing = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mRecvMode = 1;
        this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_GOP, this.mConfig.i);
        this.mLatestParamsOfSmallEncoder.putInt(KEY_CONFIG_GOP, this.mConfig.i);
        identifyTRTCFrameworkType();
        this.mVideoServerConfig = TRTCVideoServerConfig.loadFromSharedPreferences(context);
    }

    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TXCAudioEngineJNI.nativeSetAudioPlayoutTunnelEnabled(false);
                synchronized (TRTCCloudImpl.this.mNativeLock) {
                    if (TRTCCloudImpl.this.mNativeRtcContext != 0) {
                        TRTCCloudImpl.this.apiLog("destroy context");
                        TRTCCloudImpl.this.nativeDestroyContext(TRTCCloudImpl.this.mNativeRtcContext);
                    }
                    TRTCCloudImpl.this.mNativeRtcContext = 0L;
                }
                TRTCCloudImpl.this.mTRTCListener = null;
                TRTCCloudImpl.this.mAudioFrameListener = null;
                TRTCCloudImpl.this.setAudioCaptureVolume(100);
                TRTCCloudImpl.this.setAudioPlayoutVolume(100);
                TXCSoundEffectPlayer.getInstance().setSoundEffectListener(null);
                TXCAudioEngine.getInstance().clean();
                synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                    TRTCCloudImpl.this.mCurrentPublishClouds.clear();
                }
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl = it.next().get();
                    if (tRTCCloudImpl != null) {
                        tRTCCloudImpl.destroy();
                    }
                }
                TRTCCloudImpl.this.mSubClouds.clear();
                com.tencent.liteav.audio.a.a().a(TRTCCloudImpl.this.hashCode());
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListener(final TRTCCloudListener tRTCCloudListener) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.5
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setListener " + tRTCCloudListener);
                TRTCCloudImpl.this.mTRTCListener = tRTCCloudListener;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        apiLog("setListenerHandler " + handler);
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl = it.next().get();
                    if (tRTCCloudImpl != null) {
                        tRTCCloudImpl.setListenerHandler(TRTCCloudImpl.this.mListenerHandler);
                    } else {
                        it.remove();
                    }
                }
            }
        });
    }

    void extractBizInfo(JSONObject jSONObject, String str, StringBuilder sb) {
        if (str.equals("strGroupId")) {
            sb.append(jSONObject.optString("strGroupId").toString());
            jSONObject.remove("strGroupId");
            jSONObject.remove("Role");
        }
        apiLog("extractBizInfo: key" + str + " value:" + sb.toString());
    }

    private void identifyTRTCFrameworkType() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (className.contains("TUIKitImpl")) {
                    TXCLog.i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 6;
                    return;
                } else if (className.contains("WXTRTCCloud")) {
                    TXCLog.i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 3;
                    return;
                } else if (className.contains("TRTCCloudPlugin")) {
                    TXCLog.i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 7;
                    return;
                } else {
                    if (className.contains("TRTCMeetingImpl") || className.contains("TRTCLiveRoomImpl") || className.contains("TRTCAudioCallImpl") || className.contains("TRTCVideoCallImpl") || className.contains("TRTCVoiceRoomImpl") || className.contains("TRTCAVCallImpl")) {
                        TXCLog.i(TAG, "identifyTRTCFrameworkType callName:" + className);
                        this.mFramework = 5;
                    }
                }
            }
        } catch (Exception e) {
            TXCLog.e(TAG, "identifyTRTCFrameworkType catch exception:" + e.getCause());
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, final int i) {
        String str;
        if (tRTCParams == null) {
            apiLog("enter room, param nil!");
            onEnterRoom(TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL, "enter room param null");
            return;
        }
        final TRTCCloudDef.TRTCParams tRTCParams2 = new TRTCCloudDef.TRTCParams(tRTCParams);
        if (tRTCParams2.sdkAppId == 0 || TextUtils.isEmpty(tRTCParams2.userId) || TextUtils.isEmpty(tRTCParams2.userSig)) {
            apiLog("enterRoom param invalid:" + tRTCParams2);
            if (tRTCParams2.sdkAppId == 0) {
                onEnterRoom(TXLiteAVCode.ERR_SDK_APPID_INVALID, "enter room sdkAppId invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userSig)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_SIG_INVALID, "enter room userSig invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userId)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_ID_INVALID, "enter room userId invalid.");
                return;
            }
            return;
        }
        final long j = tRTCParams2.roomId & 4294967295L;
        str = "";
        String str2 = tRTCParams2.businessInfo;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0 || (tRTCParams2.roomId == -1 && !TextUtils.isEmpty(str2))) {
            str = i2 == 0 ? tRTCParams2.strRoomId : "";
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    StringBuilder sb = new StringBuilder("");
                    extractBizInfo(jSONObject, "strGroupId", sb);
                    if (tRTCParams2.roomId == -1) {
                        str = sb.toString();
                    }
                    str2 = "";
                    if (jSONObject.length() != 0) {
                        str2 = jSONObject.toString();
                    }
                } catch (Exception unused) {
                    apiLog("enter room, room id error, busInfo " + tRTCParams2.businessInfo);
                    str = "";
                    str2 = "";
                }
            }
            if (TextUtils.isEmpty(str)) {
                onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
                return;
            }
        }
        final String str3 = str;
        final String str4 = str2;
        TXCKeyPointReportProxy.a((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY);
        final int i3 = tRTCParams2.role;
        final long currentTimeMillis = System.currentTimeMillis();
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.7
            @Override // java.lang.Runnable
            public void run() {
                String str5;
                int i4;
                int i5;
                int i6;
                String str6 = tRTCParams2.userId;
                int i7 = tRTCParams2.sdkAppId;
                if (TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j);
                    str5 = sb2.toString();
                } else {
                    str5 = str3;
                }
                Monitor.a(str6, i7, str5);
                boolean z = true;
                if (TRTCCloudImpl.this.mRoomState != 0) {
                    if ((!TextUtils.isEmpty(str3) && str3.equalsIgnoreCase(TRTCCloudImpl.this.mRoomInfo.strRoomId)) || (TRTCCloudImpl.this.mRoomInfo.roomId == j && j != 0 && j != -1)) {
                        TRTCCloudImpl.this.apiLog(String.format("enter the same room[%d] again!!!", Long.valueOf(j)));
                        TRTCCloudImpl.this.mRoomInfo.enterTime = currentTimeMillis;
                        TRTCCloudImpl.this.onEnterRoom(0, "enter the same room.");
                        return;
                    }
                    TRTCCloudImpl.this.apiLog(String.format("enter another room[%d] when in room[%d], exit the old room!!!", Long.valueOf(j), Long.valueOf(TRTCCloudImpl.this.mRoomInfo.roomId)));
                    TRTCCloudImpl.this.mIsExitOldRoom = true;
                    TRTCCloudImpl.this.exitRoom();
                }
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog(String.format("============= SDK Version:%s Device Name:%s System Version:%s =============", TXCCommonUtil.getSDKVersionStr(), com.tencent.liteav.basic.util.g.c(), com.tencent.liteav.basic.util.g.d()));
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog(String.format("enterRoom roomId:%d(%s)  userId:%s sdkAppId:%d scene:%d, bizinfo:%s", Long.valueOf(j), str3, tRTCParams2.userId, Integer.valueOf(tRTCParams2.sdkAppId), Integer.valueOf(i), str4));
                String str7 = "enterRoom self:" + TRTCCloudImpl.this.hashCode();
                int i8 = i;
                String str8 = "VideoCall";
                switch (i) {
                    case 0:
                        str8 = "VideoCall";
                        i4 = i8;
                        i5 = 1;
                        break;
                    case 1:
                        str8 = "Live";
                        i4 = i8;
                        i5 = 2;
                        break;
                    case 2:
                        str8 = "AudioCall";
                        i5 = 1;
                        i4 = 0;
                        break;
                    case 3:
                        str8 = "VoiceChatRoom";
                        i5 = 2;
                        i4 = 1;
                        break;
                    default:
                        TXCLog.w(TRTCCloudImpl.TAG, "enter room scene:%u error! default to VideoCall! " + i + " self:" + TRTCCloudImpl.this.hashCode());
                        i5 = 2;
                        i4 = 0;
                        break;
                }
                TXCAudioEngine.getInstance().setAudioQuality(i5, 1);
                Object[] objArr = new Object[4];
                objArr[0] = str4;
                objArr[1] = str8;
                objArr[2] = i3 == 20 ? "Anchor" : "Audience";
                objArr[3] = tRTCParams2.streamId;
                Monitor.a(1, str7, String.format("bussInfo:%s, appScene:%s, role:%s, streamid:%s", objArr), 0);
                if (TRTCCloudImpl.this.mAudioFrameListener != null) {
                    TXCAudioEngine.setPlayoutDataListener(this);
                }
                TXCEventRecorderProxy.a("18446744073709551615", 5001, j, -1L, "", 0);
                TXCStatus.a("18446744073709551615", 10003, com.tencent.liteav.basic.util.g.c());
                TRTCCloudImpl.this.mRoomState = 1;
                if (TRTCCloudImpl.this.mNativeRtcContext == 0) {
                    int[] sDKVersion = TXCCommonUtil.getSDKVersion();
                    TRTCCloudImpl.this.mNativeRtcContext = TRTCCloudImpl.this.nativeCreateContext(sDKVersion.length > 0 ? sDKVersion[0] : 0, sDKVersion.length >= 2 ? sDKVersion[1] : 0, sDKVersion.length >= 3 ? sDKVersion[2] : 0);
                }
                TRTCCloudImpl.this.updateAppScene(i4);
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
                if (i == 0 && TRTCCloudImpl.this.mCodecType == 2) {
                    i6 = 1;
                } else {
                    z = false;
                    i6 = 0;
                }
                TRTCCloudImpl.this.mCaptureAndEnc.h(z);
                TRTCCloudImpl.this.setVideoQuality(TRTCCloudImpl.this.mQosMode, TRTCCloudImpl.this.mQosPreference);
                TRTCCloudImpl.this.setVideoEncConfig(2, TRTCCloudImpl.this.mRoomInfo.bigEncSize.a, TRTCCloudImpl.this.mRoomInfo.bigEncSize.b, TRTCCloudImpl.this.mConfig.h, TRTCCloudImpl.this.mConfig.c, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mConfig.e);
                if (TRTCCloudImpl.this.mEnableSmallStream) {
                    TRTCCloudImpl.this.setVideoEncConfig(3, TRTCCloudImpl.this.mRoomInfo.smallEncSize.a, TRTCCloudImpl.this.mRoomInfo.smallEncSize.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                } else {
                    TRTCCloudImpl.this.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, TRTCCloudImpl.this.mConfig.p, 0);
                }
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mEnableSmallStream, TRTCCloudImpl.this.mRoomInfo.smallEncSize.a, TRTCCloudImpl.this.mRoomInfo.smallEncSize.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mConfig.i);
                String d = com.tencent.liteav.basic.util.g.d();
                String c = com.tencent.liteav.basic.util.g.c();
                TRTCCloudImpl.this.nativeSetDataReportDeviceInfo(c, d, tRTCParams2.sdkAppId);
                TXCKeyPointReportProxy.a aVar = new TXCKeyPointReportProxy.a();
                aVar.d = i;
                aVar.e = c;
                aVar.f = d;
                aVar.h = TRTCCloudImpl.this.mContext != null ? TRTCCloudImpl.this.mContext.getPackageName() : "";
                aVar.b = tRTCParams2.sdkAppId;
                aVar.g = TXCCommonUtil.getSDKVersionStr();
                aVar.c = TRTCCloudImpl.this.mFramework;
                TXCKeyPointReportProxy.a(aVar);
                TRTCCloudImpl.this.nativeSetPriorRemoteVideoStreamType(TRTCCloudImpl.this.mNativeRtcContext, TRTCCloudImpl.this.mPriorStreamType);
                TRTCCloudImpl.this.nativeInit(TRTCCloudImpl.this.mNativeRtcContext, tRTCParams2.sdkAppId, tRTCParams2.userId, tRTCParams2.userSig, TRTCCloudImpl.this.mRoomInfo.getToken(TRTCCloudImpl.this.mContext));
                for (Integer num : TRTCCloudImpl.this.mStreamTypes) {
                    TRTCCloudImpl.this.addUpStreamType(num.intValue());
                }
                TRTCCloudImpl.this.enableNetworkSmallStream(TRTCCloudImpl.this.mEnableSmallStream);
                TRTCCloudImpl.this.enableNetworkBlackStream(TRTCCloudImpl.this.mCaptureAndEnc.j());
                String str9 = tRTCParams2.privateMapKey != null ? tRTCParams2.privateMapKey : "";
                String str10 = str3 != null ? str3 : "";
                TRTCCloudImpl.this.nativeEnterRoom(TRTCCloudImpl.this.mNativeRtcContext, j, str4 != null ? str4 : "", str9, str10, i3, 255, i6, i, TRTCCloudImpl.this.mPerformanceMode, com.tencent.liteav.basic.util.g.c(), com.tencent.liteav.basic.util.g.d(), TRTCCloudImpl.this.mRecvMode, tRTCParams2.userDefineRecordId != null ? tRTCParams2.userDefineRecordId : "", tRTCParams2.streamId != null ? tRTCParams2.streamId : "");
                TRTCCloudImpl.this.mCurrentRole = i3;
                TRTCCloudImpl.this.mTargetRole = i3;
                if (TRTCCloudImpl.this.mCurrentRole == 21 && (TRTCCloudImpl.this.mEnableCustomAudioCapture || TRTCCloudImpl.this.mIsAudioCapturing || TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE)) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore upstream for audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore upstream for audience, when enter room!!");
                }
                TRTCCloudImpl.this.mCaptureAndEnc.f();
                TRTCCloudImpl.this.startCollectStatus();
                TRTCCloudImpl.this.mLastStateTimeMs = 0L;
                TRTCCloudImpl.this.mRoomInfo.init(j, tRTCParams2.userId);
                TRTCCloudImpl.this.mRoomInfo.strRoomId = str10;
                TRTCCloudImpl.this.mRoomInfo.sdkAppId = tRTCParams2.sdkAppId;
                TRTCCloudImpl.this.mRoomInfo.userSig = tRTCParams2.userSig;
                TRTCCloudImpl.this.mRoomInfo.privateMapKey = str9;
                TRTCCloudImpl.this.mRoomInfo.enterTime = currentTimeMillis;
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextPitchAlignment, TRTCCloudImpl.this.mConfig.a, TRTCCloudImpl.this.mConfig.b, "", 2);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextRotationAlignment, TRTCCloudImpl.this.mConfig.h, -1L, "", 2);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextField, TRTCCloudImpl.this.mConfig.c, -1L, "", 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.8
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.exitRoomInternal(true, "call from api");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void clearRemoteMuteStates() {
        this.mRoomInfo.muteRemoteAudio = TRTCRoomInfo.TRTCRemoteMuteState.UNSET;
        this.mRoomInfo.muteRemoteVideo = false;
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.9
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                userInfo.mainRender.muteAudio = TRTCRoomInfo.TRTCRemoteMuteState.UNSET;
                userInfo.mainRender.muteVideo = false;
            }
        });
    }

    protected void exitRoomInternal(boolean z, String str) {
        String format = String.format(Locale.ENGLISH, "exitRoom %s, self: %d, reason: %s", Long.valueOf(this.mRoomInfo.getRoomId()), Integer.valueOf(hashCode()), str);
        apiLog(format);
        Monitor.a(1, format, "", 0);
        if (this.mRoomState == 0 && !this.mKeepAVCaptureWhenEnterRoomFailed) {
            clearRemoteMuteStates();
            Monitor.a();
            apiLog("exitRoom ignore when no in room.");
            return;
        }
        this.mRoomState = 0;
        this.mCaptureAndEnc.g();
        TXCSoundEffectPlayer.getInstance().stopAllEffect();
        stopCollectStatus();
        startVolumeLevelCal(false);
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.10
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                TRTCCloudImpl.this.stopRemoteRender(userInfo);
                com.tencent.liteav.audio.a.a().a(String.valueOf(userInfo.tinyID), TRTCCloudImpl.this.hashCode());
                if (userInfo.mainRender.render != null) {
                    userInfo.mainRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
                }
                if (userInfo.subRender.render != null) {
                    userInfo.subRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
                }
            }
        });
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setPlayoutDataListener(null);
        enableVideoStream(false);
        enableAudioStream(false);
        if (z) {
            nativeExitRoom(this.mNativeRtcContext);
        }
        enableAudioEarMonitoring(false);
        stopLocalAudio();
        stopBGM();
        TXCKeyPointReportProxy.a(31004);
        stopLocalPreview();
        stopScreenCapture();
        TXCKeyPointReportProxy.b(31004, 0);
        this.mConfig.A = null;
        this.mConfig.C = 10;
        this.mRoomInfo.clear();
        this.mRenderListenerMap.clear();
        this.mVideoSourceType = VideoSourceType.NONE;
        this.mEnableSmallStream = false;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mCaptureAndEnc.a(false);
        TXCAudioEngine.getInstance().muteLocalAudio(false);
        TXCAudioEngine.getInstance().clean();
        enableCustomAudioCapture(false);
        enableCustomVideoCapture(false);
        synchronized (this) {
            if (this.mCustomVideoUtil != null) {
                this.mCustomVideoUtil.release();
                this.mCustomVideoUtil = null;
            }
        }
        this.mCaptureAndEnc.a((u) null, 0);
        stopAudioRecording();
        TXCSoundEffectPlayer.getInstance().clearCache();
        Monitor.a();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.11
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("ConnectOtherRoom " + str);
                Monitor.a(1, String.format("ConnectOtherRoom param:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.nativeConnectOtherRoom(TRTCCloudImpl.this.mNativeRtcContext, str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.12
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("DisconnectOtherRoom");
                Monitor.a(1, "DisconnectOtherRoom self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.nativeDisconnectOtherRoom(TRTCCloudImpl.this.mNativeRtcContext);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(final boolean z, final boolean z2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.13
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mRecvMode = 0;
                if (z && z2) {
                    TRTCCloudImpl.this.mRecvMode = 1;
                } else if (z) {
                    TRTCCloudImpl.this.mRecvMode = 2;
                } else if (z2) {
                    TRTCCloudImpl.this.mRecvMode = 3;
                } else {
                    TRTCCloudImpl.this.mRecvMode = 4;
                }
                String str = String.format("setDefaultStreamRecvMode audio:%b, video:%b", Boolean.valueOf(z), Boolean.valueOf(z2)) + " self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.a(1, str, "", 0);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.14
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("switchRole:" + i);
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                objArr[0] = i == 20 ? "Anchor" : "Audience";
                sb.append(String.format("switchRole:%s", objArr));
                sb.append(" self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                Monitor.a(1, sb.toString(), "", 0);
                TRTCCloudImpl.this.mTargetRole = i;
                TRTCCloudImpl.this.nativeChangeRole(TRTCCloudImpl.this.mNativeRtcContext, i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        final TRTCSubCloud tRTCSubCloud = new TRTCSubCloud(this.mContext, new WeakReference(this), this.mSDKHandler);
        tRTCSubCloud.setListenerHandler(this.mListenerHandler);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.15
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mSubClouds.add(new WeakReference<>(tRTCSubCloud));
            }
        });
        return tRTCSubCloud;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(final TRTCCloud tRTCCloud) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.16
            @Override // java.lang.Runnable
            public void run() {
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl = it.next().get();
                    if (tRTCCloudImpl != null && tRTCCloudImpl == tRTCCloud) {
                        tRTCCloudImpl.destroy();
                        it.remove();
                        return;
                    }
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(final TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.17
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                sb.append(String.format("switchRoom roomId:%d, strRoomId:%s", Integer.valueOf(tRTCSwitchRoomConfig.roomId), tRTCSwitchRoomConfig.strRoomId));
                sb.append(" self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                String sb2 = sb.toString();
                TRTCCloudImpl.this.apiLog(sb2);
                Monitor.a(1, sb2, "", 0);
                if (TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) || !TextUtils.isEmpty(tRTCSwitchRoomConfig.strRoomId)) {
                    if ((TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) && tRTCSwitchRoomConfig.roomId == TRTCCloudImpl.this.mRoomInfo.roomId) || (!TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) && tRTCSwitchRoomConfig.strRoomId == TRTCCloudImpl.this.mRoomInfo.strRoomId)) {
                        TRTCCloudImpl.this.apiLog("Switch room to the same one");
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.17.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (TRTCCloudImpl.this.mTRTCListener != null) {
                                    TRTCCloudImpl.this.mTRTCListener.onSwitchRoom(0, "Switch room to the same one");
                                }
                            }
                        });
                        return;
                    }
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.17.3
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                            TRTCCloudImpl.this.stopRemoteRender(userInfo);
                            com.tencent.liteav.audio.a.a().a(String.valueOf(userInfo.tinyID), TRTCCloudImpl.this.hashCode());
                            if (userInfo.mainRender.render != null) {
                                userInfo.mainRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
                            }
                            if (userInfo.subRender.render != null) {
                                userInfo.subRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
                            }
                        }
                    });
                    TRTCCloudImpl.this.mRoomInfo.clearUserList();
                    String str = "";
                    String str2 = "";
                    String str3 = "";
                    if (TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId)) {
                        i = tRTCSwitchRoomConfig.roomId;
                        TRTCCloudImpl.this.mRoomInfo.roomId = tRTCSwitchRoomConfig.roomId;
                        TRTCCloudImpl.this.mRoomInfo.strRoomId = "";
                    } else if (!TextUtils.isEmpty(tRTCSwitchRoomConfig.strRoomId)) {
                        TRTCCloudImpl.this.mRoomInfo.strRoomId = tRTCSwitchRoomConfig.strRoomId;
                        TRTCCloudImpl.this.mRoomInfo.roomId = -1L;
                        str = tRTCSwitchRoomConfig.strRoomId;
                    }
                    String str4 = str;
                    if (!TextUtils.isEmpty(tRTCSwitchRoomConfig.userSig)) {
                        TRTCCloudImpl.this.mRoomInfo.userSig = tRTCSwitchRoomConfig.userSig;
                        str2 = tRTCSwitchRoomConfig.userSig;
                    }
                    String str5 = str2;
                    if (!TextUtils.isEmpty(tRTCSwitchRoomConfig.privateMapKey)) {
                        TRTCCloudImpl.this.mRoomInfo.privateMapKey = tRTCSwitchRoomConfig.privateMapKey;
                        str3 = tRTCSwitchRoomConfig.privateMapKey;
                    }
                    TRTCCloudImpl.this.nativeSwitchRoom(TRTCCloudImpl.this.mNativeRtcContext, i, str4, str5, str3);
                    return;
                }
                TRTCCloudImpl.this.apiLog("Switch room failed with invalid room id");
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.17.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TRTCCloudImpl.this.mTRTCListener != null) {
                            TRTCCloudImpl.this.mTRTCListener.onSwitchRoom(TXLiteAVCode.ERR_ROOM_ENTER_FAIL, "Invalid room id");
                        }
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(final boolean z, final TXCloudVideoView tXCloudVideoView) {
        this.mDeviceManager.setFrontCamera(z);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.18
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE;
                if (z2) {
                    TRTCCloudImpl.this.apiLog("startLocalPreview just reset view when is started");
                }
                if (TRTCCloudImpl.this.mCurrentRole == 21) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.18.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore start local preview,for role audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore startLocalPreview for audience");
                }
                StringBuilder sb = new StringBuilder("startLocalPreview front:");
                sb.append(z);
                sb.append(", view:");
                sb.append(tXCloudVideoView != null ? Integer.valueOf(tXCloudVideoView.hashCode()) : "");
                sb.append(StringUtil.SPACE);
                sb.append(TRTCCloudImpl.this.hashCode());
                String sb2 = sb.toString();
                TRTCCloudImpl.this.apiLog(sb2);
                Monitor.a(1, sb2, "", 0);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerHeight, 2L, -1L, "", 2);
                TRTCCloudImpl.this.mRoomInfo.localView = tXCloudVideoView;
                TRTCCloudImpl.this.mConfig.m = z;
                TRTCCloudImpl.this.mConfig.U = TRTCCloudImpl.this.mPerformanceMode == 1;
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
                TXCKeyPointReportProxy.a(40046, 1, 2);
                TRTCCloudImpl.this.mIsVideoCapturing = true;
                TRTCCloudImpl.this.mOrientationEventListener.enable();
                TRTCCloudImpl.this.updateOrientation();
                TRTCCloudImpl.this.enableVideoStream(true);
                final SurfaceView surfaceView = tXCloudVideoView != null ? tXCloudVideoView.getSurfaceView() : null;
                final TextureView hWVideoView = tXCloudVideoView != null ? tXCloudVideoView.getHWVideoView() : null;
                if (surfaceView != null || hWVideoView != null) {
                    if (!z2 && TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.NONE) {
                        TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.CAMERA;
                        TRTCCloudImpl.this.mCaptureAndEnc.a((TXCloudVideoView) null);
                    } else {
                        TRTCCloudImpl.this.apiLog("startLocalPreview with surface view when is started");
                    }
                } else if (!z2 && TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.NONE) {
                    TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.CAMERA;
                    TRTCCloudImpl.this.mCaptureAndEnc.a(tXCloudVideoView);
                } else {
                    TRTCCloudImpl.this.apiLog("startLocalPreview with view view when is started");
                }
                final Surface[] surfaceArr = new Surface[1];
                final com.tencent.liteav.basic.util.e eVar = new com.tencent.liteav.basic.util.e();
                TRTCCloudImpl.this.runOnMainThreadAndWaitDone(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.18.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (surfaceView != null) {
                            SurfaceHolder holder = surfaceView.getHolder();
                            holder.removeCallback(TRTCCloudImpl.this);
                            holder.addCallback(TRTCCloudImpl.this);
                            if (holder.getSurface().isValid()) {
                                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                                tRTCCloudImpl.apiLog("startLocalPreview with valid surface " + holder.getSurface() + " width " + surfaceView.getWidth() + ", height " + surfaceView.getHeight());
                                surfaceArr[0] = holder.getSurface();
                                eVar.a = surfaceView.getWidth();
                                eVar.b = surfaceView.getHeight();
                            } else {
                                TRTCCloudImpl.this.apiLog("startLocalPreview with surfaceView add callback");
                            }
                        }
                        if (hWVideoView != null) {
                            SurfaceTexture surfaceTexture = hWVideoView.getSurfaceTexture();
                            hWVideoView.setSurfaceTextureListener(TRTCCloudImpl.this.mTextureViewListener);
                            if (surfaceTexture != null) {
                                TRTCCloudImpl.this.mSurfaceFromTextureView = new Surface(surfaceTexture);
                                surfaceArr[0] = TRTCCloudImpl.this.mSurfaceFromTextureView;
                                eVar.a = hWVideoView.getWidth();
                                eVar.b = hWVideoView.getHeight();
                                TRTCCloudImpl.this.apiLog("startLocalPreview with TextureView, SurfaceTexture: %s, width: %d, height: %d", surfaceTexture, Integer.valueOf(eVar.a), Integer.valueOf(eVar.b));
                            } else {
                                TRTCCloudImpl.this.apiLog("startLocalPreview with textureView add callback");
                            }
                        }
                        if (tXCloudVideoView != null) {
                            tXCloudVideoView.showVideoDebugLog(TRTCCloudImpl.this.mDebugType);
                            if (TRTCCloudImpl.this.mRoomInfo.debugMargin != null) {
                                tXCloudVideoView.setLogMarginRatio(TRTCCloudImpl.this.mRoomInfo.debugMargin.leftMargin, TRTCCloudImpl.this.mRoomInfo.debugMargin.rightMargin, TRTCCloudImpl.this.mRoomInfo.debugMargin.topMargin, TRTCCloudImpl.this.mRoomInfo.debugMargin.bottomMargin);
                            }
                        }
                    }
                });
                if (surfaceArr[0] != null) {
                    TRTCCloudImpl.this.mCaptureAndEnc.a(surfaceArr[0]);
                    TRTCCloudImpl.this.mCaptureAndEnc.a(eVar.a, eVar.b);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.19
            @Override // java.lang.Runnable
            public void run() {
                String str = "stopLocalPreview self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.a(1, str, "", 0);
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.CAMERA) {
                    TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.NONE;
                    TRTCCloudImpl.this.mCaptureAndEnc.d(true);
                }
                if (TRTCCloudImpl.this.mRoomInfo.localView != null) {
                    final SurfaceView surfaceView = TRTCCloudImpl.this.mRoomInfo.localView.getSurfaceView();
                    final TextureView hWVideoView = TRTCCloudImpl.this.mRoomInfo.localView.getHWVideoView();
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.19.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (surfaceView != null) {
                                surfaceView.getHolder().removeCallback(TRTCCloudImpl.this);
                            } else if (hWVideoView != null) {
                                hWVideoView.setSurfaceTextureListener(null);
                            }
                        }
                    });
                }
                TRTCCloudImpl.this.mRoomInfo.localView = null;
                TRTCCloudImpl.this.mIsVideoCapturing = false;
                TRTCCloudImpl.this.mOrientationEventListener.disable();
                if (!TRTCCloudImpl.this.mEnableCustomVideoCapture) {
                    TRTCCloudImpl.this.enableVideoStream(false);
                }
                TXCKeyPointReportProxy.a(40046, 0, 2);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerHeight, 3L, -1L, "", 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(final String str, final TXCloudVideoView tXCloudVideoView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.20
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("startRemoteView user is not exist save view" + str);
                    TRTCRoomInfo.UserInfo createUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    createUserInfo.mainRender.view = tXCloudVideoView;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, createUserInfo);
                    Monitor.a(1, String.format("Remote-startRemoteView userID:%s (save view before user enter)", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                } else if (tXCloudVideoView != null && tXCloudVideoView.equals(user.mainRender.view)) {
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.apiLog("startRemoteView user view is the same, ignore " + str);
                } else {
                    boolean z = user.mainRender.view != null;
                    user.mainRender.view = tXCloudVideoView;
                    if (user.mainRender.tinyID == 0) {
                        TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                        tRTCCloudImpl3.apiLog("startRemoteView user tinyID is 0, ignore " + str);
                        return;
                    }
                    TRTCCloudImpl.this.setRenderView(str, user.mainRender, tXCloudVideoView, user.debugMargin);
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[1] = Long.valueOf(user.tinyID);
                    objArr[2] = Integer.valueOf(user.streamType);
                    objArr[3] = Integer.valueOf(tXCloudVideoView != null ? tXCloudVideoView.hashCode() : 0);
                    sb.append(String.format("Remote-startRemoteView userID:%s tinyID:%d streamType:%d view:%d", objArr));
                    sb.append(" self:");
                    sb.append(TRTCCloudImpl.this.hashCode());
                    String sb2 = sb.toString();
                    TRTCCloudImpl.this.apiLog(sb2);
                    Monitor.a(1, sb2, "", 0);
                    TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                    String valueOf = String.valueOf(user.tinyID);
                    int i = user.streamType;
                    tRTCCloudImpl4.notifyLogByUserId(valueOf, i, 0, "Start watching " + str);
                    if (!z || !user.mainRender.render.isRendering()) {
                        TRTCCloudImpl.this.startRemoteRender(user.mainRender.render, user.streamType);
                    }
                    TXCKeyPointReportProxy.a(String.valueOf(user.tinyID), 40021, 0L, user.streamType);
                    if (!user.mainRender.muteVideo) {
                        TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, user.streamType, true);
                    } else {
                        TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, user.streamType, true);
                    }
                    TXCEventRecorderProxy.a(String.valueOf(user.tinyID), MapConstant.LayerPropertyFlag_TextJustify, 1L, -1L, "", 0);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.21
            @Override // java.lang.Runnable
            public void run() {
                final TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("stopRemoteRender user is not exist " + str);
                    return;
                }
                TRTCCloudImpl.this.apiLog(String.format("stopRemoteView userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                Monitor.a(1, String.format("stopRemoteView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.a(String.valueOf(user.tinyID), MapConstant.LayerPropertyFlag_TextJustify, 0L, -1L, "", 0);
                TRTCCloudImpl.this.stopRemoteMainRender(user, Boolean.FALSE);
                final TXCloudVideoView tXCloudVideoView = user.mainRender.view;
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tXCloudVideoView != null) {
                            SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
                            if (surfaceView != null && user.mainRender != null) {
                                surfaceView.getHolder().removeCallback(user.mainRender);
                            }
                            tXCloudVideoView.removeVideoView();
                        }
                    }
                });
                user.mainRender.view = null;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteSubStreamView(final String str, final TXCloudVideoView tXCloudVideoView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.22
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("startRemoteSubStreamView user is not exist save view" + str);
                    TRTCRoomInfo.UserInfo createUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    createUserInfo.subRender.view = tXCloudVideoView;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, createUserInfo);
                } else if (tXCloudVideoView != null && tXCloudVideoView.equals(user.subRender.view)) {
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.apiLog("startRemoteSubStreamView user view is the same, ignore " + str);
                } else {
                    boolean z = user.subRender.view != null;
                    user.subRender.view = tXCloudVideoView;
                    if (user.subRender.tinyID == 0) {
                        TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                        tRTCCloudImpl3.apiLog("startRemoteSubStreamView user tinyID is 0, ignore " + str);
                        return;
                    }
                    TRTCCloudImpl.this.setRenderView(str, user.subRender, tXCloudVideoView, user.debugMargin);
                    TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[1] = Long.valueOf(user.tinyID);
                    objArr[2] = 7;
                    objArr[3] = Integer.valueOf(tXCloudVideoView != null ? tXCloudVideoView.hashCode() : 0);
                    tRTCCloudImpl4.apiLog(String.format("startRemoteSubStreamView userID:%s tinyID:%d streamType:%d view:%d", objArr));
                    Monitor.a(1, String.format("startRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                    String valueOf = String.valueOf(user.tinyID);
                    tRTCCloudImpl5.notifyLogByUserId(valueOf, 7, 0, "Start watching " + str);
                    TXCKeyPointReportProxy.a(String.valueOf(user.tinyID), 40021, 0L, 7);
                    if (!z || !user.subRender.render.isRendering()) {
                        TRTCCloudImpl.this.startRemoteRender(user.subRender.render, 7);
                    }
                    if (user.subRender.muteVideo) {
                        return;
                    }
                    TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 7, true);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteSubStreamView(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.23
            @Override // java.lang.Runnable
            public void run() {
                final TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("stopRemoteSubStreamView user is not exist " + str);
                    return;
                }
                TRTCCloudImpl.this.apiLog(String.format("stopRemoteSubStreamView userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                Monitor.a(1, String.format("stopRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.stopRemoteSubRender(user);
                final TXCloudVideoView tXCloudVideoView = user.subRender.view;
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tXCloudVideoView != null) {
                            SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
                            if (surfaceView != null && user.subRender != null) {
                                surfaceView.getHolder().removeCallback(user.subRender);
                            }
                            tXCloudVideoView.removeVideoView();
                        }
                    }
                });
                user.subRender.view = null;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewFillMode(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setSubStreamRemoteViewFillMode->userId: " + str + ", fillMode: " + i);
                if (user == null || user.subRender.render == null) {
                    return;
                }
                user.subRender.render.setRenderMode(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewRotation(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.25
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setRemoteSubStreamViewRotation->userId: " + str + ", rotation: " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || user.subRender.render == null) {
                    return;
                }
                user.subRender.render.setRenderRotation(i * 90);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.26
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopAllRemoteView");
                Monitor.a(1, "stopAllRemoteView self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.26.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TRTCCloudImpl.this.stopRemoteMainRender(userInfo, Boolean.TRUE);
                        TRTCCloudImpl.this.stopRemoteSubRender(userInfo);
                        userInfo.mainRender.view = null;
                        userInfo.subRender.view = null;
                    }
                });
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$27  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass27 implements Runnable {
        final /* synthetic */ TRTCCloudListener.TRTCSnapshotListener val$listener;
        final /* synthetic */ int val$streamType;
        final /* synthetic */ String val$userId;

        AnonymousClass27(String str, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, int i) {
            this.val$userId = str;
            this.val$listener = tRTCSnapshotListener;
            this.val$streamType = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.val$userId == null) {
                TRTCCloudImpl.this.apiLog("snapshotLocalView");
                TRTCCloudImpl.this.mCaptureAndEnc.a(new p() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27.1
                    @Override // com.tencent.liteav.basic.opengl.p
                    public void onTakePhotoComplete(final Bitmap bitmap) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (AnonymousClass27.this.val$listener != null) {
                                    AnonymousClass27.this.val$listener.onSnapshotComplete(bitmap);
                                }
                            }
                        });
                    }
                });
                return;
            }
            TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(this.val$userId);
            com.tencent.liteav.renderer.f fVar = null;
            if (this.val$streamType == 2) {
                if (user != null && user.mainRender != null && user.mainRender.render != null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("snapshotRemoteSubStreamView->userId: " + this.val$userId);
                    fVar = user.subRender.render.getVideoRender();
                }
            } else if (user != null && user.mainRender != null && user.mainRender.render != null) {
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.apiLog("snapshotRemoteView->userId: " + this.val$userId);
                fVar = user.mainRender.render.getVideoRender();
            }
            if (fVar != null) {
                fVar.a(new p() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27.2
                    @Override // com.tencent.liteav.basic.opengl.p
                    public void onTakePhotoComplete(final Bitmap bitmap) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (AnonymousClass27.this.val$listener != null) {
                                    AnonymousClass27.this.val$listener.onSnapshotComplete(bitmap);
                                }
                            }
                        });
                    }
                });
            } else {
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass27.this.val$listener != null) {
                            AnonymousClass27.this.val$listener.onSnapshotComplete(null);
                        }
                    }
                });
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        apiLog(String.format("snapshotVideo user:%s streamType:%d", str, Integer.valueOf(i)));
        runOnSDKThread(new AnonymousClass27(str, tRTCSnapshotListener, i));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, final TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.28
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE) {
                    TRTCCloudImpl.this.notifyCaptureStarted("Has started capturing, ignore startScreenCapture");
                    return;
                }
                TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.SCREEN;
                TRTCCloudImpl.this.mSensorMode = 0;
                TRTCCloudImpl.this.mOrientationEventListener.disable();
                if (tRTCVideoEncParam != null) {
                    TRTCCloudImpl.this.mOverrideFPSFromUser = false;
                    TRTCCloudImpl.this.setVideoEncoderParamInternal(tRTCVideoEncParam);
                } else {
                    TRTCCloudImpl.this.mOverrideFPSFromUser = true;
                }
                if (TRTCCloudImpl.this.mCurrentRole == 21) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.28.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore start local preview,for role audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore startLocalPreview for audience");
                }
                String str = "start screen capture self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.a(1, str, "", 0);
                TRTCCloudImpl.this.mCaptureAndEnc.a(0);
                if (TRTCCloudImpl.this.mConfig.l == 1 || TRTCCloudImpl.this.mConfig.l == 3) {
                    TRTCCloudImpl.this.updateBigStreamEncoder(true, TRTCCloudImpl.this.mConfig.a, TRTCCloudImpl.this.mConfig.b, TRTCCloudImpl.this.mConfig.h, TRTCCloudImpl.this.mConfig.c, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mConfig.e);
                } else {
                    TRTCCloudImpl.this.updateBigStreamEncoder(false, TRTCCloudImpl.this.mConfig.b, TRTCCloudImpl.this.mConfig.a, TRTCCloudImpl.this.mConfig.h, TRTCCloudImpl.this.mConfig.c, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mConfig.e);
                }
                i.a sizeByResolution = TRTCCloudImpl.this.getSizeByResolution(TRTCCloudImpl.this.mSmallEncParam.videoResolution, TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode);
                TRTCCloudImpl.this.updateSmallStreamEncoder(sizeByResolution.a, sizeByResolution.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                TRTCCloudImpl.this.mRoomInfo.localView = null;
                TRTCCloudImpl.this.enableVideoStream(true);
                TXCKeyPointReportProxy.a(40046, 1, 2);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerHeight, 2L, -1L, "", 2);
                TRTCCloudImpl.this.mCaptureAndEnc.a((a.InterfaceC1461a) TRTCCloudImpl.this);
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.28.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tRTCScreenShareParams != null) {
                            TRTCCloudImpl.this.showFloatingWindow(tRTCScreenShareParams.floatingView);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(view.getContext())) {
            TXCLog.e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        this.mFloatingWindow = view;
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        int i = 2005;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 2038;
        } else if (Build.VERSION.SDK_INT > 24) {
            i = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i);
        layoutParams.flags = 8;
        layoutParams.flags |= 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.29
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.NONE;
                    String str = "stopScreenCapture self:" + TRTCCloudImpl.this.hashCode();
                    TRTCCloudImpl.this.apiLog(str);
                    Monitor.a(1, str, "", 0);
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.29.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudImpl.this.hideFloatingWindow();
                        }
                    });
                    TRTCCloudImpl.this.mCaptureAndEnc.m();
                    TRTCCloudImpl.this.mRoomInfo.localView = null;
                    TRTCCloudImpl.this.enableVideoStream(false);
                    TXCKeyPointReportProxy.a(40046, 0, 2);
                    TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerHeight, 3L, -1L, "", 2);
                    TRTCCloudImpl.this.mConfig.h = TRTCCloudImpl.this.mLatestParamsOfBigEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_FPS, TRTCCloudImpl.this.mConfig.h);
                    TRTCCloudImpl.this.mConfig.i = TRTCCloudImpl.this.mLatestParamsOfBigEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_GOP, TRTCCloudImpl.this.mConfig.i);
                    TRTCCloudImpl.this.mConfig.p = TRTCCloudImpl.this.mLatestParamsOfBigEncoder.getBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, TRTCCloudImpl.this.mConfig.p);
                    TRTCCloudImpl.this.mSmallEncParam.videoFps = TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_FPS, TRTCCloudImpl.this.mSmallEncParam.videoFps);
                    TRTCCloudImpl.this.mSmallEncParam.enableAdjustRes = TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.getBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, TRTCCloudImpl.this.mSmallEncParam.enableAdjustRes);
                    TXCLog.i(TRTCCloudImpl.TAG, String.format(Locale.ENGLISH, "restore big encoder's fps: %d, gop: %d, small encoder's fps: %d", Integer.valueOf(TRTCCloudImpl.this.mConfig.h), Integer.valueOf(TRTCCloudImpl.this.mConfig.i), Integer.valueOf(TRTCCloudImpl.this.mSmallEncParam.videoFps)));
                    return;
                }
                TRTCCloudImpl.this.apiLog("stopScreenCapture been ignored for Screen capture is not started");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        if (this.mFloatingWindow == null) {
            return;
        }
        ((WindowManager) this.mFloatingWindow.getContext().getSystemService("window")).removeViewImmediate(this.mFloatingWindow);
        this.mFloatingWindow = null;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.30
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.apiLog("pause screen capture");
                    Monitor.a(1, "pause screen capture self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl.this.mCaptureAndEnc.h();
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.31
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.apiLog("resume screen capture");
                    Monitor.a(1, "resume screen capture self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl.this.mCaptureAndEnc.i();
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.32
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("muteLocalVideo " + z + ", " + TRTCCloudImpl.this.mConfig.A);
                Monitor.a(1, String.format("muteLocalVideo mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerHeight, z ? 1L : 0L, -1L, "", 2);
                TRTCCloudImpl.this.muteLocalVideo(z, TRTCCloudImpl.this);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(final Bitmap bitmap, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.33
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setVideoMuteImage " + bitmap + ", " + i);
                int i2 = i;
                if (i2 > 20) {
                    i2 = 20;
                } else if (i2 < 5) {
                    i2 = 5;
                }
                TRTCCloudImpl.this.mConfig.A = bitmap;
                TRTCCloudImpl.this.mConfig.C = i2;
                TRTCCloudImpl.this.mConfig.B = -1;
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView) {
        switch (i) {
            case 0:
            case 1:
                startRemoteView(str, tXCloudVideoView);
                setRemoteVideoStreamType(str, i);
                return;
            case 2:
                startRemoteSubStreamView(str, tXCloudVideoView);
                return;
            default:
                TXCLog.e(TAG, "startRemoteView unsupported streamType:" + i);
                return;
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str, int i) {
        switch (i) {
            case 0:
            case 1:
                stopRemoteView(str);
                return;
            case 2:
                stopRemoteSubStreamView(str);
                return;
            default:
                TXCLog.e(TAG, "stopRemoteView unsupported streamType:" + i);
                return;
        }
    }

    public void muteLocalVideo(final boolean z, final TRTCCloudImpl tRTCCloudImpl) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.34
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this.mCurrentPublishClouds.get(2);
                if (!z) {
                    if (tRTCCloudImpl2 != tRTCCloudImpl) {
                        TRTCCloudImpl.this.enableVideoStream(false);
                        synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                            TRTCCloudImpl.this.mCurrentPublishClouds.put(2, tRTCCloudImpl);
                            TRTCCloudImpl.this.mCurrentPublishClouds.put(3, tRTCCloudImpl);
                            TRTCCloudImpl.this.mCurrentPublishClouds.put(7, tRTCCloudImpl);
                        }
                        TRTCCloudImpl.this.enableNetworkBlackStream(TRTCCloudImpl.this.mCaptureAndEnc.j());
                        TRTCCloudImpl.this.enableNetworkSmallStream(TRTCCloudImpl.this.mEnableSmallStream);
                        TRTCCloudImpl.this.setVideoQuality(TRTCCloudImpl.this.mQosMode, TRTCCloudImpl.this.mQosPreference);
                        TRTCCloudImpl.this.setVideoEncConfig(2, TRTCCloudImpl.this.mRoomInfo.bigEncSize.a, TRTCCloudImpl.this.mRoomInfo.bigEncSize.b, TRTCCloudImpl.this.mConfig.h, TRTCCloudImpl.this.mConfig.c, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mConfig.e);
                        if (TRTCCloudImpl.this.mEnableSmallStream) {
                            TRTCCloudImpl.this.setVideoEncConfig(3, TRTCCloudImpl.this.mRoomInfo.smallEncSize.a, TRTCCloudImpl.this.mRoomInfo.smallEncSize.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mConfig.p, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                        } else {
                            TRTCCloudImpl.this.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, TRTCCloudImpl.this.mConfig.p, 0);
                        }
                        TRTCCloudImpl.this.enableVideoStream(true);
                    }
                    TRTCCloudImpl.this.mCaptureAndEnc.i();
                    TRTCCloudImpl.this.mRoomInfo.muteLocalVideo = z;
                    TRTCCloudImpl.this.enableNetworkBlackStream(TRTCCloudImpl.this.mCaptureAndEnc.j());
                    TRTCCloudImpl.this.muteUpstream(2, z);
                    TRTCCloudImpl.this.mCaptureAndEnc.k(2);
                    if (TRTCCloudImpl.this.mEnableSmallStream) {
                        TRTCCloudImpl.this.mCaptureAndEnc.k(3);
                    }
                } else if (tRTCCloudImpl2 == tRTCCloudImpl) {
                    TRTCCloudImpl.this.mRoomInfo.muteLocalVideo = z;
                    TRTCCloudImpl.this.enableNetworkBlackStream(TRTCCloudImpl.this.mCaptureAndEnc.j());
                    if (TRTCCloudImpl.this.mConfig.A == null) {
                        TRTCCloudImpl.this.muteUpstream(2, z);
                    } else {
                        TRTCCloudImpl.this.mCaptureAndEnc.h();
                    }
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(final String str, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.35
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("muteRemoteVideoStream " + str + " no exist.");
                    TRTCRoomInfo.UserInfo createUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    createUserInfo.mainRender.muteVideo = z;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, createUserInfo);
                    return;
                }
                user.mainRender.muteVideo = z;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.apiLog("muteRemoteVideoStream " + str + ", mute:" + z);
                StringBuilder sb = new StringBuilder("muteRemoteVideoStream userId:%s mute:%b self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                Monitor.a(1, String.format(sb.toString(), str, Boolean.valueOf(z)), "", 0);
                if (user.tinyID == 0) {
                    return;
                }
                if (user.mainRender.render != null) {
                    user.mainRender.render.muteVideo(z);
                }
                if (z) {
                    TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 2, true);
                    TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 3, true);
                    TXCEventRecorderProxy.a(String.valueOf(user.tinyID), MapConstant.LayerPropertyFlag_TextLetterSpacing, 1L, -1L, "", 0);
                    return;
                }
                TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, user.streamType, true);
                TXCEventRecorderProxy.a(String.valueOf(user.tinyID), MapConstant.LayerPropertyFlag_TextLetterSpacing, 0L, -1L, "", 0);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.36
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("muteAllRemoteVideoStreams mute " + z);
                Monitor.a(1, String.format("muteAllRemoteVideoStreams mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.mRoomInfo.muteRemoteVideo = z;
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.36.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        userInfo.mainRender.muteVideo = z;
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        tRTCCloudImpl2.apiLog("muteRemoteVideoStream " + userInfo.userID + ", mute " + z);
                        if (userInfo.mainRender.render != null) {
                            userInfo.mainRender.render.muteVideo(z);
                        }
                        if (z) {
                            TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 2, true);
                            TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 3, true);
                            TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 7, true);
                            return;
                        }
                        if (userInfo.mainRender.render != null && userInfo.mainRender.render.isRendering()) {
                            TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, userInfo.streamType, true);
                        }
                        if (userInfo.subRender.render == null || !userInfo.subRender.render.isRendering()) {
                            return;
                        }
                        TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 7, true);
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.37
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.setVideoEncoderParamInternal(tRTCVideoEncParam);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderParamInternal(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam != null) {
            this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_FPS, tRTCVideoEncParam.videoFps);
            this.mLatestParamsOfBigEncoder.putBoolean(KEY_CONFIG_ADJUST_RESOLUTION, tRTCVideoEncParam.enableAdjustRes);
            i.a sizeByResolution = getSizeByResolution(tRTCVideoEncParam.videoResolution, tRTCVideoEncParam.videoResolutionMode);
            updateBigStreamEncoder(tRTCVideoEncParam.videoResolutionMode == 1, sizeByResolution.a, sizeByResolution.b, tRTCVideoEncParam.videoFps, tRTCVideoEncParam.videoBitrate, tRTCVideoEncParam.enableAdjustRes, tRTCVideoEncParam.minVideoBitrate);
            apiLog("vsize setVideoEncoderParam->width:" + this.mRoomInfo.bigEncSize.a + ", height:" + this.mRoomInfo.bigEncSize.b + ", fps:" + tRTCVideoEncParam.videoFps + ", bitrate:" + tRTCVideoEncParam.videoBitrate + ", mode:" + tRTCVideoEncParam.videoResolutionMode + " minVideoBitrate:" + tRTCVideoEncParam.minVideoBitrate);
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("setVideoEncoderParam width:%d, height:%d, fps:%d, bitrate:%d, mode:%d, minBitrate:%d", Integer.valueOf(this.mRoomInfo.bigEncSize.a), Integer.valueOf(this.mRoomInfo.bigEncSize.b), Integer.valueOf(tRTCVideoEncParam.videoFps), Integer.valueOf(tRTCVideoEncParam.videoBitrate), Integer.valueOf(tRTCVideoEncParam.videoResolutionMode), Integer.valueOf(tRTCVideoEncParam.minVideoBitrate)));
            sb.append(" self:");
            sb.append(hashCode());
            Monitor.a(1, sb.toString(), "", 0);
            updateOrientation();
            TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextPitchAlignment, (long) this.mRoomInfo.bigEncSize.a, (long) this.mRoomInfo.bigEncSize.b, "", 2);
            TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextRotationAlignment, (long) tRTCVideoEncParam.videoFps, -1L, "", 2);
            TXCEventRecorderProxy.a("18446744073709551615", MapConstant.LayerPropertyFlag_TextField, (long) tRTCVideoEncParam.videoBitrate, -1L, "", 2);
            return;
        }
        apiLog("setVideoEncoderParam param is null");
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(final TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.38
            @Override // java.lang.Runnable
            public void run() {
                if (tRTCNetworkQosParam != null) {
                    TRTCCloudImpl.this.apiLog("setNetworkQosParam");
                    TRTCCloudImpl.this.mQosPreference = tRTCNetworkQosParam.preference;
                    TRTCCloudImpl.this.mQosMode = tRTCNetworkQosParam.controlMode;
                    TRTCCloudImpl.this.setVideoQuality(TRTCCloudImpl.this.mQosMode, TRTCCloudImpl.this.mQosPreference);
                    return;
                }
                TRTCCloudImpl.this.apiLog("setNetworkQosParam param is null");
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(String str, int i, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        switch (i) {
            case 0:
            case 1:
                setRemoteViewFillMode(str, tRTCRenderParams.fillMode);
                setRemoteViewRotation(str, tRTCRenderParams.rotation);
                setRemoteViewMirror(str, i, tRTCRenderParams.mirrorType);
                return;
            case 2:
                setRemoteSubStreamViewFillMode(str, tRTCRenderParams.fillMode);
                setRemoteSubStreamViewRotation(str, tRTCRenderParams.rotation);
                setRemoteViewMirror(str, i, tRTCRenderParams.mirrorType);
                return;
            default:
                TXCLog.e(TAG, "setRemoteRenderParams unsupported streamType:" + i);
                return;
        }
    }

    private void setRemoteViewMirror(final String str, final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.39
            @Override // java.lang.Runnable
            public void run() {
                TXCRenderAndDec tXCRenderAndDec;
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    return;
                }
                if (i == 0 || i == 1) {
                    tXCRenderAndDec = user.mainRender.render;
                } else {
                    tXCRenderAndDec = user.subRender.render;
                }
                if (tXCRenderAndDec == null) {
                    return;
                }
                switch (i2) {
                    case 1:
                        tXCRenderAndDec.setRenderMirrorType(1);
                        return;
                    case 2:
                        tXCRenderAndDec.setRenderMirrorType(2);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewFillMode(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.40
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setLocalViewFillMode " + i);
                TRTCCloudImpl.this.mCaptureAndEnc.f(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewFillMode(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.41
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setRemoteViewFillMode " + str + ", " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || user.mainRender.render == null) {
                    return;
                }
                user.mainRender.render.setRenderMode(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewRotation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.42
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("vrotation setLocalViewRotation " + i);
                TRTCCloudImpl.this.mRoomInfo.localRenderRotation = i * 90;
                TRTCCloudImpl.this.mCaptureAndEnc.g(i * 90);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewRotation(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.43
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("vrotation setRemoteViewRotation " + str + ", " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || user.mainRender.render == null) {
                    return;
                }
                user.mainRender.render.setRenderRotation(i * 90);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderRotation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.44
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("vrotation setVideoEncoderRotation " + i + ", g sensor mode " + TRTCCloudImpl.this.mSensorMode);
                if (TRTCCloudImpl.this.mSensorMode == 0) {
                    TRTCCloudImpl.this.mCaptureAndEnc.a(i * 90);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGSensorMode(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.45
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.apiLog("setGSensorMode has been ignored for screen capturing");
                    return;
                }
                TRTCCloudImpl.this.mSensorMode = i;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("vrotation setGSensorMode " + i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(final boolean z, final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.46
            @Override // java.lang.Runnable
            public void run() {
                boolean z2;
                int i;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("enableEncSmallVideoStream " + z);
                TRTCCloudImpl.this.mEnableSmallStream = z;
                TRTCCloudImpl.this.enableNetworkSmallStream(TRTCCloudImpl.this.mEnableSmallStream);
                if (tRTCVideoEncParam != null) {
                    TRTCCloudImpl.this.mSmallEncParam.videoBitrate = tRTCVideoEncParam.videoBitrate;
                    TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate = tRTCVideoEncParam.minVideoBitrate;
                    TRTCCloudImpl.this.mSmallEncParam.videoFps = tRTCVideoEncParam.videoFps;
                    TRTCCloudImpl.this.mSmallEncParam.videoResolution = tRTCVideoEncParam.videoResolution;
                    TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode = tRTCVideoEncParam.videoResolutionMode;
                    TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.putInt(TRTCCloudImpl.KEY_CONFIG_FPS, tRTCVideoEncParam.videoFps);
                    TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.putBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, tRTCVideoEncParam.enableAdjustRes);
                }
                boolean z3 = TRTCCloudImpl.this.mConfig.p;
                int i2 = TRTCCloudImpl.this.mConfig.i;
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    if (TRTCCloudImpl.this.mOverrideFPSFromUser) {
                        TRTCCloudImpl.this.mSmallEncParam.videoFps = 10;
                    }
                    i = 3;
                    z2 = false;
                } else {
                    z2 = z3;
                    i = i2;
                }
                TRTCCloudImpl.this.mRoomInfo.smallEncSize = TRTCCloudImpl.this.getSizeByResolution(TRTCCloudImpl.this.mSmallEncParam.videoResolution, TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode);
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mEnableSmallStream, TRTCCloudImpl.this.mRoomInfo.smallEncSize.a, TRTCCloudImpl.this.mRoomInfo.smallEncSize.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, i);
                if (TRTCCloudImpl.this.mEnableSmallStream) {
                    TRTCCloudImpl.this.setVideoEncConfig(3, TRTCCloudImpl.this.mRoomInfo.smallEncSize.a, TRTCCloudImpl.this.mRoomInfo.smallEncSize.b, TRTCCloudImpl.this.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, z2, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                    TRTCCloudImpl.this.addUpStreamType(3);
                    return;
                }
                TRTCCloudImpl.this.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, TRTCCloudImpl.this.mConfig.p, 0);
                TRTCCloudImpl.this.removeUpStreamType(3);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setPriorRemoteVideoStreamType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.47
            @Override // java.lang.Runnable
            public void run() {
                if (i != 0 && i == 1) {
                    TRTCCloudImpl.this.mPriorStreamType = 3;
                } else {
                    TRTCCloudImpl.this.mPriorStreamType = 2;
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setPriorRemoteVideoStreamType " + TRTCCloudImpl.this.mPriorStreamType);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewMirror(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.48
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mVideoRenderMirror = i;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setLocalViewMirror " + i);
                TRTCCloudImpl.this.mCaptureAndEnc.b(i);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderMirror(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.49
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setVideoEncoderMirror " + z);
                TRTCCloudImpl.this.mConfig.S = z;
                TRTCCloudImpl.this.mCaptureAndEnc.g(z);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioQuality(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.50
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setAudioQuality " + i);
                TXCAudioEngine.getInstance().setAudioQuality(i, 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i) {
        setAudioQuality(i);
        startLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.51
            @Override // java.lang.Runnable
            public void run() {
                if (!TRTCCloudImpl.this.mEnableCustomAudioCapture) {
                    if (TRTCCloudImpl.this.mIsAudioCapturing) {
                        TRTCCloudImpl.this.apiLog("startLocalAudio when capturing audio, ignore!!!");
                        return;
                    }
                    if (TRTCCloudImpl.this.mCurrentRole == 21) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.51.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener == null) {
                                    return;
                                }
                                tRTCCloudListener.onWarning(6001, "ignore start local audio,for role audience", null);
                            }
                        });
                        TRTCCloudImpl.this.apiLog("ignore startLocalAudio,for role audience");
                    }
                    TRTCCloudImpl.this.apiLog("startLocalAudio");
                    Monitor.a(1, "startLocalAudio self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TXCEventRecorderProxy.a("18446744073709551615", 3002, 0L, -1L, "", 0);
                    TRTCCloudImpl.this.mIsAudioCapturing = true;
                    TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
                    TRTCCloudImpl.this.setQoSParams();
                    TXCAudioEngine.getInstance().enableCaptureEOSMode(TRTCCloudImpl.this.mEnableEosMode);
                    TXCAudioEngineJNI.nativeUseSysAudioDevice(false);
                    TXCAudioEngine.getInstance().startLocalAudio(11, false);
                    TXCAudioEngine.getInstance().enableEncodedDataPackWithTRAEHeaderCallback(true);
                    TXCAudioEngine.getInstance().muteLocalAudio(TRTCCloudImpl.this.mRoomInfo.muteLocalAudio);
                    TXCEventRecorderProxy.a("18446744073709551615", 3003, 11L, -1L, "", 0);
                    TRTCCloudImpl.this.enableAudioStream(true);
                    TXCKeyPointReportProxy.a(40050, 1, 1);
                    return;
                }
                TRTCCloudImpl.this.apiLog("startLocalAudio when enable custom audio capturing, ignore!!!");
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.52
            @Override // java.lang.Runnable
            public void run() {
                if (!TRTCCloudImpl.this.mIsAudioCapturing) {
                    TRTCCloudImpl.this.apiLog("stopLocalAudio when no capturing audio, ignore!!!");
                    return;
                }
                TRTCCloudImpl.this.apiLog("stopLocalAudio");
                Monitor.a(1, "stopLocalAudio self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.a("18446744073709551615", 3002, 2L, -1L, "", 0);
                TRTCCloudImpl.this.mIsAudioCapturing = false;
                TXCAudioEngine.getInstance().stopLocalAudio();
                if (!TRTCCloudImpl.this.mEnableCustomAudioCapture) {
                    TRTCCloudImpl.this.enableAudioStream(false);
                }
                TXCKeyPointReportProxy.a(40050, 0, 1);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.53
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    return;
                }
                int i2 = i == 1 ? 3 : 2;
                if (user.streamType == i2) {
                    return;
                }
                user.streamType = i2;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setRemoteVideoStreamType " + str + ", " + i2 + ", " + user.tinyID);
                TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, i2, false);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i) {
        TXDeviceManager.TXAudioRoute tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
        switch (i) {
            case 0:
                tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
                break;
            case 1:
                tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
                break;
        }
        this.mDeviceManager.setAudioRoute(tXAudioRoute);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.54
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("muteLocalAudio " + z);
                Monitor.a(1, String.format("muteLocalAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.muteLocalAudio(z, TRTCCloudImpl.this);
                if (z) {
                    TXCEventRecorderProxy.a("18446744073709551615", 3002, 1L, -1L, "", 0);
                } else {
                    TXCEventRecorderProxy.a("18446744073709551615", 3002, 3L, -1L, "", 0);
                }
            }
        });
    }

    public void muteLocalAudio(final boolean z, final TRTCCloudImpl tRTCCloudImpl) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.55
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this.mCurrentPublishClouds.get(1);
                if (!z) {
                    if (tRTCCloudImpl2 != tRTCCloudImpl) {
                        TRTCCloudImpl.this.enableAudioStream(false);
                        synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                            TRTCCloudImpl.this.mCurrentPublishClouds.put(1, tRTCCloudImpl);
                        }
                        TRTCCloudImpl.this.setAudioEncodeConfiguration();
                    }
                    TRTCCloudImpl.this.mRoomInfo.muteLocalAudio = z;
                    TXCAudioEngine.getInstance().muteLocalAudio(z);
                    TRTCCloudImpl.this.muteUpstream(1, z);
                    TRTCCloudImpl.this.enableAudioStream(true);
                } else if (tRTCCloudImpl2 == tRTCCloudImpl) {
                    TRTCCloudImpl.this.mRoomInfo.muteLocalAudio = z;
                    TXCAudioEngine.getInstance().muteLocalAudio(z);
                    TRTCCloudImpl.this.muteUpstream(1, z);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(final String str, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.56
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("muteRemoteAudio " + str + " no exist.");
                    TRTCRoomInfo.UserInfo createUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    createUserInfo.mainRender.muteAudio = z ? TRTCRoomInfo.TRTCRemoteMuteState.MUTE : TRTCRoomInfo.TRTCRemoteMuteState.UNMUTE;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, createUserInfo);
                    return;
                }
                user.mainRender.muteAudio = z ? TRTCRoomInfo.TRTCRemoteMuteState.MUTE : TRTCRoomInfo.TRTCRemoteMuteState.UNMUTE;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.apiLog("muteRemoteAudio " + str + ", " + z);
                Monitor.a(1, String.format("muteRemoteAudio userId:%s mute:%b", str, Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                if (user.tinyID == 0) {
                    return;
                }
                TXCAudioEngine.getInstance().muteRemoteAudio(String.valueOf(user.tinyID), z);
                if (z) {
                    TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 1, true);
                } else {
                    TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 1, true);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.57
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("muteAllRemoteAudio " + z);
                Monitor.a(1, String.format("muteAllRemoteAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.mRoomInfo.muteRemoteAudio = z ? TRTCRoomInfo.TRTCRemoteMuteState.MUTE : TRTCRoomInfo.TRTCRemoteMuteState.UNMUTE;
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.57.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        userInfo.mainRender.muteAudio = z ? TRTCRoomInfo.TRTCRemoteMuteState.MUTE : TRTCRoomInfo.TRTCRemoteMuteState.UNMUTE;
                        TXCAudioEngine.getInstance().muteRemoteAudio(String.valueOf(userInfo.tinyID), z);
                        if (z) {
                            TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 1, true);
                        } else {
                            TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, userInfo.tinyID, 1, true);
                        }
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.58
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 < 0) {
                    i2 = 0;
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setRemoteAudioVolume: userId = " + str + " volume = " + i2);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    TXCAudioEngine.getInstance().setRemotePlayoutVolume(String.valueOf(user.tinyID), i2);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mAudioCaptureVolume = i;
        apiLog("setAudioCaptureVolume:  volume=" + this.mAudioCaptureVolume);
        TXAudioEffectManagerImpl.getInstance().setVoiceCaptureVolume(i);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.mAudioCaptureVolume;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mAudioPlayoutVolume = i;
        apiLog("setAudioPlayoutVolume:  volume=" + this.mAudioPlayoutVolume);
        TXAudioEffectManagerImpl.getInstance().setAudioPlayoutVolume(i);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.mAudioPlayoutVolume;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSystemVolumeType(int i) {
        TXDeviceManager.TXSystemVolumeType tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
        switch (i) {
            case 0:
                tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
                break;
            case 1:
                tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia;
                break;
            case 2:
                tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP;
                break;
        }
        this.mDeviceManager.setSystemVolumeType(tXSystemVolumeType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioEarMonitoring(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.59
            @Override // java.lang.Runnable
            public void run() {
                Monitor.a(1, String.format("enableAudioEarMonitoring enable:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXAudioEffectManagerImpl.getInstance().enableVoiceEarMonitor(z);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder.getSurface().isValid()) {
            apiLog("startLocalPreview surfaceCreated " + surfaceHolder.getSurface());
            this.mCaptureAndEnc.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        apiLog("startLocalPreview surfaceChanged " + surfaceHolder.getSurface() + " width " + i2 + ", height " + i3);
        this.mCaptureAndEnc.a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        apiLog("startLocalPreview surfaceDestroyed " + surfaceHolder.getSurface());
        this.mCaptureAndEnc.a((Surface) null);
    }

    @Override // com.tencent.liteav.screencapture.a.InterfaceC1461a
    public void onScreenCaptureStarted() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.60
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureStarted();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.a.InterfaceC1461a
    public void onScreenCaptureResumed() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.61
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureResumed();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.a.InterfaceC1461a
    public void onScreenCapturePaused() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.62
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCapturePaused();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.a.InterfaceC1461a
    public void onScreenCaptureStopped(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.63
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureStopped(i);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class VolumeLevelNotifyTask implements Runnable {
        private WeakReference<TRTCCloudImpl> mWeakTRTCEngine;

        VolumeLevelNotifyTask(TRTCCloudImpl tRTCCloudImpl) {
            this.mWeakTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        @Override // java.lang.Runnable
        public void run() {
            TRTCCloudImpl tRTCCloudImpl = this.mWeakTRTCEngine != null ? this.mWeakTRTCEngine.get() : null;
            if (tRTCCloudImpl != null) {
                final ArrayList arrayList = new ArrayList();
                int softwareCaptureVolumeLevel = tRTCCloudImpl.mCaptureAndEnc != null ? TXCAudioEngine.getInstance().getSoftwareCaptureVolumeLevel() : 0;
                if (softwareCaptureVolumeLevel > 0) {
                    TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
                    tRTCVolumeInfo.userId = tRTCCloudImpl.mRoomInfo.userId;
                    tRTCVolumeInfo.volume = softwareCaptureVolumeLevel;
                    arrayList.add(tRTCVolumeInfo);
                }
                tRTCCloudImpl.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.VolumeLevelNotifyTask.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        int remotePlayoutVolumeLevel = TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(String.valueOf(userInfo.tinyID));
                        if (remotePlayoutVolumeLevel > 0) {
                            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo2 = new TRTCCloudDef.TRTCVolumeInfo();
                            tRTCVolumeInfo2.userId = userInfo.userID;
                            tRTCVolumeInfo2.volume = remotePlayoutVolumeLevel;
                            arrayList.add(tRTCVolumeInfo2);
                        }
                    }
                });
                final int mixingPlayoutVolumeLevel = TXCAudioEngine.getMixingPlayoutVolumeLevel();
                final TRTCCloudListener tRTCCloudListener = tRTCCloudImpl.mTRTCListener;
                tRTCCloudImpl.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.VolumeLevelNotifyTask.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tRTCCloudListener != null) {
                            tRTCCloudListener.onUserVoiceVolume(arrayList, mixingPlayoutVolumeLevel);
                        }
                    }
                });
                if (tRTCCloudImpl.mAudioVolumeEvalInterval > 0) {
                    tRTCCloudImpl.mSDKHandler.postDelayed(tRTCCloudImpl.mVolumeLevelNotifyTask, tRTCCloudImpl.mAudioVolumeEvalInterval);
                }
            }
        }
    }

    protected void startVolumeLevelCal(boolean z) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, this.mAudioVolumeEvalInterval);
        if (z) {
            if (this.mVolumeLevelNotifyTask == null) {
                this.mVolumeLevelNotifyTask = new VolumeLevelNotifyTask(this);
                this.mSDKHandler.postDelayed(this.mVolumeLevelNotifyTask, this.mAudioVolumeEvalInterval);
                return;
            }
            return;
        }
        this.mVolumeLevelNotifyTask = null;
        this.mAudioVolumeEvalInterval = 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.64
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (i > 0) {
                    i2 = i < 100 ? 100 : i;
                } else {
                    i2 = 0;
                }
                if (i2 == TRTCCloudImpl.this.mAudioVolumeEvalInterval) {
                    return;
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("enableAudioVolumeEvaluation " + i2);
                TRTCCloudImpl.this.mAudioVolumeEvalInterval = i2;
                if (TRTCCloudImpl.this.mAudioVolumeEvalInterval > 0) {
                    TRTCCloudImpl.this.startVolumeLevelCal(true);
                } else {
                    TRTCCloudImpl.this.startVolumeLevelCal(false);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        if (TextUtils.isEmpty(tRTCAudioRecordingParams.filePath)) {
            apiLog("startLocalAudioRecord error:" + tRTCAudioRecordingParams.filePath);
            return -1;
        }
        apiLog("startLocalAudioRecord:" + tRTCAudioRecordingParams.filePath);
        TXCAudioEngine.getInstance().setAudioDumpingListener(new TXCAudioEngineJNI.a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.65
            @Override // com.tencent.liteav.audio.impl.TXCAudioEngineJNI.a
            public void onLocalAudioWriteFailed() {
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.65.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                        if (tRTCCloudListener == null) {
                            return;
                        }
                        TRTCCloudImpl.this.apiLog("startLocalAudioRecord onWarning:7001");
                        tRTCCloudListener.onWarning(7001, "write file failed when recording audio.", null);
                    }
                });
            }
        });
        return TXCAudioEngine.getInstance().startLocalAudioDumping(48000, 16, tRTCAudioRecordingParams.filePath);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        TXCAudioEngine.getInstance().stopLocalAudioDumping();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchCamera() {
        this.mDeviceManager.switchCamera(!this.mDeviceManager.isFrontCamera());
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraZoomSupported() {
        return this.mCaptureAndEnc.n();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setZoom(int i) {
        this.mDeviceManager.setCameraZoomRatio(i);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraTorchSupported() {
        return this.mCaptureAndEnc.o();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean enableTorch(boolean z) {
        return this.mDeviceManager.enableCameraTorch(z);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.mCaptureAndEnc.p();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFocusPosition(int i, int i2) {
        this.mDeviceManager.setCameraFocusPosition(i, i2);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.mCaptureAndEnc.q();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        if (this.mCaptureAndEnc == null) {
            this.mCaptureAndEnc = new com.tencent.liteav.d(this.mContext);
        }
        return this.mCaptureAndEnc.b();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBeautyStyle(final int i, final int i2, final int i3, final int i4) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.66
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.getBeautyManager().setBeautyStyle(i);
                TRTCCloudImpl.this.getBeautyManager().setBeautyLevel(i2);
                TRTCCloudImpl.this.getBeautyManager().setWhitenessLevel(i3);
                TRTCCloudImpl.this.getBeautyManager().setRuddyLevel(i4);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilter(final Bitmap bitmap) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.67
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFilter");
                TRTCCloudImpl.this.getBeautyManager().setFilter(bitmap);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilterConcentration(final float f) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.68
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setFilterStrength: " + f);
                TRTCCloudImpl.this.getBeautyManager().setFilterStrength(f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void selectMotionTmpl(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.69
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("selectMotionTmpl " + str);
                TRTCCloudImpl.this.getBeautyManager().setMotionTmpl(str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMotionMute(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.70
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setMotionMute " + z);
                TRTCCloudImpl.this.getBeautyManager().setMotionMute(z);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    @TargetApi(18)
    public boolean setGreenScreenFile(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.71
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setGreenScreenFile " + str);
                TRTCCloudImpl.this.getBeautyManager().setGreenScreenFile(str);
            }
        });
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setEyeScaleLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.72
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setEyeScaleLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setEyeScaleLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceSlimLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.73
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setFaceSlimLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceSlimLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceVLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.74
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setFaceVLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceVLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceShortLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.75
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setFaceShortLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceShortLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setChinLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.76
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setChinLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setChinLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNoseSlimLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.77
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setNoseSlimLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setNoseSlimLevel((float) i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(final Bitmap bitmap, final int i, final float f, final float f2, final float f3) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.78
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("addWatermark stream:" + i);
                if (i != 2) {
                    TRTCCloudImpl.this.mConfig.E = bitmap;
                    TRTCCloudImpl.this.mConfig.H = f;
                    TRTCCloudImpl.this.mConfig.I = f2;
                    TRTCCloudImpl.this.mConfig.J = f3;
                    TRTCCloudImpl.this.mCaptureAndEnc.a(bitmap, f, f2, f3);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.79
            @Override // java.lang.Runnable
            public void run() {
                if (z && TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE) {
                    TRTCCloudImpl.this.notifyCaptureStarted("Has started capturing, ignore enableCustomVideoCapture");
                } else if (z || TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.CUSTOM) {
                    TRTCCloudImpl.this.mVideoSourceType = z ? VideoSourceType.CUSTOM : VideoSourceType.NONE;
                    if (z) {
                        TRTCCloudImpl.this.mConfig.R |= 2;
                        TRTCCloudImpl.this.mLastCaptureCalculateTS = 0L;
                        if (TRTCCloudImpl.this.mCurrentRole == 21) {
                            TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.79.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                    if (tRTCCloudListener == null) {
                                        return;
                                    }
                                    tRTCCloudListener.onWarning(6001, "ignore send custom video,for role audience", null);
                                }
                            });
                            TRTCCloudImpl.this.apiLog("ignore enableCustomVideoCapture,for role audience");
                        }
                    } else {
                        TRTCCloudImpl.this.mConfig.R &= -3;
                        synchronized (this) {
                            if (TRTCCloudImpl.this.mCustomVideoUtil != null) {
                                TRTCCloudImpl.this.mCustomVideoUtil.release();
                                TRTCCloudImpl.this.mCustomVideoUtil = null;
                            }
                        }
                    }
                    TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
                    TRTCCloudImpl.this.mEnableCustomVideoCapture = z;
                    TRTCCloudImpl.this.apiLog("enableCustomVideoCapture " + z);
                    Monitor.a(1, String.format("enableCustomVideoCapture:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    if (!z) {
                        if (!TRTCCloudImpl.this.mIsVideoCapturing) {
                            TRTCCloudImpl.this.enableVideoStream(false);
                        }
                    } else {
                        TRTCCloudImpl.this.enableVideoStream(true);
                    }
                    TXCKeyPointReportProxy.a(40046, z ? 1 : 0, 2);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            apiLog("sendCustomVideoData parameter is null");
        } else if (tRTCVideoFrame.pixelFormat != 1 && tRTCVideoFrame.pixelFormat != 4 && tRTCVideoFrame.pixelFormat != 2) {
            apiLog("sendCustomVideoData parameter error unsupported pixel format " + tRTCVideoFrame.pixelFormat);
        } else if (tRTCVideoFrame.bufferType != 2 && tRTCVideoFrame.texture == null) {
            apiLog("sendCustomVideoData parameter error unsupported buffer type " + tRTCVideoFrame.bufferType);
        } else if (this.mVideoSourceType == VideoSourceType.CUSTOM && this.mRoomState == 2 && !this.mRoomInfo.muteLocalVideo) {
            synchronized (this) {
                if (this.mCustomVideoUtil == null) {
                    this.mCustomVideoUtil = new TRTCCustomTextureUtil(this.mCaptureAndEnc);
                }
                if (this.mCustomVideoUtil != null) {
                    this.mCustomVideoUtil.sendCustomTexture(tRTCVideoFrame);
                }
            }
            if (this.mLastCaptureCalculateTS == 0) {
                this.mLastCaptureCalculateTS = System.currentTimeMillis();
                this.mLastCaptureFrameCount = 0L;
                this.mCaptureFrameCount = 0L;
                return;
            }
            this.mCaptureFrameCount++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableBlackStream(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: enable");
            return;
        }
        boolean z = jSONObject.getBoolean("enable");
        apiLog("enableBlackStream " + z);
        enableNetworkBlackStream(z);
        if (this.mCaptureAndEnc != null) {
            this.mCaptureAndEnc.c(z);
        }
        if (z) {
            addUpstream(2);
        }
    }

    public void setSEIPayloadType(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("payloadType")) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: payloadType");
            return;
        }
        int i = jSONObject.getInt("payloadType");
        if (i != 5 && i != 243) {
            apiLog("callExperimentalAPI[invalid param]: payloadType[" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        } else if (nativeSetSEIPayloadType(this.mNativeRtcContext, i)) {
            apiLog("callExperimentalAPI[succeeded]: setSEIPayloadType (" + i + CommonConstant.Symbol.BRACKET_RIGHT);
        } else {
            apiLog("callExperimentalAPI[failed]: setSEIPayloadType (" + i + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBigStreamEncoder(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5) {
        if (i > 0 && i2 > 0) {
            this.mRoomInfo.bigEncSize.a = i;
            this.mRoomInfo.bigEncSize.b = i2;
            if (this.mVideoSourceType == VideoSourceType.SCREEN) {
                this.mConfig.l = 1;
                this.mConfig.a = this.mRoomInfo.bigEncSize.a;
                this.mConfig.b = this.mRoomInfo.bigEncSize.b;
            } else if (z) {
                this.mConfig.l = 1;
                this.mConfig.a = this.mRoomInfo.bigEncSize.a;
                this.mConfig.b = this.mRoomInfo.bigEncSize.b;
            } else {
                this.mConfig.l = 0;
                this.mConfig.a = this.mRoomInfo.bigEncSize.b;
                this.mConfig.b = this.mRoomInfo.bigEncSize.a;
            }
            this.mConfig.k = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_INVALID;
        }
        if (i3 > 0) {
            if (i3 > 30) {
                apiLog("setVideoEncoderParam fps > 30, limit fps to 30");
                this.mConfig.h = 30;
            } else {
                this.mConfig.h = i3;
            }
        }
        if (i4 > 0) {
            this.mConfig.c = i4;
        }
        if (i5 >= 0) {
            this.mConfig.e = i5;
        }
        if (this.mVideoSourceType == VideoSourceType.SCREEN) {
            this.mConfig.i = 3;
            this.mConfig.p = false;
            if (this.mOverrideFPSFromUser) {
                this.mConfig.h = 10;
            }
        } else {
            this.mConfig.p = z2;
        }
        setVideoEncConfig(2, this.mRoomInfo.bigEncSize.a, this.mRoomInfo.bigEncSize.b, this.mConfig.h, this.mConfig.c, this.mConfig.p, this.mConfig.e);
        if (this.mCodecType == 2 && this.mConfig.a * this.mConfig.b >= 518400) {
            this.mConfig.j = 1;
        }
        this.mCaptureAndEnc.e(this.mConfig.h);
        this.mCaptureAndEnc.a(this.mConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSmallStreamEncoder(int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (i > 0 && i2 > 0) {
            this.mRoomInfo.smallEncSize.a = i;
            this.mRoomInfo.smallEncSize.b = i2;
        }
        if (i3 > 0) {
            if (i3 > 20) {
                apiLog("setVideoSmallEncoderParam fps > 20, limit fps to 20");
                this.mSmallEncParam.videoFps = 20;
            } else {
                this.mSmallEncParam.videoFps = i3;
            }
        }
        if (i4 > 0) {
            this.mSmallEncParam.videoBitrate = i4;
        }
        if (i5 >= 0) {
            this.mSmallEncParam.minVideoBitrate = i5;
        }
        int i7 = this.mConfig.i;
        if (this.mVideoSourceType == VideoSourceType.SCREEN) {
            this.mSmallEncParam.enableAdjustRes = false;
            if (this.mOverrideFPSFromUser) {
                this.mSmallEncParam.videoFps = 10;
            }
            i6 = 3;
        } else {
            i6 = i7;
        }
        this.mCaptureAndEnc.a(this.mEnableSmallStream, this.mRoomInfo.smallEncSize.a, this.mRoomInfo.smallEncSize.b, this.mSmallEncParam.videoFps, this.mSmallEncParam.videoBitrate, i6);
        setVideoEncConfig(3, this.mRoomInfo.smallEncSize.a, this.mRoomInfo.smallEncSize.b, this.mSmallEncParam.videoFps, this.mSmallEncParam.videoBitrate, this.mConfig.p, this.mSmallEncParam.minVideoBitrate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderParamEx(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: codecType");
            return;
        }
        int optInt = jSONObject.optInt("codecType", -1);
        if (optInt != -1) {
            this.mCodecType = optInt;
            if (this.mCodecType == 0 && (optJSONObject = jSONObject.optJSONObject("softwareCodecParams")) != null) {
                this.mConfig.P = optJSONObject.optInt("enableRealTime") != 0;
                this.mConfig.n = optJSONObject.optInt("profile");
            }
        }
        int optInt2 = jSONObject.optInt("videoWidth", 0);
        int optInt3 = jSONObject.optInt("videoHeight", 0);
        int optInt4 = jSONObject.optInt("videoFps", 0);
        int optInt5 = jSONObject.optInt("videoBitrate", 0);
        int optInt6 = jSONObject.optInt("minVideoBitrate", 0);
        int optInt7 = jSONObject.optInt("rcMethod", 0);
        if (optInt2 <= 0 || optInt3 <= 0) {
            return;
        }
        if (optInt2 > 1920) {
            optInt3 = (optInt3 * 1920) / 1920;
            optInt2 = 1920;
        }
        if (optInt3 > 1920) {
            optInt2 = (optInt2 * 1920) / 1920;
            optInt3 = 1920;
        }
        if (optInt2 < 90) {
            optInt3 = (optInt3 * 90) / 90;
            optInt2 = 90;
        }
        if (optInt3 < 90) {
            optInt2 = (optInt2 * 90) / 90;
            optInt3 = 90;
        }
        int i = ((optInt2 + 15) / 16) * 16;
        int i2 = ((optInt3 + 15) / 16) * 16;
        int optInt8 = jSONObject.optInt("streamType", 0);
        if (optInt8 == 0) {
            this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_FPS, optInt4);
            updateBigStreamEncoder(i <= i2, i, i2, optInt4, optInt5, this.mConfig.p, optInt6);
            this.mCaptureAndEnc.l(optInt7);
        } else if (optInt8 == 1) {
            this.mLatestParamsOfSmallEncoder.putInt(KEY_CONFIG_FPS, optInt4);
            updateSmallStreamEncoder(i, i2, optInt4, optInt5, optInt6);
        }
        apiLog("vsize setVideoEncoderParamEx->width:" + this.mRoomInfo.bigEncSize.a + ", height:" + this.mRoomInfo.bigEncSize.b + ", fps:" + optInt4 + ", bitrate:" + optInt5 + ", stream:" + optInt8);
        updateOrientation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalAudioMuteMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            apiLog("setLocalAudioMuteMode[lack parameter or illegal type]: mode");
        }
        if (jSONObject.getInt(JsBridgeResult.ARG_KEY_LOCATION_MODE) == 0) {
            this.mEnableEosMode = false;
        } else {
            this.mEnableEosMode = true;
        }
        TXCAudioEngine.getInstance().enableCaptureEOSMode(this.mEnableEosMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioSampleRate(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("sampleRate")) {
            apiLog("setAudioSampleRate[lack parameter or illegal type]: sampleRate");
            return;
        }
        int i = jSONObject.getInt("sampleRate");
        if (this.mEnableCustomAudioCapture || this.mIsAudioCapturing) {
            apiLog("setAudioSampleRate[illegal state]");
        } else if (16000 != i && 48000 != i) {
            apiLog("muteRemoteAudioInSpeaker[illegal sampleRate]: " + i);
        } else {
            TXCAudioEngine.getInstance().setEncoderSampleRate(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioAGC(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioAGC[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftAGC = false;
        } else {
            this.mEnableSoftAGC = true;
        }
        if (jSONObject.has("level")) {
            this.mSoftAGCLevel = jSONObject.getInt("level");
        } else {
            this.mSoftAGCLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftAGC(this.mEnableSoftAGC, this.mSoftAGCLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioAEC(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioAEC[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftAEC = false;
        } else {
            this.mEnableSoftAEC = true;
        }
        if (jSONObject.has("level")) {
            this.mSoftAECLevel = jSONObject.getInt("level");
        } else {
            this.mSoftAECLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftAEC(this.mEnableSoftAEC, this.mSoftAECLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioANS(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioANS[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftANS = false;
        } else {
            this.mEnableSoftANS = true;
        }
        if (jSONObject.has("level")) {
            this.mSoftANSLevel = jSONObject.getInt("level");
        } else {
            this.mSoftANSLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftANS(this.mEnableSoftANS, this.mSoftANSLevel);
    }

    public void setPerformanceMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setPerformanceMode[lack parameter]");
        } else if (!jSONObject.has(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            apiLog("setPerformanceMode[lack parameter]: mode");
        } else {
            int i = jSONObject.getInt(JsBridgeResult.ARG_KEY_LOCATION_MODE);
            if (i == 1) {
                this.mPerformanceMode = 1;
                this.mCaptureAndEnc.b().enableSharpnessEnhancement(false);
                TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
                if (tRTCCloudImpl != null) {
                    nativeSetAllowSwitchToHighPerformanceMode(tRTCCloudImpl.getNetworkContext(), true);
                }
            } else if (i == 2) {
                TRTCCloudImpl tRTCCloudImpl2 = this.mCurrentPublishClouds.get(2);
                if (tRTCCloudImpl2 != null) {
                    nativeSetAllowSwitchToHighPerformanceMode(tRTCCloudImpl2.getNetworkContext(), false);
                }
            } else {
                this.mPerformanceMode = 0;
                TRTCCloudImpl tRTCCloudImpl3 = this.mCurrentPublishClouds.get(2);
                if (tRTCCloudImpl3 != null) {
                    nativeSetAllowSwitchToHighPerformanceMode(tRTCCloudImpl3.getNetworkContext(), true);
                }
            }
        }
    }

    public void muteRemoteAudioInSpeaker(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("muteRemoteAudioInSpeaker[lack parameter]");
        } else if (!jSONObject.has("userID")) {
            apiLog("muteRemoteAudioInSpeaker[lack parameter]: userID");
        } else {
            String string = jSONObject.getString("userID");
            if (string == null) {
                apiLog("muteRemoteAudioInSpeaker[illegal type]: userID");
            } else if (!jSONObject.has("mute")) {
                apiLog("muteRemoteAudioInSpeaker[lack parameter]: mute");
            } else {
                int i = jSONObject.getInt("mute");
                TRTCRoomInfo.UserInfo user = this.mRoomInfo.getUser(string);
                if (user != null) {
                    if (user != null) {
                        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(String.valueOf(user.tinyID), i == 1);
                        return;
                    } else {
                        apiLog("muteRemoteAudioInSpeaker[illegal type]: userID");
                        return;
                    }
                }
                apiLog("muteRemoteAudioInSpeaker " + string + " no exist, create one.");
                TRTCRoomInfo.UserInfo createUserInfo = createUserInfo(string);
                createUserInfo.muteAudioInSpeaker = i == 1;
                this.mRoomInfo.addUserInfo(string, createUserInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomRenderMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setCustomRenderMode param is null");
        } else if (!jSONObject.has(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            apiLog("setCustomRenderMode[lack parameter]: mode");
        } else {
            int optInt = jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, 0);
            this.mRoomInfo.enableCustomPreprocessor = optInt == 1;
            this.mCaptureAndEnc.a(this.mRoomInfo.enableCustomPreprocessor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaCodecConfig(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setMediaCodecConfig param is null");
            return;
        }
        this.mConfig.Y = jSONObject.has("encProperties") ? jSONObject.getJSONArray("encProperties") : null;
        this.mCaptureAndEnc.a(this.mConfig);
        this.mRoomInfo.decProperties = jSONObject.has("decProperties") ? jSONObject.getJSONArray("decProperties") : null;
        int i = jSONObject.has("restartDecoder") ? jSONObject.getInt("restartDecoder") : 0;
        this.mRoomInfo.enableRestartDecoder = i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramework(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setFramework[lack parameter]");
        } else if (!jSONObject.has("framework")) {
            apiLog("setFramework[lack parameter]: framework");
        } else {
            this.mFramework = jSONObject.getInt("framework");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceCallbackMixedPlayAudioFrame(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("forceCallbackMixedPlayAudioFrame param is null");
        } else if (!jSONObject.has("enable")) {
            apiLog("forceCallbackMixedPlayAudioFrame[lack parameter]: enable");
        } else {
            TXCAudioEngine.getInstance().forceCallbackMixedPlayAudioFrame(jSONObject.optInt("enable", 0) != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepAVCaptureOption(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setKeepAVCaptureOption param is null");
            return;
        }
        this.mKeepAVCaptureWhenEnterRoomFailed = jSONObject.optInt("keepWhenEnterRoomFailed", 0) != 0;
        apiLog("setKeepAVCaptureOption " + this.mKeepAVCaptureWhenEnterRoomFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartBeatTimeoutSec(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setHeartBeatTimeoutSec param is null");
        } else if (!jSONObject.has("timeoutSec")) {
            apiLog("setHeartBeatTimeoutSec[lack parameter]: timeoutSec");
        } else {
            nativeSetHeartBeatTimeoutSec(this.mNativeRtcContext, jSONObject.optInt("timeoutSec", 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    @Override // com.tencent.trtc.TRTCCloud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void callExperimentalAPI(final java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "callExperimentalAPI  "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", roomid = "
            r0.append(r1)
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            long r1 = r1.roomId
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L24
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            long r1 = r1.roomId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L28
        L24:
            com.tencent.liteav.trtc.impl.TRTCRoomInfo r1 = r5.mRoomInfo
            java.lang.String r1 = r1.strRoomId
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.apiLog(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "callExperimentalAPI:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            java.lang.String r1 = " self:"
            r0.append(r1)
            int r1 = r5.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ""
            com.tencent.liteav.basic.module.Monitor.a(r2, r0, r1, r4)
        L5b:
            java.lang.String r0 = ""
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L93
            r2.<init>(r6)     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = "api"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L93
            if (r3 != 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = "callExperimentalAPI[lack api or illegal type]: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L93
            r2.append(r6)     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L93
            r5.apiLog(r2)     // Catch: java.lang.Exception -> L93
            return
        L7d:
            java.lang.String r3 = "api"
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = "params"
            boolean r0 = r2.has(r0)     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L8c
            return
        L8c:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch: java.lang.Exception -> L94
            goto La6
        L93:
            r3 = r0
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "callExperimentalAPI[failed]: "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.apiLog(r0)
            r0 = r1
        La6:
            java.lang.String r1 = "setEncodedDataProcessingListener"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lb2
            r5.setEncodedDataProcessingListener(r0)
            return
        Lb2:
            com.tencent.liteav.trtc.impl.TRTCCloudImpl$80 r1 = new com.tencent.liteav.trtc.impl.TRTCCloudImpl$80
            r1.<init>()
            r5.runOnSDKThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.impl.TRTCCloudImpl.callExperimentalAPI(java.lang.String):void");
    }

    public void updatePrivateMapKey(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("callExperimentalAPI[update private map key fail, params is null");
            return;
        }
        String string = jSONObject.getString("privateMapKey");
        if (!TextUtils.isEmpty(string)) {
            nativeUpdatePrivateMapKey(this.mNativeRtcContext, string);
        } else {
            apiLog("callExperimentalAPI[update private map key fail, key is empty");
        }
    }

    public void sendJsonCmd(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has("jsonParam") || !(jSONObject.get("jsonParam") instanceof JSONObject)) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: sendJsonCMD");
            return;
        }
        nativeSendJsonCmd(this.mNativeRtcContext, jSONObject.getJSONObject("jsonParam").toString(), str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(final int i, final int i2, final TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        if (i != 1 && i != 4 && i != 2 && i != 5) {
            apiLog("setLocalVideoRenderListener unsupported pixelFormat : " + i);
            return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
        } else if (i2 != 1 && i2 != 2 && i2 != 3) {
            apiLog("setLocalVideoRenderListener unsupported bufferType : " + i2);
            return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.81
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog(String.format("setLocalVideoRenderListener pixelFormat:%d bufferType:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                    TRTCCloudImpl.this.mRoomInfo.localPixelFormat = i;
                    TRTCCloudImpl.this.mRoomInfo.localBufferType = i2;
                    TRTCCloudImpl.this.mRoomInfo.localListener = tRTCVideoRenderListener;
                    if (tRTCVideoRenderListener == null) {
                        TRTCCloudImpl.this.mCaptureAndEnc.a((u) null, i);
                    } else {
                        TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this, i);
                    }
                }
            });
            return 0;
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(final int i, final int i2, final TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        if (i != 1 && i != 4 && i != 2) {
            apiLog("setLocalVideoRenderListener unsupported pixelFormat : " + i);
            return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
        } else if (i2 != 1 && i2 != 2 && i2 != 3) {
            apiLog("setLocalVideoRenderListener unsupported bufferType : " + i2);
            return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.82
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog("setLocalVideoPreprocessListener pixelFormat: %d, bufferType: %d, listener: %s", Integer.valueOf(i), Integer.valueOf(i2), tRTCVideoFrameListener);
                    TRTCCloudImpl.this.mVideoPreprocessListenerAdapter.setListener(i, i2, tRTCVideoFrameListener);
                    TRTCCloudImpl.this.mCaptureAndEnc.b(tRTCVideoFrameListener == null);
                    TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mVideoPreprocessListenerAdapter);
                }
            });
            return 0;
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(final String str, final int i, final int i2, final TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        if (i != 1 && i != 4 && i != 2 && i != 5) {
            apiLog("setRemoteVideoRenderListener unsupported pixelFormat : " + i);
            return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
        } else if (i2 != 1 && i2 != 2 && i2 != 3) {
            apiLog("setRemoteVideoRenderListener unsupported bufferType : " + i2);
            return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.83
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog(String.format("setRemoteVideoRenderListener userid:%s pixelFormat:%d bufferType:%d", str, Integer.valueOf(i), Integer.valueOf(i2)));
                    if (tRTCVideoRenderListener == null) {
                        TRTCCloudImpl.this.mRenderListenerMap.remove(str);
                    } else {
                        RenderListenerAdapter renderListenerAdapter = new RenderListenerAdapter();
                        renderListenerAdapter.bufferType = i2;
                        renderListenerAdapter.pixelFormat = i;
                        renderListenerAdapter.listener = tRTCVideoRenderListener;
                        TRTCCloudImpl.this.mRenderListenerMap.put(str, renderListenerAdapter);
                        TRTCCloudImpl.this.mCustomRemoteRender = true;
                    }
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.83.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                            if (str2.equalsIgnoreCase(str)) {
                                RenderListenerAdapter renderListenerAdapter2 = TRTCCloudImpl.this.mRenderListenerMap.get(str);
                                if (renderListenerAdapter2 != null) {
                                    renderListenerAdapter2.strTinyID = String.valueOf(userInfo.tinyID);
                                }
                                TRTCCloudImpl tRTCCloudImpl = tRTCVideoRenderListener != null ? TRTCCloudImpl.this : null;
                                if (userInfo.mainRender.render != null) {
                                    userInfo.mainRender.render.setVideoFrameListener(tRTCCloudImpl, TRTCCloudImpl.this.getPixelFormat(renderListenerAdapter2.pixelFormat));
                                }
                                if (userInfo.subRender.render != null) {
                                    userInfo.subRender.render.setVideoFrameListener(tRTCCloudImpl, TRTCCloudImpl.this.getPixelFormat(renderListenerAdapter2.pixelFormat));
                                }
                            }
                        }
                    });
                }
            });
            return 0;
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.84
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mEnableCustomAudioCapture == z) {
                    return;
                }
                TRTCCloudImpl.this.mEnableCustomAudioCapture = z;
                if (z) {
                    TRTCCloudImpl.this.mConfig.R |= 1;
                    if (TRTCCloudImpl.this.mCurrentRole == 21) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.84.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener == null) {
                                    return;
                                }
                                tRTCCloudListener.onWarning(6001, "ignore send custom audio,for role audience", null);
                            }
                        });
                        TRTCCloudImpl.this.apiLog("ignore enableCustomAudioCapture,for role audience");
                    }
                } else {
                    TRTCCloudImpl.this.mConfig.R &= -2;
                }
                TRTCCloudImpl.this.mCaptureAndEnc.a(TRTCCloudImpl.this.mConfig);
                TRTCCloudImpl.this.apiLog("enableCustomAudioCapture " + z);
                Monitor.a(1, String.format("enableCustomAudioCapture:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                if (!TRTCCloudImpl.this.mIsAudioCapturing) {
                    TRTCCloudImpl.this.enableAudioStream(z);
                }
                if (z) {
                    TRTCCloudImpl.this.setQoSParams();
                    TXCAudioEngineJNI.nativeUseSysAudioDevice(false);
                    TXCAudioEngine.getInstance().startLocalAudio(11, true);
                    TXCAudioEngine.getInstance().enableEncodedDataPackWithTRAEHeaderCallback(true);
                    TXCEventRecorderProxy.a("18446744073709551615", 3003, 11L, -1L, "", 0);
                } else {
                    TXCAudioEngine.getInstance().stopLocalAudio();
                }
                TXCKeyPointReportProxy.a(40050, z ? 1 : 0, 1);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            apiLog("sendCustomAudioData parameter is null");
            return;
        }
        final com.tencent.liteav.basic.structs.a aVar = new com.tencent.liteav.basic.structs.a();
        aVar.audioData = new byte[tRTCAudioFrame.data.length];
        System.arraycopy(tRTCAudioFrame.data, 0, aVar.audioData, 0, tRTCAudioFrame.data.length);
        aVar.sampleRate = tRTCAudioFrame.sampleRate;
        aVar.channelsPerSample = tRTCAudioFrame.channel;
        aVar.bitsPerChannel = 16;
        if (0 == tRTCAudioFrame.timestamp) {
            aVar.timestamp = TXCTimeUtil.generatePtsMS();
        } else {
            aVar.timestamp = tRTCAudioFrame.timestamp;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.85
            @Override // java.lang.Runnable
            public void run() {
                if (!TRTCCloudImpl.this.mEnableCustomAudioCapture) {
                    TRTCCloudImpl.this.apiLog("sendCustomAudioData when mEnableCustomAudioCapture is false");
                } else {
                    TXCAudioEngine.getInstance().sendCustomPCMData(aVar);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playBGM(final String str, final TRTCCloud.BGMNotify bGMNotify) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.86
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("playBGM");
                TRTCCloudImpl.this.mBGMNotify = bGMNotify;
                if (TRTCCloudImpl.this.mBGMNotify != null) {
                    TXCLiveBGMPlayer.getInstance().setOnPlayListener(TRTCCloudImpl.this);
                } else {
                    TXCLiveBGMPlayer.getInstance().setOnPlayListener(null);
                }
                TXCLiveBGMPlayer.getInstance().startPlay(str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.87
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopBGM");
                TXCLiveBGMPlayer.getInstance().stopPlay();
                TRTCCloudImpl.this.mBGMNotify = null;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.88
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("pauseBGM");
                TXCLiveBGMPlayer.getInstance().pause();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.89
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("resumeBGM");
                TXCLiveBGMPlayer.getInstance().resume();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getBGMDuration(String str) {
        return TXCLiveBGMPlayer.getInstance().getBGMDuration(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setBGMPosition(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.90
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setBGMPosition " + i);
                TXCLiveBGMPlayer.getInstance().setBGMPosition(i);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMicVolumeOnMixing(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.91
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setMicVolume " + i);
                TXCAudioEngine.getInstance().setSoftwareCaptureVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.92
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setBGMVolume " + i);
                TXCLiveBGMPlayer.getInstance().setVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPlayoutVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.93
            @Override // java.lang.Runnable
            public void run() {
                float f = i / 100.0f;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setBGMPlayoutVolume:" + i + " fVolume:" + f);
                TXCLiveBGMPlayer.getInstance().setPlayoutVolume(f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPublishVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.94
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setBGMPublishVolume " + i);
                TXCLiveBGMPlayer.getInstance().setPublishVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setReverbType(final int i) {
        if (i < 0 || i > 7) {
            TXCLog.e(TAG, "reverbType not support :" + i);
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.95
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setLocalViewFillMode");
                TXAudioEffectManagerImpl.getInstance().setVoiceReverbType(TRTCCloudImpl.this.reverbTypes[i]);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean setVoiceChangerType(final int i) {
        if (i < 0 || i > 11) {
            TXCLog.e(TAG, "voiceChangerType not support :" + i);
            return false;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.96
            @Override // java.lang.Runnable
            public void run() {
                TXAudioEffectManagerImpl.getInstance().setVoiceChangerType(TRTCCloudImpl.this.voiceChangerTypes[i]);
            }
        });
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
        return TXAudioEffectManagerImpl.getAutoCacheHolder();
    }

    @Override // com.tencent.liteav.audio.c
    public void onEffectPlayFinish(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.97
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onEffectPlayFinish -> effectId = " + i);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i, 0);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.c
    public void onEffectPlayStart(final int i, final int i2) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.98
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onEffectPlayStart -> effectId = " + i + " code = " + i2);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener == null || i2 >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i, i2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playAudioEffect(final TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.99
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("playAudioEffect -> effectId = " + tRTCAudioEffectParam.effectId + " path = " + tRTCAudioEffectParam.path + " publish = " + tRTCAudioEffectParam.publish + " loopCount = " + tRTCAudioEffectParam.loopCount);
                TXCSoundEffectPlayer.getInstance().playEffectWithId(tRTCAudioEffectParam.effectId, tRTCAudioEffectParam.path, tRTCAudioEffectParam.publish, tRTCAudioEffectParam.loopCount);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioEffectVolume(final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.100
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setAudioEffectVolume -> effectId = " + i + " volume = " + i2);
                TXCSoundEffectPlayer.getInstance().setVolumeOfEffect(i, ((float) i2) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.101
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("stopAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().stopEffectWithId(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllAudioEffects() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.102
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopAllAudioEffects");
                TXCSoundEffectPlayer.getInstance().stopAllEffect();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAllAudioEffectsVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.103
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setAllAudioEffectsVolume volume = " + i);
                TXCSoundEffectPlayer.getInstance().setEffectsVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.104
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("pauseAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().pauseEffectWithId(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.105
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("resumeAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().resumeEffectWithId(i);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$106  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass106 implements Runnable {
        final /* synthetic */ int val$showType;

        AnonymousClass106(int i) {
            this.val$showType = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
            tRTCCloudImpl.apiLog("showDebugView " + this.val$showType);
            TRTCCloudImpl.this.mDebugType = this.val$showType;
            final TXCloudVideoView tXCloudVideoView = TRTCCloudImpl.this.mRoomInfo.localView;
            if (tXCloudVideoView != null) {
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.106.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tXCloudVideoView.showVideoDebugLog(AnonymousClass106.this.val$showType);
                    }
                });
            }
            TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.106.2
                @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                    final TXCloudVideoView tXCloudVideoView2 = userInfo.mainRender.view;
                    final TXCloudVideoView tXCloudVideoView3 = userInfo.subRender.view;
                    if (tXCloudVideoView2 == null && tXCloudVideoView3 == null) {
                        return;
                    }
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.106.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tXCloudVideoView2 != null) {
                                tXCloudVideoView2.showVideoDebugLog(AnonymousClass106.this.val$showType);
                            }
                            if (tXCloudVideoView3 != null) {
                                tXCloudVideoView3.showVideoDebugLog(AnonymousClass106.this.val$showType);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i) {
        runOnSDKThread(new AnonymousClass106(i));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(final String str, final TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.107
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setDebugViewMargin");
                final TXCloudVideoView tXCloudVideoView = TRTCCloudImpl.this.mRoomInfo.localView;
                if (tXCloudVideoView != null && str.equalsIgnoreCase(tXCloudVideoView.getUserId())) {
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.107.1
                        @Override // java.lang.Runnable
                        public void run() {
                            tXCloudVideoView.setLogMarginRatio(tRTCViewMargin.leftMargin, tRTCViewMargin.rightMargin, tRTCViewMargin.topMargin, tRTCViewMargin.bottomMargin);
                        }
                    });
                }
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    user.debugMargin = tRTCViewMargin;
                    final TXCloudVideoView tXCloudVideoView2 = user.mainRender.view;
                    final TXCloudVideoView tXCloudVideoView3 = user.subRender.view;
                    if (tXCloudVideoView2 == null && tXCloudVideoView3 == null) {
                        return;
                    }
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.107.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tXCloudVideoView2 != null) {
                                tXCloudVideoView2.setLogMarginRatio(tRTCViewMargin.leftMargin, tRTCViewMargin.rightMargin, tRTCViewMargin.topMargin, tRTCViewMargin.bottomMargin);
                            }
                            if (tXCloudVideoView3 != null) {
                                tXCloudVideoView3.setLogMarginRatio(tRTCViewMargin.leftMargin, tRTCViewMargin.rightMargin, tRTCViewMargin.topMargin, tRTCViewMargin.bottomMargin);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSpeedTest(final int i, final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TXCLog.e(TAG, "startSpeedTest failed with invalid params. userId = " + str + ", userSig = " + str2 + " self:" + hashCode());
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.108
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("startSpeedTest");
                TRTCCloudImpl.this.nativeStartSpeedTest(TRTCCloudImpl.this.mNativeRtcContext, i, str, str2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.109
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopSpeedTest");
                TRTCCloudImpl.this.nativeStopSpeedTest(TRTCCloudImpl.this.mNativeRtcContext);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishCDNStream(final TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        if (tRTCPublishCDNParam == null) {
            apiLog("startPublishCDNStream param is null");
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.110
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog("startPublishCDNStream");
                    TRTCCloudImpl.this.nativeStartPublishCDNStream(TRTCCloudImpl.this.mNativeRtcContext, tRTCPublishCDNParam);
                }
            });
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishing() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.111
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopPublishing");
                TRTCCloudImpl.this.nativeStopPublishing(TRTCCloudImpl.this.mNativeRtcContext);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishCDNStream() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.112
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopPublishCDNStream");
                TRTCCloudImpl.this.nativeStopPublishCDNStream(TRTCCloudImpl.this.mNativeRtcContext);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishing(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.113
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("startPublishing streamId:" + str + ", streamType:" + i);
                TRTCCloudImpl.this.nativeStartPublishing(TRTCCloudImpl.this.mNativeRtcContext, str, i == 2 ? 7 : 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixTranscodingConfig(final TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.114
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setMixTranscodingConfig " + tRTCTranscodingConfig);
                if (tRTCTranscodingConfig == null) {
                    Monitor.a(1, "cancelLiveMixTranscoding self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                }
                if (tRTCTranscodingConfig != null) {
                    TRTCCloudImpl.this.nativeSetMixTranscodingConfig(TRTCCloudImpl.this.mNativeRtcContext, new TRTCTranscodingConfigInner(tRTCTranscodingConfig));
                    return;
                }
                TRTCCloudImpl.this.nativeSetMixTranscodingConfig(TRTCCloudImpl.this.mNativeRtcContext, null);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(final int i, final byte[] bArr, final boolean z, final boolean z2) {
        if (bArr == null) {
            return false;
        }
        if (this.mCurrentRole == 21) {
            apiLog("ignore send custom cmd msg for audience");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mLastSendMsgTimeMs == 0) {
            this.mLastSendMsgTimeMs = currentTimeMillis;
        }
        boolean z3 = true;
        if (currentTimeMillis - this.mLastSendMsgTimeMs < 1000) {
            if (this.mSendMsgCount < 30 && this.mSendMsgSize < 8192) {
                this.mSendMsgCount++;
                this.mSendMsgSize += bArr.length;
            } else {
                TXCLog.e(TAG, "send msg too more self:" + hashCode());
                z3 = false;
            }
        } else {
            this.mLastSendMsgTimeMs = currentTimeMillis;
            this.mSendMsgCount = 1;
            this.mSendMsgSize = bArr.length;
        }
        if (z3) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.115
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.nativeSendCustomCmdMsg(TRTCCloudImpl.this.mNativeRtcContext, i, bArr, z, z2);
                }
            });
        }
        return z3;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(final byte[] bArr, final int i) {
        if (bArr == null) {
            return false;
        }
        if (this.mCurrentRole == 21) {
            apiLog("ignore send sei msg for audience");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mLastSendMsgTimeMs == 0) {
            this.mLastSendMsgTimeMs = currentTimeMillis;
        }
        boolean z = true;
        if (currentTimeMillis - this.mLastSendMsgTimeMs < 1000) {
            if (this.mSendMsgCount < 30 && this.mSendMsgSize < 8192) {
                this.mSendMsgCount++;
                this.mSendMsgSize += bArr.length;
            } else {
                TXCLog.e(TAG, "send msg too more self:" + hashCode());
                z = false;
            }
        } else {
            this.mLastSendMsgTimeMs = currentTimeMillis;
            this.mSendMsgCount = 1;
            this.mSendMsgSize = bArr.length;
        }
        if (z) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.116
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.nativeSendSEIMsg(TRTCCloudImpl.this.mNativeRtcContext, bArr, i);
                }
            });
        }
        return z;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(final TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.117
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("setAudioFrameListener " + tRTCAudioFrameListener);
                TRTCCloudImpl.this.mAudioFrameListener = tRTCAudioFrameListener;
                if (TRTCCloudImpl.this.mAudioFrameListener == null) {
                    TXCAudioEngine.setPlayoutDataListener(null);
                    TXCAudioEngine.getInstance().setAudioCaptureDataListener(null);
                    TXCAudioEngine.getInstance().setMixedAllDataListener(null);
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.117.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(userInfo.tinyID), null);
                        }
                    });
                    return;
                }
                TXCAudioEngine.setPlayoutDataListener(TRTCCloudImpl.this);
                TXCAudioEngine.getInstance().setAudioCaptureDataListener(TRTCCloudImpl.this);
                TXCAudioEngine.getInstance().setMixedAllDataListener(TRTCCloudImpl.this);
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.117.2
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(userInfo.tinyID), TRTCCloudImpl.this);
                    }
                });
            }
        });
    }

    public void setEncodedDataProcessingListener(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("listener")) {
            apiLog("setEncodedDataProcessingListener [lack parameter or illegal type]: listener");
            return;
        }
        long j = 0;
        try {
            j = jSONObject.getLong("listener");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        apiLog("setEncodedDataProcessingListener:" + Long.toHexString(j));
        nativeSetEncodedDataProcessingListener(this.mNativeRtcContext, j);
    }

    public void finalize() throws Throwable {
        super.finalize();
        try {
            destroy();
            if (this.mSDKHandler != null) {
                this.mSDKHandler.getLooper().quit();
            }
        } catch (Error unused) {
        } catch (Exception unused2) {
        }
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.118
            @Override // java.lang.Runnable
            public void run() {
                if (bundle == null) {
                    return;
                }
                String string = bundle.getString(TXCAVRoomConstants.EVT_USERID, "");
                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("18446744073709551615") && !string.equalsIgnoreCase(TRTCCloudImpl.this.mRoomInfo.getTinyId())) {
                    TRTCCloudImpl.this.notifyEventByUserId(string, i, bundle);
                } else {
                    TRTCCloudImpl.this.notifyEvent(TRTCCloudImpl.this.mRoomInfo.getUserId(), i, bundle);
                }
            }
        });
    }

    @Override // com.tencent.liteav.d.a
    public void onEncVideo(TXSNALPacket tXSNALPacket) {
        if (tXSNALPacket == null) {
            return;
        }
        synchronized (this.mNativeLock) {
            pushVideoFrame(tXSNALPacket);
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.b
    public void onRequestKeyFrame(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.119
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.nativeRequestKeyFrame(TRTCCloudImpl.this.mNativeRtcContext, Long.valueOf(str).longValue(), i);
            }
        });
    }

    @Override // com.tencent.liteav.audio.f
    public void onAudioPlayPcmData(final String str, final byte[] bArr, final long j, final int i, final int i2) {
        if (str == null) {
            TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
            if (tRTCAudioFrameListener != null) {
                TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
                tRTCAudioFrame.data = bArr;
                tRTCAudioFrame.timestamp = j;
                tRTCAudioFrame.sampleRate = i;
                tRTCAudioFrame.channel = i2;
                tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
                return;
            }
            return;
        }
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.120
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener2 = TRTCCloudImpl.this.mAudioFrameListener;
                if (tRTCAudioFrameListener2 != null) {
                    TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame2 = new TRTCCloudDef.TRTCAudioFrame();
                    tRTCAudioFrame2.data = bArr;
                    tRTCAudioFrame2.timestamp = j;
                    tRTCAudioFrame2.sampleRate = i;
                    tRTCAudioFrame2.channel = i2;
                    try {
                        tRTCAudioFrameListener2.onRemoteUserAudioFrame(tRTCAudioFrame2, TRTCCloudImpl.this.mRoomInfo.getUserIdByTinyId(Long.valueOf(str).longValue()));
                    } catch (Exception e) {
                        TXCLog.e(TRTCCloudImpl.TAG, "onPlayAudioFrame failed." + e.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.d
    public void onAudioJitterBufferNotify(final String str, final int i, final String str2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.121
            @Override // java.lang.Runnable
            public void run() {
                Bundle bundle = new Bundle();
                bundle.putLong(TXCAVRoomConstants.EVT_ID, i);
                bundle.putLong("EVT_TIME", System.currentTimeMillis());
                bundle.putString("EVT_MSG", str2);
                TRTCCloudImpl.this.notifyEventByUserId(str, i, bundle);
            }
        });
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onCapturedRawAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordError(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(TXCAVRoomConstants.EVT_USERID, "18446744073709551615");
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        TXCLog.e(TAG, "onRecordError code = " + i + CommonConstant.Symbol.COLON + str + " self:" + hashCode());
        if (i == -1) {
            bundle.putInt(TXCAVRoomConstants.EVT_ID, -1302);
            onNotifyEvent(-1302, bundle);
        }
        if (i == -6) {
            bundle.putInt(TXCAVRoomConstants.EVT_ID, TXLiteAVCode.EVT_MIC_START_SUCC);
            onNotifyEvent(TXLiteAVCode.EVT_MIC_START_SUCC, bundle);
        }
        if (i == -7) {
            bundle.putInt(TXCAVRoomConstants.EVT_ID, TXLiteAVCode.EVT_MIC_RELEASE_SUCC);
            onNotifyEvent(TXLiteAVCode.EVT_MIC_RELEASE_SUCC, bundle);
        }
    }

    @Override // com.tencent.liteav.audio.e
    public void onMixedAllData(byte[] bArr, int i, int i2) {
        final TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i;
        tRTCAudioFrame.channel = i2;
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.122
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = TRTCCloudImpl.this.mAudioFrameListener;
                if (tRTCAudioFrameListener != null) {
                    tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
                }
            }
        });
    }

    @Override // com.tencent.liteav.u
    public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
        String str2;
        if (tXSVideoFrame == null) {
            return;
        }
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.width = tXSVideoFrame.width;
        tRTCVideoFrame.height = tXSVideoFrame.height;
        tRTCVideoFrame.rotation = tXSVideoFrame.rotation;
        tRTCVideoFrame.timestamp = tXSVideoFrame.pts;
        int translateStreamType = translateStreamType(i);
        boolean z = TextUtils.isEmpty(str) || str.equalsIgnoreCase("18446744073709551615") || str.equalsIgnoreCase(this.mRoomInfo.getTinyId());
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener = null;
        if (z) {
            String userId = this.mRoomInfo.getUserId();
            tRTCVideoFrame.pixelFormat = this.mRoomInfo.localPixelFormat;
            tRTCVideoFrame.bufferType = this.mRoomInfo.localBufferType;
            tRTCVideoRenderListener = this.mRoomInfo.localListener;
            str2 = userId;
        } else {
            Iterator<Map.Entry<String, RenderListenerAdapter>> it = this.mRenderListenerMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                Map.Entry<String, RenderListenerAdapter> next = it.next();
                RenderListenerAdapter value = next.getValue();
                if (value != null && str.equalsIgnoreCase(next.getValue().strTinyID)) {
                    tRTCVideoFrame.pixelFormat = value.pixelFormat;
                    tRTCVideoFrame.bufferType = value.bufferType;
                    tRTCVideoRenderListener = value.listener;
                    str2 = next.getKey();
                    break;
                }
            }
        }
        if (tRTCVideoRenderListener != null) {
            if (tRTCVideoFrame.bufferType == 1) {
                if (tXSVideoFrame.eglContext != null) {
                    tRTCVideoFrame.buffer = ByteBuffer.allocateDirect(tXSVideoFrame.width * tXSVideoFrame.height * 4);
                    TXCOpenGlUtils.a(e.a.RGBA, tXSVideoFrame.width, tXSVideoFrame.height, tRTCVideoFrame.buffer);
                } else {
                    if (tXSVideoFrame.buffer == null) {
                        tXSVideoFrame.loadYUVBufferFromGL();
                    }
                    tRTCVideoFrame.buffer = tXSVideoFrame.buffer;
                }
            } else if (tRTCVideoFrame.bufferType == 2) {
                if (tXSVideoFrame.eglContext != null) {
                    tRTCVideoFrame.data = new byte[tXSVideoFrame.width * tXSVideoFrame.height * 4];
                    TXCOpenGlUtils.a(e.a.RGBA, tXSVideoFrame.width, tXSVideoFrame.height, tRTCVideoFrame.data);
                } else {
                    tRTCVideoFrame.data = tXSVideoFrame.data;
                    if (tRTCVideoFrame.data == null) {
                        tRTCVideoFrame.data = new byte[((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2];
                        tXSVideoFrame.loadYUVArray(tRTCVideoFrame.data);
                    }
                }
            } else if (tRTCVideoFrame.bufferType == 3) {
                if (tXSVideoFrame.eglContext == null) {
                    return;
                }
                tRTCVideoFrame.texture = new TRTCCloudDef.TRTCTexture();
                tRTCVideoFrame.texture.textureId = tXSVideoFrame.textureId;
                if (tXSVideoFrame.eglContext instanceof EGLContext) {
                    tRTCVideoFrame.texture.eglContext10 = (EGLContext) tXSVideoFrame.eglContext;
                } else if (tXSVideoFrame.eglContext instanceof android.opengl.EGLContext) {
                    tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) tXSVideoFrame.eglContext;
                }
            }
            tRTCVideoRenderListener.onRenderVideoFrame(str2, translateStreamType, tRTCVideoFrame);
            if (this.mRoomInfo.enableCustomPreprocessor && z) {
                if (tRTCVideoFrame.bufferType == 2) {
                    tXSVideoFrame.data = tRTCVideoFrame.data;
                } else if (tRTCVideoFrame.bufferType == 3) {
                    tXSVideoFrame.textureId = tRTCVideoFrame.texture.textureId;
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.h
    public void onPlayStart() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.123
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMStart(0);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.h
    public void onPlayEnd(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.124
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMComplete(i);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.h
    public void onPlayProgress(final long j, final long j2) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.125
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMProgress(j, j2);
                }
            }
        });
    }

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    private void onRequestToken(int i, String str, final long j, final byte[] bArr) {
        apiLog("onRequestToken " + j + CommonConstant.Symbol.COMMA + i + ", " + str);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.126
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mRoomInfo.setTinyId(String.valueOf(j));
                TRTCCloudImpl.this.mRoomInfo.setToken(TRTCCloudImpl.this.mContext, bArr);
            }
        });
    }

    private void onRequestAccIP(int i, String str, boolean z) {
        apiLog("onRequestAccIP err:" + i + StringUtil.SPACE + str + " isAcc:" + z);
        if (i == 0) {
            String str2 = z ? "connect ACC" : "connect PROXY";
            Bundle bundle = new Bundle();
            bundle.putLong(TXCAVRoomConstants.EVT_ID, i);
            bundle.putLong("EVT_TIME", System.currentTimeMillis());
            bundle.putString("EVT_MSG", str2);
            bundle.putInt("EVT_STREAM_TYPE", 2);
            notifyEvent(this.mRoomInfo.getUserId(), i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onEnterRoom(final int i, final String str) {
        apiLog("onEnterRoom " + i + ", " + str);
        Monitor.a(1, String.format("onEnterRoom err:%d msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        if (i == 0) {
            TXCEventRecorderProxy.a("18446744073709551615", 5003, 1L, -1L, "", 0);
        } else {
            TXCEventRecorderProxy.a("18446744073709551615", 5003, 0L, -1L, "", 0);
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.127
            @Override // java.lang.Runnable
            public void run() {
                if (i != 0) {
                    if (TRTCCloudImpl.this.mKeepAVCaptureWhenEnterRoomFailed) {
                        TRTCCloudImpl.this.mRoomState = 0;
                    } else {
                        TRTCCloudImpl.this.exitRoomInternal(false, "enter room failed");
                    }
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    String userId = TRTCCloudImpl.this.mRoomInfo.getUserId();
                    int i2 = i;
                    tRTCCloudImpl.notifyEvent(userId, i2, "Enter room fail " + str);
                    switch (i) {
                        case TXLiteAVCode.ERR_USER_SIG_INVALID /* -3320 */:
                        case TXLiteAVCode.ERR_USER_ID_INVALID /* -3319 */:
                        case TXLiteAVCode.ERR_ROOM_ID_INVALID /* -3318 */:
                        case TXLiteAVCode.ERR_SDK_APPID_INVALID /* -3317 */:
                        case TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL /* -3316 */:
                            TXCKeyPointReportProxy.b(i);
                            return;
                        default:
                            return;
                    }
                }
                TRTCCloudImpl.this.mRoomState = 2;
                TRTCCloudImpl.this.mRoomInfo.networkStatus = 3;
                if (TRTCCloudImpl.this.mRoomInfo.muteLocalVideo) {
                    TRTCCloudImpl.this.muteUpstream(2, TRTCCloudImpl.this.mRoomInfo.muteLocalVideo);
                }
                if (TRTCCloudImpl.this.mRoomInfo.muteLocalAudio) {
                    TRTCCloudImpl.this.muteUpstream(1, TRTCCloudImpl.this.mRoomInfo.muteLocalAudio);
                }
                TRTCCloudImpl.this.notifyEvent(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, "Enter room success");
            }
        });
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.128
            @Override // java.lang.Runnable
            public void run() {
                TXCKeyPointReportProxy.b((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY, i);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                long roomElapsed = TRTCCloudImpl.this.mRoomInfo.getRoomElapsed();
                if (tRTCCloudListener != null) {
                    if (i == 0) {
                        tRTCCloudListener.onEnterRoom(roomElapsed);
                    } else {
                        tRTCCloudListener.onEnterRoom(i);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExitRoom(int i, String str) {
        apiLog("onExitRoom " + i + ", " + str);
        Monitor.a(1, String.format("onExitRoom err:%d msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnSDKThread(new AnonymousClass129(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$129  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass129 implements Runnable {
        final /* synthetic */ int val$err;

        AnonymousClass129(int i) {
            this.val$err = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TRTCCloudImpl.this.mIsExitOldRoom) {
                TRTCCloudImpl.this.mIsExitOldRoom = false;
                TRTCCloudImpl.this.apiLog("exit no current room, ignore onExitRoom.");
            } else if (TRTCCloudImpl.this.mRoomInfo.isMicStard()) {
                TRTCCloudImpl.this.mRoomInfo.setRoomExit(true, this.val$err);
                TRTCCloudImpl.this.apiLog("onExitRoom delay 2s when mic is not release.");
                TRTCCloudImpl.this.runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.129.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TRTCCloudImpl.this.mRoomInfo.isRoomExit()) {
                            TRTCCloudImpl.this.apiLog("force onExitRoom after 2s");
                            final int roomExitCode = TRTCCloudImpl.this.mRoomInfo.getRoomExitCode();
                            TRTCCloudImpl.this.mRoomInfo.setRoomExit(false, 0);
                            TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.129.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                    if (tRTCCloudListener != null) {
                                        tRTCCloudListener.onExitRoom(roomExitCode);
                                    }
                                }
                            });
                        }
                    }
                }, 2000);
            } else {
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.129.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                        if (tRTCCloudListener != null) {
                            tRTCCloudListener.onExitRoom(AnonymousClass129.this.val$err);
                        }
                    }
                });
            }
        }
    }

    private void onKickOut(final int i, final String str) {
        apiLog("onKickOut " + i + ", " + str);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.130
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.exitRoomInternal(false, "onKickOut " + str);
                TRTCCloudImpl.this.onExitRoom(i, str);
            }
        });
    }

    private void onConnectOtherRoom(final String str, final int i, final String str2) {
        apiLog("onConnectOtherRoom " + str + ", " + i + ", " + str2);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("onConnectOtherRoom userId:%s err:%d, msg:%s", str, Integer.valueOf(i), str2));
        sb.append(" self:");
        sb.append(hashCode());
        Monitor.a(1, sb.toString(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.131
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    TRTCCloudImpl.this.mTRTCListener.onConnectOtherRoom(str, i, str2);
                }
            }
        });
    }

    private void onDisConnectOtherRoom(final int i, final String str) {
        apiLog("onDisConnectOtherRoom " + i + ", " + str);
        Monitor.a(1, String.format("onDisConnectOtherRoom err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.132
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    TRTCCloudImpl.this.mTRTCListener.onDisConnectOtherRoom(i, str);
                }
            }
        });
    }

    private void onSwitchRoom(final int i, final String str) {
        apiLog("onSwitchRoom " + i + ", " + str);
        Monitor.a(1, String.format("onSwitchRoom err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.133
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    TRTCCloudImpl.this.mTRTCListener.onSwitchRoom(i, str);
                }
            }
        });
    }

    private void onCallExperimentalAPI(int i, String str) {
        apiLog("onCallExperimentalAPI " + i + ", " + str);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.134
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    private void onRequestDownStream(final int i, final String str, final long j, final int i2) {
        if (i != 0) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.135
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                    if (tRTCCloudListener != null) {
                        tRTCCloudListener.onError(i, str, null);
                    }
                }
            });
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.136
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.136.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                            if (i2 == 1 || j != userInfo.tinyID) {
                                return;
                            }
                            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                            tRTCCloudImpl.apiLog("onRequestDownStream " + userInfo.tinyID + ", " + userInfo.userID + ", " + i2);
                            if (i2 == 7) {
                                if (userInfo.subRender.render == null || userInfo.subRender.render.getStreamType() == i2) {
                                    return;
                                }
                                userInfo.subRender.render.stopVideo();
                                userInfo.subRender.render.setStreamType(i2);
                                userInfo.subRender.render.startVideo();
                            } else if (userInfo.mainRender.render == null || userInfo.mainRender.render.getStreamType() == i2) {
                            } else {
                                userInfo.mainRender.render.stopVideo();
                                userInfo.mainRender.render.setStreamType(i2);
                                userInfo.mainRender.render.startVideo();
                                TXCKeyPointReportProxy.a(String.valueOf(userInfo.tinyID), 40038, 0L, i2);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TXCRenderAndDec createRender(long j, int i) {
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.mContext);
        tXCRenderAndDec.setID(String.valueOf(j));
        tXCRenderAndDec.setVideoRender(new com.tencent.liteav.renderer.a());
        tXCRenderAndDec.setStreamType(i);
        tXCRenderAndDec.setNotifyListener(this);
        tXCRenderAndDec.setRenderAndDecDelegate(this);
        tXCRenderAndDec.setRenderMode(0);
        tXCRenderAndDec.enableDecoderChange(this.mPerformanceMode != 1);
        tXCRenderAndDec.enableRestartDecoder(this.mRoomInfo.enableRestartDecoder);
        tXCRenderAndDec.enableLimitDecCache(this.mVideoServerConfig.enableHWVUI);
        applyRenderConfig(tXCRenderAndDec);
        return tXCRenderAndDec;
    }

    protected void onAVMemberEnter(final long j, final String str, final int i, final int i2) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mRoomState == 0) {
                    TRTCCloudImpl.this.apiLog("ignore onAVMemberEnter when out room.");
                } else if (((TRTCCloudImpl) weakReference.get()) == null) {
                } else {
                    TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                    if (user != null) {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.apiLog(" user " + str + "enter room when user is in room " + j);
                    }
                    String valueOf = String.valueOf(j);
                    if (user == null) {
                        user = TRTCCloudImpl.this.createUserInfo(str);
                    }
                    TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(valueOf, TRTCCloudImpl.this);
                    if (TRTCCloudImpl.this.mAudioFrameListener != null) {
                        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(valueOf, TRTCCloudImpl.this);
                    }
                    com.tencent.liteav.audio.a.a().a(valueOf, true, TRTCCloudImpl.this.hashCode());
                    TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(valueOf, user.muteAudioInSpeaker);
                    if (user.mainRender.muteAudio == TRTCRoomInfo.TRTCRemoteMuteState.MUTE) {
                        TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, j, 1, true);
                        TXCAudioEngine.getInstance().muteRemoteAudio(valueOf, true);
                    } else if (user.mainRender.muteAudio == TRTCRoomInfo.TRTCRemoteMuteState.UNMUTE) {
                        TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, j, 1, true);
                        TXCAudioEngine.getInstance().muteRemoteAudio(valueOf, false);
                    }
                    TXCRenderAndDec createRender = TRTCCloudImpl.this.createRender(j, TRTCCloudImpl.this.mPriorStreamType);
                    RenderListenerAdapter renderListenerAdapter = TRTCCloudImpl.this.mRenderListenerMap.get(str);
                    if (renderListenerAdapter != null) {
                        renderListenerAdapter.strTinyID = valueOf;
                        if (renderListenerAdapter.listener != null) {
                            createRender.setVideoFrameListener(TRTCCloudImpl.this, TRTCCloudImpl.this.getPixelFormat(renderListenerAdapter.pixelFormat));
                        }
                    }
                    user.tinyID = j;
                    user.userID = str;
                    user.terminalType = i;
                    user.streamState = i2;
                    user.mainRender.render = createRender;
                    user.mainRender.tinyID = j;
                    user.streamType = TRTCCloudImpl.this.mPriorStreamType;
                    if (user.mainRender.view != null) {
                        TRTCCloudImpl.this.setRenderView(str, user.mainRender, user.mainRender.view, user.debugMargin);
                        TRTCCloudImpl.this.apiLog(String.format("startRemoteView when user enter userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        String valueOf2 = String.valueOf(user.tinyID);
                        int i3 = user.streamType;
                        tRTCCloudImpl2.notifyLogByUserId(valueOf2, i3, 0, "Start watching " + str);
                        TRTCCloudImpl.this.startRemoteRender(user.mainRender.render, user.streamType);
                        TXCKeyPointReportProxy.a(String.valueOf(user.tinyID), 40021, 0L, user.streamType);
                        if (!user.mainRender.muteVideo) {
                            TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, user.streamType, true);
                        } else {
                            TRTCCloudImpl.this.nativeCancelDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, user.streamType, true);
                        }
                    }
                    user.subRender.render = TRTCCloudImpl.this.createRender(j, 7);
                    user.subRender.tinyID = j;
                    user.subRender.muteVideo = TRTCCloudImpl.this.mRoomInfo.muteRemoteVideo;
                    if (user.subRender.view != null) {
                        TRTCCloudImpl.this.setRenderView(str, user.subRender, user.subRender.view, user.debugMargin);
                        TRTCCloudImpl.this.apiLog(String.format("onUserScreenAvailable when user enter userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), 7));
                        Monitor.a(1, String.format("startRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                        String valueOf3 = String.valueOf(user.tinyID);
                        tRTCCloudImpl3.notifyLogByUserId(valueOf3, 7, 0, "Start watching " + str);
                        TRTCCloudImpl.this.startRemoteRender(user.subRender.render, 7);
                        TXCKeyPointReportProxy.a(String.valueOf(user.tinyID), 40021, 0L, 7);
                        if (!user.subRender.muteVideo) {
                            TRTCCloudImpl.this.nativeRequestDownStream(TRTCCloudImpl.this.mNativeRtcContext, user.tinyID, 7, true);
                        }
                    }
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, user);
                    TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                    tRTCCloudImpl4.apiLog("onAVMemberEnter " + j + ", " + str + ", " + i2);
                    final TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tRTCCloudListener != null) {
                                tRTCCloudListener.onUserEnter(str);
                            }
                        }
                    });
                    final boolean z = TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2);
                    if (z) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onUserAudioAvailable(str, z);
                                }
                                Monitor.a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                        });
                        TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]audio Available[true]", str));
                    }
                    final boolean z2 = (TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2);
                    if (z2 && TRTCCloudImpl.this.mRoomInfo.hasRecvFirstIFrame(j)) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137.3
                            @Override // java.lang.Runnable
                            public void run() {
                                TXCLog.i(TRTCCloudImpl.TAG, "notify onUserVideoAvailable:" + j + " [" + z2 + "] by bit state. self:" + TRTCCloudImpl.this.hashCode());
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onUserVideoAvailable(str, z2);
                                }
                                Monitor.a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z2)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                        });
                        TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[true]", str));
                    }
                    final boolean z3 = TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2);
                    if (z3) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onUserSubStreamAvailable(str, z3);
                                }
                                Monitor.a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z3)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                        });
                        TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]subvideo Available[true]", str));
                    }
                    TRTCCloudImpl.this.notifyEvent(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]enter room", str));
                }
            }
        });
    }

    protected void onAVMemberExit(final long j, final String str, int i, final int i2) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mRoomState == 0) {
                    TRTCCloudImpl.this.apiLog("ignore onAVMemberExit when out room.");
                } else if (((TRTCCloudImpl) weakReference.get()) == null) {
                } else {
                    TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                    if (user != null) {
                        TRTCCloudImpl.this.stopRemoteRender(user);
                        TRTCCloudImpl.this.mRoomInfo.removeRenderInfo(user.userID);
                    } else {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.apiLog("user " + str + " exit room when user is not in room " + j);
                    }
                    com.tencent.liteav.audio.a.a().a(String.valueOf(j), TRTCCloudImpl.this.hashCode());
                    TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(j), null);
                    TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(String.valueOf(j), null);
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                            tRTCCloudImpl2.apiLog("onAVMemberExit " + j + ", " + str + ", " + i2);
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener != null) {
                                if (TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2)) {
                                    tRTCCloudListener.onUserAudioAvailable(str, false);
                                    TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]audio Available[%b]", str, Boolean.FALSE));
                                    Monitor.a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, Boolean.FALSE) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                                }
                                if ((TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2)) {
                                    tRTCCloudListener.onUserVideoAvailable(str, false);
                                    TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[%b]", str, Boolean.FALSE));
                                    Monitor.a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, Boolean.FALSE) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                                }
                                if (TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2)) {
                                    tRTCCloudListener.onUserSubStreamAvailable(str, false);
                                    TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]subVideo Available[%b]", str, Boolean.FALSE));
                                    Monitor.a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, Boolean.FALSE) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                                }
                                tRTCCloudListener.onUserExit(str, 0);
                            }
                        }
                    });
                }
            }
        });
        notifyEvent(this.mRoomInfo.getUserId(), 0, String.format("[%s]leave room", str));
    }

    private void onAVMemberChange(final long j, final String str, int i, final int i2, final int i3) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.139
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mRoomState == 0) {
                    TRTCCloudImpl.this.apiLog("ignore onAVMemberChange when out room");
                } else if (((TRTCCloudImpl) weakReference.get()) == null) {
                } else {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.apiLog("onAVMemberChange " + j + ", " + str + ", old state:" + i3 + ", new state:" + i2);
                    TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                    if (user != null) {
                        user.streamState = i2;
                        TRTCCloudImpl.this.checkUserState(str, j, i2, i3);
                    }
                }
            }
        });
    }

    private void onWholeMemberEnter(long j, final String str) {
        final WeakReference weakReference = new WeakReference(this);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.140
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener;
                if (((TRTCCloudImpl) weakReference.get()) == null || (tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener) == null) {
                    return;
                }
                tRTCCloudListener.onRemoteUserEnterRoom(str);
            }
        });
    }

    private void onWholeMemberExit(long j, final String str, final int i) {
        final WeakReference weakReference = new WeakReference(this);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.141
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener;
                if (((TRTCCloudImpl) weakReference.get()) == null || (tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener) == null) {
                    return;
                }
                tRTCCloudListener.onRemoteUserLeaveRoom(str, i);
            }
        });
    }

    private void onNotify(long j, int i, int i2, String str) {
        apiLog(j + " event " + i2 + ", " + str);
        String valueOf = String.valueOf(j);
        Bundle bundle = new Bundle();
        bundle.putLong(TXCAVRoomConstants.EVT_ID, (long) i2);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString("EVT_MSG", str);
        bundle.putInt("EVT_STREAM_TYPE", i);
        if (TextUtils.isEmpty(valueOf) || j == 0 || valueOf.equalsIgnoreCase("18446744073709551615") || valueOf.equalsIgnoreCase(this.mRoomInfo.getTinyId())) {
            notifyEvent(this.mRoomInfo.getUserId(), i2, bundle);
        } else {
            notifyLogByUserId(String.valueOf(j), i, i2, str);
        }
    }

    public void onAudioQosChanged(int i, int i2, int i3) {
        onAudioQosChanged(this, i, i2, i3);
    }

    public void onAudioQosChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final int i2, final int i3) {
        if (isPublishingInCloud(tRTCCloudImpl, 1)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.142
                @Override // java.lang.Runnable
                public void run() {
                    TXCAudioEngine.getInstance().setAudioEncoderParam(i, i2);
                    TXCAudioEngine.getInstance().setEncoderFECPercent(i3);
                }
            });
        }
    }

    public void onVideoQosChanged(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        onVideoQosChanged(this, i, i2, i3, i4, i5, i6, i7);
    }

    public void onVideoQosChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        if (isPublishingInCloud(tRTCCloudImpl, i)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.143
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mCaptureAndEnc.a(i, i2, i3, i4, i5, i6, i7);
                    if (i == 2) {
                        int i8 = i2 > i3 ? 0 : 1;
                        if (TRTCCloudImpl.this.mConfig.l == i8 || i2 == i3) {
                            return;
                        }
                        TRTCCloudImpl.this.mConfig.l = i8;
                        TRTCCloudImpl.this.updateOrientation();
                    }
                }
            });
        }
    }

    public void onIdrFpsChanged(int i) {
        onIdrFpsChanged(this, i);
    }

    public void onIdrFpsChanged(TRTCCloudImpl tRTCCloudImpl, final int i) {
        if (isPublishingInCloud(tRTCCloudImpl, 2)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.144
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mCaptureAndEnc.c(i);
                }
            });
        }
    }

    private void onVideoBlockThresholdChanged(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.145
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.145.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        if (userInfo.mainRender.render != null) {
                            userInfo.mainRender.render.setBlockInterval(i);
                        }
                        if (userInfo.subRender.render != null) {
                            userInfo.subRender.render.setBlockInterval(i);
                        }
                    }
                });
            }
        });
    }

    private void onConnectionLost() {
        this.mRoomInfo.networkStatus = 1;
        notifyEvent(this.mRoomInfo.getUserId(), 0, "Network anomaly.");
        Monitor.a(1, "onConnectionLost self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.146
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onConnectionLost();
                }
            }
        });
    }

    private void onTryToReconnect() {
        this.mRoomInfo.networkStatus = 2;
        notifyEvent(this.mRoomInfo.getUserId(), 0, "Retry enter room.");
        Monitor.a(1, "onTryToReconnect self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.147
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onTryToReconnect();
                }
            }
        });
    }

    private void onConnectionRecovery() {
        this.mRoomInfo.networkStatus = 3;
        notifyEvent(this.mRoomInfo.getUserId(), 0, "Network recovered. Successfully re-enter room");
        Monitor.a(1, "onConnectionRecovery self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.148
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onConnectionRecovery();
                }
            }
        });
    }

    private void onRecvCustomCmdMsg(final String str, long j, final int i, final int i2, final byte[] bArr, final boolean z, final int i3, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.mRecvCustomCmdMsgCountInPeriod++;
        if (currentTimeMillis - this.mLastLogCustomCmdMsgTs > 10000) {
            TXCLog.i(TAG, "onRecvMsg. tinyId=" + j + ", streamId = " + i + ", msg = " + bArr + ", recvTime = " + j2 + ", recvCustomMsgCountInPeriod = " + this.mRecvCustomCmdMsgCountInPeriod + " self:" + hashCode());
            this.mLastLogCustomCmdMsgTs = currentTimeMillis;
            this.mRecvCustomCmdMsgCountInPeriod = 0L;
        }
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.149
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onRecvCustomCmdMsg(str, i, i2, bArr);
                    if (!z || i3 <= 0) {
                        return;
                    }
                    tRTCCloudListener.onMissCustomCmdMsg(str, i, -1, i3);
                }
            }
        });
    }

    private void onRecvSEIMsg(final long j, final byte[] bArr) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.150
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    try {
                        String userIdByTinyId = TRTCCloudImpl.this.mRoomInfo.getUserIdByTinyId(j);
                        if (userIdByTinyId != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            TRTCCloudImpl.access$8608(TRTCCloudImpl.this);
                            if (currentTimeMillis - TRTCCloudImpl.this.mLastLogSEIMsgTs > 10000) {
                                TXCLog.i(TRTCCloudImpl.TAG, "onRecvSEIMsg. userId=" + userIdByTinyId + ", message = " + new String(bArr) + ", recvSEIMsgCountInPeriod = " + TRTCCloudImpl.this.mRecvSEIMsgCountInPeriod + " self:" + TRTCCloudImpl.this.hashCode());
                                TRTCCloudImpl.this.mLastLogSEIMsgTs = currentTimeMillis;
                                TRTCCloudImpl.this.mRecvSEIMsgCountInPeriod = 0L;
                            }
                            tRTCCloudListener.onRecvSEIMsg(userIdByTinyId, bArr);
                            return;
                        }
                        TXCLog.i(TRTCCloudImpl.TAG, "onRecvSEIMsg Error, user id is null for tinyId=" + j + " self:" + TRTCCloudImpl.this.hashCode());
                    } catch (Exception e) {
                        TXCLog.e(TRTCCloudImpl.TAG, "onRecvSEIMsg failed.", e);
                    }
                }
            }
        });
    }

    private void onSpeedTest(final String str, final int i, final float f, final float f2, final int i2, final int i3) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.151
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = new TRTCCloudDef.TRTCSpeedTestResult();
                    tRTCSpeedTestResult.ip = str;
                    tRTCSpeedTestResult.rtt = i;
                    tRTCSpeedTestResult.upLostRate = f;
                    tRTCSpeedTestResult.downLostRate = f2;
                    if (f >= f2) {
                        tRTCSpeedTestResult.quality = TRTCCloudImpl.this.getNetworkQuality(i, (int) (f * 100.0f));
                    } else {
                        tRTCSpeedTestResult.quality = TRTCCloudImpl.this.getNetworkQuality(i, (int) (f2 * 100.0f));
                    }
                    tRTCCloudListener.onSpeedTest(tRTCSpeedTestResult, i2, i3);
                    TRTCCloudImpl.this.apiLog(String.format("SpeedTest progress %d/%d, result: %s", Integer.valueOf(i2), Integer.valueOf(i3), tRTCSpeedTestResult.toString()));
                }
            }
        });
    }

    public void onVideoConfigChanged(int i, boolean z) {
        onVideoConfigChanged(this, i, z);
    }

    public void onVideoConfigChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final boolean z) {
        if (isPublishingInCloud(tRTCCloudImpl, i)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.152
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 2) {
                        TRTCCloudImpl.this.mCaptureAndEnc.h(z);
                    }
                }
            });
        }
    }

    private void onRecvFirstAudio(long j) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.153
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    private void onRecvFirstVideo(final long j, int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.154
            @Override // java.lang.Runnable
            public void run() {
                int recvFirstIFrame = TRTCCloudImpl.this.mRoomInfo.recvFirstIFrame(j);
                TRTCRoomInfo.UserInfo userInfo = null;
                try {
                    String userIdByTinyId = TRTCCloudImpl.this.mRoomInfo.getUserIdByTinyId(j);
                    if (userIdByTinyId != null) {
                        userInfo = TRTCCloudImpl.this.mRoomInfo.getUser(userIdByTinyId);
                    }
                } catch (Exception e) {
                    TXCLog.e(TRTCCloudImpl.TAG, "get user info failed.", e);
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onRecvFirstVideo " + j + ", " + recvFirstIFrame);
                if (userInfo == null || recvFirstIFrame > 1) {
                    return;
                }
                final String str = userInfo.userID;
                if ((TRTCRoomInfo.hasMainVideo(userInfo.streamState) || TRTCRoomInfo.hasSmallVideo(userInfo.streamState)) && !TRTCRoomInfo.isMuteMainVideo(userInfo.streamState)) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.154.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            TXCLog.i(TRTCCloudImpl.TAG, "notify onUserVideoAvailable:" + j + " [true] by IDR. self:" + TRTCCloudImpl.this.hashCode());
                            if (tRTCCloudListener != null) {
                                tRTCCloudListener.onUserVideoAvailable(str, true);
                                TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[%b]", str, Boolean.TRUE));
                            }
                        }
                    });
                }
            }
        });
    }

    private void onStartPublishing(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.155
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onStartPublishing " + i + ", " + str);
                Monitor.a(1, String.format("onStartPublishing err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStartPublishing(i, str);
                }
            }
        });
    }

    private void onStopPublishing(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.156
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onStopPublishing " + i + ", " + str);
                Monitor.a(1, String.format("onStopPublishing err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStopPublishing(i, str);
                }
            }
        });
    }

    private void onStreamPublished(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.157
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onStreamPublished " + i + ", " + str);
                Monitor.a(1, String.format("onStreamPublished err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStartPublishCDNStream(i, str);
                }
            }
        });
    }

    private void onStreamUnpublished(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.158
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onStreamUnpublished " + i + ", " + str);
                Monitor.a(1, String.format("onStreamUnpublished err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStopPublishCDNStream(i, str);
                }
            }
        });
    }

    private void onTranscodingUpdated(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.159
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onTranscodingUpdated " + i + ", " + str);
                Monitor.a(1, String.format("onTranscodingUpdated err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSetMixTranscodingConfig(i, str);
                }
            }
        });
    }

    protected void onCancelTranscoding(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.160
            @Override // java.lang.Runnable
            public void run() {
                Monitor.a(1, String.format("onCancelTranscoding err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSetMixTranscodingConfig(i, str);
                }
            }
        });
    }

    private void onChangeRole(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.161
            @Override // java.lang.Runnable
            public void run() {
                if (i == 0) {
                    TRTCCloudImpl.this.mCurrentRole = TRTCCloudImpl.this.mTargetRole;
                } else {
                    TRTCCloudImpl.this.mCurrentRole = 21;
                    TRTCCloudImpl.this.mTargetRole = 21;
                }
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSwitchRole(i, str);
                }
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.161.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                        if (userInfo.mainRender.render != null) {
                            TRTCCloudImpl.this.applyRenderPlayStrategy(userInfo.mainRender.render, userInfo.mainRender.render.getConfig());
                        }
                    }
                });
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                String userId = TRTCCloudImpl.this.mRoomInfo.getUserId();
                tRTCCloudImpl.notifyEvent(userId, 0, "onChangeRole:" + i);
                Monitor.a(1, String.format("onChangeRole err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
            }
        });
    }

    protected void onSendFirstLocalVideoFrame(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.162
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onSendFirstLocalVideoFrame " + i);
                int translateStreamType = TRTCCloudImpl.this.translateStreamType(i);
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                String userId = TRTCCloudImpl.this.mRoomInfo.getUserId();
                tRTCCloudImpl2.appendDashboardLog(userId, 0, "onSendFirstLocalVideoFrame:" + translateStreamType);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSendFirstLocalVideoFrame(translateStreamType);
                }
            }
        });
    }

    protected void onSendFirstLocalAudioFrame() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.163
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onSendFirstLocalAudioFrame");
                TRTCCloudImpl.this.appendDashboardLog(TRTCCloudImpl.this.mRoomInfo.getUserId(), 0, "onSendFirstLocalAudioFrame");
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSendFirstLocalAudioFrame();
                }
            }
        });
    }

    private static TRTCVideoServerConfig createVideoServerConfigFromNative() {
        return new TRTCVideoServerConfig();
    }

    private void onRecvVideoServerConfig(final TRTCVideoServerConfig tRTCVideoServerConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.164
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.apiLog("onRecvVideoServerConfig " + tRTCVideoServerConfig);
                TRTCCloudImpl.this.mVideoServerConfig = tRTCVideoServerConfig;
                TRTCVideoServerConfig.saveToSharedPreferences(TRTCCloudImpl.this.mContext, tRTCVideoServerConfig);
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.164.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            tXCRenderAndDec.enableLimitDecCache(TRTCCloudImpl.this.mVideoServerConfig.enableHWVUI);
                        }
                        TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                        if (tXCRenderAndDec2 != null) {
                            tXCRenderAndDec2.enableLimitDecCache(TRTCCloudImpl.this.mVideoServerConfig.enableHWVUI);
                        }
                    }
                });
            }
        });
    }

    private static TRTCAudioServerConfig createAudioServerConfigFromNative() {
        return new TRTCAudioServerConfig();
    }

    private void onRecvAudioServerConfig(TRTCAudioServerConfig tRTCAudioServerConfig) {
        TXCLog.i(TAG, "on receive audio config: [%s]", tRTCAudioServerConfig);
        TRTCAudioServerConfig.saveToSharedPreferences(this.mContext, tRTCAudioServerConfig);
        TXCAudioEngine.getInstance().enableAutoRestartDevice(tRTCAudioServerConfig.enableAutoRestartDevice);
        TXCAudioEngine.getInstance().setMaxSelectedPlayStreams(tRTCAudioServerConfig.maxSelectedPlayStreams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQoSParams() {
        TXCAudioEncoderConfig audioEncoderConfig = TXCAudioEngine.getInstance().getAudioEncoderConfig();
        TXCLog.i("", "setQoSParams:" + audioEncoderConfig.sampleRate + StringUtil.SPACE + audioEncoderConfig.channels + StringUtil.SPACE + audioEncoderConfig.minBitrate + StringUtil.SPACE + audioEncoderConfig.maxBitrate);
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(1);
        if (tRTCCloudImpl != null) {
            nativeSetAudioEncodeConfiguration(tRTCCloudImpl.getNetworkContext(), audioEncoderConfig.minBitrate, audioEncoderConfig.maxBitrate, audioEncoderConfig.sampleRate, audioEncoderConfig.channels);
        }
    }

    protected void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mMainHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnMainThreadAndWaitDone(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mMainHandler.a(runnable);
        } else {
            runnable.run();
        }
    }

    public void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (handler == null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.mMainHandler.post(runnable);
            } else {
                runnable.run();
            }
        } else if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void runOnListenerThread(Runnable runnable, int i) {
        Handler handler = this.mListenerHandler;
        if (handler == null) {
            this.mMainHandler.postDelayed(runnable, i);
        } else {
            handler.postDelayed(runnable, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnSDKThread(Runnable runnable, int i) {
        if (this.mSDKHandler != null) {
            this.mSDKHandler.postDelayed(runnable, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runOnSDKThread(Runnable runnable) {
        if (this.mSDKHandler != null) {
            if (Looper.myLooper() != this.mSDKHandler.getLooper()) {
                this.mSDKHandler.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void updateAppScene(int i) {
        this.mAppScene = i;
        if (this.mAppScene != 0 && this.mAppScene != 1) {
            this.mAppScene = 0;
        }
        if (this.mConfig.a * this.mConfig.b >= 518400) {
            this.mAppScene = 1;
        }
        updateEncType();
        apiLog(String.format("update appScene[%d] for video enc[%d] source scene[%d]", Integer.valueOf(this.mAppScene), Integer.valueOf(this.mConfig.j), Integer.valueOf(i)));
    }

    private void updateEncType() {
        if (this.mCodecType == 0 || this.mCodecType == 1) {
            this.mConfig.j = this.mCodecType;
        } else if (this.mAppScene == 1) {
            this.mConfig.j = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncConfig(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        if (this.mRoomState == 0) {
            apiLog("setVideoEncConfig ignore when no in room");
        } else if (this.mCodecType != 2) {
            setVideoEncoderConfiguration(i, i2, i3, i4, i5, 1, z, i6);
        } else {
            setVideoEncoderConfiguration(i, i2, i3, i4, i5, this.mAppScene, z, i6);
        }
    }

    protected void setRenderView(final String str, final TRTCRoomInfo.RenderInfo renderInfo, final TXCloudVideoView tXCloudVideoView, final TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        if (renderInfo == null || renderInfo.render == null || renderInfo.render.getVideoRender() == null) {
            return;
        }
        final com.tencent.liteav.renderer.f videoRender = renderInfo.render.getVideoRender();
        if (tXCloudVideoView == null) {
            videoRender.c((Object) null);
        } else {
            runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.165
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
                    if (surfaceView != null) {
                        surfaceView.setVisibility(0);
                        SurfaceHolder holder = surfaceView.getHolder();
                        holder.removeCallback(renderInfo);
                        holder.addCallback(renderInfo);
                        if (holder.getSurface().isValid()) {
                            TRTCCloudImpl.this.apiLog(String.format(Locale.ENGLISH, "startRemoteView with valid surface %s, width: %d, height: %d", holder.getSurface(), Integer.valueOf(surfaceView.getWidth()), Integer.valueOf(surfaceView.getHeight())));
                            videoRender.a(holder.getSurface());
                            videoRender.d(surfaceView.getWidth(), surfaceView.getHeight());
                            return;
                        }
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.apiLog("startRemoteView with surfaceView add callback " + renderInfo);
                        return;
                    }
                    TextureView textureView = new TextureView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(textureView);
                    tXCloudVideoView.setVisibility(0);
                    tXCloudVideoView.setUserId(str);
                    tXCloudVideoView.showVideoDebugLog(TRTCCloudImpl.this.mDebugType);
                    if (tRTCViewMargin != null) {
                        tXCloudVideoView.setLogMarginRatio(tRTCViewMargin.leftMargin, tRTCViewMargin.rightMargin, tRTCViewMargin.topMargin, tRTCViewMargin.bottomMargin);
                    }
                    videoRender.a(textureView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRemoteRender(TXCRenderAndDec tXCRenderAndDec, int i) {
        tXCRenderAndDec.stopVideo();
        tXCRenderAndDec.setStreamType(i);
        tXCRenderAndDec.startVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRemoteSubRender(TRTCRoomInfo.UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), 7));
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 7, false);
        if (userInfo.subRender.render != null) {
            userInfo.subRender.render.stopVideo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRemoteMainRender(TRTCRoomInfo.UserInfo userInfo, Boolean bool) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), Integer.valueOf(userInfo.streamType)));
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 2, bool.booleanValue());
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 3, bool.booleanValue());
        if (userInfo.mainRender.render != null) {
            userInfo.mainRender.render.stopVideo();
        }
    }

    public void stopRemoteRender(TRTCRoomInfo.UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), Integer.valueOf(userInfo.streamType)));
        com.tencent.liteav.audio.a.a().a(String.valueOf(userInfo.tinyID), hashCode());
        final TXCloudVideoView tXCloudVideoView = userInfo.mainRender.view;
        final TXCloudVideoView tXCloudVideoView2 = userInfo.subRender.view;
        if (userInfo.mainRender.render != null) {
            userInfo.mainRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
            userInfo.mainRender.render.stop();
            if (tXCloudVideoView == null && userInfo.mainRender.render.getVideoRender() != null) {
                userInfo.mainRender.render.getVideoRender().d();
            }
        }
        if (userInfo.subRender.render != null) {
            userInfo.subRender.render.setVideoFrameListener(null, com.tencent.liteav.basic.b.b.UNKNOWN);
            userInfo.subRender.render.stop();
            if (tXCloudVideoView2 == null && userInfo.subRender.render.getVideoRender() != null) {
                userInfo.subRender.render.getVideoRender().d();
            }
        }
        userInfo.mainRender.stop();
        userInfo.subRender.stop();
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.166
            @Override // java.lang.Runnable
            public void run() {
                if (tXCloudVideoView != null) {
                    tXCloudVideoView.removeVideoView();
                }
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.removeVideoView();
                }
            }
        });
    }

    protected void enableVideoStream(boolean z) {
        if (z) {
            addUpStreamType(2);
            if (this.mEnableSmallStream) {
                addUpStreamType(3);
                return;
            }
            return;
        }
        if (!this.mCaptureAndEnc.j()) {
            removeUpStreamType(2);
        }
        removeUpStreamType(3);
    }

    protected void enableAudioStream(boolean z) {
        if (z) {
            addUpStreamType(1);
        } else {
            removeUpStreamType(1);
        }
    }

    private void applyRenderConfig(TXCRenderAndDec tXCRenderAndDec) {
        j jVar = new j();
        jVar.h = false;
        if (this.mAppScene == 1) {
            jVar.h = true;
        }
        int c = TXCStatus.c("18446744073709551615", 17020);
        if (c == 0) {
            c = 600;
        }
        jVar.d = c;
        jVar.y = this.mRoomInfo.decProperties;
        applyRenderPlayStrategy(tXCRenderAndDec, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyRenderPlayStrategy(TXCRenderAndDec tXCRenderAndDec, j jVar) {
        jVar.g = true;
        if (this.mCurrentRole == 20) {
            jVar.a = com.tencent.liteav.basic.b.a.a;
            jVar.c = com.tencent.liteav.basic.b.a.b;
            jVar.b = com.tencent.liteav.basic.b.a.c;
        } else if (this.mCurrentRole == 21) {
            jVar.a = com.tencent.liteav.basic.b.a.d;
            jVar.c = com.tencent.liteav.basic.b.a.e;
            jVar.b = com.tencent.liteav.basic.b.a.f;
        }
        tXCRenderAndDec.setConfig(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyLogByUserId(String str, int i, int i2, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(TXCAVRoomConstants.EVT_ID, i2);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString("EVT_MSG", str2);
        bundle.putInt("EVT_STREAM_TYPE", i);
        notifyEventByUserId(str, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEventByUserId(final String str, final int i, final Bundle bundle) {
        if (str == null || bundle == null) {
            return;
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.167
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                if (str.equalsIgnoreCase(String.valueOf(userInfo.tinyID))) {
                    TRTCCloudImpl.this.notifyEvent(userInfo.userID, i, bundle);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendDashboardLog(String str, int i, String str2) {
        appendDashboardLog(str, i, str2, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendDashboardLog(String str, int i, final String str2, String str3) {
        final TXCloudVideoView tXCloudVideoView;
        apiLog(str3 + str2);
        if (TextUtils.isEmpty(str) || (this.mRoomInfo.userId != null && str.equalsIgnoreCase(this.mRoomInfo.userId))) {
            tXCloudVideoView = this.mRoomInfo.localView;
        } else {
            TRTCRoomInfo.UserInfo user = this.mRoomInfo.getUser(str);
            if (user == null) {
                tXCloudVideoView = null;
            } else if (i == 7) {
                tXCloudVideoView = user.subRender.view;
            } else {
                tXCloudVideoView = user.mainRender.view;
            }
        }
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.168
            @Override // java.lang.Runnable
            public void run() {
                if (tXCloudVideoView != null) {
                    tXCloudVideoView.appendEventInfo(str2);
                }
            }
        });
    }

    protected void notifyEvent(final String str, final int i, final Bundle bundle) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.169
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.appendDashboardLog(str, bundle.getInt("EVT_STREAM_TYPE", 2), bundle.getString("EVT_MSG", ""), String.format("event %d, ", Integer.valueOf(i)));
                if (i == 2029) {
                    TRTCCloudImpl.this.apiLog("release mic~");
                    if (TRTCCloudImpl.this.mRoomInfo.isRoomExit()) {
                        TRTCCloudImpl.this.apiLog("onExitRoom when mic release.");
                        final int roomExitCode = TRTCCloudImpl.this.mRoomInfo.getRoomExitCode();
                        TRTCCloudImpl.this.mRoomInfo.setRoomExit(false, 0);
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.169.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onExitRoom(roomExitCode);
                                }
                            }
                        });
                    } else {
                        TRTCCloudImpl.this.mRoomInfo.micStart(false);
                    }
                } else if (i == 2027) {
                    TRTCCloudImpl.this.apiLog(String.format("onMicDidReady~", new Object[0]));
                    TRTCCloudImpl.this.mRoomInfo.micStart(true);
                }
                final int translateStreamType = TRTCCloudImpl.this.translateStreamType(bundle.getInt("EVT_STREAM_TYPE", 2));
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.169.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                        if (tRTCCloudListener == null) {
                            return;
                        }
                        if (i == 2003) {
                            if (str != null && str.equals(TRTCCloudImpl.this.mRoomInfo.getUserId())) {
                                TRTCCloudImpl.this.apiLog("onFirstVideoFrame local.");
                                tRTCCloudListener.onFirstVideoFrame(null, translateStreamType, bundle.getInt("EVT_PARAM1"), bundle.getInt("EVT_PARAM2"));
                                return;
                            }
                            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                            tRTCCloudImpl.apiLog("onFirstVideoFrame " + str);
                            tRTCCloudListener.onFirstVideoFrame(str, translateStreamType, bundle.getInt("EVT_PARAM1"), bundle.getInt("EVT_PARAM2"));
                        } else if (i == 2026) {
                            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                            tRTCCloudImpl2.apiLog("onFirstAudioFrame " + str);
                            tRTCCloudListener.onFirstAudioFrame(str);
                            TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                            StringBuilder sb = new StringBuilder();
                            sb.append(user.tinyID);
                            TXCKeyPointReportProxy.b(sb.toString(), 32006);
                        } else if (i == 1003) {
                            tRTCCloudListener.onCameraDidReady();
                            Monitor.a(1, "onCameraDidReady self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        } else if (i == 2027) {
                            tRTCCloudListener.onMicDidReady();
                            Monitor.a(1, "onMicDidReady self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        } else {
                            if (i < 0) {
                                tRTCCloudListener.onError(i, bundle.getString("EVT_MSG", ""), bundle);
                                Monitor.a(3, String.format("onError event:%d, msg:%s", Integer.valueOf(i), bundle) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            } else if ((i <= 1100 || i >= 1110) && ((i <= 1200 || i >= 1206) && ((i <= 2100 || i >= 2110) && ((i <= 3001 || i >= 3011) && (i <= 5100 || i >= 5104))))) {
                                return;
                            } else {
                                tRTCCloudListener.onWarning(i, bundle.getString("EVT_MSG", ""), bundle);
                                if (i != 2105) {
                                    Monitor.a(1, String.format("onWarning event:%d, msg:%s", Integer.valueOf(i), bundle) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                                }
                                int i2 = i;
                                if (i2 != 1103 && i2 != 1109 && i2 != 2106 && i2 != 2109) {
                                    switch (i2) {
                                        case 2101:
                                        case 2102:
                                            break;
                                        default:
                                            return;
                                    }
                                }
                            }
                            TXCKeyPointReportProxy.b(i);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEvent(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putLong(TXCAVRoomConstants.EVT_ID, i);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString("EVT_MSG", str2);
        notifyEvent(str, i, bundle);
    }

    public void apiLog(String str) {
        TXCLog.i(TAG, CommonConstant.Symbol.BRACKET_LEFT + hashCode() + ")trtc_api " + str);
    }

    protected void apiLog(String str, Object... objArr) {
        TXCLog.i(TAG, CommonConstant.Symbol.BRACKET_LEFT + hashCode() + ")trtc_api " + String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TRTCRoomInfo.UserInfo createUserInfo(String str) {
        TRTCRoomInfo.UserInfo userInfo = new TRTCRoomInfo.UserInfo(0L, str, 0, 0);
        userInfo.mainRender.muteVideo = this.mRoomInfo.muteRemoteVideo;
        userInfo.mainRender.muteAudio = this.mRoomInfo.muteRemoteAudio;
        return userInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i.a getSizeByResolution(int i, int i2) {
        int i3 = 720;
        int i4 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        switch (i) {
            case 1:
                i3 = 128;
                i4 = 128;
                break;
            case 3:
                i3 = 160;
                i4 = 160;
                break;
            case 5:
                i3 = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                i4 = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                break;
            case 7:
                i3 = jw.g;
                i4 = jw.g;
                break;
            case 50:
                i3 = 128;
                i4 = TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6;
                break;
            case 52:
                i3 = 192;
                i4 = 256;
                break;
            case 54:
                i4 = 288;
                i3 = TbsListener.ErrorCode.EXCEED_INCR_UPDATE;
                break;
            case 56:
                i4 = jw.e;
                i3 = 240;
                break;
            case 58:
                i4 = 400;
                i3 = TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE;
                break;
            case 60:
                i3 = 368;
                i4 = jw.g;
                break;
            case 62:
                i3 = jw.g;
                i4 = jw.h;
                break;
            case 64:
                break;
            case 100:
                i3 = 96;
                i4 = TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6;
                break;
            case 102:
                i3 = 144;
                i4 = 256;
                break;
            case 104:
                i4 = 336;
                i3 = 192;
                break;
            case 106:
                i3 = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                i4 = jw.g;
                break;
            case 108:
            default:
                i3 = 368;
                i4 = jw.h;
                break;
            case 110:
                i3 = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
                break;
            case 112:
                i4 = 1280;
                break;
            case 114:
                i4 = 1920;
                i3 = 1088;
                break;
        }
        i.a aVar = new i.a();
        if (i2 == 1) {
            aVar.a = i3;
            aVar.b = i4;
        } else {
            aVar.a = i4;
            aVar.b = i3;
        }
        return aVar;
    }

    protected void checkUserState(final String str, long j, int i, int i2) {
        final TRTCCloudListener tRTCCloudListener = this.mTRTCListener;
        if (tRTCCloudListener == null || TextUtils.isEmpty(str)) {
            return;
        }
        final boolean z = TRTCRoomInfo.hasAudio(i) && !TRTCRoomInfo.isMuteAudio(i);
        if ((TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2)) != z) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.170
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserAudioAvailable(str, z);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]audio Available[%b]", str, Boolean.valueOf(z)));
            Monitor.a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z)) + " self:" + hashCode(), "", 0);
        }
        final boolean z2 = (TRTCRoomInfo.hasMainVideo(i) || TRTCRoomInfo.hasSmallVideo(i)) && !TRTCRoomInfo.isMuteMainVideo(i);
        boolean z3 = ((TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2)) != z2;
        boolean z4 = (this.mRecvMode == 3 || this.mRecvMode == 1) ? false : true;
        if (z3 && (this.mRoomInfo.hasRecvFirstIFrame(j) || z4)) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.171
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserVideoAvailable(str, z2);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[%b]", str, Boolean.valueOf(z2)));
            Monitor.a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z2)) + " self:" + hashCode(), "", 0);
        }
        final boolean z5 = TRTCRoomInfo.hasSubVideo(i) && !TRTCRoomInfo.isMuteSubVideo(i);
        if ((TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2)) != z5) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.172
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserSubStreamAvailable(str, z5);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]subVideo Available[%b]", str, Boolean.valueOf(z5)));
            Monitor.a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z5)) + " self:" + hashCode(), "", 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class StatusTask implements Runnable {
        private WeakReference<TRTCCloudImpl> mTRTCEngine;

        StatusTask(TRTCCloudImpl tRTCCloudImpl) {
            this.mTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            TRTCCloudImpl tRTCCloudImpl = this.mTRTCEngine.get();
            if (tRTCCloudImpl == null) {
                return;
            }
            int e = com.tencent.liteav.basic.util.g.e(tRTCCloudImpl.mContext);
            int[] a = com.tencent.liteav.basic.util.g.a();
            TXCStatus.a("18446744073709551615", 11006, Integer.valueOf(e));
            TXCStatus.a("18446744073709551615", 11001, Integer.valueOf(a[0] / 10));
            TXCStatus.a("18446744073709551615", (int) XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME, Integer.valueOf(a[1] / 10));
            TXCStatus.a("18446744073709551615", 11003, Integer.valueOf(com.tencent.liteav.basic.util.g.b() * 1024));
            if (com.tencent.liteav.basic.util.g.a(tRTCCloudImpl.mContext)) {
                TXCStatus.a("18446744073709551615", 11004, (Object) 1);
                i = 1;
            } else {
                TXCStatus.a("18446744073709551615", 11004, (Object) 0);
                i = 0;
            }
            if (tRTCCloudImpl.mNetType != e) {
                if (tRTCCloudImpl.mNetType >= 0 && e > 0) {
                    tRTCCloudImpl.nativeReenterRoom(tRTCCloudImpl.mNativeRtcContext, 100);
                }
                TXCEventRecorderProxy.a("18446744073709551615", 1003, e == 0 ? 0L : e, -1L, "", 0);
                Monitor.a(2, String.format("network switch from:%d to %d", Integer.valueOf(tRTCCloudImpl.mNetType), Integer.valueOf(e)) + " self:" + tRTCCloudImpl.hashCode(), "1:wifi/2:4G/3:3G/4:2G/5:Cable", 0);
                tRTCCloudImpl.mNetType = e;
                TXCKeyPointReportProxy.a(40039, e, 0);
            }
            if (tRTCCloudImpl.mBackground != i) {
                TXCEventRecorderProxy.a("18446744073709551615", 2001, i, -1L, "", 0);
                tRTCCloudImpl.mBackground = i;
                if (i == 0) {
                    Monitor.a(1, "onAppDidBecomeActive self:" + tRTCCloudImpl.hashCode(), "", 0);
                } else {
                    Monitor.a(1, "onAppEnterBackground self:" + tRTCCloudImpl.hashCode(), "", 0);
                }
                TXCKeyPointReportProxy.c(50001, i);
            }
            TXCKeyPointReportProxy.a(a[0] / 10, a[1] / 10);
            TXCKeyPointReportProxy.a();
            tRTCCloudImpl.checkRTCState();
            tRTCCloudImpl.checkDashBoard();
            tRTCCloudImpl.collectCustomCaptureFps();
            tRTCCloudImpl.startCollectStatus();
            if (tRTCCloudImpl.mSensorMode != 0) {
                tRTCCloudImpl.mOrientationEventListener.checkOrientation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void collectCustomCaptureFps() {
        if (this.mVideoSourceType == VideoSourceType.CUSTOM) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.mLastCaptureCalculateTS;
            if (j >= 1000) {
                double d = ((this.mCaptureFrameCount - this.mLastCaptureFrameCount) * 1000.0d) / j;
                this.mLastCaptureFrameCount = this.mCaptureFrameCount;
                this.mLastCaptureCalculateTS = currentTimeMillis;
                TXCStatus.a("18446744073709551615", 1001, 2, Double.valueOf(d));
            }
        }
    }

    protected void checkRemoteDashBoard(final TXCloudVideoView tXCloudVideoView, TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        if (tXCloudVideoView == null || tXCRenderAndDec == null || !tXCRenderAndDec.isRendering()) {
            return;
        }
        final CharSequence downloadStreamInfo = getDownloadStreamInfo(tXCRenderAndDec, userInfo);
        TXCLog.i(TAG, "[STATUS]" + downloadStreamInfo.toString().replace("\n", "") + " self:" + hashCode());
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.173
            @Override // java.lang.Runnable
            public void run() {
                tXCloudVideoView.setDashBoardStatusInfo(downloadStreamInfo);
            }
        });
    }

    protected void checkDashBoard() {
        final TXCloudVideoView tXCloudVideoView;
        if (this.mDebugType != 0 && (tXCloudVideoView = this.mRoomInfo.localView) != null) {
            final CharSequence uploadStreamInfo = getUploadStreamInfo();
            TXCLog.i(TAG, "[STATUS]" + uploadStreamInfo.toString().replace("\n", "") + " self:" + hashCode());
            runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.174
                @Override // java.lang.Runnable
                public void run() {
                    tXCloudVideoView.setDashBoardStatusInfo(uploadStreamInfo);
                }
            });
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.175
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                if (userInfo.mainRender.render != null && userInfo.mainRender.render.isRendering()) {
                    userInfo.mainRender.render.updateLoadInfo();
                }
                if (userInfo.subRender.render != null && userInfo.subRender.render.isRendering()) {
                    userInfo.subRender.render.updateLoadInfo();
                }
                if (TRTCCloudImpl.this.mDebugType != 0) {
                    TRTCCloudImpl.this.checkRemoteDashBoard(userInfo.mainRender.view, userInfo.mainRender.render, userInfo);
                    TRTCCloudImpl.this.checkRemoteDashBoard(userInfo.subRender.view, userInfo.subRender.render, userInfo);
                }
            }
        });
    }

    protected int getNetworkQuality(int i, int i2) {
        if (com.tencent.liteav.basic.util.g.d(this.mContext)) {
            if (i2 > 50 || i > 500) {
                return 5;
            }
            if (i2 > 30 || i > 350) {
                return 4;
            }
            if (i2 > 20 || i > 200) {
                return 3;
            }
            if (i2 > 10 || i > 100) {
                return 2;
            }
            return (i2 >= 0 || i >= 0) ? 1 : 0;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.basic.b.b getPixelFormat(int i) {
        switch (i) {
            case 1:
                return com.tencent.liteav.basic.b.b.I420;
            case 2:
                return com.tencent.liteav.basic.b.b.TEXTURE_2D;
            case 3:
                return com.tencent.liteav.basic.b.b.TEXTURE_EXTERNAL_OES;
            case 4:
                return com.tencent.liteav.basic.b.b.NV21;
            case 5:
                return com.tencent.liteav.basic.b.b.RGBA;
            default:
                return com.tencent.liteav.basic.b.b.UNKNOWN;
        }
    }

    private TRTCStatistics.TRTCRemoteStatistics getRemoteStatistics(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        String valueOf = String.valueOf(userInfo.tinyID);
        int streamType = tXCRenderAndDec.getStreamType();
        int c = TXCStatus.c(valueOf, 5003, streamType);
        int c2 = TXCStatus.c(valueOf, 17011, streamType);
        int c3 = TXCStatus.c(valueOf, 18014);
        TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = new TRTCStatistics.TRTCRemoteStatistics();
        tRTCRemoteStatistics.userId = userInfo.userID;
        if (c3 > c2) {
            c2 = c3;
        }
        tRTCRemoteStatistics.finalLoss = c2;
        tRTCRemoteStatistics.width = c >> 16;
        tRTCRemoteStatistics.height = 65535 & c;
        tRTCRemoteStatistics.frameRate = (int) (TXCStatus.d(valueOf, 6002, streamType) + 0.5d);
        tRTCRemoteStatistics.videoBitrate = TXCStatus.c(valueOf, 17002, streamType);
        tRTCRemoteStatistics.audioSampleRate = TXCStatus.c(valueOf, DownloadException.NET_ERROR);
        tRTCRemoteStatistics.audioBitrate = TXCStatus.c(valueOf, DownloadException.CANCELED);
        tRTCRemoteStatistics.jitterBufferDelay = TXCStatus.c(valueOf, 2007);
        tRTCRemoteStatistics.streamType = translateStreamType(streamType);
        tRTCRemoteStatistics.audioTotalBlockTime = TXCStatus.c(valueOf, 18031);
        int c4 = TXCStatus.c(valueOf, 18030);
        tRTCRemoteStatistics.audioBlockRate = c4 > 0 ? (int) (((tRTCRemoteStatistics.audioTotalBlockTime * 100.0d) / c4) + 0.9d) : 0;
        tRTCRemoteStatistics.videoTotalBlockTime = TXCStatus.c(valueOf, 6006, streamType);
        int c5 = TXCStatus.c(valueOf, 6020, streamType);
        tRTCRemoteStatistics.videoBlockRate = c5 > 0 ? (int) (((tRTCRemoteStatistics.videoTotalBlockTime * 100.0d) / c5) + 0.9d) : 0;
        return tRTCRemoteStatistics;
    }

    private TRTCStatistics.TRTCLocalStatistics getLocalStatistics(int i) {
        int c = TXCStatus.c("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerCustomCollision, i);
        TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = new TRTCStatistics.TRTCLocalStatistics();
        tRTCLocalStatistics.width = c >> 16;
        tRTCLocalStatistics.height = c & SupportMenu.USER_MASK;
        tRTCLocalStatistics.frameRate = (int) (TXCStatus.d("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerSpacing, i) + 0.5d);
        tRTCLocalStatistics.videoBitrate = TXCStatus.c("18446744073709551615", 13002, i);
        tRTCLocalStatistics.audioSampleRate = TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT);
        tRTCLocalStatistics.audioBitrate = TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME);
        tRTCLocalStatistics.streamType = translateStreamType(i);
        return tRTCLocalStatistics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoteStatistics(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo, TRTCStatistics tRTCStatistics, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
        TRTCStatistics.TRTCRemoteStatistics remoteStatistics = getRemoteStatistics(tXCRenderAndDec, userInfo);
        tRTCStatistics.remoteArray.add(remoteStatistics);
        tRTCStatistics.downLoss = TXCStatus.c(String.valueOf(userInfo.tinyID), 16002);
        TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = userInfo.userID;
        tRTCQuality.quality = getNetworkQuality(tRTCStatistics.rtt, remoteStatistics.finalLoss);
        arrayList.add(tRTCQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRTCState() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.mLastStateTimeMs + ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            return;
        }
        this.mLastStateTimeMs = currentTimeMillis;
        int[] a = com.tencent.liteav.basic.util.g.a();
        final ArrayList arrayList = new ArrayList();
        final TRTCStatistics tRTCStatistics = new TRTCStatistics();
        tRTCStatistics.appCpu = a[0] / 10;
        tRTCStatistics.systemCpu = a[1] / 10;
        tRTCStatistics.rtt = TXCStatus.c("18446744073709551615", 12002);
        tRTCStatistics.sendBytes = TXCStatus.a("18446744073709551615", 12004);
        tRTCStatistics.receiveBytes = TXCStatus.a("18446744073709551615", 16004);
        tRTCStatistics.upLoss = TXCStatus.c("18446744073709551615", 12003);
        tRTCStatistics.localArray = new ArrayList<>();
        tRTCStatistics.remoteArray = new ArrayList<>();
        tRTCStatistics.localArray.add(getLocalStatistics(2));
        if (this.mEnableSmallStream) {
            tRTCStatistics.localArray.add(getLocalStatistics(3));
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.176
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                if (userInfo.mainRender.render != null) {
                    TRTCCloudImpl.this.addRemoteStatistics(userInfo.mainRender.render, userInfo, tRTCStatistics, arrayList);
                }
                if (userInfo.subRender.render == null || !userInfo.subRender.render.isRendering()) {
                    return;
                }
                TRTCCloudImpl.this.addRemoteStatistics(userInfo.subRender.render, userInfo, tRTCStatistics, arrayList);
            }
        });
        final TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = this.mRoomInfo.getUserId();
        tRTCQuality.quality = TXCStatus.c("18446744073709551615", 12005);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.177
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStatistics(tRTCStatistics);
                    tRTCCloudListener.onNetworkQuality(tRTCQuality, arrayList);
                }
            }
        });
    }

    public void startCollectStatus() {
        if (this.mSDKHandler != null) {
            this.mSDKHandler.postDelayed(this.mStatusNotifyTask, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void stopCollectStatus() {
        if (this.mSDKHandler != null) {
            this.mSDKHandler.removeCallbacks(this.mStatusNotifyTask);
        }
    }

    protected CharSequence getUploadStreamInfo() {
        int[] a = com.tencent.liteav.basic.util.g.a();
        int c = TXCStatus.c("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerCustomCollision, 2);
        String b = TXCStatus.b("18446744073709551615", 10001);
        return String.format("LOCAL: [%s] RTT:%dms\n", this.mRoomInfo.getUserId(), Integer.valueOf(TXCStatus.c("18446744073709551615", 12002))) + String.format(Locale.CHINA, "SEND:% 5dkbps LOSS:%d-%d-%d-%d|%d-%d-%d-%d|%d%%\n", Integer.valueOf(TXCStatus.c("18446744073709551615", 12001)), Integer.valueOf(TXCStatus.c("18446744073709551615", 13011, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", 13012, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_USER_JOINED, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_RTC_STATS, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.QUERY_RECORDING_SERVICE_STATUS)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_CONNECTION_INTERRUPTED)), Integer.valueOf(TXCStatus.c("18446744073709551615", 12003))) + String.format(Locale.CHINA, "BIT:%d|%d|%dkbps RES:%dx%d FPS:%d-%d\n", Integer.valueOf(TXCStatus.c("18446744073709551615", 13002, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", 13002, 3)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME)), Integer.valueOf(c >> 16), Integer.valueOf(c & SupportMenu.USER_MASK), Integer.valueOf((int) TXCStatus.d("18446744073709551615", MapConstant.LayerPropertyFlag_MarkerSpacing, 2)), Integer.valueOf((int) TXCStatus.d("18446744073709551615", RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO, 2))) + String.format(Locale.CHINA, "FEC:%d%%|%d%%  ARQ:%d|%dkbps  RPS:%d\n", Integer.valueOf(TXCStatus.c("18446744073709551615", 13004, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME_PUBLISH)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_USER_OFFLINE, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_CONNECTION_LOST)), Integer.valueOf(TXCStatus.c("18446744073709551615", RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY, 2))) + String.format(Locale.CHINA, "CPU:%d%%|%d%%    QOS:%s|%dkbps|%d-%d\n", Integer.valueOf(a[0] / 10), Integer.valueOf(a[1] / 10), getQosValue(TXCStatus.c("18446744073709551615", 15009, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", 15002, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", 15010, 2)), Integer.valueOf(TXCStatus.c("18446744073709551615", 15005, 2))) + String.format(Locale.CHINA, "SVR:%s", b);
    }

    private CharSequence getDownloadStreamInfo(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        String valueOf = String.valueOf(userInfo.tinyID);
        int[] a = com.tencent.liteav.basic.util.g.a();
        int streamType = tXCRenderAndDec.getStreamType();
        long a2 = TXCStatus.a(valueOf, 17014, streamType);
        int c = TXCStatus.c(valueOf, 5003, streamType);
        String str = streamType == 3 ? "S" : streamType == 7 ? "Sub" : streamType == 1 ? "A" : ErrorCode.ERROR_TYPE_B;
        String str2 = String.format("REMOTE: [%s]%s RTT:%dms\n", userInfo.userID, str, Integer.valueOf(TXCStatus.c("18446744073709551615", 12002))) + String.format(Locale.CHINA, "RECV:%dkbps LOSS:%d-%d-%d%%|%d-%d-%d%%|%d%%\n", Integer.valueOf(TXCStatus.c(valueOf, 17001, streamType) + TXCStatus.c(valueOf, DownloadException.ILLEGAL_URL)), Integer.valueOf(TXCStatus.c(valueOf, 17010, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17005, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17011, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 18013)), Integer.valueOf(TXCStatus.c(valueOf, DownloadException.MD5_VERIFY_FAILED)), Integer.valueOf(TXCStatus.c(valueOf, 18014)), Integer.valueOf(TXCStatus.c(valueOf, 16002))) + String.format(Locale.CHINA, "BIT:%d|%dkbps RES:%dx%d FPS:%d-%d\n", Integer.valueOf(TXCStatus.c(valueOf, 17002, streamType)), Integer.valueOf(TXCStatus.c(valueOf, DownloadException.CANCELED)), Integer.valueOf(c >> 16), Integer.valueOf(c & SupportMenu.USER_MASK), Integer.valueOf((int) TXCStatus.d(valueOf, 6002, streamType)), Integer.valueOf((int) TXCStatus.d(valueOf, 17003, streamType))) + String.format(Locale.CHINA, "FEC:%d-%d-%d%%|%d-%d-%d%%    ARQ:%d-%d|%d-%d\n", Integer.valueOf(TXCStatus.c(valueOf, 17007, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17005, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17006, streamType)), Integer.valueOf(TXCStatus.c(valueOf, DownloadException.UNZIP_NOT_ZIP_FILE)), Integer.valueOf(TXCStatus.c(valueOf, DownloadException.MD5_VERIFY_FAILED)), Integer.valueOf(TXCStatus.c(valueOf, DownloadException.DOWNLOAD_TIME_OUT)), Integer.valueOf(TXCStatus.c(valueOf, 17009, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17008, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 18012)), Integer.valueOf(TXCStatus.c(valueOf, 18010))) + String.format(Locale.CHINA, "CPU:%d%%|%d%%  RPS:%d  LFR:%d  DERR:%d\n", Integer.valueOf(a[0] / 10), Integer.valueOf(a[1] / 10), Integer.valueOf(TXCStatus.c(valueOf, 17012, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 17013, streamType)), Long.valueOf(a2)) + String.format(Locale.CHINA, "Jitter: %d,%d|%d,%d|%d   ADROP: %d\n", Integer.valueOf(TXCStatus.c(valueOf, 2007)), Integer.valueOf(TXCStatus.c(valueOf, 6010, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 6011, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 6012, streamType)), Integer.valueOf(TXCStatus.c(valueOf, 2021)), Integer.valueOf(TXCStatus.c(valueOf, 18015))) + String.format(Locale.CHINA, "QUALITY: %d   LEN: %d\n", Integer.valueOf(TXCStatus.c(valueOf, 18023)), Integer.valueOf(TXCStatus.c(valueOf, 18016)));
        SpannableString spannableString = new SpannableString(str2);
        int lastIndexOf = str2.lastIndexOf("DECERR:");
        if (-1 != lastIndexOf && a2 > 0) {
            spannableString.setSpan(new ForegroundColorSpan((int) SupportMenu.CATEGORY_MASK), lastIndexOf + 7, str2.length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDisplayRotation() {
        switch (this.mDisplay.getRotation()) {
            case 0:
            default:
                return 0;
            case 1:
                return 90;
            case 2:
                return TXLiveConstants.RENDER_ROTATION_180;
            case 3:
                return 270;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateOrientation() {
        if (this.mVideoSourceType == VideoSourceType.CUSTOM || this.mVideoSourceType == VideoSourceType.SCREEN) {
            return;
        }
        if (this.mCurrentOrientation == -1) {
            if (this.mDisplay.getRotation() == 1) {
                this.mCurrentOrientation = 0;
            } else {
                this.mCurrentOrientation = 1;
            }
        }
        setOrientation(this.mCurrentOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRenderRotation(int i) {
        int displayRotation = getDisplayRotation();
        int i2 = ((360 - displayRotation) - ((this.mConfig.l - 1) * 90)) % 360;
        int i3 = i % 2;
        int i4 = displayRotation % 2;
        boolean z = (i3 == i4 && this.mConfig.l == 1) || (i3 != i4 && this.mConfig.l == 0);
        if (this.mVideoRenderMirror == 1) {
            if (!this.mConfig.m && z) {
                i2 += TXLiveConstants.RENDER_ROTATION_180;
            }
        } else if (this.mVideoRenderMirror == 2 && this.mConfig.m && z) {
            i2 += TXLiveConstants.RENDER_ROTATION_180;
        }
        TXCLog.d(TAG, String.format("vrotation rotation-change %d-%d-%d ======= renderRotation %d-%d", Integer.valueOf(i), Integer.valueOf(this.mConfig.l), Integer.valueOf(displayRotation), Integer.valueOf(i2), Integer.valueOf(this.mRoomInfo.localRenderRotation)) + " self:" + hashCode());
        this.mCaptureAndEnc.g((this.mRoomInfo.localRenderRotation + i2) % 360);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVideoEncRotation(int i) {
        int i2;
        int i3;
        if (this.mConfig.l != 1) {
            i2 = (!(this.mConfig.S && this.mConfig.m) && (this.mConfig.S || this.mConfig.m)) ? 270 : 90;
        } else {
            i2 = 0;
        }
        switch (i) {
            case 0:
                i3 = (i2 + 90) % 360;
                if (!this.mConfig.m) {
                    i3 = (i3 + TXLiveConstants.RENDER_ROTATION_180) % 360;
                }
                if (this.mConfig.S) {
                    i3 = (i3 + TXLiveConstants.RENDER_ROTATION_180) % 360;
                    break;
                }
                break;
            case 1:
                i3 = (i2 + 0) % 360;
                break;
            case 2:
                i3 = (i2 + 270) % 360;
                if (!this.mConfig.m) {
                    i3 = (i3 + TXLiveConstants.RENDER_ROTATION_180) % 360;
                }
                if (this.mConfig.S) {
                    i3 = (i3 + TXLiveConstants.RENDER_ROTATION_180) % 360;
                    break;
                }
                break;
            case 3:
                i3 = (i2 + TXLiveConstants.RENDER_ROTATION_180) % 360;
                break;
            default:
                i3 = 0;
                break;
        }
        TXCLog.d(TAG, String.format("vrotation rotation-change %d-%d ======= encRotation %d", Integer.valueOf(i), Integer.valueOf(this.mConfig.l), Integer.valueOf(i3)) + " self:" + hashCode());
        this.mCurrentOrientation = i;
        this.mCaptureAndEnc.a(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientation(final int i) {
        if (i == -1) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.178
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.checkRenderRotation(i);
                if (TRTCCloudImpl.this.mSensorMode != 0) {
                    TRTCCloudImpl.this.checkVideoEncRotation(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpStreamType(int i) {
        if (!this.mStreamTypes.contains(Integer.valueOf(i))) {
            this.mStreamTypes.add(Integer.valueOf(i));
        }
        addUpstream(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpStreamType(int i) {
        if (this.mStreamTypes.contains(Integer.valueOf(i))) {
            this.mStreamTypes.remove(Integer.valueOf(i));
        }
        removeUpstream(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderConfiguration(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeSetVideoEncoderConfiguration(tRTCCloudImpl.getNetworkContext(), i, i2, i3, i4, i5, i6, z, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoQuality(int i, int i2) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeSetVideoQuality(tRTCCloudImpl.getNetworkContext(), i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteUpstream(int i, boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeMuteUpstream(tRTCCloudImpl.getNetworkContext(), i, z);
        }
    }

    private void addUpstream(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeAddUpstream(tRTCCloudImpl.getNetworkContext(), i);
        }
    }

    private void removeUpstream(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeRemoveUpstream(tRTCCloudImpl.getNetworkContext(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioEncodeConfiguration() {
        setQoSParams();
    }

    public void enableNetworkBlackStream(boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeEnableBlackStream(tRTCCloudImpl.getNetworkContext(), z);
        }
    }

    public void enableNetworkSmallStream(boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeEnableSmallStream(tRTCCloudImpl.getNetworkContext(), z);
        }
    }

    private void pushVideoFrame(TXSNALPacket tXSNALPacket) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (this.mCurrentPublishClouds) {
            tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(tXSNALPacket.streamType));
        }
        if (tRTCCloudImpl != null) {
            nativePushVideo(tRTCCloudImpl.getNetworkContext(), tXSNALPacket.streamType, 1, tXSNALPacket.nalType, tXSNALPacket.nalData, tXSNALPacket.gopIndex, tXSNALPacket.gopFrameIndex, tXSNALPacket.refFremeIndex, tXSNALPacket.pts, tXSNALPacket.dts);
        }
    }

    public long getNetworkContext() {
        return this.mNativeRtcContext;
    }

    public boolean isPublishingInCloud(TRTCCloudImpl tRTCCloudImpl, int i) {
        synchronized (this.mCurrentPublishClouds) {
            return this.mCurrentPublishClouds.get(Integer.valueOf(i)) == tRTCCloudImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCaptureStarted(final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.179
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener == null) {
                    return;
                }
                tRTCCloudListener.onWarning(4000, str, null);
            }
        });
        apiLog(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class DisplayOrientationDetector extends OrientationEventListener {
        public int mCurOrientation;
        private int mCurrentDisplayRotation;
        private WeakReference<TRTCCloudImpl> mTRTCEngine;

        DisplayOrientationDetector(Context context, TRTCCloudImpl tRTCCloudImpl) {
            super(context);
            this.mCurOrientation = -1;
            this.mCurrentDisplayRotation = 0;
            this.mTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onOrientationChanged(int r5) {
            /*
                r4 = this;
                r0 = -1
                if (r5 != r0) goto L17
                java.lang.String r0 = "DisplayOrientationDetector"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "rotation-change invalid "
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                com.tencent.liteav.basic.log.TXCLog.i(r0, r5)
                return
            L17:
                r0 = 45
                if (r5 <= r0) goto L2d
                r0 = 135(0x87, float:1.89E-43)
                if (r5 > r0) goto L21
                r0 = 2
                goto L2e
            L21:
                r0 = 225(0xe1, float:3.15E-43)
                if (r5 > r0) goto L27
                r0 = 3
                goto L2e
            L27:
                r0 = 315(0x13b, float:4.41E-43)
                if (r5 > r0) goto L2d
                r0 = 0
                goto L2e
            L2d:
                r0 = 1
            L2e:
                int r1 = r4.mCurOrientation
                if (r1 == r0) goto L7b
                r4.mCurOrientation = r0
                java.lang.ref.WeakReference<com.tencent.liteav.trtc.impl.TRTCCloudImpl> r0 = r4.mTRTCEngine
                java.lang.Object r0 = r0.get()
                com.tencent.liteav.trtc.impl.TRTCCloudImpl r0 = (com.tencent.liteav.trtc.impl.TRTCCloudImpl) r0
                if (r0 == 0) goto L49
                int r1 = com.tencent.liteav.trtc.impl.TRTCCloudImpl.access$10000(r0)
                r4.mCurrentDisplayRotation = r1
                int r1 = r4.mCurOrientation
                com.tencent.liteav.trtc.impl.TRTCCloudImpl.access$10100(r0, r1)
            L49:
                java.lang.String r1 = "DisplayOrientationDetector"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "rotation-change onOrientationChanged "
                r2.<init>(r3)
                r2.append(r5)
                java.lang.String r5 = ", orientation "
                r2.append(r5)
                int r5 = r4.mCurOrientation
                r2.append(r5)
                java.lang.String r5 = " self:"
                r2.append(r5)
                if (r0 == 0) goto L6f
                int r5 = r0.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L71
            L6f:
                java.lang.String r5 = ""
            L71:
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                com.tencent.liteav.basic.log.TXCLog.d(r1, r5)
            L7b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.impl.TRTCCloudImpl.DisplayOrientationDetector.onOrientationChanged(int):void");
        }

        public void checkOrientation() {
            int displayRotation;
            TRTCCloudImpl tRTCCloudImpl = this.mTRTCEngine.get();
            if (tRTCCloudImpl == null || this.mCurrentDisplayRotation == (displayRotation = tRTCCloudImpl.getDisplayRotation())) {
                return;
            }
            this.mCurrentDisplayRotation = displayRotation;
            tRTCCloudImpl.setOrientation(this.mCurOrientation);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class RenderListenerAdapter {
        public int bufferType;
        public TRTCCloudListener.TRTCVideoRenderListener listener;
        public int pixelFormat;
        public String strTinyID;

        RenderListenerAdapter() {
        }
    }
}
