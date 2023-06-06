package com.meituan.android.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class o extends com.meituan.android.soloader.e {
    public static ChangeQuickRedirect k;
    private final Map<String, Object> a;
    protected final Context l;
    @Nullable
    protected String m;
    @Nullable
    String[] n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class d implements Closeable {
        public abstract boolean a();

        public abstract c b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class e implements Closeable {
        public abstract b b() throws IOException;

        public abstract d c() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public abstract e a() throws IOException;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.soloader.o.k
            java.lang.String r12 = "bd846b7d7971656a9fb2fef3164e696c"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            r1 = 0
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r8, r1, r11, r10, r12)
            java.io.File r1 = (java.io.File) r1
            goto L41
        L22:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.pm.ApplicationInfo r3 = r14.getApplicationInfo()
            java.lang.String r3 = r3.dataDir
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
        L41:
            r13.<init>(r1, r10)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r14
            r0[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.soloader.o.k
            java.lang.String r1 = "9b7a2b3edfedda0ba601af3ad2812f24"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r0
            r3 = r13
            r4 = r15
            r6 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L5f
            com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r15, r9, r1)
            return
        L5f:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r13.a = r15
            r13.l = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.o.<init>(android.content.Context, java.lang.String):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public final String d;
        public final String e;

        public a(String str, String str2) {
            this.d = str;
            this.e = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
        public final a[] b;

        public b(a[] aVarArr) {
            Object[] objArr = {aVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3febe3a484753ebc2fa19ed55f557f20", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3febe3a484753ebc2fa19ed55f557f20");
            } else {
                this.b = aVarArr;
            }
        }

        public static final b a(DataInput dataInput) throws IOException {
            Object[] objArr = {dataInput};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc2a3066f92c63c91c603af13b3f5a7d", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc2a3066f92c63c91c603af13b3f5a7d");
            }
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int readInt = dataInput.readInt();
            if (readInt < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[readInt];
            for (int i = 0; i < readInt; i++) {
                aVarArr[i] = new a(dataInput.readUTF(), dataInput.readUTF());
            }
            return new b(aVarArr);
        }

        public final void a(DataOutput dataOutput) throws IOException {
            Object[] objArr = {dataOutput};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce1c439a47617cb2221222185f1e8dbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce1c439a47617cb2221222185f1e8dbf");
                return;
            }
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.b.length);
            for (int i = 0; i < this.b.length; i++) {
                dataOutput.writeUTF(this.b[i].d);
                dataOutput.writeUTF(this.b[i].e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class c implements Closeable {
        public static ChangeQuickRedirect a;
        public final a b;
        public final InputStream c;

        public c(a aVar, InputStream inputStream) {
            Object[] objArr = {aVar, inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e668b1a119c99d20732c2d0d8d9e2d6f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e668b1a119c99d20732c2d0d8d9e2d6f");
                return;
            }
            this.b = aVar;
            this.c = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe842e21888aa93d771d443de634a20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe842e21888aa93d771d443de634a20");
            } else {
                this.c.close();
            }
        }
    }

    static void a(File file, byte b2) throws IOException {
        Object[] objArr = {file, Byte.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcccc099874f95eb2234c586ed3de602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcccc099874f95eb2234c586ed3de602");
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    randomAccessFile.close();
                }
                throw th2;
            }
        }
    }

    private void a(a[] aVarArr) throws IOException {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b931a6b6d1bb821a1d53a9d632664b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b931a6b6d1bb821a1d53a9d632664b");
            return;
        }
        String[] list = this.e.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.e);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < aVarArr.length; i++) {
                    if (aVarArr[i].d.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.e, str);
                    new StringBuilder("deleting unaccounted-for file ").append(file);
                    SysUtil.a(file);
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void a(byte r27, com.meituan.android.soloader.o.b r28, com.meituan.android.soloader.o.d r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.o.a(byte, com.meituan.android.soloader.o$b, com.meituan.android.soloader.o$d):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private boolean a(com.meituan.android.soloader.g r16, int r17, byte[] r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.o.a(com.meituan.android.soloader.g, int, byte[]):boolean");
    }

    public byte[] b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71444c0e6ba6f1e3aa235d87feff4858", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71444c0e6ba6f1e3aa235d87feff4858");
        }
        Parcel obtain = Parcel.obtain();
        e a2 = a();
        try {
            a[] aVarArr = a2.b().b;
            obtain.writeByte((byte) 1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].d);
                obtain.writeString(aVarArr[i].e);
            }
            if (a2 != null) {
                a2.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (a2 != null) {
                    if (th != null) {
                        try {
                            a2.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        a2.close();
                    }
                }
                throw th2;
            }
        }
    }

    @Override // com.meituan.android.soloader.m
    public final void a(int i) throws IOException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25bdc62866894a7110373176c0d6a1b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25bdc62866894a7110373176c0d6a1b7");
            return;
        }
        try {
            if (this.e != null && !this.e.exists()) {
                this.e.mkdirs();
            }
            g a2 = g.a(new File(this.e, "dso_lock"));
            new StringBuilder("locked dso store ").append(this.e);
            if (a(a2, i, b())) {
                a2 = null;
            } else {
                new StringBuilder("dso store is up-to-date: ").append(this.e);
            }
            if (a2 != null) {
                new StringBuilder("releasing dso store lock for ").append(this.e);
                a2.close();
                return;
            }
            StringBuilder sb = new StringBuilder("not releasing dso store lock for ");
            sb.append(this.e);
            sb.append(" (syncer thread started)");
        } catch (Throwable unused) {
        }
    }

    private Object c(String str) {
        Object obj;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca35617a96894224f4155c37b4d42d4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca35617a96894224f4155c37b4d42d4");
        }
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == null) {
                obj = new Object();
                this.a.put(str, obj);
            }
        }
        return obj;
    }

    public final synchronized void b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe6b4f2b607ed6acabd6f56cf10ba1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe6b4f2b607ed6acabd6f56cf10ba1e");
            return;
        }
        synchronized (c(str)) {
            this.m = str;
            a(2);
        }
    }

    @Override // com.meituan.android.soloader.e, com.meituan.android.soloader.m
    public final int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int a2;
        Object[] objArr = {str, Integer.valueOf(i), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75070ac1b776d13191112b85a3bac9d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75070ac1b776d13191112b85a3bac9d2")).intValue();
        }
        synchronized (c(str)) {
            a2 = a(str, i, this.e, threadPolicy);
        }
        return a2;
    }
}
