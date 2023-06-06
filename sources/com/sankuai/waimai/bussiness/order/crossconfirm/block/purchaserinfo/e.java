package com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo;

import android.text.InputFilter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements SingleWheelPicker.b {
    public static ChangeQuickRedirect a;
    private final c b;

    public e(c cVar) {
        this.b = cVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.b
    public final void a(com.sankuai.waimai.platform.ui.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de30b27621341e14a696b667feb16b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de30b27621341e14a696b667feb16b1");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9e992f5b25c2dd092d6e07e089a82c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9e992f5b25c2dd092d6e07e089a82c8");
        } else if (((PhoneCodeOption) aVar).code.equals(cVar.n.code)) {
        } else {
            cVar.n = cVar.o.get(i);
            TextView textView = cVar.m;
            textView.setText("+" + cVar.n.code);
            cVar.e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            if (cVar.q != null) {
                cVar.q.a();
            }
        }
    }
}
