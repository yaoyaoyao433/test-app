package com.meituan.android.common.aidata.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class DataBaseHelper extends SQLiteOpenHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String dbName;
    private final Map<Class<? extends BaseTable<?>>, BaseTable<?>> mDbTables;

    public abstract void initTables(DataBaseHelper dataBaseHelper);

    public DataBaseHelper(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fe4002cf73aff79f29f41fde7aacdf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fe4002cf73aff79f29f41fde7aacdf6");
            return;
        }
        this.dbName = str;
        this.mDbTables = new AsyncHashMap();
        initTables(this);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "410bad1f862d11a1a3e3d946c4c478ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "410bad1f862d11a1a3e3d946c4c478ad");
        } else {
            createTables(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f1388aec85e35011b00faf961d4a77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f1388aec85e35011b00faf961d4a77d");
        } else {
            onUpgradeImpl(sQLiteDatabase, i, i2);
        }
    }

    public void addTable(Class<? extends BaseTable<?>> cls, BaseTable<?> baseTable) {
        Object[] objArr = {cls, baseTable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c9894071c4434a3681eb40ed48c06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c9894071c4434a3681eb40ed48c06c");
        } else {
            this.mDbTables.put(cls, baseTable);
        }
    }

    public Map<Class<? extends BaseTable<?>>, BaseTable<?>> getTables() {
        return this.mDbTables;
    }

    public <T extends BaseTable<?>> T getTable(Class<T> cls) {
        T t;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976bdc481a3713da2469a4a28213748b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "976bdc481a3713da2469a4a28213748b");
        }
        if (cls == null || (t = (T) getTables().get(cls)) == null) {
            return null;
        }
        return t;
    }

    private void createTables(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e4dfeff29ef7c2bc65b5c7e003508e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e4dfeff29ef7c2bc65b5c7e003508e");
        } else if (this.mDbTables != null) {
            for (Class<? extends BaseTable<?>> cls : this.mDbTables.keySet()) {
                BaseTable<?> baseTable = this.mDbTables.get(cls);
                if (baseTable != null) {
                    String createSql = baseTable.getCreateSql();
                    if (!TextUtils.isEmpty(createSql)) {
                        sQLiteDatabase.execSQL(createSql);
                    }
                }
            }
        }
    }

    public void onUpgradeImpl(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ac5d06706ae52afaf6587ec968a4723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ac5d06706ae52afaf6587ec968a4723");
        } else if (this.mDbTables != null) {
            for (Class<? extends BaseTable<?>> cls : this.mDbTables.keySet()) {
                BaseTable<?> baseTable = this.mDbTables.get(cls);
                if (baseTable != null) {
                    baseTable.onUpgrade(sQLiteDatabase, i, i2);
                }
            }
        }
    }

    public void clearDataBase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80dabdfd987b54008f32a861c2895a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80dabdfd987b54008f32a861c2895a1a");
        } else if (this.mDbTables != null) {
            for (Class<? extends BaseTable<?>> cls : this.mDbTables.keySet()) {
                BaseTable<?> baseTable = this.mDbTables.get(cls);
                if (baseTable != null) {
                    baseTable.deleteByCase(null, null);
                }
            }
        }
    }
}
