package com.facebook.react.animated;

import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l implements com.facebook.react.uimanager.events.d {
    final UIManagerModule e;
    private final UIManagerModule.a g;
    final SparseArray<b> a = new SparseArray<>();
    final SparseArray<d> b = new SparseArray<>();
    final SparseArray<b> c = new SparseArray<>();
    final Map<String, List<EventAnimationDriver>> d = new HashMap();
    private int h = 0;
    final List<b> f = new LinkedList();

    public l(UIManagerModule uIManagerModule) {
        this.e = uIManagerModule;
        uIManagerModule.getEventDispatcher().a(this);
        this.g = uIManagerModule.getDirectEventNamesResolver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final b a(int i) {
        return this.a.get(i);
    }

    public final void a(int i, int i2, ReadableMap readableMap, Callback callback) {
        d eVar;
        b bVar = this.a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        } else if (!(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException("Animated node should be of type " + s.class.getName());
        } else {
            d dVar = this.b.get(i);
            if (dVar != null) {
                dVar.a(readableMap);
                return;
            }
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                eVar = new h(readableMap);
            } else if ("spring".equals(string)) {
                eVar = new n(readableMap);
            } else if ("decay".equals(string)) {
                eVar = new e(readableMap);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported animation type: " + string);
            }
            eVar.d = i;
            eVar.c = callback;
            eVar.b = (s) bVar;
            this.b.put(i, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        int i = 0;
        while (i < this.b.size()) {
            d valueAt = this.b.valueAt(i);
            if (bVar.equals(valueAt.b)) {
                if (valueAt.c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.c.invoke(createMap);
                }
                this.b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public final void a(final com.facebook.react.uimanager.events.b bVar) {
        if (UiThreadUtil.isOnUiThread()) {
            b(bVar);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.b(bVar);
                }
            });
        }
    }

    void b(com.facebook.react.uimanager.events.b bVar) {
        if (this.d.isEmpty()) {
            return;
        }
        String a = this.g.a(bVar.a());
        Map<String, List<EventAnimationDriver>> map = this.d;
        List<EventAnimationDriver> list = map.get(bVar.e + a);
        if (list != null) {
            for (EventAnimationDriver eventAnimationDriver : list) {
                a(eventAnimationDriver.mValueNode);
                bVar.a(eventAnimationDriver);
                this.f.add(eventAnimationDriver.mValueNode);
            }
            a(this.f);
            this.f.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<b> list) {
        this.h++;
        if (this.h == 0) {
            this.h++;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        for (b bVar : list) {
            if (bVar.c != this.h) {
                bVar.c = this.h;
                i++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.a != null) {
                int i2 = i;
                for (int i3 = 0; i3 < bVar2.a.size(); i3++) {
                    b bVar3 = bVar2.a.get(i3);
                    bVar3.b++;
                    if (bVar3.c != this.h) {
                        bVar3.c = this.h;
                        i2++;
                        arrayDeque.add(bVar3);
                    }
                }
                i = i2;
            }
        }
        this.h++;
        if (this.h == 0) {
            this.h++;
        }
        int i4 = 0;
        for (b bVar4 : list) {
            if (bVar4.b == 0 && bVar4.c != this.h) {
                bVar4.c = this.h;
                i4++;
                arrayDeque.add(bVar4);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            bVar5.a();
            if (bVar5 instanceof m) {
                try {
                    ((m) bVar5).c();
                } catch (com.facebook.react.uimanager.i e) {
                    com.facebook.common.logging.a.d("ReactNative", "Native animation workaround, frame lost as result of race condition", e);
                }
            }
            if (bVar5 instanceof s) {
                ((s) bVar5).c();
            }
            if (bVar5.a != null) {
                int i5 = i4;
                for (int i6 = 0; i6 < bVar5.a.size(); i6++) {
                    b bVar6 = bVar5.a.get(i6);
                    bVar6.b--;
                    if (bVar6.c != this.h && bVar6.b == 0) {
                        bVar6.c = this.h;
                        i5++;
                        arrayDeque.add(bVar6);
                    }
                }
                i4 = i5;
            }
        }
        if (i == i4) {
            return;
        }
        throw new IllegalStateException("Looks like animated nodes graph has cycles, there are " + i + " but toposort visited only " + i4);
    }
}
