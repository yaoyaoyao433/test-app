package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public TextView b;
    public int c;
    public com.sankuai.waimai.store.param.a d;
    private View e;
    private TextView f;
    private ImageView g;
    private View h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private Drawable l;
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a m;
    private boolean n;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b35b0f328c5847fd355c5b087ebdfcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b35b0f328c5847fd355c5b087ebdfcb");
            return;
        }
        this.n = false;
        this.i = a(getContext().getResources().getColor(R.color.wm_sg_color_D3D3D4), a.EnumC1338a.UP);
        this.j = a(getContext().getResources().getColor(R.color.wm_sg_color_D3D3D4), a.EnumC1338a.DOWN);
        this.k = this.i;
        this.l = this.j;
        this.c = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_77);
    }

    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a990a64acef7bf270701b626b66cce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a990a64acef7bf270701b626b66cce1");
            return;
        }
        this.m = aVar;
        b();
    }

    public final void a(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4df2829bc42007be3b0f971212199c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4df2829bc42007be3b0f971212199c");
            return;
        }
        this.n = z;
        if (!z && this.f.getVisibility() != 0) {
            z2 = false;
        }
        c(z2);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bf8043b8d54b505b1e9760663cbe74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bf8043b8d54b505b1e9760663cbe74");
            return;
        }
        this.n = z;
        if (z) {
            this.g.setImageDrawable(this.k);
        } else {
            this.g.setImageDrawable(this.j);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d861c379a5a33e0d80261f02328568e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d861c379a5a33e0d80261f02328568e6");
        } else if (i > 0) {
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.f.setText(String.valueOf(i));
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f166f21003b7ee6843e3a2d2abe83c32", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f166f21003b7ee6843e3a2d2abe83c32")).booleanValue() : this.f.getVisibility() == 0;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1de8f23e9fb5769a59a31aae4558147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1de8f23e9fb5769a59a31aae4558147");
        } else {
            this.b.setText(str);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07efa9289c4bfbbb2ee7fa1b698aa23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07efa9289c4bfbbb2ee7fa1b698aa23");
            return;
        }
        if (this.m != null) {
            this.e.setBackground(this.m.a());
        } else {
            this.e.setBackground(null);
        }
        this.b.setTextColor(ContextCompat.getColor(getContext(), z ? R.color.wm_sg_color_292724 : R.color.wm_sg_color_575859));
        if (z) {
            this.b.getPaint().setFakeBoldText(true);
        } else {
            this.b.getPaint().setFakeBoldText(false);
        }
        if (z) {
            this.g.setImageDrawable(this.n ? this.k : this.l);
        } else {
            this.g.setImageDrawable(this.n ? this.i : this.j);
        }
        if (this.e.getBackground() != null) {
            this.e.getLayoutParams().width = this.c;
        } else {
            this.e.getLayoutParams().width = -2;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa3d0c0dace4f1b3feca9f45a37d2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa3d0c0dace4f1b3feca9f45a37d2c6");
        } else if (this.e == null) {
        } else {
            c(this.f.getVisibility() == 0);
            if (this.m != null && !this.m.d) {
                this.f.setBackground(null);
                this.f.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_33312d));
                this.f.getPaint().setFakeBoldText(true);
                return;
            }
            this.f.setBackgroundResource(R.drawable.wm_sg_widget_filter_bar_tab_background_filter_num);
            this.f.setTextColor(getContext().getResources().getColor(R.color.wm_sg_widget_filter_bar_text_white));
            this.f.getPaint().setFakeBoldText(false);
        }
    }

    private Drawable a(@ColorInt int i, a.EnumC1338a enumC1338a) {
        Object[] objArr = {Integer.valueOf(i), enumC1338a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c655c673b82f0f163d162563e5cdb40c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c655c673b82f0f163d162563e5cdb40c");
        }
        if (a.EnumC1338a.UP.equals(enumC1338a)) {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(getContext().getResources(), (int) R.drawable.wm_sc_poi_channel_common_arrow_down);
            Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.rotate(180.0f, a2.getWidth() / 2, a2.getHeight() / 2);
            canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
            return new BitmapDrawable(getContext().getResources(), createBitmap);
        }
        return getContext().getResources().getDrawable(R.drawable.wm_sc_poi_channel_common_arrow_down);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0f000dc188a3a203d13b6dbf4e0d29", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0f000dc188a3a203d13b6dbf4e0d29") : layoutInflater.inflate(R.layout.wm_sc_arrow_text_view_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e0ea096f82cbbdaf2a13798e1f74cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e0ea096f82cbbdaf2a13798e1f74cf");
            return;
        }
        super.onViewCreated();
        this.e = getView();
        this.b = (TextView) findView(R.id.tv_inner_filter_text);
        this.g = (ImageView) findView(R.id.iv_inner_filter_text_arrow);
        this.f = (TextView) findView(R.id.tv_inner_filter_count);
        this.h = findView(R.id.v_inner_filter_bubble);
        b();
    }
}
