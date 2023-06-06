package com.meituan.android.pay.setpassword;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SetPasswordFragment extends AbstractPasswordKeyboardFragment implements b {
    public static ChangeQuickRedirect a;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private PresetPasswordResponse j;
    private ProgressButton k;
    private a l;
    private int m;
    private boolean n;
    private com.meituan.android.pay.setpassword.a o;
    private String p;
    private boolean q;
    private Serializable r;
    private int s;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_q5irye68";
    }

    public SetPasswordFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5f49af29675711e8c47e0441dd87ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5f49af29675711e8c47e0441dd87ef");
            return;
        }
        this.l = a.FIRST_SET;
        this.n = true;
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        FIRST_SET,
        FIRST_VERIFY;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ec96de6f7ad266a9be04823d39f52a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ec96de6f7ad266a9be04823d39f52a");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "def2944a71afe18c5d4eb67687362775", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "def2944a71afe18c5d4eb67687362775") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3be08a96dadf56fd789244755a4bf4c1", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3be08a96dadf56fd789244755a4bf4c1") : (a[]) values().clone();
        }
    }

    private static SetPasswordFragment a(String str, int i, PresetPasswordResponse presetPasswordResponse, int i2, String str2, String str3, Serializable serializable, int i3) {
        Object[] objArr = {str, Integer.valueOf(i), presetPasswordResponse, Integer.valueOf(i2), str2, str3, serializable, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b4baf479dbe9d3631551edb8a4d62b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SetPasswordFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b4baf479dbe9d3631551edb8a4d62b");
        }
        SetPasswordFragment setPasswordFragment = new SetPasswordFragment();
        Bundle bundle = new Bundle();
        bundle.putString("verifycode", str);
        bundle.putInt(KnbConstants.PARAMS_SCENE, i);
        bundle.putSerializable("page_text", presetPasswordResponse);
        bundle.putInt("type", i2);
        bundle.putString("modifypassword", str2);
        bundle.putString("password_set", str3);
        bundle.putSerializable("other_action", serializable);
        bundle.putInt("page_style", i3);
        setPasswordFragment.setArguments(bundle);
        return setPasswordFragment;
    }

    public static SetPasswordFragment a(int i, PresetPasswordResponse presetPasswordResponse, String str, Serializable serializable) {
        Object[] objArr = {4, presetPasswordResponse, str, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "530db42ff77a1beb9b626ba6d4923b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SetPasswordFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "530db42ff77a1beb9b626ba6d4923b1c");
        }
        SetPasswordFragment setPasswordFragment = new SetPasswordFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("page_text", presetPasswordResponse);
        bundle.putInt("type", 4);
        bundle.putString("id_bindcard", str);
        bundle.putSerializable("other_action", serializable);
        setPasswordFragment.setArguments(bundle);
        return setPasswordFragment;
    }

    public static SetPasswordFragment a(int i, int i2, PresetPasswordResponse presetPasswordResponse, Serializable serializable) {
        Object[] objArr = {1, 3, presetPasswordResponse, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "248131da082f944b5240e3a1bab54dd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SetPasswordFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "248131da082f944b5240e3a1bab54dd0");
        }
        SetPasswordFragment setPasswordFragment = new SetPasswordFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("page_text", presetPasswordResponse);
        bundle.putInt(KnbConstants.PARAMS_SCENE, 3);
        bundle.putInt("page_style", 1);
        bundle.putSerializable("other_action", serializable);
        setPasswordFragment.setArguments(bundle);
        return setPasswordFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1b4c134153b7d87a32996479c5f1e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1b4c134153b7d87a32996479c5f1e8");
            return;
        }
        super.onAttach(activity);
        this.o = new com.meituan.android.pay.activity.c(activity);
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b372c6384da271030f709b79c5bcff89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b372c6384da271030f709b79c5bcff89");
            return;
        }
        super.onDetach();
        this.o = null;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97fb6e07a936db89e4dbbbfcd4130e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97fb6e07a936db89e4dbbbfcd4130e3");
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.g = arguments.getString("verifycode");
        this.i = arguments.getInt(KnbConstants.PARAMS_SCENE);
        this.j = (PresetPasswordResponse) com.sankuai.waimai.platform.utils.f.a(arguments, "page_text");
        this.m = arguments.getInt("type");
        this.h = arguments.getString("modifypassword");
        this.l = (a) com.sankuai.waimai.platform.utils.f.a(arguments, "set_password_scene");
        this.e = (String) com.sankuai.waimai.platform.utils.f.a(arguments, "password_set");
        this.p = arguments.getString("id_bindcard");
        this.q = arguments.getBoolean("show_navigation", false);
        if (this.l == null) {
            this.l = a.FIRST_SET;
        }
        this.r = com.sankuai.waimai.platform.utils.f.a(arguments, "other_action");
        this.s = arguments.getInt("page_style");
    }

    public static /* synthetic */ void c(SetPasswordFragment setPasswordFragment, View view) {
        Object[] objArr = {setPasswordFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "717d52c47d637626abf463958c091ee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "717d52c47d637626abf463958c091ee8");
        } else {
            setPasswordFragment.h();
        }
    }

    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4442ada4ce92a067b38c4372f47f8a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4442ada4ce92a067b38c4372f47f8a9d");
            return;
        }
        super.onViewCreated(view, bundle);
        a aVar = this.l;
        Object[] objArr2 = {aVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f829cb233763f6ab887474eacd001967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f829cb233763f6ab887474eacd001967");
        } else {
            this.l = aVar;
            switch (aVar) {
                case FIRST_SET:
                    if (this.j != null) {
                        this.c.setText(this.j.getPageTip());
                        if (!TextUtils.isEmpty(this.j.getSubPageTip())) {
                            this.d.setVisibility(0);
                            this.d.setText(this.j.getSubPageTip());
                        }
                        a_(this.j.getWarnDes());
                    }
                    String str = (String) com.sankuai.waimai.platform.utils.f.a(getArguments(), "red_page_tip");
                    if (getArguments() != null && !TextUtils.isEmpty(str)) {
                        d(str);
                    }
                    if (this.n) {
                        this.n = false;
                        break;
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a((String) null, "c_q5irye68", (Map<String, Object>) null);
                        break;
                    }
                    break;
                case FIRST_VERIFY:
                    if (this.j != null) {
                        this.c.setText(this.j.getNextPageTip());
                        if (!TextUtils.isEmpty(this.j.getNextSubPageTip())) {
                            this.d.setVisibility(0);
                            this.d.setText(this.j.getNextSubPageTip());
                        } else {
                            this.d.setVisibility(4);
                        }
                        a_(this.j.getWarnDes());
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0e628bc051a30433fe1178f3517dcc7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0e628bc051a30433fe1178f3517dcc7");
                        } else if (this.j != null && !TextUtils.isEmpty(this.j.getSubmitText()) && getView() != null) {
                            ViewStub viewStub = (ViewStub) getView().findViewById(R.id.confirm_btn);
                            viewStub.setLayoutResource(R.layout.paycommon__password_orange_btn);
                            this.k = (ProgressButton) viewStub.inflate();
                            this.k.setText(this.j.getSubmitText());
                            this.k.setEnabled(false);
                        }
                    }
                    com.meituan.android.paybase.common.analyse.a.a((String) null, "c_q5irye681", (Map<String, Object>) null);
                    break;
            }
            b();
        }
        if (this.s == 1) {
            ab.b((Activity) getActivity());
            getActivity().getWindow().setBackgroundDrawableResource(R.color.paybase__half_transparent);
            ((LinearLayout) view.findViewById(R.id.set_password_input_container)).setBackgroundResource(R.drawable.paybase__action_sheet_background);
            ((LinearLayout) view.findViewById(R.id.set_password_container)).setPadding(0, (int) (getActivity().getWindowManager().getDefaultDisplay().getWidth() * 0.32f), 0, 0);
            ((RelativeLayout) view.findViewById(R.id.set_password_navigation)).setVisibility(0);
            ((LinearLayout) view.findViewById(R.id.safe_password_container)).setGravity(0);
            if (this.q) {
                ImageView imageView = (ImageView) view.findViewById(R.id.set_password_back);
                Object[] objArr4 = {this};
                ChangeQuickRedirect changeQuickRedirect4 = h.a;
                imageView.setOnClickListener(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ce863822626849a771a1416e63255935", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ce863822626849a771a1416e63255935") : new h(this));
                imageView.setVisibility(0);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.set_password_close);
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = i.a;
            imageView2.setOnClickListener(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ca3d08f04cbdbd8e25bf4134c1d93098", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ca3d08f04cbdbd8e25bf4134c1d93098") : new i(this));
        }
        View findViewById = view.findViewById(R.id.safe_keyboard);
        if (findViewById != null) {
            FragmentActivity activity = getActivity();
            if (Build.VERSION.SDK_INT >= 18) {
                findViewById.getViewTreeObserver().addOnWindowFocusChangeListener(j.a(findViewById, activity));
            }
        }
        Object[] objArr6 = {view};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3806595f53d7e01efddccaeae8c5dc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3806595f53d7e01efddccaeae8c5dc9d");
        } else if (view != null) {
            Toolbar toolbar = (Toolbar) view.findViewById(R.id.set_password_title);
            if (this.m == 1) {
                toolbar.setVisibility(0);
                toolbar.setTitle(R.string.paycommon__password_set_password_title);
            } else if (this.s == 1) {
                toolbar.setVisibility(8);
            } else {
                toolbar.setVisibility(0);
                if (this.j != null && !TextUtils.isEmpty(this.j.getTitle())) {
                    toolbar.setTitle(this.j.getTitle());
                } else {
                    toolbar.setTitle(R.string.paycommon__password_reset_password_title);
                }
            }
            Object[] objArr7 = {this};
            ChangeQuickRedirect changeQuickRedirect7 = c.a;
            toolbar.setNavigationOnClickListener(PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "c2d7e90ca9eff35cb4adfbc4dcb8b63e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "c2d7e90ca9eff35cb4adfbc4dcb8b63e") : new c(this));
        }
    }

    public static /* synthetic */ void b(SetPasswordFragment setPasswordFragment, View view) {
        Object[] objArr = {setPasswordFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7988d811925b9791e0b2c8e6e36cb6c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7988d811925b9791e0b2c8e6e36cb6c4");
        } else {
            setPasswordFragment.getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    public static /* synthetic */ void a(SetPasswordFragment setPasswordFragment, View view) {
        Object[] objArr = {setPasswordFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "111ae70e95ea0851ebd81d19237c3f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "111ae70e95ea0851ebd81d19237c3f5f");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_6egjuhrx_mc", "", setPasswordFragment.e(), a.EnumC0329a.CLICK, -1);
        if (setPasswordFragment.getView() != null) {
            setPasswordFragment.getView().setVisibility(8);
        }
        if (setPasswordFragment.o != null) {
            setPasswordFragment.o.a(setPasswordFragment.r);
        }
    }

    public static /* synthetic */ void a(View view, Activity activity, boolean z) {
        Object[] objArr = {view, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a175997095287b6804c4d87bf949432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a175997095287b6804c4d87bf949432");
        } else if (view.isShown() && z) {
            ab.b(activity);
        } else {
            ab.a(activity);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be6fc34a0d59d1c3bd563bddf5456264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be6fc34a0d59d1c3bd563bddf5456264");
            return;
        }
        super.onResume();
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_kmwdaan8_mv", "", e(), a.EnumC0329a.VIEW, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
        if ((com.meituan.robust.PatchProxy.isSupport(r0, null, r1, true, "886cabb39c5ce463444dfa87092927ec", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r0, null, r1, true, "886cabb39c5ce463444dfa87092927ec")).booleanValue() : com.meituan.android.paycommon.lib.utils.v.a(r24, -1)) != false) goto L41;
     */
    @Override // com.meituan.android.paybase.password.AbstractPasswordKeyboardFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.setpassword.SetPasswordFragment.b(java.lang.String):void");
    }

    private void a(Activity activity, FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Fragment fragment) {
        Object[] objArr = {activity, fragmentManager, fragmentTransaction, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0626f4e10d7f9a02337245edc2a4d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0626f4e10d7f9a02337245edc2a4d3a");
        } else if (fragmentManager == null || fragmentTransaction == null || fragment == null) {
        } else {
            if (com.meituan.android.pay.desk.component.data.b.e(activity)) {
                Fragment findFragmentById = fragmentManager.findFragmentById(R.id.content);
                if (findFragmentById instanceof SetPasswordFragment) {
                    fragmentTransaction.remove(findFragmentById);
                }
                fragmentTransaction.add(R.id.content, fragment);
            } else {
                fragmentTransaction.replace(R.id.content, fragment);
            }
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    public static /* synthetic */ void a(SetPasswordFragment setPasswordFragment) {
        Object[] objArr = {setPasswordFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5174be8d5ed9717053139cde63af32a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5174be8d5ed9717053139cde63af32a4");
        } else {
            setPasswordFragment.e(setPasswordFragment.getString(R.string.paycommon__password_not_match));
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b8ccb0d5304c55676f0195be8281c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b8ccb0d5304c55676f0195be8281c9");
            return;
        }
        SetPasswordFragment a2 = a(this.g, this.i, this.j, this.m, this.h, null, this.r, this.s);
        a2.getArguments().putSerializable("set_password_scene", a.FIRST_SET);
        a2.getArguments().putSerializable("red_page_tip", str);
        if (getActivity() != null) {
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.setCustomAnimations(R.anim.paycommon_fragment_slide_left_in, R.anim.paycommon_fragment_slide_right_out);
            a(getActivity(), supportFragmentManager, beginTransaction, a2);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00db3736c7834f56d9593646b29b23c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00db3736c7834f56d9593646b29b23c8")).booleanValue();
        }
        if (isAdded() && this.j != null && this.j.getCancelAlert() != null) {
            if (this.j.getCancelAlert().isBindCardProcess()) {
                if (!TextUtils.isEmpty(this.j.getCancelAlert().getCancelTip())) {
                    BasePayDialog.b c = new PayDialog.a(getActivity()).c(this.j.getCancelAlert().getCancelTip());
                    String leftButton = this.j.getCancelAlert().getLeftButton();
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = n.a;
                    BasePayDialog.b a2 = c.a(leftButton, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7b8daf8f6e658d70b2b783dbd69f27bf", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7b8daf8f6e658d70b2b783dbd69f27bf") : new n(this));
                    String rightButton = this.j.getCancelAlert().getRightButton();
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = o.a;
                    a2.b(rightButton, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "783f04e69fb981ccd9e14a4625c3e866", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "783f04e69fb981ccd9e14a4625c3e866") : new o(this)).a(false).b(true).a(BasePayDialog.a.DIFF).a().show();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_atkfnpit_mv", "设置支付密码页_挽留弹窗展示", new a.c().a("id_bindcard", this.p).a("whichPage", Integer.valueOf(this.n ? 2 : 1)).b, a.EnumC0329a.VIEW, -1);
                    return true;
                }
            } else {
                BasePayDialog.b a3 = new PayDialog.a(getActivity()).c(this.j.getCancelAlert().getCancelTip()).a(this.j.getCancelAlert().getLeftButton(), d.a());
                String rightButton2 = this.j.getCancelAlert().getRightButton();
                Object[] objArr4 = {this};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                a3.b(rightButton2, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "50dc3ff5387498251a7a85dfb4008a8a", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "50dc3ff5387498251a7a85dfb4008a8a") : new e(this)).a(false).b(true).a(BasePayDialog.a.SAME).a().show();
                return true;
            }
        } else if (this.s == 1) {
            return true;
        }
        return super.h();
    }

    public static /* synthetic */ void c(SetPasswordFragment setPasswordFragment, Dialog dialog) {
        Object[] objArr = {setPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f510847134578352956272cd09c87b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f510847134578352956272cd09c87b1");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        if (setPasswordFragment.o != null) {
            setPasswordFragment.o.a(null);
        } else {
            setPasswordFragment.getActivity().finish();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_f9i8n43p_mc", "设置支付密码页_挽留弹窗_点击 确认放弃 ", new a.c().a("id_bindcard", setPasswordFragment.p).a("whichPage", Integer.valueOf(setPasswordFragment.n ? 2 : 1)).b, a.EnumC0329a.CLICK, -1);
    }

    public static /* synthetic */ void b(SetPasswordFragment setPasswordFragment, Dialog dialog) {
        Object[] objArr = {setPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d39e8a4a5e85a2d826b1845579c7bcce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d39e8a4a5e85a2d826b1845579c7bcce");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_5nnbween_mc", "设置支付密码页_挽留弹窗_点击 继续设置 ", new a.c().a("id_bindcard", setPasswordFragment.p).a("whichPage", Integer.valueOf(setPasswordFragment.n ? 2 : 1)).b, a.EnumC0329a.CLICK, -1);
    }

    public static /* synthetic */ void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c0df5a9a4f184ccbdd3b7169b5166fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c0df5a9a4f184ccbdd3b7169b5166fc");
        } else if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static /* synthetic */ void a(SetPasswordFragment setPasswordFragment, Dialog dialog) {
        Object[] objArr = {setPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0503d168e96c731284530f2c6a3e3e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0503d168e96c731284530f2c6a3e3e4c");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        if (setPasswordFragment.o != null) {
            setPasswordFragment.o.a(null);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_0zxksplw", (Map<String, Object>) null);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7854112e495d3325612e042866333683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7854112e495d3325612e042866333683");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2d4af216240d08a8982a71395ea9a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2d4af216240d08a8982a71395ea9a8");
        } else {
            super.onStop();
        }
    }

    @Override // com.meituan.android.pay.setpassword.b
    public final boolean a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7136e368be07706beec78b3d96bb75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7136e368be07706beec78b3d96bb75")).booleanValue();
        }
        if (!isAdded() || isRemoving()) {
            return false;
        }
        if (com.meituan.android.paycommon.lib.utils.d.a(exc)) {
            com.meituan.android.paybase.common.analyse.a.a("b_5o3b3e9j", (Map<String, Object>) null);
            d(exc.getMessage());
            Object[] objArr2 = {this, exc};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ec16a277e4e4f3e3ff3736066a63c200", RobustBitConfig.DEFAULT_VALUE) ? (SafePasswordView.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ec16a277e4e4f3e3ff3736066a63c200") : new f(this, exc));
            c();
            return true;
        }
        e(null);
        return false;
    }

    public static /* synthetic */ void a(SetPasswordFragment setPasswordFragment, Exception exc) {
        Object[] objArr = {setPasswordFragment, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96757d93e54fd4533ee44f3c4f961280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96757d93e54fd4533ee44f3c4f961280");
        } else {
            setPasswordFragment.e(exc.getMessage());
        }
    }

    @Override // com.meituan.android.pay.setpassword.b
    public final void a(PresetPasswordResponse presetPasswordResponse, Serializable serializable) {
        Object[] objArr = {presetPasswordResponse, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae6680320a83e17f79989f940b3c199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae6680320a83e17f79989f940b3c199");
        } else if (getActivity() != null) {
            getActivity().findViewById(R.id.safe_keyboard).setVisibility(4);
            if (this.k != null) {
                this.k.setEnabled(true);
                this.k.setText(presetPasswordResponse.getSubmitText());
                ProgressButton progressButton = this.k;
                Object[] objArr2 = {this, serializable};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                progressButton.setOnClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7f43f7c716aa4535a1c42a527c83d312", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7f43f7c716aa4535a1c42a527c83d312") : new g(this, serializable));
            }
            getActivity().setTitle(presetPasswordResponse.getTitle());
            this.c.setText(presetPasswordResponse.getPageTip());
            this.j = presetPasswordResponse;
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_a2koin83_mv", (Map<String, Object>) null);
        }
    }

    public static /* synthetic */ void a(SetPasswordFragment setPasswordFragment, Serializable serializable, View view) {
        Object[] objArr = {setPasswordFragment, serializable, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4863a3ba92b7076d42667778b519a17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4863a3ba92b7076d42667778b519a17d");
        } else if (setPasswordFragment.o != null) {
            setPasswordFragment.o.a(setPasswordFragment.e, setPasswordFragment, true, setPasswordFragment.i, serializable);
        }
    }
}
