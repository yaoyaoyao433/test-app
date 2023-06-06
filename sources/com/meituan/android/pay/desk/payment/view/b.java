package com.meituan.android.pay.desk.payment.view;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.HangAd;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paycommon.lib.widgets.CommonGridView;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;
    private Activity A;
    private MTPayment m;
    private LinearLayout n;
    private boolean o;
    private int p;
    private View q;
    private Animator r;
    private LinearLayout s;
    private com.meituan.android.pay.desk.payment.view.adapter.a t;
    private CommonGridView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private RelativeLayout y;
    private TextView z;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f15fa76c9d619aaa05aabd4f5b15009", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f15fa76c9d619aaa05aabd4f5b15009");
        } else {
            this.p = 0;
        }
    }

    public final void setActivity(Activity activity) {
        this.A = activity;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d8cd253c055f6af5921f08442caff34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d8cd253c055f6af5921f08442caff34");
            return;
        }
        if (dVar instanceof MTPayment) {
            this.m = (MTPayment) dVar;
        }
        super.b(dVar);
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final View d() {
        View inflate;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ec3e4ce2e26fd7227ef56b8f9a9f14", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ec3e4ce2e26fd7227ef56b8f9a9f14");
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.mpay__payment_append_view_bankcard, (ViewGroup) null);
        this.n = (LinearLayout) inflate2.findViewById(R.id.bank_ads);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.pay.desk.payment.view.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93f4a8a2d4236f5f078726703a109a32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93f4a8a2d4236f5f078726703a109a32");
                    return;
                }
                b.this.setAnimOpen(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    b.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    b.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
        setBankcardAppendViewHeight(inflate2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcab22516e9e62305bfaa8872aeb2895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcab22516e9e62305bfaa8872aeb2895");
        } else if (!com.meituan.android.paybase.utils.i.a((Collection) this.m.getHangCardAds())) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.payment_view_container);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.mpay__common_payment_add_icon_padding_left_revision), aj.a(getContext(), 10.0f), getResources().getDimensionPixelSize(R.dimen.mpay__common_payment_padding_right), aj.a(getContext(), 10.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setClickable(true);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(inflate2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "71ad1e464855508436704afb4b2d2c89", RobustBitConfig.DEFAULT_VALUE)) {
            inflate = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "71ad1e464855508436704afb4b2d2c89");
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__payment_append_view_credit, (ViewGroup) null);
            this.q = inflate.findViewById(R.id.mpay__appendage);
            this.s = (LinearLayout) this.q.findViewById(R.id.mpay__installment_container);
            this.u = (CommonGridView) this.q.findViewById(R.id.mpay__installment_data_grid);
            this.v = (TextView) this.q.findViewById(R.id.mpay__installment_title);
            this.w = (TextView) this.q.findViewById(R.id.mpay__installment_unsupported);
            this.x = (TextView) this.q.findViewById(R.id.mpay__installment_fee_dialog);
            this.y = (RelativeLayout) this.q.findViewById(R.id.mpay__contract);
            this.z = (TextView) this.q.findViewById(R.id.mpay__protocol);
        }
        linearLayout2.addView(inflate);
        return linearLayout2;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final String getNameText() {
        String nameExt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ba3cb6ccc05c3f2f3bd01acaf79350", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ba3cb6ccc05c3f2f3bd01acaf79350");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.getName());
        MTPayment mTPayment = this.m;
        Object[] objArr2 = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5c142cc945faedc567a87a79121256b", RobustBitConfig.DEFAULT_VALUE)) {
            nameExt = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5c142cc945faedc567a87a79121256b");
        } else {
            nameExt = (mTPayment == null || mTPayment.getCardInfo() == null) ? "" : mTPayment.getCardInfo().getNameExt();
        }
        sb.append(nameExt);
        return sb.toString();
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b613e4c6030177198434c72af801fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b613e4c6030177198434c72af801fff");
            return;
        }
        super.e();
        if (com.meituan.android.paybase.utils.i.a((Collection) this.m.getHangCardAds())) {
            return;
        }
        this.g.setVisibility(8);
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "795274b21cc2a353d7e708b884c6d9e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "795274b21cc2a353d7e708b884c6d9e7");
            return;
        }
        super.f();
        if (com.meituan.android.paybase.utils.i.a((Collection) this.m.getHangCardAds()) || com.meituan.android.paybase.utils.i.a((Collection) getBottomLabels())) {
            return;
        }
        this.f.setVisibility(0);
        this.f.b(getBottomLabels(), 3);
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final List<CombineLabel> getBottomLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab9b0e6a5ad661e1b9f70506e29a93a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab9b0e6a5ad661e1b9f70506e29a93a");
        }
        if (com.meituan.android.pay.common.payment.utils.c.g(this.h.getPayType()) && !com.meituan.android.paybase.utils.i.a((Collection) super.getBottomLabels())) {
            return com.meituan.android.pay.common.promotion.utils.a.c(new ArrayList(super.getBottomLabels()));
        }
        return super.getBottomLabels();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bd  */
    @Override // com.meituan.android.pay.desk.payment.view.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.payment.view.b.g():void");
    }

    @Override // com.meituan.android.pay.desk.payment.view.d, com.meituan.android.pay.desk.payment.b
    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dedc0ea1fb766a0f318796fcb098d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dedc0ea1fb766a0f318796fcb098d72");
            return;
        }
        if (this.o) {
            if (!this.i.isChecked() && this.h == dVar) {
                this.p = 1;
            } else {
                this.p = 0;
            }
        } else {
            this.p = 0;
        }
        super.a(dVar);
    }

    public final void setAnimOpen(boolean z) {
        this.o = z;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6891831cf733d78132614084eb6f8b1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6891831cf733d78132614084eb6f8b1a");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Map<String, Object> k = k();
            if (!com.meituan.android.paybase.utils.i.a(k)) {
                com.meituan.android.paybase.common.analyse.a.a("b_kmn5vdls", "收银台新卡广告-曝光", k, a.EnumC0329a.VIEW, -1);
            }
            Map<String, Object> a2 = a(this.g);
            if (!com.meituan.android.paybase.utils.i.a(a2)) {
                com.meituan.android.paybase.common.analyse.a.a("b_auavfd2v", "收银台首页标签曝光", a2, a.EnumC0329a.VIEW, -1);
            }
            Map<String, Object> a3 = a(this.f);
            if (com.meituan.android.paybase.utils.i.a(a3)) {
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_auavfd2v", "收银台首页标签曝光", a3, a.EnumC0329a.VIEW, -1);
        }
    }

    private Map<String, Object> a(PayLabelContainer payLabelContainer) {
        Object[] objArr = {payLabelContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3de8826117b7cb0f912ca362c0ffda", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3de8826117b7cb0f912ca362c0ffda");
        }
        if (payLabelContainer.getVisibility() == 0) {
            int i = 0;
            for (int i2 = 0; i2 < payLabelContainer.getChildCount(); i2++) {
                if (payLabelContainer.getChildAt(i2).getVisibility() == 0) {
                    i++;
                }
            }
            if (i <= 0 || this.m == null || com.meituan.android.paybase.utils.i.a((Collection) this.m.getLabels())) {
                return null;
            }
            List<CombineLabel> labels = this.m.getLabels();
            if (labels.size() >= i) {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < i; i3++) {
                    JSONObject jSONObject = new JSONObject();
                    CombineLabel combineLabel = labels.get(i3);
                    try {
                        jSONObject.put("active_id", combineLabel.getLabelId());
                        jSONObject.put("title", combineLabel.getContent());
                        jSONObject.put("type", combineLabel.getType());
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTPaymentViewRevision_createLabelMap").a("message", e.getMessage()).b, getUniqueId());
                    }
                }
                if (jSONArray.length() > 0) {
                    return new a.c().a("active_tag", jSONArray).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).b;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96dc5debef3af882d47bc89cc5661b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96dc5debef3af882d47bc89cc5661b5");
        }
        if (this.n.getVisibility() != 0 || this.n.getChildCount() <= 0 || this.m == null) {
            return null;
        }
        List<HangAd> hangCardAds = this.m.getHangCardAds();
        if (com.meituan.android.paybase.utils.i.a((Collection) hangCardAds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < hangCardAds.size() && i <= 1; i++) {
            HashMap hashMap = new HashMap();
            HangAd hangAd = hangCardAds.get(i);
            if (hangAd != null) {
                hashMap.put("bankTypeId", Integer.valueOf(hangAd.getActiveId()));
                if (!TextUtils.isEmpty(hangAd.getStrategyName())) {
                    hashMap.put("strategyName", hangAd.getStrategyName());
                }
            }
            arrayList.add(hashMap);
        }
        return new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("strategyInfo", arrayList).b;
    }

    private void setBankcardAppendViewHeight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b477938964ac5cf53968c4f29f3fe42d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b477938964ac5cf53968c4f29f3fe42d");
        } else if (view != null) {
            ((LinearLayout) view.findViewById(R.id.mpay__bankcard_append_view_container)).setPadding(aj.a(getContext(), 44.0f), 0, 0, 0);
        }
    }

    public final void setOnClickNewCardAd(View.OnClickListener onClickListener) {
        View findViewById;
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dcdf6cadc05e3059feb34b570f10eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dcdf6cadc05e3059feb34b570f10eae");
        } else if (this.n == null || this.n.getVisibility() != 0 || this.n.getChildCount() <= 0 || (findViewById = findViewById(R.id.mpay__ad_more_payment)) == null || findViewById.getVisibility() != 0) {
        } else {
            this.n.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickShowFeeDialogListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82aef359fa25565c390601c618d3868c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82aef359fa25565c390601c618d3868c");
        } else if (this.x == null || onClickListener == null) {
        } else {
            this.x.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickPeriodItemListener(AdapterView.OnItemClickListener onItemClickListener) {
        Object[] objArr = {onItemClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95667dcaeed0481b89b80b511e3fedd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95667dcaeed0481b89b80b511e3fedd6");
        } else if (this.m == null || this.m.getInstallment() == null || this.u == null) {
        } else {
            this.u.setOnItemClickListener(onItemClickListener);
        }
    }

    public final void setOnClickAgreementListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043e0b58b589c0a5fd3daa46df9533e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043e0b58b589c0a5fd3daa46df9533e5");
        } else if (onClickListener == null || this.z == null) {
        } else {
            this.z.setOnClickListener(onClickListener);
        }
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707d73bb0e66a17e64e32603399191d8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707d73bb0e66a17e64e32603399191d8") : (!(this.A instanceof PayBaseActivity) || TextUtils.isEmpty(((PayBaseActivity) this.A).p())) ? "" : ((PayBaseActivity) this.A).p();
    }
}
