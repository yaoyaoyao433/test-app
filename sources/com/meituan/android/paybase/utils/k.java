package com.meituan.android.paybase.utils;

import android.content.DialogInterface;
import android.os.Message;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static void a(Field field, DialogInterface dialogInterface) {
        Object[] objArr = {field, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b677995c51c75d1b247ad431c9e42e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b677995c51c75d1b247ad431c9e42e6");
            return;
        }
        try {
            field.setAccessible(true);
            Object obj = field.get(dialogInterface);
            if (obj instanceof Message) {
                ((Message) obj).recycle();
            }
        } catch (Throwable th) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "DialogUtil_recycle").a("message", th.getMessage()).b);
        }
    }
}
