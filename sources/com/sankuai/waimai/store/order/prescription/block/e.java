package com.sankuai.waimai.store.order.prescription.block;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateList;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateMap;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_confirm_order_supermarket_switch_merchant"}, viewModel = com.sankuai.waimai.store.order.prescription.model.c.class)
/* loaded from: classes5.dex */
public class e extends com.sankuai.waimai.store.order.prescription.block.b<c, com.sankuai.waimai.store.order.prescription.model.c, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect s;
    private final Map<String, Object> t;
    @Nullable
    private OrderConfirmMachTemplateMap u;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d71a8774ec5ba530bebc838a368d739", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d71a8774ec5ba530bebc838a368d739") : new com.sankuai.waimai.store.order.prescription.model.c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e79012d8c2a86a4bbd4e587223f3cca", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e79012d8c2a86a4bbd4e587223f3cca") : new c(l(), o(), this);
    }

    public e(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7bb83b1309e495865a430a5c952ef2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7bb83b1309e495865a430a5c952ef2");
            return;
        }
        this.t = new HashMap();
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).s().b = new com.meituan.android.cube.pga.action.d<Map<String, Object>>() { // from class: com.sankuai.waimai.store.order.prescription.block.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Map<String, Object> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f73afbc269091aed70a6f0a10f2b65", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f73afbc269091aed70a6f0a10f2b65") : e.this.t;
            }
        };
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final List<OrderConfirmMachTemplate> a(@NonNull OrderConfirmMachTemplateList orderConfirmMachTemplateList) {
        return orderConfirmMachTemplateList.poiSwitch;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements com.sankuai.waimai.store.order.prescription.b {
        public static ChangeQuickRedirect a;
        @NonNull
        private e b;

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final String a() {
            return "show_select_deliver_time_dialog";
        }

        private b(@NotNull e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33d81c5c3e0c3b22de168520cfae0c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33d81c5c3e0c3b22de168520cfae0c6");
            } else {
                this.b = eVar;
            }
        }

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final void a(com.sankuai.waimai.store.order.prescription.view.b bVar, Map<String, Object> map) {
            Object[] objArr = {bVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129cfdb612011bd0bb5c2460e9cde24f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129cfdb612011bd0bb5c2460e9cde24f");
            } else {
                ((com.sankuai.waimai.business.order.api.confirm.block.a) this.b.F()).r().a((com.meituan.android.cube.pga.common.b<Void>) null);
            }
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final void a(@NonNull Map<String, Object> map) {
        boolean z = true;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3746a63511768eb6fd37abdbe6eb5f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3746a63511768eb6fd37abdbe6eb5f0d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d4902b594b0f0539338f3e36c0ee972", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d4902b594b0f0539338f3e36c0ee972")).booleanValue();
        } else {
            Boolean bool = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).t().a().b;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            }
        }
        if (!z) {
            map.put("select_view_time", "");
            return;
        }
        String str = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).u().a().b;
        if (str == null) {
            str = "";
        }
        map.put("select_view_time", str);
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final OrderConfirmMachTemplateMap M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f60c14b4b117fa94e44df81d03b1e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderConfirmMachTemplateMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f60c14b4b117fa94e44df81d03b1e9");
        }
        Boolean bool = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).t().a().b;
        if (bool != null && bool.booleanValue()) {
            return this.u;
        }
        this.u = (OrderConfirmMachTemplateMap) i.a(((com.sankuai.waimai.store.order.prescription.model.c) G()).e(), OrderConfirmMachTemplateMap.class);
        return this.u;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends com.sankuai.waimai.store.order.prescription.view.c {
        public static ChangeQuickRedirect d;
        @NonNull
        private final e e;

        public c(Activity activity, String str, @NotNull e eVar) {
            super(activity, str);
            Object[] objArr = {activity, str, eVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764de5a0c31c118e66ecca60f5167b35", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764de5a0c31c118e66ecca60f5167b35");
            } else {
                this.e = eVar;
            }
        }

        @Override // com.sankuai.waimai.store.order.prescription.view.c
        public final List<com.sankuai.waimai.store.order.prescription.b> e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f954d88b10c34d672d4b0b53580ec2c", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f954d88b10c34d672d4b0b53580ec2c");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new a());
            arrayList.add(new b());
            return arrayList;
        }

        @Override // com.sankuai.waimai.store.order.prescription.view.c, com.meituan.android.cube.pga.view.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f166188ec9563f6dbd5895bac7ae4a65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f166188ec9563f6dbd5895bac7ae4a65");
                return;
            }
            super.b();
            this.g.setDividerDrawable(null);
        }

        @Override // com.sankuai.waimai.store.order.prescription.view.c
        public final void a(List<OrderConfirmMachTemplate> list, Map<String, Object> map, String str) {
            Object[] objArr = {list, map, str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9819bff45c408e6ab3042562bed1a49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9819bff45c408e6ab3042562bed1a49");
            } else {
                super.a(list, map, str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements com.sankuai.waimai.store.order.prescription.b {
        public static ChangeQuickRedirect a;
        @NonNull
        private e b;

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final String a() {
            return "on_change_poi";
        }

        private a(@NotNull e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de68a4ef6aa1ccbf6f12c59f8de6e499", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de68a4ef6aa1ccbf6f12c59f8de6e499");
            } else {
                this.b = eVar;
            }
        }

        @Override // com.sankuai.waimai.store.order.prescription.b
        public final void a(com.sankuai.waimai.store.order.prescription.view.b bVar, Map<String, Object> map) {
            Object[] objArr = {bVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c52c2bca9355e75f030cd7c0020cec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c52c2bca9355e75f030cd7c0020cec");
                return;
            }
            this.b.t.clear();
            if (map != null) {
                this.b.t.putAll(map);
            }
            ((com.sankuai.waimai.business.order.api.confirm.block.a) this.b.F()).a(5);
        }
    }
}
