package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class TXIStreamDownloader {
    protected Context mApplicationContext;
    protected Map<String, String> mHeaders;
    protected h mListener = null;
    protected com.tencent.liteav.basic.c.b mNotifyListener = null;
    protected a mRestartListener = null;
    protected boolean mIsRunning = false;
    protected String mOriginUrl = "";
    public int connectRetryTimes = 0;
    public int connectRetryLimit = 3;
    public int connectRetryInterval = 3;
    protected boolean mEnableMessage = false;
    protected boolean mEnableMetaData = false;
    protected String mFlvSessionKey = "";
    protected String mUserID = "";

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onOldStreamStop();

        void onRestartDownloader();
    }

    public void PushAudioFrame(byte[] bArr, int i, long j, int i2) {
    }

    public void PushVideoFrame(byte[] bArr, int i, long j, long j2, int i2) {
    }

    public int getConnectCountQuic() {
        return 0;
    }

    public int getConnectCountTcp() {
        return 0;
    }

    public String getCurrentStreamUrl() {
        return null;
    }

    public long getCurrentTS() {
        return 0L;
    }

    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        return null;
    }

    public long getLastIFrameTS() {
        return 0L;
    }

    public String getRealStreamUrl() {
        return null;
    }

    public boolean isQuicChannel() {
        return false;
    }

    public void requestKeyFrame(String str) {
    }

    public abstract void startDownload(Vector<e> vector, boolean z, boolean z2, boolean z3, boolean z4);

    public abstract void stopDownload();

    public TXIStreamDownloader(Context context) {
        this.mApplicationContext = null;
        this.mApplicationContext = context;
    }

    public void setListener(h hVar) {
        this.mListener = hVar;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        this.mNotifyListener = bVar;
    }

    public void setRestartListener(a aVar) {
        this.mRestartListener = aVar;
    }

    public void sendNotifyEvent(int i) {
        if (this.mNotifyListener != null) {
            this.mNotifyListener.onNotifyEvent(i, null);
        }
    }

    public void sendNotifyEvent(int i, String str) {
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_MSG", str);
            this.mNotifyListener.onNotifyEvent(i, bundle);
        }
    }

    public void onRecvVideoData(byte[] bArr, int i, long j, long j2, int i2) {
        if (this.mListener != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i;
            tXSNALPacket.dts = j;
            tXSNALPacket.pts = j2;
            tXSNALPacket.codecId = i2;
            this.mListener.onPullNAL(tXSNALPacket);
        }
    }

    public void onRecvAudioData(byte[] bArr, int i, int i2, int i3) {
        if (this.mListener != null) {
            com.tencent.liteav.basic.structs.a aVar = new com.tencent.liteav.basic.structs.a();
            aVar.audioData = bArr;
            aVar.timestamp = i;
            if (i2 == 10) {
                if (i3 == 1) {
                    aVar.packetType = 2;
                } else {
                    aVar.packetType = 3;
                }
                if (aVar.packetType == 2) {
                    aVar.bitsPerChannel = 16;
                }
            }
            if (i2 == 2) {
                aVar.packetType = 5;
            }
            aVar.audioType = i2;
            aVar.codecFormat = i3;
            this.mListener.onPullAudio(aVar);
        }
    }

    public void onRecvSEIData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray(TXLiveConstants.EVT_GET_MSG, bArr);
        this.mNotifyListener.onNotifyEvent(2012, bundle);
    }

    public void onRecvMetaData(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("EVT_GET_METADATA", hashMap);
        this.mNotifyListener.onNotifyEvent(2028, bundle);
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }
}
