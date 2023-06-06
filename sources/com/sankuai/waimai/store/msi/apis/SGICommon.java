package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.msi.api.extension.sgc.common.AddPoiShortcutParam;
import com.meituan.msi.api.extension.sgc.common.CollectPoiParam;
import com.meituan.msi.api.extension.sgc.common.GetWMAddressWithBusinessIDParam;
import com.meituan.msi.api.extension.sgc.common.GetWMAddressWithBusinessIDResponse;
import com.meituan.msi.api.extension.sgc.common.ICommon;
import com.meituan.msi.api.extension.sgc.common.OnStoreStatusChangeResponse;
import com.meituan.msi.api.extension.sgc.common.SyncPoiInfoParam;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.store.manager.collection.b;
import com.sankuai.waimai.store.msi.SGMSCContextManager;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.aj;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.MRNMonitor;
import com.sankuai.waimai.store.util.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGICommon extends ICommon {
    public static ChangeQuickRedirect b;
    private final int c;
    private final Map<String, List<Pair<i<EmptyResponse>, MsiCustomContext>>> d;
    private final Map<String, List<Pair<i<EmptyResponse>, MsiCustomContext>>> e;

    public SGICommon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c816611ab98add51459e1f2f5fcd9ff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c816611ab98add51459e1f2f5fcd9ff8");
            return;
        }
        this.c = 1;
        this.d = new HashMap();
        this.e = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0cbe68b898b05227d9848bbd7cb5a26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0cbe68b898b05227d9848bbd7cb5a26");
            return;
        }
        b.a().a(new com.sankuai.waimai.store.i.collection.a() { // from class: com.sankuai.waimai.store.msi.apis.SGICommon.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str, boolean z) {
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void c(String str) {
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eabca7ed6c1b2eb2bb2598fbe18d973a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eabca7ed6c1b2eb2bb2598fbe18d973a");
                    return;
                }
                com.sankuai.waimai.store.order.a.e().l(str).b.setFavorite(true);
                List<Pair> list = (List) SGICommon.this.d.get(String.valueOf(str));
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (Pair pair : list) {
                    if (!((MsiCustomContext) pair.second).getActivity().isDestroyed()) {
                        ((i) pair.first).a(EmptyResponse.INSTANCE);
                    }
                }
                SGICommon.this.d.remove(String.valueOf(str));
                am.a(((MsiCustomContext) ((Pair) list.get(0)).second).getActivity(), (int) R.string.wm_sc_common_collect_success);
            }

            @Override // com.sankuai.waimai.store.i.collection.a
            public final void b(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2b4372d2b2490193fb0cb0d815ac1aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2b4372d2b2490193fb0cb0d815ac1aa");
                    return;
                }
                com.sankuai.waimai.store.order.a.e().l(str).b.setFavorite(false);
                List<Pair> list = (List) SGICommon.this.e.get(String.valueOf(str));
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (Pair pair : list) {
                    if (!((MsiCustomContext) pair.second).getActivity().isDestroyed()) {
                        ((i) pair.first).a(EmptyResponse.INSTANCE);
                    }
                }
                SGICommon.this.e.remove(String.valueOf(str));
                am.a(((MsiCustomContext) ((Pair) list.get(0)).second).getActivity(), (int) R.string.wm_sc_common_collect_cancel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, WMLocation wMLocation, WMLocation wMLocation2, i<GetWMAddressWithBusinessIDResponse> iVar) {
        Object[] objArr = {activity, wMLocation, wMLocation2, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b5f26bc2bbba4cb39da73fe66f0763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b5f26bc2bbba4cb39da73fe66f0763");
            return;
        }
        GetWMAddressWithBusinessIDResponse getWMAddressWithBusinessIDResponse = new GetWMAddressWithBusinessIDResponse();
        getWMAddressWithBusinessIDResponse.deliveryLocation = com.sankuai.waimai.platform.domain.manager.location.a.a(activity);
        if (getWMAddressWithBusinessIDResponse.deliveryLocation == null) {
            getWMAddressWithBusinessIDResponse.deliveryLocation = new AddressItem();
        }
        getWMAddressWithBusinessIDResponse.address = com.sankuai.waimai.store.locate.a.d();
        getWMAddressWithBusinessIDResponse.wmLatitude = String.valueOf(wMLocation.getLatitude());
        getWMAddressWithBusinessIDResponse.wmLongitude = String.valueOf(wMLocation.getLongitude());
        if (wMLocation2 != null) {
            wMLocation = wMLocation2;
        }
        getWMAddressWithBusinessIDResponse.wmActualLatitude = String.valueOf(wMLocation.getLatitude());
        getWMAddressWithBusinessIDResponse.wmActualLongitude = String.valueOf(wMLocation.getLongitude());
        iVar.a(getWMAddressWithBusinessIDResponse);
    }

    @Override // com.meituan.msi.api.extension.sgc.common.ICommon
    public final void a(final MsiCustomContext msiCustomContext, GetWMAddressWithBusinessIDParam getWMAddressWithBusinessIDParam, final i<GetWMAddressWithBusinessIDResponse> iVar) {
        Object[] objArr = {msiCustomContext, getWMAddressWithBusinessIDParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0e794ef391f60a70c853283cb35878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0e794ef391f60a70c853283cb35878");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "getWMAddressWithBusinessID msiCustomContext.getActivity() is dead or null");
        } else {
            WMLocation b2 = com.sankuai.waimai.store.locate.a.b();
            WMLocation i = g.a().i();
            if (b2 == null || getWMAddressWithBusinessIDParam.forceLocation) {
                com.sankuai.waimai.store.locate.a.a(msiCustomContext.getActivity(), getWMAddressWithBusinessIDParam.businessID, new com.sankuai.waimai.store.i.locate.a() { // from class: com.sankuai.waimai.store.msi.apis.SGICommon.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.i.locate.a
                    public final void a(boolean z, String str, WMLocation wMLocation) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, wMLocation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd41a6c362659255c8b930ecc6cbc11d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd41a6c362659255c8b930ecc6cbc11d");
                        } else if (z) {
                            SGICommon.this.a(msiCustomContext.getActivity(), wMLocation, wMLocation, iVar);
                        } else {
                            iVar.a(1, "没有定位信息");
                        }
                    }
                }, true);
            } else {
                a(msiCustomContext.getActivity(), b2, i, iVar);
            }
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, final j<OnStoreStatusChangeResponse> jVar) {
        Object[] objArr = {msiCustomContext, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927cb1a5e9e55192a019cc5f50c17f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927cb1a5e9e55192a019cc5f50c17f54");
        } else if (a.a(msiCustomContext)) {
        } else {
            final SGMSCContextManager a = SGMSCContextManager.a();
            Object[] objArr2 = {msiCustomContext, jVar};
            ChangeQuickRedirect changeQuickRedirect2 = SGMSCContextManager.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "95925dc3a3ead6e9db85acbf05acb16c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "95925dc3a3ead6e9db85acbf05acb16c");
            } else {
                com.sankuai.waimai.store.msi.listener.a.a((Context) msiCustomContext.getActivity()).a(msiCustomContext.getActivity(), new a.c() { // from class: com.sankuai.waimai.store.msi.SGMSCContextManager.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.msi.listener.a.c
                    public final void a(Activity activity) {
                        Object[] objArr3 = {activity};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb4304586594ebe63b16c64c6277dfb4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb4304586594ebe63b16c64c6277dfb4");
                        } else {
                            a.d.add(jVar);
                        }
                    }

                    @Override // com.sankuai.waimai.store.msi.listener.a.c
                    public final void b(Activity activity) {
                        Object[] objArr3 = {activity};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "243d3980371e77002c28ffc0bfa3c813", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "243d3980371e77002c28ffc0bfa3c813");
                        } else {
                            a.d.remove(jVar);
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, SyncPoiInfoParam syncPoiInfoParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, syncPoiInfoParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4b63ee30c4e9a3dd1b94f03d359ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4b63ee30c4e9a3dd1b94f03d359ac6");
            return;
        }
        try {
            long a = r.a(syncPoiInfoParam.request.request_poi_id, 0L);
            long a2 = r.a(syncPoiInfoParam.response.response_poi_id, 0L);
            com.sankuai.waimai.store.order.a.e().a(a, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(syncPoiInfoParam.request.request_poi_id_str, a), a2, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(syncPoiInfoParam.response.response_poi_id_str, a2));
            iVar.a(EmptyResponse.INSTANCE);
        } catch (Exception e) {
            iVar.a(EmptyResponse.INSTANCE);
            c.a(new MRNMonitor("MSC", "syncPoiInfo"), e.getMessage(), "");
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.common.ICommon
    public final void a(final MsiCustomContext msiCustomContext, AddPoiShortcutParam addPoiShortcutParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, addPoiShortcutParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7600ae0a9f0f64d004703baaaec1fc70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7600ae0a9f0f64d004703baaaec1fc70");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "addPoiShortcut msiCustomContext.getActivity() is dead or null");
        } else {
            final String str = addPoiShortcutParam.name;
            final String str2 = addPoiShortcutParam.picUrl;
            final String str3 = addPoiShortcutParam.scheme;
            Object[] objArr2 = {msiCustomContext, str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50f51199b424c86e023491e70f30b675", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50f51199b424c86e023491e70f30b675");
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                am.a(msiCustomContext.getActivity(), (int) R.string.wm_sg_shortcut_error);
            } else {
                ad.a(new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGICommon.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77f1d8d5b986946a1a15bb6efb3f485d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77f1d8d5b986946a1a15bb6efb3f485d");
                        } else {
                            m.b(str2).a(new b.a() { // from class: com.sankuai.waimai.store.msi.apis.SGICommon.3.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr4 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c5c4c4b2e93c3d5b5010f235013a95dc", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c5c4c4b2e93c3d5b5010f235013a95dc");
                                        return;
                                    }
                                    aj a2 = aj.a();
                                    a2.b = str3;
                                    a2.c = str;
                                    a2.a(bitmap).a(msiCustomContext.getActivity());
                                    new CustomDialog.a(msiCustomContext.getActivity()).a(msiCustomContext.getActivity().getString(R.string.wm_sg_shortcut_alert_dialog_title)).b(msiCustomContext.getActivity().getString(R.string.wm_sg_shortcut_alert_dialog_message, new Object[]{v.c ? msiCustomContext.getActivity().getString(R.string.wm_sg_shortcut_current_app_meituan) : msiCustomContext.getActivity().getString(R.string.wm_sg_shortcut_current_app_waimai)})).a(msiCustomContext.getActivity().getString(R.string.wm_sc_common_ok), (DialogInterface.OnClickListener) null).a(true).b();
                                }

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "91c4a574bcb9d87901e40633081cc84d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "91c4a574bcb9d87901e40633081cc84d");
                                    } else {
                                        am.a(msiCustomContext.getActivity(), (int) R.string.wm_sg_shortcut_network_error);
                                    }
                                }
                            });
                        }
                    }
                });
            }
            iVar.a(EmptyResponse.INSTANCE);
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, CollectPoiParam collectPoiParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, collectPoiParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6237a2f99345ea311049183be2803426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6237a2f99345ea311049183be2803426");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "collectPoi msiCustomContext.getActivity() is dead or null");
        } else {
            Object[] objArr2 = {msiCustomContext, collectPoiParam, iVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70bd457a54111b604c8099eb8300952", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70bd457a54111b604c8099eb8300952");
                return;
            }
            String a = com.sankuai.waimai.store.msi.listener.a.a(msiCustomContext.getActivity());
            Map<String, List<Pair<i<EmptyResponse>, MsiCustomContext>>> map = collectPoiParam.isCollected ? this.e : this.d;
            String str = !t.a(collectPoiParam.poiIdStr) ? collectPoiParam.poiIdStr : collectPoiParam.poiId;
            List<Pair<i<EmptyResponse>, MsiCustomContext>> list = map.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair<>(iVar, msiCustomContext));
                map.put(str, arrayList);
            } else {
                list.add(new Pair<>(iVar, msiCustomContext));
            }
            if (collectPoiParam.isCollected) {
                com.sankuai.waimai.store.manager.collection.b.a().b(msiCustomContext.getActivity(), str, a);
            } else {
                com.sankuai.waimai.store.manager.collection.b.a().a(msiCustomContext.getActivity(), str, a);
            }
            if (com.sankuai.waimai.store.config.j.h().a("send_knb_event_after_collect", true)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", "com.meituan.waimai.restaurantLiked.notification");
                    jSONObject.put("poiID", collectPoiParam.poiId);
                    jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, collectPoiParam.poiIdStr);
                    jSONObject.put("isLiked", !collectPoiParam.isCollected);
                    JsHandlerFactory.publish(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
