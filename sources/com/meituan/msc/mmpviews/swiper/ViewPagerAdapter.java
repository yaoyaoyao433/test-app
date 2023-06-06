package com.meituan.msc.mmpviews.swiper;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ViewPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect b;
    List<View> c;
    View d;

    public int a(int i) {
        return i;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ViewPagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c45e81862206af031859f879052d6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c45e81862206af031859f879052d6a");
        } else {
            this.c = new ArrayList();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1c40c89ea8e38f7736270aa4f4cf47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1c40c89ea8e38f7736270aa4f4cf47")).intValue();
        }
        if (obj instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) obj;
            if (frameLayout.getChildCount() <= 0 || !this.c.contains(frameLayout.getChildAt(0))) {
                return -2;
            }
            return this.c.indexOf(frameLayout.getChildAt(0));
        }
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(final ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ad1945ba2a30db8f4cbc4c57706c6a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ad1945ba2a30db8f4cbc4c57706c6a");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = this.c.get(a(i));
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeAllViews();
        }
        frameLayout.addView(view);
        viewGroup.addView(frameLayout);
        viewGroup.post(new Runnable() { // from class: com.meituan.msc.mmpviews.swiper.ViewPagerAdapter.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44442fe17efc6d514fecb19aa869efd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44442fe17efc6d514fecb19aa869efd1");
                    return;
                }
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
                viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
            }
        });
        return frameLayout;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc6837c44eba8e7099b49fcaf9a474e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc6837c44eba8e7099b49fcaf9a474e5");
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        this.d = (View) obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a0ebf50041f80318ba90ee7a3126b0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a0ebf50041f80318ba90ee7a3126b0")).intValue() : this.c.size();
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c6a4805af1aea949b2df86ac099af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c6a4805af1aea949b2df86ac099af1");
            return;
        }
        this.c.add(i, view);
        notifyDataSetChanged();
    }

    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87099f2c5735a2d69a9da5890e931c61", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87099f2c5735a2d69a9da5890e931c61") : this.c.get(i);
    }
}
