package com.meituan.passport.retrieve.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.converter.m;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.Ticket;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.utils.g;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CheckSecurityFragment extends BasePassportFragment implements Handler.Callback, com.meituan.passport.converter.b, m<Ticket> {
    public static ChangeQuickRedirect h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private Button l;
    private Animation m;
    private boolean n;
    private boolean o;
    private String p;
    private Ticket q;
    private Handler r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;

    @Override // com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_check_username_security;
    }

    public CheckSecurityFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acdad23b368ee66a59d193e0c3167c30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acdad23b368ee66a59d193e0c3167c30");
        } else {
            this.r = g.a(this);
        }
    }

    @Override // com.meituan.passport.converter.m
    public final /* synthetic */ void a(Ticket ticket) {
        Ticket ticket2 = ticket;
        Object[] objArr = {ticket2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d6cbd493b533b646d936d0905436c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d6cbd493b533b646d936d0905436c5");
            return;
        }
        this.q = ticket2;
        this.r.sendEmptyMessage(4);
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c3caeaa471460659f63a201b6955bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c3caeaa471460659f63a201b6955bd");
        } else if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.t = cVar.b();
            this.s = cVar.a();
            this.p = cVar.c();
            this.u = cVar.f();
            this.v = cVar.d();
            this.w = cVar.e();
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fa01fe04a5551f177e754af65048b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fa01fe04a5551f177e754af65048b6");
            return;
        }
        aj.b(this, "b_dklvm5oa", "c_yn0znls4");
        this.i = (ImageView) view.findViewById(R.id.passsport_checking);
        this.k = (TextView) view.findViewById(R.id.passport_check_state_text);
        this.l = (Button) view.findViewById(R.id.passport_check_to_rebind);
        this.j = (ImageView) view.findViewById(R.id.passsport_check_shield);
        this.l.setOnClickListener(com.meituan.passport.retrieve.fragment.a.a(this));
        this.m = AnimationUtils.loadAnimation(getContext(), R.anim.passport_cs_checking);
        if (bundle != null && !TextUtils.isEmpty(this.u)) {
            String str = this.u;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e31e9a834db53ee0bfe15db400c36b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e31e9a834db53ee0bfe15db400c36b9");
                return;
            } else if (str != null) {
                if (TextUtils.equals(str, "success")) {
                    b(this.v, this.w);
                    return;
                } else if (TextUtils.equals(str, "cancel")) {
                    if (getActivity() != null) {
                        getActivity().finish();
                        return;
                    }
                    return;
                } else if (TextUtils.equals(str, "error")) {
                    c();
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        b();
    }

    public static /* synthetic */ void a(CheckSecurityFragment checkSecurityFragment, View view) {
        Object[] objArr = {checkSecurityFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2b0626e8ad0aef773cd8e337f08733c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2b0626e8ad0aef773cd8e337f08733c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, checkSecurityFragment, changeQuickRedirect2, false, "62fbe2899f26f86ea803163bfdf4309a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, checkSecurityFragment, changeQuickRedirect2, false, "62fbe2899f26f86ea803163bfdf4309a");
        } else if (!checkSecurityFragment.o) {
            aj.a(checkSecurityFragment, "b_92geq5qg", "c_yn0znls4");
            b.a aVar = new b.a();
            aVar.b = checkSecurityFragment.t;
            aVar.c = checkSecurityFragment.d();
            aVar.d = checkSecurityFragment.p;
            com.sankuai.meituan.navigation.d.a(checkSecurityFragment.getView()).a(com.meituan.passport.retrieve.a.InputNewPassword.e, aVar.a());
        } else {
            checkSecurityFragment.b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33704222f4aa3e15ff5104b0539bc63b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33704222f4aa3e15ff5104b0539bc63b");
            return;
        }
        this.n = true;
        this.o = false;
        this.i.setImageResource(R.drawable.passport_checksecurity_checking);
        this.m.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.passport.retrieve.fragment.CheckSecurityFragment.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41bfbf101c4cc5072fbf7e4956ed36f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41bfbf101c4cc5072fbf7e4956ed36f6");
                } else {
                    CheckSecurityFragment.this.i.startAnimation(CheckSecurityFragment.this.m);
                }
            }
        });
        this.i.startAnimation(this.m);
        this.j.setVisibility(0);
        this.r.sendEmptyMessage(1);
        this.l.setVisibility(8);
        s.a(this, this, this, this.t, d(), this.p);
    }

    @Override // com.meituan.passport.converter.b
    public final boolean a(ApiException apiException, boolean z) {
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca9cb8d0449d26b427faee6539556b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca9cb8d0449d26b427faee6539556b2")).booleanValue();
        }
        c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86177efe4faa0b473116692a9f09d82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86177efe4faa0b473116692a9f09d82d");
            return;
        }
        this.n = false;
        this.o = true;
        this.i.setImageResource(R.drawable.passport_rebind_check_failed);
        this.j.setVisibility(8);
        this.i.clearAnimation();
        this.m.setAnimationListener(null);
        this.k.setText(R.string.passport_rebind_checksecurity_failed);
        this.l.setVisibility(0);
        this.l.setText(R.string.passport_rebind_checksecurity_recheck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84199ae5c14775e85ba3e480558a8d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84199ae5c14775e85ba3e480558a8d3");
            return;
        }
        b.a aVar = new b.a();
        aVar.b = this.t;
        aVar.c = d();
        aVar.d = this.p;
        aVar.e = str;
        aVar.f = str2;
        com.sankuai.meituan.navigation.d.a(getView()).a(com.meituan.passport.retrieve.a.InputNewPassword.e, aVar.a());
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc077513ec0939de8c9010a90105baf0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc077513ec0939de8c9010a90105baf0") : !TextUtils.isEmpty(this.s) ? this.s : "86";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9fb375ce468c8614e1eb2aee41ce5fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9fb375ce468c8614e1eb2aee41ce5fc")).booleanValue();
        }
        if (this.o || !isAdded()) {
            return true;
        }
        switch (message.what) {
            case 1:
                this.k.setText(R.string.passport_rebind_checksecurity_checking1);
                this.r.sendEmptyMessageDelayed(2, 667L);
                break;
            case 2:
                this.k.setText(R.string.passport_rebind_checksecurity_checking2);
                this.r.sendEmptyMessageDelayed(3, 667L);
                break;
            case 3:
                this.k.setText(R.string.passport_rebind_checksecurity_checking3);
                this.r.sendEmptyMessageAtTime(4, 667L);
                break;
            case 4:
                if (this.n) {
                    this.n = false;
                    break;
                } else if (this.q != null) {
                    if (TextUtils.isEmpty(this.q.requestCode)) {
                        this.i.setImageResource(R.drawable.passport_checksecurity_success);
                        this.j.setVisibility(8);
                        this.i.clearAnimation();
                        this.m.setAnimationListener(null);
                        this.k.setText(R.string.passport_retrieve_checksecurity_success);
                        this.l.setVisibility(0);
                        this.l.setText(R.string.passport_retrieve_checksecurity_toreset);
                        break;
                    } else {
                        new b.AbstractC0515b(this) { // from class: com.meituan.passport.retrieve.fragment.CheckSecurityFragment.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.passport.utils.b.AbstractC0515b
                            public final b.a a(b.a aVar) {
                                Object[] objArr2 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be93ead9d8fab7a0920c1cc57adc4200", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be93ead9d8fab7a0920c1cc57adc4200");
                                }
                                aVar.e = CheckSecurityFragment.this.q.requestCode;
                                return aVar;
                            }
                        }.a();
                        try {
                            com.meituan.android.yoda.d a2 = com.meituan.android.yoda.d.a();
                            a2.c = getString(R.string.passport_retrieve_login_password);
                            a2.b = R.style.PassportYodaStyle;
                            YodaConfirm.getInstance(getActivity(), new a(this)).registerBusinessUIConfig(a2).startConfirm(this.q.requestCode);
                            break;
                        } catch (Exception unused) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements YodaResponseListener {
        public static ChangeQuickRedirect a;
        private WeakReference<CheckSecurityFragment> b;

        public a(CheckSecurityFragment checkSecurityFragment) {
            Object[] objArr = {checkSecurityFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d67a738883313349d3fe6d9e21bd87", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d67a738883313349d3fe6d9e21bd87");
            } else {
                this.b = new WeakReference<>(checkSecurityFragment);
            }
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onYodaResponse(final String str, final String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ad5c2af257cc529f29ba089fde635c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ad5c2af257cc529f29ba089fde635c");
                return;
            }
            CheckSecurityFragment checkSecurityFragment = this.b.get();
            if (checkSecurityFragment != null) {
                new b.AbstractC0515b(checkSecurityFragment) { // from class: com.meituan.passport.retrieve.fragment.CheckSecurityFragment.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.utils.b.AbstractC0515b
                    public final b.a a(b.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23c256f38e2736bdb8e0c4590c9f6b0b", RobustBitConfig.DEFAULT_VALUE)) {
                            return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23c256f38e2736bdb8e0c4590c9f6b0b");
                        }
                        aVar.g = "success";
                        aVar.e = str;
                        aVar.f = str2;
                        return aVar;
                    }
                }.a();
            }
            if (checkSecurityFragment == null || !checkSecurityFragment.isVisible()) {
                return;
            }
            checkSecurityFragment.b(str, str2);
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onCancel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d82ee827cdcdc103f13cdf86a1acc63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d82ee827cdcdc103f13cdf86a1acc63");
                return;
            }
            CheckSecurityFragment checkSecurityFragment = this.b.get();
            if (checkSecurityFragment != null) {
                new b.AbstractC0515b(checkSecurityFragment) { // from class: com.meituan.passport.retrieve.fragment.CheckSecurityFragment.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.utils.b.AbstractC0515b
                    public final b.a a(b.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "684425b9e1a340cf72b7984f169f1fbb", RobustBitConfig.DEFAULT_VALUE)) {
                            return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "684425b9e1a340cf72b7984f169f1fbb");
                        }
                        aVar.g = "cancel";
                        return aVar;
                    }
                }.a();
            }
            if (checkSecurityFragment == null || !checkSecurityFragment.isVisible() || checkSecurityFragment.getActivity() == null) {
                return;
            }
            checkSecurityFragment.getActivity().finish();
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onError(String str, Error error) {
            Object[] objArr = {str, error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c96bccc98a0b4cd68ee652c3a829db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c96bccc98a0b4cd68ee652c3a829db");
                return;
            }
            CheckSecurityFragment checkSecurityFragment = this.b.get();
            if (checkSecurityFragment != null) {
                new b.AbstractC0515b(checkSecurityFragment) { // from class: com.meituan.passport.retrieve.fragment.CheckSecurityFragment.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.utils.b.AbstractC0515b
                    public final b.a a(b.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0a2a0bd549a2d4de71d9c1e01baa0e1", RobustBitConfig.DEFAULT_VALUE)) {
                            return (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0a2a0bd549a2d4de71d9c1e01baa0e1");
                        }
                        aVar.g = "error";
                        return aVar;
                    }
                }.a();
            }
            if (checkSecurityFragment == null || !checkSecurityFragment.isVisible()) {
                return;
            }
            checkSecurityFragment.c();
        }
    }
}
