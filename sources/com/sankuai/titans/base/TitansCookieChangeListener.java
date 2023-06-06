package com.sankuai.titans.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.adaptor.CookieChangeListener;
import com.sankuai.titans.protocol.services.ICookieService;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansCookieChangeListener implements CookieChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String appId;
    private final ICookieService cookieService;

    public TitansCookieChangeListener(String str, ICookieService iCookieService) {
        Object[] objArr = {str, iCookieService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b756bbc174e2610be2fd1eecb525976d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b756bbc174e2610be2fd1eecb525976d");
            return;
        }
        this.cookieService = iCookieService;
        this.appId = str;
    }

    @Override // com.sankuai.titans.protocol.adaptor.CookieChangeListener
    public void updateCookies(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0747c44a33a9eaa2af745003306d63f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0747c44a33a9eaa2af745003306d63f1");
        } else {
            CookieUtils.modifyCookie(this.cookieService, this.appId, map);
        }
    }
}
