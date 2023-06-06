package com.dianping.gcmrnmodule.managers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.gcmrnmodule.MRNAgent;
import com.dianping.gcmrnmodule.fragments.MRNModuleFragment;
import com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.extensions.common.CommonBgMaskFrameLayout;
import com.dianping.shield.component.extensions.gridsection.GridSectionItem;
import com.dianping.shield.component.extensions.gridsection.SimpleGridView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.components.scrolltab.PageComposeInterface;
import com.dianping.shield.config.HornFallbackSwitch;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicTabChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem;
import com.dianping.shield.feature.PositionInfoInterface;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ar;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleEventsManager.NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001d\b\u0007\u0018\u0000 M2\u00020\u0001:\u0006MNOPQRB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u0000H\u0002J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0018\u00010\tR\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J$\u0010!\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\fH\u0002J\u001c\u0010#\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J8\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002JV\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00105\u001a\u0002062\u0006\u0010\"\u001a\u00020\fH\u0002J\u001a\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010,H\u0002J\b\u00109\u001a\u00020\u000eH\u0016J\u0014\u0010:\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u0000H\u0002J\u001a\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u001c\u0010=\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0002J\u001c\u0010?\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010@\u001a\u00020\u0006H\u0002J\u001c\u0010A\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0002J\u0012\u0010B\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010C\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010D\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010E\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010F\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0002J\u001c\u0010G\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0014\u0010H\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u0000H\u0002J\u001c\u0010I\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001c\u0010J\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001c\u0010K\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001c\u0010L\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\bj\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0018\u00010\tR\u00020\u0000`\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\bj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "currViewTag", "", "listenerMap", "Ljava/util/HashMap;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$Listener;", "Lkotlin/collections/HashMap;", "moduleScrollCompensation", "", "reachStatusMap", "", "Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ReachStatus;", "addScrollListener", "", "scrollParam", "Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ScrollParam;", "cleanScrollListener", "listener", "host", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "emitEvent", "key", "value", "Lcom/facebook/react/bridge/WritableMap;", "findVisibleItems", "param", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "findVisibleItemsCommon", "inPage", "findVisibleItemsInPage", "findVisibleItemsInfo", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "feature", "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "completelyVisible", "moduleAgent", "Lcom/dianping/agentsdk/agent/HoloAgent;", "genVisibleObjectInfo", "agent", "pos", "childIndexInGrid", Constants.EventType.VIEW, "Landroid/view/View;", "firstCompletePos", "lastCompletePos", "containerXY", "", "getModuleLastPos", "firstPos", "getName", "scrollCompensation", "scrollTo", "type", "scrollToBottomPosition", "moduleHeight", "scrollToFunction", "offset", "scrollToMiddlePosition", "scrollToModule", "scrollToPosition", "scrollToRow", "scrollToSection", "scrollToSpecificPosition", "scrollToTop", "scrollToTopPosition", "selectTab", "setAnchor", "simulateDragRefresh", "startScroll", "Companion", "Listener", "ModulePosition", "ReachStatus", "ScrollParam", "ScrollStatus", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleEventsManager extends ReactContextBaseJavaModule {
    @NotNull
    public static final String NAME = "MRNModuleEventsManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int currViewTag;
    private final HashMap<Integer, b> listenerMap;
    private final HashMap<Integer, Boolean> moduleScrollCompensation;
    private final HashMap<String, d> reachStatusMap;
    public static final a Companion = new a(null);
    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$Companion;", "", "()V", "NAME", "", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRNModuleEventsManager(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        kotlin.jvm.internal.h.b(reactApplicationContext, "reactContext");
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3d81dafe02accdaaee645b21f660c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3d81dafe02accdaaee645b21f660c3");
            return;
        }
        this.listenerMap = new HashMap<>();
        this.moduleScrollCompensation = new HashMap<>();
        this.reachStatusMap = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$Listener;", "", "(Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager;)V", "onContentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "getOnContentOffsetListener", "()Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "setOnContentOffsetListener", "(Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;)V", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "getOnLayoutChangeListener", "()Landroid/view/View$OnLayoutChangeListener;", "setOnLayoutChangeListener", "(Landroid/view/View$OnLayoutChangeListener;)V", "onScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "getOnScrollListener", "()Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "setOnScrollListener", "(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class b {
        @Nullable
        RecyclerView.k a;
        @Nullable
        View.OnLayoutChangeListener b;
        @Nullable
        ContentOffsetListener c;

        public b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ScrollParam;", "", "(Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager;)V", DMKeys.KEY_SHARE_INFO_ANIMATED, "", "getAnimated", "()Z", "setAnimated", "(Z)V", DMKeys.KEY_HOVER_AUTO_OFFSET, "getAutoOffset", "setAutoOffset", "bottomOffset", "", "getBottomOffset", "()I", "setBottomOffset", "(I)V", "host", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getHost", "()Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "setHost", "(Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;)V", "modulePosition", "Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ModulePosition;", "getModulePosition", "()Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ModulePosition;", "setModulePosition", "(Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ModulePosition;)V", "needScroll", "getNeedScroll", "setNeedScroll", "pageHeight", "getPageHeight", "setPageHeight", "row", "getRow", "setRow", "scrollPosition", "getScrollPosition", "setScrollPosition", "section", "getSection", "setSection", "tag", "getTag", "setTag", "topOffset", "getTopOffset", "setTopOffset", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class e {
        public static ChangeQuickRedirect a;
        @Nullable
        com.dianping.gcmrnmodule.hostwrapper.a b;
        int d;
        int e;
        int f;
        int g;
        int h;
        boolean i;
        boolean j;
        int k;
        int l;
        @NotNull
        String c = "";
        boolean m = true;
        @NotNull
        c n = c.Middle;

        public e() {
        }

        public final void a(@NotNull c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c567b8dbf721abfe557b21c4d6f2c46f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c567b8dbf721abfe557b21c4d6f2c46f");
                return;
            }
            kotlin.jvm.internal.h.b(cVar, "<set-?>");
            this.n = cVar;
        }
    }

    @ReactMethod
    public final void scrollToRow(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ec9a8c18384be157d0bf691ca9839d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ec9a8c18384be157d0bf691ca9839d");
        } else {
            scrollTo("row", readableMap);
        }
    }

    @ReactMethod
    public final void scrollToSection(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c44a679d2ca31d50c8586f2552ce5d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c44a679d2ca31d50c8586f2552ce5d0");
        } else {
            scrollTo("section", readableMap);
        }
    }

    @ReactMethod
    public final void scrollToModule(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e55999a13bf53b6630f6b162acc9ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e55999a13bf53b6630f6b162acc9ec");
        } else {
            scrollTo(ShowLogJsHandler.PARAM_NAME_MODULE, readableMap);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class m implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;

        public m(ReadableMap readableMap) {
            this.b = readableMap;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67496de6ad0a40b239bda77594b1de5b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67496de6ad0a40b239bda77594b1de5b");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if (!(d instanceof com.dianping.gcmrnmodule.protocols.i) || (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) == null) {
                return;
            }
            int a2 = com.dianping.util.j.a(hostInterface.getHostContext(), com.dianping.gcmrnmodule.utils.e.b.a(this.b, "position", 0));
            boolean a3 = com.dianping.gcmrnmodule.utils.e.b.a(this.b, DMKeys.KEY_SHARE_INFO_ANIMATED, false);
            ShieldGlobalFeatureInterface feature = hostInterface.getFeature();
            if (feature != null) {
                AgentScrollerParams smooth = AgentScrollerParams.toPage().setNeedAutoOffset(false).setOffset(-a2).setSmooth(a3);
                kotlin.jvm.internal.h.a((Object) smooth, "AgentScrollerParams.toPa…tion).setSmooth(animated)");
                feature.scrollToNode(smooth);
            }
        }
    }

    @ReactMethod
    public final void scrollToPosition(@Nullable ReadableMap readableMap) {
        ReactApplicationContext reactApplicationContext;
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b34ba7b74aba5e92b3ed12f5bc9232a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b34ba7b74aba5e92b3ed12f5bc9232a6");
        } else if (readableMap == null || (reactApplicationContext = getReactApplicationContext()) == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new m(readableMap));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ReachStatus;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "REACH", "NOT_REACH", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    enum d {
        UNKNOWN,
        REACH,
        NOT_REACH;
        
        public static ChangeQuickRedirect a;

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (d) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "788bb54754c15e0031397885f9883f92", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "788bb54754c15e0031397885f9883f92") : Enum.valueOf(d.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (d[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eb5710a308068fdd56a1c8a20dc79fd", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eb5710a308068fdd56a1c8a20dc79fd") : values().clone());
        }

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b81cb56542ff964a92ed675c2fc8dc4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b81cb56542ff964a92ed675c2fc8dc4");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$setAnchor$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class p implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;

        public p(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            final com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2c9412cba76d4476b71722bb4cf4c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2c9412cba76d4476b71722bb4cf4c8");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if (!(d instanceof com.dianping.gcmrnmodule.protocols.i) || (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) == null) {
                return;
            }
            final int a2 = com.dianping.util.j.a(hostInterface.getHostContext(), com.dianping.gcmrnmodule.utils.e.b.a(this.b, "position", 0));
            final String a3 = com.dianping.gcmrnmodule.utils.e.b.a(this.b, "identifier", "");
            final ab<?> pageContainer = hostInterface.getPageContainer();
            if (pageContainer instanceof com.dianping.agentsdk.pagecontainer.d) {
                ((com.dianping.agentsdk.pagecontainer.d) pageContainer).addScrollListener(new RecyclerView.k() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleEventsManager.p.1
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
                        Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e77ce3286c86c4ecd8c32d67e29fb39", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e77ce3286c86c4ecd8c32d67e29fb39");
                        } else if (ab.this instanceof PositionInfoInterface) {
                            int scrollY = ((PositionInfoInterface) ab.this).getScrollY();
                            WritableNativeMap writableNativeMap = new WritableNativeMap();
                            if ((this.c.reachStatusMap.get(hostInterface.e) == null || ((d) this.c.reachStatusMap.get(hostInterface.e)) == d.NOT_REACH) && scrollY >= a2) {
                                this.c.reachStatusMap.put(hostInterface.e, d.REACH);
                                writableNativeMap.putBoolean("reach", true);
                                MRNModuleEventsManager mRNModuleEventsManager = this.c;
                                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                                writableNativeMap2.putString("identifier", a3);
                                writableNativeMap2.putMap("data", (WritableMap) writableNativeMap);
                                mRNModuleEventsManager.emitEvent("setAnchor", writableNativeMap2);
                            }
                            if ((this.c.reachStatusMap.get(hostInterface.e) == null || ((d) this.c.reachStatusMap.get(hostInterface.e)) == d.REACH) && scrollY < a2) {
                                this.c.reachStatusMap.put(hostInterface.e, d.NOT_REACH);
                                writableNativeMap.putBoolean("reach", false);
                                MRNModuleEventsManager mRNModuleEventsManager2 = this.c;
                                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                                writableNativeMap3.putString("identifier", a3);
                                writableNativeMap3.putMap("data", (WritableMap) writableNativeMap);
                                mRNModuleEventsManager2.emitEvent("setAnchor", writableNativeMap3);
                            }
                        }
                    }
                });
            }
        }
    }

    @ReactMethod
    public final void setAnchor(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        ReactApplicationContext reactApplicationContext;
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48946b180d771891d42f25ccb472a32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48946b180d771891d42f25ccb472a32d");
        } else if (readableMap == null || (reactApplicationContext = getReactApplicationContext()) == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new p(readableMap, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEvent(String str, WritableMap writableMap) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ce3c8a0959fb2c84348cb4085266af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ce3c8a0959fb2c84348cb4085266af6");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit(str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ScrollStatus;", "", "(Ljava/lang/String;I)V", "AUTO", "TOP", "MIDDLE", "BOTTOM", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public enum f {
        AUTO,
        TOP,
        MIDDLE,
        BOTTOM;
        
        public static ChangeQuickRedirect a;

        public static f valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (f) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbee8b239e0fdade55dc617b59a7f2f7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbee8b239e0fdade55dc617b59a7f2f7") : Enum.valueOf(f.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static f[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (f[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e99f46654ab57710ffeded0f979d245f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e99f46654ab57710ffeded0f979d245f") : values().clone());
        }

        f() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d4b6148ee28023ce8a7ba57aa767a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d4b6148ee28023ce8a7ba57aa767a0");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleEventsManager$ModulePosition;", "", "(Ljava/lang/String;I)V", "Top", "Middle", "BOTTOM", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public enum c {
        Top,
        Middle,
        BOTTOM;
        
        public static ChangeQuickRedirect a;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (c) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe15887261f5f869d45b6b537ab13361", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe15887261f5f869d45b6b537ab13361") : Enum.valueOf(c.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (c[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "048ae5cd81eff3246b998e94c65507dc", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "048ae5cd81eff3246b998e94c65507dc") : values().clone());
        }

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d338b784a0b26092f0ea77686de2df61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d338b784a0b26092f0ea77686de2df61");
            }
        }
    }

    private final void scrollTo(String str, ReadableMap readableMap) {
        ReactApplicationContext reactApplicationContext;
        UIManagerModule uIManagerModule;
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0157fd06904b735ea675758deaef4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0157fd06904b735ea675758deaef4da");
            return;
        }
        boolean isSwitchOn = HornFallbackSwitch.getInstance().isSwitchOn("scrollTo");
        if (readableMap == null || (reactApplicationContext = getReactApplicationContext()) == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
            return;
        }
        uIManagerModule.addUIBlock(new l(readableMap, this, str, isSwitchOn));
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$scrollTo$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class l implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public l(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager, String str, boolean z) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
            this.d = str;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
        /* JADX WARN: Type inference failed for: r10v9, types: [android.view.ViewGroup] */
        @Override // com.facebook.react.uimanager.ar
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void execute(com.facebook.react.uimanager.NativeViewHierarchyManager r24) {
            /*
                Method dump skipped, instructions count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.managers.MRNModuleEventsManager.l.execute(com.facebook.react.uimanager.NativeViewHierarchyManager):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollCompensation(e eVar) {
        com.dianping.gcmrnmodule.hostwrapper.a aVar;
        ShieldGlobalFeatureInterface feature;
        com.dianping.gcmrnmodule.hostwrapper.a aVar2;
        HoloAgent holoAgent;
        Integer num;
        Integer num2;
        int i2 = 0;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b5b87489b64968bacacd2be50ceebe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b5b87489b64968bacacd2be50ceebe5");
        } else if (this.currViewTag != eVar.l || (aVar = eVar.b) == null || (feature = aVar.getFeature()) == null || (aVar2 = eVar.b) == null || (holoAgent = aVar2.getHoloAgent()) == null) {
        } else {
            NodeInfo row = NodeInfo.row(holoAgent, eVar.d, eVar.e);
            kotlin.jvm.internal.h.a((Object) row, "NodeInfo.row\n           …section, scrollParam.row)");
            Pair<Integer, Integer> viewTopBottom = feature.getViewTopBottom(feature.getNodeGlobalPosition(row));
            int intValue = (viewTopBottom == null || (num2 = (Integer) viewTopBottom.first) == null) ? 0 : num2.intValue();
            if (viewTopBottom != null && (num = (Integer) viewTopBottom.second) != null) {
                i2 = num.intValue();
            }
            int i3 = i2 - intValue;
            if (i3 > 0) {
                this.moduleScrollCompensation.put(Integer.valueOf(eVar.l), Boolean.FALSE);
                scrollToSpecificPosition(eVar, i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScroll(e eVar, int i2) {
        Object[] objArr = {eVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc42a57e335a104e0bc533ec3a94b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc42a57e335a104e0bc533ec3a94b99");
        } else {
            scrollToSpecificPosition(eVar, i2);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$addScrollListener$onScrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class i extends RecyclerView.k {
        public static ChangeQuickRedirect a;

        public i() {
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02bead8b444c001afb596fca28a865c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02bead8b444c001afb596fca28a865c7");
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                for (Map.Entry entry : MRNModuleEventsManager.this.moduleScrollCompensation.entrySet()) {
                    MRNModuleEventsManager.this.moduleScrollCompensation.put(entry.getKey(), Boolean.FALSE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addScrollListener(e eVar) {
        View recyclerViewRootView;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f3aa7b462801affebc905e4d468c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f3aa7b462801affebc905e4d468c1c");
        } else if (this.listenerMap.containsKey(Integer.valueOf(eVar.l))) {
        } else {
            i iVar = new i();
            h hVar = new h(eVar);
            g gVar = new g(eVar);
            com.dianping.gcmrnmodule.hostwrapper.a aVar = eVar.b;
            Fragment hostFragment = aVar != null ? aVar.getHostFragment() : null;
            if (!(hostFragment instanceof MRNModuleFragment)) {
                hostFragment = null;
            }
            MRNModuleFragment mRNModuleFragment = (MRNModuleFragment) hostFragment;
            CommonPageContainer commonPageContainer = mRNModuleFragment != null ? mRNModuleFragment.getCommonPageContainer() : null;
            if (commonPageContainer != null && (recyclerViewRootView = commonPageContainer.getRecyclerViewRootView()) != null) {
                recyclerViewRootView.addOnLayoutChangeListener(hVar);
            }
            if (commonPageContainer != null) {
                commonPageContainer.addContentOffsetListener(gVar);
            }
            if (commonPageContainer != null) {
                commonPageContainer.addScrollListener(iVar);
            }
            b bVar = new b();
            bVar.c = gVar;
            bVar.b = hVar;
            bVar.a = iVar;
            this.listenerMap.put(Integer.valueOf(eVar.l), bVar);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class h implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ e c;

        public h(e eVar) {
            this.c = eVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f2dfdd7e8bfff6b83a5da3628b03f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f2dfdd7e8bfff6b83a5da3628b03f6");
                return;
            }
            Boolean bool = (Boolean) MRNModuleEventsManager.this.moduleScrollCompensation.get(Integer.valueOf(this.c.l));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            kotlin.jvm.internal.h.a((Object) bool, "moduleScrollCompensation[scrollParam.tag] ?: false");
            if (bool.booleanValue()) {
                MRNModuleEventsManager.this.scrollCompensation(this.c);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$addScrollListener$onContentOffsetListener$1", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class g implements ContentOffsetListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ e c;

        public g(e eVar) {
            this.c = eVar;
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5416bf9759b5817105ec2648e19cf4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5416bf9759b5817105ec2648e19cf4");
                return;
            }
            Boolean bool = (Boolean) MRNModuleEventsManager.this.moduleScrollCompensation.get(Integer.valueOf(this.c.l));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            kotlin.jvm.internal.h.a((Object) bool, "moduleScrollCompensation[scrollParam.tag] ?: false");
            if (bool.booleanValue()) {
                MRNModuleEventsManager.this.scrollCompensation(this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanScrollListener(b bVar, com.dianping.gcmrnmodule.hostwrapper.a aVar) {
        CommonPageContainer commonPageContainer;
        CommonPageContainer commonPageContainer2;
        View recyclerViewRootView;
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26fe361758fdb08bedf10acd07c3b653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26fe361758fdb08bedf10acd07c3b653");
        } else if (bVar != null) {
            Fragment hostFragment = aVar.getHostFragment();
            if (!(hostFragment instanceof MRNModuleFragment)) {
                hostFragment = null;
            }
            MRNModuleFragment mRNModuleFragment = (MRNModuleFragment) hostFragment;
            if (mRNModuleFragment != null && (commonPageContainer2 = mRNModuleFragment.getCommonPageContainer()) != null && (recyclerViewRootView = commonPageContainer2.getRecyclerViewRootView()) != null) {
                recyclerViewRootView.removeOnLayoutChangeListener(bVar.b);
            }
            bVar.b = null;
            ab<?> pageContainer = aVar.getPageContainer();
            if (!(pageContainer instanceof com.dianping.agentsdk.pagecontainer.d)) {
                pageContainer = null;
            }
            com.dianping.agentsdk.pagecontainer.d dVar = (com.dianping.agentsdk.pagecontainer.d) pageContainer;
            if (dVar != null) {
                dVar.removeScrollListener(bVar.a);
            }
            bVar.a = null;
            Fragment hostFragment2 = aVar.getHostFragment();
            if (!(hostFragment2 instanceof MRNModuleFragment)) {
                hostFragment2 = null;
            }
            MRNModuleFragment mRNModuleFragment2 = (MRNModuleFragment) hostFragment2;
            if (mRNModuleFragment2 != null && (commonPageContainer = mRNModuleFragment2.getCommonPageContainer()) != null) {
                commonPageContainer.removeContentOffsetListener(bVar.c);
            }
            bVar.c = null;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$selectTab$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class o implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;
        public final /* synthetic */ ReadableMap d;

        public o(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager, ReadableMap readableMap2) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
            this.d = readableMap2;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339178b5362123ee496164a9864f1828", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339178b5362123ee496164a9864f1828");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if ((d instanceof com.dianping.gcmrnmodule.protocols.i) && (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) != null && this.d.hasKey("index")) {
                int i = this.d.getInt("index");
                HoloAgent holoAgent = hostInterface.getHoloAgent();
                if (holoAgent instanceof DynamicTabChassisInterface) {
                    ((DynamicTabChassisInterface) holoAgent).selectTab(i, com.dianping.picassomodule.widget.tab.g.UPDATE_PROPS);
                }
            }
        }
    }

    @ReactMethod
    public final void selectTab(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eedb98d9e5f8da139ed17c72bc56a14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eedb98d9e5f8da139ed17c72bc56a14c");
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new o(readableMap, this, readableMap));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$scrollToTop$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class n implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;
        public final /* synthetic */ ReadableMap d;

        public n(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager, ReadableMap readableMap2) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
            this.d = readableMap2;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            ShieldGlobalFeatureInterface currentChildFeature;
            ShieldGlobalFeatureInterface feature;
            ShieldGlobalFeatureInterface currentChildFeature2;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05adc29b78421d2ab2412e71d2594b92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05adc29b78421d2ab2412e71d2594b92");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if ((d instanceof com.dianping.gcmrnmodule.protocols.i) && (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) != null && this.d.hasKey("type")) {
                String string = this.d.getString("type");
                boolean z = this.d.getBoolean(DMKeys.KEY_SHARE_INFO_ANIMATED);
                HoloAgent holoAgent = hostInterface.getHoloAgent();
                if (string == null) {
                    return;
                }
                int hashCode = string.hashCode();
                if (hashCode == -1552090295) {
                    if (string.equals("moduleTop")) {
                        if (!(holoAgent instanceof PageComposeInterface)) {
                            holoAgent = null;
                        }
                        PageComposeInterface pageComposeInterface = (PageComposeInterface) holoAgent;
                        if (pageComposeInterface == null || (currentChildFeature = pageComposeInterface.getCurrentChildFeature()) == null) {
                            return;
                        }
                        AgentScrollerParams smooth = AgentScrollerParams.toPage().setNeedAutoOffset(true).setOffset(0).setSmooth(z);
                        kotlin.jvm.internal.h.a((Object) smooth, "AgentScrollerParams.toPa…et(0).setSmooth(animated)");
                        currentChildFeature.scrollToNode(smooth);
                    }
                } else if (hashCode == -803559354 && string.equals("pageTop")) {
                    PageComposeInterface pageComposeInterface2 = holoAgent instanceof PageComposeInterface ? holoAgent : null;
                    if (pageComposeInterface2 != null && (currentChildFeature2 = pageComposeInterface2.getCurrentChildFeature()) != null) {
                        AgentScrollerParams smooth2 = AgentScrollerParams.toPage().setNeedAutoOffset(true).setOffset(0).setSmooth(false);
                        kotlin.jvm.internal.h.a((Object) smooth2, "AgentScrollerParams.toPa…ffset(0).setSmooth(false)");
                        currentChildFeature2.scrollToNode(smooth2);
                    }
                    if (holoAgent == null || (feature = holoAgent.getFeature()) == null) {
                        return;
                    }
                    AgentScrollerParams smooth3 = AgentScrollerParams.toPage().setNeedAutoOffset(true).setOffset(0).setSmooth(z);
                    kotlin.jvm.internal.h.a((Object) smooth3, "AgentScrollerParams.toPa…et(0).setSmooth(animated)");
                    feature.scrollToNode(smooth3);
                }
            }
        }
    }

    @ReactMethod
    public final void scrollToTop(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c781dc936c2894d2a0b0905fb59a3cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c781dc936c2894d2a0b0905fb59a3cd");
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new n(readableMap, this, readableMap));
        }
    }

    @ReactMethod
    public final void findVisibleItems(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "915e87d470666a552206019baf88fcb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "915e87d470666a552206019baf88fcb3");
        } else if (HornFallbackSwitch.getInstance().isSwitchOn("findVisibleItems")) {
            findVisibleItemsCommon(readableMap, promise, false);
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new j(readableMap, this, readableMap, promise));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$findVisibleItems$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class j implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ Promise e;

        public j(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager, ReadableMap readableMap2, Promise promise) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
            this.d = readableMap2;
            this.e = promise;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01ee A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0205 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0253 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x026a A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x013a A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0172 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0189 A[Catch: Exception -> 0x02b3, TryCatch #0 {Exception -> 0x02b3, blocks: (B:64:0x00e6, B:66:0x00ec, B:69:0x00f5, B:71:0x00fb, B:74:0x0103, B:77:0x010b, B:79:0x0111, B:85:0x011f, B:87:0x013a, B:88:0x013d, B:90:0x0172, B:92:0x017a, B:94:0x0189, B:96:0x0191, B:98:0x019f, B:100:0x01a5, B:102:0x01ab, B:104:0x01d0, B:106:0x01d6, B:108:0x01de, B:110:0x01ee, B:112:0x01f6, B:114:0x0205, B:116:0x020d, B:118:0x0253, B:120:0x025b, B:122:0x026a, B:124:0x0272, B:125:0x028b, B:127:0x028f), top: B:139:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x018f  */
        /* JADX WARN: Type inference failed for: r0v5, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, org.json.JSONArray] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
        @Override // com.facebook.react.uimanager.ar
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void execute(com.facebook.react.uimanager.NativeViewHierarchyManager r21) {
            /*
                Method dump skipped, instructions count: 733
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.managers.MRNModuleEventsManager.j.execute(com.facebook.react.uimanager.NativeViewHierarchyManager):void");
        }
    }

    @ReactMethod
    public final void findVisibleItemsInPage(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e0358ded01cbced5f013de2c1bc341e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e0358ded01cbced5f013de2c1bc341e");
        } else {
            findVisibleItemsCommon(readableMap, promise, true);
        }
    }

    private final void findVisibleItemsCommon(ReadableMap readableMap, Promise promise, boolean z) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370107ca2b09607886306441663f2f7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370107ca2b09607886306441663f2f7b");
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new k(readableMap, this, readableMap, z, promise));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleEventsManager$findVisibleItemsCommon$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class k implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleEventsManager c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ Promise f;

        public k(ReadableMap readableMap, MRNModuleEventsManager mRNModuleEventsManager, ReadableMap readableMap2, boolean z, Promise promise) {
            this.b = readableMap;
            this.c = mRNModuleEventsManager;
            this.d = readableMap2;
            this.e = z;
            this.f = promise;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            ShieldGlobalFeatureInterface feature;
            ShieldGlobalFeatureInterface shieldGlobalFeatureInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e774870c120662a8f1698108f94bcd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e774870c120662a8f1698108f94bcd");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if (!(d instanceof com.dianping.gcmrnmodule.protocols.i) || (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) == null) {
                return;
            }
            try {
                boolean z = this.d.hasKey("completelyVisible") ? this.d.getBoolean("completelyVisible") : false;
                if (this.e) {
                    DynamicHostInterface dynamicHost = hostInterface.getDynamicHost();
                    if (dynamicHost != null) {
                        feature = dynamicHost.getFeature();
                        shieldGlobalFeatureInterface = feature;
                    }
                    shieldGlobalFeatureInterface = null;
                } else {
                    HoloAgent holoAgent = hostInterface.getHoloAgent();
                    if (holoAgent != null) {
                        feature = holoAgent.getFeature();
                        shieldGlobalFeatureInterface = feature;
                    }
                    shieldGlobalFeatureInterface = null;
                }
                JSONObject findVisibleItemsInfo = this.c.findVisibleItemsInfo(hostInterface.getHostContext(), shieldGlobalFeatureInterface, z, this.e, hostInterface.getHoloAgent());
                if (findVisibleItemsInfo != null) {
                    Promise promise = this.f;
                    if (promise != null) {
                        promise.resolve(com.meituan.android.mrn.utils.g.a(findVisibleItemsInfo));
                        r rVar = r.a;
                        return;
                    }
                    return;
                }
                String str = this.e ? "findVisibleItemsInPage" : "findVisibleItems";
                Promise promise2 = this.f;
                if (promise2 != null) {
                    promise2.reject("error", str + ", result is null.");
                    r rVar2 = r.a;
                }
            } catch (Exception e) {
                Promise promise3 = this.f;
                if (promise3 != null) {
                    promise3.reject("error", e.getMessage());
                }
                e.printStackTrace();
                r rVar3 = r.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    public final JSONObject findVisibleItemsInfo(Context context, ShieldGlobalFeatureInterface shieldGlobalFeatureInterface, boolean z, boolean z2, HoloAgent holoAgent) {
        boolean z3;
        int i2;
        int i3;
        int moduleLastPos;
        int i4;
        int i5;
        int[] iArr;
        JSONArray jSONArray;
        JSONObject jSONObject;
        boolean z4 = false;
        Object[] objArr = {context, shieldGlobalFeatureInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), holoAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87d415a4a51c543ce04585a60bd9874b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87d415a4a51c543ce04585a60bd9874b");
        }
        int findFirstVisibleItemPosition = shieldGlobalFeatureInterface != null ? shieldGlobalFeatureInterface.findFirstVisibleItemPosition(z) : -1;
        int findLastVisibleItemPosition = shieldGlobalFeatureInterface != null ? shieldGlobalFeatureInterface.findLastVisibleItemPosition(z) : -1;
        if (shieldGlobalFeatureInterface != null) {
            z3 = true;
            i2 = shieldGlobalFeatureInterface.findFirstVisibleItemPosition(true);
        } else {
            z3 = true;
            i2 = -1;
        }
        int findLastVisibleItemPosition2 = shieldGlobalFeatureInterface != null ? shieldGlobalFeatureInterface.findLastVisibleItemPosition(z3) : -1;
        if (z2) {
            i3 = z ? i2 : findFirstVisibleItemPosition;
            moduleLastPos = z ? findLastVisibleItemPosition2 : findLastVisibleItemPosition;
        } else {
            if (shieldGlobalFeatureInterface != null) {
                NodeInfo agent = NodeInfo.agent(holoAgent);
                kotlin.jvm.internal.h.a((Object) agent, "NodeInfo.agent(moduleAgent)");
                i3 = shieldGlobalFeatureInterface.getNodeGlobalPosition(agent);
            } else {
                i3 = -1;
            }
            moduleLastPos = getModuleLastPos(i3, holoAgent);
        }
        int max = Math.max(z ? i2 : findFirstVisibleItemPosition, i3);
        int min = Math.min(z ? findLastVisibleItemPosition2 : findLastVisibleItemPosition, moduleLastPos);
        JSONObject jSONObject2 = 0;
        if (findFirstVisibleItemPosition != -1 && findLastVisibleItemPosition != -1 && i3 != -1 && min >= max) {
            JSONArray jSONArray2 = new JSONArray();
            int[] iArr2 = new int[2];
            FrameLayout recyclerViewLayout = shieldGlobalFeatureInterface != null ? shieldGlobalFeatureInterface.getRecyclerViewLayout() : null;
            if (recyclerViewLayout != null) {
                recyclerViewLayout.getLocationOnScreen(iArr2);
            }
            int i6 = min + 1;
            while (max < i6) {
                NodeInfo agentInfoByGlobalPosition = shieldGlobalFeatureInterface != null ? shieldGlobalFeatureInterface.getAgentInfoByGlobalPosition(max) : jSONObject2;
                CommonBgMaskFrameLayout findViewAtPosition$default = shieldGlobalFeatureInterface != null ? LayoutPositionFuctionInterface.DefaultImpls.findViewAtPosition$default(shieldGlobalFeatureInterface, max, z4, 2, jSONObject2) : jSONObject2;
                if (findViewAtPosition$default instanceof CommonBgMaskFrameLayout) {
                    CommonBgMaskFrameLayout commonBgMaskFrameLayout = findViewAtPosition$default;
                    if (commonBgMaskFrameLayout.getContainerView() instanceof SimpleGridView) {
                        View containerView = commonBgMaskFrameLayout.getContainerView();
                        if (containerView == null) {
                            throw new kotlin.o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.SimpleGridView");
                        }
                        SimpleGridView simpleGridView = (SimpleGridView) containerView;
                        int childCount = simpleGridView.getChildCount();
                        int i7 = 0;
                        AgentInterface agentInterface = jSONObject2;
                        while (i7 < childCount) {
                            View childAt = simpleGridView.getChildAt(i7);
                            AgentInterface agent2 = agentInfoByGlobalPosition != null ? agentInfoByGlobalPosition.getAgent() : agentInterface;
                            if (!(agent2 instanceof HoloAgent)) {
                                agent2 = agentInterface;
                            }
                            int i8 = i7;
                            int[] iArr3 = iArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            jSONArray3.put(genVisibleObjectInfo((HoloAgent) agent2, max, i8, childAt, i2, findLastVisibleItemPosition2, context, iArr3, z2));
                            i7 = i8 + 1;
                            jSONArray2 = jSONArray3;
                            max = max;
                            childCount = childCount;
                            simpleGridView = simpleGridView;
                            i6 = i6;
                            iArr2 = iArr3;
                            agentInterface = agentInterface;
                        }
                        i4 = max;
                        i5 = i6;
                        iArr = iArr2;
                        jSONArray = jSONArray2;
                        jSONObject = agentInterface;
                        max = i4 + 1;
                        jSONArray2 = jSONArray;
                        i6 = i5;
                        iArr2 = iArr;
                        jSONObject2 = jSONObject;
                        z4 = false;
                    }
                }
                i4 = max;
                i5 = i6;
                iArr = iArr2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject2;
                AgentInterface agent3 = agentInfoByGlobalPosition != null ? agentInfoByGlobalPosition.getAgent() : jSONObject;
                if (!(agent3 instanceof HoloAgent)) {
                    agent3 = jSONObject;
                }
                jSONArray.put(genVisibleObjectInfo((HoloAgent) agent3, i4, -1, findViewAtPosition$default, i2, findLastVisibleItemPosition2, context, iArr, z2));
                max = i4 + 1;
                jSONArray2 = jSONArray;
                i6 = i5;
                iArr2 = iArr;
                jSONObject2 = jSONObject;
                z4 = false;
            }
            jSONObject2 = new JSONObject();
            jSONObject2.put("visibleItems", jSONArray2);
        }
        return jSONObject2;
    }

    private final JSONObject genVisibleObjectInfo(HoloAgent holoAgent, int i2, int i3, View view, int i4, int i5, Context context, int[] iArr, boolean z) {
        List a2;
        Integer num;
        ShieldGlobalFeatureInterface feature;
        ArrayList<SectionItem> arrayList;
        ShieldSectionCellItem sectionCellItem;
        ShieldGlobalFeatureInterface feature2;
        HoloAgent holoAgent2 = holoAgent;
        Object[] objArr = {holoAgent2, Integer.valueOf(i2), Integer.valueOf(i3), view, Integer.valueOf(i4), Integer.valueOf(i5), context, iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f70ab3790dc1104531622f0eb9122b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f70ab3790dc1104531622f0eb9122b0");
        }
        NodeInfo agentInfoByGlobalPosition = (holoAgent2 == null || (feature2 = holoAgent.getFeature()) == null) ? null : feature2.getAgentInfoByGlobalPosition(i2);
        int section = agentInfoByGlobalPosition != null ? agentInfoByGlobalPosition.getSection() : -1;
        int row = agentInfoByGlobalPosition != null ? agentInfoByGlobalPosition.getRow() : -3;
        if (i3 >= 0) {
            if (holoAgent2 == null || (sectionCellItem = holoAgent.getSectionCellItem()) == null || (arrayList = sectionCellItem.sectionItems) == null) {
                arrayList = new ArrayList<>();
            }
            if (section >= 0 && section < arrayList.size() && (arrayList.get(section) instanceof GridSectionItem)) {
                SectionItem sectionItem = arrayList.get(section);
                if (sectionItem == null) {
                    throw new kotlin.o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.GridSectionItem");
                }
                row = (row * ((GridSectionItem) sectionItem).colCount) + i3;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("completelyVisible", i4 <= i2 && i5 >= i2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("section", section);
        jSONObject2.put("row", row);
        jSONObject.put("indexPathInModule", jSONObject2);
        int[] iArr2 = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Constants.GestureMoveEvent.KEY_X, com.dianping.util.j.b(context, iArr2[0]));
        jSONObject3.put(Constants.GestureMoveEvent.KEY_Y, com.dianping.util.j.b(context, iArr2[1]));
        jSONObject3.put("width", com.dianping.util.j.b(context, view != null ? view.getWidth() : -1.0f));
        jSONObject3.put("height", com.dianping.util.j.b(context, view != null ? view.getHeight() : -1.0f));
        jSONObject.put("frameInWindow", jSONObject3);
        Pair<Integer, Integer> viewTopBottom = (holoAgent2 == null || (feature = holoAgent.getFeature()) == null) ? null : feature.getViewTopBottom(i2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(Constants.GestureMoveEvent.KEY_X, com.dianping.util.j.b(context, iArr2[0] - iArr[0]));
        jSONObject4.put(Constants.GestureMoveEvent.KEY_Y, com.dianping.util.j.b(context, (viewTopBottom == null || (num = (Integer) viewTopBottom.first) == null) ? -1.0f : num.intValue()));
        jSONObject4.put("width", com.dianping.util.j.b(context, view != null ? view.getWidth() : -1.0f));
        jSONObject4.put("height", com.dianping.util.j.b(context, view != null ? view.getHeight() : -1.0f));
        jSONObject.put("frameInPageContent", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(Constants.GestureMoveEvent.KEY_X, com.dianping.util.j.b(context, iArr2[0] - iArr[0]));
        jSONObject5.put(Constants.GestureMoveEvent.KEY_Y, com.dianping.util.j.b(context, iArr2[1] - iArr[1]));
        jSONObject5.put("width", com.dianping.util.j.b(context, view != null ? view.getWidth() : -1.0f));
        jSONObject5.put("height", com.dianping.util.j.b(context, view != null ? view.getHeight() : -1.0f));
        jSONObject.put("frameInPage", jSONObject5);
        if (z) {
            if (!(holoAgent2 instanceof MRNAgent)) {
                holoAgent2 = null;
            }
            MRNAgent mRNAgent = (MRNAgent) holoAgent2;
            String str = mRNAgent != null ? mRNAgent.hostName : null;
            Object obj = "";
            if (str != null) {
                a2 = kotlin.text.g.a(str, new String[]{"#"}, false, 0);
                obj = (String) a2.get(0);
            }
            jSONObject.put("moduleKey", obj);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getModuleLastPos(int i2, HoloAgent holoAgent) {
        ArrayList<SectionItem> arrayList;
        int size;
        ShieldSectionCellItem sectionCellItem;
        Object[] objArr = {Integer.valueOf(i2), holoAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e9ce3361be5f10c32df5c7a0aa867a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e9ce3361be5f10c32df5c7a0aa867a")).intValue();
        }
        if (holoAgent == null || (sectionCellItem = holoAgent.getSectionCellItem()) == null || (arrayList = sectionCellItem.sectionItems) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<SectionItem> it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            SectionItem next = it.next();
            if (next instanceof StaggeredGridSectionItem) {
                ArrayList<ViewItem> arrayList2 = ((StaggeredGridSectionItem) next).viewItems;
                if (arrayList2 != null) {
                    size = arrayList2.size();
                }
                size = 0;
            } else if (next instanceof GridSectionItem) {
                GridSectionItem gridSectionItem = (GridSectionItem) next;
                if (gridSectionItem.colCount > 0) {
                    size = (int) Math.ceil(gridSectionItem.getViewItems().size() / gridSectionItem.colCount);
                }
                size = 0;
            } else {
                ArrayList<RowItem> arrayList3 = next.rowItems;
                if (arrayList3 != null) {
                    size = arrayList3.size();
                }
                size = 0;
            }
            i3 += size;
            if (next.headerRowItem != null) {
                i3++;
            }
            if (next.footerRowItem != null) {
                i3++;
            }
        }
        return i3 > 0 ? (i2 + i3) - 1 : i2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class q implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;

        public q(ReadableMap readableMap) {
            this.b = readableMap;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9fc97feda0acf4950a5a01ee3acfc20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9fc97feda0acf4950a5a01ee3acfc20");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            if (!(d instanceof com.dianping.gcmrnmodule.protocols.i) || (hostInterface = ((com.dianping.gcmrnmodule.protocols.i) d).getHostInterface()) == null) {
                return;
            }
            ShieldGlobalFeatureInterface feature = hostInterface.getFeature();
            if (feature != null) {
                feature.scrollToPositionWithOffset(0, 0, false);
            }
            a aVar = MRNModuleEventsManager.Companion;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "313f3919a30dad6a58c27de15dcb446c", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "313f3919a30dad6a58c27de15dcb446c") : MRNModuleEventsManager.mainHandler).post(new a(hostInterface));
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* loaded from: classes.dex */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ com.dianping.gcmrnmodule.hostwrapper.a b;

            public a(com.dianping.gcmrnmodule.hostwrapper.a aVar) {
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc32119a40b0829f84d72c0d46be8f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc32119a40b0829f84d72c0d46be8f0");
                    return;
                }
                ShieldGlobalFeatureInterface feature = this.b.getFeature();
                if (feature != null) {
                    feature.simulateDragRefresh();
                }
            }
        }
    }

    @ReactMethod
    public final void simulateDragRefresh(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc111c58a2377eb8fd7ba4c68c8ba85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc111c58a2377eb8fd7ba4c68c8ba85");
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new q(readableMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToFunction(e eVar, int i2) {
        ShieldGlobalFeatureInterface feature;
        com.dianping.gcmrnmodule.hostwrapper.a aVar;
        String hostName;
        AgentInterface findAgent;
        Object[] objArr = {eVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83a504851e8a4aa627b92a6035b385da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83a504851e8a4aa627b92a6035b385da");
            return;
        }
        com.dianping.gcmrnmodule.hostwrapper.a aVar2 = eVar.b;
        if (aVar2 == null || (feature = aVar2.getFeature()) == null || (aVar = eVar.b) == null || (hostName = aVar.getHostName()) == null || (findAgent = feature.findAgent(hostName)) == null) {
            return;
        }
        AgentScrollerParams agentScrollerParams = null;
        String str = eVar.c;
        int hashCode = str.hashCode();
        if (hashCode != -1068784020) {
            if (hashCode != 113114) {
                if (hashCode == 1970241253 && str.equals("section")) {
                    agentScrollerParams = AgentScrollerParams.toSection(findAgent, eVar.d);
                }
            } else if (str.equals("row")) {
                agentScrollerParams = AgentScrollerParams.toRow(findAgent, eVar.d, eVar.e);
            }
        } else if (str.equals(ShowLogJsHandler.PARAM_NAME_MODULE)) {
            agentScrollerParams = AgentScrollerParams.toAgent(findAgent);
        }
        if (!eVar.m || agentScrollerParams == null) {
            return;
        }
        agentScrollerParams.setNeedAutoOffset(eVar.i).setOffset(i2).setSmooth(eVar.j);
        feature.scrollToNode(agentScrollerParams);
    }

    private final void scrollToTopPosition(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d943f4d25088994823a9d085f4fa70ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d943f4d25088994823a9d085f4fa70ec");
        } else {
            scrollToFunction(eVar, eVar.f + 0);
        }
    }

    private final void scrollToMiddlePosition(e eVar, int i2) {
        Object[] objArr = {eVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97ef652860f9eb10e264b8690f5266e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97ef652860f9eb10e264b8690f5266e3");
        } else {
            scrollToFunction(eVar, eVar.h != 0 ? (((eVar.h / 2) - (i2 / 2)) + (eVar.f / 2)) - (eVar.g / 2) : 0);
        }
    }

    private final void scrollToBottomPosition(e eVar, int i2) {
        Object[] objArr = {eVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057707b182c23951494c7409b05982df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057707b182c23951494c7409b05982df");
        } else {
            scrollToFunction(eVar, eVar.h != 0 ? (eVar.h - i2) - eVar.g : 0);
        }
    }

    private final void scrollToSpecificPosition(e eVar, int i2) {
        Object[] objArr = {eVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbdc503253c27a35604d5be0f9ccc126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbdc503253c27a35604d5be0f9ccc126");
            return;
        }
        int i3 = eVar.k;
        if (i3 == f.AUTO.ordinal()) {
            if (eVar.n != c.Top) {
                if (eVar.n == c.BOTTOM) {
                    if (i2 < eVar.h) {
                        scrollToBottomPosition(eVar, i2);
                    } else {
                        scrollToTopPosition(eVar);
                    }
                }
            } else if (i2 < eVar.h) {
                scrollToTopPosition(eVar);
            } else {
                scrollToBottomPosition(eVar, i2);
            }
        } else if (i3 == f.TOP.ordinal()) {
            scrollToTopPosition(eVar);
        } else if (i3 == f.MIDDLE.ordinal()) {
            scrollToMiddlePosition(eVar, i2);
        } else if (i3 == f.BOTTOM.ordinal()) {
            scrollToBottomPosition(eVar, i2);
        }
    }
}
