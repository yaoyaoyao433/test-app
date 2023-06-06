package com.meituan.android.common.aidata.feature.persona;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBLocks;
import com.meituan.android.common.aidata.feature.bean.PersonaBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PersonaTable extends BaseTable<PersonaBean> {
    public static final String ELEMENT_TYPE = "element_type";
    public static final String FEATURE_IDENTIFIER = "feature_identifier";
    public static final String FEATURE_VALUE = "feature_value";
    public static final String LABEL_ID = "label_id";
    public static final String TABLE_PERSONA = "persona";
    public static final String TYPE = "type";
    public static final String UPDATE_PERIOD = "update_period";
    public static final String UPDATE_TIMESTAMP = "update_timestamp";
    public static final String USER_ID = "user_id";
    public static final String VALUE_TYPE = "value_type";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public String getCreateSql() {
        return "CREATE TABLE IF NOT EXISTS persona(id INTEGER PRIMARY KEY AUTOINCREMENT,update_timestamp INTEGER,element_type INTEGER,label_id INTEGER,feature_value TEXT,value_type INTEGER,update_period INTEGER,user_id INTEGER,type INTEGER,feature_identifier TEXT)";
    }

    public PersonaTable(SQLiteOpenHelper sQLiteOpenHelper) {
        super(TABLE_PERSONA, sQLiteOpenHelper, DBLocks.PERSONA_DB_RW_LOCK);
        Object[] objArr = {sQLiteOpenHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010a3675c09257897b2ad710d0189cd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010a3675c09257897b2ad710d0189cd2");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.android.common.aidata.database.BaseTable
    public PersonaBean getItemFromCursor(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ecf497be096aff45783542f5ca60612", RobustBitConfig.DEFAULT_VALUE)) {
            return (PersonaBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ecf497be096aff45783542f5ca60612");
        }
        PersonaBean personaBean = new PersonaBean();
        personaBean.update_timestamp = getLongValue(cursor, UPDATE_TIMESTAMP, -1L);
        personaBean.element_type = getIntValue(cursor, ELEMENT_TYPE, -1);
        personaBean.label_id = getIntValue(cursor, LABEL_ID, -1);
        personaBean.feature_value = getStringValue(cursor, FEATURE_VALUE, null);
        personaBean.value_type = getIntValue(cursor, VALUE_TYPE, -1);
        personaBean.update_period = getLongValue(cursor, UPDATE_PERIOD, -1L);
        personaBean.user_id = getIntValue(cursor, "user_id", -1);
        personaBean.type = getIntValue(cursor, "type", -1);
        personaBean.feature_identifier = getStringValue(cursor, FEATURE_IDENTIFIER, null);
        return personaBean;
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public ContentValues getContentValues(PersonaBean personaBean) {
        Object[] objArr = {personaBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82dbe924dd28c4dc9d29a51bf5f0c886", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82dbe924dd28c4dc9d29a51bf5f0c886");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(UPDATE_TIMESTAMP, Long.valueOf(personaBean.update_timestamp));
        contentValues.put(ELEMENT_TYPE, Integer.valueOf(personaBean.element_type));
        contentValues.put(LABEL_ID, Integer.valueOf(personaBean.label_id));
        contentValues.put(FEATURE_VALUE, personaBean.feature_value);
        contentValues.put(VALUE_TYPE, Integer.valueOf(personaBean.value_type));
        contentValues.put(UPDATE_PERIOD, Long.valueOf(personaBean.update_period));
        contentValues.put("user_id", Long.valueOf(personaBean.user_id));
        contentValues.put("type", Integer.valueOf(personaBean.type));
        contentValues.put(FEATURE_IDENTIFIER, personaBean.feature_identifier);
        return contentValues;
    }
}
