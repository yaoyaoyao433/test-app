package com.hhmedic.android.sdk.module.video.comment;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.video.data.entity.Question;
import com.hhmedic.android.sdk.uikit.Handlers;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuestionView extends FrameLayout {
    private boolean isSelected;
    private TextView mContent;
    private final Runnable mDelay;
    private final Handler mHandler;
    private OnQuestionNext mNext;
    private Button mOneBtn;
    private Button mTwoBtn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnQuestionNext {
        void onNext(String str);
    }

    public QuestionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSelected = false;
        this.mDelay = new Runnable() { // from class: com.hhmedic.android.sdk.module.video.comment.QuestionView.5
            @Override // java.lang.Runnable
            public void run() {
                QuestionView.this.doNext();
            }
        };
        this.mHandler = Handlers.newHandler(context);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_comment_question_view, this);
        this.mOneBtn = (Button) findViewById(R.id.hh_answer_one);
        this.mTwoBtn = (Button) findViewById(R.id.hh_answer_two);
        this.mContent = (TextView) findViewById(R.id.hh_content);
        this.mOneBtn.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.QuestionView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuestionView.this.isSelected) {
                    return;
                }
                QuestionView.this.isSelected = true;
                QuestionView.this.mOneBtn.setSelected(true);
                QuestionView.this.startRightAnimation(true);
                QuestionView.this.startLeftAnimation(false);
                QuestionView.this.delayCall();
            }
        });
        this.mTwoBtn.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.QuestionView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuestionView.this.isSelected) {
                    return;
                }
                QuestionView.this.isSelected = true;
                QuestionView.this.mTwoBtn.setSelected(true);
                QuestionView.this.startLeftAnimation(true);
                QuestionView.this.startRightAnimation(false);
                QuestionView.this.delayCall();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bindData(Question question) {
        if (question != null) {
            this.mContent.setText(question.content);
            this.mOneBtn.setText(question.answerOne);
            this.mTwoBtn.setText(question.answerTwo);
        }
    }

    String getSelectedText() {
        if (this.mOneBtn.isSelected()) {
            return this.mOneBtn.getText().toString();
        }
        return this.mTwoBtn.isSelected() ? this.mTwoBtn.getText().toString() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLeftAnimation(boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), z ? R.anim.hh_cql : R.anim.hh_cqlna);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.hhmedic.android.sdk.module.video.comment.QuestionView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        loadAnimation.setFillAfter(true);
        this.mOneBtn.startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRightAnimation(boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), z ? R.anim.hh_cqr : R.anim.hh_cqrna);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.hhmedic.android.sdk.module.video.comment.QuestionView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        loadAnimation.setFillAfter(true);
        this.mTwoBtn.startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayCall() {
        if (this.mHandler != null) {
            this.mHandler.postDelayed(this.mDelay, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doNext() {
        setVisibility(8);
        if (this.mNext != null) {
            this.mNext.onNext(getSelectedText());
            this.mNext = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addOnNext(OnQuestionNext onQuestionNext) {
        this.mNext = onQuestionNext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void release() {
        try {
            if (this.mHandler != null) {
                this.mHandler.removeCallbacks(this.mDelay);
            }
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }
}
