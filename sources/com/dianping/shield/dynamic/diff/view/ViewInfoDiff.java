package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cR7\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/ViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "Lcom/dianping/shield/dynamic/diff/extra/ExposeInfoDiffProxy;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "mapOnScreen", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getMapOnScreen", "()Ljava/util/HashMap;", "mapOnScreen$delegate", "Lkotlin/Lazy;", "bindItems", "", "computingItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "createComputingItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "resetProps", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ViewInfoDiff<T extends ViewInfo, V extends ViewItem> extends BaseViewInfoDiff<T, V> implements ExposeInfoDiffProxy {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ViewInfoDiff.class), "mapOnScreen", "getMapOnScreen()Ljava/util/HashMap;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d mapOnScreen$delegate;

    public void bindItems(@Nullable V v) {
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @NotNull
    public HashMap<String, Long> getMapOnScreen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (HashMap) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "701d3762d14c1ee72fbbdb3209c5b5de", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "701d3762d14c1ee72fbbdb3209c5b5de") : this.mapOnScreen$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((ViewInfoDiff<T, V>) ((ViewItem) obj));
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public ExposeInfo processExposeInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable MidasInfo midasInfo, @Nullable MGEInfo mGEInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb294aa828de57584cba0e6552c7b117", RobustBitConfig.DEFAULT_VALUE) ? (ExposeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb294aa828de57584cba0e6552c7b117") : ExposeInfoDiffProxy.DefaultImpls.processExposeInfo(this, exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public MoveStatusInfo processMoveStatusInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7586c7a79acd05c5e3070f50d13b4495", RobustBitConfig.DEFAULT_VALUE) ? (MoveStatusInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7586c7a79acd05c5e3070f50d13b4495") : ExposeInfoDiffProxy.DefaultImpls.processMoveStatusInfo(this, exposeInfo, dynamicModuleViewItemData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((ViewInfoDiff<T, V>) ((ViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((ViewInfoDiff<T, V>) ((ViewInfo) baseViewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56ed0606fb5137616ddb71d784a8c17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56ed0606fb5137616ddb71d784a8c17");
        } else {
            this.mapOnScreen$delegate = e.a(kotlin.i.NONE, ViewInfoDiff$mapOnScreen$2.INSTANCE);
        }
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public V createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37471a3ac91be7310724076b21f455ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37471a3ac91be7310724076b21f455ca");
        }
        V v = (V) getViewItem();
        if (v != null) {
            return v;
        }
        throw new o("null cannot be cast to non-null type V");
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af2066f74fd5bff8755f4efc0e83ac66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af2066f74fd5bff8755f4efc0e83ac66");
            return;
        }
        super.resetProps();
        getViewItem().exposeInfo = null;
        getViewItem().moveStatusInfo = null;
    }

    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944b49e6e757fa030c92decfdea24d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944b49e6e757fa030c92decfdea24d92");
            return;
        }
        h.b(t, "info");
        super.updateProps((ViewInfoDiff<T, V>) t);
        ViewItem viewItem = getViewItem();
        T t2 = t;
        MidasInfo midasInfo = t.getMidasInfo();
        MGEInfo viewMgeInfo = t.getViewMgeInfo();
        Object obj = getViewItem().data;
        if (!(obj instanceof DynamicModuleViewItemData)) {
            obj = null;
        }
        viewItem.exposeInfo = processExposeInfo(t2, midasInfo, viewMgeInfo, (DynamicModuleViewItemData) obj);
        ViewItem viewItem2 = getViewItem();
        Object obj2 = getViewItem().data;
        if (!(obj2 instanceof DynamicModuleViewItemData)) {
            obj2 = null;
        }
        viewItem2.moveStatusInfo = processMoveStatusInfo(t2, (DynamicModuleViewItemData) obj2);
    }
}
