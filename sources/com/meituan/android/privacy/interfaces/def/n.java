package com.meituan.android.privacy.interfaces.def;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements com.meituan.android.privacy.interfaces.t {
    public static ChangeQuickRedirect a;
    private ContentResolver b;

    public n(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ebfbb57209b1e3175491afcd091e00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ebfbb57209b1e3175491afcd091e00");
        } else if (context == null) {
        } else {
            this.b = context.getContentResolver();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final String a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55b25593a670a0075d4b9c8c69df4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55b25593a670a0075d4b9c8c69df4cb");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getType(uri);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final Cursor a(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c76c7235aaff38b77ec0a1b1dd8c8bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c76c7235aaff38b77ec0a1b1dd8c8bf");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @RequiresApi(api = 26)
    @Nullable
    public final Cursor a(@NonNull Uri uri, @Nullable String[] strArr, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        Object[] objArr = {uri, strArr, bundle, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9305020e9f1902ef66dff34f00d0aa4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9305020e9f1902ef66dff34f00d0aa4d");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.query(uri, strArr, bundle, null);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final InputStream b(@NonNull Uri uri) throws FileNotFoundException {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf6bc9d910fb3cabfbc3a544f38431b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf6bc9d910fb3cabfbc3a544f38431b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.openInputStream(uri);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final OutputStream c(@NonNull Uri uri) throws FileNotFoundException {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd82093a2edca045d684add043d686c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd82093a2edca045d684add043d686c");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.openOutputStream(uri);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final ParcelFileDescriptor a(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099cc0b160ea5b16429378d58c0ba477", RobustBitConfig.DEFAULT_VALUE)) {
            return (ParcelFileDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099cc0b160ea5b16429378d58c0ba477");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.openFileDescriptor(uri, str);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final AssetFileDescriptor b(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4e674fd36d9c574ea3f112be41ae5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AssetFileDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4e674fd36d9c574ea3f112be41ae5a");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.openAssetFileDescriptor(uri, str);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    @Nullable
    public final Uri a(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        Object[] objArr = {uri, contentValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1899331b395c194957aae26ea0384b03", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1899331b395c194957aae26ea0384b03");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.insert(uri, contentValues);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final int a(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9f2f169c7a1f66ca55606af38a70c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9f2f169c7a1f66ca55606af38a70c4")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.delete(uri, null, null);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final int a(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Object[] objArr = {uri, contentValues, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8625ef28a47efeb6338d80b949ee9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8625ef28a47efeb6338d80b949ee9a")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.update(uri, contentValues, null, null);
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, boolean z, @NonNull ContentObserver contentObserver) {
        Object[] objArr = {uri, Byte.valueOf(z ? (byte) 1 : (byte) 0), contentObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60d5d996b3d88a51f5c94dea6b16048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60d5d996b3d88a51f5c94dea6b16048");
        } else if (this.b != null) {
            this.b.registerContentObserver(uri, z, contentObserver);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull ContentObserver contentObserver) {
        Object[] objArr = {contentObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f01645bb329dc5c7c85cd280fec9937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f01645bb329dc5c7c85cd280fec9937");
        } else if (this.b != null) {
            this.b.unregisterContentObserver(contentObserver);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, @Nullable ContentObserver contentObserver) {
        Object[] objArr = {uri, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf9d6d26f0f558f6a85026ab0b76213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf9d6d26f0f558f6a85026ab0b76213");
        } else if (this.b != null) {
            this.b.notifyChange(uri, null);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.t
    public final void a(@NonNull Uri uri, int i) {
        Object[] objArr = {uri, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52cfb91ee4f7814c3dfc3442faebba8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52cfb91ee4f7814c3dfc3442faebba8b");
        } else if (this.b != null) {
            this.b.takePersistableUriPermission(uri, 1);
        }
    }
}
