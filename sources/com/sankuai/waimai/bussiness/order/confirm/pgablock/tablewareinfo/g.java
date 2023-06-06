package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    Integer e;
    int f;
    String g;
    a h;
    private ImageView i;
    private ImageView j;
    private AppCompatTextView k;
    private int l;
    private Resources m;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, int i);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_view_list_diners_count_stepper;
    }

    public g(Context context, View view, int i, int i2) {
        super(context, view);
        Object[] objArr = {context, view, 7, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bfb16bfd2f61a28a9ef960214c21826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bfb16bfd2f61a28a9ef960214c21826");
            return;
        }
        this.e = 7;
        this.l = 15;
        this.f = this.e.intValue();
        this.i = (ImageView) view.findViewById(R.id.order_confirm_tableware_stepper_decrease);
        this.j = (ImageView) view.findViewById(R.id.order_confirm_tableware_stepper_increase);
        this.k = (AppCompatTextView) view.findViewById(R.id.order_confirm_tableware_stepper_text);
        this.m = context.getResources();
        this.g = this.m.getText(R.string.wm_order_confirm_tableware_count).toString();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "762a10513fc3a6eaa7f8fdf72d5a9d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "762a10513fc3a6eaa7f8fdf72d5a9d58");
        } else {
            this.j.setOnClickListener(h.a(this));
            this.i.setOnClickListener(i.a(this));
        }
        f();
    }

    public static /* synthetic */ void b(g gVar, View view) {
        Object[] objArr = {gVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84276177bdda1afb23481bee47ec2ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84276177bdda1afb23481bee47ec2ccf");
        } else if (gVar.e.intValue() < gVar.l) {
            gVar.e = Integer.valueOf(gVar.e.intValue() + 1);
            gVar.f();
            if (gVar.h != null) {
                gVar.h.a(gVar.b, gVar.e.intValue());
            }
        }
    }

    public static /* synthetic */ void a(g gVar, View view) {
        Object[] objArr = {gVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35c0e49cb681c2e87e15de3441487f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35c0e49cb681c2e87e15de3441487f02");
        } else if (gVar.e.intValue() > gVar.f) {
            gVar.e = Integer.valueOf(gVar.e.intValue() - 1);
            gVar.f();
            if (gVar.h != null) {
                gVar.h.a(gVar.b, gVar.e.intValue());
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f940ea0d99a64ec623ef5132e6cfb287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f940ea0d99a64ec623ef5132e6cfb287");
            return;
        }
        if (this.e.intValue() <= this.f) {
            this.i.setEnabled(false);
            this.i.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_decrease_unable));
            if (!this.j.isEnabled()) {
                this.j.setEnabled(true);
                this.j.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_increase));
            }
        } else if (this.e.intValue() >= this.l) {
            this.j.setEnabled(false);
            this.j.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_increase_uable));
            if (!this.i.isEnabled()) {
                this.i.setEnabled(true);
                this.i.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_decrease));
            }
        } else {
            if (!this.j.isEnabled()) {
                this.j.setEnabled(true);
                this.j.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_increase));
            }
            if (!this.i.isEnabled()) {
                this.i.setEnabled(true);
                this.i.setImageDrawable(this.m.getDrawable(R.drawable.wm_order_confirm_dinner_count_stepper_decrease));
            }
        }
        this.k.setText(String.format(this.g, this.e));
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1bd1793682ea83c5a879b06cb17205", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1bd1793682ea83c5a879b06cb17205")).intValue() : this.e.intValue();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceff167387e02767b1497cfe146f9189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceff167387e02767b1497cfe146f9189");
        } else if (i < this.f || i > this.l) {
        } else {
            this.e = Integer.valueOf(i);
            f();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602313df483b73a8d2d33c3a534f1a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602313df483b73a8d2d33c3a534f1a04");
        } else if (z) {
            this.b.setBackground(this.m.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_selected));
            this.k.setTextColor(Color.parseColor("#FF8000"));
            AppCompatTextView appCompatTextView = this.k;
            appCompatTextView.setContentDescription(this.k.getText().toString() + "，已选中");
        } else {
            this.b.setBackground(this.m.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg));
            this.k.setTextColor(Color.parseColor("#575859"));
            this.k.setContentDescription(this.k.getText().toString());
        }
    }
}
