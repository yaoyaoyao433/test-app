package com.meituan.msc.modules.debug;

import com.facebook.react.modules.debug.SourceCodeModule;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = SourceCodeModule.NAME)
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.manager.k
    @Nullable
    public final JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d944f1626f6b3ebf5c896512ba3390db", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d944f1626f6b3ebf5c896512ba3390db") : d();
    }

    private JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af035d366ad4d567b36e67e075da971", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af035d366ad4d567b36e67e075da971");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scriptURL", "mscfile://msc_" + U_().d.b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
