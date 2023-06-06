package com.google.archivepatcher.shared;

import com.google.archivepatcher.shared.g;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static <T> List<k<T>> a(List<k<T>> list, File file, OutputStream outputStream, boolean z, int i) throws IOException {
        i iVar;
        g gVar = new g(outputStream, 32768);
        try {
            iVar = new i(file);
            try {
                long j = 0;
                for (k<T> kVar : list) {
                    long j2 = kVar.a - j;
                    if (j2 > 0) {
                        iVar.a(j, j2);
                        gVar.a(iVar, g.a.a);
                    }
                    iVar.a(kVar.a, kVar.b);
                    gVar.a(iVar, g.a.c);
                    j = kVar.a + kVar.b;
                }
                long j3 = iVar.a - j;
                if (j3 > 0) {
                    iVar.a(j, j3);
                    gVar.a(iVar, g.a.a);
                }
                try {
                    iVar.close();
                } catch (Exception unused) {
                }
                try {
                    gVar.close();
                } catch (Exception unused2) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    iVar.close();
                } catch (Exception unused3) {
                }
                try {
                    gVar.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = null;
        }
    }
}
