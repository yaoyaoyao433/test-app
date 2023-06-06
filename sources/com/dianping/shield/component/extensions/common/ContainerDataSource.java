package com.dianping.shield.component.extensions.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JR\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016Jh\u0010&\u001a\u0004\u0018\u00010'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010*\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010.\u001a\u0004\u0018\u00010/J\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020'2\u0006\u00103\u001a\u000201J\u0010\u00104\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u000201R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ContainerDataSource;", "", "()V", "childViewHolderHashMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "Lkotlin/collections/HashMap;", "getChildViewHolderHashMap", "()Ljava/util/HashMap;", "setChildViewHolderHashMap", "(Ljava/util/HashMap;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isLoop", "", "()Z", "setLoop", "(Z)V", "parentView", "Landroid/view/ViewGroup;", "getParentView", "()Landroid/view/ViewGroup;", "setParentView", "(Landroid/view/ViewGroup;)V", "value", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "shieldRow", "getShieldRow", "()Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "setShieldRow", "(Lcom/dianping/shield/component/extensions/common/CommonContainerRow;)V", "childViewHolderFilter", "commonContainerRow", "getBandedViewFromViewItem", "Landroid/view/View;", "reuseViewHolderMap", "viewItem", "parent", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "data", DMKeys.KEY_VIEW_TYPE, "", "getSize", "", "getView", "index", "getViewItem", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ContainerDataSource {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private HashMap<ViewItem, ShieldViewHolder> childViewHolderHashMap;
    @Nullable
    private Context context;
    private boolean isLoop;
    @Nullable
    private ViewGroup parentView;
    @Nullable
    private CommonContainerRow shieldRow;

    public ContainerDataSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f44aae3da83f28bd1d3714efb6864ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f44aae3da83f28bd1d3714efb6864ac");
        } else {
            this.childViewHolderHashMap = new HashMap<>();
        }
    }

    @NotNull
    public final HashMap<ViewItem, ShieldViewHolder> getChildViewHolderHashMap() {
        return this.childViewHolderHashMap;
    }

    public final void setChildViewHolderHashMap(@NotNull HashMap<ViewItem, ShieldViewHolder> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3431fc3764155be55e09daa5d07a778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3431fc3764155be55e09daa5d07a778");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.childViewHolderHashMap = hashMap;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    @Nullable
    public final CommonContainerRow getShieldRow() {
        return this.shieldRow;
    }

    public final void setShieldRow(@Nullable CommonContainerRow commonContainerRow) {
        Object[] objArr = {commonContainerRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0840eaab202f59c8ce0b81e8b7fd4b7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0840eaab202f59c8ce0b81e8b7fd4b7b");
            return;
        }
        this.shieldRow = commonContainerRow;
        this.childViewHolderHashMap = childViewHolderFilter(this.childViewHolderHashMap, this.shieldRow);
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@Nullable Context context) {
        this.context = context;
    }

    @Nullable
    public final ViewGroup getParentView() {
        return this.parentView;
    }

    public final void setParentView(@Nullable ViewGroup viewGroup) {
        this.parentView = viewGroup;
    }

    public final int getSize() {
        ArrayList<ViewItem> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c03db816c701299008e69cc0b3ad2d59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c03db816c701299008e69cc0b3ad2d59")).intValue();
        }
        CommonContainerRow commonContainerRow = this.shieldRow;
        if (commonContainerRow == null || (arrayList = commonContainerRow.viewItems) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @NotNull
    public final View getView(int i) {
        ShieldViewHolder shieldViewHolder;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bce29360fa819fec9e47afc081491cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bce29360fa819fec9e47afc081491cc");
        }
        if (getSize() > i) {
            if (this.isLoop) {
                ViewItem viewItem = getViewItem(i);
                View view = null;
                if (viewItem != null && this.context != null) {
                    ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                    if (viewPaintingCallback != null) {
                        Context context = this.context;
                        if (context == null) {
                            h.a();
                        }
                        shieldViewHolder = viewPaintingCallback.createViewHolder(context, this.parentView, viewItem.viewType);
                    } else {
                        shieldViewHolder = null;
                    }
                    if (shieldViewHolder != null) {
                        ViewPaintingCallback viewPaintingCallback2 = viewItem.viewPaintingCallback;
                        if (viewPaintingCallback2 != null) {
                            viewPaintingCallback2.bindViewHolder(shieldViewHolder, viewItem.data, viewItem.getNodePath(this.shieldRow));
                        }
                        view = shieldViewHolder.itemView;
                    }
                }
                return view == null ? new View(this.context) : view;
            }
            ViewItem viewItem2 = getViewItem(i);
            if (viewItem2 != null) {
                View bandedViewFromViewItem = getBandedViewFromViewItem(this.childViewHolderHashMap, viewItem2, this.context, this.parentView, viewItem2.getNodePath(this.shieldRow), viewItem2.data, viewItem2.viewType);
                return bandedViewFromViewItem == null ? new View(this.context) : bandedViewFromViewItem;
            }
        }
        return new View(this.context);
    }

    @Nullable
    public final ViewItem getViewItem(int i) {
        ArrayList<ViewItem> arrayList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67552f10d02bce94fea6a540b56d144e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67552f10d02bce94fea6a540b56d144e");
        }
        CommonContainerRow commonContainerRow = this.shieldRow;
        if (commonContainerRow == null || (arrayList = commonContainerRow.viewItems) == null) {
            return null;
        }
        return arrayList.get(i);
    }

    @Nullable
    public final View getBandedViewFromViewItem(@NotNull HashMap<ViewItem, ShieldViewHolder> hashMap, @Nullable ViewItem viewItem, @Nullable Context context, @Nullable ViewGroup viewGroup, @Nullable NodePath nodePath, @Nullable Object obj, @Nullable String str) {
        Object[] objArr = {hashMap, viewItem, context, viewGroup, nodePath, obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf175e9c4a9d80f23c6f501f5513e6c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf175e9c4a9d80f23c6f501f5513e6c1");
        }
        h.b(hashMap, "reuseViewHolderMap");
        if (context == null || viewItem == null) {
            return null;
        }
        ShieldViewHolder shieldViewHolder = hashMap.get(viewItem);
        if (shieldViewHolder != null) {
            View view = shieldViewHolder.itemView;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            }
        } else {
            ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
            shieldViewHolder = viewPaintingCallback != null ? viewPaintingCallback.createViewHolder(context, viewGroup, str) : null;
            if (shieldViewHolder == null) {
                h.a();
            }
            hashMap.put(viewItem, shieldViewHolder);
        }
        if (shieldViewHolder != null) {
            ViewPaintingCallback viewPaintingCallback2 = viewItem.viewPaintingCallback;
            if (viewPaintingCallback2 != null) {
                viewPaintingCallback2.bindViewHolder(shieldViewHolder, obj, nodePath);
            }
            return shieldViewHolder.itemView;
        }
        return null;
    }

    @NotNull
    public HashMap<ViewItem, ShieldViewHolder> childViewHolderFilter(@NotNull HashMap<ViewItem, ShieldViewHolder> hashMap, @Nullable CommonContainerRow commonContainerRow) {
        ArrayList<ViewItem> arrayList;
        Object[] objArr = {hashMap, commonContainerRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "942f95f019049fb410c9ceb05364de20", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "942f95f019049fb410c9ceb05364de20");
        }
        h.b(hashMap, "childViewHolderHashMap");
        HashMap<ViewItem, ShieldViewHolder> hashMap2 = new HashMap<>();
        if (commonContainerRow != null && (arrayList = commonContainerRow.viewItems) != null) {
            for (ViewItem viewItem : arrayList) {
                ShieldViewHolder remove = hashMap.remove(viewItem);
                if (remove != null) {
                    h.a((Object) remove, AdvanceSetting.NETWORK_TYPE);
                    hashMap2.put(viewItem, remove);
                }
            }
        }
        return hashMap2;
    }
}
