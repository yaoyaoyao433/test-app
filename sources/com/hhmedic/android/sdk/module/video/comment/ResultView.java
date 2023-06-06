package com.hhmedic.android.sdk.module.video.comment;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ExposeAction;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.hhmedic.android.sdk.uikit.widget.HHCircleTickView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResultView extends FrameLayout {
    private final Runnable mGoodTask;
    private HHCircleTickView mGoodTips;
    private final Handler mHandler;
    private OnResultNext mNext;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface OnResultNext {
        void onClose();
    }

    public ResultView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mGoodTask = new Runnable() { // from class: com.hhmedic.android.sdk.module.video.comment.ResultView.1
            @Override // java.lang.Runnable
            public void run() {
                if (ResultView.this.mNext != null) {
                    ResultView.this.mNext.onClose();
                }
            }
        };
        this.mHandler = Handlers.newHandler(context);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_comment_result_layout, this);
        this.mGoodTips = (HHCircleTickView) findViewById(R.id.thanks_tick);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addNext(OnResultNext onResultNext) {
        this.mNext = onResultNext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void show() {
        this.mGoodTips.startDraw();
        if (this.mHandler != null) {
            this.mHandler.postDelayed(this.mGoodTask, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }
}
