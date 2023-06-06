package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Map<Integer, InterfaceC0845a> b;
    public final AtomicInteger c;
    MPContext d;
    final h e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0845a {
        void a(Map<String, Object> map);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27587e143896be3b6938f74e647e65c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27587e143896be3b6938f74e647e65c");
            return;
        }
        this.b = new HashMap();
        this.c = new AtomicInteger(1);
        this.e = new h() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.h
            public final void a(String str, MachMap machMap) {
                InterfaceC0845a remove;
                Object[] objArr2 = {str, machMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf169a13efbc5c14fc2894e416a922e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf169a13efbc5c14fc2894e416a922e6");
                } else if ("multiSpecCallback".equals(str)) {
                    int intValue = ((Integer) machMap.get("callBackId")).intValue();
                    if (a.this.b.containsKey(Integer.valueOf(intValue)) && (remove = a.this.b.remove(Integer.valueOf(intValue))) != null && machMap.containsKey("data")) {
                        remove.a(((MachMap) machMap.get("data")).getJavaMap());
                    }
                }
            }
        };
    }

    public void a(int i, int i2, String str, String str2, String str3, String str4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3b7ecef6c73163b3802912224b75c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3b7ecef6c73163b3802912224b75c7");
        } else if (this.d != null) {
            MachMap machMap = new MachMap();
            machMap.put("type", Integer.valueOf(i));
            machMap.put("callbackId", Integer.valueOf(i2));
            machMap.put("groupId", str);
            machMap.put("spuId", str2);
            machMap.put("skuId", str3);
            machMap.put("attrs", str4);
            this.d.getInstance().a("multiSpecOp", machMap);
        }
    }
}
