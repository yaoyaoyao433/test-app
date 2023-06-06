package com.meituan.android.privacy.interfaces;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
@RequiresPermission(partOf = {PermissionGuard.PERMISSION_STORAGE_WRITE, PermissionGuard.PERMISSION_STORAGE_READ, PermissionGuard.PERMISSION_CONTACTS_WRITE, PermissionGuard.PERMISSION_CONTACTS_READ, PermissionGuard.PERMISSION_CALENDAR_WRITE, PermissionGuard.PERMISSION_CALENDAR_READ})
/* loaded from: classes3.dex */
public interface t {
    @SuppressLint({"MissingPermission"})
    int a(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    @SuppressLint({"MissingPermission"})
    int a(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    @SuppressLint({"MissingPermission"})
    @Nullable
    Cursor a(@NonNull Uri uri, @Nullable String[] strArr, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal);

    @SuppressLint({"MissingPermission"})
    @Nullable
    Cursor a(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    @SuppressLint({"MissingPermission"})
    @Nullable
    Uri a(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @Nullable
    ParcelFileDescriptor a(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException;

    @Nullable
    String a(@NonNull Uri uri);

    void a(@NonNull ContentObserver contentObserver);

    void a(@NonNull Uri uri, int i);

    void a(@NonNull Uri uri, @Nullable ContentObserver contentObserver);

    void a(@NonNull Uri uri, boolean z, @NonNull ContentObserver contentObserver);

    @Nullable
    AssetFileDescriptor b(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException;

    @Nullable
    InputStream b(@NonNull Uri uri) throws FileNotFoundException;

    @Nullable
    OutputStream c(@NonNull Uri uri) throws FileNotFoundException;
}
