package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.model.HHCaseImageModel;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadView extends FrameLayout {
    private TextView mCountView;
    private ImageView mCoverView;
    private View mErrorView;
    private MRecordInfo mInfos;
    private ProgressBar mProgressView;

    public UploadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_av_upload_photo_layout, this);
        this.mCoverView = (ImageView) findViewById(R.id.cover);
        this.mErrorView = findViewById(R.id.error_tips_layout);
        this.mCountView = (TextView) findViewById(R.id.count);
        this.mProgressView = (ProgressBar) findViewById(R.id.progress);
    }

    public void bind(MRecordInfo mRecordInfo) {
        if (mRecordInfo != null) {
            this.mInfos = mRecordInfo;
            this.mInfos.addListener(new MRecordInfo.OnUpdate() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.UploadView.1
                @Override // com.hhmedic.android.sdk.module.medicRecord.MRecordInfo.OnUpdate
                public void update() {
                    UploadView.this.updateUI();
                }
            });
            updateUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUI() {
        try {
            if (this.mInfos == null) {
                return;
            }
            if (this.mInfos.getPhotos().isEmpty()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            HHCaseImageModel lastPhoto = this.mInfos.getLastPhoto();
            this.mCountView.setText(String.valueOf(this.mInfos.getPhotos().size()));
            int uploadProgress = this.mInfos.getUploadProgress();
            this.mProgressView.setProgress(uploadProgress);
            if (this.mInfos.isError()) {
                this.mErrorView.setVisibility(0);
                this.mProgressView.setVisibility(8);
            } else {
                this.mErrorView.setVisibility(8);
                this.mProgressView.setVisibility(0);
            }
            if (uploadProgress == 100) {
                this.mProgressView.setVisibility(8);
            }
            if (lastPhoto == null || HHConfig.getImageLoader() == null) {
                return;
            }
            HHConfig.getImageLoader().loadImage(getContext(), R.drawable.hp_call_default_loading, lastPhoto.getSmallUrl(), this.mCoverView);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void release() {
        if (this.mInfos != null) {
            this.mInfos.release();
        }
    }
}
