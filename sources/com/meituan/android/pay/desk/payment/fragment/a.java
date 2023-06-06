package com.meituan.android.pay.desk.payment.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.LabelIcon;
import com.meituan.android.pay.common.promotion.bean.LabelSwitch;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.paycommon.lib.assist.a<PayLabel> {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.desk.payment.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0324a {
        public TextView a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public LinearLayout h;
        public ProgressBar i;
        public AppCompatCheckBox j;
        public RelativeLayout k;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public a(Context context, ArrayList<PayLabel> arrayList) {
        super(context, arrayList);
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3408c4292c2cbb4466a05234a651f3ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3408c4292c2cbb4466a05234a651f3ca");
        }
    }

    public static /* synthetic */ void a(a aVar, Agreement agreement, View view) {
        Object[] objArr = {aVar, agreement, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8bd9197ba226daea7eaa9ba99b16dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8bd9197ba226daea7eaa9ba99b16dac");
        } else {
            aVar.a(agreement.getUrl());
        }
    }

    public static /* synthetic */ void a(a aVar, LabelIcon labelIcon, View view) {
        Object[] objArr = {aVar, labelIcon, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9c599aa841883467a87136a94978856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9c599aa841883467a87136a94978856");
        } else {
            aVar.a(labelIcon.getLink());
        }
    }

    public static /* synthetic */ void a(a aVar, LabelSwitch labelSwitch, PayLabel payLabel, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {aVar, labelSwitch, payLabel, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d91d8a86782755be15d1eff14170d516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d91d8a86782755be15d1eff14170d516");
            return;
        }
        labelSwitch.setCheck(z ? 1 : 0);
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_i1gwzzwr_mc", "营销权益卡片选择", new a.c().a("pay_type", payLabel.getLabelType()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("type", String.valueOf(z ? 1 : 0)).a("marketing", payLabel.getLabelCode()).b, a.EnumC0329a.CLICK, -1);
        aVar.notifyDataSetChanged();
    }

    public static /* synthetic */ void a(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b20e9052694f98ad28336c943d6fc5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b20e9052694f98ad28336c943d6fc5d");
        } else {
            bVar.j.setChecked(!bVar.j.isChecked());
        }
    }

    private int a(ArrayList<PayLabel> arrayList) {
        char c = 1;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f89bc039616c5c9ce6548a05ad4f392", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f89bc039616c5c9ce6548a05ad4f392")).intValue();
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) arrayList)) {
            return 0;
        }
        Iterator<PayLabel> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            PayLabel next = it.next();
            Object[] objArr2 = new Object[2];
            objArr2[0] = next;
            objArr2[c] = PayLabel.ITEM_TYPE_REWARD;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bb78a94c8d5e6138512d2c1a6d5a188", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bb78a94c8d5e6138512d2c1a6d5a188")).booleanValue() : com.meituan.android.pay.desk.payment.discount.a.a(next, PayLabel.ITEM_TYPE_REWARD)) {
                i++;
            }
            c = 1;
        }
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        final b bVar;
        PayLabel payLabel;
        PayLabel payLabel2;
        int floatValue;
        C0324a c0324a;
        View view3;
        String valueOf;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0307b1794a8dba55cb8a0a9154f616e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0307b1794a8dba55cb8a0a9154f616e6");
        }
        PayLabel payLabel3 = (PayLabel) this.k.get(i);
        if (getItemViewType(i) == 0) {
            if (view == null) {
                c0324a = new C0324a();
                View inflate = this.j.inflate(R.layout.mpay__discounts_detail_collect_item, viewGroup, false);
                c0324a.a = (TextView) inflate.findViewById(R.id.mpay__collect_title);
                inflate.setTag(c0324a);
                view3 = inflate;
            } else {
                c0324a = (C0324a) view.getTag();
                view3 = view;
            }
            TextView textView = c0324a.a;
            String labelHead = payLabel3.getLabelHead();
            Object[] objArr2 = new Object[1];
            String itemType = payLabel3.getItemType();
            Object[] objArr3 = {itemType};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "f47bd36489466688358be39183ef3176", RobustBitConfig.DEFAULT_VALUE)) {
                valueOf = PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "f47bd36489466688358be39183ef3176");
            } else if (TextUtils.equals(PayLabel.ITEM_TYPE_DISCOUNT, itemType)) {
                valueOf = com.meituan.android.pay.desk.payment.discount.a.a((ArrayList<PayLabel>) this.k);
            } else {
                valueOf = TextUtils.equals(PayLabel.ITEM_TYPE_REWARD, itemType) ? Integer.valueOf(a((ArrayList<PayLabel>) this.k)) : "";
            }
            objArr2[0] = valueOf;
            textView.setText(String.format(labelHead, objArr2));
            return view3;
        } else if (getItemViewType(i) == 1) {
            if (view == null) {
                View inflate2 = this.j.inflate(R.layout.mpay__discounts_detail_list_item, viewGroup, false);
                b bVar2 = new b();
                bVar2.b = (TextView) inflate2.findViewById(R.id.mpay__discount_name);
                bVar2.c = (TextView) inflate2.findViewById(R.id.mpay__discount_content);
                bVar2.d = (TextView) inflate2.findViewById(R.id.mpay__discount_agreement_prefix);
                bVar2.e = (TextView) inflate2.findViewById(R.id.mpay__discount_agreement_name);
                bVar2.j = (AppCompatCheckBox) inflate2.findViewById(R.id.mpay__discount_check_box);
                bVar2.f = (TextView) inflate2.findViewById(R.id.mpay__discount_money);
                bVar2.a = (ImageView) inflate2.findViewById(R.id.mpay__discount_question);
                bVar2.k = (RelativeLayout) inflate2.findViewById(R.id.mpay_checkbox_tap_area);
                bVar2.h = (LinearLayout) inflate2.findViewById(R.id.mpay__discount_progress);
                bVar2.i = (ProgressBar) inflate2.findViewById(R.id.mpay__discount_progress_bar);
                bVar2.g = (TextView) inflate2.findViewById(R.id.mpay__discount_progress_text);
                inflate2.setTag(bVar2);
                bVar = bVar2;
                view2 = inflate2;
            } else {
                view2 = view;
                bVar = (b) view.getTag();
            }
            Object[] objArr4 = {view2, bVar, payLabel3};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "c6f8006b946b0419063d7a68249b0d6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "c6f8006b946b0419063d7a68249b0d6f");
                return view2;
            }
            bVar.b.setText(payLabel3.getLabelHead());
            if (TextUtils.isEmpty(payLabel3.getContent())) {
                bVar.c.setVisibility(8);
            } else {
                bVar.c.setVisibility(0);
                bVar.c.setText(payLabel3.getContent());
            }
            bVar.f.setText(payLabel3.getBenefit());
            Agreement agreement = payLabel3.getAgreement();
            if (agreement != null) {
                if (TextUtils.isEmpty(agreement.getAgreementPrefix())) {
                    bVar.d.setVisibility(8);
                } else {
                    bVar.d.setVisibility(0);
                    bVar.d.setText(agreement.getAgreementPrefix());
                }
                if (TextUtils.isEmpty(agreement.getName())) {
                    bVar.e.setVisibility(8);
                } else {
                    bVar.e.setVisibility(0);
                    bVar.e.setText(agreement.getName());
                    bVar.e.setOnClickListener(com.meituan.android.pay.desk.payment.fragment.b.a(this, agreement));
                }
            } else {
                bVar.d.setVisibility(8);
                bVar.e.setVisibility(8);
            }
            LabelIcon labelIcon = payLabel3.getLabelIcon();
            if (labelIcon != null) {
                com.meituan.android.paycommon.lib.config.a.a().r().a(labelIcon.getIcon()).a(bVar.a);
                bVar.a.setVisibility(0);
                bVar.a.setOnClickListener(c.a(this, labelIcon));
            } else {
                bVar.a.setVisibility(8);
            }
            HashMap<String, Object> progress = payLabel3.getProgress();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view2.getLayoutParams();
            if (progress != null) {
                layoutParams.height = aj.a(this.i, 76.0f);
                bVar.h.setVisibility(0);
                ProgressBar progressBar = bVar.i;
                Object[] objArr5 = {progress};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                payLabel = payLabel3;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "12585c64ee2e7881cef93cbab646928c", RobustBitConfig.DEFAULT_VALUE)) {
                    floatValue = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "12585c64ee2e7881cef93cbab646928c")).intValue();
                } else {
                    floatValue = ((progress.get("total") != null && Float.valueOf(String.valueOf(progress.get("total"))).floatValue() == 0.0f) || progress.get("current") == null || progress.get("total") == null) ? 0 : (int) ((Float.valueOf(String.valueOf(progress.get("current"))).floatValue() / Float.valueOf(String.valueOf(progress.get("total"))).floatValue()) * 100.0f);
                }
                progressBar.setProgress(floatValue);
                if (progress.get("current") != null && progress.get("total") != null && progress.get("unit") != null) {
                    TextView textView2 = bVar.g;
                    textView2.setText(progress.get("current") + "/" + progress.get("total") + progress.get("unit"));
                }
            } else {
                payLabel = payLabel3;
                layoutParams.height = aj.a(this.i, 60.0f);
                bVar.h.setVisibility(8);
            }
            view2.setLayoutParams(layoutParams);
            LabelSwitch labelSwitch = payLabel.getLabelSwitch();
            if (labelSwitch != null) {
                boolean a2 = com.meituan.android.pay.desk.payment.discount.a.a(labelSwitch.getCheck());
                bVar.j.setOnCheckedChangeListener(null);
                bVar.j.setChecked(a2);
                if (com.meituan.android.pay.common.promotion.utils.a.a(labelSwitch.getCheck())) {
                    bVar.j.setBackgroundResource(R.drawable.paycommon__agreement_yellow_checkbox);
                    bVar.j.setEnabled(true);
                    payLabel2 = payLabel;
                    bVar.j.setOnCheckedChangeListener(d.a(this, labelSwitch, payLabel2));
                } else {
                    payLabel2 = payLabel;
                    com.meituan.android.paybase.imageloader.b bVar3 = new com.meituan.android.paybase.imageloader.b() { // from class: com.meituan.android.pay.desk.payment.fragment.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.paybase.imageloader.b
                        public final void a(Bitmap bitmap) {
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "d75d67390242959c53418df15b59c5cc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "d75d67390242959c53418df15b59c5cc");
                            } else if (a.this.i != null) {
                                bVar.j.setBackgroundDrawable(new BitmapDrawable(a.this.i.getResources(), bitmap));
                            }
                        }

                        @Override // com.meituan.android.paybase.imageloader.b
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "e40ae58c01c4ecb233c9c0c8ba06dfe6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "e40ae58c01c4ecb233c9c0c8ba06dfe6");
                            } else {
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_0ysglw8j_mv", (Map<String, Object>) null);
                            }
                        }
                    };
                    if (a2) {
                        com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/travelcube/3858f32d4f44c6232cf740a066502bdb1305.png").a(bVar3);
                    } else {
                        com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/travelcube/1e9926035ce3658457c2e635241b6e75167.png").a(bVar3);
                    }
                    bVar.j.setEnabled(false);
                }
                bVar.k.setOnClickListener(e.a(bVar));
                com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_i1gwzzwr_mv", "营销权益卡片曝光", new a.c().a("pay_type", payLabel2.getLabelType()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("marketing", payLabel2.getLabelCode()).b, a.EnumC0329a.VIEW, -1);
                return view2;
            }
            return view2;
        } else {
            return view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db5da7469d88ab8f2e0aa6a56433bfc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db5da7469d88ab8f2e0aa6a56433bfc")).intValue() : TextUtils.equals(((PayLabel) this.k.get(i)).getLabelType(), "total") ? 0 : 1;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d58141424f7d68bb3a8b8898d59463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d58141424f7d68bb3a8b8898d59463");
        } else {
            al.a(this.i, str);
        }
    }
}
