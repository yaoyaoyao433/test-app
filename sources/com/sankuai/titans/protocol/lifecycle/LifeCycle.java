package com.sankuai.titans.protocol.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface LifeCycle {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum ProcessType {
        SINGLETON,
        ORDER,
        LIST;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ProcessType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58202c6a46d77c15a1f9c51acd5a00ec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58202c6a46d77c15a1f9c51acd5a00ec");
            }
        }

        public static ProcessType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c2f2685d9c555d03b8140689b0cd099", RobustBitConfig.DEFAULT_VALUE) ? (ProcessType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c2f2685d9c555d03b8140689b0cd099") : (ProcessType) Enum.valueOf(ProcessType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ProcessType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "009d2139bb8aaa8af57191cc07066302", RobustBitConfig.DEFAULT_VALUE) ? (ProcessType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "009d2139bb8aaa8af57191cc07066302") : (ProcessType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum EventType {
        STATE,
        EVENT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        EventType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36880fd768cd628c6d0de8bd02c09718", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36880fd768cd628c6d0de8bd02c09718");
            }
        }

        public static EventType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab20bdb5285da863c513e1921530a629", RobustBitConfig.DEFAULT_VALUE) ? (EventType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab20bdb5285da863c513e1921530a629") : (EventType) Enum.valueOf(EventType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c66f9a0544d31cf004fb0791c861d507", RobustBitConfig.DEFAULT_VALUE) ? (EventType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c66f9a0544d31cf004fb0791c861d507") : (EventType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum Event {
        OnTitansInit(EventType.STATE, ProcessType.LIST),
        OnTitansReady(EventType.STATE, ProcessType.LIST),
        OnPagePreload(EventType.STATE, ProcessType.LIST),
        OnPageInit(EventType.STATE, ProcessType.LIST),
        OnPageWebViewInit(EventType.STATE, ProcessType.ORDER),
        OnPageWebViewReady(EventType.STATE, ProcessType.LIST),
        OnPageBuildEHView(EventType.STATE, ProcessType.ORDER),
        OnPageReady(EventType.STATE, ProcessType.LIST),
        OnWebLoadUrl(EventType.STATE, ProcessType.ORDER),
        OnWebStarted(EventType.STATE, ProcessType.LIST),
        OnWebFinish(EventType.STATE, ProcessType.LIST),
        OnWebShouldOverrideUrlLoading(EventType.STATE, ProcessType.ORDER),
        OnPageDestroy(EventType.STATE, ProcessType.LIST),
        OnWebShouldInterceptRequest(EventType.EVENT, ProcessType.ORDER),
        OnWebShouldInterceptRequestEx(EventType.EVENT, ProcessType.ORDER),
        OnWebProcessChanged(EventType.EVENT, ProcessType.LIST),
        OnWebReceivedError(EventType.EVENT, ProcessType.LIST),
        OnWebReceivedErrorEx(EventType.EVENT, ProcessType.LIST),
        OnWebReceivedHttpError(EventType.EVENT, ProcessType.LIST),
        OnWebReceivedSslError(EventType.EVENT, ProcessType.LIST),
        OnWebRenderProcessGone(EventType.EVENT, ProcessType.LIST),
        OnWebDoUpdateVisitedHistory(EventType.EVENT, ProcessType.LIST),
        OnWebReceivedTitle(EventType.EVENT, ProcessType.ORDER),
        OnWebPermissionRequest(EventType.EVENT, ProcessType.ORDER),
        OnWebShowCustomView(EventType.EVENT, ProcessType.ORDER),
        OnWebHideCustomView(EventType.EVENT, ProcessType.ORDER),
        OnWebJsAlert(EventType.EVENT, ProcessType.LIST),
        OnWebJsConfirm(EventType.EVENT, ProcessType.LIST),
        OnWebJsPrompt(EventType.EVENT, ProcessType.LIST),
        OnWebConsoleMessage(EventType.EVENT, ProcessType.LIST),
        OnWebShowFileChooser(EventType.EVENT, ProcessType.LIST),
        OnWebGeolocationPermissionsShowPrompt(EventType.EVENT, ProcessType.ORDER),
        OnWebGetVideoLoadingProgressView(EventType.EVENT, ProcessType.LIST);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public EventType eventType;
        public ProcessType processType;

        public static Event valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be4a625577f0ad350dc92734ce758bce", RobustBitConfig.DEFAULT_VALUE) ? (Event) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be4a625577f0ad350dc92734ce758bce") : (Event) Enum.valueOf(Event.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Event[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8e65b8a1997a266e57aaf41dcf23c3a", RobustBitConfig.DEFAULT_VALUE) ? (Event[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8e65b8a1997a266e57aaf41dcf23c3a") : (Event[]) values().clone();
        }

        Event(EventType eventType, ProcessType processType) {
            Object[] objArr = {r10, Integer.valueOf(r11), eventType, processType};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca6d61c552295af0bcb10ca4c5a4f739", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca6d61c552295af0bcb10ca4c5a4f739");
                return;
            }
            this.eventType = eventType;
            this.processType = processType;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class EventStrategy {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int sequence;

        public EventStrategy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98c032bb65ab4dd328a7d5adaff260e2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98c032bb65ab4dd328a7d5adaff260e2");
            } else {
                this.sequence = 500;
            }
        }

        public EventStrategy(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc388cf466930afb30500f0388715c2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc388cf466930afb30500f0388715c2d");
                return;
            }
            this.sequence = 500;
            this.sequence = i;
        }

        public int getSequence() {
            return this.sequence;
        }
    }
}
