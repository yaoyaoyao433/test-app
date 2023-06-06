package com.dianping.gcmrnmodule.managers;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.gcmrnmodule.fragments.MRNModuleFragment;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.HostDestroyCallback;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.util.j;
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
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleAnchorManager.MODULE_NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u00020\u0001:\u00040123B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0018\u00010\nR\u00020\u0000H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010$\u001a\u00020\tH\u0016J\u001c\u0010%\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010'H\u0007J\u0012\u0010(\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J>\u0010)\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R6\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0018\u00010\nR\u00020\u00000\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0018\u00010\nR\u00020\u0000`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "DEBOUNCE_TIME", "", "anchorMap", "Ljava/util/HashMap;", "", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$Anchor;", "Lkotlin/collections/HashMap;", "anchorPointComparator", "Ljava/util/Comparator;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorPoint;", "checkAnchorReached", "", "scrollY", "cleanAnchorListener", "anchor", "cleanListeners", "param", "Lcom/facebook/react/bridge/ReadableMap;", "emitEvent", "key", "value", "Lcom/facebook/react/bridge/WritableMap;", "getAgentName", "source", "host", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", Constants.EventType.VIEW, "Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "getItemId", "vcItem", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;", "getName", "scrollTo", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "updateAnchorInfos", "updateAnchorPosition", "anchorInfoList", "Ljava/util/ArrayList;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorInfo;", "identifier", "offset", "reactTag", "Anchor", "AnchorInfo", "AnchorPoint", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleAnchorManager extends ReactContextBaseJavaModule {
    public static final d Companion = new d(null);
    private static final String MODULE_NAME = "MRNModuleAnchorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int DEBOUNCE_TIME;
    private final HashMap<String, a> anchorMap;
    private final Comparator<c> anchorPointComparator;

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return MODULE_NAME;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u00042\u0016\u0010\u0006\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "a", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorPoint;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager;", "kotlin.jvm.PlatformType", "b", "compare"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class e<T> implements Comparator<c> {
        public static ChangeQuickRedirect a;
        public static final e b = new e();

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            Object[] objArr = {cVar3, cVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde77b7976b954e97e61d30a206fe262", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde77b7976b954e97e61d30a206fe262")).intValue();
            }
            if (cVar3.a == cVar4.a) {
                return cVar4.c - cVar3.c;
            }
            return cVar4.a - cVar3.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$Companion;", "", "()V", "MODULE_NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRNModuleAnchorManager(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        kotlin.jvm.internal.h.b(reactApplicationContext, "reactContext");
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8342609b6c466930ee8e0ef20790d3d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8342609b6c466930ee8e0ef20790d3d8");
            return;
        }
        this.anchorMap = new HashMap<>();
        this.DEBOUNCE_TIME = 8;
        this.anchorPointComparator = e.b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorInfo;", "", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "setAgentName", "(Ljava/lang/String;)V", DMKeys.KEY_TAB_ANCHOR_INDEX_PATH, "Lcom/dianping/shield/entity/IndexPath;", "getAnchorIndexPath", "()Lcom/dianping/shield/entity/IndexPath;", "setAnchorIndexPath", "(Lcom/dianping/shield/entity/IndexPath;)V", "moduleKey", "getModuleKey", "setModuleKey", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
        @NotNull
        String b;
        @NotNull
        String c;
        @NotNull
        IndexPath d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5787445fbd6dc861ad746d25f8968ba6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5787445fbd6dc861ad746d25f8968ba6");
                return;
            }
            this.b = "";
            this.c = "";
            this.d = new IndexPath();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorPoint;", "", "(Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager;)V", "isValid", "", "()Z", "setValid", "(Z)V", "originIndex", "", "getOriginIndex", "()I", "setOriginIndex", "(I)V", Constants.GestureMoveEvent.KEY_Y, "getY", "setY", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class c {
        int a;
        boolean b;
        int c;

        public c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\b\u0012\u00060\u0012R\u00020\u0013\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\b¨\u0006="}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$Anchor;", "", "(Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager;)V", "anchorIndex", "", "getAnchorIndex", "()I", "setAnchorIndex", "(I)V", "anchorInfoList", "Ljava/util/ArrayList;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorInfo;", "getAnchorInfoList", "()Ljava/util/ArrayList;", "setAnchorInfoList", "(Ljava/util/ArrayList;)V", "anchorPointList", "", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$AnchorPoint;", "Lcom/dianping/gcmrnmodule/managers/MRNModuleAnchorManager;", "getAnchorPointList", "()Ljava/util/List;", "setAnchorPointList", "(Ljava/util/List;)V", "isPositionAllValid", "", "()Z", "setPositionAllValid", "(Z)V", "isScrollingByUser", "setScrollingByUser", "lastAnchorTime", "", "getLastAnchorTime", "()J", "setLastAnchorTime", "(J)V", "offset", "getOffset", "setOffset", "onContentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "getOnContentOffsetListener", "()Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "setOnContentOffsetListener", "(Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;)V", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "getOnLayoutChangeListener", "()Landroid/view/View$OnLayoutChangeListener;", "setOnLayoutChangeListener", "(Landroid/view/View$OnLayoutChangeListener;)V", "onScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "getOnScrollListener", "()Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "setOnScrollListener", "(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V", "reactTag", "getReactTag", "setReactTag", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class a {
        public static ChangeQuickRedirect a;
        int b;
        @Nullable
        ArrayList<b> c;
        @Nullable
        List<c> d;
        int e;
        int f = -2;
        boolean g = true;
        boolean h = true;
        @Nullable
        RecyclerView.k i;
        @Nullable
        View.OnLayoutChangeListener j;
        @Nullable
        ContentOffsetListener k;
        long l;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$scrollTo$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class g implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ MRNModuleAnchorManager c;
        public final /* synthetic */ Promise d;

        public g(ReadableMap readableMap, MRNModuleAnchorManager mRNModuleAnchorManager, Promise promise) {
            this.b = readableMap;
            this.c = mRNModuleAnchorManager;
            this.d = promise;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            boolean z;
            ArrayList<b> arrayList;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d43d07c4eb124443aed718a23565c79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d43d07c4eb124443aed718a23565c79");
                return;
            }
            View d = nativeViewHierarchyManager.d(com.dianping.gcmrnmodule.utils.e.b.a(this.b, "gdm_reactTag", 0));
            if (!(d instanceof i) || (hostInterface = ((i) d).getHostInterface()) == null) {
                return;
            }
            int a2 = com.dianping.gcmrnmodule.utils.e.b.a(this.b, "anchorIndex", 0);
            String a3 = com.dianping.gcmrnmodule.utils.e.b.a(this.b, "identifier", "");
            if (this.c.anchorMap.containsKey(a3)) {
                a aVar = (a) this.c.anchorMap.get(a3);
                c cVar = null;
                b bVar = (aVar == null || (arrayList = aVar.c) == null) ? null : arrayList.get(a2);
                if (aVar != null) {
                    aVar.g = true;
                }
                this.c.updateAnchorPosition(a3, hostInterface);
                if (bVar != null) {
                    ShieldGlobalFeatureInterface feature = hostInterface.getFeature();
                    if (feature != null) {
                        List<c> list = aVar.d;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (a2 == ((c) next).c) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    cVar = next;
                                    break;
                                }
                            }
                            cVar = cVar;
                        }
                        boolean a4 = com.dianping.gcmrnmodule.utils.e.b.a(this.b, DMKeys.KEY_SHARE_INFO_ANIMATED, false);
                        AgentInterface findAgent = feature.findAgent(bVar.c);
                        if (findAgent != null) {
                            NodeInfo row = NodeInfo.row(findAgent, bVar.d.section, bVar.d.row);
                            kotlin.jvm.internal.h.a((Object) row, "NodeInfo.row\n           …Info.anchorIndexPath.row)");
                            if (feature.getNodeGlobalPosition(row) == -1) {
                                Promise promise = this.d;
                                if (promise != null) {
                                    promise.reject("invalid_anchor", "ModuleAnchor(scrollTo): anchor index is invalid");
                                    return;
                                }
                                return;
                            } else if (cVar != null && cVar.b && !a4) {
                                AgentScrollerParams smooth = AgentScrollerParams.toPage().setOffset(-cVar.a).setSmooth(a4);
                                kotlin.jvm.internal.h.a((Object) smooth, "AgentScrollerParams.toPa…nt.y).setSmooth(animated)");
                                feature.scrollToNode(smooth);
                                aVar.f = a2;
                                Promise promise2 = this.d;
                                if (promise2 != null) {
                                    promise2.resolve(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                IndexPath indexPath = bVar.d;
                                AgentScrollerParams smooth2 = AgentScrollerParams.toRow(findAgent, indexPath.section, indexPath.row).setOffset(aVar.e).setSmooth(a4);
                                kotlin.jvm.internal.h.a((Object) smooth2, "AgentScrollerParams.toRo…fset).setSmooth(animated)");
                                feature.scrollToNode(smooth2);
                                aVar.f = a2;
                                Promise promise3 = this.d;
                                if (promise3 != null) {
                                    promise3.resolve(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Promise promise4 = this.d;
                if (promise4 != null) {
                    promise4.reject("invalid_anchor", "ModuleAnchor(scrollTo): anchor index is invalid");
                    return;
                }
                return;
            }
            Promise promise5 = this.d;
            if (promise5 != null) {
                promise5.reject("invalid_anchor", "ModuleAnchor(scrollTo): anchor index is invalid");
            }
        }
    }

    @ReactMethod
    public final void scrollTo(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        ReactApplicationContext reactApplicationContext;
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dd198bfafdb63367cd26e183f1937ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dd198bfafdb63367cd26e183f1937ce");
        } else if (readableMap == null || (reactApplicationContext = getReactApplicationContext()) == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new g(readableMap, this, promise));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r3 == null) goto L73;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAnchorInfos(@org.jetbrains.annotations.Nullable com.facebook.react.bridge.ReadableMap r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager.updateAnchorInfos(com.facebook.react.bridge.ReadableMap):void");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute", "com/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$updateAnchorInfos$1$1$1", "com/dianping/gcmrnmodule/managers/MRNModuleAnchorManager$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class h implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ MRNModuleAnchorManager f;

        public h(ArrayList arrayList, int i, int i2, String str, MRNModuleAnchorManager mRNModuleAnchorManager) {
            this.b = arrayList;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = mRNModuleAnchorManager;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            i iVar;
            final com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6baa2c1837aef8b2800a32daed6060", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6baa2c1837aef8b2800a32daed6060");
                return;
            }
            final View d = nativeViewHierarchyManager.d(this.c);
            if (!(d instanceof i) || (hostInterface = (iVar = (i) d).getHostInterface()) == null) {
                return;
            }
            this.f.updateAnchorPosition(this.b, this.e, j.a(hostInterface.getHostContext(), this.d), hostInterface, this.c, iVar);
            if (this.f.anchorMap.containsKey(this.e)) {
                a aVar = (a) this.f.anchorMap.get(this.e);
                if ((aVar != null ? aVar.j : null) == null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager.h.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4265c5bf246f24850e78c4ba554b2bc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4265c5bf246f24850e78c4ba554b2bc");
                            } else {
                                this.f.updateAnchorPosition(this.e, com.dianping.gcmrnmodule.hostwrapper.a.this);
                            }
                        }
                    };
                    Fragment hostFragment = hostInterface.getHostFragment();
                    if (!(hostFragment instanceof MRNModuleFragment)) {
                        hostFragment = null;
                    }
                    MRNModuleFragment mRNModuleFragment = (MRNModuleFragment) hostFragment;
                    CommonPageContainer commonPageContainer = mRNModuleFragment != null ? mRNModuleFragment.getCommonPageContainer() : null;
                    if (commonPageContainer != null) {
                        View recyclerViewRootView = commonPageContainer.getRecyclerViewRootView();
                        if (recyclerViewRootView != null) {
                            recyclerViewRootView.addOnLayoutChangeListener(onLayoutChangeListener);
                        }
                        a aVar2 = (a) this.f.anchorMap.get(this.e);
                        if (aVar2 != null) {
                            aVar2.j = onLayoutChangeListener;
                        }
                    }
                }
                a aVar3 = (a) this.f.anchorMap.get(this.e);
                if ((aVar3 != null ? aVar3.k : null) == null) {
                    ContentOffsetListener contentOffsetListener = new ContentOffsetListener() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager.h.2
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                        public final void offsetChanged(int i, int i2) {
                            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbbdc09637579050d0477273e242e34d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbbdc09637579050d0477273e242e34d");
                            } else {
                                this.f.updateAnchorPosition(this.e, com.dianping.gcmrnmodule.hostwrapper.a.this);
                            }
                        }
                    };
                    Fragment hostFragment2 = hostInterface.getHostFragment();
                    if (!(hostFragment2 instanceof MRNModuleFragment)) {
                        hostFragment2 = null;
                    }
                    MRNModuleFragment mRNModuleFragment2 = (MRNModuleFragment) hostFragment2;
                    CommonPageContainer commonPageContainer2 = mRNModuleFragment2 != null ? mRNModuleFragment2.getCommonPageContainer() : null;
                    if (commonPageContainer2 != null) {
                        ContentOffsetListener contentOffsetListener2 = contentOffsetListener;
                        commonPageContainer2.addContentOffsetListener(contentOffsetListener2);
                        a aVar4 = (a) this.f.anchorMap.get(this.e);
                        if (aVar4 != null) {
                            aVar4.k = contentOffsetListener2;
                        }
                    }
                }
                ab<?> pageContainer = hostInterface.getPageContainer();
                if (pageContainer instanceof com.dianping.agentsdk.pagecontainer.d) {
                    a aVar5 = (a) this.f.anchorMap.get(this.e);
                    if ((aVar5 != null ? aVar5.i : null) == null) {
                        RecyclerView.k kVar = new RecyclerView.k() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager.h.3
                            public static ChangeQuickRedirect a;

                            @Override // android.support.v7.widget.RecyclerView.k
                            public final void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
                                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa4381268b2796e5b6d0feefd2349a1d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa4381268b2796e5b6d0feefd2349a1d");
                                    return;
                                }
                                super.onScrollStateChanged(recyclerView, i);
                                if (i == 1) {
                                    for (Map.Entry entry : h.this.f.anchorMap.entrySet()) {
                                        a aVar6 = (a) entry.getValue();
                                        if (aVar6 != null && aVar6.g) {
                                            aVar6.g = false;
                                        }
                                    }
                                }
                            }
                        };
                        ((com.dianping.agentsdk.pagecontainer.d) pageContainer).addScrollListener(kVar);
                        a aVar6 = (a) this.f.anchorMap.get(this.e);
                        if (aVar6 != null) {
                            aVar6.i = kVar;
                        }
                    }
                }
            }
            hostInterface.addHostDestroyHook(new HostDestroyCallback() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager.h.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.shield.dynamic.protocols.HostDestroyCallback
                public final void onDestroy(@NotNull DynamicHostInterface dynamicHostInterface) {
                    Object[] objArr2 = {dynamicHostInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a446be44f01c32d79e9f04321acb1e30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a446be44f01c32d79e9f04321acb1e30");
                        return;
                    }
                    kotlin.jvm.internal.h.b(dynamicHostInterface, "host");
                    for (Map.Entry entry : h.this.f.anchorMap.entrySet()) {
                        h.this.f.cleanAnchorListener((a) entry.getValue());
                    }
                    h.this.f.anchorMap.clear();
                }
            });
        }
    }

    @ReactMethod
    public final void cleanListeners(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "187a692108018c4850e65b56de3a08c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "187a692108018c4850e65b56de3a08c8");
        } else if (readableMap != null) {
            String a2 = com.dianping.gcmrnmodule.utils.e.b.a(readableMap, "identifier", "");
            if (this.anchorMap.containsKey(a2)) {
                cleanAnchorListener(this.anchorMap.get(a2));
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class f implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ a b;

        public f(a aVar) {
            this.b = aVar;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            CommonPageContainer commonPageContainer;
            CommonPageContainer commonPageContainer2;
            View recyclerViewRootView;
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8191012eb1d1b782e6dedb93cdbd0d2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8191012eb1d1b782e6dedb93cdbd0d2a");
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                View d = nativeViewHierarchyManager.d(aVar.b);
                if (!(d instanceof i) || (hostInterface = ((i) d).getHostInterface()) == null) {
                    return;
                }
                Fragment hostFragment = hostInterface.getHostFragment();
                if (!(hostFragment instanceof MRNModuleFragment)) {
                    hostFragment = null;
                }
                MRNModuleFragment mRNModuleFragment = (MRNModuleFragment) hostFragment;
                if (mRNModuleFragment != null && (commonPageContainer2 = mRNModuleFragment.getCommonPageContainer()) != null && (recyclerViewRootView = commonPageContainer2.getRecyclerViewRootView()) != null) {
                    recyclerViewRootView.removeOnLayoutChangeListener(aVar.j);
                }
                aVar.j = null;
                ab<?> pageContainer = hostInterface.getPageContainer();
                if (!(pageContainer instanceof com.dianping.agentsdk.pagecontainer.d)) {
                    pageContainer = null;
                }
                com.dianping.agentsdk.pagecontainer.d dVar = (com.dianping.agentsdk.pagecontainer.d) pageContainer;
                if (dVar != null) {
                    dVar.removeScrollListener(aVar.i);
                }
                aVar.i = null;
                Fragment hostFragment2 = hostInterface.getHostFragment();
                if (!(hostFragment2 instanceof MRNModuleFragment)) {
                    hostFragment2 = null;
                }
                MRNModuleFragment mRNModuleFragment2 = (MRNModuleFragment) hostFragment2;
                if (mRNModuleFragment2 != null && (commonPageContainer = mRNModuleFragment2.getCommonPageContainer()) != null) {
                    commonPageContainer.removeContentOffsetListener(aVar.k);
                }
                aVar.k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanAnchorListener(a aVar) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ada51ff3df91023b1f9d7f8d3612ba57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ada51ff3df91023b1f9d7f8d3612ba57");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
            return;
        }
        uIManagerModule.addUIBlock(new f(aVar));
    }

    private final void checkAnchorReached(int i) {
        List<c> list;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a384fad9c01132d9d2e438224241c93c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a384fad9c01132d9d2e438224241c93c");
            return;
        }
        for (Map.Entry<String, a> entry : this.anchorMap.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            if (value != null) {
                if (!value.g && System.currentTimeMillis() - value.l > this.DEBOUNCE_TIME && (list = value.d) != null) {
                    List<c> list2 = list;
                    if (!list2.isEmpty()) {
                        int size = list2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            } else if (!list.get(i2).b || i < list.get(i2).a) {
                                if (i2 == list.size() - 1 && i < list.get(list.size() - 1).a && value.f != -1) {
                                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                                    writableNativeMap.putString("identifier", key);
                                    writableNativeMap.putInt("anchorIndex", -1);
                                    emitEvent("onAnchorReached", writableNativeMap);
                                    value.f = -1;
                                }
                                i2++;
                            } else {
                                int i3 = list.get(i2).c;
                                if (value.f != i3) {
                                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                                    writableNativeMap2.putString("identifier", key);
                                    writableNativeMap2.putInt("anchorIndex", i3);
                                    emitEvent("onAnchorReached", writableNativeMap2);
                                    value.f = i3;
                                }
                            }
                        }
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                Object[] objArr2 = {new Long(currentTimeMillis)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, value, changeQuickRedirect3, false, "33dd8b9db4c6175e7534e44741be8744", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, value, changeQuickRedirect3, false, "33dd8b9db4c6175e7534e44741be8744");
                } else {
                    value.l = currentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAnchorPosition(ArrayList<b> arrayList, String str, int i, com.dianping.gcmrnmodule.hostwrapper.a aVar, int i2, i iVar) {
        a aVar2;
        Integer num;
        Object[] objArr = {arrayList, str, Integer.valueOf(i), aVar, Integer.valueOf(i2), iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f1edbb63a9f57f8b6e893ff83beab08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f1edbb63a9f57f8b6e893ff83beab08");
            return;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new c());
        }
        ArrayList arrayList3 = arrayList2;
        if (this.anchorMap.containsKey(str)) {
            aVar2 = this.anchorMap.get(str);
        } else {
            aVar2 = new a();
        }
        int i4 = 0;
        for (b bVar : arrayList) {
            String agentName = getAgentName(bVar.b, aVar, iVar);
            Object[] objArr2 = {agentName};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "ba119a205856c2d2f7ed22299fdf0a6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "ba119a205856c2d2f7ed22299fdf0a6a");
            } else {
                kotlin.jvm.internal.h.b(agentName, "<set-?>");
                bVar.c = agentName;
            }
            IndexPath indexPath = bVar.d;
            ShieldGlobalFeatureInterface feature = aVar.getFeature();
            if (feature != null) {
                AgentInterface findAgent = feature.findAgent(bVar.c);
                if (findAgent == null) {
                    findAgent = feature.findAgent(bVar.b);
                }
                if (findAgent != null) {
                    NodeInfo row = NodeInfo.row(findAgent, indexPath.section, indexPath.row);
                    kotlin.jvm.internal.h.a((Object) row, "NodeInfo.row\n           …ion, anchorIndexPath.row)");
                    Pair<Integer, Integer> viewTopBottom = feature.getViewTopBottom(feature.getNodeGlobalPosition(row));
                    if (kotlin.jvm.internal.h.a(viewTopBottom != null ? (Integer) viewTopBottom.first : null, viewTopBottom != null ? (Integer) viewTopBottom.second : null)) {
                        ((c) arrayList3.get(i4)).a = Integer.MAX_VALUE;
                        ((c) arrayList3.get(i4)).b = false;
                        if (aVar2 != null) {
                            aVar2.h = false;
                        }
                    } else {
                        ((c) arrayList3.get(i4)).a = ((viewTopBottom == null || (num = (Integer) viewTopBottom.first) == null) ? 0 : num.intValue()) - i;
                        ((c) arrayList3.get(i4)).b = true;
                    }
                    ((c) arrayList3.get(i4)).c = i4;
                    i4++;
                }
            }
            i4++;
        }
        if (aVar2 != null) {
            aVar2.b = i2;
        }
        if (aVar2 != null) {
            aVar2.c = arrayList;
        }
        if (aVar2 != null) {
            aVar2.d = kotlin.collections.h.a((Iterable) arrayList3, (Comparator) this.anchorPointComparator);
        }
        if (aVar2 != null) {
            aVar2.e = i;
        }
        this.anchorMap.put(str, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAnchorPosition(String str, com.dianping.gcmrnmodule.hostwrapper.a aVar) {
        ShieldGlobalFeatureInterface feature;
        Integer num;
        Integer num2;
        int i = 0;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8cd1673d7c0bb7a6a70164afa734ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8cd1673d7c0bb7a6a70164afa734ef");
            return;
        }
        a aVar2 = this.anchorMap.get(str);
        if (aVar2 == null || (feature = aVar.getFeature()) == null) {
            return;
        }
        ArrayList<b> arrayList = aVar2.c;
        if (arrayList != null) {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(new c());
            }
            ArrayList arrayList3 = arrayList2;
            aVar2.h = true;
            int i3 = 0;
            for (b bVar : arrayList) {
                IndexPath indexPath = bVar.d;
                AgentInterface findAgent = feature.findAgent(bVar.c);
                if (findAgent == null) {
                    findAgent = feature.findAgent(bVar.b);
                }
                if (findAgent != null) {
                    NodeInfo row = NodeInfo.row(findAgent, indexPath.section, indexPath.row);
                    kotlin.jvm.internal.h.a((Object) row, "NodeInfo.row\n           …ion, anchorIndexPath.row)");
                    Pair<Integer, Integer> viewTopBottom = feature.getViewTopBottom(feature.getNodeGlobalPosition(row));
                    if (kotlin.jvm.internal.h.a(viewTopBottom != null ? (Integer) viewTopBottom.first : null, viewTopBottom != null ? (Integer) viewTopBottom.second : null)) {
                        ((c) arrayList3.get(i3)).a = Integer.MAX_VALUE;
                        ((c) arrayList3.get(i3)).b = false;
                        aVar2.h = false;
                    } else {
                        ((c) arrayList3.get(i3)).a = ((viewTopBottom == null || (num2 = (Integer) viewTopBottom.first) == null) ? 0 : num2.intValue()) - aVar2.e;
                        ((c) arrayList3.get(i3)).b = true;
                    }
                    ((c) arrayList3.get(i3)).c = i3;
                }
                i3++;
            }
            aVar2.d = kotlin.collections.h.a((Iterable) arrayList3, (Comparator) this.anchorPointComparator);
        }
        Pair<Integer, Integer> viewTopBottom2 = feature.getViewTopBottom(feature.findFirstVisibleItemPosition(false));
        if (viewTopBottom2 != null && (num = (Integer) viewTopBottom2.first) != null) {
            i = num.intValue();
        }
        checkAnchorReached(i);
    }

    private final String getAgentName(String str, com.dianping.gcmrnmodule.hostwrapper.a aVar, i iVar) {
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2;
        com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
        int i = 0;
        Object[] objArr = {str, aVar, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5aa9894c15fc58d9bfca0cb4ab8ad9cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5aa9894c15fc58d9bfca0cb4ab8ad9cf");
        }
        String str2 = "";
        if (iVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.d) {
            str2 = getItemId((com.dianping.gcmrnmodule.wrapperviews.items.modules.d) iVar, str);
        } else if (iVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.e) {
            com.dianping.gcmrnmodule.wrapperviews.items.modules.e eVar = (com.dianping.gcmrnmodule.wrapperviews.items.modules.e) iVar;
            int childCount = eVar.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = eVar.getChildAt(i);
                if (childAt instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.d) {
                    str2 = getItemId((com.dianping.gcmrnmodule.wrapperviews.items.modules.d) childAt, str);
                    break;
                }
                i++;
            }
        } else if (iVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.c) {
            str2 = String.valueOf(((com.dianping.gcmrnmodule.wrapperviews.items.modules.c) iVar).getId());
        }
        StringBuilder sb = new StringBuilder("mrn_");
        sb.append(str);
        sb.append('#');
        String str3 = null;
        if (!(aVar instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
            aVar = null;
        }
        if (aVar != null && (a2 = aVar.a()) != null && (hostInterface = a2.getHostInterface()) != null) {
            str3 = hostInterface.e;
        }
        sb.append(str3);
        sb.append("__");
        sb.append(str2);
        return sb.toString();
    }

    @NotNull
    public final String getItemId(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.modules.d dVar, @NotNull String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13aad842b69136853f89ebd274ee9372", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13aad842b69136853f89ebd274ee9372");
        }
        kotlin.jvm.internal.h.b(dVar, "vcItem");
        kotlin.jvm.internal.h.b(str, "source");
        int childCount = dVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = dVar.getChildAt(i);
            if (childAt instanceof com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) {
                com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a aVar = (com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) childAt;
                if (kotlin.jvm.internal.h.a((Object) str, (Object) aVar.getModuleKey())) {
                    int childCount2 = aVar.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = aVar.getChildAt(i2);
                        if (childAt2 instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.c) {
                            return String.valueOf(((com.dianping.gcmrnmodule.wrapperviews.items.modules.c) childAt2).getId());
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return "";
    }

    private final void emitEvent(String str, WritableMap writableMap) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f3b8fba4963f14217a7d1d563f7e9da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f3b8fba4963f14217a7d1d563f7e9da");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit(str, writableMap);
    }
}
