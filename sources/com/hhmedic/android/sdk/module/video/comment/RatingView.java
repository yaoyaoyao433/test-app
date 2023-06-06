package com.hhmedic.android.sdk.module.video.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.video.comment.HHCommentAdapter;
import com.hhmedic.android.sdk.module.video.data.entity.RateContent;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RatingView extends FrameLayout {
    private HHCommentAdapter mAdapter;
    private TextView mContent;
    private List<HHCommentAdapter.CommentItem> mData;
    private OnRateNext mNext;
    private int mRate;
    List<RateContent> mRateContent;
    private RecyclerView mRecycler;
    private Button mSubmitBtn;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface OnRateNext {
        void onNext(int i, String str);
    }

    public RatingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addNext(OnRateNext onRateNext) {
        this.mNext = onRateNext;
    }

    private void initView() {
        inflate(getContext(), R.layout.hh_comment_rating_view, this);
        this.mContent = (TextView) findViewById(R.id.hh_content);
        this.mRecycler = (RecyclerView) findViewById(R.id.hh_recycler);
        this.mSubmitBtn = (Button) findViewById(R.id.hh_commit_btn);
        this.mSubmitBtn.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.RatingView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RatingView.this.setVisibility(8);
                if (RatingView.this.mNext != null) {
                    RatingView.this.mNext.onNext(RatingView.this.mRate, RatingView.this.getContent());
                    RatingView.this.mNext = null;
                }
            }
        });
        ((AppCompatRatingBar) findViewById(R.id.hh_rating_bar)).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.hhmedic.android.sdk.module.video.comment.RatingView.2
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                int i = (int) f;
                try {
                    RatingView.this.mRate = i;
                    RatingView.this.showContent(i);
                } catch (Exception unused) {
                }
            }
        });
        initRecycler();
    }

    private int getSpanCount() {
        return getContext().getResources().getConfiguration().orientation == 2 ? 3 : 2;
    }

    private void initRecycler() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.hh_comment_horizontal_spacing);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.hh_comment_vertical_spacing);
        int spanCount = getSpanCount();
        this.mRecycler.setLayoutManager(new GridLayoutManager(getContext(), spanCount));
        this.mRecycler.addItemDecoration(new CSpace(spanCount, dimensionPixelSize, dimensionPixelSize2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bind(List<RateContent> list) {
        this.mRateContent = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showContent(int i) {
        this.mRecycler.setVisibility(0);
        this.mSubmitBtn.setVisibility(0);
        this.mContent.setText(getRateDes(i));
        this.mContent.setTextColor(ContextCompat.getColor(getContext(), R.color.hh_scsc));
        bindContent(i);
    }

    private void bindContent(int i) {
        this.mData = getRateContent(i >= 5);
        this.mAdapter = new HHCommentAdapter(this.mData);
        this.mAdapter.addListener(new HHCommentAdapter.CommentItemClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.RatingView.3
            @Override // com.hhmedic.android.sdk.module.video.comment.HHCommentAdapter.CommentItemClickListener
            public void onItemClick(int i2) {
                HHCommentAdapter.CommentItem commentItem = (HHCommentAdapter.CommentItem) RatingView.this.mData.get(i2);
                commentItem.selected = !commentItem.selected;
                RatingView.this.mAdapter.notifyItemChanged(i2);
            }
        });
        this.mRecycler.setAdapter(this.mAdapter);
    }

    private List<HHCommentAdapter.CommentItem> getRateContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.mRateContent != null && !this.mRateContent.isEmpty()) {
            for (RateContent rateContent : this.mRateContent) {
                if (z) {
                    if (rateContent.isGood()) {
                        arrayList.add(new HHCommentAdapter.CommentItem(rateContent.content, false));
                    }
                } else if (!rateContent.isGood()) {
                    arrayList.add(new HHCommentAdapter.CommentItem(rateContent.content, false));
                }
            }
        }
        return arrayList;
    }

    String getRateDes(int i) {
        try {
            return getContext().getResources().getStringArray(R.array.hh_sdk_rating_tip_array)[i - 1];
        } catch (Exception e) {
            Logger.e("getRateDes error:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        if (this.mData != null && !this.mData.isEmpty()) {
            for (HHCommentAdapter.CommentItem commentItem : this.mData) {
                if (commentItem.selected) {
                    sb.append(commentItem.name);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }
}
