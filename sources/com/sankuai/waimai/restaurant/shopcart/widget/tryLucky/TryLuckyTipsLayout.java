package com.sankuai.waimai.restaurant.shopcart.widget.tryLucky;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TryLuckyTipsLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private SparseArray<ImageView> h;
    private SparseArray<TextView> i;

    public TryLuckyTipsLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7fb77dafcee0b91828ec09f9d59ff20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7fb77dafcee0b91828ec09f9d59ff20");
            return;
        }
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
        a();
    }

    public TryLuckyTipsLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfca2a88303530a1ca4311827781476", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfca2a88303530a1ca4311827781476");
            return;
        }
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
        a();
    }

    public TryLuckyTipsLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa792269e1e5d721de11bfcb61f74f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa792269e1e5d721de11bfcb61f74f6");
            return;
        }
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
        a();
    }

    @RequiresApi(api = 21)
    public TryLuckyTipsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9643d115c9780e6894e673d40565785", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9643d115c9780e6894e673d40565785");
            return;
        }
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aec157cc7ecc595231cc0fb9c091568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aec157cc7ecc595231cc0fb9c091568");
            return;
        }
        this.e = g.a(getContext(), 12.0f);
        this.f = g.a(getContext(), 14.0f);
        this.g = g.a(getContext(), 3.0f);
        this.c = Color.parseColor("#222426");
        this.d = Color.parseColor("#FF8000");
    }

    public final void a(CharSequence charSequence, TextView.BufferType bufferType) {
        Object[] objArr = {charSequence, bufferType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1e2ce52ff1b779e673d06ddd20ab21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1e2ce52ff1b779e673d06ddd20ab21");
            return;
        }
        int childCount = getChildCount();
        if (childCount > 1 || (childCount > 0 && getChildAt(0) != this.b)) {
            b();
        }
        if (this.b != null) {
            this.b.setTextColor(this.c);
            this.b.setText(charSequence, bufferType);
            return;
        }
        this.b = new TextView(getContext());
        this.b.setTextSize(11.0f);
        this.b.setTextColor(this.c);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setText(charSequence, bufferType);
        addView(this.b);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feecaeafa59dbc4d0f201d005f8d896e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feecaeafa59dbc4d0f201d005f8d896e");
            return;
        }
        this.i.clear();
        this.h.clear();
        removeAllViews();
        this.b = null;
    }
}
