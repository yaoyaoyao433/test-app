package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.Nullable;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class l extends com.facebook.soloader.c {
    private final Map<String, Object> a;
    protected final Context g;
    @Nullable
    protected String h;
    @Nullable
    String[] i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class d implements Closeable {
        public abstract boolean a();

        public abstract c b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class e implements Closeable {
        protected abstract b a() throws IOException;

        protected abstract d b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    protected abstract e a() throws IOException;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public final String c;
        public final String d;

        public a(String str, String str2) {
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class b {
        public final a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        static final b a(DataInput dataInput) throws IOException {
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
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.a.length);
            for (int i = 0; i < this.a.length; i++) {
                dataOutput.writeUTF(this.a[i].c);
                dataOutput.writeUTF(this.a[i].d);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class c implements Closeable {
        public final a a;
        public final InputStream b;

        public c(a aVar, InputStream inputStream) {
            this.a = aVar;
            this.b = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.b.close();
        }
    }

    static void a(File file, byte b2) throws IOException {
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
        String[] list = this.c.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.c);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < aVarArr.length; i++) {
                    if (aVarArr[i].c.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.c, str);
                    new StringBuilder("deleting unaccounted-for file ").append(file);
                    j.a(file);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[Catch: Throwable -> 0x0036, TryCatch #11 {all -> 0x0031, blocks: (B:4:0x002c, B:16:0x0047, B:17:0x004e, B:18:0x005b, B:20:0x0061, B:88:0x0186, B:87:0x0183, B:86:0x017f, B:89:0x0187, B:12:0x003c), top: B:105:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: Throwable -> 0x0036, TRY_LEAVE, TryCatch #11 {all -> 0x0031, blocks: (B:4:0x002c, B:16:0x0047, B:17:0x004e, B:18:0x005b, B:20:0x0061, B:88:0x0186, B:87:0x0183, B:86:0x017f, B:89:0x0187, B:12:0x003c), top: B:105:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183 A[Catch: Throwable -> 0x0036, TryCatch #11 {all -> 0x0031, blocks: (B:4:0x002c, B:16:0x0047, B:17:0x004e, B:18:0x005b, B:20:0x0061, B:88:0x0186, B:87:0x0183, B:86:0x017f, B:89:0x0187, B:12:0x003c), top: B:105:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(byte r17, com.facebook.soloader.l.b r18, com.facebook.soloader.l.d r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.a(byte, com.facebook.soloader.l$b, com.facebook.soloader.l$d):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private boolean a(com.facebook.soloader.f r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.a(com.facebook.soloader.f, int, byte[]):boolean");
    }

    protected byte[] b() throws IOException {
        Parcel obtain = Parcel.obtain();
        e a2 = a();
        try {
            a[] aVarArr = a2.a().a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].c);
                obtain.writeString(aVarArr[i].d);
            }
            a2.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        a2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    a2.close();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.i
    public final void a(int i) throws IOException {
        try {
            if (this.c != null && !this.c.exists()) {
                this.c.mkdirs();
            }
            f a2 = f.a(new File(this.c, "dso_lock"));
            new StringBuilder("locked dso store ").append(this.c);
            if (a(a2, i, b())) {
                a2 = null;
            } else {
                new StringBuilder("dso store is up-to-date: ").append(this.c);
            }
            if (a2 != null) {
                new StringBuilder("releasing dso store lock for ").append(this.c);
                a2.close();
                return;
            }
            StringBuilder sb = new StringBuilder("not releasing dso store lock for ");
            sb.append(this.c);
            sb.append(" (syncer thread started)");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l(Context context, String str) {
        super(new File(context.getApplicationInfo().dataDir + "/" + str), 1);
        this.a = new HashMap();
        this.g = context;
    }
}
