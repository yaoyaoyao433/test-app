package com.sankuai.waimai.business.page.common.list.ai.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public Map<String, String> e;
    private String f;
    private ABStrategy g;
    private String h;
    private List<JSONObject> i;

    public abstract String a(@Nullable Map<String, String> map);

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55bdf8d677225be80bc947eb068288cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55bdf8d677225be80bc947eb068288cb");
            return;
        }
        this.f = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbe623732ff8a983cacdae03945ff46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbe623732ff8a983cacdae03945ff46f");
            return;
        }
        this.g = ABTestManager.getInstance().getStrategy(this.f, null);
        if (this.g != null) {
            this.d = this.g.expName;
            this.b = this.g.groupName;
            this.c = this.g.sceneName;
            this.e = this.g.getParams();
            this.h = a(this.e);
            this.i = null;
        }
    }

    @Override // com.sankuai.waimai.business.page.common.list.ai.common.c
    public final String a() {
        return this.h;
    }
}
