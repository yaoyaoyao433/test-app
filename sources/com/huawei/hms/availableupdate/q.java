package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class q extends o {
    @Override // com.huawei.hms.availableupdate.o
    public AlertDialog g() {
        ProgressDialog progressDialog = new ProgressDialog(e(), f());
        progressDialog.setMessage(ResourceLoaderUtil.getString("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
