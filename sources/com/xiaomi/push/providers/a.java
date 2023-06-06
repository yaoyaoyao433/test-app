package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.xiaomi.channel.commonutils.logger.c;
/* loaded from: classes6.dex */
public final class a extends SQLiteOpenHelper {
    private static int b = 1;
    public static final Object a = new Object();
    private static final String[] c = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", NetLogConstants.Tags.NETWORK_TYPE, " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", Constants.Environment.KEY_IMSI, "TEXT"};

    public a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (a) {
            try {
                StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
                for (int i = 0; i < c.length - 1; i += 2) {
                    if (i != 0) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                    sb.append(c[i]);
                    sb.append(StringUtil.SPACE);
                    sb.append(c[i + 1]);
                }
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
            } catch (SQLException e) {
                c.a(e);
            }
        }
    }
}
