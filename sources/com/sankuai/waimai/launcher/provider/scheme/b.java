package com.sankuai.waimai.launcher.provider.scheme;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mrn.WMMRNConfig;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f {
    public static ChangeQuickRedirect a = null;
    private static String c = "/poifilter";
    private static String j = "navigate_type";
    private Map<String, WMMRNConfig.Config> b;

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "MRNGrayReleaseSchemeHandler";
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f75166816232fda171de54b50fad688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f75166816232fda171de54b50fad688");
        } else {
            this.b = WMMRNConfig.a();
        }
    }

    @Override // com.sankuai.waimai.router.core.b, com.sankuai.waimai.router.core.h
    public final boolean a(@Nullable j jVar) {
        WMMRNConfig.Config config;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d213a6110fa8bee46ceacb191500168", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d213a6110fa8bee46ceacb191500168")).booleanValue();
        }
        if (this.b == null || this.b.isEmpty()) {
            return false;
        }
        String c2 = c(jVar);
        if (!TextUtils.isEmpty(c2) && (config = this.b.get(c2)) != null && !TextUtils.isEmpty(config.getDstUrl())) {
            WMMRNConfig.a(config);
            if (config.issSwitch()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.router.core.b, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        WMMRNConfig.Config config;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b3a2ab70eb1eaf21657b0e5c4656e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b3a2ab70eb1eaf21657b0e5c4656e0");
            return;
        }
        if (this.b != null && !this.b.isEmpty()) {
            String c2 = c(jVar);
            if (!TextUtils.isEmpty(c2) && (config = this.b.get(c2)) != null && !TextUtils.isEmpty(config.getDstUrl())) {
                try {
                    String dstUrl = config.getDstUrl();
                    String query = jVar.d.getQuery();
                    if (!TextUtils.isEmpty(query) && !TextUtils.isEmpty(dstUrl)) {
                        if (dstUrl.indexOf(CommonConstant.Symbol.QUESTION_MARK, dstUrl.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                            dstUrl = dstUrl + "&" + query;
                        } else {
                            dstUrl = dstUrl + CommonConstant.Symbol.QUESTION_MARK + query;
                        }
                    }
                    jVar.a(Uri.parse(dstUrl));
                    gVar.a(301);
                    return;
                } catch (Exception unused) {
                }
            }
        }
        super.a(jVar, gVar);
    }

    private String c(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992a29687c48198604c72936af6d9648", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992a29687c48198604c72936af6d9648");
        }
        if (!c.equals(jVar.d.getPath())) {
            return WMMRNConfig.a(jVar.d);
        }
        return WMMRNConfig.a(jVar.d, j);
    }
}
