package com.meituan.android.ptcommonim.bridge;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.base.mach.bridge.PTTextJsNativeMethodImpl;
import com.meituan.android.ptcommonim.bridge.ResponseWrapper;
import com.meituan.android.ptcommonim.pageadapter.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final a c;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "ptim";
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ca5f6209c0768b901bd8409290489e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ca5f6209c0768b901bd8409290489e3");
            return;
        }
        this.b = context;
        this.c = new a(context);
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a708c3b462ec5ad04307f991e7e68055", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a708c3b462ec5ad04307f991e7e68055") : new String[]{"send_message", "close_floating_layer", "jump_url", "service_evaluate", "text_line_count_width"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c3e0609c235ee97f2b187024ab7078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c3e0609c235ee97f2b187024ab7078");
            return;
        }
        int i = -1;
        if ("send_message".equals(str)) {
            Object[] objArr2 = {str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1811972749a66c2da7f6a5799e37de9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1811972749a66c2da7f6a5799e37de9");
                return;
            }
            JsonObject jsonObject = JsonHelper.toJsonObject(str2);
            String string = JsonHelper.getString(jsonObject, "msgType");
            String string2 = JsonHelper.getString(jsonObject, "data");
            String string3 = JsonHelper.getString(jsonObject, "summary");
            int i2 = JsonHelper.getInt(jsonObject, "type", 1060060975);
            if ("general".equals(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                GeneralMessage generalMessage = new GeneralMessage();
                generalMessage.setData(string2.getBytes());
                generalMessage.setSummary(string3);
                generalMessage.setType(i2);
                i = IMUIManager.a().a((IMMessage) generalMessage, false);
            }
            aVar.a(str3, JsonHelper.toJsonString(new ResponseWrapper(i, new ResponseWrapper.BaseData(string2))));
        } else if ("close_floating_layer".equals(str)) {
            Object[] objArr3 = {str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d42873f2d9b0bd87b273f05f9dabcc9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d42873f2d9b0bd87b273f05f9dabcc9");
                return;
            }
            boolean a2 = e.a(this.b);
            if (aVar != null) {
                if (a2) {
                    aVar.a(str3, JsonHelper.toJsonString(new ResponseWrapper(0, new ResponseWrapper.BaseData("关闭成功"))));
                } else {
                    aVar.a(str3, JsonHelper.toJsonString(new ResponseWrapper(-1, new ResponseWrapper.BaseData("关闭失败"))));
                }
            }
        } else if (!"jump_url".equals(str)) {
            if ("service_evaluate".equals(str)) {
                this.c.a(str2, str3, aVar);
            } else if ("text_line_count_width".equals(str)) {
                PTTextJsNativeMethodImpl.a(str, str2, str3, aVar);
            }
        } else {
            Object[] objArr4 = {str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "77cda68a953d44023ae8926629ead8c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "77cda68a953d44023ae8926629ead8c4");
                return;
            }
            String string4 = JsonHelper.getString(JsonHelper.toJsonObject(str2), "url");
            if (!TextUtils.isEmpty(string4)) {
                com.meituan.android.ptcommonim.utils.d.a(this.b, string4);
                aVar.a(str3, JsonHelper.toJsonString(new ResponseWrapper(0, new ResponseWrapper.BaseData("调用成功"))));
                return;
            }
            aVar.a(str3, JsonHelper.toJsonString(new ResponseWrapper(-1, new ResponseWrapper.BaseData("url为空"))));
        }
    }
}
