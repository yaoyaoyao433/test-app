package com.meituan.android.paybase.password.verifypassword;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PasswordConfirmPageFragment extends AbstractPasswordKeyboardFragment implements j {
    public static ChangeQuickRedirect a;
    private PasswordPageText e;
    private int f;

    public static PasswordConfirmPageFragment a(PasswordPageText passwordPageText, int i) {
        Object[] objArr = {passwordPageText, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76402eb707745760f5aa672ddd18939e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PasswordConfirmPageFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76402eb707745760f5aa672ddd18939e");
        }
        PasswordConfirmPageFragment passwordConfirmPageFragment = new PasswordConfirmPageFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("response", passwordPageText);
        bundle.putInt(KnbConstants.PARAMS_SCENE, i);
        passwordConfirmPageFragment.setArguments(bundle);
        return passwordConfirmPageFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e7b12bf361c1fd704993ae9b422910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e7b12bf361c1fd704993ae9b422910");
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        this.e = (PasswordPageText) com.sankuai.waimai.platform.utils.f.a(arguments, "response");
        this.f = arguments.getInt(KnbConstants.PARAMS_SCENE);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ef90e23436b633bf1f3e6b949ef66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ef90e23436b633bf1f3e6b949ef66b");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4dad1cd667c479b360b0056e01e5d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4dad1cd667c479b360b0056e01e5d7");
            return;
        }
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.set_password_title);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c0f60253788de52b0d73670c86965e0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c0f60253788de52b0d73670c86965e0")).booleanValue();
        } else {
            z = (getActivity().getActionBar() != null && getActivity().getActionBar().isShowing()) || ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null && ((AppCompatActivity) getActivity()).getSupportActionBar().d());
        }
        if (!z && this.e != null && !TextUtils.isEmpty(this.e.getPageTitle())) {
            toolbar.setVisibility(0);
            toolbar.setTitle(this.e.getPageTitle());
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            toolbar.setNavigationOnClickListener(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ec12713d948e4a94d3ee3f5ae4a96616", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ec12713d948e4a94d3ee3f5ae4a96616") : new e(this));
        } else {
            toolbar.setVisibility(8);
        }
        if (this.e != null) {
            if (!TextUtils.isEmpty(this.e.getPageTip())) {
                this.c.setText(this.e.getPageTip());
            }
            if (!TextUtils.isEmpty(this.e.getSubPageTip())) {
                this.d.setText(this.e.getSubPageTip());
                this.d.setVisibility(0);
            }
        }
        b();
        View findViewById = view.findViewById(R.id.safe_keyboard);
        if (this.f != 5 || findViewById == null || Build.VERSION.SDK_INT < 18) {
            return;
        }
        findViewById.getViewTreeObserver().addOnWindowFocusChangeListener(f.a(findViewById, getActivity()));
    }

    public static /* synthetic */ void a(PasswordConfirmPageFragment passwordConfirmPageFragment, View view) {
        Object[] objArr = {passwordConfirmPageFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d871e2691345d099741dc867b9e29e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d871e2691345d099741dc867b9e29e13");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, passwordConfirmPageFragment, changeQuickRedirect2, false, "5a9b845ddf516df8840ef1cfe9d15278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, passwordConfirmPageFragment, changeQuickRedirect2, false, "5a9b845ddf516df8840ef1cfe9d15278");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_29tz49g5", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", -9854);
        FragmentActivity activity = passwordConfirmPageFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static /* synthetic */ void a(View view, Activity activity, boolean z) {
        Object[] objArr = {view, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91393ef6463b5492b67c8e511c85800e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91393ef6463b5492b67c8e511c85800e");
        } else if (view.isShown() && z) {
            ab.b(activity);
        } else {
            ab.a(activity);
        }
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0cde28bc42dc6d634f0707d46aa1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0cde28bc42dc6d634f0707d46aa1a8");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_w1o238w8", (Map<String, Object>) null);
        if (getActivity() instanceof OnPasswordInsertListener) {
            ((OnPasswordInsertListener) getActivity()).a(str, this);
            return;
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(OnPasswordInsertListener.class, "onPasswordInsert", getActivity());
        if (com.meituan.android.paybase.utils.i.a((Collection) a2)) {
            return;
        }
        ((OnPasswordInsertListener) a2.get(0)).a(str, this);
    }

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final boolean a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec39a2613be1359b85c815552ac1919f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec39a2613be1359b85c815552ac1919f")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_mypa48y6", (Map<String, Object>) null);
        if (!isAdded() || isRemoving()) {
            return false;
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            if (payException.getCode() == 965001 || payException.getCode() == 118013) {
                com.meituan.android.paybase.common.analyse.a.a("b_ncogxxsw", (Map<String, Object>) null);
                b();
                BasePayDialog.b a2 = new PayDialog.a(getActivity()).c(exc.getMessage()).d(payException.getErrorCodeStr()).a(getString(R.string.paybase__btn_cancel), (BasePayDialog.c) null);
                String string = getString(R.string.paybase__password_retrieve);
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                a2.b(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4041699d0d617e8782df9126b4834d9c", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4041699d0d617e8782df9126b4834d9c") : new g(this)).a().show();
                return true;
            }
        }
        if (com.meituan.android.paybase.password.a.a(exc)) {
            PayException payException2 = (PayException) exc;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8827161d6aef741f6e12283aa8fd1e65", RobustBitConfig.DEFAULT_VALUE) ? (SafePasswordView.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8827161d6aef741f6e12283aa8fd1e65") : new h(this));
            c();
            d(payException2.getMessage());
            return true;
        }
        b();
        return false;
    }

    public static /* synthetic */ void b(PasswordConfirmPageFragment passwordConfirmPageFragment, Dialog dialog) {
        Object[] objArr = {passwordConfirmPageFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e58bd0cadcd9aeabe70688ec2fe12a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e58bd0cadcd9aeabe70688ec2fe12a5f");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_1081g7b2", (Map<String, Object>) null);
        if (passwordConfirmPageFragment.isAdded()) {
            RetrievePasswordActivity.a(passwordConfirmPageFragment.getActivity(), 303);
        }
    }

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ee20a78b0bac2c2ca159a147ac795e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ee20a78b0bac2c2ca159a147ac795e");
            return;
        }
        d(str);
        b();
    }

    @Override // com.meituan.android.paybase.password.verifypassword.j
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f176019f735f5638ce848167af8d743a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f176019f735f5638ce848167af8d743a");
            return;
        }
        b();
        BasePayDialog.b a2 = new PayDialog.a(getActivity()).c(str).a(str2, (BasePayDialog.c) null);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        a2.b(str3, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "35fe89d3e582dc57682db78787e89cfc", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "35fe89d3e582dc57682db78787e89cfc") : new i(this)).a().show();
    }

    public static /* synthetic */ void a(PasswordConfirmPageFragment passwordConfirmPageFragment, Dialog dialog) {
        Object[] objArr = {passwordConfirmPageFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3f08cb5e0614fb4faa178b1e37d2660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3f08cb5e0614fb4faa178b1e37d2660");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_1081g7b2", (Map<String, Object>) null);
        if (passwordConfirmPageFragment.isAdded()) {
            RetrievePasswordActivity.a(passwordConfirmPageFragment.getActivity(), 303);
        }
    }

    @Override // android.support.v4.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b399bc2bfe2725df10a697277e8667f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b399bc2bfe2725df10a697277e8667f")).booleanValue();
        }
        if (this.f != 1 && menuItem.getItemId() == R.id.retrieve_password && isAdded()) {
            b();
            RetrievePasswordActivity.a(getActivity(), f());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Object[] objArr = {menu, menuInflater};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b2e1a718010adf439419174eca634b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b2e1a718010adf439419174eca634b");
            return;
        }
        if (this.f != 1) {
            menuInflater.inflate(R.menu.paybase__menu_password_retrieve, menu);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public final int f() {
        int i = this.f;
        if (i != 5) {
            if (i != 7) {
                return 101;
            }
            return TbsListener.ErrorCode.APK_VERSION_ERROR;
        }
        return 303;
    }
}
