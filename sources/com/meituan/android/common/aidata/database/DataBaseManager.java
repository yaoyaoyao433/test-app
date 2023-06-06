package com.meituan.android.common.aidata.database;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataBaseManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataBaseHelper mDefaultDbHelper;

    public DataBaseManager() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class InnerClass {
        private static final DataBaseManager STUB = new DataBaseManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static DataBaseManager getDataBaseManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0277d224050411e23d834b7302fb16b8", RobustBitConfig.DEFAULT_VALUE) ? (DataBaseManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0277d224050411e23d834b7302fb16b8") : InnerClass.STUB;
    }

    public <T extends BaseTable<?>> T getTable(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ba68c632717832c879bdb4c476d49e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ba68c632717832c879bdb4c476d49e") : (T) this.mDefaultDbHelper.getTable(cls);
    }

    public void registerDataBase(DataBaseHelper dataBaseHelper) {
        Object[] objArr = {dataBaseHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f8673f8a3938273bdc9e09eb5c7b88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f8673f8a3938273bdc9e09eb5c7b88f");
            return;
        }
        if (dataBaseHelper != null) {
            dataBaseHelper.close();
        }
        this.mDefaultDbHelper = dataBaseHelper;
    }

    public DataBaseHelper getDefaultDB() {
        return this.mDefaultDbHelper;
    }

    public void clearDataBase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fea0d1711343c7de091c04e191f61a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fea0d1711343c7de091c04e191f61a23");
        } else if (this.mDefaultDbHelper != null) {
            this.mDefaultDbHelper.clearDataBase();
        }
    }

    public void releaseDB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c66ebf2956d9d996903591354652fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c66ebf2956d9d996903591354652fba");
        } else if (this.mDefaultDbHelper != null) {
            try {
                this.mDefaultDbHelper.close();
            } catch (Exception unused) {
            }
            this.mDefaultDbHelper = null;
        }
    }
}
