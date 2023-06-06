package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCRTMPDownloader extends TXIStreamDownloader {
    private final int MSG_EVENT;
    private final int MSG_RECONNECT;
    private final String TAG;
    private int mConnectCountQuic;
    private int mConnectCountTcp;
    private a mCurrentThread;
    private boolean mEnableNearestIP;
    private Handler mHandler;
    private boolean mHasTcpPlayUrl;
    private boolean mIsPlayRtmpAccStream;
    private int mLastNetworkType;
    private String mPlayUrl;
    private boolean mQuicChannel;
    private Object mRTMPThreadLock;
    private String mServerIp;
    private HandlerThread mThread;
    private Vector<e> mVecPlayUrls;

    /* JADX INFO: Access modifiers changed from: private */
    public native TXCStreamDownloader.DownloadStats nativeGetStats(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpHandler(String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStart(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStop(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpHandler(long j);

    public TXCRTMPDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCRTMPDownloader";
        this.MSG_RECONNECT = 101;
        this.MSG_EVENT = 102;
        this.mPlayUrl = "";
        this.mQuicChannel = false;
        this.mServerIp = "";
        this.mCurrentThread = null;
        this.mRTMPThreadLock = null;
        this.mThread = null;
        this.mHandler = null;
        this.mIsPlayRtmpAccStream = false;
        this.mEnableNearestIP = false;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mLastNetworkType = 0;
        this.mRTMPThreadLock = new Object();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Thread {
        private long b;
        private String c;
        private boolean d;

        a(String str, boolean z) {
            super("RTMPDownLoad");
            this.b = 0L;
            this.c = str;
            this.d = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this) {
                this.b = TXCRTMPDownloader.this.nativeInitRtmpHandler(TXCRTMPDownloader.this.mUserID, TXCRTMPDownloader.this.mOriginUrl, this.c, this.d, TXCRTMPDownloader.this.mEnableMessage, TXCRTMPDownloader.this.mEnableMetaData);
            }
            TXCRTMPDownloader.this.nativeStart(this.b);
            synchronized (this) {
                TXCRTMPDownloader.this.nativeUninitRtmpHandler(this.b);
                this.b = 0L;
            }
        }

        public void a() {
            synchronized (this) {
                if (this.b != 0) {
                    TXCRTMPDownloader.this.nativeStop(this.b);
                }
            }
        }

        public TXCStreamDownloader.DownloadStats b() {
            TXCStreamDownloader.DownloadStats nativeGetStats;
            synchronized (this) {
                nativeGetStats = this.b != 0 ? TXCRTMPDownloader.this.nativeGetStats(this.b) : null;
            }
            return nativeGetStats;
        }

        public void a(String str) {
            synchronized (this) {
                if (this.b != 0) {
                    TXCRTMPDownloader.this.nativeRequestKeyFrame(this.b, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (this.mQuicChannel) {
            this.mConnectCountQuic++;
        } else {
            this.mConnectCountTcp++;
        }
        synchronized (this.mRTMPThreadLock) {
            this.mCurrentThread = new a(this.mPlayUrl, this.mQuicChannel);
            this.mCurrentThread.start();
        }
    }

    private void postReconnectMsg() {
        Message message = new Message();
        message.what = 101;
        if (this.mHandler != null) {
            this.mHandler.sendMessageDelayed(message, this.connectRetryInterval * 1000);
        }
    }

    private void reconnect(final boolean z) {
        synchronized (this.mRTMPThreadLock) {
            if (this.mCurrentThread != null) {
                this.mCurrentThread.a();
                this.mCurrentThread = null;
            }
        }
        if (this.mHandler != null) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCRTMPDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCRTMPDownloader.this.internalReconnect(z);
                }
            }, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z) {
        if (this.mIsRunning) {
            if (this.mIsPlayRtmpAccStream && this.mLastNetworkType != com.tencent.liteav.basic.util.g.e(this.mApplicationContext)) {
                this.mLastNetworkType = com.tencent.liteav.basic.util.g.e(this.mApplicationContext);
                if (this.mRestartListener != null) {
                    this.mRestartListener.onRestartDownloader();
                    return;
                }
                return;
            }
            boolean z2 = this.mQuicChannel;
            if (this.mIsPlayRtmpAccStream) {
                if (!this.mEnableNearestIP) {
                    z = false;
                }
                if (z2) {
                    z = true;
                }
                if (z && this.mVecPlayUrls != null && !this.mVecPlayUrls.isEmpty()) {
                    e eVar = this.mVecPlayUrls.get(0);
                    this.mVecPlayUrls.remove(0);
                    this.mPlayUrl = eVar.a;
                    this.mQuicChannel = eVar.b;
                }
            }
            if (z2 && this.mHasTcpPlayUrl) {
                sendNotifyEvent(2103);
                startInternal();
            } else if (this.connectRetryTimes < this.connectRetryLimit) {
                this.connectRetryTimes++;
                TXCLog.i("network.TXCRTMPDownloader", "reconnect retry count:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
                sendNotifyEvent(2103);
                startInternal();
            } else {
                TXCLog.e("network.TXCRTMPDownloader", "reconnect all times retried, send failed event ");
                sendNotifyEvent(-2301);
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i, String str) {
        if (str.isEmpty()) {
            sendNotifyEvent(i);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EVT_MSG", str);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        if (this.mNotifyListener != null) {
            this.mNotifyListener.onNotifyEvent(i, bundle);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i) {
        if (i == 0 || i == 1) {
            reconnect(i == 1);
        } else {
            super.sendNotifyEvent(i);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<e> vector, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z3;
        this.mEnableMetaData = z4;
        this.mIsPlayRtmpAccStream = z;
        this.mEnableNearestIP = z2;
        this.mVecPlayUrls = vector;
        this.mHasTcpPlayUrl = false;
        int i = 0;
        while (true) {
            if (i >= this.mVecPlayUrls.size()) {
                break;
            } else if (!this.mVecPlayUrls.elementAt(i).b) {
                this.mHasTcpPlayUrl = true;
                break;
            } else {
                i++;
            }
        }
        e eVar = this.mVecPlayUrls.get(0);
        this.mVecPlayUrls.remove(0);
        this.mPlayUrl = eVar.a;
        this.mQuicChannel = eVar.b;
        this.mIsRunning = true;
        StringBuilder sb = new StringBuilder("start pull with url:");
        sb.append(this.mPlayUrl);
        sb.append(" quic:");
        sb.append(this.mQuicChannel ? "yes" : "no");
        TXCLog.i("network.TXCRTMPDownloader", sb.toString());
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.connectRetryTimes = 0;
        if (this.mThread == null) {
            this.mThread = new HandlerThread("RTMP_PULL");
            this.mThread.start();
        }
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.tencent.liteav.network.TXCRTMPDownloader.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 101) {
                    TXCRTMPDownloader.this.startInternal();
                }
            }
        };
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            this.mVecPlayUrls.removeAllElements();
            this.mVecPlayUrls = null;
            this.mIsPlayRtmpAccStream = false;
            this.mEnableNearestIP = false;
            TXCLog.i("network.TXCRTMPDownloader", "stop pull");
            synchronized (this.mRTMPThreadLock) {
                if (this.mCurrentThread != null) {
                    this.mCurrentThread.a();
                    this.mCurrentThread = null;
                }
            }
            if (this.mThread != null) {
                this.mThread.quit();
                this.mThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        synchronized (this.mRTMPThreadLock) {
            if (this.mCurrentThread != null) {
                return this.mCurrentThread.b();
            }
            return null;
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getCurrentStreamUrl() {
        return this.mPlayUrl;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public boolean isQuicChannel() {
        return this.mQuicChannel;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountQuic() {
        return this.mConnectCountQuic;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountTcp() {
        return this.mConnectCountTcp;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void requestKeyFrame(String str) {
        synchronized (this.mRTMPThreadLock) {
            if (this.mCurrentThread != null) {
                this.mCurrentThread.a(str);
            }
        }
    }
}
