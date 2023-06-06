package com.dianping.shield.dynamic.model.module;

import com.alipay.sdk.widget.d;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.dianping.shield.dynamic.model.vc.TabModulesVCInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR:\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/TabModuleConfigInfo;", "", "()V", DMKeys.KEY_CONFIG_KEY, "", "getConfigKey", "()Ljava/lang/String;", "setConfigKey", "(Ljava/lang/String;)V", DMKeys.KEY_TAB_EXTRA_CONFIG_KEY, "getExtraConfigKey", "setExtraConfigKey", "extraInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getExtraInfo", "()Ljava/util/HashMap;", "setExtraInfo", "(Ljava/util/HashMap;)V", DMKeys.KEY_TAB_EXTRA_MODULE_KEYS, "", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "getExtraModuleKeys", "()Ljava/util/List;", "setExtraModuleKeys", "(Ljava/util/List;)V", "isIndependentWhiteboard", "", "()Ljava/lang/Boolean;", "setIndependentWhiteboard", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_MODULE_KEYS, "getModuleKeys", "setModuleKeys", "tabKey", "getTabKey", "setTabKey", "title", "getTitle", d.o, DMKeys.KEY_VC_SETTING, "Lcom/dianping/shield/dynamic/model/vc/TabModulesVCInfo;", "getVcSetting", "()Lcom/dianping/shield/dynamic/model/vc/TabModulesVCInfo;", "setVcSetting", "(Lcom/dianping/shield/dynamic/model/vc/TabModulesVCInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabModuleConfigInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String configKey;
    @Nullable
    private String extraConfigKey;
    @Nullable
    private HashMap<String, Object> extraInfo;
    @Nullable
    private List<? extends List<? extends ModuleKeyUnionType>> extraModuleKeys;
    @Nullable
    private Boolean isIndependentWhiteboard;
    @Nullable
    private List<? extends List<? extends ModuleKeyUnionType>> moduleKeys;
    @Nullable
    private String tabKey;
    @Nullable
    private String title;
    @Nullable
    private TabModulesVCInfo vcSetting;

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getConfigKey() {
        return this.configKey;
    }

    public final void setConfigKey(@Nullable String str) {
        this.configKey = str;
    }

    @Nullable
    public final List<List<ModuleKeyUnionType>> getModuleKeys() {
        return this.moduleKeys;
    }

    public final void setModuleKeys(@Nullable List<? extends List<? extends ModuleKeyUnionType>> list) {
        this.moduleKeys = list;
    }

    @Nullable
    public final String getExtraConfigKey() {
        return this.extraConfigKey;
    }

    public final void setExtraConfigKey(@Nullable String str) {
        this.extraConfigKey = str;
    }

    @Nullable
    public final List<List<ModuleKeyUnionType>> getExtraModuleKeys() {
        return this.extraModuleKeys;
    }

    public final void setExtraModuleKeys(@Nullable List<? extends List<? extends ModuleKeyUnionType>> list) {
        this.extraModuleKeys = list;
    }

    @Nullable
    public final String getTabKey() {
        return this.tabKey;
    }

    public final void setTabKey(@Nullable String str) {
        this.tabKey = str;
    }

    @Nullable
    public final HashMap<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    public final void setExtraInfo(@Nullable HashMap<String, Object> hashMap) {
        this.extraInfo = hashMap;
    }

    @Nullable
    public final TabModulesVCInfo getVcSetting() {
        return this.vcSetting;
    }

    public final void setVcSetting(@Nullable TabModulesVCInfo tabModulesVCInfo) {
        this.vcSetting = tabModulesVCInfo;
    }

    @Nullable
    public final Boolean isIndependentWhiteboard() {
        return this.isIndependentWhiteboard;
    }

    public final void setIndependentWhiteboard(@Nullable Boolean bool) {
        this.isIndependentWhiteboard = bool;
    }
}
