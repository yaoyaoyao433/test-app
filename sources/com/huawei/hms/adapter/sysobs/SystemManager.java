package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class SystemManager {
    public static SystemManager a = new SystemManager();
    public static final Object b = new Object();
    public static SystemNotifier c = new a();

    public static SystemManager getInstance() {
        return a;
    }

    public static SystemNotifier getSystemNotifier() {
        return c;
    }

    public final void notifyResolutionResult(Intent intent, String str) {
        c.notifyObservers(intent, str);
    }

    public final void notifyUpdateResult(int i) {
        c.notifyObservers(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements SystemNotifier {
        public final List<SystemObserver> a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public final void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.b) {
                Iterator<SystemObserver> it = this.a.iterator();
                while (it.hasNext()) {
                    if (it.next().onSolutionResult(intent, str)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public final void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.b) {
                this.a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public final void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.b) {
                this.a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public final void notifyObservers(int i) {
            synchronized (SystemManager.b) {
                Iterator<SystemObserver> it = this.a.iterator();
                while (it.hasNext()) {
                    if (it.next().onUpdateResult(i)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
