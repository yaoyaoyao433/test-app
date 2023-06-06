package com.hhmedic.android.sdk.video.chat;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.message.Body;
import com.hhmedic.android.sdk.module.message.CustomMessage;
import com.hhmedic.android.sdk.module.video.data.HangUpNet;
import com.hhmedic.android.sdk.module.video.data.Log;
import com.hhmedic.android.sdk.module.video.data.entity.CallRtcParam;
import com.hhmedic.android.sdk.module.video.rtc.OnRtcListener;
import com.hhmedic.android.sdk.module.video.rtc.RTC;
import com.hhmedic.android.sdk.module.video.rtc.Render;
import com.hhmedic.android.sdk.ring.CallingSound;
import com.hhmedic.android.sdk.tim.NewMessage;
import com.hhmedic.android.sdk.tim.Signalling;
import com.hhmedic.android.sdk.tim.TCommand;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
import com.hhmedic.android.sdk.video.VideoCall;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class TRTC extends TRTCCloudListener implements RTC {
    private static final String ACTION = "action";
    private boolean isAccept;
    private boolean isEnterRoom;
    private CallingSound mCallSound;
    private long mChatId;
    private TRTCCloud mCloud;
    private final Context mContext;
    private final Handler mHandler;
    private int mHangupType;
    private OnRtcListener mListener;
    private String mReason;
    private OnRtcRemoteListener mRemoteListener;
    private final TRender mRender;
    private final Signalling mSignalling;
    private final HHTips mTips = new HHTips();
    private boolean isAsyncHangup = false;
    private boolean isDoAccept = false;
    private boolean isFrontCamera = true;
    private boolean isCameraOpened = true;
    private boolean isTorchOpen = true;
    private final Runnable mHangupTimeOut = new Runnable() { // from class: com.hhmedic.android.sdk.video.chat.TRTC.2
        @Override // java.lang.Runnable
        public void run() {
            TRTC.this.forceHangup();
        }
    };

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void resumeBundle(Bundle bundle) {
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void saveBundle(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TRTC(Context context) {
        this.mContext = context;
        this.mRender = new TRender(context);
        this.mHandler = Handlers.newHandler(context);
        this.mSignalling = new Signalling(context);
        this.mCallSound = new CallingSound(context);
        init();
    }

    private void init() {
        this.mCloud = TRTCCloud.sharedInstance(this.mContext);
        this.mCloud.setListener(this);
        TRTCCloud.setLogCompressEnabled(false);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doCall(CallRtcParam callRtcParam) {
        initVideoSetting();
        startCall(callRtcParam);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doCancel() {
        cancelCall(false);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void setListener(OnRtcListener onRtcListener) {
        this.mListener = onRtcListener;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doAccept() {
        this.mRender.showLocal();
        this.mTips.showProgress(this.mContext);
        this.isAccept = true;
        this.isDoAccept = false;
        TRTCCloudDef.TRTCParams commonParams = VideoCall.commonParams(this.mContext);
        commonParams.roomId = (int) this.mChatId;
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam = new TRTCCloudDef.TRTCNetworkQosParam();
        tRTCNetworkQosParam.preference = 1;
        this.mCloud.setNetworkQosParam(tRTCNetworkQosParam);
        this.mCloud.enterRoom(commonParams, 0);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doRefuse() {
        this.mReason = "拒绝接听";
        cancelCall(true);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void waitAccept() {
        initRTCConfig();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void initRTCConfig() {
        initVideoSetting();
    }

    private void initVideoSetting() {
        if (this.mRender != null) {
            this.mRender.showLocal();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final Render getRender() {
        return this.mRender;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void addObserver(boolean z) {
        registerNetCallObserver(z);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final long getChatId() {
        return this.mChatId;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final boolean openFlash(boolean z) {
        if (this.mCloud == null || this.mCloud.getDeviceManager() == null) {
            return false;
        }
        if (!this.mCloud.getDeviceManager().enableCameraTorch(this.isTorchOpen)) {
            this.mTips.errorTips(this.mContext, this.mContext.getString(this.isCameraOpened ? R.string.hh_fe : R.string.hh_open_camera));
            return false;
        }
        this.isTorchOpen = !this.isTorchOpen;
        return true;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final boolean switchCamera() {
        if (this.mCloud != null && this.mCloud.getDeviceManager() != null) {
            this.isFrontCamera = !this.mCloud.getDeviceManager().isFrontCamera();
            this.mCloud.getDeviceManager().switchCamera(this.isFrontCamera);
        }
        return true;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void setCameraFocusPosition(int i, int i2, boolean z) {
        if (this.mCloud == null || this.mCloud.getDeviceManager() == null) {
            return;
        }
        this.mCloud.getDeviceManager().enableCameraAutoFocus(z);
        if (!z) {
            this.mCloud.getDeviceManager().setCameraFocusPosition(i, i2);
        }
        Logger.e("x = " + i + " y = " + i2);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final boolean onGetIsFrontCamera() {
        if (this.mCloud == null || this.mCloud.getDeviceManager() == null) {
            return true;
        }
        return this.mCloud.getDeviceManager().isFrontCamera();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doHangup() {
        this.mTips.showProgress(this.mContext);
        hangup(2);
        stopMessage();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void onBindChatId(long j) {
        this.mChatId = j;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void switch2Audio() {
        this.mCloud.stopLocalPreview();
        sendCmd(TCommand.SWITCH_TO_AUDIO);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void switch2Video() {
        if (this.mRender != null) {
            this.mRender.showLocal();
        }
        sendCmd(TCommand.SWITCH_TO_VIDEO);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void release() {
        try {
            getCallSound().stop();
            this.mCloud.stopLocalPreview();
            this.mCloud.setListener(null);
            this.mListener = null;
            this.mRemoteListener = null;
            if (NewMessage.haveInstance()) {
                NewMessage.getInstance(this.mContext).stop();
            }
        } catch (Exception e) {
            Logger.e("TRTC release error:" + e.getMessage());
        }
    }

    public final void addRemoteListener(OnRtcRemoteListener onRtcRemoteListener) {
        this.mRemoteListener = onRtcRemoteListener;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void doPlayRing(boolean z) {
        if (z) {
            getCallSound().start();
        } else {
            getCallSound().stop();
        }
    }

    private void startCall(CallRtcParam callRtcParam) {
        this.isDoAccept = false;
        this.isAccept = false;
        TRTCCloudDef.TRTCParams commonParams = VideoCall.commonParams(this.mContext);
        commonParams.roomId = VideoCall.getRoomId(callRtcParam.orderId);
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam = new TRTCCloudDef.TRTCNetworkQosParam();
        tRTCNetworkQosParam.preference = 1;
        this.mCloud.setNetworkQosParam(tRTCNetworkQosParam);
        this.mChatId = commonParams.roomId;
        this.mCloud.enterRoom(commonParams, 0);
    }

    private void cancelCall(boolean z) {
        getCallSound().stop();
        this.mTips.showProgress(this.mContext);
        sendCancelMessage(z);
        if (this.isEnterRoom) {
            hangup(1);
            return;
        }
        hangupAsync(1);
        cancelNotify();
    }

    private void sendCancelMessage(boolean z) {
        try {
            if (this.mSignalling == null || this.mListener == null) {
                return;
            }
            if (this.mListener.getDoctorInfo() != null) {
                this.mSignalling.setReceiverId(this.mListener.getDoctorInfo().login.uuid);
            }
            if (z) {
                this.mSignalling.setOrderId(this.mListener.getOrderId()).sendRefuse();
            } else {
                this.mSignalling.setOrderId(this.mListener.getOrderId()).sendCancel();
            }
        } catch (Exception e) {
            Logger.e("sendCancelMessage error:" + e.getLocalizedMessage());
        }
    }

    private void cancelNotify() {
        this.mTips.hideProgress(this.mContext);
        if (this.mListener != null) {
            this.mListener.onCancel(this.mReason);
        }
    }

    private void doHangupNotify() {
        this.mTips.hideProgress(this.mContext);
        if (this.mListener != null) {
            this.mListener.onFinish(this.mReason);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onMicDidReady() {
        sendOrderLog(Maps.of("action", "micDidReady"));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onConnectionLost() {
        sendOrderLog(Maps.of("action", "connectionLost"));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onRemoteUserEnterRoom(String str) {
        sendOrderLog(Maps.of("action", "doctor_join_rom", DeviceInfo.USER_ID, str));
        if (this.mListener != null) {
            this.mListener.onShowRemoteInviteDoctor(true, str);
            if (this.isCameraOpened) {
                return;
            }
            this.mSignalling.setReceiverId(Long.parseLong(str));
            this.mSignalling.setOrderId(this.mListener.getOrderId()).sendCameraOpened(false);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onFirstVideoFrame(String str, int i, int i2, int i3) {
        if (isSelf(str) || this.mListener == null) {
            return;
        }
        this.mListener.onLoadRemote();
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onUserAudioAvailable(String str, boolean z) {
        if (!z || isSelf(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            sendOrderLog(Maps.of("action", "onUserAudioAvailable", DeviceInfo.USER_ID, str));
        }
        doAcceptCallback();
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
        Body body;
        if (i == 1) {
            try {
                String str2 = new String(bArr, StandardCharsets.UTF_8);
                if (TextUtils.equals(str2, TCommand.ACCEPT)) {
                    sendOrderLog(Maps.of("action", "accept_cmd", DeviceInfo.USER_ID, str));
                    doAcceptCallback();
                } else if (TextUtils.isEmpty(str2) || (body = Body.get(str2)) == null) {
                } else {
                    doGetCustomMessage(body, str2);
                }
            } catch (Exception e) {
                Logger.e(e.getMessage());
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onError(int i, String str, Bundle bundle) {
        if (this.mHangupType == 4) {
            return;
        }
        doFailCallback(i);
        clearObserver();
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onRemoteUserLeaveRoom(String str, int i) {
        if (this.mListener != null) {
            if (this.mListener.isTransfer()) {
                if (this.mRemoteListener != null) {
                    this.mRemoteListener.onLoadRtcRemote(false);
                    return;
                }
                return;
            } else if (!this.mListener.getInviteDoctorManager().exitsInviteDoctor()) {
                this.mReason = HangUpNet.HangupReason.DOCTOR_HANGUP;
                hangup(3);
                stopMessage();
                return;
            } else {
                this.mListener.onDocLeaveRoom(str);
                return;
            }
        }
        this.mCloud.exitRoom();
    }

    private void stopMessage() {
        try {
            if (NewMessage.haveInstance()) {
                NewMessage.getInstance(this.mContext).stop();
            }
        } catch (Exception e) {
            Logger.e("stopMessage error:" + e.getMessage());
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onUserVideoAvailable(String str, boolean z) {
        if (this.mCloud == null) {
            return;
        }
        try {
            if (isSelf(str)) {
                return;
            }
            if (z) {
                HHDoctorInfo doctorInfo = this.mListener.getDoctorInfo();
                if (doctorInfo != null && TextUtils.equals(str, String.valueOf(doctorInfo.login.uuid))) {
                    this.mRender.showRemote(str);
                }
                if (this.mListener.getInviteDoctorManager().getInviteDoctorById(str) != null || (doctorInfo != null && !TextUtils.equals(str, String.valueOf(doctorInfo.login.uuid)))) {
                    this.mRender.showInviteDoctorRemote(str);
                }
            } else {
                this.mCloud.stopRemoteView(str);
            }
            if (this.mRemoteListener != null) {
                this.mRemoteListener.onLoadRtcRemote(z);
            }
        } catch (Exception e) {
            Logger.e("onUserVideoAvailable error:" + e.getLocalizedMessage());
        }
    }

    private boolean isSelf(String str) {
        return TextUtils.equals(str, Caches.getUUID(this.mContext));
    }

    private void registerNetCallObserver(boolean z) {
        if (z) {
            NewMessage.getInstance(this.mContext).addNewMessageListener(new NewMessage.OnTimNewMessage() { // from class: com.hhmedic.android.sdk.video.chat.TRTC.1
                @Override // com.hhmedic.android.sdk.tim.NewMessage.OnTimNewMessage
                public boolean onMessage(Body body, String str) {
                    return TRTC.this.doGetCustomMessage(body, str);
                }
            });
            String cacheMessageJson = NewMessage.getInstance(this.mContext).getCacheMessageJson();
            if (TextUtils.isEmpty(cacheMessageJson)) {
                return;
            }
            Body body = Body.get(cacheMessageJson);
            long cacheTime = NewMessage.getInstance(this.mContext).getCacheTime();
            if (isCancelCallback(body.command, body.orderId) && System.currentTimeMillis() - cacheTime <= 1000) {
                doCancel();
            }
            NewMessage.getInstance(this.mContext).clearCachedMessage();
            return;
        }
        NewMessage.getInstance(this.mContext).clearListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean doGetCustomMessage(Body body, String str) {
        Body body2;
        try {
            body2 = new Body();
            body2.command = body.command;
            body2.orderId = body.orderId;
        } catch (Exception e) {
            Logger.e("doGetCustomMessage error:" + e.getMessage());
        }
        if (isCancelCallback(body.command, body.orderId)) {
            doCancel();
            return true;
        } else if (isBusy(body.command, body.orderId)) {
            doCancel();
            this.mTips.errorTips(this.mContext, "对方正忙");
            return true;
        } else {
            CustomMessage.getInstance().send(body2, str);
            return true;
        }
    }

    private boolean isCancelCallback(String str, String str2) {
        try {
            if (TextUtils.equals(str2, this.mListener.getOrderId())) {
                if (TextUtils.equals("cancel", str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Logger.e("isCancelCallback error:" + e.getLocalizedMessage());
            return false;
        }
    }

    private boolean isBusy(String str, String str2) {
        try {
            if (TextUtils.equals(str2, this.mListener.getOrderId())) {
                if (TextUtils.equals(TCommand.busy, str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Logger.e("isCancelCallback error:" + e.getLocalizedMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOrderLog(HashMap<String, Object> hashMap) {
        try {
            if (this.mListener != null) {
                Log.sendVideoRecord(this.mContext, this.mListener.getOrderId(), hashMap);
            }
        } catch (Exception e) {
            Logger.e("sendOrderLog:error=" + e.getMessage());
        }
    }

    private void doAcceptCallback() {
        try {
            getCallSound().stop();
            if (this.isDoAccept) {
                return;
            }
            this.isDoAccept = true;
            if (this.mCloud != null) {
                this.mCloud.startLocalAudio(2);
            }
            if (this.mListener != null) {
                this.mListener.onAccept();
                this.mListener.onConnect();
                this.mListener.onLoadRemote();
                if (this.mListener.getDoctorInfo() != null) {
                    NewMessage.getInstance(this.mContext).start(this.mListener.getOrderId(), false);
                }
            }
        } catch (Exception e) {
            Logger.e("doAcceptCallback error:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doFailCallback(int i) {
        getCallSound().stop();
        if (this.mListener != null) {
            this.mListener.onFail(i);
        }
        confirmClose();
    }

    private void confirmClose() {
        try {
            hangupAsync(4);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onEnterRoom(long j) {
        this.mTips.hideProgress(this.mContext);
        if (this.mListener != null) {
            if (j > 0) {
                this.isEnterRoom = true;
                if (this.isAccept) {
                    sendCmd(TCommand.ACCEPT);
                    doAcceptCallback();
                    return;
                }
                sendCallMessage();
                return;
            }
            this.mListener.onFail(j);
        }
    }

    public final void sendCmd(String str) {
        try {
            this.mCloud.sendCustomCmdMsg(1, str.getBytes(StandardCharsets.UTF_8), true, false);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onExitRoom(int i) {
        Logger.e("onExitRoom    reason=" + i);
        if (this.isAsyncHangup) {
            return;
        }
        this.isEnterRoom = false;
        doHangupNotify();
        clearObserver();
    }

    private void clearObserver() {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mHangupTimeOut);
        }
    }

    private void addHangupObserver() {
        this.mHandler.postDelayed(this.mHangupTimeOut, 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceHangup() {
        try {
            doHangupNotify();
        } catch (Exception e) {
            Logger.e("RTC error ---->" + e.getLocalizedMessage());
        }
    }

    public final void hangup(int i) {
        this.mHangupType = i;
        addHangupObserver();
        this.mCloud.exitRoom();
    }

    public final void hangupAsync(int i) {
        this.isAsyncHangup = true;
        this.mHangupType = i;
        this.mCloud.stopLocalPreview();
        this.mCloud.exitRoom();
    }

    private void sendCallMessage() {
        if (this.mSignalling != null && this.mListener != null) {
            if (this.mListener.getDoctorInfo() != null) {
                this.mSignalling.setReceiverId(this.mListener.getDoctorInfo().login.uuid);
            }
            this.mSignalling.setOrderId(this.mListener.getOrderId()).sendCall(new HHGsonRequest.OnNetListener<HHEmptyModel>() { // from class: com.hhmedic.android.sdk.video.chat.TRTC.3
                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onSuccess(HHEmptyModel hHEmptyModel) {
                    TRTC.this.sendOrderLog(Maps.of("action", "send call message success"));
                    if (TRTC.this.mListener != null) {
                        TRTC.this.mListener.onCallSuccess(String.valueOf(TRTC.this.mChatId));
                    }
                }

                @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                public void onFail(String str, int i) {
                    TRTC.this.sendOrderLog(Maps.of("action", "send call message fail", "message", str));
                    TRTC.this.doFailCallback(-100002);
                }
            });
            return;
        }
        doFailCallback(-100001);
    }

    private CallingSound getCallSound() {
        if (this.mCallSound == null) {
            this.mCallSound = new CallingSound(this.mContext);
        }
        return this.mCallSound;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void onCameraOpened(boolean z) {
        try {
            this.isCameraOpened = z;
            sendCameraMsg(this.isCameraOpened);
        } catch (Exception e) {
            Logger.e("onCameraOpened exception =" + e);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.RTC
    public final void onSendCloseCameraMsg() {
        sendCameraMsg(false);
    }

    private void sendCameraMsg(boolean z) {
        if (this.mSignalling == null || this.mListener == null) {
            return;
        }
        this.mSignalling.setReceiverId(this.mListener.getDoctorInfo().login.uuid);
        this.mSignalling.setOrderId(this.mListener.getOrderId()).sendCameraOpened(z);
        Map<String, HHDoctorInfo> inviteDoctorMap = this.mListener.getInviteDoctorManager().getInviteDoctorMap();
        if (inviteDoctorMap == null || inviteDoctorMap.size() <= 0) {
            return;
        }
        for (HHDoctorInfo hHDoctorInfo : new ArrayList(inviteDoctorMap.values())) {
            this.mSignalling.setReceiverId(hHDoctorInfo.login.uuid);
            this.mSignalling.setOrderId(this.mListener.getOrderId()).sendCameraOpened(z);
        }
    }
}
