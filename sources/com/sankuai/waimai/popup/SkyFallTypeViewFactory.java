package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.FullyDynamicDialogContentView;
import com.sankuai.waimai.platform.mach.dialog.PartiallyDynamicDialogContentView;
import com.sankuai.waimai.platform.mach.dialog.i;
import com.sankuai.waimai.platform.mach.dialog.j;
import com.sankuai.waimai.popup.b;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SkyFallTypeViewFactory implements TypeViewFactory {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory
    public final void a(com.sankuai.waimai.touchmatrix.data.a aVar, final com.sankuai.waimai.touchmatrix.rebuild.factory.c cVar, com.sankuai.waimai.touchmatrix.rebuild.factory.e eVar) {
        com.sankuai.waimai.platform.mach.dialog.d fullyDynamicDialogContentView;
        Object[] objArr = {aVar, cVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945f8dd1c252d086863991b13f2aa3d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945f8dd1c252d086863991b13f2aa3d8");
            return;
        }
        int i = aVar.k.businessData.alertType;
        Activity a2 = cVar.a();
        Window f = cVar.f();
        final b.a aVar2 = (b.a) cVar.e();
        boolean booleanValue = ((Boolean) aVar2.b().get("useTianJiangNewStyle")).booleanValue();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
        int intValue = PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "bee8ef8f4269e340394c9c30de99e709", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "bee8ef8f4269e340394c9c30de99e709")).intValue() : aVar2.b.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
        boolean booleanValue2 = PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "191ec4ebb38ab7d3a32103fc48b82687", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "191ec4ebb38ab7d3a32103fc48b82687")).booleanValue() : aVar2.b.g;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
        float floatValue = PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "726dd5647fbf33dadd89bfb18367629f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "726dd5647fbf33dadd89bfb18367629f")).floatValue() : aVar2.b.f;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
        float floatValue2 = PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "21d14b11bdf88b60821b4bf17c2571f4", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "21d14b11bdf88b60821b4bf17c2571f4")).floatValue() : aVar2.b.h;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = b.a.a;
        boolean booleanValue3 = PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "6a14fa746bc3b5f28bb0dd57cda5dc81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "6a14fa746bc3b5f28bb0dd57cda5dc81")).booleanValue() : aVar2.b.i;
        if (i == 1) {
            fullyDynamicDialogContentView = new PartiallyDynamicDialogContentView(a2);
            PartiallyDynamicDialogContentView partiallyDynamicDialogContentView = (PartiallyDynamicDialogContentView) fullyDynamicDialogContentView;
            partiallyDynamicDialogContentView.mIsFromTop = booleanValue;
            if (f != null) {
                int a3 = g.a((Context) a2);
                float f2 = a3;
                int i2 = (int) (f2 * floatValue2);
                int i3 = intValue == 1 ? -1 : -2;
                if (booleanValue) {
                    i2 = a3;
                }
                f.setLayout(i2, i3);
                if (floatValue2 == 1.0f && intValue == 1) {
                    partiallyDynamicDialogContentView.setViewWidth((int) (f2 * floatValue));
                    partiallyDynamicDialogContentView.setCanceledOnTouchBg(!booleanValue && booleanValue2);
                }
            }
        } else {
            fullyDynamicDialogContentView = new FullyDynamicDialogContentView(a2);
            if (f != null && !booleanValue3) {
                f.setDimAmount(0.0f);
            }
            int i4 = (intValue == 1 || intValue != 2) ? -1 : -2;
            if (f != null) {
                f.setLayout(-1, i4);
            }
        }
        fullyDynamicDialogContentView.attachDialogContext(new DynamicDialog.d() { // from class: com.sankuai.waimai.popup.SkyFallTypeViewFactory.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void a() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fda87033436c4523884cbb67b5902f8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fda87033436c4523884cbb67b5902f8c");
                } else {
                    cVar.d();
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void b() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f2252b335a25ecdcc1e43485b7ffa258", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f2252b335a25ecdcc1e43485b7ffa258");
                } else if (aVar2.a() != null) {
                    aVar2.a().a();
                } else {
                    cVar.c();
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @Nullable
            public final DynamicDialog.f c() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "79e5d2a5643d6845e657608302e9b793", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DynamicDialog.f) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "79e5d2a5643d6845e657608302e9b793");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "b5a3d77d2ecca0a53119e159aa685e85", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialog.f) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "b5a3d77d2ecca0a53119e159aa685e85") : aVar3.b.k;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @Nullable
            public final DynamicDialog.b d() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9b5a5c4405be820bf11a0de57773282a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DynamicDialog.b) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9b5a5c4405be820bf11a0de57773282a");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "f1b23ba1dd11b6204c6fe14fa9bf2a62", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialog.b) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "f1b23ba1dd11b6204c6fe14fa9bf2a62") : aVar3.b.m;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void e() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d43c1f5c1cb69e879748cd5d145c4b1b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d43c1f5c1cb69e879748cd5d145c4b1b");
                } else {
                    cVar.b();
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final com.sankuai.waimai.mach.d f() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "07b398475ce5621a6304c0e1b3eb57d8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "07b398475ce5621a6304c0e1b3eb57d8");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "52966244bfdb54d21c13ba35156b719e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "52966244bfdb54d21c13ba35156b719e") : aVar3.b.l;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final String g() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ba4b7942715c2e11271b131b9f6225fe", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ba4b7942715c2e11271b131b9f6225fe");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "a4518939b13b9ecfc1f9002ad463cd98", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "a4518939b13b9ecfc1f9002ad463cd98") : aVar3.b.b;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final Activity h() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5ad38a029a41e4873be4d4dab24bf4c5", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5ad38a029a41e4873be4d4dab24bf4c5") : cVar.a();
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @NonNull
            public final Map<String, Object> i() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ad295888022e0905ed1f07c389e73c4b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ad295888022e0905ed1f07c389e73c4b") : new HashMap(aVar2.b());
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final DynamicDialog.h j() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fcb067d0408842966c3f7a6e0f4841e5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DynamicDialog.h) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fcb067d0408842966c3f7a6e0f4841e5");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "818225acad38524a4b15a4acd028b96a", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialog.h) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "818225acad38524a4b15a4acd028b96a") : aVar3.b.d;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final i k() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "94aae83238b9ca467d97f06f66a0dc24", RobustBitConfig.DEFAULT_VALUE)) {
                    return (i) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "94aae83238b9ca467d97f06f66a0dc24");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "034aa85698f91b9ddabae189994c7b6c", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "034aa85698f91b9ddabae189994c7b6c") : aVar3.b.j;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final DynamicDialog.g l() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fb5c9fee0ede4719d4b6a879ceecbe2f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DynamicDialog.g) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fb5c9fee0ede4719d4b6a879ceecbe2f");
                }
                b.a aVar3 = aVar2;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
                return PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "c3485960f6dc9b0f066e71f70d7c985b", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialog.g) PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "c3485960f6dc9b0f066e71f70d7c985b") : aVar3.b.o;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final Map<String, Object> m() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "32e81545517e42394b443fe4c6335d44", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "32e81545517e42394b443fe4c6335d44");
                }
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("is_supplement_exposure", Integer.valueOf(f.a().b()));
                return arrayMap;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final Map<String, String> n() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "811b1d19108ddf0b9054f8dea62c3b37", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "811b1d19108ddf0b9054f8dea62c3b37");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(f.a().b());
                return Collections.singletonMap("is_supplement_exposure", sb.toString());
            }
        });
        eVar.a(fullyDynamicDialogContentView, false);
        AlertInfo alertInfo = aVar.k.businessData;
        Object[] objArr7 = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.popup.util.b.a;
        com.sankuai.waimai.platform.mach.dialog.AlertInfo alertInfo2 = null;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "196041e3553065a76ccf7db3f42e5c64", RobustBitConfig.DEFAULT_VALUE)) {
            alertInfo2 = (com.sankuai.waimai.platform.mach.dialog.AlertInfo) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "196041e3553065a76ccf7db3f42e5c64");
        } else if (alertInfo != null) {
            alertInfo2 = new com.sankuai.waimai.platform.mach.dialog.AlertInfo();
            alertInfo2.alertName = alertInfo.alertName;
            alertInfo2.alertType = alertInfo.alertType;
            alertInfo2.traceInfo = alertInfo.traceInfo;
            alertInfo2.extraData = alertInfo.extraData;
            if (alertInfo.headerInfo != null) {
                AlertInfo.HeaderInfo headerInfo = new AlertInfo.HeaderInfo();
                headerInfo.activityId = alertInfo.headerInfo.activityId;
                headerInfo.activityType = alertInfo.headerInfo.activityType;
                headerInfo.background = alertInfo.headerInfo.background;
                headerInfo.clickUrl = alertInfo.headerInfo.clickUrl;
                headerInfo.entryItemId = alertInfo.headerInfo.entryItemId;
                headerInfo.headerId = alertInfo.headerInfo.headerId;
                headerInfo.moduleId = alertInfo.headerInfo.moduleId;
                headerInfo.templateId = alertInfo.headerInfo.templateId;
                alertInfo2.headerInfo = headerInfo;
            }
            if (alertInfo.modules != null) {
                ArrayList arrayList = new ArrayList();
                for (AlertInfo.Module module : alertInfo.modules) {
                    if (module != null) {
                        AlertInfo.Module module2 = new AlertInfo.Module();
                        module2.businessType = module.businessType;
                        module2.containerType = module.containerType;
                        module2.dataType = module.dataType;
                        module2.defaultTemplateId = module.defaultTemplateId;
                        module2.jsonData = module.jsonData;
                        module2.moduleId = module.moduleId;
                        module2.stringData = module.stringData;
                        module2.templateId = module.templateId;
                        if (module.layoutInfo != null) {
                            AlertInfo.Module.LayoutInfo layoutInfo = new AlertInfo.Module.LayoutInfo();
                            layoutInfo.marginBottom = module.layoutInfo.marginBottom;
                            layoutInfo.marginTop = module.layoutInfo.marginTop;
                            module2.layoutInfo = layoutInfo;
                        }
                        arrayList.add(module2);
                    }
                }
                alertInfo2.modules = arrayList;
            }
            if (alertInfo.footerInfo != null) {
                AlertInfo.FooterInfo footerInfo = new AlertInfo.FooterInfo();
                if (alertInfo.footerInfo.buttonList != null) {
                    footerInfo.buttonList = new ArrayList();
                    for (AlertInfo.FooterInfo.Button button : alertInfo.footerInfo.buttonList) {
                        if (button != null) {
                            footerInfo.getClass();
                            AlertInfo.FooterInfo.Button button2 = new AlertInfo.FooterInfo.Button();
                            button2.buttonBackgroundColor = button.buttonBackgroundColor;
                            button2.buttonBorderColor = button.buttonBorderColor;
                            button2.buttonId = button.buttonId;
                            button2.buttonText = button.buttonText;
                            button2.buttonTextColor = button.buttonTextColor;
                            button2.clickUrl = button.clickUrl;
                            footerInfo.buttonList.add(button2);
                        }
                    }
                }
                alertInfo2.footerInfo = footerInfo;
            }
            if (alertInfo.style != null) {
                AlertInfo.Style style = new AlertInfo.Style();
                style.animation_style = alertInfo.style.animation_style;
                style.duration = alertInfo.style.duration;
                style.closeStyle = alertInfo.style.closeStyle;
                style.contentMaxHeight = alertInfo.style.contentMaxHeight;
                if (alertInfo.style.background != null) {
                    AlertInfo.Style.Background background = new AlertInfo.Style.Background();
                    background.backgroundColor = alertInfo.style.background.backgroundColor;
                    background.backgroundUrl = alertInfo.style.background.backgroundUrl;
                    style.background = background;
                }
                alertInfo2.style = style;
            }
            if (alertInfo.logData != null) {
                AlertInfo.LogData logData = new AlertInfo.LogData();
                logData.activityId = alertInfo.logData.activityId;
                logData.activityType = alertInfo.logData.activityType;
                logData.entryItemId = alertInfo.logData.entryItemId;
                alertInfo2.logData = logData;
            }
        }
        fullyDynamicDialogContentView.refresh(alertInfo2, new j() { // from class: com.sankuai.waimai.popup.SkyFallTypeViewFactory.2
            @Override // com.sankuai.waimai.platform.mach.dialog.j
            public final void a() {
            }
        });
    }
}
