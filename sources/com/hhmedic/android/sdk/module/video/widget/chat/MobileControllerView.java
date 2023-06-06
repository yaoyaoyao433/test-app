package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatToolsView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MobileControllerView extends ChatControllerView implements ChatToolsView.ChatToolCallback {
    private Button mChangeDoctorBtn;
    private View mEmptyView;
    ShowToolsCallback mShowToolsCallback;
    private ImageView mShowToolsView;
    private Button mSwitchButton;
    private ChatToolsView mToolsView;
    private UploadView mUploadView;
    private ImageView mWaterMark;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ShowToolsCallback {
        void onShowTools();
    }

    public MobileControllerView(@NonNull Context context, ChatControllerView.OnControllerInfoCallback onControllerInfoCallback) {
        super(context, onControllerInfoCallback);
        initUI();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView
    public void initUI() {
        inflate(getContext(), R.layout.hh_chat_mobile_controller_layout, this);
        super.initUI();
        this.mSwitchButton = (Button) findViewById(R.id.change);
        this.mEmptyView = findViewById(R.id.empty_view_for_bottom);
        this.mShowToolsView = (ImageView) findViewById(R.id.showTools);
        this.mChangeDoctorBtn = (Button) findViewById(R.id.change_doctor);
        this.mUploadView = (UploadView) findViewById(R.id.upload);
        this.mShowToolsView.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.MobileControllerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobileControllerView.this.showTools();
            }
        });
        this.mToolsView = (ChatToolsView) findViewById(R.id.tools);
        this.mToolsView.setChatToolCallback(this);
        this.mWaterMark = (ImageView) findViewById(R.id.hh_sdk_watermark);
        showWaterMark(Caches.getCompanyLogo(getContext()));
    }

    public void setCameraSwitchClickListener(View.OnClickListener onClickListener) {
        if (this.mSwitchButton != null) {
            this.mSwitchButton.setOnClickListener(onClickListener);
        }
    }

    public void setFlashSwitchClickListener(View.OnClickListener onClickListener) {
        if (this.mToolsView != null) {
            this.mToolsView.setFlashSwitchClickListener(onClickListener);
        }
    }

    public void setChangeDoctorClickListener(View.OnClickListener onClickListener) {
        if (this.mChangeDoctorBtn != null) {
            this.mChangeDoctorBtn.setOnClickListener(onClickListener);
        }
    }

    public void setUploadClickListener(View.OnClickListener onClickListener) {
        if (this.mUploadView != null) {
            this.mUploadView.setOnClickListener(onClickListener);
        }
    }

    public void setShowToolsCallback(ShowToolsCallback showToolsCallback) {
        this.mShowToolsCallback = showToolsCallback;
    }

    public void refreshToolsView() {
        if (TextUtils.isEmpty(this.mInfoProvider.getCertificateUrl())) {
            this.mToolsView.hiddenJob();
            return;
        }
        this.mToolsView.showJob();
        this.mCertificateUrl = this.mInfoProvider.getCertificateUrl();
    }

    public void switchFlash(boolean z) {
        this.mToolsView.onFlash(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTools() {
        if (this.mShowToolsCallback != null) {
            this.mShowToolsCallback.onShowTools();
        }
        refreshToolsView();
        this.mToolsView.setVisibility(0);
        this.mEmptyView.setVisibility(8);
        this.mShowToolsView.setVisibility(8);
    }

    private void showWaterMark(String str) {
        if (TextUtils.isEmpty(str) || this.mWaterMark == null) {
            return;
        }
        try {
            if (HHConfig.getImageLoader() != null) {
                HHConfig.getImageLoader().loadImage(getContext(), R.drawable.hh_list_item_bg_with_border_bottom_pressed, str, this.mWaterMark);
            }
        } catch (Exception e) {
            Logger.e("showWaterMark error:" + e.getMessage());
        }
    }

    public boolean isToolsShowing() {
        return this.mToolsView != null && this.mToolsView.getVisibility() == 0;
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatToolsView.ChatToolCallback
    public void closeTools() {
        this.mToolsView.setVisibility(8);
        this.mEmptyView.setVisibility(0);
        this.mShowToolsView.setVisibility(0);
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView, com.hhmedic.android.sdk.module.video.widget.chat.ChatToolsView.ChatToolCallback
    public void showCertificate() {
        closeTools();
        super.showCertificate();
    }

    public void hideExpertCallWidgets() {
        if (this.mChangeDoctorBtn != null) {
            this.mChangeDoctorBtn.setVisibility(8);
        }
        if (this.mShowToolsView != null) {
            this.mShowToolsView.setVisibility(8);
        }
        if (this.mPhotosBtn != null) {
            this.mPhotosBtn.setVisibility(4);
        }
    }

    public void bindUploadInfo(MRecordInfo mRecordInfo) {
        if (this.mUploadView != null) {
            this.mUploadView.bind(mRecordInfo);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView
    public void releaseUI() {
        super.releaseUI();
        if (this.mUploadView != null) {
            this.mUploadView.release();
        }
    }

    public void hideChangeDoctor() {
        if (this.mChangeDoctorBtn != null) {
            this.mChangeDoctorBtn.setVisibility(8);
        }
    }

    public void resumeChangeDoctor() {
        if (this.mChangeDoctorBtn != null) {
            this.mChangeDoctorBtn.setVisibility(0);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.chat.ChatControllerView
    public void startTransferUI(ChatTipView.CompleteCallback completeCallback) {
        try {
            super.startTransferUI(completeCallback);
            hideChangeDoctor();
        } catch (Exception e) {
            Logger.e("startTransferUI error:" + e.getMessage());
        }
    }
}
