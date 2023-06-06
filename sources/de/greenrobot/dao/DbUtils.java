package de.greenrobot.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DbUtils {
    public static void vacuum(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("VACUUM");
    }

    public static int executeSqlScript(Context context, SQLiteDatabase sQLiteDatabase, String str) throws IOException {
        return executeSqlScript(context, sQLiteDatabase, str, true);
    }

    public static int executeSqlScript(Context context, SQLiteDatabase sQLiteDatabase, String str, boolean z) throws IOException {
        int executeSqlStatements;
        String[] split = new String(readAsset(context, str), "UTF-8").split(";(\\s)*[\n\r]");
        if (z) {
            executeSqlStatements = executeSqlStatementsInTx(sQLiteDatabase, split);
        } else {
            executeSqlStatements = executeSqlStatements(sQLiteDatabase, split);
        }
        DaoLog.i("Executed " + executeSqlStatements + " statements from SQL script '" + str + CommonConstant.Symbol.SINGLE_QUOTES);
        return executeSqlStatements;
    }

    public static int executeSqlStatementsInTx(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransaction();
        try {
            int executeSqlStatements = executeSqlStatements(sQLiteDatabase, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return executeSqlStatements;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static int executeSqlStatements(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        int i = 0;
        for (String str : strArr) {
            String trim = str.trim();
            if (trim.length() > 0) {
                sQLiteDatabase.execSQL(trim);
                i++;
            }
        }
        return i;
    }

    public static int copyAllBytes(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            outputStream.write(bArr, 0, read);
            i += read;
        }
    }

    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyAllBytes(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAsset(Context context, String str) throws IOException {
        InputStream open = context.getResources().getAssets().open(str);
        try {
            return readAllBytes(open);
        } finally {
            open.close();
        }
    }

    public static void logTableDump(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(str, null, null, null, null, null, null);
        try {
            DaoLog.d(DatabaseUtils.dumpCursorToString(query));
        } finally {
            query.close();
        }
    }
}
