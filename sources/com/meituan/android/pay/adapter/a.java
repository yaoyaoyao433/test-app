package com.meituan.android.pay.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.pay.model.BankCardListChooseType;
import com.meituan.android.pay.model.bean.BankCard;
import com.meituan.android.pay.widget.view.PinnedHeaderListView;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.paycommon.lib.assist.a<Object> implements View.OnClickListener, PinnedHeaderListView.a {
    public static ChangeQuickRedirect a;
    private double b;
    private boolean c;
    private d d;
    private c e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(d dVar);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum d {
        CREDIT,
        DEBIT;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2e310e2a79dacaecdcffc05d85d014", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2e310e2a79dacaecdcffc05d85d014");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b25690a128a0b53e8ac7d061870239f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b25690a128a0b53e8ac7d061870239f") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a68df7dea1b26d9efe67b1c68c122ab", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a68df7dea1b26d9efe67b1c68c122ab") : (d[]) values().clone();
        }
    }

    public a(Context context, c cVar) {
        super(context);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2562707fe3c0b40e4b6c0732534cbf0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2562707fe3c0b40e4b6c0732534cbf0c");
        } else {
            this.e = cVar;
        }
    }

    public final void a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9475eaa3bc24352b57195a5cf6280665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9475eaa3bc24352b57195a5cf6280665");
        } else {
            this.b = d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba3ca6c0f4c520964525072fce333f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba3ca6c0f4c520964525072fce333f8")).intValue();
        }
        if (getItem(i) instanceof String) {
            return 0;
        }
        return getItem(i) instanceof BankCardListChooseType ? 2 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        View view2;
        View view3;
        C0320a c0320a;
        String statusInfo;
        int i2;
        int i3;
        int color;
        b bVar;
        View view4;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e108154c07f5e1638150657a512747", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e108154c07f5e1638150657a512747");
        }
        switch (getItemViewType(i)) {
            case 0:
                if (view == null) {
                    eVar = new e();
                    view2 = this.j.inflate(R.layout.mpay__bank_list_title_item, viewGroup, false);
                    eVar.a = (TextView) view2.findViewById(R.id.name);
                    view2.setTag(eVar);
                } else {
                    eVar = (e) view.getTag();
                    view2 = view;
                }
                eVar.a.setText((String) getItem(i));
                return view2;
            case 1:
                if (view == null) {
                    C0320a c0320a2 = new C0320a();
                    View inflate = this.j.inflate(R.layout.mpay__bank_list_item, viewGroup, false);
                    c0320a2.a = (ImageView) inflate.findViewById(R.id.bank_icon);
                    c0320a2.b = (TextView) inflate.findViewById(R.id.name);
                    c0320a2.c = (TextView) inflate.findViewById(R.id.tips);
                    inflate.setTag(c0320a2);
                    c0320a = c0320a2;
                    view3 = inflate;
                } else {
                    view3 = view;
                    c0320a = (C0320a) view.getTag();
                }
                BankCard bankCard = (BankCard) getItem(i);
                c0320a.b.setText(bankCard.getName());
                Object[] objArr2 = {bankCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d366401b658fe04c388fc3a0a0d6341", RobustBitConfig.DEFAULT_VALUE)) {
                    statusInfo = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d366401b658fe04c388fc3a0a0d6341");
                } else if (this.b > bankCard.getAmount()) {
                    statusInfo = bankCard.getExceedDesc();
                } else {
                    statusInfo = bankCard.getStatusInfo();
                }
                if (!TextUtils.isEmpty(statusInfo)) {
                    c0320a.c.setVisibility(0);
                    c0320a.c.setText(statusInfo);
                    TextView textView = c0320a.c;
                    Context context = this.i;
                    Object[] objArr3 = {bankCard, context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "264be5f9c53f35f486648704d177a679", RobustBitConfig.DEFAULT_VALUE)) {
                        color = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "264be5f9c53f35f486648704d177a679")).intValue();
                    } else if (bankCard.isErrorStatus() || this.b > bankCard.getAmount()) {
                        color = ContextCompat.getColor(context, R.color.mpay__payment_desc_beyond_amount);
                    } else if (bankCard.isEventStatus()) {
                        color = ContextCompat.getColor(context, R.color.mpay__payment_desc_event);
                    } else {
                        color = ContextCompat.getColor(context, R.color.mpay__black3);
                    }
                    textView.setTextColor(color);
                } else {
                    c0320a.c.setVisibility(8);
                }
                if (bankCard.isErrorStatus() || this.b > bankCard.getAmount()) {
                    c0320a.b.setEnabled(false);
                    c0320a.c.setEnabled(false);
                } else {
                    c0320a.b.setEnabled(true);
                    c0320a.c.setEnabled(true);
                }
                String enable = bankCard.getIcon() != null ? bankCard.getIcon().getEnable() : null;
                if (!TextUtils.isEmpty(enable)) {
                    w.a(enable, c0320a.a, R.drawable.mpay__bank_default_pic, R.drawable.mpay__bank_default_pic);
                }
                View findViewById = view3.findViewById(R.id.banklist_divider);
                View findViewById2 = view3.findViewById(R.id.banklist_divider__bottom);
                if (i == getCount() - 1 || (i < getCount() - 1 && getItemViewType(i) != getItemViewType(i + 1))) {
                    i2 = 0;
                    i3 = 8;
                    findViewById.setVisibility(8);
                } else {
                    i2 = 0;
                    findViewById.setVisibility(0);
                    i3 = 8;
                }
                if (i == getCount() - 1) {
                    findViewById2.setVisibility(i2);
                } else {
                    findViewById2.setVisibility(i3);
                }
                return view3;
            case 2:
                if (view == null) {
                    bVar = new b();
                    view4 = this.j.inflate(R.layout.mpay__bank_list_choose_type_item, viewGroup, false);
                    bVar.a = (ViewGroup) view4.findViewById(R.id.banklist_credit_container);
                    bVar.b = (ViewGroup) view4.findViewById(R.id.banklist_debit_container);
                    bVar.c = (TextView) view4.findViewById(R.id.banklist_credit_desc);
                    bVar.e = (TextView) view4.findViewById(R.id.banklist_debit_desc);
                    bVar.d = (TextView) view4.findViewById(R.id.credit_disable_desc);
                    bVar.h = view4.findViewById(R.id.banklist_mid_divider);
                    bVar.f = (CheckBox) view4.findViewById(R.id.banklist_credit_checkbox);
                    bVar.g = (CheckBox) view4.findViewById(R.id.banklist_debit_checkbox);
                    view4.setTag(bVar);
                } else {
                    bVar = (b) view.getTag();
                    view4 = view;
                }
                BankCardListChooseType bankCardListChooseType = (BankCardListChooseType) getItem(i);
                this.d = bankCardListChooseType.getPageType();
                this.c = this.d.equals(d.CREDIT);
                bVar.a.setOnClickListener(this);
                bVar.b.setOnClickListener(this);
                bVar.c.setText(bankCardListChooseType.getCreditDes());
                bVar.e.setText(bankCardListChooseType.getDebitDes());
                bVar.f.setChecked(this.c);
                bVar.g.setChecked(!this.c);
                if (bankCardListChooseType.isNoCredit()) {
                    bVar.c.setTextColor(ContextCompat.getColor(this.i, R.color.paybase__text_color_4));
                    if (!TextUtils.isEmpty(bankCardListChooseType.getCreditDisableDesc())) {
                        bVar.d.setText(bankCardListChooseType.getCreditDisableDesc());
                    }
                    bVar.d.setVisibility(0);
                    bVar.a.setEnabled(false);
                }
                if (bankCardListChooseType.hasTheOtherPage()) {
                    return view4;
                }
                if (this.c) {
                    bVar.h.setVisibility(8);
                    bVar.b.setVisibility(8);
                    return view4;
                } else if (bankCardListChooseType.isNoCredit()) {
                    return view4;
                } else {
                    bVar.h.setVisibility(8);
                    bVar.a.setVisibility(8);
                    return view4;
                }
            default:
                return view;
        }
    }

    @Override // com.meituan.android.pay.widget.view.PinnedHeaderListView.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd97f72edfb9a2953584fa641dad7e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd97f72edfb9a2953584fa641dad7e4b")).intValue();
        }
        while (i > 0) {
            if (getItemViewType(i) == 0) {
                return i;
            }
            i--;
        }
        return 0;
    }

    @Override // com.meituan.android.pay.widget.view.PinnedHeaderListView.a
    public final View a(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94b5193e1265ec40bf8a6fc366888c68", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94b5193e1265ec40bf8a6fc366888c68");
        }
        if (TextUtils.isEmpty((String) getItem(i))) {
            return view;
        }
        View inflate = this.j.inflate(R.layout.mpay__bank_list_title_item, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.name)).setText((String) getItem(i));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f90ce8014e41226ef4b8f684b2226aa", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f90ce8014e41226ef4b8f684b2226aa");
            return;
        }
        int id = view.getId();
        if (this.e == null) {
            return;
        }
        if (this.c && id == R.id.banklist_debit_container) {
            this.e.a(d.DEBIT);
        } else if (this.c || id != R.id.banklist_credit_container) {
        } else {
            this.e.a(d.CREDIT);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e {
        public TextView a;

        public e() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public ViewGroup a;
        public ViewGroup b;
        public TextView c;
        public TextView d;
        public TextView e;
        public CheckBox f;
        public CheckBox g;
        public View h;

        public b() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0320a {
        public ImageView a;
        public TextView b;
        public TextView c;

        public C0320a() {
        }
    }
}
