package com.meituan.mtwebkit.internal.system;

import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import com.meituan.mtwebkit.MTGeolocationPermissions;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends MTGeolocationPermissions {
    public static ChangeQuickRedirect a;
    private GeolocationPermissions b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c56e3f3fec9c1535570ee88d33b2158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c56e3f3fec9c1535570ee88d33b2158");
        } else {
            this.b = GeolocationPermissions.getInstance();
        }
    }

    @Override // com.meituan.mtwebkit.MTGeolocationPermissions
    public final void getOrigins(final MTValueCallback<Set<String>> mTValueCallback) {
        Object[] objArr = {mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d321b38198f44eb95965496c32f323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d321b38198f44eb95965496c32f323");
        } else {
            this.b.getOrigins(mTValueCallback == null ? null : new ValueCallback<Set<String>>() { // from class: com.meituan.mtwebkit.internal.system.d.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Set<String> set) {
                    Set<String> set2 = set;
                    Object[] objArr2 = {set2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26673e0344c53e3759519eee243e6ea0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26673e0344c53e3759519eee243e6ea0");
                    } else {
                        mTValueCallback.onReceiveValue(set2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTGeolocationPermissions
    public final void getAllowed(String str, final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5deb5e68964fccc53b5a22f1e068638f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5deb5e68964fccc53b5a22f1e068638f");
        } else {
            this.b.getAllowed(str, mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.d.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac82eaff54e9ae63ceb202f09a0dc2f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac82eaff54e9ae63ceb202f09a0dc2f1");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTGeolocationPermissions
    public final void clear(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef8b90d2bb7712b3764b4a8af961d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef8b90d2bb7712b3764b4a8af961d89");
        } else {
            this.b.clear(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTGeolocationPermissions
    public final void allow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c3da2ac865ad8e0e118a286b460436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c3da2ac865ad8e0e118a286b460436");
        } else {
            this.b.allow(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTGeolocationPermissions
    public final void clearAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1144c606c275f243fb69a4c91b2acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1144c606c275f243fb69a4c91b2acd");
        } else {
            this.b.clearAll();
        }
    }
}
