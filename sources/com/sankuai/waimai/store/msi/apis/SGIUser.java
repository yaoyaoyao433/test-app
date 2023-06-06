package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.msi.api.extension.sgc.user.IUser;
import com.meituan.msi.api.extension.sgc.user.UserStateResponse;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.msi.listener.a;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIUser extends IUser {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.user.IUser
    public final void a(MsiCustomContext msiCustomContext, j<UserStateResponse> jVar) {
        Object[] objArr = {msiCustomContext, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5937dfbf96d093cf70bf6d47dc7f95a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5937dfbf96d093cf70bf6d47dc7f95a8");
        } else if (a.a(msiCustomContext)) {
        } else {
            final UserListener userListener = new UserListener(jVar);
            com.sankuai.waimai.store.msi.listener.a.a((Context) msiCustomContext.getActivity()).a(msiCustomContext.getActivity(), new a.c() { // from class: com.sankuai.waimai.store.msi.apis.SGIUser.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void a(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "340ed5363958742862310a99e59cac19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "340ed5363958742862310a99e59cac19");
                    } else {
                        com.meituan.android.bus.a.a().a(userListener);
                    }
                }

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void b(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b499b16256d40f453da275f77973711", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b499b16256d40f453da275f77973711");
                    } else {
                        com.meituan.android.bus.a.a().b(userListener);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class UserListener {
        public static ChangeQuickRedirect a;
        public j b;

        public UserListener(j<UserStateResponse> jVar) {
            Object[] objArr = {SGIUser.this, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b54b12e05e87f5ceaaff9f727be9da0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b54b12e05e87f5ceaaff9f727be9da0");
                return;
            }
            this.b = null;
            this.b = jVar;
        }

        @Subscribe
        public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098c7821fe938bd5bdb8c030c8aaac02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098c7821fe938bd5bdb8c030c8aaac02");
                return;
            }
            UserStateResponse userStateResponse = new UserStateResponse();
            userStateResponse.type = "member-card";
            HashMap hashMap = new HashMap();
            hashMap.put("poiId", Long.valueOf(aVar.a));
            hashMap.put("brandId", Long.valueOf(aVar.c));
            userStateResponse.data = hashMap;
            this.b.a(userStateResponse);
        }
    }
}
