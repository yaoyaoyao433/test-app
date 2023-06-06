package com.sankuai.waimai.platform.domain.manager.location.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.capacity.log.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum b {
    APP_INIT { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.1
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "144764e50def0053b7f8edeb322668b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "144764e50def0053b7f8edeb322668b8");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_app_init");
            }
        }
    },
    POI_FRAGMENT { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.2
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817e9cd9c13a8fd1e29da482959099fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817e9cd9c13a8fd1e29da482959099fc");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_poi_fragment");
            }
        }
    },
    SUGOU { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.3
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7729b0b7f4cc4a105ba77ea5253d80df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7729b0b7f4cc4a105ba77ea5253d80df");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_sugou");
            }
        }
    },
    KNB { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.4
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c476dc25db661430b65c5d41b6706a45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c476dc25db661430b65c5d41b6706a45");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_knb");
            }
        }
    },
    LOCATE_MANUALLY { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.5
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e2cc6f9c907e6cc2a3a184c859d0d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e2cc6f9c907e6cc2a3a184c859d0d8");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_manully");
            }
        }
    },
    ORDER_CONFIRM { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.6
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5597eff48bd01b5767fd1eaab43335", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5597eff48bd01b5767fd1eaab43335");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_order_confirm");
            }
        }
    },
    SELF_DELIVERY { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.7
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9315a14899ed03a9040a2a0dfbff8ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9315a14899ed03a9040a2a0dfbff8ce");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_selfdelivery");
            }
        }
    },
    TAKEOUT_TIP { // from class: com.sankuai.waimai.platform.domain.manager.location.v2.b.8
        public static ChangeQuickRedirect j;

        @Override // com.sankuai.waimai.platform.domain.manager.location.v2.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc539855e080525cb708be85517e8a9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc539855e080525cb708be85517e8a9c");
            } else {
                c.a().a(wMLocation.getLocationResultCode().a, (int) wMLocation.getLocateDuration(), "waimai_location_takeoutip");
            }
        }
    };
    
    public static ChangeQuickRedirect a;

    public abstract void a(WMLocation wMLocation);

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090e41299a586824cdd0fc734274a1fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090e41299a586824cdd0fc734274a1fb");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3862230827dea1f3b63befd6d299675b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3862230827dea1f3b63befd6d299675b") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62852ee8486357a73f1b10cf317bbc68", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62852ee8486357a73f1b10cf317bbc68") : (b[]) values().clone();
    }
}
