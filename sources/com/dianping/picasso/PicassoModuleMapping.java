package com.dianping.picasso;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoModuleMapping {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static PicassoModuleMapping instance;
    private Map<String, String> moduleMap;

    public PicassoModuleMapping() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e118b80f93ca50d8c11a4579bc401b2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e118b80f93ca50d8c11a4579bc401b2c");
        } else {
            this.moduleMap = new HashMap();
        }
    }

    public static PicassoModuleMapping getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "982c2bf1fb3535b23191b4d48fc71fd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModuleMapping) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "982c2bf1fb3535b23191b4d48fc71fd0");
        }
        if (instance == null) {
            instance = new PicassoModuleMapping();
        }
        return instance;
    }

    public void setPicassoUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0961d660c71527ed740be46aa0cef4a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0961d660c71527ed740be46aa0cef4a7");
        } else {
            this.moduleMap.put(str, str2);
        }
    }

    public String getPicassoUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9725d718ca3b4aa43b3d705b9ffcc74f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9725d718ca3b4aa43b3d705b9ffcc74f") : this.moduleMap.get(str);
    }
}
