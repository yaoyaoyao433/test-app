package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g {
    public static ChangeQuickRedirect a;

    public c(@NonNull f fVar, @NonNull ViewGroup viewGroup) {
        super(fVar, viewGroup);
        Object[] objArr = {fVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fca5ff158b74d6ed201486e95f9fb99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fca5ff158b74d6ed201486e95f9fb99");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.g
    public final void a(List<BaseModuleDesc> list, int i, @NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {list, Integer.valueOf(i), baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4161da53b65437ebe47ac950afc2242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4161da53b65437ebe47ac950afc2242");
            return;
        }
        String str = baseModuleDesc.templateId;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ad72e726d7984274fb6b022ef6f8283", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ad72e726d7984274fb6b022ef6f8283")).booleanValue() : TextUtils.equals(str, "supermarket-drug-poi-header-info")) {
            return;
        }
        super.a(list, i, baseModuleDesc);
    }
}
