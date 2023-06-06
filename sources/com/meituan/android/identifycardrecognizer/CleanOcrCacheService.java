package com.meituan.android.identifycardrecognizer;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CleanOcrCacheService extends IntentService {
    public static ChangeQuickRedirect a;

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ede03d4dee4ff6c67527b3a95882ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ede03d4dee4ff6c67527b3a95882ebe");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe3e77ced4bc1a3b4cac9a0dcbd6767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe3e77ced4bc1a3b4cac9a0dcbd6767");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
    }

    public CleanOcrCacheService() {
        super("PayCleanIdPhotoCache");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d041cf676c2a653761f4ec9265ff18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d041cf676c2a653761f4ec9265ff18");
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ccd2ffebeb3d5dace802b828989a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ccd2ffebeb3d5dace802b828989a1e");
            return;
        }
        File a2 = q.a(getApplicationContext(), "jinrong_cips", "", u.d);
        a(new File(a2, "meituan_idcard_ocr/pic").toString());
        a(new File(a2, "meituan_idcard_ocr/compress").toString());
    }

    @MTPaySuppressFBWarnings({"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    private void a(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1560c0e75bf26562d4785e7e9dd2387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1560c0e75bf26562d4785e7e9dd2387");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                File file = new File(str);
                if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        a(file2.getAbsolutePath());
                    }
                }
                if (!file.isDirectory()) {
                    file.delete();
                } else if (file.listFiles() != null && file.listFiles().length == 0) {
                    file.delete();
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CleanOcrCacheService_deleteFolderFile").a("message", e.getMessage()).b);
            }
        }
    }
}
