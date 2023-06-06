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
public final class j extends com.meituan.android.cube.pga.view.a {
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

    public j(Context context, View view, int i, int i2) {
        super(context, view);
        Object[] objArr = {context, view, 1, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a917218ab5972b421df1eebd4d5e5347", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a917218ab5972b421df1eebd4d5e5347");
            return;
        }
        this.e = 1;
        this.l = 15;
        this.f = this.e.intValue();
        this.i = (ImageView) view.findViewById(R.id.order_confirm_tableware_stepper_decrease);
        this.j = (ImageView) view.findViewById(R.id.order_confirm_tableware_stepper_increase);
        this.k = (AppCompatTextView) view.findViewById(R.id.order_confirm_tableware_stepper_text);
        this.m = context.getResources();
        this.g = this.m.getText(R.string.wm_order_confirm_tableware_count).toString();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f42a265dd2cddc940fcd77e05b61951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f42a265dd2cddc940fcd77e05b61951");
        } else {
            this.j.setOnClickListener(k.a(this));
            this.i.setOnClickListener(l.a(this));
        }
        f();
    }

    public static /* synthetic */ void b(j jVar, View view) {
        Object[] objArr = {jVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6ae285988c8a1dfbc8a5e7d432c033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6ae285988c8a1dfbc8a5e7d432c033");
        } else if (jVar.e.intValue() < jVar.l) {
            jVar.e = Integer.valueOf(jVar.e.intValue() + 1);
            jVar.f();
            if (jVar.h != null) {
                jVar.h.a(jVar.b, jVar.e.intValue());
            }
        }
    }

    public static /* synthetic */ void a(j jVar, View view) {
        Object[] objArr = {jVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e067ba969bbcd2c73fcafb44932ad5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e067ba969bbcd2c73fcafb44932ad5b");
        } else if (jVar.e.intValue() > jVar.f) {
            jVar.e = Integer.valueOf(jVar.e.intValue() - 1);
            jVar.f();
            if (jVar.h != null) {
                jVar.h.a(jVar.b, jVar.e.intValue());
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19d6fa2790ad94165afbf27fc8bbc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19d6fa2790ad94165afbf27fc8bbc39");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75849fd0f00ccb9cc6d3c0e23c1b634f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75849fd0f00ccb9cc6d3c0e23c1b634f")).intValue() : this.e.intValue();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404c3dedef823b7f44887efd683e587e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404c3dedef823b7f44887efd683e587e");
        } else if (i < this.f || i > this.l) {
        } else {
            this.e = Integer.valueOf(i);
            f();
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfb92125be4877a59e5740fa9a94435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfb92125be4877a59e5740fa9a94435");
        } else if (this.b != 0) {
            this.b.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0669b736a5e99a1ed165f61099054e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0669b736a5e99a1ed165f61099054e8");
        } else if (z) {
            this.b.setBackground(this.m.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_selected));
            this.k.setTextColor(Color.parseColor("#FF8000"));
            AppCompatTextView appCompatTextView = this.k;
            appCompatTextView.setContentDescription(this.k.getText().toString() + "，已选中");
        } else {
            this.b.setBackground(this.m.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_new));
            this.k.setTextColor(Color.parseColor("#575859"));
            this.k.setContentDescription(this.k.getText().toString());
        }
    }
}
