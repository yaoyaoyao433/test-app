package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private final Context b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c089a0a25e1f6a07d392563a3f421f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c089a0a25e1f6a07d392563a3f421f");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6097796855a4f481a537f8ca883e4a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6097796855a4f481a537f8ca883e4a47");
        } else if (map == null || map.isEmpty()) {
        } else {
            String str3 = (String) map.get("bid");
            Map map2 = (Map) map.get("lab");
            if (i == 2) {
                com.meituan.android.ptcommonim.utils.f.a(this.b, str3, "c_group_hjkzttqg", map2);
            } else if (i == 1) {
                Object obj = map.get("tag");
                boolean z = obj instanceof Map;
                Object obj2 = z ? obj : null;
                if (z) {
                    Object obj3 = ((Map) obj).get("group");
                    if (obj3 instanceof Map) {
                        obj = ((Map) obj3).get("c_group_hjkzttqg");
                        if (!(obj instanceof Map)) {
                            obj = obj3;
                        }
                    }
                } else {
                    obj = obj2;
                }
                com.meituan.android.ptcommonim.utils.f.a(this.b, str3, "c_group_hjkzttqg", map2, obj instanceof Map ? (Map) obj : null);
            }
        }
    }
}
