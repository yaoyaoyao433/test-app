package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements SingleWheelPicker.b {
    public static ChangeQuickRedirect a;
    private final f b;
    private final List c;

    public g(f fVar, List list) {
        this.b = fVar;
        this.c = list;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.b
    public final void a(com.sankuai.waimai.platform.ui.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa76005dd6251edb8098734074f7c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa76005dd6251edb8098734074f7c8a");
            return;
        }
        f fVar = this.b;
        List list = this.c;
        Object[] objArr2 = {fVar, list, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = f.p;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "58015a24e97294b75cf138f741bb1b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "58015a24e97294b75cf138f741bb1b43");
            return;
        }
        PhoneCodeOption phoneCodeOption = (PhoneCodeOption) aVar;
        if (phoneCodeOption.equals(fVar.q)) {
            return;
        }
        fVar.q = (PhoneCodeOption) list.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put("code", phoneCodeOption.code);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a("receive_phone_code_options_action", hashMap);
    }
}
