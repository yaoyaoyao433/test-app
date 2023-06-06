package com.meituan.android.common.aidata.cep.statemanager;

import com.meituan.android.common.aidata.cep.rule.IRuleMatcher;
import com.meituan.android.common.aidata.data.api.IEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class State<T, E> {
    public static final String PREFIX = "STATE##";
    public static final AtomicInteger SEQ = new AtomicInteger(0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<E, Handler> handlerMap;
    public T id;
    public Notify<T> notify;
    public Handler onEntry;
    public Handler onExit;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Handler {
        boolean handle(Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface Notify<T> {
        void nextState(T t, Object... objArr);

        void resetState();
    }

    public State(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b9145b5d2ccd9b1103fbc185177a548", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b9145b5d2ccd9b1103fbc185177a548");
            return;
        }
        this.id = t;
        this.handlerMap = new HashMap();
    }

    public State() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ea4a64ce6686c1142d7cd5b345f6a95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ea4a64ce6686c1142d7cd5b345f6a95");
        } else {
            this.handlerMap = new HashMap();
        }
    }

    public T getId() {
        return this.id;
    }

    public void setId(T t) {
        this.id = t;
    }

    public State<T, E> bindEventHandler(E e, Handler handler) {
        Object[] objArr = {e, handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29d8bf2bce58b38b004c0e5bd57a6b68", RobustBitConfig.DEFAULT_VALUE)) {
            return (State) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29d8bf2bce58b38b004c0e5bd57a6b68");
        }
        this.handlerMap.put(e, handler);
        return this;
    }

    public State<T, E> bindEventHandler(E e, T t) {
        Object[] objArr = {e, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aebf281bf05a51f35f25be9583d5d09", RobustBitConfig.DEFAULT_VALUE) ? (State) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aebf281bf05a51f35f25be9583d5d09") : bindEventHandler(e, t, null);
    }

    public State<T, E> bindEventHandler(E e, final T t, final Handler handler) {
        Object[] objArr = {e, t, handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d953514e673763d9025627ac0c9af1b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (State) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d953514e673763d9025627ac0c9af1b0");
        }
        this.handlerMap.put(e, new Handler() { // from class: com.meituan.android.common.aidata.cep.statemanager.State.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.meituan.android.common.aidata.cep.statemanager.State.Handler
            public boolean handle(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "11e72a07d3daa4860725ecfbe716f63b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "11e72a07d3daa4860725ecfbe716f63b")).booleanValue();
                }
                if (handler != null) {
                    if (handler.handle(obj)) {
                        State.this.notify.nextState(t, obj);
                        return true;
                    }
                    State.this.notify.resetState();
                    return false;
                }
                return false;
            }
        });
        return this;
    }

    public State<T, E> onEntry(Handler handler) {
        this.onEntry = handler;
        return this;
    }

    public State<T, E> onExit(Handler handler) {
        this.onExit = handler;
        return this;
    }

    public void entry(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d9be66193a5f1a2a380706794311a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d9be66193a5f1a2a380706794311a43");
        } else if (this.onEntry != null) {
            this.onEntry.handle(objArr);
        }
    }

    public void exit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ff8ef9786e3eefde0e620cb7a27e17c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ff8ef9786e3eefde0e620cb7a27e17c");
        } else if (this.onExit != null) {
            this.onExit.handle(new ArrayList());
        }
    }

    public boolean handle(IEvent<E> iEvent) {
        Object[] objArr = {iEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "116e9cb74a2b9203a18b5b3d0fc5f88d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "116e9cb74a2b9203a18b5b3d0fc5f88d")).booleanValue();
        }
        Handler findRuleHandler = findRuleHandler(iEvent);
        if (findRuleHandler != null) {
            findRuleHandler.handle(iEvent);
            return true;
        }
        return false;
    }

    public Handler findRuleHandler(IEvent<E> iEvent) {
        Object[] objArr = {iEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c134749799b149ffc1c6330fb4393b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c134749799b149ffc1c6330fb4393b6");
        }
        if (this.handlerMap == null || this.handlerMap.size() <= 0) {
            return null;
        }
        for (E e : this.handlerMap.keySet()) {
            if (((IRuleMatcher) e).filterAccept(iEvent)) {
                return this.handlerMap.get(e);
            }
        }
        return null;
    }

    public boolean equals(State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3768264ea9fba3cc78fe36e8d1f0b2ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3768264ea9fba3cc78fe36e8d1f0b2ca")).booleanValue();
        }
        if (state == null || state.id == null) {
            return false;
        }
        return state.id.equals(this.id);
    }

    public static final String getStateName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "398f6938f487f6800ac254d9feec4d20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "398f6938f487f6800ac254d9feec4d20");
        }
        return PREFIX + SEQ.incrementAndGet();
    }
}
