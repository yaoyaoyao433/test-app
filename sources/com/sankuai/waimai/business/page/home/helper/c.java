package com.sankuai.waimai.business.page.home.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c e;
    public int b;
    public int c;
    public boolean d;
    private SparseArray<com.sankuai.waimai.business.page.home.interfacer.b> f;
    private Handler g;
    private int h;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5db4e71f62775626cc5ad6abad5771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5db4e71f62775626cc5ad6abad5771");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.business.page.home.helper.c.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "699a7c9cbc7be0ffef1fbbdc34a477ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "699a7c9cbc7be0ffef1fbbdc34a477ec");
                } else {
                    c.this.a(message.arg1);
                }
            }
        };
        this.h = -1;
        this.f = new SparseArray<>();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31b181fadb6e92d0caac97e8043b3035", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31b181fadb6e92d0caac97e8043b3035");
        }
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c();
                }
            }
        }
        return e;
    }

    public final void a(int i, com.sankuai.waimai.business.page.home.interfacer.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4a02f8e5cebbedffaa601df95b95e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4a02f8e5cebbedffaa601df95b95e2");
            return;
        }
        switch (i) {
            case 16:
            case 17:
            case 18:
            case 20:
                if (bVar == null) {
                    return;
                }
                this.f.put(i, bVar);
                return;
            case 19:
            default:
                return;
        }
    }

    public final void a(com.sankuai.waimai.business.page.home.interfacer.b bVar) {
        int indexOfValue;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2ee9bd31dacebefb1e5327825cd6c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2ee9bd31dacebefb1e5327825cd6c7");
        } else if (bVar != null && (indexOfValue = this.f.indexOfValue(bVar)) >= 0) {
            this.f.removeAt(indexOfValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.home.helper.c.a
            java.lang.String r10 = "1fa364cdd60280c3b35948d5de6ca555"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L24
            int r1 = r11.c
            if (r1 != 0) goto L24
        L22:
            r1 = 0
            goto L38
        L24:
            int r1 = r11.b
            if (r1 == r3) goto L37
            int r1 = r11.c
            if (r1 != r3) goto L2d
            goto L37
        L2d:
            int r1 = r11.b
            if (r1 == r2) goto L35
            int r1 = r11.c
            if (r1 != r2) goto L22
        L35:
            r1 = 2
            goto L38
        L37:
            r1 = 1
        L38:
            boolean r4 = r11.d
            if (r4 == 0) goto L51
            java.lang.String r4 = "HomePageSmoothScrollHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "currentState:"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.sankuai.waimai.foundation.utils.log.a.e(r4, r5, r0)
        L51:
            android.os.Handler r0 = r11.g
            r4 = 0
            r0.removeCallbacksAndMessages(r4)
            android.os.Handler r0 = r11.g
            android.os.Message r0 = r0.obtainMessage()
            r0.arg1 = r1
            if (r1 != r3) goto L65
            r11.a(r3)
            return
        L65:
            r4 = 0
            if (r1 != 0) goto L6c
            r4 = 200(0xc8, double:9.9E-322)
            goto L77
        L6c:
            if (r1 != r2) goto L77
            int r1 = r11.h
            if (r1 != 0) goto L75
            r11.a(r3)
        L75:
            r4 = 100
        L77:
            android.os.Handler r1 = r11.g
            r1.sendMessageDelayed(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.helper.c.b():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69f76643c773df5f4610813fb7b32f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69f76643c773df5f4610813fb7b32f7");
        } else if (this.h != i) {
            this.h = i;
            if (this.d) {
                com.sankuai.waimai.foundation.utils.log.a.e("HomePageSmoothScrollHelper", "observerState:" + i, new Object[0]);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                this.f.valueAt(i2).b(i);
            }
        }
    }
}
