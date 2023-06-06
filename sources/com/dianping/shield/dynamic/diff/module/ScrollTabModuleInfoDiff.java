package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.module.BaseTabModuleInfo;
import com.dianping.shield.dynamic.model.module.ScrollTabModuleInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/dynamic/diff/module/ScrollTabModuleInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/module/ScrollTabModuleInfo;", "V", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "updateProps", "", "info", "(Lcom/dianping/shield/dynamic/model/module/ScrollTabModuleInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ScrollTabModuleInfoDiff<T extends ScrollTabModuleInfo, V extends TabRowItem> extends BaseTabModuleInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((ScrollTabModuleInfoDiff<T, V>) ((ScrollTabModuleInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff
    public /* bridge */ /* synthetic */ void updateProps(BaseTabModuleInfo baseTabModuleInfo) {
        updateProps((ScrollTabModuleInfoDiff<T, V>) ((ScrollTabModuleInfo) baseTabModuleInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollTabModuleInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee17cca143681844992084e3ed7576e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee17cca143681844992084e3ed7576e1");
        }
    }

    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6418463eaca4127125566ec3f7a78017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6418463eaca4127125566ec3f7a78017");
            return;
        }
        h.b(t, "info");
        super.updateProps((ScrollTabModuleInfoDiff<T, V>) t);
        ScrollEvent pageChangeScrollEvent = t.getPageChangeScrollEvent();
        if (pageChangeScrollEvent != null) {
            getDynamicRowItem().pageScrollEventDispatcherProvider = createScrollEventDispatcher(pageChangeScrollEvent, getDynamicRowItem().pageScrollEventDispatcherProvider);
        }
        if (!h.a(t.getAlwaysHover(), Boolean.TRUE)) {
            getDynamicRowItem().topInfo.endType = TopInfo.EndType.MODULE;
        }
    }
}
