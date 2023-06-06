package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class MeizuDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public MeizuDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "783ba23ee9ce150f79a2a62c81c911d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "783ba23ee9ce150f79a2a62c81c911d0");
        } else {
            this.mContext = context;
        }
    }

    private String getOaid(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c3b1c674528d0a4e95e7d46d6519d18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c3b1c674528d0a4e95e7d46d6519d18");
        }
        if (cursor == null) {
            return null;
        }
        try {
            if (cursor.isClosed()) {
                return null;
            }
            cursor.moveToFirst();
            return cursor.getString(cursor.getColumnIndex("value"));
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return "";
        }
    }

    private boolean isMeizuSupport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ede0d6bc778ccaac9c0d06ee913f53bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ede0d6bc778ccaac9c0d06ee913f53bb")).booleanValue();
        }
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            if (packageManager != null) {
                if (packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
        return false;
    }

    public String getMeizuID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c5c92d1a2183e82904a9308fce064ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c5c92d1a2183e82904a9308fce064ac");
        }
        try {
            this.mContext.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0);
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
        try {
            Cursor query = this.mContext.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            String oaid = getOaid(query);
            query.close();
            return oaid;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }
}
