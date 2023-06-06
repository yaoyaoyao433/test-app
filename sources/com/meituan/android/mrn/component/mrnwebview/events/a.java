package com.meituan.android.mrn.component.mrnwebview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/meituan/android/mrn/component/mrnwebview/events/TopLoadingErrorEvent;", "Lcom/facebook/react/uimanager/events/Event;", "viewId", "", "mEventData", "Lcom/facebook/react/bridge/WritableMap;", "(ILcom/facebook/react/bridge/WritableMap;)V", "canCoalesce", "", "dispatch", "", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "getCoalescingKey", "", "getEventName", "", "Companion", "library_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    public static ChangeQuickRedirect a;
    public static final C0283a b = new C0283a(null);
    private final WritableMap c;

    @Override // com.facebook.react.uimanager.events.b
    @NotNull
    public final String a() {
        return "topLoadingError";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/meituan/android/mrn/component/mrnwebview/events/TopLoadingErrorEvent$Companion;", "", "()V", "EVENT_NAME", "", "library_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.meituan.android.mrn.component.mrnwebview.events.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0283a {
        public C0283a() {
        }

        public /* synthetic */ C0283a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, @NotNull WritableMap writableMap) {
        super(i);
        h.b(writableMap, "mEventData");
        Object[] objArr = {Integer.valueOf(i), writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035b3b94e71e820cf047e83390eff1e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035b3b94e71e820cf047e83390eff1e7");
        } else {
            this.c = writableMap;
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(@NotNull RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b73bdd55fd12bfb2e6811f9ff9a2bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b73bdd55fd12bfb2e6811f9ff9a2bb6");
            return;
        }
        h.b(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(e(), "topLoadingError", this.c);
    }
}
