package com.meituan.android.common.statistics.entity;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum EventName {
    MGE_CLICK("mge_click"),
    MGE_VIEW("mge_view"),
    MGE_SLIDE("mge_slide"),
    REPORT("report"),
    START("AS"),
    QUIT("AQ"),
    MGE("mge"),
    CLICK("MC"),
    EDIT(QuickReportConstants.ME_CONFIG),
    MODEL_VIEW("MV"),
    MODEL_VIEW_LIST("MVL"),
    MODEL_DISAPPEAR("MD"),
    MPT("mpt"),
    PAGE_VIEW(QuickReportConstants.PV_CONFIG),
    PAGE_DISAPPEAR("PD"),
    ORDER(QuickReportConstants.BO_CONFIG),
    PAY(QuickReportConstants.BP_CONFIG),
    SC("SC");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;

    public static EventName valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc58477851397577fac3bb10942869ed", 6917529027641081856L) ? (EventName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc58477851397577fac3bb10942869ed") : (EventName) Enum.valueOf(EventName.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EventName[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f5d1975a5de8ebf647abe1c7ffaaa52", 6917529027641081856L) ? (EventName[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f5d1975a5de8ebf647abe1c7ffaaa52") : (EventName[]) values().clone();
    }

    EventName(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b870d935d653a8661068b2e18191cd27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b870d935d653a8661068b2e18191cd27");
        } else {
            this.name = str;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }

    public final boolean equals(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57593cd75b935e36a63e4c572db2b292", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57593cd75b935e36a63e4c572db2b292")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(this.name);
    }

    public static boolean isApplicationEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e440da64b95d2d699c5d4c80716f2610", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e440da64b95d2d699c5d4c80716f2610")).booleanValue() : REPORT.equals(str) || START.equals(str) || QUIT.equals(str);
    }

    public static boolean isPageEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "683d80eb9408dfc881c782a69e86ae03", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "683d80eb9408dfc881c782a69e86ae03")).booleanValue() : PAGE_VIEW.equals(str) || PAGE_DISAPPEAR.equals(str) || MPT.equals(str);
    }

    public static boolean isModuleEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca27cfcb074aa59ebc6b83cd310b47e5", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca27cfcb074aa59ebc6b83cd310b47e5")).booleanValue() : MGE.equals(str) || CLICK.equals(str) || EDIT.equals(str) || MODEL_VIEW.equals(str) || MODEL_VIEW_LIST.equals(str) || ORDER.equals(str) || PAY.equals(str) || MODEL_DISAPPEAR.equals(str);
    }

    public static boolean isSystemEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96975a8270ca5123f38cdb2e45973491", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96975a8270ca5123f38cdb2e45973491")).booleanValue() : SC.equals(str);
    }

    public static EventName fromEventType(EventName eventName, String str) {
        Object[] objArr = {eventName, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47c2002763eef3ecc389f74fa32465dc", 6917529027641081856L)) {
            return (EventName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47c2002763eef3ecc389f74fa32465dc");
        }
        if (MGE.equals(eventName)) {
            if (TextUtils.isEmpty(str)) {
                return MGE;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3619493) {
                if (hashCode != 94750088) {
                    if (hashCode == 109526449 && str.equals(Constants.EventType.SLIDE)) {
                        c = 2;
                    }
                } else if (str.equals("click")) {
                    c = 0;
                }
            } else if (str.equals(Constants.EventType.VIEW)) {
                c = 1;
            }
            switch (c) {
                case 0:
                    return MGE_CLICK;
                case 1:
                    return MGE_VIEW;
                case 2:
                    return MGE_SLIDE;
                default:
                    return MGE;
            }
        }
        return eventName;
    }

    public static EventName getEnum(String str) {
        EventName[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4e0a57326441b87a657b6bef3bed330", 6917529027641081856L)) {
            return (EventName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4e0a57326441b87a657b6bef3bed330");
        }
        for (EventName eventName : valuesCustom()) {
            if (eventName.getValue().equalsIgnoreCase(str)) {
                return eventName;
            }
        }
        throw new IllegalArgumentException();
    }

    public final String value() {
        return this.name;
    }

    public final String getValue() {
        return this.name;
    }
}
