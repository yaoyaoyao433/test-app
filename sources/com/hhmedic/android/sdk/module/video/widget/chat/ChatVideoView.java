package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.hhmedic.android.sdk.module.video.viewModel.chat.ChatViewModel;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChatVideoView extends FrameLayout {
    private ChatControllerView mChatControllerView;
    private FrameLayout mLargeSurfaceContainer;

    public ChatVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_chat_video_layout, this);
        initWidget();
    }

    private void initWidget() {
        this.mLargeSurfaceContainer = (FrameLayout) findViewById(R.id.large_size_preview);
    }

    public FrameLayout getRemoteParent() {
        return this.mLargeSurfaceContainer;
    }

    public void showRender(boolean z) {
        View findViewById = findViewById(R.id.hh_notification_text);
        if (z) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
    }

    public void bind(ChatViewModel chatViewModel) {
        if (this.mChatControllerView != null || chatViewModel == null || chatViewModel.getControllerView() == null) {
            return;
        }
        this.mChatControllerView = chatViewModel.getControllerView();
        addView(this.mChatControllerView);
    }
}
