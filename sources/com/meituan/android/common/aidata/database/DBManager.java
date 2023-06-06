package com.meituan.android.common.aidata.database;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.cache.table.EventTableV2;
import com.meituan.android.common.aidata.cache.table.GestureTable;
import com.meituan.android.common.aidata.feature.persona.DBPersonaHelper;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBManager {
    private static final String TAG = "DBManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<Class<? extends BaseTable<?>>, DataBaseHelper> tb2DbMap;

    public DBManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60d3133bb41dceeb5a966f1313271a71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60d3133bb41dceeb5a966f1313271a71");
        } else {
            this.tb2DbMap = new AsyncHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final DBManager STUB = new DBManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static DBManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49036cfafa563ba130510a3b755cbba4", RobustBitConfig.DEFAULT_VALUE) ? (DBManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49036cfafa563ba130510a3b755cbba4") : InnerClass.STUB;
    }

    public void registerAllTable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a48a390802c35d6150b96861a981f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a48a390802c35d6150b96861a981f7");
            return;
        }
        registerTable(PersonaTable.class, new DBPersonaHelper());
        DBAIDataHelper dBAIDataHelper = DBAIDataHelper.getInstance();
        registerTable(EventTableV2.class, dBAIDataHelper);
        registerTable(GestureTable.class, dBAIDataHelper);
    }

    public void registerTable(Class<? extends BaseTable<?>> cls, DataBaseHelper dataBaseHelper) {
        Object[] objArr = {cls, dataBaseHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c3440489a59474034f80feabef30e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c3440489a59474034f80feabef30e3c");
        } else if (cls == null || dataBaseHelper == null) {
        } else {
            DataBaseHelper dataBaseHelper2 = this.tb2DbMap.get(cls);
            if (dataBaseHelper2 != null) {
                if (TextUtils.equals(dataBaseHelper2.getDatabaseName(), dataBaseHelper.getDatabaseName())) {
                    return;
                }
                throw new IllegalArgumentException(cls + " had register with different DataBase,pre : " + dataBaseHelper2.getDatabaseName() + ",now : " + dataBaseHelper.getDatabaseName());
            }
            dataBaseHelper.close();
            this.tb2DbMap.put(cls, dataBaseHelper);
        }
    }

    public void unRegisterTable(Class<? extends BaseTable<?>> cls) {
        DataBaseHelper remove;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adc65495d50384b2adca7ffaedd24e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adc65495d50384b2adca7ffaedd24e1a");
        } else if (cls == null || (remove = this.tb2DbMap.remove(cls)) == null) {
        } else {
            remove.close();
        }
    }

    public void clearDataBase(Class<? extends BaseTable<?>> cls) {
        DataBaseHelper dataBaseHelper;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5febb5f0059fc42ae63164b97315c754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5febb5f0059fc42ae63164b97315c754");
        } else if (cls == null || (dataBaseHelper = this.tb2DbMap.get(cls)) == null) {
        } else {
            dataBaseHelper.clearDataBase();
        }
    }

    @Nullable
    public <T> BaseTable<T> getTable(Class<? extends BaseTable<T>> cls) {
        DataBaseHelper dataBaseHelper;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63d9243c49dce004d5af2a2a331acb39", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63d9243c49dce004d5af2a2a331acb39");
        }
        if (cls == null || (dataBaseHelper = this.tb2DbMap.get(cls)) == null) {
            StringBuilder sb = new StringBuilder("table ");
            sb.append(cls);
            sb.append(" has not been registered yet，please call registerTable to register");
            return null;
        }
        return dataBaseHelper.getTable(cls);
    }
}
