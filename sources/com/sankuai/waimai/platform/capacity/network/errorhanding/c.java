package com.sankuai.waimai.platform.capacity.network.errorhanding;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c c = new c();
    public List<com.sankuai.waimai.foundation.core.base.net.a> b;

    public static c a() {
        return c;
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971820f0f4bd96260a97fe786c2b443e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971820f0f4bd96260a97fe786c2b443e");
        } else if (this.b != null) {
            for (com.sankuai.waimai.foundation.core.base.net.a aVar : this.b) {
                if (aVar != null) {
                    aVar.a(i, str);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05742ceca0a01b84eac757f3e11b98cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05742ceca0a01b84eac757f3e11b98cf");
        } else if (this.b != null) {
            for (com.sankuai.waimai.foundation.core.base.net.a aVar : this.b) {
                if (aVar != null) {
                    aVar.a(jSONObject);
                }
            }
        }
    }
}
