package com.sankuai.waimai.restaurant.shopcart.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
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
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.i;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.engine.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.log.d;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class MRNDialog extends DialogFragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect j;
    private View a;
    private RoundedFrameLayout b;
    private int c;
    private int d;
    private int[] e;
    private c f;
    private String g;
    private String h;
    private String i;
    protected WeakReference<MRNPopupFragment> k;
    private Animation l;
    private Animation m;
    private boolean n;

    public abstract int b();

    public abstract int c();

    public abstract c d();

    public abstract int[] e();

    public abstract Bundle f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public boolean m() {
        return false;
    }

    public MRNDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0592113ea4b020cf84940bbed87cd3dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0592113ea4b020cf84940bbed87cd3dc");
        } else {
            this.n = false;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ddbf1e01c134211eed069ee5a5e907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ddbf1e01c134211eed069ee5a5e907");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.WmRNSkuDialogTheme);
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abcd1d0cfbd112402c88607d1ded0096", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abcd1d0cfbd112402c88607d1ded0096");
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c366370afafb18572502fc5ed4f6534", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c366370afafb18572502fc5ed4f6534")).booleanValue();
                }
                if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                    MRNDialog mRNDialog = MRNDialog.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = MRNDialog.j;
                    if (PatchProxy.isSupport(objArr3, mRNDialog, changeQuickRedirect3, false, "37eaf84fd085b48f23669383c816e26a", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, mRNDialog, changeQuickRedirect3, false, "37eaf84fd085b48f23669383c816e26a")).booleanValue();
                    }
                    if (mRNDialog.k != null && mRNDialog.k.get() != null && mRNDialog.k.get().o() != null && mRNDialog.k.get().o().f != p.ERROR && mRNDialog.k.get().l() != null) {
                        ReactContext currentReactContext = mRNDialog.k.get().l().getCurrentReactContext();
                        if (currentReactContext != null) {
                            ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("dialogDismiss", null);
                        }
                    } else {
                        mRNDialog.dismiss();
                    }
                    return true;
                }
                return false;
            }
        });
        return onCreateDialog;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2327295e6eddb075d2e66ffb95cb6f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2327295e6eddb075d2e66ffb95cb6f4f");
        }
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.wm_common_mrn_popup_container, (ViewGroup) null, false);
        this.a.setVisibility(0);
        this.b = (RoundedFrameLayout) this.a.findViewById(R.id.mrn_popup_fragment_container);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d4face3867f14f5b4adca36f189bed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d4face3867f14f5b4adca36f189bed5");
        } else {
            this.c = b();
            this.d = c();
            this.f = d();
            this.e = e();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = j;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de13a36996c6b91d77cde36d364bdac4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de13a36996c6b91d77cde36d364bdac4");
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                if (this.f == c.BOTTOM_UP) {
                    layoutParams.gravity = 80;
                } else if (this.f == c.TOP_DOWN) {
                    layoutParams.gravity = 48;
                } else if (this.f == c.MIDDLE) {
                    layoutParams.gravity = 17;
                }
                layoutParams.leftMargin = this.e[1];
                layoutParams.rightMargin = this.e[3];
                if (this.f == c.MIDDLE) {
                    layoutParams.topMargin = this.e[0];
                    layoutParams.bottomMargin = this.e[2];
                    this.b.setMinimumHeight(this.d);
                } else if (this.d >= this.c) {
                    layoutParams.height = this.d;
                } else {
                    layoutParams.topMargin = g.b(com.meituan.android.singleton.b.a) - this.c;
                    this.b.setMinimumHeight(this.d);
                }
                this.b.setLayoutParams(layoutParams);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = j;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a99952f090d4b2b5e982438ac4603c93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a99952f090d4b2b5e982438ac4603c93");
            } else {
                this.g = g();
                this.h = h();
                this.i = i();
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = j;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8f2172e89250321fe8d7a8c70e6e9dc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8f2172e89250321fe8d7a8c70e6e9dc8");
            } else if (this.a != null) {
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5dc0dd494a74186ab781cbf4bbaf71d8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5dc0dd494a74186ab781cbf4bbaf71d8");
                        } else {
                            MRNDialog.this.dismiss();
                        }
                    }
                });
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = j;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cc85196924d14b4cb9a6ad2e80054078", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cc85196924d14b4cb9a6ad2e80054078");
            } else {
                Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Object[] objArr7 = {animation};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d8800a87895453e32d17cf598ee39166", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d8800a87895453e32d17cf598ee39166");
                        } else {
                            MRNDialog.this.n = true;
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr7 = {animation};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7d30d03e7c9ee68891b6aadbe0563402", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7d30d03e7c9ee68891b6aadbe0563402");
                            return;
                        }
                        MRNDialog.this.n = false;
                        MRNDialog.super.dismiss();
                    }
                };
                Animation.AnimationListener animationListener2 = new Animation.AnimationListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Object[] objArr7 = {animation};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "845be31d1a1725181d4dfeebaec5f2f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "845be31d1a1725181d4dfeebaec5f2f2");
                        } else {
                            MRNDialog.this.n = true;
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr7 = {animation};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5faa27142086a98bfc7f5c853874c63a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5faa27142086a98bfc7f5c853874c63a");
                        } else {
                            MRNDialog.this.n = false;
                        }
                    }
                };
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(300L);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation2.setDuration(300L);
                if (m()) {
                    this.l = null;
                } else if (this.f == c.BOTTOM_UP) {
                    this.l = translateAnimation;
                } else if (this.f == c.TOP_DOWN) {
                    this.l = translateAnimation2;
                } else if (this.f == c.MIDDLE) {
                    this.l = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.wm_goods_sku_enter);
                }
                if (m()) {
                    this.m = null;
                } else if (this.f == c.BOTTOM_UP) {
                    this.m = translateAnimation2;
                } else if (this.f == c.TOP_DOWN) {
                    this.m = translateAnimation;
                } else if (this.f == c.MIDDLE) {
                    this.m = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.wm_goods_sku_out);
                }
                if (this.m != null) {
                    this.m.setAnimationListener(animationListener);
                }
                if (this.l != null) {
                    this.l.setAnimationListener(animationListener2);
                }
            }
        }
        return this.a;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams attributes;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859f76fdee535069841f258acb0d3861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859f76fdee535069841f258acb0d3861");
            return;
        }
        super.onStart();
        Window window = getDialog().getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
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
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a3ad9494f4896843fdd4490c043c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a3ad9494f4896843fdd4490c043c2c");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6691f3db5abaf4720f481f536769d223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6691f3db5abaf4720f481f536769d223");
            return;
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Bundle f = f();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        f.putString("dialogTag", sb.toString());
        MRNPopupFragment a2 = MRNPopupFragment.a(this.g, this.h, this.i, f);
        this.k = new WeakReference<>(a2);
        a2.b = new MRNPopupFragment.a() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79131de6cda78f43d67fc5b1c3e7da82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79131de6cda78f43d67fc5b1c3e7da82");
                } else if (MRNDialog.this.b == null || MRNDialog.this.l == null) {
                } else {
                    MRNDialog.this.b.startAnimation(MRNDialog.this.l);
                }
            }
        };
        a2.c = new MRNPopupFragment.b() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment.b
            public final List<i> a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8747bb10678dca2abf250f85000d17a7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8747bb10678dca2abf250f85000d17a7") : MRNDialog.this.k();
            }
        };
        try {
            beginTransaction.replace(R.id.mrn_popup_fragment_container, a2, getTag());
            beginTransaction.commitNowAllowingStateLoss();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
        com.sankuai.waimai.business.restaurant.base.skuchoose.c a3 = com.sankuai.waimai.business.restaurant.base.skuchoose.c.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode());
        String sb3 = sb2.toString();
        Object[] objArr3 = {sb3, this};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.skuchoose.c.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "23813c7532ddf0cdc87822352696882b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "23813c7532ddf0cdc87822352696882b");
        } else if (a3.b.get(sb3) == null) {
            a3.b.put(sb3, new WeakReference<>(this));
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f110bf683f338476e7bfe6dbaf5d817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f110bf683f338476e7bfe6dbaf5d817");
        } else if (this.m != null) {
            this.b.startAnimation(this.m);
        } else {
            super.dismiss();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f822c6c8283696e9254bcd6d8ed5cb71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f822c6c8283696e9254bcd6d8ed5cb71");
            return;
        }
        super.onDismiss(dialogInterface);
        com.sankuai.waimai.business.restaurant.base.skuchoose.c a2 = com.sankuai.waimai.business.restaurant.base.skuchoose.c.a();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        String sb2 = sb.toString();
        Object[] objArr2 = {sb2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.skuchoose.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "fe25d3de1855be5819bc5a2b1f5be9e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "fe25d3de1855be5819bc5a2b1f5be9e3");
        } else {
            a2.b.remove(sb2);
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b3a88b4cf899dfa0bc876aee250bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b3a88b4cf899dfa0bc876aee250bce");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    public void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3869d0efce60b79db5c4c13317e55767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3869d0efce60b79db5c4c13317e55767");
        } else if (f.a(activity) || this.n) {
        } else {
            try {
                if (!(activity instanceof FragmentActivity) || activity.isFinishing()) {
                    return;
                }
                show(((FragmentActivity) activity).getSupportFragmentManager(), j());
            } catch (Exception e) {
                com.sankuai.waimai.platform.capacity.log.i.d(new d().a("waimai_restaurant").c(e.getMessage()).b());
            }
        }
    }

    public List<i> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4966409caabd7d1f3377a056057ff96b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4966409caabd7d1f3377a056057ff96b");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements i {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.facebook.react.i
        @NonNull
        public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0575e4376d65a7ce9624cf2359122a4", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0575e4376d65a7ce9624cf2359122a4");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MRNDialogContainerModule(reactApplicationContext));
            return arrayList;
        }

        @Override // com.facebook.react.i
        @NonNull
        public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5f69335206b4416524db5f67389186", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5f69335206b4416524db5f67389186") : Collections.emptyList();
        }
    }
}
