package com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements SingleWheelPicker.b {
    public static ChangeQuickRedirect a;
    private final PhoneCodeOption b;
    private final List c;

    public c(PhoneCodeOption phoneCodeOption, List list) {
        this.b = phoneCodeOption;
        this.c = list;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.b
    public final void a(com.sankuai.waimai.platform.ui.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8b9a849c20a4bdcaa8ae92baedd4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8b9a849c20a4bdcaa8ae92baedd4b5");
            return;
        }
        PhoneCodeOption phoneCodeOption = this.b;
        List list = this.c;
        Object[] objArr2 = {phoneCodeOption, list, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32e10eadc73774f0a929a8e3e72fe1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32e10eadc73774f0a929a8e3e72fe1aa");
        } else if (((PhoneCodeOption) aVar).code.equals(phoneCodeOption.code)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("phoneCode", com.sankuai.waimai.mach.utils.b.a(d.a().toJson((PhoneCodeOption) list.get(i))));
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a("phone_inter_code_event", hashMap);
        }
    }
}
