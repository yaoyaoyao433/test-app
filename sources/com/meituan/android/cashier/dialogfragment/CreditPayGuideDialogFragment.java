package com.meituan.android.cashier.dialogfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.dialog.CreditPayGuideDialog;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CreditPayGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private CreditPayGuideDialog b;
    private PopDetailInfo c;
    private String d;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "CreditPayGuideDialogFragment";
    }

    public static CreditPayGuideDialogFragment a(String str, PopDetailInfo popDetailInfo) {
        Object[] objArr = {str, popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18fdbe688d090ed05f723a2ff70fe2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (CreditPayGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18fdbe688d090ed05f723a2ff70fe2fc");
        }
        CreditPayGuideDialogFragment creditPayGuideDialogFragment = new CreditPayGuideDialogFragment();
        Bundle bundle = new Bundle();
        if (popDetailInfo != null) {
            bundle.putSerializable("credit_pay_guide_info", popDetailInfo);
        }
        bundle.putString("credit_pay_pop_scene", str);
        creditPayGuideDialogFragment.setArguments(bundle);
        return creditPayGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263be1db9963facff41b06d2ce0d15d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263be1db9963facff41b06d2ce0d15d3");
        }
        setCancelable(false);
        f();
        return this.b;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ed549649b330e2f1d9392bea7049c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ed549649b330e2f1d9392bea7049c3");
        } else if (this.b == null) {
            this.b = new CreditPayGuideDialog(getContext(), this.d, this.c);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd7cd7732617146b53201220200e939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd7cd7732617146b53201220200e939");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.c = (PopDetailInfo) com.sankuai.waimai.platform.utils.f.a(arguments, "credit_pay_guide_info");
            this.d = arguments.getString("credit_pay_pop_scene");
        }
        if (bundle == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1779a2e22db7e965be39442a6499823", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1779a2e22db7e965be39442a6499823");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, this.d);
            q.a("paybiz_credit_guide_dialog_show", hashMap, (List<Float>) null, e());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d00e76dd4afc16d6b4b1bfe86ff44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d00e76dd4afc16d6b4b1bfe86ff44f");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        f();
        final CreditPayGuideDialog creditPayGuideDialog = this.b;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = CreditPayGuideDialog.a;
        if (PatchProxy.isSupport(objArr2, creditPayGuideDialog, changeQuickRedirect2, false, "b64d08ad584a18b93596e1d2b9359746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, creditPayGuideDialog, changeQuickRedirect2, false, "b64d08ad584a18b93596e1d2b9359746");
        } else if (i == 400) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = CreditPayGuideDialog.a;
            if (PatchProxy.isSupport(objArr3, creditPayGuideDialog, changeQuickRedirect3, false, "242a4918f3e58b429c51fd63fee34eda", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, creditPayGuideDialog, changeQuickRedirect3, false, "242a4918f3e58b429c51fd63fee34eda");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(KnbConstants.PARAMS_SCENE, "1");
                hashMap.put("url", creditPayGuideDialog.a());
                q.b("b_pay_credit_open_back_to_cashier_sc", hashMap, creditPayGuideDialog.b());
            }
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.cashier.dialog.CreditPayGuideDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr4 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "700c192cd2c4f2732d0faac1f75125a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "700c192cd2c4f2732d0faac1f75125a2");
                        return;
                    }
                    com.meituan.android.paybase.dialog.e.a(creditPayGuideDialog.getOwnerActivity(), (Object) "系统繁忙，请稍后重试");
                    creditPayGuideDialog.dismiss();
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr4 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f7e9aead3b20cbf61d7d6af4bf3d93e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f7e9aead3b20cbf61d7d6af4bf3d93e2");
                    } else if (TextUtils.isEmpty(str)) {
                        creditPayGuideDialog.c();
                    } else {
                        try {
                            CreditPayGuideDialog.a(creditPayGuideDialog, new JSONObject(str).optInt("fd_maidan_opened_status"));
                        } catch (JSONException unused) {
                            creditPayGuideDialog.c();
                        }
                    }
                }
            });
        }
        com.meituan.android.privacy.aop.a.f();
    }
}
