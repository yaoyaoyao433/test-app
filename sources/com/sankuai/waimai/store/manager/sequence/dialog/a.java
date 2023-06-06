package com.sankuai.waimai.store.manager.sequence.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.preload.ResourcePreloadItem;
import com.sankuai.waimai.store.manager.preload.a;
import com.sankuai.waimai.store.manager.sequence.d;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGMarketingDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import rx.d;
import rx.e;
import rx.functions.k;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d<SCBaseDialog> implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public static ChangeQuickRedirect h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final List<ResourcePreloadItem> l;
    private final String m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.sequence.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1228a implements a.InterfaceC1227a {
        public static ChangeQuickRedirect a;
        private WeakReference<a> b;

        public C1228a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa2837fa9d42c59ec112b4e7bc957b9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa2837fa9d42c59ec112b4e7bc957b9");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // com.sankuai.waimai.store.manager.preload.a.InterfaceC1227a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541d213773af5ccb2112bfeef82a325e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541d213773af5ccb2112bfeef82a325e");
                return;
            }
            a aVar = this.b.get();
            if (aVar == null) {
                return;
            }
            aVar.g();
        }

        @Override // com.sankuai.waimai.store.manager.preload.a.InterfaceC1227a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ec41dea84c689479aa2cbb6d260cfb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ec41dea84c689479aa2cbb6d260cfb");
                return;
            }
            a aVar = this.b.get();
            if (aVar == null) {
                return;
            }
            aVar.a(aVar.m, SGMarketingDialog.ResourcePreloadError, i.a(aVar.l));
        }
    }

    public a(Activity activity, @NonNull com.sankuai.waimai.store.manager.marketing.parser.a<SCBaseDialog> aVar, com.sankuai.waimai.store.platform.marketing.a aVar2, MarketingModel.MarketingOpenModel marketingOpenModel) {
        super(activity, aVar);
        boolean z = true;
        Object[] objArr = {activity, aVar, aVar2, marketingOpenModel};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de5aec6d7400d155dfec0628d9efbb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de5aec6d7400d155dfec0628d9efbb3");
            return;
        }
        this.i = marketingOpenModel == null || marketingOpenModel.isCancelable;
        this.j = (marketingOpenModel == null || !marketingOpenModel.isCancelTouchOutside) ? false : false;
        this.k = marketingOpenModel != null ? marketingOpenModel.showType : "default";
        this.l = marketingOpenModel != null ? marketingOpenModel.preloadUrlList : null;
        this.m = aVar2.b;
    }

    @Override // com.sankuai.waimai.store.manager.sequence.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc64493142d17f602929b4f31248836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc64493142d17f602929b4f31248836");
        } else if (com.sankuai.shangou.stone.util.a.b(this.l)) {
            g();
        } else {
            final com.sankuai.waimai.store.manager.preload.a a = com.sankuai.waimai.store.manager.preload.a.a();
            List<ResourcePreloadItem> list = this.l;
            final C1228a c1228a = new C1228a(this);
            Object[] objArr2 = {list, c1228a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.preload.a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "47becca1444556f8bef898acab55ee22", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "47becca1444556f8bef898acab55ee22")).booleanValue();
            } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                ArrayList arrayList = new ArrayList();
                for (final ResourcePreloadItem resourcePreloadItem : list) {
                    if (resourcePreloadItem != null && !t.a(resourcePreloadItem.url)) {
                        a.b.contains(resourcePreloadItem.url);
                        arrayList.add(rx.d.a((d.a) new d.a<Boolean>() { // from class: com.sankuai.waimai.store.manager.preload.a.2
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(Object obj) {
                                final j jVar = (j) obj;
                                Object[] objArr3 = {jVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "59c3d4f73406e01ecf91bbc0f204f6ae", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "59c3d4f73406e01ecf91bbc0f204f6ae");
                                    return;
                                }
                                InterfaceC1227a interfaceC1227a = new InterfaceC1227a() { // from class: com.sankuai.waimai.store.manager.preload.a.2.1
                                    public static ChangeQuickRedirect a;

                                    {
                                        AnonymousClass2.this = this;
                                    }

                                    @Override // com.sankuai.waimai.store.manager.preload.a.InterfaceC1227a
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "85e16e680aacc6c294a680d956785c49", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "85e16e680aacc6c294a680d956785c49");
                                        } else {
                                            jVar.onNext(Boolean.TRUE);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.manager.preload.a.InterfaceC1227a
                                    public final void b() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a2566db0b68896ed0b637c04fc6fa6d7", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a2566db0b68896ed0b637c04fc6fa6d7");
                                        } else {
                                            jVar.onNext(Boolean.FALSE);
                                        }
                                    }
                                };
                                if (2 == resourcePreloadItem.type) {
                                    a.b(resourcePreloadItem.url, interfaceC1227a);
                                } else {
                                    a.a(resourcePreloadItem.url, interfaceC1227a);
                                }
                            }
                        }));
                    }
                }
                rx.d.a((Iterable<? extends rx.d<?>>) arrayList, new k<Boolean>() { // from class: com.sankuai.waimai.store.manager.preload.a.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.k
                    public final /* synthetic */ Boolean call(Object[] objArr3) {
                        boolean z = false;
                        Object[] objArr4 = {objArr3};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "865e20adc4246238fc4b8935b6f05bc5", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "865e20adc4246238fc4b8935b6f05bc5");
                        }
                        if (com.sankuai.shangou.stone.util.a.a(objArr3)) {
                            int length = objArr3.length;
                            int i = 0;
                            boolean z2 = false;
                            while (true) {
                                if (i >= length) {
                                    z = z2;
                                    break;
                                }
                                Object obj = objArr3[i];
                                if (obj instanceof Boolean) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }).a(rx.android.schedulers.a.a()).a((e) new e<Boolean>() { // from class: com.sankuai.waimai.store.manager.preload.a.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final void onCompleted() {
                    }

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr3 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0126cd8891b213b445290b8a4c10a0d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0126cd8891b213b445290b8a4c10a0d");
                        } else if (bool2 != null && bool2.booleanValue()) {
                            c1228a.a();
                        } else {
                            c1228a.b();
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5e07341ce7729be70e4728f37aaecf0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5e07341ce7729be70e4728f37aaecf0");
                        } else {
                            c1228a.b();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        WindowManager.LayoutParams attributes;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1994974b5ea27c0c8ecff3a389140d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1994974b5ea27c0c8ecff3a389140d76");
            return;
        }
        Window window = ((SCBaseDialog) this.b).getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            if (MarketingModel.DIALOG_SHOW_TYPE_SLIDE_TOP.equals(this.k)) {
                attributes.gravity = 48;
                window.setWindowAnimations(R.style.WmStDialogTopAnimation);
            } else if (MarketingModel.DIALOG_SHOW_TYPE_SLIDE_BOTTOM.equals(this.k)) {
                attributes.gravity = 80;
            } else {
                attributes.gravity = 17;
            }
            window.setAttributes(attributes);
        }
        ((SCBaseDialog) this.b).a((DialogInterface.OnShowListener) this);
        ((SCBaseDialog) this.b).a((DialogInterface.OnDismissListener) this);
        ((SCBaseDialog) this.b).setCancelable(this.i);
        ((SCBaseDialog) this.b).setCanceledOnTouchOutside(this.j);
        try {
            ((SCBaseDialog) this.b).show();
        } catch (Exception e) {
            a(this.m, SGMarketingDialog.ShowError, Log.getStackTraceString(e));
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.d
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028b9ad31edaad6ec486fc069ebeb4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028b9ad31edaad6ec486fc069ebeb4f5");
        } else {
            com.sankuai.waimai.foundation.core.utils.d.a((Dialog) this.b);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2bac45251d780facb3d704ebf618dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2bac45251d780facb3d704ebf618dce");
        } else {
            a();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9abac3576063637c7bc97b4b237a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9abac3576063637c7bc97b4b237a7f");
        } else {
            b();
        }
    }
}
