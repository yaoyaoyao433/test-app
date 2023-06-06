package com.dianping.shield.dynamic.protocols;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.meituan.android.common.aidata.jsengine.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u000e\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "Lcom/dianping/shield/monitor/ShieldGAInterface;", "getAliasName", "", "getBridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getContainerThemePackage", "Lcom/dianping/shield/component/utils/PageContainerThemePackage;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", Constants.Func.GET_FEATURE, "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "getHostContext", "Landroid/content/Context;", "getHostFragment", "Landroid/support/v4/app/Fragment;", "getHostName", "getPageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "refreshHostViewItem", "", "viewItem", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicChassisInterface extends ShieldGAInterface {
    @NotNull
    String getAliasName();

    @NotNull
    v getBridge();

    @Nullable
    HashMap<String, Serializable> getChassisArguments();

    @NotNull
    PageContainerThemePackage getContainerThemePackage();

    @Nullable
    DynamicExecutorInterface getDynamicExecutor();

    @Nullable
    DynamicHostInterface getDynamicHost();

    @Nullable
    ShieldGlobalFeatureInterface getFeature();

    @Nullable
    Context getHostContext();

    @NotNull
    Fragment getHostFragment();

    @NotNull
    String getHostName();

    @Nullable
    ab<?> getPageContainer();

    void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void refreshHostViewItem(DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
            Object[] objArr = {dynamicChassisInterface, iDynamicModuleViewItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3eab17540c31174d590444d7f7d2e6f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3eab17540c31174d590444d7f7d2e6f7");
            } else {
                h.b(iDynamicModuleViewItem, "viewItem");
            }
        }

        @NotNull
        public static PageContainerThemePackage getContainerThemePackage(DynamicChassisInterface dynamicChassisInterface) {
            Object[] objArr = {dynamicChassisInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c59f29e171733ef9844aab228def55c", RobustBitConfig.DEFAULT_VALUE)) {
                return (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c59f29e171733ef9844aab228def55c");
            }
            if (dynamicChassisInterface.getPageContainer() instanceof CommonPageContainer) {
                ab<?> pageContainer = dynamicChassisInterface.getPageContainer();
                if (pageContainer != null) {
                    PageContainerThemePackage themePackage = ((CommonPageContainer) pageContainer).getThemePackage();
                    h.a((Object) themePackage, "(getPageContainer() as C…geContainer).themePackage");
                    return themePackage;
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.container.CommonPageContainer");
            }
            return new PageContainerThemePackage();
        }
    }
}
