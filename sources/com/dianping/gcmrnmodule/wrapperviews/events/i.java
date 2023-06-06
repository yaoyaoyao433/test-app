package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnDisplayingViewsChanged;", "Lcom/facebook/react/uimanager/events/Event;", "viewTag", "", "willDisplayViews", "Lcom/facebook/react/bridge/WritableArray;", "didEndDisplayingViews", "(ILcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "canCoalesce", "", "dispatch", "", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "getEventName", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class i extends com.facebook.react.uimanager.events.b<i> {
    public static ChangeQuickRedirect a;
    public static final a b = new a(null);
    private final WritableArray c;
    private final WritableArray g;

    @Override // com.facebook.react.uimanager.events.b
    @NotNull
    public final String a() {
        return "onDisplayingViewsChanged";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public i(int i, @Nullable WritableArray writableArray, @Nullable WritableArray writableArray2) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), writableArray, writableArray2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2447adf29a3c928d646b0cd1281dcd38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2447adf29a3c928d646b0cd1281dcd38");
            return;
        }
        this.c = writableArray;
        this.g = writableArray2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnDisplayingViewsChanged$Companion;", "", "()V", "EVENT_NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(@Nullable RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130ef8622c7016938cd6c851c6042c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130ef8622c7016938cd6c851c6042c9f");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("willDisplayViews", this.c);
        createMap.putArray("didEndDisplayingViews", this.g);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(e(), "onDisplayingViewsChanged", createMap);
        }
    }
}
