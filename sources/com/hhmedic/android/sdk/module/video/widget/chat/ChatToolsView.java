package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChatToolsView extends FrameLayout {
    private ChatToolCallback chatToolCallback;
    private ImageView mFlashIcon;
    private View mJobLayout;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ChatToolCallback {
        void closeTools();

        void showCertificate();
    }

    public ChatToolsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_chat_tools_layout, this);
        this.mFlashIcon = (ImageView) findViewById(R.id.open_result);
        this.mJobLayout = findViewById(R.id.job_icon_layout);
        this.mJobLayout.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.ChatToolsView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChatToolsView.this.chatToolCallback.showCertificate();
            }
        });
        findViewById(R.id.hh_sdk_close).setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.ChatToolsView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChatToolsView.this.chatToolCallback.closeTools();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hiddenJob() {
        this.mJobLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showJob() {
        this.mJobLayout.setVisibility(0);
    }

    public void setChatToolCallback(ChatToolCallback chatToolCallback) {
        this.chatToolCallback = chatToolCallback;
    }

    public void setFlashSwitchClickListener(View.OnClickListener onClickListener) {
        findViewById(R.id.flash_layout).setOnClickListener(onClickListener);
    }

    public void onFlash(boolean z) {
        this.mFlashIcon.setImageResource(z ? R.drawable.hp_flash_open : R.drawable.hp_flash_close);
    }
}
