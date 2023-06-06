package com.sankuai.waimai.business.page.common.view.nested;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b extends RecyclerView.i {
    public static ChangeQuickRedirect c;
    private long a;
    public RecyclerView d;
    public Scroller e;
    long f;

    public abstract int a(RecyclerView.LayoutManager layoutManager, int i, int i2);

    @Nullable
    public abstract View a(RecyclerView.LayoutManager layoutManager);

    @Nullable
    public abstract int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af84f14b10e030d6f0f9646fb2676924", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af84f14b10e030d6f0f9646fb2676924");
            return;
        }
        this.a = 0L;
        this.f = 0L;
    }

    @Override // android.support.v7.widget.RecyclerView.i
    public boolean onFling(int i, int i2) {
        RecyclerView.p pVar;
        int a;
        boolean z;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32bef80a4b7ed460ac6f1aaf04fe9c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32bef80a4b7ed460ac6f1aaf04fe9c6")).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || this.d.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.d.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            Object[] objArr2 = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "408f8b1da7a0b170fef985a658bb4e24", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "408f8b1da7a0b170fef985a658bb4e24")).booleanValue();
            } else {
                boolean z2 = layoutManager instanceof RecyclerView.p.b;
                if (z2) {
                    Object[] objArr3 = {layoutManager};
                    ChangeQuickRedirect changeQuickRedirect3 = c;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7877dc388a2cfca79829ff303daa978b", RobustBitConfig.DEFAULT_VALUE)) {
                        pVar = (RecyclerView.p) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7877dc388a2cfca79829ff303daa978b");
                    } else {
                        Object[] objArr4 = {layoutManager};
                        ChangeQuickRedirect changeQuickRedirect4 = c;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "917e8546f53876c82289db6481b42769", RobustBitConfig.DEFAULT_VALUE)) {
                            pVar = (ad) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "917e8546f53876c82289db6481b42769");
                        } else {
                            pVar = !z2 ? null : new ad(this.d.getContext()) { // from class: com.sankuai.waimai.business.page.common.view.nested.b.1
                                public static ChangeQuickRedirect a;

                                @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
                                public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
                                    Object[] objArr5 = {view, state, aVar};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6138fd5de928efaa943c5548fdc800b4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6138fd5de928efaa943c5548fdc800b4");
                                    } else if (b.this.d == null) {
                                    } else {
                                        int[] a2 = b.this.a(b.this.d.getLayoutManager(), view);
                                        int i3 = a2[0];
                                        int i4 = a2[1];
                                        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i3), Math.abs(i4)));
                                        b.this.f = System.currentTimeMillis();
                                        if (calculateTimeForDeceleration > 0) {
                                            aVar.a(i3, i4, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                                        }
                                    }
                                }

                                @Override // android.support.v7.widget.ad
                                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                                    return 100.0f / displayMetrics.densityDpi;
                                }
                            };
                        }
                    }
                    if (pVar != null && (a = a(layoutManager, i, i2)) != -1) {
                        pVar.setTargetPosition(a);
                        layoutManager.startSmoothScroll(pVar);
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int[] a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19f6a15fc958960f6135e4e1abae457", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19f6a15fc958960f6135e4e1abae457");
        }
        this.e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.e.getFinalX(), this.e.getFinalY()};
    }
}
