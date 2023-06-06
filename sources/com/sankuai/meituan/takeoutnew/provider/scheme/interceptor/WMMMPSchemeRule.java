package com.sankuai.meituan.takeoutnew.provider.scheme.interceptor;

import android.app.Application;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMMPSchemeRule implements SchemeReplaceRule {
    private static final String INSURANCE_PATH = "/mmp";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e47eb4ad2584ab162042443c38588664", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e47eb4ad2584ab162042443c38588664")).booleanValue() : TextUtils.equals(uri.getPath(), INSURANCE_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e42ae3b648d6fff57b26a96d97ce305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e42ae3b648d6fff57b26a96d97ce305");
            return;
        }
        ((AbsInit) com.sankuai.waimai.router.a.a(AbsInit.class, "WMMMPInit")).performIdleInit((Application) jVar.c.getApplicationContext());
        Uri uri = jVar.d;
        com.sankuai.waimai.foundation.utils.log.a.b("WMMMPSchemeRule", "original uri : " + uri, new Object[0]);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("targetPath")) {
            try {
                String queryParameter = uri.getQueryParameter("targetPath");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                String createTargetPath = createTargetPath(queryParameter);
                Uri.Builder path = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
                for (String str : queryParameterNames) {
                    if (str.equals("targetPath")) {
                        path.appendQueryParameter(str, createTargetPath);
                    } else {
                        path.appendQueryParameter(str, uri.getQueryParameter(str));
                    }
                }
                Uri build = path.build();
                com.sankuai.waimai.foundation.utils.log.a.b("WMMMPSchemeRule", "new uri : " + build, new Object[0]);
                jVar.a(build);
            } catch (UnsupportedEncodingException e) {
                com.sankuai.waimai.foundation.utils.log.a.a("WMMMPSchemeRule", e);
            }
        }
    }

    private String createTargetPath(String str) throws UnsupportedEncodingException {
        WMLocation wMLocation;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5731510008305ec4120aca7916b3a40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5731510008305ec4120aca7916b3a40");
        }
        WmAddress k = g.a().k();
        if (k == null || (wMLocation = k.getWMLocation()) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("wm_home_lat")) {
            if (!str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                sb.append("?wm_home_lat=");
            } else {
                sb.append("&wm_home_lat=");
            }
            sb.append(URLEncoder.encode(String.valueOf(wMLocation.getLatitude()), "utf-8"));
        }
        if (!str.contains("wm_home_lon")) {
            sb.append("&wm_home_lon=");
            sb.append(URLEncoder.encode(String.valueOf(wMLocation.getLongitude()), "utf-8"));
        }
        if (!str.contains("wm_home_address")) {
            sb.append("&wm_home_address=");
            sb.append(URLEncoder.encode(k.getAddress(), "utf-8"));
        }
        return sb.toString();
    }
}
