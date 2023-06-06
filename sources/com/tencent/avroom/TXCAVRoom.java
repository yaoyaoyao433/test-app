package com.tencent.avroom;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.avprotocol.TXCAVProtocol;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.d;
import com.tencent.liteav.i;
import com.tencent.liteav.j;
import com.tencent.liteav.qos.TXCQoS;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCAVRoom {
    private static final int AVROOM_ENTERED = 2;
    private static final int AVROOM_ENTERING = 1;
    private static final int AVROOM_EXITING = 3;
    private static final int AVROOM_IDLE = 0;
    private static final String TAG = "TXCAVRoom";
    private static int videoMemNum;
    private int appid;
    private TXCAVRoomCallback enterRoomCB;
    private TXCloudVideoView localView;
    private TXCAVRoomLisenter mAvRoomLisenter;
    private b mCaptureDataCollection;
    private Context mContext;
    private i mLivePushConfig;
    private d mPusher;
    private TXCQoS mQos;
    private TXCAVRoomConfig mRoomConfig;
    private TXCAVProtocol mTXCAVProtocol;
    private Handler mainHandler;
    private int maxReconnectCount;
    private long myid;
    private TXCAVProtocol.TXCAVProtoParam protoparam;
    private int reconnectCount;
    private int roomStatus;
    private int sdkVersion;
    private com.tencent.liteav.basic.b.c videoResolution;
    private boolean allowedPush = false;
    private HashMap<Long, c> playerList = new HashMap<>();
    private ArrayList<Long> videoMemList = new ArrayList<>();

    public void setAudioMode(int i) {
    }

    public void setLocalMute(boolean z) {
    }

    static /* synthetic */ int access$1208(TXCAVRoom tXCAVRoom) {
        int i = tXCAVRoom.reconnectCount;
        tXCAVRoom.reconnectCount = i + 1;
        return i;
    }

    public boolean isPushing() {
        return this.mPusher.k();
    }

    public boolean isInRoom() {
        return this.roomStatus == 2;
    }

    public TXCAVRoom(Context context, TXCAVRoomConfig tXCAVRoomConfig, long j, int i) {
        TXCAVProtocol tXCAVProtocol = new TXCAVProtocol();
        tXCAVProtocol.getClass();
        this.protoparam = new TXCAVProtocol.TXCAVProtoParam();
        this.mQos = null;
        this.maxReconnectCount = 10;
        this.reconnectCount = 0;
        this.myid = -1L;
        this.appid = -1;
        this.sdkVersion = 26215104;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.roomStatus = 0;
        this.videoResolution = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_540_960;
        this.mContext = context;
        this.mRoomConfig = tXCAVRoomConfig;
        this.myid = j;
        this.appid = i;
        this.mPusher = new d(context);
        this.mPusher.a(new d.a() { // from class: com.tencent.avroom.TXCAVRoom.1
            @Override // com.tencent.liteav.d.a
            public void onBackgroudPushStop() {
            }

            @Override // com.tencent.liteav.d.a
            public void onEncVideoFormat(MediaFormat mediaFormat) {
            }

            @Override // com.tencent.liteav.d.a
            public void onEncVideo(TXSNALPacket tXSNALPacket) {
                if (TXCAVRoom.this.allowedPush) {
                    TXCAVRoom.this.mTXCAVProtocol.pushNAL(tXSNALPacket);
                }
            }
        });
        d dVar = this.mPusher;
        StringBuilder sb = new StringBuilder();
        sb.append(this.myid);
        dVar.setID(sb.toString());
        this.mPusher.a(new com.tencent.liteav.basic.c.b() { // from class: com.tencent.avroom.TXCAVRoom.2
            @Override // com.tencent.liteav.basic.c.b
            public void onNotifyEvent(int i2, Bundle bundle) {
                TXCAVRoom.this.onBothNotifyEvent(i2, bundle);
            }
        });
        applyCaptureConfig();
        this.mTXCAVProtocol = new TXCAVProtocol();
        this.mTXCAVProtocol.setListener(new TXCAVProtocol.TXIAVListener() { // from class: com.tencent.avroom.TXCAVRoom.3
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVListener
            public void onPullAudio(TXCAVProtocol.TXSAVProtoAudioPacket tXSAVProtoAudioPacket) {
                synchronized (TXCAVRoom.this) {
                    synchronized (TXCAVRoom.this.playerList) {
                        if (TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoAudioPacket.tinyID)) != null) {
                            if (TXCAudioEngine.getInstance().isRemoteAudioPlaying(String.valueOf(TXCAVRoom.this.myid))) {
                                tXSAVProtoAudioPacket.audioData = new byte[2];
                                tXSAVProtoAudioPacket.packetType = 2;
                                TXCAVRoomConstants.makeAACCodecSpecificData(tXSAVProtoAudioPacket.audioData, 2, tXSAVProtoAudioPacket.sampleRate, tXSAVProtoAudioPacket.channelsPerSample);
                                String str = TXCAVRoom.TAG;
                                TXCLog.i(str, "audioKey: makeAACCodecSpecificData id " + tXSAVProtoAudioPacket.tinyID);
                            }
                            if (TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoAudioPacket.tinyID)) != null && ((c) TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoAudioPacket.tinyID))).a() != null && tXSAVProtoAudioPacket.audioData != null) {
                                ((c) TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoAudioPacket.tinyID))).a().b(tXSAVProtoAudioPacket.audioData.length);
                            }
                        }
                    }
                }
            }

            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVListener
            public void onPullNAL(TXCAVProtocol.TXSAVProtoNALPacket tXSAVProtoNALPacket) {
                synchronized (TXCAVRoom.this.playerList) {
                    if (TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoNALPacket.tinyID)) != null) {
                        if (((c) TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoNALPacket.tinyID))).a() != null) {
                            ((c) TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoNALPacket.tinyID))).a().a(tXSAVProtoNALPacket.nalData.length);
                        }
                        ((c) TXCAVRoom.this.playerList.get(Long.valueOf(tXSAVProtoNALPacket.tinyID))).decVideo(tXSAVProtoNALPacket);
                    }
                }
            }

            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVListener
            public void sendNotifyEvent(final int i2, String str) {
                switch (i2) {
                    case TXLiteAVCode.ERR_ROOM_REQUEST_AVSEAT_FAIL /* -3305 */:
                        i2 = TXCAVRoomConstants.AVROOM_ERR_REQUEST_AVSEAT_FAIL;
                        break;
                    case TXLiteAVCode.ERR_ROOM_CONNECT_FAIL /* -3304 */:
                        i2 = TXCAVRoomConstants.AVROOM_ERR_CONNECT_FAILE;
                        break;
                    case TXLiteAVCode.ERR_ROOM_REQUEST_IP_FAIL /* -3303 */:
                        i2 = TXCAVRoomConstants.AVROOM_ERR_REQUEST_IP_FAIL;
                        break;
                    case TXLiteAVCode.ERR_ROOM_ENTER_FAIL /* -3301 */:
                        i2 = TXCAVRoomConstants.AVROOM_ERR_ENTER_ROOM_FAIL;
                        break;
                    case 1018:
                        i2 = TXCAVRoomConstants.AVROOM_EVT_ENTER_ROOM_SUCC;
                        break;
                    case 1019:
                        i2 = TXCAVRoomConstants.AVROOM_EVT_EXIT_ROOM_SUCC;
                        break;
                    case 8001:
                        i2 = TXCAVRoomConstants.AVROOM_EVT_REQUEST_IP_SUCC;
                        break;
                    case 8002:
                        i2 = TXCAVRoomConstants.AVROOM_EVT_CONNECT_SUCC;
                        break;
                    case TXLiteAVCode.EVT_ROOM_REQUEST_AVSEAT_SUCC /* 8003 */:
                        i2 = TXCAVRoomConstants.AVROOM_EVT_REQUEST_AVSEAT_SUCC;
                        break;
                }
                final Bundle bundle = new Bundle();
                bundle.putInt(TXCAVRoomConstants.EVT_ID, i2);
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putString("EVT_MSG", str);
                ((Activity) TXCAVRoom.this.mContext).runOnUiThread(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCAVRoom.this.mAvRoomLisenter.onAVRoomEvent(TXCAVRoom.this.myid, i2, bundle);
                    }
                });
                if (i2 == -3302) {
                    TXCAVRoom.this.reconnectRoom();
                }
            }

            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVListener
            public void onMemberChange(final long j2, final boolean z) {
                String str = TXCAVRoom.TAG;
                TXCLog.i(str, "onMemberChange: " + j2 + " flag:" + z);
                TXCAVRoom.this.mainHandler.post(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (z) {
                            TXCAVRoom.this.addRender(j2);
                        } else {
                            TXCAVRoom.this.removeRender(Long.valueOf(j2));
                        }
                        TXCAVRoom.this.mAvRoomLisenter.onMemberChange(j2, z);
                    }
                });
            }

            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVListener
            public void onVideoStateChange(final long j2, final boolean z) {
                String str = TXCAVRoom.TAG;
                TXCLog.i(str, "onVideoStateChange: " + j2 + " flag:" + z);
                TXCAVRoom.this.mainHandler.post(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCAVRoom.this.mAvRoomLisenter.onVideoStateChange(j2, z);
                    }
                });
            }
        });
    }

    public TXCAVRoomConfig getRoomConfig() {
        return this.mRoomConfig;
    }

    public void setRoomConfig(TXCAVRoomConfig tXCAVRoomConfig) {
        this.mRoomConfig = tXCAVRoomConfig;
        applyCaptureConfig();
    }

    public String nat64Compatable(String str, short s) {
        return this.mTXCAVProtocol.nativeNAT64Compatable(str, s);
    }

    public void enterRoom(TXCAVRoomParam tXCAVRoomParam, final TXCAVRoomCallback tXCAVRoomCallback) {
        if (this.roomStatus != 0) {
            postToUiThread(tXCAVRoomCallback, -4);
            return;
        }
        this.roomStatus = 1;
        TXCDRApi.initCrashReport(this.mContext);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bw);
        this.protoparam.roomID = tXCAVRoomParam.getRoomID();
        this.protoparam.authBits = tXCAVRoomParam.getAuthBits();
        this.protoparam.authBuffer = tXCAVRoomParam.getAuthBuffer();
        this.enterRoomCB = tXCAVRoomCallback;
        this.protoparam.userID = this.myid;
        this.protoparam.sdkAppid = this.appid;
        this.protoparam.sdkVersion = this.sdkVersion;
        applyCaptureConfig();
        this.mTXCAVProtocol.enterRoom(this.protoparam, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.4
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
            public void onComplete(int i) {
                if (i == 0) {
                    TXCAVRoom.this.reconnectCount = 0;
                    TXCAVRoom.this.startPush();
                    TXCAVRoom.this.roomStatus = 2;
                    int unused = TXCAVRoom.videoMemNum = 1;
                    TXCAVRoom.this.postToUiThread(tXCAVRoomCallback, i);
                    if (TXCAVRoom.this.mRoomConfig.isHasVideo()) {
                        TXCAVRoom.this.mTXCAVProtocol.changeAVState(TXCAVProtocol.AV_STATE_ENTER_VIDEO, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.4.1
                            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
                            public void onComplete(int i2) {
                                String str = TXCAVRoom.TAG;
                                TXCLog.i(str, "keyway change to Video  onComplete: " + i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                TXCAVRoom.this.roomStatus = 0;
                TXCAVRoom.this.postToUiThread(tXCAVRoomCallback, i);
            }
        });
        this.mQos = new TXCQoS(true);
        this.mQos.setUserID(String.valueOf(this.myid));
        this.mQos.setListener(new com.tencent.liteav.qos.a() { // from class: com.tencent.avroom.TXCAVRoom.5
            @Override // com.tencent.liteav.qos.a
            public void onEnableDropStatusChanged(boolean z) {
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetBandwidthEst() {
                return 0;
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetVideoQueueMaxCount() {
                return 5;
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetEncoderRealBitrate() {
                return (int) (TXCAVRoom.this.mCaptureDataCollection != null ? TXCAVRoom.this.mCaptureDataCollection.getLongValue(MapConstant.LayerPropertyFlag_MarkerAvoidScreen) : 0L);
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetQueueInputSize() {
                return (int) ((TXCAVRoom.this.mCaptureDataCollection != null ? TXCAVRoom.this.mCaptureDataCollection.getLongValue(7002) : 0L) + (TXCAVRoom.this.mCaptureDataCollection != null ? TXCAVRoom.this.mCaptureDataCollection.getLongValue(7001) : 0L));
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetQueueOutputSize() {
                if (TXCAVRoom.this.mCaptureDataCollection == null) {
                    return 0;
                }
                return (int) (TXCAVRoom.this.mCaptureDataCollection.getLongValue(7004) + TXCAVRoom.this.mCaptureDataCollection.getLongValue(7003));
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetVideoQueueCurrentCount() {
                if (TXCAVRoom.this.mCaptureDataCollection == null) {
                    return 0;
                }
                return (int) TXCAVRoom.this.mCaptureDataCollection.getLongValue(7005);
            }

            @Override // com.tencent.liteav.qos.a
            public int onGetVideoDropCount() {
                if (TXCAVRoom.this.mCaptureDataCollection == null) {
                    return 0;
                }
                return (int) TXCAVRoom.this.mCaptureDataCollection.getLongValue(7007);
            }

            @Override // com.tencent.liteav.qos.a
            public void onEncoderParamsChanged(int i, int i2, int i3) {
                if (i != 0) {
                    if (TXCAVRoom.this.mPusher != null) {
                        TXCAVRoom.this.mPusher.a(i, i2, i3);
                    }
                    String str = TXCAVRoom.TAG;
                    TXCLog.i(str, "onEncoderParamsChanged:" + i);
                }
            }
        });
        this.mQos.setNotifyListener(new com.tencent.liteav.basic.c.b() { // from class: com.tencent.avroom.TXCAVRoom.6
            @Override // com.tencent.liteav.basic.c.b
            public void onNotifyEvent(int i, Bundle bundle) {
                TXCAVRoom.this.onBothNotifyEvent(i, bundle);
            }
        });
        this.mQos.setAutoAdjustBitrate(true);
        this.mQos.setAutoAdjustStrategy(5);
        this.mQos.setDefaultVideoResolution(com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_360_640);
        this.mQos.setDefaultVideoResolution(this.videoResolution);
        this.mQos.setVideoEncBitrate(100, this.mRoomConfig.getVideoBitrate(), this.mRoomConfig.getVideoBitrate());
        this.mQos.start(TXCAVRoomConstants.AVROOM_QOS_INTERVAL);
    }

    public long[] getRoomMemberList() {
        return this.mTXCAVProtocol.getRoomMemberList();
    }

    public long[] getRoomVideoList() {
        return this.mTXCAVProtocol.getRoomVideoList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnectRoom() {
        if (this.roomStatus != 2) {
            return;
        }
        TXCLog.i(TAG, "reconnectRoom");
        if (this.reconnectCount > this.maxReconnectCount) {
            if (this.mAvRoomLisenter != null) {
                final Bundle bundle = new Bundle();
                bundle.putLong(TXCAVRoomConstants.EVT_USERID, this.myid);
                bundle.putInt(TXCAVRoomConstants.EVT_ID, TXCAVRoomConstants.AVROOM_WARNING_DISCONNECT);
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putString("EVT_MSG", "Failed to reconnect many times. Abondon reconnect");
                ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.7
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCAVRoom.this.mAvRoomLisenter.onAVRoomEvent(TXCAVRoom.this.myid, TXCAVRoomConstants.AVROOM_WARNING_DISCONNECT, bundle);
                    }
                });
                return;
            }
            return;
        }
        this.mainHandler.postDelayed(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.8
            @Override // java.lang.Runnable
            public void run() {
                TXCAVRoom.this.mTXCAVProtocol.enterRoom(TXCAVRoom.this.protoparam, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.8.1
                    @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
                    public void onComplete(int i) {
                        if (i == 0) {
                            TXCAVRoom.this.reconnectCount = 0;
                            if (TXCAVRoom.this.mRoomConfig.isHasVideo()) {
                                TXCAVRoom.this.mTXCAVProtocol.changeAVState(TXCAVProtocol.AV_STATE_ENTER_VIDEO, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.8.1.1
                                    @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
                                    public void onComplete(int i2) {
                                        String str = TXCAVRoom.TAG;
                                        TXCLog.i(str, "keyway changeAVState onComplete: " + i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        TXCAVRoom.this.reconnectRoom();
                    }
                });
                TXCAVRoom.access$1208(TXCAVRoom.this);
            }
        }, (this.reconnectCount < 3 ? 0 : 2) * 1000);
    }

    public void setAvRoomLisenter(TXCAVRoomLisenter tXCAVRoomLisenter) {
        this.mAvRoomLisenter = tXCAVRoomLisenter;
    }

    public void exitRoom(final TXCAVRoomCallback tXCAVRoomCallback) {
        if (this.roomStatus == 3 || this.roomStatus == 1) {
            postToUiThread(tXCAVRoomCallback, -4);
            return;
        }
        this.roomStatus = 3;
        if (this.mQos != null) {
            this.mQos.stop();
            this.mQos.setListener(null);
            this.mQos.setNotifyListener(null);
            this.mQos = null;
        }
        removeAllRender();
        stopLocalPreview();
        stopPush();
        if (this.playerList != null) {
            this.playerList.clear();
        }
        this.mTXCAVProtocol.exitRoom(new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.9
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
            public void onComplete(int i) {
                TXCAVRoom.this.roomStatus = 0;
                TXCAVRoom.this.postToUiThread(tXCAVRoomCallback, i);
                if (i == 0) {
                    int unused = TXCAVRoom.videoMemNum = 0;
                    if (TXCAVRoom.this.mCaptureDataCollection != null) {
                        TXCAVRoom.this.mCaptureDataCollection.b();
                        TXCAVRoom.this.mCaptureDataCollection = null;
                    }
                }
            }
        });
    }

    public void destory() {
        if (this.mQos != null) {
            this.mQos.stop();
        }
        stopLocalPreview();
        removeAllRender();
        this.mPusher.g();
        this.mPusher = null;
        this.mContext = null;
        this.mTXCAVProtocol.destory();
    }

    public void startLocalPreview(TXCloudVideoView tXCloudVideoView) {
        this.localView = tXCloudVideoView;
        tXCloudVideoView.setVisibility(0);
        String str = TAG;
        TXCLog.i(str, "startLocalPreview: " + tXCloudVideoView.getTag());
        applyCaptureConfig();
        this.mPusher.a(tXCloudVideoView);
        if (this.mCaptureDataCollection == null) {
            this.mCaptureDataCollection = new b(this.appid, this.myid, this.mContext, this.mLivePushConfig);
            this.mCaptureDataCollection.a(this.mTXCAVProtocol);
            this.mCaptureDataCollection.a(this.mAvRoomLisenter);
            this.mCaptureDataCollection.a();
            this.mCaptureDataCollection.a(this.mPusher);
        }
        this.mRoomConfig.setHasVideo(true);
        if (this.roomStatus != 2) {
            return;
        }
        this.mTXCAVProtocol.changeAVState(TXCAVProtocol.AV_STATE_ENTER_VIDEO, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.10
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
            public void onComplete(int i) {
                String unused = TXCAVRoom.TAG;
                new StringBuilder("keyway change to Video onComplete: ").append(i);
            }
        });
    }

    public void stopLocalPreview() {
        if (this.mCaptureDataCollection != null) {
            this.mCaptureDataCollection.b();
            this.mCaptureDataCollection = null;
        }
        if (this.localView != null) {
            this.localView.setVisibility(4);
            this.localView = null;
        }
        if (this.mPusher != null) {
            this.mPusher.d(true);
        }
        this.mRoomConfig.setHasVideo(false);
        if (this.roomStatus == 2) {
            this.mTXCAVProtocol.changeAVState(TXCAVProtocol.AV_STATE_ENTER_AUDIO, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.11
                @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
                public void onComplete(int i) {
                    String unused = TXCAVRoom.TAG;
                    new StringBuilder("keyway change to audio onComplete: ").append(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRender(long j) {
        synchronized (this.playerList) {
            if (this.playerList.get(Long.valueOf(j)) == null) {
                c cVar = new c(this.mContext);
                cVar.setID(String.valueOf(j));
                cVar.setNotifyListener(new com.tencent.liteav.basic.c.b() { // from class: com.tencent.avroom.TXCAVRoom.12
                    @Override // com.tencent.liteav.basic.c.b
                    public void onNotifyEvent(int i, Bundle bundle) {
                        TXCAVRoom.this.onBothNotifyEvent(i, bundle);
                    }
                });
                j renderConfig = getRenderConfig();
                cVar.setConfig(renderConfig);
                cVar.setRenderMode(this.mRoomConfig.getRemoteRenderMode());
                cVar.setRenderRotation(TXCAVRoomConstants.AVROOM_HOME_ORIENTATION_RIGHT);
                if (renderConfig.h) {
                    cVar.setVideoRender(new com.tencent.liteav.renderer.d());
                } else {
                    cVar.setVideoRender(new com.tencent.liteav.renderer.a());
                }
                this.playerList.put(Long.valueOf(j), cVar);
            }
            this.playerList.get(Long.valueOf(j)).start(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRender(Long l) {
        synchronized (this.playerList) {
            c cVar = this.playerList.get(l);
            if (cVar == null) {
                return;
            }
            cVar.stop();
            cVar.setVideoRender(null);
            cVar.setDecListener(null);
            if (cVar.a() != null) {
                cVar.a().b();
                cVar.a((a) null);
            }
            this.playerList.remove(l);
        }
    }

    public synchronized void startRemoteView(TXCloudVideoView tXCloudVideoView, long j) {
        synchronized (this.playerList) {
            c cVar = this.playerList.get(Long.valueOf(j));
            if (cVar == null) {
                return;
            }
            if (tXCloudVideoView != null) {
                cVar.a(tXCloudVideoView);
                this.videoMemList.add(Long.valueOf(j));
                cVar.setRenderMode(0);
                requestView(this.videoMemList);
            }
            a aVar = new a(j);
            aVar.a(this.mAvRoomLisenter);
            aVar.a(this.mTXCAVProtocol);
            aVar.a(this.playerList.get(Long.valueOf(j)));
            aVar.a(this.playerList.get(Long.valueOf(j)).getVideoRender());
            this.playerList.get(Long.valueOf(j)).a(aVar);
            aVar.a();
            setRenderMode(this.mRoomConfig.getRemoteRenderMode());
        }
    }

    public synchronized void stopRemoteView(long j) {
        this.videoMemList.remove(Long.valueOf(j));
        requestView(this.videoMemList);
    }

    private void removeAllRender() {
        if (this.playerList == null || this.playerList.size() == 0) {
            return;
        }
        for (Long l : this.playerList.keySet()) {
            if (this.playerList.get(l) != null) {
                stopRemoteView(l.longValue());
                this.playerList.get(l).stop();
                if (this.playerList.get(l) != null && this.playerList.get(l).a() != null) {
                    this.playerList.get(l).a().b();
                    this.playerList.get(l).a((a) null);
                }
            }
        }
        this.playerList.clear();
    }

    private void requestViewList(ArrayList<TXCAVProtocol.TXSAVRoomView> arrayList, final TXCAVRoomCallback tXCAVRoomCallback) {
        this.mTXCAVProtocol.requestViews(arrayList, new TXCAVProtocol.TXIAVCompletionCallback() { // from class: com.tencent.avroom.TXCAVRoom.13
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
            public void onComplete(int i) {
                TXCAVRoom.this.postToUiThread(tXCAVRoomCallback, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPush() {
        TXCLog.i(TAG, "keyway startPush: ");
        this.allowedPush = true;
        this.mPusher.f();
    }

    private void stopPush() {
        TXCLog.i(TAG, "keyway stopPush: ");
        this.allowedPush = false;
        this.mPusher.g();
    }

    public void onPause() {
        TXCLog.i(TAG, "keyway onPause : ");
        this.mPusher.h();
    }

    public void onResume() {
        TXCLog.i(TAG, "keyway onResume: ");
        this.mPusher.i();
    }

    public void setVideoBitrateAndvideoAspect(int i, int i2) {
        this.videoResolution = TXCQoS.getProperResolutionByVideoBitrate(true, i, i2);
        if (this.videoResolution == null) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.videoResolution = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_360_480;
                } else if (i2 == 3) {
                    this.videoResolution = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_480_480;
                }
            }
            this.videoResolution = com.tencent.liteav.basic.b.c.RESOLUTION_TYPE_360_640;
        }
        String str = TAG;
        TXCLog.i(str, "setVideoBitrateAndvideoAspect videoBitrate: " + i + " videoAspect:" + i2 + " videoResolution:" + this.videoResolution);
        this.mRoomConfig.videoBitrate(i);
        applyCaptureConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postToUiThread(final TXCAVRoomCallback tXCAVRoomCallback, final int i) {
        if (this.mContext != null) {
            ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.14
                @Override // java.lang.Runnable
                public void run() {
                    tXCAVRoomCallback.onComplete(i);
                }
            });
        }
    }

    private void requestView(ArrayList<Long> arrayList) {
        String str = TAG;
        TXCLog.i(str, "requestView: " + arrayList.size());
        ArrayList<TXCAVProtocol.TXSAVRoomView> arrayList2 = new ArrayList<>();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            TXCAVProtocol tXCAVProtocol = new TXCAVProtocol();
            tXCAVProtocol.getClass();
            TXCAVProtocol.TXSAVRoomView tXSAVRoomView = new TXCAVProtocol.TXSAVRoomView();
            tXSAVRoomView.tinyID = longValue;
            tXSAVRoomView.height = 240;
            tXSAVRoomView.width = jw.e;
            arrayList2.add(tXSAVRoomView);
        }
        requestViewList(arrayList2, new TXCAVRoomCallback() { // from class: com.tencent.avroom.TXCAVRoom.15
            @Override // com.tencent.avroom.TXCAVRoomCallback
            public void onComplete(int i) {
                String str2 = TXCAVRoom.TAG;
                TXCLog.i(str2, "keyway requestViewList onComplete: " + i);
            }
        });
    }

    public void switchCamera() {
        if (this.mPusher != null) {
            this.mPusher.l();
        }
    }

    public void setRemoteMute(boolean z, long j) {
        if (this.playerList == null) {
            return;
        }
        if (j == 0) {
            for (Long l : this.playerList.keySet()) {
                this.playerList.get(l);
            }
        }
        synchronized (this.playerList) {
            this.playerList.get(Long.valueOf(j));
        }
    }

    public void setMirror(boolean z) {
        if (this.mPusher != null) {
            this.mPusher.g(z);
        }
    }

    private void applyCaptureConfig() {
        if (this.mPusher != null) {
            this.mLivePushConfig = new i();
            this.mLivePushConfig.s = TXCAVRoomConstants.AVROOM_AUDIO_SAMPLE_RATE;
            this.mLivePushConfig.t = 1;
            this.mLivePushConfig.u = true;
            this.mLivePushConfig.c = this.mRoomConfig.getVideoBitrate();
            this.mLivePushConfig.h = this.mRoomConfig.getCaptureVideoFPS();
            this.mLivePushConfig.i = 1;
            this.mLivePushConfig.l = this.mRoomConfig.getHomeOrientation();
            this.mLivePushConfig.m = this.mRoomConfig.isFrontCamera();
            this.mLivePushConfig.C = this.mRoomConfig.getPauseFps();
            this.mLivePushConfig.A = this.mRoomConfig.getPauseImg();
            this.mLivePushConfig.B = TXCAVRoomConstants.AVROOM_PUSH_PAUSETIME;
            this.mLivePushConfig.D = this.mRoomConfig.getPauseFlag();
            this.mLivePushConfig.k = this.videoResolution;
            this.mLivePushConfig.j = this.mRoomConfig.isEnableVideoHWAcceleration() ? 1 : 0;
            if (this.mQos != null) {
                this.mQos.setDefaultVideoResolution(this.videoResolution);
                this.mQos.setVideoEncBitrate(100, this.mRoomConfig.getVideoBitrate(), this.mRoomConfig.getVideoBitrate());
            }
            this.mPusher.a(this.mLivePushConfig);
        }
    }

    private j getRenderConfig() {
        j jVar = new j();
        jVar.a(true);
        jVar.a(TXCAVRoomConstants.AVROOM_CACHETIME);
        jVar.b(TXCAVRoomConstants.AVROOM_MAX_ADJUSTCACHETIME);
        jVar.h = this.mRoomConfig.isEnableVideoHWAcceleration();
        return jVar;
    }

    public void setRenderMode(int i) {
        for (Map.Entry<Long, c> entry : this.playerList.entrySet()) {
            String str = TAG;
            TXCLog.i(str, "Key = " + entry.getKey() + ", Value = " + entry.getValue());
            entry.getValue().setRenderMode(i);
        }
    }

    public void setEyeScaleLevel(int i) {
        this.mPusher.b().setEyeScaleLevel(i);
    }

    public void setFaceSlimLevel(int i) {
        this.mPusher.b().setFaceSlimLevel(i);
    }

    public void setFilter(Bitmap bitmap) {
        this.mPusher.b().setFilter(bitmap);
    }

    public void setGreenScreenFile(String str) {
        this.mPusher.b().setGreenScreenFile(str);
    }

    public void setMotionTmpl(String str) {
        this.mPusher.b().setMotionTmpl(str);
    }

    public void setExposureCompensation(float f) {
        this.mPusher.a(f);
    }

    public void setBeautyFilter(int i, int i2, int i3, int i4) {
        if (this.mPusher != null) {
            this.mPusher.b().setBeautyStyle(i);
            float f = i2;
            this.mPusher.b().setBeautyLevel(f);
            this.mPusher.b().setWhitenessLevel(f);
            this.mPusher.b().setRuddyLevel(f);
        }
    }

    public void setFaceVLevel(int i) {
        if (this.mPusher != null) {
            this.mPusher.b().setFaceVLevel(i);
        }
    }

    public void setSpecialRatio(float f) {
        if (this.mPusher != null) {
            this.mPusher.b().setFilterStrength(f);
        }
    }

    public void setFaceShortLevel(int i) {
        if (this.mPusher != null) {
            this.mPusher.b().setFaceShortLevel(i);
        }
    }

    public void setChinLevel(int i) {
        if (this.mPusher != null) {
            this.mPusher.b().setChinLevel(i);
        }
    }

    public void setNoseSlimLevel(int i) {
        if (this.mPusher != null) {
            this.mPusher.b().setNoseSlimLevel(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBothNotifyEvent(int i, Bundle bundle) {
        final int i2;
        String str = TAG;
        TXCLog.i(str, "AVROOM onNotifyEvent: " + bundle.getString("EVT_MSG"));
        if (this.mAvRoomLisenter != null) {
            final Long valueOf = Long.valueOf(bundle.getLong(TXCAVRoomConstants.EVT_USERID));
            switch (i) {
                case -1303:
                    i2 = TXCAVRoomConstants.AVROOM_ERR_VIDEO_ENCODE_FAIL;
                    break;
                case -1302:
                    i2 = TXCAVRoomConstants.AVROOM_ERR_OPEN_MIC_FAIL;
                    break;
                case -1301:
                    i2 = TXCAVRoomConstants.AVROOM_ERR_OPEN_CAMERA_FAIL;
                    break;
                case 1003:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_OPEN_CAMERA_SUCC;
                    break;
                case 1005:
                    int i3 = TXCAVRoomConstants.AVROOM_EVT_UP_CHANGE_RESOLUTION;
                case 1006:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_UP_CHANGE_BITRATE;
                    break;
                case 1007:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_FIRST_FRAME_AVAILABLE;
                    break;
                case 1008:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_START_VIDEO_ENCODER;
                    break;
                case 1103:
                    i2 = TXCAVRoomConstants.AVROOM_WARNING_HW_ACCELERATION_ENCODE_FAIL;
                    break;
                case 2003:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_RCV_FIRST_I_FRAME;
                    break;
                case 2004:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_PLAY_BEGIN;
                    break;
                case 2007:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_PLAY_LOADING;
                    break;
                case 2008:
                    i2 = TXCAVRoomConstants.AVROOM_EVT_START_VIDEO_DECODER;
                    break;
                case 2101:
                    i2 = TXCAVRoomConstants.AVROOM_WARNING_VIDEO_DECODE_FAIL;
                    break;
                case 2105:
                    i2 = TXCAVRoomConstants.AVROOM_WARNING_VIDEO_PLAY_LAG;
                    break;
                case 2106:
                    i2 = TXCAVRoomConstants.AVROOM_WARNING_HW_ACCELERATION_DECODE_FAIL;
                    break;
                default:
                    return;
            }
            final Bundle bundle2 = new Bundle();
            bundle2.putLong(TXCAVRoomConstants.EVT_USERID, valueOf.longValue());
            bundle2.putInt(TXCAVRoomConstants.EVT_ID, bundle.getInt(TXCAVRoomConstants.EVT_ID, 0));
            bundle2.putLong("EVT_TIME", bundle.getLong("EVT_TIME", 0L));
            bundle2.putString("EVT_MSG", bundle.getString("EVT_MSG", ""));
            if (this.mPusher != null) {
                ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.tencent.avroom.TXCAVRoom.16
                    @Override // java.lang.Runnable
                    public void run() {
                        String str2 = TXCAVRoom.TAG;
                        TXCLog.i(str2, "NotifyEvent sendNotifyEvent userID: " + valueOf + "  msg " + bundle2.getString("EVT_MSG"));
                        TXCAVRoom.this.mAvRoomLisenter.onAVRoomEvent(valueOf.longValue(), i2, bundle2);
                    }
                });
            }
        }
    }
}
