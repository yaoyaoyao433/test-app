package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final File b;
    final File c;

    public a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09363398993d12660581cc86ac6c7e90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09363398993d12660581cc86ac6c7e90");
            return;
        }
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public final FileOutputStream a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59683eb1c11419aa230fd33546634fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileOutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59683eb1c11419aa230fd33546634fa");
        }
        if (this.b.exists()) {
            if (!this.c.exists()) {
                this.b.renameTo(this.c);
            } else {
                this.b.delete();
            }
        }
        try {
            return new FileOutputStream(this.b);
        } catch (FileNotFoundException unused) {
            if (!this.b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.b);
            }
            try {
                return new FileOutputStream(this.b);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.b);
            }
        }
    }

    public static boolean a(FileOutputStream fileOutputStream) {
        Object[] objArr = {fileOutputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7af0256e35cc8f3246c372bcfe019809", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7af0256e35cc8f3246c372bcfe019809")).booleanValue();
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }
}
