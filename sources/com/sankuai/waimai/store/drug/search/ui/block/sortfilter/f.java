package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends LinearLayout {
    public static ChangeQuickRedirect a = null;
    public static int b = 1;
    public static int c = 2;
    boolean d;
    private b e;
    private TextView f;
    private LinearLayout g;
    private ImageView h;
    private ImageView i;
    private boolean j;

    public f(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81ce9a38f79c95a3116d9717acff99e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81ce9a38f79c95a3116d9717acff99e");
        }
    }

    private f(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ea9cb68eeb4d7e1b456ab5cb317a7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ea9cb68eeb4d7e1b456ab5cb317a7a");
            return;
        }
        this.d = false;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26e4759deaa47cc8a64c858451232000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26e4759deaa47cc8a64c858451232000");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_drug_search_sort_filter_text_layout, this);
        this.f = (TextView) findViewById(R.id.tv_search_sort_filter_text);
        this.g = (LinearLayout) findViewById(R.id.sort_filter_right_icon_container);
        this.i = (ImageView) findViewById(R.id.sort_filter_right_down_icon);
        this.h = (ImageView) findViewById(R.id.sort_filter_right_up_icon);
        setOpenStatus(false);
        setTextStyle(false);
        setHighlight(false);
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eecbdf1a028c4d9f3aa16b6c56fcc3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eecbdf1a028c4d9f3aa16b6c56fcc3e9");
            return;
        }
        switch (bVar) {
            case NO_ARROW:
                u.c(this.g);
                return;
            case TWO_GREY:
                a(true, true, true);
                Drawable d = com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_grey);
                Drawable d2 = com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_grey);
                this.i.setImageDrawable(d);
                this.h.setImageDrawable(d2);
                return;
            case TWO_DOWN_GREY:
                a(true, true, true);
                Drawable d3 = com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_orange);
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_grey));
                this.h.setImageDrawable(d3);
                return;
            case TWO_UP_GREY:
                a(true, true, true);
                Drawable d4 = com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_grey);
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_orange));
                this.h.setImageDrawable(d4);
                return;
            case ONE_GREY_UP:
                this.e = b.ONE_GREY_UP;
                a(true, true, false);
                this.h.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_grey));
                return;
            case ONE_GERY_DOWN:
                this.e = b.ONE_GERY_DOWN;
                a(true, false, true);
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_grey));
                return;
            case ONE_ORANGE_UP:
                this.e = b.ONE_ORANGE_UP;
                a(true, true, false);
                this.h.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_orange));
                return;
            case ONE_ORANGE_DOWN:
                this.e = b.ONE_ORANGE_DOWN;
                a(true, false, true);
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_orange));
                return;
            default:
                return;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f23abad17c45cdd138e1b322d0172bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f23abad17c45cdd138e1b322d0172bc");
        } else if (i == 1) {
            if (this.e == b.ONE_ORANGE_UP) {
                this.e = b.ONE_ORANGE_DOWN;
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_orange));
            } else if (this.e == b.ONE_GREY_UP) {
                this.e = b.ONE_GERY_DOWN;
                this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_down_grey));
            }
        } else if (this.e == b.ONE_ORANGE_DOWN) {
            this.e = b.ONE_ORANGE_UP;
            this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_orange));
        } else if (this.e == b.ONE_GERY_DOWN) {
            this.e = b.ONE_GREY_UP;
            this.i.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_drug_sort_filter_arrow_up_grey));
        }
    }

    private void a(boolean z, boolean z2, boolean z3) {
        Object[] objArr = {(byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60abfce6d298c6ec6e0cbbbf3688ba6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60abfce6d298c6ec6e0cbbbf3688ba6a");
            return;
        }
        u.a(this.g);
        if (!z3 && z2) {
            u.a(this.h);
            u.c(this.i);
        } else if (!z3 || z2) {
            u.a(this.h);
            u.a(this.i);
        } else {
            u.c(this.h);
            u.a(this.i);
        }
    }

    public final void setOpenStatus(boolean z) {
        this.d = z;
    }

    public final void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5055ac3125d404d862813d3de1934bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5055ac3125d404d862813d3de1934bb8");
        } else {
            this.f.setText(charSequence);
        }
    }

    public final void setTextStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c10157552ba6d8142c5220904d3f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c10157552ba6d8142c5220904d3f81");
        } else {
            this.f.setTypeface(z ? Typeface.defaultFromStyle(1) : Typeface.defaultFromStyle(0));
        }
    }

    public final void setHighlight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba141f074d59dc1d394a038497c69465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba141f074d59dc1d394a038497c69465");
        } else {
            this.f.setTextColor(com.sankuai.shangou.stone.util.d.a(z ? "#FF8000" : "#575859", 0));
        }
    }

    public final String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40563853dfd6b4d93267e82b98719cc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40563853dfd6b4d93267e82b98719cc") : this.f.getText().toString();
    }

    public final void setClickChangeText(boolean z) {
        this.j = z;
    }

    public final boolean getClickChangeText() {
        return this.j;
    }
}
