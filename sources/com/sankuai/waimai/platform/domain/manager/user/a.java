package com.sankuai.waimai.platform.domain.manager.user;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import com.sankuai.waimai.platform.domain.manager.user.net.UCenterTspApi;
import com.sankuai.waimai.platform.domain.manager.user.net.UserCanceledResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends BaseUserManager {
    public static ChangeQuickRedirect g;
    private static a h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447335c7b51facbde201797206d0154c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447335c7b51facbde201797206d0154c");
            return;
        }
        Context context = b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = BaseUserManager.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45fdb2cd70aea0173b8aec13260d1776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45fdb2cd70aea0173b8aec13260d1776");
            return;
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = BaseUserManager.a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c8ba320892fb68f612a1d0cda3e70e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c8ba320892fb68f612a1d0cda3e70e9");
        } else if (this.f != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f);
            this.e = null;
            this.f = null;
        }
        this.e = new IntentFilter("KNB.Channel.Account.BindPhone");
        this.f = new BaseUserManager.BindPhoneBroadcastReceiver();
        LocalBroadcastManager.getInstance(context).registerReceiver(this.f, this.e);
        a(new BaseUserManager.a());
    }

    public static a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f63549e9ee96430e25e2a7304980963", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f63549e9ee96430e25e2a7304980963");
        }
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public final void a(int i, String str, Activity activity) {
        Object[] objArr = {Integer.valueOf(i), str, activity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182a853954708cfe93085f01823810a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182a853954708cfe93085f01823810a2");
        } else {
            h().logout();
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4370f0a980c5a0a4ee21343b7520636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4370f0a980c5a0a4ee21343b7520636");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((UCenterTspApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) UCenterTspApi.class)).getCanceledStatus(), new b.AbstractC1042b<BaseResponse<UserCanceledResponse>>() { // from class: com.sankuai.waimai.platform.domain.manager.user.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    boolean z = true;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b205ddde273faf161cc9566888daa88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b205ddde273faf161cc9566888daa88");
                        return;
                    }
                    z = (baseResponse.code != 200 || baseResponse.data == 0) ? false : false;
                    com.sankuai.waimai.platform.b.A().a(z ? ((UserCanceledResponse) baseResponse.data).userIdCanceled : -1);
                    com.sankuai.waimai.platform.b.A().b(z ? ((UserCanceledResponse) baseResponse.data).uuidCanceled : -1);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e38b6396b27ca0516124f837918c7456", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e38b6396b27ca0516124f837918c7456");
                        return;
                    }
                    com.sankuai.waimai.platform.b.A().a(-1);
                    com.sankuai.waimai.platform.b.A().b(-1);
                }
            }, "updateUserCanceledStatus");
        }
    }
}
