package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.meituan.android.common.statistics.Constants;
import com.xiaomi.push.gt;
/* loaded from: classes6.dex */
public class TrafficProvider extends ContentProvider {
    public static final Uri a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");
    private static final UriMatcher b;
    private SQLiteOpenHelper c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        b.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (b.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (a.a) {
            if (b.match(uri) != 1) {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
            query = this.c.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (b.match(uri) == 2 && contentValues != null && contentValues.containsKey(Constants.Environment.KEY_IMSI)) {
            gt.a(contentValues.getAsString(Constants.Environment.KEY_IMSI));
            return 0;
        }
        return 0;
    }
}
