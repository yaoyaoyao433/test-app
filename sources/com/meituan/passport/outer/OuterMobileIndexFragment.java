package com.meituan.passport.outer;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.android.cipstorage.q;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ag;
import com.meituan.passport.api.MopApi;
import com.meituan.passport.api.MopApiFactory;
import com.meituan.passport.converter.m;
import com.meituan.passport.dialogs.BottomListDialogFragment;
import com.meituan.passport.dialogs.OuterOtherLoginDialogFragment;
import com.meituan.passport.login.d;
import com.meituan.passport.login.g;
import com.meituan.passport.plugins.r;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.passport.pojo.Mop;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.SpannableHelper;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ad;
import com.meituan.passport.utils.ae;
import com.meituan.passport.utils.b;
import com.meituan.passport.utils.j;
import com.meituan.passport.utils.p;
import com.meituan.passport.view.OuterMopImageView;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportMobileInputView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OuterMobileIndexFragment extends BasePassportFragment implements BottomListDialogFragment.a {
    public static ChangeQuickRedirect h;
    AppCompatTextView i;
    public m<SmsRequestCode> j;
    private String k;
    private String l;
    private j m;
    private OuterMopImageView n;
    private PopupWindow o;
    private AppCompatCheckBox p;
    private AppCompatTextView q;
    private PassportMobileInputView r;
    private String s;
    private q t;
    private TextView u;
    private BasePassportFragment.CountryInfoBroadcastReceiver v;

    @Override // com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_mobileindex_outer;
    }

    public OuterMobileIndexFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c56593bc3cc9e4640edd2e21f918a7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c56593bc3cc9e4640edd2e21f918a7e");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        this.j = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dfa6175eec586ba41f87611c14e61f24", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dfa6175eec586ba41f87611c14e61f24") : new a(this);
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b66f45b9e1e5cb10eac336229e9f29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b66f45b9e1e5cb10eac336229e9f29a");
            return;
        }
        if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.s = cVar.g();
            this.k = cVar.b();
            this.l = cVar.a();
        }
        if (bundle != null) {
            if (bundle.containsKey("extra_key_mobile_phone_number")) {
                this.k = bundle.getString("extra_key_mobile_phone_number");
            }
            if (bundle.containsKey("extra_key_mobile_country_code")) {
                this.l = bundle.getString("extra_key_mobile_country_code");
            }
        }
        this.t = q.a(getContext(), "homepage_passport", 2);
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Map<String, Object> hashMap;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36ee03c3e8c4e4881bb64340c10c2b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36ee03c3e8c4e4881bb64340c10c2b8");
            return;
        }
        this.n = (OuterMopImageView) view.findViewById(R.id.image);
        PassportButton passportButton = (PassportButton) view.findViewById(R.id.login);
        this.p = (AppCompatCheckBox) view.findViewById(R.id.passport_mobile_operator_checkbox);
        this.q = (AppCompatTextView) view.findViewById(R.id.passport_chinamobile_service);
        this.r = (PassportMobileInputView) view.findViewById(R.id.passport_index_inputmobile);
        View findViewById = view.findViewById(R.id.passport_mobile_operator_tip_view);
        this.u = (TextView) view.findViewById(R.id.passport_mobile_operator_tip_term_agree);
        passportButton.setClickAction(b.a(this));
        this.q.setOnClickListener(c.a(this));
        if (!com.meituan.passport.login.f.INSTANCE.a(d.b.DYNAMIC)) {
            this.q.setVisibility(4);
        }
        this.r.setCountryCodeChooseListener(new PassportMobileInputView.a() { // from class: com.meituan.passport.outer.OuterMobileIndexFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a8883efd781bf7ce8a27388841f7075", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a8883efd781bf7ce8a27388841f7075");
                    return;
                }
                if (OuterMobileIndexFragment.this.getContext() != null && OuterMobileIndexFragment.this.v == null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    OuterMobileIndexFragment.this.v = new BasePassportFragment.CountryInfoBroadcastReceiver(OuterMobileIndexFragment.this);
                    LocalBroadcastManager.getInstance(OuterMobileIndexFragment.this.getContext()).registerReceiver(OuterMobileIndexFragment.this.v, intentFilter);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("from", OuterMobileIndexFragment.this.getClass().getName());
                hashMap2.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(OuterMobileIndexFragment.this.getContext(), OuterMobileIndexFragment.this.getString(R.string.passport_choose_country_code_url), hashMap2);
            }
        });
        this.r.a(this.l, this.k);
        passportButton.a(this.r);
        this.i = (AppCompatTextView) view.findViewById(R.id.passport_mobile_tips);
        if (Build.VERSION.SDK_INT >= 23) {
            this.i.setBreakStrategy(0);
        }
        this.r.setMobileInputTextWatcher(new PassportMobileInputView.b() { // from class: com.meituan.passport.outer.OuterMobileIndexFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.b, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53ed01180ebcffc25d2ab32447a98f56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53ed01180ebcffc25d2ab32447a98f56");
                } else if (OuterMobileIndexFragment.this.i.isEnabled()) {
                    OuterMobileIndexFragment.this.i.setEnabled(false);
                    OuterMobileIndexFragment.this.i.setTextColor(Color.parseColor("#999999"));
                    OuterMobileIndexFragment.this.i.setText(R.string.passport_mobile_register_tips);
                }
            }
        });
        this.u.setOnClickListener(this.f);
        findViewById.setOnClickListener(d.a(this));
        this.p.setChecked(this.t.b("passport_operator_checkbox", false));
        this.p.setOnCheckedChangeListener(e.a(this));
        this.m = new j(getActivity(), view, passportButton, this.r);
        this.m.b = "mobile_index";
        passportButton.a(this.r);
        this.u.setMovementMethod(ag.a());
        SpannableHelper.a(this.u);
        OuterMopImageView outerMopImageView = this.n;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = OuterMopImageView.a;
        if (PatchProxy.isSupport(objArr2, outerMopImageView, changeQuickRedirect2, false, "ca22c9ede37f73a8d20cbe792612de02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, outerMopImageView, changeQuickRedirect2, false, "ca22c9ede37f73a8d20cbe792612de02");
        } else {
            final ad adVar = outerMopImageView.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = ad.a;
            if (PatchProxy.isSupport(objArr3, adVar, changeQuickRedirect3, false, "fb21fb7af6fffbb390dc461e82031d51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, adVar, changeQuickRedirect3, false, "fb21fb7af6fffbb390dc461e82031d51");
            } else {
                adVar.a(false);
                if (!TextUtils.isEmpty(adVar.d)) {
                    adVar.a(2, "展示缓存URL");
                }
                if (com.meituan.passport.plugins.q.a().l == null) {
                    adVar.a(true);
                } else {
                    String a = com.meituan.passport.plugins.q.a().l.a();
                    MopApi create = MopApiFactory.getInstance().create();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = ad.a;
                    if (PatchProxy.isSupport(objArr4, adVar, changeQuickRedirect4, false, "04a1ba260882867317b403217babe8cc", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr4, adVar, changeQuickRedirect4, false, "04a1ba260882867317b403217babe8cc");
                    } else {
                        hashMap = new HashMap<>();
                        hashMap.put("user_id", String.valueOf(UserCenter.getInstance(com.meituan.android.singleton.b.a()).getUserId()));
                        hashMap.put("ci", String.valueOf(com.meituan.passport.plugins.q.a().g().a()));
                        hashMap.put("uuid", r.a().b());
                    }
                    create.getMop(a, hashMap).a(new com.sankuai.meituan.retrofit2.f<Mop>() { // from class: com.meituan.passport.utils.ad.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onResponse(Call<Mop> call, Response<Mop> response) {
                            boolean z;
                            Object[] objArr5 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9a77d5be3fc175c1fb973e2f25aeb90c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9a77d5be3fc175c1fb973e2f25aeb90c");
                                return;
                            }
                            if ((response == null || !response.f() || response.e() == null) ? false : true) {
                                Mop e = response.e();
                                ad adVar2 = ad.this;
                                Object[] objArr6 = {e};
                                ChangeQuickRedirect changeQuickRedirect6 = ad.a;
                                if (PatchProxy.isSupport(objArr6, adVar2, changeQuickRedirect6, false, "7a7c4ad6371589bb72e129ff983791d3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, adVar2, changeQuickRedirect6, false, "7a7c4ad6371589bb72e129ff983791d3");
                                    return;
                                }
                                if (e != null && e.resourcesMap != null) {
                                    List<Mop.LogOnFirst> list = e.resourcesMap.logOnFirst;
                                    Object[] objArr7 = {list};
                                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "70ab4e4ce465d8178e4026fb1766f0d3", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "70ab4e4ce465d8178e4026fb1766f0d3")).booleanValue();
                                    } else {
                                        z = list == null || list.isEmpty() || list.size() == 0;
                                    }
                                    if (!z && e.resourcesMap.logOnFirst.get(0) != null && e.resourcesMap.logOnFirst.get(0).materialMap != null && !TextUtils.isEmpty(e.resourcesMap.logOnFirst.get(0).materialMap.imgURL)) {
                                        String str = e.resourcesMap.logOnFirst.get(0).materialMap.imgURL;
                                        p.a().a(adVar2.e, "成功", str);
                                        adVar2.a(0, "正常展示URL");
                                        if (TextUtils.equals(adVar2.d, str)) {
                                            return;
                                        }
                                        adVar2.c.a(str);
                                        adVar2.b.a("passpoert_mop_image_key", str);
                                        return;
                                    }
                                }
                                adVar2.a(true);
                                p.a().a(adVar2.e, "失败", "");
                                adVar2.a(1, "玲珑资源未返回");
                            }
                        }

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onFailure(Call<Mop> call, Throwable th) {
                            Object[] objArr5 = {call, th};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fc152d3e5524ba9f83368adc1574b12a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fc152d3e5524ba9f83368adc1574b12a");
                                return;
                            }
                            p.a().a(ad.this.e, "失败", "");
                            ad.this.a(true);
                            Utils.a(getClass(), th);
                            ad adVar2 = ad.this;
                            Object[] objArr6 = {2, th};
                            ChangeQuickRedirect changeQuickRedirect6 = ad.a;
                            if (PatchProxy.isSupport(objArr6, adVar2, changeQuickRedirect6, false, "384034cb12a22425dd8769e41470dccb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, adVar2, changeQuickRedirect6, false, "384034cb12a22425dd8769e41470dccb");
                                return;
                            }
                            String message = th != null ? th.getMessage() : "";
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("code", 2);
                            hashMap2.put("message", message);
                            ((com.meituan.passport.exception.skyeyemonitor.module.p) com.meituan.passport.exception.skyeyemonitor.a.a().a("outer_mop_operator")).b(hashMap2);
                        }
                    });
                }
            }
        }
        if (Build.MODEL.equals("Pixel 2")) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) this.n.getLayoutParams();
            aVar.height = Utils.a(getContext(), 170.0f);
            this.n.setLayoutParams(aVar);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.r.getLayoutParams();
            aVar2.topMargin = Utils.a(getContext(), 60.0f);
            this.r.setLayoutParams(aVar2);
        }
    }

    public static /* synthetic */ void c(OuterMobileIndexFragment outerMobileIndexFragment, View view) {
        w wVar;
        Object[] objArr = {outerMobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cffeb3c10e6526e4d1e34d5a49b8523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cffeb3c10e6526e4d1e34d5a49b8523");
            return;
        }
        p.a().a(outerMobileIndexFragment.getActivity(), outerMobileIndexFragment.p.isChecked(), "短信-语音验证码登录");
        if (!outerMobileIndexFragment.p.isChecked()) {
            outerMobileIndexFragment.a(outerMobileIndexFragment.u, outerMobileIndexFragment.p, "-1", "", null);
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, outerMobileIndexFragment, changeQuickRedirect2, false, "d06c9e2e219ec15315990cbbbc99b1c9", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, outerMobileIndexFragment, changeQuickRedirect2, false, "d06c9e2e219ec15315990cbbbc99b1c9");
        } else {
            MobileParams mobileParams = new MobileParams();
            mobileParams.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) outerMobileIndexFragment.r);
            if (!TextUtils.isEmpty(outerMobileIndexFragment.s)) {
                mobileParams.b("poiid", com.meituan.passport.clickaction.d.a(outerMobileIndexFragment.s));
            }
            w a = com.meituan.passport.c.a().a(ai.TYPE_REQUESTCODE);
            a.a((w) mobileParams);
            a.a(outerMobileIndexFragment);
            a.a(outerMobileIndexFragment.j);
            Object[] objArr3 = {outerMobileIndexFragment};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            a.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ae0e81d40462fcbbfd48cbfc886652ad", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ae0e81d40462fcbbfd48cbfc886652ad") : new f(outerMobileIndexFragment));
            wVar = a;
        }
        wVar.b();
    }

    public static /* synthetic */ void b(OuterMobileIndexFragment outerMobileIndexFragment, View view) {
        Object[] objArr = {outerMobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0d8d44b1e3de2be0c7f171fe811bfb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0d8d44b1e3de2be0c7f171fe811bfb4");
        } else {
            new OuterOtherLoginDialogFragment().show(outerMobileIndexFragment.getChildFragmentManager(), "dialog");
        }
    }

    public static /* synthetic */ void a(OuterMobileIndexFragment outerMobileIndexFragment, View view) {
        Object[] objArr = {outerMobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d23311cf817d7dce85aee1ee96deb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d23311cf817d7dce85aee1ee96deb89");
        } else {
            outerMobileIndexFragment.p.toggle();
        }
    }

    public static /* synthetic */ void a(OuterMobileIndexFragment outerMobileIndexFragment, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {outerMobileIndexFragment, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae83285938638f2cd1063954f6ddb98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae83285938638f2cd1063954f6ddb98a");
        } else {
            outerMobileIndexFragment.t.a("passport_operator_checkbox", z);
        }
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment.a
    public final List<KeyValue> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f00b682fca88921803836dccd8f4796", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f00b682fca88921803836dccd8f4796");
        }
        ArrayList arrayList = new ArrayList();
        if (com.meituan.passport.utils.ag.a()) {
            arrayList.add(new KeyValue(g.OuterChinaMobile.f, com.meituan.passport.clickaction.d.a("本机号码一键登录")));
        }
        if (Utils.b()) {
            arrayList.add(new KeyValue(OAuthItem.WEIXIN.type, com.meituan.passport.clickaction.d.a("微信登录")));
        }
        if (Utils.a()) {
            arrayList.add(new KeyValue(OAuthItem.QQ.type, com.meituan.passport.clickaction.d.a("QQ登录")));
        }
        return arrayList;
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec222d71aef8ef3593cf7552454fe6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec222d71aef8ef3593cf7552454fe6b");
            return;
        }
        super.a(view);
        if (view instanceof CompoundButton) {
            return;
        }
        this.p.setChecked(!this.p.isChecked());
        this.p.sendAccessibilityEvent(1);
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment.a
    public final View.OnClickListener b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f038be6b270b4633706f2ea64cf33e29", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f038be6b270b4633706f2ea64cf33e29") : new View.OnClickListener() { // from class: com.meituan.passport.outer.OuterMobileIndexFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5952f127885aa2df1d87abad1792f9b8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5952f127885aa2df1d87abad1792f9b8");
                } else if (view.getTag().equals(OAuthItem.WEIXIN.type) || view.getTag().equals(OAuthItem.QQ.type)) {
                    OAuthItem from = OAuthItem.from(view.getTag().toString());
                    if (from == null) {
                        return;
                    }
                    if (!OuterMobileIndexFragment.this.p.isChecked()) {
                        OuterMobileIndexFragment.this.a(OuterMobileIndexFragment.this.u, OuterMobileIndexFragment.this.p, "-1", "", from.type);
                        p a2 = p.a();
                        FragmentActivity activity = OuterMobileIndexFragment.this.getActivity();
                        a2.a((Activity) activity, false, from.name + "登录");
                        return;
                    }
                    Intent a3 = com.meituan.passport.utils.ag.a(view.getTag().toString());
                    if (a3 == null) {
                        ae.a(OuterMobileIndexFragment.this.getView(), OuterMobileIndexFragment.this.getResources().getString(R.string.passport_index_wechat_error, from.name)).a();
                    } else {
                        if (OuterMobileIndexFragment.this.getActivity() != null && OuterMobileIndexFragment.this.getActivity().getIntent() != null && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(OuterMobileIndexFragment.this.getActivity().getIntent(), "mmpMultiTaskLogin"))) {
                            a3.putExtra("mmpMultiTaskLogin", com.sankuai.waimai.platform.utils.f.a(OuterMobileIndexFragment.this.getActivity().getIntent(), "mmpMultiTaskLogin"));
                        }
                        OuterMobileIndexFragment.this.startActivityForResult(a3, 1);
                    }
                    p a4 = p.a();
                    FragmentActivity activity2 = OuterMobileIndexFragment.this.getActivity();
                    a4.a((Activity) activity2, true, from.name + "登录");
                } else {
                    com.sankuai.meituan.navigation.d.a(OuterMobileIndexFragment.this.q).a(g.a((String) view.getTag()).e, (Bundle) null);
                }
            }
        };
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9acf45c10187061d64213440482cd9d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9acf45c10187061d64213440482cd9d8");
            return;
        }
        super.onResume();
        p.a().a(getActivity(), 2, -999);
        this.m.a();
        if (!this.e || this.u == null || this.u.getText() == null) {
            return;
        }
        this.u.setText(Utils.a(getContext(), this.u.getText().toString(), "-1"));
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae207940688b7de2ba5f8a26461efe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae207940688b7de2ba5f8a26461efe5");
            return;
        }
        super.onPause();
        this.m.c();
        this.m.b();
        this.l = this.r.getCountryCode();
        this.k = this.r.getPhoneNumber();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92ef4d48716cfd94b17ce2f79530202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92ef4d48716cfd94b17ce2f79530202");
            return;
        }
        super.onDestroy();
        if (this.m != null) {
            this.m.b();
        }
        if (this.o != null) {
            com.sankuai.waimai.platform.utils.p.b(this.o);
        }
        if (getContext() == null || this.v == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.v);
        this.v = null;
    }

    public static /* synthetic */ void a(OuterMobileIndexFragment outerMobileIndexFragment, SmsRequestCode smsRequestCode) {
        Object[] objArr = {outerMobileIndexFragment, smsRequestCode};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98b0d9fd5cdd22499126419c8735a162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98b0d9fd5cdd22499126419c8735a162");
        } else if (!outerMobileIndexFragment.isAdded() || smsRequestCode == null) {
        } else {
            b.a aVar = new b.a();
            aVar.b = outerMobileIndexFragment.r.getPhoneNumber();
            aVar.c = outerMobileIndexFragment.r.getCountryCode();
            aVar.k = smsRequestCode.action;
            aVar.e = smsRequestCode.value;
            aVar.j = smsRequestCode.type == 1;
            com.sankuai.meituan.navigation.d.a(outerMobileIndexFragment.r).a(com.meituan.passport.login.c.DynamicVerify.i, aVar.a());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2a9963a90aba5291bef2133e85fa0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2a9963a90aba5291bef2133e85fa0c");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        com.meituan.passport.utils.ag.a(this, OuterMobileIndexFragment.class.getSimpleName(), i, i2, intent);
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(CountryData countryData) {
        Object[] objArr = {countryData};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7a8b80478f72a9fd9e6f51a9feb5c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7a8b80478f72a9fd9e6f51a9feb5c1");
            return;
        }
        super.a(countryData);
        if (countryData != null && TextUtils.equals(countryData.getFrom(), getClass().getName())) {
            String code = countryData.getCode();
            countryData.getName();
            this.r.a(code, this.r.getPhoneNumber());
        }
    }
}
