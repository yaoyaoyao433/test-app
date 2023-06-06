package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiCommentStateDao extends AbstractDao<PoiCommentState, Long> {
    public static final String TABLENAME = "poi_comment_state";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Poiid = new Property(0, Long.TYPE, "poiid", true, "POIID");
        public static final Property CountWithPic = new Property(1, Integer.TYPE, "countWithPic", false, "COUNT_WITH_PIC");
        public static final Property Totalcomment = new Property(2, Integer.TYPE, "totalcomment", false, "TOTALCOMMENT");
        public static final Property Totalnoempty = new Property(3, Integer.TYPE, "totalnoempty", false, "TOTALNOEMPTY");
        public static final Property RatioTag = new Property(4, String.class, "ratioTag", false, "RATIO_TAG");
        public static final Property AvgScore = new Property(5, Float.TYPE, "avgScore", false, "AVG_SCORE");
        public static final Property LastModified = new Property(6, Long.TYPE, "lastModified", false, "LAST_MODIFIED");
        public static final Property Guide = new Property(7, String.class, "guide", false, "GUIDE");
        public static final Property CountBad = new Property(8, Integer.TYPE, "countBad", false, "COUNT_BAD");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, PoiCommentState poiCommentState) {
        PoiCommentState poiCommentState2 = poiCommentState;
        Object[] objArr = {sQLiteStatement, poiCommentState2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dca9fa25cab2c0bb0fa222cb7a8ff5ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dca9fa25cab2c0bb0fa222cb7a8ff5ee");
            return;
        }
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, poiCommentState2.poiid);
        sQLiteStatement.bindLong(2, poiCommentState2.countWithPic);
        sQLiteStatement.bindLong(3, poiCommentState2.totalcomment);
        sQLiteStatement.bindLong(4, poiCommentState2.totalnoempty);
        String str = poiCommentState2.ratioTag;
        if (str != null) {
            sQLiteStatement.bindString(5, str);
        }
        sQLiteStatement.bindDouble(6, poiCommentState2.avgScore);
        sQLiteStatement.bindLong(7, poiCommentState2.lastModified);
        String str2 = poiCommentState2.guide;
        if (str2 != null) {
            sQLiteStatement.bindString(8, str2);
        }
        sQLiteStatement.bindLong(9, poiCommentState2.countBad);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(PoiCommentState poiCommentState) {
        PoiCommentState poiCommentState2 = poiCommentState;
        Object[] objArr = {poiCommentState2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d84cc7e4b497b9692e9e67c27a06a83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d84cc7e4b497b9692e9e67c27a06a83");
        }
        if (poiCommentState2 != null) {
            return Long.valueOf(poiCommentState2.poiid);
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ PoiCommentState readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c359b8243ed20a2fa40bd052573719a", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c359b8243ed20a2fa40bd052573719a");
        }
        long j = cursor.getLong(i + 0);
        int i2 = cursor.getInt(i + 1);
        int i3 = cursor.getInt(i + 2);
        int i4 = cursor.getInt(i + 3);
        int i5 = i + 4;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 7;
        return new PoiCommentState(j, i2, i3, i4, string, cursor.getFloat(i + 5), cursor.getLong(i + 6), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.getInt(i + 8));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, PoiCommentState poiCommentState, int i) {
        PoiCommentState poiCommentState2 = poiCommentState;
        Object[] objArr = {cursor, poiCommentState2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec18d96461bb1404a5652e935741e45d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec18d96461bb1404a5652e935741e45d");
            return;
        }
        poiCommentState2.a(cursor.getLong(i + 0));
        poiCommentState2.countWithPic = cursor.getInt(i + 1);
        poiCommentState2.totalcomment = cursor.getInt(i + 2);
        poiCommentState2.totalnoempty = cursor.getInt(i + 3);
        int i2 = i + 4;
        poiCommentState2.ratioTag = cursor.isNull(i2) ? null : cursor.getString(i2);
        poiCommentState2.avgScore = cursor.getFloat(i + 5);
        long j = cursor.getLong(i + 6);
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = PoiCommentState.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, poiCommentState2, changeQuickRedirect3, false, "5bf86d20035fd96bd87ec4675ffae9b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poiCommentState2, changeQuickRedirect3, false, "5bf86d20035fd96bd87ec4675ffae9b3");
        } else {
            poiCommentState2.lastModified = j;
        }
        int i3 = i + 7;
        poiCommentState2.guide = cursor.isNull(i3) ? null : cursor.getString(i3);
        poiCommentState2.countBad = cursor.getInt(i + 8);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11b8f53a3f2bb4b80c1bb5a5dfde2d99", RobustBitConfig.DEFAULT_VALUE) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11b8f53a3f2bb4b80c1bb5a5dfde2d99") : Long.valueOf(cursor.getLong(i + 0));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(PoiCommentState poiCommentState, long j) {
        PoiCommentState poiCommentState2 = poiCommentState;
        Object[] objArr = {poiCommentState2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd82e1bb02333bda6438d7b6b5cf282", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd82e1bb02333bda6438d7b6b5cf282");
        }
        poiCommentState2.a(j);
        return Long.valueOf(j);
    }

    public PoiCommentStateDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9680062888ed1949c45ad5e8ae3e16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9680062888ed1949c45ad5e8ae3e16");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea6fa892eaadaaabfa9e1278c43924a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea6fa892eaadaaabfa9e1278c43924a6");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'poi_comment_state' ('POIID' INTEGER PRIMARY KEY NOT NULL ,'COUNT_WITH_PIC' INTEGER NOT NULL ,'TOTALCOMMENT' INTEGER NOT NULL ,'TOTALNOEMPTY' INTEGER NOT NULL ,'RATIO_TAG' TEXT,'AVG_SCORE' REAL NOT NULL ,'LAST_MODIFIED' INTEGER NOT NULL ,'GUIDE' TEXT,'COUNT_BAD' INTEGER NOT NULL );");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f84ae355fd08fe9165e43a80959cd628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f84ae355fd08fe9165e43a80959cd628");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'poi_comment_state'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
