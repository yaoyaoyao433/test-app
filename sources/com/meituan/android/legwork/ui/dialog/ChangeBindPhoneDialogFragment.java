package com.meituan.android.legwork.ui.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.android.legwork.bean.orderDetail.PrivacyPhoneBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.base.BaseDialogFragment;
import com.meituan.android.legwork.utils.ab;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChangeBindPhoneDialogFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect b;
    private EditText c;
    private TextView d;
    private TextView e;
    private Dialog f;
    private PrivacyPhoneBean g;
    private Map<String, Object> h;
    private PrivacyPhoneDialogFragment i;
    private rx.k j;
    private FragmentActivity k;
    private Map<String, Object> l;
    private final TextWatcher m;

    public ChangeBindPhoneDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e8543e588cc378d694d978e06e9a0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e8543e588cc378d694d978e06e9a0f");
            return;
        }
        this.l = new HashMap(4);
        this.m = new AnonymousClass1();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.dialog.ChangeBindPhoneDialogFragment$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements TextWatcher {
        public static ChangeQuickRedirect a;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AnonymousClass1() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab894c65553ea00bebdbb56921ce9acd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab894c65553ea00bebdbb56921ce9acd");
            } else if (charSequence != null && charSequence.length() != 0) {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < charSequence.length(); i4++) {
                    if (i4 == 3 || i4 == 8 || charSequence.charAt(i4) != ' ') {
                        sb.append(charSequence.charAt(i4));
                        if ((sb.length() == 4 || sb.length() == 9) && sb.charAt(sb.length() - 1) != ' ') {
                            sb.insert(sb.length() - 1, Constants.SPACE);
                        }
                    }
                }
                if (sb.toString().equals(charSequence.toString())) {
                    return;
                }
                int i5 = i + 1;
                try {
                    if (sb.charAt(i) == ' ') {
                        i5 = i2 == 0 ? i5 + 1 : i5 - 1;
                    } else if (i2 == 1) {
                        i5--;
                    }
                    ChangeBindPhoneDialogFragment.this.c.post(n.a(this, sb, i5));
                } catch (Exception e) {
                    com.meituan.android.legwork.utils.x.e("ChangeBindPhoneDialogFragment.mTextWatcher.onTextChanged()", "exception msg:", e);
                    com.meituan.android.legwork.utils.x.a(e);
                }
            }
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, StringBuilder sb, int i) {
            Object[] objArr = {anonymousClass1, sb, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f9e395bb5b9b9a03752790cadc7b9bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f9e395bb5b9b9a03752790cadc7b9bb");
                return;
            }
            ChangeBindPhoneDialogFragment.this.c.setText(sb.toString());
            ChangeBindPhoneDialogFragment.this.c.setSelection(i);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object[] objArr = {editable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75bfac0885c48ab309c1b6dcf2dc39a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75bfac0885c48ab309c1b6dcf2dc39a4");
            } else if (Pattern.matches("^[\\d]{11}", editable.toString().replace(StringUtil.SPACE, ""))) {
                ChangeBindPhoneDialogFragment.this.e.setEnabled(true);
                ChangeBindPhoneDialogFragment.this.e.setTextColor(ChangeBindPhoneDialogFragment.this.e.getContext().getResources().getColor(R.color.legwork_common_text_color_FFFFB000));
            } else {
                ChangeBindPhoneDialogFragment.this.e.setEnabled(false);
                ChangeBindPhoneDialogFragment.this.e.setTextColor(ChangeBindPhoneDialogFragment.this.e.getContext().getResources().getColor(R.color.legwork_preview_to_pay_btn_disable));
            }
        }
    }

    public static ChangeBindPhoneDialogFragment a(PrivacyPhoneBean privacyPhoneBean, Map<String, Object> map, PrivacyPhoneDialogFragment privacyPhoneDialogFragment) {
        Object[] objArr = {privacyPhoneBean, map, privacyPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86a5b8dceed4af6ce4acee9796a4ab1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ChangeBindPhoneDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86a5b8dceed4af6ce4acee9796a4ab1c");
        }
        ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment = new ChangeBindPhoneDialogFragment();
        changeBindPhoneDialogFragment.g = privacyPhoneBean;
        changeBindPhoneDialogFragment.h = map;
        changeBindPhoneDialogFragment.i = privacyPhoneDialogFragment;
        return changeBindPhoneDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dddcde56bdb00dc4e00a89a8ee10fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dddcde56bdb00dc4e00a89a8ee10fd");
        }
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return layoutInflater.inflate(R.layout.legwork_dialog_change_bind_phone, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fab1e856ea73c2ba49576b348f4f440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fab1e856ea73c2ba49576b348f4f440");
            return;
        }
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.g = (PrivacyPhoneBean) com.sankuai.waimai.platform.utils.f.a(bundle, "privacyPhoneBean");
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abff41e0dda8af9cbe52e41480fa0421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abff41e0dda8af9cbe52e41480fa0421");
        } else {
            this.c = (EditText) view.findViewById(R.id.legwork_change_bind_phone_et);
            this.c.post(j.a(this));
            this.d = (TextView) view.findViewById(R.id.legwork_privacy_negative_btn);
            this.e = (TextView) view.findViewById(R.id.legwork_privacy_positive_btn);
            this.c.addTextChangedListener(this.m);
            this.e.setOnClickListener(k.a(this));
            this.d.setOnClickListener(l.a(this));
        }
        this.k = getActivity();
    }

    public static /* synthetic */ void a(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        Object[] objArr = {changeBindPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9be3f6d5c91094e4ddd8db282f2f5177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9be3f6d5c91094e4ddd8db282f2f5177");
            return;
        }
        EditText editText = changeBindPhoneDialogFragment.c;
        Object[] objArr2 = {editText};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.utils.p.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "382424d2cbe852007d5ad221c3767fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "382424d2cbe852007d5ad221c3767fda");
        } else if (com.meituan.android.legwork.a.a() != null) {
            try {
                ((InputMethodManager) com.meituan.android.legwork.a.a().getSystemService("input_method")).showSoftInput(editText, 0);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void b(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment, View view) {
        Object[] objArr = {changeBindPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51b9922c9292f30b47fdc512b25ec99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51b9922c9292f30b47fdc512b25ec99e");
            return;
        }
        String replace = changeBindPhoneDialogFragment.c.getText().toString().replace(StringUtil.SPACE, "");
        com.meituan.android.legwork.statistics.a.a(changeBindPhoneDialogFragment, "b_pou49vqt", changeBindPhoneDialogFragment.g == null ? "" : changeBindPhoneDialogFragment.g.cid, changeBindPhoneDialogFragment.h);
        if (TextUtils.isEmpty(replace)) {
            return;
        }
        Object[] objArr2 = {(byte) 1, null};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, changeBindPhoneDialogFragment, changeQuickRedirect2, false, "95b9371201083e393fc5e07268d9f5d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, changeBindPhoneDialogFragment, changeQuickRedirect2, false, "95b9371201083e393fc5e07268d9f5d2");
        } else {
            if (changeBindPhoneDialogFragment.f == null) {
                changeBindPhoneDialogFragment.f = new Dialog(changeBindPhoneDialogFragment.getContext(), R.style.legwork_loading_progress);
                changeBindPhoneDialogFragment.f.setContentView(R.layout.legwork_loading_flower);
                changeBindPhoneDialogFragment.f.setCancelable(true);
            }
            try {
                if (!changeBindPhoneDialogFragment.f.isShowing()) {
                    changeBindPhoneDialogFragment.f.show();
                }
            } catch (Exception unused) {
            }
        }
        changeBindPhoneDialogFragment.l.put("status", "start");
        com.meituan.android.legwork.utils.q.a("legwork_update_privacy_bind_phone", 32, changeBindPhoneDialogFragment.l);
        changeBindPhoneDialogFragment.j = rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PrivacyPhoneBean>() { // from class: com.meituan.android.legwork.ui.dialog.ChangeBindPhoneDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(PrivacyPhoneBean privacyPhoneBean) {
                PrivacyPhoneBean privacyPhoneBean2 = privacyPhoneBean;
                Object[] objArr3 = {privacyPhoneBean2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3cc8aae0765cd8f1349d3f69da48947", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3cc8aae0765cd8f1349d3f69da48947");
                    return;
                }
                ChangeBindPhoneDialogFragment.this.b();
                ChangeBindPhoneDialogFragment.this.dismissAllowingStateLoss();
                Pattern compile = Pattern.compile("[0-9]*");
                if (privacyPhoneBean2 == null || TextUtils.isEmpty(privacyPhoneBean2.riderPhoneNumber) || !compile.matcher(privacyPhoneBean2.riderPhoneNumber).matches()) {
                    PrivacyPhoneBean a2 = com.meituan.android.legwork.utils.y.a().a(privacyPhoneBean2 == null ? "" : privacyPhoneBean2.orderId);
                    if (a2 != null && !a2.isPrivacy && !TextUtils.isEmpty(a2.riderPhoneNumber)) {
                        ChangeBindPhoneDialogFragment.this.a("隐私号服务系统维护中", "可使用您的真实号码继续呼叫", a2.riderPhoneNumber);
                    } else {
                        ab.a("更新绑定号码失败，请稍后重试");
                    }
                    ChangeBindPhoneDialogFragment.this.l.put("status", "error");
                    com.meituan.android.legwork.utils.q.a("legwork_update_privacy_bind_phone", 32, ChangeBindPhoneDialogFragment.this.l);
                    return;
                }
                if (privacyPhoneBean2.isPrivacy) {
                    com.meituan.android.legwork.utils.e.a(privacyPhoneBean2.riderPhoneNumber);
                    ChangeBindPhoneDialogFragment.this.l.put("status", "success");
                    ChangeBindPhoneDialogFragment.this.l.put("type", "privacy");
                    com.meituan.android.legwork.utils.q.a("legwork_tel_phone_type", 32, ChangeBindPhoneDialogFragment.this.l);
                } else {
                    ChangeBindPhoneDialogFragment.this.a("隐私号服务系统维护中", "可使用您的真实号码继续呼叫", privacyPhoneBean2.riderPhoneNumber);
                    ChangeBindPhoneDialogFragment.this.l.put("status", "degrade");
                }
                com.meituan.android.legwork.utils.q.a("legwork_update_privacy_bind_phone", 32, ChangeBindPhoneDialogFragment.this.l);
                privacyPhoneBean2.orderId = ChangeBindPhoneDialogFragment.this.g == null ? "" : ChangeBindPhoneDialogFragment.this.g.orderId;
                com.meituan.android.legwork.utils.y.a().a(privacyPhoneBean2);
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1197ab9ce28a1117da975e34c67a2140", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1197ab9ce28a1117da975e34c67a2140");
                    return;
                }
                ChangeBindPhoneDialogFragment.this.b();
                ChangeBindPhoneDialogFragment.this.l.clear();
                ChangeBindPhoneDialogFragment.this.l.put("status", "error");
                com.meituan.android.legwork.utils.q.a("legwork_update_privacy_bind_phone", 32, ChangeBindPhoneDialogFragment.this.l);
                if (z) {
                    ab.a(ChangeBindPhoneDialogFragment.this.c, "更新绑定号码失败，请稍后重试");
                } else {
                    ab.a(ChangeBindPhoneDialogFragment.this.c, str);
                }
            }
        }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).updateBindPhone(changeBindPhoneDialogFragment.g == null ? "" : changeBindPhoneDialogFragment.g.orderId, replace).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    public static /* synthetic */ void a(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment, View view) {
        Object[] objArr = {changeBindPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36c656d7b9e29e5594016903d243d904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36c656d7b9e29e5594016903d243d904");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(changeBindPhoneDialogFragment, "b_7os0wgw3", changeBindPhoneDialogFragment.g == null ? "" : changeBindPhoneDialogFragment.g.cid, changeBindPhoneDialogFragment.h);
        changeBindPhoneDialogFragment.dismiss();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472198c42061cb3d1b6fba717b0505cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472198c42061cb3d1b6fba717b0505cc");
            return;
        }
        if (this.c != null) {
            this.c.removeTextChangedListener(this.m);
        }
        if (this.j != null && !this.j.isUnsubscribed()) {
            this.j.unsubscribe();
        }
        super.onDestroy();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c0cf4ea8e90d80f2951367f7df8a50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c0cf4ea8e90d80f2951367f7df8a50");
        } else if (this.f == null || !this.f.isShowing()) {
        } else {
            try {
                this.f.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseDialogFragment, android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e2368bf73c9cee3e0fc9262adcbf21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e2368bf73c9cee3e0fc9262adcbf21");
            return;
        }
        super.show(fragmentManager, str);
        com.meituan.android.legwork.statistics.a.a(this, "b_koo417lb", this.h, this.g == null ? "" : this.g.cid);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b15154c115fbf93e2c5a7b0366e36b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b15154c115fbf93e2c5a7b0366e36b1");
            return;
        }
        dismissAllowingStateLoss();
        PrivacyPhoneDegradeDialogFragment a = PrivacyPhoneDegradeDialogFragment.a(str, str2, str3);
        a.c = m.a();
        this.l.put("type", "real");
        com.meituan.android.legwork.utils.q.a("legwork_tel_phone_type", 32, this.l);
        a.show(this.k.getSupportFragmentManager(), "PrivacyPhoneDegradeDialogFragment");
    }

    public static /* synthetic */ void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a750b363558faa9793864e4b984b2b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a750b363558faa9793864e4b984b2b5");
        } else {
            com.meituan.android.legwork.utils.e.a(str);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89402a6ad9b5a3e318e2faf05d2e31b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89402a6ad9b5a3e318e2faf05d2e31b8");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("privacyPhoneBean", this.g);
    }
}
