package com.sankuai.waimai.business.page.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMHomePageFragment extends HomePageFragment {
    public static ChangeQuickRedirect D;
    private com.sankuai.waimai.business.page.home.assist.a I;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        com.sankuai.waimai.platform.domain.core.channel.a a();
    }

    @Override // com.sankuai.waimai.business.page.home.HomePageFragment, com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c168f921f50d9fa4686212d1b3f2e6fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c168f921f50d9fa4686212d1b3f2e6fc");
            return;
        }
        super.onCreate(bundle);
        this.C = new HomePageFragment.e() { // from class: com.sankuai.waimai.business.page.home.WMHomePageFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.HomePageFragment.e
            public final void a(Map<String, String> map, boolean z) {
                Object[] objArr2 = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58880a6c7d7dc2865ac76032b5337cfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58880a6c7d7dc2865ac76032b5337cfd");
                } else if (map.containsKey("poilist_wm_cityid")) {
                    String str = map.get("poilist_wm_cityid");
                    if (z) {
                        com.sankuai.waimai.kit.b.a().e = str;
                    }
                    com.sankuai.waimai.kit.b.a().b = str;
                }
            }

            @Override // com.sankuai.waimai.business.page.home.HomePageFragment.e
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "248ae69680ecd478d5ba3572eb580b22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "248ae69680ecd478d5ba3572eb580b22");
                    return;
                }
                HashMap hashMap = new HashMap();
                com.sankuai.waimai.platform.domain.core.channel.a a2 = WMHomePageFragment.this.getActivity() instanceof a ? ((a) WMHomePageFragment.this.getActivity()).a() : null;
                if (a2 != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ys", a2.b);
                    hashMap2.put("ys_id", a2.c);
                    hashMap2.put("activity_id", a2.d);
                    hashMap2.put("restaurant_id", a2.g);
                    hashMap.putAll(hashMap2);
                }
                com.sankuai.waimai.business.page.home.helper.d.a(i, this, hashMap);
            }

            @Override // com.sankuai.waimai.business.page.home.HomePageFragment.e
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a50d5c8e3f3d6693a40b4f56fc8795c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a50d5c8e3f3d6693a40b4f56fc8795c");
                    return;
                }
                com.sankuai.waimai.business.page.homepage.controller.c.a().b();
                com.sankuai.waimai.business.page.homepage.controller.c a2 = com.sankuai.waimai.business.page.homepage.controller.c.a();
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.controller.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e4e3b2686438b9875958c817ae4e98cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e4e3b2686438b9875958c817ae4e98cb");
                    return;
                }
                a2.d = z;
                if (a2.e == null || !z) {
                    return;
                }
                a2.e.a();
            }
        };
        com.sankuai.waimai.business.page.home.actinfo.b.a(this);
    }

    @Override // com.sankuai.waimai.business.page.home.HomePageFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d421ea0659cbb8bf362fb9328f8a159", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d421ea0659cbb8bf362fb9328f8a159") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.sankuai.waimai.business.page.home.HomePageFragment
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7af02a9d45a0093daf9613d04b1bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7af02a9d45a0093daf9613d04b1bac");
            return;
        }
        super.a(intent);
        if (this.I != null) {
            com.sankuai.waimai.business.page.home.assist.a aVar = this.I;
            Activity activity = this.F;
            Object[] objArr2 = {activity, intent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.assist.a.v;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b1d7eda39039225bf95095b84462839e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b1d7eda39039225bf95095b84462839e");
            } else if (intent != null) {
                aVar.w.W = f.a(intent, "arg_need_open_smart_assistant", false);
                intent.putExtra("arg_need_open_smart_assistant", false);
                if (activity == null || com.sankuai.waimai.foundation.utils.f.a(activity)) {
                    return;
                }
                activity.setIntent(intent);
            }
        }
    }
}
