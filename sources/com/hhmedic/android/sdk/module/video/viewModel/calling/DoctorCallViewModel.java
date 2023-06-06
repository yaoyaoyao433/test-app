package com.hhmedic.android.sdk.module.video.viewModel.calling;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.model.HHCallInfo;
import com.hhmedic.android.sdk.module.video.widget.calling.DoctorCallView;
import com.hhmedic.android.sdk.uikit.utils.HHUIUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DoctorCallViewModel extends CallViewModel {
    private boolean isCaller;
    private DoctorCallView mCallView;
    private final HHCallInfo mDoctorInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DoctorCallViewModel(Context context, HHCallInfo hHCallInfo, boolean z) {
        super(context);
        this.isCaller = true;
        this.isCaller = z;
        this.mDoctorInfo = hHCallInfo;
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public void updateTips(String str) {
        if (this.mCallView != null) {
            this.mCallView.updateCallDes(str);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public void release() {
        if (this.mCallView != null) {
            this.mCallView.stopWait();
            clearListener();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public void stopUI() {
        if (this.mCallView != null) {
            this.mCallView.stopWait();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.calling.CallingView.CallingWidget
    public View getCallingContent() {
        this.mCallView = new DoctorCallView(this.mContext);
        bind();
        return this.mCallView;
    }

    private void bind() {
        this.mCallView.addAcceptClick(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.calling.DoctorCallViewModel.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HHUIUtils.isFastClick() || DoctorCallViewModel.this.mListener == null) {
                    return;
                }
                DoctorCallViewModel.this.mListener.onAcceptClick();
            }
        });
        this.mCallView.addCancelClick(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.calling.DoctorCallViewModel.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HHUIUtils.isFastClick() || DoctorCallViewModel.this.mListener == null) {
                    return;
                }
                DoctorCallViewModel.this.mListener.onCancelClick();
            }
        });
        this.mCallView.addRefuseClick(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.calling.DoctorCallViewModel.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HHUIUtils.isFastClick() || DoctorCallViewModel.this.mListener == null) {
                    return;
                }
                DoctorCallViewModel.this.mListener.onRefuseClick();
            }
        });
        this.mCallView.setCaller(this.isCaller);
        if (this.mDoctorInfo != null) {
            TextView doctorName = this.mCallView.getDoctorName();
            if (doctorName != null && !TextUtils.isEmpty(this.mDoctorInfo.doctorName)) {
                doctorName.setText(this.mDoctorInfo.doctorName);
            }
            ImageView doctorIcon = this.mCallView.getDoctorIcon();
            if (doctorIcon != null) {
                doctorIcon.setImageResource(R.drawable.hp_call_default_loading);
                if (HHConfig.getImageLoader() != null && !TextUtils.isEmpty(this.mDoctorInfo.photoUrl)) {
                    HHConfig.getImageLoader().loadImage(this.mContext, R.drawable.hp_call_default_loading, this.mDoctorInfo.photoUrl, doctorIcon);
                }
            }
        }
        this.mCallView.startWait();
    }
}
