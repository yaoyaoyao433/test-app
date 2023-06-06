package com.sankuai.waimai.store.order.detail.block;

import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.model.GroupChatInfo;
/* compiled from: ProGuard */
@DynamicBinder(modelType = GroupChatInfo.class, nativeId = {"wm_order_detail_sg_group_chat_template"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class b extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.b, a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5e56863ad07bfe09a9d499da5df4de", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5e56863ad07bfe09a9d499da5df4de") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c489f3069d75b91e1fd0fded14b76cbf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c489f3069d75b91e1fd0fded14b76cbf") : new com.sankuai.waimai.store.order.detail.blockview.b(m());
    }

    public b(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053c5a922b7259133d6662e610cd0916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053c5a922b7259133d6662e610cd0916");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbac51cdf68e6063dfa701e31d32a500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbac51cdf68e6063dfa701e31d32a500");
            return;
        }
        super.I();
        a(0, com.sankuai.waimai.foundation.utils.g.a(m(), 6.0f), 0, 0);
        r().a(((a) this.n).e().imGroupChatInfo, ((com.sankuai.waimai.business.order.api.detail.block.b) F()).j().a(), ((com.sankuai.waimai.business.order.api.detail.block.b) F()).k().a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<GroupChatInfo> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfe68fb4d11d57a5224daf64a6e8ad8", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfe68fb4d11d57a5224daf64a6e8ad8");
            }
            if (this.c != 0 && !TextUtils.isEmpty(((GroupChatInfo) this.c).imGroupChatInfo)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
