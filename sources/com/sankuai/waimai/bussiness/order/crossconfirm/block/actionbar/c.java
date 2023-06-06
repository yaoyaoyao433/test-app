package com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    @NonNull
    final Activity e;
    public a f;
    int g;
    View h;
    private float i;
    private final TextView j;
    private final RooIconFont k;
    private final View l;
    private final TextView m;
    private Drawable n;
    private Drawable o;
    private ImageView p;
    private int q;
    private int r;
    private final View s;
    private Context t;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(long j, int i);

        void a(Activity activity);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_actionbar_ex_new;
    }

    public static /* synthetic */ void a(c cVar, AddressItem addressItem, int i, int i2) {
        Object[] objArr = {addressItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "6fbe357572af6370de064535d89c2935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "6fbe357572af6370de064535d89c2935");
        } else if (addressItem != null) {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("stid", addressItem.abStrategy).a("address_reason", addressItem.addressTipReason).a("address_top", 0).a(cVar.e).a();
        } else {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("address_top", 0).a(cVar.e).a();
        }
    }

    public c(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73001df48f59c9e8df682b3395a01f4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73001df48f59c9e8df682b3395a01f4a");
            return;
        }
        this.g = -1;
        this.t = context;
        this.l = this.b.findViewById(R.id.bg_actionbar);
        this.j = (TextView) this.b.findViewById(R.id.txt_actionbar_title);
        this.k = (RooIconFont) this.b.findViewById(R.id.img_actionbar_back);
        this.m = (TextView) this.b.findViewById(R.id.txt_actionbar_title_address);
        this.p = (ImageView) this.b.findViewById(R.id.im_title_cover);
        this.s = this.b.findViewById(R.id.rl_actionbar_layout);
        this.q = com.sankuai.waimai.platform.b.A().l();
        this.r = (this.q - context.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_txt_actionbar_title_address_max_width)) / 2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
        layoutParams.leftMargin = this.r;
        this.p.setLayoutParams(layoutParams);
        if (this.j == null || this.k == null || this.m == null) {
            throw new Resources.NotFoundException(context.getString(R.string.wm_order_confirm_dev_exception_1));
        }
        if (com.sankuai.waimai.platform.model.c.a().b() == 1) {
            this.j.setTextSize(2, 22.0f);
            this.m.setTextSize(2, 22.0f);
        }
        this.e = (Activity) context;
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9072f1b666e8e6f3d06f5200239450f7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9072f1b666e8e6f3d06f5200239450f7");
                    return;
                }
                c.this.e.onBackPressed();
                if (c.this.e instanceof OrderConfirmActivity) {
                    OrderConfirmActivity orderConfirmActivity = (OrderConfirmActivity) c.this.e;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = OrderConfirmActivity.a;
                    if (PatchProxy.isSupport(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "3e0d094d10edf7a5819abd279e8a0786", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, orderConfirmActivity, changeQuickRedirect3, false, "3e0d094d10edf7a5819abd279e8a0786");
                        return;
                    }
                    orderConfirmActivity.d();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = OrderConfirmActivity.a;
                    if (PatchProxy.isSupport(objArr4, orderConfirmActivity, changeQuickRedirect4, false, "3bffec3ff0e845a14733d5aee3064496", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, orderConfirmActivity, changeQuickRedirect4, false, "3bffec3ff0e845a14733d5aee3064496");
                    } else {
                        JudasManualManager.a("b_waimai_1ugibmuh_mc").a("c_ykhs39e").b(orderConfirmActivity.a(orderConfirmActivity.k, orderConfirmActivity.l)).a(orderConfirmActivity).a();
                    }
                } else if (c.this.e instanceof CrossOrderConfirmActivity) {
                    CrossOrderConfirmActivity crossOrderConfirmActivity = (CrossOrderConfirmActivity) c.this.e;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = CrossOrderConfirmActivity.a;
                    if (PatchProxy.isSupport(objArr5, crossOrderConfirmActivity, changeQuickRedirect5, false, "ef7b148be728354ce56605d707b5ae04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, crossOrderConfirmActivity, changeQuickRedirect5, false, "ef7b148be728354ce56605d707b5ae04");
                    } else {
                        JudasManualManager.a("b_waimai_1ugibmuh_mc").a("c_ykhs39e").b(crossOrderConfirmActivity.b()).a(CrossOrderConfirmActivity.class).a();
                    }
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c9fbca7ef835cf3085232e2a99ece09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c9fbca7ef835cf3085232e2a99ece09");
        } else if (Build.VERSION.SDK_INT >= 23) {
            int e = g.e(com.meituan.android.singleton.b.a);
            int dimensionPixelSize = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height);
            ah.a(this.s, Integer.MIN_VALUE, e, Integer.MIN_VALUE, Integer.MIN_VALUE);
            int i = dimensionPixelSize + e;
            ah.b(this.l, Integer.MIN_VALUE, i);
            ah.b(this.b, Integer.MIN_VALUE, i);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f1bada2a68b736402eb45e24afa378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f1bada2a68b736402eb45e24afa378");
        } else {
            b(this.e.getTitle());
        }
    }

    private void b(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353bced81c6f856ecd6de3fa258aaa74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353bced81c6f856ecd6de3fa258aaa74");
        } else {
            this.j.setText(charSequence);
        }
    }

    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885df839c235a00f70df001088aaded3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885df839c235a00f70df001088aaded3");
        } else {
            this.m.setText(charSequence);
        }
    }

    public final void a(d dVar, View view) {
        Object[] objArr = {dVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac48e9044d2e29b9b22634256158e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac48e9044d2e29b9b22634256158e73");
            return;
        }
        this.h = view;
        a(dVar);
    }

    private void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd7b2502b5c4c5f8a7dc79d5eca4839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd7b2502b5c4c5f8a7dc79d5eca4839");
            return;
        }
        g(dVar);
        d(dVar);
        e(dVar);
        f(dVar);
        a(dVar, this.i);
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1462bdaa10fc3dbfc5113b9ea568269", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1462bdaa10fc3dbfc5113b9ea568269")).booleanValue() : ColorUtils.a(str) != null;
    }

    private String b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c739f5a0bb166825405fa8b26c4de3c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c739f5a0bb166825405fa8b26c4de3c4");
        }
        if (a(dVar.h)) {
            return dVar.h;
        }
        return j(dVar) ? "#252219" : "#FFCC33";
    }

    private String c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987c8d47e6f87b32587c1b9014e164f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987c8d47e6f87b32587c1b9014e164f8");
        }
        if (a(dVar.i)) {
            return dVar.i;
        }
        return j(dVar) ? "#ffffff" : "#222426";
    }

    private void a(View view, String str, GradientDrawable.Orientation orientation) {
        Object[] objArr = {view, str, orientation};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78939258a6fb76346b063e642b222161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78939258a6fb76346b063e642b222161");
        } else if (view == null) {
        } else {
            String[] split = str.split("#");
            int parseColor = Color.parseColor("#FF" + split[1]);
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{parseColor, parseColor, Color.parseColor("#00" + split[1])});
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            view.setBackground(gradientDrawable);
        }
    }

    private void d(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978f9bd0de33d65fa48fc287a3616909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978f9bd0de33d65fa48fc287a3616909");
        } else if (!dVar.j) {
            a(this.h, b(dVar), GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (j(dVar)) {
            com.meituan.roodesign.resfetcher.runtime.c.a(this.c, "waimai_c_order_bg_confirm_bg_black", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable, boolean z) {
                    Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9985f8526a77289e382bb8e737c79670", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9985f8526a77289e382bb8e737c79670");
                    } else if (drawable != null) {
                        c.this.h.setBackground(drawable);
                    }
                }
            });
        } else {
            this.h.setBackgroundResource(R.drawable.wm_order_confirm_head_bg);
        }
    }

    private void e(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6488ac25128afa3ca831cc481c04f2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6488ac25128afa3ca831cc481c04f2bd");
        } else if (!dVar.j) {
            this.l.setBackgroundColor(ColorUtils.a(b(dVar)).intValue());
        } else if (j(dVar)) {
            this.l.setBackgroundResource(R.color.wm_order_confirm_city_delivery_action_bar_black);
        } else {
            this.l.setBackgroundResource(R.color.wm_order_confirm_bg_yellow);
        }
    }

    private void f(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f99101dfd90e69ffd6f4bcfa4399dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f99101dfd90e69ffd6f4bcfa4399dda");
        } else if (!dVar.j) {
            a(this.p, b(dVar), GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (j(dVar)) {
            this.p.setBackgroundResource(R.drawable.wm_order_confirm_ic_address_gradient_black);
        } else {
            this.p.setBackgroundResource(R.drawable.wm_order_confirm_ic_address_gradient_yellow);
        }
    }

    private void g(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f435c3cb25cc4750cf0405e7042ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f435c3cb25cc4750cf0405e7042ca5");
            return;
        }
        final int i = dVar.d;
        h(dVar);
        final AddressItem addressItem = dVar.e;
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da35a848c3f5c26f15ff6f64f1db3e56", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da35a848c3f5c26f15ff6f64f1db3e56");
                    return;
                }
                switch (i) {
                    case 0:
                        if (c.this.f != null) {
                            c.this.f.a(c.this.e);
                        }
                        c.a(c.this, addressItem, 1, 2);
                        return;
                    case 1:
                        if (c.this.f != null) {
                            c.this.f.a(addressItem.id, 0);
                        }
                        c.a(c.this, addressItem, 2, 0);
                        return;
                    case 2:
                        c.this.g = -1;
                        if (c.this.f != null) {
                            c.this.f.a(c.this.g, 0);
                        }
                        c.a(c.this, addressItem, 1, 2);
                        return;
                    case 3:
                        c.this.g = -1;
                        if (c.this.f != null) {
                            c.this.f.a(c.this.g, 0);
                        }
                        c.a(c.this, addressItem, 2, 1);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    private void h(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c44cae9dce6bc35832ace1d38f0d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c44cae9dce6bc35832ace1d38f0d39");
            return;
        }
        int i = dVar.d;
        i(dVar);
        switch (i) {
            case 0:
                this.m.setCompoundDrawablePadding(g.a(this.e, 5.0f));
                this.m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.n, (Drawable) null);
                return;
            case 1:
                this.m.setCompoundDrawablePadding(0);
                this.m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            case 2:
            case 3:
                this.m.setCompoundDrawablePadding(g.a(this.e, 5.0f));
                this.m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.o, (Drawable) null);
                return;
            default:
                return;
        }
    }

    private void i(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dadc2047e508999adc500ea7e3eabfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dadc2047e508999adc500ea7e3eabfd");
            return;
        }
        Drawable drawable = this.e.getResources().getDrawable(R.drawable.wm_order_confirm_action_bar_add_address_ic);
        Drawable drawable2 = this.e.getResources().getDrawable(R.drawable.wm_order_confirm_action_bar_choose_address_ic);
        Integer a2 = ColorUtils.a(c(dVar));
        this.n = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(this.n, a2.intValue());
        this.o = DrawableCompat.wrap(drawable2);
        DrawableCompat.setTint(this.o, a2.intValue());
    }

    public final void a(d dVar, float f) {
        Object[] objArr = {dVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7737189a3386e696a9833eadfa09cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7737189a3386e696a9833eadfa09cc4");
            return;
        }
        Integer a2 = ColorUtils.a(c(dVar));
        this.j.setTextColor(a2.intValue());
        this.m.setTextColor(a2.intValue());
        this.k.setTextColor(a2.intValue());
        double d2 = f;
        int i = (d2 > 0.5d ? 1 : (d2 == 0.5d ? 0 : -1));
        this.j.setAlpha(i < 0 ? 1.0f - (f * 2.0f) : 0.0f);
        int i2 = (d2 > 0.5d ? 1 : (d2 == 0.5d ? 0 : -1));
        this.m.setAlpha(i2 >= 0 ? (f * 2.0f) - 1.0f : 0.0f);
        if (i < 0) {
            this.j.setVisibility(0);
            this.m.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        this.j.setVisibility(8);
        this.m.setVisibility(0);
        this.p.setVisibility(0);
        if (this.m.getCompoundDrawables().length != 0 && this.m.getCompoundDrawables()[2] != null) {
            this.m.getCompoundDrawables()[2].setAlpha((int) (i2 >= 0 ? ((f * 2.0f) - 1.0f) * 255.0f : 0.0f));
            this.p.setVisibility(8);
        }
        if (this.p.getDrawable() != null) {
            this.p.getDrawable().setAlpha(i2 >= 0 ? 255 : 0);
        }
    }

    private boolean j(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3732cecfad7a5363cb9902f93a643993", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3732cecfad7a5363cb9902f93a643993")).booleanValue() : dVar != null && dVar.g == 1;
    }
}
