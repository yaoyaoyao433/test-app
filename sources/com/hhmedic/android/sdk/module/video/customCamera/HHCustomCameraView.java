package com.hhmedic.android.sdk.module.video.customCamera;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hhmedic.android.sdk.uikit.utils.HHBitmapUtils;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCustomCameraView extends FrameLayout implements View.OnClickListener {
    public static final int SCALE_IN = 1;
    public static final int SCALE_OUT = 2;
    private Button mCancelButton;
    private OnCustomCameraListener mCustomCameraListener;
    private Button mPhotoButton;
    private ImageView mPreviewView;
    private Button mRetakeButton;
    private Button mSendButton;
    private Button mSwitchButton;
    private TextView mTipsTextView;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCustomCameraListener {
        void onCustomCameraSnapShot(String str);

        boolean onGetIsFrontCamera();

        View onGetLocalView();

        void onSetCameraFocusPosition(int i, int i2, boolean z);

        void onSwitchCamera();

        void showLocal(int i);
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ScaleEnum {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public HHCustomCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void setCustomCameraListener(OnCustomCameraListener onCustomCameraListener) {
        this.mCustomCameraListener = onCustomCameraListener;
    }

    private void init() {
        inflate(getContext(), R.layout.hh_custom_camera_layout, this);
        this.mPreviewView = (ImageView) findViewById(R.id.hh_preview_imageview);
        this.mPhotoButton = (Button) findViewById(R.id.hh_photo_button);
        this.mSendButton = (Button) findViewById(R.id.hh_send_button);
        this.mRetakeButton = (Button) findViewById(R.id.hh_retake_button);
        this.mCancelButton = (Button) findViewById(R.id.hh_cancel_button);
        this.mSwitchButton = (Button) findViewById(R.id.hh_switch_button);
        this.mSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCustomCameraView.this.doSwitchCamera();
            }
        });
        this.mTipsTextView = (TextView) findViewById(R.id.hh_tips_text);
        this.mCancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCustomCameraView.this.startScaleAnim(2);
            }
        });
        this.mPhotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCustomCameraView.this.SnapShot();
            }
        });
        this.mSendButton.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCustomCameraView.this.sendAction();
            }
        });
        this.mRetakeButton.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCustomCameraView.this.retakeAction();
            }
        });
        setOnClickListener(this);
    }

    public void startScaleAnim(int i) {
        try {
            if (this.mCustomCameraListener != null) {
                if (i == 1) {
                    showBigPreview(true);
                    this.mCustomCameraListener.onGetLocalView().setVisibility(8);
                    this.mCustomCameraListener.showLocal(1);
                    if (this.mCustomCameraListener.onGetIsFrontCamera()) {
                        this.mCustomCameraListener.onSwitchCamera();
                        return;
                    }
                    return;
                }
                reverse();
                this.mCustomCameraListener.onGetLocalView().setVisibility(0);
                this.mCustomCameraListener.showLocal(2);
                if (this.mCustomCameraListener.onGetIsFrontCamera()) {
                    return;
                }
                this.mCustomCameraListener.onSwitchCamera();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showBigPreview(boolean z) {
        int i = z ? 0 : 8;
        try {
            setVisibility(i);
            this.mPhotoButton.setVisibility(i);
            this.mCancelButton.setVisibility(i);
            this.mTipsTextView.setVisibility(i);
            this.mSwitchButton.setVisibility(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reverse() {
        this.mPhotoButton.setVisibility(8);
        this.mCancelButton.setVisibility(8);
        showBigPreview(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void SnapShot() {
        TRTCCloud.sharedInstance(getContext()).snapshotVideo(null, 0, new TRTCCloudListener.TRTCSnapshotListener() { // from class: com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.6
            @Override // com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener
            public void onSnapshotComplete(Bitmap bitmap) {
                if (bitmap != null) {
                    HHCustomCameraView.this.mPhotoButton.setVisibility(8);
                    HHCustomCameraView.this.mCancelButton.setVisibility(8);
                    HHCustomCameraView.this.mTipsTextView.setVisibility(8);
                    HHCustomCameraView.this.mSwitchButton.setVisibility(8);
                    HHCustomCameraView.this.mRetakeButton.setVisibility(0);
                    HHCustomCameraView.this.mSendButton.setVisibility(0);
                    HHCustomCameraView.this.mPreviewView.setVisibility(0);
                    HHCustomCameraView.this.mPreviewView.setImageBitmap(bitmap);
                    HHBitmapUtils.saveBitmap("snapshot.jpg", bitmap, HHCustomCameraView.this.getContext());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retakeAction() {
        this.mPhotoButton.setVisibility(0);
        this.mCancelButton.setVisibility(0);
        this.mSwitchButton.setVisibility(0);
        this.mPreviewView.setVisibility(8);
        this.mRetakeButton.setVisibility(8);
        this.mSendButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAction() {
        this.mSendButton.setVisibility(8);
        this.mPreviewView.setVisibility(8);
        this.mRetakeButton.setVisibility(8);
        this.mCustomCameraListener.onCustomCameraSnapShot("snapshot.jpg");
        startScaleAnim(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSwitchCamera() {
        if (this.mCustomCameraListener != null) {
            this.mCustomCameraListener.onSwitchCamera();
        }
    }

    public void release() {
        this.mCustomCameraListener = null;
    }
}
