package com.meituan.roodesign.widgets.carousel;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CarouselPageAdapter<T> extends PagerAdapter {
    public static ChangeQuickRedirect b;
    protected List<T> c;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3877897eabae78fe9e912861012894", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3877897eabae78fe9e912861012894")).intValue();
        }
        if (this.c != null) {
            return this.c.size();
        }
        return 0;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ed08f4dda1a4457cec0c2d94db55709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ed08f4dda1a4457cec0c2d94db55709");
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0881961fd18ccda9bdb4366a4720831", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0881961fd18ccda9bdb4366a4720831")).intValue();
        }
        int size = this.c != null ? this.c.size() : 0;
        return size > 2 ? size - 2 : size;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386c91b4e994ed1e0b73cc005f9e4378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386c91b4e994ed1e0b73cc005f9e4378");
        } else if (this.c == null || this.c.size() <= 1) {
        } else {
            T t = this.c.get(0);
            this.c.add(0, this.c.get(this.c.size() - 1));
            this.c.add(t);
        }
    }
}
