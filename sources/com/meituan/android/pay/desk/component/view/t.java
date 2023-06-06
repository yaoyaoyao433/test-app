package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CombineDetailItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private com.meituan.android.pay.common.payment.data.c c;

    public t(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a7cb3177d16dd27b57b21484deb239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a7cb3177d16dd27b57b21484deb239");
            return;
        }
        this.b = linearLayout;
        this.c = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b903cdc7948d27eab6323f4417b2a115", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b903cdc7948d27eab6323f4417b2a115")).booleanValue() : !com.meituan.android.paybase.utils.i.a((Collection) com.meituan.android.pay.desk.component.data.a.d(this.c));
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4278af596c62c02ab94929468ea574d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4278af596c62c02ab94929468ea574d9");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_value_card_combine_view), (int) R.layout.mpay__valuecard_combine_pay);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0b0b6b2cd1980a32f460f9fdf5fbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0b0b6b2cd1980a32f460f9fdf5fbe6");
        } else if (this.b != null) {
            List<CombineDetailItem> d = com.meituan.android.pay.desk.component.data.a.d(this.c);
            LinearLayout linearLayout = (LinearLayout) this.b.findViewById(R.id.mpay__valuecard_combine_pay_hint);
            if (com.meituan.android.paybase.utils.i.a((Collection) d)) {
                return;
            }
            this.b.setVisibility(0);
            for (CombineDetailItem combineDetailItem : d) {
                View inflate = LayoutInflater.from(this.b.getContext()).inflate(R.layout.paycommon__combine_pay_hint, (ViewGroup) this.b, false);
                if (combineDetailItem != null) {
                    ((TextView) inflate.findViewById(R.id.combine_pay_name)).setText(combineDetailItem.getCombineDetailName());
                    ((TextView) inflate.findViewById(R.id.combine_pay_amount)).setText(combineDetailItem.getCombineDetailAmount());
                    linearLayout.addView(inflate);
                }
            }
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af96447bf759d98b5111b08d51e40311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af96447bf759d98b5111b08d51e40311");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_value_card_combine_view));
        }
    }
}
