package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashLabel extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Drawable A;
    private Drawable B;
    private String C;
    private String D;
    private String E;
    private String F;
    private int G;
    private int H;
    private boolean I;
    private Context b;
    private ViewGroup c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout f;
    private LinearLayout g;
    private ImageView h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private View l;
    private View m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public FlashLabel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daaf67f0439e2e28149caa7ac2300374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daaf67f0439e2e28149caa7ac2300374");
        }
    }

    private FlashLabel(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2877ad04700b39140f9de70a8d2753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2877ad04700b39140f9de70a8d2753");
        }
    }

    public FlashLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df92c6b273df7b31388d3e239fc33dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df92c6b273df7b31388d3e239fc33dff");
        } else {
            a(context, attributeSet, i);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1134dad6a8f21e1c52a18a0885002e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1134dad6a8f21e1c52a18a0885002e3");
            return;
        }
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.labelSize, R.attr.mainLabelType, R.attr.secondLabelType, R.attr.mainLabelTitleColor, R.attr.secondLabelTitleColor, R.attr.mainBackGroundColor, R.attr.secondBackGroundColor, R.attr.mainGradientStartColor, R.attr.secondGradientStartColor, R.attr.mainGradientEndColor, R.attr.secondGradientEndColor, R.attr.mainGradientAngle, R.attr.secondGradientAngle, R.attr.labelBorderColor, R.attr.labelDeliverColor, R.attr.mainLabelIconRes, R.attr.secondLabelIconRes, R.attr.mainLabelIconUrl, R.attr.secondLabelIconUrl, R.attr.mainLabelTitle, R.attr.secondLabelTitle, R.attr.labelTitleBold}, i, 0);
        this.n = obtainStyledAttributes.getInt(0, -1);
        this.o = obtainStyledAttributes.getInt(1, -1);
        this.p = obtainStyledAttributes.getInt(2, -1);
        this.q = obtainStyledAttributes.getResourceId(3, -1);
        this.r = obtainStyledAttributes.getResourceId(4, -1);
        this.s = obtainStyledAttributes.getResourceId(5, -1);
        this.t = obtainStyledAttributes.getResourceId(6, -1);
        this.u = obtainStyledAttributes.getResourceId(7, -1);
        this.v = obtainStyledAttributes.getResourceId(8, -1);
        this.w = obtainStyledAttributes.getResourceId(9, -1);
        this.x = obtainStyledAttributes.getResourceId(10, -1);
        this.G = obtainStyledAttributes.getResourceId(13, -1);
        this.H = obtainStyledAttributes.getResourceId(14, -1);
        this.I = obtainStyledAttributes.getBoolean(21, false);
        this.y = obtainStyledAttributes.getInt(11, -1);
        this.z = obtainStyledAttributes.getInt(12, -1);
        int resourceId = obtainStyledAttributes.getResourceId(15, -1);
        if (resourceId != -1) {
            try {
                this.A = getResources().getDrawable(resourceId);
            } catch (Exception unused) {
            }
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(16, -1);
        if (resourceId2 != -1) {
            try {
                this.B = getResources().getDrawable(resourceId2);
            } catch (Exception unused2) {
            }
        }
        this.C = obtainStyledAttributes.getString(17);
        this.D = obtainStyledAttributes.getString(18);
        this.E = obtainStyledAttributes.getString(19);
        this.F = obtainStyledAttributes.getString(20);
        obtainStyledAttributes.recycle();
        inflate(this.b, R.layout.wm_sc_ui_label, this);
        this.c = (ViewGroup) findViewById(R.id.label_container);
        this.d = (LinearLayout) findViewById(R.id.label_view_main);
        this.e = (LinearLayout) findViewById(R.id.label_view_second);
        this.f = (LinearLayout) findViewById(R.id.label_view_main1);
        this.g = (LinearLayout) findViewById(R.id.label_view_second1);
        this.h = (ImageView) findViewById(R.id.main_icon);
        this.i = (ImageView) findViewById(R.id.second_icon);
        this.j = (TextView) findViewById(R.id.main_title);
        this.k = (TextView) findViewById(R.id.second_title);
        this.l = findViewById(R.id.deliver_line);
        this.m = findViewById(R.id.deliver_line_layout);
        ArrayList arrayList = new ArrayList();
        if (this.o > 0) {
            arrayList.add(new a(this.n, this.o, this.q, this.s, this.u, this.w, this.y, this.G, this.H, this.E, this.A, this.C, this.I));
            if (this.p > 0) {
                arrayList.add(new a(this.n, this.p, this.r, this.t, this.v, this.x, this.z, this.G, this.H, this.F, this.B, this.D, this.I));
            }
        }
        if (arrayList.size() > 0) {
            a[] aVarArr = new a[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                aVarArr[i2] = (a) arrayList.get(i2);
            }
            setVisibility(0);
            this.c.setVisibility(0);
            setLabelType(aVarArr);
            return;
        }
        setVisibility(8);
        this.c.setVisibility(8);
    }

    public void setLabelType(a[] aVarArr) {
        int i;
        int i2;
        int i3;
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd330803bc94aa87bb133fd6b89a3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd330803bc94aa87bb133fd6b89a3d9");
            return;
        }
        if (aVarArr != null && aVarArr.length > 0) {
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                a aVar = aVarArr[i4];
                if (aVar != null) {
                    if (i4 == 0) {
                        setConfigMain(aVar);
                    } else if (i4 == 1) {
                        setConfigSecond(aVar);
                    }
                }
            }
        }
        if (this.o == 1 || this.o == 2) {
            setVisibility(0);
            this.c.setVisibility(0);
            int i5 = 15;
            int i6 = 11;
            int i7 = 3;
            int i8 = 10;
            int i9 = 4;
            switch (this.n) {
                case 0:
                    i = 2;
                    i6 = 10;
                    i2 = 3;
                    break;
                case 1:
                    i5 = 17;
                    i = 4;
                    i7 = 4;
                    i2 = 4;
                    break;
                case 2:
                    i5 = 19;
                    i8 = 12;
                    i = 4;
                    i7 = 4;
                    i2 = 4;
                    break;
                case 3:
                    i5 = 21;
                    i8 = 14;
                    i = 4;
                    i7 = 4;
                    i2 = 5;
                    break;
                default:
                    i = 4;
                    i6 = 10;
                    i7 = 4;
                    i2 = 3;
                    break;
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            layoutParams.height = h.a(this.b, i5);
            this.c.setLayoutParams(layoutParams);
            float f = i6;
            this.j.setTextSize(2, f);
            this.k.setTextSize(2, f);
            ViewGroup.LayoutParams layoutParams2 = this.h.getLayoutParams();
            float f2 = i8;
            layoutParams2.height = h.a(this.b, f2);
            layoutParams2.width = h.a(this.b, f2);
            this.h.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.i.getLayoutParams();
            layoutParams3.height = h.a(this.b, f2);
            layoutParams3.width = h.a(this.b, f2);
            this.i.setLayoutParams(layoutParams3);
            if (this.I) {
                this.j.getPaint().setFakeBoldText(true);
                this.k.getPaint().setFakeBoldText(true);
            } else {
                this.j.getPaint().setFakeBoldText(false);
                this.k.getPaint().setFakeBoldText(false);
            }
            this.m.setBackgroundColor(b.b(getContext(), this.G));
            if (!TextUtils.isEmpty(this.E)) {
                this.f.setVisibility(0);
                this.j.setVisibility(0);
                this.j.setText(this.E);
                if (this.q > 0) {
                    this.j.setTextColor(b.b(getContext(), this.q));
                }
                if (this.A != null || !TextUtils.isEmpty(this.C)) {
                    this.h.setVisibility(0);
                    if (this.A != null) {
                        this.h.setImageDrawable(this.A);
                    } else if (!TextUtils.isEmpty(this.C)) {
                        m.a(this.C).a(this.h);
                    }
                } else {
                    this.h.setVisibility(8);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                float f3 = i;
                marginLayoutParams.leftMargin = h.a(this.b, f3);
                marginLayoutParams.rightMargin = h.a(this.b, f3);
                this.d.setLayoutParams(marginLayoutParams);
            } else {
                this.f.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.F)) {
                this.g.setVisibility(0);
                this.k.setVisibility(0);
                this.k.setText(this.F);
                if (this.r > 0) {
                    this.k.setTextColor(b.b(getContext(), this.r));
                }
                if (this.B != null || !TextUtils.isEmpty(this.D)) {
                    this.i.setVisibility(0);
                    if (this.B != null) {
                        this.i.setImageDrawable(this.B);
                    } else if (!TextUtils.isEmpty(this.D)) {
                        m.a(this.D).a(this.i);
                    }
                } else {
                    this.i.setVisibility(8);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                float f4 = i;
                marginLayoutParams2.leftMargin = h.a(this.b, f4);
                marginLayoutParams2.rightMargin = h.a(this.b, f4);
                this.e.setLayoutParams(marginLayoutParams2);
            } else {
                this.g.setVisibility(8);
            }
            if (this.p != 1 && this.p != 2) {
                this.g.setVisibility(8);
                this.m.setVisibility(8);
                i3 = 4;
            } else {
                this.g.setVisibility(0);
                this.m.setVisibility(8);
                if (this.o == 2 && this.p == 2) {
                    this.m.setVisibility(0);
                    this.l.setBackgroundColor(b.b(getContext(), this.H));
                    this.m.setBackgroundColor(b.b(getContext(), R.color.white));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                    float f5 = i2;
                    marginLayoutParams3.leftMargin = h.a(this.b, f5);
                    marginLayoutParams3.rightMargin = h.a(this.b, f5);
                    this.d.setLayoutParams(marginLayoutParams3);
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                    marginLayoutParams4.leftMargin = h.a(this.b, f5);
                    marginLayoutParams4.rightMargin = h.a(this.b, f5);
                    this.e.setLayoutParams(marginLayoutParams4);
                } else {
                    this.m.setVisibility(8);
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                    float f6 = i7;
                    marginLayoutParams5.leftMargin = h.a(this.b, f6);
                    marginLayoutParams5.rightMargin = h.a(this.b, f6);
                    this.d.setLayoutParams(marginLayoutParams5);
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                    marginLayoutParams6.leftMargin = h.a(this.b, f6);
                    marginLayoutParams6.rightMargin = h.a(this.b, f6);
                    this.e.setLayoutParams(marginLayoutParams6);
                }
                i3 = 0;
                i9 = 0;
            }
            this.c.setBackground(new e.a().c(b.b(this.b, this.G)).a(b.b(this.b, this.G)).b(h.a(this.b, 0.5f)).a(h.a(this.b, 4.0f)).a());
            if (this.u > 0 && this.w > 0) {
                float f7 = i9;
                this.f.setBackground(new e.a().a(a(this.y), new int[]{b.b(getContext(), this.u), b.b(getContext(), this.w)}).a(h.a(this.b, 4.0f), h.a(this.b, f7), h.a(this.b, f7), h.a(this.b, 4.0f)).a());
            } else if (this.s > 0) {
                float f8 = i9;
                this.f.setBackground(new e.a().c(b.b(getContext(), this.s)).a(h.a(this.b, 4.0f), h.a(this.b, f8), h.a(this.b, f8), h.a(this.b, 4.0f)).a());
            }
            if (this.v > 0 && this.x > 0) {
                float f9 = i3;
                this.g.setBackground(new e.a().a(a(this.z), new int[]{b.b(getContext(), this.v), b.b(getContext(), this.x)}).a(h.a(this.b, f9), h.a(this.b, 4.0f), h.a(this.b, 4.0f), h.a(this.b, f9)).a());
            } else if (this.t > 0) {
                float f10 = i3;
                this.g.setBackground(new e.a().c(b.b(getContext(), this.t)).a(h.a(this.b, f10), h.a(this.b, 4.0f), h.a(this.b, 4.0f), h.a(this.b, f10)).a());
            }
            if (this.g.getVisibility() == 8 && this.f.getVisibility() == 8) {
                setVisibility(8);
                this.c.setVisibility(8);
                return;
            }
            setVisibility(0);
            this.c.setVisibility(0);
            return;
        }
        setVisibility(8);
        this.c.setVisibility(8);
    }

    private GradientDrawable.Orientation a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f6139f0d8234f3e70bbfb1bb24aa27", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable.Orientation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f6139f0d8234f3e70bbfb1bb24aa27");
        }
        if (i != 0) {
            if (i != 45) {
                if (i != 90) {
                    if (i != 135) {
                        if (i != 180) {
                            if (i != 225) {
                                if (i != 270) {
                                    if (i == 315) {
                                        return GradientDrawable.Orientation.TL_BR;
                                    }
                                    return GradientDrawable.Orientation.LEFT_RIGHT;
                                }
                                return GradientDrawable.Orientation.TOP_BOTTOM;
                            }
                            return GradientDrawable.Orientation.TR_BL;
                        }
                        return GradientDrawable.Orientation.RIGHT_LEFT;
                    }
                    return GradientDrawable.Orientation.BR_TL;
                }
                return GradientDrawable.Orientation.BOTTOM_TOP;
            }
            return GradientDrawable.Orientation.BL_TR;
        }
        return GradientDrawable.Orientation.LEFT_RIGHT;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;
        int f;
        int g;
        int h;
        public int i;
        int j;
        boolean k;
        public String l;
        Drawable m;
        String n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8806ee98262d9f953d443ab699b505", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8806ee98262d9f953d443ab699b505");
                return;
            }
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
        }

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, Drawable drawable, String str2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), str, drawable, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2df2696486e26fa04182f3cb17eef2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2df2696486e26fa04182f3cb17eef2");
                return;
            }
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.l = str;
            this.m = drawable;
            this.n = str2;
            this.k = z;
        }
    }

    private void setConfigMain(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8a13a251b4b43a7f713af733a7d380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8a13a251b4b43a7f713af733a7d380");
        } else if (aVar.c > 0) {
            if (this.n != -1) {
                aVar.b = this.n;
            } else if (aVar.b == -1) {
                aVar.b = 0;
            }
            this.n = aVar.b;
            if (aVar.j == -1) {
                aVar.j = R.color.wm_sg_color_368EFC;
            }
            this.H = aVar.j;
            this.I = aVar.k;
            this.u = aVar.f;
            this.w = aVar.g;
            if (aVar.h == -1) {
                aVar.h = 0;
            }
            this.y = aVar.h;
            this.A = aVar.m;
            this.C = aVar.n;
            this.E = aVar.l;
            this.o = aVar.c;
            if (this.o != 1) {
                if (this.o == 2) {
                    if (aVar.d == -1) {
                        aVar.d = R.color.wm_sg_color_368EFC;
                    }
                    this.q = aVar.d;
                    if (aVar.e == -1) {
                        aVar.e = R.color.white;
                    }
                    this.s = aVar.e;
                    if (aVar.i == -1) {
                        aVar.i = R.color.wm_sg_color_378DFC;
                    }
                    this.G = aVar.i;
                    return;
                }
                return;
            }
            if (aVar.d == -1) {
                aVar.d = R.color.white;
            }
            this.q = aVar.d;
            if (aVar.e == -1) {
                aVar.e = R.color.wm_sg_color_368EFC;
            }
            this.s = aVar.e;
            if (aVar.i == -1) {
                aVar.i = R.color.wm_sg_color_368EFC;
            }
            this.G = aVar.i;
        }
    }

    private void setConfigSecond(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53ec5d2560d6c650aac0a127c1a83fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53ec5d2560d6c650aac0a127c1a83fc");
        } else if (aVar.c > 0) {
            this.v = aVar.f;
            this.x = aVar.g;
            if (aVar.h == -1) {
                aVar.h = 0;
            }
            this.z = aVar.h;
            this.p = aVar.c;
            this.B = aVar.m;
            this.D = aVar.n;
            this.F = aVar.l;
            if (this.p != 1) {
                if (this.p == 2) {
                    if (aVar.d == -1) {
                        aVar.d = R.color.wm_sg_color_368EFC;
                    }
                    this.r = aVar.d;
                    if (aVar.e == -1) {
                        aVar.e = R.color.white;
                    }
                    this.t = aVar.e;
                    return;
                }
                return;
            }
            if (aVar.d == -1) {
                aVar.d = R.color.white;
            }
            this.r = aVar.d;
            if (aVar.e == -1) {
                aVar.e = R.color.wm_sg_color_368EFC;
            }
            this.t = aVar.e;
        }
    }
}
