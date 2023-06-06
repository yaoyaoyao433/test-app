package com.meituan.passport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dianping.titans.utils.StorageUtil;
import com.google.gson.Gson;
import com.meituan.passport.dialogs.ConfirmDialog;
import com.meituan.passport.dialogs.OtherLoginDialogFragment;
import com.meituan.passport.login.d;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BasePassportFragment extends Fragment {
    public static ChangeQuickRedirect a;
    protected PopupWindow b;
    protected n c;
    protected boolean d;
    protected boolean e;
    protected View.OnClickListener f;
    protected Runnable g;

    @LayoutRes
    public abstract int W_();

    public abstract void a(Bundle bundle);

    public void a(View view) {
    }

    public abstract void a(View view, Bundle bundle);

    public void a(CountryData countryData) {
    }

    public BasePassportFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6bce9546bb7a217ef3e5f2325af512", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6bce9546bb7a217ef3e5f2325af512");
            return;
        }
        this.f = new View.OnClickListener() { // from class: com.meituan.passport.BasePassportFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bdb0a2aaacde8ef7640c463f27cac07", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bdb0a2aaacde8ef7640c463f27cac07");
                } else if (BasePassportFragment.this.c != null) {
                    BasePassportFragment.this.c.a(view);
                } else {
                    BasePassportFragment.this.a(view);
                }
            }
        };
        this.g = new Runnable() { // from class: com.meituan.passport.BasePassportFragment.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79b98e9befdafb27ae70a140acae8e64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79b98e9befdafb27ae70a140acae8e64");
                } else if (BasePassportFragment.this.c instanceof l) {
                    ((l) BasePassportFragment.this.c).a();
                }
            }
        };
    }

    public static final <T extends Fragment> T a(Class<T> cls, Bundle bundle) {
        T t;
        Object[] objArr = {cls, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e68eac41a29864ccd013cabfa24763d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e68eac41a29864ccd013cabfa24763d0");
        }
        try {
            t = cls.newInstance();
            try {
                t.setArguments(bundle);
            } catch (IllegalAccessException e) {
                e = e;
                com.meituan.passport.utils.m.a(e);
                return t;
            } catch (InstantiationException e2) {
                e = e2;
                com.meituan.passport.utils.m.a(e);
                return t;
            }
        } catch (IllegalAccessException e3) {
            e = e3;
            t = null;
        } catch (InstantiationException e4) {
            e = e4;
            t = null;
        }
        return t;
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0b4b6887252bef916ab94f1af2ee41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0b4b6887252bef916ab94f1af2ee41");
            return;
        }
        this.e = Utils.c();
        super.onCreate(bundle);
        a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6f7b39d950a78a6d7dc0e805230d91", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6f7b39d950a78a6d7dc0e805230d91") : layoutInflater.inflate(W_(), viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f8644863d17494a3ccef932260429a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f8644863d17494a3ccef932260429a");
            return;
        }
        super.onViewCreated(view, bundle);
        a(view, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2cbe03ce1bf3b51fd1d358fdaee4cd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2cbe03ce1bf3b51fd1d358fdaee4cd4");
            return;
        }
        super.onResume();
        if (this.e) {
            return;
        }
        this.e = Utils.c();
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60baa258399bfb26228e2f2cd4ac0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60baa258399bfb26228e2f2cd4ac0e1");
            return;
        }
        StorageUtil.putSharedValue(getActivity(), "Channel.Account.Mobile", str, 0);
        StorageUtil.putSharedValue(getActivity(), "Channel.Account.CountryCode", str2, 0);
        StorageUtil.putSharedValue(getActivity(), "Channel.Account.JoinKey", PassportConfig.m(), 0);
        StorageUtil.putSharedValue(getActivity(), "Channel.Account.HelpURL", com.meituan.passport.utils.e.a().a(getActivity()), 0);
        StorageUtil.putSharedValue(getActivity(), "Channel.Account.AppKey", PassportConfig.g(), 0);
    }

    public final void a(View view, final View view2, String str, String str2, @Nullable String str3) {
        Object[] objArr = {view, view2, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cf2cca72ef4c2713308dc7eb7c5b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cf2cca72ef4c2713308dc7eb7c5b34");
            return;
        }
        if ((!PassportConfig.b() || !TextUtils.equals(str, "-1")) && PassportConfig.b()) {
            com.meituan.passport.plugins.q.a().h();
        }
        if (getContext() == null) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.passport_translate_checkbox_shake);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.passport.BasePassportFragment.3
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44f78b7b4ac170e35278383a5550f02a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44f78b7b4ac170e35278383a5550f02a");
                } else {
                    BasePassportFragment.this.a(view2, 0);
                }
            }
        });
        view.startAnimation(loadAnimation);
    }

    public final void a(String str, final String str2, final View.OnClickListener onClickListener) {
        int i;
        int i2;
        char c;
        Object[] objArr = {str, str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab9402effbde363ae893a11330bcc5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab9402effbde363ae893a11330bcc5d");
            return;
        }
        if (this.b != null) {
            com.sankuai.waimai.platform.utils.p.b(this.b);
        }
        Object[] objArr2 = {str, str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c41a4b746b5272914419345c44e4fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c41a4b746b5272914419345c44e4fd1");
            return;
        }
        if (com.meituan.passport.utils.ab.a() == 1) {
            i = R.string.passport_login_term_agreed_elder;
            if (TextUtils.equals(str, "0")) {
                i = R.string.passport_elder_telecom_term_agreed;
            } else if (TextUtils.equals(str, "1")) {
                i = R.string.passport_elder_mobile_term_agreed;
            } else if (TextUtils.equals(str, "2")) {
                i = R.string.passport_elder_unicom_term_agreed;
            }
            i2 = R.layout.passport_fragment_elder_privacy_agreement_dialog;
        } else {
            i = R.string.passport_login_privacy_agreement_agreed;
            if (TextUtils.equals(str, "0")) {
                i = R.string.passport_login_privacy_agreement_agreed_telecom;
            } else if (TextUtils.equals(str, "1")) {
                i = R.string.passport_login_privacy_agreement_agreed_chinamobile;
            } else if (TextUtils.equals(str, "2")) {
                i = R.string.passport_login_privacy_agreement_agreed_china_unicom;
            }
            i2 = R.layout.passport_fragment_privacy_agreement_dialog;
        }
        ConfirmDialog.a a2 = ConfirmDialog.a.a();
        a2.d = i;
        a2.f = getString(R.string.passport_elder_reject);
        a2.i = new View.OnClickListener() { // from class: com.meituan.passport.BasePassportFragment.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74bfe4674b65bc72d9d4d6d107d4a57f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74bfe4674b65bc72d9d4d6d107d4a57f");
                } else {
                    com.meituan.passport.utils.p.a().c(BasePassportFragment.this.getActivity(), "拒绝", str2);
                }
            }
        };
        a2.e = getString(R.string.passport_elder_agree);
        a2.h = new View.OnClickListener() { // from class: com.meituan.passport.BasePassportFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a76baf72999117e731a415d3472fd8b1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a76baf72999117e731a415d3472fd8b1");
                    return;
                }
                com.meituan.passport.utils.p.a().c(BasePassportFragment.this.getActivity(), "同意", str2);
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
        a2.k = 2;
        a2.l = i2;
        if (this.e) {
            a2.m = str;
            c = 1;
            a2.n = true;
        } else {
            c = 1;
        }
        a2.b().show(getChildFragmentManager(), "privacyAgreementDialog");
        com.meituan.passport.utils.p a3 = com.meituan.passport.utils.p.a();
        FragmentActivity activity = getActivity();
        Object[] objArr3 = new Object[2];
        objArr3[0] = activity;
        objArr3[c] = str2;
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.p.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "f29eeac29a942cda9d605f2a6bbf6aa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "f29eeac29a942cda9d605f2a6bbf6aa2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", a3.a(str2));
        hashMap.put("sort_type", Integer.valueOf(a3.b()));
        com.meituan.passport.utils.aj.b(activity, "b_group_mt51kj0a_mv", "c_edycunb", hashMap);
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf09aa02a5a965fd3795033b5372e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf09aa02a5a965fd3795033b5372e88");
            return;
        }
        int i2 = com.meituan.passport.utils.ab.a() == 1 ? R.layout.passport_elder_popupwindow_bg : R.layout.passport_popupwindow_bg;
        Context context = getContext();
        if (context == null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        if (Build.VERSION.SDK_INT < 23) {
            inflate.setBackground(null);
        }
        if (com.meituan.passport.utils.ab.a() == 1) {
            this.b = new PopupWindow(inflate, (int) (getResources().getDisplayMetrics().density * 196.0f), (int) (getResources().getDisplayMetrics().density * 62.0f));
        } else {
            this.b = new PopupWindow(inflate, (int) (getResources().getDisplayMetrics().density * 104.0f), (int) (getResources().getDisplayMetrics().density * 28.0f));
        }
        if (Build.VERSION.SDK_INT < 23) {
            this.b.setBackgroundDrawable(getResources().getDrawable(com.meituan.passport.utils.ab.a() == 1 ? R.drawable.passport_index_elder_tip_background : R.drawable.passport_index_tip_background));
        }
        if (com.meituan.passport.utils.ab.a() == 1) {
            com.sankuai.waimai.platform.utils.p.a(this.b, view, i, -((int) (getResources().getDisplayMetrics().density * 62.0f)));
        } else if (com.meituan.passport.utils.ab.a() == 2) {
            com.sankuai.waimai.platform.utils.p.a(this.b, view, i, -((int) (getResources().getDisplayMetrics().density * 50.0f)));
        } else {
            com.sankuai.waimai.platform.utils.p.a(this.b, view, i, -((int) (getResources().getDisplayMetrics().density * 28.0f)));
        }
        this.b.setFocusable(false);
        this.b.setOutsideTouchable(true);
        this.b.update();
        if (inflate != null) {
            final TextView textView = (TextView) inflate.findViewById(R.id.passport_account_privacy_tips);
            textView.post(new Runnable() { // from class: com.meituan.passport.BasePassportFragment.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5390c296c9f5cbb9164135f13772acee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5390c296c9f5cbb9164135f13772acee");
                    } else {
                        textView.sendAccessibilityEvent(128);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class CountryInfoBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private WeakReference<Fragment> b;

        public CountryInfoBroadcastReceiver(Fragment fragment) {
            Object[] objArr = {fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507a0bd1c200f903636404bfe1fd3d08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507a0bd1c200f903636404bfe1fd3d08");
            } else {
                this.b = new WeakReference<>(fragment);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            CountryData countryData;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "517fa3b276828e1c1ccc5e836f85891e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "517fa3b276828e1c1ccc5e836f85891e");
            } else if (context == null || intent == null || intent.getAction() == null || !TextUtils.equals(intent.getAction(), CountryData.COUNTRY_INFO)) {
            } else {
                Fragment fragment = this.b.get();
                if ((fragment instanceof BasePassportFragment) && (extras = intent.getExtras()) != null) {
                    try {
                        countryData = (CountryData) new Gson().fromJson(extras.getString("data"), (Class<Object>) CountryData.class);
                    } catch (Exception e) {
                        com.meituan.passport.utils.m.a(e);
                        countryData = null;
                    }
                    ((BasePassportFragment) fragment).a(countryData);
                }
            }
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9d6333507491e5ea41c036678ebc1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9d6333507491e5ea41c036678ebc1b");
        } else if (view == null) {
        } else {
            String packageName = com.meituan.android.singleton.b.a().getPackageName();
            TextView textView = (TextView) view.findViewById(R.id.passport_index_title);
            if ((TextUtils.equals(packageName, "com.xgfe.android.starfish") || TextUtils.equals(packageName, "com.xgfe.android.delivery")) && textView != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.topMargin = 0;
                textView.setLayoutParams(layoutParams);
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.papssport_mobile_scrollview);
                if (scrollView != null) {
                    scrollView.setScrollBarFadeDuration(0);
                }
            }
        }
    }

    public final void a(View view, Bundle bundle, d.b bVar, String str) {
        Object[] objArr = {view, bundle, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2facee62e0846d66f312c9f30c9808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2facee62e0846d66f312c9f30c9808");
            return;
        }
        if (bundle != null) {
            bundle.putString("arg_fragment_type", bVar.g);
        }
        final OtherLoginDialogFragment otherLoginDialogFragment = new OtherLoginDialogFragment();
        otherLoginDialogFragment.d = bVar;
        otherLoginDialogFragment.f = view;
        otherLoginDialogFragment.setArguments(bundle);
        otherLoginDialogFragment.g = this;
        otherLoginDialogFragment.e = new OtherLoginDialogFragment.a() { // from class: com.meituan.passport.BasePassportFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.dialogs.OtherLoginDialogFragment.a
            public final void a(final String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0bf9aaf73351e2acef08c4ebd2d036b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0bf9aaf73351e2acef08c4ebd2d036b");
                } else if (TextUtils.isEmpty(str2)) {
                } else {
                    if (TextUtils.equals(str2, UserCenter.OAUTH_TYPE_WEIXIN)) {
                        BasePassportFragment.this.a("-1", str2, new View.OnClickListener() { // from class: com.meituan.passport.BasePassportFragment.5.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b04c4ac426d4f3bd3120f231882132ce", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b04c4ac426d4f3bd3120f231882132ce");
                                    return;
                                }
                                if (BasePassportFragment.this.c instanceof l) {
                                    ((l) BasePassportFragment.this.c).a(true);
                                }
                                OAuthItem from = OAuthItem.from(str2);
                                otherLoginDialogFragment.a(from.type, from.name);
                            }
                        });
                        return;
                    }
                    OAuthItem from = OAuthItem.from(str2);
                    otherLoginDialogFragment.a(from.type, from.name);
                }
            }
        };
        otherLoginDialogFragment.show(getChildFragmentManager(), "otherLoginServiceDialog");
    }
}
