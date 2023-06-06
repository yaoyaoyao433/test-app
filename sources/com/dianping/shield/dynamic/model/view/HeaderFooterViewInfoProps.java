package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfoProps;", "", DMKeys.KEY_AUTO_MARGIN, "", "getAutoMargin", "()Ljava/lang/Boolean;", "setAutoMargin", "(Ljava/lang/Boolean;)V", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface HeaderFooterViewInfoProps {
    @Nullable
    Boolean getAutoMargin();

    @Nullable
    MarginInfo getMarginInfo();

    void setAutoMargin(@Nullable Boolean bool);

    void setMarginInfo(@Nullable MarginInfo marginInfo);
}
