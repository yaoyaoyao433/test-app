package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfoProps;", "", DMKeys.KEY_FIXED_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getFixedMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setFixedMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface FixedMarginViewInfoProps {
    @Nullable
    MarginInfo getFixedMarginInfo();

    void setFixedMarginInfo(@Nullable MarginInfo marginInfo);
}
