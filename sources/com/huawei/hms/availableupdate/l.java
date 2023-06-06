package com.huawei.hms.availableupdate;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class l {
    public Context a;
    public String b;

    public static File a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String c(String str) {
        int indexOf;
        String b;
        String a = a();
        if (a != null && (indexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, indexOf))) && (b = b(new File(a, Uri.decode(str.substring(indexOf + 1))))) != null && b.startsWith(a)) {
            return b;
        }
        return null;
    }

    public void a(Context context) {
        if (this.a == null) {
            Checker.checkNonNull(context, "context must not be null.");
            this.a = context;
        }
    }

    public final String b(String str) {
        int length;
        String a = a();
        if (a != null && str.startsWith(a)) {
            if (a.endsWith("/")) {
                length = a.length();
            } else {
                length = a.length() + 1;
            }
            return Uri.encode("ContentUriHelper") + '/' + str.substring(length);
        }
        return null;
    }

    public File a(String str) {
        String a = a();
        if (a == null) {
            return null;
        }
        return a(new File(a, str));
    }

    public final String a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.a, "mContext is null, call setContext first.");
        synchronized (this) {
            if (this.b == null) {
                if (context.getExternalCacheDir() != null) {
                    this.b = b(context.getExternalCacheDir());
                } else {
                    this.b = b(context.getFilesDir());
                }
            }
            str = this.b;
        }
        return str;
    }

    public Uri a(File file, String str) {
        String b;
        String b2 = b(file);
        if (b2 == null || (b = b(b2)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(b).build();
    }

    public File a(Uri uri) {
        String c;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null || (c = c(encodedPath)) == null) {
            return null;
        }
        return a(new File(c));
    }
}
