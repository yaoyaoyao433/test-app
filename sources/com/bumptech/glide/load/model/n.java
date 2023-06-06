package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class n<T> implements l<Integer, T> {
    protected final Resources a;
    private final l<Uri, T> b;

    public n(Context context, l<Uri, T> lVar) {
        this(context.getResources(), lVar);
    }

    private n(Resources resources, l<Uri, T> lVar) {
        this.a = resources;
        this.b = lVar;
    }

    @Override // com.bumptech.glide.load.model.l
    public com.bumptech.glide.load.data.c<T> a(Integer num, int i, int i2) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.a.getResourcePackageName(num.intValue()) + '/' + this.a.getResourceTypeName(num.intValue()) + '/' + this.a.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri != null) {
            return this.b.a(uri, i, i2);
        }
        return null;
    }
}
