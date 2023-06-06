package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.IndexPath;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfoProps;", "()V", DMKeys.KEY_TAB_ANCHOR_INDEX_PATH, "Lcom/dianping/shield/entity/IndexPath;", "getAnchorIndexPath", "()Lcom/dianping/shield/entity/IndexPath;", "setAnchorIndexPath", "(Lcom/dianping/shield/entity/IndexPath;)V", "onTabSelectedStatusChanged", "", "getOnTabSelectedStatusChanged", "()Ljava/lang/String;", "setOnTabSelectedStatusChanged", "(Ljava/lang/String;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabViewInfo extends ViewInfo implements TabViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private IndexPath anchorIndexPath;
    @Nullable
    private String onTabSelectedStatusChanged;

    @Override // com.dianping.shield.dynamic.model.view.TabViewInfoProps
    @Nullable
    public final String getOnTabSelectedStatusChanged() {
        return this.onTabSelectedStatusChanged;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabViewInfoProps
    public final void setOnTabSelectedStatusChanged(@Nullable String str) {
        this.onTabSelectedStatusChanged = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabViewInfoProps
    @Nullable
    public final IndexPath getAnchorIndexPath() {
        return this.anchorIndexPath;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabViewInfoProps
    public final void setAnchorIndexPath(@Nullable IndexPath indexPath) {
        this.anchorIndexPath = indexPath;
    }
}
