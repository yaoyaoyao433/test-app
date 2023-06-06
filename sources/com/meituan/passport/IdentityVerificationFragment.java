package com.meituan.passport;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.bindphone.BindPhoneActivity;
import com.meituan.passport.dialogs.SimpleTipsWithContinueButton;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.UserBaseInfo;
import com.meituan.passport.service.at;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IdentityVerificationFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public final rx.subjects.b<User> c;
    public com.meituan.passport.converter.m d;
    private String e;
    private String f;
    private String g;
    private TextView h;
    private View i;
    private View j;
    private String k;
    private String l;
    private String m;
    private int n;
    private String o;
    private View.OnClickListener p;

    public IdentityVerificationFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d1905b7aa241f917e5cd8e13a1439f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d1905b7aa241f917e5cd8e13a1439f");
            return;
        }
        this.c = rx.subjects.b.g();
        this.p = new View.OnClickListener() { // from class: com.meituan.passport.IdentityVerificationFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e65b53f2fcca9941531f3d8563aacdc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e65b53f2fcca9941531f3d8563aacdc");
                    return;
                }
                int id = view.getId();
                if (id == R.id.identify_verify_confirm) {
                    IdentityVerificationFragment.d(IdentityVerificationFragment.this);
                } else if (id == R.id.identify_verify_not_confirm) {
                    IdentityVerificationFragment.e(IdentityVerificationFragment.this);
                }
            }
        };
    }

    public static /* synthetic */ void a(IdentityVerificationFragment identityVerificationFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, identityVerificationFragment, changeQuickRedirect, false, "ae689547b3cd53d0d9ec994294250443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, identityVerificationFragment, changeQuickRedirect, false, "ae689547b3cd53d0d9ec994294250443");
            return;
        }
        com.meituan.passport.service.w a2 = c.a().a(com.meituan.passport.service.ai.TYPE_IDENTIFY_VERIFICATION);
        a2.a((com.meituan.passport.service.w) new com.meituan.passport.pojo.request.g(com.meituan.passport.clickaction.d.a(str)));
        a2.a(identityVerificationFragment);
        a2.a(new com.meituan.passport.converter.m<User>() { // from class: com.meituan.passport.IdentityVerificationFragment.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(User user) {
                User user2 = user;
                Object[] objArr2 = {user2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20522a55e3d946ad674719d235e799f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20522a55e3d946ad674719d235e799f4");
                    return;
                }
                com.meituan.passport.utils.p.a().a(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, 2, IdentityVerificationFragment.this.o);
                com.meituan.passport.exception.skyeyemonitor.module.m mVar = (com.meituan.passport.exception.skyeyemonitor.module.m) com.meituan.passport.exception.skyeyemonitor.a.a().a("identify_verification");
                Object[] objArr3 = {null};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.skyeyemonitor.module.m.a;
                if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "c6249456580d5c0fe57e31a9907d80b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "c6249456580d5c0fe57e31a9907d80b8");
                } else {
                    com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "identify_verification", "identify_verification_success", null);
                }
                if (IdentityVerificationFragment.this.d instanceof com.meituan.passport.successcallback.f) {
                    ((com.meituan.passport.successcallback.f) IdentityVerificationFragment.this.d).b(false);
                    ((com.meituan.passport.successcallback.f) IdentityVerificationFragment.this.d).c(false);
                }
                IdentityVerificationFragment.this.c.onNext(user2);
                IdentityVerificationFragment.h(IdentityVerificationFragment.this);
            }
        });
        a2.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.IdentityVerificationFragment.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63040087a19539a73e5cc1f726cde83e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63040087a19539a73e5cc1f726cde83e")).booleanValue();
                }
                com.meituan.passport.utils.p.a().a(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, apiException != null ? apiException.code : -999, IdentityVerificationFragment.this.o);
                com.meituan.passport.exception.skyeyemonitor.module.m mVar = (com.meituan.passport.exception.skyeyemonitor.module.m) com.meituan.passport.exception.skyeyemonitor.a.a().a("identify_verification");
                Object[] objArr3 = {apiException};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.skyeyemonitor.module.m.a;
                if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "51af0c1f75665776c190c4c2df84ecbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "51af0c1f75665776c190c4c2df84ecbe");
                } else if (apiException != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", Integer.valueOf(apiException.code));
                    hashMap.put("message", apiException.getMessage());
                    hashMap.put("type", apiException.type);
                    if (apiException.code == 101202 || apiException.code == 101203 || apiException.code == 101211) {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "identify_verification", "identify_verification_moneycheck", "二次放号资产校验", hashMap);
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "identify_verification", "identify_verification_failed", "二次放号失败", hashMap);
                    }
                }
                if ((TextUtils.equals(IdentityVerificationFragment.this.k, "china_mobile") || TextUtils.equals(IdentityVerificationFragment.this.k, "china_tele") || TextUtils.equals(IdentityVerificationFragment.this.k, "china_unicom")) && apiException != null) {
                    apiException.setExtraMessage("operator_login_identify");
                }
                IdentityVerificationFragment.this.c.onError(apiException);
                IdentityVerificationFragment.h(IdentityVerificationFragment.this);
                return true;
            }
        });
        a2.b();
    }

    public static /* synthetic */ void d(IdentityVerificationFragment identityVerificationFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, identityVerificationFragment, changeQuickRedirect, false, "2dc145dae8268398915693e365a660e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, identityVerificationFragment, changeQuickRedirect, false, "2dc145dae8268398915693e365a660e2");
            return;
        }
        com.meituan.passport.service.w a2 = c.a().a(com.meituan.passport.service.ai.TYPE_IDENTIFY_VERIFICATION_SERVICE);
        com.meituan.passport.pojo.request.e eVar = new com.meituan.passport.pojo.request.e();
        eVar.i = com.meituan.passport.clickaction.d.a(identityVerificationFragment.g);
        eVar.c = com.meituan.passport.clickaction.d.a(identityVerificationFragment.e);
        eVar.b = com.meituan.passport.clickaction.d.a(identityVerificationFragment.f);
        eVar.j = com.meituan.passport.clickaction.d.a(identityVerificationFragment.k);
        eVar.k = com.meituan.passport.clickaction.d.a(identityVerificationFragment.l);
        eVar.l = com.meituan.passport.clickaction.d.a(identityVerificationFragment.m);
        eVar.m = com.meituan.passport.clickaction.d.a(identityVerificationFragment.o);
        a2.a((com.meituan.passport.service.w) eVar);
        a2.a(identityVerificationFragment);
        a2.a(new a(identityVerificationFragment));
        a2.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.IdentityVerificationFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb1f8244c967d7e239fe980949d1fde", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb1f8244c967d7e239fe980949d1fde")).booleanValue();
                }
                com.meituan.passport.utils.p.a().a(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, apiException != null ? apiException.code : -999, IdentityVerificationFragment.this.o);
                if (apiException != null && apiException.code != 101157) {
                    com.meituan.passport.utils.p.a().c(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, IdentityVerificationFragment.this.o, apiException.code);
                }
                IdentityVerificationFragment.h(IdentityVerificationFragment.this);
                return true;
            }
        });
        a2.b();
        com.meituan.passport.utils.p.a().a("是", identityVerificationFragment.k);
    }

    public static /* synthetic */ void e(IdentityVerificationFragment identityVerificationFragment) {
        SimpleTipsWithContinueButton a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, identityVerificationFragment, changeQuickRedirect, false, "40f729534ea6ea3d05866dcb8be306c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, identityVerificationFragment, changeQuickRedirect, false, "40f729534ea6ea3d05866dcb8be306c9");
            return;
        }
        com.meituan.passport.utils.p.a().a("否", identityVerificationFragment.k);
        com.meituan.passport.utils.aj.b(identityVerificationFragment, "b_group_f98ms6h0_mv", "c_group_clin2kzw");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SimpleTipsWithContinueButton.a.a;
        SimpleTipsWithContinueButton.a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "003e990a2214d26eac52927870f15d3c", RobustBitConfig.DEFAULT_VALUE) ? (SimpleTipsWithContinueButton.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "003e990a2214d26eac52927870f15d3c") : new SimpleTipsWithContinueButton.a();
        aVar.e = new DialogInterface.OnClickListener() { // from class: com.meituan.passport.IdentityVerificationFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3255123fde3153e696df655760ce4dbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3255123fde3153e696df655760ce4dbd");
                    return;
                }
                IdentityVerificationFragment.a(IdentityVerificationFragment.this, IdentityVerificationFragment.this.g);
                com.meituan.passport.utils.aj.a(IdentityVerificationFragment.this, "b_group_8v99ft8a_mc", "c_group_clin2kzw");
            }
        };
        aVar.c = identityVerificationFragment.getString(R.string.passport_confirm);
        aVar.b = identityVerificationFragment.getString(R.string.passport_identify_confirm_signup_tips_new);
        aVar.f = new DialogInterface.OnClickListener() { // from class: com.meituan.passport.IdentityVerificationFragment.5
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b62f0e006a2783e182f87d5ff05b155", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b62f0e006a2783e182f87d5ff05b155");
                } else {
                    com.meituan.passport.utils.aj.a(IdentityVerificationFragment.this, "b_group_ht4apeds_mc", "c_group_clin2kzw");
                }
            }
        };
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = SimpleTipsWithContinueButton.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3c44e5fb09f15720cfa0b202a1b93724", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (SimpleTipsWithContinueButton) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3c44e5fb09f15720cfa0b202a1b93724");
        } else {
            a2 = SimpleTipsWithContinueButton.a();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(aVar.b)) {
                bundle.putString("message", aVar.b);
            }
            if (!TextUtils.isEmpty(aVar.c)) {
                bundle.putString("continueButtonText", aVar.c);
            }
            if (!TextUtils.isEmpty(aVar.d)) {
                bundle.putString("cancelButtonText", aVar.d);
            }
            a2.setArguments(bundle);
            a2.c = aVar.e;
            a2.d = aVar.f;
        }
        a2.show(identityVerificationFragment.getFragmentManager(), "tips");
    }

    public static /* synthetic */ void h(IdentityVerificationFragment identityVerificationFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, identityVerificationFragment, changeQuickRedirect, false, "8e119df16a06e70747c8a3a99213d7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, identityVerificationFragment, changeQuickRedirect, false, "8e119df16a06e70747c8a3a99213d7da");
        } else if (identityVerificationFragment.getActivity() == null || (identityVerificationFragment.getActivity() instanceof m) || (identityVerificationFragment.getActivity() instanceof BindPhoneActivity)) {
        } else {
            identityVerificationFragment.getActivity().getSupportFragmentManager().beginTransaction().remove(identityVerificationFragment).commitAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9ffd33f76441c0f86b16cdd5e3db18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9ffd33f76441c0f86b16cdd5e3db18");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.PassportBase);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab0a3db06b3821b045896023068ae1da", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab0a3db06b3821b045896023068ae1da");
        }
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_identify_verify, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.yoda_fragment_toolbar);
        Object[] objArr2 = {toolbar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15c82810f035fd4b06daf3b84d21edf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15c82810f035fd4b06daf3b84d21edf2");
        } else {
            toolbar.setTitle("");
            a.C0512a a2 = com.meituan.passport.utils.a.a(getActivity());
            toolbar.setBackground(a2.a);
            toolbar.getLayoutParams().height = a2.c;
            TextView textView = (TextView) toolbar.findViewById(R.id.yoda_fragment_toolbar_title);
            textView.setTextColor(a2.d);
            textView.setTextSize(0, a2.e);
            textView.setText(R.string.passport_title_identify_confirm);
            ImageButton imageButton = (ImageButton) toolbar.findViewById(R.id.yoda_fragment_toolbar_icon);
            imageButton.getLayoutParams().height = a2.c;
            imageButton.getLayoutParams().width = a2.c;
            imageButton.setImageDrawable(a2.b);
            imageButton.setOnClickListener(p.a(this));
        }
        return inflate;
    }

    public static /* synthetic */ void a(IdentityVerificationFragment identityVerificationFragment, View view) {
        Object[] objArr = {identityVerificationFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e8137177fb850c1b1af466275a50893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e8137177fb850c1b1af466275a50893");
            return;
        }
        identityVerificationFragment.c.onError(null);
        identityVerificationFragment.dismissAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f1d13cfe3310ca760d753c6d91278a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f1d13cfe3310ca760d753c6d91278a");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b = (ImageView) view.findViewById(R.id.identify_verify_image);
        this.h = (TextView) view.findViewById(R.id.identify_verify_name);
        TextView textView = (TextView) view.findViewById(R.id.identify_verify_mobile);
        this.j = view.findViewById(R.id.identify_verify_page_failed);
        this.i = view.findViewById(R.id.identify_verify_page_normal);
        ((Button) view.findViewById(R.id.identify_verify_confirm)).setOnClickListener(this.p);
        ((Button) view.findViewById(R.id.identify_verify_not_confirm)).setOnClickListener(this.p);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString("mobile", "");
            this.g = arguments.getString("ticket", "");
            this.f = arguments.getString(Constant.KEY_COUNTRY_CODE, "86");
            this.k = arguments.getString(DataConstants.LOGIN_TYPE, UserCenter.OAUTH_TYPE_ACCOUNT);
            this.l = arguments.getString("accessToken", "");
            this.m = arguments.getString("appidParam", "");
            this.n = arguments.getInt("code", AccountApi.user_err_not_login_found);
            this.o = arguments.getString("action", "-999");
        }
        com.meituan.passport.utils.p.a().a(getActivity(), this.k, this.n, this.o);
        textView.setText(R.string.passport_identify_confirm_text_new);
        at atVar = new at();
        atVar.a((at) new com.meituan.passport.pojo.request.g(com.meituan.passport.clickaction.d.a(this.g)));
        atVar.a(this);
        atVar.a(new com.meituan.passport.converter.m<UserBaseInfo>() { // from class: com.meituan.passport.IdentityVerificationFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(UserBaseInfo userBaseInfo) {
                UserBaseInfo userBaseInfo2 = userBaseInfo;
                Object[] objArr2 = {userBaseInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0d0a066c284ea5a65b826749a972280", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0d0a066c284ea5a65b826749a972280");
                } else if (!IdentityVerificationFragment.this.isAdded() || userBaseInfo2 == null) {
                } else {
                    IdentityVerificationFragment.this.i.setVisibility(0);
                    IdentityVerificationFragment.this.j.setVisibility(8);
                    IdentityVerificationFragment.this.h.setText(userBaseInfo2.nickname);
                    if (TextUtils.isEmpty(userBaseInfo2.avatar)) {
                        return;
                    }
                    com.meituan.passport.plugins.q.a().f().a(userBaseInfo2.avatar, (com.meituan.passport.plugins.u) new b());
                }
            }
        });
        atVar.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.IdentityVerificationFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81389eba3a03c036109ad681ebb69178", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81389eba3a03c036109ad681ebb69178")).booleanValue();
                }
                if (IdentityVerificationFragment.this.isAdded()) {
                    IdentityVerificationFragment.this.j.setVisibility(0);
                    IdentityVerificationFragment.this.i.setVisibility(8);
                }
                return true;
            }
        });
        atVar.b();
        view.findViewById(R.id.identify_verify_reload).setOnClickListener(atVar);
        this.j.setVisibility(8);
        this.i.setVisibility(8);
        com.meituan.passport.utils.aj.a(this, "c_group_clin2kzw", (Map<String, Object>) null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b extends com.meituan.passport.plugins.u {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {IdentityVerificationFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d18bae76be8769700f95ca0124b2766", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d18bae76be8769700f95ca0124b2766");
            }
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40169ecc8b8b011292e75ef267194668", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40169ecc8b8b011292e75ef267194668");
            } else {
                IdentityVerificationFragment.this.b.setImageResource(R.drawable.passport_account_avatar_default);
            }
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ef2f81707168070a79fc4c56947317", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ef2f81707168070a79fc4c56947317");
            } else {
                IdentityVerificationFragment.this.b.setImageBitmap(Utils.a(bitmap, bitmap.getWidth(), 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends com.meituan.passport.successcallback.f<User> {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.passport.successcallback.f
        public final /* bridge */ /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        }

        @Override // com.meituan.passport.successcallback.f
        public final /* synthetic */ void a(User user, Fragment fragment) {
            User user2 = user;
            Object[] objArr = {user2, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687300bf603035f2704708dcafae1591", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687300bf603035f2704708dcafae1591");
                return;
            }
            if (this.h) {
                com.meituan.passport.utils.p.a().a(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, 1, IdentityVerificationFragment.this.o);
            }
            if (this.f) {
                com.meituan.passport.utils.p.a().c(IdentityVerificationFragment.this.getActivity(), IdentityVerificationFragment.this.k, IdentityVerificationFragment.this.o, 1);
            }
            if (IdentityVerificationFragment.this.d instanceof com.meituan.passport.successcallback.f) {
                ((com.meituan.passport.successcallback.f) IdentityVerificationFragment.this.d).b(false);
            }
            if (IdentityVerificationFragment.this.getActivity() instanceof m) {
                if (IdentityVerificationFragment.this.d != null) {
                    IdentityVerificationFragment.this.d.a(user2);
                } else {
                    com.meituan.passport.utils.q.a(user2, IdentityVerificationFragment.this.getActivity(), 200, true);
                }
                com.meituan.passport.utils.q.a(IdentityVerificationFragment.this.getActivity());
            } else if (IdentityVerificationFragment.this.getActivity() != null) {
                if (IdentityVerificationFragment.this.d instanceof com.meituan.passport.successcallback.f) {
                    ((com.meituan.passport.successcallback.f) IdentityVerificationFragment.this.d).c(false);
                }
                if (IdentityVerificationFragment.this.d != null) {
                    IdentityVerificationFragment.this.d.a(user2);
                } else {
                    com.meituan.passport.utils.q.a(user2, IdentityVerificationFragment.this.getActivity(), 200, false);
                }
                IdentityVerificationFragment.h(IdentityVerificationFragment.this);
            }
        }

        public a(Fragment fragment) {
            super(fragment);
            Object[] objArr = {IdentityVerificationFragment.this, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9266c035a9232ececcb6f38badf21ec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9266c035a9232ececcb6f38badf21ec");
            }
        }
    }
}
