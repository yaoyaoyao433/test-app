package com.sankuai.waimai.business.page.home.head.majorcategory.indicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DotsIndicator extends LinearLayout {
    public static ChangeQuickRedirect a;
    public ViewPager b;
    private List<ImageView> c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private ArgbEvaluator l;
    private OnPageChangeListenerHelper m;

    public static /* synthetic */ void a(DotsIndicator dotsIndicator) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dotsIndicator, changeQuickRedirect, false, "b2df4177d355875515cf85b9c9d61e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dotsIndicator, changeQuickRedirect, false, "b2df4177d355875515cf85b9c9d61e13");
        } else if (dotsIndicator.c.size() < dotsIndicator.b.getAdapter().getCount()) {
            dotsIndicator.a(dotsIndicator.b.getAdapter().getCount() - dotsIndicator.c.size());
        } else if (dotsIndicator.c.size() > dotsIndicator.b.getAdapter().getCount()) {
            int size = dotsIndicator.c.size() - dotsIndicator.b.getAdapter().getCount();
            Object[] objArr2 = {Integer.valueOf(size)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, dotsIndicator, changeQuickRedirect2, false, "171532b6635079a51aecb3cfdf7a1e32", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dotsIndicator, changeQuickRedirect2, false, "171532b6635079a51aecb3cfdf7a1e32");
                return;
            }
            for (int i = 0; i < size; i++) {
                dotsIndicator.removeViewAt(dotsIndicator.getChildCount() - 1);
                dotsIndicator.c.remove(dotsIndicator.c.size() - 1);
            }
        }
    }

    public static /* synthetic */ void c(DotsIndicator dotsIndicator) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dotsIndicator, changeQuickRedirect, false, "dcfd716f0b24dcd2a2e2e066b01203ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dotsIndicator, changeQuickRedirect, false, "dcfd716f0b24dcd2a2e2e066b01203ec");
        } else if (dotsIndicator.c != null) {
            for (int i = 0; i < dotsIndicator.b.getCurrentItem(); i++) {
                dotsIndicator.a(dotsIndicator.c.get(i), (int) dotsIndicator.d);
            }
        }
    }

    public static /* synthetic */ void d(DotsIndicator dotsIndicator) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dotsIndicator, changeQuickRedirect, false, "e81b1472835c081d3133370c93148db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dotsIndicator, changeQuickRedirect, false, "e81b1472835c081d3133370c93148db4");
        } else if (dotsIndicator.b == null || dotsIndicator.b.getAdapter() == null || dotsIndicator.b.getAdapter().getCount() <= 0) {
        } else {
            dotsIndicator.b.removeOnPageChangeListener(dotsIndicator.m);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            dotsIndicator.m = PatchProxy.isSupport(objArr2, dotsIndicator, changeQuickRedirect2, false, "3ca876826b9a457f64a1c26287570a5b", RobustBitConfig.DEFAULT_VALUE) ? (OnPageChangeListenerHelper) PatchProxy.accessDispatch(objArr2, dotsIndicator, changeQuickRedirect2, false, "3ca876826b9a457f64a1c26287570a5b") : new OnPageChangeListenerHelper() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.indicator.DotsIndicator.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.head.majorcategory.indicator.OnPageChangeListenerHelper
                public final void a(int i, int i2, float f) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b739895c1a5d0385365604597a193ae0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b739895c1a5d0385365604597a193ae0");
                    } else if (i == -1) {
                    } else {
                        ImageView imageView = (ImageView) DotsIndicator.this.c.get(i);
                        DotsIndicator.this.a(imageView, (int) (DotsIndicator.this.d + (DotsIndicator.this.d * (DotsIndicator.this.g - 1.0f) * (1.0f - f))));
                        if (i2 == -1 || i2 >= DotsIndicator.this.c.size()) {
                            return;
                        }
                        ImageView imageView2 = (ImageView) DotsIndicator.this.c.get(i2);
                        if (imageView2 != null) {
                            DotsIndicator.this.a(imageView2, (int) (DotsIndicator.this.d + (DotsIndicator.this.d * (DotsIndicator.this.g - 1.0f) * f)));
                            a aVar = (a) imageView.getBackground();
                            a aVar2 = (a) imageView2.getBackground();
                            if (DotsIndicator.this.i != DotsIndicator.this.h) {
                                int intValue = ((Integer) DotsIndicator.this.l.evaluate(f, Integer.valueOf(DotsIndicator.this.i), Integer.valueOf(DotsIndicator.this.h))).intValue();
                                int intValue2 = ((Integer) DotsIndicator.this.l.evaluate(f, Integer.valueOf(DotsIndicator.this.h), Integer.valueOf(DotsIndicator.this.i))).intValue();
                                if (aVar2 != null) {
                                    aVar2.setColor(intValue2);
                                }
                                if (!DotsIndicator.this.j || i > DotsIndicator.this.b.getCurrentItem()) {
                                    if (aVar != null) {
                                        aVar.setColor(intValue);
                                    }
                                } else if (aVar != null) {
                                    aVar.setColor(DotsIndicator.this.i);
                                }
                            }
                        }
                        DotsIndicator.this.invalidate();
                    }
                }

                @Override // com.sankuai.waimai.business.page.home.head.majorcategory.indicator.OnPageChangeListenerHelper
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "692a1db5f00169b74531f80ec84ad3ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "692a1db5f00169b74531f80ec84ad3ba");
                    } else {
                        DotsIndicator.this.a((ImageView) DotsIndicator.this.c.get(i), (int) DotsIndicator.this.d);
                    }
                }

                @Override // com.sankuai.waimai.business.page.home.head.majorcategory.indicator.OnPageChangeListenerHelper
                public final int a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dde7e95703a0abe8b8a53ee1bf03de28", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dde7e95703a0abe8b8a53ee1bf03de28")).intValue() : DotsIndicator.this.c.size();
                }
            };
            dotsIndicator.b.addOnPageChangeListener(dotsIndicator.m);
            dotsIndicator.m.a(dotsIndicator.b.getCurrentItem(), -1, 0.0f);
        }
    }

    public DotsIndicator(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd6c732b463fbfe8207813e535765ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd6c732b463fbfe8207813e535765ae");
        }
    }

    public DotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c92503144e78886d9cca3e7d643a91a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c92503144e78886d9cca3e7d643a91a8");
        }
    }

    public DotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0bbbd9b3fe6debafd891b01933e02d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0bbbd9b3fe6debafd891b01933e02d3");
            return;
        }
        this.l = new ArgbEvaluator();
        Object[] objArr2 = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ae3aba23a51ae75005aee5095782497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ae3aba23a51ae75005aee5095782497");
            return;
        }
        this.c = new ArrayList();
        setOrientation(0);
        this.d = b(16);
        this.f = b(4);
        this.e = this.d / 2.0f;
        this.g = 2.5f;
        this.h = -16711681;
        this.k = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.dotsColor, R.attr.selectedDotColor, R.attr.dotsSize, R.attr.dotsWidthFactor, R.attr.dotsSpacing, R.attr.dotsCornerRadius, R.attr.progressMode});
            this.h = obtainStyledAttributes.getColor(0, -16711681);
            this.i = obtainStyledAttributes.getColor(1, -16711681);
            this.g = obtainStyledAttributes.getFloat(3, 2.5f);
            if (this.g < 1.0f) {
                this.g = 2.5f;
            }
            this.d = obtainStyledAttributes.getDimension(2, this.d);
            this.e = (int) obtainStyledAttributes.getDimension(5, this.d / 2.0f);
            this.f = obtainStyledAttributes.getDimension(4, this.f);
            this.j = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            a(5);
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe3456229e0ac7b08a269d538ab412b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe3456229e0ac7b08a269d538ab412b");
            return;
        }
        super.onAttachedToWindow();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5be5674fd92176f57285bec7e65f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5be5674fd92176f57285bec7e65f15");
        } else if (this.b == null || this.b.getAdapter() == null) {
        } else {
            post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.indicator.DotsIndicator.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50085445f2c98bbb3a3f0e04b293783b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50085445f2c98bbb3a3f0e04b293783b");
                        return;
                    }
                    DotsIndicator.a(DotsIndicator.this);
                    DotsIndicator.this.b();
                    DotsIndicator.c(DotsIndicator.this);
                    DotsIndicator.d(DotsIndicator.this);
                }
            });
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96fceaad4061269f31673b8012c0d9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96fceaad4061269f31673b8012c0d9de");
            return;
        }
        final int i2 = 0;
        while (i2 < i) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wm_page_home_dot_layout, (ViewGroup) this, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.dot);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = (int) this.d;
            layoutParams.height = b(4);
            layoutParams.setMargins((int) this.f, 0, (int) this.f, 0);
            a aVar = new a();
            aVar.setCornerRadius(this.e);
            if (isInEditMode()) {
                aVar.setColor(i2 == 0 ? this.i : this.h);
            } else {
                aVar.setColor(this.b.getCurrentItem() == i2 ? this.i : this.h);
            }
            imageView.setBackground(aVar);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.indicator.DotsIndicator.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee36a5d1783773b8dd4bdb53da2f294e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee36a5d1783773b8dd4bdb53da2f294e");
                    } else if (!DotsIndicator.this.k || DotsIndicator.this.b == null || DotsIndicator.this.b.getAdapter() == null || i2 >= DotsIndicator.this.b.getAdapter().getCount()) {
                    } else {
                        DotsIndicator.this.b.setCurrentItem(i2, true);
                    }
                }
            });
            this.c.add(imageView);
            addView(inflate);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, int i) {
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ab41a6980e6fe21c9f0d751e51eaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ab41a6980e6fe21c9f0d751e51eaec");
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i;
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b0d6bc2d4a1dfef564165294ebe198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b0d6bc2d4a1dfef564165294ebe198");
        } else if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                ImageView imageView = this.c.get(i);
                a aVar = (a) imageView.getBackground();
                if (aVar != null) {
                    if (i == this.b.getCurrentItem() || (this.j && i < this.b.getCurrentItem())) {
                        aVar.setColor(this.i);
                    } else {
                        aVar.setColor(this.h);
                    }
                    imageView.setBackground(aVar);
                    imageView.invalidate();
                }
            }
        }
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1685612cca8f9db349956452461f7d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1685612cca8f9db349956452461f7d")).intValue() : (int) (getContext().getResources().getDisplayMetrics().density * i);
    }

    public void setPointsColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f8e1410504943e8bd94def91b99192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f8e1410504943e8bd94def91b99192");
            return;
        }
        this.h = i;
        b();
    }

    public void setSelectedPointColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c697747fe3b8a3fd8a33f44c656eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c697747fe3b8a3fd8a33f44c656eb2");
            return;
        }
        this.i = i;
        b();
    }

    public void setDotsClickable(boolean z) {
        this.k = z;
    }

    public void setViewPager(ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb3ba6c64a2423ce60026c88b4dd6ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb3ba6c64a2423ce60026c88b4dd6ba7");
            return;
        }
        this.b = viewPager;
        a();
    }
}
