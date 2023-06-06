package com.sankuai.waimai.store.im.group.join;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.group.model.JoinGroupInfo;
import com.sankuai.waimai.store.util.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.im.group.join.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1209a {
        boolean a(int i, JoinGroupInfo joinGroupInfo);
    }

    public final void a(String str, final Context context, long j, String str2, @Nullable final InterfaceC1209a interfaceC1209a) {
        Object[] objArr = {str, context, new Long(j), str2, interfaceC1209a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2c286e06cb1509994bc08ff4cb153e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2c286e06cb1509994bc08ff4cb153e");
            return;
        }
        final Dialog a2 = d.a(context);
        com.sankuai.waimai.store.im.base.net.b.a(str).a(j, str2, new j<JoinGroupInfo>() { // from class: com.sankuai.waimai.store.im.group.join.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b95b449f4979eed32548ba9bfea5fcf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b95b449f4979eed32548ba9bfea5fcf2");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(JoinGroupInfo joinGroupInfo) {
                JoinGroupInfo joinGroupInfo2 = joinGroupInfo;
                Object[] objArr2 = {joinGroupInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fd76354ccb3704cd429ad6b06a588dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fd76354ccb3704cd429ad6b06a588dc");
                    return;
                }
                if (a2 != null) {
                    a2.dismiss();
                }
                if (interfaceC1209a != null) {
                    interfaceC1209a.a(0, joinGroupInfo2);
                }
                com.sankuai.waimai.store.router.d.a(context, joinGroupInfo2.schemeUrL);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "899f3f200f5f9c10b45fa370c3efc635", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "899f3f200f5f9c10b45fa370c3efc635");
                    return;
                }
                if (a2 != null) {
                    a2.dismiss();
                }
                if (interfaceC1209a == null || !interfaceC1209a.a(-1, null)) {
                    com.sankuai.waimai.store.im.util.b.a(bVar, context);
                }
            }
        });
    }
}
