package com.dianping.shield.expose;

import android.os.Handler;
import android.support.v4.util.Pair;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.processor.ExposeMoveStatusEventInfoHolder;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MoveStatusExposeEngine<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Runnable currentDelayRunnable;
    protected ExposeInfo exposeInfo;
    protected Handler handler;
    protected ExposeMoveStatusEventInfoHolder infoHolder;

    public NodePath getPath(T t) {
        return null;
    }

    public MoveStatusExposeEngine(ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder, Handler handler, ExposeInfo exposeInfo) {
        Object[] objArr = {exposeMoveStatusEventInfoHolder, handler, exposeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8129b9414a34e665537aab89f68e6802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8129b9414a34e665537aab89f68e6802");
            return;
        }
        this.currentDelayRunnable = null;
        this.infoHolder = exposeMoveStatusEventInfoHolder;
        this.handler = handler;
        this.exposeInfo = exposeInfo;
    }

    public void reset(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b8154db904d7c3cf67e2264efbaeece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b8154db904d7c3cf67e2264efbaeece");
            return;
        }
        this.infoHolder.reset(new Pair(t, this.exposeInfo));
        if (this.handler == null || this.currentDelayRunnable == null) {
            return;
        }
        this.handler.removeCallbacks(this.currentDelayRunnable);
        this.currentDelayRunnable = null;
    }

    public void onAppeared(T t, AppearanceEvent appearanceEvent, AppearanceDispatchData<T> appearanceDispatchData) {
        Object[] objArr = {t, appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7fe3edd813c2784041fac09a0fe8cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7fe3edd813c2784041fac09a0fe8cf");
        } else if (this.exposeInfo.agentExposeCallback == null) {
        } else {
            if ((appearanceEvent == AppearanceEvent.PARTLY_APPEAR && this.exposeInfo.exposeScope == ExposeScope.PX) || (appearanceEvent == AppearanceEvent.FULLY_APPEAR && this.exposeInfo.exposeScope == ExposeScope.COMPLETE)) {
                EventRunnable eventRunnable = new EventRunnable(t, appearanceDispatchData);
                if (this.exposeInfo.stayDuration > 0) {
                    this.currentDelayRunnable = eventRunnable;
                }
                this.handler.postDelayed(eventRunnable, this.exposeInfo.stayDuration);
            }
        }
    }

    public void onDisappeared(T t, AppearanceEvent appearanceEvent) {
        Object[] objArr = {t, appearanceEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ca62ab1d787d193a638ad763d1aa2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ca62ab1d787d193a638ad763d1aa2ba");
        } else if (!((appearanceEvent == AppearanceEvent.PARTLY_DISAPPEAR && this.exposeInfo.exposeScope == ExposeScope.COMPLETE) || (appearanceEvent == AppearanceEvent.FULLY_DISAPPEAR && this.exposeInfo.exposeScope == ExposeScope.PX)) || this.currentDelayRunnable == null) {
        } else {
            this.handler.removeCallbacks(this.currentDelayRunnable);
            this.currentDelayRunnable = null;
        }
    }

    public void dispatchExposeEvent(T t, AppearanceDispatchData<T> appearanceDispatchData) {
        Object[] objArr = {t, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c6b761bd25e44e4069bcad80b89acc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c6b761bd25e44e4069bcad80b89acc4");
            return;
        }
        this.currentDelayRunnable = null;
        Pair pair = new Pair(t, this.exposeInfo);
        int count = this.infoHolder.getCount(pair);
        if (this.exposeInfo.maxExposeCount <= count || this.exposeInfo.exposeDuration + this.infoHolder.getLastTimeMillis(pair) > System.currentTimeMillis()) {
            return;
        }
        if (this.exposeInfo.agentExposeCallback != null) {
            this.exposeInfo.agentExposeCallback.onExpose(this.exposeInfo.data, count, getPath(t), appearanceDispatchData.viewExtraInfo);
        }
        this.infoHolder.setCount(pair, count + 1);
        this.infoHolder.setLastTimeMillis(pair, System.currentTimeMillis());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class EventRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public AppearanceDispatchData<T> dispatchData;
        public T item;

        public EventRunnable(T t, AppearanceDispatchData<T> appearanceDispatchData) {
            Object[] objArr = {MoveStatusExposeEngine.this, t, appearanceDispatchData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe89f4d170c120e84b0201c87e7e4c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe89f4d170c120e84b0201c87e7e4c8");
                return;
            }
            this.item = t;
            this.dispatchData = appearanceDispatchData;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5509e90356f69d10e19f1a923dfaa93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5509e90356f69d10e19f1a923dfaa93");
            } else {
                MoveStatusExposeEngine.this.dispatchExposeEvent(this.item, this.dispatchData);
            }
        }
    }
}
