package com.meituan.android.ptcommonim.cardrender;

import android.text.TextUtils;
import com.meituan.android.ptcommonim.cardrender.model.MachData;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Response;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final a b;
    private final AtomicBoolean c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a861d5a65945b8cf5c3443c53ade22fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a861d5a65945b8cf5c3443c53ade22fe");
            return;
        }
        this.c = new AtomicBoolean(false);
        this.b = new a(com.meituan.android.ptcommonim.protocol.env.a.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3236e260078c238a81d7a6698872255d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3236e260078c238a81d7a6698872255d");
            return;
        }
        try {
            Response<MachData> a2 = com.meituan.android.ptcommonim.base.network.a.a().a(com.meituan.android.ptcommonim.protocol.env.a.b, str, str2).a();
            if (a2 != null && a2.e() != null) {
                MachData e = a2.e();
                if (e.code != 0) {
                    new Exception(e.msg);
                    return;
                } else if (z) {
                    a(e.data, str, str2);
                    return;
                } else {
                    a(e.data);
                    return;
                }
            }
            new Exception("网络请求失败!无body");
        } catch (Throwable th) {
            new Exception(th.getMessage());
        }
    }

    private void a(MachData.Data data, String str, String str2) {
        Object[] objArr = {data, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131bf17678a578596fc334d199b9b5a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131bf17678a578596fc334d199b9b5a9");
            return;
        }
        this.b.a(data, com.meituan.android.ptcommonim.protocol.env.a.b + CommonConstant.Symbol.UNDERLINE + str + CommonConstant.Symbol.UNDERLINE + str2);
    }

    private void a(MachData.Data data) {
        Object[] objArr = {data};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb827f55444d08c8062e36ee48538370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb827f55444d08c8062e36ee48538370");
        } else {
            this.b.a(data);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MachInfo a(Map<String, List<MachData.Data.Template>> map, String str, String str2) {
        Object[] objArr = {map, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf4b14a8941301bf886f1a197aa6fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf4b14a8941301bf886f1a197aa6fa3");
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        List<MachData.Data.Template> list = map.get(str);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        for (MachData.Data.Template template : list) {
            if (template != null && TextUtils.equals(template.authorizeCode, str2)) {
                return template.machDetail;
            }
        }
        return null;
    }
}
