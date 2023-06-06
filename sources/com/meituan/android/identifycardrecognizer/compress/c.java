package com.meituan.android.identifycardrecognizer.compress;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private String c;
    private long d;

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7082da6a0f980b0f5867577e346020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7082da6a0f980b0f5867577e346020");
        }
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2782be34eead84364a63e2429ed8ff6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2782be34eead84364a63e2429ed8ff6d");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c(context);
                }
            }
        }
        File file = new File(q.a(context, "jinrong_cips", "", u.d), "meituan_idcard_ocr/compress");
        if (!file.exists()) {
            file.mkdirs();
        }
        c cVar = b;
        String file2 = file.toString();
        Object[] objArr2 = {file2, 512000L};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2eb106ead07bd239bce9b447cbbe9ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2eb106ead07bd239bce9b447cbbe9ec6");
        } else {
            cVar.c = file2;
            cVar.d = 512000L;
        }
        return b;
    }

    public final void a(final String str, final b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9e7f995b0044cee1cd4f3906f87bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9e7f995b0044cee1cd4f3906f87bbf");
        } else if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(str)) {
        } else {
            File file = new File(str);
            if (file.exists()) {
                final String name = file.getName();
                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.identifycardrecognizer.compress.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f20362deeb8a319093fddf7097ffa7b3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f20362deeb8a319093fddf7097ffa7b3");
                            return;
                        }
                        String str2 = str;
                        new a(str2, c.this.c + "/" + c.this.a(name) + ".jpg", c.this.d).a(bVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b1a797254783769221fc7303f86a1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b1a797254783769221fc7303f86a1b");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "ImageCompressManager_getMD5").a("message", e.getMessage()).b);
            return str;
        }
    }
}
