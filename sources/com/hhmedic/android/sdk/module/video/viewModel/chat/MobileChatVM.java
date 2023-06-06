package com.hhmedic.android.sdk.module.video.viewModel.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
import com.hhmedic.android.sdk.module.video.viewModel.ChangeDoctorCache;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView;
import com.hhmedic.android.sdk.module.video.widget.chat.MobileControllerView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MobileChatVM extends ChatViewModel {
    private boolean isFlashOpen;
    private MobileControllerView mMCView;

    public MobileChatVM(Context context) {
        super(context);
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    @SuppressLint({"ClickableViewAccessibility"})
    public ChatControllerView getControllerView() {
        if (this.mMCView != null) {
            return this.mMCView;
        }
        this.mMCView = new MobileControllerView(this.mContext, this);
        this.mMCView.setHangupClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.doHangupClick();
            }
        });
        this.mMCView.setCameraSwitchClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.doSwitchCamera();
            }
        });
        this.mMCView.setTakePhotoClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.doTakePhoto();
            }
        });
        this.mMCView.setFlashSwitchClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.doSwitchFlash();
            }
        });
        this.mMCView.setOnTouchListener(new View.OnTouchListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return MobileChatVM.this.onTouchScreen();
            }
        });
        this.mMCView.setShowToolsCallback(new MobileControllerView.ShowToolsCallback() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.6
            @Override // com.hhmedic.android.sdk.module.video.widget.chat.MobileControllerView.ShowToolsCallback
            public void onShowTools() {
                MobileChatVM.this.refreshHideController();
            }
        });
        this.mMCView.setUploadClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.browserPhotos();
            }
        });
        this.mMCView.setChangeDoctorClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileChatVM.this.changeDoctorPop();
            }
        });
        if (this.isExpertCall) {
            this.mMCView.hideExpertCallWidgets();
        }
        return this.mMCView;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void connect() {
        super.autoHideControl();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void updateVideoTime(String str) {
        if (this.mMCView != null) {
            this.mMCView.updateVideoTime(str);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void showConnectTip(boolean z) {
        if (this.mMCView != null) {
            this.mMCView.connectTip(z);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void showNetPoorTip(boolean z) {
        if (this.mMCView != null) {
            this.mMCView.showNetErrorTip(z);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void startTransferUI(ChatTipView.CompleteCallback completeCallback) {
        if (this.mMCView != null) {
            this.mMCView.startTransferUI(completeCallback);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void bindUploadInfo(MRecordInfo mRecordInfo) {
        if (this.mMCView != null) {
            this.mMCView.bindUploadInfo(mRecordInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSwitchCamera() {
        if (this.mListener == null) {
            return;
        }
        refreshHideController();
        this.mListener.onSwitchCameraClick();
        this.isFlashOpen = false;
        if (this.mMCView != null) {
            this.mMCView.switchFlash(this.isFlashOpen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSwitchFlash() {
        if (this.mListener == null) {
            return;
        }
        if (this.mListener.onSwitchFlashClick(!this.isFlashOpen)) {
            this.isFlashOpen = !this.isFlashOpen;
        }
        if (this.mMCView != null) {
            this.mMCView.switchFlash(this.isFlashOpen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doTakePhoto() {
        refreshHideController();
        if (this.mListener != null) {
            this.mListener.doTakePhoto();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void browserPhotos() {
        refreshHideController();
        if (this.mListener != null) {
            this.mListener.doBrowserPhoto();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onTouchScreen() {
        this.mMCView.bringToFront();
        if (this.mMCView.isToolsShowing()) {
            this.mMCView.closeTools();
            return false;
        }
        this.mMCView.switchControllerView();
        refreshHideController();
        return false;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    protected void hideController() {
        if (this.mMCView != null) {
            this.mMCView.hideControllerView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeDoctorPop() {
        refreshHideController();
        if (ChangeDoctorCache.isChangeDoctorInOneDay(this.mContext)) {
            new AlertDialog.a(this.mContext).b(R.string.hh_acdft).a(R.string.hh_aik, new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).a(true).b();
        } else {
            new AlertDialog.a(this.mContext).b(R.string.hh_acdt).b(R.string.hh_change_doctor_ok, new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.11
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    MobileChatVM.this.isChangeDoctorInVideo = true;
                    MobileChatVM.this.requestChangeDoctor(false);
                }
            }).a(R.string.hh_cancel, new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.MobileChatVM.10
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).a(true).b();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void switchHangupClickable(boolean z) {
        if (this.mMCView != null) {
            this.mMCView.switchHangupButton(z);
            this.mMCView.resumeChangeDoctor();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel
    public void release() {
        super.release();
        try {
            clearListener();
            if (this.mMCView != null) {
                this.mMCView.releaseUI();
            }
        } catch (Exception e) {
            Logger.e("on MobileChatVm error:" + e.getLocalizedMessage());
        }
    }
}
