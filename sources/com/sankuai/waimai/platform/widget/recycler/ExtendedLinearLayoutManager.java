package com.sankuai.waimai.platform.widget.recycler;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ExtendedLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    private RecyclerView b;

    public ExtendedLinearLayoutManager(Context context) {
        super(context, 1, false);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d224b542152019f9bb0b95bd1b4b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d224b542152019f9bb0b95bd1b4b8c");
        }
    }

    public ExtendedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c31f50af053a04a2130dcf06693fd20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c31f50af053a04a2130dcf06693fd20");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75b019938eb79b88781b1da4b32a83f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75b019938eb79b88781b1da4b32a83f");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.b = recyclerView;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "068fd591e6315e323037f15c9f01cbc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "068fd591e6315e323037f15c9f01cbc4");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        this.b = null;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3743103ec1aae17bfaca5d7dda8a55ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3743103ec1aae17bfaca5d7dda8a55ad");
        } else if (recyclerView == null) {
        } else {
            Context context = recyclerView.getContext();
            Object[] objArr2 = {context, this};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "784f55b0bf58e756923e5faaf10df607", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "784f55b0bf58e756923e5faaf10df607") : new a(context, this, 0, 0, false);
            aVar.setTargetPosition(i);
            startSmoothScroll(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ad {
        public static ChangeQuickRedirect a;
        private final ExtendedLinearLayoutManager b;
        private final int c;
        private final int d;
        private final boolean e;

        public a(Context context, ExtendedLinearLayoutManager extendedLinearLayoutManager, int i, int i2, boolean z) {
            super(context);
            Object[] objArr = {context, extendedLinearLayoutManager, 0, 0, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8930e460185949402b922a37e1f8104", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8930e460185949402b922a37e1f8104");
                return;
            }
            this.b = extendedLinearLayoutManager;
            this.c = 0;
            this.d = 0;
            this.e = false;
        }

        @Override // android.support.v7.widget.ad
        public final PointF computeScrollVectorForPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c3256871582591c9bca192cfe08821", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c3256871582591c9bca192cfe08821") : this.b.computeScrollVectorForPosition(i);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4f981d22112cb4fc5aac388ae6cf23", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4f981d22112cb4fc5aac388ae6cf23")).intValue() : Math.min(super.calculateTimeForScrolling(i) * 2, 200);
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return this.c;
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e699706da34ecd109246b3e510f4bc5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e699706da34ecd109246b3e510f4bc5")).intValue();
            }
            if (this.e) {
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5) + this.d;
        }
    }
}
