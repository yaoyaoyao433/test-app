package com.sankuai.waimai.store.mrn.af;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @TargetApi(19)
    public static String a(Context context, Uri uri, @Nullable String str) {
        Uri uri2;
        String a2;
        String str2;
        Object[] objArr = {context, uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "609c98b52fc41c4f7d4a8cade9becb64", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "609c98b52fc41c4f7d4a8cade9becb64");
        }
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if (!"content".equalsIgnoreCase(uri.getScheme())) {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
                return uri.getPath();
            }
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0af0e9f155a4c05e20c25db407585e6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0af0e9f155a4c05e20c25db407585e6f")).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                return uri.getLastPathSegment();
            }
            return a(context, uri, null, null, str);
        }
        Object[] objArr3 = {uri};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3115afa111fa93a3cdda91c6ba2e692f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3115afa111fa93a3cdda91c6ba2e692f")).booleanValue() : "com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(CommonConstant.Symbol.COLON);
            if (DynamicTitleParser.PARSER_KEY_ELEMENT_PRIMARY.equalsIgnoreCase(split[0])) {
                str2 = Environment.getExternalStorageDirectory().getPath();
            } else {
                str2 = System.getenv(Environment.isExternalStorageRemovable() ? "EXTERNAL_STORAGE" : "SECONDARY_STORAGE");
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
            }
            return a.a(str2, split[1]);
        }
        Object[] objArr4 = {uri};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "1fd312b43080ea921ac03802b47bac52", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "1fd312b43080ea921ac03802b47bac52")).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (documentId.startsWith("raw:")) {
                return documentId.replaceFirst("raw:", "");
            }
            String[] strArr = {"content://downloads/public_downloads", "content://downloads/my_downloads", "content://downloads/all_downloads"};
            for (int i = 0; i < 3; i++) {
                try {
                    a2 = a(context, ContentUris.withAppendedId(Uri.parse(strArr[i]), Long.parseLong(documentId)), null, null, str);
                } catch (Throwable unused) {
                }
                if (a2 != null) {
                    return a2;
                }
            }
            String b = b(context, uri, null, null, str);
            if (b != null) {
                String uri3 = Uri.withAppendedPath(Uri.parse(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()), b).toString();
                if (a.a(context, uri3, str)) {
                    return uri3;
                }
            }
            return a(context, uri, null, null, str);
        }
        Object[] objArr5 = {uri};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3261a6e12759e8c8ff96b8aa23ccbd43", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3261a6e12759e8c8ff96b8aa23ccbd43")).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId2 = DocumentsContract.getDocumentId(uri);
            String[] split2 = documentId2.split(CommonConstant.Symbol.COLON);
            String str3 = split2[0];
            if ("image".equals(str3)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str3)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (!"audio".equals(str3)) {
                com.sankuai.shangou.stone.util.log.a.c("SAFUriHelper", "getFilePath::not support uri:" + documentId2, new Object[0]);
                return null;
            } else {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return a(context, uri2, "_id = ?", new String[]{split2[1]}, str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r11 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r11 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r11, android.net.Uri r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15) {
        /*
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            r1 = 3
            r0[r1] = r14
            r1 = 4
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.mrn.af.b.a
            java.lang.String r10 = "c467c504d0fbd7e1cfc7232fee451e38"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2a
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L2a:
            java.lang.String r0 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            com.meituan.android.privacy.interfaces.t r3 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r11, r15)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
            r8 = 0
            r4 = r12
            r6 = r13
            r7 = r14
            android.database.Cursor r11 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
            if (r11 == 0) goto L5f
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L73
            if (r12 == 0) goto L5f
            java.lang.String r12 = "_data"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L73
            r13 = -1
            if (r12 != r13) goto L53
            if (r11 == 0) goto L52
            r11.close()
        L52:
            return r2
        L53:
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L73
            if (r11 == 0) goto L5c
            r11.close()
        L5c:
            return r12
        L5d:
            r12 = move-exception
            goto L6a
        L5f:
            if (r11 == 0) goto L72
        L61:
            r11.close()
            goto L72
        L65:
            r12 = move-exception
            r11 = r2
            goto L74
        L68:
            r12 = move-exception
            r11 = r2
        L6a:
            java.lang.String r13 = "SAFUriHelper"
            com.sankuai.shangou.stone.util.log.a.a(r13, r12)     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L72
            goto L61
        L72:
            return r2
        L73:
            r12 = move-exception
        L74:
            if (r11 == 0) goto L79
            r11.close()
        L79:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.af.b.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14) {
        /*
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = 0
            r12[r13] = r10
            r13 = 1
            r12[r13] = r11
            r7 = 0
            r0 = 2
            r12[r0] = r7
            r0 = 3
            r12[r0] = r7
            r0 = 4
            r12[r0] = r14
            com.meituan.robust.ChangeQuickRedirect r8 = com.sankuai.waimai.store.mrn.af.b.a
            java.lang.String r9 = "0363cce5b4c05db8c9d0a4c49780a555"
            r1 = 0
            r3 = 1
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r12
            r2 = r8
            r4 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2b
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r12, r7, r8, r13, r9)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L2b:
            java.lang.String r12 = "_display_name"
            java.lang.String[] r2 = new java.lang.String[]{r12}
            com.meituan.android.privacy.interfaces.t r0 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r10, r14)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            android.database.Cursor r10 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
            if (r10 == 0) goto L60
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L74
            if (r11 == 0) goto L60
            java.lang.String r11 = "_display_name"
            int r11 = r10.getColumnIndex(r11)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L74
            r12 = -1
            if (r11 != r12) goto L54
            if (r10 == 0) goto L53
            r10.close()
        L53:
            return r7
        L54:
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L74
            if (r10 == 0) goto L5d
            r10.close()
        L5d:
            return r11
        L5e:
            r11 = move-exception
            goto L6b
        L60:
            if (r10 == 0) goto L73
        L62:
            r10.close()
            goto L73
        L66:
            r11 = move-exception
            r10 = r7
            goto L75
        L69:
            r11 = move-exception
            r10 = r7
        L6b:
            java.lang.String r12 = "SAFUriHelper"
            com.sankuai.shangou.stone.util.log.a.a(r12, r11)     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L73
            goto L62
        L73:
            return r7
        L74:
            r11 = move-exception
        L75:
            if (r10 == 0) goto L7a
            r10.close()
        L7a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.af.b.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }
}
