package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnLoadedPagesChangedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "viewTag", "", "loadedPages", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "loadedPageKeys", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(ILjava/util/HashSet;Ljava/util/HashMap;)V", "dispatch", "", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "getEventName", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class m extends com.facebook.react.uimanager.events.b<m> {
    public static ChangeQuickRedirect a;
    public static final a b = new a(null);
    private final HashSet<Integer> c;
    private final HashMap<String, Integer> g;

    @Override // com.facebook.react.uimanager.events.b
    @NotNull
    public final String a() {
        return "onLoadedPagesChanged";
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnLoadedPagesChangedEvent$Companion;", "", "()V", "NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i, @NotNull HashSet<Integer> hashSet, @NotNull HashMap<String, Integer> hashMap) {
        super(i);
        kotlin.jvm.internal.h.b(hashSet, "loadedPages");
        kotlin.jvm.internal.h.b(hashMap, "loadedPageKeys");
        Object[] objArr = {Integer.valueOf(i), hashSet, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7299a9c12d01b036eebdf33a6bf4b4d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7299a9c12d01b036eebdf33a6bf4b4d5");
            return;
        }
        this.c = hashSet;
        this.g = hashMap;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(@Nullable RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f3a689a7292faf6c48916d6aa5b497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f3a689a7292faf6c48916d6aa5b497");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        for (Number number : this.c) {
            writableNativeArray.pushInt(number.intValue());
        }
        for (Map.Entry<String, Integer> entry : this.g.entrySet()) {
            writableNativeArray2.pushString(entry.getKey());
        }
        writableNativeMap.putArray("loadedPages", (WritableArray) writableNativeArray);
        writableNativeMap.putArray("loadedPageKeys", (WritableArray) writableNativeArray2);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(e(), "onLoadedPagesChanged", writableNativeMap);
        }
    }
}
