package com.sankuai.waimai.business.restaurant.poicontainer.machpro.notification;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.pga.block.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.d;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.j;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b<com.meituan.android.cube.pga.viewmodel.a<JsonObject>, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect f;
    boolean g;
    public MPNestedContainerFragment h;
    j i;
    private final d r;

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478195a09a230e9ee130f5f9bbc40899", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478195a09a230e9ee130f5f9bbc40899");
            return;
        }
        this.g = false;
        this.r = new d() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.notification.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.d
            public final void a(String str, boolean z, int i, Activity activity) {
                boolean z2;
                boolean z3 = false;
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0e0df5e0cb1197934bfebe329607cd6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0e0df5e0cb1197934bfebe329607cd6");
                    return;
                }
                com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(str);
                if (a.this.i == null || a.this.i.c == -1) {
                    return;
                }
                if (n.a(str) + (z ? 0 : i) < a.this.i.c || !a.this.g) {
                    return;
                }
                String str2 = str + "notice";
                int i2 = a.this.i.b;
                Object[] objArr3 = {activity, str2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "86675e79be91adfd91437b3f6f207606", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "86675e79be91adfd91437b3f6f207606")).booleanValue();
                } else {
                    if (activity != null) {
                        SharedPreferences sharedPreferences = activity.getSharedPreferences("DailyNotificationInfo", 0);
                        if (sharedPreferences.getLong(str2, -1L) == com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a()) {
                            if (sharedPreferences.getLong(str2 + "Count", -1L) >= i2) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2 || a.this.i.f == null || a.this.i.f.length() <= 0) {
                    return;
                }
                if (a.this.h != null) {
                    a.this.h.b("showNotice", null);
                }
                String str3 = str + "notice";
                long a2 = com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a();
                Object[] objArr4 = {activity, str3, new Long(a2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2fddcfd31f0a093ea06ceaa5622922bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2fddcfd31f0a093ea06ceaa5622922bf");
                } else if (activity != null) {
                    SharedPreferences sharedPreferences2 = activity.getSharedPreferences("DailyNotificationInfo", 0);
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.putLong(str3, a2);
                    Object[] objArr5 = {activity, str3};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ebe0bcccded0e30abf9e67b3fb16e8ed", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ebe0bcccded0e30abf9e67b3fb16e8ed")).booleanValue();
                    } else if (activity != null && activity.getSharedPreferences("DailyNotificationInfo", 0).getLong(str3, -1L) == com.sankuai.waimai.business.restaurant.poicontainer.utils.d.a()) {
                        z3 = true;
                    }
                    if (z3) {
                        edit.putLong(str3 + "Count", sharedPreferences2.getLong(str3 + "Count", 0L) + 1);
                    } else {
                        edit.putLong(str3 + "Count", 1L);
                    }
                    edit.apply();
                }
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a<JsonObject> L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e4314f291c2cdd5e90850523c5a695", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e4314f291c2cdd5e90850523c5a695") : new com.meituan.android.cube.pga.viewmodel.a<>((Context) null);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a0b1d9a36930ae950e1159310b1bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a0b1d9a36930ae950e1159310b1bee");
            return;
        }
        super.I();
        JsonObject e = G().e();
        try {
            List list = (List) new GsonBuilder().create().fromJson(e.get("poi_rule_notices").getAsJsonArray(), new TypeToken<ArrayList<j>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.notification.a.1
            }.getType());
            if (list.size() > 0) {
                this.i = (j) list.get(0);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0cd4e5671d5f3a62e198f76c0a1ff71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0cd4e5671d5f3a62e198f76c0a1ff71");
            return;
        }
        super.aR_();
        k a = k.a();
        d dVar = this.r;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "d58cb385655a71b12d4b8739d50ba046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "d58cb385655a71b12d4b8739d50ba046");
        } else if (dVar != null) {
            a.d.add(dVar);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c86651916cceaf30a6689e9318a79a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c86651916cceaf30a6689e9318a79a");
            return;
        }
        super.aX_();
        this.g = true;
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a294c2ec5115a5063fddcbd526f8c3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a294c2ec5115a5063fddcbd526f8c3b9");
            return;
        }
        super.bc_();
        this.g = false;
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df12e3a05a6fadbde6b91f403100b586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df12e3a05a6fadbde6b91f403100b586");
            return;
        }
        super.bD_();
        k.a().a(this.r);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7287f76bf86bb881d7726fece5d8a7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7287f76bf86bb881d7726fece5d8a7ea");
            return;
        }
        super.v();
        k.a().a(this.r);
    }
}
