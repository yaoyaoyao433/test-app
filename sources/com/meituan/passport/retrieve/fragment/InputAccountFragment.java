package com.meituan.passport.retrieve.fragment;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.converter.m;
import com.meituan.passport.dialogs.ConfirmDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.Ticket;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.InputMobileView;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class InputAccountFragment extends BasePassportFragment implements InputMobileView.c {
    public static ChangeQuickRedirect h;
    private InputMobileView i;
    private String j;
    private String k;
    private TextButton l;
    private InputMobileView.CountryInfoBroadcastReceiver m;
    private m<Ticket> n;
    private InputMobileView.b o;
    private InputMobileView.a p;

    @Override // com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_input_account;
    }

    public InputAccountFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee9f9b5c24e6cb5430508b153a3a0573", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee9f9b5c24e6cb5430508b153a3a0573");
            return;
        }
        this.n = new m<Ticket>() { // from class: com.meituan.passport.retrieve.fragment.InputAccountFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(Ticket ticket) {
                Ticket ticket2 = ticket;
                Object[] objArr2 = {ticket2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ac0ed9badbcbaedf2e8680fb22e83a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ac0ed9badbcbaedf2e8680fb22e83a7");
                } else if (!InputAccountFragment.this.isVisible() || ticket2 == null) {
                } else {
                    b.a aVar = new b.a();
                    aVar.b = InputAccountFragment.this.k;
                    aVar.c = InputAccountFragment.this.j;
                    aVar.d = ticket2.ticket;
                    com.sankuai.meituan.navigation.d.a(InputAccountFragment.this.getView()).a(com.meituan.passport.retrieve.a.CheckSecurity.e, aVar.a());
                }
            }
        };
        this.o = new InputMobileView.b() { // from class: com.meituan.passport.retrieve.fragment.InputAccountFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18cb43cbb6788112dfb9aea31b067b9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18cb43cbb6788112dfb9aea31b067b9d");
                    return;
                }
                if (InputAccountFragment.this.getContext() != null && InputAccountFragment.this.m == null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    InputAccountFragment.this.m = new InputMobileView.CountryInfoBroadcastReceiver(InputAccountFragment.this.getContext(), InputAccountFragment.this.p);
                    LocalBroadcastManager.getInstance(InputAccountFragment.this.getContext()).registerReceiver(InputAccountFragment.this.m, intentFilter);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("from", InputAccountFragment.this.getClass().getName());
                hashMap.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(InputAccountFragment.this.getContext(), InputAccountFragment.this.getString(R.string.passport_choose_country_code_url), hashMap);
            }
        };
        this.p = new InputMobileView.a() { // from class: com.meituan.passport.retrieve.fragment.InputAccountFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e92bbbe343f656b7efbb0fb78a9acaa0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e92bbbe343f656b7efbb0fb78a9acaa0");
                } else if (InputAccountFragment.this.i != null) {
                    InputAccountFragment.this.i.a(str);
                }
            }
        };
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1bdc73fb215d7da9a0db3d134e6568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1bdc73fb215d7da9a0db3d134e6568");
        } else if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.k = cVar.b();
            this.j = cVar.a();
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deef071d7202e4e02712f42333e1d86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deef071d7202e4e02712f42333e1d86a");
            return;
        }
        aj.b(this, "b_u1haucrr", "c_sgffsxqd");
        aj.b(this, "b_group_yuy5ai48_mv", "c_sgffsxqd");
        this.i = (InputMobileView) view.findViewById(R.id.input_account);
        this.i.setDataSource(this);
        this.i.setChooseCountryListener(this.o);
        this.i.requestFocus();
        this.l = (TextButton) view.findViewById(R.id.cannot_accept_phone);
        this.l.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.retrieve.fragment.InputAccountFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be4bd51e868dda7988f3d79c7a7e0da1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be4bd51e868dda7988f3d79c7a7e0da1");
                    return;
                }
                aj.a(this, "b_group_yuy5ai48_mc", "c_sgffsxqd");
                StorageUtil.putSharedValue(InputAccountFragment.this.getActivity(), "Channel.Account.Mobile", InputAccountFragment.this.i.getParam().number, 0);
                StorageUtil.putSharedValue(InputAccountFragment.this.getActivity(), "Channel.Account.CountryCode", InputAccountFragment.this.i.getParam().countryCode, 0);
                StorageUtil.putSharedValue(InputAccountFragment.this.getActivity(), "Channel.Account.JoinKey", PassportConfig.m(), 0);
                Utils.a(InputAccountFragment.this.getContext(), "https://passport.meituan.com/useraccount/nomessage", Collections.emptyMap());
                if (InputAccountFragment.this.getActivity().isFinishing()) {
                    return;
                }
                InputAccountFragment.this.getActivity().finish();
            }
        });
        if (!PassportUIConfig.z()) {
            this.l.setVisibility(8);
        }
        PassportButton passportButton = (PassportButton) view.findViewById(R.id.next_step);
        passportButton.setClickAction(b.a(this));
        passportButton.a(this.i);
    }

    public static /* synthetic */ void a(InputAccountFragment inputAccountFragment, View view) {
        w wVar;
        Object[] objArr = {inputAccountFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fced9705a016502c5eff6ad8daf46cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fced9705a016502c5eff6ad8daf46cba");
            return;
        }
        Utils.a(inputAccountFragment);
        InputMobileView inputMobileView = inputAccountFragment.i;
        Object[] objArr2 = {inputMobileView};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, inputAccountFragment, changeQuickRedirect2, false, "1df8842996bd5188816366d025c8449b", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, inputAccountFragment, changeQuickRedirect2, false, "1df8842996bd5188816366d025c8449b");
        } else {
            w a = com.meituan.passport.c.a().a(ai.TYPE_CHECK_USER_NAME);
            a.a(inputAccountFragment);
            a.a(inputAccountFragment.n);
            a.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.retrieve.fragment.InputAccountFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.converter.b
                public final boolean a(ApiException apiException, boolean z) {
                    Object[] objArr3 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "403bb27b34f35770d1a1463046d47af9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "403bb27b34f35770d1a1463046d47af9")).booleanValue();
                    }
                    if (apiException != null && apiException.code == 101248) {
                        ConfirmDialog.a a2 = ConfirmDialog.a.a();
                        a2.l = R.layout.passport_fragment_privacy_agreement_dialog;
                        a2.k = 3;
                        a2.c = apiException.getMessage();
                        a2.g = Utils.e(InputAccountFragment.this.getContext(), R.string.passport_unlock_404_click);
                        ConfirmDialog b = a2.b();
                        if (b != null && InputAccountFragment.this.getActivity() != null) {
                            b.show(InputAccountFragment.this.getActivity().getSupportFragmentManager(), "changePasswordDialog");
                            return false;
                        }
                    }
                    return true;
                }
            });
            MobileParams mobileParams = new MobileParams();
            mobileParams.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) inputMobileView);
            mobileParams.b("token", com.meituan.passport.clickaction.d.a(UserCenter.getInstance(com.meituan.android.singleton.b.a()).getToken()));
            a.a((w) mobileParams);
            wVar = a;
        }
        wVar.b();
        aj.a(inputAccountFragment, "b_enkj7vlk", "c_sgffsxqd");
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23bde3b4f71fdb7214dfdd94010bb7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23bde3b4f71fdb7214dfdd94010bb7b7");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f295dc59f057a01f05d4d5724b2ae08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f295dc59f057a01f05d4d5724b2ae08");
            return;
        }
        super.onDestroy();
        if (getContext() == null || this.m == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.m);
        this.m = null;
    }

    @Override // com.meituan.passport.view.InputMobileView.c
    public final Mobile a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6afa22a58eec7df9a2c438d86be057", RobustBitConfig.DEFAULT_VALUE) ? (Mobile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6afa22a58eec7df9a2c438d86be057") : new Mobile(this.k, this.j);
    }

    @Override // com.meituan.passport.view.InputMobileView.c
    public final void a(Mobile mobile) {
        this.k = mobile.number;
        this.j = mobile.countryCode;
    }
}
