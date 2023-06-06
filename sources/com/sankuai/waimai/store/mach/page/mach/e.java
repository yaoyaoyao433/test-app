package com.sankuai.waimai.store.mach.page.mach;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;

    public e(Context context) {
        this(context, com.sankuai.waimai.store.manager.judas.b.a(context));
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993352851e0eedf6012639d9e518eb6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993352851e0eedf6012639d9e518eb6d");
        }
    }

    public e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c07180a254d0d6e903e12428d283027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c07180a254d0d6e903e12428d283027");
            return;
        }
        this.b = context;
        this.c = str;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb255a9f733f2de1014b0f9c99a4b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb255a9f733f2de1014b0f9c99a4b9f");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            JSONObject optJSONObject = jSONObject.optJSONObject("lab");
            if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                return;
            }
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(optJSONObject.toString());
            if ("lx".equals(str2) && i == 1) {
                com.sankuai.waimai.store.manager.judas.b.a(this.c, AppUtil.generatePageInfoKey(this.b), optString).b(a2).a();
            }
            if ("lx".equals(str2) && i == 2) {
                com.sankuai.waimai.store.manager.judas.b.b(this.c, AppUtil.generatePageInfoKey(this.b), optString).b(a2).a();
            }
        }
    }
}
