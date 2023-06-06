package io.agora.rtc.internal;

import io.agora.rtc.IMetadataObserver;
import io.agora.rtc.RtcChannel;
import io.agora.rtc.internal.RtcEngineMessage;
import io.agora.rtc.live.LiveInjectStreamConfig;
import io.agora.rtc.mediaio.AgoraDefaultRender;
import io.agora.rtc.mediaio.IVideoSink;
import io.agora.rtc.models.ChannelMediaOptions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class RtcChannelImpl extends RtcChannel {
    private long mNativeHandle = 0;
    private boolean mInitialized = false;
    private RtcEngineImpl mRtcEngineImpl = null;
    private boolean mJoined = false;

    private native int nativeRtcChannelAddInjectStreamUrl(long j, String str, byte[] bArr);

    private native int nativeRtcChannelAddPublishStreamUrl(long j, String str, boolean z);

    private native int nativeRtcChannelAddRemoteVideoRender(long j, int i, IVideoSink iVideoSink, int i2);

    private native int nativeRtcChannelAdjustUserPlaybackSignalVolume(long j, int i, int i2);

    private native String nativeRtcChannelChannelId(long j);

    private native int nativeRtcChannelCreateDataStream(long j, boolean z, boolean z2);

    private native int nativeRtcChannelEnableEncryption(long j, boolean z, int i, String str);

    private native String nativeRtcChannelGetCallId(long j);

    private native int nativeRtcChannelGetConncetionState(long j);

    private native int nativeRtcChannelJoinChannel(long j, String str, String str2, int i, Object obj);

    private native int nativeRtcChannelJoinChannelWithUserAccount(long j, String str, String str2, Object obj);

    private native int nativeRtcChannelLeaveChannel(long j);

    private native int nativeRtcChannelMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeRtcChannelMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeRtcChannelMuteRemoteAudioStream(long j, int i, boolean z);

    private native int nativeRtcChannelMuteRemoteVideoStream(long j, int i, boolean z);

    private native int nativeRtcChannelPublish(long j);

    private native int nativeRtcChannelRegisterMediaMetadataObserver(long j, Object obj, int i);

    private native int nativeRtcChannelRemoveInjectStreamUrl(long j, String str);

    private native int nativeRtcChannelRemovePublishStreamUrl(long j, String str);

    private native int nativeRtcChannelRenewToken(long j, String str);

    private native int nativeRtcChannelSendStreamMessage(long j, int i, byte[] bArr);

    private native int nativeRtcChannelSetClientRole(long j, int i);

    private native int nativeRtcChannelSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeRtcChannelSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeRtcChannelSetEncryptionMode(long j, String str);

    private native int nativeRtcChannelSetEncryptionSecret(long j, String str);

    private native int nativeRtcChannelSetLiveTranscoding(long j, byte[] bArr);

    private native int nativeRtcChannelSetRemoteDefaultVideoStreamType(long j, int i);

    private native int nativeRtcChannelSetRemoteRenderMode(long j, int i, int i2);

    private native int nativeRtcChannelSetRemoteRenderModeWithMirrorMode(long j, int i, int i2, int i3);

    private native int nativeRtcChannelSetRemoteUserPriority(long j, int i, int i2);

    private native int nativeRtcChannelSetRemoteVideoStreamType(long j, int i, int i2);

    private native int nativeRtcChannelSetRemoteVoicePosition(long j, int i, double d, double d2);

    private native int nativeRtcChannelStartChannelMediaRelay(long j, byte[] bArr);

    private native int nativeRtcChannelStopChannelMediaRelay(long j);

    private native int nativeRtcChannelUnpublish(long j);

    private native int nativeRtcChannelUpdateChannelMediaRelay(long j, byte[] bArr);

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public boolean hasJoined() {
        return this.mJoined;
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public int initialize(RtcEngineImpl rtcEngineImpl, long j) {
        this.mRtcEngineImpl = rtcEngineImpl;
        this.mNativeHandle = j;
        this.mInitialized = true;
        return 0;
    }

    @Override // io.agora.rtc.RtcChannel
    public String channelId() {
        return !this.mInitialized ? "" : nativeRtcChannelChannelId(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcChannel
    public String getCallId() {
        return !this.mInitialized ? "" : nativeRtcChannelGetCallId(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcChannel
    public int destroy() {
        if (this.mInitialized) {
            int destroyRtcChannel = this.mRtcEngineImpl.destroyRtcChannel(channelId());
            this.mInitialized = false;
            return destroyRtcChannel;
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int getConnectionState() {
        if (this.mInitialized) {
            return nativeRtcChannelGetConncetionState(this.mNativeHandle);
        }
        return 1;
    }

    @Override // io.agora.rtc.RtcChannel
    public int joinChannel(String str, String str2, int i, ChannelMediaOptions channelMediaOptions) {
        if (this.mInitialized && this.mRtcEngineImpl.getContext() != null) {
            if (channelMediaOptions == null) {
                return -2;
            }
            this.mRtcEngineImpl.onRtcChannelJoinChannel();
            this.mJoined = true;
            return nativeRtcChannelJoinChannel(this.mNativeHandle, str, str2, i, channelMediaOptions);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int joinChannelWithUserAccount(String str, String str2, ChannelMediaOptions channelMediaOptions) {
        if (this.mInitialized && this.mRtcEngineImpl.getContext() != null) {
            if (channelMediaOptions == null) {
                return -2;
            }
            this.mRtcEngineImpl.onRtcChannelJoinChannel();
            this.mJoined = true;
            return nativeRtcChannelJoinChannelWithUserAccount(this.mNativeHandle, str, str2, channelMediaOptions);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int leaveChannel() {
        if (this.mInitialized) {
            this.mJoined = false;
            this.mRtcEngineImpl.onRtcChannelLeaveChannel();
            return nativeRtcChannelLeaveChannel(this.mNativeHandle);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int publish() {
        if (this.mInitialized) {
            return nativeRtcChannelPublish(this.mNativeHandle);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int unpublish() {
        if (this.mInitialized) {
            return nativeRtcChannelUnpublish(this.mNativeHandle);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int renewToken(String str) {
        if (this.mInitialized) {
            return nativeRtcChannelRenewToken(this.mNativeHandle, str);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setEncryptionSecret(String str) {
        if (this.mInitialized) {
            return nativeRtcChannelSetEncryptionSecret(this.mNativeHandle, str);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setEncryptionMode(String str) {
        if (this.mInitialized) {
            return nativeRtcChannelSetEncryptionMode(this.mNativeHandle, str);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int enableEncryption(boolean z, EncryptionConfig encryptionConfig) {
        if (this.mInitialized) {
            return nativeRtcChannelEnableEncryption(this.mNativeHandle, z, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i) {
        if (this.mInitialized) {
            return nativeRtcChannelRegisterMediaMetadataObserver(this.mNativeHandle, iMetadataObserver, i);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setClientRole(int i) {
        if (this.mInitialized) {
            return nativeRtcChannelSetClientRole(this.mNativeHandle, i);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteUserPriority(int i, int i2) {
        if (this.mInitialized) {
            return nativeRtcChannelSetRemoteUserPriority(this.mNativeHandle, i, i2);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteVoicePosition(int i, double d, double d2) {
        if (this.mInitialized) {
            return nativeRtcChannelSetRemoteVoicePosition(this.mNativeHandle, i, d, d2);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteRenderMode(int i, int i2, int i3) {
        if (this.mInitialized) {
            return nativeRtcChannelSetRemoteRenderModeWithMirrorMode(this.mNativeHandle, i, i2, i3);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelSetDefaultMuteAllRemoteAudioStreams(this.mNativeHandle, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelSetDefaultMuteAllRemoteVideoStreams(this.mNativeHandle, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int muteAllRemoteAudioStreams(boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelMuteAllRemoteAudioStreams(this.mNativeHandle, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int muteRemoteAudioStream(int i, boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelMuteRemoteAudioStream(this.mNativeHandle, i, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int adjustUserPlaybackSignalVolume(int i, int i2) {
        if (this.mInitialized) {
            return nativeRtcChannelAdjustUserPlaybackSignalVolume(this.mNativeHandle, i, i2);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int muteAllRemoteVideoStreams(boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelMuteAllRemoteVideoStreams(this.mNativeHandle, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int muteRemoteVideoStream(int i, boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelMuteRemoteVideoStream(this.mNativeHandle, i, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteVideoStreamType(int i, int i2) {
        if (this.mInitialized) {
            return nativeRtcChannelSetRemoteVideoStreamType(this.mNativeHandle, i, i2);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteDefaultVideoStreamType(int i) {
        if (this.mInitialized) {
            return nativeRtcChannelSetRemoteDefaultVideoStreamType(this.mNativeHandle, i);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int createDataStream(boolean z, boolean z2) {
        if (this.mInitialized) {
            return nativeRtcChannelCreateDataStream(this.mNativeHandle, z, z2);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int sendStreamMessage(int i, byte[] bArr) {
        if (this.mInitialized) {
            return nativeRtcChannelSendStreamMessage(this.mNativeHandle, i, bArr);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int addPublishStreamUrl(String str, boolean z) {
        if (this.mInitialized) {
            return nativeRtcChannelAddPublishStreamUrl(this.mNativeHandle, str, z);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int removePublishStreamUrl(String str) {
        if (this.mInitialized) {
            return nativeRtcChannelRemovePublishStreamUrl(this.mNativeHandle, str);
        }
        return -7;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // io.agora.rtc.RtcChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setLiveTranscoding(io.agora.rtc.live.LiveTranscoding r4) {
        /*
            r3 = this;
            boolean r0 = r3.mInitialized
            if (r0 != 0) goto L6
            r4 = -7
            return r4
        L6:
            if (r4 != 0) goto La
            r4 = -2
            return r4
        La:
            java.util.ArrayList r0 = r4.getUsers()
            if (r0 == 0) goto L35
            java.util.ArrayList r0 = r4.getUsers()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            io.agora.rtc.live.LiveTranscoding$TranscodingUser r1 = (io.agora.rtc.live.LiveTranscoding.TranscodingUser) r1
            int r2 = r1.width
            if (r2 <= 0) goto L2d
            int r1 = r1.height
            if (r1 <= 0) goto L2d
            goto L18
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "transcoding user's width and height must be >0"
            r4.<init>(r0)
            throw r4
        L35:
            io.agora.rtc.internal.RtcEngineMessage$PLiveTranscoding r0 = new io.agora.rtc.internal.RtcEngineMessage$PLiveTranscoding
            r0.<init>()
            byte[] r4 = r0.marshall(r4)
            long r0 = r3.mNativeHandle
            int r4 = r3.nativeRtcChannelSetLiveTranscoding(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcChannelImpl.setLiveTranscoding(io.agora.rtc.live.LiveTranscoding):int");
    }

    @Override // io.agora.rtc.RtcChannel
    public int addInjectStreamUrl(String str, LiveInjectStreamConfig liveInjectStreamConfig) {
        if (this.mInitialized) {
            if (str == null || liveInjectStreamConfig == null) {
                return -2;
            }
            return nativeRtcChannelAddInjectStreamUrl(this.mNativeHandle, str, new RtcEngineMessage.PInjectStreamConfig().marshall(liveInjectStreamConfig));
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int removeInjectStreamUrl(String str) {
        if (this.mInitialized) {
            return nativeRtcChannelRemoveInjectStreamUrl(this.mNativeHandle, str);
        }
        return -7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // io.agora.rtc.RtcChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int startChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration r5) {
        /*
            r4 = this;
            boolean r0 = r4.mInitialized
            if (r0 != 0) goto L6
            r5 = -7
            return r5
        L6:
            r0 = -2
            if (r5 == 0) goto L66
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            if (r1 == 0) goto L66
            io.agora.rtc.video.ChannelMediaInfo r1 = r5.getSrcChannelMediaInfo()
            if (r1 == 0) goto L66
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L25
            goto L66
        L25:
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r3 = (io.agora.rtc.video.ChannelMediaInfo) r3
            java.lang.String r3 = r3.channelName
            if (r3 == 0) goto L55
            java.lang.Object r2 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r2 = (io.agora.rtc.video.ChannelMediaInfo) r2
            java.lang.String r2 = r2.channelName
            int r2 = r2.length()
            if (r2 != 0) goto L31
        L55:
            return r0
        L56:
            io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration r0 = new io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration
            r0.<init>()
            byte[] r5 = r0.marshall(r5)
            long r0 = r4.mNativeHandle
            int r5 = r4.nativeRtcChannelStartChannelMediaRelay(r0, r5)
            return r5
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcChannelImpl.startChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // io.agora.rtc.RtcChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration r5) {
        /*
            r4 = this;
            boolean r0 = r4.mInitialized
            if (r0 != 0) goto L6
            r5 = -7
            return r5
        L6:
            r0 = -2
            if (r5 == 0) goto L66
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            if (r1 == 0) goto L66
            io.agora.rtc.video.ChannelMediaInfo r1 = r5.getSrcChannelMediaInfo()
            if (r1 == 0) goto L66
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L25
            goto L66
        L25:
            java.util.Map r1 = r5.getDestChannelMediaInfos()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r3 = (io.agora.rtc.video.ChannelMediaInfo) r3
            java.lang.String r3 = r3.channelName
            if (r3 == 0) goto L55
            java.lang.Object r2 = r2.getValue()
            io.agora.rtc.video.ChannelMediaInfo r2 = (io.agora.rtc.video.ChannelMediaInfo) r2
            java.lang.String r2 = r2.channelName
            int r2 = r2.length()
            if (r2 != 0) goto L31
        L55:
            return r0
        L56:
            io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration r0 = new io.agora.rtc.internal.RtcEngineMessage$PChannelMediaRelayConfiguration
            r0.<init>()
            byte[] r5 = r0.marshall(r5)
            long r0 = r4.mNativeHandle
            int r5 = r4.nativeRtcChannelUpdateChannelMediaRelay(r0, r5)
            return r5
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcChannelImpl.updateChannelMediaRelay(io.agora.rtc.video.ChannelMediaRelayConfiguration):int");
    }

    @Override // io.agora.rtc.RtcChannel
    public int stopChannelMediaRelay() {
        if (this.mInitialized) {
            return nativeRtcChannelStopChannelMediaRelay(this.mNativeHandle);
        }
        return -7;
    }

    @Override // io.agora.rtc.RtcChannel
    public int setRemoteVideoRenderer(int i, IVideoSink iVideoSink) {
        int i2;
        if (this.mInitialized) {
            if (iVideoSink == null) {
                i2 = 0;
            } else {
                i2 = iVideoSink instanceof AgoraDefaultRender ? 1 : 2;
            }
            return nativeRtcChannelAddRemoteVideoRender(this.mNativeHandle, i, iVideoSink, i2);
        }
        return -7;
    }
}
