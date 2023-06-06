package com.meituan.android.pay.common.selectdialog.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.pay.common.payment.utils.d;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SelectBankDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a = null;
    private static final String c = "binding";
    private static final String d = "unbinding";
    public SelectBankDialog.b b;
    private com.meituan.android.pay.common.payment.data.a e;
    private com.meituan.android.pay.common.selectdialog.b f;
    private SelectBankDialog.c g;
    private int k;
    private boolean l;
    @MTPayNeedToPersist
    private String[] m;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "SelectBankDialogFragment";
    }

    public SelectBankDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c9a7e30beb3d9186cd5d76155bc3ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c9a7e30beb3d9186cd5d76155bc3ce");
        } else {
            this.l = true;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680644d0e4af3e9999ed998305f3b134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680644d0e4af3e9999ed998305f3b134");
            return;
        }
        super.onAttach(activity);
        if (this.b != null) {
            return;
        }
        if (getParentFragment() != null && (getParentFragment() instanceof SelectBankDialog.b)) {
            this.b = (SelectBankDialog.b) getParentFragment();
        } else if (activity instanceof SelectBankDialog.b) {
            this.b = (SelectBankDialog.b) activity;
        } else if (getTargetFragment() != null && (getTargetFragment() instanceof SelectBankDialog.b)) {
            this.b = (SelectBankDialog.b) getTargetFragment();
        }
        if (this.b == null) {
            dismiss();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "662f097db521381799169b241c135cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "662f097db521381799169b241c135cc8");
            return;
        }
        super.onDetach();
        this.b = null;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173bd0a231e9ad87ef6d961fa94cd9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173bd0a231e9ad87ef6d961fa94cd9e1");
        }
        SelectBankDialog.a aVar = new SelectBankDialog.a(getActivity(), this.l);
        com.meituan.android.pay.common.selectdialog.b bVar = this.f;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = SelectBankDialog.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f76a80dee0c1231f55820444c2d457f4", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (SelectBankDialog.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f76a80dee0c1231f55820444c2d457f4");
        } else {
            aVar.b.g = bVar;
        }
        com.meituan.android.pay.common.payment.data.a aVar2 = this.e;
        Object[] objArr3 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = SelectBankDialog.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c33d7eab95213c92a2d9c7dea29c4e7e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (SelectBankDialog.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c33d7eab95213c92a2d9c7dea29c4e7e");
        } else {
            aVar.b.b = aVar2;
        }
        SelectBankDialog.c cVar = this.g;
        Object[] objArr4 = {cVar};
        ChangeQuickRedirect changeQuickRedirect4 = SelectBankDialog.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "036682b6073f0244b7dad44a8c81fb7e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (SelectBankDialog.a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "036682b6073f0244b7dad44a8c81fb7e");
        } else {
            aVar.b.h = cVar;
        }
        int i = this.k;
        Object[] objArr5 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect5 = SelectBankDialog.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "24b79bcced2afa7fe3661c2f24afc34e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (SelectBankDialog.a) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "24b79bcced2afa7fe3661c2f24afc34e");
        } else {
            aVar.b.k = i;
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = SelectBankDialog.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "f9daf2c4e5a4308d5558e3252105e493", RobustBitConfig.DEFAULT_VALUE)) {
            return (SelectBankDialog) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "f9daf2c4e5a4308d5558e3252105e493");
        }
        SelectBankDialog.a(aVar.b);
        return aVar.b;
    }

    public static SelectBankDialogFragment a(com.meituan.android.pay.common.selectdialog.b bVar, com.meituan.android.pay.common.payment.data.a aVar, SelectBankDialog.c cVar, boolean z, int i) {
        Object[] objArr = {bVar, aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1e285cfd7d683858489cb8f264a8caa", RobustBitConfig.DEFAULT_VALUE)) {
            return (SelectBankDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1e285cfd7d683858489cb8f264a8caa");
        }
        SelectBankDialogFragment selectBankDialogFragment = new SelectBankDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("banklistpage", bVar);
        if (bVar != null) {
            bundle.putSerializable("selected_payment_index", Integer.valueOf(d.a(aVar, bVar)));
        }
        bundle.putInt("selected_dialog_mode", i);
        bundle.putSerializable("dialogtype", cVar);
        bundle.putSerializable("hasbg", Boolean.valueOf(z));
        selectBankDialogFragment.setArguments(bundle);
        com.meituan.android.pay.common.selectdialog.utils.a.a("mtzf_page");
        return selectBankDialogFragment;
    }

    public static SelectBankDialogFragment a(com.meituan.android.pay.common.selectdialog.b bVar, com.meituan.android.pay.common.payment.data.a aVar, SelectBankDialog.c cVar, int i) {
        Object[] objArr = {bVar, aVar, cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1009b290166c633c3fbeed083f1eaaef", RobustBitConfig.DEFAULT_VALUE)) {
            return (SelectBankDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1009b290166c633c3fbeed083f1eaaef");
        }
        SelectBankDialogFragment selectBankDialogFragment = new SelectBankDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("banklistpage", bVar);
        if (bVar != null) {
            bundle.putSerializable("selected_payment_index", Integer.valueOf(d.a(aVar, bVar)));
        }
        bundle.putInt("selected_dialog_mode", i);
        bundle.putSerializable("dialogtype", cVar);
        selectBankDialogFragment.setArguments(bundle);
        com.meituan.android.pay.common.selectdialog.utils.a.a("zhifu_page");
        return selectBankDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18aef70c14c2de21381b4a3e0e5f646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18aef70c14c2de21381b4a3e0e5f646");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f = (com.meituan.android.pay.common.selectdialog.b) f.a(arguments, "banklistpage");
            int intValue = ((Integer) f.a(arguments, "selected_payment_index")).intValue();
            if (this.f != null) {
                com.meituan.android.pay.common.selectdialog.b bVar = this.f;
                Object[] objArr2 = {Integer.valueOf(intValue), bVar};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                com.meituan.android.pay.common.payment.data.a aVar = null;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "940ecf58dc198307ebfd15031e9455c3", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "940ecf58dc198307ebfd15031e9455c3");
                } else {
                    List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
                    if (!i.a((Collection) mtPaymentList) && intValue >= 0 && intValue < mtPaymentList.size()) {
                        aVar = mtPaymentList.get(intValue);
                    }
                }
                this.e = aVar;
            }
            this.g = (SelectBankDialog.c) f.a(arguments, "dialogtype");
            if (f.a(arguments, "hasbg") != null) {
                this.l = ((Boolean) f.a(arguments, "hasbg")).booleanValue();
            }
            this.k = arguments.getInt("selected_dialog_mode");
        }
        if (bundle == null) {
            this.m = com.meituan.android.pay.common.payment.utils.a.b();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc22c597975554c4da2f4beccaad794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc22c597975554c4da2f4beccaad794");
        } else {
            super.a(dialog);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a70cc804773b240772d2ec479903a0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a70cc804773b240772d2ec479903a0e8");
            return;
        }
        super.onCancel(dialogInterface);
        if (getDialog() != null) {
            SelectBankDialog selectBankDialog = (SelectBankDialog) getDialog();
            if (this.b != null) {
                if (selectBankDialog.b != null) {
                    this.b.a(selectBankDialog.b);
                    com.meituan.android.pay.common.payment.data.a aVar = selectBankDialog.b;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50dcfc3b587af012953de0ff00bba890", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50dcfc3b587af012953de0ff00bba890");
                        return;
                    } else if (com.meituan.android.pay.common.payment.utils.a.a(this.m)) {
                        a.c a2 = new a.c().a("userid", com.meituan.android.paybase.config.a.d().i()).a(this.m[0], this.m[1]).a("nb_version", com.meituan.android.paybase.config.a.d().q());
                        if (this.f != null) {
                            a2.a("bindStatus", d.a(this.f) ? c : d);
                        }
                        JsonObject a3 = a(aVar);
                        if (a3 != null) {
                            a2.a("bank_name", a3.toString());
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_4qyo83d3", "", a2.b, a.EnumC0329a.CLICK, -1);
                        return;
                    } else {
                        return;
                    }
                }
                this.b.b();
            }
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final HashMap<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96237aee87a5b1e647630576baa60027", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96237aee87a5b1e647630576baa60027");
        }
        HashMap<String, Object> c2 = super.c();
        if (this.f == null || this.f.getMtPaymentList() == null || this.f.getMtPaymentList().size() == 0 || !com.meituan.android.pay.common.payment.utils.a.a(this.m)) {
            return c2;
        }
        c2.put(this.m[0], this.m[1]);
        JsonArray jsonArray = new JsonArray();
        for (com.meituan.android.pay.common.payment.data.a aVar : this.f.getMtPaymentList()) {
            JsonObject a2 = a(aVar);
            if (a2 != null) {
                jsonArray.add(a2);
            }
        }
        c2.put("bank_info", jsonArray.toString());
        if (!TextUtils.isEmpty(com.meituan.android.paybase.config.a.d().i())) {
            c2.put("userid", com.meituan.android.paybase.config.a.d().i());
        }
        c2.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        c2.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        c2.put("bindStatus", d.a(this.f) ? c : d);
        return c2;
    }

    private JsonObject a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef88a67cb53ec7f9bfdb8b50779dd4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef88a67cb53ec7f9bfdb8b50779dd4b");
        }
        if (aVar == null || TextUtils.isEmpty(aVar.getName())) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bank_name", aVar.getName());
        return jsonObject;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be2a92bbd189ed1a86a71cc7f9ff005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be2a92bbd189ed1a86a71cc7f9ff005");
            return;
        }
        super.onDestroy();
        com.meituan.android.pay.common.payment.utils.a.a();
    }

    public static void a(@NonNull String str, @NonNull String str2, Map<String, Object> map, boolean z) {
        Object[] objArr = {str, str2, map, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "328b3ca02bb2ab8578aadce42f521a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "328b3ca02bb2ab8578aadce42f521a86");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(str, str2);
        com.meituan.android.paybase.common.analyse.a.a(str, str2, map);
    }

    public static void a(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2358457e8d8f807caf6aa22878443e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2358457e8d8f807caf6aa22878443e5b");
        } else {
            com.meituan.android.paybase.common.analyse.a.b(str, str2, map);
        }
    }
}
