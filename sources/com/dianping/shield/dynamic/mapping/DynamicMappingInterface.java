package com.dianping.shield.dynamic.mapping;

import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleView;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "", "getExecEnvironment", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$EnvCreator;", "type", "", "Companion", "EnvCreator", "ViewDataCreator", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicMappingInterface {
    public static final Companion Companion = Companion.$$INSTANCE;
    @NotNull
    public static final String TYPE_MODULE = "Dynamic_Module";
    @NotNull
    public static final String TYPE_PAGE = "Dynamic_PAGE";

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$Companion;", "", "()V", "TYPE_MODULE", "", "TYPE_PAGE", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        public static final String TYPE_MODULE = "Dynamic_Module";
        @NotNull
        public static final String TYPE_PAGE = "Dynamic_PAGE";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$EnvCreator;", "", "initExecEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "chassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "paintingCallback", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface EnvCreator {
        @Nullable
        DynamicExecEnvironment initExecEnvironment(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$ViewDataCreator;", "", "initView", "Lcom/dianping/shield/dynamic/objects/DynamicModuleView;", "initViewData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewData;", "isSingleButton", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface ViewDataCreator {
        @Nullable
        DynamicModuleView initView();

        @Nullable
        DynamicModuleViewData initViewData();

        boolean isSingleButton();
    }

    @Nullable
    EnvCreator getExecEnvironment(@NotNull String str);
}
