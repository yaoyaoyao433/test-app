package com.facebook.react.uimanager;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.Set;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends NativeViewHierarchyManager {
    NativeViewHierarchyManager a;
    private final SparseArray<View> b;
    private final SparseArray<ViewManager> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public k(NativeViewHierarchyManager nativeViewHierarchyManager) {
        super(null, null);
        this.a = nativeViewHierarchyManager;
        this.b = new SparseArray<>();
        this.c = new SparseArray<>();
    }

    public final void a(String str, View view, @Nullable int[] iArr, @Nullable az[] azVarArr, @Nullable int[] iArr2, @Nullable int[] iArr3) {
        int i;
        int[] iArr4 = iArr;
        az[] azVarArr2 = azVarArr;
        final int id = view.getId();
        final Set<Integer> b = b(id);
        final ViewGroup viewGroup = (ViewGroup) view;
        final ViewGroupManager viewGroupManager = (ViewGroupManager) this.a.g().a(str);
        if (viewGroup == null) {
            throw new i("Trying to manageChildren view with tag " + view.getId() + " which doesn't exist\n detail: " + a(viewGroup, viewGroupManager, iArr4, azVarArr2, iArr2));
        }
        int childCount = viewGroupManager.getChildCount(viewGroup);
        if (iArr4 != null) {
            int length = iArr4.length - 1;
            while (length >= 0) {
                int i2 = iArr4[length];
                if (i2 < 0) {
                    throw new i("Trying to remove a negative view index:" + i2 + " view tag: " + id + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, azVarArr2, iArr2));
                } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                    if (this.a.i().get(id) && viewGroupManager.getChildCount(viewGroup) == 0) {
                        return;
                    }
                    throw new i("Trying to remove a view index above child count " + i2 + " view tag: " + id + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, azVarArr2, iArr2));
                } else if (i2 >= childCount) {
                    throw new i("Trying to remove an out of order view index:" + i2 + " view tag: " + id + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, azVarArr2, iArr2));
                } else {
                    View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                    if (!this.a.e() || !this.a.j().a(childAt) || !a(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, i2);
                    }
                    length--;
                    childCount = i2;
                }
            }
        }
        if (iArr2 != null) {
            int i3 = 0;
            while (i3 < iArr2.length) {
                int i4 = iArr2[i3];
                final View view2 = this.a.h().get(i4);
                if (view2 == null) {
                    throw new i("Trying to destroy unknown view tag: " + i4 + "\n detail: " + a(viewGroup, viewGroupManager, iArr, azVarArr, iArr2));
                }
                if (this.a.e() && this.a.j().a(view2)) {
                    b.add(Integer.valueOf(i4));
                    i = i3;
                    this.a.j().a(view2, new com.facebook.react.uimanager.layoutanimation.f() { // from class: com.facebook.react.uimanager.k.1
                        @Override // com.facebook.react.uimanager.layoutanimation.f
                        public final void a() {
                            viewGroupManager.removeView(viewGroup, view2);
                            k.this.b(view2);
                            b.remove(Integer.valueOf(view2.getId()));
                            if (b.isEmpty()) {
                                k.this.f().remove(Integer.valueOf(id));
                            }
                        }
                    });
                } else {
                    i = i3;
                    b(view2);
                }
                i3 = i + 1;
                iArr4 = iArr;
                azVarArr2 = azVarArr;
            }
        }
        int[] iArr5 = iArr4;
        az[] azVarArr3 = azVarArr2;
        if (azVarArr3 != null) {
            for (az azVar : azVarArr3) {
                View view3 = azVar.d == null ? null : azVar.d.get();
                if (view3 == null) {
                    throw new i("Trying to add unknown view tag: " + azVar.b + "\n detail: " + a(viewGroup, viewGroupManager, iArr5, azVarArr3, iArr2));
                }
                int i5 = azVar.c;
                if (!b.isEmpty()) {
                    i5 = 0;
                    int i6 = 0;
                    while (i5 < viewGroup.getChildCount() && i6 != azVar.c) {
                        if (!b.contains(Integer.valueOf(viewGroup.getChildAt(i5).getId()))) {
                            i6++;
                        }
                        i5++;
                    }
                }
                viewGroupManager.addView(viewGroup, view3, i5);
            }
        }
        if (b.isEmpty()) {
            this.a.f().remove(Integer.valueOf(id));
        }
    }

    public final void a(View view) {
        UiThreadUtil.assertOnUiThread();
        b(view);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, View view) {
        View d;
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            d = view.findViewById(i);
        } else {
            d = d(i);
        }
        View view2 = d;
        if (view2 == null) {
            return;
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        ViewParent parent = view2.getParent();
        if (parent instanceof aj) {
            parent.requestLayout();
        }
        a(view2, i2, i3, i4, i5);
    }

    public final void a(int i) {
        this.b.remove(i);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, ag agVar) {
        this.a.a(i, agVar);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, Object obj) {
        this.a.a(i, obj);
    }

    public final void b(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        try {
            if (this.c.get(i) == null) {
                return;
            }
            ViewManager e = e(i);
            if (this.b.get(i) == null) {
                return;
            }
            View d = d(i);
            if (e == null || d == null) {
                return;
            }
            e.updateExtraData(d, obj);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[NativeViewHierarchyManager@updateViewExtraData]", null, th);
        }
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.a(i, i2, i3, i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(View view, int i, int i2, int i3, int i4) {
        this.a.a(view, i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(ao aoVar, int i, String str, @Nullable ag agVar) {
        this.a.a(aoVar, i, str, agVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final Set<Integer> b(int i) {
        return this.a.b(i);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
        this.a.a(i, iArr, ayVarArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final boolean a(@Nullable int[] iArr, int i) {
        return this.a.a(iArr, i);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, View view) {
        this.a.a(i, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void b(View view) {
        this.a.b(view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void c(int i) {
        this.a.c(i);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, int[] iArr) {
        this.a.a(i, iArr);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void b(int i, int[] iArr) {
        this.a.b(i, iArr);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final int a(int i, float f, float f2) {
        return this.a.a(i, f, f2);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, int i2, boolean z) {
        this.a.a(i, i2, z);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a() {
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(ReadableMap readableMap, Callback callback) {
        this.a.a(readableMap, callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void b() {
        this.a.b();
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, int i2, @Nullable ReadableArray readableArray) {
        this.a.a(i, i2, readableArray);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, String str, @Nullable ReadableArray readableArray) {
        this.a.a(i, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.a.a(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void c() {
        this.a.c();
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final int d() {
        return this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final boolean e() {
        return this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final HashMap<Integer, Set<Integer>> f() {
        return this.a.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final bd g() {
        return this.a.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final SparseArray<View> h() {
        return this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final SparseBooleanArray i() {
        return this.a.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final com.facebook.react.uimanager.layoutanimation.e j() {
        return this.a.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final com.facebook.react.touch.a k() {
        return this.a.k();
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final View d(int i) {
        View view = this.b.get(i);
        return view == null ? this.a.d(i) : view;
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public final ViewManager e(int i) {
        ViewManager viewManager = this.c.get(i);
        return viewManager == null ? this.a.e(i) : viewManager;
    }

    public final View a(ao aoVar, int i, String str, @Nullable ag agVar, Object obj) {
        View view = null;
        try {
            ViewManager a = this.a.g().a(str);
            View createView = a.createView(aoVar, null, null, this.a.k());
            try {
                createView.setId(i);
                if (agVar != null) {
                    a.updateProperties(createView, agVar);
                }
                if (obj != null) {
                    a.updateExtraData(createView, obj);
                }
                this.c.put(i, a);
                this.b.put(i, createView);
                return createView;
            } catch (Throwable th) {
                th = th;
                view = createView;
                try {
                    Log.e("NVHierarchyManager", "[NativeViewHierarchyManager@createViewSync] : " + Log.getStackTraceString(th));
                } catch (Throwable unused) {
                }
                return view;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(int i, String str, @Nullable ag agVar, View view, Object obj) {
        try {
            ViewManager a = this.a.g().a(str);
            if (view != null) {
                view.setId(i);
            }
            if (agVar != null) {
                a.updateProperties(view, agVar);
            }
            if (obj != null) {
                a.updateExtraData(view, obj);
            }
        } catch (Throwable th) {
            Log.e("NVHierarchyManager", "[NativeViewHierarchyManager@bindViewSync]  : " + Log.getStackTraceString(th));
        }
    }
}
