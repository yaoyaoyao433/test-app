package com.sankuai.waimai.store.order.prescription.block;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.confirm.block.a;
import com.sankuai.waimai.store.order.prescription.model.c;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateList;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateMap;
import com.sankuai.waimai.store.order.prescription.view.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<ViewType extends com.sankuai.waimai.store.order.prescription.view.c, ViewModelType extends com.sankuai.waimai.store.order.prescription.model.c, ContextType extends com.sankuai.waimai.business.order.api.confirm.block.a> extends com.meituan.android.cube.pga.block.a<ViewType, ViewModelType, ContextType> {
    public static ChangeQuickRedirect r;

    public abstract List<OrderConfirmMachTemplate> a(@NonNull OrderConfirmMachTemplateList orderConfirmMachTemplateList);

    public void a(@NonNull Map<String, Object> map) {
    }

    public b(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab84024652f81ead0432117e54fb86f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab84024652f81ead0432117e54fb86f8");
            return;
        }
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).g().a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.store.order.prescription.block.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5795ecbbba86f898cf54d495e78034ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5795ecbbba86f898cf54d495e78034ff");
                    return;
                }
                com.sankuai.waimai.store.order.prescription.view.c cVar = (com.sankuai.waimai.store.order.prescription.view.c) b.this.g;
                int i = aVar2.a;
                int i2 = aVar2.b;
                Intent intent = aVar2.c;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.c.f;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d76fddfe0e67d76921387c02e2db6e55", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d76fddfe0e67d76921387c02e2db6e55");
                } else if (i != com.sankuai.waimai.store.order.prescription.a.a || intent == null) {
                } else {
                    String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                    if (i2 == -1) {
                        cVar.b(a2);
                    } else if (i2 == 200) {
                        cVar.a(a2);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).o().a(new com.sankuai.waimai.business.order.api.a<i.c<Integer, Map<String, Object>>>(i()) { // from class: com.sankuai.waimai.store.order.prescription.block.b.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.order.api.a
            public final /* synthetic */ void b(i.c<Integer, Map<String, Object>> cVar) {
                i.c<Integer, Map<String, Object>> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07fcbe8ca27f49c400121ead56a5935f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07fcbe8ca27f49c400121ead56a5935f");
                } else if (cVar2 == null || cVar2.d == null) {
                } else {
                    cVar2.d.putAll(((com.sankuai.waimai.store.order.prescription.view.c) b.this.r()).h);
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).m().a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.store.order.prescription.block.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e2b679bbf25ec0fdb730864189dd63a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e2b679bbf25ec0fdb730864189dd63a");
                } else if (num2 == null || num2.intValue() != 1) {
                } else {
                    ((com.sankuai.waimai.business.order.api.confirm.block.a) b.this.F()).a(b.this.i());
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468eb85afb1d6bdaf99acf79b5774a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468eb85afb1d6bdaf99acf79b5774a37");
            return;
        }
        super.I();
        OrderConfirmMachTemplateMap M = M();
        if (M == null || M.machTemplateMap == null) {
            com.sankuai.waimai.store.order.prescription.view.c cVar = (com.sankuai.waimai.store.order.prescription.view.c) r();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.prescription.view.c.f;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b63f63081b5c23896cb8d3efaaa9ce03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b63f63081b5c23896cb8d3efaaa9ce03");
                return;
            } else {
                cVar.a().setVisibility(8);
                return;
            }
        }
        Long l = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).i().a().b;
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", Long.valueOf(l == null ? 1L : l.longValue()));
        a((Map<String, Object>) hashMap);
        ((com.sankuai.waimai.store.order.prescription.view.c) r()).a(a(M.machTemplateMap), hashMap, "c_ykhs39e");
    }

    public OrderConfirmMachTemplateMap M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe5caaf7f74be8dc2bcffd352aaf6bf", RobustBitConfig.DEFAULT_VALUE) ? (OrderConfirmMachTemplateMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe5caaf7f74be8dc2bcffd352aaf6bf") : (OrderConfirmMachTemplateMap) com.sankuai.waimai.store.util.i.a(((com.sankuai.waimai.store.order.prescription.model.c) G()).e(), OrderConfirmMachTemplateMap.class);
    }

    @Override // com.meituan.android.cube.core.f
    public void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52dbbd9204bea60730b74d36cd9e92cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52dbbd9204bea60730b74d36cd9e92cf");
            return;
        }
        super.bE_();
        ((com.sankuai.waimai.store.order.prescription.view.c) r()).f();
    }

    public final a N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23030b87f84b6ab39cbf1270b187bf1a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23030b87f84b6ab39cbf1270b187bf1a") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements com.sankuai.waimai.store.order.prescription.b {
        public static ChangeQuickRedirect a;
        @NonNull
        private final b<? extends com.sankuai.waimai.store.order.prescription.view.c, ? extends com.sankuai.waimai.store.order.prescription.model.c, ? extends com.sankuai.waimai.business.order.api.confirm.block.a> b;

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final String a() {
            return "page_refresh";
        }

        private a(@NotNull b<? extends com.sankuai.waimai.store.order.prescription.view.c, ? extends com.sankuai.waimai.store.order.prescription.model.c, ? extends com.sankuai.waimai.business.order.api.confirm.block.a> bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bade6ff44fc0773b80fcfc7a2401c4d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bade6ff44fc0773b80fcfc7a2401c4d7");
            } else {
                this.b = bVar;
            }
        }

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final void a(com.sankuai.waimai.store.order.prescription.view.b bVar, Map<String, Object> map) {
            Object[] objArr = {bVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f72238c990388c2af1e70c3e315a92c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f72238c990388c2af1e70c3e315a92c");
                return;
            }
            String a2 = com.sankuai.waimai.store.util.i.a(map);
            if (a2 == null) {
                a2 = "";
            }
            ((com.sankuai.waimai.store.order.prescription.view.c) this.b.r()).b(a2);
            ((com.sankuai.waimai.business.order.api.confirm.block.a) this.b.F()).a(0);
        }
    }
}
