package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewOverScreenPaintingCallBack;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfoProps;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/ExtraViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/FixedMarginViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "overScreen", "", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "needSetClickListener", DMKeys.KEY_VIEW_INFO, "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfoProps;", "updateProps", "", "info", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ExtraViewInfoDiff<T extends ExtraViewInfo, V extends ViewItem> extends FixedMarginViewInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Boolean overScreen;

    public /* synthetic */ ExtraViewInfoDiff(DynamicChassisInterface dynamicChassisInterface, Boolean bool, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((ExtraViewInfoDiff<T, V>) ((ExtraViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((ExtraViewInfoDiff<T, V>) ((ExtraViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((ExtraViewInfoDiff<T, V>) ((ExtraViewInfo) viewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface, @Nullable Boolean bool) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b385989942902a73312f9f3454d5b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b385989942902a73312f9f3454d5b0");
        } else {
            this.overScreen = bool;
        }
    }

    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8cd82f60057ea28697d7cce9ac9938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8cd82f60057ea28697d7cce9ac9938");
            return;
        }
        h.b(t, "info");
        super.updateProps((ExtraViewInfoDiff<T, V>) t);
        ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1 extraViewInfoDiff$updateProps$dynamicPaintingInterface$1 = new ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1(this);
        if (h.a(this.overScreen, Boolean.TRUE)) {
            getViewItem().viewPaintingCallback = new DynamicViewOverScreenPaintingCallBack(getHostChassis(), extraViewInfoDiff$updateProps$dynamicPaintingInterface$1, false, 4, null);
        } else {
            getViewItem().viewPaintingCallback = new DynamicViewPaintingCallback(getHostChassis(), extraViewInfoDiff$updateProps$dynamicPaintingInterface$1, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needSetClickListener(ExtraViewInfoProps extraViewInfoProps) {
        Boolean userInteractionEnabled;
        Object[] objArr = {extraViewInfoProps};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4964a102f507bbc785526f06e677e5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4964a102f507bbc785526f06e677e5b")).booleanValue();
        }
        if ((extraViewInfoProps == null || (userInteractionEnabled = extraViewInfoProps.getUserInteractionEnabled()) == null) ? false : userInteractionEnabled.booleanValue()) {
            boolean z = extraViewInfoProps instanceof ViewInfo;
            ViewInfo viewInfo = (ViewInfo) (!z ? null : extraViewInfoProps);
            String didSelectCallback = viewInfo != null ? viewInfo.getDidSelectCallback() : null;
            if (didSelectCallback == null || didSelectCallback.length() == 0) {
                if (!z) {
                    extraViewInfoProps = null;
                }
                ViewInfo viewInfo2 = (ViewInfo) extraViewInfoProps;
                String jumpUrl = viewInfo2 != null ? viewInfo2.getJumpUrl() : null;
                if (!(jumpUrl == null || jumpUrl.length() == 0)) {
                }
            }
            return true;
        }
        return false;
    }
}
