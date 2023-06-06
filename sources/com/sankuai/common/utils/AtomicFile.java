package com.sankuai.common.utils;

import android.util.Log;
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
public class AtomicFile {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cfbfc0a10de72268d6796c7c1ffd8aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cfbfc0a10de72268d6796c7c1ffd8aa");
            return;
        }
        this.mBaseName = file;
        this.mBackupName = new File(file.getPath() + ".bak");
    }

    public File getBaseFile() {
        return this.mBaseName;
    }

    public void delete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b966516a7b21e1b06f034c80a21f057a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b966516a7b21e1b06f034c80a21f057a");
            return;
        }
        this.mBaseName.delete();
        this.mBackupName.delete();
    }

    public FileOutputStream startWrite() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ae4eb0e93b0a4e0b33d8b67e103cd43", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileOutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ae4eb0e93b0a4e0b33d8b67e103cd43");
        }
        if (this.mBaseName.exists()) {
            if (!this.mBackupName.exists()) {
                if (!this.mBaseName.renameTo(this.mBackupName)) {
                    StringBuilder sb = new StringBuilder("Couldn't rename file ");
                    sb.append(this.mBaseName);
                    sb.append(" to backup file ");
                    sb.append(this.mBackupName);
                }
            } else {
                this.mBaseName.delete();
            }
        }
        try {
            return new FileOutputStream(this.mBaseName);
        } catch (FileNotFoundException unused) {
            if (!this.mBaseName.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.mBaseName);
            }
            try {
                return new FileOutputStream(this.mBaseName);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.mBaseName);
            }
        }
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        Object[] objArr = {fileOutputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b47cf557d7a0669fac72ee1af6d004f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b47cf557d7a0669fac72ee1af6d004f");
        } else if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBackupName.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        Object[] objArr = {fileOutputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93da4df4b350dfdecbfdd1f366bb8e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93da4df4b350dfdecbfdd1f366bb8e4c");
        } else if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBaseName.delete();
                this.mBackupName.renameTo(this.mBaseName);
            } catch (IOException e) {
                Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    public FileInputStream openRead() throws FileNotFoundException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "958b8047da8de70cdbb796369facdc68", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileInputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "958b8047da8de70cdbb796369facdc68");
        }
        if (this.mBackupName.exists()) {
            this.mBaseName.delete();
            this.mBackupName.renameTo(this.mBaseName);
        }
        return new FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f2d817653ed4b7b9663693ecdd70af7", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f2d817653ed4b7b9663693ecdd70af7");
        }
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i = 0;
            while (true) {
                int read = openRead.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = openRead.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    public static boolean sync(FileOutputStream fileOutputStream) {
        Object[] objArr = {fileOutputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cdec19d6ca5fadd8fc42cfe1ac5cd23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cdec19d6ca5fadd8fc42cfe1ac5cd23")).booleanValue();
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
