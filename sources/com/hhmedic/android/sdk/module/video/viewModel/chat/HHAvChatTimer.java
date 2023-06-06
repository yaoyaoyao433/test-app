package com.hhmedic.android.sdk.module.video.viewModel.chat;

import android.content.Context;
import android.os.Handler;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.uikit.Handlers;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHAvChatTimer {
    private static final long TIME_SPLIT = 1000;
    private final Handler mHandler;
    private OnTimer mListener;
    private long mSecond;
    private TimerTask mTask;
    private Timer mTimer;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnTimer {
        void onTimer(long j);
    }

    public HHAvChatTimer(Context context, OnTimer onTimer) {
        this.mListener = onTimer;
        this.mHandler = Handlers.newHandler(context);
    }

    private void cancelTimer() {
        if (this.mTimer != null) {
            this.mTimer.cancel();
            this.mTimer = null;
        }
        if (this.mTask != null) {
            this.mTask.cancel();
            this.mTask = null;
        }
    }

    public void stop() {
        cancelTimer();
    }

    public void start(long j) {
        try {
            cancelTimer();
            this.mSecond = j;
            this.mTimer = new Timer(true);
            this.mTimer.schedule(getTask(), 0L, 1000L);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public void release() {
        this.mListener = null;
    }

    private TimerTask getTask() {
        if (this.mTask == null) {
            this.mTask = new TimerTask() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.HHAvChatTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    HHAvChatTimer.this.mHandler.post(new Runnable() { // from class: com.hhmedic.android.sdk.module.video.viewModel.chat.HHAvChatTimer.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HHAvChatTimer.this.callback();
                        }
                    });
                }
            };
        }
        return this.mTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback() {
        this.mSecond += 1000;
        if (this.mListener != null) {
            this.mListener.onTimer(this.mSecond);
        }
    }
}
