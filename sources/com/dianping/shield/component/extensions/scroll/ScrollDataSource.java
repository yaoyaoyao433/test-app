package com.dianping.shield.component.extensions.scroll;

import android.view.View;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.common.ContainerDataSource;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ScrollDataSource;", "Lcom/dianping/shield/component/extensions/common/ContainerDataSource;", "()V", "childViewHolderFilter", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "Lkotlin/collections/HashMap;", "childViewHolderHashMap", "commonContainerRow", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "getBouncyView", "Landroid/view/View;", "viewItem", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollDataSource extends ContainerDataSource {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public final View getBouncyView(@Nullable ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "698c3eb95268904317c5dc97465674de", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "698c3eb95268904317c5dc97465674de");
        }
        if (viewItem != null) {
            return getBandedViewFromViewItem(getChildViewHolderHashMap(), viewItem, getContext(), getParentView(), viewItem.getNodePath(getShieldRow()), viewItem.data, viewItem.viewType);
        }
        return null;
    }

    @Override // com.dianping.shield.component.extensions.common.ContainerDataSource
    @NotNull
    public final HashMap<ViewItem, ShieldViewHolder> childViewHolderFilter(@NotNull HashMap<ViewItem, ShieldViewHolder> hashMap, @Nullable CommonContainerRow commonContainerRow) {
        ArrayList<ViewItem> arrayList;
        ShieldViewHolder shieldViewHolder;
        ShieldViewHolder shieldViewHolder2;
        Object[] objArr = {hashMap, commonContainerRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6050bf4d1fa30520c7bd3e4c6daf52f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6050bf4d1fa30520c7bd3e4c6daf52f4");
        }
        h.b(hashMap, "childViewHolderHashMap");
        HashMap<ViewItem, ShieldViewHolder> hashMap2 = new HashMap<>();
        boolean z = commonContainerRow instanceof ScrollRow;
        ScrollRow scrollRow = (ScrollRow) (!z ? null : commonContainerRow);
        ViewItem viewItem = scrollRow != null ? scrollRow.normalAttachView : null;
        ScrollRow scrollRow2 = (ScrollRow) (!z ? null : commonContainerRow);
        ViewItem viewItem2 = scrollRow2 != null ? scrollRow2.triggeredAttachView : null;
        if (viewItem != null && (shieldViewHolder2 = hashMap.get(viewItem)) != null) {
            h.a((Object) shieldViewHolder2, AdvanceSetting.NETWORK_TYPE);
            hashMap2.put(viewItem, shieldViewHolder2);
        }
        if (viewItem2 != null && (shieldViewHolder = hashMap.get(viewItem2)) != null) {
            h.a((Object) shieldViewHolder, AdvanceSetting.NETWORK_TYPE);
            hashMap2.put(viewItem2, shieldViewHolder);
        }
        if (commonContainerRow != null && (arrayList = commonContainerRow.viewItems) != null) {
            for (ViewItem viewItem3 : arrayList) {
                ShieldViewHolder shieldViewHolder3 = hashMap.get(viewItem3);
                if (shieldViewHolder3 != null) {
                    h.a((Object) shieldViewHolder3, AdvanceSetting.NETWORK_TYPE);
                    hashMap2.put(viewItem3, shieldViewHolder3);
                }
            }
        }
        return hashMap2;
    }
}
