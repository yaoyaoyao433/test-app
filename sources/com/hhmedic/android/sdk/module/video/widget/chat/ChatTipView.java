package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.HHActivityCompat;
import com.hhmedic.android.sdk.base.utils.Logger;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChatTipView extends FrameLayout {
    private static final int MAX_S = 3;
    private int mLastTime;
    private TextView mTipsText;
    private Timer mTipsTimer;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface CompleteCallback {
        void onComplete();
    }

    static /* synthetic */ int access$010(ChatTipView chatTipView) {
        int i = chatTipView.mLastTime;
        chatTipView.mLastTime = i - 1;
        return i;
    }

    public ChatTipView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastTime = 3;
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_chat_tip_layout, this);
        this.mTipsText = (TextView) findViewById(R.id.tips);
        hideSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSelf() {
        setVisibility(0);
    }

    private void hideSelf() {
        setVisibility(8);
    }

    public void showTip(String str) {
        releaseUI();
        showSelf();
        this.mTipsText.setText(str);
    }

    public void hideTip() {
        hideSelf();
    }

    public void startCounting(final CompleteCallback completeCallback) {
        releaseUI();
        showSelf();
        this.mTipsTimer = new Timer(true);
        TextView textView = this.mTipsText;
        textView.setText(this.mLastTime + "秒后将为你转呼");
        this.mTipsTimer.schedule(new TimerTask() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (ChatTipView.this.mLastTime <= 0) {
                    ChatTipView.this.post(new Runnable() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ChatTipView.this.releaseUI();
                            completeCallback.onComplete();
                        }
                    });
                } else {
                    ChatTipView.this.post(new Runnable() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.ChatTipView.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ChatTipView.this.showSelf();
                            TextView textView2 = ChatTipView.this.mTipsText;
                            textView2.setText(ChatTipView.this.mLastTime + "秒后将为你转呼");
                            ChatTipView.access$010(ChatTipView.this);
                        }
                    });
                }
            }
        }, 0L, 1000L);
    }

    public void stopCounting() {
        if (this.mTipsTimer != null) {
            this.mTipsTimer.cancel();
            this.mTipsTimer = null;
        }
        this.mLastTime = 3;
    }

    public void releaseUI() {
        try {
            hideSelf();
            hideTip();
            stopCounting();
            if (HHActivityCompat.isDead(getContext())) {
            }
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }
}
