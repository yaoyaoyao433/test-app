package com.sankuai.waimai.business.page.home.list.future.mach;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.model.b;
import com.sankuai.waimai.business.page.common.list.popuplayer.Config;
import com.sankuai.waimai.business.page.home.list.future.a;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;
    public boolean b;
    private a.InterfaceC0782a c;

    public b(a.InterfaceC0782a interfaceC0782a) {
        Object[] objArr = {interfaceC0782a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c035946f306feba51babc19b34192ad4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c035946f306feba51babc19b34192ad4");
        } else {
            this.c = interfaceC0782a;
        }
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be40470f71bca4ca848c4e7fdf912bc8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be40470f71bca4ca848c4e7fdf912bc8")).booleanValue();
        }
        if ("showPopupLayer".equals(str)) {
            a(aVar);
            return true;
        }
        return false;
    }

    private void a(final com.sankuai.waimai.mach.node.a aVar) {
        Number number;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5666de1698a7799db48eb71261a036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5666de1698a7799db48eb71261a036");
        } else if (aVar == null || aVar.h() == null || !aVar.h().containsKey("popup-layer-data")) {
        } else {
            Map<String, Object> map = (Map) aVar.h().get("popup-layer-data");
            Number number2 = (Number) a(map, "poi_id", Number.class);
            long longValue = number2 == null ? -1L : number2.longValue();
            Number number3 = (Number) a(map, "card_type_id", Number.class);
            String str = (String) a(map, "rank_list_id", String.class);
            String str2 = (String) a(map, "rank_trace_id", String.class);
            String a2 = a(map, FoodDetailNetWorkPreLoader.URI_POI_STR);
            ViewGroup container = aVar.f.getContainer();
            int a3 = g.a(container.getContext(), ((Number) a(map, "corner_radius", Number.class)) == null ? 12.0f : number.intValue());
            Number number4 = (Number) a(map, "horizontal_margin", Number.class);
            int intValue = number4 == null ? 0 : number4.intValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, container.getHeight());
            float f = intValue;
            layoutParams.leftMargin = g.a(container.getContext(), f);
            layoutParams.rightMargin = g.a(container.getContext(), f);
            com.sankuai.waimai.business.page.common.list.popuplayer.e eVar = new com.sankuai.waimai.business.page.common.list.popuplayer.e();
            Config.a aVar2 = new Config.a();
            aVar2.b = container;
            aVar2.c = a3;
            aVar2.d = layoutParams;
            aVar2.e = number3.intValue();
            Config.a a4 = aVar2.a(longValue);
            a4.g = a2;
            a4.i = 0;
            a4.j = str;
            a4.k = str2;
            a4.l = this.c.b();
            a4.m = this.b;
            a4.h = new com.sankuai.waimai.business.page.common.list.popuplayer.b() { // from class: com.sankuai.waimai.business.page.home.list.future.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.common.list.popuplayer.b
                public final void a(String str3, long j, b.a aVar3) {
                    Object[] objArr2 = {str3, new Long(j), aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e8d94d592fc1b22a2b6e0a2300cda33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e8d94d592fc1b22a2b6e0a2300cda33");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cd3263ac99916af7136afb68d47a2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cd3263ac99916af7136afb68d47a2f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a848b61bb7d27651225e14218a268b4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a848b61bb7d27651225e14218a268b4c");
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
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        boolean z = false;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db51e9d748ece3b7477f49b8edbb8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db51e9d748ece3b7477f49b8edbb8cd")).booleanValue();
        }
        if (aVar == null || aVar.f == null) {
            return true;
        }
        if (!"clickDynamicTag".equals(str)) {
            if ("showPopupLayer".equals(str)) {
                a(aVar);
            } else if ("go-to-question-detail".equals(str)) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15f17f149e450b665233af1a7dee75ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15f17f149e450b665233af1a7dee75ed");
                } else if (aVar != null && aVar.h() != null && aVar.h().containsKey("detail-data")) {
                    this.c.a((Map) aVar.h().get("detail-data"));
                }
                return true;
            } else if ("showMorePoi".equalsIgnoreCase(str)) {
                if (this.c != null) {
                    this.c.a();
                }
            } else {
                if (this.c != null) {
                    Map map = (Map) aVar.h().get("popup-layer-data");
                    Object b = aVar.b("index");
                    int intValue = b instanceof Integer ? ((Integer) b).intValue() : 0;
                    if (map != null) {
                        this.c.a(String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR)), String.valueOf(map.get("poi_id")), intValue, String.valueOf(map.get("rank_trace_id")), aVar);
                    } else {
                        this.c.a("", "", intValue, "", aVar);
                    }
                }
                Activity activity = aVar.f.getActivity();
                if (activity != null && !TextUtils.isEmpty(str)) {
                    com.sankuai.waimai.foundation.router.a.a(activity, str);
                }
            }
        } else {
            Mach mach = aVar.f;
            Map<String, Object> map2 = (Map) aVar.h().get("apidata");
            z = (map2.get("expanded") == null || !((Boolean) map2.get("expanded")).booleanValue()) ? true : true;
            map2.put("expanded", Boolean.valueOf(z));
            aVar.f.getEnvParamsMap().put("expanded", Boolean.valueOf(z));
            ViewGroup viewGroup = (ViewGroup) aVar.c().g().getParent();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            com.sankuai.waimai.mach.node.a preRenderNodeTreeSync = mach.preRenderNodeTreeSync(map2, viewGroup.getWidth(), 0, null, null);
            layoutParams.height = preRenderNodeTreeSync.t() + viewGroup.getPaddingTop();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            mach.attachPreRenderNode(preRenderNodeTreeSync, aVar.c(), viewGroup, null);
            if (this.c != null) {
                this.c.a(((Integer) map2.get("index")).intValue(), preRenderNodeTreeSync);
            }
        }
        return true;
    }
}
