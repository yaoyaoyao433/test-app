package com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public int d;
    @Nullable
    public AddressItem e;
    @Nullable
    public List<Long> f;
    public int g;
    public String h;
    public String i;
    public boolean j;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea69b41a39ca44d2f4e3b647c06a434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea69b41a39ca44d2f4e3b647c06a434");
            return;
        }
        this.b = -1L;
        this.c = "";
        this.g = -1;
    }

    public static d a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "168707b5a6911e70f373998041177e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "168707b5a6911e70f373998041177e7b");
        }
        d dVar = new d();
        dVar.d = r.a(String.valueOf(map.get("address_type")), 0);
        dVar.e = (AddressItem) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("address_info")), (Class<Object>) AddressItem.class);
        dVar.g = r.a(String.valueOf(map.get("order_template_type")), 0);
        return dVar;
    }
}
