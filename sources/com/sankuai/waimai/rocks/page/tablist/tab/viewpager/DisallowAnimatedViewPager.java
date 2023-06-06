package com.sankuai.waimai.rocks.page.tablist.tab.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DisallowAnimatedViewPager extends ViewPager {
    public static ChangeQuickRedirect a;

    public DisallowAnimatedViewPager(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0116e1e0afcac3cea9b1f7f94367058f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0116e1e0afcac3cea9b1f7f94367058f");
        }
    }

    public DisallowAnimatedViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808829ff8ce4662bb007fa71becbe262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808829ff8ce4662bb007fa71becbe262");
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d6164e13e358cbe06c5daa59594c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d6164e13e358cbe06c5daa59594c2b");
            return;
        }
        try {
            if (Math.abs(getCurrentItem() - i) > 1) {
                super.setCurrentItem(i, false);
            } else {
                super.setCurrentItem(i);
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
