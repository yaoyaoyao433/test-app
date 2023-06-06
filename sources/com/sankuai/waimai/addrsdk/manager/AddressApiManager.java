package com.sankuai.waimai.addrsdk.manager;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.api.AddressApi;
import com.sankuai.waimai.addrsdk.api.AddressTagApi;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressListResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.addrsdk.mvp.bean.CitySearchListBean;
import com.sankuai.waimai.addrsdk.retrofit.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressApiManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AddressApiManager instance;
    private com.sankuai.waimai.addrsdk.mvp.model.impl.a mAddrImpl;
    private com.sankuai.waimai.addrsdk.mvp.model.impl.c mTagImpl;

    public AddressApiManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8723d379d952ffee951554ed137680e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8723d379d952ffee951554ed137680e");
            return;
        }
        this.mTagImpl = new com.sankuai.waimai.addrsdk.mvp.model.impl.c();
        this.mAddrImpl = new com.sankuai.waimai.addrsdk.mvp.model.impl.a();
    }

    public static AddressApiManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fa7a9d453a84d384051d2e09b35170f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressApiManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fa7a9d453a84d384051d2e09b35170f");
        }
        if (instance == null) {
            synchronized (AddressApiManager.class) {
                if (instance == null) {
                    instance = new AddressApiManager();
                }
            }
        }
        return instance;
    }

    @Deprecated
    public void getAddressList(int i, String str, com.sankuai.waimai.addrsdk.mvp.model.d<BaseResponse<AddressListResponse>, String> dVar) {
        Object[] objArr = {Integer.valueOf(i), str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b234e70e6b3bf5344d1c808d921ccd29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b234e70e6b3bf5344d1c808d921ccd29");
        } else if (com.sankuai.waimai.addrsdk.utils.a.a()) {
            this.mAddrImpl.a(i, str, dVar);
        } else if (dVar != null) {
            dVar.a("not init");
        }
    }

    public void getAddressList(AddressType addressType, String str, com.sankuai.waimai.addrsdk.mvp.model.d<BaseResponse<AddressListResponse>, String> dVar) {
        Object[] objArr = {addressType, str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea98bb66748f301642beedd103f8212d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea98bb66748f301642beedd103f8212d");
        } else if (!com.sankuai.waimai.addrsdk.utils.a.a()) {
            if (dVar != null) {
                dVar.a("not init");
            }
        } else {
            com.sankuai.waimai.addrsdk.mvp.model.impl.a aVar = this.mAddrImpl;
            if (addressType == null) {
                addressType = AddressType.LBS_TYPE;
            }
            aVar.a(addressType.getValue(), str, dVar);
        }
    }

    public void saveTag(String str, int i, final com.sankuai.waimai.addrsdk.mvp.model.d<BaseResponse, String> dVar) {
        Object[] objArr = {str, Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33158d4c533415d96409d08d38fd8950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33158d4c533415d96409d08d38fd8950");
        } else if (!com.sankuai.waimai.addrsdk.utils.a.a()) {
            if (dVar != null) {
                dVar.a("not init");
            }
        } else {
            final com.sankuai.waimai.addrsdk.mvp.model.impl.c cVar = this.mTagImpl;
            Object[] objArr2 = {str, Integer.valueOf(i), dVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.addrsdk.mvp.model.impl.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "36d8ead31b43e52967963a7e98a70ec9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "36d8ead31b43e52967963a7e98a70ec9");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("address_view_id", str);
                jSONObject.put("tag_id", i);
            } catch (Exception unused) {
            }
            com.sankuai.waimai.addrsdk.retrofit.c.a(((AddressTagApi) com.sankuai.waimai.addrsdk.retrofit.c.a(AddressTagApi.class)).save(jSONObject.toString(), a.a().c()), new c.b<BaseResponse>() { // from class: com.sankuai.waimai.addrsdk.mvp.model.impl.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "93939d6b4235f608847a95622c2c1536", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "93939d6b4235f608847a95622c2c1536");
                    } else if (dVar != null) {
                        dVar.b(baseResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "407a045f7db19e26b6f2169efda08fe6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "407a045f7db19e26b6f2169efda08fe6");
                    } else if (dVar != null) {
                        dVar.a(th.getMessage());
                    }
                }
            }, null);
        }
    }

    public void delect(String str, final com.sankuai.waimai.addrsdk.mvp.model.d<BaseResponse, String> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "172ce01228cd7c75456bd39732ac61cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "172ce01228cd7c75456bd39732ac61cf");
        } else if (!com.sankuai.waimai.addrsdk.utils.a.a()) {
            if (dVar != null) {
                dVar.a("not init");
            }
        } else {
            final com.sankuai.waimai.addrsdk.mvp.model.impl.a aVar = this.mAddrImpl;
            Object[] objArr2 = {str, dVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.addrsdk.mvp.model.impl.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "1c9cc553b6c1604374581844c865a45b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "1c9cc553b6c1604374581844c865a45b");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("address_view_id", str);
            } catch (Exception unused) {
            }
            com.sankuai.waimai.addrsdk.retrofit.c.a(((AddressApi) com.sankuai.waimai.addrsdk.retrofit.c.a(AddressApi.class)).delete(jSONObject.toString(), a.a().c()), new c.b<BaseResponse>() { // from class: com.sankuai.waimai.addrsdk.mvp.model.impl.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "90f31e0cbf5d4b30945a77db70341ce7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "90f31e0cbf5d4b30945a77db70341ce7");
                    } else if (dVar != null) {
                        dVar.b(baseResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1abfb3a5658b52b647164f8380b1b7d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1abfb3a5658b52b647164f8380b1b7d5");
                    } else if (dVar != null) {
                        dVar.a(th.getMessage());
                    }
                }
            });
        }
    }

    public void cityList(com.sankuai.waimai.addrsdk.mvp.model.d<CityListBean, String> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70256f99e0a65fc1af84d7eb4f677926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70256f99e0a65fc1af84d7eb4f677926");
        } else {
            com.sankuai.waimai.addrsdk.mvp.model.c.a().b().a(dVar);
        }
    }

    public void citySearch(String str, com.sankuai.waimai.addrsdk.mvp.model.d<CitySearchListBean, String> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93d0177ffa4f2cb377f3090e64f08833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93d0177ffa4f2cb377f3090e64f08833");
        } else {
            com.sankuai.waimai.addrsdk.mvp.model.c.a().b().a(str, dVar);
        }
    }
}
