package com.dianping.shield.component.extensions.common;

import com.dianping.shield.component.extensions.common.ContainerRowAppearanceProcessor;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusManager;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ContainerRowAppearanceProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContainerRowAppearanceProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AppearanceEvent.PARTLY_APPEAR.ordinal()] = 1;
            int[] iArr2 = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[AppearanceEvent.FULLY_DISAPPEAR.ordinal()] = 1;
        }
    }

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull final RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70638479119f9038cfd31aed6a470545", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70638479119f9038cfd31aed6a470545")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if (rowItem instanceof CommonContainerRowItem) {
            if (shieldRow.moveStatusEventListenerList == null) {
                shieldRow.moveStatusEventListenerList = new ArrayList<>();
            }
            ArrayList<MoveStatusEventListener<ShieldRow>> arrayList = shieldRow.moveStatusEventListenerList;
            if (arrayList != null) {
                arrayList.add(new MoveStatusEventListener<ShieldRow>() { // from class: com.dianping.shield.component.extensions.common.ContainerRowAppearanceProcessor$handleRowItem$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                    public final void reset(@Nullable ShieldRow shieldRow2) {
                    }

                    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                    public final void onAppeared(@Nullable AppearanceEvent appearanceEvent, @Nullable AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
                        ScrollDirection scrollDirection;
                        ScrollDirection scrollDirection2;
                        ScrollDirection scrollDirection3;
                        Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34e3eb969d1ebfe917f75b0dc8e64fa8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34e3eb969d1ebfe917f75b0dc8e64fa8");
                        } else if (appearanceEvent != null && ContainerRowAppearanceProcessor.WhenMappings.$EnumSwitchMapping$0[appearanceEvent.ordinal()] == 1) {
                            AttachStatusManager<ViewItem> attachStatusManager = ((CommonContainerRowItem) RowItem.this).getAttachStatusManager();
                            if (attachStatusManager != null) {
                                attachStatusManager.setAction(AttachStatusManager.Action.ACT_START);
                            }
                            IElementContainerExpose containerView = ((CommonContainerRowItem) RowItem.this).getContainerView();
                            if (containerView != null) {
                                if (appearanceDispatchData == null || (scrollDirection3 = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection3 = ScrollDirection.STATIC;
                                }
                                containerView.onAppear(scrollDirection3, appearanceDispatchData);
                            }
                            ViewItem backgroundViewItem = ((CommonContainerRowItem) RowItem.this).getBackgroundViewItem();
                            if (backgroundViewItem != null) {
                                AttachStatus attachStatus = AttachStatus.DETACHED;
                                AttachStatus attachStatus2 = AttachStatus.PARTLY_ATTACHED;
                                if (appearanceDispatchData == null || (scrollDirection2 = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection2 = ScrollDirection.STATIC;
                                }
                                backgroundViewItem.onViewItemExpose(new AppearanceDispatchData<>(0, backgroundViewItem, attachStatus, attachStatus2, scrollDirection2, appearanceDispatchData != null ? appearanceDispatchData.viewExtraInfo : null), appearanceDispatchData != null ? appearanceDispatchData.element : null);
                            }
                            ViewItem maskViewItem = ((CommonContainerRowItem) RowItem.this).getMaskViewItem();
                            if (maskViewItem != null) {
                                AttachStatus attachStatus3 = AttachStatus.DETACHED;
                                AttachStatus attachStatus4 = AttachStatus.PARTLY_ATTACHED;
                                if (appearanceDispatchData == null || (scrollDirection = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection = ScrollDirection.STATIC;
                                }
                                maskViewItem.onViewItemExpose(new AppearanceDispatchData<>(0, maskViewItem, attachStatus3, attachStatus4, scrollDirection, appearanceDispatchData != null ? appearanceDispatchData.viewExtraInfo : null), appearanceDispatchData != null ? appearanceDispatchData.element : null);
                            }
                        }
                    }

                    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                    public final void onDisappeared(@Nullable AppearanceEvent appearanceEvent, @Nullable AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
                        ScrollDirection scrollDirection;
                        ScrollDirection scrollDirection2;
                        ScrollDirection scrollDirection3;
                        Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "93adebbfa0c63b4ae76354b862540c0f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "93adebbfa0c63b4ae76354b862540c0f");
                        } else if (appearanceEvent != null && ContainerRowAppearanceProcessor.WhenMappings.$EnumSwitchMapping$1[appearanceEvent.ordinal()] == 1) {
                            IElementContainerExpose containerView = ((CommonContainerRowItem) RowItem.this).getContainerView();
                            if (containerView != null) {
                                if (appearanceDispatchData == null || (scrollDirection3 = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection3 = ScrollDirection.STATIC;
                                }
                                containerView.onDisappear(scrollDirection3, appearanceDispatchData);
                            }
                            AttachStatusManager<ViewItem> attachStatusManager = ((CommonContainerRowItem) RowItem.this).getAttachStatusManager();
                            if (attachStatusManager != null) {
                                attachStatusManager.setAction(AttachStatusManager.Action.ACT_STOP);
                            }
                            ViewItem backgroundViewItem = ((CommonContainerRowItem) RowItem.this).getBackgroundViewItem();
                            if (backgroundViewItem != null) {
                                AttachStatus attachStatus = AttachStatus.PARTLY_ATTACHED;
                                AttachStatus attachStatus2 = AttachStatus.DETACHED;
                                if (appearanceDispatchData == null || (scrollDirection2 = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection2 = ScrollDirection.STATIC;
                                }
                                backgroundViewItem.onViewItemExpose(new AppearanceDispatchData<>(0, backgroundViewItem, attachStatus, attachStatus2, scrollDirection2, appearanceDispatchData != null ? appearanceDispatchData.viewExtraInfo : null), appearanceDispatchData != null ? appearanceDispatchData.element : null);
                            }
                            ViewItem maskViewItem = ((CommonContainerRowItem) RowItem.this).getMaskViewItem();
                            if (maskViewItem != null) {
                                AttachStatus attachStatus3 = AttachStatus.PARTLY_ATTACHED;
                                AttachStatus attachStatus4 = AttachStatus.DETACHED;
                                if (appearanceDispatchData == null || (scrollDirection = appearanceDispatchData.scrollDirection) == null) {
                                    scrollDirection = ScrollDirection.STATIC;
                                }
                                maskViewItem.onViewItemExpose(new AppearanceDispatchData<>(0, maskViewItem, attachStatus3, attachStatus4, scrollDirection, appearanceDispatchData != null ? appearanceDispatchData.viewExtraInfo : null), appearanceDispatchData != null ? appearanceDispatchData.element : null);
                            }
                        }
                    }
                });
            }
        }
        return false;
    }
}
