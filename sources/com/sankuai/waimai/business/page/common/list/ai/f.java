package com.sankuai.waimai.business.page.common.list.ai;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f e;
    public int b;
    public boolean c;
    public JSONObject d;
    private final int f;
    private ABStrategy g;

    public f() {
        Map<String, String> params;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a275b1e768aca65babceeb7a8372f3cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a275b1e768aca65babceeb7a8372f3cd");
            return;
        }
        this.f = 3;
        this.b = 3;
        this.c = false;
        this.d = null;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3894f7454fc5eff6359f0516174a8f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3894f7454fc5eff6359f0516174a8f80");
            return;
        }
        ABStrategy e2 = com.sankuai.waimai.business.page.common.abtest.a.e();
        if (e2 == null || (params = e2.getParams()) == null) {
            return;
        }
        this.g = e2;
        try {
            int parseInt = Integer.parseInt(params.get("offset_x"));
            if (parseInt >= 0 && parseInt <= 20) {
                this.b = parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            this.c = Integer.parseInt(params.get("is_dynamicPaging")) == 1;
        } catch (NumberFormatException unused2) {
        }
        this.d = a(this.g, params);
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4aec0a3f48b47e2891251711f8a30b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4aec0a3f48b47e2891251711f8a30b8");
        }
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = new f();
                }
            }
        }
        return e;
    }

    @NonNull
    private JSONObject a(@Nullable ABStrategy aBStrategy, Map<String, String> map) {
        Object[] objArr = {aBStrategy, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29caa026d06f8937b04a7b4327925792", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29caa026d06f8937b04a7b4327925792");
        }
        JSONObject jSONObject = new JSONObject();
        if (aBStrategy == null || map == null || map.isEmpty()) {
            return null;
        }
        try {
            jSONObject.putOpt("exp_group_name", aBStrategy.groupName);
            jSONObject.putOpt("exp_name", aBStrategy.expName);
            jSONObject.putOpt("scene_name", aBStrategy.sceneName);
            jSONObject.putOpt("jsBundle_id", map.get(Constants.JSBundleConstants.KEY_BUNDLE_ID));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
