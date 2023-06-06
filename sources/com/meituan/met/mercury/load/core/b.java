package com.meituan.met.mercury.load.core;

import android.support.annotation.GuardedBy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final String b;
    @GuardedBy("this")
    public FileLock c;
    @GuardedBy("this")
    public FileOutputStream d;
    @GuardedBy("this")
    public FileChannel e;
    @GuardedBy("this")
    public File f;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c6b6b535d67a3595ad2c07d3cce4b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c6b6b535d67a3595ad2c07d3cce4b3");
        } else {
            this.b = str;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349ca9eb853294f21046fb34ae4ac899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349ca9eb853294f21046fb34ae4ac899");
            return;
        }
        try {
            if (this.f != null && this.f.exists()) {
                this.f.delete();
            }
        } catch (Exception unused) {
        }
        if (this.c != null) {
            try {
                this.c.close();
            } catch (IOException unused2) {
            }
        }
        IOUtils.close(this.e);
        IOUtils.close(this.d);
        this.c = null;
        this.e = null;
        this.d = null;
    }
}
