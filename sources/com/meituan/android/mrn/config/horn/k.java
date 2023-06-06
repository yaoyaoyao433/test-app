package com.meituan.android.mrn.config.horn;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public static k b = new k();
    private List<String> c;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c963cf02be1b169e6f769fe373f32d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c963cf02be1b169e6f769fe373f32d1");
            return;
        }
        this.c = Arrays.asList("rn_hotel_hotelchannel-orderfill", "rn_hotel_rn-hotel-mainlist", "rn_qcsc_qcscmrn-dispatch", "rn_qcsc_qcscmrn-presubmit", "rn_qcsc_qcscmrn-search", "rn_hotel_rn-hotel-poidetail", "rn_hotel_hotelchannel-order-detail");
        Type type = new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.k.1
        }.getType();
        List<String> list = this.c;
        Object[] objArr2 = {"presetBlackList", type, list, "优先下载列表"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcf28da3af16fc8811eea2387f96b9b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcf28da3af16fc8811eea2387f96b9b4");
        } else {
            t.a("presetBlackList", type, list, "mrn_preset_bundle_android", "优先下载列表");
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9200130d350029aa17e8ffbf3a923a76", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9200130d350029aa17e8ffbf3a923a76")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List list = (List) t.b.a("presetBlackList");
        return list == null || list.size() == 0 || !list.contains(str);
    }
}
