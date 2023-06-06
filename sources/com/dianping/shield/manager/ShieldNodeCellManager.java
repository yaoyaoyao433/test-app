package com.dianping.shield.manager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.an;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.i;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.agentsdk.sectionrecycler.a;
import com.dianping.shield.adapter.MergeAdapterTypeRefreshListener;
import com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface;
import com.dianping.shield.bridge.feature.HoverPosControl;
import com.dianping.shield.bridge.feature.HoverPosControlObserver;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ScrollScope;
import com.dianping.shield.expose.EntrySetHolder;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSection;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem;
import com.dianping.shield.feature.ExposeScreenLoadedInterface;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import com.dianping.shield.layoutcontrol.IHoverLayout;
import com.dianping.shield.manager.feature.AgentScrollTop;
import com.dianping.shield.manager.feature.CellManagerFeatureInterface;
import com.dianping.shield.manager.feature.CellManagerScrollListenerInterface;
import com.dianping.shield.manager.feature.HasBackgroundNodeCollector;
import com.dianping.shield.manager.feature.HotZoneScrollListener;
import com.dianping.shield.manager.feature.LoopCellGroupsCollector;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.node.DividerThemePackage;
import com.dianping.shield.node.StaggeredGridThemePackage;
import com.dianping.shield.node.adapter.AttachStatusManager;
import com.dianping.shield.node.adapter.DisplayNodeContainer;
import com.dianping.shield.node.adapter.ShieldDefaultItemAnimator;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.HandleAppearanceEventListener;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.RangeDispatcher;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.cellnode.callback.lazyload.DefaultShieldRowProvider;
import com.dianping.shield.node.cellnode.callback.lazyload.DefaultShieldRowProviderWithItem;
import com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback;
import com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.processor.legacy.NodeItemConvertUtils;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.utils.ListChangeRegistry;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.x;
import kotlin.o;
import kotlin.r;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002(I\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\n\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002B\r\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020>2\u0006\u0010i\u001a\u00020>J&\u0010j\u001a\u00020e2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020>2\u0006\u0010i\u001a\u00020>J\u0006\u0010n\u001a\u00020eJ\u0006\u0010o\u001a\u00020eJ\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0016J\u0016\u0010t\u001a\b\u0018\u00010uR\u00020\u00002\u0006\u0010v\u001a\u00020\u001aH\u0002J2\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00112\b\u0010z\u001a\u0004\u0018\u00010\u00142\u0016\u0010{\u001a\u0012\u0012\u0004\u0012\u00020[0\u0013j\b\u0012\u0004\u0012\u00020[`\u0015H\u0002J\u0006\u0010|\u001a\u00020eJ\u0012\u0010}\u001a\u0004\u0018\u00010\u00112\b\u0010~\u001a\u0004\u0018\u00010\u007fJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010x2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010sJ\u000e\u0010\u0082\u0001\u001a\u00070\u0083\u0001R\u00020\u0000H\u0002J\t\u0010\u0084\u0001\u001a\u00020eH\u0016J\u0011\u0010\u0085\u0001\u001a\u00020e2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u001bH\u0016J\u001c\u0010\u008b\u0001\u001a\u00070\u008c\u0001R\u00020\u00002\f\u0010\u008d\u0001\u001a\u00070\u0083\u0001R\u00020\u0000H\u0002J\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001a2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0004J\u001d\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001d\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001d\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001J\u0012\u0010\u0092\u0001\u001a\u00020\u001b2\u0007\u0010\u0093\u0001\u001a\u00020\u001bH\u0016J\u0012\u0010\u0094\u0001\u001a\u00020\u001a2\u0007\u0010\u0093\u0001\u001a\u00020\u001bH\u0016J\t\u0010\u0095\u0001\u001a\u00020\u001bH\u0016J\u0014\u0010\u0096\u0001\u001a\u00020\u001a2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u001aH\u0002J\u0007\u0010\u0098\u0001\u001a\u00020GJ\u0013\u0010\u0099\u0001\u001a\u00020\u001b2\b\u0010\u009a\u0001\u001a\u00030\u0089\u0001H\u0016J\u001b\u0010\u009b\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u00020[2\u0007\u0010\u009d\u0001\u001a\u00020\u001bH\u0002JB\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192!\u0010\u009e\u0001\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aH\u0004J\u001d\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001d\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001d\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001b\u0010\u009f\u0001\u001a\u0014\u0012\u0005\u0012\u00030 \u00010\u0013j\t\u0012\u0005\u0012\u00030 \u0001`\u0015H\u0016J\n\u0010¡\u0001\u001a\u00030 \u0001H\u0016J\u001d\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\u0006\u0010y\u001a\u00020\u00112\u0007\u0010¤\u0001\u001a\u00020\u001bH\u0002JC\u0010¥\u0001\u001a\u00020>2\u0019\u0010¦\u0001\u001a\u0014\u0012\u0005\u0012\u00030§\u00010\u0013j\t\u0012\u0005\u0012\u00030§\u0001`\u00152\u001d\u0010¨\u0001\u001a\u0018\u0012\u0005\u0012\u00030§\u0001\u0018\u00010\u0013j\u000b\u0012\u0005\u0012\u00030§\u0001\u0018\u0001`\u0015H\u0002J>\u0010©\u0001\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00112\b\u0010z\u001a\u0004\u0018\u00010\u00142\u0016\u0010{\u001a\u0012\u0012\u0004\u0012\u00020[0\u0013j\b\u0012\u0004\u0012\u00020[`\u00152\t\u0010ª\u0001\u001a\u0004\u0018\u00010qH\u0002J\u0011\u0010«\u0001\u001a\u00020e2\b\u0010¬\u0001\u001a\u00030\u00ad\u0001J#\u0010®\u0001\u001a\u00020e2\u0006\u0010y\u001a\u00020\u00112\u0007\u0010¤\u0001\u001a\u00020\u001b2\u0007\u0010¯\u0001\u001a\u00020\u001bH\u0002J'\u0010°\u0001\u001a\u00020>2\r\u0010±\u0001\u001a\b\u0018\u00010uR\u00020\u00002\r\u0010²\u0001\u001a\b\u0018\u00010uR\u00020\u0000H\u0002J\u0007\u0010³\u0001\u001a\u00020eJ\u001a\u0010´\u0001\u001a\u00020e2\u0006\u0010y\u001a\u00020\u00112\u0007\u0010¤\u0001\u001a\u00020\u001bH\u0002J\b\u0010H\u001a\u00020eH\u0016J\t\u0010µ\u0001\u001a\u00020eH\u0016J\t\u0010¶\u0001\u001a\u00020eH\u0016J\t\u0010·\u0001\u001a\u00020eH\u0016J\u000f\u0010¸\u0001\u001a\u00020e2\u0006\u0010f\u001a\u00020gJ\u000f\u0010¹\u0001\u001a\u00020e2\u0006\u0010k\u001a\u00020lJ#\u0010º\u0001\u001a\u00020e2\u0006\u0010y\u001a\u00020\u00112\u0007\u0010¤\u0001\u001a\u00020\u001b2\u0007\u0010¯\u0001\u001a\u00020\u001bH\u0002J)\u0010»\u0001\u001a\u00020e2\t\u0010¼\u0001\u001a\u0004\u0018\u00010s2\u0007\u0010\u009c\u0001\u001a\u00020\u001b2\n\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0016J&\u0010¿\u0001\u001a\u00020e2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010s2\u0007\u0010\u009c\u0001\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020\u001bH\u0016J\u0014\u0010À\u0001\u001a\u00020e2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010sH\u0016J\t\u0010Á\u0001\u001a\u00020eH\u0016J\u0011\u0010Á\u0001\u001a\u00020e2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0013\u0010Â\u0001\u001a\u00020e2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0016J\u0014\u0010Å\u0001\u001a\u00020e2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010Ç\u0001\u001a\u00020e2\u0007\u0010È\u0001\u001a\u00020>H\u0016J\u0010\u0010É\u0001\u001a\u00020e2\u0007\u0010Ê\u0001\u001a\u00020>J#\u0010Ë\u0001\u001a\u00020e2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010>2\t\u0010Í\u0001\u001a\u0004\u0018\u00010\u001a¢\u0006\u0003\u0010Î\u0001J\u0012\u0010Ï\u0001\u001a\u00020e2\t\u0010Ð\u0001\u001a\u0004\u0018\u00010\bJ\u000f\u0010Ñ\u0001\u001a\u00020e2\u0006\u0010;\u001a\u00020<J\u0013\u0010Ò\u0001\u001a\u00020e2\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0016J\u0014\u0010Õ\u0001\u001a\u00020e2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0011\u0010×\u0001\u001a\u00020e2\b\u0010Ø\u0001\u001a\u00030Ù\u0001J\u0013\u0010Ú\u0001\u001a\u00020e2\n\u0010Û\u0001\u001a\u0005\u0018\u00010Ü\u0001J\u0010\u0010Ý\u0001\u001a\u00020e2\u0007\u0010Þ\u0001\u001a\u00020>J\u0010\u0010ß\u0001\u001a\u00020e2\u0007\u0010à\u0001\u001a\u00020>J\u0011\u0010á\u0001\u001a\u00020e2\u0006\u0010K\u001a\u00020\u001aH\u0016J\u0011\u0010â\u0001\u001a\u00020e2\b\u0010ã\u0001\u001a\u00030ä\u0001J\u0011\u0010å\u0001\u001a\u00020e2\u0006\u0010\\\u001a\u00020]H\u0016J\u0011\u0010æ\u0001\u001a\u00020e2\b\u0010ç\u0001\u001a\u00030è\u0001J\u000f\u0010é\u0001\u001a\u00020e2\u0006\u0010b\u001a\u00020cJ\t\u0010ê\u0001\u001a\u00020eH\u0016J\t\u0010ë\u0001\u001a\u00020eH\u0016J\t\u0010ì\u0001\u001a\u00020eH\u0016J\u0013\u0010ì\u0001\u001a\u00020e2\b\u0010í\u0001\u001a\u00030î\u0001H\u0016J\u0007\u0010ï\u0001\u001a\u00020eJ\t\u0010ð\u0001\u001a\u00020eH\u0002J\u0010\u0010ñ\u0001\u001a\u00020e2\u0007\u00105\u001a\u00030ò\u0001J\u0019\u0010ó\u0001\u001a\u00020e2\u0007\u0010ô\u0001\u001a\u00020x2\u0007\u00105\u001a\u00030ò\u0001J\u0011\u0010õ\u0001\u001a\u00020e2\u0006\u0010~\u001a\u00020\u007fH\u0016J:\u0010õ\u0001\u001a\u00020e2\b\u0010~\u001a\u0004\u0018\u00010\u007f2\n\u0010ö\u0001\u001a\u0005\u0018\u00010÷\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020\u001b2\u0007\u0010ø\u0001\u001a\u00020\u001bH\u0016J\t\u0010ù\u0001\u001a\u00020eH\u0002J\u0011\u0010ú\u0001\u001a\u00020e2\u0006\u0010y\u001a\u00020\u0011H\u0002J_\u0010û\u0001\u001a\u00020e2\u001a\u0010{\u001a\u0016\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u007f\u0018\u0001`\u00152\u001b\u0010ü\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u007f\u0018\u0001`\u00152\u001b\u0010ý\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u007f\u0018\u0001`\u0015H\u0016J2\u0010þ\u0001\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00112\u0007\u0010ÿ\u0001\u001a\u00020\u00142\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020[0\u0013j\b\u0012\u0004\u0012\u00020[`\u0015H\u0002J\u001c\u0010\u0080\u0002\u001a\u00020e2\b\u0010\u0081\u0002\u001a\u00030£\u00012\u0007\u0010\u0082\u0002\u001a\u00020[H\u0002J#\u0010\u0083\u0002\u001a\u00020e2\u0006\u0010y\u001a\u00020\u00112\u0007\u0010¤\u0001\u001a\u00020\u001b2\u0007\u0010¯\u0001\u001a\u00020\u001bH\u0002J\u0011\u0010\u0084\u0002\u001a\u00020e2\b\u0010\u0085\u0002\u001a\u00030\u0087\u0001J6\u0010\u0086\u0002\u001a\u00020e\"\u0005\b\u0000\u0010\u0087\u0002*\n\u0012\u0005\u0012\u0003H\u0087\u00020\u0088\u00022\u0017\u0010\u0089\u0002\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u0001H\u0087\u0002\u0012\u0004\u0012\u00020e0\u008a\u0002H\u0086\bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR4\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R$\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020+@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0012\u0012\u0004\u0012\u0002020\u0013j\b\u0012\u0004\u0012\u000202`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u000604R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0004\n\u0002\u0010JR\u0010\u0010K\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010O\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001d\"\u0004\bQ\u0010\u001fR4\u0010R\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001d\"\u0004\bT\u0010\u001fR4\u0010U\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001d\"\u0004\bW\u0010\u001fR\u001e\u0010X\u001a\u0012\u0012\u0004\u0012\u00020Y0\u0013j\b\u0012\u0004\u0012\u00020Y`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020[0\u0013j\b\u0012\u0004\u0012\u00020[`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u0004\u0018\u00010]X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010`\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0013j\b\u0012\u0004\u0012\u00020\u0011`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0090\u0002"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager;", "Lcom/dianping/agentsdk/framework/UIRCellManagerInterface;", "Landroid/support/v7/widget/RecyclerView;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "Lcom/dianping/shield/adapter/MergeAdapterTypeRefreshListener;", "Lcom/dianping/shield/feature/ExposeScreenLoadedInterface;", "Lcom/dianping/agentsdk/sectionrecycler/GroupBorderDecoration$GroupInfoProvider;", "Lcom/dianping/shield/bridge/feature/CellManagerCommonFunctionInterface;", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "Lcom/dianping/shield/framework/PageContainerLayoutModeInterface;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "agentScrollTop", "Lcom/dianping/shield/manager/feature/AgentScrollTop;", "cellComparator", "Ljava/util/Comparator;", "Lcom/dianping/agentsdk/framework/Cell;", "cellGroups", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "Lkotlin/collections/ArrayList;", "cellManagerOnScrollListener", "Lcom/dianping/shield/manager/ShieldNodeCellManager$CellManagerOnScrollListener;", "cellTypeMap", "Ljava/util/HashMap;", "", "", "getCellTypeMap", "()Ljava/util/HashMap;", "setCellTypeMap", "(Ljava/util/HashMap;)V", "cellTypeMapForFooter", "getCellTypeMapForFooter", "setCellTypeMapForFooter", "cellTypeMapForHeader", "getCellTypeMapForHeader", "setCellTypeMapForHeader", "cells", DMKeys.KEY_EXPOSE_CALLBACK, "com/dianping/shield/manager/ShieldNodeCellManager$exposeCallback$1", "Lcom/dianping/shield/manager/ShieldNodeCellManager$exposeCallback$1;", "value", "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "exposeComputeMode", "getExposeComputeMode", "()Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "setExposeComputeMode", "(Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;)V", "featureList", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "frozenInfo", "Lcom/dianping/shield/manager/ShieldNodeCellManager$FrozenInfo;", "handler", "Landroid/os/Handler;", "hasBackgroundNodeCollector", "Lcom/dianping/shield/manager/feature/HasBackgroundNodeCollector;", "hotZoneScrollListener", "Lcom/dianping/shield/manager/feature/HotZoneScrollListener;", "hoverPosControl", "Lcom/dianping/shield/bridge/feature/HoverPosControl;", "isBuildingCellChain", "", "itemAnimator", "Landroid/support/v7/widget/RecyclerView$ItemAnimator;", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "layoutModeController", "looper", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "nodeAdapter", "Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;", "notifyCellChanged", "com/dianping/shield/manager/ShieldNodeCellManager$notifyCellChanged$1", "Lcom/dianping/shield/manager/ShieldNodeCellManager$notifyCellChanged$1;", "pageName", "processorHolder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "recyclerView", "reuseIdentifierMap", "getReuseIdentifierMap", "setReuseIdentifierMap", "reuseIdentifierMapForFooter", "getReuseIdentifierMapForFooter", "setReuseIdentifierMapForFooter", "reuseIdentifierMapForHeader", "getReuseIdentifierMapForHeader", "setReuseIdentifierMapForHeader", "scrollListenerList", "Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "sectionList", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "shieldLayoutManager", "Lcom/dianping/shield/sectionrecycler/ShieldLayoutManagerInterface;", "sortedCells", "updateAgentCellInterrupted", "whiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "addHotZoneItemStatusObserver", "", "hotZoneItemStatusInterface", "Lcom/dianping/shield/feature/HotZoneItemStatusInterface;", "reverseRange", "onlyObserverInHotZone", "addHotZoneStatusObserver", "hotZoneStatusInterface", "Lcom/dianping/shield/feature/HotZoneStatusInterface;", "prefix", "clearAttachStatus", "clearCurrentInfo", "convertCellInterfaceToItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "createCellGroupIndex", "Lcom/dianping/shield/manager/ShieldNodeCellManager$CellGroupIndex;", "indexStr", "createShieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "cell", "parent", "addList", "destory", "findCellForAgent", "agent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "findShieldViewCell", "sectionCellInterface", "findVisibleItems", "Lcom/dianping/shield/manager/ShieldNodeCellManager$VisibleItemsInfo;", "finishExpose", "forceAttachStatusUpdate", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "getAgentInfoByGlobalPosition", "Lcom/dianping/shield/entity/NodeInfo;", "globalPosition", "getAnchorItemPositionInfo", "Lcom/dianping/shield/manager/ShieldNodeCellManager$PositionInfo;", "visibleItems", "getCellName", "hostName", "getDividerThemePackage", "Lcom/dianping/shield/node/DividerThemePackage;", "getGroupPosition", "position", "getGroupText", "getMaxTopViewY", "getModuleKey", "source", "getNodeAdapterAndUpdateFeature", "getNodeGlobalPosition", "nodeInfo", "getOffsetRowPosition", "section", "row", "mapCollection", "getScreenInvisibleEdge", "Landroid/graphics/Rect;", "getScreenVisibleEdge", "getSectionItemOfPosition", "Lcom/dianping/shield/node/useritem/SectionItem;", "sectionPosition", "hasSectionCellChanged", "oldRowItems", "Lcom/dianping/shield/node/useritem/RowItem;", "newRowItems", "initShieldViewCell", "sectionCellItem", "innerSetHoverContainer", "container", "Lcom/dianping/shield/layoutcontrol/IHoverLayout;", "insertSection", "sectionCount", "isSameGroup", "currentGroup", "nextGroup", "loadCurrentInfo", "markElseNodeOutDate", "onMergedTypeRefresh", "onShieldExtraVisibleNodeChange", "pauseExpose", "removeHotZoneItemStatusObserver", "removeHotZoneStatusObserver", "removeSection", "resetExposeExtraCell", "extraCellInterface", "cellType", "Lcom/dianping/shield/entity/CellType;", "resetExposeRow", "resetExposeSCI", "resumeExpose", "scrollToNode", "params", "Lcom/dianping/shield/entity/AgentScrollerParams;", "setAgentContainerView", "containerView", "setDisableDecoration", "disableDecoration", "setEnableDivider", "enableDivider", "setFrozenInfo", "enableFrozen", "frozenModuleKey", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "setGlobalScreenVisibleProxy", "screenVisibleExposeEdgeInterface", "setHoverPosControl", "setLayoutManagerMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Lcom/dianping/shield/component/entity/LayoutMode;", "setLayoutModeController", "pageContainerLayoutModeInterface", "setLayoutParamCalFinishCallback", "layoutParamCalAndContentYCallback", "Lcom/dianping/shield/node/itemcallbacks/LayoutParamCalAndContentYCallback;", "setLoadingAndLoadingMoreCreator", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setMarkedScrollToTopAgentRule", "scrollToTopByFirstMarkedAgent", "setNeedLoadStore", "needLoadStore", "setPageName", "setSectionBgViewMapCallback", "sectionBgViewMapCallback", "Lcom/dianping/shield/node/itemcallbacks/SectionBgViewMapCallback;", "setShieldGAInfo", "setStaggeredGridThemePackage", "staggeredGridThemePackage", "Lcom/dianping/shield/node/StaggeredGridThemePackage;", "setWhiteBoard", "shieldPreload", "shieldRecycle", "startExpose", "delayMilliseconds", "", "storeCurrentInfo", "supportAnimator", "traverseAppearanceEventListener", "Lcom/dianping/shield/node/cellnode/HandleAppearanceEventListener;", "traverseCellAppearanceEventListener", "shieldViewCell", "updateAgentCell", "updateAgentType", "Lcom/dianping/agentsdk/framework/UpdateAgentType;", "count", "updateAgentContainer", "updateCellAll", "updateCells", "updateList", "deleteList", "updateOrInitCell", "currentCellGroup", "updateRowProvider", "sectionItem", "shieldSection", "updateSection", "updateStatus", "direction", "forEachNodeChild", "T", "Lcom/dianping/shield/expose/EntrySetHolder;", "action", "Lkotlin/Function1;", "CellGroupIndex", "CellManagerOnScrollListener", "FrozenInfo", "PositionInfo", "VisibleItemsInfo", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldNodeCellManager implements an<RecyclerView>, a.InterfaceC0052a, MergeAdapterTypeRefreshListener, CellManagerCommonFunctionInterface, ExposeScreenLoadedInterface, PageContainerLayoutModeInterface, IScreenVisibleExposeEdge, ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AgentScrollTop agentScrollTop;
    private final Comparator<i> cellComparator;
    private ArrayList<ShieldCellGroup> cellGroups;
    private CellManagerOnScrollListener cellManagerOnScrollListener;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> cellTypeMap;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> cellTypeMapForFooter;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> cellTypeMapForHeader;
    private final HashMap<String, i> cells;
    private final ShieldNodeCellManager$exposeCallback$1 exposeCallback;
    @NotNull
    private f.a exposeComputeMode;
    private ArrayList<CellManagerFeatureInterface> featureList;
    private FrozenInfo frozenInfo;
    private final Handler handler;
    private HasBackgroundNodeCollector hasBackgroundNodeCollector;
    private HotZoneScrollListener hotZoneScrollListener;
    private HoverPosControl hoverPosControl;
    private boolean isBuildingCellChain;
    private RecyclerView.ItemAnimator itemAnimator;
    private RecyclerView.LayoutManager layoutManager;
    private PageContainerLayoutModeInterface layoutModeController;
    private LoopCellGroupsCollector looper;
    private final Context mContext;
    private ShieldDisplayNodeAdapter nodeAdapter;
    private final ShieldNodeCellManager$notifyCellChanged$1 notifyCellChanged;
    private String pageName;
    private ProcessorHolder processorHolder;
    private RecyclerView recyclerView;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> reuseIdentifierMap;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> reuseIdentifierMapForFooter;
    @Nullable
    private HashMap<String, HashMap<String, Integer>> reuseIdentifierMapForHeader;
    private ArrayList<CellManagerScrollListenerInterface> scrollListenerList;
    private ArrayList<ShieldSection> sectionList;
    private ShieldGAInfo shieldGAInfo;
    private ShieldLayoutManagerInterface shieldLayoutManager;
    private ArrayList<i> sortedCells;
    private boolean updateAgentCellInterrupted;
    private ar whiteBoard;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[ap.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ap.UPDATE_ALL.ordinal()] = 1;
            $EnumSwitchMapping$0[ap.INSERT_SECTION.ordinal()] = 2;
            $EnumSwitchMapping$0[ap.REMOVE_SECTION.ordinal()] = 3;
            $EnumSwitchMapping$0[ap.UPDATE_SECTION.ordinal()] = 4;
            $EnumSwitchMapping$0[ap.INSERT_ROW.ordinal()] = 5;
            $EnumSwitchMapping$0[ap.REMOVE_ROW.ordinal()] = 6;
            $EnumSwitchMapping$0[ap.UPDATE_ROW.ordinal()] = 7;
            int[] iArr2 = new int[NodeInfo.Scope.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[NodeInfo.Scope.AGENT.ordinal()] = 1;
            $EnumSwitchMapping$1[NodeInfo.Scope.SECTION.ordinal()] = 2;
            $EnumSwitchMapping$1[NodeInfo.Scope.ROW.ordinal()] = 3;
            $EnumSwitchMapping$1[NodeInfo.Scope.HEADER.ordinal()] = 4;
            $EnumSwitchMapping$1[NodeInfo.Scope.FOOTER.ordinal()] = 5;
            int[] iArr3 = new int[NodeInfo.Scope.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[NodeInfo.Scope.AGENT.ordinal()] = 1;
            int[] iArr4 = new int[CellType.valuesCustom().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[CellType.NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$3[CellType.HEADER.ordinal()] = 2;
            $EnumSwitchMapping$3[CellType.FOOTER.ordinal()] = 3;
            $EnumSwitchMapping$3[CellType.LOADING.ordinal()] = 4;
            $EnumSwitchMapping$3[CellType.LOADING_MORE.ordinal()] = 5;
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.dianping.shield.manager.ShieldNodeCellManager$exposeCallback$1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.dianping.shield.manager.ShieldNodeCellManager$notifyCellChanged$1] */
    public ShieldNodeCellManager(@NotNull Context context) {
        h.b(context, "mContext");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f031e0518d9831ff6ead569b66a912", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f031e0518d9831ff6ead569b66a912");
            return;
        }
        this.mContext = context;
        this.handler = new Handler(Looper.getMainLooper());
        this.exposeCallback = new Runnable() { // from class: com.dianping.shield.manager.ShieldNodeCellManager$exposeCallback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Handler handler;
                ShieldDisplayNodeAdapter shieldDisplayNodeAdapter;
                ShieldDisplayNodeAdapter shieldDisplayNodeAdapter2;
                ShieldDisplayNodeAdapter shieldDisplayNodeAdapter3;
                ShieldDisplayNodeAdapter shieldDisplayNodeAdapter4;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3f1c0ae31f93ebf0f7cd28e29cc48c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3f1c0ae31f93ebf0f7cd28e29cc48c3");
                    return;
                }
                handler = ShieldNodeCellManager.this.handler;
                handler.removeCallbacks(this);
                shieldDisplayNodeAdapter = ShieldNodeCellManager.this.nodeAdapter;
                if (shieldDisplayNodeAdapter.getAppearDisappearState() == AttachStatusManager.State.OPENING) {
                    shieldDisplayNodeAdapter4 = ShieldNodeCellManager.this.nodeAdapter;
                    shieldDisplayNodeAdapter4.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_START);
                }
                shieldDisplayNodeAdapter2 = ShieldNodeCellManager.this.nodeAdapter;
                shieldDisplayNodeAdapter2.clearAttachStatus();
                shieldDisplayNodeAdapter3 = ShieldNodeCellManager.this.nodeAdapter;
                shieldDisplayNodeAdapter3.updateStatus();
            }
        };
        this.notifyCellChanged = new Runnable() { // from class: com.dianping.shield.manager.ShieldNodeCellManager$notifyCellChanged$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Handler handler;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ecd45b7f02069dbdb8bc0d4de675cd71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ecd45b7f02069dbdb8bc0d4de675cd71");
                    return;
                }
                handler = ShieldNodeCellManager.this.handler;
                handler.removeCallbacks(this);
                ShieldNodeCellManager.this.updateAgentContainer();
            }
        };
        this.cells = new LinkedHashMap();
        this.sortedCells = new ArrayList<>();
        this.cellComparator = new Comparator<i>() { // from class: com.dianping.shield.manager.ShieldNodeCellManager$cellComparator$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.Comparator
            public final int compare(i iVar, i iVar2) {
                String index;
                Object[] objArr2 = {iVar, iVar2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "359489442aef10121e74b418359b4e5a", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "359489442aef10121e74b418359b4e5a")).intValue();
                }
                AgentInterface agentInterface = iVar.b;
                String index2 = agentInterface != null ? agentInterface.getIndex() : null;
                AgentInterface agentInterface2 = iVar2.b;
                if (h.a((Object) index2, (Object) (agentInterface2 != null ? agentInterface2.getIndex() : null))) {
                    String str = iVar.d;
                    if (str != null) {
                        String str2 = iVar2.d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        return str.compareTo(str2);
                    }
                    return -1;
                }
                AgentInterface agentInterface3 = iVar.b;
                if (agentInterface3 == null || (index = agentInterface3.getIndex()) == null) {
                    return -1;
                }
                AgentInterface agentInterface4 = iVar2.b;
                return index.compareTo((agentInterface4 == null || (r13 = agentInterface4.getIndex()) == null) ? "" : "");
            }
        };
        this.cellGroups = new ArrayList<>();
        this.sectionList = new ArrayList<>();
        this.nodeAdapter = new ShieldDisplayNodeAdapter(this.mContext);
        this.cellManagerOnScrollListener = new CellManagerOnScrollListener();
        this.processorHolder = new ProcessorHolder(this.mContext);
        this.featureList = new ArrayList<>();
        this.scrollListenerList = new ArrayList<>();
        this.hotZoneScrollListener = new HotZoneScrollListener(this.nodeAdapter);
        this.agentScrollTop = new AgentScrollTop(this);
        this.hasBackgroundNodeCollector = new HasBackgroundNodeCollector(this);
        this.frozenInfo = new FrozenInfo(this, Boolean.FALSE, null, 2, null);
        this.exposeComputeMode = f.a.Normal;
    }

    @NotNull
    public final f.a getExposeComputeMode() {
        return this.exposeComputeMode;
    }

    public final void setExposeComputeMode(@NotNull f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abb875aff71f9b5525ac0ceabd2792f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abb875aff71f9b5525ac0ceabd2792f5");
            return;
        }
        h.b(aVar, "value");
        this.exposeComputeMode = aVar;
        this.processorHolder.getInfoHolder().setPageExposeComputeMode(aVar);
    }

    public final void setSectionBgViewMapCallback(@NotNull SectionBgViewMapCallback sectionBgViewMapCallback) {
        Object[] objArr = {sectionBgViewMapCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac75ccbbfa939589f4bf6d29af823a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac75ccbbfa939589f4bf6d29af823a5b");
            return;
        }
        h.b(sectionBgViewMapCallback, "sectionBgViewMapCallback");
        this.hasBackgroundNodeCollector.setSectionBgViewMapCallback(sectionBgViewMapCallback);
    }

    public final void setLayoutParamCalFinishCallback(@NotNull LayoutParamCalAndContentYCallback layoutParamCalAndContentYCallback) {
        Object[] objArr = {layoutParamCalAndContentYCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21faa70c27e3465d6b22cc0fe6a0f858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21faa70c27e3465d6b22cc0fe6a0f858");
            return;
        }
        h.b(layoutParamCalAndContentYCallback, "layoutParamCalAndContentYCallback");
        this.nodeAdapter.setLayoutParamCalFinishCallback(layoutParamCalAndContentYCallback);
    }

    public final void setWhiteBoard(@NotNull ar arVar) {
        Object[] objArr = {arVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ee373aa1e5c0fa9787fec39708a830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ee373aa1e5c0fa9787fec39708a830");
            return;
        }
        h.b(arVar, "whiteBoard");
        this.whiteBoard = arVar;
    }

    public final void setLoadingAndLoadingMoreCreator(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        Object[] objArr = {loadingAndLoadingMoreCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d57a2bddc5c20236598f52fac012d11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d57a2bddc5c20236598f52fac012d11");
        } else {
            this.processorHolder.setCreator(loadingAndLoadingMoreCreator);
        }
    }

    @NotNull
    public final DividerThemePackage getDividerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f19754846d498c985c0ff79066f6c52e", RobustBitConfig.DEFAULT_VALUE) ? (DividerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f19754846d498c985c0ff79066f6c52e") : this.processorHolder.getDividerThemePackage();
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public final void setPageName(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "715b6e6485816b06b4dd8fff094b9a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "715b6e6485816b06b4dd8fff094b9a75");
            return;
        }
        h.b(str, "pageName");
        this.pageName = str;
        this.nodeAdapter.setPageName(str);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public final void setShieldGAInfo(@NotNull ShieldGAInfo shieldGAInfo) {
        Object[] objArr = {shieldGAInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c8ef1108958d803ac200d5cac222dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c8ef1108958d803ac200d5cac222dd6");
            return;
        }
        h.b(shieldGAInfo, "shieldGAInfo");
        this.shieldGAInfo = shieldGAInfo;
    }

    public final void setEnableDivider(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe6d10f7d1d0e86eedf81b7c25da7577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe6d10f7d1d0e86eedf81b7c25da7577");
        } else {
            this.processorHolder.getDividerThemePackage().enableDivider = z;
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public final void setDisableDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fffbb5d4fb2be2df3e16c4b63222e07b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fffbb5d4fb2be2df3e16c4b63222e07b");
        } else {
            this.nodeAdapter.setDisableDecoration(z);
        }
    }

    public final void setGlobalScreenVisibleProxy(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        Object[] objArr = {iScreenVisibleExposeEdge};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "609d437eed90b6c967459a161851297d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "609d437eed90b6c967459a161851297d");
        } else {
            this.nodeAdapter.setGlobalScreenVisibleEdgeProxy(iScreenVisibleExposeEdge);
        }
    }

    public final void addHotZoneStatusObserver(@NotNull HotZoneStatusInterface hotZoneStatusInterface, @NotNull String str, boolean z, boolean z2) {
        Object[] objArr = {hotZoneStatusInterface, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fb253fdf85954b49492367e3b7b2a6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fb253fdf85954b49492367e3b7b2a6d");
            return;
        }
        h.b(hotZoneStatusInterface, "hotZoneStatusInterface");
        h.b(str, "prefix");
        this.nodeAdapter.addHotZoneLocationManager(hotZoneStatusInterface, str, z, z2);
    }

    public final void removeHotZoneStatusObserver(@NotNull HotZoneStatusInterface hotZoneStatusInterface) {
        Object[] objArr = {hotZoneStatusInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc4192f9b27da06922ce7cbf7b2f3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc4192f9b27da06922ce7cbf7b2f3ce");
            return;
        }
        h.b(hotZoneStatusInterface, "hotZoneStatusInterface");
        this.nodeAdapter.removeHotZoneLocationManager(hotZoneStatusInterface);
    }

    public final void addHotZoneItemStatusObserver(@NotNull HotZoneItemStatusInterface hotZoneItemStatusInterface, boolean z, boolean z2) {
        Object[] objArr = {hotZoneItemStatusInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "252ce87b4370c241fcd50f00b486937d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "252ce87b4370c241fcd50f00b486937d");
            return;
        }
        h.b(hotZoneItemStatusInterface, "hotZoneItemStatusInterface");
        this.nodeAdapter.addHotZoneItemLocationManager(hotZoneItemStatusInterface, z, z2);
    }

    public final void removeHotZoneItemStatusObserver(@NotNull HotZoneItemStatusInterface hotZoneItemStatusInterface) {
        Object[] objArr = {hotZoneItemStatusInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "248a9f6e97e3a3fe32fad771f80fac76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "248a9f6e97e3a3fe32fad771f80fac76");
            return;
        }
        h.b(hotZoneItemStatusInterface, "hotZoneItemStatusInterface");
        this.nodeAdapter.removeHotZoneItemLocationManager(hotZoneItemStatusInterface);
    }

    public final void setStaggeredGridThemePackage(@NotNull StaggeredGridThemePackage staggeredGridThemePackage) {
        Object[] objArr = {staggeredGridThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f380dd78bf322d7896dc802cbf06cc8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f380dd78bf322d7896dc802cbf06cc8a");
            return;
        }
        h.b(staggeredGridThemePackage, "staggeredGridThemePackage");
        this.nodeAdapter.setStaggeredGridThemePackage(staggeredGridThemePackage);
    }

    public final void setMarkedScrollToTopAgentRule(boolean z) {
        this.agentScrollTop.scrollToTopByFirstMarkedAgent = z;
    }

    public final void innerSetHoverContainer(@NotNull IHoverLayout iHoverLayout) {
        Object[] objArr = {iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9c53b5976e4e173a51a0da12cb3eccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9c53b5976e4e173a51a0da12cb3eccd");
            return;
        }
        h.b(iHoverLayout, "container");
        this.nodeAdapter.setHoverLayoutControl(iHoverLayout);
    }

    public final void setHoverPosControl(@NotNull HoverPosControl hoverPosControl) {
        Object[] objArr = {hoverPosControl};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09f19292efcfbf90e165d0ec5500fd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09f19292efcfbf90e165d0ec5500fd38");
            return;
        }
        h.b(hoverPosControl, "hoverPosControl");
        this.hoverPosControl = hoverPosControl;
        HoverPosControlObserver hoverPosControlObserver = this.nodeAdapter.getHoverPosControlObserver();
        h.a((Object) hoverPosControlObserver, "nodeAdapter.hoverPosControlObserver");
        hoverPosControl.addHoverPosControlObserver(hoverPosControlObserver);
    }

    @Override // com.dianping.shield.adapter.MergeAdapterTypeRefreshListener
    public final void onMergedTypeRefresh() {
        ArrayList<ShieldViewCell> arrayList;
        RecyclerView recyclerView;
        RecyclerView.l recycledViewPool;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5f5e6bc41e6d127401c0bbb5b50f2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5f5e6bc41e6d127401c0bbb5b50f2cb");
            return;
        }
        for (ShieldCellGroup shieldCellGroup : this.cellGroups) {
            if (shieldCellGroup != null && (arrayList = shieldCellGroup.shieldViewCells) != null) {
                for (ShieldViewCell shieldViewCell : arrayList) {
                    Map<String, Integer> map = shieldViewCell.recyclerViewTypeSizeMap;
                    if (map != null) {
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            int globalType = this.nodeAdapter.getGlobalType(shieldViewCell.name + '*' + entry.getKey());
                            if (globalType > 0 && (recyclerView = this.recyclerView) != null && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                                recycledViewPool.a(globalType, entry.getValue().intValue());
                            }
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final ShieldDisplayNodeAdapter getNodeAdapterAndUpdateFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5870da1ab9b40b728b2b48395b2ea50e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNodeAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5870da1ab9b40b728b2b48395b2ea50e");
        }
        LoopCellGroupsCollector loopCellGroupsCollector = this.looper;
        if (loopCellGroupsCollector != null) {
            loopCellGroupsCollector.clearAllActions();
        }
        for (CellManagerFeatureInterface cellManagerFeatureInterface : this.featureList) {
            cellManagerFeatureInterface.onAdapterNotify(this.cellGroups);
        }
        return this.nodeAdapter;
    }

    @Override // com.dianping.agentsdk.framework.j
    public final void setLayoutModeController(@Nullable PageContainerLayoutModeInterface pageContainerLayoutModeInterface) {
        this.layoutModeController = pageContainerLayoutModeInterface;
    }

    @Override // com.dianping.shield.framework.PageContainerLayoutModeInterface
    public final void setLayoutManagerMode(@NotNull LayoutMode layoutMode) {
        Object[] objArr = {layoutMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e41f348974813e13a26fa258ce38bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e41f348974813e13a26fa258ce38bc");
            return;
        }
        h.b(layoutMode, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        PageContainerLayoutModeInterface pageContainerLayoutModeInterface = this.layoutModeController;
        if (pageContainerLayoutModeInterface != null) {
            pageContainerLayoutModeInterface.setLayoutManagerMode(layoutMode);
        }
        if (layoutMode == LayoutMode.STAGGERED_GRID_LAYOUT_MANAGER) {
            this.nodeAdapter.setStaggerDecoration();
        }
        RecyclerView recyclerView = this.recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof ShieldLayoutManagerInterface)) {
            layoutManager = null;
        }
        ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) layoutManager;
        if (shieldLayoutManagerInterface != null) {
            this.shieldLayoutManager = shieldLayoutManagerInterface;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (kotlin.jvm.internal.h.a((java.lang.Object) "android.support.v7.widget.LinearLayoutManager", (java.lang.Object) r1) != false) goto L54;
     */
    @Override // com.dianping.agentsdk.framework.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAgentContainerView(@org.jetbrains.annotations.Nullable android.support.v7.widget.RecyclerView r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.setAgentContainerView(android.support.v7.widget.RecyclerView):void");
    }

    @Override // com.dianping.agentsdk.framework.j
    public final void updateCells(@Nullable ArrayList<AgentInterface> arrayList, @Nullable ArrayList<AgentInterface> arrayList2, @Nullable ArrayList<AgentInterface> arrayList3) {
        int i = 0;
        Object[] objArr = {arrayList, arrayList2, arrayList3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85468d66702d4e7fdf55244a045e7f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85468d66702d4e7fdf55244a045e7f9a");
            return;
        }
        ArrayList<ShieldViewCell> arrayList4 = new ArrayList<>();
        if (arrayList3 != null) {
            Iterator<AgentInterface> it = arrayList3.iterator();
            while (it.hasNext()) {
                String cellName = getCellName(it.next());
                HashMap<String, i> hashMap = this.cells;
                if (hashMap == null) {
                    throw new o("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                }
                if (hashMap.containsKey(cellName)) {
                    i iVar = this.cells.get(cellName);
                    if (iVar == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.Cell");
                    }
                    ShieldViewCell shieldViewCell = iVar.h;
                    if (shieldViewCell != null && !shieldViewCell.isEmpty()) {
                        arrayList4.add(shieldViewCell);
                    }
                }
            }
        }
        if (arrayList4.size() > 0) {
            this.nodeAdapter.changeUpdateStatus(false);
            this.nodeAdapter.dispatchDestoryAgentStatus(arrayList4);
        }
        if (arrayList3 != null) {
            Iterator<AgentInterface> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String cellName2 = getCellName(it2.next());
                HashMap<String, i> hashMap2 = this.cells;
                if (hashMap2 == null) {
                    throw new o("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                }
                if (hashMap2.containsKey(cellName2)) {
                    HashMap<String, i> hashMap3 = this.cells;
                    if (hashMap3 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                    }
                    x.b(hashMap3).remove(cellName2);
                }
            }
        }
        if (arrayList2 != null) {
            Object clone = this.cells.clone();
            if (clone == null) {
                throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.dianping.agentsdk.framework.Cell>");
            }
            HashMap hashMap4 = (HashMap) clone;
            Iterator<AgentInterface> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                AgentInterface next = it3.next();
                for (Map.Entry entry : hashMap4.entrySet()) {
                    String str = (String) entry.getKey();
                    i iVar2 = (i) entry.getValue();
                    if (iVar2.b == next) {
                        this.cells.remove(str);
                        iVar2.c = getCellName(next);
                        iVar2.l = null;
                        iVar2.k = null;
                        HashMap<String, i> hashMap5 = this.cells;
                        String str2 = iVar2.c;
                        if (str2 != null) {
                            str = str2;
                        }
                        hashMap5.put(str, iVar2);
                    }
                }
            }
        }
        if (arrayList != null) {
            Iterator<AgentInterface> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                AgentInterface next2 = it4.next();
                i iVar3 = new i();
                iVar3.b = next2;
                h.a((Object) next2, "addAgent");
                iVar3.d = next2.getAgentCellName();
                iVar3.c = getCellName(next2);
                HashMap<String, i> hashMap6 = this.cells;
                String str3 = iVar3.c;
                if (str3 == null) {
                    str3 = next2.getHostName();
                    h.a((Object) str3, "addAgent.hostName");
                }
                hashMap6.put(str3, iVar3);
            }
        }
        this.sortedCells = new ArrayList<>(this.cells.values());
        kotlin.collections.h.a((List) this.sortedCells, (Comparator) this.cellComparator);
        ArrayList<i> arrayList5 = this.sortedCells;
        h.b(arrayList5, "$this$distinct");
        h.b(arrayList5, "$this$toMutableSet");
        kotlin.collections.h.b((Iterable) (arrayList5 instanceof Collection ? new LinkedHashSet(arrayList5) : (Set) kotlin.collections.h.a((Iterable) arrayList5, new LinkedHashSet())));
        for (i iVar4 : this.sortedCells) {
            if (i == 0) {
                iVar4.k = null;
                iVar4.l = null;
            } else {
                iVar4.k = this.sortedCells.get(i - 1);
                i iVar5 = iVar4.k;
                if (iVar5 != null) {
                    iVar5.l = iVar4;
                }
                if (i == this.sortedCells.size() - 1) {
                    iVar4.l = null;
                }
            }
            i++;
        }
        notifyCellChanged();
    }

    @Override // com.dianping.agentsdk.framework.j
    public final void notifyCellChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a81244371d48794a6facd9b55a4430e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a81244371d48794a6facd9b55a4430e6");
            return;
        }
        this.handler.removeCallbacks(this.notifyCellChanged);
        this.handler.postAtFrontOfQueue(this.notifyCellChanged);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    @NotNull
    public final ShieldSectionCellItem convertCellInterfaceToItem(@NotNull af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5f13796b58597469eafd87d0135b06c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5f13796b58597469eafd87d0135b06c");
        }
        h.b(afVar, "sci");
        return NodeItemConvertUtils.Companion.convertInterfaceToItem(afVar, this.mContext, this.processorHolder);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public final int getMaxTopViewY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78660073d6f320c54cc10c0096caf3a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78660073d6f320c54cc10c0096caf3a8")).intValue() : this.nodeAdapter.getMaxTopViewY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAgentContainer() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.updateAgentContainer():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r0 == null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.dianping.shield.node.cellnode.ShieldViewCell updateOrInitCell(com.dianping.agentsdk.framework.i r12, com.dianping.shield.node.cellnode.ShieldCellGroup r13, java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldSection> r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.manager.ShieldNodeCellManager.changeQuickRedirect
            java.lang.String r10 = "e81241b80a9e7e9d9ee90dc41548a2f6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.dianping.shield.node.cellnode.ShieldViewCell r12 = (com.dianping.shield.node.cellnode.ShieldViewCell) r12
            return r12
        L24:
            com.dianping.shield.node.cellnode.ShieldViewCell r0 = r12.h
            if (r0 == 0) goto L88
            com.dianping.shield.utils.RangeRemoveableArrayList<com.dianping.shield.node.cellnode.ShieldSection> r0 = r0.shieldSections
            if (r0 == 0) goto L88
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r14.addAll(r1)
            com.dianping.shield.node.cellnode.ShieldViewCell r1 = r12.h
            if (r1 == 0) goto L38
            r1.groupParent = r13
        L38:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            com.dianping.shield.node.cellnode.ShieldSection r1 = (com.dianping.shield.node.cellnode.ShieldSection) r1
            com.dianping.shield.utils.RangeRemoveableArrayList<com.dianping.shield.node.cellnode.ShieldRow> r1 = r1.shieldRows
            if (r1 == 0) goto L3e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            com.dianping.shield.node.cellnode.ShieldRow r2 = (com.dianping.shield.node.cellnode.ShieldRow) r2
            r3 = 0
            if (r2 == 0) goto L66
            r2.setPath(r3)
        L66:
            if (r2 == 0) goto L54
            java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldDisplayNode> r2 = r2.shieldDisplayNodes
            if (r2 == 0) goto L54
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L72:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r2.next()
            com.dianping.shield.node.cellnode.ShieldDisplayNode r4 = (com.dianping.shield.node.cellnode.ShieldDisplayNode) r4
            if (r4 == 0) goto L72
            r4.setPath(r3)
            goto L72
        L84:
            com.dianping.shield.node.cellnode.ShieldViewCell r0 = r12.h
            if (r0 != 0) goto L8c
        L88:
            com.dianping.shield.node.cellnode.ShieldViewCell r0 = r11.createShieldViewCell(r12, r13, r14)
        L8c:
            java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldViewCell> r13 = r13.shieldViewCells
            if (r13 == 0) goto L95
            int r13 = r13.size()
            goto L96
        L95:
            r13 = -1
        L96:
            r0.viewCellIndex = r13
            r12.h = r0
            com.dianping.shield.manager.feature.LoopCellGroupsCollector r12 = r11.looper
            if (r12 == 0) goto La1
            r12.clearAllActions()
        La1:
            java.util.ArrayList<com.dianping.shield.manager.feature.CellManagerFeatureInterface> r12 = r11.featureList
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        La9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lb9
            java.lang.Object r13 = r12.next()
            com.dianping.shield.manager.feature.CellManagerFeatureInterface r13 = (com.dianping.shield.manager.feature.CellManagerFeatureInterface) r13
            r13.onCellNodeRefresh(r0)
            goto La9
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.updateOrInitCell(com.dianping.agentsdk.framework.i, com.dianping.shield.node.cellnode.ShieldCellGroup, java.util.ArrayList):com.dianping.shield.node.cellnode.ShieldViewCell");
    }

    @Nullable
    public final String getCellName(@Nullable AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c8a84e9527ac824f70b15da32bc0d09", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c8a84e9527ac824f70b15da32bc0d09");
        }
        if (agentInterface != null) {
            if (TextUtils.isEmpty(agentInterface.getIndex())) {
                return agentInterface.getHostName();
            }
            return agentInterface.getIndex() + CommonConstant.Symbol.COLON + agentInterface.getHostName();
        }
        return null;
    }

    private final boolean isSameGroup(CellGroupIndex cellGroupIndex, CellGroupIndex cellGroupIndex2) {
        Object[] objArr = {cellGroupIndex, cellGroupIndex2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e44f05e85002b562f2fc59ffb1d49a50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e44f05e85002b562f2fc59ffb1d49a50")).booleanValue();
        }
        if (cellGroupIndex == null || cellGroupIndex2 == null || (!h.a((Object) cellGroupIndex.getGroupIndex(), (Object) cellGroupIndex2.getGroupIndex()))) {
            return false;
        }
        if ((h.a((Object) cellGroupIndex.getGroupIndex(), (Object) cellGroupIndex2.getGroupIndex()) && (!h.a((Object) cellGroupIndex.getInnerIndex(), (Object) cellGroupIndex2.getInnerIndex()))) || !h.a((Object) cellGroupIndex.getGroupIndex(), (Object) cellGroupIndex2.getGroupIndex()) || !h.a((Object) cellGroupIndex.getInnerIndex(), (Object) cellGroupIndex2.getInnerIndex()) || cellGroupIndex.getChilds() == null || cellGroupIndex.getChilds() == null || cellGroupIndex2.getChilds() == null) {
            return true;
        }
        return isSameGroup(cellGroupIndex.getChilds(), cellGroupIndex2.getChilds());
    }

    private final ShieldViewCell createShieldViewCell(i iVar, ShieldCellGroup shieldCellGroup, ArrayList<ShieldSection> arrayList) {
        ShieldSectionCellItem convertInterfaceToItem;
        af sectionCellInterface;
        Object[] objArr = {iVar, shieldCellGroup, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8067fe2afa9e3efd9582bc6b7662bbfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewCell) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8067fe2afa9e3efd9582bc6b7662bbfc");
        }
        AgentInterface agentInterface = iVar.b;
        if (agentInterface == null || (convertInterfaceToItem = agentInterface.getSectionCellItem()) == null) {
            AgentInterface agentInterface2 = iVar.b;
            convertInterfaceToItem = (agentInterface2 == null || (sectionCellInterface = agentInterface2.getSectionCellInterface()) == null) ? null : NodeItemConvertUtils.Companion.convertInterfaceToItem(sectionCellInterface, this.mContext, this.processorHolder);
        }
        ShieldViewCell shieldViewCell = iVar.h;
        if (shieldViewCell != null) {
            if (!shieldViewCell.isEmpty() && h.a(shieldViewCell.getCellItem(), convertInterfaceToItem)) {
                shieldViewCell.clear();
                shieldViewCell.key = iVar.c;
                shieldViewCell.name = iVar.d;
                shieldViewCell.owner = iVar.b;
                shieldViewCell.groupParent = shieldCellGroup;
                if (convertInterfaceToItem.shouldShow) {
                    shieldViewCell.shouldShow = true;
                    this.processorHolder.getCellProcessorChain().startProcessor(convertInterfaceToItem, shieldViewCell, arrayList);
                } else {
                    shieldViewCell.shouldShow = false;
                }
            } else {
                shieldViewCell = initShieldViewCell(iVar, shieldCellGroup, arrayList, convertInterfaceToItem);
            }
            if (shieldViewCell != null) {
                return shieldViewCell;
            }
        }
        return initShieldViewCell(iVar, shieldCellGroup, arrayList, convertInterfaceToItem);
    }

    private final ShieldViewCell initShieldViewCell(i iVar, ShieldCellGroup shieldCellGroup, ArrayList<ShieldSection> arrayList, ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {iVar, shieldCellGroup, arrayList, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2643b3705cf80ef21b5b4eb260ca848", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewCell) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2643b3705cf80ef21b5b4eb260ca848");
        }
        ShieldViewCell shieldViewCell = new ShieldViewCell();
        shieldViewCell.key = iVar.c;
        shieldViewCell.name = iVar.d;
        shieldViewCell.owner = iVar.b;
        shieldViewCell.groupParent = shieldCellGroup;
        if (shieldSectionCellItem != null) {
            if (shieldSectionCellItem.shouldShow) {
                shieldViewCell.shouldShow = true;
                this.processorHolder.getCellProcessorChain().startProcessor(shieldSectionCellItem, shieldViewCell, arrayList);
            } else {
                shieldViewCell.shouldShow = false;
            }
        }
        return shieldViewCell;
    }

    private final CellGroupIndex createCellGroupIndex(String str) {
        String a;
        String b;
        String a2;
        String b2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe2f2cdde28bae8221de603a1047b4b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellGroupIndex) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe2f2cdde28bae8221de603a1047b4b1");
        }
        CellGroupIndex cellGroupIndex = new CellGroupIndex();
        if (g.a((CharSequence) str, (char) CommonConstant.Symbol.DOT_CHAR, 0, false, 6, (Object) null) < 0) {
            return null;
        }
        a = g.a(str, (char) CommonConstant.Symbol.DOT_CHAR, str);
        cellGroupIndex.setGroupIndex(a);
        b = g.b(str, (char) CommonConstant.Symbol.DOT_CHAR, str);
        if (g.a((CharSequence) b, (char) CommonConstant.Symbol.DOT_CHAR, 0, false, 6, (Object) null) >= 0) {
            a2 = g.a(b, (char) CommonConstant.Symbol.DOT_CHAR, b);
            cellGroupIndex.setInnerIndex(a2);
            b2 = g.b(b, (char) CommonConstant.Symbol.DOT_CHAR, b);
            cellGroupIndex.setChilds(createCellGroupIndex(b2));
        } else {
            cellGroupIndex.setInnerIndex(b);
        }
        return cellGroupIndex;
    }

    @Override // com.dianping.agentsdk.framework.j
    public final void updateAgentCell(@NotNull AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77a4ab29d0e623e775a8d1d49802102a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77a4ab29d0e623e775a8d1d49802102a");
            return;
        }
        h.b(agentInterface, "agent");
        Boolean enableFrozen = this.frozenInfo.getEnableFrozen();
        if (enableFrozen != null && enableFrozen.booleanValue()) {
            VisibleItemsInfo findVisibleItems = findVisibleItems();
            updateAgentCell(agentInterface, ap.UPDATE_ALL, 0, 0, 0);
            if (findVisibleItems.getRowItems().size() > 0) {
                PositionInfo anchorItemPositionInfo = getAnchorItemPositionInfo(findVisibleItems);
                if (anchorItemPositionInfo.getAgent() == null || anchorItemPositionInfo.getSection() == -1 || anchorItemPositionInfo.getRow() == -1) {
                    return;
                }
                AgentScrollerParams smooth = AgentScrollerParams.toRow(anchorItemPositionInfo.getAgent(), anchorItemPositionInfo.getSection(), anchorItemPositionInfo.getRow()).setOffset(anchorItemPositionInfo.getOffset()).setSmooth(false);
                h.a((Object) smooth, "AgentScrollerParams.toRo….offset).setSmooth(false)");
                scrollToNode(smooth);
                return;
            }
            return;
        }
        updateAgentCell(agentInterface, ap.UPDATE_ALL, 0, 0, 0);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager$PositionInfo;", "", "agent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "section", "", "row", "offset", "(Lcom/dianping/shield/manager/ShieldNodeCellManager;Lcom/dianping/agentsdk/framework/AgentInterface;III)V", "getAgent", "()Lcom/dianping/agentsdk/framework/AgentInterface;", "setAgent", "(Lcom/dianping/agentsdk/framework/AgentInterface;)V", "getOffset", "()I", "setOffset", "(I)V", "getRow", "setRow", "getSection", "setSection", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PositionInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private AgentInterface agent;
        private int offset;
        private int row;
        private int section;

        public PositionInfo(@Nullable AgentInterface agentInterface, int i, int i2, int i3) {
            Object[] objArr = {ShieldNodeCellManager.this, agentInterface, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faf3651b3587d74dc3bab2240e6dbad8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faf3651b3587d74dc3bab2240e6dbad8");
                return;
            }
            this.agent = agentInterface;
            this.section = i;
            this.row = i2;
            this.offset = i3;
        }

        @Nullable
        public final AgentInterface getAgent() {
            return this.agent;
        }

        public final int getSection() {
            return this.section;
        }

        public final void setAgent(@Nullable AgentInterface agentInterface) {
            this.agent = agentInterface;
        }

        public final void setSection(int i) {
            this.section = i;
        }

        public /* synthetic */ PositionInfo(ShieldNodeCellManager shieldNodeCellManager, AgentInterface agentInterface, int i, int i2, int i3, int i4, kotlin.jvm.internal.f fVar) {
            this((i4 & 1) != 0 ? null : agentInterface, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? 0 : i3);
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getRow() {
            return this.row;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setRow(int i) {
            this.row = i;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0004j\b\u0012\u0004\u0012\u00020\u000f`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager$VisibleItemsInfo;", "", "(Lcom/dianping/shield/manager/ShieldNodeCellManager;)V", "itemOffsets", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemOffsets", "()Ljava/util/ArrayList;", "setItemOffsets", "(Ljava/util/ArrayList;)V", "rowItems", "Lcom/dianping/shield/node/useritem/RowItem;", "getRowItems", "viewItems", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItems", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class VisibleItemsInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private ArrayList<Integer> itemOffsets;
        @NotNull
        private final ArrayList<RowItem> rowItems;
        @NotNull
        private final ArrayList<ViewItem> viewItems;

        public VisibleItemsInfo() {
            Object[] objArr = {ShieldNodeCellManager.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "837e45e39e599e19b74d0cb0c1a649c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "837e45e39e599e19b74d0cb0c1a649c9");
                return;
            }
            this.viewItems = new ArrayList<>();
            this.rowItems = new ArrayList<>();
            this.itemOffsets = new ArrayList<>();
        }

        @NotNull
        public final ArrayList<ViewItem> getViewItems() {
            return this.viewItems;
        }

        @NotNull
        public final ArrayList<RowItem> getRowItems() {
            return this.rowItems;
        }

        @NotNull
        public final ArrayList<Integer> getItemOffsets() {
            return this.itemOffsets;
        }

        public final void setItemOffsets(@NotNull ArrayList<Integer> arrayList) {
            Object[] objArr = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce555d410eae2333d30e845b859de6d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce555d410eae2333d30e845b859de6d3");
                return;
            }
            h.b(arrayList, "<set-?>");
            this.itemOffsets = arrayList;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager$FrozenInfo;", "", "enableFrozen", "", "frozenModuleKey", "", "(Lcom/dianping/shield/manager/ShieldNodeCellManager;Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnableFrozen", "()Ljava/lang/Boolean;", "setEnableFrozen", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFrozenModuleKey", "()Ljava/lang/String;", "setFrozenModuleKey", "(Ljava/lang/String;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class FrozenInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private Boolean enableFrozen;
        @Nullable
        private String frozenModuleKey;

        public FrozenInfo(@Nullable Boolean bool, @Nullable String str) {
            Object[] objArr = {ShieldNodeCellManager.this, bool, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2e2a8e5170ef56f1187ea5913f07f3f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2e2a8e5170ef56f1187ea5913f07f3f");
                return;
            }
            this.enableFrozen = bool;
            this.frozenModuleKey = str;
        }

        public /* synthetic */ FrozenInfo(ShieldNodeCellManager shieldNodeCellManager, Boolean bool, String str, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str);
        }

        @Nullable
        public final Boolean getEnableFrozen() {
            return this.enableFrozen;
        }

        @Nullable
        public final String getFrozenModuleKey() {
            return this.frozenModuleKey;
        }

        public final void setEnableFrozen(@Nullable Boolean bool) {
            this.enableFrozen = bool;
        }

        public final void setFrozenModuleKey(@Nullable String str) {
            this.frozenModuleKey = str;
        }
    }

    public final void setFrozenInfo(@Nullable Boolean bool, @Nullable String str) {
        Object[] objArr = {bool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2530c8b1152e0221290558b248a71fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2530c8b1152e0221290558b248a71fac");
            return;
        }
        this.frozenInfo.setEnableFrozen(bool);
        this.frozenInfo.setFrozenModuleKey(str);
    }

    private final VisibleItemsInfo findVisibleItems() {
        ShieldSection shieldSection;
        ShieldViewCell shieldViewCell;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d87e0c02f622880903b111000bae0857", RobustBitConfig.DEFAULT_VALUE)) {
            return (VisibleItemsInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d87e0c02f622880903b111000bae0857");
        }
        ShieldLayoutManagerInterface shieldLayoutManagerInterface = this.shieldLayoutManager;
        int findFirstVisibleItemPosition = shieldLayoutManagerInterface != null ? shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) : -1;
        ShieldLayoutManagerInterface shieldLayoutManagerInterface2 = this.shieldLayoutManager;
        int findLastVisibleItemPosition = shieldLayoutManagerInterface2 != null ? shieldLayoutManagerInterface2.findLastVisibleItemPosition(false) : -1;
        VisibleItemsInfo visibleItemsInfo = new VisibleItemsInfo();
        if (findFirstVisibleItemPosition != -1 && findLastVisibleItemPosition != -1 && findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i = findLastVisibleItemPosition + 1;
            while (findFirstVisibleItemPosition < i) {
                ShieldDisplayNode displayNode = this.nodeAdapter.getDisplayNode(findFirstVisibleItemPosition);
                if (displayNode != null) {
                    ViewItem viewItem = displayNode.getViewItem();
                    ShieldRow shieldRow = displayNode.rowParent;
                    String str = null;
                    RowItem rowItem = shieldRow != null ? shieldRow.getRowItem() : null;
                    DisplayNodeContainer displayNodeContainer = displayNode.containerView;
                    Integer valueOf = displayNodeContainer != null ? Integer.valueOf(displayNodeContainer.getTop()) : null;
                    ShieldRow shieldRow2 = displayNode.rowParent;
                    if (shieldRow2 != null && (shieldSection = shieldRow2.sectionParent) != null && (shieldViewCell = shieldSection.cellParent) != null) {
                        str = shieldViewCell.key;
                    }
                    String moduleKey = getModuleKey(str);
                    if ((this.frozenInfo.getFrozenModuleKey() == null || (this.frozenInfo.getFrozenModuleKey() != null && h.a((Object) moduleKey, (Object) this.frozenInfo.getFrozenModuleKey()))) && rowItem != null && valueOf != null) {
                        visibleItemsInfo.getViewItems().add(viewItem);
                        visibleItemsInfo.getRowItems().add(rowItem);
                        visibleItemsInfo.getItemOffsets().add(valueOf);
                    }
                }
                findFirstVisibleItemPosition++;
            }
        }
        return visibleItemsInfo;
    }

    private final String getModuleKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca3baf5c282152f96f79a66e076b33c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca3baf5c282152f96f79a66e076b33c9");
        }
        if (str != null) {
            List<String> a = g.a((CharSequence) str, new String[]{CommonConstant.Symbol.COLON}, false, 0);
            return a.size() > 1 ? a.get(1) : "";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022c A[EDGE_INSN: B:102:0x022c->B:94:0x022c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224 A[LOOP:1: B:21:0x007e->B:91:0x0224, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.dianping.shield.manager.ShieldNodeCellManager.PositionInfo getAnchorItemPositionInfo(com.dianping.shield.manager.ShieldNodeCellManager.VisibleItemsInfo r19) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.getAnchorItemPositionInfo(com.dianping.shield.manager.ShieldNodeCellManager$VisibleItemsInfo):com.dianping.shield.manager.ShieldNodeCellManager$PositionInfo");
    }

    @Override // com.dianping.agentsdk.framework.an
    public final void updateAgentCell(@Nullable AgentInterface agentInterface, @Nullable ap apVar, int i, int i2, int i3) {
        ShieldViewCell shieldViewCell;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2;
        ShieldSection shieldSection2;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList3;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList4;
        ShieldSection shieldSection3;
        Object[] objArr = {agentInterface, apVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8546f67f6e3e748a16059ac65a1182e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8546f67f6e3e748a16059ac65a1182e");
            return;
        }
        i findCellForAgent = findCellForAgent(agentInterface);
        if (findCellForAgent != null && findCellForAgent.h != null && apVar != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[apVar.ordinal()]) {
                case 1:
                    updateCellAll(findCellForAgent);
                    break;
                case 2:
                    insertSection(findCellForAgent, i, i3);
                    break;
                case 3:
                    removeSection(findCellForAgent, i, i3);
                    break;
                case 4:
                    updateSection(findCellForAgent, i, i3);
                    break;
                case 5:
                    SectionItem sectionItemOfPosition = getSectionItemOfPosition(findCellForAgent, i);
                    if (sectionItemOfPosition == null) {
                        return;
                    }
                    ShieldViewCell shieldViewCell2 = findCellForAgent.h;
                    if (shieldViewCell2 != null && (rangeRemoveableArrayList = shieldViewCell2.shieldSections) != null && (shieldSection = rangeRemoveableArrayList.get(i)) != null) {
                        h.a((Object) shieldSection, "shieldSection");
                        updateRowProvider(sectionItemOfPosition, shieldSection);
                        shieldSection.notifyRowInsert(i2, i3);
                        break;
                    }
                    break;
                case 6:
                    ShieldViewCell shieldViewCell3 = findCellForAgent.h;
                    if (shieldViewCell3 != null && (rangeRemoveableArrayList2 = shieldViewCell3.shieldSections) != null && (shieldSection2 = rangeRemoveableArrayList2.get(i)) != null) {
                        shieldSection2.notifyRowRemove(i2, i3);
                        if (shieldSection2.getRange() == 0) {
                            ShieldViewCell shieldViewCell4 = findCellForAgent.h;
                            if (shieldViewCell4 != null && (rangeRemoveableArrayList3 = shieldViewCell4.shieldSections) != null) {
                                rangeRemoveableArrayList3.remove(i);
                            }
                            markElseNodeOutDate(findCellForAgent, i);
                            break;
                        } else {
                            SectionItem sectionItemOfPosition2 = getSectionItemOfPosition(findCellForAgent, i);
                            if (sectionItemOfPosition2 != null) {
                                h.a((Object) shieldSection2, "targetSection");
                                updateRowProvider(sectionItemOfPosition2, shieldSection2);
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 7:
                    SectionItem sectionItemOfPosition3 = getSectionItemOfPosition(findCellForAgent, i);
                    if (sectionItemOfPosition3 == null) {
                        return;
                    }
                    ShieldViewCell shieldViewCell5 = findCellForAgent.h;
                    if (shieldViewCell5 != null && (rangeRemoveableArrayList4 = shieldViewCell5.shieldSections) != null && (shieldSection3 = rangeRemoveableArrayList4.get(i)) != null) {
                        h.a((Object) shieldSection3, "shieldSection");
                        updateRowProvider(sectionItemOfPosition3, shieldSection3);
                        shieldSection3.notifyRowUpdate(i2, i3);
                        break;
                    }
                    break;
            }
        }
        if (findCellForAgent == null || (shieldViewCell = findCellForAgent.h) == null) {
            return;
        }
        LoopCellGroupsCollector loopCellGroupsCollector = this.looper;
        if (loopCellGroupsCollector != null) {
            loopCellGroupsCollector.clearAllActions();
        }
        for (CellManagerFeatureInterface cellManagerFeatureInterface : this.featureList) {
            cellManagerFeatureInterface.onCellNodeRefresh(shieldViewCell);
            cellManagerFeatureInterface.onAdapterNotify(this.cellGroups);
        }
    }

    private final void updateCellAll(i iVar) {
        RecyclerView recyclerView;
        ShieldCellGroup shieldCellGroup;
        ArrayList<ShieldViewCell> arrayList;
        int i = 0;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52be95c3af987dccf8443575b0207a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52be95c3af987dccf8443575b0207a64");
            return;
        }
        ArrayList<ShieldSection> arrayList2 = new ArrayList<>();
        ShieldViewCell shieldViewCell = iVar.h;
        int i2 = shieldViewCell != null ? shieldViewCell.viewCellIndex : -1;
        ShieldViewCell shieldViewCell2 = iVar.h;
        ShieldViewCell createShieldViewCell = createShieldViewCell(iVar, shieldViewCell2 != null ? shieldViewCell2.groupParent : null, arrayList2);
        createShieldViewCell.viewCellIndex = i2;
        ShieldViewCell shieldViewCell3 = iVar.h;
        if (shieldViewCell3 != null && (shieldCellGroup = shieldViewCell3.groupParent) != null && (arrayList = shieldCellGroup.shieldViewCells) != null) {
            arrayList.set(i2, createShieldViewCell);
        }
        iVar.h = createShieldViewCell;
        if (this.isBuildingCellChain) {
            this.updateAgentCellInterrupted = true;
            return;
        }
        ShieldSection a = iVar.a();
        int indexOf = a != null ? this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().indexOf((Object) a) + 1 : 0;
        ShieldSection b = iVar.b();
        int indexOf2 = b != null ? this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().indexOf((Object) b) : -1;
        if (indexOf2 < 0) {
            indexOf2 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().size();
        }
        ShieldNodeCellManager shieldNodeCellManager = this;
        boolean z = false;
        for (Object obj : arrayList2) {
            int i3 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            ShieldSection shieldSection = (ShieldSection) obj;
            SectionItem sectionItem = shieldSection.getSectionItem();
            if (shieldSection.getEnableLayoutAnimation()) {
                z = true;
            }
            if ((shieldSection instanceof StaggeredGridSection) && (sectionItem instanceof StaggeredGridSectionItem)) {
                shieldNodeCellManager.processorHolder.getShieldSectionManager().setHasWaterfallSection(true);
            }
            i = i3;
        }
        if (z) {
            supportAnimator();
        } else {
            RecyclerView recyclerView2 = this.recyclerView;
            if (h.a(recyclerView2 != null ? recyclerView2.getItemAnimator() : null, this.itemAnimator) && (recyclerView = this.recyclerView) != null) {
                recyclerView.setItemAnimator(null);
            }
        }
        if (indexOf <= indexOf2) {
            this.processorHolder.getShieldSectionManager().setLayoutManager(this.shieldLayoutManager);
            this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().replaceWithRemoveAndInsert(indexOf, indexOf2, arrayList2);
        }
    }

    private final void supportAnimator() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b30d43438f2ae88fc1eed2878c6b4385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b30d43438f2ae88fc1eed2878c6b4385");
            return;
        }
        if (this.itemAnimator == null) {
            this.itemAnimator = new ShieldDefaultItemAnimator();
            RecyclerView.ItemAnimator itemAnimator = this.itemAnimator;
            if (!(itemAnimator instanceof ShieldDefaultItemAnimator)) {
                itemAnimator = null;
            }
            ShieldDefaultItemAnimator shieldDefaultItemAnimator = (ShieldDefaultItemAnimator) itemAnimator;
            if (shieldDefaultItemAnimator != null) {
                shieldDefaultItemAnimator.setSupportsChangeAnimations(false);
            }
        }
        if (!(!h.a(this.recyclerView != null ? recyclerView.getItemAnimator() : null, this.itemAnimator)) || (recyclerView2 = this.recyclerView) == null) {
            return;
        }
        recyclerView2.setItemAnimator(this.itemAnimator);
    }

    private final boolean hasSectionCellChanged(ArrayList<RowItem> arrayList, ArrayList<RowItem> arrayList2) {
        Object[] objArr = {arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52feb37d9100c3b61560271f252c6358", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52feb37d9100c3b61560271f252c6358")).booleanValue();
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        int size = arrayList.size();
        if (size != arrayList2.size()) {
            return true;
        }
        for (int i = 0; i < size; i++) {
            if (!h.a(arrayList.get(i), arrayList2.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final void insertSection(i iVar, int i, int i2) {
        ShieldSectionCellItem convertInterfaceToItem;
        af sectionCellInterface;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2;
        ArrayList<SectionItem> arrayList;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList3;
        ShieldSection shieldSection;
        ArrayList<SectionItem> arrayList2;
        Object[] objArr = {iVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54f203808be1a4b76eba982d612d55b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54f203808be1a4b76eba982d612d55b8");
            return;
        }
        AgentInterface agentInterface = iVar.b;
        ShieldSection shieldSection2 = null;
        if (agentInterface == null || (convertInterfaceToItem = agentInterface.getSectionCellItem()) == null) {
            AgentInterface agentInterface2 = iVar.b;
            convertInterfaceToItem = (agentInterface2 == null || (sectionCellInterface = agentInterface2.getSectionCellInterface()) == null) ? null : NodeItemConvertUtils.Companion.convertInterfaceToItem(sectionCellInterface, this.mContext, this.processorHolder);
        }
        ArrayList arrayList3 = new ArrayList();
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            SectionItem sectionItem = (convertInterfaceToItem == null || (arrayList2 = convertInterfaceToItem.sectionItems) == null) ? null : arrayList2.get(i4);
            if (sectionItem == null || (shieldSection = ExtensionsRegistry.INSTANCE.createSectionNodeInstance(sectionItem)) == null) {
                shieldSection = new ShieldSection();
            }
            shieldSection.cellParent = iVar.h;
            arrayList3.add(shieldSection);
        }
        ShieldViewCell shieldViewCell = iVar.h;
        if (shieldViewCell != null && (rangeRemoveableArrayList3 = shieldViewCell.shieldSections) != null) {
            rangeRemoveableArrayList3.addAll(i, arrayList3);
        }
        for (int i5 = i; i5 < i3; i5++) {
            SectionItem sectionItem2 = (convertInterfaceToItem == null || (arrayList = convertInterfaceToItem.sectionItems) == null) ? null : arrayList.get(i5);
            ShieldViewCell shieldViewCell2 = iVar.h;
            ShieldSection shieldSection3 = (shieldViewCell2 == null || (rangeRemoveableArrayList2 = shieldViewCell2.shieldSections) == null) ? null : rangeRemoveableArrayList2.get(i5);
            if (sectionItem2 != null && shieldSection3 != null) {
                this.processorHolder.processShieldSection(sectionItem2, shieldSection3);
            }
        }
        markElseNodeOutDate(iVar, i);
        if (this.isBuildingCellChain) {
            this.updateAgentCellInterrupted = true;
            return;
        }
        if (i > 0) {
            ShieldViewCell shieldViewCell3 = iVar.h;
            if (shieldViewCell3 != null && (rangeRemoveableArrayList = shieldViewCell3.shieldSections) != null) {
                shieldSection2 = rangeRemoveableArrayList.get(i - 1);
            }
        } else {
            shieldSection2 = iVar.a();
        }
        this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().addAll(this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().indexOf((Object) shieldSection2) + 1, arrayList3);
    }

    private final void removeSection(i iVar, int i, int i2) {
        ShieldSection a;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2;
        Object[] objArr = {iVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "673c3e27aec1e058af36cdadc812c1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "673c3e27aec1e058af36cdadc812c1ff");
            return;
        }
        ShieldViewCell shieldViewCell = iVar.h;
        if (shieldViewCell != null && (rangeRemoveableArrayList2 = shieldViewCell.shieldSections) != null) {
            rangeRemoveableArrayList2.removeRange(i, i + i2);
        }
        markElseNodeOutDate(iVar, i);
        if (this.isBuildingCellChain) {
            this.updateAgentCellInterrupted = true;
            return;
        }
        if (i > 0) {
            ShieldViewCell shieldViewCell2 = iVar.h;
            a = (shieldViewCell2 == null || (rangeRemoveableArrayList = shieldViewCell2.shieldSections) == null) ? null : rangeRemoveableArrayList.get(i - 1);
        } else {
            a = iVar.a();
        }
        int indexOf = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().indexOf((Object) a) + 1;
        this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().removeRange(indexOf, i2 + indexOf);
    }

    private final void updateSection(i iVar, int i, int i2) {
        ShieldViewCell shieldViewCell;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList3;
        Object[] objArr = {iVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8643b7e424f98e261b26fe2a0fae3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8643b7e424f98e261b26fe2a0fae3c3");
            return;
        }
        ArrayList arrayList = new ArrayList();
        RangeDispatcher sectionRangeDispatcher = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
        ShieldViewCell shieldViewCell2 = iVar.h;
        int indexOf = sectionRangeDispatcher.indexOf((Object) ((shieldViewCell2 == null || (rangeRemoveableArrayList3 = shieldViewCell2.shieldSections) == null) ? null : rangeRemoveableArrayList3.get(i)));
        int i3 = i2 + i;
        while (i < i3) {
            SectionItem sectionItemOfPosition = getSectionItemOfPosition(iVar, i);
            if (sectionItemOfPosition != null && (shieldViewCell = iVar.h) != null && (rangeRemoveableArrayList = shieldViewCell.shieldSections) != null && (shieldSection = rangeRemoveableArrayList.get(i)) != null) {
                ShieldSection createSectionNodeInstance = ExtensionsRegistry.INSTANCE.createSectionNodeInstance(sectionItemOfPosition);
                createSectionNodeInstance.cellParent = shieldSection.cellParent;
                ShieldViewCell shieldViewCell3 = iVar.h;
                if (shieldViewCell3 != null && (rangeRemoveableArrayList2 = shieldViewCell3.shieldSections) != null) {
                    rangeRemoveableArrayList2.set(i, createSectionNodeInstance);
                }
                this.processorHolder.processShieldSection(sectionItemOfPosition, createSectionNodeInstance);
                arrayList.add(createSectionNodeInstance);
            }
            i++;
        }
        if (this.isBuildingCellChain) {
            this.updateAgentCellInterrupted = true;
        } else if (indexOf >= 0) {
            this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher().setAll(indexOf, arrayList);
        }
    }

    private final void markElseNodeOutDate(i iVar, int i) {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2;
        ArrayList<ShieldDisplayNode> arrayList;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList3;
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5c7c39f7eb7a47194f79b875014335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5c7c39f7eb7a47194f79b875014335");
            return;
        }
        ShieldViewCell shieldViewCell = iVar.h;
        int a = (shieldViewCell == null || (rangeRemoveableArrayList3 = shieldViewCell.shieldSections) == null) ? -1 : kotlin.collections.h.a((List) rangeRemoveableArrayList3);
        if (i > a) {
            return;
        }
        while (true) {
            ShieldViewCell shieldViewCell2 = iVar.h;
            if (shieldViewCell2 != null && (rangeRemoveableArrayList = shieldViewCell2.shieldSections) != null && (shieldSection = rangeRemoveableArrayList.get(i)) != null && (rangeRemoveableArrayList2 = shieldSection.shieldRows) != null) {
                for (ShieldRow shieldRow : rangeRemoveableArrayList2) {
                    if (shieldRow != null) {
                        shieldRow.setPath(null);
                    }
                    if (shieldRow != null && (arrayList = shieldRow.shieldDisplayNodes) != null) {
                        for (ShieldDisplayNode shieldDisplayNode : arrayList) {
                            if (shieldDisplayNode != null) {
                                shieldDisplayNode.setPath(null);
                            }
                        }
                    }
                }
            }
            if (i == a) {
                return;
            }
            i++;
        }
    }

    private final SectionItem getSectionItemOfPosition(i iVar, int i) {
        af sectionCellInterface;
        ShieldSectionCellItem sectionCellItem;
        ArrayList<SectionItem> arrayList;
        SectionItem sectionItem;
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d77316ec67c3e0d831c46fbb2d1a46d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d77316ec67c3e0d831c46fbb2d1a46d");
        }
        AgentInterface agentInterface = iVar.b;
        if (agentInterface == null || (sectionCellItem = agentInterface.getSectionCellItem()) == null || (arrayList = sectionCellItem.sectionItems) == null || (sectionItem = (SectionItem) kotlin.collections.h.a((List<? extends Object>) arrayList, i)) == null) {
            AgentInterface agentInterface2 = iVar.b;
            if (agentInterface2 == null || (sectionCellInterface = agentInterface2.getSectionCellInterface()) == null || i >= sectionCellInterface.getSectionCount()) {
                return null;
            }
            SectionItem sectionItem2 = new SectionItem();
            this.processorHolder.getSectionInterfaceProcessorChain().startProcessor(sectionCellInterface, sectionItem2, Integer.valueOf(i));
            return sectionItem2;
        }
        return sectionItem;
    }

    private final void updateRowProvider(SectionItem sectionItem, ShieldSection shieldSection) {
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8d660f870c07c7367c1a3fea24074d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8d660f870c07c7367c1a3fea24074d6");
        } else if (sectionItem.isLazyLoad) {
            LazyLoadRowItemProvider lazyLoadRowItemProvider = sectionItem.lazyLoadRowItemProvider;
            h.a((Object) lazyLoadRowItemProvider, "sectionItem.lazyLoadRowItemProvider");
            shieldSection.setRowProvider(new DefaultShieldRowProvider(lazyLoadRowItemProvider, this.processorHolder));
        } else {
            ArrayList<RowItem> arrayList = sectionItem.rowItems;
            h.a((Object) arrayList, "sectionItem.rowItems");
            shieldSection.setRowProvider(new DefaultShieldRowProviderWithItem(arrayList, this.processorHolder));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0018\u00010\u0000R\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager$CellGroupIndex;", "", "(Lcom/dianping/shield/manager/ShieldNodeCellManager;)V", "childs", "Lcom/dianping/shield/manager/ShieldNodeCellManager;", "getChilds", "()Lcom/dianping/shield/manager/ShieldNodeCellManager$CellGroupIndex;", "setChilds", "(Lcom/dianping/shield/manager/ShieldNodeCellManager$CellGroupIndex;)V", "groupIndex", "", "getGroupIndex", "()Ljava/lang/String;", "setGroupIndex", "(Ljava/lang/String;)V", "innerIndex", "getInnerIndex", "setInnerIndex", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class CellGroupIndex {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private CellGroupIndex childs;
        @Nullable
        private String groupIndex;
        @Nullable
        private String innerIndex;

        public CellGroupIndex() {
        }

        @Nullable
        public final String getGroupIndex() {
            return this.groupIndex;
        }

        public final void setGroupIndex(@Nullable String str) {
            this.groupIndex = str;
        }

        @Nullable
        public final String getInnerIndex() {
            return this.innerIndex;
        }

        public final void setInnerIndex(@Nullable String str) {
            this.innerIndex = str;
        }

        @Nullable
        public final CellGroupIndex getChilds() {
            return this.childs;
        }

        public final void setChilds(@Nullable CellGroupIndex cellGroupIndex) {
            this.childs = cellGroupIndex;
        }
    }

    @Nullable
    public final i findCellForAgent(@Nullable AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4e9935fde5ac7b53d6884283607fe4", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4e9935fde5ac7b53d6884283607fe4");
        }
        if (agentInterface == null) {
            return null;
        }
        i iVar = this.cells.get(getCellName(agentInterface));
        if (iVar != null) {
            return iVar;
        }
        for (Map.Entry<String, i> entry : this.cells.entrySet()) {
            i value = entry.getValue();
            if (agentInterface == value.b) {
                return value;
            }
        }
        return null;
    }

    private final int getOffsetRowPosition(ShieldSection shieldSection, int i) {
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList;
        Object[] objArr = {shieldSection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24d2ed8c07be2cc67019fe5dfbec9109", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24d2ed8c07be2cc67019fe5dfbec9109")).intValue();
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = shieldSection.shieldRows;
        int size = rangeRemoveableArrayList2 != null ? rangeRemoveableArrayList2.size() : 0;
        if (shieldSection.hasHeaderCell) {
            size--;
        }
        if (shieldSection.hasFooterCell) {
            size--;
        }
        int i2 = size - 1;
        if (i >= 0 && i2 >= i) {
            return shieldSection.hasHeaderCell ? i + 1 : i;
        } else if (i == -1) {
            return shieldSection.hasHeaderCell ? 0 : -1;
        } else if (i == -2 && shieldSection.hasFooterCell && (rangeRemoveableArrayList = shieldSection.shieldRows) != null) {
            return kotlin.collections.h.a((List) rangeRemoveableArrayList);
        } else {
            return -1;
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentScrollerInterface
    public final void scrollToNode(@NotNull AgentScrollerParams agentScrollerParams) {
        int i;
        int i2;
        Object[] objArr = {agentScrollerParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0df54ba6e3916d8f851e24b223b8b2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0df54ba6e3916d8f851e24b223b8b2ec");
            return;
        }
        h.b(agentScrollerParams, "params");
        this.hotZoneScrollListener.isScrollingForHotZone = true;
        if (agentScrollerParams.getScope() == ScrollScope.PAGE) {
            i = 0;
        } else {
            NodeInfo nodeInfo = agentScrollerParams.getNodeInfo();
            if (nodeInfo != null) {
                h.a((Object) nodeInfo, AdvanceSetting.NETWORK_TYPE);
                i = getNodeGlobalPosition(nodeInfo);
            } else {
                i = -1;
            }
        }
        if (i < 0) {
            return;
        }
        if (agentScrollerParams.needAutoOffset) {
            if (this.shieldLayoutManager instanceof e) {
                int i3 = agentScrollerParams.offset;
                ShieldLayoutManagerInterface shieldLayoutManagerInterface = this.shieldLayoutManager;
                if (shieldLayoutManagerInterface == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.pagecontainer.SetAutoOffsetInterface");
                }
                i2 = i3 + ((e) shieldLayoutManagerInterface).getAutoOffset();
            } else {
                RecyclerView recyclerView = this.recyclerView;
                if ((recyclerView != null ? recyclerView.getAdapter() : null) instanceof e) {
                    int i4 = agentScrollerParams.offset;
                    RecyclerView recyclerView2 = this.recyclerView;
                    RecyclerView.a adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
                    if (adapter == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.pagecontainer.SetAutoOffsetInterface");
                    }
                    i2 = i4 + ((e) adapter).getAutoOffset();
                } else {
                    i2 = agentScrollerParams.offset;
                }
            }
        } else {
            i2 = agentScrollerParams.offset;
        }
        int i5 = i2;
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            recyclerView3.stopScroll();
        }
        ShieldLayoutManagerInterface shieldLayoutManagerInterface2 = this.shieldLayoutManager;
        if (shieldLayoutManagerInterface2 != null) {
            shieldLayoutManagerInterface2.scrollToPositionWithOffset(i, i5, agentScrollerParams.isSmooth, agentScrollerParams.speed, agentScrollerParams.listenerArrayList);
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    public final int getNodeGlobalPosition(@NotNull NodeInfo nodeInfo) {
        NodeInfo.Scope scope;
        ShieldViewCell shieldViewCell;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList3;
        ShieldSection shieldSection2;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList4;
        ShieldSection shieldSection3;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList5;
        ShieldSection shieldSection4;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList6;
        ShieldSection shieldSection5;
        Object[] objArr = {nodeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9886b6fa614a38d0633c64478a248464", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9886b6fa614a38d0633c64478a248464")).intValue();
        }
        h.b(nodeInfo, "nodeInfo");
        i findCellForAgent = findCellForAgent(nodeInfo.getAgent());
        if (findCellForAgent != null) {
            ShieldViewCell shieldViewCell2 = findCellForAgent.h;
            if (shieldViewCell2 != null && shieldViewCell2.shouldShow && (shieldViewCell = findCellForAgent.h) != null && (rangeRemoveableArrayList = shieldViewCell.shieldSections) != null && !rangeRemoveableArrayList.isEmpty()) {
                NodeInfo.Scope scope2 = nodeInfo.getScope();
                if (scope2 != null) {
                    switch (WhenMappings.$EnumSwitchMapping$1[scope2.ordinal()]) {
                        case 1:
                            ShieldViewCell shieldViewCell3 = findCellForAgent.h;
                            if (shieldViewCell3 == null || (rangeRemoveableArrayList2 = shieldViewCell3.shieldSections) == null || (shieldSection = (ShieldSection) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList2, 0)) == null) {
                                return -1;
                            }
                            RangeDispatcher sectionRangeDispatcher = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                            if (shieldSection != null) {
                                return sectionRangeDispatcher.getStartPosition(shieldSection);
                            }
                            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                        case 2:
                            ShieldViewCell shieldViewCell4 = findCellForAgent.h;
                            if (shieldViewCell4 == null || (rangeRemoveableArrayList3 = shieldViewCell4.shieldSections) == null || (shieldSection2 = (ShieldSection) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList3, nodeInfo.getSection())) == null) {
                                return -1;
                            }
                            RangeDispatcher sectionRangeDispatcher2 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                            if (shieldSection2 != null) {
                                return sectionRangeDispatcher2.getStartPosition(shieldSection2);
                            }
                            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                        case 3:
                            ShieldViewCell shieldViewCell5 = findCellForAgent.h;
                            if (shieldViewCell5 == null || (rangeRemoveableArrayList4 = shieldViewCell5.shieldSections) == null || (shieldSection3 = (ShieldSection) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList4, nodeInfo.getSection())) == null) {
                                return -1;
                            }
                            RangeDispatcher sectionRangeDispatcher3 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                            if (shieldSection3 == null) {
                                throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                            }
                            return sectionRangeDispatcher3.getStartPosition(shieldSection3) + Math.max(0, shieldSection3.getRangeDispatcher().getStartPosition(getOffsetRowPosition(shieldSection3, nodeInfo.getCellInfo().row)));
                        case 4:
                            ShieldViewCell shieldViewCell6 = findCellForAgent.h;
                            if (shieldViewCell6 == null || (rangeRemoveableArrayList5 = shieldViewCell6.shieldSections) == null || (shieldSection4 = (ShieldSection) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList5, nodeInfo.getSection())) == null || !shieldSection4.hasHeaderCell) {
                                return -1;
                            }
                            RangeDispatcher sectionRangeDispatcher4 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                            if (shieldSection4 != null) {
                                return sectionRangeDispatcher4.getStartPosition(shieldSection4);
                            }
                            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                        case 5:
                            ShieldViewCell shieldViewCell7 = findCellForAgent.h;
                            if (shieldViewCell7 == null || (rangeRemoveableArrayList6 = shieldViewCell7.shieldSections) == null || (shieldSection5 = (ShieldSection) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList6, nodeInfo.getSection())) == null || !shieldSection5.hasFooterCell) {
                                return -1;
                            }
                            RangeDispatcher sectionRangeDispatcher5 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                            if (shieldSection5 == null) {
                                throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                            }
                            return (sectionRangeDispatcher5.getStartPosition(shieldSection5) + shieldSection5.getRange()) - 1;
                    }
                }
                throw new j();
            } else if (this.isBuildingCellChain || (scope = nodeInfo.getScope()) == null || WhenMappings.$EnumSwitchMapping$2[scope.ordinal()] != 1) {
                return -1;
            } else {
                ShieldSection b = findCellForAgent.b();
                if (b != null) {
                    RangeDispatcher sectionRangeDispatcher6 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                    if (b != null) {
                        return sectionRangeDispatcher6.getStartPosition(b);
                    }
                    throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                }
                ShieldSection a = findCellForAgent.a();
                if (a != null) {
                    RangeDispatcher sectionRangeDispatcher7 = this.processorHolder.getShieldSectionManager().getSectionRangeDispatcher();
                    if (a == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.RangeHolder");
                    }
                    return sectionRangeDispatcher7.getStartPosition(a) + a.getRange();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    @Nullable
    public final NodeInfo getAgentInfoByGlobalPosition(int i) {
        ShieldSection shieldSection;
        ShieldViewCell shieldViewCell;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30a9ed4973252edfe133b83c6d83903b", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30a9ed4973252edfe133b83c6d83903b");
        }
        ShieldDisplayNode displayNode = this.nodeAdapter.getDisplayNode(i);
        if (displayNode == null) {
            return null;
        }
        ShieldRow shieldRow = displayNode.rowParent;
        AgentInterface agentInterface = (shieldRow == null || (shieldSection = shieldRow.sectionParent) == null || (shieldViewCell = shieldSection.cellParent) == null) ? null : shieldViewCell.owner;
        NodePath path = displayNode.getPath();
        int i2 = path != null ? path.section : -1;
        NodePath path2 = displayNode.getPath();
        int i3 = path2 != null ? path2.row : -3;
        NodePath path3 = displayNode.getPath();
        CellType cellType = path3 != null ? path3.cellType : null;
        if (cellType != null) {
            switch (WhenMappings.$EnumSwitchMapping$3[cellType.ordinal()]) {
                case 1:
                    return NodeInfo.row(agentInterface, i2, i3);
                case 2:
                    return NodeInfo.header(agentInterface, i2);
                case 3:
                    return NodeInfo.footer(agentInterface, i2);
                case 4:
                case 5:
                    NodeInfo agent = NodeInfo.agent(agentInterface);
                    h.a((Object) agent, "this");
                    agent.getCellInfo().section = i2;
                    agent.getCellInfo().row = i3;
                    CellInfo cellInfo = agent.getCellInfo();
                    NodePath path4 = displayNode.getPath();
                    cellInfo.cellType = path4 != null ? path4.cellType : null;
                    return agent;
            }
        }
        return null;
    }

    @Nullable
    public final ShieldViewCell findShieldViewCell(@Nullable af afVar) {
        ArrayList<ShieldViewCell> arrayList;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b2760c115434b0162c10ac199c0be84", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewCell) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b2760c115434b0162c10ac199c0be84");
        }
        if (afVar != null) {
            for (ShieldCellGroup shieldCellGroup : this.cellGroups) {
                if (shieldCellGroup != null && (arrayList = shieldCellGroup.shieldViewCells) != null) {
                    for (ShieldViewCell shieldViewCell : arrayList) {
                        AgentInterface agentInterface = shieldViewCell.owner;
                        if (h.a(agentInterface != null ? agentInterface.getSectionCellInterface() : null, afVar)) {
                            return shieldViewCell;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r12 == null) goto L26;
     */
    @Override // com.dianping.agentsdk.sectionrecycler.a.InterfaceC0052a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getGroupPosition(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.manager.ShieldNodeCellManager.changeQuickRedirect
            java.lang.String r10 = "5ac1d3efd57d251131147fbe6e2dfe09"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L26:
            r0 = -1
            if (r12 < 0) goto L73
            com.dianping.shield.node.processor.ProcessorHolder r1 = r11.processorHolder
            com.dianping.shield.manager.ShieldSectionManager r1 = r1.getShieldSectionManager()
            int r1 = r1.size()
            if (r12 < r1) goto L36
            goto L73
        L36:
            com.dianping.shield.node.processor.ProcessorHolder r1 = r11.processorHolder
            com.dianping.shield.manager.ShieldSectionManager r1 = r1.getShieldSectionManager()
            com.dianping.shield.node.cellnode.RangeDispatcher r1 = r1.getSectionRangeDispatcher()
            com.dianping.shield.node.cellnode.RangeDispatcher$RangeInfo r12 = r1.getInnerPosition(r12)
            if (r12 == 0) goto L5f
            com.dianping.shield.node.cellnode.RangeHolder r12 = r12.obj
            if (r12 == 0) goto L57
            com.dianping.shield.node.cellnode.ShieldSection r12 = (com.dianping.shield.node.cellnode.ShieldSection) r12
            com.dianping.shield.node.cellnode.ShieldViewCell r12 = r12.cellParent
            if (r12 == 0) goto L53
            java.lang.String r12 = r12.key
            goto L54
        L53:
            r12 = 0
        L54:
            if (r12 != 0) goto L61
            goto L5f
        L57:
            kotlin.o r12 = new kotlin.o
            java.lang.String r0 = "null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldSection"
            r12.<init>(r0)
            throw r12
        L5f:
            java.lang.String r12 = ""
        L61:
            java.util.HashMap<java.lang.String, com.dianping.agentsdk.framework.i> r1 = r11.cells
            java.lang.Object r12 = r1.get(r12)
            com.dianping.agentsdk.framework.i r12 = (com.dianping.agentsdk.framework.i) r12
            if (r12 == 0) goto L72
            java.util.ArrayList<com.dianping.agentsdk.framework.i> r0 = r11.sortedCells
            int r12 = r0.indexOf(r12)
            return r12
        L72:
            return r0
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.getGroupPosition(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.dianping.agentsdk.sectionrecycler.a.InterfaceC0052a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getGroupText(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.manager.ShieldNodeCellManager.changeQuickRedirect
            java.lang.String r10 = "cf4139acaded4f112beec5960d6baa55"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L22:
            com.dianping.shield.node.processor.ProcessorHolder r0 = r11.processorHolder
            com.dianping.shield.manager.ShieldSectionManager r0 = r0.getShieldSectionManager()
            com.dianping.shield.node.cellnode.RangeDispatcher r0 = r0.getSectionRangeDispatcher()
            com.dianping.shield.node.cellnode.RangeDispatcher$RangeInfo r12 = r0.getInnerPosition(r12)
            r0 = 0
            if (r12 == 0) goto L41
            com.dianping.shield.node.cellnode.RangeHolder r12 = r12.obj
            boolean r1 = r12 instanceof com.dianping.shield.node.cellnode.ShieldSection
            if (r1 != 0) goto L3a
            r12 = r0
        L3a:
            com.dianping.shield.node.cellnode.ShieldSection r12 = (com.dianping.shield.node.cellnode.ShieldSection) r12
            if (r12 == 0) goto L41
            com.dianping.shield.node.cellnode.ShieldViewCell r12 = r12.cellParent
            goto L42
        L41:
            r12 = r0
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 == 0) goto L4c
            java.lang.String r2 = r12.key
            goto L4d
        L4c:
            r2 = r0
        L4d:
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            if (r12 == 0) goto L66
            com.dianping.agentsdk.framework.AgentInterface r3 = r12.owner
            if (r3 == 0) goto L66
            java.lang.Class r3 = r3.getClass()
            if (r3 == 0) goto L66
            java.lang.String r3 = r3.getSimpleName()
            goto L67
        L66:
            r3 = r0
        L67:
            r1.append(r3)
            r1.append(r2)
            if (r12 == 0) goto L88
            com.dianping.agentsdk.framework.AgentInterface r2 = r12.owner
            if (r2 == 0) goto L88
            com.dianping.agentsdk.framework.af r2 = r2.getSectionCellInterface()
            if (r2 == 0) goto L88
            java.lang.Class r2 = r2.getClass()
            if (r2 == 0) goto L88
            java.lang.String r2 = r2.getSimpleName()
            if (r2 != 0) goto L86
            goto L88
        L86:
            r0 = r2
            goto L9e
        L88:
            if (r12 == 0) goto L9e
            com.dianping.agentsdk.framework.AgentInterface r12 = r12.owner
            if (r12 == 0) goto L9e
            com.dianping.shield.node.useritem.ShieldSectionCellItem r12 = r12.getSectionCellItem()
            if (r12 == 0) goto L9e
            java.lang.Class r12 = r12.getClass()
            if (r12 == 0) goto L9e
            java.lang.String r0 = r12.getSimpleName()
        L9e:
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.ShieldNodeCellManager.getGroupText(int):java.lang.String");
    }

    public final <T> void forEachNodeChild(@NotNull EntrySetHolder<T> entrySetHolder, @NotNull b<? super T, r> bVar) {
        Object[] objArr = {entrySetHolder, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afd40be8041c7e399d9153334461fb58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afd40be8041c7e399d9153334461fb58");
            return;
        }
        h.b(entrySetHolder, "receiver$0");
        h.b(bVar, "action");
        int entryCount = entrySetHolder.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            T entry = entrySetHolder.getEntry(i);
            if (entry != null) {
                bVar.invoke(entry);
            }
        }
    }

    public final void traverseAppearanceEventListener(@NotNull HandleAppearanceEventListener handleAppearanceEventListener) {
        ArrayList<ShieldViewCell> arrayList;
        Object[] objArr = {handleAppearanceEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46045d4c2b7a4879d74638f9827d248e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46045d4c2b7a4879d74638f9827d248e");
            return;
        }
        h.b(handleAppearanceEventListener, "handler");
        for (ShieldCellGroup shieldCellGroup : this.cellGroups) {
            if (shieldCellGroup != null && (arrayList = shieldCellGroup.shieldViewCells) != null) {
                for (ShieldViewCell shieldViewCell : arrayList) {
                    traverseCellAppearanceEventListener(shieldViewCell, handleAppearanceEventListener);
                }
            }
        }
    }

    public final void traverseCellAppearanceEventListener(@NotNull ShieldViewCell shieldViewCell, @NotNull HandleAppearanceEventListener handleAppearanceEventListener) {
        ShieldDisplayNode shieldDisplayNode;
        ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList;
        ArrayList<MoveStatusEventListener<ShieldRow>> arrayList2;
        ArrayList<MoveStatusEventListener<ShieldSection>> arrayList3;
        Object[] objArr = {shieldViewCell, handleAppearanceEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42274d9c176e7a0da5cad1c8337fa805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42274d9c176e7a0da5cad1c8337fa805");
            return;
        }
        h.b(shieldViewCell, "shieldViewCell");
        h.b(handleAppearanceEventListener, "handler");
        ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList4 = shieldViewCell.moveStatusEventListenerList;
        if (arrayList4 != null) {
            Iterator<T> it = arrayList4.iterator();
            while (it.hasNext()) {
                handleAppearanceEventListener.handleListener(shieldViewCell, (MoveStatusEventListener) it.next());
            }
        }
        ShieldViewCell shieldViewCell2 = shieldViewCell;
        int entryCount = shieldViewCell2.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            ShieldSection entry = shieldViewCell2.getEntry(i);
            if (entry != null) {
                ShieldSection shieldSection = entry;
                if (shieldSection != null && (arrayList3 = shieldSection.moveStatusEventListenerList) != null) {
                    Iterator<T> it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        handleAppearanceEventListener.handleListener(shieldSection, (MoveStatusEventListener) it2.next());
                    }
                }
                if (shieldSection != null) {
                    ShieldSection shieldSection2 = shieldSection;
                    int entryCount2 = shieldSection2.getEntryCount();
                    for (int i2 = 0; i2 < entryCount2; i2++) {
                        ShieldRow entry2 = shieldSection2.getEntry(i2);
                        if (entry2 != null) {
                            ShieldRow shieldRow = entry2;
                            if (shieldRow != null && (arrayList2 = shieldRow.moveStatusEventListenerList) != null) {
                                Iterator<T> it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    handleAppearanceEventListener.handleListener(shieldRow, (MoveStatusEventListener) it3.next());
                                }
                            }
                            if (shieldRow != null) {
                                ShieldRow shieldRow2 = shieldRow;
                                int entryCount3 = shieldRow2.getEntryCount();
                                for (int i3 = 0; i3 < entryCount3; i3++) {
                                    ShieldDisplayNode entry3 = shieldRow2.getEntry(i3);
                                    if (entry3 != null && (shieldDisplayNode = entry3) != null && (arrayList = shieldDisplayNode.moveStatusEventListenerList) != null) {
                                        Iterator<T> it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            handleAppearanceEventListener.handleListener(shieldDisplayNode, (MoveStatusEventListener) it4.next());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void updateStatus(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b9988a197152cfc154b4920c37cab74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b9988a197152cfc154b4920c37cab74");
            return;
        }
        h.b(scrollDirection, "direction");
        this.nodeAdapter.updateStatus(scrollDirection);
    }

    public final void storeCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9172c706e53a89ec970170205d179fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9172c706e53a89ec970170205d179fc4");
        } else {
            this.nodeAdapter.storeCurrentInfo();
        }
    }

    public final void setNeedLoadStore(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa5fa1351342e4e35b80e3f778ef6779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa5fa1351342e4e35b80e3f778ef6779");
        } else {
            this.nodeAdapter.setNeedLoadStore(z);
        }
    }

    public final void loadCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d41ce5093e4f84058add9fdc8563688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d41ce5093e4f84058add9fdc8563688");
        } else {
            this.nodeAdapter.loadCurrentInfo();
        }
    }

    public final void clearAttachStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30565c459e21c7b5ad606bd46a0a4335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30565c459e21c7b5ad606bd46a0a4335");
        } else {
            this.nodeAdapter.clearAttachStatus();
        }
    }

    public final void clearCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "639f684cedbfcc547f4e17e22f306fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "639f684cedbfcc547f4e17e22f306fab");
        } else {
            this.nodeAdapter.clearCurrentInfo();
        }
    }

    public final void forceAttachStatusUpdate(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a34e75aa912d8edb9b9af2044da32f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a34e75aa912d8edb9b9af2044da32f5");
            return;
        }
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        this.nodeAdapter.forceUpdateAttachStatus(scrollDirection);
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void startExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "745abda7aacd51880f345eaa1fcff092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "745abda7aacd51880f345eaa1fcff092");
            return;
        }
        this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_START);
        this.nodeAdapter.clearAttachStatus();
        this.nodeAdapter.updateStatus();
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void startExpose(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "169765d30f162a157f34fdfd2c8def1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "169765d30f162a157f34fdfd2c8def1f");
            return;
        }
        this.handler.postDelayed(this.exposeCallback, j);
        this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_STARTING);
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void finishExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5df12cca9630515037145896d8771bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5df12cca9630515037145896d8771bd");
            return;
        }
        this.handler.removeCallbacks(this.exposeCallback);
        this.nodeAdapter.clearAttachStatus();
        this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_STOP);
        traverseAppearanceEventListener(new HandleAppearanceEventListener() { // from class: com.dianping.shield.manager.ShieldNodeCellManager$finishExpose$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.cellnode.HandleAppearanceEventListener
            public final void handleListener(@NotNull Object obj, @NotNull MoveStatusEventListener<Object> moveStatusEventListener) {
                Object[] objArr2 = {obj, moveStatusEventListener};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0dafa26f993bfdd95d3d80461e3fcbe7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0dafa26f993bfdd95d3d80461e3fcbe7");
                    return;
                }
                h.b(obj, "item");
                h.b(moveStatusEventListener, "moveStatusEventListener");
                moveStatusEventListener.reset(obj);
            }
        });
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void pauseExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a8c414536354f2d6e3b3278817cf624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a8c414536354f2d6e3b3278817cf624");
        } else {
            this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_PAUSE);
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void resumeExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "611724a7aba18334a8fa2df337e86cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "611724a7aba18334a8fa2df337e86cd9");
            return;
        }
        this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_RESUME);
        this.nodeAdapter.updateStatus();
    }

    public final void resumeExpose(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc4001947c490a4bd84b001984bfbf5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc4001947c490a4bd84b001984bfbf5c");
            return;
        }
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        this.nodeAdapter.setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_RESUME);
        this.nodeAdapter.updateStatus(scrollDirection);
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void resetExposeSCI(@Nullable af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09fb48b6cdd3b81ec9497cf36e254562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09fb48b6cdd3b81ec9497cf36e254562");
            return;
        }
        ShieldViewCell findShieldViewCell = findShieldViewCell(afVar);
        if (findShieldViewCell != null) {
            traverseCellAppearanceEventListener(findShieldViewCell, new HandleAppearanceEventListener() { // from class: com.dianping.shield.manager.ShieldNodeCellManager$resetExposeSCI$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.cellnode.HandleAppearanceEventListener
                public final void handleListener(@NotNull Object obj, @NotNull MoveStatusEventListener<Object> moveStatusEventListener) {
                    Object[] objArr2 = {obj, moveStatusEventListener};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8101de79c5526719d78d3dc58f63199", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8101de79c5526719d78d3dc58f63199");
                        return;
                    }
                    h.b(obj, "item");
                    h.b(moveStatusEventListener, "moveStatusEventListener");
                    moveStatusEventListener.reset(obj);
                }
            });
        }
        this.nodeAdapter.updateStatus();
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    @NotNull
    public final ArrayList<Rect> getScreenInvisibleEdge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cef7a4cc23bdabfde5f42ca92a076ef9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cef7a4cc23bdabfde5f42ca92a076ef9");
        }
        ArrayList<Rect> screenInvisibleEdge = this.nodeAdapter.getScreenInvisibleEdge();
        h.a((Object) screenInvisibleEdge, "nodeAdapter.getScreenInvisibleEdge()");
        return screenInvisibleEdge;
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    @NotNull
    public final Rect getScreenVisibleEdge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0b3040e1c079228efd807eef83fe9cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0b3040e1c079228efd807eef83fe9cb");
        }
        Rect screenVisibleEdge = this.nodeAdapter.getScreenVisibleEdge();
        h.a((Object) screenVisibleEdge, "nodeAdapter.getScreenVisibleEdge()");
        return screenVisibleEdge;
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    public final void onShieldExtraVisibleNodeChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c98231699275202f7f0d869dc79e90d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c98231699275202f7f0d869dc79e90d");
        } else {
            this.nodeAdapter.onShieldExtraVisibleNodeChange();
        }
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void resetExposeRow(@Nullable af afVar, int i, int i2) {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2;
        ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList;
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1738c76c557623d53df92ce1ad4bc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1738c76c557623d53df92ce1ad4bc00");
            return;
        }
        ShieldViewCell findShieldViewCell = findShieldViewCell(afVar);
        if (findShieldViewCell != null && (rangeRemoveableArrayList = findShieldViewCell.shieldSections) != null && (shieldSection = rangeRemoveableArrayList.get(i)) != null && (rangeRemoveableArrayList2 = shieldSection.shieldRows) != null) {
            h.a((Object) shieldSection, "this");
            ShieldRow shieldRow = rangeRemoveableArrayList2.get(getOffsetRowPosition(shieldSection, i2));
            if (shieldRow != null) {
                ArrayList<MoveStatusEventListener<ShieldRow>> arrayList2 = shieldRow.moveStatusEventListenerList;
                if (arrayList2 != null) {
                    Iterator<T> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((MoveStatusEventListener) it.next()).reset(shieldRow);
                    }
                }
                ArrayList<ShieldDisplayNode> arrayList3 = shieldRow.shieldDisplayNodes;
                if (arrayList3 != null) {
                    for (ShieldDisplayNode shieldDisplayNode : arrayList3) {
                        if (shieldDisplayNode != null && (arrayList = shieldDisplayNode.moveStatusEventListenerList) != null) {
                            Iterator<T> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((MoveStatusEventListener) it2.next()).reset(shieldDisplayNode);
                            }
                        }
                    }
                }
            }
        }
        this.nodeAdapter.updateStatus();
    }

    @Override // com.dianping.shield.feature.ExposeScreenLoadedInterface
    public final void resetExposeExtraCell(@Nullable af afVar, int i, @Nullable CellType cellType) {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2;
        ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList;
        int i2 = 0;
        Object[] objArr = {afVar, Integer.valueOf(i), cellType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf8962799810570ad6542b6c7e098469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf8962799810570ad6542b6c7e098469");
            return;
        }
        ShieldViewCell findShieldViewCell = findShieldViewCell(afVar);
        if (findShieldViewCell != null && (rangeRemoveableArrayList = findShieldViewCell.shieldSections) != null && (shieldSection = rangeRemoveableArrayList.get(i)) != null) {
            if (cellType == CellType.HEADER) {
                i2 = -1;
            } else if (cellType == CellType.FOOTER) {
                i2 = -2;
            }
            if (i2 != 0 && (rangeRemoveableArrayList2 = shieldSection.shieldRows) != null) {
                h.a((Object) shieldSection, "this");
                ShieldRow shieldRow = rangeRemoveableArrayList2.get(getOffsetRowPosition(shieldSection, i2));
                if (shieldRow != null) {
                    ArrayList<MoveStatusEventListener<ShieldRow>> arrayList2 = shieldRow.moveStatusEventListenerList;
                    if (arrayList2 != null) {
                        Iterator<T> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((MoveStatusEventListener) it.next()).reset(shieldRow);
                        }
                    }
                    ArrayList<ShieldDisplayNode> arrayList3 = shieldRow.shieldDisplayNodes;
                    if (arrayList3 != null) {
                        for (ShieldDisplayNode shieldDisplayNode : arrayList3) {
                            if (shieldDisplayNode != null && (arrayList = shieldDisplayNode.moveStatusEventListenerList) != null) {
                                Iterator<T> it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((MoveStatusEventListener) it2.next()).reset(shieldDisplayNode);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.nodeAdapter.updateStatus();
    }

    public final void destory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "601746bdb864b33c5a7af274f85dc3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "601746bdb864b33c5a7af274f85dc3c1");
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.cellManagerOnScrollListener);
        }
        this.processorHolder.setCreator(null);
        this.nodeAdapter.clearStoredInfo();
        ListChangeRegistry.releasePoolData();
        this.handler.removeCallbacks(this.notifyCellChanged);
        this.pageName = null;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/manager/ShieldNodeCellManager$CellManagerOnScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/dianping/shield/manager/ShieldNodeCellManager;)V", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class CellManagerOnScrollListener extends RecyclerView.k {
        public static ChangeQuickRedirect changeQuickRedirect;

        public CellManagerOnScrollListener() {
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ca04c2d198cfdd8f99ea2c4b7e9b16a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ca04c2d198cfdd8f99ea2c4b7e9b16a");
                return;
            }
            h.b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            for (CellManagerScrollListenerInterface cellManagerScrollListenerInterface : ShieldNodeCellManager.this.scrollListenerList) {
                cellManagerScrollListenerInterface.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95997753b5ba0081c400cfb6ce9371d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95997753b5ba0081c400cfb6ce9371d4");
                return;
            }
            h.b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            for (CellManagerScrollListenerInterface cellManagerScrollListenerInterface : ShieldNodeCellManager.this.scrollListenerList) {
                cellManagerScrollListenerInterface.onScrolled(recyclerView, i, i2);
            }
        }
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getReuseIdentifierMap() {
        return this.reuseIdentifierMap;
    }

    public final void setReuseIdentifierMap(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.reuseIdentifierMap = hashMap;
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getReuseIdentifierMapForHeader() {
        return this.reuseIdentifierMapForHeader;
    }

    public final void setReuseIdentifierMapForHeader(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.reuseIdentifierMapForHeader = hashMap;
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getReuseIdentifierMapForFooter() {
        return this.reuseIdentifierMapForFooter;
    }

    public final void setReuseIdentifierMapForFooter(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.reuseIdentifierMapForFooter = hashMap;
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getCellTypeMap() {
        return this.cellTypeMap;
    }

    public final void setCellTypeMap(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.cellTypeMap = hashMap;
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getCellTypeMapForHeader() {
        return this.cellTypeMapForHeader;
    }

    public final void setCellTypeMapForHeader(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.cellTypeMapForHeader = hashMap;
    }

    @Nullable
    public final HashMap<String, HashMap<String, Integer>> getCellTypeMapForFooter() {
        return this.cellTypeMapForFooter;
    }

    public final void setCellTypeMapForFooter(@Nullable HashMap<String, HashMap<String, Integer>> hashMap) {
        this.cellTypeMapForFooter = hashMap;
    }

    @Nullable
    public final HashMap<String, Integer> getReuseIdentifierMap(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f77dea069cdadc619bdf57f2bb969dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f77dea069cdadc619bdf57f2bb969dd");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.reuseIdentifierMap, str);
    }

    @Nullable
    public final HashMap<String, Integer> getReuseIdentifierMapForHeader(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0423307cf5f2437e058d5added1fff1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0423307cf5f2437e058d5added1fff1");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.reuseIdentifierMapForHeader, str);
    }

    @Nullable
    public final HashMap<String, Integer> getReuseIdentifierMapForFooter(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da0b0eccd8833653e7aa3d3313a15877", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da0b0eccd8833653e7aa3d3313a15877");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.reuseIdentifierMapForFooter, str);
    }

    @Nullable
    public final HashMap<String, Integer> getCellTypeMap(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b96b92f25375f692fea4073e82be6fd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b96b92f25375f692fea4073e82be6fd9");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.cellTypeMap, str);
    }

    @Nullable
    public final HashMap<String, Integer> getCellTypeMapForHeader(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c55ef9f5b3826b3f85facfa88d4e9df", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c55ef9f5b3826b3f85facfa88d4e9df");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.cellTypeMapForHeader, str);
    }

    @Nullable
    public final HashMap<String, Integer> getCellTypeMapForFooter(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bb41a4c813b3c84bead8fcbb755f185", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bb41a4c813b3c84bead8fcbb755f185");
        }
        h.b(str, "hostName");
        return getReuseIdentifierMap(this.cellTypeMapForFooter, str);
    }

    @Nullable
    public final HashMap<String, Integer> getReuseIdentifierMap(@Nullable HashMap<String, HashMap<String, Integer>> hashMap, @NotNull String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "693db52dc991b8a5fcd3efc7aafb994d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "693db52dc991b8a5fcd3efc7aafb994d");
        }
        h.b(str, "hostName");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        HashMap<String, Integer> hashMap2 = hashMap.get(str);
        if (hashMap2 == null) {
            HashMap<String, Integer> hashMap3 = new HashMap<>();
            hashMap.put(str, hashMap3);
            return hashMap3;
        }
        return hashMap2;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb8d5d7166748c0dfb228054f83e5462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb8d5d7166748c0dfb228054f83e5462");
        } else {
            this.processorHolder.shieldPreload();
        }
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d159d314bcb41e2caae2d1fcfc9728db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d159d314bcb41e2caae2d1fcfc9728db");
            return;
        }
        this.cells.clear();
        this.sortedCells.clear();
        this.cellGroups.clear();
        this.sectionList.clear();
        this.featureList.clear();
        this.scrollListenerList.clear();
        this.layoutModeController = null;
        this.recyclerView = null;
        this.layoutManager = null;
        this.shieldLayoutManager = null;
        this.itemAnimator = null;
        this.whiteBoard = null;
        this.shieldGAInfo = null;
        this.looper = null;
        HoverPosControl hoverPosControl = this.hoverPosControl;
        if (hoverPosControl != null) {
            HoverPosControlObserver hoverPosControlObserver = this.nodeAdapter.getHoverPosControlObserver();
            h.a((Object) hoverPosControlObserver, "nodeAdapter.hoverPosControlObserver");
            hoverPosControl.removeHoverPosControlObserver(hoverPosControlObserver);
        }
        this.hoverPosControl = null;
        this.hotZoneScrollListener.isScrollingForHotZone = false;
        setExposeComputeMode(f.a.Normal);
        this.processorHolder.shieldRecycle();
        this.nodeAdapter.shieldRecycle();
        this.agentScrollTop.shieldRecycle();
        this.hasBackgroundNodeCollector.shieldRecycle();
        this.frozenInfo = new FrozenInfo(this, Boolean.FALSE, null, 2, null);
    }
}
