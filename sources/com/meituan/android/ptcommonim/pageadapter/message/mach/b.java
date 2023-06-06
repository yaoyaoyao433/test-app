package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.android.ptcommonim.pageadapter.base.a {
    public static ChangeQuickRedirect d;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0964ee17e3e65b19406492b2d9691c51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0964ee17e3e65b19406492b2d9691c51");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.ptcommonim.pageadapter.base.a
    public final Map<String, Object> a(GeneralMessage generalMessage, Map<String, Object> map) {
        Object[] objArr = {generalMessage, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3b7fd64ed14890dafa753feec0cf6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3b7fd64ed14890dafa753feec0cf6b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(generalMessage.getType()));
        hashMap.put("data", map);
        String jsonString = JsonHelper.toJsonString(generalMessage);
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(jsonString) && !StringUtil.NULL.equals(jsonString)) {
            try {
                Map map2 = (Map) JsonHelper.fromJsonString(jsonString, Map.class);
                try {
                    map2.remove("mData");
                } catch (Throwable unused) {
                }
                hashMap2 = map2;
            } catch (Throwable unused2) {
            }
        }
        hashMap.put("rawMsg", hashMap2);
        return hashMap;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.base.a
    public final void a(Context context, f.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8cd4d4d68d24f66d78be231f6735b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8cd4d4d68d24f66d78be231f6735b5");
            return;
        }
        aVar.d = new a(this.b);
        aVar.a(new com.meituan.android.ptcommonim.bridge.d(this.b));
    }
}
