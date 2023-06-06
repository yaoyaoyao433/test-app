package com.sankuai.waimai.launcher.init.secondary.business.address;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.capacity.persistent.sp.a;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.geo.UserAddressAPI;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LoadAddressInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "LoadAddressInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2def96454ac3c6c8d396b124173b09f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2def96454ac3c6c8d396b124173b09f7");
        } else {
            b.a(((UserAddressAPI) b.a((Class<Object>) UserAddressAPI.class)).fetchNewHistoryAddress("1", "0"), new b.AbstractC1042b<NewHistoryAddressResponse>() { // from class: com.sankuai.waimai.launcher.init.secondary.business.address.LoadAddressInit.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    NewHistoryAddressResponse newHistoryAddressResponse = (NewHistoryAddressResponse) obj;
                    Object[] objArr2 = {newHistoryAddressResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df741e3359df2b8e70ef26f90e5a5c54", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df741e3359df2b8e70ef26f90e5a5c54");
                    } else if (newHistoryAddressResponse != null && newHistoryAddressResponse.b == 0 && newHistoryAddressResponse.f != null) {
                        List<AddressItem> list = newHistoryAddressResponse.f;
                        JSONArray jSONArray = new JSONArray();
                        int size = list.size() <= 50 ? list.size() : 50;
                        for (int i = 0; i < size; i++) {
                            jSONArray.put(list.get(i).toJson());
                        }
                        a.a((Context) application, "address_list", jSONArray.toString());
                        com.sankuai.waimai.platform.domain.manager.location.a.a(newHistoryAddressResponse.f);
                    }
                }
            }, b.b, false);
        }
    }
}
