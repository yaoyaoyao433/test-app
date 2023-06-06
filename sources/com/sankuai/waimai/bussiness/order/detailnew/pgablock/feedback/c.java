package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderFeedbackInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.block.b<a, com.sankuai.waimai.bussiness.order.rocks.d> implements a.InterfaceC0921a {
    public static ChangeQuickRedirect f;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a g;
    private String h;
    private boolean i;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d391874db0ea05c7001efc5ccf8f00af", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d391874db0ea05c7001efc5ccf8f00af") : new a();
    }

    public c(com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ccb27b49ab1b4c154b9ddb438eed952", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ccb27b49ab1b4c154b9ddb438eed952");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ab3daf7f08b4c1e90b9528643cceeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ab3daf7f08b4c1e90b9528643cceeb");
            return;
        }
        super.s();
        this.g = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a(m(), this, F().Y.a().b);
        F().aM.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2219d0cb18703c1da6bff272a2d4ecb8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2219d0cb18703c1da6bff272a2d4ecb8") : c.this.g;
            }
        };
        F().m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "836375579c01f3a0d91860a3ded5444c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "836375579c01f3a0d91860a3ded5444c");
                } else {
                    c.this.g.b();
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e89fb34db9082e5d69d3f85d175470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e89fb34db9082e5d69d3f85d175470");
            return;
        }
        super.I();
        d dVar = ((a) this.n).p;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "643438f599ad804955a1217db3942260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "643438f599ad804955a1217db3942260");
        } else if (this.g != null) {
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33bf5a824a538461aaa36418b4afdd2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33bf5a824a538461aaa36418b4afdd2e");
            } else {
                if (!TextUtils.isEmpty(this.h) && !TextUtils.equals(dVar.b, this.h)) {
                    z = true;
                }
                this.i = z;
                this.h = dVar.b;
            }
            if (this.i) {
                this.g.a();
            }
            if (dVar.e != null && dVar.e.s == 1) {
                if (dVar.f != null && dVar.f.autoPopUpFeedback) {
                    this.g.a(dVar.b, dVar.c, dVar.d, true);
                    return;
                } else {
                    this.g.a(dVar.b, dVar.c, dVar.d, false);
                    return;
                }
            }
            this.g.a();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a.InterfaceC0921a
    public final void a(int i, boolean z) {
        Object[] objArr = {2048, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048dbcdc7967359e12eb1f6193e64aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048dbcdc7967359e12eb1f6193e64aa4");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("code", 2048);
        arrayMap.put(RemoteMessageConst.Notification.VISIBILITY, Boolean.valueOf(z));
        f.a().a("notification_button_visibility_event", arrayMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends com.meituan.android.cube.pga.viewmodel.a<OrderRocksServerModel> {
        public static ChangeQuickRedirect o;
        @NonNull
        d p;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe972c32a2b52e40e43cec911abb5951", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe972c32a2b52e40e43cec911abb5951");
            } else {
                this.p = new d();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            d dVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2635b32c3314c5d1bb4a79894697cfc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2635b32c3314c5d1bb4a79894697cfc5");
                return;
            }
            super.d();
            if (this.c != 0) {
                OrderRocksServerModel orderRocksServerModel = (OrderRocksServerModel) this.c;
                Object[] objArr2 = {orderRocksServerModel};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "31fec536996561caaf2e628b31dd16f7", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "31fec536996561caaf2e628b31dd16f7");
                } else {
                    Map<String, Object> a = orderRocksServerModel.a("wm_order_status_feedback_info");
                    d dVar2 = new d();
                    dVar2.b = orderRocksServerModel.c.b;
                    dVar2.c = orderRocksServerModel.c.c;
                    dVar2.d = orderRocksServerModel.c.d;
                    dVar2.e = orderRocksServerModel.c.l;
                    Object obj = a.get("order_feedback_info");
                    if (obj != null) {
                        dVar2.f = (OrderFeedbackInfo) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj), (Class<Object>) OrderFeedbackInfo.class);
                    }
                    dVar = dVar2;
                }
                this.p = dVar;
            }
        }
    }
}
