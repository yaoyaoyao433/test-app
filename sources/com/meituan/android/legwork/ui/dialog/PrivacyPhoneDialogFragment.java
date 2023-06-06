package com.meituan.android.legwork.ui.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.legwork.bean.orderDetail.PrivacyPhoneBean;
import com.meituan.android.legwork.ui.base.BaseDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PrivacyPhoneDialogFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private RelativeLayout g;
    private TextView h;
    private LinearLayout i;
    private PrivacyPhoneBean j;
    private Map<String, Object> k;

    public static PrivacyPhoneDialogFragment a(PrivacyPhoneBean privacyPhoneBean, Map<String, Object> map) {
        Object[] objArr = {privacyPhoneBean, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e789f27334c055f5c1d8ef9564c780cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivacyPhoneDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e789f27334c055f5c1d8ef9564c780cb");
        }
        PrivacyPhoneDialogFragment privacyPhoneDialogFragment = new PrivacyPhoneDialogFragment();
        privacyPhoneDialogFragment.j = privacyPhoneBean;
        privacyPhoneDialogFragment.k = map;
        return privacyPhoneDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f0944b1fc35796f882200d552dcb0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f0944b1fc35796f882200d552dcb0d");
        }
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return layoutInflater.inflate(R.layout.legwork_dialog_privacy_phone, (ViewGroup) null);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4408596fd3297175ff60ec4c30bbb05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4408596fd3297175ff60ec4c30bbb05");
            return;
        }
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90dd8b69dbf9ba4b0024c7db6b375e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90dd8b69dbf9ba4b0024c7db6b375e2e");
            return;
        }
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.j = (PrivacyPhoneBean) com.sankuai.waimai.platform.utils.f.a(bundle, "mPrivacyPhoneBean");
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2037b4f93e7f29d6f73613941b56446c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2037b4f93e7f29d6f73613941b56446c");
            return;
        }
        this.c = (TextView) view.findViewById(R.id.legwork_privacy_bind_phone);
        this.d = (TextView) view.findViewById(R.id.legwork_privacy_change_bind_phone);
        this.e = (TextView) view.findViewById(R.id.legwork_privacy_negative_btn);
        this.f = (TextView) view.findViewById(R.id.legwork_privacy_positive_btn);
        this.g = (RelativeLayout) view.findViewById(R.id.legwork_privacy_base_container);
        this.i = (LinearLayout) view.findViewById(R.id.privacy_msg_container);
        this.h = (TextView) view.findViewById(R.id.privacy_tv);
        this.g.setOnClickListener(w.a(this));
        if (this.j != null && !TextUtils.isEmpty(this.j.userBindPhone)) {
            this.c.setText(this.j.userBindPhone);
        }
        this.f.setOnClickListener(x.a(this));
        this.d.setOnClickListener(y.a(this));
        this.e.setOnClickListener(z.a(this));
        if (this.j == null || TextUtils.isEmpty(this.j.privacyTipsMsg)) {
            this.i.setVisibility(8);
            return;
        }
        this.i.setVisibility(0);
        String str = this.j.privacyTipsMsg;
        com.meituan.android.legwork.ui.util.c cVar = new com.meituan.android.legwork.ui.util.c(getContext(), R.drawable.legwork_privacy_question);
        Object[] objArr3 = {12};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.ui.util.c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6023ab8471e43ad3cf6e1a26ce76c857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6023ab8471e43ad3cf6e1a26ce76c857");
        } else {
            cVar.b = com.meituan.android.legwork.utils.h.a(12);
        }
        SpannableString spannableString = new SpannableString(str + "  ");
        spannableString.setSpan(cVar, str.length() + 1, str.length() + 2, 33);
        spannableString.setSpan(new ClickableSpan() { // from class: com.meituan.android.legwork.ui.dialog.PrivacyPhoneDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.text.style.ClickableSpan
            public final void onClick(@NonNull View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "657d1d50f200932ff11828eb6fdd4cd3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "657d1d50f200932ff11828eb6fdd4cd3");
                } else if (TextUtils.isEmpty(PrivacyPhoneDialogFragment.this.j.privacyTipsUrl)) {
                } else {
                    com.meituan.android.legwork.utils.l.a(PrivacyPhoneDialogFragment.this.getActivity(), PrivacyPhoneDialogFragment.this.j.privacyTipsUrl);
                }
            }
        }, str.length() + 1, str.length() + 2, 33);
        this.h.setMovementMethod(LinkMovementMethod.getInstance());
        this.h.setText(spannableString);
    }

    public static /* synthetic */ void d(PrivacyPhoneDialogFragment privacyPhoneDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a1fe44ef4c16b2b5733afaf73b281f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a1fe44ef4c16b2b5733afaf73b281f3");
        } else {
            privacyPhoneDialogFragment.dismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ void c(PrivacyPhoneDialogFragment privacyPhoneDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bcca6c498ab784d172059df9076e447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bcca6c498ab784d172059df9076e447");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(privacyPhoneDialogFragment, "b_ofh34awh", privacyPhoneDialogFragment.j == null ? "" : privacyPhoneDialogFragment.j.cid, privacyPhoneDialogFragment.k);
        com.meituan.android.legwork.utils.e.a(privacyPhoneDialogFragment.j == null ? "" : privacyPhoneDialogFragment.j.riderPhoneNumber);
        HashMap hashMap = new HashMap(2);
        hashMap.put("type", "privacy");
        com.meituan.android.legwork.utils.q.a("legwork_tel_phone_type", 32, hashMap);
        privacyPhoneDialogFragment.dismiss();
    }

    public static /* synthetic */ void b(PrivacyPhoneDialogFragment privacyPhoneDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc942588799b3f6c8ae8a4562653ef88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc942588799b3f6c8ae8a4562653ef88");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(privacyPhoneDialogFragment, "b_sb0nihgq", privacyPhoneDialogFragment.j == null ? "" : privacyPhoneDialogFragment.j.cid, privacyPhoneDialogFragment.k);
        ChangeBindPhoneDialogFragment.a(privacyPhoneDialogFragment.j, privacyPhoneDialogFragment.k, privacyPhoneDialogFragment).show(privacyPhoneDialogFragment.getActivity().getSupportFragmentManager(), "ChangeBindPhoneDialogFragment");
    }

    public static /* synthetic */ void a(PrivacyPhoneDialogFragment privacyPhoneDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03e3456f054482d527eb3573e9e67462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03e3456f054482d527eb3573e9e67462");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(privacyPhoneDialogFragment, "b_p1pmdltb", privacyPhoneDialogFragment.j == null ? "" : privacyPhoneDialogFragment.j.cid, privacyPhoneDialogFragment.k);
        privacyPhoneDialogFragment.dismiss();
    }

    @Override // com.meituan.android.legwork.ui.base.BaseDialogFragment, android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4cffaa9e171a8077ff658d245fa5136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4cffaa9e171a8077ff658d245fa5136");
            return;
        }
        super.show(fragmentManager, str);
        com.meituan.android.legwork.statistics.a.a(this, "b_q1423dlh", this.k, this.j == null ? "" : this.j.cid);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4a4e4af7f1290f342efa1f3642d839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4a4e4af7f1290f342efa1f3642d839");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("mPrivacyPhoneBean", this.j);
    }
}
