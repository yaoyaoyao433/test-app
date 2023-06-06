package com.sankuai.waimai.bussiness.order.paybyfriend.rn;

import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShardToWeixinModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMPayByFriendModule";
    }

    public ShardToWeixinModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4f268a6195ab412fa75b5485ec0aad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4f268a6195ab412fa75b5485ec0aad8");
        }
    }

    @ReactMethod
    public void jump(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1626f0170b2d984b402586f9d243b396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1626f0170b2d984b402586f9d243b396");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            a.b("WMPayByFriendModule", "MRN分享入口调用在主线程", new Object[0]);
            i.a(getCurrentActivity(), str);
        } else {
            a.b("WMPayByFriendModule", "MRN分享入口调用不在主线程", new Object[0]);
            l.b(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.paybyfriend.rn.ShardToWeixinModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba06d485694c2a7d38bdd5b6afa2c994", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba06d485694c2a7d38bdd5b6afa2c994");
                    } else {
                        i.a(ShardToWeixinModule.this.getCurrentActivity(), str);
                    }
                }
            }, "WMPayByFriendModule");
        }
    }
}
