package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.sankuai.waimai.platform.utils.f;
/* loaded from: classes2.dex */
public final class a extends c {
    @Override // com.heytap.mcssdk.d.d
    public final BaseMode a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return a(intent);
        }
        return null;
    }

    @Override // com.heytap.mcssdk.d.c
    protected final BaseMode a(Intent intent) {
        try {
            com.heytap.mcssdk.c.a aVar = new com.heytap.mcssdk.c.a();
            aVar.c = Integer.parseInt(com.heytap.mcssdk.f.a.a(f.a(intent, ProtoConstant.COMMAND)));
            aVar.e = Integer.parseInt(com.heytap.mcssdk.f.a.a(f.a(intent, "code")));
            aVar.d = com.heytap.mcssdk.f.a.a(f.a(intent, "content"));
            aVar.a = com.heytap.mcssdk.f.a.a(f.a(intent, "appKey"));
            aVar.b = com.heytap.mcssdk.f.a.a(f.a(intent, "appSecret"));
            aVar.f = com.heytap.mcssdk.f.a.a(f.a(intent, PackageManageUtil.c));
            com.heytap.mcssdk.f.b.a("OnHandleIntent-message:" + aVar.toString());
            return aVar;
        } catch (Exception e) {
            com.heytap.mcssdk.f.b.a("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
