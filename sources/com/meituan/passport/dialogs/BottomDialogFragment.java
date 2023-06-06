package com.meituan.passport.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BottomDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    private View b;
    private ViewGroup c;
    private boolean d;

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public BottomDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d425a892ae3d8086082facf6c5f3e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d425a892ae3d8086082facf6c5f3e5a");
        } else {
            this.d = false;
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public /* synthetic */ android.app.Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3006d4656f594aecf59eea96d02228", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3006d4656f594aecf59eea96d02228");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        return new Dialog(getContext(), getTheme(), PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c2e4bf30754bc66eb8f8af8a85ebbd52", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnDismissListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c2e4bf30754bc66eb8f8af8a85ebbd52") : new a(this));
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084f0a26c86dbb12565f24181eb0a400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084f0a26c86dbb12565f24181eb0a400");
            return;
        }
        super.onCreate(bundle);
        if (ab.a() == 3) {
            setStyle(0, R.style.OperatorLoginDialogTheme);
        } else {
            setStyle(0, R.style.PassportDialogFragment);
        }
    }

    public static /* synthetic */ void a(BottomDialogFragment bottomDialogFragment, DialogInterface dialogInterface) {
        Object[] objArr = {bottomDialogFragment, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c044bf748bf5eb6db9825a450f6e80b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c044bf748bf5eb6db9825a450f6e80b");
        } else {
            bottomDialogFragment.c();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb339201249b31549f11984c8c0d784", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb339201249b31549f11984c8c0d784");
        }
        this.b = layoutInflater.inflate(R.layout.passport_fragment_dialog_bottom, viewGroup, false);
        this.c = (ViewGroup) this.b.findViewById(R.id.passport_more_other_layout);
        this.c.addView(a(layoutInflater, this.c));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b578174d377f599da1a9cc7605f93e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b578174d377f599da1a9cc7605f93e8");
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setFillEnabled(true);
            translateAnimation.setInterpolator(getContext(), 17432582);
            this.c.startAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setFillEnabled(true);
            this.b.findViewById(R.id.passport_more_other_bg).startAnimation(alphaAnimation);
        }
        return this.b;
    }

    @ColorInt
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85e5eaeb982576251e538e172416ef2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85e5eaeb982576251e538e172416ef2")).intValue() : Color.parseColor("#66000000");
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f288a2a76a80a925362a6e21d970773a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f288a2a76a80a925362a6e21d970773a");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b.setBackgroundColor(a());
        view.findViewById(R.id.passport_more_other_bg).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.dialogs.BottomDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d924195c1ce07ee88b77965c570440b7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d924195c1ce07ee88b77965c570440b7");
                } else {
                    BottomDialogFragment.this.c();
                }
            }
        });
    }

    @CallSuper
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36bf872bf2676aa7e27a3796ae4d854d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36bf872bf2676aa7e27a3796ae4d854d");
            return;
        }
        super.dismissAllowingStateLoss();
        this.d = false;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874d5ec57087cd17d5f3fb1e4130c7e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874d5ec57087cd17d5f3fb1e4130c7e6");
        } else if (this.d) {
        } else {
            this.d = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setFillEnabled(true);
            this.c.startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.passport.dialogs.BottomDialogFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e1e50d0582810bc60d91c4223245694", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e1e50d0582810bc60d91c4223245694");
                    } else {
                        BottomDialogFragment.this.b();
                    }
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setFillEnabled(true);
            this.b.findViewById(R.id.passport_more_other_bg).startAnimation(alphaAnimation);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class Dialog extends android.app.Dialog {
        public static ChangeQuickRedirect a;
        private DialogInterface.OnDismissListener b;

        public Dialog(@NonNull Context context, @StyleRes int i, DialogInterface.OnDismissListener onDismissListener) {
            super(context, i);
            Object[] objArr = {context, Integer.valueOf(i), onDismissListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c2567543766b9c4c23e6adae3620e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c2567543766b9c4c23e6adae3620e5");
            } else {
                this.b = onDismissListener;
            }
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a321e619eb582608011fcc53f9986d72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a321e619eb582608011fcc53f9986d72");
            } else if (this.b != null) {
                this.b.onDismiss(this);
            } else {
                super.cancel();
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba98ea6e52750359db82e97fc11afdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba98ea6e52750359db82e97fc11afdb");
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
