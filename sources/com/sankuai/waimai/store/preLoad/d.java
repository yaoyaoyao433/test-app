package com.sankuai.waimai.store.preLoad;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.preLoad.a;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements Runnable {
    public static ChangeQuickRedirect a;
    private c b;
    private LayoutInflater c;
    private a d;
    private SparseArray<ConcurrentLinkedQueue<View>> e;
    private SparseIntArray f;
    private boolean g;
    private Handler h;
    private a.e i;

    public d(Context context, c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2ec153607a62e72932913b38469aa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2ec153607a62e72932913b38469aa9");
            return;
        }
        this.i = new a.e() { // from class: com.sankuai.waimai.store.preLoad.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.preLoad.a.e
            public final void a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
                Object[] objArr2 = {view, Integer.valueOf(i), viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03201f3ff5cd0df7e6a27374314b3f06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03201f3ff5cd0df7e6a27374314b3f06");
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) d.this.e.get(i);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    d.this.e.put(i, concurrentLinkedQueue);
                }
                concurrentLinkedQueue.add(view);
            }
        };
        this.b = cVar;
        this.c = LayoutInflater.from(context);
        this.d = new a(context);
        this.e = new SparseArray<>();
        this.f = new SparseIntArray(cVar.a().length);
        this.g = false;
        this.h = new Handler();
        a(true);
    }

    public final View a(@LayoutRes int i) {
        View inflate;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74453ae0e747ad6cfc4a3eedd113940", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74453ae0e747ad6cfc4a3eedd113940");
        }
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.e.get(i);
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            inflate = concurrentLinkedQueue.remove();
        } else {
            inflate = this.c.inflate(i, (ViewGroup) null);
        }
        if (b(i)) {
            a(false);
        }
        return inflate;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af50ab82aaa3ac11acf789d2b9137a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af50ab82aaa3ac11acf789d2b9137a2");
        } else if (this.g) {
        } else {
            this.g = true;
            if (z) {
                this.e.clear();
            }
            this.h.postDelayed(this, 0L);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.b acquire;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d0770e7f3fb424f1a2e683ff661888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d0770e7f3fb424f1a2e683ff661888");
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
            c cVar = this.b;
            Object[] objArr2 = new Object[5];
            objArr2[c] = Integer.valueOf(i2);
            objArr2[1] = Integer.valueOf(size);
            objArr2[2] = Integer.valueOf(i3);
            objArr2[3] = Integer.valueOf(i4);
            objArr2[4] = Integer.valueOf(i5);
            ChangeQuickRedirect changeQuickRedirect2 = c.b;
            boolean z2 = z;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "70119ec202986b1c5185b904348a9369", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "70119ec202986b1c5185b904348a9369")).booleanValue() : i3 < i5 ? size < i4 : size == 0) {
                this.f.put(i2, i3 + 1);
                a aVar = this.d;
                a.e eVar = this.i;
                Object[] objArr3 = {Integer.valueOf(i2), null, eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7fbcc0b3c562649f3da4f88f2973784c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7fbcc0b3c562649f3da4f88f2973784c");
                    z = true;
                } else if (eVar == null) {
                    throw new NullPointerException("callback argument may not be null!");
                } else {
                    a.c cVar2 = aVar.d;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "f308c28bddea3c611461c50be5913307", RobustBitConfig.DEFAULT_VALUE)) {
                        acquire = (a.b) PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "f308c28bddea3c611461c50be5913307");
                    } else {
                        acquire = cVar2.c.acquire();
                        if (acquire == null) {
                            acquire = new a.b();
                        }
                    }
                    acquire.a = aVar;
                    acquire.c = i2;
                    acquire.b = null;
                    acquire.e = eVar;
                    a.c cVar3 = aVar.d;
                    z = true;
                    Object[] objArr5 = {acquire};
                    ChangeQuickRedirect changeQuickRedirect5 = a.c.a;
                    if (PatchProxy.isSupport(objArr5, cVar3, changeQuickRedirect5, false, "f3b9c2c67d08b687977ff5b2d38a4c11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar3, changeQuickRedirect5, false, "f3b9c2c67d08b687977ff5b2d38a4c11");
                    } else {
                        try {
                            cVar3.b.put(acquire);
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
                this.h.postDelayed(this, 30L);
            } else {
                this.g = false;
            }
        }
    }

    private boolean b(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a6fb763c214759bab64f8b4a23e22e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a6fb763c214759bab64f8b4a23e22e")).booleanValue();
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
