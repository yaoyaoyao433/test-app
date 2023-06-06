package com.hhmedic.android.sdk.module.video.viewModel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.utils.HHActivityCompat;
import com.hhmedic.android.sdk.base.utils.HHDateUtils;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.DoctorType;
import com.hhmedic.android.sdk.listener.HHVideoNotification;
import com.hhmedic.android.sdk.module.call.LocalState;
import com.hhmedic.android.sdk.module.call.data.CallDC;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
import com.hhmedic.android.sdk.module.message.Body;
import com.hhmedic.android.sdk.module.message.Command;
import com.hhmedic.android.sdk.module.message.CustomMessage;
import com.hhmedic.android.sdk.module.message.OnMessageListener;
import com.hhmedic.android.sdk.module.video.VideoBundle;
import com.hhmedic.android.sdk.module.video.comment.HHCommentDialog;
import com.hhmedic.android.sdk.module.video.data.HHDoctorInfoDC;
import com.hhmedic.android.sdk.module.video.data.HHSDKConfigDC;
import com.hhmedic.android.sdk.module.video.data.HangUpNet;
import com.hhmedic.android.sdk.module.video.data.Log;
import com.hhmedic.android.sdk.module.video.data.SendImagesDC;
import com.hhmedic.android.sdk.module.video.data.entity.CallResult;
import com.hhmedic.android.sdk.module.video.data.entity.CallRtcParam;
import com.hhmedic.android.sdk.module.video.data.entity.HHSDKConfigModel;
import com.hhmedic.android.sdk.module.video.data.entity.LineupDoctor;
import com.hhmedic.android.sdk.module.video.data.entity.LineupWait;
import com.hhmedic.android.sdk.module.video.invitedDoctor.RoomManager;
import com.hhmedic.android.sdk.module.video.rtc.OnRtcListener;
import com.hhmedic.android.sdk.module.video.rtc.RTC;
import com.hhmedic.android.sdk.module.video.rtc.Render;
import com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel;
import com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel;
import com.hhmedic.android.sdk.module.video.viewModel.chat.HHAvChatTimer;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.hhmedic.android.sdk.uikit.utils.HHBitmapUtils;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.trtc.TRTCCloud;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VideoViewModel implements OnRtcListener, CallViewModel.OnCallListener, ChatViewModel.OnChatListener {
    protected boolean isCaller;
    private boolean isFromCache;
    private boolean isStartChat;
    private AlertDialog mAudioError;
    private CallParamCache mCallParam;
    private CallViewModel mCallVM;
    private HHAvChatTimer mChatTimer;
    protected ChatViewModel mChatVM;
    private HHCommentDialog mCommentDialog;
    protected Context mContext;
    private HHDoctorInfo mDoctorInfo;
    private final Handler mHandler;
    private String mHangupReason;
    private String mOrderId;
    private RTC mRTC;
    private SendImagesDC mSendImages;
    private AlertDialog mTimeoutTip;
    protected OnVideoListener mVideoListener;
    protected HHTips mTips = new HHTips();
    private long mChatTime = 0;
    private boolean isFail = false;
    private boolean isDoCancel = false;
    private RoomManager mInviteDoctorManager = new RoomManager();
    private final Runnable mCallTimeOutTask = new Runnable() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.9
        @Override // java.lang.Runnable
        public void run() {
            VideoViewModel.this.showTimeOutAlert();
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnVideoListener {
        void doBrowserPhoto();

        void onCloseRemote();

        void onFinishVideo();

        View onGetInviteView();

        void onLineup();

        void onSetSDKConfigModel(HHSDKConfigModel hHSDKConfigModel);

        void onShowRemote(boolean z);

        void onShowRemoteInviteDoctor(boolean z, String str);

        void onShowTakeSheet();

        void onUpdateAcceptUI();

        void onUpdateCallUI();
    }

    public VideoViewModel(Context context) {
        this.mContext = context;
        this.mHandler = Handlers.newHandler(context);
    }

    public void addListener(OnVideoListener onVideoListener) {
        this.mVideoListener = onVideoListener;
    }

    public void resumeBundle(Bundle bundle) {
        this.isFromCache = true;
        this.isStartChat = bundle.getBoolean(VideoBundle.KEY_IS_START_CHAT);
        this.mChatTime = bundle.getLong(VideoBundle.KEY_VIDEO_TIME);
        init(bundle);
        if (this.mRTC != null) {
            this.mRTC.onBindChatId(bundle.getLong(VideoBundle.KEY_CHAT_ID, 0L));
            this.mRTC.resumeBundle(bundle);
        }
    }

    public void init(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.mOrderId = bundle.getString(VideoBundle.KEY_ORDER_ID);
        Serializable a = f.a(bundle, VideoBundle.KEY_DOCTOR);
        if (a != null) {
            this.mDoctorInfo = (HHDoctorInfo) a;
        }
        this.isCaller = bundle.getInt(VideoBundle.KEY_SOURCE) == 0;
        this.mCallParam = new CallParamCache(bundle);
        if (this.mRTC != null && !this.isCaller) {
            this.mRTC.onBindChatId(bundle.getLong(VideoBundle.KEY_CHAT_ID, 0L));
        }
        resumeInviteDoctor(bundle);
    }

    private void resumeInviteDoctor(Bundle bundle) {
        Serializable a = f.a(bundle, VideoBundle.KEY_INVITE_DOCTOR);
        if (a instanceof RoomManager) {
            this.mInviteDoctorManager = (RoomManager) a;
        }
    }

    public void addRTC(RTC rtc) {
        this.mRTC = rtc;
        if (this.mRTC != null) {
            this.mRTC.setListener(this);
        }
    }

    public CallViewModel getCallVM() {
        if (this.mCallVM == null) {
            this.mCallVM = CallViewModel.get(this.mContext, this.mDoctorInfo, this.isCaller).addListener(this);
        }
        return this.mCallVM;
    }

    public ChatViewModel getChatVM() {
        if (this.mChatVM == null) {
            this.mChatVM = ChatViewModel.get(this.mContext).addListener(this);
        }
        return this.mChatVM;
    }

    public boolean isResumeFromCache() {
        return this.isFromCache;
    }

    public boolean isInVideo() {
        return this.isStartChat;
    }

    public void saveInstance(Bundle bundle) {
        bundle.putString(VideoBundle.KEY_ORDER_ID, this.mOrderId);
        if (this.mDoctorInfo != null) {
            bundle.putSerializable(VideoBundle.KEY_DOCTOR, this.mDoctorInfo);
        }
        bundle.putInt(VideoBundle.KEY_SOURCE, !this.isCaller ? 1 : 0);
        bundle.putBoolean(VideoBundle.KEY_IS_START_CHAT, this.isStartChat);
        bundle.putLong(VideoBundle.KEY_VIDEO_TIME, this.mChatTime);
        if (this.mRTC != null) {
            bundle.putLong(VideoBundle.KEY_CHAT_ID, this.mRTC.getChatId());
            this.mRTC.saveBundle(bundle);
        }
        if (this.mCallParam != null) {
            this.mCallParam.save(bundle);
        }
        if (this.mInviteDoctorManager != null) {
            this.mInviteDoctorManager.saveBundle(bundle);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel.OnCallListener
    public void onCancelClick() {
        if (!isVideoFail()) {
            this.isDoCancel = true;
            HHVideoNotification.onCancel();
        }
        if (this.mRTC != null) {
            this.mRTC.doCancel();
            return;
        }
        doCancelNet(HangUpNet.HangupReason.NORMAL);
        doFinishVideo();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel.OnCallListener
    public void onAcceptClick() {
        if (this.mRTC != null) {
            this.mRTC.doAccept();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel.OnCallListener
    public void onRefuseClick() {
        if (this.mRTC != null) {
            this.mRTC.doRefuse();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onHangUpClick() {
        this.mHangupReason = HangUpNet.HangupReason.SELF;
        if (this.mRTC != null) {
            this.mRTC.doHangup();
            View onGetInviteView = this.mVideoListener.onGetInviteView();
            if (onGetInviteView != null) {
                onGetInviteView.setVisibility(4);
            }
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onSwitchCameraClick() {
        if (this.mRTC != null) {
            this.mRTC.switchCamera();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public boolean onSwitchFlashClick(boolean z) {
        if (this.mRTC != null) {
            return this.mRTC.openFlash(z);
        }
        return false;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public String getCertificateUrl() {
        return this.mDoctorInfo != null ? this.mDoctorInfo.license : "";
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public CallDC.CallConfig getCallConfig() {
        if (this.mCallParam != null) {
            return this.mCallParam.getCallConfig();
        }
        return null;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onStartTransfer() {
        onHangUpClick();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onStartChangeDoctor(boolean z) {
        if (z) {
            onFinish("");
        } else {
            onHangUpClick();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onReCall(HHDoctorInfo hHDoctorInfo, String str) {
        this.mDoctorInfo = hHDoctorInfo;
        this.mOrderId = str;
        this.isCaller = true;
        releaseCallVM();
        this.isStartChat = false;
        if (this.mVideoListener != null) {
            this.mVideoListener.onShowRemote(false);
            this.mVideoListener.onUpdateCallUI();
        }
        doStart();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void onReLineUp(String str) {
        this.mOrderId = str;
        this.mDoctorInfo = null;
        this.isStartChat = false;
        releaseCallVM();
        if (this.mVideoListener != null) {
            this.mVideoListener.onShowRemote(false);
            this.mVideoListener.onUpdateCallUI();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void doTakePhoto() {
        if (this.mVideoListener != null) {
            this.mVideoListener.onShowTakeSheet();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void doBrowserPhoto() {
        if (this.mVideoListener != null) {
            this.mVideoListener.doBrowserPhoto();
        }
    }

    private void doCancelNet(String str) {
        HangUpNet.cancel(new HangUpNet.HangUpBuilder(this.mContext).setOrderId(this.mOrderId).setReason(str).builder(), null);
    }

    public void release() {
        LocalState.getInstance().release();
        addObserver(false);
        releaseUI();
        if (this.mRTC != null) {
            this.mRTC.release();
        }
        cancelTimeout();
    }

    public void reSetDoctorInfo(HHDoctorInfo hHDoctorInfo) {
        if (hHDoctorInfo != null) {
            this.mDoctorInfo = hHDoctorInfo;
        }
    }

    public void releaseUI() {
        this.mVideoListener = null;
        if (this.mChatTimer != null) {
            this.mChatTimer.release();
        }
        if (this.mCallVM != null) {
            this.mCallVM.release();
        }
        if (this.mChatVM != null) {
            this.mChatVM.release();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onAccept() {
        if (this.mVideoListener != null) {
            this.mVideoListener.onUpdateAcceptUI();
        }
        this.isStartChat = true;
        getChatVM().showConnectTip(true);
        if (this.mCallVM != null) {
            this.mCallVM.stopUI();
        }
        requestSDKConfig();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onFail(long j) {
        this.isFail = true;
        HHTips hHTips = this.mTips;
        Context context = this.mContext;
        hHTips.errorTips(context, "视频出错：code=" + j);
        Log.sendVideoRecord(this.mContext, this.mOrderId, Maps.of("视频出错", Long.valueOf(j)));
        if (!isCancel()) {
            HHVideoNotification.onFail(j);
        }
        doFinishVideo();
    }

    public boolean isVideoFail() {
        return this.isFail;
    }

    public boolean isCancel() {
        return this.isDoCancel;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onFinish(String str) {
        try {
            stopTimer();
            if (getChatVM().isDoTransfer()) {
                this.mChatTime = 0L;
                getChatVM().doTransferNet();
            } else if (getChatVM().isChangeDoctor()) {
                this.mChatTime = 0L;
                getChatVM().doChangeDoctor();
            } else {
                if (!TextUtils.isEmpty(str)) {
                    this.mHangupReason = str;
                }
                this.mTips.showProgress(this.mContext);
                HangUpNet.HangUpBuilder hangUpBuilder = new HangUpNet.HangUpBuilder(this.mContext);
                hangUpBuilder.setChatTime(this.mChatTime).setChannelId(String.valueOf(getChatId())).setOrderId(this.mOrderId).setReason(this.mHangupReason);
                HangUpNet.interrupt(hangUpBuilder.builder(), new HHGsonRequest.OnNetListener<CallResult>() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.1
                    @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                    public void onSuccess(CallResult callResult) {
                        try {
                            VideoViewModel.this.mTips.hideProgress(VideoViewModel.this.mContext);
                            if (callResult != null && callResult.question != null) {
                                VideoViewModel.this.showComment(callResult);
                            } else {
                                VideoViewModel.this.doFinishVideo();
                            }
                        } catch (Exception e) {
                            Logger.e("Hangup Net error:" + e.getLocalizedMessage());
                            VideoViewModel.this.doFinishVideo();
                        }
                    }

                    @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
                    public void onFail(String str2, int i) {
                        VideoViewModel.this.doFinishVideo();
                    }
                });
            }
        } catch (Exception e) {
            Logger.e("onFinish error:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showComment(CallResult callResult) {
        callResult.orderId = this.mOrderId;
        this.mCommentDialog = HHCommentDialog.show(this.mContext, callResult, new HHCommentDialog.OnCommentListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.2
            @Override // com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.OnCommentListener
            public void onClose() {
                VideoViewModel.this.doFinishVideo();
            }
        });
        if (this.mVideoListener != null) {
            this.mVideoListener.onLineup();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onCallSuccess(String str) {
        if (this.mCallVM != null) {
            this.mCallVM.updateTips(this.mContext.getString(R.string.hh_av_waiting_accept));
        }
        cancelTimeout();
        HHVideoNotification.onCallSuccess();
        Log.sendLog(this.mContext, this.mOrderId, Log.LogStatus.VIDEO, str);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onConnect() {
        doStartChatTimer();
        getChatVM().connect();
        Log.sendLog(this.mContext, this.mOrderId, Log.LogStatus.CONNECTED, null);
        if (!isInVideo()) {
            if (this.mRTC != null) {
                this.mRTC.doPlayRing(false);
            }
            onAccept();
        }
        cancelTimeout();
    }

    public void doStartChatTimer() {
        this.mChatTime = 0L;
        startChatTimer();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onLoadRemote() {
        getChatVM().showConnectTip(false);
        if (this.mVideoListener != null) {
            this.mVideoListener.onShowRemote(true);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onCancel(String str) {
        doCancelNet(str);
        doFinishVideo();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onForceFinish() {
        doFinishVideo();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public boolean isTransfer() {
        return this.mChatVM != null && this.mChatVM.isDoTransfer();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onShowBadNet(boolean z) {
        getChatVM().showNetPoorTip(z);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener, com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public String getOrderId() {
        return this.mOrderId;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public HHDoctorInfo getDoctorInfo() {
        return this.mDoctorInfo;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void showAudioError() {
        audioError();
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void switch2Audio() {
        if (this.mRTC != null) {
            this.mRTC.switch2Audio();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void switch2Video() {
        if (this.mRTC != null) {
            this.mRTC.switch2Video();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onShowRemoteInviteDoctor(boolean z, String str) {
        if (this.mDoctorInfo == null || this.mDoctorInfo.login == null || !this.mInviteDoctorManager.isNewDoctor(str, String.valueOf(this.mDoctorInfo.login.uuid))) {
            return;
        }
        this.mVideoListener.onShowRemoteInviteDoctor(z, str);
        requestDoctorInfo(str);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onDocLeaveRoom(String str) {
        try {
            if ((this.mDoctorInfo != null || this.mDoctorInfo.login != null) && TextUtils.equals(str, String.valueOf(this.mDoctorInfo.login.uuid))) {
                TRTCCloud.sharedInstance(this.mContext).stopRemoteView(str);
                HHTips hHTips = this.mTips;
                Context context = this.mContext;
                hHTips.errorTips(context, this.mDoctorInfo.name + "医生已离开视频");
                HHDoctorInfo inviteDoctor = this.mInviteDoctorManager.getInviteDoctor(0);
                if (inviteDoctor != null) {
                    showRemote(String.valueOf(inviteDoctor.login.uuid));
                    reSetDoctorInfo(inviteDoctor);
                    this.mInviteDoctorManager.doctorLeaveRoom(String.valueOf(inviteDoctor.login.uuid));
                }
            }
            if (this.mInviteDoctorManager.isInviteDoctorUserId(str)) {
                HHDoctorInfo inviteDoctorById = this.mInviteDoctorManager.getInviteDoctorById(str);
                HHTips hHTips2 = this.mTips;
                Context context2 = this.mContext;
                hHTips2.errorTips(context2, inviteDoctorById.name + "医生已离开视频");
                this.mInviteDoctorManager.doctorLeaveRoom(str);
            }
            this.mVideoListener.onCloseRemote();
        } catch (Exception e) {
            Logger.e("onDocLeaveRoom error:" + e.getMessage());
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public RoomManager getInviteDoctorManager() {
        if (this.mInviteDoctorManager == null) {
            this.mInviteDoctorManager = new RoomManager();
        }
        return this.mInviteDoctorManager;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.OnChatListener
    public void doFinishVideo() {
        closeAudioError();
        if (this.mVideoListener != null) {
            this.mVideoListener.onFinishVideo();
        }
    }

    private String getChatId() {
        if (this.mRTC != null) {
            return String.valueOf(this.mRTC.getChatId());
        }
        return null;
    }

    public void doStart() {
        if (this.mRTC != null) {
            this.mRTC.doPlayRing(true);
            if (this.isCaller) {
                if (isLineUp()) {
                    if (this.mVideoListener != null) {
                        this.mVideoListener.onLineup();
                        return;
                    }
                    return;
                }
                startCallTimeOutAlert();
                this.mRTC.doCall(new CallRtcParam(this.mDoctorInfo.login.uuid, this.mOrderId));
                return;
            }
            this.mRTC.waitAccept();
        }
    }

    private void requestDoctorInfo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            final HHDoctorInfoDC hHDoctorInfoDC = new HHDoctorInfoDC(this.mContext);
            hHDoctorInfoDC.simpleDetail(Long.parseLong(str), new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.3
                @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
                @SuppressLint({"ResourceType"})
                public void onResult(boolean z, String str2) {
                    if (z) {
                        if (hHDoctorInfoDC.mData == 0 || ((LineupDoctor) hHDoctorInfoDC.mData).doctor == null) {
                            return;
                        }
                        HHDoctorInfo hHDoctorInfo = ((LineupDoctor) hHDoctorInfoDC.mData).doctor;
                        VideoViewModel.this.mInviteDoctorManager.addInviteDoctor(hHDoctorInfo);
                        HHTips hHTips = VideoViewModel.this.mTips;
                        Context context = VideoViewModel.this.mContext;
                        hHTips.errorTips(context, hHDoctorInfo.name + "医生已加入视频");
                        return;
                    }
                    VideoViewModel.this.mTips.errorTips(VideoViewModel.this.mContext, str2);
                }
            });
        } catch (Exception e) {
            Logger.e("requestDoctorInfo error : " + e.toString());
        }
    }

    private void requestSDKConfig() {
        try {
            final HHSDKConfigDC hHSDKConfigDC = new HHSDKConfigDC(this.mContext);
            hHSDKConfigDC.requestConfig(new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.4
                @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
                @SuppressLint({"ResourceType"})
                public void onResult(boolean z, String str) {
                    if (z) {
                        if (hHSDKConfigDC.mData != 0) {
                            VideoViewModel.this.mVideoListener.onSetSDKConfigModel((HHSDKConfigModel) hHSDKConfigDC.mData);
                            return;
                        }
                        return;
                    }
                    VideoViewModel.this.mTips.errorTips(VideoViewModel.this.mContext, str);
                }
            });
        } catch (Exception e) {
            Logger.e("requestSDKConfig error : " + e.toString());
        }
    }

    public boolean isLineUp() {
        return this.mDoctorInfo == null || this.mDoctorInfo.login == null;
    }

    public void doResumeFromCache() {
        try {
            if (this.isStartChat) {
                onAccept();
                if (this.mRTC != null && this.mRTC.getRender() != null && this.mDoctorInfo != null) {
                    this.mRTC.getRender().showRemote(String.valueOf(this.mDoctorInfo.login.uuid));
                    onLoadRemote();
                }
                if (this.mInviteDoctorManager.exitsInviteDoctor()) {
                    Map<String, HHDoctorInfo> inviteDoctorMap = this.mInviteDoctorManager.getInviteDoctorMap();
                    View onGetInviteView = this.mVideoListener.onGetInviteView();
                    if (onGetInviteView != null) {
                        for (String str : inviteDoctorMap.keySet()) {
                            bindInviteDoctorRender((FrameLayout) onGetInviteView);
                            this.mRTC.getRender().showInviteDoctorRemote(str);
                            onShowRemoteInviteDoctor(true, str);
                        }
                    }
                }
            } else {
                getCallVM().updateTips(this.mContext.getString(R.string.hh_av_waiting_accept));
            }
            if (this.mRTC == null || this.mRTC.getRender() == null) {
                return;
            }
            this.mRTC.getRender().showLocal();
        } catch (Exception e) {
            Logger.e("doResumeFromCache error:" + e.getMessage());
        }
    }

    public void errorPermission() {
        Log.sendLog(this.mContext, this.mOrderId, Log.LogStatus.AUTH, null);
        doFinishVideo();
    }

    public void errorTips() {
        this.mTips.errorTips(this.mContext, this.mContext.getString(R.string.hh_cpt));
    }

    public void bindRender(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        if (this.mRTC == null || this.mRTC.getRender() == null) {
            return;
        }
        this.mRTC.getRender().initRender(frameLayout, frameLayout2, frameLayout3);
    }

    public void bindInviteDoctorRender(FrameLayout frameLayout) {
        if (this.mRTC == null || this.mRTC.getRender() == null) {
            return;
        }
        this.mRTC.getRender().initInvitedDoctorRender(frameLayout);
    }

    public void addObserver(boolean z) {
        if (this.mRTC != null) {
            this.mRTC.addObserver(z);
        }
        if (z) {
            CustomMessage.getInstance().addListener(new OnMessageListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.5
                @Override // com.hhmedic.android.sdk.module.message.OnMessageListener
                public boolean onMessage(Body body, String str) {
                    VideoViewModel.this.doMessage(body, str);
                    return true;
                }
            });
        } else {
            CustomMessage.getInstance().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doMessage(Body body, String str) {
        if (body == null || TextUtils.isEmpty(body.command) || !TextUtils.equals(body.orderId, this.mOrderId)) {
            return;
        }
        String str2 = body.command;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1843315739:
                if (str2.equals(Command.agent_transfer)) {
                    c = 4;
                    break;
                }
                break;
            case 3045982:
                if (str2.equals("call")) {
                    c = 1;
                    break;
                }
                break;
            case 994721764:
                if (str2.equals("dispatchDoctorByONS")) {
                    c = 2;
                    break;
                }
                break;
            case 1280882667:
                if (str2.equals("transfer")) {
                    c = 3;
                    break;
                }
                break;
            case 1397790638:
                if (str2.equals(Command.lineup_waitUserInfo)) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                updateLineUpMessage(str);
                return;
            case 1:
            case 2:
                lineupDoctor(str);
                return;
            case 3:
            case 4:
                doTransferMessage(str);
                return;
            default:
                return;
        }
    }

    private void updateLineUpMessage(String str) {
        try {
            LineupWait lineupWait = (LineupWait) new Gson().fromJson(str, (Class<Object>) LineupWait.class);
            if (this.mCallVM != null) {
                this.mCallVM.updateTips(lineupWait.msg);
            }
        } catch (Exception e) {
            Logger.e("updateLineUpMessage error:" + e.getLocalizedMessage());
        }
    }

    private void lineupDoctor(String str) {
        try {
            LineupDoctor lineupDoctor = (LineupDoctor) new Gson().fromJson(str, (Class<Object>) LineupDoctor.class);
            if (lineupDoctor.doctor == null) {
                return;
            }
            this.mDoctorInfo = lineupDoctor.doctor;
            this.mDoctorInfo.serviceTypeStatus = DoctorType.FAM_DOCTOR;
            this.mOrderId = lineupDoctor.orderId;
            releaseCallVM();
            if (this.mVideoListener != null) {
                this.mVideoListener.onUpdateCallUI();
            }
            doStart();
        } catch (Exception e) {
            Logger.e("lineupDoctor error:" + e.getLocalizedMessage());
        }
    }

    protected void releaseCallVM() {
        if (this.mCallVM != null) {
            this.mCallVM.release();
            this.mCallVM = null;
        }
    }

    private void doTransferMessage(String str) {
        try {
            getChatVM().receiverTransfer(str);
        } catch (Exception e) {
            Logger.e("doTransferMessage error:" + e.getLocalizedMessage());
        }
    }

    private void startChatTimer() {
        if (this.mChatTimer != null) {
            stopTimer();
        }
        if (this.mChatTimer == null) {
            this.mChatTimer = new HHAvChatTimer(this.mContext, new HHAvChatTimer.OnTimer() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.6
                @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.HHAvChatTimer.OnTimer
                public void onTimer(long j) {
                    VideoViewModel.this.mChatTime = j;
                    VideoViewModel.this.getChatVM().updateVideoTime(HHDateUtils.formatTimeFromLong(j));
                }
            });
        }
        this.mChatTimer.start(this.mChatTime);
    }

    public void stopTimer() {
        if (this.mChatTimer != null) {
            this.mChatTimer.stop();
            this.mChatTimer = null;
        }
    }

    public void resumeTimer() {
        if (this.isStartChat && this.mChatTimer == null && this.mChatTime > 0) {
            startChatTimer();
        }
    }

    private void closeAudioError() {
        if (HHActivityCompat.isDead(this.mContext) || this.mAudioError == null) {
            return;
        }
        this.mAudioError.dismiss();
        this.mAudioError = null;
    }

    private void audioError() {
        try {
            closeAudioError();
            if (this.mRTC != null) {
                Log.sendLog(this.mContext, this.mOrderId, Log.LogStatus.AUDIO_RECORDER_OPEN_ERROR, String.valueOf(this.mRTC.getChatId()));
            }
            this.mAudioError = new AlertDialog.a(this.mContext).b(R.string.hh_are).a("知道了", new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    VideoViewModel.this.onHangUpClick();
                }
            }).a(false).b();
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void sendPhotos(MRecordInfo mRecordInfo) {
        getSendImages().sendPhotos(this.mOrderId, mRecordInfo, new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.8
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str) {
                if (!z) {
                    VideoViewModel.this.mTips.errorTips(VideoViewModel.this.mContext, str);
                    return;
                }
                HHBitmapUtils.deleteContextFile(VideoViewModel.this.mContext, "snapshot.jpg");
                VideoViewModel.this.mTips.successTips(VideoViewModel.this.mContext, "图片已发送给医生");
                VideoViewModel.this.getSendImages().addUploadedList();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SendImagesDC getSendImages() {
        if (this.mSendImages == null) {
            this.mSendImages = new SendImagesDC(this.mContext);
        }
        return this.mSendImages;
    }

    private void startCallTimeOutAlert() {
        try {
            cancelTimeout();
            this.mHandler.postDelayed(this.mCallTimeOutTask, 15000L);
        } catch (Exception e) {
            Logger.e("startCallTimeOutAlert error:" + e.getLocalizedMessage());
        }
    }

    private void cancelTimeout() {
        try {
            closeTimeOutTip();
            this.mHandler.removeCallbacks(this.mCallTimeOutTask);
        } catch (Exception e) {
            Logger.e("cancelTimeout e:" + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTimeOutAlert() {
        try {
            this.mTimeoutTip = new AlertDialog.a(this.mContext).b(R.string.hh_etccot).a(R.string.hh_sdk_ok, new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.10
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    VideoViewModel.this.doCallTimeoutAction();
                }
            }).a(false).b();
        } catch (Exception e) {
            Logger.e("showTimeOutAlert error:" + e.getLocalizedMessage());
        }
    }

    private void closeTimeOutTip() {
        try {
            if (HHActivityCompat.isDead(this.mContext) || this.mTimeoutTip == null || !this.mTimeoutTip.isShowing()) {
                return;
            }
            this.mTimeoutTip.dismiss();
            this.mTimeoutTip = null;
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public long getChatTime() {
        return this.mChatTime;
    }

    public void showRemote(String str) {
        if (this.mRTC == null || this.mRTC.getRender() == null || this.mDoctorInfo == null) {
            return;
        }
        Render render = this.mRTC.getRender();
        if (str == null || str.length() <= 0) {
            str = String.valueOf(this.mDoctorInfo.login.uuid);
        }
        render.showRemote(str);
        onLoadRemote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCallTimeoutAction() {
        onCancelClick();
        Log.sendLog(this.mContext, this.mOrderId, "call_fail", "0");
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onSetCameraFocusPosition(int i, int i2, boolean z) {
        if (this.mRTC != null) {
            this.mRTC.setCameraFocusPosition(i, i2, z);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public boolean onGetIsFrontCamera() {
        if (this.mRTC != null) {
            return this.mRTC.onGetIsFrontCamera();
        }
        return true;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void switchCamera() {
        if (this.mRTC != null) {
            this.mRTC.switchCamera();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.OnRtcListener
    public void onCameraOpened(boolean z) {
        if (this.mRTC == null || this.mRTC.getRender() == null) {
            return;
        }
        this.mRTC.onCameraOpened(z);
        this.mRTC.getRender().onCameraOpened(z);
    }

    public void showLocal(int i) {
        if (this.mRTC == null || this.mRTC.getRender() == null) {
            return;
        }
        if (i == 1) {
            this.mRTC.getRender().showBigLocal();
        } else {
            this.mRTC.getRender().showLocal();
        }
    }

    public void sendCloseCameraMsg() {
        if (this.mRTC == null || this.mRTC.getRender() == null) {
            return;
        }
        this.mRTC.onSendCloseCameraMsg();
    }
}
