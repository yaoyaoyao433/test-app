package com.meituan.passport;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.d;
import com.meituan.passport.view.InputMobileView;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DynamicLoginFragment extends Fragment implements com.meituan.passport.converter.m<SmsResult>, d.a {
    public static ChangeQuickRedirect a;
    a b;
    public PassportEditText c;
    private InputMobileView d;
    private PassportButton e;
    private PassportButton f;
    private boolean g;
    private com.meituan.passport.service.w<com.meituan.passport.pojo.request.j, SmsResult> h;
    private com.meituan.passport.service.w<com.meituan.passport.pojo.request.d, User> i;
    private com.meituan.passport.pojo.request.j j;
    private com.meituan.passport.pojo.request.d k;
    private b l;
    private com.meituan.passport.utils.d m;
    private boolean n;
    private boolean o;
    private InputMobileView.CountryInfoBroadcastReceiver p;
    private Mobile q;
    private com.meituan.passport.module.b r;
    private com.meituan.passport.module.b s;
    private com.meituan.passport.module.b t;
    private InputMobileView.c u;
    private InputMobileView.b v;
    private InputMobileView.a w;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(User user);

        void a(boolean z);
    }

    public DynamicLoginFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d46f1dd1f06044dff5f48e2386dba0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d46f1dd1f06044dff5f48e2386dba0a");
            return;
        }
        this.n = false;
        this.o = false;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        this.s = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7c8697d9a63bc51f647ff97e47389eeb", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.module.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7c8697d9a63bc51f647ff97e47389eeb") : new e(this);
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        this.t = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cdddfa173613b1c1616472732b2744e5", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.module.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cdddfa173613b1c1616472732b2744e5") : new f(this);
        this.u = new InputMobileView.c() { // from class: com.meituan.passport.DynamicLoginFragment.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.c
            public final void a(Mobile mobile) {
            }

            @Override // com.meituan.passport.view.InputMobileView.c
            public final Mobile a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f62657c4daae1ef6a6b6987a6dca0006", RobustBitConfig.DEFAULT_VALUE) ? (Mobile) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f62657c4daae1ef6a6b6987a6dca0006") : DynamicLoginFragment.this.q;
            }
        };
        this.v = new InputMobileView.b() { // from class: com.meituan.passport.DynamicLoginFragment.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.b
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fdd5f0beafc1def332c50cdacfa1958", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fdd5f0beafc1def332c50cdacfa1958");
                    return;
                }
                if (DynamicLoginFragment.this.getContext() != null && DynamicLoginFragment.this.p == null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    DynamicLoginFragment.this.p = new InputMobileView.CountryInfoBroadcastReceiver(DynamicLoginFragment.this.getContext(), DynamicLoginFragment.this.w);
                    LocalBroadcastManager.getInstance(DynamicLoginFragment.this.getContext()).registerReceiver(DynamicLoginFragment.this.p, intentFilter);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("from", DynamicLoginFragment.this.getClass().getName());
                hashMap.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(DynamicLoginFragment.this.getContext(), DynamicLoginFragment.this.getString(R.string.passport_choose_country_code_url), hashMap);
            }
        };
        this.w = new InputMobileView.a() { // from class: com.meituan.passport.DynamicLoginFragment.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.a
            public final void a(String str) {
                Object[] objArr4 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "851973228307040c26ee683a3bf5d08b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "851973228307040c26ee683a3bf5d08b");
                } else if (DynamicLoginFragment.this.d != null) {
                    DynamicLoginFragment.this.d.a(str);
                }
            }
        };
    }

    @Override // com.meituan.passport.converter.m
    public final /* synthetic */ void a(SmsResult smsResult) {
        SmsResult smsResult2 = smsResult;
        Object[] objArr = {smsResult2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210707c00a23cb8208e195203643c32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210707c00a23cb8208e195203643c32d");
            return;
        }
        this.k.b(smsResult2);
        this.k.a("needIdentifyConfirm", com.meituan.passport.clickaction.d.a("true"));
        this.l.c = smsResult2.action;
        this.m.b("dlf");
        com.meituan.passport.utils.p.a().a((Activity) getActivity(), UserCenter.OAUTH_TYPE_DYNAMIC, smsResult2.action == 3 ? "signup" : "login");
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bebd497bf40f1aeea4023f4dc27d78fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bebd497bf40f1aeea4023f4dc27d78fb");
        } else if (isAdded()) {
            if (i == 61) {
                this.e.setText(getString(R.string.passport_message_send));
                Utils.a(this.c, getString(R.string.passport_code_tip), 15);
                this.c.setFocusableInTouchMode(true);
                this.c.setFocusable(true);
                this.c.requestFocus();
            } else {
                this.e.setText(getString(R.string.passport_retry_delay_certain_seconds, Integer.valueOf(i)));
            }
            this.r.a(false);
        }
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6be6948a90efca8a85bf945276e4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6be6948a90efca8a85bf945276e4e3");
            return;
        }
        this.r.a(true);
        this.e.setText(R.string.passport_retrieve_verify_code);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fecb2aa2e3e5f85cf65983b6506a09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fecb2aa2e3e5f85cf65983b6506a09b");
            return;
        }
        super.onCreate(bundle);
        if (getParentFragment() == null) {
            setRetainInstance(true);
        }
        this.g = (getArguments() != null && getArguments().containsKey("start") && getArguments().getBoolean("start")) ? false : false;
        this.j = new com.meituan.passport.pojo.request.j();
        this.k = new com.meituan.passport.pojo.request.d();
        this.h = c.a().a(com.meituan.passport.service.ai.TYPE_SEND_SMS_CODE);
        this.h.a((com.meituan.passport.service.w<com.meituan.passport.pojo.request.j, SmsResult>) this.j);
        this.h.a((Fragment) this);
        this.h.a((com.meituan.passport.converter.m<SmsResult>) this);
        this.h.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.DynamicLoginFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z2) {
                Object[] objArr2 = {apiException, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b200e0b80e24111fbf166ce2efbc5d6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b200e0b80e24111fbf166ce2efbc5d6")).booleanValue();
                }
                if (apiException != null && apiException.code != 101190) {
                    com.meituan.passport.utils.ai.a().a(DynamicLoginFragment.this, DynamicLoginFragment.this.j.k, apiException.code);
                }
                if (apiException != null && apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                    ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a(apiException);
                }
                com.meituan.passport.utils.p.a().a((Activity) DynamicLoginFragment.this.getActivity(), UserCenter.OAUTH_TYPE_DYNAMIC, DynamicLoginFragment.this.j.k == 3 ? "signup" : "login");
                return true;
            }
        });
        this.i = c.a().a(com.meituan.passport.service.ai.TYPE_DYNAMIC_LOGIN);
        if (this.k != null) {
            this.l = new b(this, this.k.k);
            this.i.a((com.meituan.passport.service.w<com.meituan.passport.pojo.request.d, User>) this.k);
            this.i.a((Fragment) this);
            this.i.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.DynamicLoginFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.converter.b
                public final boolean a(ApiException apiException, boolean z2) {
                    Object[] objArr2 = {apiException, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0dbce803f762e11dde99db3bacafcde", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0dbce803f762e11dde99db3bacafcde")).booleanValue();
                    }
                    if (apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code)) && !z2) {
                        ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a(apiException);
                        com.meituan.passport.utils.p.a().a(DynamicLoginFragment.this.getActivity(), apiException.code, UserCenter.OAUTH_TYPE_DYNAMIC, DynamicLoginFragment.this.j.e());
                    }
                    return true;
                }
            });
        }
        if (this.i instanceof com.meituan.passport.service.v) {
            ((com.meituan.passport.service.v) this.i).b = "fast_login";
        }
        this.i.a(this.l);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4906303925ead576761b7d78d9771366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4906303925ead576761b7d78d9771366");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f8472b8399cbef5c42976aca78907e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f8472b8399cbef5c42976aca78907e");
            return;
        }
        super.onDestroy();
        if (this.p == null || getContext() == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.p);
        this.p = null;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec9ab8cca701ecdad2199caf8b5d305", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec9ab8cca701ecdad2199caf8b5d305") : layoutInflater.inflate(R.layout.passport_fragment_login_dynamic, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0260  */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.DynamicLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static /* synthetic */ boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "425ba4c8e62fab80e6c081fc0b935b68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "425ba4c8e62fab80e6c081fc0b935b68")).booleanValue();
        }
        String obj = editable.toString();
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = Utils.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32fce6deff1bb4b2ad1e68d779ab90cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32fce6deff1bb4b2ad1e68d779ab90cb")).booleanValue();
        }
        Object[] objArr3 = {obj, 6};
        ChangeQuickRedirect changeQuickRedirect3 = Utils.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a8f19fae352a5ff069e598640aed3ce9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a8f19fae352a5ff069e598640aed3ce9")).booleanValue();
        }
        if (TextUtils.isEmpty(obj) || obj.length() != 6) {
            return false;
        }
        return Pattern.compile("(\\d{6})").matcher(obj).find();
    }

    public static /* synthetic */ Mobile a(DynamicLoginFragment dynamicLoginFragment) {
        Object[] objArr = {dynamicLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aee1ef9becf956c44e7bc5b7c9e6c5b6", RobustBitConfig.DEFAULT_VALUE) ? (Mobile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aee1ef9becf956c44e7bc5b7c9e6c5b6") : dynamicLoginFragment.d.getParam();
    }

    public static /* synthetic */ void a(DynamicLoginFragment dynamicLoginFragment, PassportEditText passportEditText, View view) {
        Object[] objArr = {dynamicLoginFragment, passportEditText, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9344cce6b44128258a4b6ac51ed98faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9344cce6b44128258a4b6ac51ed98faa");
            return;
        }
        HashMap hashMap = new HashMap();
        if (dynamicLoginFragment.getActivity() != null) {
            hashMap.put("pagekey", dynamicLoginFragment.getActivity().getClass().getName());
        }
        com.meituan.passport.utils.aj.a(dynamicLoginFragment, "b_group_lw0u8n4k_mc", "c_0ov25mx3", hashMap);
        dynamicLoginFragment.m = new com.meituan.passport.utils.d(passportEditText.getText().toString(), dynamicLoginFragment);
        dynamicLoginFragment.m.b = 61;
        dynamicLoginFragment.j.i = com.meituan.passport.clickaction.d.a("");
    }

    public static /* synthetic */ void b(DynamicLoginFragment dynamicLoginFragment, boolean z) {
        Object[] objArr = {dynamicLoginFragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5955ed889d69053393d4588fd06ecb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5955ed889d69053393d4588fd06ecb7");
            return;
        }
        dynamicLoginFragment.o = z;
        dynamicLoginFragment.b();
    }

    public static /* synthetic */ void a(DynamicLoginFragment dynamicLoginFragment, boolean z) {
        Object[] objArr = {dynamicLoginFragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b22fb9d28ca388c0770b749a6f9850c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b22fb9d28ca388c0770b749a6f9850c5");
            return;
        }
        dynamicLoginFragment.n = z;
        dynamicLoginFragment.b();
    }

    private void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17f14f499f728c989ea198d145df0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17f14f499f728c989ea198d145df0ed");
        } else if (this.b != null) {
            a aVar = this.b;
            if (this.o && this.n) {
                z = true;
            }
            aVar.a(z);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75f96c313f158665a3ccc23af20907b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75f96c313f158665a3ccc23af20907b4");
            return;
        }
        super.onDestroyView();
        this.b = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb0fddb7ff81e623300a95f92ed8c7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb0fddb7ff81e623300a95f92ed8c7f");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends com.meituan.passport.successcallback.c {
        public static ChangeQuickRedirect a;

        public b(DynamicLoginFragment dynamicLoginFragment, int i) {
            super(dynamicLoginFragment);
            Object[] objArr = {dynamicLoginFragment, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16c95179454ff17094d02f5a594e8bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16c95179454ff17094d02f5a594e8bd");
            } else {
                this.c = i;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.meituan.passport.successcallback.c, com.meituan.passport.successcallback.f
        public final void a(User user, Fragment fragment) {
            Object[] objArr = {user, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42aa86d537cbe058f7f9790c2ee15963", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42aa86d537cbe058f7f9790c2ee15963");
            } else if (fragment != null && fragment.isAdded() && (fragment instanceof DynamicLoginFragment)) {
                com.meituan.passport.utils.ai.a().a(fragment, this.c, 1);
                UserCenter.getInstance(fragment.getContext()).loginSuccess(user, 200);
                DynamicLoginFragment dynamicLoginFragment = (DynamicLoginFragment) fragment;
                dynamicLoginFragment.b.a(user);
                ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a((Map<String, Object>) null);
                com.meituan.passport.utils.p.a().a(fragment.getActivity(), 1, UserCenter.OAUTH_TYPE_DYNAMIC, dynamicLoginFragment.j.e());
            }
        }
    }
}
