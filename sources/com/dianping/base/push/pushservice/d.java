package com.dianping.base.push.pushservice;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public q b;

    private d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9f0d3dad8d865cd20d97903c0d81c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9f0d3dad8d865cd20d97903c0d81c1");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.b = q.a(applicationContext, context.getPackageName() + CommonConstant.Symbol.UNDERLINE + str, 1);
    }

    public static d a(Context context) throws Exception {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "588e029e045a357cbbfa58c55728bacb", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "588e029e045a357cbbfa58c55728bacb");
        }
        if (context != null) {
            Object[] objArr2 = {context, "singleprocessdppush"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86dd6b7d77c2313a8077fbbc6c95e928", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86dd6b7d77c2313a8077fbbc6c95e928");
            }
            if (context == null) {
                throw new Exception("Application is dead");
            }
            return new d(context, "singleprocessdppush");
        }
        throw new Exception("Application is dead");
    }

    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa1500446114bf5662dfd67c54b1921", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa1500446114bf5662dfd67c54b1921")).intValue() : this.b.b(str, i);
    }

    public final void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a4190e087c34ecdc5db8068722ac5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a4190e087c34ecdc5db8068722ac5b");
        } else {
            this.b.a(str, i);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8607a2960dfa612dceb4070bab37dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8607a2960dfa612dceb4070bab37dff");
        } else {
            this.b.a(str, z);
        }
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c62e292e065ccab86dd6e674e1531d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c62e292e065ccab86dd6e674e1531d") : this.b.b(str, str2);
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5250e35ac2cc3108eeac03f0a4140f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5250e35ac2cc3108eeac03f0a4140f");
        } else {
            this.b.a(str, str2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca79c1f428eda981f879957361c06ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca79c1f428eda981f879957361c06ca7");
        } else {
            this.b.b(str);
        }
    }
}
