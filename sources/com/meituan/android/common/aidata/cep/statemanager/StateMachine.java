package com.meituan.android.common.aidata.cep.statemanager;

import com.meituan.android.common.aidata.cep.statemanager.State;
import com.meituan.android.common.aidata.data.api.IEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StateMachine<T, E> implements State.Notify<T> {
    private static final String TAG = "com.meituan.android.common.aidata.cep.statemanager.StateMachine";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected State<T, E> currentState;
    protected T initStateId;
    protected AtomicBoolean mRunning;
    protected List<State<T, E>> states;

    public StateMachine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34ae29e4f7ac3a1265556de68d26e0a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34ae29e4f7ac3a1265556de68d26e0a4");
            return;
        }
        this.mRunning = new AtomicBoolean(false);
        this.states = new CopyOnWriteArrayList();
    }

    public void setStates(State<T, E> state, State<T, E>... stateArr) {
        Object[] objArr = {state, stateArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8c681846a9b55e531788785ad9f3dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8c681846a9b55e531788785ad9f3dda");
            return;
        }
        this.initStateId = state.id;
        this.states.add(state);
        Collections.addAll(this.states, stateArr);
        for (State<T, E> state2 : this.states) {
            state2.notify = this;
        }
        this.currentState = state;
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "126764ccddd7684ba054246b59462187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "126764ccddd7684ba054246b59462187");
        } else if (this.mRunning.compareAndSet(false, true)) {
            nextState(this.initStateId, new Object[0]);
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "206c73ad17718b41cc6c7d81effda09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "206c73ad17718b41cc6c7d81effda09d");
        } else if (this.mRunning.compareAndSet(true, false)) {
            nextState(this.initStateId, new Object[0]);
        }
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ae5b23c1832f4a41194ba7c9e3a574d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ae5b23c1832f4a41194ba7c9e3a574d");
            return;
        }
        this.states.clear();
        this.states = null;
        this.currentState = null;
    }

    public boolean event(IEvent<E> iEvent) {
        Object[] objArr = {iEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd6415a7a19d759f18ff5b0387647896", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd6415a7a19d759f18ff5b0387647896")).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.currentState.id);
        sb.append("状态下触发事件：");
        sb.append(IEvent.id);
        if (this.mRunning.get()) {
            return this.currentState.handle(iEvent);
        }
        return false;
    }

    @Override // com.meituan.android.common.aidata.cep.statemanager.State.Notify
    public void nextState(T t, Object... objArr) {
        Object[] objArr2 = {t, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94606586c20e63473d99147ee589884f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94606586c20e63473d99147ee589884f");
            return;
        }
        if (this.currentState != null) {
            new StringBuilder("状态变化，离开：").append(this.currentState.id);
            this.currentState.exit();
        }
        Iterator<State<T, E>> it = this.states.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            State<T, E> next = it.next();
            if (next.id.equals(t)) {
                this.currentState = next;
                break;
            }
        }
        if (this.currentState != null) {
            new StringBuilder("状态变化，进入：").append(this.currentState.id);
            this.currentState.entry(objArr);
        }
    }

    @Override // com.meituan.android.common.aidata.cep.statemanager.State.Notify
    public void resetState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28415d7fd59df4604dff8b68c650d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28415d7fd59df4604dff8b68c650d3f");
            return;
        }
        if (this.currentState != null) {
            new StringBuilder("状态变化，离开：").append(this.currentState.id);
            this.currentState.exit();
        }
        if (this.states != null && this.states.size() > 0) {
            this.currentState = this.states.get(0);
        }
        if (this.currentState == null || this.currentState == null) {
            return;
        }
        new StringBuilder("状态变化，进入：").append(this.currentState.id);
        this.currentState.entry(null);
    }
}
