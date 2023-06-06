package com.sankuai.meituan.takeoutnew.scan.common;

import android.text.TextUtils;
import com.meituan.android.edfu.mbar.util.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler;
import com.sankuai.waimai.foundation.router.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMSchemeHandler implements ScanResultHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler
    public boolean process(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b35e86e100e5a382ace4528f1e3b577", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b35e86e100e5a382ace4528f1e3b577")).booleanValue();
        }
        if (lVar != null) {
            String a = lVar.a();
            if (!TextUtils.isEmpty(a)) {
                String trim = a.trim();
                if (trim.startsWith("meituanwaimai://")) {
                    a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), trim);
                    return true;
                }
            }
        }
        return false;
    }
}
