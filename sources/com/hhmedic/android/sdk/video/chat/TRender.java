package com.hhmedic.android.sdk.video.chat;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.video.rtc.Render;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TRender implements Render {
    private boolean cameraOpened = true;
    private TXCloudVideoView mBigLocal;
    private final Context mContext;
    private TXCloudVideoView mLocal;
    private TXCloudVideoView mRemote;
    private TXCloudVideoView mRemoteInviteDoctor;

    public TRender(Context context) {
        this.mContext = context;
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void initRender(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        if (frameLayout != null) {
            this.mLocal = new TXCloudVideoView(this.mContext);
            frameLayout.addView(this.mLocal, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (frameLayout2 != null) {
            this.mBigLocal = new TXCloudVideoView(this.mContext);
            frameLayout2.addView(this.mBigLocal, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (frameLayout3 != null) {
            this.mRemote = new TXCloudVideoView(this.mContext);
            frameLayout3.addView(this.mRemote, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void initInvitedDoctorRender(FrameLayout frameLayout) {
        if (frameLayout != null) {
            this.mRemoteInviteDoctor = new TXCloudVideoView(this.mContext);
            frameLayout.addView(this.mRemoteInviteDoctor, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void updateRemote(String str) {
        initRemote(str);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void showRemote(String str) {
        initRemote(str);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void showInviteDoctorRemote(String str) {
        initInviteDoctorRemote(str);
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void showLocal() {
        try {
            if (this.mLocal == null || !this.cameraOpened) {
                return;
            }
            TRTCCloud.sharedInstance(this.mContext).stopLocalPreview();
            TRTCCloud.sharedInstance(this.mContext).setLocalViewFillMode(0);
            TRTCCloud.sharedInstance(this.mContext).startLocalPreview(true, this.mLocal);
        } catch (Exception e) {
            Logger.e(e.toString());
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void showBigLocal() {
        try {
            if (this.mBigLocal != null) {
                TRTCCloud.sharedInstance(this.mContext).stopLocalPreview();
                TRTCCloud.sharedInstance(this.mContext).setLocalViewFillMode(0);
                TRTCCloud.sharedInstance(this.mContext).startLocalPreview(true, this.mBigLocal);
            }
        } catch (Exception e) {
            Logger.e(e.toString());
        }
    }

    private void initRemote(String str) {
        try {
            if (this.mRemote != null) {
                TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
                tRTCRenderParams.fillMode = 0;
                TRTCCloud.sharedInstance(this.mContext).setRemoteRenderParams(str, 0, tRTCRenderParams);
                TRTCCloud.sharedInstance(this.mContext).startRemoteView(str, 0, this.mRemote);
            }
        } catch (Exception e) {
            Logger.e("initRemote render error:" + e.getLocalizedMessage());
        }
    }

    private void initInviteDoctorRemote(String str) {
        try {
            if (this.mRemoteInviteDoctor != null) {
                TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
                tRTCRenderParams.fillMode = 0;
                TRTCCloud.sharedInstance(this.mContext).setRemoteRenderParams(str, 0, tRTCRenderParams);
                TRTCCloud.sharedInstance(this.mContext).startRemoteView(str, 0, this.mRemoteInviteDoctor);
            }
        } catch (Exception e) {
            Logger.e("initRemote render error:" + e.getLocalizedMessage());
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.rtc.Render
    public void onCameraOpened(boolean z) {
        this.cameraOpened = z;
        if (z) {
            TRTCCloud.sharedInstance(this.mContext).setLocalViewFillMode(0);
            TRTCCloud.sharedInstance(this.mContext).startLocalPreview(true, this.mLocal);
            return;
        }
        TRTCCloud.sharedInstance(this.mContext).stopLocalPreview();
    }
}
