package com.sankuai.waimai.platform.popup;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.popup.b;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMBasePopup implements com.sankuai.waimai.platform.popup.b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mModuleId;
    private WMBasePopup mNext;
    private a mPopupContext;
    private b mResponderData;
    private int mState;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public String a;
        public int b;
        public Object c;
        public Map<String, Object> d;
    }

    public boolean shouldHandle(b bVar) {
        return false;
    }

    public boolean shouldSendToNext(b bVar) {
        return true;
    }

    public void show(b bVar, b.a aVar) {
    }

    public WMBasePopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f037d9b523739dab688f06a1772dce3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f037d9b523739dab688f06a1772dce3a");
            return;
        }
        this.mState = 0;
        this.mResponderData = new b();
    }

    public void preparePopupData(b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "822d6187ecfe5cee569d850a2fcf6a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "822d6187ecfe5cee569d850a2fcf6a64");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    public void prepareToShow(b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79d69ee8aa23e19d9ba8f6d0a9afd70b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79d69ee8aa23e19d9ba8f6d0a9afd70b");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    public void setNext(WMBasePopup wMBasePopup) {
        this.mNext = wMBasePopup;
    }

    public WMBasePopup getNext() {
        return this.mNext;
    }

    public void setData(b bVar) {
        this.mResponderData = bVar;
    }

    public void setState(int i) {
        this.mState = i;
    }

    public void setContext(a aVar) {
        this.mPopupContext = aVar;
    }

    public a getContext() {
        return this.mPopupContext;
    }

    public void handle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b7609f9e461c36a12dcc458beb96489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b7609f9e461c36a12dcc458beb96489");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", this + ", handle begin: " + this.mState, new Object[0]);
        d a2 = d.a();
        a2.a(this + ", handle begin: " + this.mState);
        if (this.mState == 4) {
            checkAndSendToNext();
        } else if (this.mState == 0 || this.mState == 5) {
            handleInternal();
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "popup is proceeding, ", new Object[0]);
            d.a().a("popup is proceeding, ");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.popup.WMBasePopup$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements b.InterfaceC1075b {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.waimai.platform.popup.b.InterfaceC1075b
        public final void a(boolean z, b bVar) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27232afb047a67d3c2d7db7495cf3a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27232afb047a67d3c2d7db7495cf3a4");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "preparePopupData, " + z + ",shouldHandle:" + WMBasePopup.this.shouldHandle(WMBasePopup.this.mResponderData), new Object[0]);
            d a2 = d.a();
            a2.a("preparePopupData, shouldContinue:" + z + ",shouldHandle:" + WMBasePopup.this.shouldHandle(WMBasePopup.this.mResponderData));
            WMBasePopup.this.mResponderData = bVar;
            if (!z || !WMBasePopup.this.shouldHandle(WMBasePopup.this.mResponderData)) {
                WMBasePopup.this.mState = 0;
                WMBasePopup.this.checkAndSendToNext();
                return;
            }
            WMBasePopup.this.mState = 2;
            WMBasePopup.this.prepareToShow(WMBasePopup.this.mResponderData, new b.InterfaceC1075b() { // from class: com.sankuai.waimai.platform.popup.WMBasePopup.1.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.popup.b.InterfaceC1075b
                public final void a(boolean z2, b bVar2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72cb59ef55cbac1f680fdafef5094066", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72cb59ef55cbac1f680fdafef5094066");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "prepareToShow, shouldContinue = " + z2, new Object[0]);
                    d a3 = d.a();
                    a3.a("prepareToShow, shouldContinue:" + z2);
                    if (z2) {
                        WMBasePopup.this.show(WMBasePopup.this.mResponderData, new b.a() { // from class: com.sankuai.waimai.platform.popup.WMBasePopup.1.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.popup.b.a
                            public final void a(boolean z3) {
                                Object[] objArr3 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75d06c7baf02be4791d7cb704422b001", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75d06c7baf02be4791d7cb704422b001");
                                    return;
                                }
                                WMBasePopup.this.mState = 3;
                                com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "show, " + z3, new Object[0]);
                                d a4 = d.a();
                                a4.a("show, shouldFinish:" + z3);
                                if (z3) {
                                    WMBasePopup.this.mState = 4;
                                    WMBasePopup.this.checkAndSendToNext();
                                }
                            }
                        });
                        return;
                    }
                    WMBasePopup.this.mState = 0;
                    WMBasePopup.this.checkAndSendToNext();
                }
            });
        }
    }

    private void handleInternal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0209f78d11ae35c7b8e1f633007f00ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0209f78d11ae35c7b8e1f633007f00ed");
            return;
        }
        this.mState = 1;
        preparePopupData(this.mResponderData, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndSendToNext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8298901a137a11ac0ef6f8ff3ad5c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8298901a137a11ac0ef6f8ff3ad5c77");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "checkAndSendToNext：" + shouldSendToNext(this.mResponderData), new Object[0]);
        d a2 = d.a();
        a2.a("checkAndSendToNext：" + shouldSendToNext(this.mResponderData));
        if (shouldSendToNext(this.mResponderData) && this.mNext != null) {
            b bVar = new b();
            bVar.d = this.mResponderData.d;
            bVar.a = this.mModuleId;
            bVar.b = this.mState;
            this.mNext.setData(bVar);
            this.mNext.handle();
        }
        if (this.mNext == null) {
            e a3 = e.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect3, false, "05761f7d8888e4b28bec1b3420c1e571", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect3, false, "05761f7d8888e4b28bec1b3420c1e571");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "end ", new Object[0]);
            a3.h = true;
            if (a3.g != null) {
                a3.g.q();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @NonNull
        public WeakReference<Activity> a;
        @NonNull
        public String b;

        public a(@NonNull Activity activity, @NonNull String str) {
            this.a = new WeakReference<>(activity);
            this.b = str;
        }
    }
}
