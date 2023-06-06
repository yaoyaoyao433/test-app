package com.sankuai.waimai.store.order.prescription.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.upload.f;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements f.a, Serializable {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    private a e;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c0af88b35f03229d76184796bfdb1a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c0af88b35f03229d76184796bfdb1a");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c0957f7e2d1963f543f9e06ca2c38fa", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c0957f7e2d1963f543f9e06ca2c38fa") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce4abf37625e0bfa26b634d0f09c2486", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce4abf37625e0bfa26b634d0f09c2486") : (a[]) values().clone();
        }
    }

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163d5b765f414872f7d1db869caedb10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163d5b765f414872f7d1db869caedb10");
            return;
        }
        this.c = str;
        this.e = a.INIT;
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.a
    public final boolean a() {
        return this.e == a.OK;
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.a
    public final int b() {
        return this.b;
    }
}
