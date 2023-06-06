package com.sankuai.waimai.store.drug.mmp.apis;

import com.meituan.msi.api.extension.medicine.DrugPoiDataParam;
import com.meituan.msi.api.extension.medicine.DrugPoiResponse;
import com.meituan.msi.api.extension.medicine.IDrugPoi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GetDrugPoiDataImpl extends IDrugPoi {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.IDrugPoi
    public final void a(MsiCustomContext msiCustomContext, DrugPoiDataParam drugPoiDataParam, i<DrugPoiResponse> iVar) {
        Object[] objArr = {msiCustomContext, drugPoiDataParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6083cc7d5aa0fd2b5ca0c32d868ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6083cc7d5aa0fd2b5ca0c32d868ff4");
        } else if (drugPoiDataParam != null && !t.a(drugPoiDataParam.poi_id)) {
            DrugPoiResponse drugPoiResponse = new DrugPoiResponse();
            JSONObject jSONObject = (JSONObject) com.sankuai.waimai.store.manager.data.a.a().a(drugPoiDataParam.poi_id, (Class<Object>) JSONObject.class);
            if (jSONObject != null) {
                drugPoiResponse.drug_store_response_data = jSONObject.toString();
            }
            iVar.a(drugPoiResponse);
        } else {
            iVar.a(null);
        }
    }
}
