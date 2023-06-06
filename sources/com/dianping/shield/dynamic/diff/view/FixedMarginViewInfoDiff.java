package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.FixedMarginViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJI\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/FixedMarginViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/ViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "diffChildren", "", "newInfo", "computingItem", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;Lcom/dianping/shield/node/useritem/ViewItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setComputingSuggestHeight", "(Ljava/lang/Integer;)V", "setComputingSuggestWidth", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class FixedMarginViewInfoDiff<T extends FixedMarginViewInfo, V extends ViewItem> extends ViewInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((FixedMarginViewInfoDiff<T, V>) ((FixedMarginViewInfo) diffableInfo), (FixedMarginViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public /* bridge */ /* synthetic */ void diffChildren(BaseViewInfo baseViewInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((FixedMarginViewInfoDiff<T, V>) ((FixedMarginViewInfo) baseViewInfo), (FixedMarginViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedMarginViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fb2aa8d497ea1a4987f1da00005fb07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fb2aa8d497ea1a4987f1da00005fb07");
        }
    }

    public void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        int i;
        int i2;
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ada36fc82c56389e403565f6786bc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ada36fc82c56389e403565f6786bc77");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        int intValue = num != null ? num.intValue() : 0;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        MarginInfo fixedMarginInfo = t.getFixedMarginInfo();
        if (fixedMarginInfo != null) {
            Integer leftMargin = fixedMarginInfo.getLeftMargin();
            int intValue3 = (leftMargin != null ? leftMargin.intValue() : 0) + 0;
            Integer rightMargin = fixedMarginInfo.getRightMargin();
            i = (rightMargin != null ? rightMargin.intValue() : 0) + intValue3;
        } else {
            i = 0;
        }
        int i3 = intValue - i;
        if (i3 <= 0) {
            i3 = 0;
        }
        MarginInfo fixedMarginInfo2 = t.getFixedMarginInfo();
        if (fixedMarginInfo2 != null) {
            Integer topMargin = fixedMarginInfo2.getTopMargin();
            int intValue4 = (topMargin != null ? topMargin.intValue() : 0) + 0;
            Integer bottomMargin = fixedMarginInfo2.getBottomMargin();
            i2 = (bottomMargin != null ? bottomMargin.intValue() : 0) + intValue4;
        } else {
            i2 = 0;
        }
        int i4 = intValue2 - i2;
        super.diffChildren((FixedMarginViewInfoDiff<T, V>) t, (T) v, arrayList, Integer.valueOf(i3), Integer.valueOf(i4 > 0 ? i4 : 0));
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public void setComputingSuggestHeight(@Nullable Integer num) {
        Integer num2;
        int i;
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "759eff121fcd6ed7bc2162041c802342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "759eff121fcd6ed7bc2162041c802342");
        } else if (num != null) {
            int intValue = num.intValue();
            DynamicModuleViewItemData computingViewItemData = getComputingViewItemData();
            if (computingViewItemData != null) {
                FixedMarginViewInfo fixedMarginViewInfo = (FixedMarginViewInfo) getComputingInfo();
                if (fixedMarginViewInfo != null) {
                    MarginInfo fixedMarginInfo = fixedMarginViewInfo.getFixedMarginInfo();
                    if (fixedMarginInfo != null) {
                        Integer topMargin = fixedMarginInfo.getTopMargin();
                        int intValue2 = (topMargin != null ? topMargin.intValue() : 0) + 0;
                        Integer bottomMargin = fixedMarginInfo.getBottomMargin();
                        i = (bottomMargin != null ? bottomMargin.intValue() : 0) + intValue2;
                    } else {
                        i = 0;
                    }
                    int i2 = intValue - i;
                    if (i2 <= 0) {
                        i2 = 0;
                    }
                    num2 = Integer.valueOf(i2);
                } else {
                    num2 = null;
                }
                computingViewItemData.height = num2.intValue();
            }
        }
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public void setComputingSuggestWidth(@Nullable Integer num) {
        Integer num2;
        int i;
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "204d9010b90af86f4203bcb84ff902b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "204d9010b90af86f4203bcb84ff902b2");
        } else if (num != null) {
            int intValue = num.intValue();
            DynamicModuleViewItemData computingViewItemData = getComputingViewItemData();
            if (computingViewItemData != null) {
                FixedMarginViewInfo fixedMarginViewInfo = (FixedMarginViewInfo) getComputingInfo();
                if (fixedMarginViewInfo != null) {
                    MarginInfo fixedMarginInfo = fixedMarginViewInfo.getFixedMarginInfo();
                    if (fixedMarginInfo != null) {
                        Integer leftMargin = fixedMarginInfo.getLeftMargin();
                        int intValue2 = (leftMargin != null ? leftMargin.intValue() : 0) + 0;
                        Integer rightMargin = fixedMarginInfo.getRightMargin();
                        i = (rightMargin != null ? rightMargin.intValue() : 0) + intValue2;
                    } else {
                        i = 0;
                    }
                    int i2 = intValue - i;
                    if (i2 <= 0) {
                        i2 = 0;
                    }
                    num2 = Integer.valueOf(i2);
                } else {
                    num2 = null;
                }
                computingViewItemData.width = num2.intValue();
            }
        }
    }
}
