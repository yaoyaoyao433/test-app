package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.s;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GeneralInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5148904530885215904L;
    @SerializedName("is_display")
    public boolean isDisplay;
    @SerializedName("is_sticky")
    public boolean isSticky;
    @SerializedName("module_relatives")
    public List<ModuleRelative> moduleRelatives;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ModuleRelative implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("related_modules")
        public List<RelativesModule> relativesModules;
        @SerializedName("type")
        public int type;

        /* renamed from: clone */
        public ModuleRelative m25clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d13b0989b7356ed038c807e94c91f9", RobustBitConfig.DEFAULT_VALUE) ? (ModuleRelative) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d13b0989b7356ed038c807e94c91f9") : (ModuleRelative) s.a(this);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RelativesModule implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("name")
        public String name;
        @SerializedName("s_type")
        public String sType;
        @SerializedName("unique_symbol")
        public String uniqueSymbol;

        /* renamed from: clone */
        public RelativesModule m26clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb0ec5672a5816419697f56e1b862cd6", RobustBitConfig.DEFAULT_VALUE) ? (RelativesModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb0ec5672a5816419697f56e1b862cd6") : (RelativesModule) s.a(this);
        }
    }
}
