package com.dianping.shield.dynamic.diff.vc;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.agent.node.DynamicDiffKt;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.diff.view.DragRefreshViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.ViewInfoDiff;
import com.dianping.shield.dynamic.fragments.DynamicModulesFragment;
import com.dianping.shield.dynamic.items.vc.ModulesVCItem;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.vc.BaseModulesVCInfo;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\rJ\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0017\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u0017\u001a\u00020\u001bH\u0002JI\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0002\u0010%J5\u0010&\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!H\u0002¢\u0006\u0002\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010-\u001a\u00020+H\u0002J\b\u00104\u001a\u00020\u0010H\u0016J\u0015\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u00068"}, d2 = {"Lcom/dianping/shield/dynamic/diff/vc/BaseModulesVCInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;", "V", "Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "dynamicModulesFragment", "Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment;", "(Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment;)V", "dynamicVCItem", "getDynamicVCItem", "()Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;", "setDynamicVCItem", "(Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;)V", "Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;", "bindExtraViewItem", "", "computingItem", "bindItems", "createComputingItem", "createViewItemWithDragRefreshViewInfoFunc", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", DMKeys.KEY_VIEW_INFO, "createViewItemWithExtraViewInfoFunc", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "createViewItemWithViewInfoFunc", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffExtraViewItem", "(Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;Ljava/util/ArrayList;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "mappingBgFunc", "id", "mappingDragRefreshFunc", "mappingLoadingFailFunc", "mappingLoadingFunc", "mappingMaskFunc", "mappingPageBgFunc", "mappingPageMaskFunc", "resetProps", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseModulesVCInfoDiff<T extends BaseModulesVCInfo, V extends ModulesVCItem> extends DynamicBaseDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DynamicModulesFragment dynamicModulesFragment;
    @NotNull
    public V dynamicVCItem;

    public final void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c935d0af3c231a84332d213043c3f21f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c935d0af3c231a84332d213043c3f21f");
        } else {
            h.b(t, "info");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((BaseModulesVCInfoDiff<T, V>) ((ModulesVCItem) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseModulesVCInfoDiff<T, V>) ((BaseModulesVCInfo) diffableInfo), (BaseModulesVCInfo) ((ModulesVCItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseModulesVCInfoDiff<T, V>) ((BaseModulesVCInfo) diffableInfo));
    }

    public BaseModulesVCInfoDiff(@NotNull DynamicModulesFragment dynamicModulesFragment) {
        h.b(dynamicModulesFragment, "dynamicModulesFragment");
        Object[] objArr = {dynamicModulesFragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b1ff64223db40b5ef37bff231905c01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b1ff64223db40b5ef37bff231905c01");
        } else {
            this.dynamicModulesFragment = dynamicModulesFragment;
        }
    }

    @NotNull
    public final V getDynamicVCItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3399250374413ce1eedaf8a6b72a9a12", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3399250374413ce1eedaf8a6b72a9a12");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        return v;
    }

    public final void setDynamicVCItem(@NotNull V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b154d63fcbcbee895395d238efd5f044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b154d63fcbcbee895395d238efd5f044");
            return;
        }
        h.b(v, "<set-?>");
        this.dynamicVCItem = v;
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final V createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c966117bdb5cd7b7e662a736a5864841", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c966117bdb5cd7b7e662a736a5864841") : (V) new ModulesVCItem();
    }

    public final void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21032b6c3a636e3ea992ebae54c947f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21032b6c3a636e3ea992ebae54c947f7");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        diffExtraViewItem(t, v, arrayList);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8beaa823546690ae50d3bc78eb92f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8beaa823546690ae50d3bc78eb92f9b");
            return;
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        v.clear();
    }

    public final void bindItems(@Nullable V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3855a2f4eab2bbf285d51fc006f026d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3855a2f4eab2bbf285d51fc006f026d");
        } else {
            bindExtraViewItem(v);
        }
    }

    private final void bindExtraViewItem(V v) {
        DynamicViewItem<DragRefreshViewInfo> dragRefreshViewItem;
        DynamicViewItem<ViewInfo> loadingFailViewItem;
        DynamicViewItem<ViewInfo> loadingViewItem;
        DynamicViewItem<ExtraViewInfo> pageMaskViewItem;
        DynamicViewItem<ExtraViewInfo> pageBgViewItem;
        DynamicViewItem<ExtraViewInfo> maskViewItem;
        DynamicViewItem<ExtraViewInfo> bgViewItem;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65c89e6b540d97938af9ea40a388ba22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65c89e6b540d97938af9ea40a388ba22");
            return;
        }
        if (v != null && (bgViewItem = v.getBgViewItem()) != null) {
            V v2 = this.dynamicVCItem;
            if (v2 == null) {
                h.a("dynamicVCItem");
            }
            v2.setBgViewItem(bgViewItem);
            V v3 = this.dynamicVCItem;
            if (v3 == null) {
                h.a("dynamicVCItem");
            }
            if (v3.getBgViewItem() instanceof DynamicDiff) {
                V v4 = this.dynamicVCItem;
                if (v4 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ExtraViewInfo> bgViewItem2 = v4.getBgViewItem();
                if (bgViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                bgViewItem2.onComputingComplete();
            }
            v.setBgViewItem(null);
        }
        if (v != null && (maskViewItem = v.getMaskViewItem()) != null) {
            V v5 = this.dynamicVCItem;
            if (v5 == null) {
                h.a("dynamicVCItem");
            }
            v5.setMaskViewItem(maskViewItem);
            V v6 = this.dynamicVCItem;
            if (v6 == null) {
                h.a("dynamicVCItem");
            }
            if (v6.getMaskViewItem() instanceof DynamicDiff) {
                V v7 = this.dynamicVCItem;
                if (v7 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ExtraViewInfo> maskViewItem2 = v7.getMaskViewItem();
                if (maskViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                maskViewItem2.onComputingComplete();
            }
            v.setMaskViewItem(null);
        }
        if (v != null && (pageBgViewItem = v.getPageBgViewItem()) != null) {
            V v8 = this.dynamicVCItem;
            if (v8 == null) {
                h.a("dynamicVCItem");
            }
            v8.setPageBgViewItem(pageBgViewItem);
            V v9 = this.dynamicVCItem;
            if (v9 == null) {
                h.a("dynamicVCItem");
            }
            if (v9.getPageBgViewItem() instanceof DynamicDiff) {
                V v10 = this.dynamicVCItem;
                if (v10 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ExtraViewInfo> pageBgViewItem2 = v10.getPageBgViewItem();
                if (pageBgViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                pageBgViewItem2.onComputingComplete();
            }
            v.setPageBgViewItem(null);
        }
        if (v != null && (pageMaskViewItem = v.getPageMaskViewItem()) != null) {
            V v11 = this.dynamicVCItem;
            if (v11 == null) {
                h.a("dynamicVCItem");
            }
            v11.setPageMaskViewItem(pageMaskViewItem);
            V v12 = this.dynamicVCItem;
            if (v12 == null) {
                h.a("dynamicVCItem");
            }
            if (v12.getPageMaskViewItem() instanceof DynamicDiff) {
                V v13 = this.dynamicVCItem;
                if (v13 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ExtraViewInfo> pageMaskViewItem2 = v13.getPageMaskViewItem();
                if (pageMaskViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                pageMaskViewItem2.onComputingComplete();
            }
            v.setPageMaskViewItem(null);
        }
        if (v != null && (loadingViewItem = v.getLoadingViewItem()) != null) {
            V v14 = this.dynamicVCItem;
            if (v14 == null) {
                h.a("dynamicVCItem");
            }
            v14.setLoadingViewItem(loadingViewItem);
            V v15 = this.dynamicVCItem;
            if (v15 == null) {
                h.a("dynamicVCItem");
            }
            if (v15.getLoadingViewItem() instanceof DynamicDiff) {
                V v16 = this.dynamicVCItem;
                if (v16 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ViewInfo> loadingViewItem2 = v16.getLoadingViewItem();
                if (loadingViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                loadingViewItem2.onComputingComplete();
            }
            v.setLoadingViewItem(null);
        }
        if (v != null && (loadingFailViewItem = v.getLoadingFailViewItem()) != null) {
            V v17 = this.dynamicVCItem;
            if (v17 == null) {
                h.a("dynamicVCItem");
            }
            v17.setLoadingFailViewItem(loadingFailViewItem);
            V v18 = this.dynamicVCItem;
            if (v18 == null) {
                h.a("dynamicVCItem");
            }
            if (v18.getLoadingFailViewItem() instanceof DynamicDiff) {
                V v19 = this.dynamicVCItem;
                if (v19 == null) {
                    h.a("dynamicVCItem");
                }
                DynamicViewItem<ViewInfo> loadingFailViewItem2 = v19.getLoadingFailViewItem();
                if (loadingFailViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                loadingFailViewItem2.onComputingComplete();
            }
            v.setLoadingFailViewItem(null);
        }
        if (v == null || (dragRefreshViewItem = v.getDragRefreshViewItem()) == null) {
            return;
        }
        V v20 = this.dynamicVCItem;
        if (v20 == null) {
            h.a("dynamicVCItem");
        }
        v20.setDragRefreshViewItem(dragRefreshViewItem);
        V v21 = this.dynamicVCItem;
        if (v21 == null) {
            h.a("dynamicVCItem");
        }
        if (v21.getDragRefreshViewItem() instanceof DynamicDiff) {
            V v22 = this.dynamicVCItem;
            if (v22 == null) {
                h.a("dynamicVCItem");
            }
            DynamicViewItem<DragRefreshViewInfo> dragRefreshViewItem2 = v22.getDragRefreshViewItem();
            if (dragRefreshViewItem2 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
            }
            dragRefreshViewItem2.onComputingComplete();
        }
        v.setDragRefreshViewItem(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0224, code lost:
        if (r6 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028a, code lost:
        if (r6 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02f0, code lost:
        if (r2 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        if (r6 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r6 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0158, code lost:
        if (r6 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
        if (r6 == null) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffExtraViewItem(T r12, V r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.vc.BaseModulesVCInfoDiff.diffExtraViewItem(com.dianping.shield.dynamic.model.vc.BaseModulesVCInfo, com.dianping.shield.dynamic.items.vc.ModulesVCItem, java.util.ArrayList):void");
    }

    private final DynamicViewItem<ExtraViewInfo> mappingPageBgFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86665ea2cc9074c27898774fd94f564", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86665ea2cc9074c27898774fd94f564");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> pageBgViewItem = v.getPageBgViewItem();
        if (pageBgViewItem == null || !h.a((Object) pageBgViewItem.getId(), (Object) str)) {
            return null;
        }
        pageBgViewItem.setItemFromMapping(true);
        return pageBgViewItem;
    }

    private final DynamicViewItem<ExtraViewInfo> mappingPageMaskFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96952164459b4051b3dcdcee479dd322", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96952164459b4051b3dcdcee479dd322");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> pageMaskViewItem = v.getPageMaskViewItem();
        if (pageMaskViewItem == null || !h.a((Object) pageMaskViewItem.getId(), (Object) str)) {
            return null;
        }
        pageMaskViewItem.setItemFromMapping(true);
        return pageMaskViewItem;
    }

    private final DynamicViewItem<ExtraViewInfo> mappingBgFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cc5405e65175c7607d54233202336e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cc5405e65175c7607d54233202336e0");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> bgViewItem = v.getBgViewItem();
        if (bgViewItem == null || !h.a((Object) bgViewItem.getId(), (Object) str)) {
            return null;
        }
        bgViewItem.setItemFromMapping(true);
        return bgViewItem;
    }

    private final DynamicViewItem<ExtraViewInfo> mappingMaskFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c62685fd45a6e63b0fec869e9efa015", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c62685fd45a6e63b0fec869e9efa015");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> maskViewItem = v.getMaskViewItem();
        if (maskViewItem == null || !h.a((Object) maskViewItem.getId(), (Object) str)) {
            return null;
        }
        maskViewItem.setItemFromMapping(true);
        return maskViewItem;
    }

    private final DynamicViewItem<ViewInfo> mappingLoadingFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb965910d692d523549e06c13e235356", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb965910d692d523549e06c13e235356");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ViewInfo> loadingViewItem = v.getLoadingViewItem();
        DynamicViewItem<ViewInfo> dynamicViewItem = null;
        if (loadingViewItem != null && h.a((Object) loadingViewItem.getId(), (Object) str)) {
            V v2 = this.dynamicVCItem;
            if (v2 == null) {
                h.a("dynamicVCItem");
            }
            dynamicViewItem = v2.getLoadingViewItem();
            if (dynamicViewItem == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ViewInfo>");
            }
        }
        return dynamicViewItem;
    }

    private final DynamicViewItem<ViewInfo> mappingLoadingFailFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2d4e7589e4a752a22e7c1dc1804811d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2d4e7589e4a752a22e7c1dc1804811d");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ViewInfo> loadingFailViewItem = v.getLoadingFailViewItem();
        DynamicViewItem<ViewInfo> dynamicViewItem = null;
        if (loadingFailViewItem != null && h.a((Object) loadingFailViewItem.getId(), (Object) str)) {
            V v2 = this.dynamicVCItem;
            if (v2 == null) {
                h.a("dynamicVCItem");
            }
            dynamicViewItem = v2.getLoadingFailViewItem();
            if (dynamicViewItem == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ViewInfo>");
            }
        }
        return dynamicViewItem;
    }

    private final DynamicViewItem<DragRefreshViewInfo> mappingDragRefreshFunc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d74fdea237b49f617f8a5f493deb502", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d74fdea237b49f617f8a5f493deb502");
        }
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<DragRefreshViewInfo> dragRefreshViewItem = v.getDragRefreshViewItem();
        DynamicViewItem<DragRefreshViewInfo> dynamicViewItem = null;
        if (dragRefreshViewItem != null && h.a((Object) dragRefreshViewItem.getId(), (Object) str)) {
            V v2 = this.dynamicVCItem;
            if (v2 == null) {
                h.a("dynamicVCItem");
            }
            dynamicViewItem = v2.getDragRefreshViewItem();
            if (dynamicViewItem == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.DragRefreshViewInfo>");
            }
        }
        return dynamicViewItem;
    }

    private final DynamicViewItem<ExtraViewInfo> createViewItemWithExtraViewInfoFunc(ExtraViewInfo extraViewInfo) {
        Object[] objArr = {extraViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f5cfa336d8142aef22bc15fcd9835bf", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f5cfa336d8142aef22bc15fcd9835bf") : new DynamicViewItem<>(new ExtraViewInfoDiff(this.dynamicModulesFragment, Boolean.TRUE));
    }

    private final DynamicViewItem<ViewInfo> createViewItemWithViewInfoFunc(ViewInfo viewInfo) {
        Object[] objArr = {viewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5cfde1e92d928a0b5a4ad4ccc3b0ef4", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5cfde1e92d928a0b5a4ad4ccc3b0ef4") : new DynamicViewItem<>(new ViewInfoDiff(this.dynamicModulesFragment));
    }

    private final DynamicViewItem<DragRefreshViewInfo> createViewItemWithDragRefreshViewInfoFunc(DragRefreshViewInfo dragRefreshViewInfo) {
        Object[] objArr = {dragRefreshViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ff90c8741ce708de63aebc1dc16f3d7", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ff90c8741ce708de63aebc1dc16f3d7") : new DynamicViewItem<>(new DragRefreshViewInfoDiff(this.dynamicModulesFragment));
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a88d980e91d0f0bb42d1a2c81068b86a", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a88d980e91d0f0bb42d1a2c81068b86a");
        }
        h.b(str, "identifier");
        ArrayList arrayList = new ArrayList();
        V v = this.dynamicVCItem;
        if (v == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> pageBgViewItem = v.getPageBgViewItem();
        if (!(pageBgViewItem instanceof DynamicViewItemsHolderInterface)) {
            pageBgViewItem = null;
        }
        DynamicViewItem<ExtraViewInfo> dynamicViewItem = pageBgViewItem;
        if (dynamicViewItem != null) {
            arrayList.add(dynamicViewItem);
        }
        V v2 = this.dynamicVCItem;
        if (v2 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> pageMaskViewItem = v2.getPageMaskViewItem();
        if (!(pageMaskViewItem instanceof DynamicViewItemsHolderInterface)) {
            pageMaskViewItem = null;
        }
        DynamicViewItem<ExtraViewInfo> dynamicViewItem2 = pageMaskViewItem;
        if (dynamicViewItem2 != null) {
            arrayList.add(dynamicViewItem2);
        }
        V v3 = this.dynamicVCItem;
        if (v3 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> bgViewItem = v3.getBgViewItem();
        if (!(bgViewItem instanceof DynamicViewItemsHolderInterface)) {
            bgViewItem = null;
        }
        DynamicViewItem<ExtraViewInfo> dynamicViewItem3 = bgViewItem;
        if (dynamicViewItem3 != null) {
            arrayList.add(dynamicViewItem3);
        }
        V v4 = this.dynamicVCItem;
        if (v4 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ExtraViewInfo> maskViewItem = v4.getMaskViewItem();
        if (!(maskViewItem instanceof DynamicViewItemsHolderInterface)) {
            maskViewItem = null;
        }
        DynamicViewItem<ExtraViewInfo> dynamicViewItem4 = maskViewItem;
        if (dynamicViewItem4 != null) {
            arrayList.add(dynamicViewItem4);
        }
        V v5 = this.dynamicVCItem;
        if (v5 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ViewInfo> loadingViewItem = v5.getLoadingViewItem();
        if (!(loadingViewItem instanceof DynamicViewItemsHolderInterface)) {
            loadingViewItem = null;
        }
        DynamicViewItem<ViewInfo> dynamicViewItem5 = loadingViewItem;
        if (dynamicViewItem5 != null) {
            arrayList.add(dynamicViewItem5);
        }
        V v6 = this.dynamicVCItem;
        if (v6 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<ViewInfo> loadingFailViewItem = v6.getLoadingFailViewItem();
        if (!(loadingFailViewItem instanceof DynamicViewItemsHolderInterface)) {
            loadingFailViewItem = null;
        }
        DynamicViewItem<ViewInfo> dynamicViewItem6 = loadingFailViewItem;
        if (dynamicViewItem6 != null) {
            arrayList.add(dynamicViewItem6);
        }
        V v7 = this.dynamicVCItem;
        if (v7 == null) {
            h.a("dynamicVCItem");
        }
        DynamicViewItem<DragRefreshViewInfo> dragRefreshViewItem = v7.getDragRefreshViewItem();
        if (!(dragRefreshViewItem instanceof DynamicViewItemsHolderInterface)) {
            dragRefreshViewItem = null;
        }
        DynamicViewItem<DragRefreshViewInfo> dynamicViewItem7 = dragRefreshViewItem;
        if (dynamicViewItem7 != null) {
            arrayList.add(dynamicViewItem7);
        }
        return DynamicDiffKt.findDynamicViewItem(arrayList, str);
    }
}
