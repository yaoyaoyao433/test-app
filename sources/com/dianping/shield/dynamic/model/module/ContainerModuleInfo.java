package com.dianping.shield.dynamic.model.module;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/ContainerModuleInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "()V", DMKeys.KEY_CONFIG_KEY, "", "getConfigKey", "()Ljava/lang/String;", "setConfigKey", "(Ljava/lang/String;)V", "identifier", "getIdentifier", "setIdentifier", DMKeys.KEY_MODULE_KEYS, "", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "getModuleKeys", "()Ljava/util/List;", "setModuleKeys", "(Ljava/util/List;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContainerModuleInfo implements DiffableInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String configKey;
    @Nullable
    private String identifier;
    @Nullable
    private List<? extends List<? extends ModuleKeyUnionType>> moduleKeys;

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    public final void setIdentifier(@Nullable String str) {
        this.identifier = str;
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
}
