package com.meituan.mmp.main.fusion;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.t;
import com.meituan.mmp.lib.utils.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.i;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends i {
    public static ChangeQuickRedirect c;
    public Boolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89aabd4adfeb1f4a9971c1c2103859ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89aabd4adfeb1f4a9971c1c2103859ff");
        }
    }

    @Override // com.meituan.mmp.main.i
    public final boolean a(Context context, Intent intent, boolean z) {
        boolean booleanValue;
        boolean z2;
        int i;
        String dataString;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be467dda1880c560ab7914e21ab9df8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be467dda1880c560ab7914e21ab9df8")).booleanValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c9eb4932d650ad0191dcd1f62e96cbc", RobustBitConfig.DEFAULT_VALUE)) {
            booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c9eb4932d650ad0191dcd1f62e96cbc")).booleanValue();
        } else if (this.d != null) {
            booleanValue = this.d.booleanValue();
        } else {
            String packageName = context.getPackageName();
            this.d = Boolean.valueOf("com.sankuai.meituan".equals(packageName) || "com.dianping.v1".equals(packageName));
            booleanValue = this.d.booleanValue();
        }
        if (!booleanValue || (dataString = intent.getDataString()) == null || dataString.contains(ContainerInfo.ENV_MMP)) {
            Object[] objArr3 = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "59b0d35473312cc64ea31fd9b88b3d93", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "59b0d35473312cc64ea31fd9b88b3d93")).booleanValue();
            }
            Class<? extends HeraActivity> b = b.b(context, intent);
            if (b != null) {
                boolean a2 = com.meituan.mmp.lib.engine.i.a(intent);
                if (AppBrandHeraActivity.class.isAssignableFrom(b)) {
                    if (a2) {
                        intent.addFlags(32768);
                        return true;
                    }
                    return false;
                }
                String a3 = b.a(intent);
                Boolean isForceFusionMode = MMPEnvHelper.isForceFusionMode();
                if (f.a(intent, "fusion", isForceFusionMode != null ? isForceFusionMode.booleanValue() : false) || (a3 != null && b.d.containsKey(a3))) {
                    int flags = intent.getFlags() & 603979776;
                    Object[] objArr4 = {intent, a3};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "31ab0650da3ba9b5d6fd095387af92de", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "31ab0650da3ba9b5d6fd095387af92de")).booleanValue();
                    } else if (f.a(intent, "finishByExitMiniProgram", false)) {
                        if (c.a(a3)) {
                            b.a(a3, intent);
                        }
                        intent.setFlags(67108864);
                        intent.putExtra("finishByExitMiniProgram", true);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                    if (a3 == null || !TextUtils.equals(t.a(), a3)) {
                        i = 0;
                    } else {
                        com.meituan.mmp.lib.trace.b.b("MMPInstrumentation", "add FLAG_ACTIVITY_SINGLE_TOP for top activity");
                        i = 536870912;
                    }
                    if ((b.a(context, intent) || z.a(intent, "relaunch", false)) && c.a(a3)) {
                        b.a(a3, intent);
                        i |= 603979776;
                        com.meituan.mmp.lib.trace.b.b("MMPInstrumentation", "add FLAG_ACTIVITY_CLEAR_TOP | SINGLE_TOP for tab page");
                    }
                    if (a2 && (i & 536870912) != 0) {
                        com.meituan.mmp.lib.trace.b.b("MMPInstrumentation", "remove FLAG_ACTIVITY_SINGLE_TOP for reload");
                        i &= -536870913;
                    }
                    if (flags != i) {
                        intent.addFlags(i);
                        if (!z && !f.a(intent, "finishAndStartDone", false)) {
                            intent.putExtra("finishAndStart", true);
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
