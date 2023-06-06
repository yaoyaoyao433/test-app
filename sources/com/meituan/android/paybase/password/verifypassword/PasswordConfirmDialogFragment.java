package com.meituan.android.paybase.password.verifypassword;

import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PasswordConfirmDialogFragment extends AbstractPasswordKeyboardDialogFragment implements com.meituan.android.paybase.common.utils.c, j {
    public static ChangeQuickRedirect g;
    private PasswordPageText h;
    private int i;
    private boolean j;

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final void a(String str, String str2, String str3) {
    }

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final void c(String str) {
    }

    public PasswordConfirmDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb60dc87b03af1cfd211e2426ae8bd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb60dc87b03af1cfd211e2426ae8bd5");
        } else {
            this.j = false;
        }
    }

    public static PasswordConfirmDialogFragment a(PasswordPageText passwordPageText, int i) {
        Object[] objArr = {passwordPageText, 8};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1080ea8fa8e9df633ea4e6823d7a037", RobustBitConfig.DEFAULT_VALUE)) {
            return (PasswordConfirmDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1080ea8fa8e9df633ea4e6823d7a037");
        }
        PasswordConfirmDialogFragment passwordConfirmDialogFragment = new PasswordConfirmDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("response", passwordPageText);
        bundle.putInt(KnbConstants.PARAMS_SCENE, 8);
        passwordConfirmDialogFragment.setArguments(bundle);
        return passwordConfirmDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18b9849e4bd336e6a4d7087826b89cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18b9849e4bd336e6a4d7087826b89cc");
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        this.h = (PasswordPageText) com.sankuai.waimai.platform.utils.f.a(arguments, "response");
        this.i = arguments.getInt(KnbConstants.PARAMS_SCENE);
    }

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final boolean a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ec576434e17603eb3f1b58f9aab26b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ec576434e17603eb3f1b58f9aab26b")).booleanValue();
        }
        if (!isAdded() || isRemoving()) {
            return false;
        }
        this.j = false;
        i();
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            if (payException.getCode() == 965001 || payException.getCode() == 118013) {
                m();
                BasePayDialog.b a = new PayDialog.a(getActivity()).c(exc.getMessage()).d(payException.getErrorCodeStr()).a(getString(R.string.paybase__btn_cancel), (BasePayDialog.c) null);
                String string = getString(R.string.paybase__password_retrieve);
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                a.b(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2c0737c8246b560f1039c55829cc512", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2c0737c8246b560f1039c55829cc512") : new a(this)).a().show();
                return true;
            }
        }
        if (com.meituan.android.paybase.password.a.a(exc)) {
            PayException payException2 = (PayException) exc;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4b66a3a066caab86b92a4c9d2303486a", RobustBitConfig.DEFAULT_VALUE) ? (SafePasswordView.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4b66a3a066caab86b92a4c9d2303486a") : new b(this));
            l();
            String message = payException2.getMessage();
            Object[] objArr4 = {message};
            ChangeQuickRedirect changeQuickRedirect4 = AbstractPasswordKeyboardDialogFragment.a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "928ea04f0aa5497ccdd5cf2161c61028", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "928ea04f0aa5497ccdd5cf2161c61028");
            } else if (this.f != null) {
                this.f.setText(message);
                this.f.setVisibility(0);
            }
            return true;
        }
        m();
        return false;
    }

    public static /* synthetic */ void a(PasswordConfirmDialogFragment passwordConfirmDialogFragment, Dialog dialog) {
        Object[] objArr = {passwordConfirmDialogFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6cfcf61da1c53f9de3f3979c6b5cc0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6cfcf61da1c53f9de3f3979c6b5cc0f");
        } else if (passwordConfirmDialogFragment.isAdded()) {
            RetrievePasswordActivity.a(passwordConfirmDialogFragment.getActivity(), 303);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edfb71b86adc2bc2838b57bfc022a998", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edfb71b86adc2bc2838b57bfc022a998")).booleanValue();
        }
        if (isAdded() && getActivity().hasWindowFocus()) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4105e8404fe522807f495cf0546d54a3", RobustBitConfig.DEFAULT_VALUE) ? (AbstractPasswordKeyboardDialogFragment.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4105e8404fe522807f495cf0546d54a3") : new c(this));
        }
        return true;
    }

    public static /* synthetic */ void a(PasswordConfirmDialogFragment passwordConfirmDialogFragment) {
        Object[] objArr = {passwordConfirmDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "534dd3d27b1877c3dc1b1e71f34976cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "534dd3d27b1877c3dc1b1e71f34976cf");
        } else if (passwordConfirmDialogFragment.isAdded()) {
            passwordConfirmDialogFragment.getActivity().finish();
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", -9854);
        }
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969e374efbcdbe317941d97c0c9999c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969e374efbcdbe317941d97c0c9999c3");
        } else if (getActivity() instanceof OnPasswordInsertListener) {
            Object[] objArr2 = {this, str};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad48a61a51ed0ed0043f761334756b02", RobustBitConfig.DEFAULT_VALUE) ? (AbstractPasswordKeyboardDialogFragment.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad48a61a51ed0ed0043f761334756b02") : new d(this, str));
        }
    }

    public static /* synthetic */ void a(PasswordConfirmDialogFragment passwordConfirmDialogFragment, String str) {
        Object[] objArr = {passwordConfirmDialogFragment, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0f11b441c4fbc73ecce0b460e088cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0f11b441c4fbc73ecce0b460e088cfb");
            return;
        }
        passwordConfirmDialogFragment.j = true;
        if (passwordConfirmDialogFragment.getActivity() instanceof OnPasswordInsertListener) {
            ((OnPasswordInsertListener) passwordConfirmDialogFragment.getActivity()).a(str, passwordConfirmDialogFragment);
            return;
        }
        List a = com.sankuai.meituan.serviceloader.b.a(OnPasswordInsertListener.class, "onPasswordInsert", passwordConfirmDialogFragment.getActivity());
        if (com.meituan.android.paybase.utils.i.a((Collection) a)) {
            return;
        }
        ((OnPasswordInsertListener) a.get(0)).a(str, passwordConfirmDialogFragment);
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7311ba2c4eee4d886f7837094d8473f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7311ba2c4eee4d886f7837094d8473f0");
            return;
        }
        m();
        RetrievePasswordActivity.a(getActivity(), n());
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80e2bbf39271c7e4701c91555f62a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80e2bbf39271c7e4701c91555f62a2c");
        } else {
            h();
        }
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7962bc7560a6ab4ea705dd16f22506e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7962bc7560a6ab4ea705dd16f22506e0");
        }
        if (this.h != null) {
            return this.h.getPageTip();
        }
        return super.j();
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardDialogFragment
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee269773ee856c4d89c2c6078f14f935", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee269773ee856c4d89c2c6078f14f935");
        }
        if (this.h != null) {
            return this.h.getSubPageTip();
        }
        return super.k();
    }

    public final int n() {
        int i = this.i;
        if (i != 5) {
            if (i != 7) {
                return 101;
            }
            return TbsListener.ErrorCode.APK_VERSION_ERROR;
        }
        return 303;
    }

    @Override // com.meituan.android.paybase.common.utils.c
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4a4bdf649dc5ff2a2f3219d5e95871", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4a4bdf649dc5ff2a2f3219d5e95871")).booleanValue() : getView() == null || this.j;
    }
}
