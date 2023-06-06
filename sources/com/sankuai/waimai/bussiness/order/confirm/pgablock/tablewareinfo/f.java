package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.label.RooLabel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.j;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.meituan.android.cube.pga.view.a<FrameLayout> implements View.OnClickListener, j.a {
    public static ChangeQuickRedirect d;
    int e;
    int f;
    int g;
    j h;
    a i;
    ValueAnimator j;
    ObjectAnimator k;
    int l;
    AnimatorSet m;
    private ViewGroup n;
    private int o;
    private ViewGroup.LayoutParams p;
    private int q;
    private int r;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_view_list_diners_count_selector;
    }

    public f(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c95a38fc9684328ebe13b47c7f5c4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c95a38fc9684328ebe13b47c7f5c4f");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 15;
        this.l = Integer.MIN_VALUE;
        this.r = 0;
        this.n = (ViewGroup) view.findViewById(R.id.order_confirm_tableware_new_layout_container1);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_tableware_selector_container_1_height);
        this.p = view.getLayoutParams();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "639f480fb8afaf3296e92fea6ab5d5db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "639f480fb8afaf3296e92fea6ab5d5db");
            return;
        }
        RooLabel rooLabel = (RooLabel) ((FrameLayout) this.b).findViewById(R.id.order_confirm_tableware_new_label_auto);
        rooLabel.setOnClickListener(this);
        rooLabel.setTag(0);
        ConstraintLayout constraintLayout = (ConstraintLayout) ((FrameLayout) this.b).findViewById(R.id.order_confirm_tableware_stepper_container);
        this.h = new j(this.c, constraintLayout, 1, this.g);
        this.h.a(this);
        this.h.h = this;
        constraintLayout.setTag(1);
    }

    private void c(View view, boolean z) {
        String str;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8406cfa15e9afef142a811c8f1bbfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8406cfa15e9afef142a811c8f1bbfd");
        } else if (z) {
        } else {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ee7725ecc34eedc1c664f1e4f2b9f92", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ee7725ecc34eedc1c664f1e4f2b9f92");
            } else {
                str = "";
                if (view instanceof RooLabel) {
                    str = ((RooLabel) view).getText().toString();
                } else if (this.h != null) {
                    j jVar = this.h;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = j.d;
                    str = PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "29766ebe30cac65d5d75135e2ac8e741", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "29766ebe30cac65d5d75135e2ac8e741") : String.format(jVar.g, jVar.e);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JudasManualManager.a("b_waimai_xavndgli_mc").a("c_ykhs39e").a("button_name", str).a(this.c).a();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.j.a
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad662d690aea82eee5a52817dade9cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad662d690aea82eee5a52817dade9cfc");
        } else {
            a(view, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f6852e4ecb4a30c351ade3e3f75a6f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f6852e4ecb4a30c351ade3e3f75a6f");
        } else {
            a(view, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f417f166f9dc871bed6760f84eb2d762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f417f166f9dc871bed6760f84eb2d762");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        this.f = intValue == 1 ? this.h.e() : intValue;
        if (this.i != null) {
            this.i.a(this.f);
        }
        c(view, z);
        if (intValue == this.e) {
            return;
        }
        b(view, true);
        b(a(this.e), false);
        this.e = intValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7827dd2249b71e17b9c83a4ea4eba8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7827dd2249b71e17b9c83a4ea4eba8") : this.n.getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af90ecda78d5d445d720337fcef6ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af90ecda78d5d445d720337fcef6ac0");
        } else if (view instanceof RooLabel) {
            RooLabel rooLabel = (RooLabel) view;
            if (z) {
                rooLabel.setBackgroundColor(Color.parseColor("#FFF8E1"));
                rooLabel.setStrokeColor(a(this.c, R.attr.rooBrandWarning, Color.parseColor("#FF8000")));
                rooLabel.setTextColor(Color.parseColor("#FF8000"));
                rooLabel.setContentDescription(rooLabel.getText().toString() + ", 已选中");
                return;
            }
            rooLabel.setBackgroundColor(-1);
            rooLabel.setStrokeColor(a(this.c, R.attr.rooGray, Color.parseColor("#D3D3D3")));
            rooLabel.setTextColor(Color.parseColor("#575859"));
            rooLabel.setContentDescription(rooLabel.getText().toString());
        } else {
            this.h.a(z);
        }
    }

    @ColorInt
    private int a(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e86aa863a78e34783412795f5b15cc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e86aa863a78e34783412795f5b15cc6")).intValue();
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : i2;
    }

    public final void b(int i) {
        Object[] objArr = {8};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c0741f72c97714719f5aa39d0f08d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c0741f72c97714719f5aa39d0f08d5");
        } else {
            ((FrameLayout) this.b).setVisibility(8);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2fe1d30477e6859965e347e44a08c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2fe1d30477e6859965e347e44a08c41");
            return;
        }
        ((FrameLayout) this.b).setVisibility(0);
        c(this.o);
        ((FrameLayout) this.b).setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "459473142178a20b08db55089689bacb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "459473142178a20b08db55089689bacb");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50ea94b159d1ba9efaa16cddc7a31d19", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.l) {
                case 101:
                    this.q = this.o;
                    break;
                case 102:
                    this.q = 0;
                    break;
                default:
                    this.q = ((FrameLayout) this.b).getMeasuredHeight();
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50ea94b159d1ba9efaa16cddc7a31d19");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "822471f4106c5aaed2be63e2be9802de", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.l) {
                case 101:
                    this.r = 350;
                    break;
                case 102:
                    this.r = CustomizedScrollView.ANIMATED_SCROLL_GAP;
                    break;
                default:
                    this.r = 0;
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "822471f4106c5aaed2be63e2be9802de");
        }
        this.j = ValueAnimator.ofInt(animator != null ? 0 : ((FrameLayout) this.b).getMeasuredHeight(), this.q);
        this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.f.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr4 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "76ffff96889b3c2e19b45e850254aabe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "76ffff96889b3c2e19b45e850254aabe");
                } else {
                    f.this.c(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        this.j.setDuration(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1312bc7004a5a11057677b9dc30638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1312bc7004a5a11057677b9dc30638");
        } else if (this.l == 101) {
            this.k = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
            this.k.setStartDelay(this.r / 2);
            this.k.setDuration(this.r);
        } else if (this.l == 102) {
            this.k = ObjectAnimator.ofFloat(this.b, "alpha", 0.9f, 0.0f);
            this.k.setDuration(this.r / 3);
            this.k.setInterpolator(new AccelerateDecelerateInterpolator());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "967ff4ff06961ef9e7f64f25d4423573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "967ff4ff06961ef9e7f64f25d4423573");
            return;
        }
        this.p.height = i;
        ((FrameLayout) this.b).setLayoutParams(this.p);
    }
}
