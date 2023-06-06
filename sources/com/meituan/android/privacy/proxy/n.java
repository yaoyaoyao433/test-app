package com.meituan.android.privacy.proxy;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements com.meituan.android.privacy.interfaces.t {
    public static ChangeQuickRedirect a;
    ContentResolver b;
    private u c;
    private String d;
    private String e;

    public n(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff740dcb70ece7ea46e5cea10537cdba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff740dcb70ece7ea46e5cea10537cdba");
        } else if (context == null) {
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                this.b = applicationContext.getContentResolver();
            }
            this.d = context.getPackageName();
            this.c = new u();
            this.e = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String[] a;
        public String b;

        public a(String[] strArr, String str) {
            this.a = strArr;
            this.b = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r2.equals("media") == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.android.privacy.proxy.n.a a(android.net.Uri r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.privacy.proxy.n.a(android.net.Uri, boolean, boolean):com.meituan.android.privacy.proxy.n$a");
    }

    private a c(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceaa75182ed94e89a12f0b25589d9a0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceaa75182ed94e89a12f0b25589d9a0b");
        }
        if (uri == null || str == null) {
            return null;
        }
        return a(uri, str.contains(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o), str.contains("w"));
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final String a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4667fa5809140b3fdf0918f910e03577", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4667fa5809140b3fdf0918f910e03577");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getType(uri);
    }

    private void a(Cursor cursor, String str) {
        int i;
        Object[] objArr = {cursor, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878b9a14bc51757b24a475099c2f8abf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878b9a14bc51757b24a475099c2f8abf");
        } else if (cursor == null || !"_co".equals(str)) {
        } else {
            try {
                i = cursor.getCount();
            } catch (Throwable unused) {
                i = 0;
            }
            if (i > 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("token", this.e);
                hashMap.put("fg", Boolean.valueOf(com.meituan.android.privacy.impl.a.c()));
                hashMap.put("count", Integer.valueOf(i));
                Babel.log(new Log.Builder("").generalChannelStatus(true).tag("privacy_lxr").value(1L).optional(hashMap).build());
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final Cursor a(@NonNull final Uri uri, @Nullable final String[] strArr, @Nullable final String str, @Nullable final String[] strArr2, @Nullable final String str2) {
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c187f0e731fe3072f4e77c3f2df4751", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c187f0e731fe3072f4e77c3f2df4751");
        }
        if (this.b == null) {
            return null;
        }
        a a2 = a(uri, true, false);
        if (a2 == null) {
            return this.b.query(uri, strArr, str, strArr2, str2);
        }
        u uVar = this.c;
        Cursor cursor = (Cursor) uVar.a("contentresolver.q_USSSS" + a2.b, this.e, a2.a, new u.a<Cursor>() { // from class: com.meituan.android.privacy.proxy.n.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Cursor a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e93a0360aeeec88eb45c741f9c9b6f73", RobustBitConfig.DEFAULT_VALUE) ? (Cursor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e93a0360aeeec88eb45c741f9c9b6f73") : n.this.b.query(uri, strArr, str, strArr2, str2);
            }
        }, false, true);
        a(cursor, a2.b);
        return cursor;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @RequiresApi(api = 26)
    @Nullable
    public final Cursor a(@NonNull final Uri uri, @Nullable final String[] strArr, @Nullable final Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        Object[] objArr = {uri, strArr, bundle, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e2ca5aa8b49c41fd63f59212d6d7af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e2ca5aa8b49c41fd63f59212d6d7af");
        }
        if (this.b == null) {
            return null;
        }
        a a2 = a(uri, true, false);
        if (a2 == null) {
            return this.b.query(uri, strArr, bundle, null);
        }
        u uVar = this.c;
        Cursor cursor = (Cursor) uVar.a("contentresolver.q_USBC" + a2.b, this.e, a2.a, new u.a<Cursor>() { // from class: com.meituan.android.privacy.proxy.n.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Cursor a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7abe7675f7b01ff380f61957a5438d46", RobustBitConfig.DEFAULT_VALUE) ? (Cursor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7abe7675f7b01ff380f61957a5438d46") : n.this.b.query(uri, strArr, bundle, r5);
            }
        }, false, true);
        a(cursor, a2.b);
        return cursor;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final InputStream b(@NonNull final Uri uri) throws FileNotFoundException {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7381b41c2fc7651bcca50c3abdf5a7cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7381b41c2fc7651bcca50c3abdf5a7cf");
        }
        if (this.b == null) {
            return null;
        }
        a a2 = a(uri, true, false);
        if (a2 == null) {
            return this.b.openInputStream(uri);
        }
        u uVar = this.c;
        aa aaVar = (aa) uVar.a("contentresolver.oIStream" + a2.b, this.e, a2.a, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.n.6
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "554a4170dd59fe1e8c1922c2e013c2e8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "554a4170dd59fe1e8c1922c2e013c2e8");
                }
                try {
                    return new aa(n.this.b.openInputStream(uri), null);
                } catch (FileNotFoundException e) {
                    return new aa(null, e);
                }
            }
        }, false, true);
        if (aaVar == null) {
            return null;
        }
        if (aaVar.b instanceof FileNotFoundException) {
            throw ((FileNotFoundException) aaVar.b);
        }
        return (InputStream) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final OutputStream c(@NonNull final Uri uri) throws FileNotFoundException {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c690ce21c6f02ab0566436d3db96cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c690ce21c6f02ab0566436d3db96cd");
        }
        if (this.b == null) {
            return null;
        }
        a a2 = a(uri, false, true);
        if (a2 == null) {
            return this.b.openOutputStream(uri);
        }
        u uVar = this.c;
        aa aaVar = (aa) uVar.a("contentresolver.oOStream_U" + a2.b, this.e, a2.a, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.n.7
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9aabc89189464d863c3cd2c287a2272b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9aabc89189464d863c3cd2c287a2272b");
                }
                try {
                    return new aa(n.this.b.openOutputStream(uri), null);
                } catch (FileNotFoundException e) {
                    return new aa(null, e);
                }
            }
        }, false, true);
        if (aaVar == null) {
            return null;
        }
        if (aaVar.b instanceof FileNotFoundException) {
            throw ((FileNotFoundException) aaVar.b);
        }
        return (OutputStream) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final ParcelFileDescriptor a(@NonNull final Uri uri, @NonNull final String str) throws FileNotFoundException {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6023ae79567e9e31dfb0de1ef51f143", RobustBitConfig.DEFAULT_VALUE)) {
            return (ParcelFileDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6023ae79567e9e31dfb0de1ef51f143");
        }
        if (this.b == null) {
            return null;
        }
        a c = c(uri, str);
        if (c == null) {
            return this.b.openFileDescriptor(uri, str);
        }
        u uVar = this.c;
        aa aaVar = (aa) uVar.a("contentresolver.oFDescriptor_US" + c.b, this.e, c.a, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.n.8
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "087135fb7ab9737a7c5193672f914416", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "087135fb7ab9737a7c5193672f914416");
                }
                try {
                    return new aa(n.this.b.openFileDescriptor(uri, str), null);
                } catch (FileNotFoundException e) {
                    return new aa(null, e);
                }
            }
        }, false, true);
        if (aaVar == null) {
            return null;
        }
        if (aaVar.b instanceof FileNotFoundException) {
            throw ((FileNotFoundException) aaVar.b);
        }
        return (ParcelFileDescriptor) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final AssetFileDescriptor b(@NonNull final Uri uri, @NonNull final String str) throws FileNotFoundException {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d509ab195b4d1e5efbc4c0ba5762d55b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AssetFileDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d509ab195b4d1e5efbc4c0ba5762d55b");
        }
        if (this.b == null) {
            return null;
        }
        a c = c(uri, str);
        if (c == null) {
            return this.b.openAssetFileDescriptor(uri, str);
        }
        u uVar = this.c;
        aa aaVar = (aa) uVar.a("contentresolver.oAFDescriptor_US" + c.b, this.e, c.a, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.n.9
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88771cf176dc0c25441e2d4b101e6233", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88771cf176dc0c25441e2d4b101e6233");
                }
                try {
                    return new aa(n.this.b.openAssetFileDescriptor(uri, str), null);
                } catch (FileNotFoundException e) {
                    return new aa(null, e);
                }
            }
        }, false, true);
        if (aaVar == null) {
            return null;
        }
        if (aaVar.b instanceof FileNotFoundException) {
            throw ((FileNotFoundException) aaVar.b);
        }
        return (AssetFileDescriptor) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final Uri a(@NonNull final Uri uri, @Nullable final ContentValues contentValues) {
        Object[] objArr = {uri, contentValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7815e7e91b340e7a02076465a80373c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7815e7e91b340e7a02076465a80373c");
        }
        if (this.b == null) {
            return null;
        }
        a a2 = a(uri, false, true);
        if (a2 == null) {
            return this.b.insert(uri, contentValues);
        }
        u uVar = this.c;
        return (Uri) uVar.a("contentresolver.i" + a2.b, this.e, a2.a, new u.a<Uri>() { // from class: com.meituan.android.privacy.proxy.n.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Uri a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baf2e9d637bcff10535be77789fd5619", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baf2e9d637bcff10535be77789fd5619") : n.this.b.insert(uri, contentValues);
            }
        }, false, true);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final int a(@NonNull final Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7f7b753601802548e08085957d4c0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7f7b753601802548e08085957d4c0c")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        a a2 = a(uri, false, true);
        if (a2 == null) {
            return this.b.delete(uri, null, null);
        }
        u uVar = this.c;
        Integer num = (Integer) uVar.a("contentresolver.d" + a2.b, this.e, a2.a, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.n.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05d5876a58f184bf793382aecdca3440", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05d5876a58f184bf793382aecdca3440") : Integer.valueOf(n.this.b.delete(uri, r3, r4));
            }
        }, false, true);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final int a(@NonNull final Uri uri, @Nullable final ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, contentValues, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc40066416da634f7e753e0b4e0b5b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc40066416da634f7e753e0b4e0b5b1")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        a a2 = a(uri, false, true);
        if (a2 == null) {
            return this.b.update(uri, contentValues, null, null);
        }
        u uVar = this.c;
        Integer num = (Integer) uVar.a("contentresolver.u" + a2.b, this.e, a2.a, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.n.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da27363ec9259ef0d5f82192f2eb1823", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da27363ec9259ef0d5f82192f2eb1823") : Integer.valueOf(n.this.b.update(uri, contentValues, r4, r5));
            }
        }, false, true);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, boolean z, @NonNull ContentObserver contentObserver) {
        Object[] objArr = {uri, Byte.valueOf(z ? (byte) 1 : (byte) 0), contentObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3947af18f745b341e4dcad191cbe8ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3947af18f745b341e4dcad191cbe8ca3");
        } else if (this.b != null) {
            this.b.registerContentObserver(uri, z, contentObserver);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull ContentObserver contentObserver) {
        Object[] objArr = {contentObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c0f4e679e6e287a086169096f4fd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c0f4e679e6e287a086169096f4fd99");
        } else if (this.b != null) {
            this.b.unregisterContentObserver(contentObserver);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, @Nullable ContentObserver contentObserver) {
        Object[] objArr = {uri, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60158f5504ad96fb32ab9f89ce59fea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60158f5504ad96fb32ab9f89ce59fea6");
        } else if (this.b != null) {
            this.b.notifyChange(uri, null);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, int i) {
        Object[] objArr = {uri, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5b415793c56ab495c4a071832503a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5b415793c56ab495c4a071832503a9");
        } else if (this.b != null) {
            this.b.takePersistableUriPermission(uri, 1);
        }
    }
}
