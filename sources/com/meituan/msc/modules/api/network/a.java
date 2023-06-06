package com.meituan.msc.modules.api.network;

import com.huawei.hms.actions.SearchIntents;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.WritableNativeMap;
import com.meituan.msc.modules.api.storage.StorageModule;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.o;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "RequestPrefetchModule")
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod
    public void getBackgroundFetchData(JSONObject jSONObject, final o oVar) {
        Object[] objArr = {jSONObject, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b869c0f548acd0448c695764fd5ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b869c0f548acd0448c695764fd5ec5");
        } else if ("pre".equals(jSONObject.optString("fetchType"))) {
            U_().h.a(new com.meituan.msc.common.framework.a<FetchTokenResponse>() { // from class: com.meituan.msc.modules.api.network.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(FetchTokenResponse fetchTokenResponse) {
                    FetchTokenResponse fetchTokenResponse2 = fetchTokenResponse;
                    Object[] objArr2 = {fetchTokenResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1aa4cca1740cf97a70678000068fdce7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1aa4cca1740cf97a70678000068fdce7");
                        return;
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("fetchedData", fetchTokenResponse2.fetchedData);
                    writableNativeMap.putString("url", fetchTokenResponse2.url);
                    writableNativeMap.putDouble("timeStamp", fetchTokenResponse2.timeStamp);
                    writableNativeMap.putDouble("__mtFinishTimeStamp", fetchTokenResponse2.__mtFinishTimeStamp);
                    writableNativeMap.putString("path", fetchTokenResponse2.path);
                    writableNativeMap.putString(SearchIntents.EXTRA_QUERY, fetchTokenResponse2.query);
                    writableNativeMap.putInt(KnbConstants.PARAMS_SCENE, fetchTokenResponse2.scene);
                    oVar.a(writableNativeMap);
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "993ffdd153beb4065f6e3028709f32a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "993ffdd153beb4065f6e3028709f32a2");
                    } else {
                        oVar.a(str, exc);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2913cccd5725ec47d84b8a3dda13def6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2913cccd5725ec47d84b8a3dda13def6");
                    } else {
                        oVar.a("cancel");
                    }
                }
            });
        } else {
            oVar.a("fetchType + " + jSONObject.optString("fetchType") + " not supported");
        }
    }

    public static String a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01434773bd3e2f32ce81f58e636065fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01434773bd3e2f32ce81f58e636065fb");
        }
        return StorageModule.a(fVar) + "_prefetch";
    }

    public static String b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8701b01a65ff4a1f60803a058634fcf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8701b01a65ff4a1f60803a058634fcf") : MSCEnvHelper.getSharedPreferences(a(fVar)).getString("request_prefetch_token", null);
    }
}
