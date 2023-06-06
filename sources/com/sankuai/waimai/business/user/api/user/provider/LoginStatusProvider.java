package com.sankuai.waimai.business.user.api.user.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LoginStatusProvider extends ContentProvider {
    public static ChangeQuickRedirect a;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return "vnd.android.cursor.item/user";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.database.Cursor] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.passport.pojo.User a(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.user.api.user.provider.LoginStatusProvider.a
            java.lang.String r11 = "901dfaa90d89d20d9e897672b30d6130"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            com.meituan.passport.pojo.User r12 = (com.meituan.passport.pojo.User) r12
            return r12
        L1e:
            java.lang.String r0 = "content://com.sankuai.meituan.takeoutnew.loginstatusprovider"
            android.net.Uri r4 = android.net.Uri.parse(r0)
            android.content.ContentResolver r3 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
            if (r12 != 0) goto L38
            if (r12 == 0) goto L37
            r12.close()
        L37:
            return r2
        L38:
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            if (r0 != 0) goto L44
            if (r12 == 0) goto L43
            r12.close()
        L43:
            return r2
        L44:
            java.lang.String r0 = "is_login"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            r1 = -1
            if (r0 != r1) goto L50
            r0 = 0
            goto L54
        L50:
            int r0 = r12.getInt(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
        L54:
            if (r0 != 0) goto L5c
            if (r12 == 0) goto L5b
            r12.close()
        L5b:
            return r2
        L5c:
            java.lang.String r0 = "user_id"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            java.lang.String r3 = "token"
            int r3 = r12.getColumnIndex(r3)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            if (r0 != r1) goto L6f
            r4 = 0
            goto L73
        L6f:
            long r4 = r12.getLong(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
        L73:
            if (r3 != r1) goto L78
            java.lang.String r0 = ""
            goto L7c
        L78:
            java.lang.String r0 = r12.getString(r3)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
        L7c:
            com.meituan.passport.pojo.User r1 = new com.meituan.passport.pojo.User     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            r1.<init>()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            r1.id = r4     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            r1.token = r0     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb1
            if (r12 == 0) goto L8a
            r12.close()
        L8a:
            return r1
        L8b:
            r0 = move-exception
            goto L92
        L8d:
            r0 = move-exception
            r12 = r2
            goto Lb2
        L90:
            r0 = move-exception
            r12 = r2
        L92:
            java.lang.String r1 = "LoginStatusProvider"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r4 = "LoginStatusProvider.Exception:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb1
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lb1
            com.sankuai.waimai.foundation.utils.log.a.e(r1, r0, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r12 == 0) goto Lb0
            r12.close()
        Lb0:
            return r2
        Lb1:
            r0 = move-exception
        Lb2:
            if (r12 == 0) goto Lb7
            r12.close()
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.user.api.user.provider.LoginStatusProvider.a(android.content.Context):com.meituan.passport.pojo.User");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e969452d778deb135d9efd6c868a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e969452d778deb135d9efd6c868a3d")).booleanValue();
        }
        a.e("LoginStatusProvider", "LoginStatusProvider.onCreate", new Object[0]);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6a3922b0bdcb6453826a15a686e3fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6a3922b0bdcb6453826a15a686e3fc");
        }
        a.e("LoginStatusProvider", "LoginStatusProvider.query", new Object[0]);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"is_login", "user_id", "token"}, 1);
        boolean a2 = com.sankuai.waimai.platform.domain.manager.user.a.i().a();
        User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
        matrixCursor.addRow(new Object[]{Integer.valueOf(a2 ? 1 : 0), Long.valueOf(b == null ? 0L : b.id), b == null ? "" : b.token});
        return matrixCursor;
    }
}
