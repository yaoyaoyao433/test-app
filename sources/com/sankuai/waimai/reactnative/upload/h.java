package com.sankuai.waimai.reactnative.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.upload.k;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements k.a, Serializable {
    public static ChangeQuickRedirect a;
    public int b;
    String c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a implements Serializable {
        INIT,
        UPLOADING,
        OK,
        FAILED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b7dd95953a79d964f0cfc3285ec7a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b7dd95953a79d964f0cfc3285ec7a6");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b8f8feae8ba323d1d9c4cf067bc63bb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b8f8feae8ba323d1d9c4cf067bc63bb") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68b6c0abb9b578378162f7dcb6bdb2e1", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68b6c0abb9b578378162f7dcb6bdb2e1") : (a[]) values().clone();
        }
    }

    public h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b242f1c33369456aec489cb2222329a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b242f1c33369456aec489cb2222329a");
            return;
        }
        this.c = str;
        this.d = a.INIT;
    }

    @Override // com.sankuai.waimai.reactnative.upload.k.a
    public final boolean a() {
        return this.d == a.OK;
    }

    @Override // com.sankuai.waimai.reactnative.upload.k.a
    public final int b() {
        return this.b;
    }
}
