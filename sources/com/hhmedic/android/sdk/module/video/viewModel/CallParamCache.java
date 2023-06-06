package com.hhmedic.android.sdk.module.video.viewModel;

import android.os.Bundle;
import com.hhmedic.android.sdk.module.call.data.CallDC;
import com.hhmedic.android.sdk.module.video.VideoBundle;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class CallParamCache {
    private int mCallType;
    private long mMemberId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallParamCache(Bundle bundle) {
        this.mCallType = 600002;
        if (bundle != null) {
            this.mCallType = bundle.getInt(VideoBundle.KEY_CALL_TYPE, 600002);
            this.mMemberId = bundle.getLong(VideoBundle.KEY_MEMBER_ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void save(Bundle bundle) {
        if (bundle != null) {
            bundle.putLong(VideoBundle.KEY_MEMBER_ID, this.mMemberId);
            bundle.putInt(VideoBundle.KEY_CALL_TYPE, this.mCallType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CallDC.CallConfig getCallConfig() {
        if (this.mMemberId > 0) {
            return CallDC.create(this.mMemberId);
        }
        return CallDC.createForType(this.mCallType);
    }
}
