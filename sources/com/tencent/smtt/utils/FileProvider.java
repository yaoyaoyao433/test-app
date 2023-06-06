package com.tencent.smtt.utils;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.QbSdk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes6.dex */
public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static HashMap<String, a> c = new HashMap<>();
    private a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        Uri a(File file);

        File a(Uri uri);
    }

    /* loaded from: classes6.dex */
    public static class b implements a {
        private final String a;
        private final HashMap<String, File> b = new HashMap<>();

        public b(String str) {
            this.a = str;
        }

        @Override // com.tencent.smtt.utils.FileProvider.a
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
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                String substring = canonicalPath.substring(path2.endsWith("/") ? path2.length() : path2.length() + 1);
                return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // com.tencent.smtt.utils.FileProvider.a
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        public void a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    private static int a(String str) {
        if (com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o.equals(str)) {
            return y.a;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    static Uri a(Context context, File file) {
        Method declaredMethod;
        String str = "";
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                str = context.getPackageManager().getProviderInfo(new ComponentName(context.getPackageName(), "android.support.v4.content.FileProvider"), 0).authority;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName("android.support.v4.content.FileProvider");
                if (cls == null || (declaredMethod = cls.getDeclaredMethod("getUriForFile", Context.class, String.class, File.class)) == null) {
                    return null;
                }
                Object invoke = declaredMethod.invoke(null, context, str, file);
                if (invoke instanceof Uri) {
                    return (Uri) invoke;
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static Uri a(Context context, String str) {
        Uri uri = null;
        if (context != null && context.getApplicationContext() != null && "com.tencent.mobileqq".equals(context.getApplicationContext().getApplicationInfo().packageName)) {
            try {
                return (Uri) i.a(Class.forName("com.tencent.mobileqq.utils.kapalaiadapter.FileProvider7Helper"), "getUriForFile", (Class<?>[]) new Class[]{Context.class, File.class}, context, new File(str));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (context != null && context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24 && (uri = a(context, new File(str))) == null && QbSdk.checkContentProviderPrivilage(context)) {
            uri = a(context, context.getApplicationInfo().packageName + ".provider", new File(str));
        }
        if (uri == null) {
            try {
                return Uri.fromFile(new File(str));
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.e("FileProvider", "create uri failed,please check again");
            }
        }
        return uri;
    }

    public static Uri a(Context context, String str, File file) {
        return b(context, str).a(file);
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static a b(Context context, String str) {
        a aVar;
        synchronized (c) {
            aVar = c.get(str);
            if (aVar == null) {
                try {
                    aVar = c(context, str);
                    c.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x001d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.tencent.smtt.utils.FileProvider.a c(android.content.Context r8, java.lang.String r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            com.tencent.smtt.utils.FileProvider$b r0 = new com.tencent.smtt.utils.FileProvider$b
            r0.<init>(r9)
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r9 = r1.resolveContentProvider(r9, r2)
            if (r9 == 0) goto Ldb
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r9 = r9.loadXmlMetaData(r1, r2)
            if (r9 == 0) goto Ld3
        L1d:
            int r1 = r9.next()
            r2 = 1
            if (r1 == r2) goto Ld2
            r3 = 2
            if (r1 != r3) goto L1d
            java.lang.String r1 = r9.getName()
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.String r3 = r9.getAttributeValue(r4, r3)
            java.lang.String r5 = "path"
            java.lang.String r5 = r9.getAttributeValue(r4, r5)
            java.lang.String r6 = "root-path"
            boolean r6 = r6.equals(r1)
            r7 = 0
            if (r6 == 0) goto L4d
            java.io.File r1 = com.tencent.smtt.utils.FileProvider.b
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r7] = r5
        L47:
            java.io.File r4 = a(r1, r2)
            goto Lcb
        L4d:
            java.lang.String r6 = "files-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5e
            java.io.File r1 = r8.getFilesDir()
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r7] = r5
            goto L47
        L5e:
            java.lang.String r6 = "cache-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6f
            java.io.File r1 = r8.getCacheDir()
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r7] = r5
            goto L47
        L6f:
            java.lang.String r6 = "external-path"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Lcb
            android.content.pm.ApplicationInfo r1 = r8.getApplicationInfo()
            java.lang.String r1 = r1.packageName
            java.lang.String r4 = "com.tencent.mobileqq"
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto Lc1
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            r4.append(r6)
            java.lang.String r6 = java.io.File.separator
            r4.append(r6)
            java.lang.String r6 = "Android"
            r4.append(r6)
            java.lang.String r6 = java.io.File.separator
            r4.append(r6)
            java.lang.String r6 = "data"
            r4.append(r6)
            java.lang.String r6 = java.io.File.separator
            r4.append(r6)
            android.content.pm.ApplicationInfo r6 = r8.getApplicationInfo()
            java.lang.String r6 = r6.packageName
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r7] = r5
            goto L47
        Lc1:
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r7] = r5
            goto L47
        Lcb:
            if (r4 == 0) goto L1d
            r0.a(r3, r4)
            goto L1d
        Ld2:
            return r0
        Ld3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r8.<init>(r9)
            throw r8
        Ldb:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Must declare com.tencent.smtt.utils.FileProvider in AndroidManifest above Android 7.0,please view document in x5.tencent.com"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileProvider.c(android.content.Context, java.lang.String):com.tencent.smtt.utils.FileProvider$a");
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.d = b(context, providerInfo.authority);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a2 = this.d.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.d.a(uri), a(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a2 = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a2.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a2.length());
            }
            i2 = i;
        }
        String[] a3 = a(strArr3, i2);
        Object[] a4 = a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a3, 1);
        matrixCursor.addRow(a4);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
