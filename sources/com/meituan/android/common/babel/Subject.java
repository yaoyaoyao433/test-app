package com.meituan.android.common.babel;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Subject {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ConcurrentMap<String, Observer> map;
    private ConcurrentHashMap<String, CopyOnWriteArraySet<Observer>> type2Observers;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static Subject singleton = new Subject();
    }

    public Subject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5caf0b716e23a98285860c7c8fdb18d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5caf0b716e23a98285860c7c8fdb18d5");
        } else {
            this.map = new ConcurrentHashMap();
        }
    }

    public static Subject getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3afd87f6c081ac6bd1486c441406ae17", 6917529027641081856L) ? (Subject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3afd87f6c081ac6bd1486c441406ae17") : Holder.singleton;
    }

    public synchronized void attach(String str, Observer observer) {
        Object[] objArr = {str, observer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab07559ea022a45cdd0d459f5041dcf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab07559ea022a45cdd0d459f5041dcf8");
            return;
        }
        if (this.map.get(str) == null) {
            this.map.put(str, observer);
        }
    }

    public void registerObserver(String str, Observer observer) {
        Object[] objArr = {str, observer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83b5bdc8440886ede9e8cbf45e4be071", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83b5bdc8440886ede9e8cbf45e4be071");
        } else if (str == null) {
        } else {
            if (this.type2Observers == null) {
                this.type2Observers = new ConcurrentHashMap<>();
            }
            CopyOnWriteArraySet<Observer> copyOnWriteArraySet = this.type2Observers.get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                this.type2Observers.put(str, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(observer);
        }
    }

    public boolean hasObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f2bfc65dd2617b1d6daa9d11220392", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f2bfc65dd2617b1d6daa9d11220392")).booleanValue();
        }
        if (this.map == null || !this.map.containsKey(str)) {
            return this.type2Observers != null && this.type2Observers.containsKey(str);
        }
        return true;
    }

    public synchronized void nodifyObservers(Map<String, Object> map) {
        CopyOnWriteArraySet<Observer> copyOnWriteArraySet;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eecc01055e1b829b887e6dc24d627f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eecc01055e1b829b887e6dc24d627f0");
        } else if (this.map == null) {
        } else {
            try {
                String str = (String) map.get("type");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Observer observer = this.map.get(str);
                if (observer != null) {
                    observer.notify(map);
                }
                if (this.type2Observers != null && this.type2Observers.containsKey(str) && (copyOnWriteArraySet = this.type2Observers.get(str)) != null) {
                    Iterator<Observer> it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        it.next().notify(map);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
