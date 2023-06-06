package com.sankuai.waimai.business.page.homepage.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.l;
import com.dianping.widget.view.NovaRelativeLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.view.tab.TabInfo;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.SafeLottieAnimationView;
import com.sankuai.waimai.lottie.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitleIndicator extends LinearLayout implements View.OnClickListener, View.OnFocusChangeListener {
    public static ChangeQuickRedirect a;
    private boolean A;
    public int b;
    public List<a> c;
    public boolean d;
    private int e;
    private boolean f;
    private SparseArray<TabInfo> g;
    private ColorStateList h;
    private float i;
    private float j;
    private Path k;
    private Paint l;
    private Paint m;
    private float n;
    private float o;
    private Context p;
    private int q;
    private int r;
    private int s;
    private LayoutInflater t;
    private int u;
    private boolean v;
    private int w;
    private HashMap<String, com.airbnb.lottie.e> x;
    private boolean y;
    private b z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i);
    }

    public static /* synthetic */ boolean a(TitleIndicator titleIndicator, boolean z) {
        titleIndicator.f = false;
        return false;
    }

    public TitleIndicator(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f94b08dba89cff5d417d6e2ce6aefb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f94b08dba89cff5d417d6e2ce6aefb");
            return;
        }
        this.e = 0;
        this.f = true;
        this.k = new Path();
        this.b = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.c = new ArrayList();
        this.u = this.b;
        this.v = false;
        this.w = 0;
        this.x = new HashMap<>();
        this.y = false;
        this.A = false;
        a(0.0f, 0);
    }

    public TitleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c79fd4b0ecf4045efb9119331fb7af4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c79fd4b0ecf4045efb9119331fb7af4");
            return;
        }
        this.e = 0;
        this.f = true;
        this.k = new Path();
        this.b = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.c = new ArrayList();
        this.u = this.b;
        this.v = false;
        this.w = 0;
        this.x = new HashMap<>();
        this.y = false;
        this.A = false;
        setFocusable(true);
        setOnFocusChangeListener(this);
        this.p = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor, R.attr.indicatorTitlePadding, R.attr.indicatorClipPadding, R.attr.textSizeNormal, R.attr.textSizeSelected, R.attr.indicatorFooterLineHeight, R.attr.indicatorFooterColor, R.attr.footerTriangleHeight});
        int color = obtainStyledAttributes.getColor(6, 0);
        this.i = this.p.getResources().getDimension(R.dimen.titleindicator_text_size);
        this.j = this.i;
        this.o = obtainStyledAttributes.getDimension(5, 0.0f);
        this.n = obtainStyledAttributes.getDimension(7, 0.0f);
        a(this.o, color);
        obtainStyledAttributes.recycle();
    }

    public void setHidden(boolean z) {
        this.d = z;
    }

    private void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2c8473a2c62818a5453e619aa1d360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2c8473a2c62818a5453e619aa1d360");
            return;
        }
        this.l = new Paint();
        this.l.setStyle(Paint.Style.FILL_AND_STROKE);
        this.l.setStrokeWidth(f);
        this.l.setColor(i);
        this.m = new Paint();
        this.m.setStyle(Paint.Style.FILL_AND_STROKE);
        this.m.setColor(i);
        this.t = (LayoutInflater) this.p.getSystemService("layout_inflater");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc40338b05924ffbe9ea4bf4b314f9e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc40338b05924ffbe9ea4bf4b314f9e2");
            return;
        }
        super.onDraw(canvas);
        if (this.s != 0) {
            this.r = getWidth() / this.s;
            f = 0.0f;
        } else {
            this.r = getWidth();
            f = this.e;
        }
        Path path = this.k;
        path.rewind();
        float f2 = (this.b * this.r) + 0.0f + f;
        float f3 = (((this.b + 1) * this.r) - 0.0f) + f;
        float height = ((getHeight() - this.o) - this.n) + 1.0f;
        path.moveTo(f2, height);
        path.lineTo(f3, height);
        float height2 = (getHeight() - this.o) + 1.0f;
        path.lineTo(f3, height2);
        path.lineTo(f2, height2);
        path.close();
        canvas.drawPath(path, this.m);
    }

    @NonNull
    public SparseArray<TabInfo> getTabs() {
        return this.g;
    }

    @Nullable
    public final TabInfo a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9882c9bd5487f6e8b86ec16a110d5c6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9882c9bd5487f6e8b86ec16a110d5c6f");
        }
        if (this.g != null) {
            return this.g.get(i);
        }
        return null;
    }

    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd1e233a7c4b0ad63c2e734ed92fdb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd1e233a7c4b0ad63c2e734ed92fdb1");
        }
        TabInfo a2 = a(i);
        if (a2 != null) {
            return findViewWithTag(Integer.valueOf(a2.b));
        }
        return null;
    }

    private String d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c45f9343c5dea5cc982a949b2152305", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c45f9343c5dea5cc982a949b2152305");
        }
        String str = "title " + i;
        return (this.g == null || this.g.size() <= i) ? str : this.g.get(i).c;
    }

    private boolean e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4680702988c2448a5aca8c52f485732f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4680702988c2448a5aca8c52f485732f")).booleanValue();
        }
        if (this.g == null || this.g.size() <= i) {
            return false;
        }
        return this.g.get(i).g;
    }

    public final void a(int i, @NonNull SparseArray<TabInfo> sparseArray) {
        Object[] objArr = {Integer.valueOf(i), sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9ba72d9009985c39d841c3edc7d127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9ba72d9009985c39d841c3edc7d127");
            return;
        }
        removeAllViews();
        this.c.clear();
        this.g = sparseArray;
        this.s = sparseArray.size();
        for (int i2 = 0; i2 < this.s; i2++) {
            a(i2, sparseArray.get(i2).b, d(i2), e(i2));
        }
        setCurrentTab(i);
        invalidate();
    }

    public final void a(int i, @NonNull TabInfo tabInfo) {
        Object[] objArr = {1, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f0859491e88a011ed4723990084260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f0859491e88a011ed4723990084260");
            return;
        }
        TabInfo tabInfo2 = this.g.get(1);
        if (tabInfo2 == null || tabInfo.l != tabInfo2.l) {
            this.g.put(1, tabInfo);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "663119a24574305929da1f5b33095032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "663119a24574305929da1f5b33095032");
            return;
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            childAt.setVisibility(i2);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {4, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4a239f07d32478c42e81ef2e555e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4a239f07d32478c42e81ef2e555e53");
            return;
        }
        ImageView imageView = (ImageView) getChildAt(4).findViewById(R.id.tab_title_tips);
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void a(int i, int i2, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6fbd74b3aabc1350e81923526d2599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6fbd74b3aabc1350e81923526d2599");
            return;
        }
        NovaRelativeLayout novaRelativeLayout = (NovaRelativeLayout) this.t.inflate(R.layout.wm_page_main_view_bottom_tab, (ViewGroup) this, false);
        View findViewById = novaRelativeLayout.findViewById(R.id.tab_divider);
        View findViewById2 = novaRelativeLayout.findViewById(R.id.tab_bar);
        ImageView imageView = (ImageView) novaRelativeLayout.findViewById(R.id.icon_normal);
        TextView textView = (TextView) novaRelativeLayout.findViewById(R.id.tab_title);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) novaRelativeLayout.findViewById(R.id.icon_lottie_selected);
        ImageView imageView2 = (ImageView) novaRelativeLayout.findViewById(R.id.tab_title_tips);
        if (this.h != null) {
            textView.setTextColor(this.h);
        }
        if (this.i > 0.0f) {
            textView.setTextSize(0, this.i);
        }
        textView.setText(str);
        novaRelativeLayout.setContentDescription(str);
        a aVar = new a();
        aVar.b = lottieAnimationView;
        aVar.a = textView;
        aVar.c = findViewById;
        aVar.d = findViewById2;
        aVar.e = imageView;
        aVar.f = i;
        a(i, aVar);
        this.c.add(i, aVar);
        if (z) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        int i3 = this.q;
        this.q = i3 + 1;
        novaRelativeLayout.setId(i3 + 16776960);
        novaRelativeLayout.setTag(Integer.valueOf(i2));
        novaRelativeLayout.setOnClickListener(this);
        ((LinearLayout.LayoutParams) novaRelativeLayout.getLayoutParams()).gravity = 16;
        addView(novaRelativeLayout);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 1;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c7c25e2fbaa6c6f8dacece8f41fe70", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c7c25e2fbaa6c6f8dacece8f41fe70");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        this.w = intValue;
        String str = null;
        if (intValue != 0) {
            switch (intValue) {
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
            }
        } else {
            str = "c_m84bv26";
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_fFypT").a("c_m84bv26");
        a2.b = AppUtil.generatePageInfoKey(this);
        JudasManualManager.a a3 = a2.a("tab_type", String.valueOf(i)).a("type", com.sankuai.waimai.business.page.home.helper.b.a().c ? 1 : 0);
        if (!TextUtils.isEmpty(str)) {
            a3.a(str);
        }
        a3.a();
        if (this.z != null) {
            this.z.a(intValue);
        }
    }

    public void setOnTabClickListener(b bVar) {
        this.z = bVar;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329e316cd029b52aacd1e02ad6a313c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329e316cd029b52aacd1e02ad6a313c4");
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof NovaRelativeLayout) {
                View findViewById = childAt.findViewById(R.id.tab_bar);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) childAt.findViewById(R.id.icon_lottie_selected);
                if (findViewById != null && lottieAnimationView != null && (lottieAnimationView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lottieAnimationView.getLayoutParams();
                    if (z) {
                        layoutParams.height = g.a(com.meituan.android.singleton.b.a, 53.0f);
                        marginLayoutParams.bottomMargin = g.a(com.meituan.android.singleton.b.a, 4.0f);
                    } else {
                        layoutParams.height = g.a(com.meituan.android.singleton.b.a, 55.0f);
                        marginLayoutParams.bottomMargin = g.a(com.meituan.android.singleton.b.a, 6.0f);
                    }
                    findViewById.setLayoutParams(layoutParams);
                    lottieAnimationView.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public int getTabCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e824614f21ff1b3ca4f5a7b47029fbc3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e824614f21ff1b3ca4f5a7b47029fbc3")).intValue() : getChildCount();
    }

    public int getVisibleTabCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7af4e4ee9fa24d11b787d2340c22542", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7af4e4ee9fa24d11b787d2340c22542")).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public synchronized void setCurrentTab(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1094c556f65666a540854ed1c79af3c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1094c556f65666a540854ed1c79af3c7");
            return;
        }
        if (i >= 0 && i < getTabCount()) {
            View childAt = getChildAt(this.b);
            childAt.setSelected(false);
            a(childAt, false);
            this.u = this.b;
            this.b = i;
            View childAt2 = getChildAt(this.b);
            childAt2.setSelected(true);
            a(childAt2, true);
            if (i == 2) {
                String str = "c_vt3zp1ef";
                if (this.u == 3) {
                    str = "c_48pltlz";
                } else if (this.u == 0) {
                    str = "c_m84bv26";
                } else if (this.u == 4) {
                    str = "c_ul2elkn";
                }
                JudasManualManager.a a2 = JudasManualManager.a("b_utb63bxf");
                a2.b = AppUtil.generatePageInfoKey(this);
                a2.a(str).a("viptab_bubble_type", com.sankuai.waimai.business.page.homepage.bubble.g.a().h).a();
            }
            invalidate();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3df6214c7e6c4e0ba3dd74a449ec7f11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3df6214c7e6c4e0ba3dd74a449ec7f11");
                return;
            }
            a aVar = this.c.get(this.b);
            a aVar2 = this.c.get(this.u);
            if (this.b != this.u) {
                if (aVar != null && aVar.b != null) {
                    aVar.a.setVisibility(4);
                    a(aVar.b, c(this.b), true, false, true);
                    aVar.a.requestFocus();
                    aVar.a.setSelected(true);
                }
                if (aVar2 != null && aVar2.b != null) {
                    aVar2.a.setVisibility(4);
                    a(aVar2.b, c(this.u), false, true, true);
                }
            } else if (aVar != null && aVar.b != null && !this.y) {
                aVar.b.setVisibility(0);
            }
        }
    }

    private void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8d09da8ae964b6485dc10469f803e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8d09da8ae964b6485dc10469f803e3");
        } else {
            ((TextView) view.findViewById(R.id.tab_title)).setTextSize(0, z ? this.j : this.i);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdcc437d2a9cfd619485fe074836dfb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdcc437d2a9cfd619485fe074836dfb7");
        } else if (view == this && z && getTabCount() > 0) {
            getChildAt(this.b).requestFocus();
        } else if (z) {
            int tabCount = getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if (getChildAt(i) == view) {
                    setCurrentTab(i);
                    return;
                }
            }
        }
    }

    private void a(int i, a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ddb981551694c948834f624502e8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ddb981551694c948834f624502e8c7");
        } else if (aVar.b != null) {
            LottieAnimationView lottieAnimationView = aVar.b;
            aVar.a.setVisibility(4);
            a(lottieAnimationView, c(i), i == 0);
        }
    }

    @Nullable
    private Drawable a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0c54c150b374a4a6e6254bcb096261", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0c54c150b374a4a6e6254bcb096261") : getResources().getDrawable(i);
    }

    public void setCoupon(boolean z) {
        this.A = z;
    }

    public String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6301f4001da572d2c7e3cba9cc960c11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6301f4001da572d2c7e3cba9cc960c11");
        }
        switch (i) {
            case 0:
                return this.v ? "wm_main_tab_normal_house_rocket.json" : "wm_main_tab_select_home.json";
            case 1:
                return "wm_main_tab_select_content_feed.json";
            case 2:
                return this.A ? "wm_main_tab_select_shen.json" : "wm_main_tab_select_vip.json";
            case 3:
                return "wm_main_tab_select_order.json";
            case 4:
                return "wm_main_tab_select_mine.json";
            default:
                return null;
        }
    }

    public final void a(int i, boolean z, boolean z2, String str) {
        Object[] objArr = {0, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d09352badbbf6fa56a4a1883294d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d09352badbbf6fa56a4a1883294d87");
            return;
        }
        View childAt = getChildAt(0);
        childAt.setContentDescription(str);
        TextView textView = (TextView) childAt.findViewById(R.id.tab_title);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) childAt.findViewById(R.id.icon_lottie_selected);
        textView.setText(str);
        textView.setVisibility(4);
        if (z) {
            this.v = true;
            if (z2) {
                return;
            }
            a(lottieAnimationView, "wm_main_tab_select_house_rocket.json", true, false, true);
            return;
        }
        lottieAnimationView.setTag(R.id.icon_lottie_selected, null);
        if (this.v && this.w == 0) {
            this.v = false;
            a(lottieAnimationView, "wm_main_tab_select_house_rocket.json", true, true, true);
        }
    }

    public final void a(int i, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc009676a9793bd871f606ac9b53f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc009676a9793bd871f606ac9b53f6c");
            return;
        }
        View childAt = getChildAt(i);
        childAt.setContentDescription(str3);
        TextView textView = (TextView) childAt.findViewById(R.id.tab_title);
        textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        textView.setText(str3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public TextView a;
        public LottieAnimationView b;
        public View c;
        public View d;
        public ImageView e;
        public int f;

        public a() {
        }
    }

    private void a(LottieAnimationView lottieAnimationView, String str, boolean z) {
        Object[] objArr = {lottieAnimationView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e545a1668f07ee1655e9d935e362f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e545a1668f07ee1655e9d935e362f2");
        } else {
            a(lottieAnimationView, str, z, false, false);
        }
    }

    public void a(LottieAnimationView lottieAnimationView, String str, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {lottieAnimationView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be7ca28d3d9c5555f33939cd3ab3e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be7ca28d3d9c5555f33939cd3ab3e48");
        } else if (this.x.containsKey(str) && this.x.get(str) != null) {
            a(this.x.get(str), lottieAnimationView, z, z2, z3);
        } else if (this.f) {
            b(lottieAnimationView, str, z, z2, z3);
        } else {
            c(lottieAnimationView, str, z, z2, z3);
        }
    }

    private void b(final LottieAnimationView lottieAnimationView, final String str, final boolean z, final boolean z2, final boolean z3) {
        Object[] objArr = {lottieAnimationView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d39225c0df4c0d7233ef8c52f31a631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d39225c0df4c0d7233ef8c52f31a631");
        } else {
            com.sankuai.waimai.lottie.e.a().a((SafeLottieAnimationView) lottieAnimationView, "home_page_tab_lottie", str, "dynamic-tabs-lottie", new com.sankuai.waimai.lottie.c() { // from class: com.sankuai.waimai.business.page.homepage.view.TitleIndicator.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.lottie.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f8eab32a35a5c2ddeacbdfef12f9ec3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f8eab32a35a5c2ddeacbdfef12f9ec3");
                        return;
                    }
                    TitleIndicator.a(TitleIndicator.this, false);
                    TitleIndicator.this.x.clear();
                    TitleIndicator.this.c(lottieAnimationView, str, z, z2, z3);
                }

                @Override // com.sankuai.waimai.lottie.c
                public final void a(com.airbnb.lottie.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec6ca88482f1c0c66c7e0518f223939", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec6ca88482f1c0c66c7e0518f223939");
                    } else if (eVar == null) {
                    } else {
                        TitleIndicator.this.x.put(str, eVar);
                        TitleIndicator.this.a(eVar, lottieAnimationView, z, z2, z3);
                    }
                }

                @Override // com.sankuai.waimai.lottie.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "431a98890e69ea3122a169082434531b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "431a98890e69ea3122a169082434531b");
                        return;
                    }
                    TitleIndicator.a(TitleIndicator.this, false);
                    TitleIndicator.this.x.clear();
                    TitleIndicator.this.c(lottieAnimationView, str, z, z2, z3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final LottieAnimationView lottieAnimationView, final String str, final boolean z, final boolean z2, final boolean z3) {
        Object[] objArr = {lottieAnimationView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310ef8105eae952c8231ce9df2a434b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310ef8105eae952c8231ce9df2a434b1");
        } else {
            a.b.a(this.p, str, new l() { // from class: com.sankuai.waimai.business.page.homepage.view.TitleIndicator.2
                public static ChangeQuickRedirect a;

                @Override // com.airbnb.lottie.l
                public final void a(@Nullable com.airbnb.lottie.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f27f91c8b0913d35867330ab02c157b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f27f91c8b0913d35867330ab02c157b0");
                    } else if (eVar == null) {
                    } else {
                        TitleIndicator.this.x.put(str, eVar);
                        TitleIndicator.this.a(eVar, lottieAnimationView, z, z2, z3);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.airbnb.lottie.e eVar, LottieAnimationView lottieAnimationView, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {eVar, lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27afea0b425df38448c497645a59a7fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27afea0b425df38448c497645a59a7fc");
            return;
        }
        try {
            lottieAnimationView.e();
            lottieAnimationView.setComposition(eVar);
            if (z && !z3) {
                lottieAnimationView.setProgress(1.0f);
            } else {
                lottieAnimationView.setProgress(0.0f);
            }
            if (z3) {
                if (z2) {
                    lottieAnimationView.setSpeed(-6.0f);
                } else {
                    lottieAnimationView.setSpeed(1.0f);
                }
                lottieAnimationView.a();
            }
        } catch (Exception e) {
            this.f = false;
            e.printStackTrace();
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public final void b(boolean z) {
        Drawable a2;
        int i = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47a858532fe81cc17473a3af96743fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47a858532fe81cc17473a3af96743fc");
        } else if (this.y != z) {
            this.y = z;
            for (a aVar : this.c) {
                aVar.c.setBackgroundColor(Color.parseColor(z ? DiagnoseLog.COLOR_ERROR : "#f1f1f2"));
                aVar.d.setBackgroundColor(Color.parseColor(z ? DiagnoseLog.COLOR_ERROR : "#FFFFFF"));
                if (z) {
                    aVar.e.setVisibility(0);
                    ImageView imageView = aVar.e;
                    int i2 = aVar.f;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(i2);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e366cacdf202cd820bde5252253b9f5a", RobustBitConfig.DEFAULT_VALUE)) {
                        switch (i2) {
                            case 0:
                                a2 = a("tab_poi_normal", R.drawable.wm_page_main_home_tab_poi_icon_dark);
                                break;
                            case 1:
                                a2 = a("tab_ugc_feed_normal", R.drawable.wm_page_main_home_tab_content_dark);
                                break;
                            case 2:
                                if (this.A) {
                                    a2 = a("tab_flash_buy_normal", R.drawable.wm_page_main_home_tab_shen_icon_dark);
                                    break;
                                } else {
                                    a2 = a("tab_flash_buy_normal", R.drawable.wm_page_main_home_tab_vip_card_dark);
                                    break;
                                }
                            case 3:
                                a2 = a("tab_order_normal", R.drawable.wm_page_main_home_tab_order_icon_dark);
                                break;
                            case 4:
                                a2 = a("tab_user_normal", R.drawable.wm_page_main_home_tab_user_icon_dark);
                                break;
                            default:
                                a2 = null;
                                break;
                        }
                    } else {
                        a2 = (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e366cacdf202cd820bde5252253b9f5a");
                    }
                    imageView.setImageDrawable(a2);
                    aVar.b.setVisibility(8);
                } else {
                    aVar.e.setVisibility(8);
                    aVar.b.setVisibility(0);
                }
                i = 1;
            }
        }
    }
}
