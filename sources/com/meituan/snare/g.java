package com.meituan.snare;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements Thread.UncaughtExceptionHandler {
    public static ChangeQuickRedirect a;
    Thread.UncaughtExceptionHandler b;
    Context e;
    n f;
    private static final g g = new g();
    public static final AtomicBoolean c = new AtomicBoolean(true);
    public static boolean d = false;
    private static String h = "";

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b84c6856e49e472751da15665622b21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b84c6856e49e472751da15665622b21");
        } else {
            this.b = null;
        }
    }

    public static g a() {
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.g.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    private void a(@Nullable RandomAccessFile randomAccessFile) {
        Object[] objArr = {randomAccessFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3840062f69354fe0ce0447b91b55a9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3840062f69354fe0ce0447b91b55a9ed");
        } else if (randomAccessFile == null) {
        } else {
            try {
                randomAccessFile.write(h.getBytes("UTF-8"));
                randomAccessFile.write("\n".getBytes("UTF-8"));
            } catch (Exception unused) {
            }
        }
    }

    private void a(RandomAccessFile randomAccessFile, String str, Object obj) throws Throwable {
        Object[] objArr = {randomAccessFile, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51718d2e39c18c6f2e54f6a7348aa2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51718d2e39c18c6f2e54f6a7348aa2b");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        a(randomAccessFile, str, sb.toString());
    }

    private void a(RandomAccessFile randomAccessFile, String str, String str2) throws Throwable {
        Object[] objArr = {randomAccessFile, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1884e0559c19f74573f7cd966d41e4e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1884e0559c19f74573f7cd966d41e4e6");
            return;
        }
        randomAccessFile.write(str.getBytes("UTF-8"));
        randomAccessFile.write("\n".getBytes("UTF-8"));
        randomAccessFile.write(str2 == null ? StringUtil.NULL.getBytes("UTF-8") : str2.getBytes("UTF-8"));
        randomAccessFile.write("\n".getBytes("UTF-8"));
    }
}
