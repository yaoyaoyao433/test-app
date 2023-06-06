package com.meituan.passport;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportContentProvider extends ContentProvider {
    public static ChangeQuickRedirect a;
    private static final UriMatcher b = new UriMatcher(-1);
    private Context c;

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public PassportContentProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542fce916240fde66f8361c97a860f79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542fce916240fde66f8361c97a860f79");
        } else {
            this.c = null;
        }
    }

    public static final Uri a(String str, int i) {
        String str2;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526da4144b11489ab331a607fa2c2a6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526da4144b11489ab331a607fa2c2a6e");
        }
        switch (i) {
            case 0:
                str2 = "/query";
                break;
            case 1:
                str2 = "/update";
                break;
            case 2:
                str2 = "/subprocess_update";
                break;
            case 3:
                str2 = "/subprocess_logout";
                break;
            case 4:
                str2 = "/query_phonenumber";
                break;
            case 5:
            case 6:
            case 7:
            default:
                str2 = "/query";
                break;
            case 8:
                str2 = "/update_result_cancel";
                break;
            case 9:
                str2 = "/update_result_ok";
                break;
        }
        return Uri.parse("content://" + str + ".PassportContentProvider" + str2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb8143af558fe95285e78d60f6927f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb8143af558fe95285e78d60f6927f2")).booleanValue();
        }
        Context context = getContext();
        String packageName = context != null ? context.getPackageName() : "";
        try {
            UriMatcher uriMatcher = b;
            uriMatcher.addURI(packageName + ".PassportContentProvider", SearchIntents.EXTRA_QUERY, 0);
            UriMatcher uriMatcher2 = b;
            uriMatcher2.addURI(packageName + ".PassportContentProvider", "update", 1);
            UriMatcher uriMatcher3 = b;
            uriMatcher3.addURI(packageName + ".PassportContentProvider", "subprocess_update", 2);
            UriMatcher uriMatcher4 = b;
            uriMatcher4.addURI(packageName + ".PassportContentProvider", "subprocess_logout", 3);
            UriMatcher uriMatcher5 = b;
            uriMatcher5.addURI(packageName + ".PassportContentProvider", "query_phonenumber", 4);
            UriMatcher uriMatcher6 = b;
            uriMatcher6.addURI(packageName + ".PassportContentProvider", "update_result_cancel", 8);
            UriMatcher uriMatcher7 = b;
            uriMatcher7.addURI(packageName + ".PassportContentProvider", "update_result_ok", 9);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        Object[] objArr = {uri, strArr, str, strArr2, str2, cancellationSignal};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e555af6a03a8a15cb1e52cd18d5c6056", RobustBitConfig.DEFAULT_VALUE) ? (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e555af6a03a8a15cb1e52cd18d5c6056") : super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        Object[] objArr = {uri, strArr, bundle, cancellationSignal};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "861f57215dbc4fe456864f22ec243682", RobustBitConfig.DEFAULT_VALUE) ? (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "861f57215dbc4fe456864f22ec243682") : super.query(uri, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        MatrixCursor matrixCursor;
        Cursor cursor;
        Object[] objArr = {uri, strArr, str, strArr2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d695a6f84b488fc817bd10c1c0ba44", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d695a6f84b488fc817bd10c1c0ba44");
        }
        int match = b.match(uri);
        try {
            if (match == 0) {
                com.meituan.passport.utils.n.a("PassportContentProvider.query", "update", null);
                User user = UserCenter.getInstance(this.c).getUser();
                Object[] objArr2 = {user};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5bdb93d05ba8feabde71d7e948bba3a", RobustBitConfig.DEFAULT_VALUE)) {
                    cursor = (Cursor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5bdb93d05ba8feabde71d7e948bba3a");
                    return cursor;
                }
                com.meituan.passport.utils.n.a("PassportContentProvider.createCursor", "user is : ", user != null ? user.toString() : "user is null");
                String json = new Gson().toJson(user);
                matrixCursor = new MatrixCursor(new String[]{"user"});
                matrixCursor.addRow(new Object[]{json});
                return matrixCursor;
            } else if (match != 4) {
                return null;
            } else {
                com.meituan.passport.utils.n.a("PassportContentProvider.phonenumber.query", "update", null);
                String a2 = com.meituan.passport.utils.ah.a();
                Object[] objArr3 = {a2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97b2125a90a55e0d8a87ce8427698950", RobustBitConfig.DEFAULT_VALUE)) {
                    cursor = (Cursor) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97b2125a90a55e0d8a87ce8427698950");
                    return cursor;
                }
                com.meituan.passport.utils.n.a("PassportContentProvider.createPhoneNumber", "phoneNo is : ", a2);
                matrixCursor = new MatrixCursor(new String[]{"phoneNo"});
                matrixCursor.addRow(new Object[]{a2});
                return matrixCursor;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        String str2;
        Object obj;
        Object[] objArr = {uri, contentValues, str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1986085c03b393622cdab8749065fd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1986085c03b393622cdab8749065fd8")).intValue();
        }
        int match = b.match(uri);
        User user = null;
        switch (match) {
            case 1:
                com.meituan.passport.utils.n.a("PassportContentProvider.update", "type is : TYPE_UPDATE", "");
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48498ad1dd89b13e74510bfc70fca828", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48498ad1dd89b13e74510bfc70fca828");
                    } else {
                        Context context = getContext();
                        if (context != null) {
                            String packageName = context.getPackageName();
                            com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context, "com.meituan.passport");
                            if (createContentResolver != null) {
                                createContentResolver.a(a(packageName, 1), (ContentObserver) null);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return 1;
            case 2:
                com.meituan.passport.utils.n.a("PassportContentProvider.update", "type is : TYPE_SUB_PROCESS_UPDATE", "");
                Object[] objArr3 = {contentValues};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3be31be44430e82214dfe82571d115db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3be31be44430e82214dfe82571d115db");
                } else {
                    if (contentValues == null || (obj = contentValues.get("user")) == null) {
                        str2 = null;
                    } else {
                        str2 = obj.toString();
                        com.meituan.passport.utils.n.a("PassportContentProvider.notifyMainProcessUser", str2 != null ? "userJson is not null" : "userJson is null", "");
                    }
                    try {
                        user = (User) new Gson().fromJson(str2, (Class<Object>) User.class);
                    } catch (Exception unused2) {
                        com.meituan.passport.utils.n.a("PassportContentProvider.notifyMainProcessUser", "user is null", "");
                    }
                    if (user != null) {
                        UserCenter.getInstance(this.c).loginSuccess(user);
                    }
                }
                return 2;
            case 3:
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a0d2af147246ea579cfe8fb203524ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a0d2af147246ea579cfe8fb203524ef");
                } else {
                    UserCenter.getInstance(this.c).subProcessLogout();
                }
                return 3;
            default:
                switch (match) {
                    case 8:
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "64ae7ccd256b1a76cbebbed249872398", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "64ae7ccd256b1a76cbebbed249872398");
                        } else {
                            Context context2 = getContext();
                            if (context2 != null) {
                                String packageName2 = context2.getPackageName();
                                com.meituan.android.privacy.interfaces.t createContentResolver2 = Privacy.createContentResolver(context2, "com.meituan.passport");
                                if (createContentResolver2 != null) {
                                    createContentResolver2.a(a(packageName2, 8), (ContentObserver) null);
                                }
                            }
                        }
                        return 8;
                    case 9:
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c27f02c00e6c2bcbc7a0558d23ae26f6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c27f02c00e6c2bcbc7a0558d23ae26f6");
                        } else {
                            Context context3 = getContext();
                            if (context3 != null) {
                                String packageName3 = context3.getPackageName();
                                com.meituan.android.privacy.interfaces.t createContentResolver3 = Privacy.createContentResolver(context3, "com.meituan.passport");
                                if (createContentResolver3 != null) {
                                    createContentResolver3.a(a(packageName3, 9), (ContentObserver) null);
                                }
                            }
                        }
                        return 9;
                    default:
                        return 0;
                }
        }
    }
}
