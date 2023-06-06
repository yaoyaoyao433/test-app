package com.hhmedic.android.sdk.video.chat;

import com.hhmedic.android.sdk.module.video.VideoAct;
import com.hhmedic.android.sdk.module.video.rtc.RTC;
import com.hhmedic.android.sdk.tim.NewMessage;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RtcVideoAct extends VideoAct implements OnRtcRemoteListener {
    private TRTC mRTC;

    @Override // com.hhmedic.android.sdk.module.video.VideoAct
    public void doStartFunction() {
        if (createVM().isLineUp()) {
            NewMessage.getInstance(this).start(createVM().getOrderId(), true);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.VideoAct
    public RTC createRTC() {
        if (this.mRTC == null) {
            this.mRTC = new TRTC(this);
            this.mRTC.addRemoteListener(this);
        }
        return this.mRTC;
    }

    @Override // com.hhmedic.android.sdk.video.chat.OnRtcRemoteListener
    public void onLoadRtcRemote(boolean z) {
        super.onShowRemote(z);
    }
}
