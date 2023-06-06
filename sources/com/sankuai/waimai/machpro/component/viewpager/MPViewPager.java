package com.sankuai.waimai.machpro.component.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPViewPager extends ViewPager {
    public static ChangeQuickRedirect a;
    private boolean b;
    private MPViewPagerAdapter c;

    public void setScrollEnable(boolean z) {
        this.b = z;
    }

    public MPViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c0a9ee3dad2429ab17dafed18c9f5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c0a9ee3dad2429ab17dafed18c9f5d");
        } else {
            this.b = true;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f86e96146cd88ce3d8e4aa69ad24242", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f86e96146cd88ce3d8e4aa69ad24242")).booleanValue();
        }
        try {
            if (this.b) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a1563973a7f3fb9e63ed9b64652e1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a1563973a7f3fb9e63ed9b64652e1f")).booleanValue();
        }
        try {
            if (this.b) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3efd75ce3a8988006f69ff6b9a0a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3efd75ce3a8988006f69ff6b9a0a23");
            return;
        }
        super.setAdapter(pagerAdapter);
        this.c = (MPViewPagerAdapter) pagerAdapter;
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e22386b0a3886cc4fd6ddafe954bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e22386b0a3886cc4fd6ddafe954bcc");
            return;
        }
        super.setCurrentItem(i);
        if (this.c != null) {
            this.c.a(this.c.d.get(i), i);
        }
    }
}
