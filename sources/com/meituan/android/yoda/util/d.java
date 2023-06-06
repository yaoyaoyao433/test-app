package com.meituan.android.yoda.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;

    private d(c cVar) {
        this.b = cVar;
    }

    public static Runnable a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e31ffedfef54597a156cc35329884da2", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e31ffedfef54597a156cc35329884da2") : new d(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12466dfb1c9d56000aa72d481aef0d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12466dfb1c9d56000aa72d481aef0d4c");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5c746b0efc1af712151dc4347ad266be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5c746b0efc1af712151dc4347ad266be");
            return;
        }
        short[] sArr = new short[cVar.d];
        File a2 = com.meituan.android.cipstorage.q.a(cVar.c, "sec_yoda", (String) null);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        if (a2.exists()) {
            cVar.i = new File(a2.getPath(), "voice_veri.pcm");
            if (!cVar.i.exists()) {
                try {
                    cVar.i.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        cVar.i.createNewFile();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        try {
            if (cVar.i != null) {
                cVar.b = new DataOutputStream(new FileOutputStream(cVar.i));
            }
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
        }
        while (cVar.f) {
            int a3 = cVar.e.a(sArr, 0, cVar.d);
            double d = 0.0d;
            long j = 0;
            for (short s : sArr) {
                j += s * s;
                if (cVar.b != null && a3 > 0) {
                    try {
                        cVar.b.writeByte(s & 255);
                        cVar.b.writeByte((s >> 8) & 255);
                        cVar.b.flush();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            if (a3 != 0) {
                d = Math.log10(j / a3) * 10.0d;
            }
            cVar.g = d;
        }
        try {
            new StringBuilder("stream size is ").append(cVar.b.size());
            cVar.b.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
