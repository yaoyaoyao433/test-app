package com.meituan.android.cube.pga.dynamic.generated;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.block.b;
import com.sankuai.waimai.store.order.detail.model.GroupChatInfo;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ao implements com.meituan.android.cube.pga.dynamic.d<GroupChatInfo> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.block.b a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1d207b02ccd5eaafb5f840295355b3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1d207b02ccd5eaafb5f840295355b3") : new com.sankuai.waimai.store.order.detail.block.b((com.sankuai.waimai.business.order.api.detail.block.b) aVar);
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a a(GroupChatInfo groupChatInfo) {
        GroupChatInfo groupChatInfo2 = groupChatInfo;
        Object[] objArr = {groupChatInfo2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7126b0e4c3fd79db35019ae9a1482075", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7126b0e4c3fd79db35019ae9a1482075");
        }
        b.a aVar = new b.a();
        aVar.a((b.a) groupChatInfo2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cube.pga.dynamic.d
    /* renamed from: b */
    public GroupChatInfo a(String str, Gson gson) {
        Object[] objArr = {str, gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01532fe7d45643cd2f0fdcf12b0eb902", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroupChatInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01532fe7d45643cd2f0fdcf12b0eb902");
        }
        try {
            return (GroupChatInfo) gson.fromJson(str, (Class<Object>) GroupChatInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cube.pga.dynamic.d
    public final Type a() {
        return com.sankuai.waimai.store.order.detail.block.b.class;
    }
}
