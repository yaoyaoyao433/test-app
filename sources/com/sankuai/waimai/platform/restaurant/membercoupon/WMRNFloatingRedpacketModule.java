package com.sankuai.waimai.platform.restaurant.membercoupon;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNFloatingRedpacketModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<a> listenerRef;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, String str, Callback callback);

        void a(ReadableMap readableMap);

        void a(String str);

        void a(String str, Callback callback);

        void a(String str, String str2, String str3);

        void p();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "WMRNFloatingRedpacketModule";
    }

    public WMRNFloatingRedpacketModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b67d284e27288740e91c38885258a2b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b67d284e27288740e91c38885258a2b9");
        }
    }

    public void setModuleEventListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4972b6eba364190874734c06900903fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4972b6eba364190874734c06900903fa");
        } else {
            this.listenerRef = new WeakReference<>(aVar);
        }
    }

    @ReactMethod
    public void buyMember(String str, String str2, String str3) {
        a aVar;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "522260cbeebaa25d6b2468f522fd1cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "522260cbeebaa25d6b2468f522fd1cc3");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.a(str, str2, str3);
        }
    }

    @ReactMethod
    public void exchangeMember(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75388339cd0cbea46dce31ac2397f980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75388339cd0cbea46dce31ac2397f980");
        } else {
            exchangeMemberV2(i, "", callback);
        }
    }

    @ReactMethod
    public void exchangeMemberV2(int i, String str, Callback callback) {
        a aVar;
        Object[] objArr = {Integer.valueOf(i), str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "555e2cd97e0e2cfdcf0d75d156bbd4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "555e2cd97e0e2cfdcf0d75d156bbd4ff");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.a(i, str, callback);
        }
    }

    @ReactMethod
    public void expandMagicCoupon(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e9268536d934b2ff102bee312033653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e9268536d934b2ff102bee312033653");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.a(str);
        }
    }

    @ReactMethod
    public void expandMagicCouponNew(String str, Callback callback) {
        a aVar;
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fd5a5eb6d9b6286bbd553359a2678c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fd5a5eb6d9b6286bbd553359a2678c9");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.a(str, callback);
        }
    }

    @ReactMethod
    public void fetchDataSuccess(ReadableMap readableMap) {
        a aVar;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1b67b453d058e6a79098fee5de945b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1b67b453d058e6a79098fee5de945b1");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.a(readableMap);
        }
    }

    @ReactMethod
    public void fetchDataFailed(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58398af09ef89a0418ee01953ed24f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58398af09ef89a0418ee01953ed24f45");
        } else if (this.listenerRef != null) {
            this.listenerRef.get();
        }
    }

    @ReactMethod
    public void memberCouponBackSuccess() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeaa5dbfc27cf75442694628a15589b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeaa5dbfc27cf75442694628a15589b8");
        } else if (this.listenerRef == null || (aVar = this.listenerRef.get()) == null) {
        } else {
            aVar.p();
        }
    }
}
