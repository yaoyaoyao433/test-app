package com.sankuai.waimai.bussiness.order.rocks;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends p {
    public static ChangeQuickRedirect a;
    private Activity b;

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6308558c5c60de20ecb509c9a4ad52e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6308558c5c60de20ecb509c9a4ad52e7");
        } else {
            this.b = activity;
        }
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb89d006ce7063a71e2072388f9cd17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb89d006ce7063a71e2072388f9cd17")).booleanValue();
        }
        Uri parse = Uri.parse(str);
        int a2 = r.a(parse.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE), 0);
        Bundle bundle = new Bundle();
        a(parse, bundle);
        if (aVar.h() != null && aVar.h().get("extra") != null) {
            bundle.putString("extra", aVar.h().get("extra").toString());
        }
        com.sankuai.waimai.foundation.router.a.a(this.b, str, bundle, a2);
        return true;
    }

    private void a(Uri uri, Bundle bundle) {
        Object[] objArr = {uri, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95595808ee93d9ac897dd50fc840b8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95595808ee93d9ac897dd50fc840b8bc");
            return;
        }
        String queryParameter = uri.getQueryParameter("extra_params");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        for (Map.Entry<String, Object> entry : com.sankuai.waimai.mach.utils.b.a(queryParameter).entrySet()) {
            String key = entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            if (!TextUtils.isEmpty(valueOf)) {
                int a2 = r.a(valueOf, Integer.MIN_VALUE);
                if (a2 != Integer.MIN_VALUE) {
                    bundle.putInt(key, a2);
                } else {
                    bundle.putString(key, valueOf);
                }
            }
        }
    }
}
