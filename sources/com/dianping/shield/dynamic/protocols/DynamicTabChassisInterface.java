package com.dianping.shield.dynamic.protocols;

import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/protocols/DynamicTabChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "selectTab", "", "index", "", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicTabChassisInterface extends DynamicChassisInterface {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public static PageContainerThemePackage getContainerThemePackage(DynamicTabChassisInterface dynamicTabChassisInterface) {
            Object[] objArr = {dynamicTabChassisInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1c98434ce4db674afd9579ace8ed80c", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1c98434ce4db674afd9579ace8ed80c") : DynamicChassisInterface.DefaultImpls.getContainerThemePackage(dynamicTabChassisInterface);
        }

        public static void refreshHostViewItem(DynamicTabChassisInterface dynamicTabChassisInterface, @NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
            Object[] objArr = {dynamicTabChassisInterface, iDynamicModuleViewItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e46c6d2f8937435449e4ce083863fe4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e46c6d2f8937435449e4ce083863fe4");
                return;
            }
            h.b(iDynamicModuleViewItem, "viewItem");
            DynamicChassisInterface.DefaultImpls.refreshHostViewItem(dynamicTabChassisInterface, iDynamicModuleViewItem);
        }
    }

    void selectTab(int i, @NotNull g gVar);
}
