package com.meituan.roodesign.widgets.carousel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.carousel.RooCarouselView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CarouselImageAdapter extends CarouselPageAdapter<String> {
    public static ChangeQuickRedirect a;
    private RooCarouselView.c d;
    private RooCarouselView.b e;

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a522d450722d846746db299c295a1665", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a522d450722d846746db299c295a1665");
        }
        int count = getCount();
        if (count <= 0) {
            return super.instantiateItem(viewGroup, i);
        }
        final int i2 = i % count;
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setPadding(20, 0, 20, 0);
        if (this.d != null) {
            this.c.get(i2);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.carousel.CarouselImageAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fb2ce3a9be89ac6799afb170765ad0c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fb2ce3a9be89ac6799afb170765ad0c");
                } else if (CarouselImageAdapter.this.e != null) {
                    RooCarouselView.b unused = CarouselImageAdapter.this.e;
                }
            }
        });
        viewGroup.addView(imageView);
        return imageView;
    }
}
