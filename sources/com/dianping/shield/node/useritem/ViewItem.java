package com.dianping.shield.node.useritem;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ViewAttachDetachInterface;
import com.dianping.shield.node.cellnode.ViewItemMoveStatusEventListener;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.itemcallbacks.ViewRecycledCallback;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
import com.dianping.shield.node.processor.ExposeMoveStatusEventInfoHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicLong viewItemId = new AtomicLong();
    public ArrayList<ViewAttachDetachInterface> attachDetachInterfaceArrayList;
    public ViewClickCallbackWithData clickCallback;
    public Object data;
    public ExposeInfo exposeInfo;
    private ViewItemMoveStatusEventListener exposeListener;
    public boolean frozenExclude;
    public ViewLongClickCallbackWithData longClickCallback;
    public ArrayList<MoveStatusEventListener<ViewItem>> moveStatusEventListeners;
    public MoveStatusInfo moveStatusInfo;
    public String stableid;
    private int vHash;
    private String vId;
    public Integer viewIndex;
    public ViewPaintingCallback viewPaintingCallback;
    public ViewRecycledCallback viewRecycledCallback;
    public ViewStatusWithPrefetchListener viewStatusWithPrefetchListener;
    public String viewType;

    public ViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f08efeb99a3e531180e474bfec9482ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f08efeb99a3e531180e474bfec9482ff");
            return;
        }
        this.viewIndex = -3;
        this.frozenExclude = false;
        this.vId = "vId_" + viewItemId.getAndIncrement();
        this.vHash = this.vId.hashCode();
    }

    public ViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c32718ee0e07fc2e4d5261ba28b308e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c32718ee0e07fc2e4d5261ba28b308e1");
            return;
        }
        this.viewIndex = -3;
        this.frozenExclude = false;
        if (str != null) {
            this.vId = str;
        } else {
            this.vId = "vId_" + viewItemId.getAndIncrement();
        }
        this.vHash = this.vId.hashCode();
    }

    public static ViewItem simpleViewItem(ViewPaintingCallback viewPaintingCallback) {
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7c4147b5ae2de18eafd9b2e8ee7757b", RobustBitConfig.DEFAULT_VALUE) ? (ViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7c4147b5ae2de18eafd9b2e8ee7757b") : new ViewItem().setViewPaintingCallback(viewPaintingCallback);
    }

    public static ViewItem simpleViewItem(ViewPaintingCallback viewPaintingCallback, String str) {
        Object[] objArr = {viewPaintingCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76b0228cc3ae68183dbb4ac4fea74f2b", RobustBitConfig.DEFAULT_VALUE) ? (ViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76b0228cc3ae68183dbb4ac4fea74f2b") : new ViewItem().setViewPaintingCallback(viewPaintingCallback).setViewType(str);
    }

    public static ViewItem simpleViewItem(ViewPaintingCallback viewPaintingCallback, String str, Object obj) {
        Object[] objArr = {viewPaintingCallback, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7611e4682c8787f6b6ed8a9996b06b28", RobustBitConfig.DEFAULT_VALUE) ? (ViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7611e4682c8787f6b6ed8a9996b06b28") : new ViewItem().setViewPaintingCallback(viewPaintingCallback).setViewType(str).setData(obj);
    }

    private void initExposeListener(@Nullable ShieldRow shieldRow) {
        Object[] objArr = {shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a65b2891d872cd77db203152f95df15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a65b2891d872cd77db203152f95df15e");
        } else if (this.exposeListener == null) {
            this.exposeListener = new ViewItemMoveStatusEventListener(new ExposeMoveStatusEventInfoHolder(), this.exposeInfo, new Handler(Looper.getMainLooper()), shieldRow);
        } else {
            this.exposeListener.setShieldRow(shieldRow);
        }
    }

    public void onViewItemAppearance(AppearanceDispatchData<ViewItem> appearanceDispatchData, @Nullable ShieldRow shieldRow) {
        AppearanceEvent[] parseFromAttachStatus;
        Object[] objArr = {appearanceDispatchData, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33822f5da63b22359f29a16152e2d5c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33822f5da63b22359f29a16152e2d5c0");
        } else if (this.moveStatusInfo != null && this.moveStatusInfo.moveStatusCallback != null && (parseFromAttachStatus = AppearanceEvent.parseFromAttachStatus(appearanceDispatchData.oldStatus, appearanceDispatchData.newStatus)) != null) {
            int length = parseFromAttachStatus.length;
            for (int i = 0; i < length; i++) {
                AppearanceEvent appearanceEvent = parseFromAttachStatus[i];
                if (appearanceEvent == AppearanceEvent.PARTLY_APPEAR || appearanceEvent == AppearanceEvent.FULLY_APPEAR) {
                    this.moveStatusInfo.moveStatusCallback.onAppear(appearanceEvent == AppearanceEvent.PARTLY_APPEAR ? ExposeScope.PX : ExposeScope.COMPLETE, appearanceDispatchData.scrollDirection, this.moveStatusInfo.data, getNodePath(shieldRow), appearanceDispatchData.viewExtraInfo);
                } else {
                    this.moveStatusInfo.moveStatusCallback.onDisappear(appearanceEvent == AppearanceEvent.PARTLY_DISAPPEAR ? ExposeScope.PX : ExposeScope.COMPLETE, appearanceDispatchData.scrollDirection, this.moveStatusInfo.data, getNodePath(shieldRow), appearanceDispatchData.viewExtraInfo);
                }
            }
        }
    }

    public void onViewItemExpose(AppearanceDispatchData<ViewItem> appearanceDispatchData, @Nullable ShieldRow shieldRow) {
        Object[] objArr = {appearanceDispatchData, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ee0dddda77a5d95924a16a92cf4a6e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ee0dddda77a5d95924a16a92cf4a6e8");
        } else if (this.exposeInfo != null) {
            initExposeListener(shieldRow);
            AppearanceEvent[] parseFromAttachStatus = AppearanceEvent.parseFromAttachStatus(appearanceDispatchData.oldStatus, appearanceDispatchData.newStatus);
            if (parseFromAttachStatus != null) {
                for (AppearanceEvent appearanceEvent : parseFromAttachStatus) {
                    if (appearanceEvent == AppearanceEvent.PARTLY_APPEAR || appearanceEvent == AppearanceEvent.FULLY_APPEAR) {
                        this.exposeListener.onAppeared(appearanceEvent, appearanceDispatchData);
                    } else {
                        this.exposeListener.onDisappeared(appearanceEvent, appearanceDispatchData);
                    }
                }
            }
        }
    }

    public NodePath getNodePath(@Nullable ShieldRow shieldRow) {
        Object[] objArr = {shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98c1f8f35372f3eed33758564661918d", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodePath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98c1f8f35372f3eed33758564661918d");
        }
        NodePath nodePath = new NodePath();
        if (shieldRow != null && shieldRow.getPath() != null) {
            nodePath.section = shieldRow.getPath().section;
            nodePath.row = shieldRow.getPath().row;
            nodePath.cell = shieldRow.getPath().cell;
            nodePath.group = shieldRow.getPath().group;
            nodePath.cellType = shieldRow.getPath().cellType;
        }
        nodePath.indexPath = new IndexPath();
        if (shieldRow != null && shieldRow.getPath() != null && shieldRow.getPath().indexPath != null) {
            nodePath.indexPath.row = shieldRow.getPath().indexPath.row;
            nodePath.indexPath.section = shieldRow.getPath().indexPath.section;
        }
        nodePath.indexPath.index = this.viewIndex.intValue();
        return nodePath;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1f6f6d6ed66782b09af9e04036ff030", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1f6f6d6ed66782b09af9e04036ff030")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewItem viewItem = (ViewItem) obj;
        return this.vId != null ? this.vId.equals(viewItem.vId) : viewItem.vId == null;
    }

    public int hashCode() {
        return this.vHash;
    }

    public ViewItem setViewType(String str) {
        this.viewType = str;
        return this;
    }

    public ViewItem setStableid(String str) {
        this.stableid = str;
        return this;
    }

    public ViewItem setData(Object obj) {
        this.data = obj;
        return this;
    }

    public ViewItem setViewPaintingCallback(ViewPaintingCallback viewPaintingCallback) {
        this.viewPaintingCallback = viewPaintingCallback;
        return this;
    }

    public ViewItem setClickCallback(ViewClickCallbackWithData viewClickCallbackWithData) {
        this.clickCallback = viewClickCallbackWithData;
        return this;
    }

    public ViewItem setLongClickCallback(ViewLongClickCallbackWithData viewLongClickCallbackWithData) {
        this.longClickCallback = viewLongClickCallbackWithData;
        return this;
    }

    public ViewItem setExposeInfo(ExposeInfo exposeInfo) {
        this.exposeInfo = exposeInfo;
        return this;
    }

    public ViewItem setMoveStatusInfo(MoveStatusInfo moveStatusInfo) {
        this.moveStatusInfo = moveStatusInfo;
        return this;
    }

    @Nullable
    public ShieldViewHolder directPaintView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "172dae55f0ad9bd37a6c17da2433ed9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "172dae55f0ad9bd37a6c17da2433ed9c");
        }
        if (this.viewPaintingCallback != null) {
            ShieldViewHolder createViewHolder = this.viewPaintingCallback.createViewHolder(context, null, this.viewType);
            this.viewPaintingCallback.bindViewHolder(createViewHolder, this.data, null);
            return createViewHolder;
        }
        return null;
    }
}
