package com.meituan.android.common.badge.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.android.common.badge.util.BitOperator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Data {
    public static final String CREATE_CACHE_TB_SQL = "CREATE TABLE IF NOT EXISTS d ( k text PRIMARY KEY , v text not null , f integer not null default 0 ); ";
    public static final int MASK_FLAG_BASE = 1;
    public static final int MASK_FLAG_URGENT = 2;
    public static final String TB_DATA_COL_FLAG = "f";
    public static final String TB_DATA_COL_VAL = "v";
    public static final String TB_DATA_NAME = "d";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final String TB_DATA_COL_KEY = "k";
    public static final String[] sAllColumns = {TB_DATA_COL_KEY, "v", "f"};

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class DataEntity {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isBase;
        public boolean isUrgent;
        public String key;
        public String val;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fc06b8f701b75c47f835376fe5fc778", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fc06b8f701b75c47f835376fe5fc778");
            }
            return "key: " + this.key + ", val: " + this.val + ", base: " + this.isBase + ", urgent: " + this.isUrgent;
        }
    }

    public static DataEntity asEntity(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca4b43d2591147702246473e8bfc9050", RobustBitConfig.DEFAULT_VALUE)) {
            return (DataEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca4b43d2591147702246473e8bfc9050");
        }
        DataEntity dataEntity = new DataEntity();
        dataEntity.key = cursor.getString(cursor.getColumnIndex(TB_DATA_COL_KEY));
        dataEntity.val = cursor.getString(cursor.getColumnIndex("v"));
        int i = cursor.getInt(cursor.getColumnIndex("f"));
        dataEntity.isBase = BitOperator.isBitSettled(i, 1);
        dataEntity.isUrgent = BitOperator.isBitSettled(i, 2);
        return dataEntity;
    }

    public static ContentValues asContentValue(DataEntity dataEntity) {
        Object[] objArr = {dataEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6df85d94254e3a102722c465f4e7db29", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6df85d94254e3a102722c465f4e7db29");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(TB_DATA_COL_KEY, dataEntity.key);
        contentValues.put("v", dataEntity.val);
        contentValues.put("f", Integer.valueOf(BitOperator.setBit(BitOperator.setBit(0, 2, dataEntity.isUrgent), 1, dataEntity.isBase)));
        return contentValues;
    }
}
