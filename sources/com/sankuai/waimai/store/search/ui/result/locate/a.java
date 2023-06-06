package com.sankuai.waimai.store.search.ui.result.locate;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.search.common.api.net.SCSearchApiService;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.tencent.mapsdk.internal.y;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final String c = "a";
    public b b;
    private final SCBaseActivity d;
    private CustomDialog e;
    private CustomDialog f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(a aVar, Context context, boolean z) {
        Object[] objArr = {context, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "62639c7919f874bd19c1e18c7fbb4d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "62639c7919f874bd19c1e18c7fbb4d89");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(y.a);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
                intent2.addFlags(y.a);
                if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                    context.startActivity(intent2);
                }
            }
        } else {
            Intent intent3 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
            intent3.addFlags(y.a);
            if (context.getPackageManager().resolveActivity(intent3, 65536) != null) {
                context.startActivity(intent3);
            }
        }
        boolean z2 = context instanceof Activity;
    }

    public static /* synthetic */ void a(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "db11115ad8b87081220a367afbc089b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "db11115ad8b87081220a367afbc089b5");
            return;
        }
        try {
            aVar.e = new CustomDialog.a(aVar.d).a(aVar.d.getString(R.string.wm_sc_search_locating_permission_request_title)).b(aVar.d.getString(R.string.wm_sc_search_locating_permission_request_message)).a(aVar.d.getString(R.string.wm_sc_search_locating_permission_request_button), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e152f260ab30b7164c24b9a83f5b08cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e152f260ab30b7164c24b9a83f5b08cd");
                    } else {
                        a.b(a.this, str);
                    }
                }
            }).b(aVar.d.getString(R.string.wm_sc_search_locating_permission_request_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894a6ee4def6647dbe9b08e5e046c631", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894a6ee4def6647dbe9b08e5e046c631");
                    } else {
                        a.this.c();
                    }
                }
            }).a(false).a();
            aVar.e.show();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b9aaa13e16a615cd92ca921b3184c4b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b9aaa13e16a615cd92ca921b3184c4b9");
        } else {
            Privacy.createPermissionGuard().a((Activity) aVar.d, "Locate.once", str, (d) new g() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str2, int i) {
                    Object[] objArr2 = {str2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39603af183d09bd598244ec23d861606", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39603af183d09bd598244ec23d861606");
                    } else if (i > 0) {
                        a.c(a.this, str);
                    } else if (i == -4) {
                        a.this.c();
                        a.a(a.this, a.this.d, false);
                    } else {
                        a.this.c();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void c(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b582215fb3821fdb6212faf4546231e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b582215fb3821fdb6212faf4546231e0");
        } else {
            com.sankuai.waimai.store.locate.a.a(aVar.d, str, new C1324a(aVar), true);
        }
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "9c49212b62f3a3aa5cd2202741233b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "9c49212b62f3a3aa5cd2202741233b67");
        } else if (!com.sankuai.waimai.store.locate.a.g()) {
            aVar.b();
        } else {
            aVar.c();
        }
    }

    public static /* synthetic */ void d(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "11e61fc8084e650405d449b12ecdcf5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "11e61fc8084e650405d449b12ecdcf5f");
        } else if (!com.sankuai.waimai.store.locate.a.g()) {
            Privacy.createPermissionGuard().a((Context) aVar.d, "Locate.once", str, (d) new g() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str2, int i) {
                    Object[] objArr2 = {str2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a75e35fbf5e2953d74425ca573d59cf0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a75e35fbf5e2953d74425ca573d59cf0");
                    } else if (i > 0) {
                        a.this.b();
                    } else {
                        a.a(a.this, str);
                    }
                }
            });
        } else {
            aVar.c();
        }
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ebfa1167c4046eede47a936a7076cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ebfa1167c4046eede47a936a7076cf");
        } else {
            this.d = sCBaseActivity;
        }
    }

    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6afafc5a9e41fba9b0ccdb1ce406fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6afafc5a9e41fba9b0ccdb1ce406fd6");
        } else {
            b(str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1734a06e7d3c5c542accd422e16ee949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1734a06e7d3c5c542accd422e16ee949");
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(c);
        com.sankuai.waimai.store.util.d.a(this.f);
        com.sankuai.waimai.store.util.d.a(this.e);
    }

    private void b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73090e5a9ed2bf2a748131fb632009e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73090e5a9ed2bf2a748131fb632009e8");
        } else {
            com.sankuai.waimai.store.locate.a.a(this.d, new c(this, str), true, 3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb2e80f27d49f423c0d90ca3bb9562f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb2e80f27d49f423c0d90ca3bb9562f");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((SCSearchApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) SCSearchApiService.class)).getAddr("1", "0"), new b.AbstractC1042b<NewHistoryAddressResponse>() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    NewHistoryAddressResponse newHistoryAddressResponse = (NewHistoryAddressResponse) obj;
                    Object[] objArr2 = {newHistoryAddressResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1561e34f59173d3b98a6c5c84bd64bd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1561e34f59173d3b98a6c5c84bd64bd8");
                    } else {
                        a.this.a(newHistoryAddressResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91ace5b4baedc7de2b99d7440631f69a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91ace5b4baedc7de2b99d7440631f69a");
                    } else {
                        a.this.a((NewHistoryAddressResponse) null);
                    }
                }
            }, c);
        } else {
            a((NewHistoryAddressResponse) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@Nullable NewHistoryAddressResponse newHistoryAddressResponse) {
        Object[] objArr = {newHistoryAddressResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc62e415847b9c52acf837e2e99b6640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc62e415847b9c52acf837e2e99b6640");
            return;
        }
        List<AddressItem> a2 = a(newHistoryAddressResponse, 3);
        if (!com.sankuai.waimai.store.locate.a.g() && com.sankuai.shangou.stone.util.a.a((Collection<?>) a2)) {
            try {
                this.f = new com.sankuai.waimai.store.search.ui.result.locate.b(this.d, a2).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.search.ui.result.locate.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b323d2dddce634aea0c4fc59db246f98", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b323d2dddce634aea0c4fc59db246f98");
                        } else {
                            a.this.c();
                        }
                    }
                }).a();
                this.f.show();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        c();
    }

    private List<AddressItem> a(@Nullable NewHistoryAddressResponse newHistoryAddressResponse, int i) {
        int i2 = 0;
        Object[] objArr = {newHistoryAddressResponse, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1b7ff3c884e9504a2f84013c5b314b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1b7ff3c884e9504a2f84013c5b314b");
        }
        LinkedList linkedList = new LinkedList();
        if (newHistoryAddressResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) newHistoryAddressResponse.f)) {
            for (AddressItem addressItem : newHistoryAddressResponse.f) {
                if (addressItem != null && !TextUtils.isEmpty(addressItem.addrBrief)) {
                    linkedList.add(addressItem);
                    i2++;
                    continue;
                }
                if (i2 >= 3) {
                    break;
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c7114234f10db95535650e52d6d01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c7114234f10db95535650e52d6d01c");
        } else if (this.b == null || com.sankuai.waimai.store.locate.a.g()) {
        } else {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.ui.result.locate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1324a implements com.sankuai.waimai.store.i.locate.a {
        public static ChangeQuickRedirect a;
        private final WeakReference<a> b;

        public C1324a(@NonNull a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec2c6b0d0d7b2f10f556b5817653b12", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec2c6b0d0d7b2f10f556b5817653b12");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // com.sankuai.waimai.store.i.locate.a
        public final void a(boolean z, String str, WMLocation wMLocation) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, wMLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6160e3ad687b7000bfbe4fadd0755aa4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6160e3ad687b7000bfbe4fadd0755aa4");
            } else if (this.b.get() != null) {
                a.d(this.b.get());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements com.sankuai.waimai.store.i.locate.d {
        public static ChangeQuickRedirect a;
        private final WeakReference<a> b;
        private String c;

        public c(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6696a9f0727b839c9c4a38f0a63708", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6696a9f0727b839c9c4a38f0a63708");
                return;
            }
            this.b = new WeakReference<>(aVar);
            this.c = str;
        }

        @Override // com.sankuai.waimai.store.i.locate.d
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1accb7f5a5bd778ab6fd7f41ce474e42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1accb7f5a5bd778ab6fd7f41ce474e42");
            } else if (this.b.get() != null) {
                a.d(this.b.get(), this.c);
            }
        }

        @Override // com.sankuai.waimai.store.i.locate.a
        public final void a(boolean z, String str, WMLocation wMLocation) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, wMLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee0ca2fcabe26cdfcd3ff71bff67498", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee0ca2fcabe26cdfcd3ff71bff67498");
            } else if (this.b.get() != null) {
                a.d(this.b.get(), this.c);
            }
        }
    }
}
