package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class bd {
    final Map<String, ViewManager> a;
    @Nullable
    final UIManagerModule.c b;

    public bd(UIManagerModule.c cVar) {
        this.a = new ConcurrentHashMap();
        this.b = cVar;
    }

    public bd(List<ViewManager> list) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (ViewManager viewManager : list) {
            concurrentHashMap.put(viewManager.getName(), viewManager);
        }
        this.a = concurrentHashMap;
        this.b = null;
    }

    public final ViewManager a(String str) {
        ViewManager viewManager = this.a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.b != null) {
            ViewManager b = b(str);
            if (b != null) {
                return b;
            }
            throw new i("ViewManagerResolver returned null for " + str);
        }
        throw new i("No ViewManager found for class " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ViewManager b(String str) {
        ViewManager a = this.b.a(str);
        if (a != null) {
            this.a.put(str, a);
        }
        return a;
    }
}
