package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.standard.FlashTabLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FlashTab extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private a b;
    private boolean[] c;
    private ViewGroup d;
    private List<b> e;
    private FlashTabLayout.b f;
    private FlashTabLayout.a g;
    private FlashTabLayout.c h;
    private int i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
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
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public int a;
        public CharSequence b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
        public boolean h;
    }

    public final void setHasTabRightIcon(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8813d7909e001d5cba10c03cfddbc119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8813d7909e001d5cba10c03cfddbc119");
            return;
        }
        this.k = z;
        if (z) {
            this.l = h.a(com.sankuai.waimai.store.util.b.a(), 15.0f);
        } else {
            this.l = 0;
        }
    }

    public final int getSelectPosition() {
        return this.i;
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8093b52c0685f8a755f21e988d117417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8093b52c0685f8a755f21e988d117417");
        } else {
            u.a((View) ((ImageView) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b.f, i)), z ? 0 : 4);
        }
    }

    public FlashTab(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b38060b204c02c392d382f7aa669f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b38060b204c02c392d382f7aa669f5");
        }
    }

    public FlashTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0b93162fe819c2d81269b26ab75f9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0b93162fe819c2d81269b26ab75f9f");
        }
    }

    public FlashTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e79d73a6cb05927d773ff40c0c8a66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e79d73a6cb05927d773ff40c0c8a66");
            return;
        }
        this.j = false;
        this.l = 0;
        this.m = 0;
        this.x = -1;
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a501da357571106997a26f5b8e3708ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a501da357571106997a26f5b8e3708ab");
            return;
        }
        inflate(context, R.layout.wm_sc_ui_tab_wrapper, this);
        this.d = (ViewGroup) findViewById(R.id.pagerindicator2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tabType, R.attr.textSelectSize, R.attr.textSelectColor, R.attr.textNormalColor, R.attr.indicateColor, R.attr.indicateMode, R.attr.labelBackgroundSelectColor, R.attr.labelBackgroundNormalColor, R.attr.labelTextSelectColor, R.attr.labelTextNormalColor, R.attr.labelTextSizeMode, R.attr.labelTextMarginTop, R.attr.flash_label_indicatorHeight, R.attr.labelTextVerticalItemMargin, R.attr.labelTextShowShadow}, i, 0);
        this.m = obtainStyledAttributes.getInt(0, 0);
        this.q = obtainStyledAttributes.getInt(1, 1);
        this.o = obtainStyledAttributes.getColor(2, ColorUtils.a("#222426", -16777216));
        this.p = obtainStyledAttributes.getColor(3, d.a(this.o, 0.7f));
        this.r = obtainStyledAttributes.getColor(4, ColorUtils.a("#FFCC33", ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFCC33)));
        this.n = obtainStyledAttributes.getInt(5, 2);
        this.s = obtainStyledAttributes.getColor(6, ColorUtils.a("#FFF8E1", ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFF8E1)));
        this.t = obtainStyledAttributes.getColor(7, ColorUtils.a("#F5F5F6", ContextCompat.getColor(getContext(), R.color.wm_sg_color_F5F5F6)));
        this.v = obtainStyledAttributes.getColor(8, ColorUtils.a("#FF8000", ContextCompat.getColor(getContext(), R.color.wm_sg_color_FF8000)));
        this.u = obtainStyledAttributes.getColor(9, ColorUtils.a("#858687", ContextCompat.getColor(getContext(), R.color.wm_sg_color_858687)));
        this.w = obtainStyledAttributes.getInt(10, 1);
        this.y = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.x = h.b(getContext(), obtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.z = obtainStyledAttributes.getBoolean(14, false);
        obtainStyledAttributes.recycle();
    }

    public final FlashTabLayout getTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c43bb9a5387e8d4a624d75dc668056c", RobustBitConfig.DEFAULT_VALUE)) {
            return (FlashTabLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c43bb9a5387e8d4a624d75dc668056c");
        }
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    public final void setTabs(@NonNull CharSequence[] charSequenceArr) {
        Object[] objArr = {charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a82ad89689aa358dd4e56c628874f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a82ad89689aa358dd4e56c628874f17");
            return;
        }
        this.e = new ArrayList();
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (!TextUtils.isEmpty(charSequence)) {
                b bVar = new b();
                bVar.a = i;
                bVar.b = charSequence;
                this.e.add(bVar);
                i++;
            }
        }
        a();
    }

    public final void setTabs(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d7908f9a9b67d662ffe0daf0d76c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d7908f9a9b67d662ffe0daf0d76c42");
            return;
        }
        this.e = new ArrayList();
        this.e.addAll(list);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f7d5c109ef3d8ac1ed3c30f1d2bcab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f7d5c109ef3d8ac1ed3c30f1d2bcab");
        } else if (this.e == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.c = new boolean[this.e.size()];
            this.d.removeAllViews();
            this.b = a(this.d, this.f);
            this.b.o = this.x;
            this.b.a(this.e);
        }
    }

    public final void setScrollModeWithItemMargin(int i) {
        this.x = i;
    }

    public final void setTabCreateListener(FlashTabLayout.a aVar) {
        this.g = aVar;
    }

    public final void setIndicatorColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dac5f81b99def89f6530e6c5f6152a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dac5f81b99def89f6530e6c5f6152a4");
            return;
        }
        this.r = i;
        this.b.a(this.r);
    }

    public final void setTabWidthMeasureCompleteListener(FlashTabLayout.c cVar) {
        this.h = cVar;
    }

    private a a(@NonNull ViewGroup viewGroup, FlashTabLayout.b bVar) {
        Object[] objArr = {viewGroup, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c6736edbff4009c19d5a77d1562ad3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c6736edbff4009c19d5a77d1562ad3");
        }
        this.b = new a(viewGroup.getContext());
        viewGroup.addView(this.b, new ViewGroup.LayoutParams(-2, -1));
        this.b.k(this.n);
        switch (this.n) {
            case 1:
                this.b.a(getResources().getDrawable(R.drawable.wm_sg_ui_flash_tab_indicate_img));
                this.b.b(h.a(viewGroup.getContext(), 6.0f));
                this.b.c(h.a(viewGroup.getContext(), 11.0f));
                break;
            case 2:
                this.b.a(this.r);
                this.b.b(h.a(viewGroup.getContext(), 2.0f));
                this.b.c(h.a(viewGroup.getContext(), 20.0f));
                break;
        }
        if (this.b.a() != null) {
            this.b.a().a(bVar);
            switch (this.m) {
                case 0:
                    this.b.a().setTabMode(1);
                    this.b.a().setTabGravity(0);
                    this.q = 1;
                    break;
                case 1:
                case 2:
                    this.b.a().setTabMode(0);
                    this.b.a().setTabGravity(1);
                    break;
            }
        }
        this.b.a(this.o, this.p);
        this.b.h(this.q);
        this.b.i(this.w);
        this.b.d(this.v);
        this.b.e(this.u);
        this.b.f(this.s);
        this.b.g(this.t);
        this.b.t = this.y;
        return this.b;
    }

    public final void setSelectIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368ad617bc480a666215779ee1291df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368ad617bc480a666215779ee1291df7");
            return;
        }
        this.i = i;
        this.b.j(i);
    }

    public final void setRelationMove(boolean z) {
        this.j = z;
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee1bd83cb74e05d81e8c994f6e56760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee1bd83cb74e05d81e8c994f6e56760");
        } else {
            this.b.a(i, f);
        }
    }

    public final void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c5050632f253458dd3523e006a0907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c5050632f253458dd3523e006a0907");
        } else {
            a(i, z, null);
        }
    }

    public final void a(int i, boolean z, View view) {
        FlashTabLayout.e a2;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0e83879ce58e359330c6e9a55ea7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0e83879ce58e359330c6e9a55ea7fd");
        } else if (this.c == null || i < 0 || i >= this.c.length) {
        } else {
            this.c[i] = z;
            if (this.b == null || this.b.a() == null || (a2 = this.b.a().a(i)) == null || a2.i == null) {
                return;
            }
            View findViewById = a2.i.findViewById(R.id.iv_bubble);
            ViewGroup viewGroup = (ViewGroup) a2.i.findViewById(R.id.fl_user_define_bubble_container);
            u.c(findViewById, viewGroup);
            if (view != null && viewGroup != null) {
                u.a(viewGroup);
                viewGroup.removeAllViews();
                viewGroup.addView(view);
                if (this.k) {
                    return;
                }
                u.b((ImageView) a2.i.findViewById(R.id.iv_back_to_top));
            } else if (findViewById != null) {
                if (z) {
                    findViewById.setBackground(new e.a().a(500.0f).c(ColorUtils.a("#FF7555", ContextCompat.getColor(getContext(), R.color.wm_sg_color_FF7555))).a());
                    findViewById.setVisibility(0);
                    return;
                }
                findViewById.setVisibility(4);
            }
        }
    }

    public final void setOnTabSelectedListener(FlashTabLayout.b bVar) {
        this.f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends FrameLayout implements FlashTabLayout.b {
        public static ChangeQuickRedirect a;
        protected FlashTabLayout b;
        protected FlashIndicateView c;
        protected View d;
        protected Map<FlashTabLayout.e, TextView> e;
        protected final List<ImageView> f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected int k;
        protected int l;
        protected int m;
        protected int n;
        int o;
        private List<b> q;
        private Map<FlashTabLayout.e, View> r;
        private Map<FlashTabLayout.e, ImageView> s;
        private int t;
        private int u;
        private int v;
        private Handler w;
        private Runnable x;

        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
        public final void c(FlashTabLayout.e eVar) {
        }

        public static /* synthetic */ int a(a aVar) {
            int i = aVar.u;
            aVar.u = i + 1;
            return i;
        }

        public static /* synthetic */ int b(a aVar, int i) {
            aVar.u = 0;
            return 0;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {FlashTab.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610b78bfa0c5770a303db3727fe5ab41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610b78bfa0c5770a303db3727fe5ab41");
                return;
            }
            this.d = null;
            this.q = new ArrayList();
            this.r = new HashMap();
            this.e = new HashMap();
            this.s = new HashMap();
            this.f = new ArrayList();
            this.o = -1;
            this.u = 0;
            this.v = 0;
            this.w = new Handler();
            this.x = new Runnable() { // from class: com.sankuai.waimai.store.view.standard.FlashTab.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72d8ed43b39292bc26ba381558f9485e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72d8ed43b39292bc26ba381558f9485e");
                        return;
                    }
                    a.a(a.this);
                    if (a.this.c != null) {
                        if (a.this.u < 10) {
                            if (a.this.c.getCurrentPosition() <= a.this.v) {
                                a.this.c.a(a.this.u / 10.0f, a.this.v - 1);
                            } else {
                                a.this.c.a(1.0f - (a.this.u / 10.0f), a.this.v);
                            }
                            a.this.w.postDelayed(a.this.x, 10L);
                            return;
                        }
                        a.this.c.a(a.this.u / 10.0f, a.this.v);
                        a.this.c.setCurrentPosition(a.this.v);
                        a.this.w.removeCallbacks(a.this.x);
                        a.b(a.this, 0);
                    }
                }
            };
            Object[] objArr2 = {null};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71b8f6ba3d000440bb0ea262cc79beb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71b8f6ba3d000440bb0ea262cc79beb9");
                return;
            }
            this.d = LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_ui_indicator, (ViewGroup) this, true);
            this.m = ColorUtils.a("#70222426", ContextCompat.getColor(getContext(), R.color.wm_sg_color_70222426));
            this.n = ColorUtils.a("#222426", ContextCompat.getColor(getContext(), R.color.wm_sg_color_222426));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b46609c428a2d8cab6c92b57eacf9f22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b46609c428a2d8cab6c92b57eacf9f22");
                return;
            }
            this.b = (FlashTabLayout) findViewById(R.id.wm_sc_tablayout);
            this.b.a((FlashTabLayout.b) this);
            this.c = (FlashIndicateView) findViewById(R.id.wm_sc_indicator);
            if (FlashTab.this.m == 2) {
                u.a((View) this.c, 8);
                this.c = null;
            }
            if (this.c != null) {
                this.c.a(this.b);
            }
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d642ff6eafd50f3e6ef2a3de7f188d6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d642ff6eafd50f3e6ef2a3de7f188d6f");
            } else if (this.c != null) {
                this.c.setColor(i);
            }
        }

        public final void a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7755b1c7829f757362d56517a92db2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7755b1c7829f757362d56517a92db2");
            } else if (this.c != null) {
                this.c.setDrawable(drawable);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x03d1 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.util.List<com.sankuai.waimai.store.view.standard.FlashTab.b> r29) {
            /*
                Method dump skipped, instructions count: 1008
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.view.standard.FlashTab.a.a(java.util.List):void");
        }

        public final void b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1d4a905a75d1ba956904cc36428b2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1d4a905a75d1ba956904cc36428b2a");
            } else if (this.c != null) {
                this.c.setHeight(i);
            }
        }

        public final void c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c619ebbb2748c2165751bd95705e754", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c619ebbb2748c2165751bd95705e754");
            } else if (this.c != null) {
                this.c.setWidth(i);
            }
        }

        public final void a(int i, int i2) {
            this.n = i;
            this.m = i2;
        }

        public final void d(int i) {
            this.h = i;
        }

        public final void e(int i) {
            this.i = i;
        }

        public final void f(int i) {
            this.k = i;
        }

        public final void g(int i) {
            this.j = i;
        }

        public final void h(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2399609365947adf79bd2c241467cf28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2399609365947adf79bd2c241467cf28");
                return;
            }
            switch (i) {
                case 1:
                    this.l = 14;
                    return;
                case 2:
                    this.l = 16;
                    return;
                case 3:
                    this.l = 17;
                    return;
                default:
                    return;
            }
        }

        public final void i(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3665ecb782006f4b337424c580461ed8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3665ecb782006f4b337424c580461ed8");
                return;
            }
            switch (i) {
                case 1:
                    this.g = 12;
                    return;
                case 2:
                    this.g = 14;
                    return;
                default:
                    return;
            }
        }

        public final FlashTabLayout a() {
            return this.b;
        }

        public final void a(int i, float f) {
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad46a7d6bf2866db7de271d178c6496f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad46a7d6bf2866db7de271d178c6496f");
            } else if (this.c != null) {
                this.c.a(f, i);
            }
        }

        private void a(@Nullable View view, boolean z) {
            Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe9159aa5843b69e112bf469f6151be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe9159aa5843b69e112bf469f6151be");
            } else if (view == null) {
            } else {
                View findViewById = view.findViewById(R.id.view_shadow);
                if (z) {
                    u.a(findViewById);
                } else {
                    u.c(findViewById);
                }
            }
        }

        public final void j(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407b7c7b1316fee0a7433d22945ae53f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407b7c7b1316fee0a7433d22945ae53f");
                return;
            }
            FlashTabLayout.e a2 = this.b.a(i);
            if (a2 != null) {
                a2.a();
            }
            this.v = i;
            this.u = 0;
            if (FlashTab.this.j) {
                return;
            }
            this.w.postDelayed(this.x, 10L);
        }

        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
        public final void a(FlashTabLayout.e eVar) {
            int i = 0;
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c94faf359b8262a75bc126ce1a6dbd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c94faf359b8262a75bc126ce1a6dbd5");
                return;
            }
            View view = this.r.get(eVar);
            TextView textView = this.e.get(eVar);
            ImageView imageView = this.s.get(eVar);
            int i2 = 8;
            if (eVar.g != 1 || TextUtils.isEmpty(eVar.d) || imageView == null) {
                a(eVar.i, FlashTab.this.z);
                if (textView != null) {
                    textView.getPaint().setFakeBoldText(true);
                    if (FlashTab.this.m == 2) {
                        textView.setTextColor(this.h);
                        if (view != null) {
                            view.setBackground(new e.a().a(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6)).c(this.k).a());
                        }
                    } else {
                        textView.setTextColor(this.n);
                    }
                }
            } else {
                a(eVar.i, false);
                m.c(eVar.d, eVar.f).a(imageView);
                i2 = 0;
                i = 8;
            }
            if (imageView != null) {
                imageView.setVisibility(i2);
            }
            if (textView != null) {
                textView.setVisibility(i);
            }
            if (Math.abs(FlashTab.this.i - eVar.h) > 1) {
                FlashTab.this.i = eVar.h;
                if (this.c != null) {
                    this.c.setCurrentPosition(FlashTab.this.i);
                }
            }
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.q, eVar.h);
            if (bVar != null) {
                bVar.h = true;
            }
        }

        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
        public final void b(FlashTabLayout.e eVar) {
            int i;
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d896b1c6f4ddee534fc95cea7b8c878", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d896b1c6f4ddee534fc95cea7b8c878");
                return;
            }
            View view = this.r.get(eVar);
            TextView textView = this.e.get(eVar);
            ImageView imageView = this.s.get(eVar);
            a(eVar.i, false);
            int i2 = 8;
            if (eVar.g == 1 && !TextUtils.isEmpty(eVar.e) && imageView != null) {
                m.c(eVar.e, eVar.f).a(imageView);
                i = 8;
                i2 = 0;
            } else if (textView != null) {
                textView.getPaint().setFakeBoldText(false);
                if (FlashTab.this.m == 2) {
                    textView.setTextColor(this.i);
                    if (view != null) {
                        view.setBackground(new e.a().a(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6)).c(this.j).a());
                    }
                } else {
                    textView.setTextColor(this.m);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (imageView != null) {
                imageView.setVisibility(i2);
            }
            if (textView != null) {
                textView.setVisibility(i);
            }
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.q, eVar.h);
            if (bVar != null) {
                bVar.h = false;
            }
        }

        public final void k(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f9af9b67de1acf644fa1daa48e34e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f9af9b67de1acf644fa1daa48e34e0");
                return;
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.wm_sc_indicator_container);
            if (FlashTab.this.m == 2) {
                linearLayout.setVisibility(8);
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            switch (i) {
                case 1:
                    layoutParams.height = h.a(getContext(), 12.0f);
                    break;
                case 2:
                    layoutParams.height = h.a(getContext(), 2.0f);
                    break;
            }
            layoutParams.gravity = 80;
            linearLayout.setLayoutParams(layoutParams);
        }

        private void a(View view, int i) {
            int i2;
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7ac02a91aa7c269a7dbf35cc156bbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7ac02a91aa7c269a7dbf35cc156bbe");
                return;
            }
            int a2 = h.a(getContext(), i);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            if (FlashTab.this.k) {
                if (FlashTab.this.b != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) FlashTab.this.b.f)) {
                    Iterator<ImageView> it = this.f.iterator();
                    while (it.hasNext()) {
                        u.b(it.next());
                    }
                }
                i2 = Math.max(0, a2 - h.a(getContext(), FlashTab.this.l));
            } else {
                i2 = a2;
            }
            if (FlashTab.this.m == 2) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = a2;
                    marginLayoutParams.rightMargin = i2;
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            view.setPadding(a2, paddingTop, i2, paddingBottom);
        }
    }
}
