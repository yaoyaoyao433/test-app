package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/ExtraReusableViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/ExtraViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "updateProps", "", "info", "(Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtraReusableViewInfoDiff<T extends ExtraReusableViewInfo, V extends ViewItem> extends ExtraViewInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff, com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((ExtraReusableViewInfoDiff<T, V>) ((ExtraReusableViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff, com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((ExtraReusableViewInfoDiff<T, V>) ((ExtraReusableViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ExtraViewInfo extraViewInfo) {
        updateProps((ExtraReusableViewInfoDiff<T, V>) ((ExtraReusableViewInfo) extraViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff, com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((ExtraReusableViewInfoDiff<T, V>) ((ExtraReusableViewInfo) viewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraReusableViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface, null, 2, null);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c6d23f86bd1639feb04e95a792c7ae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c6d23f86bd1639feb04e95a792c7ae4");
        }
    }

    public final void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e496037d0264cf92f11394effea705fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e496037d0264cf92f11394effea705fc");
            return;
        }
        h.b(t, "info");
        super.updateProps((ExtraReusableViewInfoDiff<T, V>) t);
        getViewItem().viewType = t.getReuseIdentifier();
    }
}
