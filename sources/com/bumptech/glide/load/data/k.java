package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends h<InputStream> {
    private static final UriMatcher a;

    @Override // com.bumptech.glide.load.data.h
    protected final /* synthetic */ void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a.addURI("com.android.contacts", "contacts/#/photo", 2);
        a.addURI("com.android.contacts", "contacts/#", 3);
        a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public k(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // com.bumptech.glide.load.data.h
    protected final /* synthetic */ InputStream a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = a.match(uri);
        if (match == 1 || match == 3) {
            if (match == 1 && (uri = ContactsContract.Contacts.lookupContact(contentResolver, uri)) == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            if (Build.VERSION.SDK_INT < 14) {
                return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
            }
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
        return contentResolver.openInputStream(uri);
    }
}
