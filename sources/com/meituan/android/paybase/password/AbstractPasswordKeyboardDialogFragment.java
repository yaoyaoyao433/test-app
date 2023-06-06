package com.meituan.android.paybase.password;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractPasswordKeyboardDialogFragment extends PayBaseFragment implements View.OnClickListener, SafeKeyBoardView.a, SafePasswordView.b {
    public static ChangeQuickRedirect a;
    protected SafeKeyBoardView b;
    protected SafePasswordView c;
    protected TextView d;
    protected ImageView e;
    protected TextView f;
    private AnimatorSet g;
    private AnimatorSet h;
    private a i;
    @MTPayNeedToPersist
    private int j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public abstract void b(String str);

    public abstract void c();

    public abstract void f();

    public String k() {
        return null;
    }

    public AbstractPasswordKeyboardDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc34331f94544fb4aaefea28a819b1c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc34331f94544fb4aaefea28a819b1c7");
        } else {
            this.j = 0;
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3547de5616b4e16b0e140cb8bacb3d71", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3547de5616b4e16b0e140cb8bacb3d71") : layoutInflater.inflate(R.layout.paybase__password_verify_dialog_fragment, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43dc4a4dc6f8b176bcfc9654b0f46d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43dc4a4dc6f8b176bcfc9654b0f46d27");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b = (SafeKeyBoardView) view.findViewById(R.id.safe_keyboard);
        this.c = (SafePasswordView) view.findViewById(R.id.safe_password);
        this.d = (TextView) view.findViewById(R.id.forget_psw);
        this.e = (ImageView) view.findViewById(R.id.cancel);
        this.f = (TextView) view.findViewById(R.id.error_tip);
        this.b.setListener(this);
        this.c.setListener(this);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        if (bundle != null) {
            String string = bundle.getString("finalPassword");
            if (!TextUtils.isEmpty(string)) {
                for (int i = 0; i < string.length(); i++) {
                    this.c.a(String.valueOf(string.charAt(i)));
                }
            }
        }
        String j = j();
        if (!TextUtils.isEmpty(j)) {
            ((TextView) view.findViewById(R.id.title)).setText(j);
        }
        String k = k();
        if (!TextUtils.isEmpty(k)) {
            TextView textView = (TextView) view.findViewById(R.id.tip);
            textView.setText(k);
            textView.setVisibility(0);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45e479e0b7b2199b979c3ca534efa611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45e479e0b7b2199b979c3ca534efa611");
        } else if (getView() != null) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
            View findViewById = getView().findViewById(R.id.verify_psw_bg);
            View findViewById2 = getView().findViewById(R.id.verify_psw_window);
            View findViewById3 = getView().findViewById(R.id.safe_keyboard);
            findViewById3.measure(0, 0);
            getView().measure(0, 0);
            int measuredHeight = findViewById3.getMeasuredHeight();
            this.g = new AnimatorSet();
            float f = measuredHeight;
            this.g.playTogether(ObjectAnimator.ofFloat(findViewById, "alpha", 0.0f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(findViewById2, "alpha", 0.0f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(findViewById3, RecceAnimUtils.TRANSLATION_Y, f, 0.0f).setDuration(300L));
            this.i = new a();
            this.g.addListener(this.i);
            this.g.setInterpolator(fastOutSlowInInterpolator);
            this.h = new AnimatorSet();
            this.h.playTogether(ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f, 0.0f).setDuration(200L), ObjectAnimator.ofFloat(findViewById2, "alpha", 1.0f, 0.0f).setDuration(200L), ObjectAnimator.ofFloat(findViewById3, RecceAnimUtils.TRANSLATION_Y, 0.0f, f).setDuration(300L));
            this.h.addListener(this.i);
            this.h.setInterpolator(fastOutSlowInInterpolator);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c91d563a6fa5aa38ca48ce886e16a3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c91d563a6fa5aa38ca48ce886e16a3b");
            return;
        }
        super.onActivityCreated(bundle);
        ((BaseActivity) getActivity()).getSupportActionBar().c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3600679d8b7e65c7767fb1de2e4aafc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3600679d8b7e65c7767fb1de2e4aafc");
        } else if (view.getId() == R.id.forget_psw) {
            c();
        } else if (view.getId() == R.id.cancel) {
            f();
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed3c24f5a8fb328bd63261fa0cc3939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed3c24f5a8fb328bd63261fa0cc3939");
        } else if (this.g == null) {
        } else {
            this.j = 1;
            this.i.b = null;
            this.g.start();
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f482850bbe8b6ad80141de9e7b81a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f482850bbe8b6ad80141de9e7b81a56");
        } else if (this.h == null) {
        } else {
            this.j = 2;
            this.i.b = bVar;
            this.h.start();
        }
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f593abc204316f68909f11b8f8be8a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f593abc204316f68909f11b8f8be8a83");
        } else if (z) {
            b(str);
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c60fdb2e4333e657beb22a9825b5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c60fdb2e4333e657beb22a9825b5c5");
        } else if (this.c.d()) {
        } else {
            b();
            this.c.a(str);
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef795a1ce9bc460d6cb1cbf01499a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef795a1ce9bc460d6cb1cbf01499a74");
        } else if (this.c.d()) {
        } else {
            b();
            this.c.a();
        }
    }

    public String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af0847aebd82a452dc02dc418cbfe4e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af0847aebd82a452dc02dc418cbfe4e") : getString(R.string.paybase__password_verify_title);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01d4582bc499a00b80b0ef440b2d86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01d4582bc499a00b80b0ef440b2d86c");
            return;
        }
        super.onResume();
        int i = this.j;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39911f5998d9e2ae7f1a98b60b69acdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39911f5998d9e2ae7f1a98b60b69acdd");
        } else if (getView() != null) {
            switch (i) {
                case 0:
                    i();
                    return;
                case 1:
                    getView().findViewById(R.id.verify_psw_bg).setVisibility(0);
                    getView().findViewById(R.id.verify_psw_window).setVisibility(0);
                    getView().findViewById(R.id.safe_keyboard).setVisibility(0);
                    return;
                case 2:
                    getView().findViewById(R.id.verify_psw_bg).setVisibility(4);
                    getView().findViewById(R.id.verify_psw_window).setVisibility(4);
                    getView().findViewById(R.id.safe_keyboard).setVisibility(4);
                    return;
                default:
                    return;
            }
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9370fd2a6f345b1c6c4b0080834df34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9370fd2a6f345b1c6c4b0080834df34b");
        } else {
            this.c.c();
        }
    }

    public final void a(SafePasswordView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f29e7c0d062e702c2b5b6782085c881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f29e7c0d062e702c2b5b6782085c881");
        } else {
            this.c.setOnAnimationFinish(aVar);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a480e78dd7b0f912eb12a16b51a76e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a480e78dd7b0f912eb12a16b51a76e76");
        } else {
            this.c.b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8b64fbe9af73fae792826d29a09e288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8b64fbe9af73fae792826d29a09e288");
        } else if (this.f == null || this.f.getVisibility() != 0) {
        } else {
            this.f.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Animator.AnimatorListener {
        public static ChangeQuickRedirect a;
        public b b;

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        private a() {
            Object[] objArr = {AbstractPasswordKeyboardDialogFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf813ba631edf4960ac2def2b5c71333", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf813ba631edf4960ac2def2b5c71333");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841dc81f8904f17f2ee79b199ab03bfe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841dc81f8904f17f2ee79b199ab03bfe");
            } else if (AbstractPasswordKeyboardDialogFragment.this.isAdded() && AbstractPasswordKeyboardDialogFragment.this.h == animator && this.b != null) {
                this.b.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07de875da0a16f14ca2a36b276541c05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07de875da0a16f14ca2a36b276541c05");
            } else if (AbstractPasswordKeyboardDialogFragment.this.getView() != null) {
                AbstractPasswordKeyboardDialogFragment.this.getView().findViewById(R.id.verify_psw_bg).setVisibility(0);
                AbstractPasswordKeyboardDialogFragment.this.getView().findViewById(R.id.verify_psw_window).setVisibility(0);
                AbstractPasswordKeyboardDialogFragment.this.getView().findViewById(R.id.safe_keyboard).setVisibility(0);
            }
        }
    }
}
