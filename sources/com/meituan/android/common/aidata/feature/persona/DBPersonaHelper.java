package com.meituan.android.common.aidata.feature.persona;

import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.database.DataBaseHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBPersonaHelper extends DataBaseHelper {
    public static final String DB_NAME = "aidata_persona";
    private static final int DN_VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public DBPersonaHelper() {
        super(AIData.getContext(), DB_NAME, 1);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107a80cdf54e8175c552149e75c1bb2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107a80cdf54e8175c552149e75c1bb2e");
        }
    }

    @Override // com.meituan.android.common.aidata.database.DataBaseHelper
    public void initTables(DataBaseHelper dataBaseHelper) {
        Object[] objArr = {dataBaseHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97c19b9d52d5822e88d6f927e4796231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97c19b9d52d5822e88d6f927e4796231");
        } else {
            addTable(PersonaTable.class, new PersonaTable(dataBaseHelper));
        }
    }
}
