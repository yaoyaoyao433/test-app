package com.sankuai.waimai.popup.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static AlertInfo a(com.sankuai.waimai.platform.mach.dialog.AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f2fa8422957ec911fc98f0bc7f00711", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f2fa8422957ec911fc98f0bc7f00711");
        }
        if (alertInfo == null) {
            return null;
        }
        AlertInfo alertInfo2 = new AlertInfo();
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
        return alertInfo2;
    }
}
