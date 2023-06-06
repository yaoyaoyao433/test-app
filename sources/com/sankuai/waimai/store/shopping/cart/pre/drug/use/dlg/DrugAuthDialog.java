package com.sankuai.waimai.store.shopping.cart.pre.drug.use.dlg;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.shopping.cart.pre.c;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugAuthDialog extends CustomDialog implements DialogInterface.OnShowListener, View.OnClickListener {
    public static ChangeQuickRedirect a;
    public TextView b;
    public c c;
    public a d;
    private TextView e;
    private TextView f;
    private View h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public DrugAuthDialog(Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_st_shopcart_dialog_drug_auth, (ViewGroup) null, false));
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3bd55c686183669dd30682403e26b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3bd55c686183669dd30682403e26b4");
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.WmStNoneAnimation);
        }
        setOnShowListener(this);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6382c7e911e3f2c4410f104e7b8dad7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6382c7e911e3f2c4410f104e7b8dad7c");
        } else if (view != null) {
            this.b = (TextView) c(R.id.wm_st_dlg_tv_auth_content);
            this.e = (TextView) c(R.id.wm_st_dlg_tv_cancel);
            this.f = (TextView) c(R.id.wm_st_dlg_tv_proceed);
            this.h = c(R.id.wm_st_dlg_container);
            u.a(this, this.e, this.f);
            this.b.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.CustomDialog, com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be93cd0f0cdf09674e533b058df40325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be93cd0f0cdf09674e533b058df40325");
            return;
        }
        super.show();
        if (this.d != null) {
            this.d.a();
        }
        u.c(this.h);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823978d7c52b4fe0adae261b40beee7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823978d7c52b4fe0adae261b40beee7d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ada34b26bc71e608fada91fd1f6999d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ada34b26bc71e608fada91fd1f6999d9");
        } else if (!b.a(getContext())) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.wm_st_dlg_drug_dismiss);
            this.h.clearAnimation();
            this.h.setAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.store.shopping.cart.pre.drug.use.dlg.DrugAuthDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr3 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13a890eb1121ff63e156b5680753a3ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13a890eb1121ff63e156b5680753a3ce");
                    } else {
                        DrugAuthDialog.this.a();
                    }
                }
            });
            loadAnimation.start();
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff0907d4d03894c9a5d67a678342007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff0907d4d03894c9a5d67a678342007");
        } else {
            super.dismiss();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "792af7ca29589a18ff1f003205c5c061", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "792af7ca29589a18ff1f003205c5c061");
        } else if (view == this.e) {
            dismiss();
            if (this.c != null) {
            }
        } else if (view == this.f) {
            dismiss();
            if (this.c != null) {
                this.c.a();
            }
            if (this.d != null) {
                this.d.b();
            }
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce83c12b51e0146729bb6c764365d5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce83c12b51e0146729bb6c764365d5e4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "766ec9a60140af5d25c7fe275ed4d50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "766ec9a60140af5d25c7fe275ed4d50a");
            return;
        }
        u.a(this.h);
        if (b.a(getContext())) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.wm_st_dlg_drug_show);
        this.h.clearAnimation();
        this.h.setAnimation(loadAnimation);
        loadAnimation.start();
    }
}
