package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    public boolean b;
    public int c;
    public Paint d;
    public Bitmap e;
    public Rect f;
    public int g;
    public int h;
    private final int i;
    private final Bitmap j;
    private final int k;
    private final int l;
    private int m;
    private final int n;
    private final int o;
    private final int p;
    private int q;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d60908fac3b88712a2e7cbd5b705b20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d60908fac3b88712a2e7cbd5b705b20");
            return;
        }
        this.c = g.a(context);
        if (this.c <= 0) {
            this.c = 1080;
        }
        this.i = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_top_padding);
        this.p = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_bg_radius);
        this.n = Color.parseColor("#F7F7F7");
        this.o = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_abnormal_bg_height);
        this.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_bg_top);
        this.l = this.k;
        this.j = com.sankuai.waimai.foundation.utils.c.a(context.getResources().getDrawable(R.drawable.wm_order_detail_scrollview_header_shadow), this.c, this.l);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6262e37d189ba956c8a08f8b85f4c421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6262e37d189ba956c8a08f8b85f4c421");
            return;
        }
        if (this.d == null) {
            this.d = new Paint();
            this.d.setStyle(Paint.Style.FILL);
        }
        this.d.setShader(new LinearGradient(0.0f, i, 0.0f, this.o + i, new int[]{this.m, this.m, this.n}, (float[]) null, Shader.TileMode.MIRROR));
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856d60c584204b0aadfde52e3eea87aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856d60c584204b0aadfde52e3eea87aa");
            return;
        }
        this.m = i;
        if (this.d == null) {
            b(0);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2dd7a8e095faf64306e1f1638f277e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2dd7a8e095faf64306e1f1638f277e");
        } else if (this.e == null || this.e.isRecycled()) {
        } else {
            this.e.recycle();
            this.e = null;
        }
    }

    private void a(Canvas canvas, int i) {
        Object[] objArr = {canvas, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189cc9789cf99e8dde150f358f399e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189cc9789cf99e8dde150f358f399e07");
        } else if (Math.abs(i) < this.o) {
            b(i);
            canvas.drawRoundRect(0.0f, i, this.c, i + this.o, this.p, this.p, this.d);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f4cf57b4218fbe785e6b2755760173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f4cf57b4218fbe785e6b2755760173");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (!this.b && childAdapterPosition == 0) {
            rect.top = this.i + this.k;
        }
        if (this.b && childAdapterPosition == 0) {
            if (this.d == null) {
                rect.top = this.l;
            } else if (this.e != null) {
                rect.top = this.h;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        LinearLayoutManager linearLayoutManager;
        int findFirstVisibleItemPosition;
        RecyclerView.s findViewHolderForLayoutPosition;
        Object[] objArr = {canvas, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d98f36eaa878f6d62d3dea78a723d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d98f36eaa878f6d62d3dea78a723d96");
        } else if (!this.b || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null || (findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null || findViewHolderForLayoutPosition.itemView == null) {
        } else {
            int top = findViewHolderForLayoutPosition.itemView.getTop();
            if (findFirstVisibleItemPosition == 0) {
                if (this.d != null) {
                    a(canvas, top);
                    if (this.q == 0) {
                        this.q = findViewHolderForLayoutPosition.itemView.getHeight() * (-1);
                        return;
                    }
                    return;
                }
                canvas.drawBitmap(this.j, 0.0f, top - this.l, (Paint) null);
            } else if (findFirstVisibleItemPosition != 1 || this.d == null) {
            } else {
                a(canvas, this.q + top);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        LinearLayoutManager linearLayoutManager;
        int findFirstVisibleItemPosition;
        RecyclerView.s findViewHolderForLayoutPosition;
        Object[] objArr = {canvas, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e432fe7d971bae2327b6d7b33ea24be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e432fe7d971bae2327b6d7b33ea24be");
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        if (this.e == null || this.e.isRecycled() || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null || (findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null || findViewHolderForLayoutPosition.itemView == null) {
            return;
        }
        int top = findViewHolderForLayoutPosition.itemView.getTop();
        if (findFirstVisibleItemPosition == 0) {
            this.f.top = top - this.h;
            this.f.bottom = this.f.top + this.g;
            canvas.drawBitmap(this.e, (Rect) null, this.f, (Paint) null);
        }
    }
}
