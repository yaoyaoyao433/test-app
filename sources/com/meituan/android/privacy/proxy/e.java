package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public final class e implements com.meituan.android.privacy.interfaces.l {
    public static ChangeQuickRedirect a;
    private com.meituan.android.privacy.interfaces.m b;
    private final u c;
    private final String d;

    public e(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24d7216539c3c3946ba29463c1648bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24d7216539c3c3946ba29463c1648bb");
            return;
        }
        this.d = str;
        this.c = new u();
        this.b = new f();
    }

    @Override // com.meituan.android.privacy.interfaces.l
    @SuppressLint({"MissingPermission"})
    public final void a(List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback) {
        Object[] objArr = {list, scanSettings, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54cc0d450c3cc8e35996e507c4f6b63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54cc0d450c3cc8e35996e507c4f6b63f");
        } else if (this.b != null) {
            this.b.a(this.d, list, scanSettings, scanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.l
    @SuppressLint({"MissingPermission"})
    public final void a(ScanCallback scanCallback) {
        Object[] objArr = {scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a5b3966d4dab6d08e0fffaeed57f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a5b3966d4dab6d08e0fffaeed57f47");
        } else if (this.b != null) {
            this.b.a(this.d, scanCallback);
        }
    }
}
