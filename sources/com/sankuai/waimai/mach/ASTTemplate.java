package com.sankuai.waimai.mach;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ASTTemplate {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Config config;
    public Map<String, Map<String, Object>> exprAst;
    public Map<String, Object> script;
    public TemplateNode template;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String minSdkVersionForExprEngineV3;
    }

    public boolean shouldUseExpressionV3() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407e2704047592624fb8b25bb685d096", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407e2704047592624fb8b25bb685d096")).booleanValue();
        }
        if (this.exprAst == null) {
            return false;
        }
        return this.config == null || TextUtils.isEmpty(Mach.getVersionName()) || TextUtils.isEmpty(this.config.minSdkVersionForExprEngineV3) || com.sankuai.waimai.mach.utils.e.a(Mach.getVersionName(), this.config.minSdkVersionForExprEngineV3) >= 0;
    }
}
