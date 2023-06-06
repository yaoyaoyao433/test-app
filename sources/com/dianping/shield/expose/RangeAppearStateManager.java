package com.dianping.shield.expose;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0013\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dR6\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/dianping/shield/expose/RangeAppearStateManager;", "E", "", "entrySetHolder", "Lcom/dianping/shield/expose/EntrySetHolder;", "(Lcom/dianping/shield/expose/EntrySetHolder;)V", "entryEventMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "Lkotlin/collections/HashMap;", "getEntryEventMap", "()Ljava/util/HashMap;", "setEntryEventMap", "(Ljava/util/HashMap;)V", "oldAttachStatus", "getOldAttachStatus", "()Lcom/dianping/shield/node/cellnode/AttachStatus;", "setOldAttachStatus", "(Lcom/dianping/shield/node/cellnode/AttachStatus;)V", "checkSetState", "", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "findCurrentStatus", "entry", "(Ljava/lang/Object;)Lcom/dianping/shield/node/cellnode/AttachStatus;", "getNewStatus", "onEntryAttachStatusChanged", "data", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RangeAppearStateManager<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private HashMap<E, AttachStatus> entryEventMap;
    private final EntrySetHolder<E> entrySetHolder;
    @NotNull
    private AttachStatus oldAttachStatus;

    public RangeAppearStateManager(@NotNull EntrySetHolder<E> entrySetHolder) {
        h.b(entrySetHolder, "entrySetHolder");
        Object[] objArr = {entrySetHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ea846cef8e043a80b54279fc28a473", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ea846cef8e043a80b54279fc28a473");
            return;
        }
        this.entrySetHolder = entrySetHolder;
        this.entryEventMap = new HashMap<>();
        this.oldAttachStatus = AttachStatus.DETACHED;
    }

    @NotNull
    public final HashMap<E, AttachStatus> getEntryEventMap() {
        return this.entryEventMap;
    }

    public final void setEntryEventMap(@NotNull HashMap<E, AttachStatus> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94fc05fbdf5f3f4ea2f540873aa56d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94fc05fbdf5f3f4ea2f540873aa56d02");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.entryEventMap = hashMap;
    }

    @NotNull
    public final AttachStatus getOldAttachStatus() {
        return this.oldAttachStatus;
    }

    public final void setOldAttachStatus(@NotNull AttachStatus attachStatus) {
        Object[] objArr = {attachStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2496529c2b5bd240a184f8c0748420fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2496529c2b5bd240a184f8c0748420fc");
            return;
        }
        h.b(attachStatus, "<set-?>");
        this.oldAttachStatus = attachStatus;
    }

    public final void onEntryAttachStatusChanged(@NotNull AppearanceDispatchData<E> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d69c319dcb459969c8cc714a0e59e370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d69c319dcb459969c8cc714a0e59e370");
            return;
        }
        h.b(appearanceDispatchData, "data");
        if (appearanceDispatchData.newStatus == AttachStatus.DETACHED) {
            this.entryEventMap.remove(appearanceDispatchData.element);
        } else {
            this.entryEventMap.put(appearanceDispatchData.element, appearanceDispatchData.newStatus);
        }
        checkSetState(appearanceDispatchData.scrollDirection);
    }

    private final void checkSetState(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ff88b0ba096fed24204bfcdd5617b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ff88b0ba096fed24204bfcdd5617b61");
            return;
        }
        AttachStatus newStatus = getNewStatus();
        if (newStatus != this.oldAttachStatus) {
            AttachStatus attachStatus = this.oldAttachStatus;
            this.oldAttachStatus = newStatus;
            AppearanceDispatchData<EntrySetHolder<E>> appearanceDispatchData = new AppearanceDispatchData<>(-1, this.entrySetHolder, attachStatus, newStatus, scrollDirection == null ? ScrollDirection.STATIC : scrollDirection, null);
            this.entrySetHolder.onAttachStateChanged(appearanceDispatchData);
            AppearanceEvent[] parseFromAttachStatus = AppearanceEvent.parseFromAttachStatus(attachStatus, newStatus);
            if (parseFromAttachStatus != null) {
                for (AppearanceEvent appearanceEvent : parseFromAttachStatus) {
                    this.entrySetHolder.onAppearanceEvent(appearanceEvent, appearanceDispatchData);
                }
            }
        }
    }

    private final AttachStatus getNewStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "285cd4fb2c2f072efd0af9cb82ddc3ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (AttachStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "285cd4fb2c2f072efd0af9cb82ddc3ac");
        }
        if (this.entryEventMap.isEmpty()) {
            return AttachStatus.DETACHED;
        }
        if (this.entrySetHolder.getEntryCount() > this.entryEventMap.size()) {
            return AttachStatus.PARTLY_ATTACHED;
        }
        AttachStatus attachStatus = null;
        int entryCount = this.entrySetHolder.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            AttachStatus attachStatus2 = this.entryEventMap.get(this.entrySetHolder.getEntry(i));
            if (attachStatus2 == null) {
                attachStatus2 = AttachStatus.DETACHED;
            }
            if (attachStatus2 == AttachStatus.PARTLY_ATTACHED) {
                return AttachStatus.PARTLY_ATTACHED;
            }
            if (attachStatus == null) {
                attachStatus = attachStatus2;
            }
            if (attachStatus != attachStatus2) {
                return AttachStatus.PARTLY_ATTACHED;
            }
        }
        return attachStatus == null ? AttachStatus.DETACHED : attachStatus;
    }

    @NotNull
    public final AttachStatus findCurrentStatus(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0fdf64c64cfb5e383a46eebdc069ae0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AttachStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0fdf64c64cfb5e383a46eebdc069ae0");
        }
        AttachStatus attachStatus = this.entryEventMap.get(e);
        return attachStatus == null ? AttachStatus.DETACHED : attachStatus;
    }
}
