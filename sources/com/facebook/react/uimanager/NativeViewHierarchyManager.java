package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ProGuard */
@NotThreadSafe
/* loaded from: classes.dex */
public class NativeViewHierarchyManager {
    private final SparseArray<View> a;
    private final SparseArray<ViewManager> b;
    private final SparseBooleanArray c;
    private final bd d;
    private final com.facebook.react.touch.a e;
    private final RootViewManager f;
    private final com.facebook.react.uimanager.layoutanimation.e g;
    private final RectF h;
    private boolean i;
    private PopupMenu j;
    private HashMap<Integer, Set<Integer>> k;
    private Map<String, Map<String, Integer>> l;

    public NativeViewHierarchyManager(bd bdVar) {
        this(bdVar, new RootViewManager());
    }

    public NativeViewHierarchyManager(bd bdVar, RootViewManager rootViewManager) {
        this.e = new com.facebook.react.touch.a();
        this.g = new com.facebook.react.uimanager.layoutanimation.e();
        this.h = new RectF();
        this.l = new HashMap();
        this.d = bdVar;
        this.a = new SparseArray<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.f = rootViewManager;
    }

    public synchronized View d(int i) {
        View view;
        view = this.a.get(i);
        if (view == null) {
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@resolveView]", "Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public synchronized ViewManager e(int i) {
        ViewManager viewManager;
        viewManager = this.b.get(i);
        if (viewManager == null) {
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@resolveViewManager]", "ViewManager for tag " + i + " could not be found.\n");
        }
        return viewManager;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public synchronized void a(int i, ag agVar) {
        ViewManager e;
        View d;
        UiThreadUtil.assertOnUiThread();
        try {
            e = e(i);
            d = d(i);
        } catch (i e2) {
            com.facebook.common.logging.a.d("NVHierarchyManager", "Unable to update properties for view tag " + i, e2);
        }
        if (agVar != null) {
            if (e != null && d != null) {
                e.updateProperties(d, agVar);
                return;
            }
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@updateProperties]", "viewToUpdate: " + d + ",viewManager" + e);
        }
    }

    public synchronized void a(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        ViewManager e = e(i);
        View d = d(i);
        if (e != null && d != null) {
            e.updateExtraData(d, obj);
        }
    }

    public synchronized void a(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        com.facebook.systrace.b.a(0L, "NativeViewHierarchyManager_updateLayout");
        View d = d(i2);
        if (d == null) {
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@updateLayout]", "viewToUpdate is null");
            com.facebook.systrace.a.a(0L);
            return;
        }
        d.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        ViewParent parent = d.getParent();
        if (parent instanceof aj) {
            parent.requestLayout();
        }
        if (!this.c.get(i)) {
            ViewManager viewManager = this.b.get(i);
            h hVar = null;
            if (viewManager instanceof h) {
                hVar = (h) viewManager;
            } else {
                com.facebook.common.logging.a.c("[NativeViewHierarchyManager@updateLayout]", "Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
            }
            if (hVar != null && !hVar.needsCustomLayoutForChildren()) {
                a(d, i3, i4, i5, i6);
            }
        } else {
            a(d, i3, i4, i5, i6);
        }
        com.facebook.systrace.a.a(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, int i, int i2, int i3, int i4) {
        if (this.i && this.g.a(view)) {
            final com.facebook.react.uimanager.layoutanimation.e eVar = this.g;
            UiThreadUtil.assertOnUiThread();
            final int id = view.getId();
            com.facebook.react.uimanager.layoutanimation.j jVar = eVar.d.get(id);
            if (jVar != null) {
                jVar.a(i, i2, i3, i4);
                return;
            }
            Animation b = ((view.getWidth() == 0 || view.getHeight() == 0) ? eVar.a : eVar.b).b(view, i, i2, i3, i4);
            if (b instanceof com.facebook.react.uimanager.layoutanimation.j) {
                b.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.e.2
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        eVar.d.put(id, (j) animation);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        eVar.d.remove(id);
                    }
                });
            } else {
                view.layout(i, i2, i3 + i, i4 + i2);
            }
            if (b != null) {
                long duration = b.getDuration();
                if (duration > eVar.f) {
                    eVar.f = duration;
                    eVar.a(duration);
                }
                view.startAnimation(b);
                return;
            }
            return;
        }
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public synchronized void a(ao aoVar, int i, String str, @Nullable ag agVar) {
        UiThreadUtil.assertOnUiThread();
        com.facebook.systrace.b.a(0L, "NativeViewHierarchyManager_createView");
        ViewManager a2 = this.d.a(str);
        View createView = a2.createView(aoVar, null, null, this.e);
        this.a.put(i, createView);
        this.b.put(i, a2);
        createView.setId(i);
        if (agVar != null) {
            a2.updateProperties(createView, agVar);
        }
        com.facebook.systrace.a.a(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(ViewGroup viewGroup, ViewGroupManager viewGroupManager, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 < viewGroupManager.getChildCount(viewGroup) && i2 < 16) {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + CommonConstant.Symbol.COMMA);
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 < iArr.length && i5 < 16) {
                        sb.append(iArr[i6] + CommonConstant.Symbol.COMMA);
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (ayVarArr != null) {
            sb.append("  viewsToAdd(" + ayVarArr.length + "): [\n");
            for (int i7 = 0; i7 < ayVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < ayVarArr.length && i8 < 16) {
                        sb.append("[" + ayVarArr[i9].c + CommonConstant.Symbol.COMMA + ayVarArr[i9].b + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 < iArr2.length && i11 < 16) {
                        sb.append(iArr2[i12] + CommonConstant.Symbol.COMMA);
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<Integer> b(int i) {
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        if (!this.k.containsKey(Integer.valueOf(i))) {
            this.k.put(Integer.valueOf(i), new HashSet());
        }
        return this.k.get(Integer.valueOf(i));
    }

    public synchronized void a(final int i, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
        int i2;
        int[] iArr3 = iArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            final Set<Integer> b = b(i);
            final ViewGroup viewGroup = (ViewGroup) this.a.get(i);
            final ViewGroupManager viewGroupManager = (ViewGroupManager) e(i);
            if (viewGroup == null) {
                com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + a(viewGroup, viewGroupManager, iArr3, ayVarArr, iArr2));
                return;
            }
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr3 != null) {
                for (int length = iArr3.length - 1; length >= 0; length--) {
                    int i3 = iArr3[length];
                    if (i3 < 0) {
                        com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to remove a negative view index:" + i3 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr3, ayVarArr, iArr2));
                    } else if (i3 >= viewGroupManager.getChildCount(viewGroup)) {
                        if (this.c.get(i) && viewGroupManager.getChildCount(viewGroup) == 0) {
                            return;
                        }
                        com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to remove a view index above child count " + i3 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr3, ayVarArr, iArr2));
                    } else {
                        if (i3 >= childCount) {
                            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to remove an out of order view index:" + i3 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr3, ayVarArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i3);
                        if (!this.i || !this.g.a(childAt) || !a(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i3);
                        }
                        childCount = i3;
                    }
                }
            }
            if (iArr2 != null) {
                int i4 = 0;
                while (i4 < iArr2.length) {
                    int i5 = iArr2[i4];
                    final View view = this.a.get(i5);
                    if (view == null) {
                        com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to destroy unknown view tag: " + i5 + "\n detail: " + a(viewGroup, viewGroupManager, iArr3, ayVarArr, iArr2));
                        i2 = i4;
                    } else if (this.i && this.g.a(view)) {
                        b.add(Integer.valueOf(i5));
                        i2 = i4;
                        this.g.a(view, new com.facebook.react.uimanager.layoutanimation.f() { // from class: com.facebook.react.uimanager.NativeViewHierarchyManager.1
                            @Override // com.facebook.react.uimanager.layoutanimation.f
                            public final void a() {
                                UiThreadUtil.assertOnUiThread();
                                viewGroupManager.removeView(viewGroup, view);
                                NativeViewHierarchyManager.this.b(view);
                                b.remove(Integer.valueOf(view.getId()));
                                if (b.isEmpty()) {
                                    NativeViewHierarchyManager.this.k.remove(Integer.valueOf(i));
                                }
                            }
                        });
                    } else {
                        i2 = i4;
                        b(view);
                    }
                    i4 = i2 + 1;
                    iArr3 = iArr;
                }
            }
            if (ayVarArr != null) {
                for (ay ayVar : ayVarArr) {
                    View view2 = this.a.get(ayVar.b);
                    if (view2 == null) {
                        com.facebook.common.logging.a.c("[NativeViewHierarchyManager@manageChildren]", "Trying to add unknown view tag: " + ayVar.b + "\n detail: " + a(viewGroup, viewGroupManager, iArr, ayVarArr, iArr2));
                    } else {
                        int i6 = ayVar.c;
                        if (!b.isEmpty()) {
                            i6 = 0;
                            int i7 = 0;
                            while (i6 < viewGroup.getChildCount() && i7 != ayVar.c) {
                                if (!b.contains(Integer.valueOf(viewGroup.getChildAt(i6).getId()))) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i6);
                    }
                }
            }
            if (b.isEmpty()) {
                this.k.remove(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a(int i, View view) {
        b(i, view);
    }

    private synchronized void b(int i, View view) {
        if (view.getId() != -1) {
            com.facebook.common.logging.a.b("[NativeViewHierarchyManager@addRootViewGroup]", String.valueOf(i));
            view.setId(-1);
        }
        this.a.put(i, view);
        this.b.put(i, this.f);
        this.c.put(i, true);
        view.setId(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void b(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (this.b.get(view.getId()) == null) {
            return;
        }
        if (!this.c.get(view.getId())) {
            ViewManager e = e(view.getId());
            if (e != null) {
                e.onDropViewInstance(view);
            } else {
                com.facebook.common.logging.a.b("[NativeViewHierarchyManager@dropView]", view.getClass().getSimpleName() + "@" + view.getId());
            }
        }
        ViewManager viewManager = this.b.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    com.facebook.common.logging.a.d("NVHierarchyManager", "Unable to drop null child view");
                } else if (this.a.get(childAt.getId()) != null) {
                    b(childAt);
                } else if (com.meituan.android.mrn.horn.f.a().c()) {
                    String name = viewManager.getName();
                    Map<String, Integer> map = this.l.get(name);
                    if (map == null) {
                        map = new HashMap<>();
                        this.l.put(name, map);
                    }
                    map.put(childAt.getClass().getName(), Integer.valueOf(childAt.getId()));
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.a.remove(view.getId());
        this.b.remove(view.getId());
    }

    public synchronized void c(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.c.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        b(this.a.get(i));
        this.c.delete(i);
        if (com.meituan.android.mrn.horn.f.a().c()) {
            if (this.a.size() > 0 && this.l.size() > 0) {
                com.facebook.common.logging.a.d("mTagsToViewsLeak", this.l.toString());
            }
            this.l.clear();
        }
    }

    public synchronized void a(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new u("No native view for " + i + " currently exists");
        }
        View view2 = (View) ak.a(view);
        if (view2 == null) {
            throw new u("Native view " + i + " is no longer on screen");
        }
        a(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        a(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    private void a(View view, int[] iArr) {
        this.h.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        a(view, this.h);
        iArr[0] = Math.round(this.h.left);
        iArr[1] = Math.round(this.h.top);
        iArr[2] = Math.round(this.h.right - this.h.left);
        iArr[3] = Math.round(this.h.bottom - this.h.top);
    }

    private static void a(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void b(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new u("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - com.meituan.android.mrn.utils.ak.a(view.getContext());
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized int a(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.a.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return ap.a(f, f2, (ViewGroup) view);
    }

    public synchronized void a(int i, int i2, boolean z) {
        if (!z) {
            this.e.a(i2, (ViewParent) null);
            return;
        }
        View view = this.a.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.e.a(i2, (ViewParent) view);
            return;
        }
        if (this.c.get(i)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
        }
        this.e.a(i2, view.getParent());
    }

    public void a() {
        com.facebook.react.touch.a aVar = this.e;
        aVar.a = -1;
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ReadableMap readableMap, final Callback callback) {
        final com.facebook.react.uimanager.layoutanimation.e eVar = this.g;
        if (readableMap == null) {
            eVar.a();
            return;
        }
        eVar.e = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        if (readableMap.hasKey(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.CREATE))) {
            eVar.a.a(readableMap.getMap(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.CREATE)), i);
            eVar.e = true;
        }
        if (readableMap.hasKey(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.UPDATE))) {
            eVar.b.a(readableMap.getMap(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.UPDATE)), i);
            eVar.e = true;
        }
        if (readableMap.hasKey(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.DELETE))) {
            eVar.c.a(readableMap.getMap(com.facebook.react.uimanager.layoutanimation.g.a(com.facebook.react.uimanager.layoutanimation.g.DELETE)), i);
            eVar.e = true;
        }
        if (!eVar.e || callback == null) {
            return;
        }
        eVar.g = new Runnable() { // from class: com.facebook.react.uimanager.layoutanimation.e.1
            @Override // java.lang.Runnable
            public final void run() {
                callback.invoke(Boolean.TRUE);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.g.a();
    }

    @Deprecated
    public synchronized void a(int i, int i2, @Nullable ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@dispatchCommand]", "Trying to send command to a non-existing view with tag " + i);
        }
        ViewManager e = e(i);
        if (view != null && e != null) {
            e.receiveCommand((ViewManager) view, i2, readableArray);
        }
    }

    public synchronized void a(int i, String str, @Nullable ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            com.facebook.common.logging.a.c("[NativeViewHierarchyManager@dispatchCommand]", "Trying to send command to a non-existing view with tag [" + i + "] and command " + str);
        }
        ViewManager e = e(i);
        if (view != null && e != null) {
            e.receiveCommand((ViewManager) view, str, readableArray);
        }
    }

    public synchronized void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        View view2 = this.a.get(i);
        if (view2 != null) {
            this.j = new PopupMenu((ao) view2.getContext(), view);
            Menu menu = this.j.getMenu();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                menu.add(0, 0, i2, readableArray.getString(i2));
            }
            a aVar = new a(callback);
            this.j.setOnMenuItemClickListener(aVar);
            this.j.setOnDismissListener(aVar);
            this.j.show();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public void c() {
        if (this.j != null) {
            this.j.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements PopupMenu.OnDismissListener, PopupMenu.OnMenuItemClickListener {
        final Callback a;
        boolean b;

        private a(Callback callback) {
            this.b = false;
            this.a = callback;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public final void onDismiss(PopupMenu popupMenu) {
            if (this.b) {
                return;
            }
            this.a.invoke("dismissed");
            this.b = true;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (this.b) {
                return false;
            }
            this.a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.b = true;
            return true;
        }
    }

    public void a(int i, int i2) {
        View view = this.a.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        view.sendAccessibilityEvent(i2);
    }

    public int d() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HashMap<Integer, Set<Integer>> f() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bd g() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SparseArray<View> h() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SparseBooleanArray i() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.react.uimanager.layoutanimation.e j() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.react.touch.a k() {
        return this.e;
    }
}
