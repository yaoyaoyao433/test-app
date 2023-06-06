package com.hhmedic.android.sdk.module.video.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.uikit.utils.HHUIUtils;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeedbackView extends FrameLayout {
    private EditText mContent;
    private OnFeedbackNext mNext;
    private EditText mPhone;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnFeedbackNext {
        void onNext(String str, String str2);
    }

    public FeedbackView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    private void initView() {
        try {
            inflate(getContext(), R.layout.hh_comment_feedback_layout, this);
            findViewById(R.id.hh_commit_btn).setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.FeedbackView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FeedbackView.this.doCommentClick();
                }
            });
            this.mContent = (EditText) findViewById(R.id.hh_content);
            this.mPhone = (EditText) findViewById(R.id.phone);
        } catch (Exception e) {
            Logger.e("FeedbackView error:" + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCommentClick() {
        if (TextUtils.isEmpty(this.mContent.getText())) {
            new HHTips().errorTips(getContext(), getContext().getString(R.string.hh_cce));
        } else if (this.mNext != null) {
            HHUIUtils.closeSoftKeyboard(getContext());
            Editable text = this.mContent.getText();
            if (text != null) {
                setVisibility(8);
                this.mNext.onNext(text.toString(), getPhone());
            }
        }
    }

    private String getPhone() {
        Editable text = this.mPhone.getText();
        return text != null ? text.toString() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addNext(OnFeedbackNext onFeedbackNext) {
        this.mNext = onFeedbackNext;
    }
}
