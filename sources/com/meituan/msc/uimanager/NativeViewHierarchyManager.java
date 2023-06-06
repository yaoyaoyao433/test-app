package com.meituan.msc.uimanager;

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
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.SoftAssertions;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.msiviews.MSIViewManager;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ProGuard */
@NotThreadSafe
/* loaded from: classes3.dex */
public class NativeViewHierarchyManager {
    public static ChangeQuickRedirect a;
    public static final AtomicLong f = new AtomicLong();
    final SparseArray<View> b;
    final com.meituan.msc.uimanager.layoutanimation.e c;
    boolean d;
    PopupMenu e;
    private final SparseArray<as> g;
    private final SparseBooleanArray h;
    private final av i;
    private final com.meituan.msc.touch.a j;
    private final RNRootViewManager k;
    private final RectF l;
    private boolean m;
    private HashMap<Integer, Set<Integer>> n;
    private Map<String, Map<String, Integer>> o;

    public NativeViewHierarchyManager(av avVar) {
        this(avVar, new RNRootViewManager());
        Object[] objArr = {avVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d5f6c1d2b53f11061c11d62509e8494", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d5f6c1d2b53f11061c11d62509e8494");
        }
    }

    private NativeViewHierarchyManager(av avVar, RNRootViewManager rNRootViewManager) {
        Object[] objArr = {avVar, rNRootViewManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84c78f077d30f85003f94e5b1a4701fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84c78f077d30f85003f94e5b1a4701fc");
            return;
        }
        this.j = new com.meituan.msc.touch.a();
        this.c = new com.meituan.msc.uimanager.layoutanimation.e();
        this.l = new RectF();
        this.m = false;
        this.o = new HashMap();
        this.i = avVar;
        this.b = new SparseArray<>();
        this.g = new SparseArray<>();
        this.h = new SparseBooleanArray();
        this.k = rNRootViewManager;
        this.m = this instanceof com.meituan.msc.uimanager.rlist.c;
    }

    public final synchronized View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f5327b0f1ea5f204a8a09b1dcd941ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f5327b0f1ea5f204a8a09b1dcd941ab");
        }
        View view = this.b.get(i);
        if (view == null) {
            com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@resolveView]", "Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized View b(int i) {
        View findViewById;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34988a7925e4e6976e41f61bbf07ff8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34988a7925e4e6976e41f61bbf07ff8");
        }
        View a2 = a(i);
        if (a2 == null) {
            com.meituan.msc.modules.reporter.g.a("[NativeViewHierarchyManager@findMsiView]", "msi view null!,id = " + i);
            return null;
        }
        boolean z = a2 instanceof com.meituan.msc.mmpviews.msiviews.b;
        ViewGroup viewGroup = a2;
        if (z) {
            viewGroup = a2;
            if (e(i) instanceof MSIViewManager) {
                MSIViewManager mSIViewManager = (MSIViewManager) e(i);
                ViewGroup viewGroup2 = (ViewGroup) a2;
                Object[] objArr2 = {viewGroup2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = MSIViewManager.a;
                if (PatchProxy.isSupport(objArr2, mSIViewManager, changeQuickRedirect2, false, "ecec70e74584248a0e1584e5af243ed3", RobustBitConfig.DEFAULT_VALUE)) {
                    findViewById = (View) PatchProxy.accessDispatch(objArr2, mSIViewManager, changeQuickRedirect2, false, "ecec70e74584248a0e1584e5af243ed3");
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getChildAt(0);
                    if (viewGroup3 == null) {
                        viewGroup = null;
                    } else if (viewGroup3.getId() == i) {
                        viewGroup = viewGroup3;
                    } else {
                        findViewById = viewGroup3.findViewById(i);
                    }
                }
                viewGroup = findViewById;
            }
        }
        return viewGroup;
    }

    public final synchronized boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bfed920af46ebe6d785fc6c257bf3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bfed920af46ebe6d785fc6c257bf3f")).booleanValue();
        }
        return this.b.indexOfKey(i) >= 0;
    }

    private synchronized as e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7824e37e055424abe3c9f450886d94", RobustBitConfig.DEFAULT_VALUE)) {
            return (as) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7824e37e055424abe3c9f450886d94");
        }
        as asVar = this.g.get(i);
        if (asVar == null) {
            com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@resolveViewManager]", "ViewManager for tag " + i + " could not be found.\n");
        }
        return asVar;
    }

    public final synchronized void a(int i, String str, ab abVar) {
        Object[] objArr = {Integer.valueOf(i), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b154dd6556dfbf20ac55f9ad7cc236c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b154dd6556dfbf20ac55f9ad7cc236c8");
            return;
        }
        a("update_view_properties", i, str);
        UiThreadUtil.assertOnUiThread();
        try {
            as e = e(i);
            View a2 = a(i);
            if (abVar != null) {
                if (e == null || a2 == null) {
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@updateProperties]", "viewToUpdate: " + a2 + ",viewManager" + e);
                } else {
                    e.a(i, (int) a2, abVar);
                }
            }
        } catch (g e2) {
            com.meituan.msc.modules.reporter.g.b("NVHierarchyManager", e2, "Unable to update properties for view tag " + i);
        }
        b("update_view_properties", i, str);
    }

    public final synchronized void a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d509b148fe0bebdabd07b9dee1db6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d509b148fe0bebdabd07b9dee1db6f");
            return;
        }
        a("UI-UpdateViewExtraData", i);
        UiThreadUtil.assertOnUiThread();
        as e = e(i);
        View a2 = a(i);
        if (e != null && a2 != null) {
            e.a((as) a2, obj);
        }
        b("UI-UpdateViewExtraData", i);
    }

    public final synchronized void a(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b17497b56abada45fd0b141a2e9bb44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b17497b56abada45fd0b141a2e9bb44");
            return;
        }
        a("UI-UpdateLayoutOperation", i2, str);
        UiThreadUtil.assertOnUiThread();
        com.meituan.msc.systrace.b.a(0L, "NativeViewHierarchyManager_updateLayout");
        View a2 = a(i2);
        if (a2 != null) {
            a2.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = a2.getParent();
            if (parent instanceof ad) {
                parent.requestLayout();
            }
            if (!this.h.get(i)) {
                as asVar = this.g.get(i);
                f fVar = null;
                if (asVar instanceof f) {
                    fVar = (f) asVar;
                } else {
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@updateLayout]", "Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                }
                if (fVar != null && !fVar.h()) {
                    a(a2, i3, i4, i5, i6);
                }
            } else {
                a(a2, i3, i4, i5, i6);
            }
            com.meituan.msc.systrace.a.a(0L);
            b("UI-UpdateLayoutOperation", i2, str);
            return;
        }
        com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@updateLayout]", "viewToUpdate is null");
        com.meituan.msc.systrace.a.a(0L);
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82220a578898f9cfc13cf9ecc1ee30db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82220a578898f9cfc13cf9ecc1ee30db");
        } else if (this.d && this.c.a(view)) {
            this.c.a(view, i, i2, i3, i4);
        } else {
            view.layout(i, i2, i + i3, i2 + i4);
        }
    }

    public synchronized void a(ThemedReactContext themedReactContext, int i, String str, @Nullable ab abVar) {
        View a2;
        Object[] objArr = {themedReactContext, Integer.valueOf(i), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e0d5c88b1c9f0097f6a42a97e13b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e0d5c88b1c9f0097f6a42a97e13b36");
            return;
        }
        f.incrementAndGet();
        a("create_view_tree", i, str);
        UiThreadUtil.assertOnUiThread();
        com.meituan.msc.systrace.b.a(0L, "NativeViewHierarchyManager_createView");
        as a3 = this.i.a(str);
        com.meituan.msc.touch.a aVar = this.j;
        Object[] objArr2 = {Integer.valueOf(i), themedReactContext, abVar, null, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = as.h;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "9bb64f3df1506f3d67a23cca2cdeebb8", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (View) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "9bb64f3df1506f3d67a23cca2cdeebb8");
        } else {
            a2 = a3.a(i, themedReactContext, abVar, null);
            if (a2 instanceof com.meituan.msc.touch.d) {
                ((com.meituan.msc.touch.d) a2).setOnInterceptTouchEventListener(aVar);
            }
        }
        this.b.put(i, a2);
        this.g.put(i, a3);
        a2.setId(i);
        if (abVar != null) {
            a3.a(i, (int) a2, abVar);
        }
        com.meituan.msc.systrace.a.a(0L);
        b("create_view_tree", i, str);
    }

    private static String a(ViewGroup viewGroup, e eVar, @Nullable int[] iArr, @Nullable aq[] aqVarArr, @Nullable int[] iArr2) {
        Object[] objArr = {viewGroup, eVar, iArr, aqVarArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f18efed9fe90f0792a03adb0c805a0bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f18efed9fe90f0792a03adb0c805a0bd");
        }
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + eVar.b(viewGroup) + "): [\n");
            for (int i = 0; i < eVar.b(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 < eVar.b(viewGroup) && i2 < 16) {
                        sb.append(eVar.a((e) viewGroup, i3).getId() + CommonConstant.Symbol.COMMA);
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
        if (aqVarArr != null) {
            sb.append("  viewsToAdd(" + aqVarArr.length + "): [\n");
            for (int i7 = 0; i7 < aqVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < aqVarArr.length && i8 < 16) {
                        sb.append("[" + aqVarArr[i9].d + CommonConstant.Symbol.COMMA + aqVarArr[i9].c + "],");
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

    public final synchronized void a(final int i, @Nullable int[] iArr, @Nullable aq[] aqVarArr, @Nullable int[] iArr2) {
        Set<Integer> set;
        int i2;
        char c = 0;
        Object[] objArr = {Integer.valueOf(i), iArr, aqVarArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd9ccc413beeae26cd2451ecece2dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd9ccc413beeae26cd2451ecece2dcc");
            return;
        }
        a("UI-ManageChildrenOperation", i);
        UiThreadUtil.assertOnUiThread();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "219ff6cf604ecc12465d270534258161", RobustBitConfig.DEFAULT_VALUE)) {
            set = (Set) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "219ff6cf604ecc12465d270534258161");
        } else {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            if (!this.n.containsKey(Integer.valueOf(i))) {
                this.n.put(Integer.valueOf(i), new HashSet());
            }
            set = this.n.get(Integer.valueOf(i));
        }
        final Set<Integer> set2 = set;
        final ViewGroup viewGroup = (ViewGroup) this.b.get(i);
        final e eVar = (e) e(i);
        if (viewGroup == null) {
            com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", "Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + a((ViewGroup) null, eVar, iArr, aqVarArr, iArr2));
            return;
        }
        int b = eVar.b(viewGroup);
        if (iArr != null) {
            int i3 = 1;
            int length = iArr.length - 1;
            while (length >= 0) {
                int i4 = iArr[length];
                if (i4 < 0) {
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = "Trying to remove a negative view index:" + i4 + " view tag: " + i + "\n detail: " + a(viewGroup, eVar, iArr, aqVarArr, iArr2);
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", objArr3);
                } else if (i4 >= eVar.b(viewGroup)) {
                    if (this.h.get(i) && eVar.b(viewGroup) == 0) {
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", "Trying to remove a view index above child count " + i4 + " view tag: " + i + "\n detail: " + a(viewGroup, eVar, iArr, aqVarArr, iArr2));
                } else {
                    if (i4 >= b) {
                        com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", "Trying to remove an out of order view index:" + i4 + " view tag: " + i + "\n detail: " + a(viewGroup, eVar, iArr, aqVarArr, iArr2));
                    }
                    View a2 = eVar.a((e) viewGroup, i4);
                    if (!this.d || !this.c.a(a2) || !a(iArr2, a2.getId())) {
                        eVar.b(viewGroup, i4);
                    }
                    b = i4;
                }
                length--;
                i3 = 1;
            }
        }
        if (iArr2 != null) {
            int i5 = 0;
            while (i5 < iArr2.length) {
                int i6 = iArr2[i5];
                final View view = this.b.get(i6);
                if (view == null) {
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = "Trying to destroy unknown view tag: " + i6 + "\n detail: " + a(viewGroup, eVar, iArr, aqVarArr, iArr2);
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", objArr4);
                    i2 = i5;
                } else if (this.d && this.c.a(view)) {
                    set2.add(Integer.valueOf(i6));
                    final com.meituan.msc.uimanager.layoutanimation.e eVar2 = this.c;
                    i2 = i5;
                    final com.meituan.msc.uimanager.layoutanimation.f fVar = new com.meituan.msc.uimanager.layoutanimation.f() { // from class: com.meituan.msc.uimanager.NativeViewHierarchyManager.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.uimanager.layoutanimation.f
                        public final void a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect3, false, "424c7d723004c78e20eb5f99bddff490", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect3, false, "424c7d723004c78e20eb5f99bddff490");
                                return;
                            }
                            UiThreadUtil.assertOnUiThread();
                            eVar.a((e) viewGroup, view);
                            NativeViewHierarchyManager.this.a(view);
                            set2.remove(Integer.valueOf(view.getId()));
                            if (set2.isEmpty()) {
                                NativeViewHierarchyManager.this.n.remove(Integer.valueOf(i));
                            }
                        }
                    };
                    Object[] objArr5 = {view, fVar};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.uimanager.layoutanimation.e.a;
                    if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect3, false, "245b48007ae2e588e4182db6b62a3464", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, eVar2, changeQuickRedirect3, false, "245b48007ae2e588e4182db6b62a3464");
                    } else {
                        UiThreadUtil.assertOnUiThread();
                        Animation b2 = eVar2.d.b(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
                        if (b2 != null) {
                            eVar2.b(view);
                            b2.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.msc.uimanager.layoutanimation.e.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation) {
                                    Object[] objArr6 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect4, false, "4f5a49b8dd9f3e9aae340570d52c8cec", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect4, false, "4f5a49b8dd9f3e9aae340570d52c8cec");
                                    } else {
                                        fVar.a();
                                    }
                                }
                            });
                            long duration = b2.getDuration();
                            if (duration > eVar2.g) {
                                eVar2.a(duration);
                                eVar2.g = duration;
                            }
                            view.startAnimation(b2);
                        } else {
                            fVar.a();
                        }
                    }
                } else {
                    i2 = i5;
                    a(view);
                }
                i5 = i2 + 1;
                c = 0;
            }
        }
        if (aqVarArr != null) {
            for (aq aqVar : aqVarArr) {
                View view2 = this.b.get(aqVar.c);
                if (view2 == null) {
                    com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@manageChildren]", "Trying to add unknown view tag: " + aqVar.c + "\n detail: " + a(viewGroup, eVar, iArr, aqVarArr, iArr2));
                } else {
                    int i7 = aqVar.d;
                    if (!set2.isEmpty()) {
                        i7 = 0;
                        int i8 = 0;
                        while (i7 < viewGroup.getChildCount() && i8 != aqVar.d) {
                            if (!set2.contains(Integer.valueOf(viewGroup.getChildAt(i7).getId()))) {
                                i8++;
                            }
                            i7++;
                        }
                    }
                    eVar.a(viewGroup, view2, i7);
                }
            }
        }
        if (set2.isEmpty()) {
            this.n.remove(Integer.valueOf(i));
        }
        b("UI-ManageChildrenOperation", i);
    }

    private boolean a(@Nullable int[] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "696872727074522a2f97fe1246014603", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "696872727074522a2f97fe1246014603")).booleanValue();
        }
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

    public final synchronized void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb23f26b1e2476be86a9430fff93f99b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb23f26b1e2476be86a9430fff93f99b");
        } else {
            b(i, view);
        }
    }

    private synchronized void b(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ae6bc819cb73dad127251d149784c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ae6bc819cb73dad127251d149784c0");
            return;
        }
        if (view.getId() != -1) {
            com.meituan.msc.modules.reporter.g.d("[NativeViewHierarchyManager@addRootViewGroup]", String.valueOf(i));
            view.setId(-1);
        }
        this.b.put(i, view);
        this.g.put(i, this.k);
        this.h.put(i, true);
        view.setId(i);
        com.meituan.msc.modules.reporter.g.d("[NativeViewHierarchyManager@addRootViewGroup]", String.format(Locale.getDefault(), "tag: %d, rootView: %s", Integer.valueOf(i), view));
    }

    public final synchronized void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9177194e1e20aca3301500ff291f6567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9177194e1e20aca3301500ff291f6567");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (this.g.get(view.getId()) == null) {
            return;
        }
        if (!this.h.get(view.getId())) {
            as e = e(view.getId());
            if (e != null) {
                e.b(view);
            } else {
                com.meituan.msc.modules.reporter.g.d("[NativeViewHierarchyManager@dropView]", view.getClass().getSimpleName() + "@" + view.getId());
            }
        }
        as asVar = this.g.get(view.getId());
        if ((view instanceof ViewGroup) && (asVar instanceof e)) {
            ViewGroup viewGroup = (ViewGroup) view;
            e eVar = (e) asVar;
            for (int b = eVar.b(viewGroup) - 1; b >= 0; b--) {
                View a2 = eVar.a((e) viewGroup, b);
                if (a2 == null) {
                    com.meituan.msc.modules.reporter.g.a("NVHierarchyManager", "Unable to drop null child view");
                } else if (this.b.get(a2.getId()) != null) {
                    a(a2);
                }
            }
            eVar.c(viewGroup);
        }
        b(view);
    }

    public void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7fc22402384d333bf145a21a4f9d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7fc22402384d333bf145a21a4f9d90");
            return;
        }
        this.b.remove(view.getId());
        this.g.remove(view.getId());
    }

    public final synchronized void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80556728594e3365ceba67101447149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80556728594e3365ceba67101447149");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("[NativeViewHierarchyManager@removeRootView]", "rootViewTag: " + i);
        UiThreadUtil.assertOnUiThread();
        if (!this.h.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        View view = this.b.get(i);
        a(view);
        this.h.delete(i);
        com.meituan.msc.modules.reporter.g.d("[NativeViewHierarchyManager@removeRootView]", "rootView: " + view);
    }

    public final synchronized void a(int i, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cdfd7792d4dd84772f46a8324141f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cdfd7792d4dd84772f46a8324141f7f");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            throw new o("No native view for " + i + " currently exists");
        }
        View view2 = (View) ae.a(view);
        if (view2 == null) {
            throw new o("Native view " + i + " is no longer on screen");
        }
        a(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        a(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    private void a(View view, int[] iArr) {
        Object[] objArr = {view, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb65455e16eb3c040bb110954137252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb65455e16eb3c040bb110954137252");
            return;
        }
        this.l.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        a(view, this.l);
        iArr[0] = Math.round(this.l.left);
        iArr[1] = Math.round(this.l.top);
        iArr[2] = Math.round(this.l.right - this.l.left);
        iArr[3] = Math.round(this.l.bottom - this.l.top);
    }

    private void a(View view, RectF rectF) {
        Object[] objArr = {view, rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac17b6628162520350931b27469287a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac17b6628162520350931b27469287a5");
            return;
        }
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

    public final synchronized void b(int i, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e00db8c655f4b29f6b2760698afe05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e00db8c655f4b29f6b2760698afe05");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            throw new o("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - com.meituan.msc.utils.d.a(view.getContext());
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public final synchronized int a(int i, float f2, float f3) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30cf16e3f48bf6172dfea803c100810f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30cf16e3f48bf6172dfea803c100810f")).intValue();
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return ak.a(f2, f3, (ViewGroup) view);
    }

    public final synchronized Object[] a(ReadableArray readableArray, ReadableMap readableMap) {
        Object[] objArr = {readableArray, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb64f30cafe0793b66214ebd4e20403b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb64f30cafe0793b66214ebd4e20403b");
        }
        UiThreadUtil.assertOnUiThread();
        if (this.h.size() <= 0) {
            return null;
        }
        View view = this.b.get(this.h.keyAt(0));
        if (view == null) {
            return null;
        }
        Object[] objArr2 = new Object[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            View view2 = this.b.get(readableArray.getInt(i));
            if (view2 != null) {
                objArr2[i] = af.a(view, view2, readableMap);
            }
        }
        return objArr2;
    }

    public final synchronized Object[] a(ReadableMap readableMap) {
        WritableMap writableMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4abc06af470cc1796033815cc8975a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4abc06af470cc1796033815cc8975a");
        }
        UiThreadUtil.assertOnUiThread();
        if (this.h.size() == 1) {
            View view = this.b.get(this.h.keyAt(0));
            if (view == null) {
                return null;
            }
            Object[] objArr2 = new Object[1];
            Object[] objArr3 = {view, readableMap};
            ChangeQuickRedirect changeQuickRedirect2 = af.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "edf6c6cc528393a6c878016e20f9883f", RobustBitConfig.DEFAULT_VALUE)) {
                writableMap = (WritableMap) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "edf6c6cc528393a6c878016e20f9883f");
            } else {
                WritableMap createMap = Arguments.createMap();
                if (readableMap.hasKey("rect") && readableMap.getBoolean("rect")) {
                    createMap.putInt("left", 0);
                    createMap.putInt("right", 0);
                    createMap.putInt("top", 0);
                    createMap.putInt("bottom", 0);
                }
                if (readableMap.hasKey(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE) && readableMap.getBoolean(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                    createMap.putInt("width", (int) s.c(view.getWidth()));
                    createMap.putInt("height", (int) s.c(view.getHeight()));
                }
                if (readableMap.hasKey("scrollOffset") && readableMap.getBoolean("scrollOffset")) {
                    createMap.putInt("scrollLeft", (int) s.c(view.getScrollX()));
                    createMap.putInt("scrollTop", (int) s.c(view.getScrollY()));
                }
                writableMap = createMap;
            }
            objArr2[0] = writableMap;
            return objArr2;
        }
        return null;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c530dbe3b64ca1cf0fbb6aa7bd3bd23d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c530dbe3b64ca1cf0fbb6aa7bd3bd23d")).intValue() : this.h.keyAt(0);
    }

    public final synchronized void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399f65f7b2c1c21bef0f23e63fb2e32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399f65f7b2c1c21bef0f23e63fb2e32c");
        } else if (!z) {
            this.j.a(i2, (ViewParent) null);
        } else {
            View view = this.b.get(i);
            if (i2 != i && (view instanceof ViewParent)) {
                this.j.a(i2, (ViewParent) view);
                return;
            }
            if (this.h.get(i)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
            }
            this.j.a(i2, view.getParent());
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d85e566f5e62cf1e0021976f74b3659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d85e566f5e62cf1e0021976f74b3659");
            return;
        }
        com.meituan.msc.touch.a aVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.touch.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ca2fea4d379a828560cede984efd3770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ca2fea4d379a828560cede984efd3770");
            return;
        }
        aVar.b = -1;
        aVar.a();
    }

    @Deprecated
    public final synchronized void a(int i, int i2, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7df4e0bd4cd31a8f2368acde96aaf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7df4e0bd4cd31a8f2368acde96aaf0f");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@dispatchCommand]", "Trying to send command to a non-existing view with tag " + i);
        }
        as e = e(i);
        if (view != null && e != null) {
            e.a((as) view, i2, readableArray);
        }
    }

    public final synchronized void a(int i, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbe718249a5569a87ccc16641147ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbe718249a5569a87ccc16641147ae2");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            com.meituan.msc.modules.reporter.g.e("[NativeViewHierarchyManager@dispatchCommand]", "Trying to send command to a non-existing view with tag [" + i + "] and command " + str);
        }
        as e = e(i);
        if (view != null && e != null) {
            e.a((as) view, str, readableArray);
        }
    }

    public final synchronized void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        ThemedReactContext themedReactContext;
        Object[] objArr = {Integer.valueOf(i), readableArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5239683862942ac30973a1be94629989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5239683862942ac30973a1be94629989");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.b.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5362f8a2686617e9e832aa6c21f12526", RobustBitConfig.DEFAULT_VALUE)) {
            themedReactContext = (ThemedReactContext) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5362f8a2686617e9e832aa6c21f12526");
        } else {
            View view2 = this.b.get(i);
            if (view2 == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
            }
            themedReactContext = (ThemedReactContext) view2.getContext();
        }
        this.e = new PopupMenu(themedReactContext, view);
        Menu menu = this.e.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        a aVar = new a(callback);
        this.e.setOnMenuItemClickListener(aVar);
        this.e.setOnDismissListener(aVar);
        this.e.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements PopupMenu.OnDismissListener, PopupMenu.OnMenuItemClickListener {
        public static ChangeQuickRedirect a;
        public final Callback b;
        public boolean c;

        private a(Callback callback) {
            Object[] objArr = {callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10167990f6f1761148b0505fe914199", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10167990f6f1761148b0505fe914199");
                return;
            }
            this.c = false;
            this.b = callback;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public final void onDismiss(PopupMenu popupMenu) {
            Object[] objArr = {popupMenu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d290296e5d90a33cfe107087301be685", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d290296e5d90a33cfe107087301be685");
            } else if (this.c) {
            } else {
                this.b.invoke("dismissed");
                this.c = true;
            }
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object[] objArr = {menuItem};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8d761484525d9817be3b30e2ecc660", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8d761484525d9817be3b30e2ecc660")).booleanValue();
            }
            if (this.c) {
                return false;
            }
            this.b.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.c = true;
            return true;
        }
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e4f2670c77e0c3df8fae036b249e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e4f2670c77e0c3df8fae036b249e32");
        } else {
            PerfTrace.begin(str).a(i).a("tag", Integer.valueOf(i)).a("isList", Boolean.valueOf(this.m));
        }
    }

    private void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bc4bec3cabc66f497bb5b57a661544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bc4bec3cabc66f497bb5b57a661544");
        } else {
            PerfTrace.end(str).a(i).a("tag", Integer.valueOf(i)).a("isList", Boolean.valueOf(this.m));
        }
    }

    private void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1549207d081754bd15b5320198b09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1549207d081754bd15b5320198b09e");
        } else {
            PerfTrace.begin(str).a(i).a("tag", Integer.valueOf(i)).a("name", str2).a("isList", Boolean.valueOf(this.m));
        }
    }

    private void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32289449d7b4de750ec15e51fe4514d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32289449d7b4de750ec15e51fe4514d");
        } else {
            PerfTrace.end(str).a(i).a("tag", Integer.valueOf(i)).a("name", str2).a("isList", Boolean.valueOf(this.m));
        }
    }
}
