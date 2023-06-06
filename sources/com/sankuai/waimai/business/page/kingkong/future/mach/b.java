package com.sankuai.waimai.business.page.kingkong.future.mach;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.model.b;
import com.sankuai.waimai.business.page.common.list.popuplayer.Config;
import com.sankuai.waimai.business.page.common.list.popuplayer.e;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.list.future.a;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.kingkong.future.ai.b;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.page.kingkong.a b;

    public b(com.sankuai.waimai.business.page.kingkong.a aVar, a.InterfaceC0782a interfaceC0782a) {
        Object[] objArr = {aVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c55c23da48ec0780c9dd5a16c4820c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c55c23da48ec0780c9dd5a16c4820c");
        } else {
            this.b = aVar;
        }
    }

    private void a(final com.sankuai.waimai.mach.node.a aVar) {
        Number number;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9996112cad8077a7d945cfcf0b8d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9996112cad8077a7d945cfcf0b8d3e");
        } else if (b(aVar) || aVar == null || aVar.h() == null || !aVar.h().containsKey("popup-layer-data")) {
        } else {
            Map<String, Object> map = (Map) aVar.h().get("popup-layer-data");
            Number number2 = (Number) a(map, "poi_id", Number.class);
            String a2 = a(map, FoodDetailNetWorkPreLoader.URI_POI_STR);
            long longValue = number2 == null ? -1L : number2.longValue();
            Number number3 = (Number) a(map, "card_type_id", Number.class);
            String str = (String) a(map, "rank_list_id", String.class);
            String str2 = (String) a(map, "rank_trace_id", String.class);
            e eVar = new e();
            ViewGroup container = aVar.f.getContainer();
            Number number4 = (Number) a(map, "horizontal_margin", Number.class);
            int intValue = number4 != null ? number4.intValue() : 0;
            int a3 = g.a(container.getContext(), ((Number) a(map, "corner_radius", Number.class)) == null ? 12.0f : number.intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, container.getHeight());
            float f = intValue;
            layoutParams.leftMargin = g.a(container.getContext(), f);
            layoutParams.rightMargin = g.a(container.getContext(), f);
            Config.a aVar2 = new Config.a();
            aVar2.b = container;
            aVar2.c = a3;
            aVar2.d = layoutParams;
            aVar2.e = number3.intValue();
            Config.a a4 = aVar2.a(longValue);
            a4.g = a2;
            a4.i = 1;
            a4.j = str;
            a4.k = str2;
            a4.l = AppUtil.generatePageInfoKey(aVar.f.getActivity());
            a4.h = new com.sankuai.waimai.business.page.common.list.popuplayer.b() { // from class: com.sankuai.waimai.business.page.kingkong.future.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.common.list.popuplayer.b
                public final void a(String str3, long j, b.a aVar3) {
                    Object[] objArr2 = {str3, new Long(j), aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9747818bc81355289fd6009f8f229532", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9747818bc81355289fd6009f8f229532");
                    } else {
                        aVar.f.sendJsEvent("popup_layer_disapear_event", null);
                    }
                }
            };
            eVar.a(a4.a());
        }
    }

    private <T> T a(Map<String, Object> map, String str, Class<T> cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73c00f7bff1e6446f61652dfb085ce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73c00f7bff1e6446f61652dfb085ce6");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if ((obj instanceof Number) || (obj instanceof String)) {
            return cls.cast(map.get(str));
        }
        return null;
    }

    private String a(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7663cde63ca87d626b34f4ca3c67db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7663cde63ca87d626b34f4ca3c67db7");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if ((obj instanceof Number) || (obj instanceof String)) {
            return obj.toString();
        }
        return null;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cf3dc185b61e834b64d114a48eff69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cf3dc185b61e834b64d114a48eff69")).booleanValue();
        }
        if ("showPopupLayer".equals(str)) {
            a(aVar);
            return true;
        }
        return false;
    }

    private boolean b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b0548cb034ef905141617c0369790b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b0548cb034ef905141617c0369790b")).booleanValue();
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            if (aVar != null && aVar.f != null && aVar.f.getActivity() != null) {
                com.sankuai.waimai.platform.privacy.a.a().a(aVar.f.getActivity());
            }
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        String jSONArray;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563cec0ec30b391123e11dbf475c3ed7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563cec0ec30b391123e11dbf475c3ed7")).booleanValue();
        }
        if (aVar != null) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
            if (aVar.f == null) {
                return true;
            }
            Object b = aVar.b("rocks_adapter_position");
            int intValue = b instanceof Integer ? ((Integer) b).intValue() : 0;
            Object[] objArr2 = {Integer.valueOf(intValue), str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c575463fd59ccf3ab58023f35245b7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c575463fd59ccf3ab58023f35245b7b");
            } else {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        String str2 = "";
                        if (str.contains("restaurant_id")) {
                            str2 = parse.getQueryParameter("restaurant_id");
                        } else if (str.contains("poi_id")) {
                            str2 = parse.getQueryParameter("poi_id");
                        }
                        String queryParameter = str.contains(FoodDetailNetWorkPreLoader.URI_POI_STR) ? parse.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
                        com.sankuai.waimai.business.page.kingkong.future.ai.b a2 = com.sankuai.waimai.business.page.kingkong.future.ai.b.a();
                        long longValue = Long.valueOf(str2).longValue();
                        Object[] objArr3 = {queryParameter, new Long(longValue), Integer.valueOf(intValue)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.future.ai.b.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "dad0449cb0087857a2e1ae77b428b662", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "dad0449cb0087857a2e1ae77b428b662");
                        } else {
                            b.C0799b c0799b = a2.c;
                            if (c0799b != null) {
                                c0799b.c = longValue;
                                c0799b.b = queryParameter;
                                if (a2.e != null) {
                                    c0799b.d = a2.e.f;
                                }
                                c0799b.e = intValue;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            Activity activity = aVar.f.getActivity();
            if ("showPopupLayer".equals(str)) {
                a(aVar);
                return true;
            } else if (!"jumpToRecommend".equals(str)) {
                if (activity == null || TextUtils.isEmpty(str)) {
                    return true;
                }
                Bundle bundle = new Bundle();
                bundle.putString("from", "from king kong poi list");
                com.sankuai.waimai.foundation.router.a.a(activity, str, bundle);
                return true;
            } else {
                Object[] objArr4 = {activity, aVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a1fd2aa0fd11bcdf2252807cab67f29a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a1fd2aa0fd11bcdf2252807cab67f29a");
                    return true;
                }
                if (!b(aVar) && activity != null && aVar != null && aVar.h() != null && aVar.h().containsKey("recommend-data")) {
                    try {
                        String str3 = (String) aVar.h().get("recommend-data");
                        String str4 = (String) aVar.h().get("trace-id");
                        if (str3 != null) {
                            long longValue2 = Long.valueOf(str3).longValue();
                            Object[] objArr5 = {activity, new Long(longValue2), str4};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c61d569404ffe5dbca3044f452465a28", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c61d569404ffe5dbca3044f452465a28");
                                return true;
                            }
                            KingkongInfo kingkongInfo = this.b.w.a().b;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(NetLogConstants.Tags.TRACE_ID, str4);
                            bundle2.putLong("recmd_id", longValue2);
                            bundle2.putString("ref_list_id", ListIDHelper.a.a.a("page", k.k));
                            bundle2.putString("categoryCode", kingkongInfo != null ? String.valueOf(kingkongInfo.b) : "");
                            bundle2.putString("secondCategoryCode", String.valueOf(longValue2));
                            d a3 = d.a();
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = d.a;
                            if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "ddcb7c93b5e735488e703879446872e5", RobustBitConfig.DEFAULT_VALUE)) {
                                jSONArray = (String) PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "ddcb7c93b5e735488e703879446872e5");
                            } else {
                                jSONArray = a3.b != null ? new JSONArray((Collection) a3.b).toString() : "";
                            }
                            bundle2.putString("exposedInfo", jSONArray);
                            bundle2.putString("source_from", "meishi_channel_theme");
                            com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.W, bundle2);
                            return true;
                        }
                        return true;
                    } catch (Exception unused2) {
                        return true;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
