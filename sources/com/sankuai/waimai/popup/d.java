package com.sankuai.waimai.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper;
import com.sankuai.waimai.business.page.home.actinfo.a;
import com.sankuai.waimai.business.page.home.actinfo.b;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.mach.utils.GsonTypeAdapter;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.popup.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final Activity b;
    Dialog c;
    com.sankuai.waimai.business.page.home.actinfo.b d;
    boolean e;
    com.sankuai.waimai.business.page.home.actinfo.a f;
    boolean g;
    SkyFallDynamicDialogHelper h;
    com.sankuai.waimai.popup.strategy.b i;
    String j;
    private final String k;
    private com.sankuai.waimai.popup.a l;

    public static /* synthetic */ void a(d dVar, final AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "66126de08ccc56b6884a645a68f96195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "66126de08ccc56b6884a645a68f96195");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.waimai.platform.mach.monitor.d.b, new Runnable() { // from class: com.sankuai.waimai.popup.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe5330be398022ae07bbce534c3988d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe5330be398022ae07bbce534c3988d");
                        return;
                    }
                    try {
                        ArrayList arrayList = (ArrayList) new GsonBuilder().registerTypeAdapter(ArrayList.class, new GsonTypeAdapter()).create().fromJson(alertInfo.modules.get(0).stringData, (Class<Object>) ArrayList.class);
                        if (arrayList == null || arrayList.isEmpty()) {
                            return;
                        }
                        SparseIntArray sparseIntArray = new SparseIntArray();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                int intValue = ((Long) ((Map) it.next()).get("adType")).intValue();
                                sparseIntArray.put(intValue, sparseIntArray.get(intValue) + 1);
                            } catch (Exception unused) {
                            }
                        }
                        if (sparseIntArray.size() <= 0) {
                            return;
                        }
                        for (int i = 0; i < sparseIntArray.size(); i++) {
                            int keyAt = sparseIntArray.keyAt(i);
                            com.sankuai.waimai.platform.mach.monitor.d.a(sparseIntArray.get(keyAt), keyAt, "skyfall", "act/getinfo");
                        }
                    } catch (Exception unused2) {
                    }
                }
            });
        }
    }

    public d(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d939e916121826e1f9b5c1c721f8259d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d939e916121826e1f9b5c1c721f8259d");
            return;
        }
        this.b = activity;
        this.k = str;
        this.d = new com.sankuai.waimai.business.page.home.actinfo.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb40cea0035ea82839eb7a3cf12bf97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb40cea0035ea82839eb7a3cf12bf97e");
        } else {
            this.e = true;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a1d7ea35ac77e5a9be0d024e72f747fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a1d7ea35ac77e5a9be0d024e72f747fa");
        } else if (!com.sankuai.waimai.foundation.utils.f.a(this.b) && this.b.getResources().getBoolean(R.bool.wm_page_is_mt)) {
            this.g = true;
        } else {
            this.g = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a {
        public boolean a;
        public boolean b;
        public String c;
        public boolean d;
        public a.b e;
        public String f;
        public c.b g;
        public PageFragment h;

        public a() {
        }
    }

    private void c(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94f9a73cf816b70e2a4ba0c3ae7df771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94f9a73cf816b70e2a4ba0c3ae7df771");
        } else if (this.b == null || this.b.isFinishing()) {
            b(aVar);
        } else if (aVar == null) {
        } else {
            if (f.a().c) {
                if (this.b.isFinishing()) {
                    b(aVar);
                    return;
                } else {
                    a(f.a().b, aVar);
                    return;
                }
            }
            com.sankuai.waimai.platform.mach.monitor.b.a().d();
            com.sankuai.waimai.guidepop.utils.b.a("[requestActInfo]");
            com.sankuai.waimai.platform.mach.monitor.d.a("act/getinfo", "skyfall");
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getActInfoRequestNew(0, com.sankuai.waimai.business.page.common.superexpose.c.a().e(), aVar.b), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.popup.d.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
                @Override // rx.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void onNext(java.lang.Object r20) {
                    /*
                        Method dump skipped, instructions count: 564
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.popup.d.AnonymousClass3.onNext(java.lang.Object):void");
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da1d4ce03a9e242017a7c8f2473d56ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da1d4ce03a9e242017a7c8f2473d56ed");
                        return;
                    }
                    com.sankuai.waimai.platform.popup.d.a().b("skyfall request error");
                    if (d.this.d != null) {
                        d.this.d.a(false);
                    }
                    d.this.b(aVar);
                }
            }, this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05f84054b6feae4fea76dae83a2cf9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05f84054b6feae4fea76dae83a2cf9c");
        } else if (aVar == null || aVar.g == null) {
        } else {
            aVar.g.a();
        }
    }

    boolean a(final GetInfoResponse getInfoResponse, final a aVar) {
        boolean z;
        Object[] objArr = {getInfoResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa1f4afd6c3ef74d9b73285ae2180ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa1f4afd6c3ef74d9b73285ae2180ea")).booleanValue();
        }
        if (getInfoResponse == null) {
            if (this.d != null) {
                this.d.a(false);
            }
            b(aVar);
            return false;
        } else if (getInfoResponse.nativeData != null && getInfoResponse.nativeData.couponResultCode == 1 && !TextUtils.isEmpty(getInfoResponse.nativeData.forceDirectUrl)) {
            if (getInfoResponse.nativeData != null && getInfoResponse.nativeData.positionCount > 0) {
                com.sankuai.waimai.business.page.home.actinfo.b.a(getInfoResponse.nativeData.positionCount, b.a.FailureTypeExistSkipLink);
            }
            com.sankuai.waimai.foundation.router.a.a(this.b, getInfoResponse.nativeData.forceDirectUrl);
            b(aVar);
            return true;
        } else {
            if (getInfoResponse.nativeData == null || getInfoResponse.nativeData.couponResultCode != 1) {
                z = false;
            } else {
                if (this.d != null) {
                    this.d.a(getInfoResponse.nativeData.activityId);
                    this.d.a(true);
                }
                this.j = getInfoResponse.nativeData.couponTip;
                if (this.f != null) {
                    this.f.h = this.j;
                }
                b(getInfoResponse, aVar);
                z = true;
            }
            if (getInfoResponse.nativeData != null && getInfoResponse.nativeData.topAlertInfo != null) {
                if (this.l != null && this.l.c()) {
                    this.l.b();
                }
                this.l = new com.sankuai.waimai.popup.a(this.b, getInfoResponse.nativeData.topAlertInfo, new DynamicDialog.e() { // from class: com.sankuai.waimai.popup.d.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.e
                    public final boolean a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a94021841efe78a08bc640b532e2215", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a94021841efe78a08bc640b532e2215")).booleanValue() : (aVar.h == null || aVar.h.isHidden()) ? false : true;
                    }
                });
                this.l.a();
            }
            if (z) {
                return true;
            }
            com.sankuai.waimai.imbase.push.b.a(2);
            if (getInfoResponse.nativeData != null && !TextUtils.isEmpty(getInfoResponse.nativeData.toast)) {
                ae.a(this.b, getInfoResponse.nativeData.toast);
                this.d.a(0, aVar.d);
            }
            if (this.h == null) {
                this.h = new SkyFallDynamicDialogHelper(2, "c_m84bv26");
            }
            int i = getInfoResponse.nativeData != null ? getInfoResponse.nativeData.positionCount : 0;
            if (getInfoResponse.alertInfo == null) {
                com.sankuai.waimai.business.page.home.actinfo.b.a(i, b.a.FailureTypeAlertModuleListIsNull);
                b(aVar);
            } else {
                this.h.c = i;
                if (com.sankuai.waimai.foundation.utils.b.b(getInfoResponse.alertInfo.modules)) {
                    com.sankuai.waimai.business.page.home.actinfo.b.a(i, b.a.FailureTypeAlertModuleListIsNull);
                }
                this.h.a(this.b, getInfoResponse.alertInfo, true, new DynamicDialog.e() { // from class: com.sankuai.waimai.popup.d.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.e
                    public final boolean a() {
                        boolean z2 = false;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbcc3165030998a9c91d51b563ec89a8", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbcc3165030998a9c91d51b563ec89a8")).booleanValue();
                        }
                        if (d.this.e && aVar.h != null && !aVar.h.isHidden()) {
                            z2 = true;
                        }
                        if (!z2) {
                            f.a().a(getInfoResponse);
                            d.this.b(aVar);
                        }
                        return z2;
                    }
                }, new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.d.7
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "901d26d0995110e7e57a9dda9e6b8514", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "901d26d0995110e7e57a9dda9e6b8514");
                        } else if (aVar == null || aVar.g == null) {
                        } else {
                            aVar.g.b();
                        }
                    }
                });
            }
            return false;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8a028b937cebbd720b96a8f39ba73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8a028b937cebbd720b96a8f39ba73e");
        } else if (aVar == null) {
        } else {
            if (!this.e) {
                com.sankuai.waimai.platform.popup.d.a().b("skyfall dialog can not showing");
                b(aVar);
            } else if (!this.g) {
                com.sankuai.waimai.platform.popup.d.a().b("skyfall dialog can not request");
                b(aVar);
            } else {
                c(aVar);
            }
        }
    }

    private void b(final GetInfoResponse getInfoResponse, final a aVar) {
        Object[] objArr = {getInfoResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7d29d6a4ecbb300cb1a18796cdddd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7d29d6a4ecbb300cb1a18796cdddd8");
        } else if (aVar == null) {
        } else {
            if (!this.e) {
                f.a().a(getInfoResponse);
                b(aVar);
            } else if (getInfoResponse.alertInfo != null && getInfoResponse.nativeData != null && getInfoResponse.nativeData.couponResultCode == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("rUUID", UUID.randomUUID());
                hashMap.put("activityId", Integer.valueOf(getInfoResponse.nativeData.activityId));
                if (getInfoResponse.alertInfo.style != null && getInfoResponse.alertInfo.style.background != null && !TextUtils.isEmpty(getInfoResponse.alertInfo.style.background.backgroundColor)) {
                    hashMap.put("backgroundColor", getInfoResponse.alertInfo.style.background.backgroundColor);
                }
                if (com.sankuai.waimai.foundation.utils.b.b(getInfoResponse.alertInfo.modules)) {
                    com.sankuai.waimai.business.page.home.actinfo.b.a(getInfoResponse.nativeData.positionCount, b.a.FailureTypeAlertModuleListIsNull);
                }
                this.i = b.a(this.b, getInfoResponse.alertInfo, getInfoResponse.nativeData, hashMap, aVar.g, new DynamicDialog.e() { // from class: com.sankuai.waimai.popup.d.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.e
                    public final boolean a() {
                        boolean z = false;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6df0e61d5570f0a36d8036b496a2c78", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6df0e61d5570f0a36d8036b496a2c78")).booleanValue();
                        }
                        if (aVar.h != null && !aVar.h.isHidden()) {
                            z = true;
                        }
                        if (!z) {
                            f.a().a(getInfoResponse);
                        }
                        return z;
                    }
                });
                com.sankuai.waimai.touchmatrix.views.b.a().a(this.i.c());
            } else {
                if (getInfoResponse.alertInfo == null && getInfoResponse.nativeData != null && getInfoResponse.nativeData.positionCount > 0) {
                    com.sankuai.waimai.business.page.home.actinfo.b.a(getInfoResponse.nativeData.positionCount, b.a.FailureTypeAlertModuleListIsNull);
                }
                b(aVar);
            }
        }
    }
}
