package com.tencent.liteav.trtc.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i;
import com.tencent.liteav.renderer.f;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudListener;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCRoomInfo {
    public static final int NETWORK_STATUS_OFFLINE = 1;
    public static final int NETWORK_STATUS_ONLINE = 3;
    public static final int NETWORK_STATUS_RECONNECTING = 2;
    public static final int STATE_AUDIO = 8;
    public static final int STATE_BIG_VIDEO = 1;
    public static final int STATE_MUTE_AUDIO = 64;
    public static final int STATE_MUTE_MAIN_VIDEO = 16;
    public static final int STATE_MUTE_SUB_VIDEO = 32;
    public static final int STATE_SMALL_VIDEO = 2;
    public static final int STATE_SUB_VIDEO = 4;
    private static final String TAG = "TRTCRoomInfo";
    private static final String TOKEN = "TRTC.0x0.Token";
    private static final String TRTC_INFO = "TRTC.Info";
    public long enterTime;
    public int localBufferType;
    public TRTCCloudListener.TRTCVideoRenderListener localListener;
    public int localPixelFormat;
    public String privateMapKey;
    public long roomId;
    public int sdkAppId;
    public String strRoomId;
    public String tinyId;
    public String userSig;
    public String userId = "";
    public byte[] token = null;
    public int networkStatus = 1;
    public TRTCCloud.TRTCViewMargin debugMargin = new TRTCCloud.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f);
    public boolean enableCustomPreprocessor = false;
    public TXCloudVideoView localView = null;
    private HashMap<String, UserInfo> userList = new HashMap<>();
    private HashMap<Long, Integer> recvFirstIFrameCntList = new HashMap<>();
    public boolean muteLocalVideo = false;
    public boolean muteRemoteVideo = false;
    public boolean muteLocalAudio = false;
    public TRTCRemoteMuteState muteRemoteAudio = TRTCRemoteMuteState.UNSET;
    public int localRenderRotation = 0;
    private boolean micHasStartd = false;
    private boolean hasExitedRoom = false;
    private int exitRoomCode = 0;
    public JSONArray decProperties = null;
    public boolean enableRestartDecoder = false;
    public i.a bigEncSize = new i.a();
    public i.a smallEncSize = new i.a();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum TRTCRemoteMuteState {
        UNSET,
        MUTE,
        UNMUTE
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface UserAction {
        void accept(String str, UserInfo userInfo);
    }

    public static boolean hasAudio(int i) {
        return (i & 8) != 0;
    }

    public static boolean hasMainVideo(int i) {
        return (i & 1) != 0;
    }

    public static boolean hasSmallVideo(int i) {
        return (i & 2) != 0;
    }

    public static boolean hasSubVideo(int i) {
        return (i & 4) != 0;
    }

    public static boolean isMuteAudio(int i) {
        return (i & 64) != 0;
    }

    public static boolean isMuteMainVideo(int i) {
        return (i & 16) != 0;
    }

    public static boolean isMuteSubVideo(int i) {
        return (i & 32) != 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class RenderInfo implements SurfaceHolder.Callback {
        public long tinyID;
        public TXCRenderAndDec render = null;
        public TXCloudVideoView view = null;
        public boolean muteVideo = false;
        public TRTCRemoteMuteState muteAudio = TRTCRemoteMuteState.UNSET;

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            TXCLog.i("RenderInfo", "trtc_api startRemoteView surfaceCreated " + surfaceHolder.getSurface() + ", " + this.tinyID + ", " + this.render);
            if (surfaceHolder.getSurface().isValid()) {
                f videoRender = this.render != null ? this.render.getVideoRender() : null;
                if (videoRender != null) {
                    videoRender.a(surfaceHolder.getSurface());
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            TXCLog.i("RenderInfo", "trtc_api startRemoteView surfaceChanged " + surfaceHolder.getSurface() + " width " + i2 + ", height " + i3 + ", " + this.tinyID + ", " + this.render);
            f videoRender = this.render != null ? this.render.getVideoRender() : null;
            if (videoRender != null) {
                videoRender.d(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            TXCLog.i("RenderInfo", "trtc_api startRemoteView surfaceDestroyed " + surfaceHolder.getSurface() + ", " + this.tinyID + ", " + this.render);
            f videoRender = this.render != null ? this.render.getVideoRender() : null;
            if (videoRender != null) {
                videoRender.a((Surface) null);
            }
        }

        public void stop() {
            try {
                if (this.view == null || this.view.getSurfaceView() == null || this.view.getSurfaceView().getHolder() == null) {
                    return;
                }
                this.view.getSurfaceView().getHolder().removeCallback(this);
            } catch (Exception e) {
                TXCLog.e(TRTCRoomInfo.TAG, "remove callback failed.", e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class UserInfo {
        public int streamState;
        public int terminalType;
        public long tinyID;
        public String userID;
        public RenderInfo mainRender = new RenderInfo();
        public RenderInfo subRender = new RenderInfo();
        public int streamType = 2;
        public TRTCCloud.TRTCViewMargin debugMargin = new TRTCCloud.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f);
        public boolean muteAudioInSpeaker = false;

        public UserInfo(long j, String str, int i, int i2) {
            this.tinyID = j;
            this.userID = str;
            this.terminalType = i;
            this.streamState = i2;
            this.mainRender.tinyID = j;
            this.subRender.tinyID = j;
        }
    }

    public void init(long j, String str) {
        this.roomId = j;
        this.userId = str;
    }

    public synchronized void clear() {
        this.roomId = 0L;
        this.userId = "";
        this.enterTime = 0L;
        this.tinyId = "";
        this.muteLocalVideo = false;
        this.muteLocalAudio = false;
        this.muteRemoteVideo = false;
        this.muteRemoteAudio = TRTCRemoteMuteState.UNSET;
        this.userList.clear();
        this.recvFirstIFrameCntList.clear();
        this.networkStatus = 1;
        this.decProperties = null;
        this.enableRestartDecoder = false;
        this.enableCustomPreprocessor = false;
        this.localListener = null;
    }

    public String getStrRoomId() {
        return TextUtils.isEmpty(this.strRoomId) ? String.valueOf(this.roomId) : this.strRoomId;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public void setRoomId(int i) {
        this.roomId = i;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getTinyId() {
        return this.tinyId;
    }

    public void setTinyId(String str) {
        this.tinyId = str;
    }

    private String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
        }
        return new String(cArr);
    }

    private byte[] hexStrToByteArray(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public void setToken(Context context, byte[] bArr) {
        this.token = bArr;
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(TRTC_INFO, 0).edit();
            if (this.token != null) {
                edit.putString(TOKEN, byteArrayToHexStr(this.token));
            } else {
                edit.clear();
            }
            edit.commit();
        } catch (Exception e) {
            TXCLog.e(TAG, "set token failed.", e);
        }
    }

    public byte[] getToken(Context context) {
        try {
            if (this.token == null) {
                this.token = hexStrToByteArray(context.getSharedPreferences(TRTC_INFO, 0).getString(TOKEN, ""));
            }
        } catch (Exception e) {
            TXCLog.e(TAG, "get token failed.", e);
        }
        return this.token;
    }

    public long getRoomElapsed() {
        return System.currentTimeMillis() - this.enterTime;
    }

    public synchronized void addUserInfo(String str, UserInfo userInfo) {
        this.userList.put(str, userInfo);
    }

    public synchronized void removeRenderInfo(String str) {
        this.recvFirstIFrameCntList.remove(Long.valueOf(this.userList.get(str).tinyID));
        this.userList.remove(str);
    }

    public synchronized UserInfo getUser(String str) {
        return this.userList.get(str);
    }

    public synchronized String getUserIdByTinyId(long j) {
        for (Map.Entry<String, UserInfo> entry : this.userList.entrySet()) {
            UserInfo value = entry.getValue();
            if (value != null && value.tinyID == j) {
                return value.userID;
            }
        }
        return null;
    }

    public void forEachUser(UserAction userAction) {
        HashMap hashMap = new HashMap(this.userList.size());
        synchronized (this) {
            hashMap.putAll(this.userList);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (userAction != null && entry.getValue() != null) {
                userAction.accept((String) entry.getKey(), (UserInfo) entry.getValue());
            }
        }
    }

    public synchronized void clearUserList() {
        this.userList.clear();
        this.recvFirstIFrameCntList.clear();
    }

    public synchronized int recvFirstIFrame(long j) {
        Integer num = this.recvFirstIFrameCntList.get(Long.valueOf(j));
        this.recvFirstIFrameCntList.put(Long.valueOf(j), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
        if (num == null) {
            return 1;
        }
        return num.intValue() + 1;
    }

    public synchronized boolean hasRecvFirstIFrame(long j) {
        boolean z;
        Integer num = this.recvFirstIFrameCntList.get(Long.valueOf(j));
        if (num != null) {
            z = num.intValue() > 0;
        }
        return z;
    }

    public void micStart(boolean z) {
        this.micHasStartd = z;
    }

    public synchronized boolean isMicStard() {
        return this.micHasStartd;
    }

    public synchronized void setRoomExit(boolean z, int i) {
        this.hasExitedRoom = z;
        this.exitRoomCode = i;
    }

    public synchronized boolean isRoomExit() {
        return this.hasExitedRoom;
    }

    public synchronized int getRoomExitCode() {
        return this.exitRoomCode;
    }
}
