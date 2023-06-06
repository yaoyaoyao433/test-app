package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class p<T> implements l<String, T> {
    private final l<Uri, T> a;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(String str, int i, int i2) {
        Uri a;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str2.startsWith("/")) {
            a = a(str2);
        } else {
            Uri parse = Uri.parse(str2);
            a = parse.getScheme() == null ? a(str2) : parse;
        }
        return this.a.a(a, i, i2);
    }

    public p(l<Uri, T> lVar) {
        this.a = lVar;
    }

    private static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }
}
