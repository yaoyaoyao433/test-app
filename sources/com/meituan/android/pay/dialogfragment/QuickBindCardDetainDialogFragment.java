package com.meituan.android.pay.dialogfragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.pay.model.bean.PopWindowInfo;
import com.meituan.android.pay.model.bean.ProtocolSign;
import com.meituan.android.pay.model.bean.QuickBankDetail;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuickBindCardDetainDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    public a b;
    public View.OnClickListener c;
    private PopWindowInfo d;
    private ArrayList<QuickBankDetail> e;
    private HashMap<String, Object> f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ProtocolSign protocolSign);
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "QuickBindCardDetainDialogFragment";
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815629bc196a073aa1790820af23cceb", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815629bc196a073aa1790820af23cceb");
        }
        setCancelable(false);
        return new QuickBindCardDetainDialog(getActivity(), this.d, this.e, this.f, this.b, this.c);
    }

    public static QuickBindCardDetainDialogFragment a(PopWindowInfo popWindowInfo, List<QuickBankDetail> list, HashMap<String, Object> hashMap) {
        Object[] objArr = {popWindowInfo, list, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d142797b944b1154b5eb160412e23d3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (QuickBindCardDetainDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d142797b944b1154b5eb160412e23d3f");
        }
        QuickBindCardDetainDialogFragment quickBindCardDetainDialogFragment = new QuickBindCardDetainDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("param_alert", popWindowInfo);
        if (list instanceof Serializable) {
            bundle.putSerializable("param_list", (Serializable) list);
        }
        bundle.putSerializable("param", hashMap);
        quickBindCardDetainDialogFragment.setArguments(bundle);
        return quickBindCardDetainDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ed39094bc30268cc2503fced8cf360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ed39094bc30268cc2503fced8cf360");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.d = (PopWindowInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "param_alert");
            this.e = (ArrayList) com.sankuai.waimai.platform.utils.f.a(getArguments(), "param_list");
            this.f = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "param");
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245919343d48c7319705614bbebf9b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245919343d48c7319705614bbebf9b50");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9590e4c36e1a8e5f0c365a58821ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9590e4c36e1a8e5f0c365a58821ff4");
            return;
        }
        this.b = null;
        super.onDetach();
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df0379c42fc3838c8badecd075adb32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df0379c42fc3838c8badecd075adb32");
        } else {
            super.onCancel(dialogInterface);
        }
    }
}
