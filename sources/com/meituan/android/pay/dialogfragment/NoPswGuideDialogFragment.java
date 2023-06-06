package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.NoPasswordGuide;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.widgets.agreement.AgreementBean;
import com.meituan.android.paybase.widgets.agreement.AgreementView;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NoPswGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private BankInfo b;
    private HashMap<String, String> c;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "NoPswGuideDialogFragment";
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36912021f40dec8c4b9f5f29effaf757", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36912021f40dec8c4b9f5f29effaf757");
        }
        setCancelable(false);
        return new NoPswGuideDialog(getActivity(), this.b, this.c);
    }

    public static NoPswGuideDialogFragment a(BankInfo bankInfo, HashMap<String, String> hashMap) {
        Object[] objArr = {bankInfo, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc571bad26e5a4d30dbd1228ab993864", RobustBitConfig.DEFAULT_VALUE)) {
            return (NoPswGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc571bad26e5a4d30dbd1228ab993864");
        }
        NoPswGuideDialogFragment noPswGuideDialogFragment = new NoPswGuideDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bankInfo", bankInfo);
        bundle.putSerializable("extraData", hashMap);
        noPswGuideDialogFragment.setArguments(bundle);
        return noPswGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86252ade6e0c1be1c2c25fcd57c1b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86252ade6e0c1be1c2c25fcd57c1b53");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (BankInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
            this.c = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extraData");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class NoPswGuideDialog extends BaseDialog implements com.meituan.android.paybase.retrofit.b {
        public static ChangeQuickRedirect a;
        private Context e;
        private BankInfo f;
        private HashMap<String, String> g;

        public NoPswGuideDialog(Context context, BankInfo bankInfo, HashMap<String, String> hashMap) {
            super(context, R.style.mpay__transparent_dialog);
            AgreementBean agreementBean;
            Object[] objArr = {NoPswGuideDialogFragment.this, context, bankInfo, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86b5928b8857252ce0743c8f6e861d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86b5928b8857252ce0743c8f6e861d2");
                return;
            }
            this.f = bankInfo;
            this.g = hashMap;
            this.e = context;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cc5db5c859a261eae33409d470d02db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cc5db5c859a261eae33409d470d02db");
                return;
            }
            NoPasswordGuide noPasswordGuice = this.f.getNoPasswordGuice();
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__dialog_no_password_guide, (ViewGroup) null);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3ca91cfd1ffb5878d98a2e4f6d71f7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3ca91cfd1ffb5878d98a2e4f6d71f7e");
            } else {
                com.meituan.android.paybase.common.analyse.a.c("b_daDno", "POP_LEAD_FINDER_NOPASS", null);
            }
            ((TextView) inflate.findViewById(R.id.title)).setText(noPasswordGuice.getTitle());
            ((TextView) inflate.findViewById(R.id.tip)).setText(noPasswordGuice.getTip());
            AgreementView agreementView = (AgreementView) inflate.findViewById(R.id.agreement_container);
            Object[] objArr4 = {noPasswordGuice};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "009f6acf7e2640d4839e5565667d00d7", RobustBitConfig.DEFAULT_VALUE)) {
                agreementBean = (AgreementBean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "009f6acf7e2640d4839e5565667d00d7");
            } else if (noPasswordGuice == null) {
                agreementBean = null;
            } else {
                agreementBean = new AgreementBean();
                agreementBean.setAgreementPrefix(noPasswordGuice.getProtocolTip());
                agreementBean.setName(noPasswordGuice.getProtocolText());
                agreementBean.setCanCheck(false);
            }
            agreementView.setAgreement(agreementBean);
            TextView agreementNameTextView = agreementView.getAgreementNameTextView();
            if (!TextUtils.isEmpty(noPasswordGuice.getProtocolUrl())) {
                agreementNameTextView.setOnClickListener(i.a(this, noPasswordGuice));
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "免密引导弹窗中协议链接为空");
            }
            Button button = (Button) inflate.findViewById(R.id.confirm);
            button.setText(noPasswordGuice.getConfirmText());
            button.setOnClickListener(j.a(this, noPasswordGuice));
            TextView textView = (TextView) inflate.findViewById(R.id.cancel);
            textView.setText(noPasswordGuice.getCancelText());
            textView.setOnClickListener(k.a(this));
            Object[] objArr5 = {button, textView};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1845ea515680addb7ff206baf64c3381", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1845ea515680addb7ff206baf64c3381");
            } else {
                u.a(getContext(), button);
            }
            setContentView(inflate, new ViewGroup.LayoutParams((int) (NoPswGuideDialogFragment.this.getActivity().getWindowManager().getDefaultDisplay().getWidth() * 0.833d), -2));
        }

        public static /* synthetic */ void b(NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide, View view) {
            Object[] objArr = {noPswGuideDialog, noPasswordGuide, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26586ad9e77b4a05a102c8d02437152d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26586ad9e77b4a05a102c8d02437152d");
            } else {
                al.a(noPswGuideDialog.getOwnerActivity(), noPasswordGuide.getProtocolUrl());
            }
        }

        public static /* synthetic */ void a(NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide, View view) {
            Object[] objArr = {noPswGuideDialog, noPasswordGuide, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27882b96a73a870fc913ee41e8daffbc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27882b96a73a870fc913ee41e8daffbc");
                return;
            }
            noPswGuideDialog.dismiss();
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(noPasswordGuide.getCredit());
            hashMap.put("nopasswordpay_credit", sb.toString());
            if (!TextUtils.isEmpty(noPasswordGuide.getSubmitUrl())) {
                PayActivity.a(NoPswGuideDialogFragment.this.getActivity(), noPasswordGuide.getSubmitUrl(), hashMap, noPswGuideDialog.g, 7, noPswGuideDialog);
            } else if (!TextUtils.isEmpty(noPswGuideDialog.f.getSubmitUrl())) {
                PayActivity.a(NoPswGuideDialogFragment.this.getActivity(), noPswGuideDialog.f.getSubmitUrl(), hashMap, noPswGuideDialog.g, 7, noPswGuideDialog);
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_NO_PASSWORD_GUIDE, -9753);
            }
            noPswGuideDialog.a();
            com.meituan.android.paybase.common.analyse.a.a("b_aymv4g8f", (Map<String, Object>) null);
        }

        public static /* synthetic */ void a(NoPswGuideDialog noPswGuideDialog, View view) {
            Object[] objArr = {noPswGuideDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "001f56789b836f0b693deb795f6fbbc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "001f56789b836f0b693deb795f6fbbc6");
                return;
            }
            noPswGuideDialog.dismiss();
            if (noPswGuideDialog.f.isPayed() || noPswGuideDialog.f.isBinded()) {
                PayActivity.a(noPswGuideDialog.getOwnerActivity());
            }
            noPswGuideDialog.a();
            com.meituan.android.paybase.common.analyse.a.a("b_cgklfmc1", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_NO_PASSWORD_GUIDE, -9854);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c96f95bc9ed574c15f5c90da65aeada", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c96f95bc9ed574c15f5c90da65aeada");
            } else {
                com.meituan.android.paybase.common.analyse.a.c("b_GqWWK", "CLOSE_LEAD_FINDER_NOPASS", null);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestSucc(int i, Object obj) {
            Object[] objArr = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b754a5d30c75bcc5727c245d6e1045", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b754a5d30c75bcc5727c245d6e1045");
                return;
            }
            BankInfo bankInfo = (BankInfo) obj;
            String pageMessage = bankInfo.getPageMessage();
            if (!TextUtils.isEmpty(pageMessage)) {
                if (bankInfo.isOpenNoPasswordPaySuccess()) {
                    com.meituan.android.paybase.dialog.e.a((Activity) this.e, pageMessage, e.a.TOAST_TYPE_SUCCESS);
                    com.meituan.android.paybase.common.analyse.a.a("b_kljo4n7q", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_NO_PASSWORD_GUIDE, 200);
                } else {
                    com.meituan.android.paybase.dialog.e.a((Activity) this.e, pageMessage, e.a.TOAST_TYPE_EXCEPTION);
                    com.meituan.android.paybase.common.analyse.a.a("b_cgklfmc1", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_NO_PASSWORD_GUIDE, -9753);
                }
                bankInfo.setPageMessage("");
            }
            if (this.e instanceof PayActivity) {
                com.meituan.android.pay.process.f.a((Activity) ((PayActivity) this.e)).c((PayActivity) this.e, bankInfo);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestException(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72331fe1568125489a784dcaa7cc33a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72331fe1568125489a784dcaa7cc33a7");
            } else if (this.e instanceof PayActivity) {
                s.a((PayActivity) this.e, exc, 3);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestFinal(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66e9e6a079ee4c42781a5af93445ca1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66e9e6a079ee4c42781a5af93445ca1");
            } else if (this.e instanceof PayActivity) {
                ((PayActivity) this.e).hideProgress();
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestStart(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502907695a822406f459c5b3c05f4876", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502907695a822406f459c5b3c05f4876");
            } else if (this.e instanceof PayActivity) {
                ((PayActivity) this.e).b(com.meituan.android.paybase.common.utils.b.a());
            }
        }
    }
}
