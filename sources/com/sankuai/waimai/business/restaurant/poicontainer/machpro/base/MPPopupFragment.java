package com.sankuai.waimai.business.restaurant.poicontainer.machpro.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.log.d;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.restaurant.shopcart.popup.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class MPPopupFragment extends MPBaseDialogFragment {
    public static ChangeQuickRedirect e;
    private FrameLayout f;
    private FrameLayout g;
    private int h;
    private int i;
    private int[] j;
    private c k;
    private Animation l;
    private Animation m;
    private boolean n;

    public abstract int m();

    public abstract int[] n();

    public abstract c o();

    public abstract String p();

    public MPPopupFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80dfbbf8d6f59bb09f488a5c32ab9dd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80dfbbf8d6f59bb09f488a5c32ab9dd7");
        } else {
            this.n = false;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7658c6500a64941fe41ae1507317d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7658c6500a64941fe41ae1507317d09");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.WmRNSkuDialogTheme);
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c067ac39dd3366c062ebc9b96df8970", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c067ac39dd3366c062ebc9b96df8970");
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d19712c865b12f66ef4b401a055606a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d19712c865b12f66ef4b401a055606a0")).booleanValue();
                }
                if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                    MPPopupFragment mPPopupFragment = MPPopupFragment.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = MPPopupFragment.e;
                    if (PatchProxy.isSupport(objArr3, mPPopupFragment, changeQuickRedirect3, false, "328d8df0ee72665e62b8fb417c3f4910", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, mPPopupFragment, changeQuickRedirect3, false, "328d8df0ee72665e62b8fb417c3f4910")).booleanValue();
                    }
                    mPPopupFragment.dismiss();
                    return true;
                }
                return false;
            }
        });
        return onCreateDialog;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eff591a7d6d81dc62c29fa9d0b78b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eff591a7d6d81dc62c29fa9d0b78b0f");
        }
        this.f = (FrameLayout) layoutInflater.inflate(R.layout.wm_restaurant_machpro_popup_container, (ViewGroup) null, false);
        this.f.setVisibility(0);
        this.c = this.f;
        this.g = (FrameLayout) this.f.findViewById(R.id.mp_popup_fragment_container);
        this.d = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5db664cd9498c06193dc50e3b483cdcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5db664cd9498c06193dc50e3b483cdcd");
        } else {
            this.h = m();
            this.i = 0;
            this.k = o();
            this.j = n();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8561f413ccb86810949d076d2eecfb7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8561f413ccb86810949d076d2eecfb7");
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                if (this.k == c.BOTTOM_UP) {
                    layoutParams.gravity = 80;
                } else if (this.k == c.TOP_DOWN) {
                    layoutParams.gravity = 48;
                } else if (this.k == c.MIDDLE) {
                    layoutParams.gravity = 17;
                }
                layoutParams.leftMargin = this.j[1];
                layoutParams.rightMargin = this.j[3];
                if (this.k == c.MIDDLE) {
                    layoutParams.topMargin = this.j[0];
                    layoutParams.bottomMargin = this.j[2];
                    this.g.setMinimumHeight(this.i);
                } else if (this.i >= this.h) {
                    layoutParams.height = this.i;
                } else {
                    layoutParams.topMargin = g.b(b.a) - this.h;
                    this.g.setMinimumHeight(this.i);
                }
                this.g.setLayoutParams(layoutParams);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = e;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6c1167dadd9d144ea20f800e40c4b76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6c1167dadd9d144ea20f800e40c4b76");
            } else if (this.f != null) {
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b5d09d5021e8ef16f76c5e3ce8d44c64", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b5d09d5021e8ef16f76c5e3ce8d44c64");
                        } else {
                            MPPopupFragment.this.dismiss();
                        }
                    }
                });
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = e;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ca00de8df6a961fe30696846c93bd21f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ca00de8df6a961fe30696846c93bd21f");
            } else {
                Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Object[] objArr6 = {animation};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "97efd866ed8081b197bfdc284d9ff1df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "97efd866ed8081b197bfdc284d9ff1df");
                        } else {
                            MPPopupFragment.this.n = true;
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr6 = {animation};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "068b9e57852650116336d33c2d64f45c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "068b9e57852650116336d33c2d64f45c");
                            return;
                        }
                        MPPopupFragment.this.n = false;
                        MPPopupFragment.super.dismissAllowingStateLoss();
                    }
                };
                Animation.AnimationListener animationListener2 = new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Object[] objArr6 = {animation};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "406e9e86ea179b0cf991ec1f39b70e68", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "406e9e86ea179b0cf991ec1f39b70e68");
                        } else {
                            MPPopupFragment.this.n = true;
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr6 = {animation};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b1a480248635c61e10641c6c63e8943d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b1a480248635c61e10641c6c63e8943d");
                        } else {
                            MPPopupFragment.this.n = false;
                        }
                    }
                };
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(300L);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation2.setDuration(300L);
                if (this.k == c.BOTTOM_UP) {
                    this.l = translateAnimation;
                } else if (this.k == c.TOP_DOWN) {
                    this.l = translateAnimation2;
                } else if (this.k == c.MIDDLE) {
                    this.l = AnimationUtils.loadAnimation(this.g.getContext(), R.anim.wm_goods_sku_enter);
                }
                if (this.k == c.BOTTOM_UP) {
                    this.m = translateAnimation2;
                } else if (this.k == c.TOP_DOWN) {
                    this.m = translateAnimation;
                } else if (this.k == c.MIDDLE) {
                    this.m = AnimationUtils.loadAnimation(this.g.getContext(), R.anim.wm_goods_sku_out);
                }
                if (this.m != null) {
                    this.m.setAnimationListener(animationListener);
                }
                if (this.l != null) {
                    this.l.setAnimationListener(animationListener2);
                }
            }
        }
        if (f.a().i.j) {
            k();
        }
        return this.f;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "150cfde0fd21d4bc2296d1534682b5d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "150cfde0fd21d4bc2296d1534682b5d6");
            return;
        }
        super.onStart();
        if (getDialog() == null || getDialog().getWindow() == null || (attributes = (window = getDialog().getWindow()).getAttributes()) == null) {
            return;
        }
        attributes.gravity = 17;
        attributes.height = -1;
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472f65e075c783f4bb66604367b153f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472f65e075c783f4bb66604367b153f4");
            return;
        }
        super.onViewCreated(view, bundle);
        this.g.startAnimation(this.l);
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9d9343901adbee315d8bd52d4cdf14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9d9343901adbee315d8bd52d4cdf14");
        } else if (this.m != null) {
            this.g.startAnimation(this.m);
        } else {
            super.dismiss();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, com.sankuai.waimai.machpro.container.b
    public final void a(CacheException cacheException) {
        Object[] objArr = {cacheException};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89dd0421f0aafddc10077319ed1e012f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89dd0421f0aafddc10077319ed1e012f");
            return;
        }
        super.a(cacheException);
        dismiss();
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a0d7fce0b34ae5beafdc6cfa223884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a0d7fce0b34ae5beafdc6cfa223884");
        } else if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f665b86e53a5c673582d8ea49805337b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f665b86e53a5c673582d8ea49805337b");
        } else if (com.sankuai.waimai.foundation.utils.f.a(activity) || this.n) {
        } else {
            try {
                if (!(activity instanceof FragmentActivity) || activity.isFinishing()) {
                    return;
                }
                show(((FragmentActivity) activity).getSupportFragmentManager(), p());
            } catch (Exception e2) {
                i.d(new d().a("waimai_restaurant").c(e2.getMessage()).b());
            }
        }
    }
}
