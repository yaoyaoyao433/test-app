package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends p {
    public static ChangeQuickRedirect a;
    private Activity b;

    public c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2924c9812d3f8359835cd53dfe95a3b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2924c9812d3f8359835cd53dfe95a3b5");
        } else {
            this.b = activity;
        }
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127d2bcaad97f7541b6cd6e5fdc1046a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127d2bcaad97f7541b6cd6e5fdc1046a")).booleanValue();
        }
        ((OrderConfirmActivity) this.b).d = true;
        Uri parse = Uri.parse(str);
        int a2 = r.a(parse.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE), 0);
        if (r.a(parse.getQueryParameter("not_update"), 0) == 1) {
            ((OrderConfirmActivity) this.b).e = true;
        }
        if (a2 == 0) {
            a2 = r.a(parse.getQueryParameter("wm_order_request_code"), 0);
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467719af3eded04367569fae043a4f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467719af3eded04367569fae043a4f5a");
            return;
        }
        String queryParameter = uri.getQueryParameter("extra_params");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        for (Map.Entry<String, Object> entry : com.sankuai.waimai.mach.utils.b.a(queryParameter).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (entry.getValue() instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else if (entry.getValue() instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (entry.getValue() instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            } else if (entry.getValue() instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (entry.getValue() instanceof String) {
                bundle.putString(key, String.valueOf(value));
            }
        }
    }
}
