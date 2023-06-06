package com.dianping.judas.expose;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    public int c;
    public int d;
    LinkedHashMap<WeakReference<View>, String> e;
    Set<String> f;
    LinkedHashMap<WeakReference<View>, String> g;
    a h;
    public boolean i;

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54957a48cc06440928bd4c431b7b3528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54957a48cc06440928bd4c431b7b3528");
            return;
        }
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = new LinkedHashMap<>();
        this.f = new HashSet();
        this.g = new LinkedHashMap<>();
        this.i = true;
        this.h = aVar;
    }

    public final List<String> a(boolean z) {
        int i;
        Iterator<Map.Entry<WeakReference<View>, String>> it;
        boolean z2;
        boolean z3;
        int i2 = 1;
        char c = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d745c42377e7d875ddb50cfb007a2d83", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d745c42377e7d875ddb50cfb007a2d83");
        }
        if (!this.i) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<WeakReference<View>, String>> it2 = this.e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<WeakReference<View>, String> next = it2.next();
            try {
                i = Integer.parseInt(next.getValue().substring(next.getValue().lastIndexOf(CommonConstant.Symbol.UNDERLINE) + i2));
            } catch (NumberFormatException unused) {
                i = Integer.MAX_VALUE;
            }
            if (next.getKey().get() != null) {
                View view = next.getKey().get();
                Object[] objArr2 = new Object[i2];
                objArr2[c] = view;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2585bd399dd282e7058946654f789e8", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2585bd399dd282e7058946654f789e8")).booleanValue();
                } else {
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof View) {
                            Rect rect = new Rect();
                            ((View) parent).getHitRect(rect);
                            if (view.getLocalVisibleRect(rect)) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2 && i >= this.c && i <= this.d) {
                    com.dianping.judas.interfaces.a aVar = this.h.c;
                    View view2 = next.getKey().get();
                    Object[] objArr3 = {aVar, view2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    it = it2;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93f8b4b5ce1d44db84886bd36859eea3", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93f8b4b5ce1d44db84886bd36859eea3")).booleanValue();
                    } else {
                        if (view2 != null && aVar != null) {
                            int a2 = a(view2, i);
                            com.dianping.judas.util.a.a("[isViewOnScreen] view-height: " + view2.getHeight() + " y-axis: " + a2 + " exposeBlockId: " + this.b, new Object[0]);
                            if ((a2 >= 0 || (a2 < 0 && view2.getHeight() + a2 > 0)) && a2 + 0 < aVar.a()) {
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    if (z3) {
                        com.dianping.widget.view.a.a().a(next.getKey().get(), i, Constants.EventType.VIEW, EventName.MGE);
                        arrayList.add(next.getValue());
                    }
                    it2 = it;
                    i2 = 1;
                    c = 0;
                }
            }
            it = it2;
            it2 = it;
            i2 = 1;
            c = 0;
        }
        this.e.clear();
        if (!arrayList.isEmpty()) {
            this.f.addAll(arrayList);
        }
        return arrayList;
    }

    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d57352638e125a0c35fbff3203fb818", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d57352638e125a0c35fbff3203fb818");
        }
        this.e.clear();
        this.e.putAll(this.g);
        List<String> a2 = a(true);
        this.f.clear();
        this.f.addAll(a2);
        return a2;
    }

    private int a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7675af0a3f46a3d28ca7732d541cfab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7675af0a3f46a3d28ca7732d541cfab")).intValue();
        }
        int[] iArr = {0, 0};
        try {
            view.getLocationOnScreen(iArr);
        } catch (Exception unused) {
        }
        com.dianping.judas.util.a.a("[getViewYPos] view-height: " + view.getHeight() + " y-axis: " + iArr[1] + " view-pos: " + i + " exposeBlockId: " + this.b, new Object[0]);
        return iArr[1];
    }
}
