package com.dianping.shield.dynamic.diff.cell;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.diff.view.HoverViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.vc.CardStyle;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.CardUtil;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DividerUtil;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0017\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010*J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020CH\u0002JI\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020I0Hj\b\u0012\u0004\u0012\u00020I`J2\b\u0010K\u001a\u0004\u0018\u00010\u001b2\b\u0010L\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u000209H\u0016J\b\u0010Q\u001a\u00020\u001bH\u0016J\b\u0010R\u001a\u00020\u001bH\u0016J\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B2\u0006\u0010T\u001a\u000209H\u0002J\u0010\u0010U\u001a\u00020?2\u0006\u0010F\u001a\u00020\u0002H\u0002J\b\u0010V\u001a\u00020?H\u0016J\u0010\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020\u0002H\u0002J\u0015\u0010Y\u001a\u00020?2\u0006\u0010Z\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010[R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u00102\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u00107\u001a\u001e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08j\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:`;X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006\\"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/BaseCellInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "V", "Lcom/dianping/shield/node/useritem/RowItem;", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", "cardStyle", "Lcom/dianping/shield/dynamic/model/vc/CardStyle;", "getCardStyle", "()Lcom/dianping/shield/dynamic/model/vc/CardStyle;", "setCardStyle", "(Lcom/dianping/shield/dynamic/model/vc/CardStyle;)V", "cardType", "", "getCardType", "()I", "setCardType", "(I)V", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "dynamicRowItem", "getDynamicRowItem", "()Lcom/dianping/shield/node/useritem/RowItem;", "setDynamicRowItem", "(Lcom/dianping/shield/node/useritem/RowItem;)V", "Lcom/dianping/shield/node/useritem/RowItem;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "setHostChassis", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", "needDrawCard", "getNeedDrawCard", "()Z", "setNeedDrawCard", "(Z)V", "viewIdMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/collections/HashMap;", "getViewIdMap", "()Ljava/util/HashMap;", "bindItems", "", "computingItem", "createHoverViewItem", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", DMKeys.KEY_VIEW_INFO, "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;Lcom/dianping/shield/node/useritem/RowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getAutoLeftMargin", "getAutoRightMargin", "mappingFuc", "id", "prepareDiff", "resetProps", "updateDividerProps", "cellInfo", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseCellInfoDiff<T extends CellInfo.BaseCellInfo, V extends RowItem> extends DynamicBaseDiff<T, V> implements DynamicModuleMarginInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private CardStyle cardStyle;
    private int cardType;
    @Nullable
    private MarginInfo contentMarginInfo;
    @NotNull
    public V dynamicRowItem;
    @NotNull
    private DynamicChassisInterface hostChassis;
    @Nullable
    private MarginInfo marginInfo;
    private boolean needDrawCard;
    @NotNull
    private final HashMap<String, ViewItem> viewIdMap;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((BaseCellInfoDiff<T, V>) ((RowItem) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseCellInfoDiff<T, V>) ((CellInfo.BaseCellInfo) diffableInfo), (CellInfo.BaseCellInfo) ((RowItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87e4735b3f86aa8fc0ab07d5f346b1dd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87e4735b3f86aa8fc0ab07d5f346b1dd")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0c17363378b3c0e47d0ec7a972565b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0c17363378b3c0e47d0ec7a972565b1")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f8352f19f997f48b09a1242cd144c1b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f8352f19f997f48b09a1242cd144c1b")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09724e0adcfa767a20a5c5cccc14891e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09724e0adcfa767a20a5c5cccc14891e")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalMargin(this);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d7f2eb0f0f8c202b437d160512fe97", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d7f2eb0f0f8c202b437d160512fe97")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "482ea6728cc87e1d7b51bdf8c88d21bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "482ea6728cc87e1d7b51bdf8c88d21bf")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be72565f82aa123df086fab25ebc114a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be72565f82aa123df086fab25ebc114a")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88c26967798a63877c66c464c9add642", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88c26967798a63877c66c464c9add642")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1dcfb69f7a87bd3d3e74fb10fbad137", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1dcfb69f7a87bd3d3e74fb10fbad137")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54cc340734e1b12e1f45cdc879960ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54cc340734e1b12e1f45cdc879960ef")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0915572b551f0ce4a748c37f9928a3d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0915572b551f0ce4a748c37f9928a3d8")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d6a27427b0af925f876127bd01cedba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d6a27427b0af925f876127bd01cedba")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalMargin(this);
    }

    public final void setHostChassis(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4bd4894abd4df87284351ea87c41483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4bd4894abd4df87284351ea87c41483");
            return;
        }
        h.b(dynamicChassisInterface, "<set-?>");
        this.hostChassis = dynamicChassisInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseCellInfoDiff<T, V>) ((CellInfo.BaseCellInfo) diffableInfo));
    }

    public BaseCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cae1d6a910a7186beb39eb753f465e29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cae1d6a910a7186beb39eb753f465e29");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.viewIdMap = new HashMap<>();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf428ad7adb2fd738b235f63219c4391", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf428ad7adb2fd738b235f63219c4391")).intValue() : this.hostChassis.getContainerThemePackage().getLeftMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb4f5051aa4f5e7bd24adf1679fdcaf8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb4f5051aa4f5e7bd24adf1679fdcaf8")).intValue() : this.hostChassis.getContainerThemePackage().getRightMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoMargin() {
        return this.autoMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getContentMarginInfo() {
        return this.contentMarginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setContentMarginInfo(@Nullable MarginInfo marginInfo) {
        this.contentMarginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoContentMargin() {
        return this.autoContentMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoContentMargin(@Nullable Boolean bool) {
        this.autoContentMargin = bool;
    }

    public final boolean getNeedDrawCard() {
        return this.needDrawCard;
    }

    public final void setNeedDrawCard(boolean z) {
        this.needDrawCard = z;
    }

    @Nullable
    public final CardStyle getCardStyle() {
        return this.cardStyle;
    }

    public final void setCardStyle(@Nullable CardStyle cardStyle) {
        this.cardStyle = cardStyle;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    @NotNull
    public final V getDynamicRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64c6b3569609ad8b6fa6ce220e2fa762", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64c6b3569609ad8b6fa6ce220e2fa762");
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        return v;
    }

    public final void setDynamicRowItem(@NotNull V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dcd4c338d1ec954a496dbc93f5e6ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dcd4c338d1ec954a496dbc93f5e6ef2");
            return;
        }
        h.b(v, "<set-?>");
        this.dynamicRowItem = v;
    }

    @NotNull
    public final HashMap<String, ViewItem> getViewIdMap() {
        return this.viewIdMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r13 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.dianping.shield.dynamic.agent.node.DynamicDiff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void diffChildren(@org.jetbrains.annotations.NotNull T r10, @org.jetbrains.annotations.NotNull V r11, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r12, @org.jetbrains.annotations.Nullable java.lang.Integer r13, @org.jetbrains.annotations.Nullable java.lang.Integer r14) {
        /*
            r9 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            r1 = 1
            r0[r1] = r11
            r1 = 2
            r0[r1] = r12
            r1 = 3
            r0[r1] = r13
            r13 = 4
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff.changeQuickRedirect
            java.lang.String r14 = "17974e9ec6e4387a907570f78d870142"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r9
            r3 = r13
            r5 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r13, r8, r14)
            return
        L27:
            java.lang.String r13 = "newInfo"
            kotlin.jvm.internal.h.b(r10, r13)
            java.lang.String r13 = "computingItem"
            kotlin.jvm.internal.h.b(r11, r13)
            java.lang.String r13 = "diffResult"
            kotlin.jvm.internal.h.b(r12, r13)
            r9.prepareDiff(r10)
            com.dianping.shield.dynamic.model.view.HoverViewInfo r10 = r10.getHoverView()
            if (r10 == 0) goto L97
            com.dianping.shield.dynamic.model.DiffableInfo r10 = (com.dianping.shield.dynamic.model.DiffableInfo) r10
            java.lang.String r13 = r10.getIdentifier()
            if (r13 == 0) goto L64
            r14 = r9
            com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff r14 = (com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff) r14
            com.dianping.shield.dynamic.agent.node.DynamicDiff r13 = r14.mappingFuc(r13)
            if (r13 != 0) goto L62
            if (r10 == 0) goto L5a
            r13 = r10
            com.dianping.shield.dynamic.model.view.HoverViewInfo r13 = (com.dianping.shield.dynamic.model.view.HoverViewInfo) r13
            com.dianping.shield.dynamic.agent.node.DynamicDiff r13 = r14.createHoverViewItem(r13)
            goto L62
        L5a:
            kotlin.o r10 = new kotlin.o
            java.lang.String r11 = "null cannot be cast to non-null type T"
            r10.<init>(r11)
            throw r10
        L62:
            if (r13 != 0) goto L70
        L64:
            if (r10 == 0) goto L8f
            r13 = r10
            com.dianping.shield.dynamic.model.view.HoverViewInfo r13 = (com.dianping.shield.dynamic.model.view.HoverViewInfo) r13
            r14 = r9
            com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff r14 = (com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff) r14
            com.dianping.shield.dynamic.agent.node.DynamicDiff r13 = r14.createHoverViewItem(r13)
        L70:
            if (r10 == 0) goto L87
            r14 = 0
            r13.diff(r10, r12, r14, r14)
            if (r13 == 0) goto L7f
            com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem r13 = (com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem) r13
            com.dianping.shield.node.useritem.FloatViewItem r13 = (com.dianping.shield.node.useritem.FloatViewItem) r13
            r11.floatViewItem = r13
            return
        L7f:
            kotlin.o r10 = new kotlin.o
            java.lang.String r11 = "null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem"
            r10.<init>(r11)
            throw r10
        L87:
            kotlin.o r10 = new kotlin.o
            java.lang.String r11 = "null cannot be cast to non-null type T"
            r10.<init>(r11)
            throw r10
        L8f:
            kotlin.o r10 = new kotlin.o
            java.lang.String r11 = "null cannot be cast to non-null type T"
            r10.<init>(r11)
            throw r10
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff.diffChildren(com.dianping.shield.dynamic.model.cell.CellInfo$BaseCellInfo, com.dianping.shield.node.useritem.RowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    private final DynamicDiff<HoverViewInfo> mappingFuc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef897f32deab1bf583c0031d93332253", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef897f32deab1bf583c0031d93332253");
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        FloatViewItem floatViewItem = v.floatViewItem;
        if (!(floatViewItem instanceof DynamicFloatViewItem)) {
            floatViewItem = null;
        }
        DynamicFloatViewItem dynamicFloatViewItem = (DynamicFloatViewItem) floatViewItem;
        if (dynamicFloatViewItem == null || !h.a((Object) dynamicFloatViewItem.getId(), (Object) str)) {
            return null;
        }
        V v2 = this.dynamicRowItem;
        if (v2 == null) {
            h.a("dynamicRowItem");
        }
        FloatViewItem floatViewItem2 = v2.floatViewItem;
        if (floatViewItem2 != null) {
            return (DynamicDiff) floatViewItem2;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.HoverViewInfo>");
    }

    private final DynamicDiff<HoverViewInfo> createHoverViewItem(HoverViewInfo hoverViewInfo) {
        Object[] objArr = {hoverViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b676a3aa61338460131d1b653b631a3c", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b676a3aa61338460131d1b653b631a3c") : new DynamicFloatViewItem(new HoverViewInfoDiff(this.hostChassis));
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb6edc35382d3fe53ac3eb848630c328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb6edc35382d3fe53ac3eb848630c328");
            return;
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        v.clear();
    }

    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f26e011858b05c697b0e539b024dc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f26e011858b05c697b0e539b024dc9d");
            return;
        }
        h.b(t, "info");
        updateDividerProps(t);
    }

    public void bindItems(@Nullable V v) {
        FloatViewItem floatViewItem;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c594fd8da9ead984a4902a021a7bd6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c594fd8da9ead984a4902a021a7bd6c");
        } else if (v == null || (floatViewItem = v.floatViewItem) == null) {
        } else {
            V v2 = this.dynamicRowItem;
            if (v2 == null) {
                h.a("dynamicRowItem");
            }
            v2.floatViewItem = floatViewItem;
            V v3 = this.dynamicRowItem;
            if (v3 == null) {
                h.a("dynamicRowItem");
            }
            if (v3.floatViewItem instanceof DynamicDiff) {
                V v4 = this.dynamicRowItem;
                if (v4 == null) {
                    h.a("dynamicRowItem");
                }
                FloatViewItem floatViewItem2 = v4.floatViewItem;
                if (floatViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) floatViewItem2).onComputingComplete();
            }
            v.floatViewItem = null;
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1d37c00bf5662f68e5d39cc8788fc19", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1d37c00bf5662f68e5d39cc8788fc19");
        }
        h.b(str, "identifier");
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        FloatViewItem floatViewItem = v.floatViewItem;
        if (!(floatViewItem instanceof DynamicViewItemsHolderInterface)) {
            floatViewItem = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) floatViewItem;
        if (dynamicViewItemsHolderInterface != null) {
            return dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str);
        }
        return null;
    }

    private final void prepareDiff(CellInfo.BaseCellInfo baseCellInfo) {
        Object[] objArr = {baseCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43309c8e6582257cdff49332fd2ee004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43309c8e6582257cdff49332fd2ee004");
            return;
        }
        setMarginInfo(baseCellInfo.getMarginInfo());
        Boolean autoMargin = baseCellInfo.getAutoMargin();
        setAutoMargin(Boolean.valueOf(autoMargin != null ? autoMargin.booleanValue() : false));
        if ((baseCellInfo.getCardStyle() == null || baseCellInfo.getCardType() == 0) && (this.cardStyle == null || this.cardType == 0)) {
            this.needDrawCard = false;
        } else if ((!h.a(baseCellInfo.getCardStyle(), this.cardStyle)) || this.cardType != baseCellInfo.getCardType()) {
            this.needDrawCard = true;
        }
        this.cardStyle = baseCellInfo.getCardStyle();
        this.cardType = baseCellInfo.getCardType();
    }

    private final void updateDividerProps(CellInfo.BaseCellInfo baseCellInfo) {
        Object[] objArr = {baseCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00857108373471c06f083fb9165cfa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00857108373471c06f083fb9165cfa22");
            return;
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        v.dividerStyle = DividerUtil.Companion.getDividerStyle(this.hostChassis.getHostContext(), baseCellInfo.getSeparatorLineInfo(), baseCellInfo.getSeparatorLineStyle());
        V v2 = this.dynamicRowItem;
        if (v2 == null) {
            h.a("dynamicRowItem");
        }
        v2.cardConfigInfo = CardUtil.getCardConfigInfo(this.hostChassis.getHostContext(), baseCellInfo.getCardStyle(), baseCellInfo.getCardType(), this.needDrawCard);
        V v3 = this.dynamicRowItem;
        if (v3 == null) {
            h.a("dynamicRowItem");
        }
        Boolean frozenExclude = baseCellInfo.getFrozenExclude();
        v3.frozenExclude = frozenExclude != null ? frozenExclude.booleanValue() : false;
    }
}
