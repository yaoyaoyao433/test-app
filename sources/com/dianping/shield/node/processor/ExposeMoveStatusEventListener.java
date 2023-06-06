package com.dianping.shield.node.processor;

import android.os.Handler;
import com.dianping.shield.expose.MoveStatusExposeEngine;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/dianping/shield/node/processor/ExposeMoveStatusEventListener;", "T", "Lcom/dianping/shield/node/cellnode/MoveStatusEventListener;", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "exposeInfo", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "handler", "Landroid/os/Handler;", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;Lcom/dianping/shield/node/useritem/ExposeInfo;Landroid/os/Handler;)V", "currentDelayRunnable", "Ljava/lang/Runnable;", "getCurrentDelayRunnable", "()Ljava/lang/Runnable;", "setCurrentDelayRunnable", "(Ljava/lang/Runnable;)V", "moveStatusExposeEngine", "Lcom/dianping/shield/expose/MoveStatusExposeEngine;", "getMoveStatusExposeEngine", "()Lcom/dianping/shield/expose/MoveStatusExposeEngine;", "setMoveStatusExposeEngine", "(Lcom/dianping/shield/expose/MoveStatusExposeEngine;)V", "onAppeared", "", "appearEvent", "Lcom/dianping/shield/node/cellnode/AppearanceEvent;", "dispatchData", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "onDisappeared", "reset", "item", "(Ljava/lang/Object;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ExposeMoveStatusEventListener<T> implements MoveStatusEventListener<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Runnable currentDelayRunnable;
    @NotNull
    private MoveStatusExposeEngine<T> moveStatusExposeEngine;

    public ExposeMoveStatusEventListener(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder, @NotNull ExposeInfo exposeInfo, @NotNull Handler handler) {
        h.b(exposeMoveStatusEventInfoHolder, "infoHolder");
        h.b(exposeInfo, "exposeInfo");
        h.b(handler, "handler");
        Object[] objArr = {exposeMoveStatusEventInfoHolder, exposeInfo, handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea122c784b875e6ab6e29699388544bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea122c784b875e6ab6e29699388544bd");
        } else {
            this.moveStatusExposeEngine = new MoveStatusExposeEngine<>(exposeMoveStatusEventInfoHolder, handler, exposeInfo);
        }
    }

    @NotNull
    public final MoveStatusExposeEngine<T> getMoveStatusExposeEngine() {
        return this.moveStatusExposeEngine;
    }

    public final void setMoveStatusExposeEngine(@NotNull MoveStatusExposeEngine<T> moveStatusExposeEngine) {
        Object[] objArr = {moveStatusExposeEngine};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7f5c1c5fd7c7406685e2937a6f2049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7f5c1c5fd7c7406685e2937a6f2049");
            return;
        }
        h.b(moveStatusExposeEngine, "<set-?>");
        this.moveStatusExposeEngine = moveStatusExposeEngine;
    }

    @Nullable
    public final Runnable getCurrentDelayRunnable() {
        return this.currentDelayRunnable;
    }

    public final void setCurrentDelayRunnable(@Nullable Runnable runnable) {
        this.currentDelayRunnable = runnable;
    }

    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
    public void reset(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad34e69d6753ad2370813b61c82c714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad34e69d6753ad2370813b61c82c714");
        } else {
            this.moveStatusExposeEngine.reset(t);
        }
    }

    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
    public void onAppeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<T> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e03dddbcc0282958870f1e3ccc9880f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e03dddbcc0282958870f1e3ccc9880f0");
            return;
        }
        h.b(appearanceEvent, "appearEvent");
        h.b(appearanceDispatchData, "dispatchData");
        this.moveStatusExposeEngine.onAppeared(appearanceDispatchData.element, appearanceEvent, appearanceDispatchData);
    }

    @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
    public void onDisappeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<T> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab5e5712d79acdef0b08e995df30e890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab5e5712d79acdef0b08e995df30e890");
            return;
        }
        h.b(appearanceEvent, "appearEvent");
        h.b(appearanceDispatchData, "dispatchData");
        this.moveStatusExposeEngine.onDisappeared(appearanceDispatchData.element, appearanceEvent);
    }
}
