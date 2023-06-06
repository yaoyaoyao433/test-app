package com.hhmedic.android.sdk.uikit.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.meituan.robust.common.CommonConstant;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WaitView extends AppCompatTextView {
    private static final long LOOP_TIMER = 500;
    private static final int STATE_ONE = 10;
    private static final int STATE_THREE = 12;
    private static final int STATE_TWO = 11;
    @SuppressLint({"HandlerLeak"})
    private final Handler mHandler;
    private int mState;
    private TimerTask mTask;
    private Timer mTimer;
    private final Runnable mUITask;

    public WaitView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mState = 10;
        this.mUITask = new TimerTask() { // from class: com.hhmedic.android.sdk.uikit.widget.WaitView.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                WaitView.this.setText(WaitView.this.stateStr());
                WaitView.this.nextState();
            }
        };
        this.mHandler = Handlers.newHandler(context);
    }

    public void start() {
        try {
            Logger.e("WaitView start");
            stop();
            this.mTimer = new Timer();
            this.mTimer.schedule(getTimerTask(), 0L, 500L);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    private TimerTask getTimerTask() {
        if (this.mTask == null) {
            this.mTask = new TimerTask() { // from class: com.hhmedic.android.sdk.uikit.widget.WaitView.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    WaitView.this.updateUI();
                }
            };
        }
        return this.mTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUI() {
        if (this.mHandler != null) {
            this.mHandler.post(this.mUITask);
        }
    }

    public void stop() {
        Logger.e("WaitView stop");
        try {
            if (this.mTimer != null) {
                this.mTimer.cancel();
                this.mTimer = null;
                Logger.e("WaitView stop timer");
            }
            if (this.mTask != null) {
                this.mTask.cancel();
                this.mTask = null;
                Logger.e("WaitView stop task");
            }
            if (this.mHandler != null) {
                this.mHandler.removeCallbacks(this.mUITask);
            }
        } catch (Exception unused) {
            Logger.e("WaitView stop error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String stateStr() {
        switch (this.mState) {
            case 10:
                return CommonConstant.Symbol.DOT;
            case 11:
                return "..";
            case 12:
                return "...";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nextState() {
        switch (this.mState) {
            case 10:
                this.mState = 11;
                return;
            case 11:
                this.mState = 12;
                return;
            default:
                this.mState = 10;
                return;
        }
    }
}
