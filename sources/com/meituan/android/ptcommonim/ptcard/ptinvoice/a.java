package com.meituan.android.ptcommonim.ptcard.ptinvoice;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.hms.opendevice.c;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.android.ptcommonim.pageadapter.message.item.b {
    public static ChangeQuickRedirect r;
    private static final Map<String, Double> s = new HashMap<String, Double>() { // from class: com.meituan.android.ptcommonim.ptcard.ptinvoice.a.1
        {
            put("pt-im-invoice-guide", Double.valueOf(116.0d));
            put("pt-im-invoice-submited", Double.valueOf(133.0d));
            put("pt-im-invoice-info-client-card", Double.valueOf(350.0d));
            put("pt-im-invoice-business", Double.valueOf(350.0d));
        }
    };
    private final JsonObject t;
    private final PTIMCommonBean.UserType u;

    public a(Context context, f fVar, com.meituan.android.ptcommonim.pageadapter.message.utils.b bVar, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar2, Map<String, Object> map, JsonObject jsonObject, PTIMCommonBean.UserType userType) {
        super(context, fVar, bVar, bVar2, map);
        Object[] objArr = {context, fVar, bVar, bVar2, map, jsonObject, userType};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703ae0155b6892a0edf8614cdb36ff04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703ae0155b6892a0edf8614cdb36ff04");
            return;
        }
        this.t = jsonObject;
        this.u = userType;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.b
    public final MachInfo a(GeneralMessage generalMessage, boolean z) {
        String string;
        Object[] objArr = {generalMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d952086a13876bb4324a63604b5fa15", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d952086a13876bb4324a63604b5fa15");
        }
        JsonObject jsonObject = this.t;
        PTIMCommonBean.UserType userType = this.u;
        Object[] objArr2 = {jsonObject, userType};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d8212f14e2e6e04b86ff91f9f6681f2", RobustBitConfig.DEFAULT_VALUE)) {
            string = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d8212f14e2e6e04b86ff91f9f6681f2");
        } else {
            StringBuilder sb = new StringBuilder("data/platformData/template/");
            sb.append(userType == PTIMCommonBean.UserType.TYPE_B ? "b" : c.a);
            sb.append("/machId");
            string = JsonHelper.getString(jsonObject, sb.toString());
        }
        MachInfo machInfo = new MachInfo();
        machInfo.machId = string;
        machInfo.moduleId = "mmbb";
        machInfo.biz = "platform";
        return machInfo;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.b
    public final int a(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946bda8b19faeaf33af297b616feeb84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946bda8b19faeaf33af297b616feeb84")).intValue();
        }
        try {
            Double valueOf = Double.valueOf(0.0d);
            MachInfo a = a((GeneralMessage) null, false);
            if (!TextUtils.isEmpty(a.machId)) {
                valueOf = s.get(a.machId);
            }
            if (valueOf == null || valueOf.doubleValue() <= 0.0d) {
                valueOf = Double.valueOf(315.0d);
            }
            return com.meituan.android.ptcommonim.base.util.a.a((int) (valueOf.doubleValue() + 0.5d));
        } catch (Exception unused) {
            return -2;
        }
    }
}
