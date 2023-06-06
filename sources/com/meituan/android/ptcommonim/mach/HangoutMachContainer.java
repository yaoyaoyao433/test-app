package com.meituan.android.ptcommonim.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.android.ptcommonim.video.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HangoutMachContainer extends FrameLayout {
    public static ChangeQuickRedirect a;
    private MachViewGroup b;
    private MachViewGroup c;
    private e d;

    public HangoutMachContainer(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f25c7ed5947d99362103744e4357e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f25c7ed5947d99362103744e4357e1");
        } else {
            a(context);
        }
    }

    public HangoutMachContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8936940d03b4600e2940601ec7b778b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8936940d03b4600e2940601ec7b778b");
        } else {
            a(context);
        }
    }

    public HangoutMachContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5843c55fa47bd8bdfd074088b0797a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5843c55fa47bd8bdfd074088b0797a4");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4b6c9b08e3babe0b3c04cac13b196d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4b6c9b08e3babe0b3c04cac13b196d");
            return;
        }
        this.d = new e(context);
        this.b = new MachViewGroup(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = com.meituan.android.ptcommonim.base.util.a.a(16);
        layoutParams.leftMargin = com.meituan.android.ptcommonim.base.util.a.a(12);
        addView(this.b, layoutParams);
        this.c = new MachViewGroup(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = com.meituan.android.ptcommonim.base.util.a.a(104);
        layoutParams2.leftMargin = com.meituan.android.ptcommonim.base.util.a.a(16);
        layoutParams2.gravity = 80;
        addView(this.c, layoutParams2);
    }

    public final boolean a(String str, PTIMCommonBean pTIMCommonBean, JSONObject jSONObject, String str2) {
        Object[] objArr = {str, pTIMCommonBean, jSONObject, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c7729793d54115490f13df30c221b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c7729793d54115490f13df30c221b2")).booleanValue();
        }
        JsonArray jsonArray = JsonHelper.toJsonArray(str);
        if (jsonArray == null || jsonArray.size() == 0) {
            return false;
        }
        int size = jsonArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            JsonObject jsonObject = JsonHelper.getJsonObject(jsonArray, String.valueOf(i));
            Object[] objArr2 = {jsonObject, pTIMCommonBean, jSONObject, str2};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1e7fe8c53e980e91e0548b821307ba16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1e7fe8c53e980e91e0548b821307ba16");
            } else {
                Map<String, Object> a2 = g.a(pTIMCommonBean, jSONObject);
                a2.put("media_type", str2);
                a2.put("show_status", 1);
                Map<String, Object> map = JsonHelper.toMap(JsonHelper.getString(jsonObject, "businessExtra"));
                if (map != null && !map.isEmpty()) {
                    a2.putAll(map);
                }
                try {
                    jsonObject.addProperty("reportDict", JsonHelper.toJsonString(a2));
                } catch (Throwable unused) {
                }
            }
            String string = JsonHelper.getString(jsonObject, "moduleType");
            if (TextUtils.equals(PTFloatInfo.TYPE_PRODUCT, string)) {
                setProductLayout(JsonHelper.toJsonString(jsonObject));
                z = true;
            } else if (TextUtils.equals("shop", string)) {
                setShopLayout(JsonHelper.toJsonString(jsonObject));
            }
        }
        return z;
    }

    private void setShopLayout(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0701fd586348caea2cf75c0c066dbaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0701fd586348caea2cf75c0c066dbaa");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MachInfo machInfo = new MachInfo();
            machInfo.biz = "platform";
            machInfo.moduleId = "mmbb";
            machInfo.machId = "pt-im-sign-board";
            this.d.a(this.b, str, machInfo);
        }
    }

    private void setProductLayout(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf27064e136789cc2d218feac4514c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf27064e136789cc2d218feac4514c9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MachInfo machInfo = new MachInfo();
            machInfo.biz = "platform";
            machInfo.moduleId = "mmbb";
            machInfo.machId = "pt-hang-bottom-product-card";
            this.d.a(this.c, str, machInfo);
        }
    }
}
