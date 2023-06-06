package com.meituan.msc.mmpviews.swiper;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CyclePageAdapter extends ViewPagerAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.mmpviews.swiper.ViewPagerAdapter, android.support.v4.view.PagerAdapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a714d51ac018293ef3c6a661c33768", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a714d51ac018293ef3c6a661c33768")).intValue();
        }
        int count = super.getCount();
        return count > 1 ? count + 2 : count;
    }

    @Override // com.meituan.msc.mmpviews.swiper.ViewPagerAdapter
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7821c03e4749ae8da739bcbb96eb8e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7821c03e4749ae8da739bcbb96eb8e1")).intValue();
        }
        int count = super.getCount();
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(count)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "615c2b0e3af5506718aaed1d716ce3b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "615c2b0e3af5506718aaed1d716ce3b2")).intValue();
        }
        if (i == 0) {
            return count - 1;
        }
        if (i == count + 1) {
            return 0;
        }
        return i - 1;
    }

    @Override // com.meituan.msc.mmpviews.swiper.ViewPagerAdapter, android.support.v4.view.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b070bca5e5be0733916019ca024f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b070bca5e5be0733916019ca024f27");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        if (super.getCount() == 2 && (obj instanceof ViewGroup)) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            if (viewGroup2.getChildCount() > 0) {
                return;
            }
            View b = b(a(i));
            if (b.getParent() instanceof ViewGroup) {
                ((ViewGroup) b.getParent()).removeAllViews();
            }
            viewGroup2.addView(b);
        }
    }
}
