package com.sankuai.waimai.business.search.ui.result.categoryfilter;

import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.ViewDragHelper;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    FrameLayout c;
    public ViewDragHelper d;
    int e;
    int f;
    public boolean g;
    public int h;
    public Interpolator i;
    public float j;
    public boolean k;
    public boolean l;
    final int m;
    private ValueAnimator n;

    public static /* synthetic */ void a(b bVar, int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "05bca3c21b7f84a5ea25bc7d22b5046f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "05bca3c21b7f84a5ea25bc7d22b5046f");
        } else if (bVar.c != null) {
            int a2 = bVar.a(i, z);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bVar.c.getLayoutParams();
            layoutParams.leftMargin = a2;
            bVar.c.setLayoutParams(layoutParams);
        }
    }

    public b(@NonNull RecyclerView recyclerView, FrameLayout frameLayout, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {recyclerView, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65ada8fffdf75ff4794163bac0bb1d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65ada8fffdf75ff4794163bac0bb1d7");
            return;
        }
        this.e = -1;
        this.f = -1;
        this.g = false;
        this.h = 280;
        this.j = 0.33333334f;
        this.k = true;
        this.l = true;
        this.b = recyclerView;
        this.c = null;
        this.m = this.b.getResources().getDisplayMetrics().widthPixels;
        this.b.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.search.ui.result.categoryfilter.b.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af8f4389915065997225e8d735eca0a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af8f4389915065997225e8d735eca0a6");
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (b.this.g) {
                    return;
                }
                b.a(b.this, b.this.f, i > 0);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1c6e5b8c967cb277dba088416a721c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1c6e5b8c967cb277dba088416a721c6");
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (i == 0) {
                    b.this.g = false;
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.i = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6d04dab105135d4120168503fc3dcb4", RobustBitConfig.DEFAULT_VALUE) ? (Interpolator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6d04dab105135d4120168503fc3dcb4") : new a(0.4f, 0.0f, 0.2f, 1.0f, "Tab");
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53babb7a161b26b3533b3b0cb141d3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53babb7a161b26b3533b3b0cb141d3cf");
        } else if (this.c == null || this.e > 0) {
        } else {
            this.c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.business.search.ui.result.categoryfilter.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "918d71d084bb4bc1958f7f54d78cf148", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "918d71d084bb4bc1958f7f54d78cf148")).booleanValue();
                    }
                    b.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (b.this.e <= 0 && b.this.c.getMeasuredWidth() > 0) {
                        b.this.e = b.this.c.getMeasuredWidth();
                    }
                    b.a(b.this, b.this.f, true);
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011b, code lost:
        if ((r0 - r1) > 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r17) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.result.categoryfilter.b.a(int):void");
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e468e03465f937aa7d4ed3db4f0c72b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e468e03465f937aa7d4ed3db4f0c72b0")).intValue();
        }
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            if (this.b.getChildAdapterPosition(this.b.getChildAt(i2)) == i) {
                return i2;
            }
        }
        return -1;
    }

    private int a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd1b0524ad9dc4997c3bb82b074d1996", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd1b0524ad9dc4997c3bb82b074d1996")).intValue();
        }
        int b = b(i);
        if (b < 0) {
            if (z) {
                return -this.e;
            }
            return this.b.getMeasuredWidth();
        }
        return ((this.b.getChildAt(b).getLeft() + this.b.getChildAt(b).getRight()) - this.e) / 2;
    }
}
