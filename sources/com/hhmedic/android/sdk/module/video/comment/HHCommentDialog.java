package com.hhmedic.android.sdk.module.video.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.video.comment.FeedbackView;
import com.hhmedic.android.sdk.module.video.comment.QuestionView;
import com.hhmedic.android.sdk.module.video.comment.RatingView;
import com.hhmedic.android.sdk.module.video.comment.ResultView;
import com.hhmedic.android.sdk.module.video.data.CommentDC;
import com.hhmedic.android.sdk.module.video.data.entity.CallResult;
import com.hhmedic.android.sdk.uikit.widget.dialog.HHBottomDialog;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCommentDialog extends HHBottomDialog {
    private CommentDC mCommentDC;
    private CallResult mData;
    private Button mFeedbackBtn;
    private FeedbackView mFeedbackView;
    private OnCommentListener mListener;
    private QuestionView mQuestionView;
    private RatingView mRatingView;
    private ResultView mResultView;
    private TextView mTitleView;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCommentListener {
        void onClose();
    }

    private HHCommentDialog(@NonNull Context context) {
        super(context);
        this.isCanTouchOutSide = false;
    }

    @Override // com.hhmedic.android.sdk.uikit.widget.dialog.HHBottomDialog
    public void initUI() {
        findViewById(R.id.hh_sdk_close).setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCommentDialog.this.doClose();
            }
        });
        this.mTitleView = (TextView) findViewById(R.id.hh_sdk_title);
        this.mFeedbackView = (FeedbackView) findViewById(R.id.hh_sdk_feedback);
        this.mResultView = (ResultView) findViewById(R.id.hh_sdk_result);
        this.mRatingView = (RatingView) findViewById(R.id.hh_sdk_rating);
        this.mQuestionView = (QuestionView) findViewById(R.id.hh_sdk_question);
        this.mQuestionView.addOnNext(new QuestionView.OnQuestionNext() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.2
            @Override // com.hhmedic.android.sdk.module.video.comment.QuestionView.OnQuestionNext
            public void onNext(String str) {
                HHCommentDialog.this.mRatingView.setVisibility(0);
                HHCommentDialog.this.sendQuestion(str);
            }
        });
        this.mRatingView.addNext(new RatingView.OnRateNext() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.3
            @Override // com.hhmedic.android.sdk.module.video.comment.RatingView.OnRateNext
            public void onNext(int i, String str) {
                HHCommentDialog.this.mResultView.show();
                HHCommentDialog.this.mFeedbackBtn.setVisibility(8);
                HHCommentDialog.this.mResultView.setVisibility(0);
                HHCommentDialog.this.sendRate(i, str);
            }
        });
        this.mFeedbackBtn = (Button) findViewById(R.id.hh_sdk_complain);
        this.mFeedbackBtn.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HHCommentDialog.this.doShowFeedback();
            }
        });
        this.mFeedbackView.addNext(new FeedbackView.OnFeedbackNext() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.5
            @Override // com.hhmedic.android.sdk.module.video.comment.FeedbackView.OnFeedbackNext
            public void onNext(String str, String str2) {
                HHCommentDialog.this.sendFeedback(str, str2);
                HHCommentDialog.this.mResultView.show();
                HHCommentDialog.this.mFeedbackBtn.setVisibility(8);
                HHCommentDialog.this.mResultView.setVisibility(0);
            }
        });
        this.mResultView.addNext(new ResultView.OnResultNext() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentDialog.6
            @Override // com.hhmedic.android.sdk.module.video.comment.ResultView.OnResultNext
            public void onClose() {
                HHCommentDialog.this.doClose();
            }
        });
        if (this.mData != null) {
            this.mQuestionView.bindData(this.mData.question);
            this.mRatingView.bind(this.mData.rateContentList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doClose() {
        try {
            dismiss();
            if (this.mListener != null) {
                this.mListener.onClose();
            }
            this.mQuestionView.release();
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doShowFeedback() {
        this.mQuestionView.release();
        this.mFeedbackView.setVisibility(0);
        this.mQuestionView.setVisibility(8);
        this.mRatingView.setVisibility(8);
        this.mResultView.setVisibility(8);
        this.mFeedbackBtn.setVisibility(8);
        this.mTitleView.setText(R.string.hh_cc);
    }

    public static HHCommentDialog show(Context context, CallResult callResult, OnCommentListener onCommentListener) {
        HHCommentDialog hHCommentDialog = new HHCommentDialog(context);
        hHCommentDialog.mData = callResult;
        hHCommentDialog.mListener = onCommentListener;
        try {
            hHCommentDialog.setContentView(R.layout.hh_doctor_comment_layout);
            hHCommentDialog.show();
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
        return hHCommentDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendQuestion(String str) {
        if (this.mData == null || this.mData.question == null) {
            return;
        }
        getCommentDC().create(this.mData.orderId, this.mData.question.id, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRate(int i, String str) {
        if (this.mData != null) {
            getCommentDC().rate(this.mData.orderId, str, i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFeedback(String str, String str2) {
        if (this.mData != null) {
            CommentDC commentDC = getCommentDC();
            String str3 = this.mData.orderId;
            commentDC.feedback(str3, str + CommonConstant.Symbol.COMMA + str2, null);
        }
    }

    private CommentDC getCommentDC() {
        if (this.mCommentDC == null) {
            this.mCommentDC = new CommentDC(getContext());
        }
        return this.mCommentDC;
    }
}
