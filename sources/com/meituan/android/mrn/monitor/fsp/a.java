package com.meituan.android.mrn.monitor.fsp;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.react.ReactRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    final Map<Long, List<C0291a>> c;
    final Map<Integer, C0291a> d;
    long e;
    private WeakReference<ReactRootView> f;

    public a(ReactRootView reactRootView) {
        Object[] objArr = {reactRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa59cae45567ab8d40df616affc89467", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa59cae45567ab8d40df616affc89467");
            return;
        }
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        if (reactRootView == null) {
            return;
        }
        this.f = new WeakReference<>(reactRootView);
        b = a(reactRootView.getContext());
    }

    public final void a(Map<Integer, Rect> map, long j, boolean z, boolean z2) {
        Object[] objArr = {map, new Long(j), (byte) 0, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a00433507e4dce03446c2541321f071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a00433507e4dce03446c2541321f071");
        } else if (a() && map.size() > 0 && this.f != null && this.f.get() != null) {
            List<C0291a> list = this.c.get(Long.valueOf(j));
            if (list == null) {
                list = new ArrayList<>();
                this.c.put(Long.valueOf(j), list);
            }
            for (Map.Entry<Integer, Rect> entry : map.entrySet()) {
                C0291a c0291a = new C0291a();
                c0291a.a = entry.getKey().intValue();
                c0291a.b = entry.getValue();
                c0291a.c = j;
                c0291a.d = false;
                list.add(c0291a);
                this.d.put(entry.getKey(), c0291a);
            }
            this.f.get().invalidate();
        }
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3355df42f96687bbc225e1a644d83d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3355df42f96687bbc225e1a644d83d5")).booleanValue();
        }
        try {
            return com.meituan.android.mrn.common.b.a(context, "fsp_dev_enable", false).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ba5cb5c32575d88c7365d07bb558d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ba5cb5c32575d88c7365d07bb558d6")).booleanValue() : b && !com.meituan.android.mrn.debug.a.c();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.monitor.fsp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0291a {
        public int a;
        public Rect b;
        public long c;
        public boolean d;
        public long e;

        public C0291a() {
        }
    }
}
