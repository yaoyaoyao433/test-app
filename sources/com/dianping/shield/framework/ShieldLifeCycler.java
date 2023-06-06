package com.dianping.shield.framework;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.a;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.an;
import com.dianping.agentsdk.framework.ao;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.e;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.g;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.manager.b;
import com.dianping.shield.bridge.feature.AgentGlobalPositionInterface;
import com.dianping.shield.bridge.feature.AgentScrollerInterface;
import com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface;
import com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface;
import com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface;
import com.dianping.shield.bridge.feature.PageArgumentsInterface;
import com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface;
import com.dianping.shield.bridge.feature.PageContainerCommonInterface;
import com.dianping.shield.bridge.feature.PageContainerRefreshInterface;
import com.dianping.shield.bridge.feature.PageScrollEnabledInterface;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.dianping.shield.debug.DebugSettings;
import com.dianping.shield.debug.NodeListDataStoreSnapshot;
import com.dianping.shield.debug.WhiteBoardDataStoreSnapshot;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.DividerTheme;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.shield.entity.ExposeControlActionType;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.entity.PageAgentsPersistenceParams;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.ExposeScreenLoadedInterface;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.layoutcontrol.DefaultHoverLayoutControl;
import com.dianping.shield.lifecycle.NestedPageInterface;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import com.dianping.shield.lifecycle.PageLifecycleDispatcher;
import com.dianping.shield.lifecycle.PageLifecycleObserver;
import com.dianping.shield.lifecycle.PageObserver;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.node.DividerThemePackage;
import com.dianping.shield.node.adapter.DisplayNodeContainer;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020B2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020B2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020B2\u0006\u0010P\u001a\u00020SH\u0016J\u0012\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010V\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020\u001eH\u0016J\u0010\u0010Z\u001a\u00020$2\u0006\u0010Y\u001a\u00020\u001eH\u0016J\u001a\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020$2\u0006\u0010^\u001a\u00020\u001eH\u0016J\u001c\u0010_\u001a\u0016\u0012\u0004\u0012\u00020/\u0018\u00010.j\n\u0012\u0004\u0012\u00020/\u0018\u0001`0H\u0016J\u0012\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020$H\u0016J\u0010\u0010c\u001a\u00020$2\u0006\u0010d\u001a\u00020\\H\u0016J\u001a\u0010e\u001a\u0004\u0018\u00010\\2\u0006\u0010f\u001a\u00020$2\u0006\u0010^\u001a\u00020\u001eH\u0016J\b\u0010g\u001a\u00020$H\u0016J\u0006\u0010h\u001a\u00020iJ\n\u0010j\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010k\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016J\u0014\u0010l\u001a\u0004\u0018\u00010\\2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010n\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010o\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010p\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010q\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010r\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\u0012\u0010s\u001a\u00020$2\b\u0010m\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010t\u001a\u00020$H\u0016J\u0010\u0010u\u001a\u00020$2\u0006\u0010v\u001a\u00020aH\u0016J\b\u0010w\u001a\u00020xH\u0016J\n\u0010y\u001a\u0004\u0018\u00010zH\u0016J\u0018\u0010{\u001a\u0012\u0012\u0004\u0012\u00020W\u0012\u0006\u0012\u0004\u0018\u00010}\u0018\u00010|H\u0016J\u0015\u0010~\u001a\u0004\u0018\u00010\u007f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\\H\u0016J\u001e\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\u0082\u00012\u0006\u0010b\u001a\u00020$H\u0016J\u000b\u0010\u0083\u0001\u001a\u0004\u0018\u00010<H\u0016J\u000b\u0010\u0084\u0001\u001a\u0004\u0018\u00010zH\u0016J\t\u0010\u0085\u0001\u001a\u00020\u001eH\u0002J\u0007\u0010\u0086\u0001\u001a\u00020BJ\u0015\u0010\u0087\u0001\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J'\u0010\u008a\u0001\u001a\u00020B2\u0007\u0010\u008b\u0001\u001a\u00020$2\u0007\u0010\u008c\u0001\u001a\u00020$2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\u0015\u0010\u008f\u0001\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J/\u0010\u0090\u0001\u001a\u0004\u0018\u00010\\2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\t\u0010\u0095\u0001\u001a\u00020BH\u0016J\u0011\u0010\u0096\u0001\u001a\u00020B2\u0006\u0010P\u001a\u00020QH\u0016J\u0011\u0010\u0097\u0001\u001a\u00020B2\u0006\u0010P\u001a\u00020SH\u0016J\u0013\u0010\u0098\u0001\u001a\u00020B2\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\t\u0010\u009b\u0001\u001a\u00020BH\u0016J\u0016\u0010\u009c\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00010\u009d\u0001J\t\u0010 \u0001\u001a\u00020BH\u0016J\u0015\u0010¡\u0001\u001a\u00020B2\n\u0010¢\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\t\u0010£\u0001\u001a\u00020BH\u0016J\t\u0010¤\u0001\u001a\u00020BH\u0016J\t\u0010¥\u0001\u001a\u00020BH\u0002J\t\u0010¦\u0001\u001a\u00020BH\u0002J\u0011\u0010§\u0001\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0013\u0010¨\u0001\u001a\u00020B2\b\u0010©\u0001\u001a\u00030ª\u0001H\u0016J\u0015\u0010«\u0001\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\u0013\u0010¬\u0001\u001a\u00020B2\b\u0010\u00ad\u0001\u001a\u00030®\u0001H\u0016J#\u0010¯\u0001\u001a\u00020B2\u0006\u0010b\u001a\u00020$2\u0007\u0010°\u0001\u001a\u00020$2\u0007\u0010±\u0001\u001a\u00020\u001eH\u0016J-\u0010¯\u0001\u001a\u00020B2\u0006\u0010b\u001a\u00020$2\u0007\u0010°\u0001\u001a\u00020$2\u0007\u0010±\u0001\u001a\u00020\u001e2\b\u0010²\u0001\u001a\u00030³\u0001H\u0016JL\u0010¯\u0001\u001a\u00020B2\u0006\u0010b\u001a\u00020$2\u0007\u0010°\u0001\u001a\u00020$2\u0007\u0010±\u0001\u001a\u00020\u001e2\b\u0010²\u0001\u001a\u00030³\u00012\u001d\u0010´\u0001\u001a\u0018\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010.j\u000b\u0012\u0005\u0012\u00030µ\u0001\u0018\u0001`0H\u0016JB\u0010¯\u0001\u001a\u00020B2\u0006\u0010b\u001a\u00020$2\u0007\u0010°\u0001\u001a\u00020$2\u0007\u0010±\u0001\u001a\u00020\u001e2\u001d\u0010´\u0001\u001a\u0018\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010.j\u000b\u0012\u0005\u0012\u00030µ\u0001\u0018\u0001`0H\u0016J\u0011\u0010¶\u0001\u001a\u00020B2\b\u0010·\u0001\u001a\u00030\u0094\u0001J\u0018\u0010¸\u0001\u001a\u00020B2\t\u0010¹\u0001\u001a\u0004\u0018\u00010$¢\u0006\u0003\u0010º\u0001J\u0012\u0010»\u0001\u001a\u00020B2\u0007\u0010¼\u0001\u001a\u00020\u001eH\u0016J\t\u0010½\u0001\u001a\u00020BH\u0016J\u0013\u0010¾\u0001\u001a\u00020B2\b\u0010¿\u0001\u001a\u00030À\u0001H\u0016J\u0012\u0010Á\u0001\u001a\u00020B2\u0007\u0010Â\u0001\u001a\u00020$H\u0016J\u0012\u0010Ã\u0001\u001a\u00020B2\u0007\u0010Ä\u0001\u001a\u00020\u001eH\u0016J%\u0010Å\u0001\u001a\u00020B2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010Ç\u0001\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0003\u0010È\u0001J\u0011\u0010É\u0001\u001a\u00020B2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0013\u0010Ê\u0001\u001a\u00020B2\b\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0016J\u0013\u0010Í\u0001\u001a\u00020B2\b\u0010Î\u0001\u001a\u00030Ï\u0001H\u0016J\u0012\u0010Ð\u0001\u001a\u00020B2\u0007\u0010Ñ\u0001\u001a\u00020WH\u0016J\u0012\u0010Ò\u0001\u001a\u00020B2\u0007\u0010Ó\u0001\u001a\u00020\u001eH\u0016J\u001a\u0010Ô\u0001\u001a\u00020B2\u000f\u0010Õ\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ö\u0001H\u0016J \u0010Ø\u0001\u001a\u00020B2\u0015\u0010Ù\u0001\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020}\u0018\u00010|H\u0016J\u0013\u0010Ú\u0001\u001a\u00020B2\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0016J\t\u0010Ý\u0001\u001a\u00020BH\u0016J\t\u0010Þ\u0001\u001a\u00020BH\u0002J\t\u0010ß\u0001\u001a\u00020\u001eH\u0016J\t\u0010à\u0001\u001a\u00020BH\u0016J\u0012\u0010á\u0001\u001a\u00020B2\u0007\u0010â\u0001\u001a\u00020UH\u0016J7\u0010á\u0001\u001a\u00020B2\u0007\u0010â\u0001\u001a\u00020U2\b\u0010ã\u0001\u001a\u00030ä\u00012\u0007\u0010å\u0001\u001a\u00020$2\u0007\u0010æ\u0001\u001a\u00020$2\u0007\u0010ç\u0001\u001a\u00020$H\u0016J\u0007\u0010è\u0001\u001a\u00020BJ`\u0010é\u0001\u001a\u00020B2\u001b\u0010ê\u0001\u001a\u0016\u0012\u0004\u0012\u00020U\u0018\u00010.j\n\u0012\u0004\u0012\u00020U\u0018\u0001`02\u001b\u0010ë\u0001\u001a\u0016\u0012\u0004\u0012\u00020U\u0018\u00010.j\n\u0012\u0004\u0012\u00020U\u0018\u0001`02\u001b\u0010ì\u0001\u001a\u0016\u0012\u0004\u0012\u00020U\u0018\u00010.j\n\u0012\u0004\u0012\u00020U\u0018\u0001`0H\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010-\u001a\u0016\u0012\u0004\u0012\u00020/\u0018\u00010.j\n\u0012\u0004\u0012\u00020/\u0018\u0001`0X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u00020<8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006í\u0001"}, d2 = {"Lcom/dianping/shield/framework/ShieldLifeCycler;", "Lcom/dianping/agentsdk/framework/AgentCellBridgeInterface;", "Lcom/dianping/agentsdk/framework/UIRDriverInterface;", "Lcom/dianping/shield/framework/ShieldContainerInterface;", "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "Lcom/dianping/shield/lifecycle/PageLifecycleCallbacks;", "Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;", "Lcom/dianping/shield/lifecycle/NestedPageInterface;", "()V", "hostFragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "agentManager", "Lcom/dianping/agentsdk/framework/AgentManagerInterface;", "getAgentManager", "()Lcom/dianping/agentsdk/framework/AgentManagerInterface;", "setAgentManager", "(Lcom/dianping/agentsdk/framework/AgentManagerInterface;)V", "cellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "getCellManager", "()Lcom/dianping/agentsdk/framework/CellManagerInterface;", "setCellManager", "(Lcom/dianping/agentsdk/framework/CellManagerInterface;)V", "defaultPageLifecycleObserver", "Lcom/dianping/shield/lifecycle/PageObserver;", "getHostFragment", "()Landroid/support/v4/app/Fragment;", "setHostFragment", "isPauseing", "", "isWhiteBoardShared", "()Z", "setWhiteBoardShared", "(Z)V", "mExposeDelay", "", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "getPageContainer", "()Lcom/dianping/agentsdk/framework/PageContainerInterface;", "setPageContainer", "(Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "refreshSubscription", "Lrx/Subscription;", "shieldConfigs", "Ljava/util/ArrayList;", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "Lkotlin/collections/ArrayList;", "getShieldConfigs", "()Ljava/util/ArrayList;", "setShieldConfigs", "(Ljava/util/ArrayList;)V", "shieldLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "getShieldLayoutManager", "()Landroid/support/v7/widget/RecyclerView$LayoutManager;", "setShieldLayoutManager", "(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V", "whiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "getHostWhiteBoard", "()Lcom/dianping/agentsdk/framework/WhiteBoard;", "setWhiteBoard", "(Lcom/dianping/agentsdk/framework/WhiteBoard;)V", "addContentScrollOffsetListener", "", "contentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "addLayoutParamCalFinishCallBack", "anchorViewLayoutParamInfo", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo;", "callExposeAction", "exposedParam", "Lcom/dianping/shield/entity/ExposeAction;", "convertCellInterfaceToItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "dispatchPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "dispatchPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "findAgent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "name", "", "findFirstVisibleItemPosition", "completely", "findLastVisibleItemPosition", "findViewAtPosition", "Landroid/view/View;", "position", "isBizView", "generaterConfigs", "getAgentInfoByGlobalPosition", "Lcom/dianping/shield/entity/NodeInfo;", "globalPosition", "getChildAdapterPosition", "child", "getChildAtIndex", "index", "getChildCount", "getDelayForAutoExpose", "", "getHostAgentManager", "getHostCellManager", "getItemView", Constants.EventType.VIEW, "getItemViewBottom", "getItemViewHeight", "getItemViewLeft", "getItemViewRight", "getItemViewTop", "getItemViewWidth", "getMaxTopViewY", "getNodeGlobalPosition", "nodeInfo", "getPageLifecycleObserver", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "getRecyclerViewLayout", "Landroid/widget/FrameLayout;", "getShieldArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getViewParentRect", "Landroid/graphics/Rect;", "rootView", "getViewTopBottom", "Landroid/util/Pair;", "getWhiteBoard", "getZFrameLayout", "needExpose", "notifyCellChanged", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPageAppear", "onPageDisappear", "onPageScrolled", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "onPause", d.p, "", "Lrx/Observable;", "", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "releaseNodeListSnapshotDataSource", "releaseWdsSnapshotDataSource", "removeContentScrollOffsetListener", "removeLayoutParamCalFinishCallBack", "layoutParamCalFinishListener", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo$LayoutParamCalFinishListener;", "resetAgents", "scrollToNode", "info", "Lcom/dianping/shield/entity/AgentScrollerParams;", "scrollToPositionWithOffset", "offset", "isSmoothScroll", "scrollSpeed", "", "listeners", "Lcom/dianping/agentsdk/sectionrecycler/layoutmanager/OnSmoothScrollListener;", "setAgentContainerView", "containerView", "setDelayForAutoExpose", "delayMilliseconds", "(Ljava/lang/Integer;)V", "setDisableDecoration", "disableDecoration", "setError", "setExposeComputeMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "setExtraLayoutSpace", "extraLayoutSpace", "setFocusChildScrollOnScreenWhenBack", "allow", "setFrozenInfo", "enableFrozen", "frozenModuleKey", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "setHoverContainerView", "setPageAgentsPersistenceInfo", "persistenceParams", "Lcom/dianping/shield/entity/PageAgentsPersistenceParams;", "setPageDividerTheme", "themeParams", "Lcom/dianping/shield/entity/PageDividerThemeParams;", "setPageName", "pageName", "setScrollEnabled", "scrollEnabled", "setSectionBgViewMap", "childBgInfoArray", "Landroid/util/SparseArray;", "Lcom/dianping/agentsdk/framework/BackgroundViewInfo;", "setShieldArguments", "arguments", "setShieldGAInfo", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "setSuccess", "setWdsSnapshotDataSource", "shouldInterceptPageLifecycle", "simulateDragRefresh", "updateAgentCell", "agent", "updateAgentType", "Lcom/dianping/agentsdk/framework/UpdateAgentType;", "section", "row", "count", "updateAgentContainer", "updateCells", "addList", "updateList", "deleteList", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldLifeCycler implements a, ao, ShieldGlobalFeatureInterface, ShieldContainerInterface, NestedPageInterface, PageLifecycleCallbacks, PageLifecycleDispatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public com.dianping.agentsdk.framework.d agentManager;
    @NotNull
    public j<?> cellManager;
    private PageObserver defaultPageLifecycleObserver;
    @NotNull
    public Fragment hostFragment;
    private boolean isPauseing;
    private boolean isWhiteBoardShared;
    private int mExposeDelay;
    @Nullable
    private ab<?> pageContainer;
    private k refreshSubscription;
    @Nullable
    private ArrayList<c> shieldConfigs;
    @Nullable
    private RecyclerView.LayoutManager shieldLayoutManager;
    @NotNull
    private ar whiteBoard;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[DividerTheme.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DividerTheme.DEFAULT_LEFT_OFFSET.ordinal()] = 1;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_DIVIDER.ordinal()] = 2;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_RIGHT_OFFSET.ordinal()] = 3;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_SECTION_DIVIDER.ordinal()] = 4;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_SECTION_DIVIDER_OFFSET.ordinal()] = 5;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_SECTION_TOP_DIVIDER.ordinal()] = 6;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_SECTION_BOTTOM_DIVIDER.ordinal()] = 7;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_HEADER_HEIGHT.ordinal()] = 8;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_FOOTER_HEIGHT.ordinal()] = 9;
            $EnumSwitchMapping$0[DividerTheme.NEED_ADD_FIRST_HEADER.ordinal()] = 10;
            $EnumSwitchMapping$0[DividerTheme.NEED_ADD_LAST_FOOTER.ordinal()] = 11;
            $EnumSwitchMapping$0[DividerTheme.FIRST_HEADER_EXTRA_HEIGHT.ordinal()] = 12;
            $EnumSwitchMapping$0[DividerTheme.LAST_FOOTER_EXTRA_HEIGHT.ordinal()] = 13;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_SPACE_DRAWABLE.ordinal()] = 14;
            $EnumSwitchMapping$0[DividerTheme.ENABLE_DIVIDER.ordinal()] = 15;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_HEADER_BACKGROUND_COLOR.ordinal()] = 16;
            $EnumSwitchMapping$0[DividerTheme.DEFAULT_FOOTER_BACKGROUND_COLOR.ordinal()] = 17;
            int[] iArr2 = new int[CellType.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[CellType.NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$1[CellType.HEADER.ordinal()] = 2;
            $EnumSwitchMapping$1[CellType.FOOTER.ordinal()] = 3;
            int[] iArr3 = new int[ExposeControlActionType.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[ExposeControlActionType.ACTION_START_EXPOSE.ordinal()] = 1;
            $EnumSwitchMapping$2[ExposeControlActionType.ACTION_FINISH_EXPOSE.ordinal()] = 2;
            $EnumSwitchMapping$2[ExposeControlActionType.ACTION_RESUME_EXPOSE.ordinal()] = 3;
            $EnumSwitchMapping$2[ExposeControlActionType.ACTION_PAUSE_EXPOSE.ordinal()] = 4;
            $EnumSwitchMapping$2[ExposeControlActionType.ACTION_RESET_AGENT_EXPOSE_HISTORY.ordinal()] = 5;
            int[] iArr4 = new int[PageAppearType.valuesCustom().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[PageAppearType.PAGE_BACK.ordinal()] = 1;
            $EnumSwitchMapping$3[PageAppearType.BECOME_ACTIVE.ordinal()] = 2;
            int[] iArr5 = new int[PageDisappearType.valuesCustom().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[PageDisappearType.GO_AHEAD.ordinal()] = 1;
            $EnumSwitchMapping$4[PageDisappearType.GO_BACK.ordinal()] = 2;
            $EnumSwitchMapping$4[PageDisappearType.RESIGN_ACTIVE.ordinal()] = 3;
            int[] iArr6 = new int[ScrollDirection.valuesCustom().length];
            $EnumSwitchMapping$5 = iArr6;
            iArr6[ScrollDirection.GO_AHEAD.ordinal()] = 1;
            $EnumSwitchMapping$5[ScrollDirection.RESIGN_ACTIVE.ordinal()] = 2;
            $EnumSwitchMapping$5[ScrollDirection.GO_BACK.ordinal()] = 3;
        }
    }

    @Override // com.dianping.shield.lifecycle.NestedPageInterface
    public boolean shouldInterceptPageLifecycle() {
        return false;
    }

    @NotNull
    public Fragment getHostFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d66bd9e97d22d5b5434072060b031e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d66bd9e97d22d5b5434072060b031e");
        }
        Fragment fragment = this.hostFragment;
        if (fragment == null) {
            h.a("hostFragment");
        }
        return fragment;
    }

    public void setHostFragment(@NotNull Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96aafa3b02db75a02b35391287715c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96aafa3b02db75a02b35391287715c63");
            return;
        }
        h.b(fragment, "<set-?>");
        this.hostFragment = fragment;
    }

    @NotNull
    public final com.dianping.agentsdk.framework.d getAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3df462b7cd1896ca26bd969df4aa8f74", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3df462b7cd1896ca26bd969df4aa8f74");
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        return dVar;
    }

    public final void setAgentManager(@NotNull com.dianping.agentsdk.framework.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a0f0062ec6e21c5cf466bd74ac861fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a0f0062ec6e21c5cf466bd74ac861fa");
            return;
        }
        h.b(dVar, "<set-?>");
        this.agentManager = dVar;
    }

    @NotNull
    public final j<?> getCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8f7affc341f7ff849aafbe6921f833f", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8f7affc341f7ff849aafbe6921f833f");
        }
        j<?> jVar = this.cellManager;
        if (jVar == null) {
            h.a("cellManager");
        }
        return jVar;
    }

    public final void setCellManager(@NotNull j<?> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a576fa2c1816fd6461c7dbed0e33ff65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a576fa2c1816fd6461c7dbed0e33ff65");
            return;
        }
        h.b(jVar, "<set-?>");
        this.cellManager = jVar;
    }

    @Nullable
    public final ab<?> getPageContainer() {
        return this.pageContainer;
    }

    public final void setPageContainer(@Nullable ab<?> abVar) {
        this.pageContainer = abVar;
    }

    @Nullable
    public final RecyclerView.LayoutManager getShieldLayoutManager() {
        return this.shieldLayoutManager;
    }

    public final void setShieldLayoutManager(@Nullable RecyclerView.LayoutManager layoutManager) {
        this.shieldLayoutManager = layoutManager;
    }

    public final void setWhiteBoard(@NotNull ar arVar) {
        Object[] objArr = {arVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bed518ef79e81591c69945743080db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bed518ef79e81591c69945743080db0");
            return;
        }
        h.b(arVar, "<set-?>");
        this.whiteBoard = arVar;
    }

    @JvmName(name = "getHostWhiteBoard")
    @NotNull
    public final ar getHostWhiteBoard() {
        return this.whiteBoard;
    }

    @Nullable
    public final ArrayList<c> getShieldConfigs() {
        return this.shieldConfigs;
    }

    public final void setShieldConfigs(@Nullable ArrayList<c> arrayList) {
        this.shieldConfigs = arrayList;
    }

    public final boolean isWhiteBoardShared() {
        return this.isWhiteBoardShared;
    }

    public final void setWhiteBoardShared(boolean z) {
        this.isWhiteBoardShared = z;
    }

    public ShieldLifeCycler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f97be073e6786665e05c59acbe9e03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f97be073e6786665e05c59acbe9e03");
            return;
        }
        this.whiteBoard = new ar();
        this.defaultPageLifecycleObserver = new PageObserver(this);
        this.mExposeDelay = -1;
    }

    public ShieldLifeCycler(@NotNull Fragment fragment) {
        h.b(fragment, "hostFragment");
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a827e5b4ebbeffd17823db6492f67c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a827e5b4ebbeffd17823db6492f67c61");
            return;
        }
        this.whiteBoard = new ar();
        this.defaultPageLifecycleObserver = new PageObserver(this);
        this.mExposeDelay = -1;
        setHostFragment(fragment);
    }

    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "707ee132b3b574fdc9a14227f57a531e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "707ee132b3b574fdc9a14227f57a531e");
            return;
        }
        getHostWhiteBoard().a(bundle);
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onCreate(bundle);
        }
        getPageLifecycleObserver().onCreate(bundle);
    }

    @Nullable
    public View onCreateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75d8abf29c7f6c89066b3cc06951617f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75d8abf29c7f6c89066b3cc06951617f");
        }
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            return abVar.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return null;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        ViewGroup agentContainerView;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0fe77c787de4065e71d42cd75d14803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0fe77c787de4065e71d42cd75d14803");
            return;
        }
        j<?> jVar = this.cellManager;
        if (jVar == null) {
            h.a("cellManager");
        }
        if (jVar instanceof b) {
            j<?> jVar2 = this.cellManager;
            if (jVar2 == null) {
                h.a("cellManager");
            }
            if (jVar2 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
            }
            ((b) jVar2).a(getHostWhiteBoard());
            if (getHostFragment().getActivity() instanceof LoadingAndLoadingMoreCreator) {
                j<?> jVar3 = this.cellManager;
                if (jVar3 == null) {
                    h.a("cellManager");
                }
                if (jVar3 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                }
                b bVar = (b) jVar3;
                FragmentActivity activity = getHostFragment().getActivity();
                if (activity != null) {
                    bVar.a((LoadingAndLoadingMoreCreator) activity);
                } else {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.feature.LoadingAndLoadingMoreCreator");
                }
            }
        }
        j<?> jVar4 = this.cellManager;
        if (jVar4 == null) {
            h.a("cellManager");
        }
        if (jVar4 instanceof ShieldNodeCellManager) {
            j<?> jVar5 = this.cellManager;
            if (jVar5 == null) {
                h.a("cellManager");
            }
            if (jVar5 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
            }
            ((ShieldNodeCellManager) jVar5).setWhiteBoard(getHostWhiteBoard());
            if (getHostFragment().getActivity() instanceof LoadingAndLoadingMoreCreator) {
                j<?> jVar6 = this.cellManager;
                if (jVar6 == null) {
                    h.a("cellManager");
                }
                if (jVar6 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) jVar6;
                FragmentActivity activity2 = getHostFragment().getActivity();
                if (activity2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.feature.LoadingAndLoadingMoreCreator");
                }
                shieldNodeCellManager.setLoadingAndLoadingMoreCreator((LoadingAndLoadingMoreCreator) activity2);
            } else if (this.pageContainer instanceof LoadingAndLoadingMoreCreator) {
                j<?> jVar7 = this.cellManager;
                if (jVar7 == null) {
                    h.a("cellManager");
                }
                if (jVar7 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ShieldNodeCellManager shieldNodeCellManager2 = (ShieldNodeCellManager) jVar7;
                ab<?> abVar = this.pageContainer;
                if (abVar == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.feature.LoadingAndLoadingMoreCreator");
                }
                shieldNodeCellManager2.setLoadingAndLoadingMoreCreator((LoadingAndLoadingMoreCreator) abVar);
            }
            j<?> jVar8 = this.cellManager;
            if (jVar8 == null) {
                h.a("cellManager");
            }
            if (!(jVar8 instanceof ShieldNodeCellManager)) {
                jVar8 = null;
            }
            ShieldNodeCellManager shieldNodeCellManager3 = (ShieldNodeCellManager) jVar8;
            if (shieldNodeCellManager3 != null) {
                shieldNodeCellManager3.setSectionBgViewMapCallback(this);
            }
            j<?> jVar9 = this.cellManager;
            if (jVar9 == null) {
                h.a("cellManager");
            }
            if (!(jVar9 instanceof ShieldNodeCellManager)) {
                jVar9 = null;
            }
            ShieldNodeCellManager shieldNodeCellManager4 = (ShieldNodeCellManager) jVar9;
            if (shieldNodeCellManager4 != null) {
                shieldNodeCellManager4.setLayoutParamCalFinishCallback(this);
            }
            if (this.pageContainer instanceof PageContainerCommonInterface) {
                j<?> jVar10 = this.cellManager;
                if (jVar10 == null) {
                    h.a("cellManager");
                }
                if (jVar10 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ShieldNodeCellManager shieldNodeCellManager5 = (ShieldNodeCellManager) jVar10;
                ab<?> abVar2 = this.pageContainer;
                if (abVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonInterface");
                }
                FrameLayout zFrameLayout = ((PageContainerCommonInterface) abVar2).getZFrameLayout();
                if (zFrameLayout == null) {
                    h.a();
                }
                shieldNodeCellManager5.innerSetHoverContainer(new DefaultHoverLayoutControl(zFrameLayout));
            }
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        dVar.setupAgents(bundle, this.shieldConfigs);
        ab<?> abVar3 = this.pageContainer;
        if (abVar3 != null) {
            abVar3.onActivityCreated(bundle);
        }
        ab<?> abVar4 = this.pageContainer;
        if (abVar4 != null && (agentContainerView = abVar4.getAgentContainerView()) != null) {
            setAgentContainerView(agentContainerView);
        }
        setWdsSnapshotDataSource();
        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogInfo(getHostFragment().getContext().getClass(), getHostFragment().toString(), "Shield onActivityCreated");
    }

    private final void setWdsSnapshotDataSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4febf400191b5c72c7bb7ed4c3fdee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4febf400191b5c72c7bb7ed4c3fdee");
        } else if (ShieldEnvironment.INSTANCE.isDebug() && DebugSettings.IS_DEBUGPANEL_SHOW) {
            WhiteBoardDataStoreSnapshot.getSingleton().setWhiteBoard(getHostWhiteBoard());
        }
    }

    private final void releaseWdsSnapshotDataSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b32dda8a86a4fcdef0a7fd22fdbc9b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b32dda8a86a4fcdef0a7fd22fdbc9b81");
        } else if (ShieldEnvironment.INSTANCE.isDebug() && DebugSettings.IS_DEBUGPANEL_SHOW) {
            WhiteBoardDataStoreSnapshot.getSingleton().releaseWhiteBoard();
        }
    }

    private final void releaseNodeListSnapshotDataSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dee170c13b96decc05f12b5467b9e3dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dee170c13b96decc05f12b5467b9e3dc");
        } else if (ShieldEnvironment.INSTANCE.isDebug() && DebugSettings.IS_DEBUGPANEL_SHOW) {
            NodeListDataStoreSnapshot.getSingleton().releaseNodeListDataSource();
        }
    }

    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ea0fb7b074096ab7103fdecccd75c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ea0fb7b074096ab7103fdecccd75c59");
            return;
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        dVar.startAgents();
        getPageLifecycleObserver().onStart();
    }

    @NotNull
    public final List<rx.d<Object>> onRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "561a1f58eac2d0a2a41a3c428e79acaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "561a1f58eac2d0a2a41a3c428e79acaa");
        }
        if (this.agentManager == null) {
            return new ArrayList();
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        List<rx.d<Object>> refreshAgents = dVar.refreshAgents();
        h.a((Object) refreshAgents, "agentManager.refreshAgents()");
        return refreshAgents;
    }

    public void onResume() {
        ShieldDisplayNodeAdapter nodeAdapterAndUpdateFeature;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e6cc18bda2d56ae7a265ac0793bbec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e6cc18bda2d56ae7a265ac0793bbec1");
            return;
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        dVar.resumeAgents();
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onResume();
        }
        getPageLifecycleObserver().onResume();
        ShieldLifeCycler shieldLifeCycler = this;
        if (shieldLifeCycler.hostFragment != null && this.isPauseing) {
            if (ShieldEnvironment.INSTANCE.isDebug() && DebugSettings.IS_DEBUGPANEL_SHOW && shieldLifeCycler.cellManager != null) {
                j<?> jVar = this.cellManager;
                if (jVar == null) {
                    h.a("cellManager");
                }
                if (!(jVar instanceof ShieldNodeCellManager)) {
                    jVar = null;
                }
                ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) jVar;
                if (shieldNodeCellManager != null && (nodeAdapterAndUpdateFeature = shieldNodeCellManager.getNodeAdapterAndUpdateFeature()) != null) {
                    nodeAdapterAndUpdateFeature.notifyNodeChanged();
                }
            }
            setWdsSnapshotDataSource();
        }
        this.isPauseing = false;
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66b61e2b763a44870b74f82f46a78c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66b61e2b763a44870b74f82f46a78c0a");
            return;
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        dVar.pauseAgents();
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onPause();
        }
        getPageLifecycleObserver().onPause();
        if (this.hostFragment != null) {
            FragmentActivity activity = getHostFragment().getActivity();
            h.a((Object) activity, "hostFragment.activity");
            if (activity.isFinishing()) {
                releaseWdsSnapshotDataSource();
                releaseNodeListSnapshotDataSource();
            }
        }
        this.isPauseing = true;
    }

    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f634ddb586d783f9d117e76036afcd95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f634ddb586d783f9d117e76036afcd95");
            return;
        }
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar == null) {
            h.a("agentManager");
        }
        dVar.stopAgents();
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onStop();
        }
        getPageLifecycleObserver().onStop();
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2b701f29fcff5ca9aaa5ac7bda5316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2b701f29fcff5ca9aaa5ac7bda5316");
            return;
        }
        ShieldLifeCycler shieldLifeCycler = this;
        if (shieldLifeCycler.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            if (jVar instanceof ExposeScreenLoadedInterface) {
                j<?> jVar2 = this.cellManager;
                if (jVar2 == null) {
                    h.a("cellManager");
                }
                if (!(jVar2 instanceof ExposeScreenLoadedInterface)) {
                    jVar2 = null;
                }
                ExposeScreenLoadedInterface exposeScreenLoadedInterface = (ExposeScreenLoadedInterface) jVar2;
                if (exposeScreenLoadedInterface != null) {
                    exposeScreenLoadedInterface.finishExpose();
                }
            }
            j<?> jVar3 = this.cellManager;
            if (jVar3 == null) {
                h.a("cellManager");
            }
            if (jVar3 instanceof b) {
                j<?> jVar4 = this.cellManager;
                if (jVar4 == null) {
                    h.a("cellManager");
                }
                if (!(jVar4 instanceof b)) {
                    jVar4 = null;
                }
                b bVar = (b) jVar4;
                if (bVar != null) {
                    bVar.c();
                }
            }
            j<?> jVar5 = this.cellManager;
            if (jVar5 == null) {
                h.a("cellManager");
            }
            if (jVar5 instanceof ShieldNodeCellManager) {
                j<?> jVar6 = this.cellManager;
                if (jVar6 == null) {
                    h.a("cellManager");
                }
                if (!(jVar6 instanceof ShieldNodeCellManager)) {
                    jVar6 = null;
                }
                ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) jVar6;
                if (shieldNodeCellManager != null) {
                    shieldNodeCellManager.destory();
                }
            }
        }
        if (shieldLifeCycler.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            dVar.destroyAgents();
        }
        if (!this.isWhiteBoardShared) {
            getHostWhiteBoard().a();
        }
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onDestroy();
        }
        getPageLifecycleObserver().onDestroy();
        this.isPauseing = false;
        k kVar = this.refreshSubscription;
        if (kVar != null) {
            kVar.unsubscribe();
        }
        this.mExposeDelay = -1;
    }

    public void onSaveInstanceState(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a98c030cc4e83e0b9fc1db10b82b253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a98c030cc4e83e0b9fc1db10b82b253");
            return;
        }
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            dVar.onSaveInstanceState(bundle);
        }
        getHostWhiteBoard().b(bundle);
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onSaveInstanceState(bundle);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98cac12e688007cc922d0c09a8373b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98cac12e688007cc922d0c09a8373b63");
            return;
        }
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            dVar.onActivityResult(i, i2, intent);
        }
        ab<?> abVar = this.pageContainer;
        if (abVar != null) {
            abVar.onActivityResult(i, i2, intent);
        }
    }

    public final void setAgentContainerView(@NotNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "274622b16e32df36cdbc831b72ed53ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "274622b16e32df36cdbc831b72ed53ac");
            return;
        }
        h.b(viewGroup, "containerView");
        if (this.cellManager == null) {
            return;
        }
        try {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            ab<?> abVar = this.pageContainer;
            if (!(abVar instanceof PageContainerLayoutModeInterface)) {
                abVar = null;
            }
            jVar.setLayoutModeController((PageContainerLayoutModeInterface) abVar);
            j<?> jVar2 = this.cellManager;
            if (jVar2 == null) {
                h.a("cellManager");
            }
            jVar2.setAgentContainerView(viewGroup);
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            dVar.initViewCell();
            if (viewGroup instanceof RecyclerView) {
                this.shieldLayoutManager = ((RecyclerView) viewGroup).getLayoutManager();
            }
            notifyCellChanged();
        } catch (Exception e) {
            throw new NullPointerException("setAgentContainerView method should be called after super.onActivityCreated method Detail:" + e.getMessage());
        }
    }

    public final void setHoverContainerView(@NotNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c581f04154de91f67adc0b2e8fa0e1a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c581f04154de91f67adc0b2e8fa0e1a0");
            return;
        }
        h.b(viewGroup, "container");
        if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            if (jVar instanceof ShieldNodeCellManager) {
                j<?> jVar2 = this.cellManager;
                if (jVar2 == null) {
                    h.a("cellManager");
                }
                if (jVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ((ShieldNodeCellManager) jVar2).innerSetHoverContainer(new DefaultHoverLayoutControl(viewGroup));
            }
        }
    }

    public final void updateAgentContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df46b9cd17c75d39591fb072dbdcf0e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df46b9cd17c75d39591fb072dbdcf0e0");
        } else if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            jVar.notifyCellChanged();
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentFinderInterface
    @Nullable
    public AgentInterface findAgent(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58c830265989ce063deeb660a9f26b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58c830265989ce063deeb660a9f26b6b");
        }
        h.b(str, "name");
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            return dVar.findAgent(str);
        }
        return null;
    }

    public final void notifyCellChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47ee856e1af44a63bd79ac2bde91f057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47ee856e1af44a63bd79ac2bde91f057");
        } else if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            jVar.notifyCellChanged();
        }
    }

    @Override // com.dianping.agentsdk.framework.a
    public void updateCells(@Nullable ArrayList<AgentInterface> arrayList, @Nullable ArrayList<AgentInterface> arrayList2, @Nullable ArrayList<AgentInterface> arrayList3) {
        Object[] objArr = {arrayList, arrayList2, arrayList3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "785eef4294087c27f705374e0b41caa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "785eef4294087c27f705374e0b41caa9");
        } else if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            jVar.updateCells(arrayList, arrayList2, arrayList3);
        }
    }

    @Override // com.dianping.agentsdk.framework.u
    public void updateAgentCell(@NotNull AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccf4e04a2ef88159a4799a4e7f0933f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccf4e04a2ef88159a4799a4e7f0933f9");
            return;
        }
        h.b(agentInterface, "agent");
        if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            jVar.updateAgentCell(agentInterface);
        }
    }

    @Override // com.dianping.agentsdk.framework.ao
    public void updateAgentCell(@NotNull AgentInterface agentInterface, @NotNull ap apVar, int i, int i2, int i3) {
        Object[] objArr = {agentInterface, apVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db2244b5aa6195c6f0403025c6b62038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db2244b5aa6195c6f0403025c6b62038");
            return;
        }
        h.b(agentInterface, "agent");
        h.b(apVar, "updateAgentType");
        if (this.cellManager == null) {
            return;
        }
        j<?> jVar = this.cellManager;
        if (jVar == null) {
            h.a("cellManager");
        }
        if (jVar instanceof an) {
            j<?> jVar2 = this.cellManager;
            if (jVar2 == null) {
                h.a("cellManager");
            }
            if (jVar2 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.UIRCellManagerInterface<*>");
            }
            ((an) jVar2).updateAgentCell(agentInterface, apVar, i, i2, i3);
            return;
        }
        j<?> jVar3 = this.cellManager;
        if (jVar3 == null) {
            h.a("cellManager");
        }
        jVar3.updateAgentCell(agentInterface);
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public void resetAgents(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5459c79c930687d3349ba6911bd031fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5459c79c930687d3349ba6911bd031fb");
            return;
        }
        ShieldLifeCycler shieldLifeCycler = this;
        if (shieldLifeCycler.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            dVar.resetAgents(bundle, this.shieldConfigs);
        }
        if (shieldLifeCycler.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            if (jVar instanceof b) {
                j<?> jVar2 = this.cellManager;
                if (jVar2 == null) {
                    h.a("cellManager");
                }
                if (jVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                }
                ((b) jVar2).a();
            }
        }
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public ArrayList<c> generaterConfigs() {
        return this.shieldConfigs;
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public j<?> getHostCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2f48dddddfbc5decaf081191edac49", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2f48dddddfbc5decaf081191edac49");
        }
        if (this.cellManager != null) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            return jVar;
        }
        return null;
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public com.dianping.agentsdk.framework.d getHostAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c954a2c2ead726fdc2452cb2518e237", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c954a2c2ead726fdc2452cb2518e237");
        }
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            return dVar;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.framework.u
    @Nullable
    public ar getWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce9a399dd29c62b1549034ca8adfb6c5", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce9a399dd29c62b1549034ca8adfb6c5") : getHostWhiteBoard();
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setDisableDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30cc4b50653dd4bb50e7ea1b18ce95ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30cc4b50653dd4bb50e7ea1b18ce95ad");
            return;
        }
        j<?> hostCellManager = getHostCellManager();
        if (hostCellManager instanceof CellManagerCommonFunctionInterface) {
            ((CellManagerCommonFunctionInterface) hostCellManager).setDisableDecoration(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setPageName(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "604e4e5f89e2fc56a49e6cd0ed21aba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "604e4e5f89e2fc56a49e6cd0ed21aba6");
            return;
        }
        h.b(str, "pageName");
        j<?> hostCellManager = getHostCellManager();
        if (!(hostCellManager instanceof CellManagerCommonFunctionInterface) || TextUtils.isEmpty(str)) {
            return;
        }
        ((CellManagerCommonFunctionInterface) hostCellManager).setPageName(str);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setShieldGAInfo(@NotNull ShieldGAInfo shieldGAInfo) {
        Object[] objArr = {shieldGAInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1ecfa92b767ee2f958e727106269f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1ecfa92b767ee2f958e727106269f4c");
            return;
        }
        h.b(shieldGAInfo, "shieldGAInfo");
        j<?> hostCellManager = getHostCellManager();
        if (hostCellManager instanceof CellManagerCommonFunctionInterface) {
            ((CellManagerCommonFunctionInterface) hostCellManager).setShieldGAInfo(shieldGAInfo);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface
    public void setPageAgentsPersistenceInfo(@NotNull PageAgentsPersistenceParams pageAgentsPersistenceParams) {
        Object[] objArr = {pageAgentsPersistenceParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b9ce529e206d9f34cef340c410025cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b9ce529e206d9f34cef340c410025cd");
            return;
        }
        h.b(pageAgentsPersistenceParams, "persistenceParams");
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            if (dVar instanceof PageAgentsPersistenceCtrlInterface) {
                com.dianping.agentsdk.framework.d dVar2 = this.agentManager;
                if (dVar2 == null) {
                    h.a("agentManager");
                }
                if (dVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface");
                }
                ((PageAgentsPersistenceCtrlInterface) dVar2).setPageAgentsPersistenceInfo(pageAgentsPersistenceParams);
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    @Nullable
    public ShieldSectionCellItem convertCellInterfaceToItem(@NotNull af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c10486443371ce0f69e2cc3255c82331", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c10486443371ce0f69e2cc3255c82331");
        }
        h.b(afVar, "sci");
        j<?> hostCellManager = getHostCellManager();
        if (!(hostCellManager instanceof CellManagerCommonFunctionInterface)) {
            hostCellManager = null;
        }
        CellManagerCommonFunctionInterface cellManagerCommonFunctionInterface = (CellManagerCommonFunctionInterface) hostCellManager;
        if (cellManagerCommonFunctionInterface != null) {
            return cellManagerCommonFunctionInterface.convertCellInterfaceToItem(afVar);
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public int getMaxTopViewY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a05d19118cba6487fd4b235bbc4f713", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a05d19118cba6487fd4b235bbc4f713")).intValue();
        }
        j<?> hostCellManager = getHostCellManager();
        if (!(hostCellManager instanceof CellManagerCommonFunctionInterface)) {
            hostCellManager = null;
        }
        CellManagerCommonFunctionInterface cellManagerCommonFunctionInterface = (CellManagerCommonFunctionInterface) hostCellManager;
        if (cellManagerCommonFunctionInterface != null) {
            return cellManagerCommonFunctionInterface.getMaxTopViewY();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.PageScrollEnabledInterface
    public void setScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0cbf2f6bd04c791ceb26e63727b1c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0cbf2f6bd04c791ceb26e63727b1c43");
            return;
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageScrollEnabledInterface)) {
            abVar = null;
        }
        PageScrollEnabledInterface pageScrollEnabledInterface = (PageScrollEnabledInterface) abVar;
        if (pageScrollEnabledInterface != null) {
            pageScrollEnabledInterface.setScrollEnabled(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface
    public void setExtraLayoutSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467b08d52de079592e2cec545c5aa984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467b08d52de079592e2cec545c5aa984");
            return;
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerCommonFunctionInterface)) {
            abVar = null;
        }
        PageContainerCommonFunctionInterface pageContainerCommonFunctionInterface = (PageContainerCommonFunctionInterface) abVar;
        if (pageContainerCommonFunctionInterface != null) {
            pageContainerCommonFunctionInterface.setExtraLayoutSpace(i);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageDividerControlInterface
    public void setPageDividerTheme(@NotNull PageDividerThemeParams pageDividerThemeParams) {
        Rect rect;
        Rect rect2;
        Object[] objArr = {pageDividerThemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e0dd07383c3c9fc4c44036eb29649f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e0dd07383c3c9fc4c44036eb29649f8");
            return;
        }
        h.b(pageDividerThemeParams, "themeParams");
        j<?> hostCellManager = getHostCellManager();
        DividerTheme dividerTheme = pageDividerThemeParams.getDividerTheme();
        if (dividerTheme == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[dividerTheme.ordinal()]) {
            case 1:
                if (pageDividerThemeParams.getParams() instanceof Integer) {
                    if (hostCellManager instanceof b) {
                        b bVar = (b) hostCellManager;
                        Context context = getHostFragment().getContext();
                        Object params = pageDividerThemeParams.getParams();
                        if (params == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        bVar.a(aq.a(context, ((Integer) params).intValue()));
                        return;
                    } else if (!(hostCellManager instanceof ShieldNodeCellManager) || (rect = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultDividerOffset) == null) {
                        return;
                    } else {
                        Context context2 = getHostFragment().getContext();
                        Object params2 = pageDividerThemeParams.getParams();
                        if (params2 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        rect.left = aq.a(context2, ((Integer) params2).intValue());
                        return;
                    }
                }
                return;
            case 2:
                if (pageDividerThemeParams.getParams() instanceof Drawable) {
                    Object params3 = pageDividerThemeParams.getParams();
                    if (params3 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    Drawable drawable = (Drawable) params3;
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).d(drawable);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultDivider = drawable;
                        return;
                    } else {
                        return;
                    }
                } else if (pageDividerThemeParams.getParams() == null) {
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).d(null);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultDivider = null;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                if (pageDividerThemeParams.getParams() instanceof Integer) {
                    if (hostCellManager instanceof b) {
                        b bVar2 = (b) hostCellManager;
                        Context context3 = getHostFragment().getContext();
                        Object params4 = pageDividerThemeParams.getParams();
                        if (params4 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        bVar2.c(aq.a(context3, ((Integer) params4).intValue()));
                        return;
                    } else if (!(hostCellManager instanceof ShieldNodeCellManager) || (rect2 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultDividerOffset) == null) {
                        return;
                    } else {
                        Context context4 = getHostFragment().getContext();
                        Object params5 = pageDividerThemeParams.getParams();
                        if (params5 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        rect2.right = aq.a(context4, ((Integer) params5).intValue());
                        return;
                    }
                }
                return;
            case 4:
                if (pageDividerThemeParams.getParams() instanceof Drawable) {
                    Object params6 = pageDividerThemeParams.getParams();
                    if (params6 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    Drawable drawable2 = (Drawable) params6;
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).e(drawable2);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSectionDivider = drawable2;
                        return;
                    } else {
                        return;
                    }
                } else if (pageDividerThemeParams.getParams() == null) {
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).e(null);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSectionDivider = null;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                if ((pageDividerThemeParams.getParams() instanceof Rect) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params7 = pageDividerThemeParams.getParams();
                    if (params7 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.Rect");
                    }
                    dividerThemePackage.defaultSectionDividerOffset = (Rect) params7;
                    return;
                }
                return;
            case 6:
                if ((pageDividerThemeParams.getParams() instanceof Drawable) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage2 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params8 = pageDividerThemeParams.getParams();
                    if (params8 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    dividerThemePackage2.defaultSectionTopDivider = (Drawable) params8;
                    return;
                } else if (pageDividerThemeParams.getParams() == null && (hostCellManager instanceof ShieldNodeCellManager)) {
                    ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSectionTopDivider = null;
                    return;
                } else {
                    return;
                }
            case 7:
                if ((pageDividerThemeParams.getParams() instanceof Drawable) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage3 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params9 = pageDividerThemeParams.getParams();
                    if (params9 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    dividerThemePackage3.defaultSectionBottomDivider = (Drawable) params9;
                    return;
                } else if (pageDividerThemeParams.getParams() == null && (hostCellManager instanceof ShieldNodeCellManager)) {
                    ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSectionBottomDivider = null;
                    return;
                } else {
                    return;
                }
            case 8:
                if (pageDividerThemeParams.getParams() instanceof Integer) {
                    if (hostCellManager instanceof b) {
                        b bVar3 = (b) hostCellManager;
                        Context context5 = getHostFragment().getContext();
                        Object params10 = pageDividerThemeParams.getParams();
                        if (params10 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        bVar3.b(aq.a(context5, ((Integer) params10).intValue()));
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        DividerThemePackage dividerThemePackage4 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                        Object params11 = pageDividerThemeParams.getParams();
                        if (params11 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Int");
                        }
                        dividerThemePackage4.defaultHeaderHeight = ((Integer) params11).intValue();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                if ((pageDividerThemeParams.getParams() instanceof Integer) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage5 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params12 = pageDividerThemeParams.getParams();
                    if (params12 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Int");
                    }
                    dividerThemePackage5.defaultFooterHeight = ((Integer) params12).intValue();
                    return;
                }
                return;
            case 10:
                if ((pageDividerThemeParams.getParams() instanceof Boolean) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage6 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params13 = pageDividerThemeParams.getParams();
                    if (params13 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    dividerThemePackage6.needAddFirstHeader = ((Boolean) params13).booleanValue();
                    return;
                }
                return;
            case 11:
                if (pageDividerThemeParams.getParams() instanceof Boolean) {
                    Object params14 = pageDividerThemeParams.getParams();
                    if (params14 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolean booleanValue = ((Boolean) params14).booleanValue();
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).b(booleanValue);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().needAddLastFooter = booleanValue;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                if ((pageDividerThemeParams.getParams() instanceof Integer) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage7 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params15 = pageDividerThemeParams.getParams();
                    if (params15 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Int");
                    }
                    dividerThemePackage7.firstHeaderExtraHeight = ((Integer) params15).intValue();
                    return;
                }
                return;
            case 13:
                if ((pageDividerThemeParams.getParams() instanceof Integer) && (hostCellManager instanceof ShieldNodeCellManager)) {
                    DividerThemePackage dividerThemePackage8 = ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage();
                    Object params16 = pageDividerThemeParams.getParams();
                    if (params16 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Int");
                    }
                    dividerThemePackage8.lastFooterExtraHeight = ((Integer) params16).intValue();
                    return;
                }
                return;
            case 14:
                if (pageDividerThemeParams.getParams() instanceof Drawable) {
                    Object params17 = pageDividerThemeParams.getParams();
                    if (params17 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    Drawable drawable3 = (Drawable) params17;
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).a(drawable3);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSpaceDrawable = drawable3;
                        return;
                    } else {
                        return;
                    }
                } else if (pageDividerThemeParams.getParams() == null) {
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).a((Drawable) null);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultSpaceDrawable = null;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                if (pageDividerThemeParams.getParams() instanceof Boolean) {
                    Object params18 = pageDividerThemeParams.getParams();
                    if (params18 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolean booleanValue2 = ((Boolean) params18).booleanValue();
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).a(booleanValue2);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().enableDivider = booleanValue2;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                if (pageDividerThemeParams.getParams() instanceof Drawable) {
                    Object params19 = pageDividerThemeParams.getParams();
                    if (params19 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    Drawable drawable4 = (Drawable) params19;
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).b(drawable4);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultHeaderDrawable = drawable4;
                        return;
                    } else {
                        return;
                    }
                } else if (pageDividerThemeParams.getParams() == null) {
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).b((Drawable) null);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultHeaderDrawable = null;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                if (pageDividerThemeParams.getParams() instanceof Drawable) {
                    Object params20 = pageDividerThemeParams.getParams();
                    if (params20 == null) {
                        throw new o("null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    }
                    Drawable drawable5 = (Drawable) params20;
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).c(drawable5);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultFooterDrawable = drawable5;
                        return;
                    } else {
                        return;
                    }
                } else if (pageDividerThemeParams.getParams() == null) {
                    if (hostCellManager instanceof b) {
                        ((b) hostCellManager).c((Drawable) null);
                        return;
                    } else if (hostCellManager instanceof ShieldNodeCellManager) {
                        ((ShieldNodeCellManager) hostCellManager).getDividerThemePackage().defaultFooterDrawable = null;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final long getDelayForAutoExpose() {
        return this.mExposeDelay >= 0 ? this.mExposeDelay : ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
    }

    public final void setDelayForAutoExpose(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21be7e6934bb27bc85a8b27686596f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21be7e6934bb27bc85a8b27686596f58");
        } else if (num == null || num.intValue() < 0) {
        } else {
            this.mExposeDelay = num.intValue();
        }
    }

    @Override // com.dianping.shield.bridge.feature.ExposeControlActionInterface
    public void callExposeAction(@NotNull ExposeAction exposeAction) {
        af sectionCellInterface;
        Object[] objArr = {exposeAction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "711147d6204506cbf09d2a3a7d0a382b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "711147d6204506cbf09d2a3a7d0a382b");
            return;
        }
        h.b(exposeAction, "exposedParam");
        if (getHostCellManager() instanceof ExposeScreenLoadedInterface) {
            j<?> hostCellManager = getHostCellManager();
            if (hostCellManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.feature.ExposeScreenLoadedInterface");
            }
            ExposeScreenLoadedInterface exposeScreenLoadedInterface = (ExposeScreenLoadedInterface) hostCellManager;
            ExposeControlActionType actionType = exposeAction.getActionType();
            if (actionType == null) {
                return;
            }
            switch (WhenMappings.$EnumSwitchMapping$2[actionType.ordinal()]) {
                case 1:
                    exposeScreenLoadedInterface.startExpose(exposeAction.getStartDelay());
                    return;
                case 2:
                    exposeScreenLoadedInterface.finishExpose();
                    return;
                case 3:
                    exposeScreenLoadedInterface.resumeExpose();
                    return;
                case 4:
                    exposeScreenLoadedInterface.pauseExpose();
                    return;
                case 5:
                    AgentInterface agent = exposeAction.getAgent();
                    if (agent == null || (sectionCellInterface = agent.getSectionCellInterface()) == null) {
                        return;
                    }
                    CellInfo cellInfo = exposeAction.getCellInfo();
                    if (cellInfo != null) {
                        CellType cellType = cellInfo.cellType;
                        if (cellType == null) {
                            return;
                        }
                        switch (WhenMappings.$EnumSwitchMapping$1[cellType.ordinal()]) {
                            case 1:
                                exposeScreenLoadedInterface.resetExposeRow(sectionCellInterface, cellInfo.section, cellInfo.row);
                                return;
                            case 2:
                            case 3:
                                exposeScreenLoadedInterface.resetExposeExtraCell(sectionCellInterface, cellInfo.section, cellInfo.cellType);
                                return;
                            default:
                                return;
                        }
                    }
                    exposeScreenLoadedInterface.resetExposeSCI(sectionCellInterface);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.ExposeControlActionInterface
    public void setExposeComputeMode(@NotNull f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04a1ac2864d868d4defc1b8303a00956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04a1ac2864d868d4defc1b8303a00956");
            return;
        }
        h.b(aVar, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        j<?> hostCellManager = getHostCellManager();
        if (!(hostCellManager instanceof ShieldNodeCellManager)) {
            hostCellManager = null;
        }
        ShieldNodeCellManager shieldNodeCellManager = (ShieldNodeCellManager) hostCellManager;
        if (shieldNodeCellManager != null) {
            shieldNodeCellManager.setExposeComputeMode(aVar);
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    public int getNodeGlobalPosition(@NotNull NodeInfo nodeInfo) {
        Object[] objArr = {nodeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e38ee21d6392e5cb2715916dddd8816", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e38ee21d6392e5cb2715916dddd8816")).intValue();
        }
        h.b(nodeInfo, "nodeInfo");
        if (getHostCellManager() instanceof AgentGlobalPositionInterface) {
            j<?> hostCellManager = getHostCellManager();
            if (hostCellManager != null) {
                return ((AgentGlobalPositionInterface) hostCellManager).getNodeGlobalPosition(nodeInfo);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.AgentGlobalPositionInterface");
        }
        return -1;
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    @Nullable
    public NodeInfo getAgentInfoByGlobalPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0db52eae9aef9b4584954a0887cf876a", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0db52eae9aef9b4584954a0887cf876a");
        }
        if (getHostCellManager() instanceof AgentGlobalPositionInterface) {
            j<?> hostCellManager = getHostCellManager();
            if (hostCellManager != null) {
                return ((AgentGlobalPositionInterface) hostCellManager).getAgentInfoByGlobalPosition(i);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.AgentGlobalPositionInterface");
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View getChildAtIndex(int i, boolean z) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5048137ecd3756b1cde7c7327d523dd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5048137ecd3756b1cde7c7327d523dd8");
        }
        if (this.pageContainer instanceof LayoutPositionFuctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
            }
            childAt = ((LayoutPositionFuctionInterface) abVar).getChildAtIndex(i, z);
        } else if (this.shieldLayoutManager instanceof LayoutPositionFuctionInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
            }
            childAt = ((LayoutPositionFuctionInterface) layoutManager).getChildAtIndex(i, z);
        } else {
            RecyclerView.LayoutManager layoutManager2 = this.shieldLayoutManager;
            childAt = layoutManager2 != null ? layoutManager2.getChildAt(i) : null;
        }
        if (z && (childAt instanceof DisplayNodeContainer)) {
            ShieldViewHolder viewHolder = ((DisplayNodeContainer) childAt).getViewHolder();
            if (viewHolder != null) {
                return viewHolder.itemView;
            }
            return null;
        }
        return childAt;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View findViewAtPosition(int i, boolean z) {
        View findViewByPosition;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3489f93e2918ff8d875bd4b24885cc5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3489f93e2918ff8d875bd4b24885cc5e");
        }
        if (this.pageContainer instanceof LayoutPositionFuctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
            }
            findViewByPosition = ((LayoutPositionFuctionInterface) abVar).findViewAtPosition(i, z);
        } else if (this.shieldLayoutManager instanceof LayoutPositionFuctionInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
            }
            findViewByPosition = ((LayoutPositionFuctionInterface) layoutManager).findViewAtPosition(i, z);
        } else {
            RecyclerView.LayoutManager layoutManager2 = this.shieldLayoutManager;
            findViewByPosition = layoutManager2 != null ? layoutManager2.findViewByPosition(i) : null;
        }
        if (z && (findViewByPosition instanceof DisplayNodeContainer)) {
            ShieldViewHolder viewHolder = ((DisplayNodeContainer) findViewByPosition).getViewHolder();
            if (viewHolder != null) {
                return viewHolder.itemView;
            }
            return null;
        }
        return findViewByPosition;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31f5db95a40a0565a9157f6120e9f468", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31f5db95a40a0565a9157f6120e9f468")).intValue();
        }
        if (this.pageContainer instanceof LayoutPositionFuctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((LayoutPositionFuctionInterface) abVar).getChildCount();
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
        } else if (this.shieldLayoutManager instanceof LayoutPositionFuctionInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager != null) {
                return ((LayoutPositionFuctionInterface) layoutManager).getChildCount();
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface");
        } else {
            RecyclerView.LayoutManager layoutManager2 = this.shieldLayoutManager;
            if (layoutManager2 != null) {
                return layoutManager2.getChildCount();
            }
            return 0;
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentScrollerInterface
    public void scrollToNode(@NotNull AgentScrollerParams agentScrollerParams) {
        Object[] objArr = {agentScrollerParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e08504594ab49d1e3453b00388941dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e08504594ab49d1e3453b00388941dc4");
            return;
        }
        h.b(agentScrollerParams, "info");
        if (getHostCellManager() instanceof AgentScrollerInterface) {
            j<?> hostCellManager = getHostCellManager();
            if (hostCellManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.AgentScrollerInterface");
            }
            ((AgentScrollerInterface) hostCellManager).scrollToNode(agentScrollerParams);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void simulateDragRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bf14d1f2cc258c5a4d834aed5150df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bf14d1f2cc258c5a4d834aed5150df");
            return;
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerRefreshInterface)) {
            abVar = null;
        }
        PageContainerRefreshInterface pageContainerRefreshInterface = (PageContainerRefreshInterface) abVar;
        if (pageContainerRefreshInterface != null) {
            pageContainerRefreshInterface.simulateDragRefresh();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c493bebdc2f13569749a8587652b4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c493bebdc2f13569749a8587652b4c6");
            return;
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerRefreshInterface)) {
            abVar = null;
        }
        PageContainerRefreshInterface pageContainerRefreshInterface = (PageContainerRefreshInterface) abVar;
        if (pageContainerRefreshInterface != null) {
            pageContainerRefreshInterface.setSuccess();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67b90979aaaca57ae522c6a2d6d96867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67b90979aaaca57ae522c6a2d6d96867");
            return;
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerRefreshInterface)) {
            abVar = null;
        }
        PageContainerRefreshInterface pageContainerRefreshInterface = (PageContainerRefreshInterface) abVar;
        if (pageContainerRefreshInterface != null) {
            pageContainerRefreshInterface.setError();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    @Nullable
    public FrameLayout getRecyclerViewLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b51785e9fbeb3fc14027a31a88f295ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b51785e9fbeb3fc14027a31a88f295ac");
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerCommonInterface)) {
            abVar = null;
        }
        PageContainerCommonInterface pageContainerCommonInterface = (PageContainerCommonInterface) abVar;
        if (pageContainerCommonInterface != null) {
            return pageContainerCommonInterface.getRecyclerViewLayout();
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    @Nullable
    public FrameLayout getZFrameLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "593f61245adec2dcc4617042620400ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "593f61245adec2dcc4617042620400ce");
        }
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof PageContainerCommonInterface)) {
            abVar = null;
        }
        PageContainerCommonInterface pageContainerCommonInterface = (PageContainerCommonInterface) abVar;
        if (pageContainerCommonInterface != null) {
            return pageContainerCommonInterface.getZFrameLayout();
        }
        return null;
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6ca933d2462bb24cbe3e39d2d61a81c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6ca933d2462bb24cbe3e39d2d61a81c");
        } else if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) abVar).scrollToPositionWithOffset(i, i2, z, f);
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) layoutManager).scrollToPositionWithOffset(i, i2, z, f);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7042ac41a1314b90b5ad7437b73fc81f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7042ac41a1314b90b5ad7437b73fc81f");
        } else if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) abVar).scrollToPositionWithOffset(i, i2, z, f, arrayList);
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) layoutManager).scrollToPositionWithOffset(i, i2, z, f, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "680197102d1b44c07c6f4164b081151f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "680197102d1b44c07c6f4164b081151f");
        } else if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) abVar).scrollToPositionWithOffset(i, i2, z);
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) layoutManager).scrollToPositionWithOffset(i, i2, z);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1d27441529557ceb6c4b6f18b9bfc3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1d27441529557ceb6c4b6f18b9bfc3c");
        } else if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) abVar).scrollToPositionWithOffset(i, i2, z, arrayList);
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
            }
            ((ShieldLayoutManagerInterface) layoutManager).scrollToPositionWithOffset(i, i2, z, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findFirstVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8685603b1080599cca5570eb86fc2bf0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8685603b1080599cca5570eb86fc2bf0")).intValue();
        }
        if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((ShieldLayoutManagerInterface) abVar).findFirstVisibleItemPosition(z);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager != null) {
                return ((ShieldLayoutManagerInterface) layoutManager).findFirstVisibleItemPosition(z);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
        } else {
            return -1;
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findLastVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "423d1a415e5f1279d3dbd1bb386c4635", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "423d1a415e5f1279d3dbd1bb386c4635")).intValue();
        }
        if (this.pageContainer instanceof ShieldLayoutManagerInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((ShieldLayoutManagerInterface) abVar).findLastVisibleItemPosition(z);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
        } else if (this.shieldLayoutManager instanceof ShieldLayoutManagerInterface) {
            RecyclerView.LayoutManager layoutManager = this.shieldLayoutManager;
            if (layoutManager != null) {
                return ((ShieldLayoutManagerInterface) layoutManager).findLastVisibleItemPosition(z);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface");
        } else {
            return -1;
        }
    }

    @Override // com.dianping.shield.bridge.feature.ViewRectInterface
    @Nullable
    public Rect getViewParentRect(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24157c143534331349b08d06537ed2e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24157c143534331349b08d06537ed2e1");
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getViewParentRect(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.RecyclerviewPositionInterface
    @NotNull
    public Pair<Integer, Integer> getViewTopBottom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a6516cf8331c8f630bf3335972a9978", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a6516cf8331c8f630bf3335972a9978");
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getViewTopBottom(i);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return new Pair<>(-1, -1);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    @Nullable
    public View getItemView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "591c8d1792c8b4fd81a172f50047a676", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "591c8d1792c8b4fd81a172f50047a676");
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemView(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewTop(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbff33a4af45e92c0aa3f03dd2a7a781", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbff33a4af45e92c0aa3f03dd2a7a781")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewTop(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewBottom(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46372dad9816948571b8da671ba14614", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46372dad9816948571b8da671ba14614")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewBottom(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildAdapterPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cadd1c05af7f6c829010300aef04105e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cadd1c05af7f6c829010300aef04105e")).intValue();
        }
        h.b(view, "child");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getChildAdapterPosition(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return -1;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewLeft(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32935490f90ee7c81b2caa2e4be6207b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32935490f90ee7c81b2caa2e4be6207b")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewLeft(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewRight(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037bbfe041c523948c1d13c8d5e024ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037bbfe041c523948c1d13c8d5e024ca")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewRight(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewWidth(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abf9862ac7a072b9d4d46dc8a3776e83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abf9862ac7a072b9d4d46dc8a3776e83")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewWidth(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewHeight(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca3bdaabe81cf475a01d1f5c64d9f41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca3bdaabe81cf475a01d1f5c64d9f41")).intValue();
        }
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar != null) {
                return ((PageContainerCommonFunctionInterface) abVar).getItemViewHeight(view);
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
        }
        return 0;
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4674f6872c60cb92dd82406ac24dd33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4674f6872c60cb92dd82406ac24dd33");
        } else if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).setFocusChildScrollOnScreenWhenBack(z);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback
    public void setSectionBgViewMap(@NotNull SparseArray<g> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ba07b1f737610d81c42c3ec1eea8bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ba07b1f737610d81c42c3ec1eea8bca");
            return;
        }
        h.b(sparseArray, "childBgInfoArray");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).setSectionBgViewMap(sparseArray);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbfb20aebf115afeaa3769032f135807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbfb20aebf115afeaa3769032f135807");
            return;
        }
        h.b(contentOffsetListener, "contentOffsetListener");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).addContentScrollOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addLayoutParamCalFinishCallBack(@NotNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "458c0aae167d02bbf9b7ca71633840ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "458c0aae167d02bbf9b7ca71633840ae");
            return;
        }
        h.b(eVar, "anchorViewLayoutParamInfo");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).addLayoutParamCalFinishCallBack(eVar);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeLayoutParamCalFinishCallBack(@NotNull e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dea4f27129c48bf5cf6a0eb882e4abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dea4f27129c48bf5cf6a0eb882e4abe");
            return;
        }
        h.b(aVar, "layoutParamCalFinishListener");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).removeLayoutParamCalFinishCallBack(aVar);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8df89f050b98b1317a58ed0a8a293eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8df89f050b98b1317a58ed0a8a293eb8");
            return;
        }
        h.b(contentOffsetListener, "contentOffsetListener");
        if (this.pageContainer instanceof PageContainerCommonFunctionInterface) {
            ab<?> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface");
            }
            ((PageContainerCommonFunctionInterface) abVar).removeContentScrollOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.feature.FrozenInfoInterface
    public void setFrozenInfo(@Nullable Boolean bool, @Nullable String str) {
        Object[] objArr = {bool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee96ff40773643d6557e1da448ce0539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee96ff40773643d6557e1da448ce0539");
        } else if (this.cellManager == null) {
        } else {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            if (jVar instanceof ShieldNodeCellManager) {
                j<?> jVar2 = this.cellManager;
                if (jVar2 == null) {
                    h.a("cellManager");
                }
                if (jVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ((ShieldNodeCellManager) jVar2).setFrozenInfo(bool, str);
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    public void setShieldArguments(@Nullable HashMap<String, Serializable> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed569da47f9f08646a3f57000abbcb02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed569da47f9f08646a3f57000abbcb02");
        } else if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            if (!(dVar instanceof PageArgumentsInterface)) {
                dVar = null;
            }
            PageArgumentsInterface pageArgumentsInterface = (PageArgumentsInterface) dVar;
            if (pageArgumentsInterface != null) {
                pageArgumentsInterface.setShieldArguments(hashMap);
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    @Nullable
    public HashMap<String, Serializable> getShieldArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32aec92ca1fd4c117596beea9869e142", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32aec92ca1fd4c117596beea9869e142");
        }
        if (this.agentManager != null) {
            com.dianping.agentsdk.framework.d dVar = this.agentManager;
            if (dVar == null) {
                h.a("agentManager");
            }
            if (!(dVar instanceof PageArgumentsInterface)) {
                dVar = null;
            }
            PageArgumentsInterface pageArgumentsInterface = (PageArgumentsInterface) dVar;
            if (pageArgumentsInterface != null) {
                return pageArgumentsInterface.getShieldArguments();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (((com.dianping.shield.lifecycle.NestedPageInterface) r2).shouldInterceptPageLifecycle() == false) goto L18;
     */
    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageAppear(@org.jetbrains.annotations.NotNull com.dianping.shield.lifecycle.PageAppearType r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.framework.ShieldLifeCycler.onPageAppear(com.dianping.shield.lifecycle.PageAppearType):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (((com.dianping.shield.lifecycle.NestedPageInterface) r1).shouldInterceptPageLifecycle() == false) goto L18;
     */
    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageDisappear(@org.jetbrains.annotations.NotNull com.dianping.shield.lifecycle.PageDisappearType r12) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.framework.ShieldLifeCycler.onPageDisappear(com.dianping.shield.lifecycle.PageDisappearType):void");
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    @NotNull
    public PageLifecycleObserver getPageLifecycleObserver() {
        return this.defaultPageLifecycleObserver;
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e07ab048f1889811ba8dd3c3ffb585c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e07ab048f1889811ba8dd3c3ffb585c");
            return;
        }
        h.b(pageAppearType, "type");
        onPageAppear(pageAppearType);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfcfee65fce0b84850c4afc3fdc2b826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfcfee65fce0b84850c4afc3fdc2b826");
            return;
        }
        h.b(pageDisappearType, "type");
        onPageDisappear(pageDisappearType);
    }

    private final boolean needExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44da68dae0cdb7687abb9facdb5de037", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44da68dae0cdb7687abb9facdb5de037")).booleanValue() : getHostFragment().getActivity() == null || com.dianping.agentsdk.utils.b.a(WhiteBoardKeyConsts.PARAM_NEED_EXPOSE, getHostFragment()) != 0 || com.dianping.agentsdk.utils.b.a(WhiteBoardKeyConsts.PARAM_NEED_EXPOSE, true, getHostFragment());
    }

    @Override // com.dianping.shield.lifecycle.NestedPageInterface
    public void onPageScrolled(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5133d6bfe0022c7eb41003c5afdd8470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5133d6bfe0022c7eb41003c5afdd8470");
            return;
        }
        h.b(scrollDirection, "direction");
        if (this.cellManager == null) {
            return;
        }
        if (scrollDirection == ScrollDirection.GO_AHEAD) {
            j<?> jVar = this.cellManager;
            if (jVar == null) {
                h.a("cellManager");
            }
            if (jVar instanceof b) {
                j<?> jVar2 = this.cellManager;
                if (jVar2 == null) {
                    h.a("cellManager");
                }
                if (jVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                }
                ((b) jVar2).d();
                j<?> jVar3 = this.cellManager;
                if (jVar3 == null) {
                    h.a("cellManager");
                }
                if (jVar3 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                }
                ((b) jVar3).b(scrollDirection);
            } else if (jVar instanceof ShieldNodeCellManager) {
                j<?> jVar4 = this.cellManager;
                if (jVar4 == null) {
                    h.a("cellManager");
                }
                if (jVar4 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ((ShieldNodeCellManager) jVar4).updateStatus(scrollDirection);
            }
        } else if (scrollDirection == ScrollDirection.PAGE_BACK || scrollDirection == ScrollDirection.STATIC) {
            j<?> jVar5 = this.cellManager;
            if (jVar5 == null) {
                h.a("cellManager");
            }
            if (jVar5 instanceof b) {
                j<?> jVar6 = this.cellManager;
                if (jVar6 == null) {
                    h.a("cellManager");
                }
                if (jVar6 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                }
                ((b) jVar6).c(scrollDirection);
            } else if (jVar5 instanceof ShieldNodeCellManager) {
                j<?> jVar7 = this.cellManager;
                if (jVar7 == null) {
                    h.a("cellManager");
                }
                if (jVar7 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                }
                ((ShieldNodeCellManager) jVar7).updateStatus(scrollDirection);
            }
        }
    }
}
