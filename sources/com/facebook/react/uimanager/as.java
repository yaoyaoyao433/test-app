package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.yoga.YogaDirection;
import com.meituan.android.mrn.utils.y;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class as {
    private final bd a;
    private final UIViewOperationQueue b;
    protected Object c;
    protected final com.facebook.react.uimanager.events.c d;
    protected final ReactApplicationContext e;
    protected final al f;
    @Nullable
    protected a g;
    protected volatile boolean h;
    private final t i;
    private final int[] j;
    private final ArrayList<Integer> k;
    private long l;
    private volatile boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(ReactApplicationContext reactApplicationContext, bd bdVar, com.facebook.react.uimanager.events.c cVar, int i) {
        this(reactApplicationContext, bdVar, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(bdVar), i), cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public as(ReactApplicationContext reactApplicationContext, bd bdVar, UIViewOperationQueue uIViewOperationQueue, com.facebook.react.uimanager.events.c cVar) {
        this.c = new Object();
        this.f = new al();
        this.j = new int[4];
        this.k = new ArrayList<>();
        this.l = 0L;
        this.h = true;
        this.m = false;
        this.e = reactApplicationContext;
        this.a = bdVar;
        this.b = uIViewOperationQueue;
        this.i = new t(this.b, this.f);
        this.d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public af c() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (com.facebook.react.modules.i18nmanager.a.a().a(this.e)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public af a(String str) {
        return this.a.a(str).createShadowNodeInstance(this.e);
    }

    public af d(int i) {
        return this.f.e(i);
    }

    public final Map<Integer, af> l() {
        return this.f.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final ViewManager b(String str) {
        bd bdVar = this.a;
        ViewManager viewManager = bdVar.a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (bdVar.b != null) {
            return bdVar.b(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UIViewOperationQueue d() {
        return this.b;
    }

    public void b(int i, int i2, int i3) {
        af e = this.f.e(i);
        if (e == null) {
            com.facebook.common.logging.a.c("ReactNative", "Tried to update non-existent root tag: " + i);
            return;
        }
        a(e, i2, i3);
    }

    public void a(af afVar, int i, int i2) {
        afVar.setMeasureSpecs(i, i2);
    }

    public <T extends View> void a(T t, int i, ao aoVar) {
        synchronized (this.c) {
            final af c = c();
            c.setReactTag(i);
            c.setThemedContext(aoVar);
            aoVar.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.as.1
                @Override // java.lang.Runnable
                public final void run() {
                    as.this.f.b(c);
                }
            });
            this.b.a(i, (View) t);
        }
    }

    public void e(int i) {
        f(i);
        this.b.a(i);
    }

    public void f(int i) {
        synchronized (this.c) {
            this.f.c(i);
        }
    }

    public void c(int i, int i2, int i3) {
        af e = this.f.e(i);
        if (e == null) {
            com.facebook.common.logging.a.c("ReactNative", "Tried to update size of non-existent tag: " + i);
            return;
        }
        e.setStyleWidth(i2);
        e.setStyleHeight(i3);
        b();
    }

    public void a(int i, Object obj) {
        af e = this.f.e(i);
        if (e == null) {
            com.facebook.common.logging.a.c("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
            return;
        }
        e.setLocalData(obj);
        b();
    }

    public void e() {
        this.b.b();
    }

    public Map<String, Long> f() {
        return this.b.c();
    }

    public void b(int i, String str, int i2, ReadableMap readableMap) {
        if (this.h) {
            synchronized (this.c) {
                if (!this.k.contains(Integer.valueOf(i2))) {
                    View j = j(i2);
                    if (j != null && (j instanceof ReactRootView)) {
                        ((ReactRootView) j).getFsTimeLogger();
                    }
                    this.k.add(Integer.valueOf(i2));
                }
                af a2 = a(str);
                af e = this.f.e(i2);
                com.facebook.infer.annotation.a.a(e, "Root node with tag " + i2 + " doesn't exist");
                a2.setReactTag(i);
                a2.setViewClassName(str);
                a2.setRootTag(e.getReactTag());
                a2.setThemedContext(e.getThemedContext());
                com.meituan.android.mrn.utils.y.a().a(e.getThemedContext(), y.a.CreateShadowNode, i);
                this.f.c(a2);
                ag agVar = null;
                if (readableMap != null) {
                    agVar = new ag(readableMap);
                    a2.updateProperties(agVar);
                    if (readableMap.hasKey("fspIgnore") && readableMap.getBoolean("fspIgnore")) {
                        this.f.c.put(Integer.valueOf(a2.getReactTag()), a2);
                    }
                }
                a(a2, i2, agVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(af afVar, int i, @Nullable ag agVar) {
        if (afVar.isVirtual()) {
            return;
        }
        t tVar = this.i;
        ao themedContext = afVar.getThemedContext();
        afVar.setIsLayoutOnly(afVar.getViewClass().equals(ReactViewManager.REACT_CLASS) && t.a(agVar));
        if (afVar.getNativeKind() != s.NONE) {
            tVar.a.a(themedContext, afVar.getReactTag(), afVar.getViewClass(), agVar);
        }
    }

    public void a(int i, String str, ReadableMap readableMap) {
        if (this.h) {
            if (this.a.a(str) == null) {
                throw new i("Got unknown view type: " + str);
            }
            af e = this.f.e(i);
            if (e != null) {
                if (readableMap != null) {
                    ag agVar = new ag(readableMap);
                    e.updateProperties(agVar);
                    a(e, str, agVar);
                    return;
                }
                return;
            }
            com.facebook.common.logging.a.d("UIImplementation@updateView", "Trying to update non-existent view with tag " + i + StringUtil.SPACE + str + StringUtil.SPACE + this.m);
        }
    }

    public void a(int i, ag agVar) {
        UiThreadUtil.assertOnUiThread();
        this.b.a().a(i, agVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(af afVar, String str, ag agVar) {
        if (afVar.isVirtual()) {
            return;
        }
        t tVar = this.i;
        if (afVar.isLayoutOnly() && !t.a(agVar)) {
            tVar.a(afVar, agVar);
        } else if (afVar.isLayoutOnly()) {
        } else {
            tVar.a.a(afVar.getReactTag(), str, agVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r24 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r11 != r24.size()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        throw new com.facebook.react.uimanager.i("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r20, @android.support.annotation.Nullable com.facebook.react.bridge.ReadableArray r21, @android.support.annotation.Nullable com.facebook.react.bridge.ReadableArray r22, @android.support.annotation.Nullable com.facebook.react.bridge.ReadableArray r23, @android.support.annotation.Nullable com.facebook.react.bridge.ReadableArray r24, @android.support.annotation.Nullable com.facebook.react.bridge.ReadableArray r25) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.as.a(int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    public void d(int i, ReadableArray readableArray) {
        if (this.h) {
            synchronized (this.c) {
                af e = this.f.e(i);
                if (e == null) {
                    com.facebook.common.logging.a.d("[UIImplementation@setChildren]", "cssNodeToManage with tag: " + i + " is null");
                    return;
                }
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    af e2 = this.f.e(readableArray.getInt(i2));
                    if (e2 == null) {
                        throw new i("Trying to add unknown view tag: " + readableArray.getInt(i2));
                    }
                    e.addChildAt(e2, i2);
                }
                this.i.a(e, readableArray);
            }
        }
    }

    public void b(int i, int i2) {
        if (this.f.f(i) || this.f.f(i2)) {
            throw new i("Trying to add or replace a root tag!");
        }
        af e = this.f.e(i);
        if (e == null) {
            throw new i("Trying to replace unknown view tag: " + i);
        }
        af parent = e.getParent();
        if (parent == null) {
            throw new i("Node is not attached to a parent: " + i);
        }
        int indexOf = parent.indexOf(e);
        if (indexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i2);
        WritableArray createArray2 = Arguments.createArray();
        createArray2.pushInt(indexOf);
        WritableArray createArray3 = Arguments.createArray();
        createArray3.pushInt(indexOf);
        a(parent.getReactTag(), null, null, createArray, createArray2, createArray3);
    }

    public void g(int i) {
        af e = this.f.e(i);
        if (e == null) {
            throw new i("Trying to remove subviews of an unknown view tag: " + i);
        }
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < e.getChildCount(); i2++) {
            createArray.pushInt(i2);
        }
        a(i, null, null, null, null, createArray);
    }

    public void a(int i, float f, float f2, Callback callback) {
        this.b.a(i, f, f2, callback);
    }

    @Deprecated
    public void a(int i, int i2, Callback callback) {
        af e = this.f.e(i);
        af e2 = this.f.e(i2);
        if (e == null || e2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(e.isDescendantOf(e2)));
        }
    }

    public void a(int i, Callback callback) {
        if (this.h) {
            this.b.a(i, callback);
        }
    }

    public void b(int i, Callback callback) {
        if (this.h) {
            this.b.b(i, callback);
        }
    }

    public void a(int i, int i2, Callback callback, Callback callback2) {
        if (this.h) {
            try {
                int[] iArr = this.j;
                af e = this.f.e(i);
                af e2 = this.f.e(i2);
                if (e != null && e2 != null) {
                    if (e != e2) {
                        for (af parent = e.getParent(); parent != e2; parent = parent.getParent()) {
                            if (parent == null) {
                                throw new i("Tag " + i2 + " is not an ancestor of tag " + i);
                            }
                        }
                    }
                    a(e, e2, iArr);
                    callback2.invoke(Float.valueOf(w.c(this.j[0])), Float.valueOf(w.c(this.j[1])), Float.valueOf(w.c(this.j[2])), Float.valueOf(w.c(this.j[3])));
                    return;
                }
                StringBuilder sb = new StringBuilder("Tag ");
                if (e != null) {
                    i = i2;
                }
                sb.append(i);
                sb.append(" does not exist");
                throw new i(sb.toString());
            } catch (i e3) {
                callback.invoke(e3.getMessage());
            }
        }
    }

    public void a(int i, Callback callback, Callback callback2) {
        if (this.h) {
            try {
                int[] iArr = this.j;
                af e = this.f.e(i);
                if (e == null) {
                    throw new i("No native view for tag " + i + " exists!");
                }
                af parent = e.getParent();
                if (parent == null) {
                    throw new i("View with tag " + i + " doesn't have a parent!");
                }
                a(e, parent, iArr);
                callback2.invoke(Float.valueOf(w.c(this.j[0])), Float.valueOf(w.c(this.j[1])), Float.valueOf(w.c(this.j[2])), Float.valueOf(w.c(this.j[3])));
            } catch (i e2) {
                callback.invoke(e2.getMessage());
            }
        }
    }

    public void h(int i) {
        a(i, -1L, -1);
    }

    public final void a(int i, long j, int i2) {
        int i3;
        com.facebook.systrace.b.a(0L, "UIImplementation.dispatchViewUpdates");
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            g();
            this.i.b.clear();
            if (j <= 0 || i2 <= 0) {
                i3 = -1;
            } else {
                int i4 = i(i2);
                if (i4 == 0) {
                    i4 = i(this.b.i());
                }
                i3 = i4;
            }
            this.b.a(i, uptimeMillis, this.l, j, i3);
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    private void b() {
        if (this.b.d()) {
            h(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        com.facebook.systrace.a.a(0L, "UIImplementation.updateViewHierarchy");
        for (int i = 0; i < this.f.a(); i++) {
            try {
                af e = this.f.e(this.f.g(i));
                if (e.getWidthMeasureSpec() != null && e.getHeightMeasureSpec() != null) {
                    com.facebook.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive");
                    e.getReactTag();
                    a(e);
                    com.facebook.systrace.a.a(0L);
                    b(e);
                    com.facebook.systrace.b.a(0L, "UIImplementation.applyUpdatesRecursive");
                    e.getReactTag();
                    a(e, 0.0f, 0.0f);
                    com.facebook.systrace.a.a(0L);
                    if (this.g != null) {
                        this.b.a(e, this.g);
                    }
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }
    }

    public void a(boolean z) {
        this.b.a(z);
    }

    public void a(ReadableMap readableMap, Callback callback) {
        this.b.a(readableMap, callback);
    }

    public void a(int i, boolean z) {
        af e = this.f.e(i);
        if (e == null) {
            return;
        }
        while (e.getNativeKind() == s.NONE) {
            e = e.getParent();
        }
        this.b.a(e.getReactTag(), i, z);
    }

    public void h() {
        this.b.e();
    }

    @Deprecated
    public void a(int i, int i2, @Nullable ReadableArray readableArray) {
        a(i, "dispatchViewManagerCommand");
        this.b.a(i, i2, readableArray);
    }

    public void a(int i, String str, @Nullable ReadableArray readableArray) {
        a(i, "dispatchViewManagerCommand");
        this.b.a(i, str, readableArray);
    }

    public void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        a(i, "showPopupMenu");
        this.b.a(i, readableArray, callback, callback2);
    }

    public void i() {
        this.b.f();
    }

    public void c(int i, int i2) {
        this.b.a(i, i2);
    }

    public void j() {
        this.b.g();
    }

    public void k() {
        this.b.h();
    }

    public final void m() {
        this.m = true;
        if (com.meituan.android.mrn.horn.f.a().b()) {
            this.h = false;
        }
    }

    public void a(@Nullable com.facebook.react.uimanager.debug.a aVar) {
        this.b.a(aVar);
    }

    private void a(af afVar, af afVar2, int[] iArr) {
        int i;
        int i2;
        if (afVar != afVar2) {
            i = Math.round(afVar.getLayoutX());
            i2 = Math.round(afVar.getLayoutY());
            for (af parent = afVar.getParent(); parent != afVar2; parent = parent.getParent()) {
                com.facebook.infer.annotation.a.a(parent);
                d(parent);
                i += Math.round(parent.getLayoutX());
                i2 += Math.round(parent.getLayoutY());
            }
            d(afVar2);
        } else {
            i = 0;
            i2 = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = afVar.getScreenWidth();
        iArr[3] = afVar.getScreenHeight();
    }

    private void a(int i, String str) {
        if (this.f.e(i) != null) {
            return;
        }
        throw new i("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
    }

    private void d(af afVar) {
        ViewManager viewManager = (ViewManager) com.facebook.infer.annotation.a.a(this.a.a(afVar.getViewClass()));
        if (viewManager instanceof h) {
            h hVar = (h) viewManager;
            if (hVar == null || !hVar.needsCustomLayoutForChildren()) {
                return;
            }
            throw new i("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + afVar.getViewClass() + "). Use measure instead.");
        }
        throw new i("Trying to use view " + afVar.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(af afVar) {
        if (afVar.hasUpdates()) {
            for (int i = 0; i < afVar.getChildCount(); i++) {
                a(afVar.getChildAt(i));
            }
            afVar.onBeforeLayout(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(af afVar) {
        com.facebook.systrace.b.a(0L, "cssRoot.calculateLayout");
        afVar.getReactTag();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = afVar.getWidthMeasureSpec().intValue();
            int intValue2 = afVar.getHeightMeasureSpec().intValue();
            float f = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f = View.MeasureSpec.getSize(intValue2);
            }
            afVar.calculateLayout(size, f);
        } finally {
            com.facebook.systrace.a.a(0L);
            this.l = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(af afVar, float f, float f2) {
        if (afVar.hasUpdates()) {
            Iterable<? extends af> calculateLayoutOnChildren = afVar.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                for (af afVar2 : calculateLayoutOnChildren) {
                    a(afVar2, afVar.getLayoutX() + f, afVar.getLayoutY() + f2);
                }
            }
            int reactTag = afVar.getReactTag();
            if (!this.f.f(reactTag) && afVar.dispatchUpdates(f, f2, this.b, this.i) && afVar.shouldNotifyOnLayout()) {
                this.d.a(v.a(reactTag, afVar.getScreenX(), afVar.getScreenY(), afVar.getScreenWidth(), afVar.getScreenHeight()));
            }
            afVar.markUpdateSeen();
            if (com.facebook.react.config.a.h) {
                this.i.b.clear();
            }
        }
    }

    public void a(ar arVar) {
        this.b.a(arVar);
    }

    public void b(ar arVar) {
        this.b.b(arVar);
    }

    public int i(int i) {
        if (this.f.f(i)) {
            return i;
        }
        af d = d(i);
        if (d != null) {
            return d.getRootTag();
        }
        com.facebook.common.logging.a.c("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<ViewManager> list) {
        bd bdVar = this.a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ViewManager viewManager : list) {
            bdVar.a.put(viewManager.getName(), viewManager);
        }
    }

    @Deprecated
    public View j(int i) {
        return this.b.a().d(i);
    }

    public UIViewOperationQueue a() {
        return this.b;
    }

    private void c(af afVar) {
        afVar.removeAllNativeChildren();
        this.f.d(afVar.getReactTag());
        for (int childCount = afVar.getChildCount() - 1; childCount >= 0; childCount--) {
            c(afVar.getChildAt(childCount));
        }
        afVar.removeAndDisposeAllChildren();
    }
}
