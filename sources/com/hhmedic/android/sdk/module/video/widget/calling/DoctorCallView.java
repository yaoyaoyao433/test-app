package com.hhmedic.android.sdk.module.video.widget.calling;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hhmedic.android.sdk.uikit.widget.WaitView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DoctorCallView extends FrameLayout {
    private TextView mCallDes;
    private Button mCancelButton;
    private ImageView mDoctorIcon;
    private TextView mDoctorName;
    private View mIncoming;
    private WaitView mWaitView;

    public DoctorCallView(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.hh_doctor_calling_layout, this);
        this.mCallDes = (TextView) findViewById(R.id.des);
        this.mDoctorIcon = (ImageView) findViewById(R.id.icon);
        this.mDoctorName = (TextView) findViewById(R.id.name);
        this.mIncoming = findViewById(R.id.calling_bottom);
        this.mCancelButton = (Button) findViewById(R.id.cancel);
        this.mWaitView = (WaitView) findViewById(R.id.wait);
    }

    public void addCancelClick(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            findViewById(R.id.cancel).setOnClickListener(onClickListener);
        }
    }

    public void addAcceptClick(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            findViewById(R.id.accept).setOnClickListener(onClickListener);
        }
    }

    public void addRefuseClick(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            findViewById(R.id.refuse).setOnClickListener(onClickListener);
        }
    }

    public void updateCallDes(String str) {
        if (this.mCallDes != null) {
            this.mCallDes.setText(str);
        }
    }

    public ImageView getDoctorIcon() {
        return this.mDoctorIcon;
    }

    public TextView getDoctorName() {
        return this.mDoctorName;
    }

    public void setCaller(boolean z) {
        if (z) {
            this.mIncoming.setVisibility(8);
            this.mCancelButton.setVisibility(0);
            this.mCallDes.setText(R.string.hh_av_waiting_connect);
            return;
        }
        this.mIncoming.setVisibility(0);
        this.mCancelButton.setVisibility(8);
        this.mCallDes.setText(R.string.hh_av_accept_show_hint);
    }

    public void startWait() {
        if (this.mWaitView != null) {
            this.mWaitView.start();
        }
    }

    public void stopWait() {
        if (this.mWaitView != null) {
            this.mWaitView.stop();
        }
    }
}
