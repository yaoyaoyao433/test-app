package com.sankuai.waimai.store.order.prescription.block;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_confirm_order_drug_upload_prescription_mach_block"}, viewModel = com.sankuai.waimai.store.order.prescription.model.c.class)
/* loaded from: classes5.dex */
public class f extends b<com.sankuai.waimai.store.order.prescription.view.c, com.sankuai.waimai.store.order.prescription.model.c, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect s;
    private final a t;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29c38b416644e3e8701ce1eb7e986f5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29c38b416644e3e8701ce1eb7e986f5") : new com.sankuai.waimai.store.order.prescription.model.c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c14b5ace3d00276146bd2cf63be028", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c14b5ace3d00276146bd2cf63be028") : new com.sankuai.waimai.store.order.prescription.view.c(l(), o()) { // from class: com.sankuai.waimai.store.order.prescription.block.f.1
            public static ChangeQuickRedirect d;

            @Override // com.sankuai.waimai.store.order.prescription.view.c
            public final List<com.sankuai.waimai.store.order.prescription.b> e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3449bf970bdcee81a5fe639d691f922", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3449bf970bdcee81a5fe639d691f922");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(f.this.N());
                return arrayList;
            }
        };
    }

    public f(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbc882c8fc76c0ef497cd99785b004b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbc882c8fc76c0ef497cd99785b004b");
            return;
        }
        this.t = new a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06526c72f013d8711d1bda16ac033b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06526c72f013d8711d1bda16ac033b3f");
        } else if (l() != null) {
            l().registerReceiver(this.t, new IntentFilter("med_dtp_upload_prescription_action"));
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final List<OrderConfirmMachTemplate> a(@NonNull OrderConfirmMachTemplateList orderConfirmMachTemplateList) {
        return orderConfirmMachTemplateList.uploadPrescription;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05826ee8b6be6503173d58f497570ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05826ee8b6be6503173d58f497570ad");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757ed4036022f629e48ad797d9a58e1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757ed4036022f629e48ad797d9a58e1a");
            } else if (!"med_dtp_upload_prescription_action".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            } else {
                ((com.sankuai.waimai.store.order.prescription.view.c) f.this.g).b(extras.getString("data"));
            }
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1042517e6e41c38ed0dd5434fba39cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1042517e6e41c38ed0dd5434fba39cf8");
            return;
        }
        super.bE_();
        if (l() != null) {
            try {
                l().unregisterReceiver(this.t);
            } catch (Exception unused) {
            }
        }
    }
}
