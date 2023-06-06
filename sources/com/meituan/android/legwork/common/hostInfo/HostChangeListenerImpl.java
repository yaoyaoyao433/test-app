package com.meituan.android.legwork.common.hostInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.net.WMHostChangeListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HostChangeListenerImpl implements WMHostChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.base.net.WMHostChangeListener
    public void setHost(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42991ec5d4c7373c870c11dcef590b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42991ec5d4c7373c870c11dcef590b07");
            return;
        }
        com.meituan.android.legwork.net.b a = com.meituan.android.legwork.net.b.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.net.b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "155eaf00273700c79f986ecddfcce9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "155eaf00273700c79f986ecddfcce9ed");
        } else if ("http://api.c.waimai.dev.sankuai.com".equals(str)) {
            a.a("http://paotui.banma.dev.sankuai.com/");
        } else if ("http://api.c.waimai.test.sankuai.com".equals(str) || "http://api.c.waimai.beta.sankuai.com".equals(str)) {
            a.a("http://paotui.banma.test.sankuai.com/");
        } else if ("http://releaseapi.waimai.st.sankuai.com".equals(str) || "http://api.waimai.st.sankuai.com".equals(str)) {
            a.a("http://paotui.banma.st.meituan.com/");
        } else {
            a.a("https://paotui.meituan.com/");
        }
    }
}
