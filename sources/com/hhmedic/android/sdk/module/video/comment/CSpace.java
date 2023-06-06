package com.hhmedic.android.sdk.module.video.comment;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSpace extends RecyclerView.f {
    private final int spacing;
    private final int spanCount;
    private final int vSpace;

    public CSpace(int i, int i2, int i3) {
        this.spanCount = i;
        this.spacing = i2;
        this.vSpace = i3;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.spanCount;
        rect.left = (this.spacing * i) / this.spanCount;
        rect.right = this.spacing - (((i + 1) * this.spacing) / this.spanCount);
        if (childAdapterPosition >= this.spanCount) {
            rect.top = this.vSpace;
        }
    }
}
