package com.meituan.android.legwork.ui.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.android.legwork.ui.base.BaseDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PrivacyPhoneDegradeDialogFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect b;
    public a c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private String h;
    private String i;
    private String j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public static PrivacyPhoneDegradeDialogFragment a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "700bed336b0f3b7d0a7d8e857b2f2068", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivacyPhoneDegradeDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "700bed336b0f3b7d0a7d8e857b2f2068");
        }
        PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment = new PrivacyPhoneDegradeDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_TITLE", str);
        bundle.putString("KEY_SUB_TITLE", str2);
        bundle.putString("KEY_RIDER_PHONE", str3);
        privacyPhoneDegradeDialogFragment.setArguments(bundle);
        return privacyPhoneDegradeDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1c5afbb5a0a9743edbcab018aca1ee", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1c5afbb5a0a9743edbcab018aca1ee") : layoutInflater.inflate(R.layout.legwork_dialog_privacy_phone_degrade, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2044713a533c1bc652185c764dffe64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2044713a533c1bc652185c764dffe64");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c11fa6d22deae7266136ac0361698e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c11fa6d22deae7266136ac0361698e7");
            return;
        }
        this.d = (TextView) view.findViewById(R.id.privacy_phone_degrade_title);
        this.e = (TextView) view.findViewById(R.id.privacy_phone_degrade_sub_title);
        this.f = (TextView) view.findViewById(R.id.legwork_privacy_negative_btn);
        this.g = (TextView) view.findViewById(R.id.legwork_privacy_positive_btn);
        this.h = getArguments().getString("KEY_TITLE");
        this.i = getArguments().getString("KEY_SUB_TITLE");
        this.j = getArguments().getString("KEY_RIDER_PHONE");
        if (!TextUtils.isEmpty(this.h)) {
            this.d.setText(this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.e.setText(this.i);
        }
        this.g.setOnClickListener(u.a(this));
        this.f.setOnClickListener(v.a(this));
    }

    public static /* synthetic */ void b(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDegradeDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "499d2f522ddca1cec95e196ea47d72e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "499d2f522ddca1cec95e196ea47d72e3");
            return;
        }
        if (privacyPhoneDegradeDialogFragment.c != null) {
            privacyPhoneDegradeDialogFragment.c.a(privacyPhoneDegradeDialogFragment.j);
        }
        privacyPhoneDegradeDialogFragment.dismiss();
    }

    public static /* synthetic */ void a(PrivacyPhoneDegradeDialogFragment privacyPhoneDegradeDialogFragment, View view) {
        Object[] objArr = {privacyPhoneDegradeDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f961088d76ddd9f516f677a737acb86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f961088d76ddd9f516f677a737acb86");
        } else {
            privacyPhoneDegradeDialogFragment.dismiss();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e64fad304f38ff3aff0960175b045a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e64fad304f38ff3aff0960175b045a");
            return;
        }
        super.onStart();
        Window window = getDialog().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.legwork_white)));
        window.setLayout(-2, -2);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        window.setAttributes(attributes);
    }
}
