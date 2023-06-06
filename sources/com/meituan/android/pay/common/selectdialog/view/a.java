package com.meituan.android.pay.common.selectdialog.view;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.payment.utils.e;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.paycommon.lib.assist.a<Object> {
    public static ChangeQuickRedirect a;
    com.meituan.android.pay.common.payment.data.a b;
    InterfaceC0322a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.common.selectdialog.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0322a {
        void a(com.meituan.android.pay.common.payment.data.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public ImageView e;
        public PayLabelContainer f;
        public TextView g;
        public RelativeLayout h;
        public LinearLayout i;
        public LinearLayout j;
        public TextView k;
        public TextView l;
        public View m;
    }

    public a(Context context, ArrayList<Object> arrayList, com.meituan.android.pay.common.payment.data.a aVar) {
        super(context, arrayList);
        Object[] objArr = {context, arrayList, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e3ea6dc89314dd90f115d280886fc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e3ea6dc89314dd90f115d280886fc9");
            return;
        }
        this.b = aVar;
        com.meituan.android.pay.common.selectdialog.utils.a.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.common.selectdialog.view.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum c {
        PAYMENT,
        CREDIT_PAYMENT,
        CO_BRANDED_CARD_PAYMENT,
        INSERT_MORE,
        OTHER;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51cf4ec3e473989d291278da7b40eb02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51cf4ec3e473989d291278da7b40eb02");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15dd2569c3057366fd14c22c30e1eb20", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15dd2569c3057366fd14c22c30e1eb20") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e2d01d5e10322bb3406eb97984b4213", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e2d01d5e10322bb3406eb97984b4213") : (c[]) values().clone();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea023f52523fd01ed85ed07f134235a7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea023f52523fd01ed85ed07f134235a7")).intValue() : c.valuesCustom().length;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be1273194992b0029b3189a19873038", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be1273194992b0029b3189a19873038")).intValue();
        }
        if (getItem(i) instanceof com.meituan.android.pay.common.payment.data.a) {
            com.meituan.android.pay.common.payment.data.a aVar = (com.meituan.android.pay.common.payment.data.a) getItem(i);
            if (aVar instanceof MTPayment) {
                MTPayment mTPayment = (MTPayment) aVar;
                if (com.meituan.android.pay.common.payment.utils.c.e(aVar.getPayType())) {
                    return c.CREDIT_PAYMENT.ordinal();
                }
                if (e.a((com.meituan.android.pay.common.payment.data.d) mTPayment)) {
                    return c.CO_BRANDED_CARD_PAYMENT.ordinal();
                }
                return c.PAYMENT.ordinal();
            }
            return c.PAYMENT.ordinal();
        } else if (getItem(i) instanceof com.meituan.android.pay.common.selectdialog.a) {
            return c.INSERT_MORE.ordinal();
        } else {
            return c.OTHER.ordinal();
        }
    }

    private void a(TextView textView, TextView textView2, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {textView, textView2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baba07ce3be0e1ed711fbf01c5dc2aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baba07ce3be0e1ed711fbf01c5dc2aa4");
            return;
        }
        String name = aVar.getName();
        String str = "";
        if (aVar.getCardInfo() != null && !TextUtils.isEmpty(aVar.getCardInfo().getNameExt())) {
            str = aVar.getCardInfo().getNameExt();
        }
        textView.setText(name);
        textView2.setText(str);
    }

    private void a(ImageView imageView, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {imageView, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e306087305696dc085ced8d7b271ee23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e306087305696dc085ced8d7b271ee23");
        } else if (aVar == this.b) {
            if (!com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                imageView.setImageResource(R.drawable.mpay__mtwallet_bank_selected);
                imageView.setVisibility(0);
                return;
            }
            imageView.setVisibility(4);
        } else if (a(aVar)) {
            if (!com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                imageView.setImageResource(R.drawable.mpay__select_bank_dialog_add_card);
                imageView.setVisibility(0);
                return;
            }
            imageView.setImageResource(R.drawable.mpay__select_bank_dialog_add_card_invalid);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
    }

    private boolean a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c363d62eb356ebb08ecadcea2abda8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c363d62eb356ebb08ecadcea2abda8")).booleanValue();
        }
        String payType = aVar.getPayType();
        return TextUtils.equals("cardpay", payType) || TextUtils.equals("bankselectpay", payType) || TextUtils.equals("newforeigncardpay", payType);
    }

    public final void a(View view, d dVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {view, dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5236cf55a64563bb464ecda8c135514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5236cf55a64563bb464ecda8c135514");
        } else if (dVar == null || aVar == null) {
        } else {
            Context context = view.getContext();
            int status = aVar.getStatus();
            if (status == 1) {
                if (!TextUtils.isEmpty(aVar.getStatusInfo())) {
                    dVar.d.setText(aVar.getStatusInfo());
                    dVar.d.setVisibility(0);
                } else {
                    dVar.d.setVisibility(8);
                }
                dVar.f.setVisibility(8);
                dVar.b.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                dVar.c.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                dVar.d.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                if (aVar.getIcon() != null) {
                    w.a(aVar.getIcon().getDisable(), dVar.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
                view.setEnabled(false);
            } else if (status == 2) {
                if (!i.a((Collection) b(aVar.getLabels()))) {
                    dVar.f.setVisibility(0);
                    dVar.d.setVisibility(8);
                    dVar.f.a(b(aVar.getLabels()));
                } else {
                    dVar.f.setVisibility(8);
                    if (!TextUtils.isEmpty(aVar.getStatusInfo())) {
                        dVar.d.setText(aVar.getStatusInfo());
                        dVar.d.setTextColor(context.getResources().getColor(R.color.paybase__serious_error_text_color));
                        dVar.d.setVisibility(0);
                    } else {
                        dVar.d.setVisibility(8);
                    }
                }
                dVar.b.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                dVar.c.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                if (aVar.getIcon() != null) {
                    w.a(aVar.getIcon().getEnable(), dVar.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
                view.setEnabled(true);
            } else if (status == 4) {
                if (!TextUtils.isEmpty(aVar.getExceedDesc())) {
                    dVar.d.setText(aVar.getExceedDesc());
                    dVar.d.setVisibility(0);
                } else {
                    dVar.d.setVisibility(8);
                }
                dVar.f.setVisibility(8);
                dVar.b.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                dVar.c.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                dVar.d.setTextColor(context.getResources().getColor(R.color.paycommon__text_disable));
                if (aVar.getIcon() != null) {
                    w.a(aVar.getIcon().getDisable(), dVar.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
                view.setEnabled(false);
            } else if (!i.a((Collection) b(aVar.getLabels()))) {
                if (aVar.getIcon() != null) {
                    w.a(aVar.getIcon().getEnable(), dVar.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
                dVar.f.setVisibility(0);
                dVar.d.setVisibility(8);
                dVar.b.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                dVar.c.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                dVar.f.a(b(aVar.getLabels()));
                view.setEnabled(true);
            } else {
                dVar.b.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                dVar.c.setTextColor(context.getResources().getColor(R.color.paycommon__text_normal));
                dVar.f.setVisibility(8);
                dVar.d.setVisibility(8);
                view.setEnabled(true);
                if (aVar.getIcon() != null && !TextUtils.isEmpty(aVar.getIcon().getEnable())) {
                    w.a(aVar.getIcon().getEnable(), dVar.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
            }
            a(dVar.b, dVar.c, aVar);
        }
    }

    public final d a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3f14b8534aa7521629bab66f4b9bde", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3f14b8534aa7521629bab66f4b9bde");
        }
        d dVar = new d();
        if (i == c.PAYMENT.ordinal()) {
            a(dVar, view);
        } else if (i == c.CREDIT_PAYMENT.ordinal() || i == c.CO_BRANDED_CARD_PAYMENT.ordinal()) {
            a(dVar, view);
            b(dVar, view);
        } else if (i == c.INSERT_MORE.ordinal()) {
            dVar.g = (TextView) view.findViewById(R.id.mpay__change_select_more_content);
        }
        return dVar;
    }

    private void a(d dVar, View view) {
        Object[] objArr = {dVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70031ab8aab144f3eee19f4262f8ae47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70031ab8aab144f3eee19f4262f8ae47");
            return;
        }
        dVar.a = (ImageView) view.findViewById(R.id.icon);
        dVar.d = (TextView) view.findViewById(R.id.desc);
        dVar.b = (TextView) view.findViewById(R.id.name);
        dVar.c = (TextView) view.findViewById(R.id.name_ext);
        dVar.e = (ImageView) view.findViewById(R.id.is_selected);
        dVar.f = (PayLabelContainer) view.findViewById(R.id.label_layout);
        dVar.h = (RelativeLayout) view.findViewById(R.id.ll_item_main_content);
    }

    @MTPaySuppressFBWarnings({"URF_UNREAD_FIELD"})
    private void b(d dVar, View view) {
        Object[] objArr = {dVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56044af211dd6d010810ecedd9ecafbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56044af211dd6d010810ecedd9ecafbe");
            return;
        }
        dVar.j = (LinearLayout) view.findViewById(R.id.installment_info_layout);
        dVar.k = (TextView) view.findViewById(R.id.installment_name);
        dVar.l = (TextView) view.findViewById(R.id.installment_desc);
        dVar.i = (LinearLayout) view.findViewById(R.id.installment_list);
        dVar.m = view.findViewById(R.id.grey_line);
    }

    private static List<CombineLabel> b(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a9e37084c24a2b93647499d61e30866", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a9e37084c24a2b93647499d61e30866");
        }
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) list)) {
            for (CombineLabel combineLabel : list) {
                if (!combineLabel.isTop()) {
                    arrayList.add(combineLabel);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e446ce1805b0f6c2133002a393b40f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e446ce1805b0f6c2133002a393b40f")).booleanValue() : getItemViewType(i) == c.INSERT_MORE.ordinal();
    }

    private void a(d dVar, com.meituan.android.pay.common.payment.data.a aVar, LinearLayout linearLayout) {
        Object[] objArr = {dVar, aVar, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9b0c6932c99ccbe46687d13279bd34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9b0c6932c99ccbe46687d13279bd34");
        } else if (aVar instanceof MTPayment) {
            List<Period> periodList = ((MTPayment) aVar).getInstallment().getPeriodList();
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            linearLayout.setVisibility(0);
            a(dVar, aVar);
            for (int i = 0; i < periodList.size(); i++) {
                View inflate = LayoutInflater.from(this.i).inflate(R.layout.mpay__change_select_installment_item, (ViewGroup) linearLayout, false);
                TextView textView = (TextView) inflate.findViewById(R.id.installment_title);
                TextView textView2 = (TextView) inflate.findViewById(R.id.installment_content);
                TextView textView3 = (TextView) inflate.findViewById(R.id.mpay_installment_fee);
                Period period = periodList.get(i);
                if (i == 0 && period.getPeriod() == 0) {
                    dVar.k.setText(period.getTitle());
                    dVar.l.setText(period.getContent());
                    dVar.k.setVisibility(0);
                    dVar.l.setVisibility(0);
                    dVar.j.setVisibility(0);
                    dVar.m.setVisibility(0);
                    a(dVar);
                    a(dVar.j, 10);
                    a(dVar.h);
                    a(dVar.h, aj.a(this.i, 16.0f), aj.a(this.i, 16.0f));
                    dVar.h.setOnClickListener(new b(aVar, 0));
                } else {
                    if (i == periodList.size() - 1) {
                        inflate.findViewById(R.id.grey_line).setVisibility(8);
                    }
                    textView.setText(period.getTitle());
                    textView2.setText(period.getContent());
                    if (TextUtils.isEmpty(period.getAnnualizedRateInfo())) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(period.getAnnualizedRateInfo());
                        textView3.setVisibility(0);
                    }
                    if (!i.a((Collection) period.getCoupons()) && period.getCoupons().get(0) != null) {
                        textView2.setTextColor(ContextCompat.getColor(this.i, R.color.mpay__installment_text_color));
                        textView2.setText(period.getCoupons().get(0).getContent());
                    }
                    linearLayout.addView(inflate);
                    inflate.setOnClickListener(new b(aVar, i));
                }
            }
        }
    }

    private void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cab9c1a376fa88baa95c6f1fa8e62d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cab9c1a376fa88baa95c6f1fa8e62d4");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) dVar.e.getLayoutParams();
        layoutParams.addRule(15, 0);
        layoutParams.addRule(12, -1);
        dVar.e.setLayoutParams(layoutParams);
    }

    private void a(d dVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba185786e53f10c4cf58851621c3a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba185786e53f10c4cf58851621c3a36");
        } else if (aVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) aVar;
            TextView textView = (TextView) dVar.h.findViewById(R.id.mpay__protocol);
            if (a(mTPayment)) {
                Agreement commonAgreement = mTPayment.getCommonAgreement();
                e.a(textView, commonAgreement.getAgreementPrefixSelect(), commonAgreement.getName(), textView.getResources().getColor(R.color.paybase__black3), textView.getResources().getColor(R.color.paybase__agreement_color));
                textView.setOnClickListener(com.meituan.android.pay.common.selectdialog.view.b.a(this, mTPayment));
                textView.setVisibility(0);
                return;
            }
            textView.setOnClickListener(null);
            textView.setVisibility(8);
        }
    }

    public static /* synthetic */ void a(a aVar, MTPayment mTPayment, View view) {
        Object[] objArr = {aVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80bfa8629253128ebd3bf1a10f3f98cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80bfa8629253128ebd3bf1a10f3f98cc");
            return;
        }
        Object[] objArr2 = {view, mTPayment};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2cc0aff76d5009a548e9b647e381b401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2cc0aff76d5009a548e9b647e381b401");
        } else if (mTPayment != null) {
            if (mTPayment.getCommonAgreement() != null) {
                String url = mTPayment.getCommonAgreement().getUrl();
                if (!TextUtils.isEmpty(url)) {
                    WebViewDialogCloseActivity.b(view.getContext(), url);
                    return;
                }
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", mTPayment.getPayType() + "协议链接为空");
        }
    }

    private boolean a(MTPayment mTPayment) {
        Agreement commonAgreement;
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7dd83141fa63604c605646ff3c0cbd3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7dd83141fa63604c605646ff3c0cbd3")).booleanValue() : (mTPayment == null || (commonAgreement = mTPayment.getCommonAgreement()) == null || TextUtils.isEmpty(commonAgreement.getName()) || TextUtils.isEmpty(commonAgreement.getAgreementPrefixSelect()) || TextUtils.isEmpty(commonAgreement.getUrl())) ? false : true;
    }

    private void a(LinearLayout linearLayout, int i) {
        Object[] objArr = {linearLayout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5d5a60efb5ec150b0d5a108082077d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5d5a60efb5ec150b0d5a108082077d");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = aj.a(this.i, i);
        linearLayout.setLayoutParams(layoutParams);
    }

    private void a(RelativeLayout relativeLayout) {
        Object[] objArr = {relativeLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c812f627d37959af305b9ae4c6ed94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c812f627d37959af305b9ae4c6ed94");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = -2;
        relativeLayout.setLayoutParams(layoutParams);
    }

    private void a(RelativeLayout relativeLayout, int i, int i2) {
        Object[] objArr = {relativeLayout, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0346ca329dfe80d8dccee4cde15efea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0346ca329dfe80d8dccee4cde15efea4");
        } else {
            relativeLayout.setPadding(0, i, 0, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        private com.meituan.android.pay.common.payment.data.a c;
        private int d;

        public b(com.meituan.android.pay.common.payment.data.a aVar, int i) {
            Object[] objArr = {a.this, aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32020a5d252ac8fac3536505913095c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32020a5d252ac8fac3536505913095c8");
                return;
            }
            this.c = aVar;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0972dfe7fa68bd462f6cf45d95fcea1", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0972dfe7fa68bd462f6cf45d95fcea1");
            } else if (this.c instanceof MTPayment) {
                List<Period> periodList = ((MTPayment) this.c).getInstallment().getPeriodList();
                if (!i.a((Collection) periodList)) {
                    for (Period period : periodList) {
                        period.setSelected(false);
                    }
                }
                periodList.get(this.d).setSelected(true);
                if (a.this.c != null) {
                    a.this.c.a(this.c);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_2kk9tnet_mc", new a.c().a("choose_period", periodList.get(this.d) != null ? Integer.valueOf(periodList.get(this.d).getPeriod()) : "-1").b);
            }
        }
    }
}
