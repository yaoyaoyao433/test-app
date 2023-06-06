package com.meituan.android.common.aidata.database;

import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.data.LxDataSource;
import com.meituan.android.common.aidata.database.DBConstants;
import com.meituan.android.common.aidata.utils.DensityUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum SQLPlaceholder {
    APP_LAUNCH_ID("$%cur_app_launch_id%$"),
    SESSION_ID("$%cur_session_id%$"),
    EVENT_TABLE_NAME("$%tablename%$"),
    GESTURE_TABLE_NAME("$%gesturetable%$"),
    SCREEN_WIDTH("$%screen_width%$"),
    SCREEN_HEIGHT("$%screen_height%$"),
    OSN("$%osn%$"),
    BRAND("$%brand%$"),
    DEVICE_MODEL("$%dm%$"),
    CT("$%ct%$");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String placeHolder;

    public static SQLPlaceholder valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa41b95fe388764cc1b72220881e8425", RobustBitConfig.DEFAULT_VALUE) ? (SQLPlaceholder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa41b95fe388764cc1b72220881e8425") : (SQLPlaceholder) Enum.valueOf(SQLPlaceholder.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SQLPlaceholder[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f68aa5764fb040ff513682e7e3593931", RobustBitConfig.DEFAULT_VALUE) ? (SQLPlaceholder[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f68aa5764fb040ff513682e7e3593931") : (SQLPlaceholder[]) values().clone();
    }

    SQLPlaceholder(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4ba4b4e1088709f623581ac5bef509d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4ba4b4e1088709f623581ac5bef509d");
        } else {
            this.placeHolder = str == null ? "" : str;
        }
    }

    @NonNull
    public final String getPlaceHolder() {
        return this.placeHolder;
    }

    public static String getReplacement(SQLPlaceholder sQLPlaceholder) {
        Object[] objArr = {sQLPlaceholder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c2ac6117bfc0e0124a872a1731854c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c2ac6117bfc0e0124a872a1731854c3");
        }
        switch (sQLPlaceholder) {
            case APP_LAUNCH_ID:
                return LxDataSource.APP_LAUNCH_ID;
            case SESSION_ID:
                return Statistics.getSession();
            case EVENT_TABLE_NAME:
                return "BaseTable";
            case GESTURE_TABLE_NAME:
                return DBConstants.TableName.GESTURE_TABLE;
            case SCREEN_WIDTH:
                return String.valueOf(DensityUtils.getScreenWidth(AIData.getContext()));
            case SCREEN_HEIGHT:
                return String.valueOf(DensityUtils.getScreenHeight(AIData.getContext()));
            case OSN:
                String str = Build.HOST;
                return str != null ? str : "unknown";
            case BRAND:
                String str2 = Build.BRAND;
                return str2 != null ? str2 : "unknown";
            case DEVICE_MODEL:
                String str3 = Build.MODEL;
                return str3 != null ? str3 : "unknown";
            case CT:
                return "android";
            default:
                return "";
        }
    }
}
