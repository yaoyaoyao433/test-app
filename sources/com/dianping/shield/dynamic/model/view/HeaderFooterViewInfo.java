package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfoProps;", "()V", DMKeys.KEY_AUTO_MARGIN, "", "getAutoMargin", "()Ljava/lang/Boolean;", "setAutoMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HeaderFooterViewInfo extends ReusableViewInfo implements HeaderFooterViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private MarginInfo marginInfo;

    @Override // com.dianping.shield.dynamic.model.view.HeaderFooterViewInfoProps
    @Nullable
    public final Boolean getAutoMargin() {
        return this.autoMargin;
    }

    @Override // com.dianping.shield.dynamic.model.view.HeaderFooterViewInfoProps
    public final void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.HeaderFooterViewInfoProps
    @Nullable
    public final MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.HeaderFooterViewInfoProps
    public final void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }
}
