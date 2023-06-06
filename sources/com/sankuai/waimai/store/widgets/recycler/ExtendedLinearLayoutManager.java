package com.sankuai.waimai.store.widgets.recycler;

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
    public RecyclerView b;

    public ExtendedLinearLayoutManager(Context context) {
        super(context, 1, false);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5916481ead6e16283ae36e0d074552e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5916481ead6e16283ae36e0d074552e0");
        }
    }

    public ExtendedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8f16895be6d72cb5d98f8ccd463e91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8f16895be6d72cb5d98f8ccd463e91");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac5b03652ea280d8518deb5afb8b657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac5b03652ea280d8518deb5afb8b657");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.b = recyclerView;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446469ece28fa5774a1ac3c341e26cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446469ece28fa5774a1ac3c341e26cb5");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        this.b = null;
    }

    public final void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb81b738810f2ea0cd4c722c97359594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb81b738810f2ea0cd4c722c97359594");
        } else {
            scrollToPositionWithOffset(0, 0);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da715879aa040e8176eed6a69788f813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da715879aa040e8176eed6a69788f813");
        } else if (recyclerView == null) {
        } else {
            Context context = recyclerView.getContext();
            Object[] objArr2 = {context, this};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "abc7cbc003a345364806a3ccb0283c1e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "abc7cbc003a345364806a3ccb0283c1e") : new a(context, this, 0, 0, false);
            aVar.setTargetPosition(i);
            startSmoothScroll(aVar);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2773799b473728a0af3735698fbdf089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2773799b473728a0af3735698fbdf089");
        } else if (this.b == null) {
        } else {
            a a2 = a.a(this.b.getContext(), this);
            a2.setTargetPosition(i);
            startSmoothScroll(a2);
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

        public static a a(Context context, ExtendedLinearLayoutManager extendedLinearLayoutManager) {
            Object[] objArr = {context, extendedLinearLayoutManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "466e9073de814880ffa1d58cd71ee616", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "466e9073de814880ffa1d58cd71ee616") : new a(context, extendedLinearLayoutManager, 0, 0, true);
        }

        public a(Context context, ExtendedLinearLayoutManager extendedLinearLayoutManager, int i, int i2, boolean z) {
            super(context);
            Object[] objArr = {context, extendedLinearLayoutManager, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f9a13fefdba505b07306bc2c2b307f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f9a13fefdba505b07306bc2c2b307f");
                return;
            }
            this.b = extendedLinearLayoutManager;
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        @Override // android.support.v7.widget.ad
        public final PointF computeScrollVectorForPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1139d94c9d2709adfb1bf271d39f19aa", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1139d94c9d2709adfb1bf271d39f19aa") : this.b.computeScrollVectorForPosition(i);
        }

        @Override // android.support.v7.widget.ad
        public final int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e475f9b35437440760b67fadd4f724b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e475f9b35437440760b67fadd4f724b1")).intValue() : Math.min(super.calculateTimeForScrolling(i) * 2, 200);
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return this.c;
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b33562023732e5603889fa48f037098", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b33562023732e5603889fa48f037098")).intValue();
            }
            if (this.e) {
                return ((i3 + i4) / 2) - ((i + i2) / 2);
            }
            return super.calculateDtToFit(i, i2, i3, i4, i5) + this.d;
        }
    }
}
