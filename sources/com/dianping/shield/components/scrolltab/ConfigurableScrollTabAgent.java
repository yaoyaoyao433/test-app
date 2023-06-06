package com.dianping.shield.components.scrolltab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.s;
import com.dianping.agentsdk.framework.v;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.bridge.feature.HoverPosControl;
import com.dianping.shield.bridge.feature.HoverPosControlObserver;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.components.AbstractTabInterface;
import com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent;
import com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.TopPositionInterface;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.viewcell.BaseViewCell;
import com.dianping.voyager.fragment.CommonShieldFragment;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import kotlin.o;
import kotlin.r;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.functions.b;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 Ô\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0016Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001dH\u0016J\b\u0010q\u001a\u00020oH\u0002J\u0010\u0010r\u001a\u00020o2\u0006\u0010s\u001a\u00020\rH\u0002J\u0010\u0010t\u001a\u00020o2\u0006\u0010u\u001a\u00020\rH\u0002J\u001e\u0010t\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0006\u0010u\u001a\u00020\rH\u0002J\u001e\u0010x\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010y\u001a\u00020o2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u001a\u0010z\u001a\u00020J2\u0006\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010JH\u0002J\b\u0010~\u001a\u00020\rH\u0002J\u000b\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0002J\f\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0016J\f\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002J\f\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002J\f\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002J\u001b\u0010\u0088\u0001\u001a\u00020\r2\u0007\u0010\u0089\u0001\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020\rH\u0002J\t\u0010\u008b\u0001\u001a\u00020\rH\u0002J\t\u0010\u008c\u0001\u001a\u00020\rH\u0002J\t\u0010\u008d\u0001\u001a\u00020\rH\u0002J\n\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\f\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u0013\u0010\u0091\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010u\u001a\u00020\rH\u0016J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0003\u0010\u0093\u0001J\t\u0010\u0094\u0001\u001a\u00020\rH\u0016J\t\u0010\u0095\u0001\u001a\u00020\rH\u0016J\t\u0010\u0096\u0001\u001a\u00020oH\u0002J\u0017\u0010\u0097\u0001\u001a\u00020\u00152\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120wH\u0002J\u0015\u0010\u0098\u0001\u001a\u00020\u00152\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002J\u0015\u0010\u009a\u0001\u001a\u00020\u00152\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020o2\u0007\u0010\u009d\u0001\u001a\u000201H\u0002J%\u0010\u009e\u0001\u001a\u00020o2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\r2\t\u0010 \u0001\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0003\u0010¡\u0001J\u0015\u0010¢\u0001\u001a\u00020o2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0016J\t\u0010¥\u0001\u001a\u00020oH\u0016J\u0013\u0010¦\u0001\u001a\u00020o2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0016JE\u0010©\u0001\u001a\u00020o2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\r04j\b\u0012\u0004\u0012\u00020\r`52\"\u0010/\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r00j\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r`2H\u0014J\u0013\u0010ª\u0001\u001a\u00020o2\b\u0010§\u0001\u001a\u00030«\u0001H\u0016J\u0013\u0010¬\u0001\u001a\f\u0012\u0005\u0012\u00030®\u0001\u0018\u00010\u00ad\u0001H\u0016J \u0010¯\u0001\u001a\u00020\r2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0007\u0010°\u0001\u001a\u00020\rH\u0002J1\u0010±\u0001\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0007\u0010²\u0001\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0007\u0010³\u0001\u001a\u00020\rH\u0002J\t\u0010´\u0001\u001a\u00020oH\u0002J1\u0010µ\u0001\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0007\u0010²\u0001\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0007\u0010³\u0001\u001a\u00020\rH\u0002J\u0011\u0010¶\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001dH\u0016J/\u0010·\u0001\u001a\u00020o2\b\b\u0002\u00107\u001a\u00020\u00152\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010m\u001a\u00020\r2\b\b\u0002\u0010M\u001a\u00020NJ\u0012\u0010¸\u0001\u001a\u00020o2\u0007\u0010¹\u0001\u001a\u00020\u0015H\u0002J\u0011\u0010º\u0001\u001a\u00020o2\u0006\u0010&\u001a\u00020\u0015H\u0002J(\u0010»\u0001\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\u0007\u0010³\u0001\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010¼\u0001\u001a\u00020o2\u0007\u0010½\u0001\u001a\u00020\rJ\u0012\u0010¾\u0001\u001a\u00020o2\u0007\u0010³\u0001\u001a\u00020\rH\u0002J\u001d\u0010¿\u0001\u001a\u00020o2\t\u0010\t\u001a\u0005\u0018\u00010\u0084\u00012\u0007\u0010À\u0001\u001a\u00020\u0015H\u0002J\u0094\u0001\u0010Á\u0001\u001a\u00020o2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120w2\t\b\u0002\u0010°\u0001\u001a\u00020\r2\t\b\u0002\u0010²\u0001\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00152\t\b\u0002\u0010Â\u0001\u001a\u00020\r2\t\b\u0002\u0010Ã\u0001\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\t\b\u0002\u0010¹\u0001\u001a\u00020\u00152\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Å\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\t\b\u0002\u0010Ç\u0001\u001a\u00020\r2\t\u0010È\u0001\u001a\u0004\u0018\u00010\r¢\u0006\u0003\u0010É\u0001J\u0011\u0010Ê\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010Ë\u0001\u001a\u00020o2\u0007\u0010Ì\u0001\u001a\u00020\rJ\u000f\u0010Í\u0001\u001a\u00020o2\u0006\u0010u\u001a\u00020\rJ\f\u0010Î\u0001\u001a\u0005\u0018\u00010Ï\u0001H&J\t\u0010Ð\u0001\u001a\u00020oH\u0002J\u0012\u0010Ñ\u0001\u001a\u00020o2\u0007\u0010²\u0001\u001a\u00020\u0015H\u0002J\t\u0010Ò\u0001\u001a\u00020oH\u0002J\t\u0010Ó\u0001\u001a\u00020oH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u00060%R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010-R\u0012\u0010.\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010-R*\u0010/\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r00j\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r`2X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u00020\r04j\b\u0012\u0004\u0012\u00020\r`5X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u00060>R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010-R\u0012\u0010@\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010R\u001a\u0004\u0018\u00010SX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u000e\u0010^\u001a\u00020_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010`\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010c\u001a\u00060dR\u00020\u0000X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u000e\u0010i\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ß\u0001"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;", "Lcom/dianping/agentsdk/agent/HoloAgent;", "Lcom/dianping/shield/components/scrolltab/PageComposeInterface;", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;", "Lcom/dianping/shield/bridge/feature/HoverPosControl;", "fragment", "Landroid/support/v4/app/Fragment;", "bridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "alinePageTop", "", "bottomAlwaysHoverInitPos", "bottomOffset", "currentConfigModels", "", "Lcom/dianping/shield/components/scrolltab/model/ScrollTabConfigModel;", "currentIndex", "enableContinuousScroll", "", "flingHelper", "Lcom/dianping/shield/components/scrolltab/FlingHelper;", "fragmentContentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "fragments", "Lcom/dianping/shield/components/scrolltab/LazyLoadShieldFragment;", "hoverPosControlObserverArray", "Lcom/dianping/shield/bridge/feature/HoverPosControlObserver;", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "innerContentOffset", "innerFlingHelper", "innerFlingListener", "Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$InnerFlingListener;", "innerScrollListener", "Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$InnerOnScrollListener;", "isLazyLoad", "isPageBeingDragged", "isPagerContainerAttached", "isPicasso", "isScrollTabFirst", "isScrollTabLast", "lastBottomTranslateY", "Ljava/lang/Integer;", "lastTopTranslateY", "loadedPageKeys", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "loadedPages", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "minTabCount", "needAutoOffset", "offscreenPageLimit", "offset", "offsetToAnchor", "outRvLayoutParamHeight", "outerContentOffset", "outerScrollListener", "Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$OuterOnScrollListener;", "pageExtraFooterHeight", "pageExtraHeaderHeight", "pageGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "pageScrollEventDispatcherProvider", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "pageScrollEventHelper", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper;", "pager", "Landroid/support/v4/view/ViewPager;", "pagerContainer", "Landroid/view/ViewGroup;", "pagerInitialTopInScreen", "preConfigModels", "stopTop", "Lcom/dianping/shield/feature/TopPositionInterface$AutoStopTop;", "tabFollowLeaveContentY", "tabKeyArray", "tabKeyTitleArray", "tabRowItem", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "getTabRowItem", "()Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "setTabRowItem", "(Lcom/dianping/shield/component/extensions/tabs/TabRowItem;)V", "tabWidget", "Lcom/dianping/shield/components/AbstractTabInterface;", "getTabWidget", "()Lcom/dianping/shield/components/AbstractTabInterface;", "setTabWidget", "(Lcom/dianping/shield/components/AbstractTabInterface;)V", "topState", "Lcom/dianping/shield/layoutmanager/TopLinearLayoutManager$TopState;", "verticalScrollEventHelper", "viewCell", "Lcom/dianping/shield/viewcell/BaseViewCell;", "viewCellItem", "Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabViewCellItem;", "getViewCellItem", "()Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabViewCellItem;", "setViewCellItem", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabViewCellItem;)V", "viewContentOffsetListener", "visibilityAgentSubscription", "Lrx/Subscription;", "zFrameLayoutResId", DMKeys.KEY_HOVER_Z_POSITION, "addHoverPosControlObserver", "", "hoverPosControlObserver", "addOuterScrollListener", "calOffsetOfAnchor", "contentOffset", "computeLoadPages", "index", "configs", "", "configurableRefreshScrollTab", "createFragments", "createPager", "context", "Landroid/content/Context;", "parent", "getAgentTop", "getCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "getCurrentChildFeature", "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "getInnerPageContainer", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "getInnerRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getOuterRecyclerView", "getPageContentOffset", "currentPosition", "positionOffsetPixels", "getScrollTabHeight", "getScrollTabHoverOffset", "getScrollTabOffset", "getSectionCellInterface", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "getSectionCellItem", "getSubFeatureBridgeInterface", "getTopTranslateY", "()Ljava/lang/Integer;", "getTotalHorizontalScrollRange", "getTotalVerticalScrollRange", "initFling", "isConfigKeyEmpty", "isRecyclerViewScrollToBottom", "rv", "isRecyclerViewScrollToTop", "isTabFollowPageBottom", SnifferDBHelper.COLUMN_LOG, "msg", "notifyHoverPosControlData", "bottomTranslateY", "topTranslateY", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageChangedCallback", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", d.p, "Lrx/Observable;", "", "reComputeCurrentIndex", "initIndex", "refreshScrollTab", "isShareWhiteBoard", DMKeys.KEY_TAB_MAX_LOADED_TAB_COUNT, "registerAgentsObs", "reloadScrollTab", "removeHoverPosControlObserver", "setAutoOffset", "setDisableHorizontalScroll", DMKeys.KEY_TAB_DISABLE_HORIZONTAL_SCROLL, "setLazyLoad", "setLazyLoadAndLoadCountConfigs", "setMinTabCount", "minCount", "setOffscreenPageLimit", "setScrollEventListener", "isInnerOffset", "setTabConfigs", "sectionHeaderHeight", "sectionFooterHeight", "sectionHeaderDrawable", "Landroid/graphics/drawable/Drawable;", "sectionFooterDrawable", "_maxLoadedTabCount", DMKeys.KEY_TAB_CONTENT_BACKGROUND_COLOR, "(Ljava/util/List;IZZIIIZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILjava/lang/Integer;)V", "setTopState", "setZFrameLayoutRes", "resLayout", "switchToPage", "tabView", "Landroid/view/View;", "unregisterAgentsObs", "updateFragments", "updatePager", "updateTabs", "Companion", "FragmentContentOffsetListener", "InnerFlingListener", "InnerOnScrollListener", "OuterOnScrollListener", "PageGlobalLayoutListener", "ScrollTabAdapter", "ScrollTabNestedScrollingParent", "ScrollTabViewCell", "ScrollTabViewCellItem", "ViewContentOffsetListener", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ConfigurableScrollTabAgent extends HoloAgent implements HoverPosControl, ComponentScrollEventHelper.IScrollRange, PageComposeInterface {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String ENABLE_CONTINUOUS_SCROLL = "scrollTabEnableContinuousScroll";
    @NotNull
    public static final String MRN_SCROLL_TAB_PREFIX = "mrnscrolltab_";
    public static final int NO_VALUE = -1;
    @NotNull
    public static final String PICASSO_SCROLL_TAB_PREFIX = "GCPicassoImportedModule/picassoscrolltab_";
    @NotNull
    public static final String TAG = "ScrollTabAgent";
    public static final int TYPE_PAGER = 2;
    @NotNull
    public static final String TYPE_PAGER_NEW = "scrolltab_pager";
    public static final int TYPE_TAB = 1;
    @NotNull
    public static final String TYPE_TAB_NEW = "scrolltab_tab";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int alinePageTop;
    private int bottomAlwaysHoverInitPos;
    private int bottomOffset;
    private List<ScrollTabConfigModel> currentConfigModels;
    private int currentIndex;
    private boolean enableContinuousScroll;
    private FlingHelper flingHelper;
    private ContentOffsetListener fragmentContentOffsetListener;
    private final List<LazyLoadShieldFragment> fragments;
    private List<HoverPosControlObserver> hoverPosControlObserverArray;
    private HoverState hoverState;
    private int innerContentOffset;
    private FlingHelper innerFlingHelper;
    private final InnerFlingListener innerFlingListener;
    private final InnerOnScrollListener innerScrollListener;
    private boolean isLazyLoad;
    private boolean isPageBeingDragged;
    private boolean isPagerContainerAttached;
    private boolean isPicasso;
    private boolean isScrollTabFirst;
    private boolean isScrollTabLast;
    private Integer lastBottomTranslateY;
    private Integer lastTopTranslateY;
    private final HashMap<String, Integer> loadedPageKeys;
    private final HashSet<Integer> loadedPages;
    private int minTabCount;
    private boolean needAutoOffset;
    private int offscreenPageLimit;
    private int offset;
    private int offsetToAnchor;
    private int outRvLayoutParamHeight;
    private int outerContentOffset;
    private final OuterOnScrollListener outerScrollListener;
    private Integer pageExtraFooterHeight;
    private Integer pageExtraHeaderHeight;
    private ViewTreeObserver.OnGlobalLayoutListener pageGlobalLayoutListener;
    private ComponentScrollEventHelper.IEventDispatcherProvider pageScrollEventDispatcherProvider;
    private ComponentScrollEventHelper pageScrollEventHelper;
    private ViewPager pager;
    private ViewGroup pagerContainer;
    private int pagerInitialTopInScreen;
    private List<ScrollTabConfigModel> preConfigModels;
    private TopPositionInterface.AutoStopTop stopTop;
    private int tabFollowLeaveContentY;
    private List<String> tabKeyArray;
    private List<String> tabKeyTitleArray;
    @Nullable
    private TabRowItem tabRowItem;
    @Nullable
    private AbstractTabInterface tabWidget;
    private TopLinearLayoutManager.TopState topState;
    private ComponentScrollEventHelper verticalScrollEventHelper;
    private BaseViewCell viewCell;
    @NotNull
    protected ScrollTabViewCellItem viewCellItem;
    private ContentOffsetListener viewContentOffsetListener;
    private k visibilityAgentSubscription;
    private int zFrameLayoutResId;
    private int zPosition;

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String str) {
    }

    public void onPageChangedCallback(@NotNull HashSet<Integer> hashSet, @NotNull HashMap<String, Integer> hashMap) {
        Object[] objArr = {hashSet, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "857fb8b6f5394c9fb46835e74caa8468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "857fb8b6f5394c9fb46835e74caa8468");
            return;
        }
        h.b(hashSet, "loadedPages");
        h.b(hashMap, "loadedPageKeys");
    }

    @Nullable
    public abstract View tabView();

    public static final /* synthetic */ FlingHelper access$getFlingHelper$p(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        FlingHelper flingHelper = configurableScrollTabAgent.flingHelper;
        if (flingHelper == null) {
            h.a("flingHelper");
        }
        return flingHelper;
    }

    public static final /* synthetic */ FlingHelper access$getInnerFlingHelper$p(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        FlingHelper flingHelper = configurableScrollTabAgent.innerFlingHelper;
        if (flingHelper == null) {
            h.a("innerFlingHelper");
        }
        return flingHelper;
    }

    public static final /* synthetic */ ViewGroup access$getPagerContainer$p(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        ViewGroup viewGroup = configurableScrollTabAgent.pagerContainer;
        if (viewGroup == null) {
            h.a("pagerContainer");
        }
        return viewGroup;
    }

    public ConfigurableScrollTabAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71bd7ffb5fc6cd94145e92916c1b209", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71bd7ffb5fc6cd94145e92916c1b209");
            return;
        }
        this.tabKeyArray = kotlin.collections.h.c((Collection) t.a);
        this.tabKeyTitleArray = kotlin.collections.h.c((Collection) t.a);
        this.currentConfigModels = kotlin.collections.h.c((Collection) t.a);
        this.preConfigModels = kotlin.collections.h.c((Collection) t.a);
        this.fragments = kotlin.collections.h.c((Collection) t.a);
        this.minTabCount = 2;
        this.isPagerContainerAttached = true;
        this.currentIndex = -1;
        this.outerScrollListener = new OuterOnScrollListener();
        this.innerScrollListener = new InnerOnScrollListener();
        this.innerFlingListener = new InnerFlingListener();
        this.enableContinuousScroll = true;
        this.stopTop = TopPositionInterface.AutoStopTop.NONE;
        this.topState = TopLinearLayoutManager.TopState.NORMAL;
        this.hoverState = HoverState.NORMAL;
        this.offsetToAnchor = Integer.MAX_VALUE;
        this.pagerInitialTopInScreen = -1;
        this.zFrameLayoutResId = -1;
        this.tabFollowLeaveContentY = -1;
        this.hoverPosControlObserverArray = kotlin.collections.h.c((Collection) t.a);
        this.fragmentContentOffsetListener = new FragmentContentOffsetListener();
        this.viewContentOffsetListener = new ViewContentOffsetListener();
        this.pageGlobalLayoutListener = new PageGlobalLayoutListener();
        this.offscreenPageLimit = 1;
        this.loadedPages = new HashSet<>();
        this.loadedPageKeys = new HashMap<>();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$Companion;", "", "()V", "ENABLE_CONTINUOUS_SCROLL", "", "MRN_SCROLL_TAB_PREFIX", "NO_VALUE", "", "PICASSO_SCROLL_TAB_PREFIX", "TAG", "TYPE_PAGER", "TYPE_PAGER_NEW", "TYPE_TAB", "TYPE_TAB_NEW", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @NotNull
    public final ScrollTabViewCellItem getViewCellItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d1be2c2967a225492ec244f1af3643", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollTabViewCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d1be2c2967a225492ec244f1af3643");
        }
        ScrollTabViewCellItem scrollTabViewCellItem = this.viewCellItem;
        if (scrollTabViewCellItem == null) {
            h.a("viewCellItem");
        }
        return scrollTabViewCellItem;
    }

    public final void setViewCellItem(@NotNull ScrollTabViewCellItem scrollTabViewCellItem) {
        Object[] objArr = {scrollTabViewCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8968ee9132d0d32c55cbf9490a2539e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8968ee9132d0d32c55cbf9490a2539e5");
            return;
        }
        h.b(scrollTabViewCellItem, "<set-?>");
        this.viewCellItem = scrollTabViewCellItem;
    }

    @Nullable
    public final AbstractTabInterface getTabWidget() {
        return this.tabWidget;
    }

    public final void setTabWidget(@Nullable AbstractTabInterface abstractTabInterface) {
        this.tabWidget = abstractTabInterface;
    }

    @Nullable
    public final TabRowItem getTabRowItem() {
        return this.tabRowItem;
    }

    public final void setTabRowItem(@Nullable TabRowItem tabRowItem) {
        this.tabRowItem = tabRowItem;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442dd0b754c73d37c5712134752ad49d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442dd0b754c73d37c5712134752ad49d");
            return;
        }
        super.onCreate(bundle);
        String str = this.hostName;
        h.a((Object) str, "this.hostName");
        this.isPicasso = g.a((CharSequence) str, (CharSequence) PICASSO_SCROLL_TAB_PREFIX, false);
        this.viewCellItem = new ScrollTabViewCellItem();
        Context context = getContext();
        h.a((Object) context, "context");
        this.viewCell = new ScrollTabViewCell(this, context);
        this.flingHelper = new FlingHelper(getContext());
        this.innerFlingHelper = new FlingHelper(getContext());
        this.enableContinuousScroll = getWhiteBoard().b(ENABLE_CONTINUOUS_SCROLL, true);
        registerAgentsObs();
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
            outerRecyclerView = null;
        }
        PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
        if (pageContainerRecyclerView != null) {
            pageContainerRecyclerView.disableIntercept = false;
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    @Nullable
    public ShieldSectionCellItem getSectionCellItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e88755b3245d45e4ee30f8a41092e55e", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e88755b3245d45e4ee30f8a41092e55e") : getCellItem();
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    @NotNull
    public af getSectionCellInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36ec0464a560f4550ccddeaa8f8320d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36ec0464a560f4550ccddeaa8f8320d5");
        }
        BaseViewCell baseViewCell = this.viewCell;
        if (baseViewCell == null) {
            h.a("viewCell");
        }
        return baseViewCell;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public rx.d<Object> onRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92fa37087aac90009961e5026a71f5c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92fa37087aac90009961e5026a71f5c1");
        }
        if (this.fragments.size() <= this.currentIndex || this.currentIndex == -1) {
            return null;
        }
        return this.fragments.get(this.currentIndex).onPullRefresh();
    }

    private final void registerAgentsObs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6fbbd2ea91775dc17b5299ae131a570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6fbbd2ea91775dc17b5299ae131a570");
            return;
        }
        final t.b bVar = new t.b();
        k c = getWhiteBoard().b(ShieldConst.AGENT_VISIBILITY_LIST_KEY).c(new b<Object>() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$registerAgentsObs$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(Object obj) {
                int i;
                int i2;
                int intValue;
                int i3 = 0;
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "337f9235a8bd6e61d63b2af7d445cbc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "337f9235a8bd6e61d63b2af7d445cbc3");
                } else if (obj instanceof ArrayList) {
                    bVar.a = (T) ((ArrayList) obj);
                    int size = ((ArrayList) bVar.a).size();
                    if (ConfigurableScrollTabAgent.this.getHostCellManager() instanceof ShieldNodeCellManager) {
                        j hostCellManager = ConfigurableScrollTabAgent.this.getHostCellManager();
                        if (hostCellManager == null) {
                            throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                        }
                        i = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().firstHeaderExtraHeight;
                    } else {
                        i = 0;
                    }
                    if (ConfigurableScrollTabAgent.this.getHostCellManager() instanceof ShieldNodeCellManager) {
                        j hostCellManager2 = ConfigurableScrollTabAgent.this.getHostCellManager();
                        if (hostCellManager2 == null) {
                            throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                        }
                        i2 = ((ShieldNodeCellManager) hostCellManager2).getDividerThemePackage().lastFooterExtraHeight;
                    } else {
                        i2 = 10;
                    }
                    int i4 = 0;
                    boolean z = false;
                    while (i4 < size) {
                        Object obj2 = ((ArrayList) bVar.a).get(i4);
                        h.a(obj2, "visibleAgentList[index]");
                        String str = (String) obj2;
                        if (g.a((CharSequence) str, (CharSequence) ConfigurableScrollTabAgent.PICASSO_SCROLL_TAB_PREFIX, false) || g.a((CharSequence) str, (CharSequence) ConfigurableScrollTabAgent.MRN_SCROLL_TAB_PREFIX, false)) {
                            ConfigurableScrollTabAgent.this.isScrollTabFirst = i4 == 0;
                            ConfigurableScrollTabAgent.this.isScrollTabLast = i4 == size + (-1);
                            z = true;
                        }
                        i4++;
                    }
                    if (z) {
                        if (ConfigurableScrollTabAgent.this.pageExtraHeaderHeight == null) {
                            ConfigurableScrollTabAgent.this.pageExtraHeaderHeight = Integer.valueOf(i);
                        }
                        if (ConfigurableScrollTabAgent.this.pageExtraFooterHeight == null) {
                            ConfigurableScrollTabAgent.this.pageExtraFooterHeight = Integer.valueOf(i2);
                        }
                        ShieldGlobalFeatureInterface feature = ConfigurableScrollTabAgent.this.getFeature();
                        if (ConfigurableScrollTabAgent.this.isScrollTabFirst) {
                            intValue = 0;
                        } else {
                            Integer num = ConfigurableScrollTabAgent.this.pageExtraHeaderHeight;
                            if (num == null) {
                                h.a();
                            }
                            intValue = num.intValue();
                        }
                        PageDividerThemeParams firstHeaderExtraHeight = PageDividerThemeParams.firstHeaderExtraHeight(intValue);
                        h.a((Object) firstHeaderExtraHeight, "PageDividerThemeParams\n … pageExtraHeaderHeight!!)");
                        feature.setPageDividerTheme(firstHeaderExtraHeight);
                        ShieldGlobalFeatureInterface feature2 = ConfigurableScrollTabAgent.this.getFeature();
                        if (!ConfigurableScrollTabAgent.this.isScrollTabLast) {
                            Integer num2 = ConfigurableScrollTabAgent.this.pageExtraFooterHeight;
                            if (num2 == null) {
                                h.a();
                            }
                            i3 = num2.intValue();
                        }
                        PageDividerThemeParams lastFooterExtraHeight = PageDividerThemeParams.lastFooterExtraHeight(i3);
                        h.a((Object) lastFooterExtraHeight, "PageDividerThemeParams\n … pageExtraFooterHeight!!)");
                        feature2.setPageDividerTheme(lastFooterExtraHeight);
                    }
                }
            }
        });
        h.a((Object) c, "whiteBoard.getObservable…}\n            }\n        }");
        this.visibilityAgentSubscription = c;
    }

    private final void unregisterAgentsObs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf708356ec2e3471b5a9ff4f2de6d66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf708356ec2e3471b5a9ff4f2de6d66f");
            return;
        }
        k kVar = this.visibilityAgentSubscription;
        if (kVar == null) {
            h.a("visibilityAgentSubscription");
        }
        if (kVar != null) {
            k kVar2 = this.visibilityAgentSubscription;
            if (kVar2 == null) {
                h.a("visibilityAgentSubscription");
            }
            kVar2.unsubscribe();
        }
    }

    public final void setZFrameLayoutRes(int i) {
        this.zFrameLayoutResId = i;
    }

    public static /* synthetic */ void setTabConfigs$default(ConfigurableScrollTabAgent configurableScrollTabAgent, List list, int i, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, Drawable drawable, Drawable drawable2, int i5, Integer num, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTabConfigs");
        }
        configurableScrollTabAgent.setTabConfigs(list, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? false : z, (i6 & 8) != 0 ? true : z2, (i6 & 16) != 0 ? -1 : i2, (i6 & 32) != 0 ? -1 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? false : z3, drawable, drawable2, (i6 & 1024) != 0 ? 4 : i5, num);
    }

    public final void setTabConfigs(@NotNull List<ScrollTabConfigModel> list, int i, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, @Nullable Drawable drawable, @Nullable Drawable drawable2, int i5, @Nullable Integer num) {
        ViewGroup.LayoutParams layoutParams;
        HashMap hashMap;
        HashMap hashMap2;
        ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider;
        ViewGroup agentContainerView;
        ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider2;
        Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), drawable, drawable2, Integer.valueOf(i5), num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2d13c049898d6f0ec13fd6b1c91c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2d13c049898d6f0ec13fd6b1c91c96");
            return;
        }
        h.b(list, "configs");
        this.currentIndex = reComputeCurrentIndex(list, i);
        this.bottomOffset = aq.a(getContext(), i4);
        int size = this.isPicasso ? list.size() : i5;
        TabRowItem tabRowItem = this.tabRowItem;
        if (tabRowItem != null && (iEventDispatcherProvider2 = tabRowItem.pageScrollEventDispatcherProvider) != null) {
            this.pageScrollEventDispatcherProvider = iEventDispatcherProvider2;
            ComponentScrollEventHelper componentScrollEventHelper = this.pageScrollEventHelper;
            if (componentScrollEventHelper != null) {
                componentScrollEventHelper.setEventDispatcher(iEventDispatcherProvider2);
            }
        }
        TabRowItem tabRowItem2 = this.tabRowItem;
        if (tabRowItem2 != null && (iEventDispatcherProvider = tabRowItem2.verticalScrollEventDispatcherProvider) != null) {
            if (this.verticalScrollEventHelper == null) {
                ab abVar = this.pageContainer;
                if (!(abVar instanceof CommonPageContainer)) {
                    abVar = null;
                }
                CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
                if (commonPageContainer != null && (agentContainerView = commonPageContainer.getAgentContainerView()) != null) {
                    Context context = getContext();
                    h.a((Object) context, "context");
                    if (agentContainerView != null) {
                        ViewGroup viewGroup = agentContainerView;
                        this.verticalScrollEventHelper = new ComponentScrollEventHelper(context, viewGroup, this);
                        ComponentScrollEventHelper componentScrollEventHelper2 = this.verticalScrollEventHelper;
                        if (componentScrollEventHelper2 != null) {
                            componentScrollEventHelper2.setPostEventView(viewGroup);
                        }
                    } else {
                        throw new o("null cannot be cast to non-null type android.view.View");
                    }
                }
                ab abVar2 = this.pageContainer;
                if (!(abVar2 instanceof CommonPageContainer)) {
                    abVar2 = null;
                }
                setScrollEventListener((CommonPageContainer) abVar2, false);
                r rVar = r.a;
            }
            ComponentScrollEventHelper componentScrollEventHelper3 = this.verticalScrollEventHelper;
            if (componentScrollEventHelper3 != null) {
                componentScrollEventHelper3.setEventDispatcher(iEventDispatcherProvider);
            }
        }
        List<String> list2 = this.tabKeyTitleArray;
        list2.clear();
        List<ScrollTabConfigModel> list3 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.h.a((Iterable) list3, 10));
        for (ScrollTabConfigModel scrollTabConfigModel : list3) {
            arrayList.add(scrollTabConfigModel.getTitle());
        }
        list2.addAll(arrayList);
        List<String> list4 = this.tabKeyArray;
        list4.clear();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.h.a((Iterable) list3, 10));
        for (ScrollTabConfigModel scrollTabConfigModel2 : list3) {
            arrayList2.add(scrollTabConfigModel2.getIndex());
        }
        list4.addAll(arrayList2);
        updateTabs();
        for (ScrollTabConfigModel scrollTabConfigModel3 : list3) {
            if (!scrollTabConfigModel3.getConfigKeys().isEmpty()) {
                if (getWhiteBoard().e("dr_abTestInfo") != null) {
                    Serializable e = getWhiteBoard().e("dr_abTestInfo");
                    if (e == null) {
                        throw new o("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
                    }
                    hashMap = (HashMap) e;
                } else {
                    hashMap = null;
                }
                ArrayList<ArrayList<ShieldConfigInfo>> shieldConfig = AgentConfigParser.getShieldConfig(scrollTabConfigModel3.getConfigKeys(), hashMap);
                h.a((Object) shieldConfig, "AgentConfigParser.getShi…it.configKeys, extraInfo)");
                scrollTabConfigModel3.setShieldKeys(shieldConfig);
            } else if (!scrollTabConfigModel3.getModuleItemKeys().isEmpty()) {
                if (getWhiteBoard().e("dr_abTestInfo") != null) {
                    Serializable e2 = getWhiteBoard().e("dr_abTestInfo");
                    if (e2 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
                    }
                    hashMap2 = (HashMap) e2;
                } else {
                    hashMap2 = null;
                }
                ArrayList<ArrayList<ShieldConfigInfo>> shieldConfigInfo = AgentConfigParser.getShieldConfigInfo(scrollTabConfigModel3.getModuleItemKeys(), hashMap2);
                h.a((Object) shieldConfigInfo, "AgentConfigParser.getShi…oduleItemKeys, extraInfo)");
                scrollTabConfigModel3.setShieldKeys(shieldConfigInfo);
            } else {
                continue;
            }
        }
        if (this.currentConfigModels.size() == 0) {
            reloadScrollTab(list, z, z2, size);
            onPageChangedCallback(this.loadedPages, this.loadedPageKeys);
        } else {
            refreshScrollTab(list, z, z2, size);
            onPageChangedCallback(this.loadedPages, this.loadedPageKeys);
        }
        ScrollTabViewCellItem scrollTabViewCellItem = this.viewCellItem;
        if (scrollTabViewCellItem == null) {
            h.a("viewCellItem");
        }
        scrollTabViewCellItem.updateSectionGap(i2, i3, drawable, drawable2);
        if (num != null) {
            int intValue = num.intValue();
            ViewPager viewPager = this.pager;
            if (viewPager != null) {
                viewPager.setBackgroundColor(intValue);
            }
        }
        int agentTop = getAgentTop();
        if (agentTop > 0) {
            if (this.bottomAlwaysHoverInitPos < agentTop) {
                this.bottomAlwaysHoverInitPos = agentTop;
            }
            notifyHoverPosControlData(Integer.valueOf(-this.bottomAlwaysHoverInitPos), null);
        }
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (outerRecyclerView != null) {
            int height = (outerRecyclerView.getHeight() - getScrollTabOffset()) + i4;
            ViewPager viewPager2 = this.pager;
            if (viewPager2 == null || height != viewPager2.getHeight()) {
                ViewPager viewPager3 = this.pager;
                if (!(viewPager3 instanceof ScrollTabViewPager)) {
                    viewPager3 = null;
                }
                ScrollTabViewPager scrollTabViewPager = (ScrollTabViewPager) viewPager3;
                if (scrollTabViewPager != null && (layoutParams = scrollTabViewPager.getLayoutParams()) != null) {
                    layoutParams.height = (outerRecyclerView.getHeight() - getScrollTabOffset()) + i4;
                }
            }
        }
        setDisableHorizontalScroll(z3);
        updateAgentCell();
    }

    private final void setLazyLoad(boolean z) {
        this.isLazyLoad = z;
    }

    private final void setOffscreenPageLimit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dce860280da9c6d6dd809c983b8374a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dce860280da9c6d6dd809c983b8374a");
            return;
        }
        if (!this.isPicasso) {
            i = (int) Math.ceil(i / 2.0d);
        }
        this.offscreenPageLimit = i;
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(this.offscreenPageLimit);
        }
    }

    private final void setDisableHorizontalScroll(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80b2c25e24fc6fff07b3204a35e8c2bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80b2c25e24fc6fff07b3204a35e8c2bb");
            return;
        }
        ViewPager viewPager = this.pager;
        if (!(viewPager instanceof ScrollTabViewPager)) {
            viewPager = null;
        }
        ScrollTabViewPager scrollTabViewPager = (ScrollTabViewPager) viewPager;
        if (scrollTabViewPager != null) {
            scrollTabViewPager.setDisableHorizontalScroll(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isConfigKeyEmpty(java.util.List<com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel> r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.changeQuickRedirect
            java.lang.String r11 = "a7675f0df04adbf74bfc9ef71fcbe863"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L2f:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r13.next()
            com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel r1 = (com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel) r1
            java.util.ArrayList r2 = r1.getConfigKeys()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L49
            return r9
        L49:
            java.util.ArrayList r1 = r1.getModuleItemKeys()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r0
            if (r1 == 0) goto L2f
            return r9
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.isConfigKeyEmpty(java.util.List):boolean");
    }

    private final void reloadScrollTab(List<ScrollTabConfigModel> list, boolean z, boolean z2, int i) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a28f5c6a3949d264da39e887069f82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a28f5c6a3949d264da39e887069f82f");
            return;
        }
        List<ScrollTabConfigModel> list2 = this.currentConfigModels;
        list2.clear();
        list2.addAll(list);
        for (ScrollTabConfigModel scrollTabConfigModel : list2) {
            Iterator<T> it = scrollTabConfigModel.getShieldKeys().iterator();
            while (it.hasNext()) {
                for (ShieldConfigInfo shieldConfigInfo : (ArrayList) it.next()) {
                    HashMap<String, Serializable> arguments = scrollTabConfigModel.getArguments();
                    if (arguments != null) {
                        shieldConfigInfo.arguments = arguments;
                    }
                }
            }
        }
        setLazyLoadAndLoadCountConfigs(list, i, z2);
        createFragments(z2);
        updateFragments(z);
        ScrollTabViewCellItem scrollTabViewCellItem = this.viewCellItem;
        if (scrollTabViewCellItem == null) {
            h.a("viewCellItem");
        }
        scrollTabViewCellItem.createScrollTabViewItem();
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            Fragment hostFragment = getHostFragment();
            h.a((Object) hostFragment, "hostFragment");
            FragmentManager childFragmentManager = hostFragment.getChildFragmentManager();
            h.a((Object) childFragmentManager, "hostFragment.childFragmentManager");
            viewPager.setAdapter(new ScrollTabAdapter(this, childFragmentManager));
            if (viewPager.getAdapter() != null) {
                viewPager.setOffscreenPageLimit(this.offscreenPageLimit);
                viewPager.setCurrentItem(this.currentIndex, false);
            }
        }
    }

    private final void setLazyLoadAndLoadCountConfigs(List<ScrollTabConfigModel> list, int i, boolean z) {
        Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c9cafc9d655772cabee39bcfdfab96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c9cafc9d655772cabee39bcfdfab96");
            return;
        }
        setLazyLoad(z);
        setOffscreenPageLimit(i);
        computeLoadPages(list, this.currentIndex);
    }

    private final void configurableRefreshScrollTab(List<ScrollTabConfigModel> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "397f46540b3b8100c4b3f196724fb409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "397f46540b3b8100c4b3f196724fb409");
            return;
        }
        int size = list.size();
        List c = kotlin.collections.h.c((Collection) kotlin.collections.t.a);
        int i = 0;
        while (i < size) {
            if (!TextUtils.isEmpty(list.get(i).getTabKey())) {
                ConfigurableScrollTabAgent configurableScrollTabAgent = this;
                Iterator<T> it = configurableScrollTabAgent.currentConfigModels.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.h.a();
                    }
                    if (TextUtils.equals(list.get(i).getTabKey(), ((ScrollTabConfigModel) next).getTabKey())) {
                        c.add(configurableScrollTabAgent.fragments.get(i2));
                        break;
                    }
                    i2 = i3;
                }
            } else if (i < this.currentConfigModels.size() && this.currentConfigModels.get(i) != null && TextUtils.isEmpty(this.currentConfigModels.get(i).getTabKey())) {
                c.add(this.fragments.get(i));
            }
            int i4 = i + 1;
            if (c.size() < i4) {
                LazyLoadShieldFragment lazyLoadShieldFragment = new LazyLoadShieldFragment();
                if (z) {
                    lazyLoadShieldFragment.addOnFirstUserVisibleListener(new ConfigurableScrollTabAgent$configurableRefreshScrollTab$$inlined$apply$lambda$1(lazyLoadShieldFragment, this, z, i));
                }
                lazyLoadShieldFragment.setIndex(i);
                lazyLoadShieldFragment.setZFrameLayoutRes(this.zFrameLayoutResId);
                lazyLoadShieldFragment.setInterceptPageLifecycle(true);
                c.add(lazyLoadShieldFragment);
            }
            i = i4;
        }
        this.fragments.clear();
        this.fragments.addAll(c);
        for (int i5 = 0; i5 < size; i5++) {
            LazyLoadShieldFragment lazyLoadShieldFragment2 = this.fragments.get(i5);
            if (!h.a(list.get(i5).getShieldKeys(), lazyLoadShieldFragment2.getShieldConfigInfo())) {
                if (!this.loadedPages.contains(Integer.valueOf(i5))) {
                    String tabKey = list.get(i5).getTabKey();
                    if (tabKey == null || tabKey.length() == 0) {
                        continue;
                    } else {
                        HashMap<String, Integer> hashMap = this.loadedPageKeys;
                        String tabKey2 = list.get(i5).getTabKey();
                        if (hashMap == null) {
                            throw new o("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                        }
                        if (!hashMap.containsKey(tabKey2)) {
                        }
                    }
                }
                lazyLoadShieldFragment2.setShieldConfigInfo(list.get(i5).getShieldKeys());
                lazyLoadShieldFragment2.resetAgents();
            }
            lazyLoadShieldFragment2.setZFrameLayoutRes(this.zFrameLayoutResId);
            lazyLoadShieldFragment2.setIndex(i5);
            lazyLoadShieldFragment2.setTabKey(list.get(i5).getTabKey());
        }
    }

    private final int reComputeCurrentIndex(List<ScrollTabConfigModel> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cc9f5af232fa21a311b4664726a3826", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cc9f5af232fa21a311b4664726a3826")).intValue();
        }
        if (this.currentIndex == -1) {
            return Math.max(0, i);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!TextUtils.isEmpty(list.get(i3).getTabKey())) {
                ConfigurableScrollTabAgent configurableScrollTabAgent = this;
                Iterator<T> it = configurableScrollTabAgent.currentConfigModels.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            kotlin.collections.h.a();
                        }
                        if (!TextUtils.equals(list.get(i3).getTabKey(), ((ScrollTabConfigModel) next).getTabKey())) {
                            i4 = i5;
                        } else if (i4 != configurableScrollTabAgent.currentIndex) {
                        }
                    }
                }
            } else {
                if (i3 < this.currentConfigModels.size()) {
                    if (this.currentConfigModels.get(i3) != null) {
                        if (TextUtils.isEmpty(this.currentConfigModels.get(i3).getTabKey())) {
                            if (i3 != this.currentIndex) {
                            }
                            i2 = i3;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private final void refreshScrollTab(List<ScrollTabConfigModel> list, boolean z, boolean z2, int i) {
        PagerAdapter adapter;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "374c28a4b7dd57b9533e2b811040d1c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "374c28a4b7dd57b9533e2b811040d1c6");
            return;
        }
        setLazyLoadAndLoadCountConfigs(list, i, z2);
        configurableRefreshScrollTab(list, z2);
        List<ScrollTabConfigModel> list2 = this.currentConfigModels;
        list2.clear();
        list2.addAll(list);
        for (ScrollTabConfigModel scrollTabConfigModel : list2) {
            Iterator<T> it = scrollTabConfigModel.getShieldKeys().iterator();
            while (it.hasNext()) {
                for (ShieldConfigInfo shieldConfigInfo : (ArrayList) it.next()) {
                    HashMap<String, Serializable> arguments = scrollTabConfigModel.getArguments();
                    if (arguments != null) {
                        shieldConfigInfo.arguments = arguments;
                    }
                }
            }
        }
        updateFragments(z);
        ViewPager viewPager = this.pager;
        if (viewPager != null && (adapter = viewPager.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        updatePager();
    }

    @Override // com.dianping.shield.components.scrolltab.PageComposeInterface
    @Nullable
    public v getSubFeatureBridgeInterface(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f414f6289097d44206338cf410cf6c7", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f414f6289097d44206338cf410cf6c7") : this.fragments.get(i);
    }

    @Override // com.dianping.shield.components.scrolltab.PageComposeInterface
    @Nullable
    public ShieldGlobalFeatureInterface getCurrentChildFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54611075984cbbd8e77095396d3aa685", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGlobalFeatureInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54611075984cbbd8e77095396d3aa685");
        }
        int size = this.fragments.size();
        int i = this.currentIndex;
        if (i >= 0 && size > i) {
            return this.fragments.get(this.currentIndex).getFeature();
        }
        return null;
    }

    @Override // com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90dddf3a7a76dd5cc64a360fd3847c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90dddf3a7a76dd5cc64a360fd3847c5c");
            return;
        }
        super.onDestroy();
        this.verticalScrollEventHelper = null;
        this.pageScrollEventHelper = null;
        unregisterAgentsObs();
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0192a96262e527f7cd2412886c94d665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0192a96262e527f7cd2412886c94d665");
            return;
        }
        h.b(pageAppearType, "type");
        super.onPageAppear(pageAppearType);
        for (LazyLoadShieldFragment lazyLoadShieldFragment : this.fragments) {
            lazyLoadShieldFragment.onPageAppear(pageAppearType);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "176c2f9f7864d5f8c832cebb9428c51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "176c2f9f7864d5f8c832cebb9428c51c");
            return;
        }
        h.b(pageDisappearType, "type");
        super.onPageDisappear(pageDisappearType);
        for (LazyLoadShieldFragment lazyLoadShieldFragment : this.fragments) {
            lazyLoadShieldFragment.onPageDisappear(pageDisappearType);
        }
    }

    public void setTopState(@NotNull HoverState hoverState) {
        Object[] objArr = {hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d606bd81086d5c9ee251abafb9acc947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d606bd81086d5c9ee251abafb9acc947");
            return;
        }
        h.b(hoverState, "hoverState");
        this.hoverState = hoverState;
    }

    public static /* synthetic */ void setAutoOffset$default(ConfigurableScrollTabAgent configurableScrollTabAgent, boolean z, int i, int i2, TopPositionInterface.AutoStopTop autoStopTop, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAutoOffset");
        }
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            autoStopTop = TopPositionInterface.AutoStopTop.NONE;
        }
        configurableScrollTabAgent.setAutoOffset(z, i, i2, autoStopTop);
    }

    public final void setAutoOffset(boolean z, int i, int i2, @NotNull TopPositionInterface.AutoStopTop autoStopTop) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), autoStopTop};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c694480ab0269b207a74117123bec80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c694480ab0269b207a74117123bec80c");
            return;
        }
        h.b(autoStopTop, "stopTop");
        this.needAutoOffset = z;
        this.offset = aq.a(getContext(), i);
        this.zPosition = i2;
        this.stopTop = autoStopTop;
    }

    @Override // com.dianping.shield.bridge.feature.HoverPosControl
    public void addHoverPosControlObserver(@NotNull HoverPosControlObserver hoverPosControlObserver) {
        Object[] objArr = {hoverPosControlObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1e923f18a7852445c5b3abe9c7dfb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1e923f18a7852445c5b3abe9c7dfb46");
            return;
        }
        h.b(hoverPosControlObserver, "hoverPosControlObserver");
        this.hoverPosControlObserverArray.add(hoverPosControlObserver);
    }

    @Override // com.dianping.shield.bridge.feature.HoverPosControl
    public void removeHoverPosControlObserver(@NotNull HoverPosControlObserver hoverPosControlObserver) {
        Object[] objArr = {hoverPosControlObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "987ab0fa506d204f919bc11393fed4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "987ab0fa506d204f919bc11393fed4ff");
            return;
        }
        h.b(hoverPosControlObserver, "hoverPosControlObserver");
        this.hoverPosControlObserverArray.remove(hoverPosControlObserver);
    }

    @Override // com.dianping.shield.bridge.feature.HoverPosControl
    public void notifyHoverPosControlData(@Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d96bc144ac969735df5b1859002ca06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d96bc144ac969735df5b1859002ca06c");
            return;
        }
        if (!h.a(this.lastBottomTranslateY, num)) {
            if (num != null) {
                int intValue = num.intValue();
                int size = this.hoverPosControlObserverArray.size();
                for (int i = 0; i < size; i++) {
                    this.hoverPosControlObserverArray.get(i).setBottomTranslateY(intValue);
                }
            }
            this.lastBottomTranslateY = num;
        }
        if (!h.a(this.lastTopTranslateY, num2)) {
            if (num2 != null) {
                int intValue2 = num2.intValue();
                int size2 = this.hoverPosControlObserverArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    this.hoverPosControlObserverArray.get(i2).setTopTranslateY(intValue2);
                }
            }
            this.lastTopTranslateY = num2;
        }
    }

    private final void updateTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3fde2832a08ede1aec1d174deff5406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3fde2832a08ede1aec1d174deff5406");
            return;
        }
        AbstractTabInterface abstractTabInterface = this.tabWidget;
        if (abstractTabInterface != null) {
            if (this.tabKeyArray.size() < this.minTabCount) {
                abstractTabInterface.setVisibility(8);
                return;
            }
            abstractTabInterface.setVisibility(0);
            List<String> list = this.tabKeyArray;
            if (list == null) {
                throw new o("null cannot be cast to non-null type java.util.Collection<T>");
            }
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                abstractTabInterface.setTabs((String[]) array);
                return;
            }
            throw new o("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private final void createFragments(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f691260a181902f21359004e04d7e12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f691260a181902f21359004e04d7e12d");
            return;
        }
        List<LazyLoadShieldFragment> list = this.fragments;
        list.clear();
        List<ScrollTabConfigModel> list2 = this.currentConfigModels;
        ArrayList arrayList = new ArrayList(kotlin.collections.h.a((Iterable) list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            ScrollTabConfigModel scrollTabConfigModel = (ScrollTabConfigModel) obj;
            LazyLoadShieldFragment lazyLoadShieldFragment = new LazyLoadShieldFragment();
            lazyLoadShieldFragment.setIndex(i);
            lazyLoadShieldFragment.setZFrameLayoutRes(this.zFrameLayoutResId);
            lazyLoadShieldFragment.setInterceptPageLifecycle(true);
            if (z) {
                lazyLoadShieldFragment.addOnFirstUserVisibleListener(new ConfigurableScrollTabAgent$createFragments$$inlined$with$lambda$1(lazyLoadShieldFragment, i, scrollTabConfigModel, this, z));
            } else {
                lazyLoadShieldFragment.setShieldConfigInfo(scrollTabConfigModel.getShieldKeys());
                lazyLoadShieldFragment.resetAgents();
            }
            arrayList.add(lazyLoadShieldFragment);
            i = i2;
        }
        list.addAll(arrayList);
    }

    private final void updateFragments(boolean z) {
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "679d4a1d6e4efe280aaf16d656879d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "679d4a1d6e4efe280aaf16d656879d42");
            return;
        }
        for (Object obj : this.fragments) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            LazyLoadShieldFragment lazyLoadShieldFragment = (LazyLoadShieldFragment) obj;
            if (z) {
                lazyLoadShieldFragment.setSharedWhiteBoard(getWhiteBoard());
            }
            if (this.currentConfigModels.get(i).getNeedPullToRefresh()) {
                Bundle pageArgument = this.currentConfigModels.get(i).getPageArgument();
                if (pageArgument != null) {
                    pageArgument.putInt(WhiteBoardKeyConsts.PARAM_PAGECONTAINER_MODE, 1);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt(WhiteBoardKeyConsts.PARAM_PAGECONTAINER_MODE, 1);
                    this.currentConfigModels.get(i).setPageArgument(bundle);
                }
            }
            Bundle pageArgument2 = this.currentConfigModels.get(i).getPageArgument();
            if (pageArgument2 != null) {
                lazyLoadShieldFragment.setArguments(pageArgument2);
            }
            i = i2;
        }
    }

    public final void switchToPage(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View currentFocus;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6344ea55ad22a5eebcce833dc0504d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6344ea55ad22a5eebcce833dc0504d7");
            return;
        }
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        int measuredHeight = outerRecyclerView != null ? outerRecyclerView.getMeasuredHeight() : 0;
        ViewPager viewPager = this.pager;
        if (measuredHeight < (viewPager != null ? viewPager.getMeasuredHeight() : 0) && this.outRvLayoutParamHeight > 0) {
            Fragment hostFragment = getHostFragment();
            h.a((Object) hostFragment, "hostFragment");
            FragmentActivity activity = hostFragment.getActivity();
            IBinder iBinder = null;
            Object systemService = activity != null ? activity.getSystemService("input_method") : null;
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                Fragment hostFragment2 = getHostFragment();
                h.a((Object) hostFragment2, "hostFragment");
                FragmentActivity activity2 = hostFragment2.getActivity();
                if (activity2 != null && (currentFocus = activity2.getCurrentFocus()) != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
            RecyclerView outerRecyclerView2 = getOuterRecyclerView();
            if (outerRecyclerView2 != null && (layoutParams2 = outerRecyclerView2.getLayoutParams()) != null) {
                layoutParams2.height = this.outRvLayoutParamHeight;
            }
        } else {
            RecyclerView outerRecyclerView3 = getOuterRecyclerView();
            if (outerRecyclerView3 != null && (layoutParams = outerRecyclerView3.getLayoutParams()) != null) {
                layoutParams.height = -1;
            }
        }
        this.currentIndex = i;
        ViewPager viewPager2 = this.pager;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(this.currentIndex, false);
        }
        this.isPageBeingDragged = false;
    }

    public final void setMinTabCount(int i) {
        this.minTabCount = i;
    }

    private final ShieldSectionCellItem getCellItem() {
        ScrollTabViewCellItem scrollTabViewCellItem;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d4542295ff15261dd1f6180167f525", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d4542295ff15261dd1f6180167f525");
        }
        if (this.tabRowItem != null) {
            scrollTabViewCellItem = this.viewCellItem;
            if (scrollTabViewCellItem == null) {
                h.a("viewCellItem");
            }
        } else {
            scrollTabViewCellItem = null;
        }
        return scrollTabViewCellItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getOuterRecyclerView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d7f7d3f7e09161bb1dc2daa922c0ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d7f7d3f7e09161bb1dc2daa922c0ad");
        }
        ab abVar = this.pageContainer;
        h.a((Object) abVar, "pageContainer");
        ViewGroup agentContainerView = abVar.getAgentContainerView();
        if (!(agentContainerView instanceof PageContainerRecyclerView)) {
            agentContainerView = null;
        }
        return (PageContainerRecyclerView) agentContainerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getInnerRecyclerView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b92327d339a750abf744b88364070d77", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b92327d339a750abf744b88364070d77");
        }
        if (this.fragments.size() > this.currentIndex) {
            ab<?> pageContainer = this.fragments.get(this.currentIndex).getPageContainer();
            Object agentContainerView = pageContainer != null ? pageContainer.getAgentContainerView() : null;
            if (!(agentContainerView instanceof RecyclerView)) {
                agentContainerView = null;
            }
            return (RecyclerView) agentContainerView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonPageContainer getInnerPageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8043bd11da4f1813233faa4f6e03d8c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonPageContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8043bd11da4f1813233faa4f6e03d8c0");
        }
        if (this.fragments.size() > this.currentIndex) {
            ab<?> pageContainer = this.fragments.get(this.currentIndex).getPageContainer();
            if (!(pageContainer instanceof CommonPageContainer)) {
                pageContainer = null;
            }
            return (CommonPageContainer) pageContainer;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecyclerViewScrollToTop(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00dcaee3a9d4a21c3a44d66980103f19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00dcaee3a9d4a21c3a44d66980103f19")).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof ShieldLayoutManagerInterface)) {
            layoutManager = null;
        }
        ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) layoutManager;
        return shieldLayoutManagerInterface != null && shieldLayoutManagerInterface.findFirstVisibleItemPosition(true) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecyclerViewScrollToBottom(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35448632e50099e25af018f4c914ec40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35448632e50099e25af018f4c914ec40")).booleanValue();
        }
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof ShieldLayoutManagerInterface)) {
                layoutManager = null;
            }
            ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) layoutManager;
            if (shieldLayoutManagerInterface != null) {
                int findLastVisibleItemPosition = shieldLayoutManagerInterface.findLastVisibleItemPosition(true);
                RecyclerView.a adapter = recyclerView.getAdapter();
                h.a((Object) adapter, "rv.adapter");
                if (findLastVisibleItemPosition == adapter.getItemCount() - 1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initFling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "250b2a8b8cafaa45fcc34b18ade57b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "250b2a8b8cafaa45fcc34b18ade57b6d");
            return;
        }
        RecyclerView innerRecyclerView = getInnerRecyclerView();
        if (innerRecyclerView != null) {
            innerRecyclerView.stopNestedScroll();
        }
        FlingHelper flingHelper = this.flingHelper;
        if (flingHelper == null) {
            h.a("flingHelper");
        }
        flingHelper.finishFling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOuterScrollListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73412db66cfc4585ff93ebb1bcd095bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73412db66cfc4585ff93ebb1bcd095bc");
            return;
        }
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (outerRecyclerView != null) {
            outerRecyclerView.removeOnScrollListener(this.outerScrollListener);
            outerRecyclerView.addOnScrollListener(this.outerScrollListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollTabOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f119028772ce7ddb1ceae53af9257d53", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f119028772ce7ddb1ceae53af9257d53")).intValue() : getScrollTabHeight() + getScrollTabHoverOffset();
    }

    private final int getScrollTabHoverOffset() {
        TopInfo topInfo;
        if (this.offset > 0) {
            return this.offset;
        }
        TabRowItem tabRowItem = this.tabRowItem;
        if (tabRowItem == null || (topInfo = tabRowItem.topInfo) == null) {
            return 0;
        }
        return topInfo.offset;
    }

    private final int getScrollTabHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac80a6fb6bbb972ce949f8383fe4b999", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac80a6fb6bbb972ce949f8383fe4b999")).intValue();
        }
        View tabView = tabView();
        if (tabView == null || tabView.getVisibility() != 0) {
            return 0;
        }
        TabRowItem tabRowItem = this.tabRowItem;
        int i = tabRowItem != null ? tabRowItem.tabHeight : 0;
        TabRowItem tabRowItem2 = this.tabRowItem;
        int i2 = i + (tabRowItem2 != null ? tabRowItem2.marginTop : 0);
        TabRowItem tabRowItem3 = this.tabRowItem;
        return aq.a(getContext(), i2 + (tabRowItem3 != null ? tabRowItem3.marginBottom : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computeLoadPages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c3d7fe8b38500ecf44784f09f269d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c3d7fe8b38500ecf44784f09f269d8f");
        } else {
            computeLoadPages(this.currentConfigModels, i);
        }
    }

    private final void computeLoadPages(List<ScrollTabConfigModel> list, int i) {
        int i2 = 0;
        boolean z = true;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e43b086a239fa97300264a20514723a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e43b086a239fa97300264a20514723a1");
            return;
        }
        int size = list.size();
        int b = kotlin.ranges.g.b(0, i - this.offscreenPageLimit);
        int c = size > 0 ? kotlin.ranges.g.c(this.offscreenPageLimit + i, size - 1) : 0;
        if (size == 0) {
            this.loadedPageKeys.clear();
            this.loadedPages.clear();
        } else if (this.isLazyLoad) {
            String tabKey = list.get(i).getTabKey();
            if (tabKey != null && tabKey.length() != 0) {
                z = false;
            }
            if (!z) {
                String tabKey2 = list.get(i).getTabKey();
                if (tabKey2 != null) {
                    this.loadedPageKeys.put(tabKey2, Integer.valueOf(i));
                }
            } else {
                this.loadedPages.add(Integer.valueOf(i));
            }
            Iterator<Integer> it = this.loadedPages.iterator();
            h.a((Object) it, "loadedPages.iterator()");
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (b > intValue || c < intValue) {
                    it.remove();
                }
            }
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.h.a();
                }
                ConfigurableScrollTabAgent configurableScrollTabAgent = this;
                String tabKey3 = ((ScrollTabConfigModel) obj).getTabKey();
                if (tabKey3 != null && configurableScrollTabAgent.loadedPageKeys.keySet().contains(tabKey3)) {
                    configurableScrollTabAgent.loadedPageKeys.keySet().remove(tabKey3);
                    configurableScrollTabAgent.loadedPageKeys.put(tabKey3, Integer.valueOf(i2));
                }
                i2 = i3;
            }
            Iterator<Integer> it2 = this.loadedPageKeys.values().iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (b > intValue2 || c < intValue2) {
                    it2.remove();
                }
            }
        } else {
            this.loadedPages.clear();
            this.loadedPageKeys.clear();
            if (b > c) {
                return;
            }
            while (true) {
                String tabKey4 = list.get(b).getTabKey();
                if (!(tabKey4 == null || tabKey4.length() == 0)) {
                    String tabKey5 = list.get(b).getTabKey();
                    if (tabKey5 != null) {
                        this.loadedPageKeys.put(tabKey5, Integer.valueOf(b));
                    }
                } else {
                    this.loadedPages.add(Integer.valueOf(b));
                }
                if (b == c) {
                    return;
                }
                b++;
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0016J,\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016¨\u0006!"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabViewCell;", "Lcom/dianping/shield/viewcell/BaseViewCell;", "Lcom/dianping/shield/feature/TopPositionInterface;", "context", "Landroid/content/Context;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;Landroid/content/Context;)V", "dividerShowType", "Lcom/dianping/agentsdk/framework/DividerInterface$ShowType;", "sectionPosition", "", "getRowCount", "getSectionCount", "getSectionFooterHeight", "", "sectionPoisition", "getSectionHeaderHeight", "getTopPositionInfo", "Lcom/dianping/shield/feature/TopPositionInterface$TopPositionInfo;", "cellType", "Lcom/dianping/shield/entity/CellType;", "section", "row", "getViewType", "rowPosition", "getViewTypeCount", "onCreateView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "updateView", "", Constants.EventType.VIEW, "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ScrollTabViewCell extends BaseViewCell implements TopPositionInterface {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ ConfigurableScrollTabAgent this$0;

        @Override // com.dianping.shield.viewcell.BaseViewCell, com.dianping.agentsdk.framework.al
        public final float getSectionFooterHeight(int i) {
            return 0.0f;
        }

        @Override // com.dianping.shield.viewcell.BaseViewCell, com.dianping.agentsdk.framework.al
        public final float getSectionHeaderHeight(int i) {
            return 0.0f;
        }

        @Override // com.dianping.agentsdk.framework.af
        public final void updateView(@Nullable View view, int i, int i2, @Nullable ViewGroup viewGroup) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollTabViewCell(@NotNull ConfigurableScrollTabAgent configurableScrollTabAgent, Context context) {
            super(context);
            h.b(context, "context");
            this.this$0 = configurableScrollTabAgent;
            Object[] objArr = {configurableScrollTabAgent, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b48fb1f9ac256aa299d9c3bda33f6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b48fb1f9ac256aa299d9c3bda33f6a");
            }
        }

        @Override // com.dianping.agentsdk.framework.af
        @Nullable
        public final View onCreateView(@Nullable ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c81bd242a0aaa8ac67884cba981e25f", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c81bd242a0aaa8ac67884cba981e25f");
            }
            RecyclerView outerRecyclerView = this.this$0.getOuterRecyclerView();
            if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                outerRecyclerView = null;
            }
            PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
            if (pageContainerRecyclerView != null && this.this$0.enableContinuousScroll) {
                pageContainerRecyclerView.setNestedScrollingParent(new ScrollTabNestedScrollingParent(this.this$0, pageContainerRecyclerView));
            }
            ab abVar = this.this$0.pageContainer;
            if (!(abVar instanceof CommonPageContainer)) {
                abVar = null;
            }
            CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
            if (commonPageContainer != null) {
                commonPageContainer.addFlingListener(new RecyclerView.i() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$ScrollTabViewCell$onCreateView$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.support.v7.widget.RecyclerView.i
                    public final boolean onFling(int i2, int i3) {
                        boolean z;
                        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "735163f0402cbebb7962dec001f295e0", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "735163f0402cbebb7962dec001f295e0")).booleanValue();
                        }
                        ConfigurableScrollTabAgent.ScrollTabViewCell.this.this$0.initFling();
                        z = ConfigurableScrollTabAgent.ScrollTabViewCell.this.this$0.isPagerContainerAttached;
                        if (z) {
                            ConfigurableScrollTabAgent.ScrollTabViewCell.this.this$0.addOuterScrollListener();
                        }
                        ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.ScrollTabViewCell.this.this$0).initFling(i3);
                        return false;
                    }
                });
            }
            switch (i) {
                case 1:
                    return this.this$0.tabView();
                case 2:
                    ConfigurableScrollTabAgent configurableScrollTabAgent = this.this$0;
                    Context context = getContext();
                    h.a((Object) context, "context");
                    return configurableScrollTabAgent.createPager(context, viewGroup);
                default:
                    return null;
            }
        }

        @Override // com.dianping.agentsdk.framework.af
        public final int getRowCount(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "566a013752cea4e9c5a85032fc75bb6b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "566a013752cea4e9c5a85032fc75bb6b")).intValue();
            }
            View tabView = this.this$0.tabView();
            return (tabView == null || tabView.getVisibility() != 0) ? 1 : 2;
        }

        @Override // com.dianping.agentsdk.framework.af
        public final int getSectionCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4ddc1dd7166d5e771136fc5ac16ef4c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4ddc1dd7166d5e771136fc5ac16ef4c")).intValue() : this.this$0.fragments.isEmpty() ? 0 : 1;
        }

        @Override // com.dianping.agentsdk.framework.af
        public final int getViewType(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65146352e9846aa5eee16a311bd178b5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65146352e9846aa5eee16a311bd178b5")).intValue();
            }
            View tabView = this.this$0.tabView();
            if (tabView != null) {
                if (tabView.getVisibility() != 0) {
                    return i2 != 0 ? 0 : 2;
                }
                switch (i2) {
                    case 0:
                        return 1;
                    case 1:
                        return 2;
                    default:
                        return 0;
                }
            }
            return 2;
        }

        public final int getViewTypeCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1774bb8814a8ed0c203daaedec3c52e6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1774bb8814a8ed0c203daaedec3c52e6")).intValue();
            }
            View tabView = this.this$0.tabView();
            return (tabView == null || tabView.getVisibility() != 0) ? 1 : 2;
        }

        @Override // com.dianping.shield.feature.TopPositionInterface
        @Nullable
        public final TopPositionInterface.TopPositionInfo getTopPositionInfo(@Nullable CellType cellType, int i, final int i2) {
            Object[] objArr = {cellType, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a8125b60f939734830191f69db1a86c", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopPositionInterface.TopPositionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a8125b60f939734830191f69db1a86c");
            }
            View tabView = this.this$0.tabView();
            if (tabView != null && tabView.getVisibility() == 0 && i2 == 0) {
                TopPositionInterface.TopPositionInfo topPositionInfo = new TopPositionInterface.TopPositionInfo();
                topPositionInfo.startTop = TopPositionInterface.AutoStartTop.SELF;
                topPositionInfo.stopTop = this.this$0.stopTop;
                topPositionInfo.needAutoOffset = this.this$0.needAutoOffset;
                topPositionInfo.offset = this.this$0.offset;
                topPositionInfo.zPosition = this.this$0.zPosition;
                topPositionInfo.onTopStateChangeListener = new TopPositionInterface.OnTopStateChangeListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$ScrollTabViewCell$getTopPositionInfo$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.feature.TopPositionInterface.OnTopStateChangeListener
                    public final void onTopStageChanged(CellType cellType2, int i3, int i4, TopLinearLayoutManager.TopState topState) {
                        Object[] objArr2 = {cellType2, Integer.valueOf(i3), Integer.valueOf(i4), topState};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "039ec4c3d00c42c2aa8fce95311e4285", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "039ec4c3d00c42c2aa8fce95311e4285");
                            return;
                        }
                        ConfigurableScrollTabAgent configurableScrollTabAgent = ConfigurableScrollTabAgent.ScrollTabViewCell.this.this$0;
                        h.a((Object) topState, "state");
                        configurableScrollTabAgent.topState = topState;
                    }
                };
                return topPositionInfo;
            }
            return null;
        }

        @Override // com.dianping.shield.viewcell.BaseViewCell, com.dianping.agentsdk.framework.s
        @NotNull
        public final s.a dividerShowType(int i) {
            return s.a.NONE;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u0006J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabViewCellItem;", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createScrollTabViewItem", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "updateSectionGap", "sectionHeaderHeight", "", "sectionFooterHeight", "sectionHeaderDrawable", "Landroid/graphics/drawable/Drawable;", "sectionFooterDrawable", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ScrollTabViewCellItem extends ShieldSectionCellItem implements ViewPaintingCallback<ShieldViewHolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
        public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
            Object[] objArr = {shieldViewHolder, obj, nodePath};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4427a300a78ff572919f0818134101f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4427a300a78ff572919f0818134101f8");
            } else {
                h.b(shieldViewHolder, "viewHolder");
            }
        }

        public ScrollTabViewCellItem() {
            Object[] objArr = {ConfigurableScrollTabAgent.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90d45b17b5bbc5024e7ecf09218e1233", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90d45b17b5bbc5024e7ecf09218e1233");
            }
        }

        public final void createScrollTabViewItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3a4481813c9d1d8cf5c8eec34fdd2ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3a4481813c9d1d8cf5c8eec34fdd2ff");
                return;
            }
            ArrayList<SectionItem> arrayList = this.sectionItems;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (!ConfigurableScrollTabAgent.this.fragments.isEmpty()) {
                SectionItem sectionItem = new SectionItem();
                TabRowItem tabRowItem = ConfigurableScrollTabAgent.this.getTabRowItem();
                if (tabRowItem != null) {
                    tabRowItem.setViewType(ConfigurableScrollTabAgent.TYPE_TAB_NEW);
                    sectionItem.addRowItem(tabRowItem);
                }
                ViewItem viewItem = new ViewItem();
                viewItem.viewType = ConfigurableScrollTabAgent.TYPE_PAGER_NEW;
                viewItem.viewPaintingCallback = this;
                sectionItem.addRowItem(new RowItem().addViewItem(viewItem));
                addSectionItem(sectionItem);
            }
        }

        public final void updateSectionGap(int i, int i2, @Nullable Drawable drawable, @Nullable Drawable drawable2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), drawable, drawable2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9703ab9a142de7c948c993cd75e06e7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9703ab9a142de7c948c993cd75e06e7a");
                return;
            }
            if (ConfigurableScrollTabAgent.this.isScrollTabFirst && i == -1) {
                i = 0;
            }
            if (ConfigurableScrollTabAgent.this.isScrollTabLast && i2 == -1) {
                i2 = 0;
            }
            if (this.sectionItems != null) {
                Iterator<SectionItem> it = this.sectionItems.iterator();
                while (it.hasNext()) {
                    SectionItem next = it.next();
                    if (next != null) {
                        next.sectionHeaderGapHeight = i;
                    }
                    if (next != null) {
                        next.sectionFooterGapHeight = i2;
                    }
                    if (drawable != null && next != null) {
                        next.sectionHeaderGapDrawable = drawable;
                    }
                    if (drawable2 != null && next != null) {
                        next.sectionFooterGapDrawable = drawable2;
                    }
                    if (next != null) {
                        next.dividerShowType = DividerStyle.ShowType.NO_BOTTOM;
                    }
                }
            }
        }

        @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
        @NotNull
        public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
            Object[] objArr = {context, viewGroup, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d90d5d3129214eb470aa81e0ee228b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d90d5d3129214eb470aa81e0ee228b1");
            }
            h.b(context, "context");
            RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
            if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                outerRecyclerView = null;
            }
            PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
            if (pageContainerRecyclerView != null && ConfigurableScrollTabAgent.this.enableContinuousScroll) {
                pageContainerRecyclerView.setNestedScrollingParent(new ScrollTabNestedScrollingParent(ConfigurableScrollTabAgent.this, pageContainerRecyclerView));
            }
            ab abVar = ConfigurableScrollTabAgent.this.pageContainer;
            if (!(abVar instanceof CommonPageContainer)) {
                abVar = null;
            }
            CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
            if (commonPageContainer != null) {
                commonPageContainer.addFlingListener(new RecyclerView.i() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$ScrollTabViewCellItem$createViewHolder$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.support.v7.widget.RecyclerView.i
                    public final boolean onFling(int i, int i2) {
                        boolean z;
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "348a92480c9a6aeac8bdebf54a1b16f4", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "348a92480c9a6aeac8bdebf54a1b16f4")).booleanValue();
                        }
                        ConfigurableScrollTabAgent.this.initFling();
                        z = ConfigurableScrollTabAgent.this.isPagerContainerAttached;
                        if (z) {
                            ConfigurableScrollTabAgent.this.addOuterScrollListener();
                        }
                        ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.this).initFling(i2);
                        return false;
                    }
                });
            }
            RecyclerView outerRecyclerView2 = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
            if (!(outerRecyclerView2 instanceof PageContainerRecyclerView)) {
                outerRecyclerView2 = null;
            }
            final PageContainerRecyclerView pageContainerRecyclerView2 = (PageContainerRecyclerView) outerRecyclerView2;
            if (pageContainerRecyclerView2 != null) {
                pageContainerRecyclerView2.addOnTopParamsChangeListener(new com.dianping.agentsdk.pagecontainer.b() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$ScrollTabViewCellItem$createViewHolder$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.agentsdk.pagecontainer.b
                    public final void OnTopParamsChange(boolean z) {
                        int i;
                        int i2;
                        int i3;
                        Integer num;
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f5557d1bf34dd1c42ec00306e673d0bb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f5557d1bf34dd1c42ec00306e673d0bb");
                        } else if (z) {
                            ShieldGlobalFeatureInterface feature = ConfigurableScrollTabAgent.this.getFeature();
                            NodeInfo agent = NodeInfo.agent(ConfigurableScrollTabAgent.this);
                            h.a((Object) agent, "NodeInfo.agent(this@ConfigurableScrollTabAgent)");
                            int nodeGlobalPosition = feature.getNodeGlobalPosition(agent);
                            ConfigurableScrollTabAgent configurableScrollTabAgent = ConfigurableScrollTabAgent.this;
                            Pair<Integer, Integer> viewTopBottom = PageContainerRecyclerView.this.getViewTopBottom(nodeGlobalPosition);
                            configurableScrollTabAgent.alinePageTop = (viewTopBottom == null || (num = (Integer) viewTopBottom.first) == null) ? Integer.MAX_VALUE : num.intValue();
                            i = ConfigurableScrollTabAgent.this.offsetToAnchor;
                            if (i == Integer.MAX_VALUE) {
                                ConfigurableScrollTabAgent configurableScrollTabAgent2 = ConfigurableScrollTabAgent.this;
                                i2 = ConfigurableScrollTabAgent.this.alinePageTop;
                                configurableScrollTabAgent2.offsetToAnchor = i2;
                                ComponentScrollEventHelper componentScrollEventHelper = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                                if (componentScrollEventHelper != null) {
                                    i3 = ConfigurableScrollTabAgent.this.offsetToAnchor;
                                    componentScrollEventHelper.setOffsetToAnchor(i3);
                                }
                            }
                        }
                    }
                });
            }
            ab abVar2 = ConfigurableScrollTabAgent.this.pageContainer;
            if (!(abVar2 instanceof CommonPageContainer)) {
                abVar2 = null;
            }
            CommonPageContainer commonPageContainer2 = (CommonPageContainer) abVar2;
            if (commonPageContainer2 != null) {
                commonPageContainer2.removeContentOffsetListener(ConfigurableScrollTabAgent.this.viewContentOffsetListener);
            }
            ab abVar3 = ConfigurableScrollTabAgent.this.pageContainer;
            if (!(abVar3 instanceof CommonPageContainer)) {
                abVar3 = null;
            }
            CommonPageContainer commonPageContainer3 = (CommonPageContainer) abVar3;
            if (commonPageContainer3 != null) {
                commonPageContainer3.addContentOffsetListener(ConfigurableScrollTabAgent.this.viewContentOffsetListener);
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1776828820) {
                    if (hashCode == 1535583358 && str.equals(ConfigurableScrollTabAgent.TYPE_TAB_NEW)) {
                        if (ConfigurableScrollTabAgent.this.getTabRowItem() != null) {
                            TabRowItem tabRowItem = ConfigurableScrollTabAgent.this.getTabRowItem();
                            IElementContainerExpose containerView = tabRowItem != null ? tabRowItem.getContainerView() : null;
                            if (containerView != null) {
                                return new ShieldViewHolder((TabView) containerView);
                            }
                            throw new o("null cannot be cast to non-null type com.dianping.picassomodule.widget.tab.TabView");
                        }
                        return new ShieldViewHolder(new View(context));
                    }
                } else if (str.equals(ConfigurableScrollTabAgent.TYPE_PAGER_NEW)) {
                    return new ShieldViewHolder(ConfigurableScrollTabAgent.this.createPager(context, viewGroup));
                }
            }
            return new ShieldViewHolder(new View(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getTopTranslateY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e0114f60f94c5c83502f041d55051f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e0114f60f94c5c83502f041d55051f8");
        }
        if (this.pagerInitialTopInScreen != -1) {
            ViewGroup viewGroup = this.pagerContainer;
            if (viewGroup == null) {
                h.a("pagerContainer");
            }
            int i = getViewParentRect(viewGroup).top;
            if (i <= this.pagerInitialTopInScreen) {
                return Integer.valueOf(this.pagerInitialTopInScreen - i);
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAgentTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "087b2eebb3d2ecf3fe238a8bebe0edab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "087b2eebb3d2ecf3fe238a8bebe0edab")).intValue();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (outerRecyclerView != null) {
            outerRecyclerView.getLocationOnScreen(iArr);
        }
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            viewPager.getLocationOnScreen(iArr2);
        }
        return (iArr2[1] - iArr[1]) - getScrollTabOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup createPager(final Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d0e52167f090d8c4171c0233b834bf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d0e52167f090d8c4171c0233b834bf5");
        }
        if (this.pagerContainer == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.scroll_tab_container_layout, viewGroup, false);
            if (inflate == null) {
                throw new o("null cannot be cast to non-null type android.view.ViewGroup");
            }
            this.pagerContainer = (ViewGroup) inflate;
            ViewGroup viewGroup2 = this.pagerContainer;
            if (viewGroup2 == null) {
                h.a("pagerContainer");
            }
            viewGroup2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$createPager$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(@Nullable View view) {
                    ConfigurableScrollTabAgent.OuterOnScrollListener outerOnScrollListener;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "358202c2d01eace4439c2ad71ed0d234", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "358202c2d01eace4439c2ad71ed0d234");
                        return;
                    }
                    ConfigurableScrollTabAgent.this.isPagerContainerAttached = false;
                    RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
                    if (outerRecyclerView != null) {
                        outerOnScrollListener = ConfigurableScrollTabAgent.this.outerScrollListener;
                        outerRecyclerView.removeOnScrollListener(outerOnScrollListener);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(@Nullable View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe3ea39e5e5cdb7b6a348594ea3ca41f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe3ea39e5e5cdb7b6a348594ea3ca41f");
                        return;
                    }
                    ConfigurableScrollTabAgent.this.isPagerContainerAttached = true;
                    RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
                    if (outerRecyclerView != null) {
                        ConfigurableScrollTabAgent.this.addOuterScrollListener();
                        ConfigurableScrollTabAgent.this.outRvLayoutParamHeight = outerRecyclerView.getHeight();
                        ViewPager viewPager = ConfigurableScrollTabAgent.this.pager;
                        if (!(viewPager instanceof ScrollTabViewPager)) {
                            viewPager = null;
                        }
                        ScrollTabViewPager scrollTabViewPager = (ScrollTabViewPager) viewPager;
                        if (scrollTabViewPager != null) {
                            scrollTabViewPager.requestSize(outerRecyclerView.getWidth(), (outerRecyclerView.getHeight() - ConfigurableScrollTabAgent.this.getScrollTabOffset()) + ConfigurableScrollTabAgent.this.bottomOffset);
                        }
                    }
                    ComponentScrollEventHelper componentScrollEventHelper = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                    if (componentScrollEventHelper != null) {
                        componentScrollEventHelper.updateComponentView(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this));
                    }
                }
            });
            ViewGroup viewGroup3 = this.pagerContainer;
            if (viewGroup3 == null) {
                h.a("pagerContainer");
            }
            viewGroup3.getViewTreeObserver().removeOnGlobalLayoutListener(this.pageGlobalLayoutListener);
            ViewGroup viewGroup4 = this.pagerContainer;
            if (viewGroup4 == null) {
                h.a("pagerContainer");
            }
            viewGroup4.getViewTreeObserver().addOnGlobalLayoutListener(this.pageGlobalLayoutListener);
            ViewGroup viewGroup5 = this.pagerContainer;
            if (viewGroup5 == null) {
                h.a("pagerContainer");
            }
            this.pager = (ViewPager) viewGroup5.findViewById(R.id.scroll_tab_pager);
            ViewPager viewPager = this.pager;
            if (viewPager != null) {
                ScrollTabViewPager scrollTabViewPager = (ScrollTabViewPager) (!(viewPager instanceof ScrollTabViewPager) ? null : viewPager);
                if (scrollTabViewPager != null) {
                    this.pageScrollEventHelper = new ComponentScrollEventHelper(context, viewPager, (ComponentScrollEventHelper.IScrollRange) viewPager);
                    ComponentScrollEventHelper componentScrollEventHelper = this.pageScrollEventHelper;
                    if (componentScrollEventHelper != null) {
                        componentScrollEventHelper.setEventDispatcher(this.pageScrollEventDispatcherProvider);
                    }
                    scrollTabViewPager.setScrollEventHelper(this.pageScrollEventHelper);
                    TabRowItem tabRowItem = this.tabRowItem;
                    scrollTabViewPager.setDidInterceptListener(tabRowItem != null ? tabRowItem.onDidInterceptTouchListener : null);
                }
                if (viewPager.getAdapter() == null) {
                    Fragment hostFragment = getHostFragment();
                    h.a((Object) hostFragment, "hostFragment");
                    FragmentManager childFragmentManager = hostFragment.getChildFragmentManager();
                    h.a((Object) childFragmentManager, "hostFragment.childFragmentManager");
                    viewPager.setAdapter(new ScrollTabAdapter(this, childFragmentManager));
                    viewPager.setOffscreenPageLimit(this.offscreenPageLimit);
                }
                viewPager.setCurrentItem(this.currentIndex, false);
                viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$createPager$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;
                    private int prePosition;

                    public final int getPrePosition() {
                        return this.prePosition;
                    }

                    public final void setPrePosition(int i) {
                        this.prePosition = i;
                    }

                    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                    public final void onPageSelected(int i) {
                        List list;
                        HashSet<Integer> hashSet;
                        HashMap<String, Integer> hashMap;
                        ShieldGlobalFeatureInterface currentChildFeature;
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba3a2587f37400a1bd0062ce1524e5dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba3a2587f37400a1bd0062ce1524e5dd");
                            return;
                        }
                        ((LazyLoadShieldFragment) ConfigurableScrollTabAgent.this.fragments.get(i)).setUserVisibleHint(true);
                        TabRowItem tabRowItem2 = ConfigurableScrollTabAgent.this.getTabRowItem();
                        if (tabRowItem2 == null || tabRowItem2.lastSelectedIndex != i) {
                            AbstractTabInterface tabWidget = ConfigurableScrollTabAgent.this.getTabWidget();
                            if (tabWidget != null) {
                                tabWidget.setSelected(i, com.dianping.picassomodule.widget.tab.g.USER_SCROLL);
                            }
                            ConfigurableScrollTabAgent.this.currentIndex = i;
                            TabRowItem tabRowItem3 = ConfigurableScrollTabAgent.this.getTabRowItem();
                            if (tabRowItem3 != null) {
                                tabRowItem3.lastSelectedIndex = ConfigurableScrollTabAgent.this.currentIndex;
                            }
                            ConfigurableScrollTabAgent.this.innerContentOffset = 0;
                        }
                        ar whiteBoard = ConfigurableScrollTabAgent.this.getWhiteBoard();
                        list = ConfigurableScrollTabAgent.this.tabKeyTitleArray;
                        whiteBoard.a("currentPageTitle", (String) list.get(i));
                        ConfigurableScrollTabAgent.this.computeLoadPages(i);
                        ConfigurableScrollTabAgent configurableScrollTabAgent = ConfigurableScrollTabAgent.this;
                        hashSet = ConfigurableScrollTabAgent.this.loadedPages;
                        hashMap = ConfigurableScrollTabAgent.this.loadedPageKeys;
                        configurableScrollTabAgent.onPageChangedCallback(hashSet, hashMap);
                        int agentTop = ConfigurableScrollTabAgent.this.getAgentTop();
                        ConfigurableScrollTabAgent.this.notifyHoverPosControlData(Integer.valueOf(agentTop > 0 ? -agentTop : 0), null);
                        if (agentTop <= 0 || (currentChildFeature = ConfigurableScrollTabAgent.this.getCurrentChildFeature()) == null) {
                            return;
                        }
                        AgentScrollerParams smooth = AgentScrollerParams.toPage().setNeedAutoOffset(true).setOffset(0).setSmooth(false);
                        h.a((Object) smooth, "AgentScrollerParams.toPa…ffset(0).setSmooth(false)");
                        currentChildFeature.scrollToNode(smooth);
                    }

                    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                    public final void onPageScrollStateChanged(int i) {
                        ComponentScrollEventHelper componentScrollEventHelper2;
                        ComponentScrollEventHelper componentScrollEventHelper3;
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8a84f3ecf9ea9c2c2c7fc885407a0b2c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8a84f3ecf9ea9c2c2c7fc885407a0b2c");
                            return;
                        }
                        super.onPageScrollStateChanged(i);
                        componentScrollEventHelper2 = ConfigurableScrollTabAgent.this.pageScrollEventHelper;
                        if (componentScrollEventHelper2 != null && componentScrollEventHelper2.needDragEvent() && i == 1) {
                            componentScrollEventHelper3 = ConfigurableScrollTabAgent.this.pageScrollEventHelper;
                            if (componentScrollEventHelper3 != null) {
                                componentScrollEventHelper3.handleBeginDrag();
                            }
                            ConfigurableScrollTabAgent.this.isPageBeingDragged = true;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
                        r14 = r12.this$0.pageScrollEventHelper;
                     */
                    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onPageScrolled(int r13, float r14, int r15) {
                        /*
                            r12 = this;
                            r0 = 3
                            java.lang.Object[] r0 = new java.lang.Object[r0]
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                            r8 = 0
                            r0[r8] = r1
                            java.lang.Float r1 = java.lang.Float.valueOf(r14)
                            r9 = 1
                            r0[r9] = r1
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                            r2 = 2
                            r0[r2] = r1
                            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$createPager$$inlined$let$lambda$1.changeQuickRedirect
                            java.lang.String r11 = "02598433c34297bbdc2098033e9246fc"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r0
                            r2 = r12
                            r3 = r10
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L2d
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
                            return
                        L2d:
                            super.onPageScrolled(r13, r14, r15)
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            com.dianping.shield.component.utils.ComponentScrollEventHelper r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getPageScrollEventHelper$p(r14)
                            if (r14 == 0) goto L57
                            boolean r14 = r14.needScrollEvent()
                            if (r14 != r9) goto L57
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            boolean r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$isPageBeingDragged$p(r14)
                            if (r14 == 0) goto L57
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            com.dianping.shield.component.utils.ComponentScrollEventHelper r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getPageScrollEventHelper$p(r14)
                            if (r14 == 0) goto L57
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r0 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            int r0 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getPageContentOffset(r0, r13, r15)
                            r14.handleScrollEvent(r0, r8)
                        L57:
                            int r14 = r12.prePosition
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r0 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r0 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r0)
                            int r0 = r0.size()
                            if (r14 >= r0) goto Lc1
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r14)
                            int r14 = r14.size()
                            if (r13 >= r14) goto Lc1
                            int r14 = r12.prePosition
                            if (r14 == r13) goto Lc1
                            if (r15 != 0) goto Lc1
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r14)
                            int r15 = r12.prePosition
                            java.lang.Object r14 = r14.get(r15)
                            com.dianping.shield.components.scrolltab.LazyLoadShieldFragment r14 = (com.dianping.shield.components.scrolltab.LazyLoadShieldFragment) r14
                            com.dianping.shield.entity.ScrollDirection r15 = com.dianping.shield.entity.ScrollDirection.GO_AHEAD
                            r14.onPageScrolled(r15)
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r14)
                            java.lang.Object r14 = r14.get(r13)
                            com.dianping.shield.components.scrolltab.LazyLoadShieldFragment r14 = (com.dianping.shield.components.scrolltab.LazyLoadShieldFragment) r14
                            boolean r14 = r14.isEverUserVisible()
                            if (r14 != 0) goto Lae
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r14)
                            java.lang.Object r14 = r14.get(r13)
                            com.dianping.shield.components.scrolltab.LazyLoadShieldFragment r14 = (com.dianping.shield.components.scrolltab.LazyLoadShieldFragment) r14
                            com.dianping.shield.entity.ScrollDirection r15 = com.dianping.shield.entity.ScrollDirection.STATIC
                            r14.onPageScrolled(r15)
                            goto Lbf
                        Lae:
                            com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.this
                            java.util.List r14 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.access$getFragments$p(r14)
                            java.lang.Object r14 = r14.get(r13)
                            com.dianping.shield.components.scrolltab.LazyLoadShieldFragment r14 = (com.dianping.shield.components.scrolltab.LazyLoadShieldFragment) r14
                            com.dianping.shield.entity.ScrollDirection r15 = com.dianping.shield.entity.ScrollDirection.PAGE_BACK
                            r14.onPageScrolled(r15)
                        Lbf:
                            r12.prePosition = r13
                        Lc1:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$createPager$$inlined$let$lambda$1.onPageScrolled(int, float, int):void");
                    }
                });
            }
        }
        ViewGroup viewGroup6 = this.pagerContainer;
        if (viewGroup6 == null) {
            h.a("pagerContainer");
        }
        return viewGroup6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageContentOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e7d5462f1f9a10cc6dde960b47c5432", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e7d5462f1f9a10cc6dde960b47c5432")).intValue() : (i * aq.a(getContext())) + i2;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaefcb8e24cf344b5f8f606495ccabf1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaefcb8e24cf344b5f8f606495ccabf1")).intValue();
        }
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (outerRecyclerView != null) {
            return outerRecyclerView.computeVerticalScrollRange();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ddc7d805c19e3692bdd93f26eb96c71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ddc7d805c19e3692bdd93f26eb96c71")).intValue();
        }
        RecyclerView outerRecyclerView = getOuterRecyclerView();
        if (outerRecyclerView != null) {
            return outerRecyclerView.getWidth();
        }
        return 0;
    }

    private final void updatePager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8211e4de875f6e90a97b8baeb185c59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8211e4de875f6e90a97b8baeb185c59e");
            return;
        }
        ViewPager viewPager = this.pager;
        if (viewPager == null || viewPager.getCurrentItem() == this.currentIndex) {
            return;
        }
        viewPager.setCurrentItem(this.currentIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollEventListener(CommonPageContainer commonPageContainer, final boolean z) {
        Object[] objArr = {commonPageContainer, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e363a59f5bc63caf33cc4fc7c2c1d048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e363a59f5bc63caf33cc4fc7c2c1d048");
            return;
        }
        if (commonPageContainer != null) {
            commonPageContainer.addContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$setScrollEventListener$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                public final void offsetChanged(int i, int i2) {
                    int i3;
                    ComponentScrollEventHelper componentScrollEventHelper;
                    int i4;
                    int i5;
                    int i6;
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d222730f10f4c95191c553dc1ba88e4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d222730f10f4c95191c553dc1ba88e4d");
                        return;
                    }
                    if (z) {
                        ConfigurableScrollTabAgent.this.innerContentOffset = i2;
                        ConfigurableScrollTabAgent configurableScrollTabAgent = ConfigurableScrollTabAgent.this;
                        i6 = ConfigurableScrollTabAgent.this.outerContentOffset;
                        configurableScrollTabAgent.calOffsetOfAnchor(i6);
                    } else {
                        i3 = ConfigurableScrollTabAgent.this.innerContentOffset;
                        if (i3 <= 0) {
                            ConfigurableScrollTabAgent.this.outerContentOffset = i2;
                        }
                        ComponentScrollEventHelper componentScrollEventHelper2 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                        if (componentScrollEventHelper2 != null && componentScrollEventHelper2.needScrollEvent()) {
                            ConfigurableScrollTabAgent.this.calOffsetOfAnchor(i2);
                        }
                    }
                    ComponentScrollEventHelper componentScrollEventHelper3 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                    if (componentScrollEventHelper3 != null && componentScrollEventHelper3.needScrollEvent() && (componentScrollEventHelper = ConfigurableScrollTabAgent.this.verticalScrollEventHelper) != null) {
                        i4 = ConfigurableScrollTabAgent.this.innerContentOffset;
                        i5 = ConfigurableScrollTabAgent.this.outerContentOffset;
                        componentScrollEventHelper.handleScrollEvent(i, i4 + i5);
                    }
                    RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
                    if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                        outerRecyclerView = null;
                    }
                    PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
                    if (pageContainerRecyclerView == null || ConfigurableScrollTabAgent.this.currentIndex < 0 || ConfigurableScrollTabAgent.this.getInnerRecyclerView() == null) {
                        return;
                    }
                    pageContainerRecyclerView.disableIntercept = ConfigurableScrollTabAgent.this.getAgentTop() == 0;
                }
            });
        }
        if (commonPageContainer != null) {
            commonPageContainer.addOnTouchListener(new View.OnTouchListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$setScrollEventListener$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ComponentScrollEventHelper componentScrollEventHelper;
                    ComponentScrollEventHelper componentScrollEventHelper2;
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c22befaff9f605cda05e6bc5f83e7a8", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c22befaff9f605cda05e6bc5f83e7a8")).booleanValue();
                    }
                    if (ConfigurableScrollTabAgent.this.verticalScrollEventHelper != null) {
                        ComponentScrollEventHelper componentScrollEventHelper3 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                        if (componentScrollEventHelper3 != null && componentScrollEventHelper3.needDragEvent() && motionEvent != null && (componentScrollEventHelper2 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper) != null) {
                            componentScrollEventHelper2.handleEndDragByTouchEvent(motionEvent);
                        }
                        ComponentScrollEventHelper componentScrollEventHelper4 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                        if (componentScrollEventHelper4 != null && componentScrollEventHelper4.needMomentumEvent() && motionEvent != null && (componentScrollEventHelper = ConfigurableScrollTabAgent.this.verticalScrollEventHelper) != null) {
                            componentScrollEventHelper.handleMomentumScrollAndDragEndByEvent(motionEvent);
                        }
                    }
                    return false;
                }
            });
        }
        if (commonPageContainer != null) {
            commonPageContainer.addDragStatusListener(new OnDragStatusListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$setScrollEventListener$3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
                public final void onEndDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView, float f, float f2) {
                    Object[] objArr2 = {pageContainerRecyclerView, Float.valueOf(f), Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b0b6b77895e6f285232b18f32a975cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b0b6b77895e6f285232b18f32a975cd");
                    } else {
                        h.b(pageContainerRecyclerView, "recyclerView");
                    }
                }

                @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
                public final void onBeginDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView) {
                    ComponentScrollEventHelper componentScrollEventHelper;
                    int i;
                    int i2;
                    Object[] objArr2 = {pageContainerRecyclerView};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa71f1b391312bcc76325cb044f8cb13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa71f1b391312bcc76325cb044f8cb13");
                        return;
                    }
                    h.b(pageContainerRecyclerView, "recyclerView");
                    ComponentScrollEventHelper componentScrollEventHelper2 = ConfigurableScrollTabAgent.this.verticalScrollEventHelper;
                    if (componentScrollEventHelper2 == null || !componentScrollEventHelper2.needDragEvent() || (componentScrollEventHelper = ConfigurableScrollTabAgent.this.verticalScrollEventHelper) == null) {
                        return;
                    }
                    i = ConfigurableScrollTabAgent.this.innerContentOffset;
                    i2 = ConfigurableScrollTabAgent.this.outerContentOffset;
                    componentScrollEventHelper.handleBeginDrag(0, i + i2);
                }
            });
        }
    }

    private final boolean isTabFollowPageBottom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9f0f35914e3c7b807970ad993722eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9f0f35914e3c7b807970ad993722eb")).booleanValue() : getViewParentRect(this.pager).bottom <= getScrollTabOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void calOffsetOfAnchor(int r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r9 = 0
            r8[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.changeQuickRedirect
            java.lang.String r11 = "ff9f45529948ff4770bccb1cc54be72b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1f:
            com.dianping.shield.node.useritem.HoverState r1 = r12.hoverState
            com.dianping.shield.node.useritem.HoverState r2 = com.dianping.shield.node.useritem.HoverState.NORMAL
            r3 = -1
            if (r1 != r2) goto L35
            int r0 = r12.alinePageTop
            int r0 = r0 - r13
            int r13 = r12.getScrollTabHoverOffset()
            int r0 = r0 - r13
            if (r0 < 0) goto L32
            r12.offsetToAnchor = r0
        L32:
            r12.tabFollowLeaveContentY = r3
            goto L79
        L35:
            com.dianping.shield.node.useritem.HoverState r1 = r12.hoverState
            com.dianping.shield.node.useritem.HoverState r2 = com.dianping.shield.node.useritem.HoverState.HOVER
            if (r1 != r2) goto L6c
            com.dianping.shield.component.extensions.tabs.TabRowItem r1 = r12.tabRowItem
            if (r1 == 0) goto L46
            com.dianping.shield.node.useritem.TopInfo r1 = r1.topInfo
            if (r1 == 0) goto L46
            com.dianping.shield.node.useritem.TopInfo$EndType r1 = r1.endType
            goto L47
        L46:
            r1 = 0
        L47:
            com.dianping.shield.node.useritem.TopInfo$EndType r2 = com.dianping.shield.node.useritem.TopInfo.EndType.NONE
            if (r1 == r2) goto L66
            int r1 = r12.tabFollowLeaveContentY
            if (r1 != r3) goto L58
            boolean r1 = r12.isTabFollowPageBottom()
            if (r1 == 0) goto L58
            r12.tabFollowLeaveContentY = r13
            goto L66
        L58:
            int r1 = r12.tabFollowLeaveContentY
            if (r1 >= 0) goto L5d
            goto L66
        L5d:
            if (r13 <= r1) goto L66
            int r1 = r12.tabFollowLeaveContentY
            int r13 = r13 - r1
            int r13 = -r13
            r12.offsetToAnchor = r13
            goto L67
        L66:
            r0 = 0
        L67:
            if (r0 != 0) goto L79
            r12.offsetToAnchor = r9
            goto L79
        L6c:
            int r0 = r12.tabFollowLeaveContentY
            if (r0 >= 0) goto L71
            goto L79
        L71:
            if (r13 <= r0) goto L79
            int r0 = r12.tabFollowLeaveContentY
            int r13 = r13 - r0
            int r13 = -r13
            r12.offsetToAnchor = r13
        L79:
            com.dianping.shield.component.utils.ComponentScrollEventHelper r13 = r12.verticalScrollEventHelper
            if (r13 == 0) goto L83
            int r0 = r12.offsetToAnchor
            r13.setOffsetToAnchor(r0)
            return
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.calOffsetOfAnchor(int):void");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabAdapter;", "Lcom/dianping/shield/components/scrolltab/ScrollTabFragmentStatePagerAdapter;", "Lcom/dianping/shield/components/scrolltab/model/ScrollTabConfigModel;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;Landroid/support/v4/app/FragmentManager;)V", "dataEquals", "", "oldData", "newData", "getCount", "", "getDataPosition", "data", "oldPos", "getItem", "Landroid/support/v4/app/Fragment;", "position", "getItemData", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ScrollTabAdapter extends ScrollTabFragmentStatePagerAdapter<ScrollTabConfigModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ ConfigurableScrollTabAgent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollTabAdapter(@NotNull ConfigurableScrollTabAgent configurableScrollTabAgent, FragmentManager fragmentManager) {
            super(fragmentManager);
            h.b(fragmentManager, "fm");
            this.this$0 = configurableScrollTabAgent;
            Object[] objArr = {configurableScrollTabAgent, fragmentManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7a135132eeff47998b25ab02bb271c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7a135132eeff47998b25ab02bb271c0");
            } else {
                fragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent.ScrollTabAdapter.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                    public final void onFragmentViewCreated(@Nullable FragmentManager fragmentManager2, @Nullable Fragment fragment, @Nullable View view, @Nullable Bundle bundle) {
                        OnDidInterceptTouchListener onDidInterceptTouchListener;
                        Object[] objArr2 = {fragmentManager2, fragment, view, bundle};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "696b6cc82109aafefb382bcfd71a4c20", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "696b6cc82109aafefb382bcfd71a4c20");
                            return;
                        }
                        super.onFragmentViewCreated(fragmentManager2, fragment, view, bundle);
                        if (fragment instanceof CommonShieldFragment) {
                            ab<?> pageContainer = ((CommonShieldFragment) fragment).getPageContainer();
                            if (!(pageContainer instanceof CommonPageContainer)) {
                                pageContainer = null;
                            }
                            CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
                            if (commonPageContainer != null) {
                                ComponentScrollEventHelper componentScrollEventHelper = ScrollTabAdapter.this.this$0.verticalScrollEventHelper;
                                if (componentScrollEventHelper != null && componentScrollEventHelper.getEventDispatcher() != null) {
                                    ScrollTabAdapter.this.this$0.setScrollEventListener(commonPageContainer, true);
                                }
                                TabRowItem tabRowItem = ScrollTabAdapter.this.this$0.getTabRowItem();
                                if (tabRowItem != null && (onDidInterceptTouchListener = tabRowItem.onDidInterceptTouchListener) != null) {
                                    commonPageContainer.setDidInterceptListener(onDidInterceptTouchListener);
                                }
                                commonPageContainer.setMaxFlingVelocity(5000.0f);
                            }
                        }
                    }

                    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                    public final void onFragmentActivityCreated(@Nullable FragmentManager fragmentManager2, @Nullable Fragment fragment, @Nullable Bundle bundle) {
                        int i;
                        ShieldGlobalFeatureInterface feature;
                        ShieldGlobalFeatureInterface feature2;
                        int i2 = 0;
                        Object[] objArr2 = {fragmentManager2, fragment, bundle};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18d3a31b358ca0b551f31b6bd0c2903e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18d3a31b358ca0b551f31b6bd0c2903e");
                            return;
                        }
                        super.onFragmentActivityCreated(fragmentManager2, fragment, bundle);
                        if (fragment instanceof CommonShieldFragment) {
                            CommonShieldFragment commonShieldFragment = (CommonShieldFragment) fragment;
                            ShieldGlobalFeatureInterface feature3 = commonShieldFragment.getFeature();
                            if (feature3 != null) {
                                PageDividerThemeParams needFirstHeader = PageDividerThemeParams.needFirstHeader(true);
                                h.a((Object) needFirstHeader, "PageDividerThemeParams\n …   .needFirstHeader(true)");
                                feature3.setPageDividerTheme(needFirstHeader);
                            }
                            if (ScrollTabAdapter.this.this$0.isScrollTabFirst) {
                                if (ScrollTabAdapter.this.this$0.pageExtraHeaderHeight != null) {
                                    Integer num = ScrollTabAdapter.this.this$0.pageExtraHeaderHeight;
                                    if (num == null) {
                                        h.a();
                                    }
                                    i = num.intValue();
                                } else if (ScrollTabAdapter.this.this$0.getHostCellManager() instanceof ShieldNodeCellManager) {
                                    j hostCellManager = ScrollTabAdapter.this.this$0.getHostCellManager();
                                    if (hostCellManager == null) {
                                        throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                                    }
                                    i = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().firstHeaderExtraHeight;
                                } else {
                                    i = 0;
                                }
                                ShieldGlobalFeatureInterface feature4 = commonShieldFragment.getFeature();
                                if (feature4 != null) {
                                    PageDividerThemeParams firstHeaderExtraHeight = PageDividerThemeParams.firstHeaderExtraHeight(i);
                                    h.a((Object) firstHeaderExtraHeight, "PageDividerThemeParams\n …ragmentExtraHeaderHeight)");
                                    feature4.setPageDividerTheme(firstHeaderExtraHeight);
                                }
                            } else {
                                ShieldGlobalFeatureInterface feature5 = commonShieldFragment.getFeature();
                                if (feature5 != null) {
                                    PageDividerThemeParams firstHeaderExtraHeight2 = PageDividerThemeParams.firstHeaderExtraHeight(0);
                                    h.a((Object) firstHeaderExtraHeight2, "PageDividerThemeParams\n …firstHeaderExtraHeight(0)");
                                    feature5.setPageDividerTheme(firstHeaderExtraHeight2);
                                }
                            }
                            if (ScrollTabAdapter.this.this$0.isScrollTabLast) {
                                if (ScrollTabAdapter.this.this$0.pageExtraFooterHeight != null) {
                                    Integer num2 = ScrollTabAdapter.this.this$0.pageExtraFooterHeight;
                                    if (num2 == null) {
                                        h.a();
                                    }
                                    i2 = num2.intValue();
                                } else if (ScrollTabAdapter.this.this$0.getHostCellManager() instanceof ShieldNodeCellManager) {
                                    j hostCellManager2 = ScrollTabAdapter.this.this$0.getHostCellManager();
                                    if (hostCellManager2 == null) {
                                        throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                                    }
                                    i2 = ((ShieldNodeCellManager) hostCellManager2).getDividerThemePackage().lastFooterExtraHeight;
                                }
                                ShieldGlobalFeatureInterface feature6 = commonShieldFragment.getFeature();
                                if (feature6 != null) {
                                    PageDividerThemeParams lastFooterExtraHeight = PageDividerThemeParams.lastFooterExtraHeight(i2);
                                    h.a((Object) lastFooterExtraHeight, "PageDividerThemeParams\n …ragmentExtraFooterHeight)");
                                    feature6.setPageDividerTheme(lastFooterExtraHeight);
                                }
                            } else {
                                ShieldGlobalFeatureInterface feature7 = commonShieldFragment.getFeature();
                                if (feature7 != null) {
                                    PageDividerThemeParams lastFooterExtraHeight2 = PageDividerThemeParams.lastFooterExtraHeight(0);
                                    h.a((Object) lastFooterExtraHeight2, "PageDividerThemeParams\n ….lastFooterExtraHeight(0)");
                                    feature7.setPageDividerTheme(lastFooterExtraHeight2);
                                }
                            }
                            j hostCellManager3 = ScrollTabAdapter.this.this$0.getHostCellManager();
                            if (!(hostCellManager3 instanceof ShieldNodeCellManager)) {
                                hostCellManager3 = null;
                            }
                            ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) hostCellManager3;
                            if (shieldNodeCellManager != null) {
                                if (shieldNodeCellManager.getDividerThemePackage().defaultHeaderDrawable != null && (feature2 = commonShieldFragment.getFeature()) != null) {
                                    PageDividerThemeParams headerDrawable = PageDividerThemeParams.headerDrawable(shieldNodeCellManager.getDividerThemePackage().defaultHeaderDrawable);
                                    h.a((Object) headerDrawable, "PageDividerThemeParams\n …().defaultHeaderDrawable)");
                                    feature2.setPageDividerTheme(headerDrawable);
                                }
                                if (shieldNodeCellManager.getDividerThemePackage().defaultFooterDrawable != null && (feature = commonShieldFragment.getFeature()) != null) {
                                    PageDividerThemeParams footerDrawable = PageDividerThemeParams.footerDrawable(shieldNodeCellManager.getDividerThemePackage().defaultFooterDrawable);
                                    h.a((Object) footerDrawable, "PageDividerThemeParams\n …().defaultFooterDrawable)");
                                    feature.setPageDividerTheme(footerDrawable);
                                }
                                ShieldGlobalFeatureInterface feature8 = commonShieldFragment.getFeature();
                                if (feature8 != null) {
                                    PageDividerThemeParams headerHeight = PageDividerThemeParams.headerHeight(shieldNodeCellManager.getDividerThemePackage().defaultHeaderHeight);
                                    h.a((Object) headerHeight, "PageDividerThemeParams\n …ge().defaultHeaderHeight)");
                                    feature8.setPageDividerTheme(headerHeight);
                                }
                                ShieldGlobalFeatureInterface feature9 = commonShieldFragment.getFeature();
                                if (feature9 != null) {
                                    PageDividerThemeParams footerHeight = PageDividerThemeParams.footerHeight(shieldNodeCellManager.getDividerThemePackage().defaultFooterHeight);
                                    h.a((Object) footerHeight, "PageDividerThemeParams\n …ge().defaultFooterHeight)");
                                    feature9.setPageDividerTheme(footerHeight);
                                }
                            }
                            j<?> hostCellManager4 = commonShieldFragment.getHostCellManager();
                            if (!(hostCellManager4 instanceof ShieldNodeCellManager)) {
                                hostCellManager4 = null;
                            }
                            ShieldNodeCellManager shieldNodeCellManager2 = (ShieldNodeCellManager) hostCellManager4;
                            if (shieldNodeCellManager2 != null) {
                                shieldNodeCellManager2.setHoverPosControl(ScrollTabAdapter.this.this$0);
                            }
                            ab<?> pageContainer = commonShieldFragment.getPageContainer();
                            if (!(pageContainer instanceof CommonPageContainer)) {
                                pageContainer = null;
                            }
                            CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
                            if (commonPageContainer != null) {
                                commonPageContainer.removeContentOffsetListener(ScrollTabAdapter.this.this$0.fragmentContentOffsetListener);
                            }
                            ab<?> pageContainer2 = commonShieldFragment.getPageContainer();
                            if (!(pageContainer2 instanceof CommonPageContainer)) {
                                pageContainer2 = null;
                            }
                            CommonPageContainer commonPageContainer2 = (CommonPageContainer) pageContainer2;
                            if (commonPageContainer2 != null) {
                                commonPageContainer2.addContentOffsetListener(ScrollTabAdapter.this.this$0.fragmentContentOffsetListener);
                            }
                        }
                    }

                    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                    public final void onFragmentStarted(@Nullable FragmentManager fragmentManager2, @Nullable Fragment fragment) {
                        Object[] objArr2 = {fragmentManager2, fragment};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e6908f3ed03cdc94b46f7081a9b42d6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e6908f3ed03cdc94b46f7081a9b42d6c");
                            return;
                        }
                        super.onFragmentStarted(fragmentManager2, fragment);
                        if (fragment instanceof CommonShieldFragment) {
                            j<?> hostCellManager = ((CommonShieldFragment) fragment).getHostCellManager();
                            if (!(hostCellManager instanceof ShieldNodeCellManager)) {
                                hostCellManager = null;
                            }
                            ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) hostCellManager;
                            if (shieldNodeCellManager != null) {
                                j hostCellManager2 = ScrollTabAdapter.this.this$0.getHostCellManager();
                                if (!(hostCellManager2 instanceof IScreenVisibleExposeEdge)) {
                                    hostCellManager2 = null;
                                }
                                shieldNodeCellManager.setGlobalScreenVisibleProxy((IScreenVisibleExposeEdge) hostCellManager2);
                            }
                        }
                    }
                }, false);
            }
        }

        @Override // com.dianping.shield.components.scrolltab.ScrollTabFragmentStatePagerAdapter
        @NotNull
        public final Fragment getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c66c4a6b4c3276e8d3a149de7879c2f2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c66c4a6b4c3276e8d3a149de7879c2f2");
            }
            ((LazyLoadShieldFragment) this.this$0.fragments.get(i)).setTabKey(((ScrollTabConfigModel) this.this$0.currentConfigModels.get(i)).getTabKey());
            ((LazyLoadShieldFragment) this.this$0.fragments.get(i)).setIndex(i);
            return (Fragment) this.this$0.fragments.get(i);
        }

        @Override // android.support.v4.view.PagerAdapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93ba5fda900b9ad49f61711eb38982af", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93ba5fda900b9ad49f61711eb38982af")).intValue() : this.this$0.fragments.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.shield.components.scrolltab.ScrollTabFragmentStatePagerAdapter
        @Nullable
        public final ScrollTabConfigModel getItemData(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea00a5687d09868d0dfc8c741b5a4ef", RobustBitConfig.DEFAULT_VALUE)) {
                return (ScrollTabConfigModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea00a5687d09868d0dfc8c741b5a4ef");
            }
            if (i < this.this$0.currentConfigModels.size()) {
                return (ScrollTabConfigModel) this.this$0.currentConfigModels.get(i);
            }
            return null;
        }

        @Override // com.dianping.shield.components.scrolltab.ScrollTabFragmentStatePagerAdapter
        public final boolean dataEquals(@Nullable ScrollTabConfigModel scrollTabConfigModel, @Nullable ScrollTabConfigModel scrollTabConfigModel2) {
            Object[] objArr = {scrollTabConfigModel, scrollTabConfigModel2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77b826c702e8388049a133e9a85152a6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77b826c702e8388049a133e9a85152a6")).booleanValue();
            }
            return TextUtils.equals(scrollTabConfigModel != null ? scrollTabConfigModel.getTabKey() : null, scrollTabConfigModel2 != null ? scrollTabConfigModel2.getTabKey() : null);
        }

        @Override // com.dianping.shield.components.scrolltab.ScrollTabFragmentStatePagerAdapter
        public final int getDataPosition(@Nullable ScrollTabConfigModel scrollTabConfigModel, int i) {
            int i2 = 0;
            Object[] objArr = {scrollTabConfigModel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82e83aa2ac98ae2add220756ffb673ed", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82e83aa2ac98ae2add220756ffb673ed")).intValue();
            }
            for (Object obj : this.this$0.currentConfigModels) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.h.a();
                }
                ScrollTabConfigModel scrollTabConfigModel2 = (ScrollTabConfigModel) obj;
                if (TextUtils.isEmpty(scrollTabConfigModel != null ? scrollTabConfigModel.getTabKey() : null)) {
                    if (i2 == i && TextUtils.isEmpty(scrollTabConfigModel2.getTabKey())) {
                        return i2;
                    }
                    i2 = i3;
                } else {
                    if (TextUtils.equals(scrollTabConfigModel2.getTabKey(), scrollTabConfigModel != null ? scrollTabConfigModel.getTabKey() : null)) {
                        return i2;
                    }
                    i2 = i3;
                }
            }
            return -1;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ViewContentOffsetListener;", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ViewContentOffsetListener implements ContentOffsetListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ViewContentOffsetListener() {
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08d3e54b1e5e65d052e7edd93d3725d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08d3e54b1e5e65d052e7edd93d3725d3");
            } else if (i2 >= 0) {
                ConfigurableScrollTabAgent.this.notifyHoverPosControlData(Integer.valueOf(-(ConfigurableScrollTabAgent.this.bottomAlwaysHoverInitPos - i2 > 0 ? ConfigurableScrollTabAgent.this.bottomAlwaysHoverInitPos - i2 : 0)), ConfigurableScrollTabAgent.this.getTopTranslateY());
                RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
                if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                    outerRecyclerView = null;
                }
                PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
                if (pageContainerRecyclerView == null || ConfigurableScrollTabAgent.this.currentIndex < 0 || ConfigurableScrollTabAgent.this.getInnerRecyclerView() == null) {
                    return;
                }
                pageContainerRecyclerView.disableIntercept = ConfigurableScrollTabAgent.this.getAgentTop() == 0;
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$FragmentContentOffsetListener;", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class FragmentContentOffsetListener implements ContentOffsetListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public FragmentContentOffsetListener() {
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac706fbccb54fc3229bf217ae90ae594", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac706fbccb54fc3229bf217ae90ae594");
            } else if (i2 > 0) {
                if (ConfigurableScrollTabAgent.this.pagerInitialTopInScreen == -1 && ConfigurableScrollTabAgent.this.hoverState == HoverState.HOVER) {
                    ConfigurableScrollTabAgent.this.pagerInitialTopInScreen = ConfigurableScrollTabAgent.this.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this)).top;
                }
                ConfigurableScrollTabAgent.this.notifyHoverPosControlData(ConfigurableScrollTabAgent.this.getAgentTop() <= 0 ? 0 : null, ConfigurableScrollTabAgent.this.getTopTranslateY());
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$PageGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "onGlobalLayout", "", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PageGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PageGlobalLayoutListener() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b45fc125b14f39172e4816afad671cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b45fc125b14f39172e4816afad671cd");
                return;
            }
            RecyclerView outerRecyclerView = ConfigurableScrollTabAgent.this.getOuterRecyclerView();
            if (outerRecyclerView != null) {
                int height = (outerRecyclerView.getHeight() - ConfigurableScrollTabAgent.this.getScrollTabOffset()) + ConfigurableScrollTabAgent.this.bottomOffset;
                ViewPager viewPager = ConfigurableScrollTabAgent.this.pager;
                if (viewPager == null || height != viewPager.getHeight()) {
                    if (ConfigurableScrollTabAgent.this.outRvLayoutParamHeight != outerRecyclerView.getHeight()) {
                        ConfigurableScrollTabAgent.this.outRvLayoutParamHeight = outerRecyclerView.getHeight();
                    }
                    ViewPager viewPager2 = ConfigurableScrollTabAgent.this.pager;
                    if (!(viewPager2 instanceof ScrollTabViewPager)) {
                        viewPager2 = null;
                    }
                    ScrollTabViewPager scrollTabViewPager = (ScrollTabViewPager) viewPager2;
                    if (scrollTabViewPager != null) {
                        scrollTabViewPager.requestSize(outerRecyclerView.getWidth(), height);
                    }
                }
            }
            int agentTop = ConfigurableScrollTabAgent.this.getAgentTop();
            if (agentTop <= 0 || ConfigurableScrollTabAgent.this.bottomAlwaysHoverInitPos >= agentTop) {
                return;
            }
            ConfigurableScrollTabAgent.this.bottomAlwaysHoverInitPos = agentTop;
            ConfigurableScrollTabAgent.this.notifyHoverPosControlData(Integer.valueOf(-agentTop), null);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$OuterOnScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class OuterOnScrollListener extends RecyclerView.k {
        public static ChangeQuickRedirect changeQuickRedirect;

        public OuterOnScrollListener() {
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
            boolean z;
            int i3;
            boolean z2 = true;
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "180e37120531dad46cdbef3e59506f4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "180e37120531dad46cdbef3e59506f4e");
                return;
            }
            RecyclerView innerRecyclerView = ConfigurableScrollTabAgent.this.getInnerRecyclerView();
            if (innerRecyclerView != null) {
                if (i2 <= 0 || ConfigurableScrollTabAgent.this.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this)).top > 0) {
                    z = false;
                } else if (!ConfigurableScrollTabAgent.this.isRecyclerViewScrollToBottom(innerRecyclerView) && ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.this).isFinished()) {
                    i3 = ConfigurableScrollTabAgent.this.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this)).top;
                    z = true;
                    if (i2 > 0 && ConfigurableScrollTabAgent.this.getAgentTop() == 0) {
                        z = true;
                    }
                    if (i2 < 0 || ConfigurableScrollTabAgent.this.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this)).top < 0) {
                        z2 = z;
                    } else if (ConfigurableScrollTabAgent.this.getAgentTop() != 0 && ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.this).isFinished()) {
                        i3 = ConfigurableScrollTabAgent.this.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(ConfigurableScrollTabAgent.this)).top;
                    }
                    ConfigurableScrollTabAgent configurableScrollTabAgent = ConfigurableScrollTabAgent.this;
                    configurableScrollTabAgent.log("fling remainDistance canScrollVertically: " + innerRecyclerView.canScrollVertically(i2) + " shouldStopOuterRV: " + z2);
                    if (innerRecyclerView.canScrollVertically(i2) || !z2) {
                    }
                    if (recyclerView != null) {
                        recyclerView.removeOnScrollListener(this);
                    }
                    if (recyclerView != null) {
                        recyclerView.stopScroll();
                    }
                    if (recyclerView != null) {
                        recyclerView.scrollBy(0, i3);
                    }
                    float currentVelocity = ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.this).getCurrentVelocity();
                    double splineFlingDistance = ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.this).getSplineFlingDistance(currentVelocity);
                    ConfigurableScrollTabAgent configurableScrollTabAgent2 = ConfigurableScrollTabAgent.this;
                    configurableScrollTabAgent2.log("fling remainDistance " + splineFlingDistance + " velocity " + currentVelocity);
                    if (splineFlingDistance > 0.0d) {
                        innerRecyclerView.fling(0, (int) currentVelocity);
                    }
                    ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.this).finishFling();
                    return;
                } else {
                    z = true;
                }
                i3 = 0;
                if (i2 > 0) {
                    z = true;
                }
                if (i2 < 0) {
                }
                z2 = z;
                ConfigurableScrollTabAgent configurableScrollTabAgent3 = ConfigurableScrollTabAgent.this;
                configurableScrollTabAgent3.log("fling remainDistance canScrollVertically: " + innerRecyclerView.canScrollVertically(i2) + " shouldStopOuterRV: " + z2);
                if (innerRecyclerView.canScrollVertically(i2)) {
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d186bad9d5ad573598f40548f85bdc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d186bad9d5ad573598f40548f85bdc3");
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || ConfigurableScrollTabAgent.this.flingHelper == null) {
                return;
            }
            ConfigurableScrollTabAgent.access$getFlingHelper$p(ConfigurableScrollTabAgent.this).finishFling();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$InnerOnScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class InnerOnScrollListener extends RecyclerView.k {
        public static ChangeQuickRedirect changeQuickRedirect;

        public InnerOnScrollListener() {
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f906ff356c18c176397171658f2ec72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f906ff356c18c176397171658f2ec72");
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || ConfigurableScrollTabAgent.this.innerFlingHelper == null) {
                return;
            }
            ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.this).finishFling();
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d6b867c90fffa48462934cc8746bf84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d6b867c90fffa48462934cc8746bf84");
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (recyclerView == null || recyclerView.getScrollState() != 2 || i2 <= 0 || recyclerView.canScrollVertically(i2)) {
                return;
            }
            recyclerView.stopScroll();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$InnerFlingListener;", "Landroid/support/v7/widget/RecyclerView$OnFlingListener;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;)V", "onFling", "", "velocityX", "", "velocityY", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class InnerFlingListener extends RecyclerView.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        public InnerFlingListener() {
        }

        @Override // android.support.v7.widget.RecyclerView.i
        public final boolean onFling(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "932faac6d786292758ee2d581f3db22a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "932faac6d786292758ee2d581f3db22a")).booleanValue();
            }
            ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.this).finishFling();
            ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.this).initFling(i2);
            return false;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016J2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J0\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016J8\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J \u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH\u0016J(\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J \u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH\u0016J(\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent$ScrollTabNestedScrollingParent;", "Landroid/support/v4/view/NestedScrollingParent2;", "viewGroup", "Landroid/view/ViewGroup;", "(Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;Landroid/view/ViewGroup;)V", "nestedScrollingChildHelper", "Landroid/support/v4/view/NestedScrollingChildHelper;", "nestedScrollingParentHelper", "Landroid/support/v4/view/NestedScrollingParentHelper;", "getNestedScrollAxes", "", "onNestedFling", "", "target", "Landroid/view/View;", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "", "dx", "dy", "", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "child", "onNestedScrollAccepted", "axes", "onStartNestedScroll", "onStopNestedScroll", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ScrollTabNestedScrollingParent implements NestedScrollingParent2 {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final NestedScrollingChildHelper nestedScrollingChildHelper;
        private final NestedScrollingParentHelper nestedScrollingParentHelper;
        public final /* synthetic */ ConfigurableScrollTabAgent this$0;
        private final ViewGroup viewGroup;

        public ScrollTabNestedScrollingParent(@NotNull ConfigurableScrollTabAgent configurableScrollTabAgent, ViewGroup viewGroup) {
            h.b(viewGroup, "viewGroup");
            this.this$0 = configurableScrollTabAgent;
            Object[] objArr = {configurableScrollTabAgent, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac00976904f3d3cac9fdf473e1481379", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac00976904f3d3cac9fdf473e1481379");
                return;
            }
            this.viewGroup = viewGroup;
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this.viewGroup);
            this.nestedScrollingChildHelper = new NestedScrollingChildHelper(this.viewGroup);
            this.nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i, int i2) {
            Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d5659a29c079b508c2448d7138e218", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d5659a29c079b508c2448d7138e218");
                return;
            }
            h.b(view, "child");
            h.b(view2, "target");
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
            RecyclerView outerRecyclerView = this.this$0.getOuterRecyclerView();
            if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                outerRecyclerView = null;
            }
            PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
            if (pageContainerRecyclerView != null) {
                pageContainerRecyclerView.isScrollToTop = this.this$0.getAgentTop() == 0;
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i) {
            Object[] objArr = {view, view2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a5eacdfd28e33acefd76eebba6090b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a5eacdfd28e33acefd76eebba6090b");
                return;
            }
            h.b(view, "child");
            h.b(view2, "target");
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i, int i2) {
            Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33d97cac1aa5b7806d7c6bbab2d3ba8c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33d97cac1aa5b7806d7c6bbab2d3ba8c")).booleanValue();
            }
            h.b(view, "child");
            h.b(view2, "target");
            CommonPageContainer innerPageContainer = this.this$0.getInnerPageContainer();
            if (innerPageContainer != null) {
                innerPageContainer.addFlingListener(this.this$0.innerFlingListener);
            }
            CommonPageContainer innerPageContainer2 = this.this$0.getInnerPageContainer();
            if (innerPageContainer2 != null) {
                innerPageContainer2.addScrollListener(this.this$0.innerScrollListener);
            }
            PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) (!(view2 instanceof PageContainerRecyclerView) ? null : view2);
            if (pageContainerRecyclerView != null) {
                pageContainerRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent$ScrollTabNestedScrollingParent$onStartNestedScroll$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(@Nullable View view3) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(@Nullable View view3) {
                        RecyclerView outerRecyclerView;
                        Object[] objArr2 = {view3};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cc2522896e71ec7cbad4a55218c3551", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cc2522896e71ec7cbad4a55218c3551");
                        } else if (ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.ScrollTabNestedScrollingParent.this.this$0).isInited()) {
                            float currentVelocity = ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.ScrollTabNestedScrollingParent.this.this$0).getCurrentVelocity();
                            if (ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.ScrollTabNestedScrollingParent.this.this$0).getSplineFlingDistance(currentVelocity) > 0.0d && (outerRecyclerView = ConfigurableScrollTabAgent.ScrollTabNestedScrollingParent.this.this$0.getOuterRecyclerView()) != null) {
                                outerRecyclerView.fling(0, (int) currentVelocity);
                            }
                            ConfigurableScrollTabAgent.access$getInnerFlingHelper$p(ConfigurableScrollTabAgent.ScrollTabNestedScrollingParent.this.this$0).finishFling();
                        }
                    }
                });
            }
            return (i & 2) != 0;
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i) {
            Object[] objArr = {view, view2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3ee8b3f4ae451047d0d9bca1e5ed4ec", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3ee8b3f4ae451047d0d9bca1e5ed4ec")).booleanValue();
            }
            h.b(view, "child");
            h.b(view2, "target");
            return onStartNestedScroll(view, view2, i, 0);
        }

        @Override // android.support.v4.view.NestedScrollingParent
        public final int getNestedScrollAxes() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a555a9e914680da83df51f3372785b7f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a555a9e914680da83df51f3372785b7f")).intValue() : this.nestedScrollingParentHelper.getNestedScrollAxes();
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final void onNestedPreScroll(@NotNull View view, int i, int i2, @NotNull int[] iArr) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b215851f5efcdcd0005feb5c87ccc9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b215851f5efcdcd0005feb5c87ccc9");
                return;
            }
            h.b(view, "target");
            h.b(iArr, "consumed");
            onNestedPreScroll(view, i, i2, iArr, 0);
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public final void onNestedPreScroll(@NotNull View view, int i, int i2, @Nullable int[] iArr, int i3) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b53161e4a3d80478987b29154a38b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b53161e4a3d80478987b29154a38b7");
                return;
            }
            h.b(view, "target");
            ConfigurableScrollTabAgent configurableScrollTabAgent = this.this$0;
            if (!(view instanceof RecyclerView)) {
                view = null;
            }
            if (!configurableScrollTabAgent.isRecyclerViewScrollToTop((RecyclerView) view) || i2 >= 0) {
                int min = ((this.this$0.topState == TopLinearLayoutManager.TopState.NORMAL || this.this$0.hoverState == HoverState.NORMAL) && i2 > 0) ? Math.min(this.this$0.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(this.this$0)).top - this.this$0.getScrollTabOffset(), i2) : 0;
                if ((this.this$0.topState == TopLinearLayoutManager.TopState.TOP || this.this$0.hoverState == HoverState.HOVER) && i2 < 0) {
                    min = Math.max(this.this$0.getViewParentRect(ConfigurableScrollTabAgent.access$getPagerContainer$p(this.this$0)).top - this.this$0.getScrollTabOffset(), i2);
                }
                if (iArr != null) {
                    iArr[1] = min;
                }
                ConfigurableScrollTabAgent configurableScrollTabAgent2 = this.this$0;
                configurableScrollTabAgent2.log("parentConsumed: " + min);
                this.viewGroup.scrollBy(0, min);
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public final void onNestedScroll(@NotNull View view, int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc5b4c8e014e87f95937ee5b1cb9b4df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc5b4c8e014e87f95937ee5b1cb9b4df");
                return;
            }
            h.b(view, "child");
            ConfigurableScrollTabAgent configurableScrollTabAgent = this.this$0;
            configurableScrollTabAgent.log("dyUnconsumed: " + i4 + " dyConsumed: " + i2 + " type: " + i5);
            try {
                this.viewGroup.scrollBy(0, i4);
            } catch (IndexOutOfBoundsException e) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                ShieldLogger.codeLogError$default(shieldLogger, ConfigurableScrollTabAgent.class, "RecyclerView scroll IndexOutOfBounds. Content: " + e, null, 4, null);
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final void onNestedScroll(@NotNull View view, int i, int i2, int i3, int i4) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c548784b4ec9cce47e2f14ddf5b62108", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c548784b4ec9cce47e2f14ddf5b62108");
                return;
            }
            h.b(view, "target");
            onNestedScroll(view, i, i2, i3, i4, 0);
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final boolean onNestedPreFling(@NotNull View view, float f, float f2) {
            Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6123ec447cb7a02c1d4017148b13232", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6123ec447cb7a02c1d4017148b13232")).booleanValue();
            }
            h.b(view, "target");
            return this.nestedScrollingChildHelper.dispatchNestedPreFling(f, f2);
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final boolean onNestedFling(@NotNull View view, float f, float f2, boolean z) {
            Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bd18214dee35d4413c3e36a7173234d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bd18214dee35d4413c3e36a7173234d")).booleanValue();
            }
            h.b(view, "target");
            return this.nestedScrollingChildHelper.dispatchNestedFling(f, f2, z);
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public final void onStopNestedScroll(@NotNull View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0ebc9998177feb2cc47d53a5cd43cd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0ebc9998177feb2cc47d53a5cd43cd9");
                return;
            }
            h.b(view, "target");
            this.nestedScrollingParentHelper.onStopNestedScroll(view, i);
            RecyclerView outerRecyclerView = this.this$0.getOuterRecyclerView();
            if (!(outerRecyclerView instanceof PageContainerRecyclerView)) {
                outerRecyclerView = null;
            }
            PageContainerRecyclerView pageContainerRecyclerView = (PageContainerRecyclerView) outerRecyclerView;
            if (pageContainerRecyclerView != null) {
                pageContainerRecyclerView.isScrollToTop = this.this$0.getAgentTop() == 0;
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent, android.view.ViewParent
        public final void onStopNestedScroll(@NotNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32340ca6d65666ec9a6b5cfedc14007", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32340ca6d65666ec9a6b5cfedc14007");
                return;
            }
            h.b(view, "target");
            onStopNestedScroll(view, 0);
        }
    }
}
