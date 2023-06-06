package com.meituan.android.cipstorage;

import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class MMKV {
    public static ChangeQuickRedirect a;
    private static final String d = "cips" + File.separator + APKStructure.Lib_Type;
    private static volatile int e = 0;
    final boolean b;
    long c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ICallBack {
        void callback(boolean z);
    }

    private native void checkReSetCryptKey(long j, String str);

    private native void clearMemoryCache(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j);

    private static native void crash(String str);

    private native String cryptKey(long j);

    private native double decodeDouble(long j, String str, double d2);

    private native String decodeString(long j, String str, String str2, ICallBack iCallBack);

    private static native void fillFileInfo(String str, long[] jArr);

    private static native long getMMKVWithID(String str, int i, String str2);

    private static native void initialize();

    public static native boolean isFileValid(String str);

    private native void lock(long j);

    private static native void modATime(String str);

    public static native void onExit();

    private native boolean reKey(long j, String str);

    private native void removeValueForKey(long j, String str, ICallBack iCallBack);

    private native void trim(long j);

    private native boolean tryLock(long j);

    private native void unload(long j, ICallBack iCallBack);

    private native void unlock(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void clearAll(long j, ICallBack iCallBack);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean decodeBool(long j, String str, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native byte[] decodeBytes(long j, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native float decodeFloat(long j, String str, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int decodeInt(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long decodeLong(long j, String str, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native String[] decodeStringSet(long j, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeBool(long j, String str, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeBytes(long j, String str, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeDouble(long j, String str, double d2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeFloat(long j, String str, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeInt(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeLong(long j, String str, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeSet(long j, String str, String[] strArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean encodeString(long j, String str, String str2, ICallBack iCallBack);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void fillAll(long j, HashMap<String, Object> hashMap, ICallBack iCallBack);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void processReadLock(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void processReadUnlock(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void removeValuesForKeys(long j, String[] strArr, ICallBack iCallBack);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void sync(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long totalSize(long j);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static boolean a(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cipstorage.MMKV.a(android.content.Context):boolean");
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bd0b8733d2786a4f206c39b43fd6567", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bd0b8733d2786a4f206c39b43fd6567")).booleanValue() : b() != 300;
    }

    private static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dd308429cace0964407c941f8217bf8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dd308429cace0964407c941f8217bf8")).intValue();
        }
        if (e == 0) {
            e = 300;
            try {
                System.loadLibrary("cips");
                e = 350;
            } catch (Throwable unused) {
                if (a(v.c)) {
                    e = 100;
                } else {
                    e = 300;
                }
            }
            if (e != 300) {
                initialize();
            }
        }
        return e;
    }

    public static MMKV a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12dcc0776dc4dff5cdf6c5cb6d003183", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMKV) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12dcc0776dc4dff5cdf6c5cb6d003183");
        }
        Object[] objArr2 = {str, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3a04fc529652706e4dc2d935edb3cbe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMKV) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3a04fc529652706e4dc2d935edb3cbe1");
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        return new MMKV(getMMKVWithID(str, i, null), i);
    }

    public final String a(String str, String str2, ICallBack iCallBack) {
        Object[] objArr = {str, str2, iCallBack};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130b85e361dd3442d4cfc646b05e4c99", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130b85e361dd3442d4cfc646b05e4c99") : decodeString(this.c, str, str2, iCallBack);
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bd3cce8d63aeae1d5cddf4fb1e78c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bd3cce8d63aeae1d5cddf4fb1e78c4")).booleanValue() : containsKey(this.c, str);
    }

    private MMKV(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca61504e129f008f61acc3ba1a234cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca61504e129f008f61acc3ba1a234cc");
            return;
        }
        this.c = j;
        this.b = i == 2;
    }

    public static i a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b656e0f2c4ae4d28be4d8a9d951137ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b656e0f2c4ae4d28be4d8a9d951137ec");
        }
        String path = file.getPath();
        long[] jArr = new long[4];
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat stat = Os.stat(path);
                jArr[0] = stat.st_size;
                jArr[1] = stat.st_atime;
                jArr[2] = stat.st_mtime;
                jArr[3] = stat.st_ctime;
            } catch (Throwable unused) {
                jArr[0] = file.length();
                long lastModified = file.lastModified() / 1000;
                jArr[2] = lastModified;
                jArr[1] = lastModified;
                jArr[3] = lastModified;
            }
        } else if (a()) {
            fillFileInfo(path, jArr);
        }
        return new i(jArr[0], jArr[1], jArr[2], jArr[3]);
    }

    public static void a(short s, String str) {
        Object[] objArr = {(short) -1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "687ce9399cb89f96ba78c9b9148238b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "687ce9399cb89f96ba78c9b9148238b8");
            return;
        }
        c cVar = new c((short) -1, str);
        System.err.println(Log.getStackTraceString(cVar));
        af afVar = v.f;
        if (a()) {
            crash(cVar.getMessage());
            return;
        }
        throw cVar;
    }
}
