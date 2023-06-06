package com.meituan.mtmap.rendersdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LogRecord {
    public static ChangeQuickRedirect changeQuickRedirect;

    private native void setLogObserver();

    public void onAlarmRecord(int i, int i2, long j, String str, String str2) {
    }

    public void onRecord(int i, int i2, long j, String str) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum EventSeverity {
        Debug,
        Info,
        Warning,
        Error;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        EventSeverity() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0572c1d215f1bee1f6036de2ea3f83f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0572c1d215f1bee1f6036de2ea3f83f");
            }
        }

        public static EventSeverity valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "144bf1a4e567b846d6dbd32b14936c53", RobustBitConfig.DEFAULT_VALUE) ? (EventSeverity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "144bf1a4e567b846d6dbd32b14936c53") : (EventSeverity) Enum.valueOf(EventSeverity.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EventSeverity[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b98313c73aff7bb3b4caf1742b1df4d7", RobustBitConfig.DEFAULT_VALUE) ? (EventSeverity[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b98313c73aff7bb3b4caf1742b1df4d7") : (EventSeverity[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum Event {
        General,
        ParseStyle,
        ParseTile,
        Render,
        Style,
        Database,
        HttpRequest,
        Image,
        OpenGL,
        JNI,
        Android,
        Crash,
        Glyph,
        Performance,
        Tile;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Event() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27763343641122ce4cdd2833cfc333c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27763343641122ce4cdd2833cfc333c9");
            }
        }

        public static Event valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a07040f85639ea7cdb1674b607e53a12", RobustBitConfig.DEFAULT_VALUE) ? (Event) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a07040f85639ea7cdb1674b607e53a12") : (Event) Enum.valueOf(Event.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Event[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c12dc6c112ceea4184f70403a2d0369", RobustBitConfig.DEFAULT_VALUE) ? (Event[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c12dc6c112ceea4184f70403a2d0369") : (Event[]) values().clone();
        }
    }

    public LogRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e7b47c0d46a5fdb17bae05cf4148c69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e7b47c0d46a5fdb17bae05cf4148c69");
        } else if (InnerInitializer.canNativeBeUsed("Indoor.create")) {
            setLogObserver();
        }
    }
}
