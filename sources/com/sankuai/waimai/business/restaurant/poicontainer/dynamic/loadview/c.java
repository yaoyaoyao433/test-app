package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview;

import android.os.Handler;
import android.support.annotation.LayoutRes;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.a;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Runnable {
    public static ChangeQuickRedirect a;
    public b b;
    private LayoutInflater c;
    private a d;
    private SparseArray<ConcurrentLinkedQueue<View>> e;
    private SparseIntArray f;
    private boolean g;
    private Handler h;
    private a.c i;

    public final View a(@LayoutRes int i) {
        View inflate;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16cebf6dec4a0dd154ebd381285a8464", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16cebf6dec4a0dd154ebd381285a8464");
        }
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.e.get(i);
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            inflate = concurrentLinkedQueue.remove();
        } else {
            inflate = this.c.inflate(i, (ViewGroup) null);
        }
        if (b(i)) {
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26d49d78f612734175e9085887c7ba03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26d49d78f612734175e9085887c7ba03");
            } else if (!this.g) {
                this.g = true;
                this.h.postDelayed(this, this.b.d());
            }
        }
        return inflate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.C0841a acquire;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a41a2811ec1663154b3259ae66040a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a41a2811ec1663154b3259ae66040a6");
            return;
        }
        int i = 0;
        boolean z = false;
        while (i < this.b.a().length) {
            int i2 = this.b.a()[i];
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.e.get(i2);
            int size = concurrentLinkedQueue == null ? 0 : concurrentLinkedQueue.size();
            int i3 = this.f.get(i2);
            int i4 = this.b.b()[i];
            int i5 = this.b.c()[i];
            b bVar = this.b;
            Object[] objArr2 = new Object[5];
            objArr2[c] = Integer.valueOf(i2);
            objArr2[1] = Integer.valueOf(size);
            objArr2[2] = Integer.valueOf(i3);
            objArr2[3] = Integer.valueOf(i4);
            objArr2[4] = Integer.valueOf(i5);
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            boolean z2 = z;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "cf575ac77988163c37942a6eae844387", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "cf575ac77988163c37942a6eae844387")).booleanValue() : i3 < i5 ? size < i4 : size == 0) {
                this.f.put(i2, i3 + 1);
                a aVar = this.d;
                a.c cVar = this.i;
                Object[] objArr3 = {Integer.valueOf(i2), null, cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ea112f2c57ec9a3fd95883f371191868", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ea112f2c57ec9a3fd95883f371191868");
                    z = true;
                } else if (cVar == null) {
                    throw new NullPointerException("callback argument may not be null!");
                } else {
                    a.b bVar2 = aVar.d;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "8bcd1ef7dac6bfd655dbd40d9e995ee5", RobustBitConfig.DEFAULT_VALUE)) {
                        acquire = (a.C0841a) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "8bcd1ef7dac6bfd655dbd40d9e995ee5");
                    } else {
                        acquire = bVar2.c.acquire();
                        if (acquire == null) {
                            acquire = new a.C0841a();
                        }
                    }
                    acquire.a = aVar;
                    acquire.c = i2;
                    acquire.b = null;
                    acquire.e = cVar;
                    a.b bVar3 = aVar.d;
                    z = true;
                    Object[] objArr5 = {acquire};
                    ChangeQuickRedirect changeQuickRedirect5 = a.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "22fff9dc122305de3ddc756d84fbf7d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "22fff9dc122305de3ddc756d84fbf7d2");
                    } else {
                        try {
                            bVar3.b.put(acquire);
                        } catch (InterruptedException e) {
                            throw new RuntimeException("Failed to enqueue async inflate request", e);
                        }
                    }
                }
            } else {
                z = z2;
            }
            i++;
            c = 0;
        }
        boolean z3 = z;
        this.h.removeCallbacks(this);
        if (this.g) {
            if (z3) {
                this.h.postDelayed(this, this.b.e());
            } else {
                this.g = false;
            }
        }
    }

    private boolean b(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c8081621e1a0cba2eb27944d64a739", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c8081621e1a0cba2eb27944d64a739")).booleanValue();
        }
        if (this.b == null || this.b.a() == null || this.b.a().length <= 0) {
            return false;
        }
        for (int i2 : this.b.a()) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
