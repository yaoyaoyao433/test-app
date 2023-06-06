package com.meituan.passport.login.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.dialogs.BottomListDialogFragment;
import com.meituan.passport.dialogs.VoiceConfirmDialogFragment;
import com.meituan.passport.dialogs.WarningDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.login.d;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.service.v;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.utils.d;
import com.meituan.passport.view.PassportEditText;
import com.meituan.passport.view.TextButton;
import com.meituan.passport.view.VerificationFrameView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DynamicAccountLoginFragment extends BasePassportFragment implements BottomListDialogFragment.a, d.a {
    public static ChangeQuickRedirect h;
    private VerificationFrameView.a A;
    private com.meituan.passport.converter.b B;
    private com.meituan.passport.converter.b C;
    protected TextView i;
    protected TextButton j;
    protected TextView k;
    int l;
    protected com.meituan.passport.pojo.request.d m;
    private VerificationFrameView n;
    private Mobile o;
    private String p;
    private boolean q;
    private boolean r;
    private w<com.meituan.passport.pojo.request.j, SmsResult> s;
    private w<com.meituan.passport.pojo.request.d, User> t;
    private com.meituan.passport.pojo.request.j u;
    private com.meituan.passport.utils.d v;
    private String w;
    private String x;
    private int y;
    private boolean z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CodeResultType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CodeType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TimerStatus {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TipsType {
    }

    @Override // com.meituan.passport.BasePassportFragment
    public int W_() {
        return R.layout.passport_fragment_dynamiclogin;
    }

    public DynamicAccountLoginFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256dab3d047cf23723c97d08bb049239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256dab3d047cf23723c97d08bb049239");
            return;
        }
        this.q = false;
        this.r = false;
        this.A = new VerificationFrameView.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.VerificationFrameView.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "310c9a110d14de9fb9285180f61626a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "310c9a110d14de9fb9285180f61626a1");
                    return;
                }
                DynamicAccountLoginFragment.this.a(DynamicAccountLoginFragment.this.m.i.b());
                Utils.a(DynamicAccountLoginFragment.this);
                DynamicAccountLoginFragment.this.t.b();
            }
        };
        this.B = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                boolean z2;
                boolean z3;
                boolean z4 = true;
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b200c8014d385e21296a066e290f59e1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b200c8014d385e21296a066e290f59e1")).booleanValue();
                }
                if (z) {
                    return true;
                }
                if (DynamicAccountLoginFragment.this.isAdded() && apiException != null) {
                    if (apiException.code != 101190) {
                        ai.a().a(DynamicAccountLoginFragment.this.getActivity(), DynamicAccountLoginFragment.this.y, apiException.code);
                    } else if (apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                        ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a(apiException);
                    }
                    if (apiException.code == 121038) {
                        com.meituan.passport.utils.d dVar = DynamicAccountLoginFragment.this.v;
                        String str = DynamicAccountLoginFragment.this.l == 32 ? "voice" : "sms";
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.d.a;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "0cf9b59862b93947364263708042f776", RobustBitConfig.DEFAULT_VALUE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "0cf9b59862b93947364263708042f776")).booleanValue();
                        } else {
                            dVar.c = com.meituan.passport.utils.d.a(str);
                            z3 = dVar.c.c;
                        }
                        if (z3) {
                            DynamicAccountLoginFragment.this.a(1, 0);
                            z2 = false;
                        } else {
                            if (DynamicAccountLoginFragment.this.l == 32) {
                                DynamicAccountLoginFragment.h(DynamicAccountLoginFragment.this);
                            }
                            DynamicAccountLoginFragment.this.v.b(DynamicAccountLoginFragment.this.l == 32 ? "voice" : "sms");
                            return false;
                        }
                    } else {
                        z2 = true;
                    }
                    if (apiException.code == 121046) {
                        if (!TextUtils.equals(DynamicAccountLoginFragment.this.o.countryCode, "86")) {
                            DynamicAccountLoginFragment.a(DynamicAccountLoginFragment.this, true);
                            DynamicAccountLoginFragment.b(DynamicAccountLoginFragment.this, true);
                        } else if (DynamicAccountLoginFragment.this.l == 32) {
                            DynamicAccountLoginFragment.b(DynamicAccountLoginFragment.this, true);
                        } else {
                            DynamicAccountLoginFragment.a(DynamicAccountLoginFragment.this, true);
                        }
                        if (!DynamicAccountLoginFragment.this.q || !DynamicAccountLoginFragment.this.r) {
                            z4 = false;
                        }
                    } else {
                        z4 = z2;
                    }
                    DynamicAccountLoginFragment.this.i();
                }
                DynamicAccountLoginFragment.this.b(22);
                return z4;
            }
        };
        this.C = new AnonymousClass4();
    }

    public static /* synthetic */ boolean a(DynamicAccountLoginFragment dynamicAccountLoginFragment, boolean z) {
        dynamicAccountLoginFragment.r = true;
        return true;
    }

    public static /* synthetic */ boolean b(DynamicAccountLoginFragment dynamicAccountLoginFragment, boolean z) {
        dynamicAccountLoginFragment.q = true;
        return true;
    }

    public static /* synthetic */ void c(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, dynamicAccountLoginFragment, changeQuickRedirect, false, "48e77e95030755070c26ae93e5252cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dynamicAccountLoginFragment, changeQuickRedirect, false, "48e77e95030755070c26ae93e5252cb3");
        } else if (dynamicAccountLoginFragment.z) {
            dynamicAccountLoginFragment.b("");
        } else {
            aj.b(dynamicAccountLoginFragment, "b_u9whtspk", "c_ph4yzc83");
            VoiceConfirmDialogFragment voiceConfirmDialogFragment = new VoiceConfirmDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mobile", dynamicAccountLoginFragment.o.number);
            bundle.putString("content", dynamicAccountLoginFragment.getString(R.string.passport_voice_code_has_send1));
            bundle.putBoolean("forget_password", true);
            voiceConfirmDialogFragment.setArguments(bundle);
            voiceConfirmDialogFragment.b = new VoiceConfirmDialogFragment.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.dialogs.VoiceConfirmDialogFragment.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0311fbef79158cba531f2e12f0b4e37e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0311fbef79158cba531f2e12f0b4e37e");
                    } else {
                        DynamicAccountLoginFragment.this.b(str);
                    }
                }
            };
            voiceConfirmDialogFragment.c = i.a(dynamicAccountLoginFragment);
            voiceConfirmDialogFragment.show(dynamicAccountLoginFragment.getFragmentManager(), "tips");
            dynamicAccountLoginFragment.z = true;
        }
    }

    public static /* synthetic */ void h(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, dynamicAccountLoginFragment, changeQuickRedirect, false, "fe0f6c9b198b15e144e01b684b775af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dynamicAccountLoginFragment, changeQuickRedirect, false, "fe0f6c9b198b15e144e01b684b775af9");
            return;
        }
        new b.AbstractC0515b(dynamicAccountLoginFragment) { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.utils.b.AbstractC0515b
            public final b.a a(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82acd04053b6904bf57c96c6c6442d2f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82acd04053b6904bf57c96c6c6442d2f");
                }
                aVar.l = true;
                return aVar;
            }
        }.a();
        dynamicAccountLoginFragment.h();
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        w<com.meituan.passport.pojo.request.j, SmsResult> a2;
        w<com.meituan.passport.pojo.request.d, User> a3;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e51644e2725c421e0fcd75c75a93fa72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e51644e2725c421e0fcd75c75a93fa72");
            return;
        }
        Utils.b(getActivity(), (EditText) null);
        this.u = new com.meituan.passport.pojo.request.j();
        this.m = new com.meituan.passport.pojo.request.d();
        this.m.a("needIdentifyConfirm", com.meituan.passport.clickaction.d.a("true"));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5df3a8cf712055cc7d29358bd709220c", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5df3a8cf712055cc7d29358bd709220c");
        } else {
            a2 = com.meituan.passport.c.a().a(com.meituan.passport.service.ai.TYPE_SEND_SMS_CODE);
            a2.a((w<com.meituan.passport.pojo.request.j, SmsResult>) this.u);
            a2.a(this);
            a2.a(new b(this));
            a2.a(this.B);
        }
        this.s = a2;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a22a923a1f384cae6e4a75b1b20c4854", RobustBitConfig.DEFAULT_VALUE)) {
            a3 = (w) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a22a923a1f384cae6e4a75b1b20c4854");
        } else {
            a3 = com.meituan.passport.c.a().a(com.meituan.passport.service.ai.TYPE_DYNAMIC_LOGIN);
            a3.a((w<com.meituan.passport.pojo.request.d, User>) this.m);
            a3.a(this);
            a3.a(new a(this));
            a3.a(this.C);
            if (a3 instanceof v) {
                ((v) a3).b = UserCenter.OAUTH_TYPE_DYNAMIC;
            }
        }
        this.t = a3;
        if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.p = cVar.d();
            this.w = cVar.b();
            this.x = cVar.a();
            this.y = cVar.h();
            this.l = cVar.i() ? 32 : 31;
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be029062d5b66f80b43c6bc647337ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be029062d5b66f80b43c6bc647337ed");
            return;
        }
        this.i = (TextView) view.findViewById(R.id.phone_number);
        this.j = (TextButton) view.findViewById(R.id.time);
        this.n = (VerificationFrameView) view.findViewById(R.id.verify_layout);
        this.k = (TextView) view.findViewById(R.id.passport_code_tips);
        if (Build.VERSION.SDK_INT >= 23) {
            this.k.setBreakStrategy(0);
        }
        this.o = new Mobile(this.w, this.x);
        if (TextUtils.isEmpty(this.o.countryCode)) {
            this.o.countryCode = "86";
        }
        this.m.j = com.meituan.passport.clickaction.d.a(this.o);
        com.meituan.passport.pojo.request.d dVar = this.m;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        dVar.i = com.meituan.passport.clickaction.d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ccdb56434dd60ebe133995f85f7d7bdb", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ccdb56434dd60ebe133995f85f7d7bdb") : new e(this));
        com.meituan.passport.pojo.request.d dVar2 = this.m;
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        dVar2.l = com.meituan.passport.clickaction.d.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d716bea051f4643721afc03f3bde38ba", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d716bea051f4643721afc03f3bde38ba") : new f(this));
        this.m.k = this.y;
        this.m.a(this.u);
        f();
        this.v = new com.meituan.passport.utils.d(this.o.number, this);
        this.j.setClickAction(g.a(this));
        this.n.setVerifyListener(this.A);
        this.m.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) this.n.getParamAction());
        VerificationFrameView verificationFrameView = this.n;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = VerificationFrameView.a;
        if (PatchProxy.isSupport(objArr4, verificationFrameView, changeQuickRedirect4, false, "680a40311760329ad1fd3955997fad24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, verificationFrameView, changeQuickRedirect4, false, "680a40311760329ad1fd3955997fad24");
        } else {
            verificationFrameView.b.requestFocus();
            Utils.a(verificationFrameView.getContext(), verificationFrameView.b);
        }
        VerificationFrameView verificationFrameView2 = this.n;
        Object[] objArr5 = {this};
        ChangeQuickRedirect changeQuickRedirect5 = h.a;
        PassportEditText.d hVar = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "8500773633b3c69c24734e2232078a21", RobustBitConfig.DEFAULT_VALUE) ? (PassportEditText.d) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "8500773633b3c69c24734e2232078a21") : new h(this);
        Object[] objArr6 = {hVar};
        ChangeQuickRedirect changeQuickRedirect6 = VerificationFrameView.a;
        if (PatchProxy.isSupport(objArr6, verificationFrameView2, changeQuickRedirect6, false, "0aa77d538988d193d39dc964c00e0243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, verificationFrameView2, changeQuickRedirect6, false, "0aa77d538988d193d39dc964c00e0243");
        } else {
            verificationFrameView2.b.a(hVar);
        }
        aj.a(this, "c_ph4yzc83", (Map<String, Object>) null);
    }

    public static /* synthetic */ String b(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = {dynamicAccountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1d71ed4cacfe0f9a0fba0dc7766f416", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1d71ed4cacfe0f9a0fba0dc7766f416") : dynamicAccountLoginFragment.p;
    }

    public static /* synthetic */ void a(DynamicAccountLoginFragment dynamicAccountLoginFragment, View view) {
        Object[] objArr = {dynamicAccountLoginFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd15f947208b51319e781a9cc0229477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd15f947208b51319e781a9cc0229477");
            return;
        }
        Utils.a(dynamicAccountLoginFragment);
        dynamicAccountLoginFragment.e();
        aj.a(dynamicAccountLoginFragment, "b_ze6u755j", "c_ph4yzc83");
    }

    public static /* synthetic */ void a(DynamicAccountLoginFragment dynamicAccountLoginFragment, Editable editable) {
        Object[] objArr = {dynamicAccountLoginFragment, editable};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a065b8608f0a83f84a6ad758a1809c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a065b8608f0a83f84a6ad758a1809c1");
        } else {
            dynamicAccountLoginFragment.a(0, 0);
        }
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8181dfc1f6d3a04a3f296839706515cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8181dfc1f6d3a04a3f296839706515cf");
            return;
        }
        super.onResume();
        a(0, 0);
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70624b87e93b5d7c29fedb5fdcb308c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70624b87e93b5d7c29fedb5fdcb308c0");
        } else if (isAdded()) {
            b(14, i);
        }
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8dadc5c73a43e36ab6b140ef6d2921e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8dadc5c73a43e36ab6b140ef6d2921e");
        } else if (isAdded()) {
            if (!TextUtils.equals(this.o.countryCode, "86")) {
                c(12);
            } else {
                i();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a80228fd7f69f95095da141a7ab5406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a80228fd7f69f95095da141a7ab5406");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.n != null) {
                VerificationFrameView verificationFrameView = this.n;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = VerificationFrameView.a;
                if (PatchProxy.isSupport(objArr2, verificationFrameView, changeQuickRedirect2, false, "9951381d01d40fbaf4a8e22735685ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, verificationFrameView, changeQuickRedirect2, false, "9951381d01d40fbaf4a8e22735685ee1");
                    return;
                }
                final Context context = verificationFrameView.getContext();
                final PassportEditText passportEditText = verificationFrameView.b;
                Object[] objArr3 = {context, passportEditText};
                ChangeQuickRedirect changeQuickRedirect3 = Utils.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5cc9b3b277f72702ac9b433be25b7ba8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5cc9b3b277f72702ac9b433be25b7ba8");
                    return;
                }
                passportEditText.requestFocus();
                if (Build.VERSION.SDK_INT >= 18) {
                    passportEditText.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.meituan.passport.utils.Utils.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                        public final void onWindowFocusChanged(boolean z) {
                            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0e17f83b546a55ae043577bc8397c156", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0e17f83b546a55ae043577bc8397c156");
                                return;
                            }
                            if (z) {
                                Utils.a(context, passportEditText);
                            }
                            if (Build.VERSION.SDK_INT >= 18) {
                                passportEditText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                            }
                        }
                    });
                } else {
                    Utils.a(context, passportEditText);
                }
            }
        }
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment.a
    public final View.OnClickListener b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728faa96ecf93192146a29aef6861e08", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728faa96ecf93192146a29aef6861e08") : new View.OnClickListener() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeec323ccf806dde8b5cfc05dcd826ef", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeec323ccf806dde8b5cfc05dcd826ef");
                } else if (view.getTag() == null || !(view.getTag() instanceof String)) {
                } else {
                    String str = (String) view.getTag();
                    if (TextUtils.equals(str, "vioce")) {
                        aj.a(this, "b_tqto03dw", "c_ph4yzc83");
                        DynamicAccountLoginFragment.c(DynamicAccountLoginFragment.this);
                    } else if (TextUtils.equals(str, "resend")) {
                        aj.a(this, "b_90ai0aq7", "c_ph4yzc83");
                        DynamicAccountLoginFragment.this.e();
                    }
                }
            }
        };
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment.a
    public final List<KeyValue> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64db4049cc55a1ab59163d23e210a2c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64db4049cc55a1ab59163d23e210a2c8");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValue("resend", com.meituan.passport.clickaction.d.a(getString(R.string.passport_resend_dynamic_code))));
        arrayList.add(new KeyValue("vioce", com.meituan.passport.clickaction.d.a(getString(R.string.passport_listen_voice_code))));
        return arrayList;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba58f90a09f51cde926cd35b6fa178f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba58f90a09f51cde926cd35b6fa178f9");
        }
        int parseInt = NumberUtils.parseInt(this.o.countryCode, 86);
        return " +" + this.o.countryCode + StringUtil.SPACE + com.meituan.passport.c.a().a(parseInt).a(this.o.number);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839b02c6f8977336b200c8679a1c1971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839b02c6f8977336b200c8679a1c1971");
            return;
        }
        super.onStop();
        Utils.a(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8378efaef548f6cbec9123ed3a8059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8378efaef548f6cbec9123ed3a8059");
            return;
        }
        super.onDestroy();
        if (this.v != null) {
            this.v.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e830275400d4241abbd3c032a3720b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e830275400d4241abbd3c032a3720b0");
            return;
        }
        this.p = "";
        VerificationFrameView verificationFrameView = this.n;
        Object[] objArr2 = {""};
        ChangeQuickRedirect changeQuickRedirect2 = VerificationFrameView.a;
        if (PatchProxy.isSupport(objArr2, verificationFrameView, changeQuickRedirect2, false, "5369080e916969c0339d9fadd96ec6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, verificationFrameView, changeQuickRedirect2, false, "5369080e916969c0339d9fadd96ec6ee");
        } else if (!TextUtils.isEmpty("")) {
            if (verificationFrameView.c.size() == "".length()) {
                verificationFrameView.b.setText("");
            }
        } else {
            verificationFrameView.b.setText("");
        }
        this.s.b();
        this.l = 31;
        a(0, 0);
    }

    public static /* synthetic */ void a(DynamicAccountLoginFragment dynamicAccountLoginFragment, DialogInterface dialogInterface, int i) {
        Object[] objArr = {dynamicAccountLoginFragment, dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68210413e48512ab70e20011356737d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68210413e48512ab70e20011356737d2");
        } else {
            aj.a(dynamicAccountLoginFragment, "b_chdqd2ks", "c_ph4yzc83");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f25bb2724ebc505db4c217a98b2b452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f25bb2724ebc505db4c217a98b2b452");
            return;
        }
        this.p = str;
        if (isAdded()) {
            new b.AbstractC0515b(this) { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.utils.b.AbstractC0515b
                public final b.a a(b.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5af45e0f9e8f134ae747a37d509f8e98", RobustBitConfig.DEFAULT_VALUE)) {
                        return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5af45e0f9e8f134ae747a37d509f8e98");
                    }
                    aVar.e = str;
                    return aVar;
                }
            }.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f246c9576822c381b82dd25376c20423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f246c9576822c381b82dd25376c20423");
        } else if (isAdded()) {
            this.s.b();
            this.j.setText(getString(R.string.passport_resend_dynamic_code));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8521c36e5d70aed99b1bd1c5dabdbb04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8521c36e5d70aed99b1bd1c5dabdbb04");
        } else if (isAdded()) {
            this.l = 32;
            a(str);
            this.s.b();
            aj.a(this, "b_vw6lyuh6", "c_ph4yzc83");
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3dd80b049173340c864dbb9e51d129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3dd80b049173340c864dbb9e51d129");
        } else if (PassportConfig.n() || !PassportConfig.o()) {
            this.n.setLength(4);
        } else {
            this.n.setLength(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510eb6f1d898b911aff9e1590fa5cd19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510eb6f1d898b911aff9e1590fa5cd19");
        } else if (!this.r && !this.q) {
            c(10);
        } else if (this.r && this.q) {
            c(13);
        } else if (this.r) {
            c(11);
        } else {
            c(12);
        }
    }

    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305b0dab2d94a78a121dc63401f46fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305b0dab2d94a78a121dc63401f46fb3");
        } else if (this.k == null) {
        } else {
            switch (i) {
                case 0:
                    if (this.m.k == 3) {
                        this.k.setText(R.string.passport_auto_sign_up_tips);
                        this.k.setTextColor(Utils.c(getContext(), R.color.passport_black3));
                        return;
                    }
                    this.k.setText("");
                    return;
                case 1:
                    this.k.setText(getString(R.string.passport_sms_send_too_frequently));
                    this.k.setTextColor(Color.parseColor("#F63F3F"));
                    return;
                case 2:
                    this.k.setText(i2 == 121008 ? R.string.passport_sms_code_error : R.string.passport_sms_code_timeout);
                    this.k.setTextColor(Color.parseColor("#F63F3F"));
                    return;
                default:
                    if (this.m.k == 3) {
                        this.k.setText(R.string.passport_auto_sign_up_tips);
                        this.k.setTextColor(Utils.c(getContext(), R.color.passport_black3));
                        return;
                    }
                    this.k.setText("");
                    return;
            }
        }
    }

    public void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505a27bfa796ab3480532b1e9e017646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505a27bfa796ab3480532b1e9e017646");
        } else if (this.j == null) {
        } else {
            if (i == 14) {
                this.j.setClickable(false);
                this.j.setText(getString(R.string.passport_retry_after_certain_seconds, Integer.valueOf(i2)));
                this.j.setTextColor(Color.parseColor("#555555"));
                return;
            }
            c(i);
        }
    }

    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18b31e32e1aabe97830bfd7386042f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18b31e32e1aabe97830bfd7386042f9");
        } else if (this.j == null) {
        } else {
            switch (i) {
                case 10:
                    this.j.setClickable(true);
                    this.j.setText(getString(R.string.passport_can_receiver_sms));
                    this.j.setTextColor(Utils.b(getContext()));
                    this.j.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.10
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e86958a440e841ddc3c7702156c0439e", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e86958a440e841ddc3c7702156c0439e");
                                return;
                            }
                            Utils.a(DynamicAccountLoginFragment.this);
                            new BottomListDialogFragment().show(DynamicAccountLoginFragment.this.getChildFragmentManager(), "dialog");
                            com.meituan.passport.utils.p.a().a(1);
                        }
                    });
                    return;
                case 11:
                    this.j.setClickable(true);
                    this.j.setText(getString(R.string.passport_listen_voice_code));
                    this.j.setTextColor(Utils.b(getContext()));
                    this.j.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.11
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "650d1c463037f4115c1364e0659c82ff", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "650d1c463037f4115c1364e0659c82ff");
                                return;
                            }
                            DynamicAccountLoginFragment.c(DynamicAccountLoginFragment.this);
                            com.meituan.passport.utils.p.a().a(2);
                        }
                    });
                    return;
                case 12:
                    this.j.setClickable(true);
                    this.j.setText(getString(R.string.passport_resend_dynamic_code));
                    this.j.setTextColor(Utils.b(getContext()));
                    this.j.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.12
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90937dd1f7bf761906577629dc1490b4", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90937dd1f7bf761906577629dc1490b4");
                                return;
                            }
                            DynamicAccountLoginFragment.this.e();
                            com.meituan.passport.utils.p.a().a(3);
                        }
                    });
                    return;
                case 13:
                    this.j.setClickable(true);
                    this.j.setText(getString(R.string.passport_resend_dynamic_code));
                    this.j.setTextColor(Utils.b(getContext()));
                    this.j.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e2e1f8a82a3881464753d8a48891e05", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e2e1f8a82a3881464753d8a48891e05");
                                return;
                            }
                            DynamicAccountLoginFragment.this.f();
                            com.meituan.passport.utils.p.a().a(3);
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends com.meituan.passport.successcallback.f<SmsResult> {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.passport.successcallback.f
        public final /* bridge */ /* synthetic */ void a(SmsResult smsResult, FragmentActivity fragmentActivity) {
        }

        @Override // com.meituan.passport.successcallback.f
        public final /* synthetic */ void a(SmsResult smsResult, Fragment fragment) {
            SmsResult smsResult2 = smsResult;
            Object[] objArr = {smsResult2, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6be987e10168485dde5231218ceed85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6be987e10168485dde5231218ceed85");
            } else if ((fragment instanceof DynamicAccountLoginFragment) && fragment.isAdded()) {
                DynamicAccountLoginFragment dynamicAccountLoginFragment = (DynamicAccountLoginFragment) fragment;
                if (dynamicAccountLoginFragment.l == 32) {
                    DynamicAccountLoginFragment.h(dynamicAccountLoginFragment);
                }
                dynamicAccountLoginFragment.b(21);
                dynamicAccountLoginFragment.m.b(smsResult2);
                if (smsResult2.action == 3) {
                    com.meituan.passport.utils.p.a().a((Activity) fragment.getActivity(), UserCenter.OAUTH_TYPE_DYNAMIC, "signup");
                } else {
                    com.meituan.passport.utils.p.a().a((Activity) fragment.getActivity(), UserCenter.OAUTH_TYPE_DYNAMIC, "login");
                }
                dynamicAccountLoginFragment.a(0, 0);
                dynamicAccountLoginFragment.v.b(dynamicAccountLoginFragment.l == 32 ? "voice" : "sms");
            }
        }

        public b(Fragment fragment) {
            super(fragment);
            Object[] objArr = {fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ac8e5bb9001f5900c1e58367a3c327", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ac8e5bb9001f5900c1e58367a3c327");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a extends com.meituan.passport.successcallback.c {
        public static ChangeQuickRedirect a;

        public a(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
            super(dynamicAccountLoginFragment);
            Object[] objArr = {dynamicAccountLoginFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbb0ba401d3703dfb0daec291b9c091", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbb0ba401d3703dfb0daec291b9c091");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.meituan.passport.successcallback.c, com.meituan.passport.successcallback.f
        public final void a(User user, Fragment fragment) {
            Object[] objArr = {user, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421e7d970f2c24083fdb307d5ea390fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421e7d970f2c24083fdb307d5ea390fb");
                return;
            }
            if ((fragment instanceof DynamicAccountLoginFragment) && fragment.isAdded()) {
                com.meituan.passport.login.d.a(com.meituan.android.singleton.b.a()).a(d.b.DYNAMIC);
                DynamicAccountLoginFragment dynamicAccountLoginFragment = (DynamicAccountLoginFragment) fragment;
                com.meituan.passport.login.d.a(com.meituan.android.singleton.b.a()).a(dynamicAccountLoginFragment.x, dynamicAccountLoginFragment.w);
                com.meituan.passport.utils.d dVar = dynamicAccountLoginFragment.v;
                String str = dynamicAccountLoginFragment.l == 32 ? "voice" : "sms";
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.utils.d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5b6deb7297c4b45cc0e3870b8284e53f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5b6deb7297c4b45cc0e3870b8284e53f");
                } else {
                    dVar.c = com.meituan.passport.utils.d.a(str);
                    dVar.c.c = true;
                }
                com.meituan.passport.utils.p.a().a(fragment.getActivity(), 1, UserCenter.OAUTH_TYPE_DYNAMIC, dynamicAccountLoginFragment.m.e());
                int i = dynamicAccountLoginFragment.m != null ? dynamicAccountLoginFragment.m.k : 2;
                if (this.f) {
                    com.meituan.passport.utils.p.a().c(fragment.getActivity(), UserCenter.OAUTH_TYPE_DYNAMIC, i == 3 ? "signup" : "login", 1);
                }
                ai.a().a(fragment.getActivity(), dynamicAccountLoginFragment.m.k);
                ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a((Map<String, Object>) null);
                a(false);
            }
            super.a(user, fragment);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.login.fragment.DynamicAccountLoginFragment$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements com.meituan.passport.converter.b {
        public static ChangeQuickRedirect a;

        public AnonymousClass4() {
        }

        @Override // com.meituan.passport.converter.b
        public final boolean a(ApiException apiException, boolean z) {
            Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcf6f9dcfae49e28dc9b9a3932ef565", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcf6f9dcfae49e28dc9b9a3932ef565")).booleanValue();
            }
            if (apiException == null) {
                return true;
            }
            ai.a().a(DynamicAccountLoginFragment.this.getActivity(), DynamicAccountLoginFragment.this.m.k, apiException.code);
            if (DynamicAccountLoginFragment.this.isAdded()) {
                if (apiException.code == 121008 || apiException.code == 121019) {
                    DynamicAccountLoginFragment.this.n.a();
                    DynamicAccountLoginFragment.this.a(2, apiException.code);
                    return false;
                } else if (apiException.code == 0 || apiException.code == 401 || apiException.code == 400 || apiException.code == 101000) {
                    WarningDialog.a a2 = WarningDialog.a.a();
                    a2.c = DynamicAccountLoginFragment.this.getString(R.string.passport_resend);
                    a2.e = j.a(this);
                    a2.f = k.a(this);
                    a2.b = DynamicAccountLoginFragment.this.getString(DynamicAccountLoginFragment.this.m.k == 3 ? R.string.passport_signup_failed_please_retry : R.string.passport_login_failed_please_retry);
                    a2.b().show(DynamicAccountLoginFragment.this.getFragmentManager(), "dialog");
                    if (DynamicAccountLoginFragment.this.m.k == 3) {
                        aj.b(DynamicAccountLoginFragment.this, "b_o7w382ev", "c_ph4yzc83");
                    } else {
                        aj.b(DynamicAccountLoginFragment.this, "b_h6f29f4e", "c_ph4yzc83");
                    }
                    return false;
                } else if (apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code)) && !z) {
                    ((com.meituan.passport.exception.skyeyemonitor.module.k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a(apiException);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb69e38a2ad742b075762f3b3f049af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb69e38a2ad742b075762f3b3f049af3");
        } else if (this.l == 32) {
            this.i.setText(R.string.passport_voice_get_confirm_code);
            this.j.setText(R.string.passport_retrieve_code);
            h();
            VoiceConfirmDialogFragment voiceConfirmDialogFragment = new VoiceConfirmDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mobile", this.o.number);
            bundle.putString("content", getString(R.string.passport_voice_tips));
            voiceConfirmDialogFragment.setArguments(bundle);
            voiceConfirmDialogFragment.b = new VoiceConfirmDialogFragment.a() { // from class: com.meituan.passport.login.fragment.DynamicAccountLoginFragment.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.dialogs.VoiceConfirmDialogFragment.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9c55c2917dca944b57c117eef079d68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9c55c2917dca944b57c117eef079d68");
                        return;
                    }
                    DynamicAccountLoginFragment.this.p = str;
                    DynamicAccountLoginFragment.this.g();
                }
            };
            voiceConfirmDialogFragment.show(getFragmentManager(), "tips");
        } else {
            if (!PassportConfig.o()) {
                this.n.setLength(4);
            } else {
                this.n.setLength(6);
            }
            b(21);
            g();
        }
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc328e303c84e7c82e2a55b2714cf8e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc328e303c84e7c82e2a55b2714cf8e3");
            return;
        }
        switch (i) {
            case 21:
                if (this.l == 32) {
                    this.i.setText(Utils.a(getContext(), (int) R.string.passport_voice_code_has_send, d()));
                    return;
                } else {
                    this.i.setText(Utils.a(getContext(), (int) R.string.passport_sms_will_send_to_mobile, d()));
                    return;
                }
            case 22:
                if (this.l == 32) {
                    this.i.setText(Utils.a(getContext(), (int) R.string.passport_voice_send_fail, d()));
                    return;
                } else {
                    this.i.setText(Utils.a(getContext(), (int) R.string.passport_sms_send_fail, d()));
                    return;
                }
            default:
                return;
        }
    }

    public static /* synthetic */ Boolean a(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        Object[] objArr = {dynamicAccountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ce9890f7b740b8b2fc85c07deebff63", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ce9890f7b740b8b2fc85c07deebff63");
        }
        return Boolean.valueOf(dynamicAccountLoginFragment.l == 32);
    }
}
