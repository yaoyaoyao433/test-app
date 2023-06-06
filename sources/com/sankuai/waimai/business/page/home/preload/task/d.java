package com.sankuai.waimai.business.page.home.preload.task;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.v2.LocationSPKeysV2;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends i {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "f9ce4605a65e53263151e0df342c4b19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "f9ce4605a65e53263151e0df342c4b19");
            return;
        }
        com.sankuai.waimai.platform.model.c.a().a(0);
        PreloadDataModel.get().resetAppModel(0);
        dVar.d();
    }

    public d() {
        super("IP2CityTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8725f6c68fb91022e52f45b396f5f1a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8725f6c68fb91022e52f45b396f5f1a4");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7657d419be0ce6a134ea8c963daae48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7657d419be0ce6a134ea8c963daae48");
        } else if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.platform.b.A().a(new b.InterfaceC1037b() { // from class: com.sankuai.waimai.business.page.home.preload.task.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.b.InterfaceC1037b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd96c608a324ffc5c62b65ec1c30a662", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd96c608a324ffc5c62b65ec1c30a662");
                    } else {
                        d.this.c();
                    }
                }
            });
        } else {
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed87b9bb8c45cf5a002ef7fa7496329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed87b9bb8c45cf5a002ef7fa7496329");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getABTestStrategy(e()), new b.AbstractC1042b<BaseResponse<ABTestExpStrategyResponse>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.d.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    boolean z = true;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66336399f8d7bb061cf2a96d6ad8ce2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66336399f8d7bb061cf2a96d6ad8ce2e");
                        return;
                    }
                    d dVar = d.this;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "f8e6120e2bc3b43780fdbd448b555522", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "f8e6120e2bc3b43780fdbd448b555522")).booleanValue();
                    } else {
                        if (baseResponse != null && baseResponse.isSuccess() && baseResponse.data != 0 && !com.sankuai.waimai.foundation.utils.d.a(((ABTestExpStrategyResponse) baseResponse.data).b)) {
                            Iterator<ABStrategy> it = ((ABTestExpStrategyResponse) baseResponse.data).b.iterator();
                            while (it.hasNext()) {
                                ABStrategy next = it.next();
                                if (next != null && TextUtils.equals(next.groupName, "Wm_app_authorize_compliance") && TextUtils.equals(next.sceneName, "Wm_app_authorize_compliance") && TextUtils.equals(next.expName, "C")) {
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        d.this.d();
                    } else {
                        d.a(d.this);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4950f9d0510f66056d5dae0861f8720", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4950f9d0510f66056d5dae0861f8720");
                    } else {
                        d.a(d.this);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ffbee32b4fdacf0a4a69c00df4f5f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ffbee32b4fdacf0a4a69c00df4f5f1");
        } else {
            super.d();
        }
    }

    private static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb3e03d60528abe1453a8a1a3e1a4cb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb3e03d60528abe1453a8a1a3e1a4cb8");
        }
        String str = "";
        String str2 = "";
        try {
            for (AdminInfo adminInfo : (List) k.a().fromJson(com.sankuai.waimai.foundation.location.v2.h.a(LocationSPKeysV2.GB_CITY_INFO), new TypeToken<List<AdminInfo>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.d.3
            }.getType())) {
                if (adminInfo.adminLevel == 5) {
                    str = adminInfo.adminCode;
                }
                if (adminInfo.adminLevel == 6) {
                    str2 = adminInfo.adminCode;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("key", "prefectureLevelId");
            hashMap.put("value", str);
            hashMap.put("type", "LONG");
            arrayList.add(hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("key", "countyLevelId");
            hashMap2.put("value", str2);
            hashMap2.put("type", "LONG");
            arrayList.add(hashMap2);
        }
        return k.a().toJson(arrayList);
    }
}
