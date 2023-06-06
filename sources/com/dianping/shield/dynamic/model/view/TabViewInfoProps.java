package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.IndexPath;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/TabViewInfoProps;", "", DMKeys.KEY_TAB_ANCHOR_INDEX_PATH, "Lcom/dianping/shield/entity/IndexPath;", "getAnchorIndexPath", "()Lcom/dianping/shield/entity/IndexPath;", "setAnchorIndexPath", "(Lcom/dianping/shield/entity/IndexPath;)V", "onTabSelectedStatusChanged", "", "getOnTabSelectedStatusChanged", "()Ljava/lang/String;", "setOnTabSelectedStatusChanged", "(Ljava/lang/String;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface TabViewInfoProps {
    @Nullable
    IndexPath getAnchorIndexPath();

    @Nullable
    String getOnTabSelectedStatusChanged();

    void setAnchorIndexPath(@Nullable IndexPath indexPath);

    void setOnTabSelectedStatusChanged(@Nullable String str);
}
