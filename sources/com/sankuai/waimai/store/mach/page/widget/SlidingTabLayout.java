package com.sankuai.waimai.store.mach.page.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect a;
    private float A;
    private int B;
    private boolean C;
    private int D;
    private float E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private int O;
    private int P;
    private boolean Q;
    private float R;
    private Paint S;
    private SparseArray<Boolean> T;
    private b U;
    public LinearLayout b;
    private Context c;
    private ViewPager d;
    private ArrayList<String> e;
    private int f;
    private float g;
    private int h;
    private Rect i;
    private Rect j;
    private GradientDrawable k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Path o;
    private int p;
    private float q;
    private boolean r;
    private float s;
    private int t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798c61b6c21081dd8a0c32b7f723dfb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798c61b6c21081dd8a0c32b7f723dfb0");
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d171fc1808e9aa5d22939fb6046699ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d171fc1808e9aa5d22939fb6046699ff");
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d70f20b1e3def5dbc322cfde54831370", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d70f20b1e3def5dbc322cfde54831370");
            return;
        }
        this.i = new Rect();
        this.j = new Rect();
        this.k = new GradientDrawable();
        this.l = new Paint(1);
        this.m = new Paint(1);
        this.n = new Paint(1);
        this.o = new Path();
        this.p = 0;
        this.S = new Paint(1);
        this.T = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.c = context;
        this.b = new LinearLayout(context);
        addView(this.b);
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d232862a9bf9fb03d94cb0c05f34af75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d232862a9bf9fb03d94cb0c05f34af75");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tl_divider_color, R.attr.tl_divider_padding, R.attr.tl_divider_width, R.attr.tl_indicator_color, R.attr.tl_indicator_corner_radius, R.attr.tl_indicator_gravity, R.attr.tl_indicator_height, R.attr.tl_indicator_margin_bottom, R.attr.tl_indicator_margin_left, R.attr.tl_indicator_margin_right, R.attr.tl_indicator_margin_top, R.attr.tl_indicator_style, R.attr.tl_indicator_width, R.attr.tl_indicator_width_equal_title, R.attr.tl_tab_padding, R.attr.tl_tab_space_equal, R.attr.tl_tab_width, R.attr.tl_textAllCaps, R.attr.tl_textBold, R.attr.tl_textSelectColor, R.attr.tl_textUnselectColor, R.attr.tl_textsize, R.attr.tl_underline_color, R.attr.tl_underline_gravity, R.attr.tl_underline_height});
            this.p = obtainStyledAttributes.getInt(11, 0);
            this.t = obtainStyledAttributes.getColor(3, ColorUtils.a(this.p == 2 ? "#4B6A87" : "#ffffff", this.p == 2 ? -16777216 : -1));
            if (this.p == 1) {
                f = 4.0f;
            } else {
                f = this.p == 2 ? -1 : 2;
            }
            this.u = obtainStyledAttributes.getDimension(6, a(f));
            this.v = obtainStyledAttributes.getDimension(12, a(this.p == 1 ? 10.0f : -1.0f));
            this.w = obtainStyledAttributes.getDimension(4, a(this.p == 2 ? -1.0f : 0.0f));
            this.x = obtainStyledAttributes.getDimension(8, a(0.0f));
            this.y = obtainStyledAttributes.getDimension(10, a(this.p == 2 ? 7.0f : 0.0f));
            this.z = obtainStyledAttributes.getDimension(9, a(0.0f));
            this.A = obtainStyledAttributes.getDimension(7, a(this.p != 2 ? 0.0f : 7.0f));
            this.B = obtainStyledAttributes.getInt(5, 80);
            this.C = obtainStyledAttributes.getBoolean(13, false);
            this.D = obtainStyledAttributes.getColor(22, -1);
            this.E = obtainStyledAttributes.getDimension(24, a(0.0f));
            this.F = obtainStyledAttributes.getInt(23, 80);
            this.G = obtainStyledAttributes.getColor(0, -1);
            this.H = obtainStyledAttributes.getDimension(2, a(0.0f));
            this.I = obtainStyledAttributes.getDimension(1, a(12.0f));
            this.J = obtainStyledAttributes.getDimension(21, b(14.0f));
            this.K = obtainStyledAttributes.getColor(19, -1);
            this.L = obtainStyledAttributes.getColor(20, ColorUtils.a("#AAffffff", -1));
            this.M = obtainStyledAttributes.getInt(18, 0);
            this.N = obtainStyledAttributes.getBoolean(17, false);
            this.r = obtainStyledAttributes.getBoolean(15, false);
            this.s = obtainStyledAttributes.getDimension(16, a(-1.0f));
            this.q = obtainStyledAttributes.getDimension(14, (this.r || this.s > 0.0f) ? a(0.0f) : a(20.0f));
            obtainStyledAttributes.recycle();
        }
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals(ErrorCode.ERROR_CODE_RESPONSE_NULL)) {
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
        this.P = obtainStyledAttributes2.getDimensionPixelSize(0, -2);
        obtainStyledAttributes2.recycle();
    }

    public void setViewPager(ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462a9ac326ebb3d18c8e692d1a86165c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462a9ac326ebb3d18c8e692d1a86165c");
        } else if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        } else {
            this.d = viewPager;
            this.d.removeOnPageChangeListener(this);
            this.d.addOnPageChangeListener(this);
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3f95b9b24fe596ea6255c30c47fdd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3f95b9b24fe596ea6255c30c47fdd3");
            return;
        }
        this.b.removeAllViews();
        this.h = this.e == null ? this.d.getAdapter().getCount() : this.e.size();
        for (int i = 0; i < this.h; i++) {
            View inflate = View.inflate(this.c, R.layout.wm_sc_common_layout_tab, null);
            String charSequence = (this.e == null ? this.d.getAdapter().getPageTitle(i) : this.e.get(i)).toString();
            Object[] objArr2 = {Integer.valueOf(i), charSequence, inflate};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01d19466f0095a6743fd5f3bd1c1462c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01d19466f0095a6743fd5f3bd1c1462c");
            } else {
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tab_title);
                if (textView != null && charSequence != null) {
                    textView.setText(charSequence);
                }
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mach.page.widget.SlidingTabLayout.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "59f820d239387396bc9a7e772cc4e982", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "59f820d239387396bc9a7e772cc4e982");
                            return;
                        }
                        int indexOfChild = SlidingTabLayout.this.b.indexOfChild(view);
                        if (indexOfChild != -1) {
                            if (SlidingTabLayout.this.d.getCurrentItem() != indexOfChild) {
                                if (SlidingTabLayout.this.Q) {
                                    SlidingTabLayout.this.d.setCurrentItem(indexOfChild, false);
                                } else {
                                    SlidingTabLayout.this.d.setCurrentItem(indexOfChild);
                                }
                                if (SlidingTabLayout.this.U != null) {
                                    SlidingTabLayout.this.U.a(indexOfChild);
                                }
                            } else if (SlidingTabLayout.this.U != null) {
                                SlidingTabLayout.this.U.b(indexOfChild);
                            }
                        }
                    }
                });
                LinearLayout.LayoutParams layoutParams = this.r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
                if (this.s > 0.0f) {
                    layoutParams = new LinearLayout.LayoutParams((int) this.s, -1);
                }
                this.b.addView(inflate, i, layoutParams);
            }
        }
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981281f9c36f7a3ebcc0c60b03a70358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981281f9c36f7a3ebcc0c60b03a70358");
            return;
        }
        int i = 0;
        while (i < this.h) {
            TextView textView = (TextView) this.b.getChildAt(i).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i == this.f ? this.K : this.L);
                textView.setTextSize(0, this.J);
                textView.setPadding((int) this.q, 0, (int) this.q, 0);
                if (this.N) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                if (this.M == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (this.M == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (this.f == i) {
                    textView.getPaint().setFakeBoldText(true);
                } else {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i++;
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5782541c2eb43abe35f1cde211de314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5782541c2eb43abe35f1cde211de314");
            return;
        }
        this.f = i;
        this.g = f;
        c();
        invalidate();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d4445f32a8f158eca7c7b1e7626b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d4445f32a8f158eca7c7b1e7626b84");
        } else {
            a(i);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1edf06879ef2f35ec38c54c3c48db480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1edf06879ef2f35ec38c54c3c48db480");
        } else if (this.h <= 0) {
        } else {
            int width = (int) (this.g * this.b.getChildAt(this.f).getWidth());
            int left = this.b.getChildAt(this.f).getLeft() + width;
            if (this.f > 0 || width > 0) {
                d();
                left = (left - ((getWidth() / 2) - getPaddingLeft())) + ((this.j.right - this.j.left) / 2);
            }
            if (left != this.O) {
                this.O = left;
                scrollTo(left, 0);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd146130680b836c3d091665467fd3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd146130680b836c3d091665467fd3d4");
            return;
        }
        int i2 = 0;
        while (i2 < this.h) {
            View childAt = this.b.getChildAt(i2);
            boolean z = i2 == i;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z ? this.K : this.L);
                if (this.M == 1) {
                    textView.getPaint().setFakeBoldText(z);
                }
            }
            i2++;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505557890caa8bf0ca07a34297a14b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505557890caa8bf0ca07a34297a14b91");
            return;
        }
        View childAt = this.b.getChildAt(this.f);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.p == 0 && this.C) {
            this.S.setTextSize(this.J);
            this.R = ((right - left) - this.S.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f;
        }
        if (this.f < this.h - 1) {
            View childAt2 = this.b.getChildAt(this.f + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            left += this.g * (left2 - left);
            right += this.g * (right2 - right);
            if (this.p == 0 && this.C) {
                this.S.setTextSize(this.J);
                this.R += this.g * ((((right2 - left2) - this.S.measureText(((TextView) childAt2.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f) - this.R);
            }
        }
        int i = (int) left;
        this.i.left = i;
        int i2 = (int) right;
        this.i.right = i2;
        if (this.p == 0 && this.C) {
            this.i.left = (int) ((left + this.R) - 1.0f);
            this.i.right = (int) ((right - this.R) - 1.0f);
        }
        this.j.left = i;
        this.j.right = i2;
        if (this.v >= 0.0f) {
            float left3 = childAt.getLeft() + ((childAt.getWidth() - this.v) / 2.0f);
            if (this.f < this.h - 1) {
                left3 += this.g * ((childAt.getWidth() / 2) + (this.b.getChildAt(this.f + 1).getWidth() / 2));
            }
            this.i.left = (int) left3;
            this.i.right = (int) (this.i.left + this.v);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bb843160c73e8533632bfc608754a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bb843160c73e8533632bfc608754a7");
            return;
        }
        super.onDraw(canvas);
        if (isInEditMode() || this.h <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        if (this.H > 0.0f) {
            this.m.setStrokeWidth(this.H);
            this.m.setColor(this.G);
            for (int i = 0; i < this.h - 1; i++) {
                View childAt = this.b.getChildAt(i);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.m);
            }
        }
        if (this.E > 0.0f) {
            this.l.setColor(this.D);
            if (this.F == 80) {
                float f = height;
                canvas.drawRect(paddingLeft, f - this.E, this.b.getWidth() + paddingLeft, f, this.l);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.b.getWidth() + paddingLeft, this.E, this.l);
            }
        }
        d();
        if (this.p == 1) {
            if (this.u > 0.0f) {
                this.n.setColor(this.t);
                this.o.reset();
                float f2 = height;
                this.o.moveTo(this.i.left + paddingLeft, f2);
                this.o.lineTo((this.i.left / 2) + paddingLeft + (this.i.right / 2), f2 - this.u);
                this.o.lineTo(paddingLeft + this.i.right, f2);
                this.o.close();
                canvas.drawPath(this.o, this.n);
                return;
            }
            return;
        }
        if (this.p == 2) {
            if (this.u < 0.0f) {
                this.u = (height - this.y) - this.A;
            }
            if (this.u <= 0.0f) {
                return;
            }
            if (this.w < 0.0f || this.w > this.u / 2.0f) {
                this.w = this.u / 2.0f;
            }
            this.k.setColor(this.t);
            this.k.setBounds(((int) this.x) + paddingLeft + this.i.left, (int) this.y, (int) ((paddingLeft + this.i.right) - this.z), (int) (this.y + this.u));
        } else if (this.u <= 0.0f) {
            return;
        } else {
            this.k.setColor(this.t);
            if (this.B == 80) {
                this.k.setBounds(((int) this.x) + paddingLeft + this.i.left, (height - ((int) this.u)) - ((int) this.A), (paddingLeft + this.i.right) - ((int) this.z), height - ((int) this.A));
            } else {
                this.k.setBounds(((int) this.x) + paddingLeft + this.i.left, (int) this.y, (paddingLeft + this.i.right) - ((int) this.z), ((int) this.u) + ((int) this.y));
            }
        }
        this.k.setCornerRadius(this.w);
        this.k.draw(canvas);
    }

    public void setCurrentTab(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744b6d0fe92aac4c1915262ff9d39f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744b6d0fe92aac4c1915262ff9d39f5e");
            return;
        }
        this.f = i;
        this.d.setCurrentItem(i);
    }

    public void setIndicatorStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf43b9cdb5a311f47bd0df7a74d27ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf43b9cdb5a311f47bd0df7a74d27ed");
            return;
        }
        this.p = i;
        invalidate();
    }

    public void setTabPadding(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24be2cf8a60749b76c4b70bf08ce936c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24be2cf8a60749b76c4b70bf08ce936c");
            return;
        }
        this.q = a(f);
        b();
    }

    public void setTabSpaceEqual(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08743a4ce00a3f9151a1be070a8a5783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08743a4ce00a3f9151a1be070a8a5783");
            return;
        }
        this.r = z;
        b();
    }

    public void setTabWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659e395296128f92377d00a6b812b724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659e395296128f92377d00a6b812b724");
            return;
        }
        this.s = a(f);
        b();
    }

    public void setIndicatorColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6c4a835f0f72ca38e5bea3a9768460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6c4a835f0f72ca38e5bea3a9768460");
            return;
        }
        this.t = i;
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "773ad0fb8975b8e2e8dddecc0d55d1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "773ad0fb8975b8e2e8dddecc0d55d1eb");
            return;
        }
        this.u = a(f);
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a3119809d319a76790c350e77e5bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a3119809d319a76790c350e77e5bbe");
            return;
        }
        this.v = a(f);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cd59e346ca35996781c9b81035a3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cd59e346ca35996781c9b81035a3b4");
            return;
        }
        this.w = a(f);
        invalidate();
    }

    public void setIndicatorGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6741ad7cd6514e641cd6d280abc2c849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6741ad7cd6514e641cd6d280abc2c849");
            return;
        }
        this.B = i;
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26bc92f404e74f21c159093099f1a7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26bc92f404e74f21c159093099f1a7b8");
            return;
        }
        this.C = z;
        invalidate();
    }

    public void setUnderlineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16373f8c48a39eb8d504456470b38a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16373f8c48a39eb8d504456470b38a81");
            return;
        }
        this.D = i;
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573c92a7a678bf33e5ed221ccc9f6a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573c92a7a678bf33e5ed221ccc9f6a1b");
            return;
        }
        this.E = a(f);
        invalidate();
    }

    public void setUnderlineGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd2ddaa8ebfc2ef6a4e527dec65c891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd2ddaa8ebfc2ef6a4e527dec65c891");
            return;
        }
        this.F = i;
        invalidate();
    }

    public void setDividerColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec4f7c96d8e7065b91972667a961bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec4f7c96d8e7065b91972667a961bb7");
            return;
        }
        this.G = i;
        invalidate();
    }

    public void setDividerWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae8f3a02e0f6a1b1a8b76cf5201884e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae8f3a02e0f6a1b1a8b76cf5201884e");
            return;
        }
        this.H = a(f);
        invalidate();
    }

    public void setDividerPadding(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867579aa7b6047dd2611795db72b5f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867579aa7b6047dd2611795db72b5f3b");
            return;
        }
        this.I = a(f);
        invalidate();
    }

    public void setTextsize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b28ea29c9443eb82413e0ef1bb19ee76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b28ea29c9443eb82413e0ef1bb19ee76");
            return;
        }
        this.J = b(f);
        b();
    }

    public void setTextSelectColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0566fbb1f519b89508acaa25b9015f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0566fbb1f519b89508acaa25b9015f9");
            return;
        }
        this.K = i;
        b();
    }

    public void setTextUnselectColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095e9705901b03ab6b87dcc8214fe7df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095e9705901b03ab6b87dcc8214fe7df");
            return;
        }
        this.L = i;
        b();
    }

    public void setTextBold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea0c85e7b5fe317b6cee95c182e6f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea0c85e7b5fe317b6cee95c182e6f41");
            return;
        }
        this.M = i;
        b();
    }

    public void setTextAllCaps(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77933cf0a1573cdf83f9cd534492e77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77933cf0a1573cdf83f9cd534492e77a");
            return;
        }
        this.N = z;
        b();
    }

    public void setSnapOnTabClick(boolean z) {
        this.Q = z;
    }

    public int getTabCount() {
        return this.h;
    }

    public int getCurrentTab() {
        return this.f;
    }

    public int getIndicatorStyle() {
        return this.p;
    }

    public float getTabPadding() {
        return this.q;
    }

    public float getTabWidth() {
        return this.s;
    }

    public int getIndicatorColor() {
        return this.t;
    }

    public float getIndicatorHeight() {
        return this.u;
    }

    public float getIndicatorWidth() {
        return this.v;
    }

    public float getIndicatorCornerRadius() {
        return this.w;
    }

    public float getIndicatorMarginLeft() {
        return this.x;
    }

    public float getIndicatorMarginTop() {
        return this.y;
    }

    public float getIndicatorMarginRight() {
        return this.z;
    }

    public float getIndicatorMarginBottom() {
        return this.A;
    }

    public int getUnderlineColor() {
        return this.D;
    }

    public float getUnderlineHeight() {
        return this.E;
    }

    public int getDividerColor() {
        return this.G;
    }

    public float getDividerWidth() {
        return this.H;
    }

    public float getDividerPadding() {
        return this.I;
    }

    public float getTextsize() {
        return this.J;
    }

    public int getTextSelectColor() {
        return this.K;
    }

    public int getTextUnselectColor() {
        return this.L;
    }

    public int getTextBold() {
        return this.M;
    }

    public void setOnTabSelectListener(b bVar) {
        this.U = bVar;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8dfd14347dc0155f9cc78687b54203", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8dfd14347dc0155f9cc78687b54203");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f);
        return bundle;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61d4c106d9e1763e9951006ac9cce0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61d4c106d9e1763e9951006ac9cce0e");
            return;
        }
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f != 0 && this.b.getChildCount() > 0) {
                a(this.f);
                c();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbb9e56df4aae8fece43ccd0b0cc388", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbb9e56df4aae8fece43ccd0b0cc388")).intValue() : (int) ((f * this.c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435e796c81a08773395b8de2eeb9f855", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435e796c81a08773395b8de2eeb9f855")).intValue() : (int) ((f * this.c.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
