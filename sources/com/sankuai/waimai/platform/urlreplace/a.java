package com.sankuai.waimai.platform.urlreplace;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private MatchRuleModel c;

    public a(@NonNull MatchRuleModel matchRuleModel) {
        Object[] objArr = {matchRuleModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf812d565bf4b41042a73f2ad071b2a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf812d565bf4b41042a73f2ad071b2a0");
        } else {
            this.c = matchRuleModel;
        }
    }

    public final boolean a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e003b77826233beeeea36da66a9f3fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e003b77826233beeeea36da66a9f3fe")).booleanValue();
        }
        if (this.c.match == null || this.c.replaceRule == null) {
            return false;
        }
        Uri parse = Uri.parse(this.c.match);
        return TextUtils.equals(uri.getScheme(), parse.getScheme()) && TextUtils.equals(uri.getHost(), parse.getHost()) && TextUtils.equals(uri.getPath(), parse.getPath());
    }

    @Nullable
    public final Uri b(@NonNull Uri uri) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2888b0f64034c9a3bb39c330378c05", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2888b0f64034c9a3bb39c330378c05");
        }
        if (a(uri)) {
            String str = b;
            com.sankuai.waimai.foundation.utils.log.a.b(str, "origin uri: " + uri.toString(), new Object[0]);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            if (this.c.replaceRule.a != null) {
                clearQuery.scheme(this.c.replaceRule.a);
                z = true;
            } else {
                z = false;
            }
            if (this.c.replaceRule.b != null) {
                clearQuery.authority(this.c.replaceRule.b);
                z = true;
            }
            if (this.c.replaceRule.c != null) {
                clearQuery.path(this.c.replaceRule.c);
            } else {
                z2 = z;
            }
            if (z2) {
                clearQuery.appendQueryParameter("origin_url", new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).encodedPath(uri.getEncodedPath()).build().toString());
            }
            Map<String, String> map = this.c.replaceRule.d;
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            for (String str2 : queryParameterNames) {
                if (!"origin_url".equals(str2)) {
                    String str3 = map != null ? map.get(str2) : null;
                    if (str3 == null) {
                        str3 = uri.getQueryParameter(str2);
                    }
                    if (!"$$null".equals(str3)) {
                        clearQuery.appendQueryParameter(str2, str3);
                    }
                }
            }
            if (map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    if (!queryParameterNames.contains(str4)) {
                        String str5 = map.get(str4);
                        if (!"$$null".equals(str5)) {
                            clearQuery.appendQueryParameter(str4, str5);
                        }
                    }
                }
            }
            String str6 = b;
            com.sankuai.waimai.foundation.utils.log.a.b(str6, "dest uri: " + clearQuery.build(), new Object[0]);
            return clearQuery.build();
        }
        return null;
    }
}
