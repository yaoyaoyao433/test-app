package com.meituan.msi.api.component.picker;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.component.picker.dialog.BasePickerDialog;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PickerApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private WeakReference<? extends BasePickerDialog> b;
    private final Gson c;

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "picker.onMultiPickerColumnChange")
    public void onMultiPickerColumnChange(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "picker.onPickerCancel")
    public void onPickerCancel(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "picker.onPickerConfirm")
    public void onPickerConfirm(MsiContext msiContext) {
    }

    public PickerApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f135624fd8283636381af5579cf0669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f135624fd8283636381af5579cf0669");
        } else {
            this.c = new Gson();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0267 A[Catch: IllegalArgumentException -> 0x02af, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0299 A[Catch: IllegalArgumentException -> 0x02af, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129 A[Catch: IllegalArgumentException -> 0x02af, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d A[Catch: IllegalArgumentException -> 0x02af, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a A[Catch: IllegalArgumentException -> 0x02af, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167 A[Catch: IllegalArgumentException -> 0x02af, TryCatch #0 {IllegalArgumentException -> 0x02af, blocks: (B:51:0x00d7, B:73:0x0126, B:74:0x0129, B:116:0x0283, B:117:0x0293, B:119:0x0299, B:75:0x012d, B:76:0x014a, B:77:0x0167, B:79:0x0170, B:80:0x018d, B:82:0x019d, B:84:0x01b7, B:105:0x021e, B:86:0x01bd, B:88:0x01c1, B:90:0x01c9, B:92:0x01d2, B:94:0x01d6, B:96:0x01dd, B:98:0x01ee, B:100:0x0201, B:102:0x020f, B:104:0x0219, B:99:0x01f8, B:106:0x0224, B:107:0x0239, B:108:0x023a, B:109:0x0242, B:110:0x0243, B:111:0x024a, B:112:0x024b, B:113:0x0253, B:114:0x0254, B:115:0x0267, B:60:0x00f5, B:63:0x0101, B:66:0x010d, B:69:0x0118), top: B:134:0x00d7 }] */
    @com.meituan.msi.annotations.MsiApiMethod(name = "picker", onUiThread = true, request = com.google.gson.JsonObject.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void picker(com.google.gson.JsonObject r22, com.meituan.msi.bean.MsiContext r23) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.component.picker.PickerApi.picker(com.google.gson.JsonObject, com.meituan.msi.bean.MsiContext):void");
    }

    private void a(BasePickerDialog basePickerDialog) {
        Object[] objArr = {basePickerDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73f1563387050ffc7e68fff24a9d452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73f1563387050ffc7e68fff24a9d452");
        } else {
            this.b = new WeakReference<>(basePickerDialog);
        }
    }

    private BasePickerDialog a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897cab427dce34a2bfc9f5fc8dfa2935", RobustBitConfig.DEFAULT_VALUE)) {
            return (BasePickerDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897cab427dce34a2bfc9f5fc8dfa2935");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    @NonNull
    private <P> P a(JsonElement jsonElement, Class<P> cls) throws IllegalArgumentException {
        Object[] objArr = {jsonElement, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c70b73e6c2024026d457bc59388af1", RobustBitConfig.DEFAULT_VALUE)) {
            return (P) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c70b73e6c2024026d457bc59388af1");
        }
        P p = (P) this.c.fromJson(jsonElement, (Class<Object>) cls);
        if (p != null) {
            return p;
        }
        throw new IllegalArgumentException("parse result is null");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa82a5566d7e8b9d91a1528b9993d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa82a5566d7e8b9d91a1528b9993d37");
            return;
        }
        BasePickerDialog a2 = a();
        if (a2 != null) {
            a2.dismiss();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements BasePickerDialog.a {
        public static ChangeQuickRedirect a;
        private e b;

        public a(e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68213d95bbad5c8d3f59dacc3be1168e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68213d95bbad5c8d3f59dacc3be1168e");
            } else {
                this.b = eVar;
            }
        }

        @Override // com.meituan.msi.api.component.picker.dialog.BasePickerDialog.a
        public final void a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3039edf1c63682ff5b830a961ade55", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3039edf1c63682ff5b830a961ade55");
            } else if (this.b != null) {
                this.b.a("onPickerConfirm", map);
            }
        }

        @Override // com.meituan.msi.api.component.picker.dialog.BasePickerDialog.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac617d0132c116c7da9bd278c78fb03b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac617d0132c116c7da9bd278c78fb03b");
            } else if (this.b != null) {
                this.b.a("onPickerCancel", (Object) "");
            }
        }

        @Override // com.meituan.msi.api.component.picker.dialog.BasePickerDialog.a
        public final void b(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d230c28592b20716bbbe74131142287", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d230c28592b20716bbbe74131142287");
            } else if (this.b != null) {
                this.b.a("onMultiPickerColumnChange", map);
            }
        }
    }
}
