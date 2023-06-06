package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.bean.standardcomponent.OtherVerifyType;
import com.meituan.android.pay.desk.component.bean.standardcomponent.VerifyTypeDetail;
import com.meituan.android.pay.jshandler.GetMeituanPayParamsJSHandler;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AdditionVerifyFragment extends PayBaseFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private static HashMap<String, String> e = new HashMap<>();
    private static int g = -1;
    private Serializable b;
    @MTPayNeedToPersist
    private VerifyTypeDetail c;
    private String d;
    private HashMap<String, String> f;
    private int h;
    private IdentityReceiver i;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_pay_f94ybq7r";
    }

    public static void a(FragmentActivity fragmentActivity, OtherVerifyType otherVerifyType, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, int i) {
        AdditionVerifyFragment additionVerifyFragment;
        Object[] objArr = {fragmentActivity, otherVerifyType, str, hashMap, null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deadeb3471a28a8f0562c60d6290c106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deadeb3471a28a8f0562c60d6290c106");
            return;
        }
        Object[] objArr2 = {otherVerifyType, str, hashMap, null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c64b62ca2245ccc6f5c4c9daab651143", RobustBitConfig.DEFAULT_VALUE)) {
            additionVerifyFragment = (AdditionVerifyFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c64b62ca2245ccc6f5c4c9daab651143");
        } else {
            AdditionVerifyFragment additionVerifyFragment2 = new AdditionVerifyFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("otherVerifyType", otherVerifyType);
            bundle.putSerializable("passThroughParam", hashMap);
            bundle.putSerializable("extraParam", null);
            bundle.putSerializable("errorCount", Integer.valueOf(i));
            bundle.putString("payUrl", str);
            additionVerifyFragment2.setArguments(bundle);
            additionVerifyFragment = additionVerifyFragment2;
        }
        if (!com.meituan.android.paybase.utils.i.a((Collection) otherVerifyType.getVerifyTypeList())) {
            if (com.meituan.android.pay.desk.component.data.b.f(fragmentActivity)) {
                com.meituan.android.paycommon.lib.utils.h.d(fragmentActivity, additionVerifyFragment);
                return;
            }
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.content, additionVerifyFragment, "AdditionVerifyFragment");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_gzd1wpp3_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "调起验证方式选择页失败").a("message", "验证方式列表为空").b);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f17e7f314c907b0eccb2a21846d4802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f17e7f314c907b0eccb2a21846d4802");
            return;
        }
        super.onCreate(bundle);
        this.h = getArguments().getInt("errorCount");
        this.d = getArguments().getString("payUrl");
        this.f = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extraParam");
        HashMap hashMap = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "passThroughParam");
        if (!com.meituan.android.paybase.utils.i.a(hashMap)) {
            e.putAll(hashMap);
        }
        this.b = com.sankuai.waimai.platform.utils.f.a(getArguments(), "otherVerifyType");
        if (this.b instanceof OtherVerifyType) {
            OtherVerifyType otherVerifyType = (OtherVerifyType) this.b;
            if (g != -1 && bundle != null) {
                b(g);
            } else if (k()) {
                this.c = otherVerifyType.getVerifyTypeList().get(0);
                f();
            }
        }
        if (this.i == null) {
            this.i = new IdentityReceiver();
            IntentFilter intentFilter = new IntentFilter("identity_custom_action");
            FragmentActivity activity = getActivity();
            if (activity instanceof PayBaseActivity) {
                PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
                if (!TextUtils.isEmpty(payBaseActivity.p())) {
                    intentFilter.addAction("identity_custom_action_" + payBaseActivity.p());
                }
            }
            getActivity().registerReceiver(this.i, intentFilter);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class IdentityReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public IdentityReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f194388f7fbcaa73fb9b3751b2134ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f194388f7fbcaa73fb9b3751b2134ad");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject((String) intent.getExtras().get("data"));
                if (!jSONObject.has(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY) || !jSONObject.has(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY) || jSONObject.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY) == null || jSONObject.get(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY) == null) {
                    int unused = AdditionVerifyFragment.g = 2;
                    al.a();
                    AdditionVerifyFragment.this.b(AdditionVerifyFragment.g);
                    return;
                }
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.KEY_FIRST_REQUEST_CODE, (String) jSONObject.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY));
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.KEY_FIRST_RESPONSE_CODE, (String) jSONObject.get(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY));
                al.a();
                AdditionVerifyFragment.this.a("2");
            } catch (JSONException e) {
                int unused2 = AdditionVerifyFragment.g = 2;
                al.a();
                AdditionVerifyFragment.this.b(AdditionVerifyFragment.g);
                com.meituan.android.paybase.common.analyse.a.a(e, "AdditionVerifyFragment_broadcastReceiver", (Map<String, Object>) null);
            }
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dc268c846454a616e9dccbdde3be0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dc268c846454a616e9dccbdde3be0e");
        }
        View inflate = layoutInflater.inflate(R.layout.mpay__other_verify_type, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.other_verify_type_container);
        if (this.b instanceof OtherVerifyType) {
            List<VerifyTypeDetail> verifyTypeList = ((OtherVerifyType) this.b).getVerifyTypeList();
            if (!k()) {
                for (VerifyTypeDetail verifyTypeDetail : verifyTypeList) {
                    View inflate2 = layoutInflater.inflate(R.layout.mpay__other_verify_type_item, viewGroup, false);
                    ((TextView) inflate2.findViewById(R.id.name)).setText(verifyTypeDetail.getName());
                    linearLayout.addView(inflate2);
                    inflate2.setTag(R.id.mpay__verify_type_item, verifyTypeDetail);
                    inflate2.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.pay.fragment.AdditionVerifyFragment.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.paycommon.lib.widgets.g
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1242a2ef7de08febc0f098fbed8f2928", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1242a2ef7de08febc0f098fbed8f2928");
                                return;
                            }
                            Object tag = view.getTag(R.id.mpay__verify_type_item);
                            if (tag instanceof VerifyTypeDetail) {
                                AdditionVerifyFragment.this.c = (VerifyTypeDetail) tag;
                                AdditionVerifyFragment.this.j();
                                AdditionVerifyFragment.this.f();
                                HashMap<String, Object> e2 = AdditionVerifyFragment.this.e();
                                e2.put("verify_type", Integer.valueOf(AdditionVerifyFragment.this.c.getVerifyType()));
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_ryuhfpsb_mc", "", e2, a.EnumC0329a.CLICK, -1);
                            }
                        }
                    });
                }
            } else if (this.c.getVerifyType() == 10) {
                inflate.setClickable(true);
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.pay.fragment.AdditionVerifyFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "febfbc07116af047b449dbc8fa46ca4f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "febfbc07116af047b449dbc8fa46ca4f");
                            return;
                        }
                        int unused = AdditionVerifyFragment.g = 2;
                        AdditionVerifyFragment.this.b(AdditionVerifyFragment.g);
                    }
                });
            }
        }
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcad87fdfc8430847fb5030a3fb5ace6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcad87fdfc8430847fb5030a3fb5ace6");
        } else if (inflate != null && !k()) {
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.other_verify_type_title);
            toolbar.setTitle(R.string.mpay__choose_other_verify_type);
            toolbar.setNavigationOnClickListener(com.meituan.android.pay.fragment.a.a(this));
            inflate.findViewById(R.id.other_verify_type_layout).setVisibility(0);
        }
        return inflate;
    }

    public static /* synthetic */ void a(AdditionVerifyFragment additionVerifyFragment, View view) {
        Object[] objArr = {additionVerifyFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1710ca243dbb741f29957072de77acf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1710ca243dbb741f29957072de77acf5");
        } else {
            additionVerifyFragment.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String submitUrl2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c44bec59b2e97e7b3744c5ffbe2a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c44bec59b2e97e7b3744c5ffbe2a17");
        } else if (TextUtils.isEmpty(this.c.getSubmitUrl1())) {
        } else {
            int verifyType = this.c.getVerifyType();
            e.put("verify_type", String.valueOf(verifyType));
            com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "verify_type", String.valueOf(this.c.getVerifyType()));
            if (verifyType == 20 || verifyType == 22) {
                submitUrl2 = this.c.getSubmitUrl2();
            } else {
                submitUrl2 = this.c.getSubmitUrl1();
            }
            e.put("event_type", str);
            PayActivity.a(getActivity(), submitUrl2, e, this.f, 597, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55109b2d031eed7f4cb407fbbce68fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55109b2d031eed7f4cb407fbbce68fc4");
            return;
        }
        int verifyType = this.c.getVerifyType();
        if (verifyType != 20) {
            if (verifyType != 22) {
                switch (verifyType) {
                    case 10:
                        a("1");
                        break;
                    case 11:
                        a("2");
                        break;
                }
            } else {
                a("3");
            }
            com.meituan.android.pay.desk.component.analyse.a.b(getActivity(), verifyType, r());
        }
        g();
        com.meituan.android.pay.desk.component.analyse.a.b(getActivity(), verifyType, r());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements YodaResponseListener {
        public static ChangeQuickRedirect a;
        private WeakReference<AdditionVerifyFragment> b;

        public a(AdditionVerifyFragment additionVerifyFragment) {
            Object[] objArr = {additionVerifyFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd31f7eb1a5c13d4d0dc36470ecf4c4a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd31f7eb1a5c13d4d0dc36470ecf4c4a");
            } else {
                this.b = new WeakReference<>(additionVerifyFragment);
            }
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onYodaResponse(String str, String str2) {
            AdditionVerifyFragment additionVerifyFragment;
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0769ca26f6fa2ca71e322381a1860979", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0769ca26f6fa2ca71e322381a1860979");
                return;
            }
            if (!AdditionVerifyFragment.e.containsKey(OtherVerifyTypeConstants.KEY_FIRST_REQUEST_CODE) || !AdditionVerifyFragment.e.containsKey(OtherVerifyTypeConstants.KEY_FIRST_RESPONSE_CODE)) {
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.RESPONSE_CODE, str2);
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.REQUEST_CODE, str);
            } else {
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.KEY_SECOND_REQUEST_CODE, str);
                AdditionVerifyFragment.e.put(OtherVerifyTypeConstants.KEY_SECOND_RESPONSE_CODE, str2);
            }
            int unused = AdditionVerifyFragment.g = 1;
            if (this.b == null || (additionVerifyFragment = this.b.get()) == null) {
                return;
            }
            additionVerifyFragment.b(AdditionVerifyFragment.g);
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onCancel(String str) {
            AdditionVerifyFragment additionVerifyFragment;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62772d9373337157400c6cabc553cfd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62772d9373337157400c6cabc553cfd1");
                return;
            }
            int unused = AdditionVerifyFragment.g = 3;
            if (this.b == null || (additionVerifyFragment = this.b.get()) == null) {
                return;
            }
            additionVerifyFragment.b(AdditionVerifyFragment.g);
        }

        @Override // com.meituan.android.yoda.YodaResponseListener
        public final void onError(String str, Error error) {
            AdditionVerifyFragment additionVerifyFragment;
            Object[] objArr = {str, error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319c70370a8159b30d41b96199bcb286", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319c70370a8159b30d41b96199bcb286");
                return;
            }
            int unused = AdditionVerifyFragment.g = 2;
            if (this.b == null || (additionVerifyFragment = this.b.get()) == null) {
                return;
            }
            additionVerifyFragment.b(AdditionVerifyFragment.g);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8024a0c30fb831e027ae8ff97c733e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8024a0c30fb831e027ae8ff97c733e");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "verify_type", String.valueOf(this.c.getVerifyType()));
        e.put("verify_type", String.valueOf(this.c.getVerifyType()));
        GetMeituanPayParamsJSHandler.putParamsToWeb(e);
        al.a(this, this.c.getSubmitUrl1(), 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27ceb0a26c037745195b857b3f1bcfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27ceb0a26c037745195b857b3f1bcfd");
            return;
        }
        if (i == 1) {
            com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "verify_type", String.valueOf(this.c.getVerifyType()));
            e.put("verify_type", String.valueOf(this.c.getVerifyType()));
            if (getContext() != null) {
                if (getView() != null) {
                    getView().setVisibility(8);
                    ((BaseActivity) getActivity()).getSupportActionBar().c();
                }
                PayActivity.a(getActivity(), this.d, e, this.f, 66, this);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_cs9uc6q2_mv", new a.c().a("verify_type", Integer.valueOf(this.c.getVerifyType())).a(KnbConstants.PARAMS_SCENE, "补充验证成功，发起支付").b);
            }
            com.meituan.android.pay.desk.component.analyse.a.c(getActivity(), this.c.getVerifyType(), r());
        } else if (k() && getActivity() != null) {
            i();
            j();
            com.meituan.android.paybase.common.analyse.a.a("b_pay_gzd1wpp3_mv", new a.c().a("verify_type", Integer.valueOf(this.c.getVerifyType())).a(KnbConstants.PARAMS_SCENE, "单一验证方式验证失败退出").b);
        }
        if (i == 2) {
            com.meituan.android.pay.desk.component.analyse.a.d(getActivity(), this.c.getVerifyType(), r());
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339f5a4cb62c5b7f0bb16b09c08be634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339f5a4cb62c5b7f0bb16b09c08be634");
        } else if (com.meituan.android.pay.desk.component.data.b.f(getActivity())) {
            ActionBar supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.c();
            }
            com.meituan.android.paycommon.lib.utils.h.a("AdditionVerifyFragment", getActivity());
            com.meituan.android.paycommon.lib.utils.h.a(getActivity());
        } else {
            PayActivity.b(getActivity(), getString(R.string.mpay__cancel_msg16), PayErrorCode.PASSWORD_CHECK_ERROR_CANCEL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba01078ed672d2dd6c5723ccdb1550cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba01078ed672d2dd6c5723ccdb1550cb");
            return;
        }
        e.clear();
        g = -1;
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bdfcde9d77899cc743dda4733f285b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bdfcde9d77899cc743dda4733f285b")).booleanValue();
        }
        if (this.b instanceof OtherVerifyType) {
            List<VerifyTypeDetail> verifyTypeList = ((OtherVerifyType) this.b).getVerifyTypeList();
            return !com.meituan.android.paybase.utils.i.a((Collection) verifyTypeList) && verifyTypeList.size() == 1;
        }
        return false;
    }

    private void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652b25b8148ecf8c8bb3bcec27c73612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652b25b8148ecf8c8bb3bcec27c73612");
            return;
        }
        if (com.meituan.android.pay.desk.component.data.b.f(activity)) {
            ActionBar supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.c();
            }
            com.meituan.android.paycommon.lib.utils.h.a(getActivity());
        } else {
            PayActivity.a(activity, activity.getString(R.string.mpay__fail_msg13), -9753);
        }
        com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.mpay__error_msg_pay_later));
        j();
        com.meituan.android.paybase.common.analyse.a.a("b_pay_zo7lvnxu_mv", new a.c().a("verify_type", Integer.valueOf(this.c.getVerifyType())).b);
    }

    @Override // android.support.v4.app.Fragment
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c10421899860eb3afe5430093ae253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c10421899860eb3afe5430093ae253");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 13) {
            int verifyType = this.c.getVerifyType();
            if (intent != null) {
                try {
                    JSONObject jSONObject = new JSONObject(com.sankuai.waimai.platform.utils.f.a(intent, "resultData"));
                    if (TextUtils.equals("success", jSONObject.getString("status"))) {
                        e.put(OtherVerifyTypeConstants.KEY_ISSUE_REQUEST, jSONObject.getString(OtherVerifyTypeConstants.KEY_ISSUE_REQUEST));
                        if (verifyType == 20) {
                            a("2");
                        } else {
                            g = 1;
                            b(g);
                        }
                    } else {
                        g = 2;
                        b(g);
                    }
                } catch (Exception e2) {
                    com.meituan.android.paybase.common.analyse.a.a(e2, "AdditionVerifyFragment_onActivityResult", (Map<String, Object>) null);
                    g = 2;
                    b(g);
                }
            } else {
                g = 2;
                b(g);
            }
        } else if (i == 14 && intent == null && e.get(OtherVerifyTypeConstants.KEY_FIRST_REQUEST_CODE) == null) {
            g = 2;
            b(g);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    @Override // com.meituan.android.paybase.retrofit.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestSucc(int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.fragment.AdditionVerifyFragment.onRequestSucc(int, java.lang.Object):void");
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6474202044c71e3e3c081499f79de33a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6474202044c71e3e3c081499f79de33a");
        } else if ((i == 597 && k()) || i == 66) {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                if (i == 66 && com.meituan.android.pay.desk.component.data.a.b(getActivity()) && getActivity() != null) {
                    com.meituan.android.pay.process.f.b(getActivity(), payException);
                } else if (payException.getLevel() == 1) {
                    com.meituan.android.paybase.dialog.e.a(getActivity(), payException.getMessage(), payException.getErrorCodeStr());
                    PayActivity.a(getActivity(), getActivity().getString(R.string.mpay__fail_msg13), -9753);
                } else {
                    com.meituan.android.pay.utils.s.a(getActivity(), payException.getMessage(), payException.getErrorCodeStr(), exc, 3);
                }
                if (i == 66) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_8bjlr83u_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "验证通过后支付失败").a("message", exc.getMessage()).b);
                    return;
                }
                return;
            }
            com.meituan.android.pay.utils.s.a(getActivity(), getString(R.string.paycommon__error_msg_load_later), "", exc, 3);
            if (i == 66) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "验证通过后支付异常").a("message", exc.getMessage()).b);
            }
        } else {
            com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8ddf7fce94f139978707aabc929e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8ddf7fce94f139978707aabc929e4e");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5fb134d20ae722b3a1d9ab3c090251c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5fb134d20ae722b3a1d9ab3c090251c");
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267dea6e84cdafa2278dee004e91133e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267dea6e84cdafa2278dee004e91133e")).booleanValue();
        }
        j();
        i();
        com.meituan.android.paybase.common.analyse.a.a("b_pay_gzd1wpp3_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "点击Back键退出").b);
        return true;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8bd0f49096f788a08eb26d6c59aea0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8bd0f49096f788a08eb26d6c59aea0f");
        }
        HashMap<String, Object> e2 = super.e();
        if (com.meituan.android.paybase.common.analyse.b.b != null) {
            e2.put("trans_id", com.meituan.android.paybase.common.analyse.b.b);
        } else {
            e2.put("trans_id", "-999");
        }
        if (!TextUtils.isEmpty(l())) {
            e2.put("verify_type", l());
        } else {
            e2.put("verify_type", "-999");
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type");
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "combine_type");
        if (TextUtils.isEmpty(b2)) {
            if (TextUtils.isEmpty(b)) {
                b = "";
            }
            b2 = b;
        }
        e2.put("pay_type", b2);
        e2.put("other_verify", Boolean.TRUE);
        e2.put("error_num", Integer.valueOf(this.h));
        return e2;
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e49f3a242cd242f6a3c340e87870bc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e49f3a242cd242f6a3c340e87870bc6");
        }
        StringBuilder sb = new StringBuilder();
        if (this.b instanceof OtherVerifyType) {
            List<VerifyTypeDetail> verifyTypeList = ((OtherVerifyType) this.b).getVerifyTypeList();
            if (!com.meituan.android.paybase.utils.i.a((Collection) verifyTypeList)) {
                for (VerifyTypeDetail verifyTypeDetail : verifyTypeList) {
                    if (verifyTypeDetail != null) {
                        sb.append(verifyTypeDetail.getVerifyType());
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea443315865a224e8750a6d3155635c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea443315865a224e8750a6d3155635c");
            return;
        }
        super.onDestroy();
        if (getActivity() == null || this.i == null) {
            return;
        }
        getActivity().unregisterReceiver(this.i);
    }
}
