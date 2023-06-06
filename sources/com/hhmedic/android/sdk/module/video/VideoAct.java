package com.hhmedic.android.sdk.module.video;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.NetEnvironmental;
import com.hhmedic.android.sdk.listener.HHVideoNotification;
import com.hhmedic.android.sdk.module.call.LocalState;
import com.hhmedic.android.sdk.module.medicRecord.RecordHelper;
import com.hhmedic.android.sdk.module.medicRecord.RecordUploadCallback;
import com.hhmedic.android.sdk.module.permission.PermissionUtils;
import com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView;
import com.hhmedic.android.sdk.module.video.data.Log;
import com.hhmedic.android.sdk.module.video.data.entity.HHSDKConfigModel;
import com.hhmedic.android.sdk.module.video.rtc.RTC;
import com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel;
import com.hhmedic.android.sdk.module.video.widget.calling.CallingView;
import com.hhmedic.android.sdk.module.video.widget.chat.ChatVideoView;
import com.hhmedic.android.sdk.uikit.utils.HHFileUtils;
import com.hhmedic.android.sdk.uikit.utils.HHStatusBarHelper;
import com.meituan.android.privacy.aop.a;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class VideoAct extends AppCompatActivity implements HHCustomCameraView.OnCustomCameraListener, VideoViewModel.OnVideoListener {
    private CallingView mCallView;
    private ChatVideoView mChatView;
    private HHCustomCameraView mCustomCameraView;
    private RecordHelper mRecordHelper;
    private VideoViewModel mViewModel;
    private boolean mCameraOpened = true;
    private boolean isInit = false;

    public abstract RTC createRTC();

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void doBrowserPhoto() {
    }

    protected abstract void doStartFunction();

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LocalState.getInstance().lockCall();
        setContentView(R.layout.activity_hh_avchat_layout);
        initView();
        initData(bundle);
        HHVideoNotification.onStart(createVM().getOrderId());
        sendCreateLog();
    }

    private void sendCreateLog() {
        try {
            Log.sendVideoRecord(this, createVM().getOrderId(), Maps.of("action", "onCreate"));
        } catch (Exception e) {
            Logger.e("sendCreateLog error:" + e.getMessage());
        }
    }

    private void keepScreenOn() {
        getWindow().addFlags(6815872);
    }

    @SuppressLint({"ResourceAsColor"})
    protected void initView() {
        keepScreenOn();
        HHStatusBarHelper.translucent(this);
        this.mCallView = (CallingView) findViewById(R.id.hh_sdk_call);
        this.mChatView = (ChatVideoView) findViewById(R.id.hh_sdk_chat);
        this.mCustomCameraView = (HHCustomCameraView) findViewById(R.id.hh_sdk_big_preview_layout);
        if (NetEnvironmental.isTest()) {
            findViewById(R.id.dev_tips_incoming).setVisibility(0);
        }
        findViewById(R.id.hh_open_camera_textview).setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.VideoAct.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VideoAct.this.openCameraClick(view);
            }
        });
    }

    protected void initData(@Nullable Bundle bundle) {
        if (bundle != null) {
            createVM().addObserver(false);
            createVM().resumeBundle(bundle);
            this.mViewModel.resumeTimer();
            createRecordHelper().resumeBundle(bundle);
        } else {
            createVM().init(getIntent().getBundleExtra(VideoBundle.KEY_BUNDLE));
        }
        createVM().addObserver(true);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        createVM().saveInstance(bundle);
        if (this.mRecordHelper != null) {
            this.mRecordHelper.saveBundle(bundle);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!this.isInit) {
            bindUI();
            doStart();
        }
        this.isInit = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VideoViewModel createVM() {
        if (this.mViewModel == null) {
            this.mViewModel = new VideoViewModel(this);
            this.mViewModel.addListener(this);
            this.mViewModel.addRTC(createRTC());
        }
        return this.mViewModel;
    }

    private void bindUI() {
        try {
            this.mCallView.bind(createVM().getCallVM());
            createVM().bindRender((FrameLayout) findViewById(R.id.hh_sdk_preview_layout), this.mCustomCameraView, this.mChatView.getRemoteParent());
            createVM().bindInviteDoctorRender((FrameLayout) findViewById(R.id.hh_sdk_invited_preview_layout));
        } catch (Exception e) {
            Logger.e("bindUI error:" + e.getMessage());
        }
    }

    private void doStart() {
        if (PermissionUtils.havePermission(this)) {
            doStartVideo();
        } else {
            doAlertPermission();
        }
    }

    private void doAlertPermission() {
        PermissionUtils.askForPermissions(this);
    }

    private void doAlertGalleryPermission() {
        try {
            new AlertDialog.a(this).a(R.string.hh_pt_f_t).b(R.string.hh_sd_r_f).a(getString(R.string.hh_aik), new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.VideoAct.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).a(true).b();
        } catch (Exception unused) {
            android.util.Log.e("HH", "doAlertGalleryPermission error");
        }
    }

    private void alertPermissionFail() {
        try {
            new AlertDialog.a(this).a(R.string.hh_pt_f_t).b(R.string.hh_pt_fail).a(getString(R.string.hh_pas), new DialogInterface.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.VideoAct.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    VideoAct.this.createVM().errorPermission();
                    VideoAct.this.goSettingClick();
                }
            }).a(false).b();
        } catch (Exception e) {
            createVM().errorPermission();
            createVM().errorTips();
            android.util.Log.e("HH", "alertPermissionFail error:" + e.getMessage());
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (f.a(this, i, strArr, iArr).b) {
            if (i == 10001) {
                if (PermissionUtils.haveReadSdcard(this)) {
                    return;
                }
                doAlertGalleryPermission();
            } else if (PermissionUtils.havePermission(this)) {
                doStartVideo();
            } else {
                alertPermissionFail();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goSettingClick() {
        PermissionUtils.goPermissionSetting(this);
    }

    private void doStartVideo() {
        if (createVM().isResumeFromCache()) {
            createVM().doResumeFromCache();
            return;
        }
        createVM().doStart();
        doStartFunction();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onLineup() {
        setLocalShow(8);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModel != null) {
            this.mViewModel.stopTimer();
            this.mViewModel.releaseUI();
        }
        createVM().addObserver(false);
        LocalState.getInstance().release();
        if (this.mRecordHelper != null) {
            this.mRecordHelper.release();
        }
        if (this.mCustomCameraView != null) {
            this.mCustomCameraView.release();
        }
        HHFileUtils.deleteUploadFiles(this);
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onFinishVideo() {
        createVM().release();
        if (!createVM().isVideoFail() && !createVM().isCancel()) {
            HHVideoNotification.onFinish(createVM().getChatTime() / 1000);
        }
        if (this.mRecordHelper != null) {
            this.mRecordHelper.release();
        }
        finish();
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onUpdateCallUI() {
        Logger.e("onUpdateCallUI");
        if (this.mCallView != null) {
            this.mCallView.setVisibility(0);
            this.mChatView.setVisibility(8);
            this.mCallView.bind(createVM().getCallVM());
            doStartFunction();
            setLocalShow(createVM().isLineUp() ? 8 : 0);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onUpdateAcceptUI() {
        Logger.e("onUpdateAcceptUI");
        if (this.mCallView == null || this.mChatView == null) {
            return;
        }
        this.mCallView.setVisibility(8);
        this.mChatView.setVisibility(0);
        this.mChatView.bind(createVM().getChatVM());
        createVM().getChatVM().bindUploadInfo(createRecordHelper().getMRecords());
        setLocalShow(0);
    }

    private void setLocalShow(int i) {
        View findViewById = findViewById(R.id.local_preview);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onShowRemote(boolean z) {
        if (this.mChatView != null) {
            this.mChatView.showRender(z);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onShowRemoteInviteDoctor(boolean z, String str) {
        View findViewById;
        if (this.mChatView == null || (findViewById = findViewById(R.id.hh_sdk_invited_preview_layout)) == null) {
            return;
        }
        findViewById.setVisibility(z ? 0 : 8);
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onCloseRemote() {
        View findViewById = findViewById(R.id.hh_sdk_invited_preview_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onShowTakeSheet() {
        createRecordHelper().doTakeSheet();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 10006) {
            if (this.mCameraOpened) {
                createVM().switch2Video();
            } else {
                createVM().sendCloseCameraMsg();
            }
        }
        createRecordHelper().onPhotos(i, i2, intent);
        a.b();
    }

    private RecordHelper createRecordHelper() {
        if (this.mRecordHelper == null) {
            this.mRecordHelper = new RecordHelper(this);
            this.mRecordHelper.setCallback(new RecordUploadCallback() { // from class: com.hhmedic.android.sdk.module.video.VideoAct.4
                @Override // com.hhmedic.android.sdk.module.medicRecord.RecordUploadCallback
                public void onSuccess() {
                    if (VideoAct.this.mRecordHelper != null) {
                        VideoAct.this.createVM().sendPhotos(VideoAct.this.mRecordHelper.getMRecords());
                    }
                }
            });
            this.mRecordHelper.setOnWays(new RecordHelper.OnPhotoWays() { // from class: com.hhmedic.android.sdk.module.video.VideoAct.5
                @Override // com.hhmedic.android.sdk.module.medicRecord.RecordHelper.OnPhotoWays
                public void onStart() {
                    VideoAct.this.createVM().switch2Audio();
                }
            });
        }
        this.mRecordHelper.bindOrderId(createVM().getOrderId());
        return this.mRecordHelper;
    }

    public boolean isCameraOpened() {
        return this.mCameraOpened;
    }

    public void startAnimation() {
        if (this.mCustomCameraView != null) {
            this.mCustomCameraView.setCustomCameraListener(this);
            this.mCustomCameraView.startScaleAnim(1);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public View onGetLocalView() {
        return findViewById(R.id.hh_sdk_preview_layout);
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public void showLocal(int i) {
        createVM().showLocal(i);
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public View onGetInviteView() {
        return findViewById(R.id.hh_sdk_invited_preview_layout);
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public void onCustomCameraSnapShot(String str) {
        if (this.mCameraOpened) {
            createVM().switch2Video();
        }
        createRecordHelper().dealSnapShotPhoto(str);
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public void onSetCameraFocusPosition(int i, int i2, boolean z) {
        if (this.mViewModel != null) {
            this.mViewModel.onSetCameraFocusPosition(i, i2, z);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public void onSwitchCamera() {
        if (this.mViewModel != null) {
            this.mViewModel.switchCamera();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.customCamera.HHCustomCameraView.OnCustomCameraListener
    public boolean onGetIsFrontCamera() {
        if (this.mViewModel != null) {
            return this.mViewModel.onGetIsFrontCamera();
        }
        return true;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.VideoViewModel.OnVideoListener
    public void onSetSDKConfigModel(HHSDKConfigModel hHSDKConfigModel) {
        if (hHSDKConfigModel != null) {
            createRecordHelper().setConfigModel(hHSDKConfigModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCameraClick(View view) {
        this.mCameraOpened = !this.mCameraOpened;
        if (view != null) {
            TextView textView = (TextView) view;
            textView.setText(this.mCameraOpened ? "关闭摄像头" : "打开摄像头");
            textView.setBackgroundColor(ContextCompat.getColor(this, this.mCameraOpened ? R.color.hh_sdk_close_camera : R.color.hh_sdk_black));
            Drawable drawable = getResources().getDrawable(this.mCameraOpened ? R.drawable.hh_camera_close : R.drawable.hh_camera_open);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView.setCompoundDrawables(drawable, null, null, null);
            if (this.mViewModel != null) {
                this.mViewModel.onCameraOpened(this.mCameraOpened);
            }
        }
    }
}
