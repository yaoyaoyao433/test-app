package com.sankuai.meituan.takeoutnew;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
import com.sankuai.meituan.takeoutnew.ui.page.boot.AgreementActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends MTInstrumentation {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        boolean z = false;
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b466ba0bb4d662d3a3aac78c33548e7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b466ba0bb4d662d3a3aac78c33548e7e");
        }
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3915fd91c0d5df398620e233565d48fc", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3915fd91c0d5df398620e233565d48fc")).booleanValue();
        } else if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            if (intent != null) {
                z = TextUtils.equals(intent.getAction(), "android.intent.action.MAIN");
            }
        } else if (!b) {
            z = true;
        }
        if (z) {
            str = AgreementActivity.class.getName();
        }
        return super.newActivity(classLoader, str, intent);
    }
}
