package com.hhmedic.android.sdk.module.video.viewModel.calling;

import android.content.Context;
import com.hhmedic.android.sdk.model.HHCallInfo;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.video.widget.calling.CallingView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class CallViewModel implements CallingView.CallingWidget {
    protected Context mContext;
    protected OnCallListener mListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCallListener {
        void onAcceptClick();

        void onCancelClick();

        void onRefuseClick();
    }

    public abstract void release();

    public abstract void stopUI();

    public abstract void updateTips(String str);

    public CallViewModel(Context context) {
        this.mContext = context;
    }

    public CallViewModel addListener(OnCallListener onCallListener) {
        this.mListener = onCallListener;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void clearListener() {
        this.mListener = null;
    }

    public static CallViewModel get(Context context, HHDoctorInfo hHDoctorInfo, boolean z) {
        if (hHDoctorInfo == null) {
            return new LineupViewModel(context);
        }
        return new DoctorCallViewModel(context, getCallDoctorInfo(hHDoctorInfo), z);
    }

    private static HHCallInfo getCallDoctorInfo(HHDoctorInfo hHDoctorInfo) {
        HHCallInfo hHCallInfo = new HHCallInfo();
        if (hHDoctorInfo != null) {
            hHCallInfo.doctorName = hHDoctorInfo.name;
            hHCallInfo.photoUrl = hHDoctorInfo.photourl;
        }
        return hHCallInfo;
    }
}
