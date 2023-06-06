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
public class g {
    public static ChangeQuickRedirect a;
    private static g e;
    public int b;
    public ABStrategy c;
    public JSONObject d;
    private final int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;
    private String o;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb0932f71e9c1c78efe97684d8c17a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb0932f71e9c1c78efe97684d8c17a4");
            return;
        }
        this.f = 3;
        this.b = 3;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = "";
        this.d = null;
        c();
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db651fd223c93caf085b5e8afe565346", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db651fd223c93caf085b5e8afe565346");
        }
        if (e == null) {
            synchronized (g.class) {
                if (e == null) {
                    e = new g();
                }
            }
        }
        return e;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa6c6ce75c89c93db7474579456ec4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa6c6ce75c89c93db7474579456ec4e")).booleanValue();
        }
        if (!this.i) {
            c();
        }
        return this.h;
    }

    private void c() {
        Map<String, String> params;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ce21567d6a4b16ade03c72644c6459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ce21567d6a4b16ade03c72644c6459");
            return;
        }
        ABStrategy e2 = com.sankuai.waimai.business.page.common.abtest.a.e();
        if (e2 == null || (params = e2.getParams()) == null) {
            return;
        }
        this.c = e2;
        this.o = e2.expName;
        this.n = e2.groupName;
        this.m = e2.sceneName;
        this.l = params.get(Constants.JSBundleConstants.KEY_BUNDLE_ID);
        this.i = true;
        try {
            int parseInt = Integer.parseInt(params.get("offset_x"));
            if (parseInt >= 0 && parseInt <= 20) {
                this.b = parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            int parseInt2 = Integer.parseInt(params.get("requestMaxCount"));
            if (parseInt2 >= 0 && parseInt2 <= 30) {
                this.k = parseInt2;
            }
        } catch (NumberFormatException unused2) {
        }
        try {
            this.g = Integer.parseInt(params.get("is_dynamicPaging")) == 1;
        } catch (NumberFormatException unused3) {
        }
        try {
            this.h = Integer.parseInt(params.get("is_exposure")) == 1;
        } catch (NumberFormatException unused4) {
        }
        this.d = a(this.c, params);
    }

    @NonNull
    private JSONObject a(@Nullable ABStrategy aBStrategy, Map<String, String> map) {
        Object[] objArr = {aBStrategy, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e63d8dbea836a205868de50ea68733", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e63d8dbea836a205868de50ea68733");
        }
        JSONObject jSONObject = new JSONObject();
        if (aBStrategy == null || map == null || map.isEmpty()) {
            return null;
        }
        try {
            jSONObject.putOpt("exp_group_name", aBStrategy.groupName);
            jSONObject.putOpt("exp_name", aBStrategy.expName);
            jSONObject.putOpt("scene_name", aBStrategy.sceneName);
            jSONObject.putOpt("bundle_id", map.get(Constants.JSBundleConstants.KEY_BUNDLE_ID));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
