package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends f {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f
    public final void a(List<BaseModuleDesc> list, int i, @NonNull BaseModuleDesc baseModuleDesc) {
    }

    public c(@NonNull e eVar, @NonNull ViewGroup viewGroup) {
        super(eVar, viewGroup);
        Object[] objArr = {eVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed627f28276d4bf73c2c79194d260c27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed627f28276d4bf73c2c79194d260c27");
        }
    }
}
