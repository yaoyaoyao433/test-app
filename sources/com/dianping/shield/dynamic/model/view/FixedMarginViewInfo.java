package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfoProps;", "()V", DMKeys.KEY_FIXED_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getFixedMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setFixedMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class FixedMarginViewInfo extends ViewInfo implements FixedMarginViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private MarginInfo fixedMarginInfo;

    @Override // com.dianping.shield.dynamic.model.view.FixedMarginViewInfoProps
    @Nullable
    public MarginInfo getFixedMarginInfo() {
        return this.fixedMarginInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.FixedMarginViewInfoProps
    public void setFixedMarginInfo(@Nullable MarginInfo marginInfo) {
        this.fixedMarginInfo = marginInfo;
    }
}
