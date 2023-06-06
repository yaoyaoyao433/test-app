package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FloatCardViewModule extends o {
    public static ChangeQuickRedirect a;
    public k<OrderMessageEntity> b;

    public FloatCardViewModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcaff34a7347a908c81240a383b70f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcaff34a7347a908c81240a383b70f0");
        } else {
            this.b = new k<>();
        }
    }

    public final void a(@NonNull final SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "243f4efbdbf2b34cb8192c3d53acae1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "243f4efbdbf2b34cb8192c3d53acae1e");
        } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.store.drug.base.net.b.a(sCBaseActivity.w()).d(new com.sankuai.waimai.store.base.net.k<OrderMessageEntity>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.FloatCardViewModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    OrderMessageEntity orderMessageEntity = (OrderMessageEntity) obj;
                    Object[] objArr2 = {orderMessageEntity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c21efc0c2f0ebe8a7f03bf8083e139ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c21efc0c2f0ebe8a7f03bf8083e139ba");
                        return;
                    }
                    super.a((AnonymousClass1) orderMessageEntity);
                    if (com.sankuai.waimai.store.util.b.a(sCBaseActivity)) {
                        return;
                    }
                    FloatCardViewModule.this.b.b((k<OrderMessageEntity>) orderMessageEntity);
                }
            });
        }
    }
}
