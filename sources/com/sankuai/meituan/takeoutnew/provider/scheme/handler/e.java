package com.sankuai.meituan.takeoutnew.provider.scheme.handler;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.KNBWebViewActivity;
import com.sankuai.waimai.platform.mrn.WMMRNConfig;
import com.sankuai.waimai.router.components.i;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends h {
    public static ChangeQuickRedirect a;
    private Map<String, WMMRNConfig.Config> b;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d0cfa896b00ea9ac60819f1ee333b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d0cfa896b00ea9ac60819f1ee333b1");
            return;
        }
        a(new com.sankuai.waimai.launcher.provider.scheme.interceptor.a());
        a(new com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.c());
        a(new com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.a());
        this.b = WMMRNConfig.a();
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beee8c28f09f7e39fe822e11f604b64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beee8c28f09f7e39fe822e11f604b64b");
        } else if (b(jVar)) {
            gVar.a(301);
        } else {
            Intent intent = new Intent(jVar.c, KNBWebViewActivity.class);
            intent.putExtra("url", jVar.d.toString());
            intent.setData(jVar.d);
            i.a(intent, jVar);
            jVar.b("com.sankuai.waimai.router.activity.limit_package", (String) Boolean.TRUE);
            gVar.a(com.sankuai.waimai.router.components.h.a(jVar, intent));
        }
    }

    private boolean b(@NonNull j jVar) {
        WMMRNConfig.Config config;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b736b0650f21db50e74f7c41d049c19d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b736b0650f21db50e74f7c41d049c19d")).booleanValue();
        }
        if (this.b != null && jVar != null) {
            String a2 = WMMRNConfig.a(jVar.d);
            if (!TextUtils.isEmpty(a2) && (config = this.b.get(a2)) != null && !TextUtils.isEmpty(config.getDstUrl())) {
                try {
                    String dstUrl = config.getDstUrl();
                    String query = jVar.d.getQuery();
                    if (TextUtils.equals(dstUrl, WMMRNConfig.a(jVar.d))) {
                        return false;
                    }
                    if (!TextUtils.isEmpty(query) && !TextUtils.isEmpty(dstUrl)) {
                        if (dstUrl.indexOf(CommonConstant.Symbol.QUESTION_MARK, dstUrl.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                            dstUrl = dstUrl + "&" + query;
                        } else {
                            dstUrl = dstUrl + CommonConstant.Symbol.QUESTION_MARK + query;
                        }
                    }
                    jVar.a(Uri.parse(dstUrl));
                    return true;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}
