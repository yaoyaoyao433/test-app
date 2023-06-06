package com.huawei.updatesdk.fileprovider;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b implements a {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public b(String str) {
        this.a = str;
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public Uri a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                String substring = canonicalPath.substring(path2.endsWith("/") ? path2.length() : path2.length() + 1);
                return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException("wisedist: Failed to find configured root that contains");
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for wisedist");
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public File a(Uri uri) {
        try {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file != null) {
                if (TextUtils.isEmpty(decode2) || decode2.contains("../") || decode2.contains("..") || decode2.contains("%00") || decode2.contains(".\\.\\") || decode2.contains("./")) {
                    throw new IllegalArgumentException("wisedist: Not a standard path");
                }
                try {
                    File canonicalFile = new File(file, decode2).getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("wisedist: Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("wisedist: Failed to resolve canonical path for");
                }
            }
            throw new IllegalArgumentException("wisedist: Unable to find configured root for");
        } catch (Exception e) {
            throw new IllegalArgumentException("UpdateSDKFileProvider error: " + e.toString());
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public void a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("wisedist Name must not be empty");
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for root");
        }
    }
}
