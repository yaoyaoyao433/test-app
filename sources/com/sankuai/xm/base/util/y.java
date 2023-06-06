package com.sankuai.xm.base.util;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class y {
    public static ChangeQuickRedirect a;

    @TargetApi(19)
    public static String a(Context context, Uri uri) {
        Uri uri2;
        String a2;
        String str;
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a94106f515c12f5615b56c82f22bced3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a94106f515c12f5615b56c82f22bced3");
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
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8300b3a46c1ecf6a4aa906d5a12ccc05", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8300b3a46c1ecf6a4aa906d5a12ccc05")).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                return uri.getLastPathSegment();
            }
            return a(context, uri, null, null);
        }
        Object[] objArr3 = {uri};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "49ff6937b058a79a88d8e5ae06b05b55", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "49ff6937b058a79a88d8e5ae06b05b55")).booleanValue() : "com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(CommonConstant.Symbol.COLON);
            if (DynamicTitleParser.PARSER_KEY_ELEMENT_PRIMARY.equalsIgnoreCase(split[0])) {
                str = Environment.getExternalStorageDirectory().getPath();
            } else {
                str = System.getenv(Environment.isExternalStorageRemovable() ? "EXTERNAL_STORAGE" : "SECONDARY_STORAGE");
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
            }
            return k.f(str, split[1]);
        }
        Object[] objArr4 = {uri};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "91027ecdcf1209d37098faf06568ffaf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "91027ecdcf1209d37098faf06568ffaf")).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (documentId.startsWith("raw:")) {
                return documentId.replaceFirst("raw:", "");
            }
            String[] strArr = {"content://downloads/public_downloads", "content://downloads/my_downloads", "content://downloads/all_downloads"};
            for (int i = 0; i < 3; i++) {
                try {
                    a2 = a(context, ContentUris.withAppendedId(Uri.parse(strArr[i]), Long.parseLong(documentId)), null, null);
                } catch (Throwable unused) {
                }
                if (a2 != null) {
                    return a2;
                }
            }
            String b = b(context, uri, null, null);
            if (b != null) {
                String uri3 = Uri.withAppendedPath(Uri.parse(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()), b).toString();
                if (k.f(uri3)) {
                    return uri3;
                }
            }
            return a(context, uri, null, null);
        }
        Object[] objArr5 = {uri};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9c952c720c9875f5ec4098ec80106a0a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9c952c720c9875f5ec4098ec80106a0a")).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId2 = DocumentsContract.getDocumentId(uri);
            String[] split2 = documentId2.split(CommonConstant.Symbol.COLON);
            String str2 = split2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (!"audio".equals(str2)) {
                com.sankuai.xm.log.c.c("SAFUriHelper", "getFilePath::not support uri:" + documentId2, new Object[0]);
                return null;
            } else {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return a(context, uri2, "_id = ?", new String[]{split2[1]});
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r11 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r11 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r11, android.net.Uri r12, java.lang.String r13, java.lang.String[] r14) {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            r1 = 3
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.util.y.a
            java.lang.String r10 = "6a444a199b65c1337685109806efa1fc"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L27:
            java.lang.String r0 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            com.meituan.android.privacy.interfaces.t r3 = com.sankuai.xm.base.util.k.b(r11)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r8 = 0
            r4 = r12
            r6 = r13
            r7 = r14
            android.database.Cursor r11 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r11 == 0) goto L5c
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L70
            if (r12 == 0) goto L5c
            java.lang.String r12 = "_data"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L70
            r13 = -1
            if (r12 != r13) goto L50
            if (r11 == 0) goto L4f
            r11.close()
        L4f:
            return r2
        L50:
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L70
            if (r11 == 0) goto L59
            r11.close()
        L59:
            return r12
        L5a:
            r12 = move-exception
            goto L67
        L5c:
            if (r11 == 0) goto L6f
        L5e:
            r11.close()
            goto L6f
        L62:
            r12 = move-exception
            r11 = r2
            goto L71
        L65:
            r12 = move-exception
            r11 = r2
        L67:
            java.lang.String r13 = "SAFUriHelper"
            com.sankuai.xm.log.c.a(r13, r12)     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L6f
            goto L5e
        L6f:
            return r2
        L70:
            r12 = move-exception
        L71:
            if (r11 == 0) goto L76
            r11.close()
        L76:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.y.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            r12 = 4
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
            com.meituan.robust.ChangeQuickRedirect r8 = com.sankuai.xm.base.util.y.a
            java.lang.String r9 = "db3048cbf0af97ed66c9e4bb89a68984"
            r1 = 0
            r3 = 1
            r5 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r0 = r12
            r2 = r8
            r4 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L28
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r12, r7, r8, r13, r9)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L28:
            java.lang.String r12 = "_display_name"
            java.lang.String[] r2 = new java.lang.String[]{r12}
            com.meituan.android.privacy.interfaces.t r0 = com.sankuai.xm.base.util.k.b(r10)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            android.database.Cursor r10 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            if (r10 == 0) goto L5d
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L71
            if (r11 == 0) goto L5d
            java.lang.String r11 = "_display_name"
            int r11 = r10.getColumnIndex(r11)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L71
            r12 = -1
            if (r11 != r12) goto L51
            if (r10 == 0) goto L50
            r10.close()
        L50:
            return r7
        L51:
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L71
            if (r10 == 0) goto L5a
            r10.close()
        L5a:
            return r11
        L5b:
            r11 = move-exception
            goto L68
        L5d:
            if (r10 == 0) goto L70
        L5f:
            r10.close()
            goto L70
        L63:
            r11 = move-exception
            r10 = r7
            goto L72
        L66:
            r11 = move-exception
            r10 = r7
        L68:
            java.lang.String r12 = "SAFUriHelper"
            com.sankuai.xm.log.c.a(r12, r11)     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L70
            goto L5f
        L70:
            return r7
        L71:
            r11 = move-exception
        L72:
            if (r10 == 0) goto L77
            r10.close()
        L77:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.y.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
