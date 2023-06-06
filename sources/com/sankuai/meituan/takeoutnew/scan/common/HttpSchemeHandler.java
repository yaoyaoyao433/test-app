package com.sankuai.meituan.takeoutnew.scan.common;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.edfu.mbar.util.l;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler;
import com.sankuai.waimai.foundation.router.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HttpSchemeHandler implements ScanResultHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler
    public boolean process(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f89a331e49fa6c98636faa5a7a9c636", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f89a331e49fa6c98636faa5a7a9c636")).booleanValue();
        }
        if (lVar != null) {
            String a = lVar.a();
            if (!TextUtils.isEmpty(a)) {
                String trim = a.trim();
                if (trim.startsWith(AbsApiFactory.HTTP) || trim.startsWith(AbsApiFactory.HTTPS)) {
                    if (checkHostValid(trim)) {
                        a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), trim);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkHostValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09efaef802fd3e4a692a35e81d1551d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09efaef802fd3e4a692a35e81d1551d8")).booleanValue();
        }
        String host = Uri.parse(str).getHost();
        return !TextUtils.isEmpty(host) && (host.endsWith(".meituan.com") || host.endsWith(".sankuai.com"));
    }
}
