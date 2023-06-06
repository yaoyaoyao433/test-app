package com.meituan.android.mtplayer.video.proxy.sourcestorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.mtplayer.video.proxy.n;
import com.meituan.android.mtplayer.video.proxy.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a extends SQLiteOpenHelper implements b {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static final String[] c = {"_id", "url", "length", IMediaFormat.KEY_MIME};

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9481f61a1d676351a01e98b4c8c8ebee", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9481f61a1d676351a01e98b4c8c8ebee");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a22d7be474f818de3d963b22645646b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a22d7be474f818de3d963b22645646b1");
        } else if (b != null) {
            a aVar = b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c075ff925e3436bdd9d7fd01c6b86d5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c075ff925e3436bdd9d7fd01c6b86d5f");
            } else {
                aVar.close();
            }
        }
    }

    private a(Context context) {
        super(context, context.getPackageName() + "_MTPlayerVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5313dac288d711b7177f708889d0a16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5313dac288d711b7177f708889d0a16");
        } else {
            n.a(context);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1deb013bd2992e10ac94dd90a7c80388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1deb013bd2992e10ac94dd90a7c80388");
            return;
        }
        n.a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e63e7291e8e948d1e36a37a3a6af33a", RobustBitConfig.DEFAULT_VALUE)) {
            throw new IllegalStateException("Should not be called. There is no any migration");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e63e7291e8e948d1e36a37a3a6af33a");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.meituan.android.mtplayer.video.proxy.sourcestorage.b
    public final com.meituan.android.mtplayer.video.proxy.s a(java.lang.String r14) {
        /*
            r13 = this;
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.mtplayer.video.proxy.sourcestorage.a.a
            java.lang.String r12 = "78753a3cd75137a228000554e5c3d113"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r9
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r13, r11, r10, r12)
            com.meituan.android.mtplayer.video.proxy.s r0 = (com.meituan.android.mtplayer.video.proxy.s) r0
            return r0
        L1e:
            com.meituan.android.mtplayer.video.proxy.n.a(r14)
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "SourceInfo"
            java.lang.String[] r3 = com.meituan.android.mtplayer.video.proxy.sourcestorage.a.c     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "url=?"
            java.lang.String[] r5 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L9d
            r5[r10] = r14     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            r7 = 0
            r11 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            android.database.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d
            if (r11 == 0) goto L8f
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L49
            goto L8f
        L49:
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L9e
            r0[r10] = r11     // Catch: java.lang.Throwable -> L9e
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.mtplayer.video.proxy.sourcestorage.a.a     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "390f978ea7b1ef9f28ee0561f1c9ef5a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r13
            r3 = r8
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L66
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r8, r10, r12)     // Catch: java.lang.Throwable -> L9e
            com.meituan.android.mtplayer.video.proxy.s r0 = (com.meituan.android.mtplayer.video.proxy.s) r0     // Catch: java.lang.Throwable -> L9e
        L64:
            r9 = r0
            goto L8f
        L66:
            com.meituan.android.mtplayer.video.proxy.s r0 = new com.meituan.android.mtplayer.video.proxy.s     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "url"
            int r1 = r11.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "length"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L9e
            long r2 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "mime"
            int r4 = r11.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L9e
            goto L64
        L8d:
            r0 = move-exception
            goto L97
        L8f:
            if (r11 == 0) goto La1
        L91:
            r11.close()     // Catch: java.lang.Throwable -> La1
            goto La1
        L95:
            r0 = move-exception
            r11 = r9
        L97:
            if (r11 == 0) goto L9c
            r11.close()     // Catch: java.lang.Throwable -> L9c
        L9c:
            throw r0
        L9d:
            r11 = r9
        L9e:
            if (r11 == 0) goto La1
            goto L91
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.proxy.sourcestorage.a.a(java.lang.String):com.meituan.android.mtplayer.video.proxy.s");
    }

    @Override // com.meituan.android.mtplayer.video.proxy.sourcestorage.b
    public final void a(String str, s sVar) {
        ContentValues contentValues;
        Object[] objArr = {str, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4052b4793c76ec790863094e007e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4052b4793c76ec790863094e007e65");
            return;
        }
        Object[] objArr2 = {str, sVar};
        Object[] objArr3 = {objArr2};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "a8f352bff5e50bf194721ac10cd9e80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "a8f352bff5e50bf194721ac10cd9e80c");
        } else {
            for (int i = 0; i < 2; i++) {
                if (objArr2[i] == null) {
                    throw new NullPointerException();
                }
            }
        }
        boolean z = a(str) != null;
        Object[] objArr4 = {sVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "f355b4c58c0f28d9ff96386b16663328", RobustBitConfig.DEFAULT_VALUE)) {
            contentValues = (ContentValues) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "f355b4c58c0f28d9ff96386b16663328");
        } else {
            contentValues = new ContentValues();
            contentValues.put("url", sVar.b);
            contentValues.put("length", Long.valueOf(sVar.c));
            contentValues.put(IMediaFormat.KEY_MIME, sVar.d);
        }
        try {
            if (z) {
                getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[]{str});
            } else {
                getWritableDatabase().insert("SourceInfo", null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }
}
