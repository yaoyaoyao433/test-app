package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import java.util.Vector;
import javax.net.ssl.SSLException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCFLVDownloader extends TXIStreamDownloader {
    private final int CONNECT_TIMEOUT;
    private final int FLV_HEAD_SIZE;
    private final int MAX_FRAME_SIZE;
    private final int MSG_CONNECT;
    private final int MSG_DISCONNECT;
    private final int MSG_QUIT;
    private final int MSG_RECONNECT;
    private final int MSG_RECV_DATA;
    private final int MSG_RESUME;
    private final int MSG_SEEK;
    private final int READ_STREAM_SIZE;
    public final String TAG;
    private HttpURLConnection mConnection;
    private long mContentLength;
    private long mCurrentNalTs;
    private long mDownloadedSize;
    private long mFLVParser;
    private Handler mFlvHandler;
    private HandlerThread mFlvThread;
    private boolean mHandleDataInJava;
    private boolean mHasReceivedFirstAudio;
    private boolean mHasReceivedFirstVideo;
    private InputStream mInputStream;
    private long mLastIFramelTs;
    private byte[] mPacketBytes;
    private String mPlayUrl;
    private boolean mRecvData;
    private WeakReference<TXCFLVDownloader> mRefFLVDownloader;
    private TXCStreamDownloader.DownloadStats mStats;
    private boolean mStopJitter;

    private native void nativeCleanData(long j);

    private native int nativeGetAudioBytes(long j);

    private native int nativeGetVideoBytes(long j);

    private native int nativeGetVideoGop(long j);

    private native long nativeInitFlvHander(String str, int i, boolean z, boolean z2);

    private native long nativeInitFlvHanderByRef(long j);

    private native int nativeParseData(long j, byte[] bArr, int i);

    private native void nativeUninitFlvhander(long j, boolean z);

    public native void nativePushAudioFrame(long j, byte[] bArr, int i, long j2, int i2);

    public native void nativePushVideoFrame(long j, byte[] bArr, int i, long j2, long j3, int i2);

    public TXCFLVDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = 8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        this.mRefFLVDownloader = null;
        this.mStats = new TXCStreamDownloader.DownloadStats();
        this.mStats.afterParseAudioBytes = 0L;
        this.mStats.dnsTS = 0L;
        this.mStats.startTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "new flv download " + this);
    }

    public TXCFLVDownloader(Context context, TXCFLVDownloader tXCFLVDownloader) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = 8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        this.mRefFLVDownloader = null;
        this.mStats = new TXCStreamDownloader.DownloadStats();
        this.mStats.afterParseAudioBytes = 0L;
        this.mStats.dnsTS = 0L;
        this.mStats.startTS = TXCTimeUtil.getTimeTick();
        this.mRefFLVDownloader = new WeakReference<>(tXCFLVDownloader);
        TXCLog.i("network.TXCFLVDownloader", "new multi flv download " + this);
    }

    public void recvData(boolean z) {
        this.mHandleDataInJava = z;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushVideoFrame(byte[] bArr, int i, long j, long j2, int i2) {
        nativePushVideoFrame(this.mFLVParser, bArr, i, j, j2, i2);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushAudioFrame(byte[] bArr, int i, long j, int i2) {
        nativePushAudioFrame(this.mFLVParser, bArr, i, j, i2);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getCurrentTS() {
        return this.mCurrentNalTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getLastIFrameTS() {
        return this.mLastIFramelTs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgConnect() {
        long j;
        try {
            connect();
            if (this.mFLVParser == 0) {
                if (this.mRefFLVDownloader != null) {
                    TXCFLVDownloader tXCFLVDownloader = this.mRefFLVDownloader.get();
                    if (tXCFLVDownloader != null) {
                        if (tXCFLVDownloader.mIsRunning) {
                            TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser with old downloader:" + tXCFLVDownloader.hashCode());
                            tXCFLVDownloader.mStopJitter = false;
                            j = tXCFLVDownloader.mFLVParser;
                            this.mRefFLVDownloader = null;
                        } else {
                            TXCLog.e("network.TXCFLVDownloader", "[Network]old downloader:" + tXCFLVDownloader.hashCode() + " isn't running now. just create new parser.");
                        }
                    }
                    j = 0;
                    this.mRefFLVDownloader = null;
                } else {
                    j = 0;
                }
                if (j != 0) {
                    TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser with reference parse:" + j);
                    this.mFLVParser = nativeInitFlvHanderByRef(j);
                } else {
                    TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser.");
                    this.mFLVParser = nativeInitFlvHander(this.mUserID, 0, this.mEnableMessage, this.mEnableMetaData);
                }
            }
            if (this.mFlvHandler != null) {
                this.mFlvHandler.sendEmptyMessage(101);
            }
        } catch (FileNotFoundException e) {
            TXCLog.e("network.TXCFLVDownloader", "file not found, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e.toString();
            e.printStackTrace();
            postReconnectMsg();
        } catch (Error e2) {
            TXCLog.e("network.TXCFLVDownloader", "error, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e2.toString();
            e2.printStackTrace();
            postReconnectMsg();
        } catch (SocketTimeoutException e3) {
            TXCLog.e("network.TXCFLVDownloader", "socket timeout, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e3.toString();
            postReconnectMsg();
        } catch (Exception e4) {
            TXCLog.e("network.TXCFLVDownloader", "exception, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e4.toString();
            e4.printStackTrace();
            postReconnectMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgRecvData() {
        if (this.mInputStream != null) {
            try {
                int i = 0;
                int read = this.mInputStream.read(this.mPacketBytes, 0, 1388);
                if (read > 0) {
                    long j = read;
                    this.mDownloadedSize += j;
                    if (!this.mRecvData) {
                        TXCLog.w("network.TXCFLVDownloader", "flv play receive first data " + this);
                        this.mRecvData = true;
                    }
                    if (this.mFLVParser != 0) {
                        this.mStats.beforeParseVideoBytes += j;
                        i = nativeParseData(this.mFLVParser, this.mPacketBytes, read);
                        this.mStats.afterParseVideoBytes = nativeGetVideoBytes(this.mFLVParser);
                        this.mStats.afterParseAudioBytes = nativeGetAudioBytes(this.mFLVParser);
                        this.mStats.videoGop = nativeGetVideoGop(this.mFLVParser);
                    }
                    if (i > 1048576) {
                        TXCLog.e("network.TXCFLVDownloader", "flv play parse frame: " + i + " > 1048576,start reconnect");
                        postReconnectMsg();
                        return;
                    }
                } else if (read < 0) {
                    TXCLog.w("network.TXCFLVDownloader", "http read: " + read + " < 0, start reconnect");
                    postReconnectMsg();
                    return;
                }
                if (this.mFlvHandler != null) {
                    this.mFlvHandler.sendEmptyMessage(101);
                }
            } catch (EOFException e) {
                TXCLog.w("network.TXCFLVDownloader", "eof exception start reconnect");
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e.toString();
                postReconnectMsg();
            } catch (Error e2) {
                TXCLog.e("network.TXCFLVDownloader", "error");
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e2.toString();
                e2.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            } catch (SocketException e3) {
                TXCLog.w("network.TXCFLVDownloader", "socket exception start reconnect");
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e3.toString();
                postReconnectMsg();
            } catch (SocketTimeoutException e4) {
                TXCLog.w("network.TXCFLVDownloader", "socket timeout start reconnect");
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e4.toString();
                postReconnectMsg();
            } catch (SSLException e5) {
                TXCLog.w("network.TXCFLVDownloader", "ssl exception start reconnect");
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e5.toString();
                postReconnectMsg();
            } catch (Exception e6) {
                TXCLog.e("network.TXCFLVDownloader", LogMonitor.EXCEPTION_TAG);
                this.mStats.errorCode = -1;
                this.mStats.errorInfo = e6.toString();
                e6.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgDisConnect() {
        try {
            disconnect();
        } catch (Exception e) {
            TXCLog.e("network.TXCFLVDownloader", "disconnect failed.", e);
        }
        if (this.mFLVParser != 0) {
            nativeUninitFlvhander(this.mFLVParser, this.mStopJitter);
            this.mFLVParser = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgReconnect() {
        if (this.mStopJitter) {
            reconnect();
            return;
        }
        TXCLog.i("network.TXCFLVDownloader", "ignore processMsgReconnect when start multi stream switch" + this);
        if (this.mRestartListener != null) {
            this.mRestartListener.onOldStreamStop();
        }
    }

    private void startInternal() {
        if (this.mFlvThread == null) {
            this.mFlvThread = new HandlerThread("FlvThread");
            this.mFlvThread.start();
        }
        if (this.mFlvHandler == null) {
            this.mFlvHandler = new Handler(this.mFlvThread.getLooper()) { // from class: com.tencent.liteav.network.TXCFLVDownloader.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i != 106) {
                        switch (i) {
                            case 100:
                                TXCFLVDownloader.this.processMsgConnect();
                                return;
                            case 101:
                                TXCFLVDownloader.this.processMsgRecvData();
                                return;
                            case 102:
                                TXCFLVDownloader.this.processMsgDisConnect();
                                return;
                            case 103:
                                TXCFLVDownloader.this.processMsgReconnect();
                                return;
                            default:
                                return;
                        }
                    }
                    try {
                        Looper.myLooper().quit();
                    } catch (Exception unused) {
                    }
                }
            };
        }
        postConnectMsg();
    }

    private void reconnect() {
        processMsgDisConnect();
        String str = "ServerIp:" + this.mStats.serverIP + ",errCode:" + this.mStats.errorCode + ",errInfo:" + this.mStats.errorInfo;
        TXCLog.i("network.TXCFLVDownloader", "reconnect:" + str);
        if (this.connectRetryTimes < this.connectRetryLimit) {
            this.connectRetryTimes++;
            TXCLog.i("network.TXCFLVDownloader", "reconnect retry time:" + this.connectRetryTimes + ", limit:" + this.connectRetryLimit);
            processMsgConnect();
            sendNotifyEvent(2103, str);
            return;
        }
        TXCLog.e("network.TXCFLVDownloader", "reconnect all times retried, send failed event ");
        sendNotifyEvent(-2301, str);
    }

    private void postReconnectMsg() {
        if (this.mFlvHandler != null) {
            this.mFlvHandler.sendEmptyMessageDelayed(103, this.connectRetryInterval * 1000);
        }
    }

    private void postDisconnectMsg() {
        if (this.mFlvHandler != null) {
            this.mFlvHandler.sendEmptyMessage(102);
        }
    }

    private void postConnectMsg() {
        this.mInputStream = null;
        if (this.mConnection != null) {
            this.mConnection.disconnect();
            this.mConnection = null;
        }
        Message message = new Message();
        message.what = 100;
        message.arg1 = 0;
        if (this.mFlvHandler != null) {
            this.mFlvHandler.sendMessage(message);
        }
    }

    private void connect() throws Exception {
        String headerField;
        if (this.mConnection != null) {
            this.mConnection.disconnect();
            this.mConnection = null;
        }
        this.mConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.mPlayUrl).openConnection());
        this.mStats.dnsTS = TXCTimeUtil.getTimeTick();
        this.mConnection.setConnectTimeout(8000);
        this.mConnection.setReadTimeout(8000);
        this.mConnection.setRequestProperty("Accept-Encoding", "identity");
        this.mConnection.setInstanceFollowRedirects(true);
        if (this.mHeaders != null) {
            for (Map.Entry<String, String> entry : this.mHeaders.entrySet()) {
                this.mConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.mConnection.connect();
        if (200 == this.mConnection.getResponseCode()) {
            this.mStats.connTS = TXCTimeUtil.getTimeTick();
        } else {
            this.mStats.errorCode = this.mConnection.getResponseCode();
        }
        this.mInputStream = this.mConnection.getInputStream();
        this.mPacketBytes = new byte[1388];
        this.mRecvData = false;
        this.mContentLength = this.mConnection.getContentLength();
        this.mDownloadedSize = 0L;
        this.mStats.serverIP = InetAddress.getByName(this.mConnection.getURL().getHost()).getHostAddress();
        String str = "connect server success,ServerIp:" + this.mStats.serverIP;
        TXCLog.i("network.TXCFLVDownloader", str);
        sendNotifyEvent(2001, str);
        this.mStats.flvSessionKey = this.mConnection.getHeaderField("X-Tlive-SpanId");
        if (TextUtils.isEmpty(this.mFlvSessionKey) || (headerField = this.mConnection.getHeaderField(this.mFlvSessionKey)) == null) {
            return;
        }
        TXCLog.i("network.TXCFLVDownloader", "receive flvSessionKey " + headerField);
        sendNotifyEvent(2031, headerField);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getRealStreamUrl() {
        if (this.mConnection != null) {
            return this.mConnection.getURL().toString();
        }
        return null;
    }

    private void disconnect() throws Exception {
        if (this.mConnection != null) {
            this.mConnection.disconnect();
            this.mConnection = null;
        }
        if (this.mInputStream != null) {
            this.mInputStream.close();
            this.mInputStream = null;
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        downloadStats.afterParseAudioBytes = this.mStats.afterParseAudioBytes;
        downloadStats.afterParseVideoBytes = this.mStats.afterParseVideoBytes;
        downloadStats.beforeParseVideoBytes = this.mStats.beforeParseVideoBytes;
        downloadStats.beforeParseAudioBytes = this.mStats.beforeParseAudioBytes;
        downloadStats.videoGop = this.mStats.videoGop;
        downloadStats.startTS = this.mStats.startTS;
        downloadStats.dnsTS = this.mStats.dnsTS;
        downloadStats.connTS = this.mStats.connTS;
        downloadStats.firstAudioTS = this.mStats.firstAudioTS;
        downloadStats.firstVideoTS = this.mStats.firstVideoTS;
        downloadStats.serverIP = this.mStats.serverIP;
        downloadStats.flvSessionKey = this.mStats.flvSessionKey;
        downloadStats.errorCode = this.mStats.errorCode;
        downloadStats.errorInfo = this.mStats.errorInfo;
        return downloadStats;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<e> vector, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z3;
        this.mEnableMetaData = z4;
        this.mIsRunning = true;
        this.mPlayUrl = vector.get(0).a;
        TXCLog.i("network.TXCFLVDownloader", "start pull with url " + this.mPlayUrl);
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            TXCLog.i("network.TXCFLVDownloader", "stop pull");
            try {
                if (this.mFlvHandler != null) {
                    this.mFlvHandler.removeCallbacksAndMessages(null);
                    this.mFlvHandler.sendEmptyMessage(102);
                    this.mFlvHandler.sendEmptyMessage(106);
                    this.mFlvHandler = null;
                }
            } catch (Exception e) {
                TXCLog.e("network.TXCFLVDownloader", "stop download failed.", e);
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvVideoData(byte[] bArr, int i, long j, long j2, int i2) {
        if (!this.mHasReceivedFirstVideo) {
            this.mHasReceivedFirstVideo = true;
            this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
            TXCLog.i("network.TXCFLVDownloader", "receive first video with ts " + this.mStats.firstVideoTS);
        }
        this.mStats.afterParseVideoBytes += bArr.length;
        super.onRecvVideoData(bArr, i, j, j2, i2);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvAudioData(byte[] bArr, int i, int i2, int i3) {
        if (!this.mHasReceivedFirstAudio) {
            this.mHasReceivedFirstAudio = true;
            this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
            TXCLog.i("network.TXCFLVDownloader", "receive first audio with ts " + this.mStats.firstAudioTS);
        }
        this.mStats.afterParseAudioBytes += bArr.length;
        super.onRecvAudioData(bArr, i, i2, i3);
    }

    private void onRecvFirstVideoData() {
        if (this.mHasReceivedFirstVideo) {
            return;
        }
        this.mHasReceivedFirstVideo = true;
        this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "onRecvData: receive first video with ts " + this.mStats.firstVideoTS);
    }

    private void onRecvFirstAudioData() {
        if (this.mHasReceivedFirstAudio) {
            return;
        }
        this.mHasReceivedFirstAudio = true;
        this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "onRecvData: receive first audio with ts " + this.mStats.firstAudioTS);
    }
}
