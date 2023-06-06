package com.tencent.liteav.avprotocol;

import com.tencent.liteav.basic.d.c;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.a;
import com.tencent.liteav.basic.util.g;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCAVProtocol {
    public static byte AV_STATE_ENTER_AUDIO = 1;
    public static byte AV_STATE_ENTER_VIDEO = 3;
    public static byte AV_STATE_EXIT_AUDIO = 2;
    public static byte AV_STATE_EXIT_VIDEO = 4;
    public static byte AV_STATE_NONE = 0;
    private static final String TAG = "TXCAVProtocol";
    private long mInstance;
    private TXIAVListener mListener = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXIAVCompletionCallback {
        void onComplete(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXIAVListener {
        void onMemberChange(long j, boolean z);

        void onPullAudio(TXSAVProtoAudioPacket tXSAVProtoAudioPacket);

        void onPullNAL(TXSAVProtoNALPacket tXSAVProtoNALPacket);

        void onVideoStateChange(long j, boolean z);

        void sendNotifyEvent(int i, String str);
    }

    private native void nativeChangeAVState(long j, TXIAVCompletionCallback tXIAVCompletionCallback, byte b);

    private native void nativeEnterRoom(long j, TXIAVCompletionCallback tXIAVCompletionCallback, long j2, long j3, long j4, long j5, byte[] bArr, long j6, int i);

    private native void nativeExitRoom(long j, TXIAVCompletionCallback tXIAVCompletionCallback);

    private native DownloadStats nativeGetDownloadStats(long j);

    private native long[] nativeGetRoomMemberList(long j);

    private native long[] nativeGetRoomVideoList(long j);

    private native UploadStats nativeGetUploadStats(long j);

    private native long nativeInitAVProtocol();

    private native void nativePushAAC(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2);

    private native void nativePushNAL(long j, byte[] bArr, int i, long j2, long j3, long j4, long j5, long j6, long j7);

    private native void nativeRequestViews(long j, TXIAVCompletionCallback tXIAVCompletionCallback, long[] jArr, int[] iArr, int[] iArr2);

    private native void nativeUninitAVProtocol(long j);

    public native String nativeNAT64Compatable(String str, short s);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class UploadStats {
        public long audioCacheLen;
        public long audioDropCount;
        public long channelType;
        public long connTS;
        public long dnsTS;
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
    public class DownloadStats {
        public long afterParseAudioBytes;
        public long afterParseVideoBytes;
        public long beforeParseAudioBytes;
        public long beforeParseVideoBytes;
        public long connTS;
        public long dnsTS;
        public long firstAudioTS;
        public long firstVideoTS;
        public String serverIP;
        public long startTS;

        public DownloadStats() {
        }
    }

    static {
        g.f();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class TXSAVProtoAudioPacket extends a {
        public int roomID;
        public long tinyID;

        public TXSAVProtoAudioPacket() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class TXSAVProtoNALPacket extends TXSNALPacket {
        public int roomID;
        public long tinyID;

        public TXSAVProtoNALPacket() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class TXCAVProtoParam {
        public int authBits;
        public byte[] authBuffer;
        public long roomID;
        public int sdkAppid;
        public int sdkVersion;
        public long userID;

        public TXCAVProtoParam() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class TXSAVRoomView {
        public int height;
        public long tinyID;
        public int width;

        public TXSAVRoomView() {
        }
    }

    public TXCAVProtocol() {
        this.mInstance = 0L;
        this.mInstance = nativeInitAVProtocol();
    }

    public void destory() {
        if (this.mInstance == 0) {
            return;
        }
        nativeUninitAVProtocol(this.mInstance);
        this.mInstance = 0L;
    }

    public void setListener(TXIAVListener tXIAVListener) {
        this.mListener = tXIAVListener;
    }

    public void enterRoom(TXCAVProtoParam tXCAVProtoParam, TXIAVCompletionCallback tXIAVCompletionCallback) {
        if (this.mInstance == 0) {
            return;
        }
        nativeEnterRoom(this.mInstance, tXIAVCompletionCallback, tXCAVProtoParam.sdkAppid, tXCAVProtoParam.sdkVersion, tXCAVProtoParam.roomID, tXCAVProtoParam.authBits, tXCAVProtoParam.authBuffer, tXCAVProtoParam.userID, (int) c.a().a("QUICMode", "AVRoom"));
    }

    public void exitRoom(final TXIAVCompletionCallback tXIAVCompletionCallback) {
        if (this.mInstance == 0) {
            return;
        }
        nativeExitRoom(this.mInstance, new TXIAVCompletionCallback() { // from class: com.tencent.liteav.avprotocol.TXCAVProtocol.1
            @Override // com.tencent.liteav.avprotocol.TXCAVProtocol.TXIAVCompletionCallback
            public void onComplete(int i) {
                tXIAVCompletionCallback.onComplete(i);
            }
        });
    }

    public void changeAVState(byte b, TXIAVCompletionCallback tXIAVCompletionCallback) {
        if (this.mInstance == 0) {
            return;
        }
        nativeChangeAVState(this.mInstance, tXIAVCompletionCallback, b);
    }

    public void requestViews(ArrayList<TXSAVRoomView> arrayList, TXIAVCompletionCallback tXIAVCompletionCallback) {
        if (this.mInstance == 0) {
            return;
        }
        long[] jArr = new long[arrayList.size()];
        int[] iArr = new int[arrayList.size()];
        int[] iArr2 = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = arrayList.get(i).tinyID;
            iArr[i] = arrayList.get(i).width;
            iArr2[i] = arrayList.get(i).height;
        }
        nativeRequestViews(this.mInstance, tXIAVCompletionCallback, jArr, iArr, iArr2);
    }

    public void pushAAC(byte[] bArr, long j, int i, int i2) {
        if (this.mInstance == 0) {
            return;
        }
        nativePushAAC(this.mInstance, bArr, i, i2, 16, 3, j);
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        if (this.mInstance == 0) {
            return;
        }
        nativePushNAL(this.mInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.gopIndex, tXSNALPacket.gopFrameIndex, tXSNALPacket.frameIndex, tXSNALPacket.refFremeIndex, tXSNALPacket.pts, tXSNALPacket.dts);
    }

    private void onPullAudio(int i, long j, byte[] bArr, long j2, int i2, int i3, int i4, int i5) {
        if (this.mListener != null) {
            TXSAVProtoAudioPacket tXSAVProtoAudioPacket = new TXSAVProtoAudioPacket();
            tXSAVProtoAudioPacket.roomID = i;
            tXSAVProtoAudioPacket.tinyID = j;
            tXSAVProtoAudioPacket.audioData = bArr;
            tXSAVProtoAudioPacket.timestamp = j2;
            tXSAVProtoAudioPacket.sampleRate = i2;
            tXSAVProtoAudioPacket.channelsPerSample = i3;
            tXSAVProtoAudioPacket.bitsPerChannel = i4;
            tXSAVProtoAudioPacket.packetType = i5;
            this.mListener.onPullAudio(tXSAVProtoAudioPacket);
        }
    }

    private void onPullVideo(int i, long j, byte[] bArr, int i2, long j2, long j3, int i3, int i4, int i5, int i6) {
        if (this.mListener != null) {
            TXSAVProtoNALPacket tXSAVProtoNALPacket = new TXSAVProtoNALPacket();
            tXSAVProtoNALPacket.roomID = i;
            tXSAVProtoNALPacket.tinyID = j;
            tXSAVProtoNALPacket.nalType = i2;
            tXSAVProtoNALPacket.nalData = bArr;
            tXSAVProtoNALPacket.pts = j2;
            tXSAVProtoNALPacket.dts = j3;
            tXSAVProtoNALPacket.gopIndex = i3;
            tXSAVProtoNALPacket.gopFrameIndex = i4;
            tXSAVProtoNALPacket.frameIndex = i5;
            tXSAVProtoNALPacket.refFremeIndex = i6;
            this.mListener.onPullNAL(tXSAVProtoNALPacket);
        }
    }

    private void onMemberChange(long j, boolean z) {
        this.mListener.onMemberChange(j, z);
    }

    private void onVideoStateChange(long j, boolean z) {
        this.mListener.onVideoStateChange(j, z);
    }

    private void sendNotifyEvent(int i, String str) {
        new StringBuilder("event").append(i);
        this.mListener.sendNotifyEvent(i, str);
    }

    public long[] getRoomMemberList() {
        if (this.mInstance == 0) {
            return null;
        }
        return nativeGetRoomMemberList(this.mInstance);
    }

    public long[] getRoomVideoList() {
        if (this.mInstance == 0) {
            return null;
        }
        return nativeGetRoomVideoList(this.mInstance);
    }

    public UploadStats getUploadStats() {
        if (this.mInstance != 0) {
            return nativeGetUploadStats(this.mInstance);
        }
        return null;
    }

    public DownloadStats getDownloadStats() {
        if (this.mInstance != 0) {
            return nativeGetDownloadStats(this.mInstance);
        }
        return null;
    }
}
