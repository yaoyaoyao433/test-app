package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "predictModel";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(final String str, String str2, final String str3, final m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffead273fd2ae99774f8953a16ffaaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffead273fd2ae99774f8953a16ffaaf");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge predictModel: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            com.sankuai.waimai.alita.core.mlmodel.predictor.a.a().a(str2, new com.sankuai.waimai.alita.core.mlmodel.predictor.g() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.n.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.g
                public final void a(@Nullable JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51e2e133cea99bc006b5ee1baf37c119", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51e2e133cea99bc006b5ee1baf37c119");
                    } else {
                        n.this.a(str, mVar, str3, jSONObject);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.g
                public final void a(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c0423a96878b859c445191fff2df69d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c0423a96878b859c445191fff2df69d");
                    } else {
                        n.this.a(mVar, str3, com.sankuai.waimai.alita.core.base.util.b.a(exc, "MLModel predict failed"));
                    }
                }
            });
        } else {
            a(mVar, str3, "args is empty");
        }
    }
}
