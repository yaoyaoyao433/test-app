package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.facebook.react.e;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.common.CommonConstant;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class BlobProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!str.equals(r.o)) {
            throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + CommonConstant.Symbol.SINGLE_QUOTES);
        }
        Context applicationContext = getContext().getApplicationContext();
        BlobModule blobModule = applicationContext instanceof e ? (BlobModule) ((e) applicationContext).a().a().getCurrentReactContext().getNativeModule(BlobModule.class) : null;
        if (blobModule == null) {
            throw new RuntimeException("No blob module associated with BlobProvider");
        }
        byte[] resolve = blobModule.resolve(uri);
        if (resolve == null) {
            throw new FileNotFoundException("Cannot open " + uri.toString() + ", blob not found.");
        }
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                autoCloseOutputStream.write(resolve);
                autoCloseOutputStream.close();
                return parcelFileDescriptor;
            } catch (IOException unused) {
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
