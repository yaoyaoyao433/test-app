package com.meituan.android.mrn.component.list.turbo.data;

import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.event.f;
import com.meituan.android.mrn.component.list.turbo.TurboNode;
import com.meituan.android.mrn.component.list.turbo.data.b;
import com.meituan.android.mrn.component.list.turbo.i;
import com.meituan.android.mrn.component.list.turbo.l;
import com.meituan.android.mrn.component.list.turbo.n;
import com.meituan.android.mrn.component.list.turbo.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public final d<com.meituan.android.mrn.component.list.item.d> b;
    public final d<com.meituan.android.mrn.component.list.item.c> c;
    public final ArrayList<b> d;
    public final SparseArray<View> e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f3ca872739bdebafe59f67a53ed21e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f3ca872739bdebafe59f67a53ed21e");
            return;
        }
        this.b = new d<>();
        this.c = new d<>();
        this.d = new ArrayList<>();
        this.e = new SparseArray<>();
    }

    public final int a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a5063674c5abfd35eb23447ec7a3f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a5063674c5abfd35eb23447ec7a3f0")).intValue();
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            i += it.next().a();
        }
        return i;
    }

    @Nullable
    public final b.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c576e0c0b6e9bb25fa328f5b24c2f3c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c576e0c0b6e9bb25fa328f5b24c2f3c1");
        }
        int a2 = this.b.a();
        if (i < a2) {
            return null;
        }
        int i2 = i - a2;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            b bVar = this.d.get(i3);
            int a3 = bVar.a();
            if (i2 < a3) {
                return bVar.a(i2);
            }
            i2 -= a3;
        }
        return null;
    }

    public final b b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c874aa8150dcb514c181e7c9185b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c874aa8150dcb514c181e7c9185b16");
        }
        int a2 = this.b.a();
        if (i < a2) {
            return new b(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, null, true, "tplcell", Arguments.createArray());
        }
        int i2 = i - a2;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            b bVar = this.d.get(i3);
            int a3 = bVar.a();
            if (i2 < a3) {
                return bVar;
            }
            i2 -= a3;
        }
        return null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb26d8e7bd7454c431d97e09f0f635c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb26d8e7bd7454c431d97e09f0f635c1");
        } else {
            this.d.clear();
        }
    }

    public final int a(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232e72ee229da5ea15289520c3f777a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232e72ee229da5ea15289520c3f777a5")).intValue();
        }
        if (i < 0 || i >= this.d.size()) {
            return 0;
        }
        for (int i4 = i; i4 < i + i2 && i4 < this.d.size(); i4++) {
            i3 += d(i4).a();
        }
        return i3;
    }

    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9a860b09324d17b267fe597f34fee2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9a860b09324d17b267fe597f34fee2")).intValue();
        }
        int min = Math.min(i, this.d.size());
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            i3 += d(i4).a();
        }
        return this.b.a() + i3 + i2;
    }

    public final int c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfe18f7cf26f17134e299d7ca8351f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfe18f7cf26f17134e299d7ca8351f0")).intValue();
        }
        int min = Math.min(i, this.d.size());
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            i3 += d(i4).a();
        }
        b d = d(min);
        if (d != null && d.c) {
            i3++;
        }
        return this.b.a() + i3 + i2;
    }

    public final int[] c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6dcebe53ba834b130aa67d989bedcdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6dcebe53ba834b130aa67d989bedcdc");
        }
        int[] iArr = new int[2];
        int a2 = this.b.a();
        if (i < a2) {
            return null;
        }
        int i2 = i - a2;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            b bVar = this.d.get(i3);
            iArr[0] = i3;
            int a3 = bVar.a();
            if (i2 < a3) {
                if (bVar.c) {
                    i2--;
                }
                iArr[1] = i2;
                return iArr;
            }
            i2 -= a3;
        }
        return null;
    }

    @Nullable
    private b d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b209d0667f0cbcf2775f0a20059c682", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b209d0667f0cbcf2775f0a20059c682");
        }
        if (i < this.d.size()) {
            return this.d.get(i);
        }
        return null;
    }

    public final int a(int i, n nVar, l lVar, ao aoVar, Map<String, TurboNode> map, i iVar, o oVar, f fVar) {
        Object[] objArr = {Integer.valueOf(i), nVar, lVar, aoVar, map, iVar, oVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99729efd0faefb0a6110885e634fd6d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99729efd0faefb0a6110885e634fd6d8")).intValue();
        }
        int a2 = this.b.a();
        if (i < a2) {
            com.meituan.android.mrn.component.list.item.d a3 = this.b.a(i);
            int a4 = oVar.a("template_for_header", String.valueOf(a3.hashCode()));
            this.e.put(a4, a3);
            return a4;
        }
        b.a aVar = null;
        int i2 = i - a2;
        int i3 = 0;
        while (true) {
            if (i3 >= this.d.size()) {
                break;
            }
            b bVar = this.d.get(i3);
            int a5 = bVar.a();
            if (i2 < a5) {
                aVar = bVar.a(i2);
                break;
            }
            i2 -= a5;
            i3++;
        }
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            ReadableMap asMap = aVar.a.asMap();
            ReadableMapKeySetIterator keySetIterator = asMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, asMap.getDynamic(nextKey));
            }
            return oVar.a(com.meituan.android.mrn.component.list.turbo.a.a(hashMap, nVar, lVar, aoVar, map, iVar, fVar, oVar), map.get(aVar.b));
        } else if (i2 < this.c.a()) {
            com.meituan.android.mrn.component.list.item.c a6 = this.c.a(i2);
            int a7 = oVar.a("template_for_footer", String.valueOf(a6.hashCode()));
            this.e.put(a7, a6);
            return a7;
        } else {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.android.mrn.component.list.turbo.data.a a(com.facebook.react.bridge.ReadableArray r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.list.turbo.data.e.a(com.facebook.react.bridge.ReadableArray, int, int):com.meituan.android.mrn.component.list.turbo.data.a");
    }
}
