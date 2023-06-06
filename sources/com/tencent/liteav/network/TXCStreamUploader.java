package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.dianping.shield.entity.ExposeAction;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.open.SocialConstants;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCStreamUploader extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.network.b {
    public static final int RTMPSENDSTRATEGY_LIVE = 1;
    public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
    public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
    static final String TAG = "TXCStreamUploader";
    public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
    public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
    public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
    public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
    public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
    private Context mContext;
    private int mCurrentRecordIdx;
    private HandlerThread mHandlerThread;
    private c mIntelligentRoute;
    private ArrayList<com.tencent.liteav.network.a> mIpList;
    private boolean mIsPushing;
    private int mLastNetworkType;
    HashMap<String, String> mMetaData;
    private l mParam;
    private int mRetryCount;
    private String mRtmpUrl;
    private Thread mThread;
    private Object mThreadLock;
    private n mUploadQualityReport;
    private long mUploaderInstance;
    private boolean mQuicChannel = false;
    private int mChannelType = 0;
    private boolean mEnableNearestIP = true;
    private WeakReference<com.tencent.liteav.basic.c.b> mNotifyListener = null;
    private long mConnectSuccessTimeStamps = 0;
    private long mGoodPushTime = 30000;
    private Handler mHandler = null;
    private final int MSG_RECONNECT = 101;
    private final int MSG_EVENT = 102;
    private final int MSG_REPORT_STATUS = 103;
    private final int MSG_RTMPPROXY_HEARTBEAT = 104;
    private long mLastTimeStamp = 0;
    private UploadStats mLastUploadStats = null;
    private Vector<TXSNALPacket> mVecPendingNAL = new Vector<>();
    private int mConnectCountQuic = 0;
    private int mConnectCountTcp = 0;
    private boolean mRtmpProxyEnable = false;
    private boolean mAudioMuted = false;
    private a mRtmpProxyParam = new a();
    private Vector<String> mRtmpProxyIPList = new Vector<>();
    private int mRtmpProxyIPIndex = 0;
    private long mRtmpProxyInstance = 0;
    private long mRtmpMsgRecvThreadInstance = 0;
    private Object mRtmpProxyLock = new Object();
    private Object mRtmpMsgRecvThreadLock = new Object();

    private native void nativeCacheJNIParams();

    private native void nativeEnableDrop(long j, boolean z);

    private native UploadStats nativeGetStats(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpMsgRecvThreadInstance(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpProxyInstance(long j, long j2, String str, long j3, String str2, long j4, long j5, String str3, boolean z, String str4);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitUploader(String str, String str2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, int i8, HashMap<String, String> hashMap);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnThreadRun(long j);

    private native void nativePushAAC(long j, byte[] bArr, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativePushNAL(long j, byte[] bArr, int i, long j2, long j3, long j4);

    private native void nativeReleaseJNIParams();

    private native void nativeRtmpMsgRecvThreadStart(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRtmpMsgRecvThreadStop(long j);

    private native void nativeRtmpProxyEnterRoom(long j);

    private native void nativeRtmpProxyLeaveRoom(long j);

    private native void nativeRtmpProxySendHeartBeat(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11);

    private native void nativeSendRtmpProxyMsg(long j, byte[] bArr);

    private native void nativeSetSendStrategy(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoDropParams(long j, boolean z, int i, int i2);

    private native void nativeStopPush(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpMsgRecvThreadInstance(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpProxyInstance(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitUploader(long j);

    public int init() {
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b {
        public String a;
        public boolean b;

        public b(String str, boolean z) {
            this.a = "";
            this.b = false;
            this.a = str;
            this.b = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class UploadStats {
        public long audioCacheLen;
        public long audioDropCount;
        public long bandwidthEst;
        public long channelType;
        public long connTS;
        public long connectTimeCost;
        public String connectionID;
        public String connectionStats;
        public long dnsTS;
        public long dnsparseTimeCost;
        public long handshakeTimeCost;
        public long inAudioBytes;
        public long inVideoBytes;
        public long outAudioBytes;
        public long outVideoBytes;
        public String serverIP;
        public long startTS;
        public long videoCacheLen;
        public long videoDropCount;

        public UploadStats() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public long a;
        public long b;
        public String c;
        public long d;
        public String e;
        public long f;
        public long g;
        public String h;
        public boolean i;
        public String j;

        public a() {
        }

        public void a() {
            this.a = 0L;
            this.b = 0L;
            this.c = "";
            this.d = 0L;
            this.e = "";
            this.f = 0L;
            this.g = 0L;
            this.i = false;
            this.j = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class RtmpProxyUserInfo {
        public String account = "";
        public String playUrl = "";
        public int stmType = 0;

        public RtmpProxyUserInfo() {
        }
    }

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public TXCStreamUploader(Context context, l lVar) {
        this.mUploaderInstance = 0L;
        this.mThread = null;
        this.mThreadLock = null;
        this.mIsPushing = false;
        this.mRtmpUrl = "";
        this.mIntelligentRoute = null;
        this.mLastNetworkType = 0;
        this.mContext = null;
        this.mIpList = null;
        this.mCurrentRecordIdx = 0;
        this.mRetryCount = 0;
        this.mHandlerThread = null;
        this.mParam = null;
        this.mUploadQualityReport = null;
        this.mContext = context;
        if (lVar == null) {
            lVar = new l();
            lVar.a = 0;
            lVar.g = 3;
            lVar.f = 3;
            lVar.h = 40;
            lVar.i = 1000;
            lVar.j = true;
        }
        this.mParam = lVar;
        this.mThreadLock = new Object();
        this.mIntelligentRoute = new c();
        this.mIntelligentRoute.a = this;
        this.mUploaderInstance = 0L;
        this.mRetryCount = 0;
        this.mCurrentRecordIdx = 0;
        this.mIpList = null;
        this.mIsPushing = false;
        this.mThread = null;
        this.mRtmpUrl = null;
        this.mLastNetworkType = 0;
        this.mHandlerThread = null;
        this.mUploadQualityReport = new n(context);
        m.a().a(context);
    }

    public void setRetryInterval(int i) {
        if (this.mParam != null) {
            this.mParam.g = i;
        }
    }

    public void setAudioInfo(int i, int i2) {
        if (this.mParam != null) {
            this.mParam.d = i2;
            this.mParam.e = i;
        }
    }

    public void setRetryTimes(int i) {
        if (this.mParam != null) {
            this.mParam.f = i;
        }
    }

    public void setMode(int i) {
        if (this.mParam != null) {
            this.mParam.a = i;
        }
    }

    private void postReconnectMsg(String str, boolean z, int i) {
        Message message = new Message();
        message.what = 101;
        message.obj = str;
        message.arg1 = z ? 2 : 1;
        if (this.mHandler != null) {
            this.mHandler.sendMessageDelayed(message, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // com.tencent.liteav.network.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFetchDone(int r5, java.util.ArrayList<com.tencent.liteav.network.a> r6) {
        /*
            r4 = this;
            boolean r0 = r4.mIsPushing
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            if (r6 == 0) goto L32
            java.lang.String r1 = "TXCStreamUploader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onFetchDone: code = "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " ip count = "
            r2.append(r3)
            int r3 = r6.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.liteav.basic.log.TXCLog.e(r1, r2)
            if (r5 != 0) goto L32
            r4.mIpList = r6
            int r5 = r6.size()
            r4.mCurrentRecordIdx = r0
            goto L33
        L32:
            r5 = 0
        L33:
            if (r5 <= 0) goto La9
            java.lang.String r5 = ""
            java.util.ArrayList<com.tencent.liteav.network.a> r6 = r4.mIpList
            java.util.Iterator r6 = r6.iterator()
            r1 = r5
            r5 = 0
        L3f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r6.next()
            com.tencent.liteav.network.a r2 = (com.tencent.liteav.network.a) r2
            if (r2 == 0) goto L5f
            boolean r3 = r2.c
            if (r3 == 0) goto L5f
            java.lang.String r3 = r2.a
            if (r3 == 0) goto L5f
            java.lang.String r3 = r2.a
            int r3 = r3.length()
            if (r3 <= 0) goto L5f
            int r5 = r5 + 1
        L5f:
            if (r2 == 0) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            java.lang.String r1 = r2.a
            java.lang.String r1 = r4.getConfusionIP(r1)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            java.lang.String r1 = r2.b
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L3f
        L86:
            r6 = 7016(0x1b68, float:9.832E-42)
            long r2 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r4.setStatusValue(r6, r5)
            r5 = 7019(0x1b6b, float:9.836E-42)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r6.<init>(r2)
            r6.append(r1)
            java.lang.String r1 = " }"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r4.setStatusValue(r5, r6)
        La9:
            com.tencent.liteav.network.TXCStreamUploader$b r5 = r4.getRtmpRealConnectInfo()
            java.lang.String r6 = r5.a
            boolean r5 = r5.b
            r4.postReconnectMsg(r6, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.TXCStreamUploader.onFetchDone(int, java.util.ArrayList):void");
    }

    public String getConfusionIP(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (str == null || (indexOf = str.indexOf(CommonConstant.Symbol.DOT)) == -1 || (indexOf2 = (substring = str.substring(indexOf + 1)).indexOf(CommonConstant.Symbol.DOT)) == -1) {
            return str;
        }
        String substring2 = substring.substring(indexOf2 + 1);
        return "A.B." + substring2;
    }

    public String start(String str, boolean z, int i) {
        if (this.mIsPushing) {
            return this.mRtmpUrl;
        }
        this.mIsPushing = true;
        this.mConnectSuccessTimeStamps = 0L;
        this.mRetryCount = 0;
        this.mRtmpUrl = str;
        this.mChannelType = i;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mRtmpProxyEnable = false;
        this.mRtmpProxyParam.a();
        this.mRtmpProxyIPList.clear();
        this.mRtmpProxyIPIndex = 0;
        this.mRtmpProxyInstance = 0L;
        this.mRtmpMsgRecvThreadInstance = 0L;
        setStatusValue(7016, 0L);
        setStatusValue(7017, 0L);
        setStatusValue(7018, 0L);
        this.mUploadQualityReport.a();
        StringBuilder sb = new StringBuilder("start push with url:");
        sb.append(this.mRtmpUrl);
        sb.append(" enable nearest ip:");
        sb.append(z ? "yes" : "no");
        sb.append("channel type:");
        sb.append(i);
        TXCLog.i(TAG, sb.toString());
        if (com.tencent.liteav.basic.util.g.e(this.mContext) == 0) {
            sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK);
            return this.mRtmpUrl;
        }
        this.mEnableNearestIP = z;
        if (this.mHandlerThread == null) {
            this.mHandlerThread = new HandlerThread("RTMP_PUSH");
            this.mHandlerThread.start();
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.tencent.liteav.network.TXCStreamUploader.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 101:
                        TXCStreamUploader.this.startPushTask((String) message.obj, message.arg1 == 2, 0);
                        return;
                    case 102:
                    default:
                        return;
                    case 103:
                        TXCStreamUploader.this.reportNetStatus();
                        return;
                    case 104:
                        TXCStreamUploader.this.rtmpProxySendHeartBeat();
                        if (TXCStreamUploader.this.mHandler != null) {
                            TXCStreamUploader.this.mHandler.sendEmptyMessageDelayed(104, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                            return;
                        }
                        return;
                }
            }
        };
        parseProxyInfo(str);
        if (this.mRtmpProxyEnable) {
            this.mLastNetworkType = com.tencent.liteav.basic.util.g.e(this.mContext);
            nativeCacheJNIParams();
        } else if (this.mEnableNearestIP && this.mLastNetworkType != com.tencent.liteav.basic.util.g.e(this.mContext)) {
            TXCLog.i(TAG, "fetching nearest ip list");
            this.mLastNetworkType = com.tencent.liteav.basic.util.g.e(this.mContext);
            this.mIntelligentRoute.a(str, i);
            this.mHandler.sendEmptyMessageDelayed(103, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            return this.mRtmpUrl;
        }
        startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        this.mHandler.sendEmptyMessageDelayed(103, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        return this.mRtmpUrl;
    }

    public void stop() {
        if (this.mIsPushing) {
            this.mIsPushing = false;
            TXCLog.i(TAG, "stop push");
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyLeaveRoom(this.mRtmpProxyInstance);
                }
            }
            synchronized (this.mThreadLock) {
                nativeStopPush(this.mUploaderInstance);
            }
            if (this.mHandlerThread != null) {
                this.mHandlerThread.getLooper().quit();
                this.mHandlerThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
            if (this.mRtmpProxyEnable) {
                nativeReleaseJNIParams();
            }
            this.mUploadQualityReport.c();
            this.mUploadQualityReport.a();
        }
    }

    private void tryResetRetryCount() {
        if (this.mConnectSuccessTimeStamps == 0 || TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps <= this.mParam.f * (this.mParam.g + 13) * 1000) {
            return;
        }
        this.mRetryCount = 0;
        this.mConnectSuccessTimeStamps = 0L;
        TXCLog.i(TAG, "reset retry count");
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaData = hashMap;
    }

    public void pushAAC(byte[] bArr, long j) {
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            if (!this.mAudioMuted || !this.mRtmpProxyEnable) {
                nativePushAAC(this.mUploaderInstance, bArr, j);
            }
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            if (this.mUploaderInstance != 0) {
                if (tXSNALPacket != null && tXSNALPacket.nalData != null && tXSNALPacket.nalData.length > 0) {
                    nativePushNAL(this.mUploaderInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                }
            } else {
                if (tXSNALPacket.nalType == 0) {
                    this.mVecPendingNAL.removeAllElements();
                }
                this.mVecPendingNAL.add(tXSNALPacket);
            }
        }
    }

    public void setAudioMute(boolean z) {
        synchronized (this.mThreadLock) {
            this.mAudioMuted = z;
            if (this.mRtmpProxyEnable && this.mUploaderInstance != 0) {
                nativeSetSendStrategy(this.mUploaderInstance, this.mParam.m ? this.mQuicChannel ? 3 : 2 : 1, false);
            }
        }
    }

    public void setDropEanble(boolean z) {
        StringBuilder sb = new StringBuilder("drop enable ");
        sb.append(z ? "yes" : "no");
        TXCLog.i(TAG, sb.toString());
        synchronized (this.mThreadLock) {
            nativeEnableDrop(this.mUploaderInstance, z);
        }
    }

    public void setVideoDropParams(boolean z, int i, int i2) {
        StringBuilder sb = new StringBuilder("drop params wait i frame:");
        sb.append(z ? "yes" : "no");
        sb.append(" max video count:");
        sb.append(i);
        sb.append(" max video cache time: ");
        sb.append(i2);
        sb.append(" ms");
        TXCLog.i(TAG, sb.toString());
        synchronized (this.mThreadLock) {
            this.mParam.j = z;
            this.mParam.h = i;
            this.mParam.i = i2;
            if (this.mUploaderInstance != 0) {
                nativeSetVideoDropParams(this.mUploaderInstance, this.mParam.j, this.mParam.h, this.mParam.i);
            }
        }
    }

    public void setSendStrategy(boolean z, boolean z2) {
        int i;
        this.mParam.m = z;
        this.mParam.n = z2;
        this.mUploadQualityReport.a(z);
        if (z) {
            i = this.mQuicChannel ? 3 : 2;
        } else {
            i = 1;
        }
        if (!this.mRtmpProxyEnable && (this.mIpList == null || this.mIpList.size() == 0)) {
            i = 1;
        }
        synchronized (this.mThreadLock) {
            if (this.mUploaderInstance != 0) {
                nativeSetSendStrategy(this.mUploaderInstance, i, z2);
            }
        }
        setStatusValue(7020, Long.valueOf(i));
    }

    public UploadStats getUploadStats() {
        UploadStats nativeGetStats;
        synchronized (this.mThreadLock) {
            nativeGetStats = nativeGetStats(this.mUploaderInstance);
            if (nativeGetStats != null) {
                nativeGetStats.channelType = this.mQuicChannel ? 2L : 1L;
            }
        }
        return nativeGetStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPushTask(final String str, final boolean z, int i) {
        TXCLog.i(TAG, "start push task");
        if (this.mQuicChannel != z && this.mQuicChannel) {
            Monitor.a(2, String.format("Network: switch push channel from quic to tcp.[retryCount:%d][retryLimit:%d]", Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f)), "", 0);
        }
        if (z) {
            int i2 = this.mConnectCountQuic + 1;
            this.mConnectCountQuic = i2;
            setStatusValue(7017, Long.valueOf(i2));
        } else {
            int i3 = this.mConnectCountTcp + 1;
            this.mConnectCountTcp = i3;
            setStatusValue(7018, Long.valueOf(i3));
        }
        this.mThread = new Thread("RTMPUpload") { // from class: com.tencent.liteav.network.TXCStreamUploader.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                int i4;
                while (TXCStreamUploader.this.mUploaderInstance != 0) {
                    try {
                        sleep(100L, 0);
                    } catch (InterruptedException unused) {
                    }
                }
                TXCStreamUploader.this.mUploadQualityReport.b();
                TXCStreamUploader.this.mUploadQualityReport.a(TXCStreamUploader.this.mParam.m);
                TXCStreamUploader.this.mUploadQualityReport.a(TXCStreamUploader.this.mRtmpUrl);
                TXCStreamUploader.this.mUploadQualityReport.a(z, TXCStreamUploader.this.getAddressFromUrl(str));
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    TXCStreamUploader.this.mQuicChannel = z;
                    if (TXCStreamUploader.this.mParam.m) {
                        i4 = TXCStreamUploader.this.mQuicChannel ? 3 : 2;
                    } else {
                        i4 = 1;
                    }
                    if (!TXCStreamUploader.this.mRtmpProxyEnable) {
                        if (TXCStreamUploader.this.mIpList == null || TXCStreamUploader.this.mIpList.size() == 0) {
                            i4 = 1;
                        }
                    } else if (TXCStreamUploader.this.mAudioMuted) {
                        TXCStreamUploader.this.mParam.n = false;
                    }
                    TXCStreamUploader.this.setStatusValue(7020, Long.valueOf(i4));
                    TXCStreamUploader.this.mUploaderInstance = TXCStreamUploader.this.nativeInitUploader(TXCStreamUploader.this.mRtmpUrl, str, z, TXCStreamUploader.this.mParam.e, TXCStreamUploader.this.mParam.d, TXCStreamUploader.this.mParam.a, TXCStreamUploader.this.mParam.c, TXCStreamUploader.this.mParam.h, 16, i4, TXCStreamUploader.this.mParam.n, TXCStreamUploader.this.mParam.o, TXCStreamUploader.this.mMetaData);
                    if (TXCStreamUploader.this.mUploaderInstance != 0) {
                        TXCStreamUploader.this.nativeSetVideoDropParams(TXCStreamUploader.this.mUploaderInstance, TXCStreamUploader.this.mParam.j, TXCStreamUploader.this.mParam.h, TXCStreamUploader.this.mParam.i);
                        Iterator it = TXCStreamUploader.this.mVecPendingNAL.iterator();
                        boolean z2 = false;
                        while (it.hasNext()) {
                            TXSNALPacket tXSNALPacket = (TXSNALPacket) it.next();
                            if (!z2 && tXSNALPacket.nalType == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                TXCStreamUploader.this.nativePushNAL(TXCStreamUploader.this.mUploaderInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                            }
                        }
                        TXCStreamUploader.this.mVecPendingNAL.removeAllElements();
                    }
                }
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader.this.mRtmpProxyInstance = TXCStreamUploader.this.nativeInitRtmpProxyInstance(TXCStreamUploader.this.mRtmpProxyParam.a, TXCStreamUploader.this.mRtmpProxyParam.b, TXCStreamUploader.this.mRtmpProxyParam.c, TXCStreamUploader.this.mRtmpProxyParam.d, TXCStreamUploader.this.mRtmpProxyParam.e, TXCStreamUploader.this.mRtmpProxyParam.f, TXCStreamUploader.this.mRtmpProxyParam.g, TXCStreamUploader.this.mRtmpProxyParam.h, TXCStreamUploader.this.mRtmpProxyParam.i, TXCStreamUploader.this.mRtmpProxyParam.j);
                    }
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader.this.mRtmpMsgRecvThreadInstance = TXCStreamUploader.this.nativeInitRtmpMsgRecvThreadInstance(TXCStreamUploader.this.mRtmpProxyInstance, TXCStreamUploader.this.mUploaderInstance);
                    }
                }
                TXCStreamUploader.this.nativeOnThreadRun(TXCStreamUploader.this.mUploaderInstance);
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader.this.nativeRtmpMsgRecvThreadStop(TXCStreamUploader.this.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader.this.nativeUninitRtmpMsgRecvThreadInstance(TXCStreamUploader.this.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader.this.mRtmpMsgRecvThreadInstance = 0L;
                    }
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader.this.nativeUninitRtmpProxyInstance(TXCStreamUploader.this.mRtmpProxyInstance);
                        TXCStreamUploader.this.mRtmpProxyInstance = 0L;
                    }
                }
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    TXCStreamUploader.this.nativeUninitUploader(TXCStreamUploader.this.mUploaderInstance);
                    TXCStreamUploader.this.mUploaderInstance = 0L;
                }
            }
        };
        this.mThread.start();
    }

    private void stopPushTask() {
        TXCLog.i(TAG, "stop push task");
        synchronized (this.mThreadLock) {
            this.mVecPendingNAL.removeAllElements();
            nativeStopPush(this.mUploaderInstance);
        }
    }

    private b getRtmpRealConnectInfo() {
        if (!this.mEnableNearestIP) {
            return new b(this.mRtmpUrl, false);
        }
        if (this.mIpList == null) {
            return new b(this.mRtmpUrl, false);
        }
        if (this.mCurrentRecordIdx >= this.mIpList.size() || this.mCurrentRecordIdx < 0) {
            return new b(this.mRtmpUrl, false);
        }
        com.tencent.liteav.network.a aVar = this.mIpList.get(this.mCurrentRecordIdx);
        String[] split = this.mRtmpUrl.split("://");
        if (split.length < 2) {
            return new b(this.mRtmpUrl, false);
        }
        String[] split2 = split[1].split("/");
        if (aVar.a.split(CommonConstant.Symbol.COLON).length > 1 && !aVar.a.startsWith("[")) {
            split2[0] = "[" + aVar.a + "]:" + aVar.b;
        } else {
            split2[0] = aVar.a + CommonConstant.Symbol.COLON + aVar.b;
        }
        StringBuilder sb = new StringBuilder(split2[0]);
        for (int i = 1; i < split2.length; i++) {
            sb.append("/");
            sb.append(split2[i]);
        }
        return new b(split[0] + "://" + sb.toString(), aVar.c);
    }

    private boolean nextRecordIdx(boolean z) {
        if (this.mIpList == null || this.mIpList.size() == 0) {
            return false;
        }
        if (z) {
            this.mIpList.get(this.mCurrentRecordIdx).e++;
        }
        if (this.mCurrentRecordIdx + 1 < this.mIpList.size()) {
            this.mCurrentRecordIdx++;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAddressFromUrl(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        return (str == null || (indexOf = str.indexOf("://")) == -1 || (indexOf2 = (substring = str.substring(indexOf + 3)).indexOf("/")) == -1) ? "" : substring.substring(0, indexOf2);
    }

    private void reconnect(final boolean z) {
        stopPushTask();
        if (this.mHandler != null) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamUploader.3
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamUploader.this.internalReconnect(z);
                }
            }, this.mParam.g * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z) {
        if (this.mIsPushing) {
            if (this.mRtmpProxyEnable) {
                if (this.mLastNetworkType != com.tencent.liteav.basic.util.g.e(this.mContext)) {
                    TXCLog.e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.g.e(this.mContext));
                    this.mLastNetworkType = com.tencent.liteav.basic.util.g.e(this.mContext);
                    this.mRetryCount = 0;
                    Monitor.a(2, "WebrtcRoom: need enter again by user", "", 0);
                    sendNotifyEvent(1021, String.format("Network type has changed. Need to re-enter the room", new Object[0]));
                    return;
                } else if (this.mRetryCount < this.mParam.f) {
                    this.mRetryCount++;
                    Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.h, Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f)), "", 0);
                    TXCEventRecorderProxy.a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect rtmp-proxy server(econnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f + CommonConstant.Symbol.BRACKET_RIGHT, 0);
                    sendNotifyEvent(1102);
                    startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                    return;
                } else if (getNextRtmpProxyIP()) {
                    this.mRetryCount = 0;
                    Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.h, Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f)), "", 0);
                    sendNotifyEvent(1102);
                    startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                    return;
                } else {
                    TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect rtmp-proxy server failed(try all addresses)", 0);
                    sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                    return;
                }
            }
            this.mUploadQualityReport.c();
            if (this.mEnableNearestIP && this.mLastNetworkType != com.tencent.liteav.basic.util.g.e(this.mContext)) {
                TXCLog.e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.g.e(this.mContext));
                this.mLastNetworkType = com.tencent.liteav.basic.util.g.e(this.mContext);
                this.mIntelligentRoute.a(this.mRtmpUrl, this.mChannelType);
                this.mRetryCount = 0;
                return;
            }
            boolean z2 = !this.mEnableNearestIP ? false : z;
            if (this.mQuicChannel) {
                z2 = true;
            }
            if (z2 && !nextRecordIdx(true)) {
                TXCLog.e(TAG, "reconnect: try all addresses failed");
                TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all addresses failed)", 0);
            }
            b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            String addressFromUrl = getAddressFromUrl(rtmpRealConnectInfo.a);
            StringBuilder sb = new StringBuilder("reconnect change ip: ");
            sb.append(addressFromUrl);
            sb.append(" enableNearestIP: ");
            sb.append(this.mEnableNearestIP);
            sb.append(" last channel type: ");
            sb.append(this.mQuicChannel ? "Q Channel" : "TCP");
            TXCLog.e(TAG, sb.toString());
            if (this.mQuicChannel) {
                TXCLog.e(TAG, "reconnect last channel type is Q Channel，ignore retry limit");
                Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s]", addressFromUrl), "", 0);
                startPushTask(rtmpRealConnectInfo.a, rtmpRealConnectInfo.b, 0);
                sendNotifyEvent(1102);
                return;
            }
            TXCLog.e(TAG, "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f);
            if (this.mRetryCount < this.mParam.f) {
                this.mRetryCount++;
                Monitor.a(2, String.format("Network: reconnecting to upload server with tcp.[addr:%s][retryCount:%d][retryLimit:%d]", addressFromUrl, Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f)), "", 0);
                TXCEventRecorderProxy.a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect upload server:(retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f + CommonConstant.Symbol.BRACKET_RIGHT, 0);
                startPushTask(rtmpRealConnectInfo.a, rtmpRealConnectInfo.b, 0);
                sendNotifyEvent(1102);
                return;
            }
            TXCLog.e(TAG, "reconnect: try all times failed");
            TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all times failed)", 0);
            sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
        }
    }

    private void sendNotifyEvent(int i, String str) {
        if (str == null || str.isEmpty()) {
            sendNotifyEvent(i);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_MSG", str);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            com.tencent.liteav.basic.util.g.a(this.mNotifyListener, i, bundle);
        }
        if (i != 1002) {
            if (i == 1101) {
                this.mUploadQualityReport.d();
                return;
            }
            return;
        }
        UploadStats uploadStats = getUploadStats();
        if (uploadStats != null) {
            this.mUploadQualityReport.a(uploadStats.dnsparseTimeCost, uploadStats.connectTimeCost, uploadStats.handshakeTimeCost);
        }
    }

    private void sendNotifyEvent(int i) {
        if (i == 0) {
            reconnect(false);
        } else if (i == 1) {
            reconnect(true);
        } else {
            if (i == 1001) {
                this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
            }
            if (i == 1026) {
                if (this.mRtmpProxyEnable) {
                    synchronized (this.mRtmpMsgRecvThreadLock) {
                        nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                    }
                    synchronized (this.mRtmpProxyLock) {
                        nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                    }
                    if (this.mHandler != null) {
                        this.mHandler.sendEmptyMessageDelayed(104, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    }
                }
            } else if (this.mNotifyListener != null) {
                Bundle bundle = new Bundle();
                switch (i) {
                    case TXLiteAVCode.ERR_PLAY_LIVE_STREAM_SERVER_REFUSE /* -2308 */:
                        bundle.putString("EVT_MSG", "The server rejects the connection request. It may be that the push URL has been occupied or expired, or the anti-leech link is wrong.");
                        break;
                    case TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK /* -1325 */:
                        bundle.putString("EVT_MSG", "No internet. Please check if WiFi or mobile data is turned on");
                        break;
                    case TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL /* -1324 */:
                        bundle.putString("EVT_MSG", "Failed to connect all IPs, abort connection.");
                        break;
                    case -1307:
                        bundle.putString("EVT_MSG", "failed to connect server for several times, abort connection");
                        break;
                    case 1001:
                        bundle.putString("EVT_MSG", "Already connected to rtmp server");
                        break;
                    case 1002:
                        bundle.putString("EVT_MSG", "rtmp start push stream");
                        break;
                    case TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START /* 1026 */:
                        if (this.mRtmpProxyEnable) {
                            synchronized (this.mRtmpMsgRecvThreadLock) {
                                nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                            }
                            synchronized (this.mRtmpProxyLock) {
                                nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                            }
                            if (this.mHandler != null) {
                                this.mHandler.sendEmptyMessageDelayed(104, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1101:
                        bundle.putString("EVT_MSG", "Insufficient upstream bandwidth. Data transmission is not timely");
                        break;
                    case 1102:
                        bundle.putString("EVT_MSG", "Enables network reconnection");
                        break;
                    case 3003:
                        bundle.putString("EVT_MSG", "RTMP servers handshake failed");
                        break;
                    case 3008:
                        bundle.putString("EVT_MSG", "No data is sent for more than 30s. Actively disconnect");
                        break;
                    case 3009:
                        bundle.putString("EVT_MSG", "Failed to connect server");
                        break;
                    default:
                        bundle.putString("EVT_MSG", GrsBaseInfo.CountryCodeSource.UNKNOWN);
                        break;
                }
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                com.tencent.liteav.basic.util.g.a(this.mNotifyListener, i, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        long j;
        long j2;
        long j3;
        int i;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j4 = timeTick - this.mLastTimeStamp;
        UploadStats uploadStats = getUploadStats();
        long j5 = 0;
        if (uploadStats != null) {
            if (this.mLastUploadStats != null) {
                i = 7005;
                long longValue = getSpeed(this.mLastUploadStats.inVideoBytes, uploadStats.inVideoBytes, j4).longValue();
                j2 = getSpeed(this.mLastUploadStats.inAudioBytes, uploadStats.inAudioBytes, j4).longValue();
                j3 = getSpeed(this.mLastUploadStats.outVideoBytes, uploadStats.outVideoBytes, j4).longValue();
                j = getSpeed(this.mLastUploadStats.outAudioBytes, uploadStats.outAudioBytes, j4).longValue();
                j5 = longValue;
            } else {
                i = 7005;
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            setStatusValue(i, Long.valueOf(uploadStats.videoCacheLen));
            setStatusValue(7006, Long.valueOf(uploadStats.audioCacheLen));
            setStatusValue(7007, Long.valueOf(uploadStats.videoDropCount));
            setStatusValue(7008, Long.valueOf(uploadStats.audioDropCount));
            setStatusValue(7021, Long.valueOf(uploadStats.bandwidthEst));
            setStatusValue(7009, Long.valueOf(uploadStats.startTS));
            setStatusValue(7010, Long.valueOf(uploadStats.dnsTS));
            setStatusValue(7011, Long.valueOf(uploadStats.connTS));
            setStatusValue(7012, String.valueOf(uploadStats.serverIP));
            setStatusValue(7013, Long.valueOf(this.mQuicChannel ? 2L : 1L));
            setStatusValue(7014, uploadStats.connectionID);
            setStatusValue(7015, uploadStats.connectionStats);
            this.mUploadQualityReport.a(uploadStats.videoDropCount, uploadStats.audioDropCount);
            this.mUploadQualityReport.b(uploadStats.videoCacheLen, uploadStats.audioCacheLen);
        } else {
            setStatusValue(7005, 0L);
            setStatusValue(7006, 0L);
            setStatusValue(7007, 0L);
            setStatusValue(7008, 0L);
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        setStatusValue(7001, Long.valueOf(j5));
        setStatusValue(7002, Long.valueOf(j2));
        setStatusValue(7003, Long.valueOf(j3));
        setStatusValue(7004, Long.valueOf(j));
        this.mLastTimeStamp = timeTick;
        this.mLastUploadStats = uploadStats;
        if (this.mHandler != null) {
            this.mHandler.sendEmptyMessageDelayed(103, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    private Long getSpeed(long j, long j2, long j3) {
        if (j <= j2) {
            j2 -= j;
        }
        return Long.valueOf(j3 > 0 ? ((j2 * 8) * 1000) / (j3 * 1024) : 0L);
    }

    private boolean isQCloudStreamUrl(String str) {
        int indexOf;
        String substring;
        return (str == null || str.length() == 0 || (indexOf = str.indexOf("://")) == -1 || (substring = str.substring(indexOf + "://".length())) == null || !substring.startsWith("cloud.tencent.com")) ? false : true;
    }

    private void parseProxyInfo(String str) {
        if (str == null || str.length() == 0 || !str.startsWith("room")) {
            return;
        }
        this.mRtmpProxyParam.i = isQCloudStreamUrl(str);
        HashMap paramsFromUrl = getParamsFromUrl(str);
        if (paramsFromUrl == null) {
            return;
        }
        if (paramsFromUrl.containsKey("sdkappid")) {
            this.mRtmpProxyParam.a = Long.valueOf((String) paramsFromUrl.get("sdkappid")).longValue();
        }
        if (paramsFromUrl.containsKey("roomid") && paramsFromUrl.containsKey("userid") && paramsFromUrl.containsKey("roomsig")) {
            this.mRtmpProxyParam.d = Long.valueOf((String) paramsFromUrl.get("roomid")).longValue();
            this.mRtmpProxyParam.c = (String) paramsFromUrl.get("userid");
            if (paramsFromUrl.containsKey("bizbuf")) {
                try {
                    this.mRtmpProxyParam.j = URLDecoder.decode((String) paramsFromUrl.get("bizbuf"), "UTF-8");
                } catch (Exception e) {
                    TXCLog.e(TAG, "decode bizbuf failed.", e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((String) paramsFromUrl.get("roomsig"), "UTF-8"));
                this.mRtmpProxyParam.b = 0L;
                if (jSONObject.has("Key")) {
                    this.mRtmpProxyParam.e = jSONObject.optString("Key");
                    JSONObject optJSONObject = jSONObject.optJSONObject("RtmpProxy");
                    if (optJSONObject == null || (optJSONObject.has("Ip") && optJSONObject.has("Port") && optJSONObject.has("Type"))) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("AccessList");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                if (jSONObject2 != null && jSONObject2.has("Ip") && jSONObject2.has("Port") && jSONObject2.has("Type")) {
                                    String optString = jSONObject2.optString("Ip");
                                    long optLong = jSONObject2.optLong("Port");
                                    if (jSONObject2.optLong("Type") == 2) {
                                        this.mRtmpProxyIPList.add(optString + CommonConstant.Symbol.COLON + optLong);
                                    }
                                }
                            }
                        }
                        if (!this.mRtmpProxyParam.i) {
                            this.mRtmpUrl = str;
                            this.mQuicChannel = false;
                        } else if (optJSONObject == null) {
                            return;
                        } else {
                            this.mRtmpUrl = str.substring(0, str.indexOf(CommonConstant.Symbol.QUESTION_MARK)) + "/webrtc/" + (this.mRtmpProxyParam.a + CommonConstant.Symbol.UNDERLINE + this.mRtmpProxyParam.d + CommonConstant.Symbol.UNDERLINE + this.mRtmpProxyParam.c) + "?real_rtmp_ip=" + optJSONObject.optString("Ip") + "&real_rtmp_port=" + optJSONObject.optLong("Port") + "&tinyid=" + this.mRtmpProxyParam.b + "&srctinyid=0";
                            getNextRtmpProxyIP();
                        }
                        this.mRtmpProxyEnable = true;
                    }
                }
            } catch (Exception e2) {
                TXCLog.e(TAG, "parse proxy info failed.", e2);
            }
        }
    }

    private HashMap getParamsFromUrl(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        String[] split2 = str.split("[?]");
        if (split2 == null || split2.length < 2 || split2[1] == null || split2[1].length() == 0) {
            return hashMap;
        }
        for (String str2 : split2[1].split("[&]")) {
            if (str2.indexOf("=") != -1) {
                String[] split3 = str2.split("[=]");
                if (split3.length == 2) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
        }
        return hashMap;
    }

    private boolean getNextRtmpProxyIP() {
        this.mRtmpProxyParam.f = 234L;
        this.mRtmpProxyParam.g = 80L;
        if (this.mRtmpProxyIPList == null || this.mRtmpProxyIPList.size() <= 0) {
            return false;
        }
        if (this.mRtmpProxyIPIndex >= this.mRtmpProxyIPList.size()) {
            this.mRtmpProxyIPIndex = 0;
            return false;
        }
        String[] split = this.mRtmpUrl.split("://");
        if (split.length < 2) {
            return false;
        }
        String substring = split[1].substring(split[1].indexOf("/"));
        String str = this.mRtmpProxyIPList.get(this.mRtmpProxyIPIndex);
        this.mRtmpProxyParam.h = str;
        this.mRtmpUrl = "room://" + str + substring;
        this.mQuicChannel = true;
        this.mRtmpProxyIPIndex = this.mRtmpProxyIPIndex + 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    public void rtmpProxySendHeartBeat() {
        Object obj;
        int[] a2 = com.tencent.liteav.basic.util.g.a();
        long j = a2[0] / 10;
        long j2 = a2[1] / 10;
        long c = TXCStatus.c(getID(), 7004);
        long c2 = TXCStatus.c(getID(), 7003);
        long c3 = TXCStatus.c(getID(), 1001);
        long c4 = TXCStatus.c(getID(), MapConstant.LayerPropertyFlag_MarkerSpacing);
        long c5 = TXCStatus.c(getID(), 7006);
        long c6 = TXCStatus.c(getID(), 7005);
        long c7 = TXCStatus.c(getID(), 7008);
        long c8 = TXCStatus.c(getID(), 7007);
        Object obj2 = this.mRtmpProxyLock;
        synchronized (obj2) {
            try {
                try {
                    nativeRtmpProxySendHeartBeat(this.mRtmpProxyInstance, j, j2, c, c2, c3, c4, c5, c6, c7, c8);
                } catch (Throwable th) {
                    th = th;
                    obj = c6;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    private void onSendRtmpProxyMsg(byte[] bArr) {
        synchronized (this.mThreadLock) {
            if (this.mUploaderInstance != 0) {
                nativeSendRtmpProxyMsg(this.mUploaderInstance, bArr);
            }
        }
    }

    private void onRtmpProxyUserListPushed(RtmpProxyUserInfo[] rtmpProxyUserInfoArr) {
        if (rtmpProxyUserInfoArr != null && this.mIsPushing && this.mRtmpProxyEnable && this.mRtmpProxyParam != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < rtmpProxyUserInfoArr.length; i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userid", rtmpProxyUserInfoArr[i].account);
                    jSONObject.put(SocialConstants.PARAM_PLAY_URL, rtmpProxyUserInfoArr[i].playUrl);
                    if (rtmpProxyUserInfoArr[i].stmType == 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userlist", jSONArray);
                jSONObject2.put("userlist_aux", jSONArray2);
                sendNotifyEvent(1020, jSONObject2.toString());
            } catch (Exception e) {
                TXCLog.e(TAG, "build json object failed.", e);
            }
        }
    }

    private void onRtmpProxyRoomEvent(int i, int i2) {
        if (i == 1) {
            sendNotifyEvent(1018, String.format("Already in room，[%d]", Integer.valueOf(i2)));
        } else if (i == 2) {
            sendNotifyEvent(1019, String.format("Not in the room，[%d]", Integer.valueOf(i2)));
        }
    }
}
