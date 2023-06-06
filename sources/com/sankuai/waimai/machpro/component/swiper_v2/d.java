package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ai;
import android.support.v7.widget.aj;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends aj {
    public static ChangeQuickRedirect b;
    private ai c;
    private ai d;
    private final MPViewPager e;

    public d(MPViewPager mPViewPager) {
        Object[] objArr = {mPViewPager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e0b545989bf4f94b5a1ff3477ce64a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e0b545989bf4f94b5a1ff3477ce64a");
        } else {
            this.e = mPViewPager;
        }
    }

    @Override // android.support.v7.widget.aj, android.support.v7.widget.ar
    @Nullable
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        Object[] objArr = {layoutManager, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51cca6fe04dc65d71be5ab69ae87f975", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51cca6fe04dc65d71be5ab69ae87f975");
        }
        int[] iArr = new int[2];
        if (this.e.getAlignmentType() == 0) {
            if (this.e.getOrientation() == 0) {
                if (this.c == null) {
                    this.c = ai.a(layoutManager);
                }
                iArr[0] = this.c.a(view);
                return iArr;
            }
            if (this.d == null) {
                this.d = ai.b(layoutManager);
            }
            iArr[1] = this.d.a(view);
            return iArr;
        }
        iArr[0] = 0;
        return super.a(layoutManager, view);
    }
}
