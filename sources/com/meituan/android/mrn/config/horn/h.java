package com.meituan.android.mrn.config.horn;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static h b = new h();

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a64dc315c5064ef22fef0b058d87d9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a64dc315c5064ef22fef0b058d87d9d");
            return;
        }
        a("fspEnable", Boolean.TYPE, Boolean.FALSE, "是否支持首屏统计算法（总开关）");
        a("fspReportDelay", Integer.TYPE, 3, "在此时间内无新增元素时，认为首屏稳定，单位是s");
        a("fspEffectivePercent", Integer.TYPE, 5, "fps有效面积占比");
        a("rootEffectivePercent", Integer.TYPE, 70, "rootView 有效面积占比");
        a("pageBlackList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.h.1
        }.getType(), null, "");
        a("specifySamplingRate", Boolean.TYPE, Boolean.FALSE, "特殊采样率开关");
        a("specifySamplingList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.h.2
        }.getType(), null, "");
        a("middleDeviceTime", Integer.TYPE, 5, "中端机首屏稳定时间");
        a("lowDeviceTime", Integer.TYPE, 8, "低端机首屏稳定时间");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9463ab2fa045d47518af9fb8d1e93f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9463ab2fa045d47518af9fb8d1e93f52");
        } else {
            t.a(str, type, obj, "mrn_fsp_android", str2);
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174402207fb2bcccceb13ffa657c3c9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174402207fb2bcccceb13ffa657c3c9e")).booleanValue();
        }
        List list = (List) t.b.a("pageBlackList");
        if (list == null || !list.contains(str)) {
            List list2 = (List) t.b.a("specifySamplingList");
            if (list2 != null && list2.contains(str)) {
                return ((Boolean) t.b.a("specifySamplingRate")).booleanValue();
            }
            return ((Boolean) t.b.a("fspEnable")).booleanValue();
        }
        return false;
    }
}
