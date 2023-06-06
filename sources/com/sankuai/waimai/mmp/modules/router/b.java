package com.sankuai.waimai.mmp.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.mmp.main.i;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mmp.modules.router.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends i {
    public static ChangeQuickRedirect c;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480dc25b0c440924413e836c9d02367e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480dc25b0c440924413e836c9d02367e");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9eb81685025ba343d0e402a70eb99774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9eb81685025ba343d0e402a70eb99774");
            return;
        }
        c.a(Horn.accessCache("mmp_url_rewrite"));
        Horn.register("mmp_url_rewrite", new HornCallback() { // from class: com.sankuai.waimai.mmp.modules.router.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f56828e6244391eaa9fd8988db808f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f56828e6244391eaa9fd8988db808f5");
                } else if (z) {
                    c.a(str);
                }
            }
        });
    }

    @Override // com.meituan.mmp.main.i
    public final boolean a(Context context, Intent intent, boolean z) {
        f.a a;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d25158e8506029e27697eb126ef06e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d25158e8506029e27697eb126ef06e")).booleanValue();
        }
        Object[] objArr2 = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86d29f75cdf447edc34ebf11ed48cce0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86d29f75cdf447edc34ebf11ed48cce0")).booleanValue();
        }
        if (c.b == null || intent.getData() == null) {
            return false;
        }
        Uri data = intent.getData();
        if (data.isHierarchical()) {
            data.getScheme();
            String path = data.getPath();
            String host = data.getHost();
            if ("web".equals(host) || ("www.meituan.com".equals(host) && ("/web".equals(path) || "/web/".equals(path)))) {
                String queryParameter = data.getQueryParameter("url");
                if (!TextUtils.isEmpty(queryParameter) && (a = c.b.a(Uri.parse(queryParameter))) != null) {
                    com.sankuai.waimai.foundation.router.a.a().a(context, new Uri.Builder().scheme("meituanwaimai").authority("waimai.meituan.com").appendPath(ContainerInfo.ENV_MMP).appendQueryParameter("appId", a.a).appendQueryParameter("targetPath", Uri.parse(a.b).buildUpon().appendQueryParameter("q", queryParameter).build().toString()).build());
                    return true;
                }
            }
        }
        return false;
    }
}
