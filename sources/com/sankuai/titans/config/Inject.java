package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "inject")
/* loaded from: classes4.dex */
public class Inject {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("debug")
    @Expose
    public List<String> debug;
    @SerializedName("debugJsInjectList")
    @Expose
    public List<DebugSelector> debugJsInjectList;
    @SerializedName("patches")
    @Expose
    public List<InjectPath> patches;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "683930941a44c57af0995edb0c5047e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "683930941a44c57af0995edb0c5047e1");
        }
        return "Inject{debug=" + this.debug + ", patches=" + this.patches + ", debugJsInjectList=" + this.debugJsInjectList + '}';
    }
}
