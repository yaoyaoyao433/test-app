package com.meituan.android.ptcommonim.pageadapter.message.item;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends b {
    public static ChangeQuickRedirect r;
    private Map<String, Float> s;
    private final com.meituan.android.ptcommonim.model.b t;

    public f(Context context, com.meituan.android.ptcommonim.pageadapter.message.mach.f fVar, com.meituan.android.ptcommonim.pageadapter.message.utils.b bVar, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar2, Map<String, Object> map, com.meituan.android.ptcommonim.model.b bVar3) {
        super(context, fVar, bVar, bVar2, map);
        Object[] objArr = {context, fVar, bVar, bVar2, map, bVar3};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfcb481143ef9446abb38935d3fb7c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfcb481143ef9446abb38935d3fb7c7");
            return;
        }
        this.s = new HashMap<String, Float>() { // from class: com.meituan.android.ptcommonim.pageadapter.message.item.f.1
            {
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.f), Float.valueOf(143.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.d), Float.valueOf(277.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.a), Float.valueOf(277.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.b), Float.valueOf(195.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.e), Float.valueOf(116.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.c), Float.valueOf(241.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.i), Float.valueOf(138.0f));
                put(String.valueOf(com.meituan.android.ptcommonim.pageadapter.message.utils.c.j), Float.valueOf(159.0f));
                put(PTFloatInfo.TMP_TYPE_PRODUCT, Float.valueOf(125.0f));
                put(PTFloatInfo.TMP_TYPE_ORDER, Float.valueOf(102.0f));
                put("tmp_guider_tip", Float.valueOf(80.0f));
                put("tmp_guider_jump", Float.valueOf(133.0f));
                put("tmp_order_info_v2", Float.valueOf(156.0f));
                put("tmp_product_v2", Float.valueOf(102.0f));
                put("tmp_coupon_v2", Float.valueOf(115.0f));
            }
        };
        this.t = bVar3;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.b
    public final int a(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2418665b860e6ecb16ff5b9c94fb6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2418665b860e6ecb16ff5b9c94fb6c0")).intValue();
        }
        Float valueOf = Float.valueOf(0.0f);
        Map map2 = (Map) map.get("data");
        if (map2 != null && (map2.get("height") instanceof Double)) {
            valueOf = Float.valueOf(((Double) map2.get("height")).floatValue());
        }
        if (valueOf.floatValue() <= 0.0f) {
            String a = i == 1060060975 ? com.meituan.android.ptcommonim.utils.e.a(this.d.a()) : String.valueOf(i);
            if ("tmp_guider_tip".equals(a)) {
                return -2;
            }
            valueOf = this.s.get(a);
        }
        if (valueOf == null || valueOf.floatValue() <= 0.0f) {
            valueOf = Float.valueOf(315.0f);
        }
        return com.meituan.android.ptcommonim.base.util.a.a((int) (valueOf.floatValue() + 0.5f));
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.b
    @Nullable
    public final MachInfo a(GeneralMessage generalMessage, boolean z) {
        String str;
        Object[] objArr = {generalMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716d7254b26a77c0cbc131f953a1f8b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716d7254b26a77c0cbc131f953a1f8b0");
        }
        String a = a(generalMessage);
        if (TextUtils.isEmpty(a)) {
            return com.meituan.android.ptcommonim.model.a.a(generalMessage);
        }
        String valueOf = (this.t == null || this.t.b == null) ? "" : String.valueOf((int) this.t.b.d());
        if (this.t != null) {
            com.meituan.android.ptcommonim.model.b bVar = this.t;
            str = bVar.c != null ? bVar.c.b : "";
        } else {
            str = "";
        }
        MachInfo a2 = com.meituan.android.ptcommonim.cardrender.c.a().a(valueOf, str, a, z);
        if (a2 != null) {
            a(true, generalMessage);
            return a2;
        }
        a(false, generalMessage);
        return com.meituan.android.ptcommonim.model.a.a(generalMessage);
    }

    private void a(boolean z, GeneralMessage generalMessage) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), generalMessage};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514889d2d8d4a6832500321ee5e0e784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514889d2d8d4a6832500321ee5e0e784");
        } else if (generalMessage == null) {
        } else {
            try {
                String string = JsonHelper.getString((JsonObject) JsonHelper.fromJsonString(new String(generalMessage.getData()), JsonObject.class), "platformData/template/platformType");
                if (TextUtils.isEmpty(string)) {
                    string = "default";
                }
                if (z) {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_mach_auth_match_" + string, "ptim_mach_auth_mach_success");
                    return;
                }
                com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_mach_auth_match_" + string, "ptim_mach_auth_mach_match_fail", "映射关系关联失败");
            } catch (Exception unused) {
            }
        }
    }

    private String a(GeneralMessage generalMessage) {
        JsonObject jsonObject;
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287ab7291651bff763e4838f48c7194b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287ab7291651bff763e4838f48c7194b");
        }
        try {
            jsonObject = (JsonObject) JsonHelper.fromJsonString(new String(generalMessage.getData()), JsonObject.class);
        } catch (Throwable unused) {
            jsonObject = null;
        }
        return JsonHelper.getString(jsonObject, "platformData/template/authorizeCode");
    }
}
