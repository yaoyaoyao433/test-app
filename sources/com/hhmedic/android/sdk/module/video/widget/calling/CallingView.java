package com.hhmedic.android.sdk.module.video.widget.calling;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallingView extends FrameLayout {
    private FrameLayout mContentLayout;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface CallingWidget {
        View getCallingContent();
    }

    public CallingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.hh_calling_layout, this);
        this.mContentLayout = (FrameLayout) findViewById(R.id.calling_content);
    }

    public void bind(CallingWidget callingWidget) {
        View callingContent;
        if (callingWidget == null || (callingContent = callingWidget.getCallingContent()) == null) {
            return;
        }
        this.mContentLayout.removeAllViews();
        this.mContentLayout.addView(callingContent);
    }
}
