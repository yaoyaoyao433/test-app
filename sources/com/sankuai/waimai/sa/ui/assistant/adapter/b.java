package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.sa.ui.assistant.chat.b;
import com.sankuai.waimai.sa.ui.assistant.chat.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T extends com.sankuai.waimai.sa.ui.assistant.chat.b> extends RecyclerView.a<T> {
    public static ChangeQuickRedirect a;
    protected RecyclerView b;
    public int c;
    public int d;
    public i e;
    private int f;
    private Rect g;
    private int h;

    public abstract void a(T t, int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.a
    @SuppressLint({"RecyclerView"})
    public /* synthetic */ void onBindViewHolder(RecyclerView.s sVar, int i) {
        int i2;
        com.sankuai.waimai.sa.ui.assistant.chat.b bVar = (com.sankuai.waimai.sa.ui.assistant.chat.b) sVar;
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9496543f7bc5a8a32b0b5db7cbe7b907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9496543f7bc5a8a32b0b5db7cbe7b907");
            return;
        }
        a(bVar, i);
        ViewGroup.LayoutParams layoutParams = bVar.itemView.getLayoutParams();
        if (i != getItemCount() - 1) {
            if (layoutParams != null) {
                layoutParams.height = -2;
                return;
            }
            return;
        }
        if (this.f == 0) {
            this.g = new Rect(this.b.getPaddingLeft(), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
            this.f = this.b.getHeight();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i2 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + 0 + this.b.getPaddingRight() + this.b.getPaddingRight();
            layoutParams.height = -2;
            if (this.h > 0) {
                marginLayoutParams.bottomMargin = this.h;
            }
        } else {
            i2 = 0;
        }
        bVar.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.b.getWidth() - i2, Integer.MIN_VALUE), 0);
        int measuredHeight = bVar.itemView.getMeasuredHeight();
        bVar.b = measuredHeight;
        bVar.c = false;
        if (measuredHeight < this.c) {
            this.d = i;
        } else {
            this.d = -1;
        }
        bVar.itemView.setLayoutParams(layoutParams);
    }

    public b(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ea5911a13175be1119b91fec0aada3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ea5911a13175be1119b91fec0aada3");
            return;
        }
        this.f = 0;
        this.g = new Rect(0, 0, 0, 0);
        this.d = -1;
        this.h = 0;
        this.b = recyclerView;
        this.b.setClipToPadding(false);
    }
}
