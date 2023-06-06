package com.hhmedic.android.sdk.module.video.widget.calling;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.uikit.widget.WaitView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LineupView extends FrameLayout {
    private ImageView mLineUpImage;
    private TextView mLineupTips;
    private WaitView mWaitView;

    public LineupView(@NonNull Context context) {
        super(context);
        init();
    }

    public LineupView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.hh_line_up_calling_layout, this);
        this.mLineupTips = (TextView) findViewById(R.id.lineup_tips);
        this.mLineUpImage = (ImageView) findViewById(R.id.lineup_ad);
        this.mWaitView = (WaitView) findViewById(R.id.wait);
    }

    public void addOnCancelClick(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            findViewById(R.id.cancel).setOnClickListener(onClickListener);
        }
    }

    public void updateTips(String str) {
        if (this.mLineupTips == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mLineupTips.setText(str);
    }

    public void loadLineupImage() {
        if (this.mLineUpImage == null) {
            return;
        }
        this.mLineUpImage.setImageResource(R.drawable.hp_call_default_loading);
        if (HHConfig.getImageLoader() != null) {
            HHConfig.getImageLoader().loadImage(getContext(), R.drawable.hp_call_default_loading, HHConfig.lineUrl, this.mLineUpImage);
        }
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
