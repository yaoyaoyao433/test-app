package com.sankuai.waimai.business.im.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.imbase.constant.a;
import com.sankuai.waimai.imbase.utils.ImSP;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ImRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40c9e003934be9b36e97c6746c3496c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40c9e003934be9b36e97c6746c3496c2");
            return;
        }
        ImSP.a(cVar.a("im_push_intercept_interval", 0));
        ImSP.b(cVar.a("im_push_show_interval", 0));
        e eVar = new e("im_notity_configure_file_name");
        Map a = cVar.a("im_notity_configure", (Map) null);
        if (a == null || a.isEmpty()) {
            return;
        }
        if (a.containsKey("activity_message")) {
            eVar.a((e) a.EnumC0958a.IM_ACTIVITY_MESSAGE, (String) a.get("activity_message"));
        }
        String b = com.sankuai.waimai.imbase.utils.a.b(a);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        eVar.a((e) a.EnumC0958a.IM_NOTIFY_CONFIGURE, b);
    }
}
