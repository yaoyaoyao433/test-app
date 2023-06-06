package com.meituan.android.yoda.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;

    private f(c cVar) {
        this.b = cVar;
    }

    public static Runnable a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eea50aabb3f3e3cd6d6f8849b7f8a9c7", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eea50aabb3f3e3cd6d6f8849b7f8a9c7") : new f(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76494028e6f58c858e36ab7c658e933b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76494028e6f58c858e36ab7c658e933b");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d06fdec01437ab346e14e4fe793cf706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d06fdec01437ab346e14e4fe793cf706");
            return;
        }
        try {
            File a2 = com.meituan.android.cipstorage.q.a(cVar.c, "sec_yoda", (String) null);
            if (!a2.exists()) {
                a2.mkdirs();
            }
            if (a2.exists()) {
                cVar.j = new File(a2.getPath(), "voice_veri.wav");
                if (!cVar.j.exists()) {
                    try {
                        cVar.j.createNewFile();
                    } catch (IOException unused) {
                    }
                }
            }
            c.a(new FileInputStream(cVar.i), new FileOutputStream(cVar.j), 16000, 1, 16);
            if (cVar.k != null) {
                cVar.k.a(cVar.j);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
