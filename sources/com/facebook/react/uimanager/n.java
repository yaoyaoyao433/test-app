package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n extends as {
    protected final m a;
    public final l b;
    private as i;
    private final o j;

    public n(as asVar) {
        super((ReactApplicationContext) null, (bd) null, (UIViewOperationQueue) null, (com.facebook.react.uimanager.events.c) null);
        this.i = asVar;
        this.j = new o(this.i.d());
        this.a = new m(this.i.f, this.i.c);
        this.b = new l(this.j, this.a);
    }

    @Override // com.facebook.react.uimanager.as
    public final UIViewOperationQueue a() {
        return this.j;
    }

    public final af a(int i) {
        return this.a.a(i);
    }

    public final void a(int i, String str, int i2, ReadableMap readableMap) {
        boolean z = false;
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@createShadowNodeSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "tag:%d,className:%s,rootViewTag:%d", Integer.valueOf(i), str, Integer.valueOf(i2)));
            return;
        }
        af a = a(str);
        af a2 = this.a.a(i2);
        com.facebook.infer.annotation.a.a(a2, "Root node with tag " + i2 + " doesn't exist");
        a.setReactTag(i);
        a.setViewClassName(str);
        a.setRootTag(i2);
        a.setThemedContext(a2.getThemedContext());
        this.a.a(a);
        ag agVar = null;
        if (readableMap != null) {
            agVar = new ag(readableMap);
            a.updateProperties(agVar);
        }
        if (a.isVirtual()) {
            return;
        }
        a.getThemedContext();
        if (a.getViewClass().equals(ReactViewManager.REACT_CLASS) && t.a(agVar)) {
            z = true;
        }
        a.setIsLayoutOnly(z);
    }

    public final View a(ao aoVar, int i, String str) {
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@createShadowViewSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "tag:%d,className:%s", Integer.valueOf(i), str));
            return null;
        }
        af a = this.a.a(i);
        if (a == null) {
            Log.e("Raphael", "[TurboUIImplementation@createShadowViewSync] node is not created yet: " + i + StringUtil.SPACE + str + StringUtil.CRLF_STRING + Log.getStackTraceString(new Throwable()));
            return null;
        } else if (a.isVirtual()) {
            return null;
        } else {
            return this.b.a.b.a(aoVar, i, str, (ag) null, (Object) null);
        }
    }

    public final void a(int i, int i2, int i3) {
        af a = this.a.a(i);
        af a2 = this.a.a(i2);
        if (a2 == null) {
            com.facebook.common.logging.a.d("[MListUIImplementation@addChildAtSync]", "try to add null to tag " + i);
        } else if ((a2 instanceof ReactRawTextShadowNode) && !(a instanceof ReactBaseTextShadowNode)) {
            throw new RuntimeException("Trying to add a RCTRawtText(" + a2.getReactTag() + StringUtil.SPACE + a2.getViewClass() + ") to a non-ReactBaseText(" + a.getReactTag() + StringUtil.SPACE + a.getViewClass() + CommonConstant.Symbol.BRACKET_RIGHT);
        } else {
            a.addChildAt(a2, i3);
            this.b.a(a, a2, i3);
        }
    }

    public final void a(int i, int i2) {
        int indexOf;
        af a = this.a.a(i2);
        l lVar = this.b;
        af nativeParent = a.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(a);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            lVar.a.a(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, (ay[]) null);
        }
        af parent = a.getParent();
        if (parent == null || (indexOf = parent.indexOf(a)) == -1) {
            return;
        }
        parent.removeChildAt(indexOf);
    }

    public final void a(int i, ReadableArray readableArray) {
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@setChildrenNodeSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "viewTag:%d,childrenTags:%s", Integer.valueOf(i), readableArray));
            return;
        }
        af a = this.a.a(i);
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            af a2 = this.a.a(readableArray.getInt(i2));
            if (a2 == null) {
                Log.e("Raphael", "Trying to add unknown view tag: " + readableArray.getInt(i2));
            } else if ((a2 instanceof ReactRawTextShadowNode) && !(a instanceof ReactBaseTextShadowNode)) {
                throw new RuntimeException("Trying to add a RCTRawtText(" + a2.getReactTag() + StringUtil.SPACE + a2.getViewClass() + ") to a non-ReactBaseText(" + a.getReactTag() + StringUtil.SPACE + a.getViewClass() + CommonConstant.Symbol.BRACKET_RIGHT);
            } else {
                try {
                    a.addChildAt(a2, i2);
                } catch (Throwable unused) {
                }
            }
        }
        this.b.a(a, readableArray);
    }

    public final void a(String str, View view, ArrayList<View> arrayList) {
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@setChildrenViewSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "parentViewClass:%s", str));
            return;
        }
        l lVar = this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            lVar.a.b.a(str, view, (int[]) null, new az[]{new az(arrayList.get(i), i)}, (int[]) null, (int[]) null);
        }
    }

    public final void a(int i, String str, ReadableMap readableMap, View view) {
        Object obj;
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@setChildrenViewSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "tag:%d,viewClass:%s", Integer.valueOf(i), str));
            return;
        }
        af a = this.a.a(i);
        ag agVar = null;
        if (a != null) {
            Object[] objArr = new Object[1];
            a.onCollectExtraUpdates(new f(this.j, objArr));
            obj = objArr[0];
        } else {
            obj = null;
        }
        if (readableMap != null && a != null) {
            agVar = new ag(readableMap);
            a.updateProperties(agVar);
        }
        ag agVar2 = agVar;
        if (view != null || a == null || a.isVirtual() || a.isLayoutOnly()) {
            if (view != null) {
                this.b.a.b.a(i, str, agVar2, view, obj);
                return;
            }
            return;
        }
        com.facebook.common.logging.a.d("[TurboUIImplementation@bindViewSync]", "view is null,tag: " + i + ",node: " + a);
    }

    public final void b(int i, ReadableArray readableArray) {
        af a = this.a.a(i);
        if (a == null) {
            return;
        }
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            af a2 = this.a.a(readableArray.getInt(i2));
            if (a2 == null) {
                Log.e("Rapphael", "Trying to remove unknown node tag: " + readableArray.getInt(i2));
            } else {
                this.j.b(a2.getReactTag());
                int indexOf = a.indexOf(a2);
                if (indexOf != -1) {
                    a.removeChildAt(indexOf);
                }
                try {
                    a2.dispose();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void c(int i, ReadableArray readableArray) {
        af a = this.a.a(i);
        if (a == null) {
            return;
        }
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            af a2 = this.a.a(readableArray.getInt(i2));
            if (a2 == null) {
                com.facebook.common.logging.a.d("[MListUIImplementation@removeChildrenNodeSync]", "Trying to remove unknown node tag: " + readableArray.getInt(i2));
            } else {
                this.j.b(a2.getReactTag());
            }
        }
        this.j.b(a.getReactTag());
    }

    public final void a(int i, View view, boolean z, int i2) {
        if (!this.i.h) {
            com.facebook.common.logging.a.b("[MListUIImplementation@applyLayoutUpdatesSync]", "catalyst destroyed: ", String.format(Locale.getDefault(), "cellId:%d", Integer.valueOf(i)));
            return;
        }
        af a = this.a.a(i);
        if (a == null) {
            com.facebook.common.logging.a.b("[MListUIImplementation@applyLayoutUpdatesSync]", "node null, cellId: ", i + ",view: " + view);
            return;
        }
        try {
            a(a, a.getLayoutX(), a.getLayoutY(), view, z);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[MListUIImplementation@applyLayoutUpdatesSync]", "getLayout error,cellId: " + i + ",view: " + view + ",error: ", th);
        }
    }

    public final void b() {
        com.facebook.react.log.c fsTimeLogger;
        o oVar = this.j;
        if (oVar.c == null || oVar.c.size() <= 0) {
            return;
        }
        Iterator<Integer> it = oVar.c.iterator();
        while (it.hasNext()) {
            View d = oVar.b.d(it.next().intValue());
            if (d != null && (d instanceof ReactRootView) && (fsTimeLogger = ((ReactRootView) d).getFsTimeLogger()) != null) {
                fsTimeLogger.a(d, oVar.b);
            }
        }
        oVar.c.clear();
    }

    public final void a(int i, float f, float f2, c cVar) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) this.a.a(i);
        if (reactShadowNodeImpl == null) {
            com.facebook.common.logging.a.d("[MListUIImplementation@calculateLayoutSync] ", "topNode null: " + i);
            return;
        }
        try {
            a(reactShadowNodeImpl);
        } catch (Throwable th) {
            Log.e("Raphael", "[UIWrapper@calculateLayout] : " + Log.getStackTraceString(th));
        }
        reactShadowNodeImpl.calculateLayout(f, f2);
        if (cVar != null) {
            cVar.a(reactShadowNodeImpl.getLayoutWidth(), reactShadowNodeImpl.getLayoutHeight());
        }
    }

    public final void b(int i) {
        af a = this.a.a(i);
        if (a == null) {
            return;
        }
        c(a);
        a.dispose();
    }

    public final void c(int i) {
        this.a.a.remove(i);
    }

    private void c(af afVar) {
        t.a(afVar);
        this.a.b(afVar.getReactTag());
        for (int childCount = afVar.getChildCount() - 1; childCount >= 0; childCount--) {
            c(afVar.getChildAt(childCount));
        }
        afVar.removeAndDisposeAllChildren();
    }

    private void a(af afVar, float f, float f2, View view, boolean z) {
        com.facebook.react.log.c fsTimeLogger;
        if (afVar.hasUpdates() || z) {
            Iterable<? extends af> calculateLayoutOnChildren = afVar.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                for (af afVar2 : calculateLayoutOnChildren) {
                    a(afVar2, f + afVar.getLayoutX(), f2 + afVar.getLayoutY(), view, z);
                }
            }
            int reactTag = afVar.getReactTag();
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) afVar;
            o oVar = this.j;
            l lVar = this.b;
            if (reactShadowNodeImpl.hasUnseenUpdates()) {
                reactShadowNodeImpl.onCollectExtraUpdates(new f(oVar, null));
            }
            boolean z2 = false;
            if (reactShadowNodeImpl.hasNewLayout() || z) {
                float layoutX = reactShadowNodeImpl.getLayoutX();
                float layoutY = reactShadowNodeImpl.getLayoutY();
                float f3 = f + layoutX;
                int round = Math.round(f3);
                float f4 = f2 + layoutY;
                int round2 = Math.round(f4);
                int round3 = Math.round(f3 + reactShadowNodeImpl.getLayoutWidth());
                int round4 = Math.round(f4 + reactShadowNodeImpl.getLayoutHeight());
                int round5 = Math.round(layoutX);
                int round6 = Math.round(layoutY);
                int i = round3 - round;
                int i2 = round4 - round2;
                z2 = (round5 == reactShadowNodeImpl.getScreenX() && round6 == reactShadowNodeImpl.getScreenY() && i == reactShadowNodeImpl.getScreenWidth() && i2 == reactShadowNodeImpl.getScreenHeight()) ? true : true;
                reactShadowNodeImpl.setScreenX(round5);
                reactShadowNodeImpl.setScreenY(round6);
                reactShadowNodeImpl.setScreenWidth(i);
                reactShadowNodeImpl.setScreenHeight(i2);
                if (lVar != null) {
                    reactShadowNodeImpl.getParent();
                    int screenX = reactShadowNodeImpl.getScreenX();
                    int screenY = reactShadowNodeImpl.getScreenY();
                    int rootTag = reactShadowNodeImpl.getRootTag();
                    int reactTag2 = reactShadowNodeImpl.getReactTag();
                    o oVar2 = lVar.a;
                    oVar2.b.a(reactTag2, screenX, screenY, reactShadowNodeImpl.getScreenWidth(), reactShadowNodeImpl.getScreenHeight(), view);
                    oVar2.c.add(Integer.valueOf(rootTag));
                    View d = oVar2.b.d(rootTag);
                    if (d != null && (d instanceof ReactRootView) && (fsTimeLogger = ((ReactRootView) d).getFsTimeLogger()) != null) {
                        fsTimeLogger.a(reactTag2, oVar2.b);
                    }
                }
            }
            if (z2 && afVar.shouldNotifyOnLayout()) {
                this.i.d.a(v.a(reactTag, afVar.getScreenX(), afVar.getScreenY(), afVar.getScreenWidth(), afVar.getScreenHeight()));
            }
            afVar.markUpdateSeen();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final af c() {
        return this.i.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final af a(String str) {
        return this.i.a(str);
    }

    @Override // com.facebook.react.uimanager.as
    public final af d(int i) {
        return this.i.d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.as
    public final UIViewOperationQueue d() {
        return this.j;
    }

    @Override // com.facebook.react.uimanager.as
    public final void b(int i, int i2, int i3) {
        this.i.b(i, i2, i3);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(af afVar, int i, int i2) {
        this.i.a(afVar, i, i2);
    }

    @Override // com.facebook.react.uimanager.as
    public final <T extends View> void a(T t, int i, ao aoVar) {
        this.i.a((as) t, i, aoVar);
    }

    @Override // com.facebook.react.uimanager.as
    public final void e(int i) {
        this.i.e(i);
    }

    @Override // com.facebook.react.uimanager.as
    public final void f(int i) {
        this.i.f(i);
    }

    @Override // com.facebook.react.uimanager.as
    public final void c(int i, int i2, int i3) {
        this.i.c(i, i2, i3);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, Object obj) {
        this.i.a(i, obj);
    }

    @Override // com.facebook.react.uimanager.as
    public final void e() {
        this.i.e();
    }

    @Override // com.facebook.react.uimanager.as
    public final Map<String, Long> f() {
        return this.i.f();
    }

    @Override // com.facebook.react.uimanager.as
    public final void b(int i, String str, int i2, ReadableMap readableMap) {
        this.i.b(i, str, i2, readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void a(af afVar, int i, @Nullable ag agVar) {
        this.i.a(afVar, i, agVar);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, String str, ReadableMap readableMap) {
        this.i.a(i, str, readableMap);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, ag agVar) {
        this.i.a(i, agVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void a(af afVar, String str, ag agVar) {
        this.i.a(afVar, str, agVar);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        this.i.a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.uimanager.as
    public final void d(int i, ReadableArray readableArray) {
        this.i.d(i, readableArray);
    }

    @Override // com.facebook.react.uimanager.as
    public final void b(int i, int i2) {
        this.i.b(i, i2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void g(int i) {
        this.i.g(i);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, float f, float f2, Callback callback) {
        this.i.a(i, f, f2, callback);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, int i2, Callback callback) {
        this.i.a(i, i2, callback);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, Callback callback) {
        this.i.a(i, callback);
    }

    @Override // com.facebook.react.uimanager.as
    public final void b(int i, Callback callback) {
        this.i.b(i, callback);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, int i2, Callback callback, Callback callback2) {
        this.i.a(i, i2, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, Callback callback, Callback callback2) {
        this.i.a(i, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void h(int i) {
        this.i.h(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void g() {
        this.i.g();
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(boolean z) {
        this.i.a(z);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(ReadableMap readableMap, Callback callback) {
        this.i.a(readableMap, callback);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, boolean z) {
        this.i.a(i, z);
    }

    @Override // com.facebook.react.uimanager.as
    public final void h() {
        this.i.h();
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, int i2, @Nullable ReadableArray readableArray) {
        this.i.a(i, i2, readableArray);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, String str, @Nullable ReadableArray readableArray) {
        this.i.a(i, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.i.a(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void i() {
        this.i.i();
    }

    @Override // com.facebook.react.uimanager.as
    public final void c(int i, int i2) {
        this.i.c(i, i2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void j() {
        this.i.j();
    }

    @Override // com.facebook.react.uimanager.as
    public final void k() {
        this.i.k();
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(@Nullable com.facebook.react.uimanager.debug.a aVar) {
        this.i.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void a(af afVar) {
        this.i.a(afVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void b(af afVar) {
        this.i.b(afVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.as
    public final void a(af afVar, float f, float f2) {
        this.i.a(afVar, f, f2);
    }

    @Override // com.facebook.react.uimanager.as
    public final void a(ar arVar) {
        this.i.a(arVar);
    }

    @Override // com.facebook.react.uimanager.as
    public final void b(ar arVar) {
        this.i.b(arVar);
    }

    @Override // com.facebook.react.uimanager.as
    public final int i(int i) {
        return this.i.i(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.as
    public final void a(List<ViewManager> list) {
        this.i.a(list);
    }

    @Override // com.facebook.react.uimanager.as
    @Deprecated
    public final View j(int i) {
        return this.i.j(i);
    }
}
