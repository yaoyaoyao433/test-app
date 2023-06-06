package com.dianping.shield.sectionrecycler.layoutmanager;

import android.support.v7.widget.RecyclerView;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SmoothScrollEventHelper extends RecyclerView.k {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean hasScrollingRun;
    protected boolean hasScrollingStopped;
    protected boolean hasStateChanged;
    protected ArrayList<a> listeners;
    protected RecyclerView recyclerView;

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void setListeners(ArrayList<a> arrayList) {
        this.listeners = arrayList;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21b554397a7303672209d8c1c1161038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21b554397a7303672209d8c1c1161038");
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        this.hasStateChanged = i == 2;
        if (i == 2 || !this.hasScrollingStopped) {
            return;
        }
        recyclerView.removeOnScrollListener(this);
        resetSignals();
        dispatchStopScrollEvent();
    }

    public void resetSignals() {
        this.hasStateChanged = false;
        this.hasScrollingRun = false;
        this.hasScrollingStopped = false;
    }

    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "134bf6265f8a093c9e6220e8ef293cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "134bf6265f8a093c9e6220e8ef293cea");
        } else {
            dispatchStartScrollEvent();
        }
    }

    public void onScrolling() {
        this.hasScrollingRun = true;
    }

    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "572929188049080b4ec8b5cb16ce46ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "572929188049080b4ec8b5cb16ce46ac");
            return;
        }
        this.hasScrollingStopped = true;
        if (this.hasScrollingRun || this.hasStateChanged) {
            return;
        }
        resetSignals();
        if (this.recyclerView != null) {
            this.recyclerView.removeOnScrollListener(this);
        }
        dispatchStopScrollEvent();
    }

    public void dispatchStartScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c133b6af4c816eb99aec28d6249415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c133b6af4c816eb99aec28d6249415");
        } else if (this.listeners == null || this.listeners.isEmpty()) {
        } else {
            Iterator<a> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void dispatchStopScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0323093ef4c7929b2536fae68e136cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0323093ef4c7929b2536fae68e136cf1");
        } else if (this.listeners == null || this.listeners.isEmpty()) {
        } else {
            Iterator<a> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
