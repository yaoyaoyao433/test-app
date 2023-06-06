package com.hhmedic.android.sdk.module.video.viewModel.chat;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.open.HHNetFetch;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.config.DoctorType;
import com.hhmedic.android.sdk.module.call.data.CallDC;
import com.hhmedic.android.sdk.module.call.data.entity.Call;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
import com.hhmedic.android.sdk.module.message.Command;
import com.hhmedic.android.sdk.module.video.data.ChangeDoctorConfig;
import com.hhmedic.android.sdk.module.video.data.DoctorDetailDC;
import com.hhmedic.android.sdk.module.video.data.entity.TransferData;
import com.hhmedic.android.sdk.module.video.viewModel.ChangeDoctorCache;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.hhmedic.android.sdk.uikit.utils.HHUIUtils;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ChatViewModel implements ChatControllerView.OnControllerInfoCallback {
    protected boolean isChangeDoctor;
    protected boolean isChangeDoctorInVideo;
    protected boolean isExpertCall;
    protected boolean isTransfer;
    private CallDC mCallDC;
    protected Context mContext;
    private DoctorDetailDC mDoctorDC;
    private final Handler mHandler;
    protected OnChatListener mListener;
    private TransferData mTransferData;
    private final HHTips mTips = new HHTips();
    protected Runnable mHideRun = new Runnable() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.6
        @Override // java.lang.Runnable
        public void run() {
            ChatViewModel.this.hideController();
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnChatListener {
        void doBrowserPhoto();

        void doFinishVideo();

        void doTakePhoto();

        CallDC.CallConfig getCallConfig();

        String getCertificateUrl();

        String getOrderId();

        void onHangUpClick();

        void onReCall(HHDoctorInfo hHDoctorInfo, String str);

        void onReLineUp(String str);

        void onStartChangeDoctor(boolean z);

        void onStartTransfer();

        void onSwitchCameraClick();

        boolean onSwitchFlashClick(boolean z);
    }

    public void bindUploadInfo(MRecordInfo mRecordInfo) {
    }

    public abstract void connect();

    public abstract ChatControllerView getControllerView();

    protected abstract void hideController();

    public abstract void showConnectTip(boolean z);

    public abstract void showNetPoorTip(boolean z);

    public abstract void startTransferUI(ChatTipView.CompleteCallback completeCallback);

    public abstract void switchHangupClickable(boolean z);

    public abstract void updateVideoTime(String str);

    public ChatViewModel(Context context) {
        this.mContext = context;
        this.mHandler = Handlers.newHandler(context);
    }

    public ChatViewModel addListener(OnChatListener onChatListener) {
        this.mListener = onChatListener;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void clearListener() {
        this.mListener = null;
    }

    public void receiverTransfer(String str) {
        try {
            this.mTransferData = (TransferData) new Gson().fromJson(str, (Class<Object>) TransferData.class);
            if (this.mTransferData == null) {
                return;
            }
            startTransfer();
        } catch (Exception e) {
            Logger.e("receiverTransfer error:" + e.getMessage());
        }
    }

    private void startTransfer() {
        if (this.isTransfer) {
            return;
        }
        this.isTransfer = true;
        switchHangupClickable(false);
        startTransferUI(new ChatTipView.CompleteCallback() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.1
            @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView.CompleteCallback
            public void onComplete() {
                if (ChatViewModel.this.mListener != null) {
                    ChatViewModel.this.mListener.onStartTransfer();
                    if (ChatViewModel.this.mHandler != null) {
                        ChatViewModel.this.mHandler.postDelayed(new Runnable() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ChatViewModel.this.switchHangupClickable(true);
                            }
                        }, 1000L);
                    }
                }
            }
        });
    }

    public static ChatViewModel get(Context context) {
        return new MobileChatVM(context);
    }

    public void doHangupClick() {
        if (HHUIUtils.isFastClick() || this.mListener == null) {
            return;
        }
        this.mListener.onHangUpClick();
    }

    public boolean isDoTransfer() {
        return this.isTransfer && this.mTransferData != null;
    }

    public void doTransferNet() {
        if (this.mTransferData == null) {
            return;
        }
        if (TextUtils.equals(this.mTransferData.command, Command.agent_transfer)) {
            doReCreateCall();
        } else {
            getTransferDoctor();
        }
    }

    private CallDC getCallDC() {
        if (this.mCallDC == null) {
            this.mCallDC = new CallDC(this.mContext);
        }
        return this.mCallDC;
    }

    private DoctorDetailDC getDoctorDC() {
        if (this.mDoctorDC == null) {
            this.mDoctorDC = new DoctorDetailDC(this.mContext);
        }
        return this.mDoctorDC;
    }

    private void getTransferDoctor() {
        this.mTips.showProgress(this.mContext);
        getDoctorDC().simpleDetail(this.mTransferData.transUuid, this.mTransferData.orderId, new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.2
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str) {
                ChatViewModel.this.mTips.hideProgress(ChatViewModel.this.mContext);
                if (z) {
                    ChatViewModel.this.doTransferNetResult();
                } else {
                    ChatViewModel.this.mTips.errorTips(ChatViewModel.this.mContext, str);
                }
                ChatViewModel.this.resumeTransferData();
            }
        });
    }

    private void doReCreateCall() {
        this.mTips.showProgress(this.mContext);
        getCallDC().call(CallDC.create(this.mTransferData.deptId, this.mTransferData.orderId), new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.3
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str) {
                ChatViewModel.this.mTips.hideProgress(ChatViewModel.this.mContext);
                if (z) {
                    ChatViewModel.this.doReCreateResult();
                } else {
                    ChatViewModel.this.mTips.errorTips(ChatViewModel.this.mContext, str);
                }
                ChatViewModel.this.resumeTransferData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeTransferData() {
        this.isTransfer = false;
        this.mTransferData = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doReCreateResult() {
        Call call = (Call) getCallDC().mData;
        if (getCallDC().haveData()) {
            if (this.mListener != null) {
                call.doctor.serviceTypeStatus = DoctorType.FAM_DOCTOR;
                this.mListener.onReCall(call.doctor, call.order.orderid);
            }
        } else if (this.mListener == null || call == null || call.order == null) {
        } else {
            this.mListener.onReLineUp(call.order.orderid);
        }
    }

    public boolean isChangeDoctor() {
        return this.isChangeDoctor;
    }

    public void requestChangeDoctor(final boolean z) {
        if (this.mListener == null || this.mListener.getCallConfig() == null) {
            return;
        }
        this.mTips.showProgress(this.mContext);
        HHNetFetch.request(this.mContext, new ChangeDoctorConfig(this.mListener.getOrderId()), new HHGsonRequest.OnNetListener<HHEmptyModel>() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.4
            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onSuccess(HHEmptyModel hHEmptyModel) {
                ChatViewModel.this.isChangeDoctor = true;
                ChatViewModel.this.mListener.onStartChangeDoctor(z);
            }

            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onFail(String str, int i) {
                ChatViewModel.this.isChangeDoctorInVideo = false;
                ChatViewModel.this.mTips.hideProgress(ChatViewModel.this.mContext);
                HHTips hHTips = ChatViewModel.this.mTips;
                Context context = ChatViewModel.this.mContext;
                hHTips.errorTips(context, "更换医生失败:" + str);
                if (!z || ChatViewModel.this.mListener == null) {
                    return;
                }
                ChatViewModel.this.mListener.doFinishVideo();
            }
        });
    }

    public void doChangeDoctor() {
        getCallDC().call(this.mListener.getCallConfig(), new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel.5
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str) {
                ChatViewModel.this.mTips.hideProgress(ChatViewModel.this.mContext);
                if (!z) {
                    ChatViewModel.this.mTips.errorTips(ChatViewModel.this.mContext, str);
                    ChatViewModel.this.mListener.doFinishVideo();
                } else {
                    if (ChatViewModel.this.isChangeDoctorInVideo) {
                        ChangeDoctorCache.setChange(ChatViewModel.this.mContext);
                    }
                    ChatViewModel.this.doReCreateResult();
                }
                ChatViewModel.this.isChangeDoctor = false;
                ChatViewModel.this.isChangeDoctorInVideo = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doTransferNetResult() {
        if (this.mListener != null) {
            ((HHDoctorInfo) getDoctorDC().mData).serviceTypeStatus = DoctorType.FAM_DOCTOR;
            this.mListener.onReCall((HHDoctorInfo) getDoctorDC().mData, this.mTransferData.orderId);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView.OnControllerInfoCallback
    public String getCertificateUrl() {
        return this.mListener.getCertificateUrl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void refreshHideController() {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mHideRun);
        }
        autoHideControl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void autoHideControl() {
        if (this.mHandler != null) {
            this.mHandler.postDelayed(this.mHideRun, 10000L);
        }
    }

    public void release() {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mHideRun);
        }
    }
}
