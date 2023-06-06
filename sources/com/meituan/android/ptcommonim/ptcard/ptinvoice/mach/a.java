package com.meituan.android.ptcommonim.ptcard.ptinvoice.mach;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.d;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf9478e66710d59677aab9c40f3e120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf9478e66710d59677aab9c40f3e120");
        } else if (map == null || map.isEmpty()) {
        } else {
            try {
                String str3 = (String) map.get("cid");
                String str4 = (String) map.get("bid");
                Map<String, Object> map2 = (Map) map.get("lab");
                if (i == 2) {
                    Object[] objArr2 = {str4, str3, map2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8e5021bae56896a7863db654a0a9f028", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8e5021bae56896a7863db654a0a9f028");
                    } else {
                        Statistics.getChannel("group").writeModelView("pt_common_im_page", str4, map2, str3);
                    }
                } else if (i == 1) {
                    Object obj = map.get("tag");
                    Map map3 = obj instanceof Map ? (Map) obj : null;
                    Object[] objArr3 = {str4, str3, map2, map3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b8ac2f43aa48e06bcd9a7dc46fb4e986", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b8ac2f43aa48e06bcd9a7dc46fb4e986");
                        return;
                    }
                    if (map3 != null) {
                        try {
                            if (!map3.isEmpty()) {
                                Iterator it = map3.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Statistics.getChannel("group").updateTag((String) entry.getKey(), (Map) entry.getValue());
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    Statistics.getChannel("group").writeModelClick("pt_common_im_page", str4, map2, str3);
                }
            } catch (Exception unused2) {
            }
        }
    }
}
