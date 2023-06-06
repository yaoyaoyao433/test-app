package com.meituan.android.pay.common.selectdialog.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.utils.d;
import com.meituan.android.pay.common.selectdialog.view.a;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SelectBankDialog extends BaseDialog implements View.OnClickListener, AdapterView.OnItemClickListener, a.InterfaceC0322a {
    public static ChangeQuickRedirect a;
    com.meituan.android.pay.common.payment.data.a b;
    private LimitedHeightLinearLayout e;
    private ListView f;
    private com.meituan.android.pay.common.selectdialog.b g;
    private c h;
    private View i;
    private ViewGroup j;
    private int k;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(com.meituan.android.pay.common.payment.data.a aVar);

        void b();
    }

    public static /* synthetic */ void a(SelectBankDialog selectBankDialog) {
        String sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, selectBankDialog, changeQuickRedirect, false, "42bc38fd7cb02abdb23272e582dd219b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, selectBankDialog, changeQuickRedirect, false, "42bc38fd7cb02abdb23272e582dd219b");
            return;
        }
        selectBankDialog.requestWindowFeature(1);
        selectBankDialog.setContentView(R.layout.mpay__hellopay_selected_bank_dialog);
        if (selectBankDialog.g != null) {
            TextView textView = (TextView) selectBankDialog.findViewById(R.id.title);
            selectBankDialog.j = (ViewGroup) selectBankDialog.findViewById(R.id.tail);
            selectBankDialog.f = (ListView) selectBankDialog.findViewById(R.id.bank_list);
            selectBankDialog.e = (LimitedHeightLinearLayout) selectBankDialog.findViewById(R.id.container);
            selectBankDialog.i = selectBankDialog.findViewById(R.id.use_new_card);
            selectBankDialog.i.setOnClickListener(selectBankDialog);
            selectBankDialog.setCanceledOnTouchOutside(false);
            if (!TextUtils.isEmpty(selectBankDialog.g.getPageTitle())) {
                textView.setText(selectBankDialog.g.getPageTitle());
            }
            if (!i.a((Collection) selectBankDialog.g.getGlobalLabels())) {
                String globalLabelsPrefix = selectBankDialog.g.getGlobalLabelsPrefix();
                List<Label> globalLabels = selectBankDialog.g.getGlobalLabels();
                Object[] objArr2 = {globalLabelsPrefix, globalLabels};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, selectBankDialog, changeQuickRedirect2, false, "8f4f5c2f76ccbe894449c19549e6221e", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr2, selectBankDialog, changeQuickRedirect2, false, "8f4f5c2f76ccbe894449c19549e6221e");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(globalLabelsPrefix)) {
                        sb2.append(globalLabelsPrefix);
                    }
                    for (Label label : globalLabels) {
                        if (!TextUtils.isEmpty(label.getContent())) {
                            sb2.append("“");
                            switch (label.getStyle()) {
                                case 0:
                                case 1:
                                    if (!TextUtils.isEmpty(label.getContent())) {
                                        sb2.append(label.getContent());
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (!TextUtils.isEmpty(label.getLabelHead())) {
                                        sb2.append(label.getLabelHead());
                                    }
                                    if (!TextUtils.isEmpty(label.getContent())) {
                                        sb2.append(label.getContent());
                                        break;
                                    }
                                    break;
                            }
                            sb2.append("”");
                        }
                    }
                    sb = sb2.toString();
                }
                if (!TextUtils.isEmpty(sb)) {
                    selectBankDialog.findViewById(R.id.header_divider_up).setVisibility(8);
                    TextView textView2 = (TextView) selectBankDialog.findViewById(R.id.label_notice);
                    textView2.setVisibility(0);
                    textView2.setText(sb);
                }
            }
            if (!i.a((Collection) selectBankDialog.g.getMtPaymentList())) {
                if (selectBankDialog.b == null) {
                    selectBankDialog.b = d.b(selectBankDialog.g);
                }
                ArrayList<Object> arrayList = new ArrayList<>();
                for (com.meituan.android.pay.common.payment.data.a aVar : selectBankDialog.g.getMtPaymentList()) {
                    if (selectBankDialog.k == 0) {
                        if (aVar != null && !TextUtils.equals(aVar.getPayType(), "cardpay") && (!TextUtils.equals(aVar.getPayType(), "bankselectpay") || !d.a(aVar))) {
                            arrayList.add(aVar);
                        }
                    } else if (selectBankDialog.k == 1 && aVar != null && (!TextUtils.equals(aVar.getPayType(), "bankselectpay") || !d.a(aVar))) {
                        arrayList.add(aVar);
                    }
                }
                selectBankDialog.a(arrayList, selectBankDialog.g.getInsertPaymentsList());
                com.meituan.android.pay.common.selectdialog.view.a aVar2 = new com.meituan.android.pay.common.selectdialog.view.a(selectBankDialog.getContext(), arrayList, selectBankDialog.b);
                selectBankDialog.f.setAdapter((ListAdapter) aVar2);
                selectBankDialog.f.setOnItemClickListener(selectBankDialog);
                aVar2.c = selectBankDialog;
                if (selectBankDialog.k == 0) {
                    com.meituan.android.pay.common.payment.data.a e = d.e(selectBankDialog.g);
                    Object[] objArr3 = {e, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, selectBankDialog, changeQuickRedirect3, false, "ce2eae88a748fb5b4ee3095cbdea72ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, selectBankDialog, changeQuickRedirect3, false, "ce2eae88a748fb5b4ee3095cbdea72ef");
                    } else if (e == null) {
                        if (selectBankDialog.i != null) {
                            selectBankDialog.i.setVisibility(8);
                        }
                    } else {
                        selectBankDialog.j.setVisibility(0);
                        selectBankDialog.i.setVisibility(0);
                        selectBankDialog.i.setTag(e);
                        selectBankDialog.i.setBackgroundResource(R.drawable.mpay__bg_selector);
                        aVar2.a(selectBankDialog.i, aVar2.a(a.c.PAYMENT.ordinal(), selectBankDialog.i), e);
                        ImageView imageView = (ImageView) selectBankDialog.findViewById(R.id.is_selected);
                        if (!d.a(e)) {
                            imageView.setImageResource(R.drawable.mpay__select_bank_dialog_add_card);
                            imageView.setVisibility(0);
                        } else {
                            imageView.setImageResource(R.drawable.mpay__select_bank_dialog_add_card_invalid);
                            imageView.setVisibility(0);
                        }
                    }
                }
            }
            if (selectBankDialog.h == c.BACK) {
                selectBankDialog.findViewById(R.id.back_btn).setVisibility(0);
                selectBankDialog.findViewById(R.id.close_btn).setVisibility(8);
            } else {
                selectBankDialog.findViewById(R.id.back_btn).setVisibility(8);
                selectBankDialog.findViewById(R.id.close_btn).setVisibility(0);
            }
            selectBankDialog.findViewById(R.id.back_btn).setOnClickListener(selectBankDialog);
            selectBankDialog.findViewById(R.id.close_btn).setOnClickListener(selectBankDialog);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, selectBankDialog, changeQuickRedirect4, false, "75eb9cf600738838ad2daf008ae6127c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, selectBankDialog, changeQuickRedirect4, false, "75eb9cf600738838ad2daf008ae6127c");
            } else {
                selectBankDialog.e.setLimitedHeight((int) (((WindowManager) selectBankDialog.getContext().getSystemService("window")).getDefaultDisplay().getHeight() * 0.75d));
            }
            com.meituan.android.pay.common.selectdialog.utils.a.e(selectBankDialog.g);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum c {
        BACK,
        CLOSE;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f32cc371683eb48aa110df23cbf5e46", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f32cc371683eb48aa110df23cbf5e46");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2af7c20550a4d6135ed9ce653c99d11e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2af7c20550a4d6135ed9ce653c99d11e") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de85d5d405ad7f8ba90e0006a9785ed", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de85d5d405ad7f8ba90e0006a9785ed") : (c[]) values().clone();
        }
    }

    public SelectBankDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e179fbc3dc6b9403c4d22b38cfac542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e179fbc3dc6b9403c4d22b38cfac542");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aaa61da49ab6a5b8094351c5f3f1693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aaa61da49ab6a5b8094351c5f3f1693");
            return;
        }
        super.onAttachedToWindow();
        com.meituan.android.paybase.common.analyse.a.a(com.meituan.android.paybase.common.analyse.a.a(this), "c_pay_z4mg7mr8", com.meituan.android.pay.common.selectdialog.utils.a.c(this.g));
    }

    private void a(ArrayList<Object> arrayList, List<com.meituan.android.pay.common.selectdialog.a> list) {
        int insertIndex;
        int i = 0;
        Object[] objArr = {arrayList, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f3a5a3b47c2ee2c624da55b745fb69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f3a5a3b47c2ee2c624da55b745fb69");
        } else if (!i.a((Collection) list)) {
            int i2 = -1;
            for (com.meituan.android.pay.common.selectdialog.a aVar : list) {
                if (aVar != null && (insertIndex = aVar.getInsertIndex() + i) > i2 && insertIndex <= arrayList.size() && !i.a((Collection) aVar.getMtMorePaymentList())) {
                    arrayList.add(insertIndex, aVar);
                    i++;
                    i2 = insertIndex;
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03efb70894e929a322a60369eeccf2df", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03efb70894e929a322a60369eeccf2df");
        } else if (view.getId() == R.id.back_btn) {
            com.meituan.android.paybase.common.analyse.a.a("b_9sas4ayc", (Map<String, Object>) null);
            this.b = null;
            cancel();
        } else if (view.getId() == R.id.close_btn) {
            com.meituan.android.paybase.common.analyse.a.a("b_9sas4ayc", (Map<String, Object>) null);
            this.b = null;
            cancel();
        } else if (view.getId() != R.id.use_new_card || view.getTag() == null) {
        } else {
            this.b = (com.meituan.android.pay.common.payment.data.a) view.getTag();
            cancel();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7870a0ede1057f7a2156f67bacf4d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7870a0ede1057f7a2156f67bacf4d66");
            return;
        }
        super.onBackPressed();
        if (this.h == c.CLOSE) {
            this.b = null;
        }
        cancel();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        com.meituan.android.pay.common.selectdialog.a aVar;
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee7bf3f94efa1cab24575d1b12ef0db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee7bf3f94efa1cab24575d1b12ef0db");
            return;
        }
        com.meituan.android.pay.common.selectdialog.view.a aVar2 = (com.meituan.android.pay.common.selectdialog.view.a) this.f.getAdapter();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.common.selectdialog.view.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "ee35820ec2f22d7d91377d7ad667f162", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "ee35820ec2f22d7d91377d7ad667f162")).booleanValue();
        } else {
            z = aVar2.getItemViewType(i) == a.c.PAYMENT.ordinal();
        }
        if (!z) {
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.common.selectdialog.view.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "5f6803fd83aa0d69074be031f45afd15", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "5f6803fd83aa0d69074be031f45afd15")).booleanValue();
            } else {
                z2 = aVar2.getItemViewType(i) == a.c.CREDIT_PAYMENT.ordinal();
            }
            if (!z2) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pay.common.selectdialog.view.a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "3052e13a5875e6990a632e3d6d3a28b2", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "3052e13a5875e6990a632e3d6d3a28b2")).booleanValue();
                } else {
                    z3 = aVar2.getItemViewType(i) == a.c.CO_BRANDED_CARD_PAYMENT.ordinal();
                }
                if (!z3) {
                    if (aVar2.a(i)) {
                        Object[] objArr5 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.pay.common.selectdialog.view.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "f9512e4bc3015dcebd7e023de69f5813", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "f9512e4bc3015dcebd7e023de69f5813");
                        } else if (aVar2.a(i) && (aVar = (com.meituan.android.pay.common.selectdialog.a) aVar2.getItem(i)) != null && !i.a((Collection) aVar.getMtMorePaymentList())) {
                            ArrayList<T> arrayList = aVar2.k;
                            arrayList.remove(i);
                            arrayList.addAll(i, aVar.getMtMorePaymentList());
                            aVar2.notifyDataSetChanged();
                        }
                        if (this.g != null) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_bg4v0a35_mc", (String) null, com.meituan.android.pay.common.selectdialog.utils.a.d(this.g), a.EnumC0329a.CLICK, -1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        if (d.a((com.meituan.android.pay.common.payment.data.a) aVar2.getItem(i))) {
            return;
        }
        this.b = (com.meituan.android.pay.common.payment.data.a) aVar2.getItem(i);
        com.meituan.android.paybase.common.analyse.a.a("b_8tqo1auc", new a.c().a("pay_type", this.b.getPayType()).b);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_a7vurxgk_mc", (String) null, com.meituan.android.pay.common.selectdialog.utils.a.a(this.g, this.b), a.EnumC0329a.CLICK);
        if (TextUtils.equals("cardpay", this.b.getPayType()) || (TextUtils.equals("bankselectpay", this.b.getPayType()) && !d.a(this.b))) {
            cancel();
            return;
        }
        aVar2.b = this.b;
        aVar2.notifyDataSetChanged();
        cancel();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public SelectBankDialog b;

        public a(Context context, boolean z) {
            Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d42b9c01ba5bbb78cb99657b3d8acda", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d42b9c01ba5bbb78cb99657b3d8acda");
            } else if (z) {
                this.b = new SelectBankDialog(context, R.style.mpay__has_bg_select_dialog);
            } else {
                this.b = new SelectBankDialog(context, R.style.mpay__no_bg_select_dialog);
            }
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.a.InterfaceC0322a
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b6b85f2604f00c40bc8e8ea126e0b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b6b85f2604f00c40bc8e8ea126e0b1");
            return;
        }
        this.b = aVar;
        cancel();
        com.meituan.android.pay.common.selectdialog.utils.a.a(aVar);
    }
}
