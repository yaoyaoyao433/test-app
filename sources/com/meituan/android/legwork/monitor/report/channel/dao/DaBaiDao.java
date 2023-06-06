package com.meituan.android.legwork.monitor.report.channel.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.mtguard.CryptoKeyIndex;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DaBaiDao {
    public static final String ID = "id";
    private static volatile DaBaiDao INSTANCE = null;
    public static final String JSON_DATA = "json";
    public static final String KEY = "key";
    public static final String TABLE_NAME = "da_bai_data";
    private static final String TAG = "DaBaiDao";
    public static final String TIME = "time";
    public static final String TYPE = "type";
    public static final int TYPE_KEY_LOG = 1;
    public static final int TYPE_MONITOR = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Pattern mLocationPattern;

    public DaBaiDao() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0756d56e3f902831c8e2724eed4af06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0756d56e3f902831c8e2724eed4af06");
        } else {
            this.mLocationPattern = Pattern.compile("\"?\\w*?(longitude|latitude|lat|lng)\\\\?\"?[:=]\\\\?\"?(\\d{1,3}\\.\\d{6,}|\\d{1,})\"?", 2);
        }
    }

    public static DaBaiDao getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3788def5e09a811a8a096b099dd765b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DaBaiDao) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3788def5e09a811a8a096b099dd765b3");
        }
        if (INSTANCE == null) {
            synchronized (DaBaiDao.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DaBaiDao();
                }
            }
        }
        return INSTANCE;
    }

    public static void createTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b54fb63e5fabc5b13a824936f5fcb1fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b54fb63e5fabc5b13a824936f5fcb1fc");
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS da_bai_data (id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT, time INTEGER,json TEXT,type INTEGER)");
        } catch (SQLException e) {
            x.e("DaBaiDao.createTable()", "exception msg:", e);
        }
    }

    public List<DaBaiBean> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f41bec76eda9b96d00280a576df48f06", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f41bec76eda9b96d00280a576df48f06");
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ChannelDBHelper.getInstance().getWritableDatabase().query(TABLE_NAME, null, null, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    DaBaiBean dataFromCursor = getDataFromCursor(query);
                    if (dataFromCursor != null) {
                        arrayList.add(dataFromCursor);
                    }
                }
                query.close();
            }
        } catch (Exception e) {
            x.e("DaBaiDao.getAll()", "exception msg:", e);
        }
        return arrayList;
    }

    public List<DaBaiBean> getLimit(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cfe15dc9cba7cb30fdad44f3db405ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cfe15dc9cba7cb30fdad44f3db405ac");
        }
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            Cursor query = ChannelDBHelper.getInstance().getWritableDatabase().query(TABLE_NAME, null, "type=" + i2, null, null, null, null, sb.toString());
            if (query != null) {
                while (query.moveToNext()) {
                    DaBaiBean dataFromCursor = getDataFromCursor(query);
                    if (dataFromCursor != null) {
                        arrayList.add(dataFromCursor);
                    }
                }
                query.close();
            }
        } catch (Exception e) {
            x.e("DaBaiDao.getLimit()", "exception msg:", e);
        }
        return arrayList;
    }

    private DaBaiBean getDataFromCursor(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "287568d8cb8e1ff6eb10c7063a691303", RobustBitConfig.DEFAULT_VALUE)) {
            return (DaBaiBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "287568d8cb8e1ff6eb10c7063a691303");
        }
        DaBaiBean daBaiBean = (DaBaiBean) new Gson().fromJson(new String(MTGuard.decrypt(Base64.decode(cursor.getString(cursor.getColumnIndex(JSON_DATA))), CryptoKeyIndex.AESKEY)), (Class<Object>) DaBaiBean.class);
        if (daBaiBean != null) {
            daBaiBean.id = cursor.getLong(cursor.getColumnIndex("id"));
        }
        return daBaiBean;
    }

    public void insert(DaBaiBean daBaiBean) {
        Object[] objArr = {daBaiBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e519fc79979ed97945dbe0a6e782240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e519fc79979ed97945dbe0a6e782240");
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ChannelDBHelper.getInstance().getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", daBaiBean.key);
            contentValues.put("time", Integer.valueOf(daBaiBean.time));
            if (TextUtils.equals(daBaiBean.key, "LegworkLog")) {
                contentValues.put("type", (Integer) 1);
                if (daBaiBean.tags != null) {
                    Object obj = daBaiBean.tags.get("logMessage");
                    if (obj instanceof String) {
                        daBaiBean.tags.put("logMessage", this.mLocationPattern.matcher((String) obj).replaceAll(""));
                    }
                }
            } else {
                contentValues.put("type", (Integer) 0);
            }
            contentValues.put(JSON_DATA, Base64.encodeBytes(MTGuard.encrypt(new Gson().toJson(daBaiBean).getBytes(), CryptoKeyIndex.AESKEY)));
            writableDatabase.insert(TABLE_NAME, null, contentValues);
        } catch (Exception e) {
            x.e("DaBaiDao.insert()", "exception msg:", e);
        }
    }

    public void deleteByIds(List<Long> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff15da8690b88c19a4cd51841f55ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff15da8690b88c19a4cd51841f55ff6");
            return;
        }
        for (Long l : list) {
            deleteById(l.longValue());
        }
    }

    public boolean deleteById(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8afd6a6c3aada29fd529a04bdff151", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8afd6a6c3aada29fd529a04bdff151")).booleanValue();
        }
        try {
            StringBuilder sb = new StringBuilder("id=");
            sb.append(j);
            return ChannelDBHelper.getInstance().getWritableDatabase().delete(TABLE_NAME, sb.toString(), null) > 0;
        } catch (Exception e) {
            x.e("DaBaiDao.deleteById()", "exception msg:", e);
            return false;
        }
    }

    public int deleteBeforeTime(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9685fe9e9b15cbdfe462b3c9f3da56c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9685fe9e9b15cbdfe462b3c9f3da56c")).intValue();
        }
        try {
            return ChannelDBHelper.getInstance().getWritableDatabase().delete(TABLE_NAME, "time<" + i + " and type = " + i2, null);
        } catch (Exception e) {
            x.e("DaBaiDao.deleteBeforeTime()", "exception msg:", e);
            return 0;
        }
    }

    public int deleteAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b1cf1fe4d14315399eed9e53c5016ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b1cf1fe4d14315399eed9e53c5016ec")).intValue();
        }
        try {
            return ChannelDBHelper.getInstance().getWritableDatabase().delete(TABLE_NAME, null, null);
        } catch (Exception e) {
            x.e("DaBaiDao.deleteAll()", "exception msg:", e);
            return 0;
        }
    }

    public int getCount() {
        int i;
        Cursor query;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28145b71677372135eec6235a2bf22a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28145b71677372135eec6235a2bf22a9")).intValue();
        }
        try {
            query = ChannelDBHelper.getInstance().getWritableDatabase().query(TABLE_NAME, null, null, null, null, null, null);
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        if (query != null) {
            i = query.getCount();
            try {
                query.close();
            } catch (Exception e2) {
                e = e2;
                x.e("DaBaiDao.getCount()", "exception msg:", e);
                return i;
            }
            return i;
        }
        return 0;
    }
}
