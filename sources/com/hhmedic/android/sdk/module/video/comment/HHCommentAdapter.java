package com.hhmedic.android.sdk.module.video.comment;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCommentAdapter extends RecyclerView.a<CommentViewHolder> {
    private final List<CommentItem> mData;
    private CommentItemClickListener mListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface CommentItemClickListener {
        void onItemClick(int i);
    }

    public HHCommentAdapter(List<CommentItem> list) {
        this.mData = list;
    }

    public void addListener(CommentItemClickListener commentItemClickListener) {
        this.mListener = commentItemClickListener;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CommentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hh_comment_item_view, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(@NonNull CommentViewHolder commentViewHolder, int i) {
        if (this.mData == null || i >= this.mData.size()) {
            return;
        }
        commentViewHolder.bind(this.mData.get(i), i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        if (this.mData != null) {
            return this.mData.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class CommentViewHolder extends RecyclerView.s {
        private final Button mItem;

        CommentViewHolder(View view) {
            super(view);
            this.mItem = (Button) view.findViewById(R.id.hh_comment_content_item);
        }

        public void bind(CommentItem commentItem, final int i) {
            this.mItem.setText(commentItem.name);
            this.mItem.setSelected(commentItem.selected);
            this.mItem.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.comment.HHCommentAdapter.CommentViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CommentViewHolder.this.mItem.setSelected(true);
                    if (HHCommentAdapter.this.mListener != null) {
                        HHCommentAdapter.this.mListener.onItemClick(i);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CommentItem implements Serializable {
        public String name;
        public boolean selected;

        public CommentItem(String str, boolean z) {
            this.name = str;
            this.selected = z;
        }
    }
}
