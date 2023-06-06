package com.meituan.android.ptcommonim.pageadapter.v2;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.PTSessionFragmentV2;
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
public final class a extends com.meituan.android.ptcommonim.pageadapter.base.a {
    public static ChangeQuickRedirect d;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16a8a707cf267d87e87d4e1ece14599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16a8a707cf267d87e87d4e1ece14599");
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.base.a
    public final Map<String, Object> a(GeneralMessage generalMessage, Map<String, Object> map) {
        Object[] objArr = {generalMessage, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9de2ce3a253dc6c889df7a2d1934c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9de2ce3a253dc6c889df7a2d1934c8");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(generalMessage.getType()));
        hashMap.put("data", map);
        String extension = generalMessage.getExtension();
        if (!TextUtils.isEmpty(extension)) {
            hashMap.put("extension", JsonHelper.fromJsonString(extension, Map.class));
        }
        Map<String, Object> a = PTSessionFragmentV2.a(this.b);
        if (a != null && !a.isEmpty()) {
            hashMap.put("generalParams", a);
        }
        return hashMap;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.base.a
    public final void a(Context context, f.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07c8981d02dc931d70acbae3679d884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07c8981d02dc931d70acbae3679d884");
            return;
        }
        aVar.a(new com.meituan.android.ptcommonim.base.mach.a());
        aVar.d = new com.meituan.android.ptcommonim.pageadapter.message.mach.a(this.b);
        aVar.a(new com.meituan.android.ptcommonim.bridge.b(this.b));
    }
}
