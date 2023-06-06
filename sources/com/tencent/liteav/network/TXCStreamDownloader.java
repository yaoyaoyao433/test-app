package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.passport.api.AbsApiFactory;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.liteav.network.d;
import com.tencent.liteav.network.k;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCStreamDownloader extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.basic.c.b, TXIStreamDownloader.a, d.a, h {
    public static final String TAG = "TXCStreamDownloader";
    private k mAccUrlFetcher;
    private Context mApplicationContext;
    private int mDownloadFormat;
    private TXIStreamDownloader mDownloader;
    private Handler mHandler;
    protected Map<String, String> mHeaders;
    private h mListener = null;
    private byte[] mListenerLock = new byte[0];
    private com.tencent.liteav.basic.c.b mNotifyListener = null;
    private boolean mDownloaderRunning = false;
    private String mOriginPlayUrl = "";
    private boolean mEnableNearestIP = false;
    private int mChannelType = 0;
    private boolean mEnableMessage = false;
    private boolean mEnableMetaData = false;
    private String mFlvSessionKey = "";
    private long mLastTimeStamp = 0;
    private DownloadStats mLastDownloadStats = null;
    private boolean mRecvFirstNal = false;
    private long mSwitchStartTime = 0;
    private long mCurrentNalTs = 0;
    private long mLastIFramelTs = 0;
    private d mStreamSwitcher = null;
    private Runnable mReportNetStatusRunnalbe = new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.3
        @Override // java.lang.Runnable
        public void run() {
            TXCStreamDownloader.this.reportNetStatus();
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class DownloadStats {
        public long afterParseAudioBytes;
        public long afterParseVideoBytes;
        public long beforeParseAudioBytes;
        public long beforeParseVideoBytes;
        public long connTS;
        public long dnsTS;
        public int errorCode;
        public String errorInfo;
        public long firstAudioTS;
        public long firstVideoTS;
        public String flvSessionKey;
        public String serverIP;
        public long startTS;
        public long videoGop;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public int d;
        public String e;
        public boolean f;
    }

    private native String nativeGetRTMPProxyUserId();

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        synchronized (this.mListenerLock) {
            if (this.mNotifyListener != null) {
                Bundle bundle2 = new Bundle();
                switch (i) {
                    case TXLiteAVCode.ERR_PLAY_LIVE_STREAM_SERVER_REFUSE /* -2308 */:
                        bundle2.putString("EVT_MSG", "The server rejected the connection request");
                        break;
                    case -2302:
                        bundle2.putString("EVT_MSG", "Failed to get accelerated pull address");
                        break;
                    case -2301:
                        bundle2.putString("EVT_MSG", "failed to connect server for several times, abort connection");
                        break;
                    case 2001:
                        bundle2.putString("EVT_MSG", "connection SUCCESS");
                        break;
                    case 2002:
                        bundle2.putString("EVT_MSG", "begin receiving stream");
                        break;
                    case 2012:
                        byte[] byteArray = bundle.getByteArray(TXLiveConstants.EVT_GET_MSG);
                        if (byteArray != null && byteArray.length > 0) {
                            bundle2.putByteArray(TXLiveConstants.EVT_GET_MSG, byteArray);
                            break;
                        }
                        break;
                    case 2028:
                    case 2031:
                        bundle2 = bundle;
                        break;
                    case 2103:
                        bundle2.putString("EVT_MSG", "retry connecting stream server");
                        break;
                    case 3002:
                        bundle2.putString("EVT_MSG", "Failed to connect server");
                        break;
                    case 3003:
                        bundle2.putString("EVT_MSG", "RTMP handshake failed");
                        break;
                    case 3006:
                        bundle2.putString("EVT_MSG", "Write data error");
                        break;
                    case 3007:
                        bundle2.putString("EVT_MSG", "Read data error");
                        break;
                    case 3010:
                        bundle2.putString("EVT_MSG", "No video at this stream address");
                        break;
                    default:
                        bundle2.putString("EVT_MSG", "UNKNOWN event = " + i);
                        break;
                }
                String string = bundle != null ? bundle.getString("EVT_MSG", "") : "";
                if (string != null && !string.isEmpty()) {
                    bundle2.putString("EVT_MSG", string);
                }
                bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle2.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                this.mNotifyListener.onNotifyEvent(i, bundle2);
                if (i == 3001 || i == 3002 || i == 3003 || i == 3004 || i == 3005 || i == 3006 || i == 3007 || i == 3008 || i == 3009 || i == 3010 || i == 2101 || i == 2102 || i == 2109 || i == 2110 || i == -2301 || i == -2304 || i == -2308 || i == -2309) {
                    setStatusValue(7105, Integer.valueOf(i));
                    if (bundle2 != null) {
                        setStatusValue(7106, bundle2.getString("EVT_MSG"));
                    }
                }
            }
        }
        if (i == 2001) {
            reportNetStatusInternal();
        }
    }

    private void tryResetRetryCount() {
        if (this.mDownloader != null) {
            this.mDownloader.connectRetryTimes = 0;
        }
    }

    @Override // com.tencent.liteav.network.h
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
        tryResetRetryCount();
        synchronized (this.mListenerLock) {
            if (this.mListener != null) {
                this.mListener.onPullAudio(aVar);
            }
            if (this.mDownloader != null) {
                this.mDownloader.PushAudioFrame(aVar.audioData, aVar.audioType, aVar.timestamp, aVar.codecFormat);
            }
        }
    }

    @Override // com.tencent.liteav.network.h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        tryResetRetryCount();
        if (!this.mRecvFirstNal) {
            reportNetStatusInternal();
            this.mRecvFirstNal = true;
        }
        synchronized (this.mListenerLock) {
            this.mCurrentNalTs = tXSNALPacket.pts;
            if (tXSNALPacket.nalType == 0) {
                this.mLastIFramelTs = tXSNALPacket.pts;
            }
            if (this.mListener != null) {
                this.mListener.onPullNAL(tXSNALPacket);
            }
            if (this.mDownloader != null) {
                this.mDownloader.PushVideoFrame(tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.dts, tXSNALPacket.pts, tXSNALPacket.codecId);
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.a
    public void onRestartDownloader() {
        if (this.mHandler != null) {
            this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamDownloader.this.stop();
                    TXCStreamDownloader.this.start(TXCStreamDownloader.this.mOriginPlayUrl, TXCStreamDownloader.this.mEnableNearestIP, TXCStreamDownloader.this.mChannelType, TXCStreamDownloader.this.mEnableMessage, TXCStreamDownloader.this.mEnableMetaData);
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.a
    public void onOldStreamStop() {
        synchronized (this.mListenerLock) {
            if (this.mStreamSwitcher != null) {
                this.mStreamSwitcher.b();
            }
        }
    }

    public void setListener(h hVar) {
        synchronized (this.mListenerLock) {
            this.mListener = hVar;
        }
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        synchronized (this.mListenerLock) {
            this.mNotifyListener = bVar;
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        if (this.mDownloader != null) {
            this.mDownloader.setUserID(str);
        }
    }

    @Override // com.tencent.liteav.network.d.a
    public void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z) {
        synchronized (this.mListenerLock) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.mSwitchStartTime);
            this.mSwitchStartTime = 0L;
            Bundle bundle = new Bundle();
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            if (z) {
                this.mDownloader = tXIStreamDownloader;
                this.mDownloader.setListener(this);
                this.mDownloader.setNotifyListener(this);
                this.mDownloader.setRestartListener(this);
                bundle.putInt(TXCAVRoomConstants.EVT_ID, 2015);
                bundle.putCharSequence("EVT_MSG", "Switched resolution successfully");
                if (this.mNotifyListener != null) {
                    this.mNotifyListener.onNotifyEvent(2015, bundle);
                }
                TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.bx, currentTimeMillis, "");
            } else {
                bundle.putInt(TXCAVRoomConstants.EVT_ID, -2307);
                bundle.putCharSequence("EVT_MSG", "Failed to switch resolution");
                if (this.mNotifyListener != null) {
                    this.mNotifyListener.onNotifyEvent(-2307, bundle);
                }
                TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.by);
            }
            this.mStreamSwitcher = null;
        }
    }

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    public TXCStreamDownloader(Context context, int i) {
        this.mDownloader = null;
        this.mDownloadFormat = 1;
        this.mHandler = null;
        if (i == 0) {
            this.mDownloader = new TXCFLVDownloader(context);
            this.mDownloader.setFlvSessionKey(this.mFlvSessionKey);
        } else if (i == 1 || i == 4) {
            this.mDownloader = new TXCRTMPDownloader(context);
        }
        if (this.mDownloader != null) {
            this.mDownloader.setListener(this);
            this.mDownloader.setNotifyListener(this);
            this.mDownloader.setRestartListener(this);
        }
        this.mDownloadFormat = i;
        this.mAccUrlFetcher = new k(context);
        this.mApplicationContext = context;
        if (this.mApplicationContext != null) {
            this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        }
    }

    public void setRetryTimes(int i) {
        if (this.mDownloader != null) {
            this.mDownloader.connectRetryLimit = i;
        }
    }

    public void setRetryInterval(int i) {
        if (this.mDownloader != null) {
            this.mDownloader.connectRetryInterval = i;
        }
    }

    public int start(final String str, boolean z, int i, final boolean z2, final boolean z3) {
        TXCLog.i(TAG, "start url:" + str + ",enableNearestIP:" + z + ",channeyType:" + i + ",enableMessage:" + z2 + ",enableMetaData:" + z3);
        this.mDownloaderRunning = true;
        this.mRecvFirstNal = false;
        this.mOriginPlayUrl = str;
        this.mEnableNearestIP = z;
        this.mChannelType = i;
        this.mEnableMessage = z2;
        this.mEnableMetaData = z3;
        setStatusValue(7113, 0L);
        setStatusValue(7114, 0L);
        setStatusValue(7115, 0L);
        if (str.startsWith("room")) {
            setStatusValue(7113, 1L);
            setStatusValue(7112, 2L);
            if (this.mDownloader != null) {
                Vector<e> vector = new Vector<>();
                vector.add(new e(str, true));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.setUserID(getID());
                this.mDownloader.startDownload(vector, false, false, z2, z3);
            }
            if (this.mHandler != null) {
                this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
            return 0;
        } else if (z && this.mDownloadFormat == 4) {
            int a2 = this.mAccUrlFetcher.a(str, i, new k.a() { // from class: com.tencent.liteav.network.TXCStreamDownloader.2
                @Override // com.tencent.liteav.network.k.a
                public void a(int i2, String str2, Vector<e> vector2) {
                    if (i2 == 0 && vector2 != null && !vector2.isEmpty()) {
                        if (TXCStreamDownloader.this.mDownloaderRunning) {
                            if (TXCStreamDownloader.this.mDownloader != null) {
                                int i3 = 0;
                                Iterator<e> it = vector2.iterator();
                                while (it.hasNext()) {
                                    e next = it.next();
                                    if (next != null && next.b && next.a != null && next.a.length() > 0) {
                                        i3++;
                                    }
                                }
                                TXCStreamDownloader.this.setStatusValue(7113, Long.valueOf(i3));
                                TXCStreamDownloader.this.setStatusValue(7112, 2L);
                                TXCStreamDownloader.this.mDownloader.setOriginUrl(str);
                                TXCStreamDownloader.this.mDownloader.startDownload(vector2, true, true, z2, z3);
                            }
                            if (TXCStreamDownloader.this.mHandler != null) {
                                TXCStreamDownloader.this.mHandler.postDelayed(TXCStreamDownloader.this.mReportNetStatusRunnalbe, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                            }
                            TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, i2, TXCStreamDownloader.this.mAccUrlFetcher.b());
                            return;
                        }
                        TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, -4, "livePlayer have been stopped");
                        return;
                    }
                    TXCStreamDownloader.this.onNotifyEvent(-2302, null);
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, i2, str2);
                    TXCLog.e(TXCStreamDownloader.TAG, "getAccelerateStreamPlayUrl failed, play stream with raw url");
                    if (TXCStreamDownloader.this.mDownloaderRunning) {
                        TXCStreamDownloader.this.onNotifyEvent(-2301, null);
                    }
                }
            });
            if (a2 != 0) {
                if (a2 == -1) {
                    TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, a2, "invalid playUrl");
                } else if (a2 == -2) {
                    TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, a2, "invalid streamID");
                } else if (a2 == -3) {
                    TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.au, a2, "invalid signature");
                }
                TXCLog.e(TAG, "getAccelerateStreamPlayUrl failed, result = " + a2 + ", play stream with raw url");
                onNotifyEvent(-2302, null);
                onNotifyEvent(-2301, null);
            }
            return 0;
        } else {
            if (this.mDownloader != null) {
                setStatusValue(7112, 1L);
                Vector<e> vector2 = new Vector<>();
                vector2.add(new e(str, false));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.startDownload(vector2, this.mDownloadFormat == 4, z, z2, z3);
                if (this.mHandler != null) {
                    this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }
            return 0;
        }
    }

    private void playStreamWithRawUrl(String str, boolean z) {
        if (this.mDownloader != null) {
            if (str != null && ((str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS)) && str.contains(".flv"))) {
                int i = this.mDownloader.connectRetryLimit;
                int i2 = this.mDownloader.connectRetryInterval;
                this.mDownloader = null;
                this.mDownloader = new TXCFLVDownloader(this.mApplicationContext);
                this.mDownloader.setFlvSessionKey(this.mFlvSessionKey);
                this.mDownloader.setListener(this);
                this.mDownloader.setNotifyListener(this);
                this.mDownloader.setRestartListener(this);
                this.mDownloader.connectRetryLimit = i;
                this.mDownloader.connectRetryInterval = i2;
                this.mDownloader.setHeaders(this.mHeaders);
                this.mDownloader.setUserID(getID());
            }
            setStatusValue(7112, 1L);
            Vector<e> vector = new Vector<>();
            vector.add(new e(str, false));
            this.mDownloader.setOriginUrl(str);
            this.mDownloader.startDownload(vector, false, false, z, z);
        }
    }

    public void stop() {
        this.mDownloaderRunning = false;
        this.mRecvFirstNal = false;
        if (this.mDownloader != null) {
            this.mDownloader.stopDownload();
        }
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mReportNetStatusRunnalbe);
        }
        synchronized (this.mListenerLock) {
            if (this.mStreamSwitcher != null) {
                this.mStreamSwitcher.a((h) null);
                this.mStreamSwitcher.a();
                this.mStreamSwitcher = null;
            }
        }
    }

    public boolean switchStream(String str) {
        synchronized (this.mListenerLock) {
            if (this.mStreamSwitcher == null && this.mDownloader != null && (this.mDownloader instanceof TXCFLVDownloader)) {
                TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext, (TXCFLVDownloader) this.mDownloader);
                tXCFLVDownloader.connectRetryLimit = this.mDownloader.connectRetryLimit;
                tXCFLVDownloader.connectRetryInterval = this.mDownloader.connectRetryInterval;
                tXCFLVDownloader.setHeaders(this.mHeaders);
                tXCFLVDownloader.setUserID(getID());
                tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                this.mStreamSwitcher = new d(this);
                this.mStreamSwitcher.a(this);
                this.mStreamSwitcher.a(this.mDownloader, tXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, str);
                this.mSwitchStartTime = System.currentTimeMillis();
                return true;
            }
            TXCLog.w(TAG, "stream_switch stream is changing ignore this change");
            return false;
        }
    }

    public void requestKeyFrame(String str) {
        if (!this.mDownloaderRunning || str == null || !str.startsWith("room") || this.mDownloader == null) {
            return;
        }
        this.mDownloader.requestKeyFrame(str);
    }

    private DownloadStats getDownloadStats() {
        if (this.mDownloader != null) {
            return this.mDownloader.getDownloadStats();
        }
        return null;
    }

    private a getRealTimeStreamInfo() {
        a aVar;
        if (this.mAccUrlFetcher == null || TextUtils.isEmpty(this.mAccUrlFetcher.a())) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.b = this.mAccUrlFetcher.a();
            aVar.c = this.mAccUrlFetcher.b();
            aVar.d = this.mAccUrlFetcher.c();
            aVar.e = this.mAccUrlFetcher.d();
        }
        if (this.mDownloader != null && aVar != null) {
            aVar.a = this.mDownloader.getCurrentStreamUrl();
            aVar.f = this.mDownloader.isQuicChannel();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        reportNetStatusInternal();
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    private void reportNetStatusInternal() {
        long j;
        long j2;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j3 = timeTick - this.mLastTimeStamp;
        DownloadStats downloadStats = getDownloadStats();
        a realTimeStreamInfo = getRealTimeStreamInfo();
        if (downloadStats != null) {
            if (this.mLastDownloadStats != null) {
                j2 = getSpeed(this.mLastDownloadStats.afterParseVideoBytes, downloadStats.afterParseVideoBytes, j3).longValue();
                j = getSpeed(this.mLastDownloadStats.afterParseAudioBytes, downloadStats.afterParseAudioBytes, j3).longValue();
            } else {
                j = 0;
                j2 = 0;
            }
            if (j2 > 0 || j > 0) {
                this.mDownloader.connectRetryTimes = 0;
            }
            setStatusValue(AddressBean.POI_ERROR_ADDRESS, Long.valueOf(j2));
            setStatusValue(AddressBean.ABNORMAL_HOUSE_ADDRESS, Long.valueOf(j));
            setStatusValue(AddressBean.INVALID_CABINET_ADDRESS, Long.valueOf(downloadStats.firstVideoTS));
            setStatusValue(AddressBean.OTHER_ERROR_ADDRESS, Long.valueOf(downloadStats.firstAudioTS));
            setStatusValue(7120, Long.valueOf(downloadStats.videoGop));
            if (realTimeStreamInfo != null) {
                setStatusValue(7105, Long.valueOf(realTimeStreamInfo.d));
                setStatusValue(7106, realTimeStreamInfo.e);
                setStatusValue(7111, Long.valueOf(realTimeStreamInfo.f ? 2L : 1L));
                setStatusValue(7116, realTimeStreamInfo.a);
                setStatusValue(7117, realTimeStreamInfo.b);
                setStatusValue(7118, realTimeStreamInfo.c);
            } else {
                setStatusValue(7105, Long.valueOf(downloadStats.errorCode));
                setStatusValue(7106, downloadStats.errorInfo);
                setStatusValue(7111, 1L);
            }
            setStatusValue(7107, Long.valueOf(downloadStats.startTS));
            setStatusValue(7108, Long.valueOf(downloadStats.dnsTS));
            setStatusValue(7109, Long.valueOf(downloadStats.connTS));
            setStatusValue(7110, String.valueOf(downloadStats.serverIP));
        }
        if (this.mDownloader != null) {
            int connectCountQuic = this.mDownloader.getConnectCountQuic();
            int connectCountTcp = this.mDownloader.getConnectCountTcp();
            setStatusValue(7114, Long.valueOf(connectCountQuic + 1));
            setStatusValue(7115, Long.valueOf(connectCountTcp + 1));
            setStatusValue(7119, this.mDownloader.getRealStreamUrl());
            setStatusValue(7121, String.valueOf(this.mDownloader.getFlvSessionKey()));
        }
        this.mLastTimeStamp = timeTick;
        this.mLastDownloadStats = downloadStats;
    }

    private Long getSpeed(long j, long j2, long j3) {
        if (j <= j2) {
            j2 -= j;
        }
        return Long.valueOf(j3 > 0 ? ((j2 * 8) * 1000) / (j3 * 1024) : 0L);
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        if (this.mDownloader != null) {
            this.mDownloader.setHeaders(this.mHeaders);
        }
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
        if (this.mDownloader != null) {
            this.mDownloader.setFlvSessionKey(str);
        }
    }

    public String getRTMPProxyUserId() {
        return nativeGetRTMPProxyUserId();
    }
}
