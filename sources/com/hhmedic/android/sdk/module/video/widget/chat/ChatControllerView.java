package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ChatControllerView extends FrameLayout {
    private View mBottomLayout;
    protected String mCertificateUrl;
    protected CertificateWindow mCertificateView;
    private ChatTipView mChatTipView;
    private Button mHangupBtn;
    protected OnControllerInfoCallback mInfoProvider;
    protected Button mPhotosBtn;
    private TextView mTimeLabel;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnControllerInfoCallback {
        String getCertificateUrl();
    }

    public ChatControllerView(@NonNull Context context, OnControllerInfoCallback onControllerInfoCallback) {
        super(context);
        this.mInfoProvider = onControllerInfoCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initUI() {
        this.mBottomLayout = findViewById(R.id.bottom_menu_layout);
        this.mHangupBtn = (Button) findViewById(R.id.hand_up);
        this.mTimeLabel = (TextView) findViewById(R.id.time_label);
        this.mPhotosBtn = (Button) findViewById(R.id.photos);
        this.mChatTipView = (ChatTipView) findViewById(R.id.hh_chat_tip);
    }

    public void setHangupClickListener(View.OnClickListener onClickListener) {
        this.mHangupBtn.setOnClickListener(onClickListener);
    }

    public void setTakePhotoClickListener(View.OnClickListener onClickListener) {
        if (this.mPhotosBtn != null) {
            this.mPhotosBtn.setOnClickListener(onClickListener);
        }
    }

    public void switchControllerView() {
        this.mBottomLayout.bringToFront();
        if (this.mBottomLayout.getVisibility() == 0) {
            this.mBottomLayout.setVisibility(4);
        } else {
            this.mBottomLayout.setVisibility(0);
        }
    }

    public void switchHangupButton(boolean z) {
        this.mHangupBtn.setEnabled(z);
    }

    public void hideControllerView() {
        this.mBottomLayout.setVisibility(4);
    }

    public void updateVideoTime(String str) {
        if (this.mTimeLabel != null) {
            this.mTimeLabel.setText(str);
        }
    }

    public void connectTip(boolean z) {
        if (this.mChatTipView == null) {
            return;
        }
        if (z) {
            this.mChatTipView.showTip(getContext().getString(R.string.hh_vcs));
        } else {
            this.mChatTipView.hideTip();
        }
    }

    public void showNetErrorTip(boolean z) {
        if (this.mChatTipView == null) {
            return;
        }
        if (z) {
            this.mChatTipView.showTip(getContext().getString(R.string.hh_npt));
        } else {
            this.mChatTipView.hideTip();
        }
    }

    public void startTransferUI(ChatTipView.CompleteCallback completeCallback) {
        if (this.mChatTipView != null) {
            this.mChatTipView.startCounting(completeCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showCertificate() {
        createCertificateView().showCertificate(this);
    }

    private CertificateWindow createCertificateView() {
        if (this.mCertificateView == null) {
            this.mCertificateView = new CertificateWindow(getContext());
        }
        this.mCertificateView.bind(this.mCertificateUrl);
        return this.mCertificateView;
    }

    public void releaseUI() {
        this.mChatTipView.releaseUI();
        if (this.mCertificateView == null || !this.mCertificateView.isShowing()) {
            return;
        }
        p.b(this.mCertificateView);
        this.mCertificateView = null;
    }
}
