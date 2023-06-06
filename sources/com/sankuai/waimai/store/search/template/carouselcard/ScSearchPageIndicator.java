package com.sankuai.waimai.store.search.template.carouselcard;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.search.model.PicElement;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScSearchPageIndicator extends LinearLayout implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect a = null;
    private static final int g = 2130970255;
    int b;
    private int c;
    private int d;
    private Context e;
    private int f;
    private int h;
    private int i;
    private int j;
    private ViewPager k;
    private final LayoutInflater l;
    private final DataSetObserver m;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ShowMode {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public ScSearchPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d722d697daa077eca3cde1134dc21250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d722d697daa077eca3cde1134dc21250");
            return;
        }
        this.c = 1;
        this.d = 1;
        this.f = 0;
        this.b = 1;
        this.h = g;
        this.i = 0;
        this.j = -1;
        this.k = null;
        this.m = new DataSetObserver() { // from class: com.sankuai.waimai.store.search.template.carouselcard.ScSearchPageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1531f8398991be93edf9b4248d106fe3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1531f8398991be93edf9b4248d106fe3");
                    return;
                }
                super.onChanged();
                ScSearchPageIndicator.this.a();
            }
        };
        this.e = context;
        this.l = LayoutInflater.from(context);
        this.f = h.a(context) - h.a(context, 47.0f);
    }

    public int getPageCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4afb0667e3c7ab2909329f0783553a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4afb0667e3c7ab2909329f0783553a")).intValue() : getChildCount();
    }

    private int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fa6d0eb6103a61ae1b301a76f0cdf1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fa6d0eb6103a61ae1b301a76f0cdf1")).intValue();
        }
        if (i <= 0 || i2 < 0) {
            return -1;
        }
        return i2 >= i ? i2 % i : i2;
    }

    public final void a(List<PicElement> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8c3664e0a9c6b82c83945c6c10488d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8c3664e0a9c6b82c83945c6c10488d");
        } else if (i > 1) {
            this.j = a(i, i2);
            removeAllViews();
            if (this.f == 0) {
                this.f = h.a(this.e) - h.a(this.e, 48.0f);
            }
            int i3 = this.f / i;
            int i4 = 0;
            while (i4 < i) {
                View a2 = a(i4 == this.j);
                TextView textView = (TextView) a2.findViewById(R.id.tv_child);
                if (textView != null && list.get(i4) != null && !TextUtils.isEmpty(list.get(i4).word)) {
                    textView.setText(list.get(i4).word);
                }
                ViewGroup.LayoutParams a3 = a(i3, a2, i4 == this.j);
                if (a3 != null) {
                    addView(a2, a3);
                } else {
                    addView(a2);
                }
                i4++;
            }
            b();
        } else {
            setVisibility(8);
        }
    }

    private ViewGroup.LayoutParams a(int i, View view, boolean z) {
        Object[] objArr = {Integer.valueOf(i), view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1579c7422043c0e0391a085e6772b0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1579c7422043c0e0391a085e6772b0a");
        }
        if (this.c <= 0 || this.d <= 0) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            return layoutParams;
        }
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).height = this.d;
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).width = i;
        return null;
    }

    public int getCheckedPosition() {
        return this.j;
    }

    public void setCheckedPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc3e4734c69bc4233a38b346a27db23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc3e4734c69bc4233a38b346a27db23");
            return;
        }
        int a2 = a(getPageCount(), i);
        if (a2 == -1 || a2 == this.j) {
            return;
        }
        a(this.j, false);
        a(a2, true);
        this.j = a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewPager.OnPageChangeListener a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5fc7c83091d11d57fc97fb45e4ac4e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewPager.OnPageChangeListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5fc7c83091d11d57fc97fb45e4ac4e8");
        }
        if (this.k == null || this.k.getAdapter() == null) {
            return null;
        }
        PagerAdapter adapter = this.k.getAdapter();
        int count = adapter.getCount();
        int currentItem = this.k.getCurrentItem();
        Object[] objArr2 = {Integer.valueOf(count), Integer.valueOf(currentItem)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a6170da8d5ca3c3ba5aa1f6e64d182d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a6170da8d5ca3c3ba5aa1f6e64d182d");
        } else if (count > 1) {
            this.j = a(count, currentItem);
            removeAllViews();
            if (this.f == 0) {
                this.f = h.a(this.e) - h.a(this.e, 48.0f);
            }
            int i = this.f / count;
            int i2 = 0;
            while (i2 < count) {
                View a2 = a(i2 == this.j);
                ViewGroup.LayoutParams a3 = a(i, a2, i2 == this.j);
                if (a3 != null) {
                    addView(a2, a3);
                } else {
                    addView(a2);
                }
                i2++;
            }
            b();
        } else {
            setVisibility(8);
        }
        try {
            adapter.registerDataSetObserver(this.m);
        } catch (IllegalStateException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        this.k.removeOnPageChangeListener(this);
        this.k.addOnPageChangeListener(this);
        return this;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67a152c21c10eee8872064f6c4e9a335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67a152c21c10eee8872064f6c4e9a335");
            return;
        }
        int pageCount = getPageCount();
        switch (this.b) {
            case 2:
                setVisibility(pageCount <= 0 ? 8 : 0);
                return;
            case 3:
                if (pageCount <= 1) {
                    r0 = 8;
                    break;
                }
                break;
        }
        setVisibility(r0);
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f2ec760a33b9549132f80b98ae101c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f2ec760a33b9549132f80b98ae101c");
            return;
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            childAt.setSelected(z);
            if (this.c <= 0 || this.d <= 0 || this.c == this.d) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (z) {
                layoutParams.width = this.c;
            } else {
                layoutParams.width = this.d;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    private View a(boolean z) {
        View view;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619211f24ba761a7996073c45a5dad84", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619211f24ba761a7996073c45a5dad84");
        }
        Drawable drawable = null;
        try {
            view = this.l.inflate(this.h, (ViewGroup) this, false);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            view = null;
        }
        if (view == null) {
            view = this.l.inflate(g, (ViewGroup) this, false);
        }
        if (this.i > 0) {
            try {
                drawable = getResources().getDrawable(this.i);
            } catch (Exception e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
            if (drawable != null) {
                view.setBackground(drawable);
            }
        }
        view.setSelected(z);
        return view;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b768ac9cd2d8a53862b18d9c180389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b768ac9cd2d8a53862b18d9c180389");
        } else {
            setCheckedPosition(i);
        }
    }
}
