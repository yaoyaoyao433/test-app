package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\b¨\u0006\u0006"}, d2 = {"calInputHeight", "", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "height", "calInputWidth", "width", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class FixedMarginViewInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int calInputWidth(@NotNull FixedMarginViewInfo fixedMarginViewInfo, int i) {
        int i2;
        Object[] objArr = {fixedMarginViewInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5118e7f664fcb20e5c7b58966ac98136", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5118e7f664fcb20e5c7b58966ac98136")).intValue();
        }
        h.b(fixedMarginViewInfo, "receiver$0");
        MarginInfo fixedMarginInfo = fixedMarginViewInfo.getFixedMarginInfo();
        if (fixedMarginInfo != null) {
            Integer leftMargin = fixedMarginInfo.getLeftMargin();
            int intValue = (leftMargin != null ? leftMargin.intValue() : 0) + 0;
            Integer rightMargin = fixedMarginInfo.getRightMargin();
            i2 = (rightMargin != null ? rightMargin.intValue() : 0) + intValue;
        } else {
            i2 = 0;
        }
        int i3 = i - i2;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    public static final int calInputHeight(@NotNull FixedMarginViewInfo fixedMarginViewInfo, int i) {
        int i2;
        Object[] objArr = {fixedMarginViewInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3770c86488e90992645c4d0d2e860da2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3770c86488e90992645c4d0d2e860da2")).intValue();
        }
        h.b(fixedMarginViewInfo, "receiver$0");
        MarginInfo fixedMarginInfo = fixedMarginViewInfo.getFixedMarginInfo();
        if (fixedMarginInfo != null) {
            Integer topMargin = fixedMarginInfo.getTopMargin();
            int intValue = (topMargin != null ? topMargin.intValue() : 0) + 0;
            Integer bottomMargin = fixedMarginInfo.getBottomMargin();
            i2 = (bottomMargin != null ? bottomMargin.intValue() : 0) + intValue;
        } else {
            i2 = 0;
        }
        int i3 = i - i2;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }
}
