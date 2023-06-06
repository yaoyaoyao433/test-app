package de.greenrobot.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TableStatements {
    private final String[] allColumns;
    private final SQLiteDatabase db;
    private SQLiteStatement deleteStatement;
    private SQLiteStatement insertOrReplaceStatement;
    private SQLiteStatement insertStatement;
    private final String[] pkColumns;
    private volatile String selectAll;
    private volatile String selectByKey;
    private volatile String selectByRowId;
    private final String tablename;
    private SQLiteStatement updateStatement;

    /* JADX INFO: Access modifiers changed from: protected */
    public TableStatements(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.db = sQLiteDatabase;
        this.tablename = str;
        this.allColumns = strArr;
        this.pkColumns = strArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SQLiteStatement getInsertStatement() {
        if (this.insertStatement == null) {
            this.insertStatement = this.db.compileStatement(SqlUtils.createSqlInsert("INSERT INTO ", this.tablename, this.allColumns));
        }
        return this.insertStatement;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SQLiteStatement getInsertOrReplaceStatement() {
        if (this.insertOrReplaceStatement == null) {
            this.insertOrReplaceStatement = this.db.compileStatement(SqlUtils.createSqlInsert("INSERT OR REPLACE INTO ", this.tablename, this.allColumns));
        }
        return this.insertOrReplaceStatement;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SQLiteStatement getDeleteStatement() {
        if (this.deleteStatement == null) {
            this.deleteStatement = this.db.compileStatement(SqlUtils.createSqlDelete(this.tablename, this.pkColumns));
        }
        return this.deleteStatement;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SQLiteStatement getUpdateStatement() {
        if (this.updateStatement == null) {
            this.updateStatement = this.db.compileStatement(SqlUtils.createSqlUpdate(this.tablename, this.allColumns, this.pkColumns));
        }
        return this.updateStatement;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getSelectAll() {
        if (this.selectAll == null) {
            this.selectAll = SqlUtils.createSqlSelect(this.tablename, "T", this.allColumns);
        }
        return this.selectAll;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getSelectByKey() {
        if (this.selectByKey == null) {
            StringBuilder sb = new StringBuilder(getSelectAll());
            sb.append("WHERE ");
            SqlUtils.appendColumnsEqValue(sb, "T", this.pkColumns);
            this.selectByKey = sb.toString();
        }
        return this.selectByKey;
    }

    public String getSelectByRowId() {
        if (this.selectByRowId == null) {
            this.selectByRowId = String.valueOf(getSelectAll()) + "WHERE ROWID=?";
        }
        return this.selectByRowId;
    }
}
