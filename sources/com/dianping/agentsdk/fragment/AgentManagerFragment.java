package com.dianping.agentsdk.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.e;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.v;
import com.dianping.agentsdk.manager.CommonAgentManager;
import com.dianping.portal.feature.g;
import com.dianping.portal.fragment.HoloFragment;
import com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.ScTitleBar;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.entity.PageAgentsPersistenceParams;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.SwitchShieldConfigPropertyHolder;
import com.dianping.shield.framework.HoloShieldLifeCycler;
import com.dianping.shield.framework.ShieldContainerInterface;
import com.dianping.shield.lifecycle.NestedPageInterface;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import com.dianping.shield.lifecycle.PageLifecycleDispatcher;
import com.dianping.shield.lifecycle.PageLifecycleObserver;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldGAType;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedData;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.runtime.ShieldRuntimeInterface;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.aidata.jsengine.utils.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.unionpay.tsmservice.data.Constant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u0094\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0002\u0094\u0002B\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096\u0001J\u0011\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0096\u0001J9\u0010.\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u000100002\u000e\u00102\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u000e\u00103\u001a\n 1*\u0004\u0018\u00010404H\u0096\u0001J!\u00105\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\t\u00106\u001a\u00020(H\u0096\u0001J\u0011\u00107\u001a\u00020(2\u0006\u00108\u001a\u000209H\u0096\u0001J\t\u0010:\u001a\u00020;H\u0096\u0001J\u0013\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?H\u0096\u0001J\u0011\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0096\u0001J\u0011\u0010C\u001a\u00020(2\u0006\u0010A\u001a\u00020DH\u0096\u0001J\u0013\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\u001dH\u0096\u0001J\u0011\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0018H\u0096\u0001J\u0011\u0010K\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0018H\u0096\u0001J!\u0010L\u001a\n 1*\u0004\u0018\u000100002\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u001b\u0010M\u001a\u0004\u0018\u0001002\u0006\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020\u0018H\u0096\u0001J\u0011\u0010P\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0010\u0010Q\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0016J\u0010\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RH$J\u0013\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020IH\u0096\u0001J\n\u0010X\u001a\u0004\u0018\u00010\u0010H\u0017J\u000e\u0010Y\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0017J\u0011\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u000200H\u0096\u0001J\u001b\u0010\\\u001a\u0004\u0018\u0001002\u0006\u0010]\u001a\u00020I2\u0006\u0010O\u001a\u00020\u0018H\u0096\u0001J\t\u0010^\u001a\u00020IH\u0096\u0001J!\u0010_\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J!\u0010`\u001a\n 1*\u0004\u0018\u00010a0a2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\b\u0010b\u001a\u00020;H\u0004J\b\u0010c\u001a\u0004\u0018\u00010\u0006J\u000b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0096\u0001J\u000f\u0010e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0096\u0001J!\u0010f\u001a\n 1*\u0004\u0018\u000100002\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010g\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010h\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010i\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010j\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010k\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\u0019\u0010l\u001a\u00020I2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J\t\u0010m\u001a\u00020IH\u0096\u0001J\u0011\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020VH\u0096\u0001J\u000e\u0010p\u001a\b\u0012\u0002\b\u0003\u0018\u00010 H\u0016J\t\u0010q\u001a\u00020rH\u0096\u0001J\u000b\u0010s\u001a\u0004\u0018\u00010tH\u0096\u0001J\u0011\u0010u\u001a\n 1*\u0004\u0018\u00010v0vH\u0096\u0001J\u0019\u0010w\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001cH\u0096\u0001J\b\u0010x\u001a\u00020\u0016H\u0016J\u0011\u0010y\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0011\u0010z\u001a\n 1*\u0004\u0018\u00010{0{H\u0096\u0001J\u0015\u0010|\u001a\u0004\u0018\u00010}2\b\u0010~\u001a\u0004\u0018\u000100H\u0096\u0001J\u001e\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020I0\u0080\u00012\u0006\u0010W\u001a\u00020IH\u0096\u0001J\u000b\u0010\u0081\u0001\u001a\u0004\u0018\u00010&H\u0016J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010tH\u0096\u0001J\n\u0010\u0083\u0001\u001a\u00020(H\u0096\u0001J\n\u0010\u0084\u0001\u001a\u00020(H\u0096\u0001J\t\u0010\u0085\u0001\u001a\u00020\u0010H\u0016J\r\u0010\u0086\u0001\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016J\t\u0010\u0087\u0001\u001a\u00020&H\u0016J\u000f\u0010\u0088\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010 H\u0016J\n\u0010\u0089\u0001\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010\u008a\u0001\u001a\u00020\u00182\u0007\u0010\u008b\u0001\u001a\u00020\u001dJ\u0012\u0010\u008c\u0001\u001a\u00020(2\u0007\u0010\u008d\u0001\u001a\u00020\u0018H\u0016J\u000b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0096\u0001J\n\u0010\u0090\u0001\u001a\u00020(H\u0096\u0001J\u000b\u0010\u0091\u0001\u001a\u00030\u008f\u0001H\u0096\u0001J\u0014\u0010\u0092\u0001\u001a\f 1*\u0005\u0018\u00010\u0093\u00010\u0093\u0001H\u0096\u0001J\u0015\u0010\u0094\u0001\u001a\u00020(2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J'\u0010\u0097\u0001\u001a\u00020(2\u0007\u0010\u0098\u0001\u001a\u00020I2\u0007\u0010\u0099\u0001\u001a\u00020I2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\u0015\u0010\u009c\u0001\u001a\u00020(2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0016J\t\u0010\u009f\u0001\u001a\u00020(H\u0016J\u0015\u0010 \u0001\u001a\u00020(2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J-\u0010¡\u0001\u001a\u0004\u0018\u0001002\b\u0010¢\u0001\u001a\u00030£\u00012\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\t\u0010¦\u0001\u001a\u00020(H\u0016J\t\u0010§\u0001\u001a\u00020(H\u0016J\u0012\u0010¨\u0001\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0018H\u0096\u0001J\u0012\u0010©\u0001\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0096\u0001J\u0012\u0010ª\u0001\u001a\u00020(2\u0006\u0010A\u001a\u00020DH\u0096\u0001J\u0014\u0010«\u0001\u001a\u00020(2\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0096\u0001J\t\u0010®\u0001\u001a\u00020(H\u0016J\u0011\u0010¯\u0001\u001a\f\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u0001J\u0013\u0010²\u0001\u001a\f\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u0001H\u0016J\t\u0010³\u0001\u001a\u00020(H\u0016J\u0013\u0010´\u0001\u001a\u00020(2\b\u0010µ\u0001\u001a\u00030\u0096\u0001H\u0016J\t\u0010¶\u0001\u001a\u00020(H\u0016J\t\u0010·\u0001\u001a\u00020(H\u0016J\u001e\u0010¸\u0001\u001a\u00020(2\u0007\u0010¹\u0001\u001a\u0002002\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\t\u0010º\u0001\u001a\u00020(H\u0016J,\u0010»\u0001\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u0010\u00102\u001a\f 1*\u0005\u0018\u00010¼\u00010¼\u0001H\u0096\u0001J\n\u0010½\u0001\u001a\u00020(H\u0096\u0001J\u0012\u0010¾\u0001\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096\u0001J\u0014\u0010¿\u0001\u001a\u00020(2\b\u0010À\u0001\u001a\u00030Á\u0001H\u0096\u0001J\u001a\u0010Â\u0001\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0015\u0010Ã\u0001\u001a\u00020(2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\u0014\u0010Ä\u0001\u001a\u00020(2\b\u0010Å\u0001\u001a\u00030Æ\u0001H\u0096\u0001J$\u0010Ç\u0001\u001a\u00020(2\u0006\u0010W\u001a\u00020I2\u0007\u0010È\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020\u0018H\u0096\u0001J.\u0010Ç\u0001\u001a\u00020(2\u0006\u0010W\u001a\u00020I2\u0007\u0010È\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020\u00182\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0096\u0001JN\u0010Ç\u0001\u001a\u00020(2\u0006\u0010W\u001a\u00020I2\u0007\u0010È\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020\u00182\b\u0010Ê\u0001\u001a\u00030Ë\u00012\u001e\u0010Ì\u0001\u001a\u0019\u0012\u0005\u0012\u00030Í\u0001\u0018\u00010Rj\f\u0012\u0005\u0012\u00030Í\u0001\u0018\u0001`Î\u0001H\u0096\u0001JD\u0010Ç\u0001\u001a\u00020(2\u0006\u0010W\u001a\u00020I2\u0007\u0010È\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020\u00182\u001e\u0010Ì\u0001\u001a\u0019\u0012\u0005\u0012\u00030Í\u0001\u0018\u00010Rj\f\u0012\u0005\u0012\u00030Í\u0001\u0018\u0001`Î\u0001H\u0096\u0001J\u0011\u0010Ï\u0001\u001a\u00020(2\b\u0010Ð\u0001\u001a\u00030¥\u0001J\u001e\u0010Ñ\u0001\u001a\u00020(2\u0015\u0010Ò\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cJ\u001c\u0010Ó\u0001\u001a\u00020(2\u0010\u0010/\u001a\f 1*\u0005\u0018\u00010Ô\u00010Ô\u0001H\u0096\u0001J\u001c\u0010Õ\u0001\u001a\u00020(2\u0010\u0010/\u001a\f 1*\u0005\u0018\u00010Ô\u00010Ô\u0001H\u0096\u0001J\u001a\u0010Ö\u0001\u001a\u00020(2\t\u0010×\u0001\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0003\u0010Ø\u0001J\u0013\u0010Ù\u0001\u001a\u00020(2\u0007\u0010Ú\u0001\u001a\u00020\u0018H\u0096\u0001J\n\u0010Û\u0001\u001a\u00020(H\u0096\u0001J\u0014\u0010Ü\u0001\u001a\u00020(2\b\u0010Ý\u0001\u001a\u00030Þ\u0001H\u0096\u0001J\u0013\u0010ß\u0001\u001a\u00020(2\u0007\u0010à\u0001\u001a\u00020IH\u0096\u0001J\u0012\u0010á\u0001\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0018H\u0096\u0001J&\u0010â\u0001\u001a\u00020(2\t\u0010ã\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010ä\u0001\u001a\u0004\u0018\u00010\u001dH\u0096\u0001¢\u0006\u0003\u0010å\u0001J\u0011\u0010æ\u0001\u001a\u00020(2\b\u0010¤\u0001\u001a\u00030¥\u0001J\u0012\u0010ç\u0001\u001a\u00020(2\u0007\u0010è\u0001\u001a\u00020\u0018H\u0016J\u0012\u0010é\u0001\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0018H\u0096\u0001J\u0014\u0010ê\u0001\u001a\u00020(2\b\u0010ë\u0001\u001a\u00030ì\u0001H\u0096\u0001J\u0014\u0010í\u0001\u001a\u00020(2\b\u0010Å\u0001\u001a\u00030î\u0001H\u0096\u0001J\u0013\u0010ï\u0001\u001a\u00020(2\u0007\u0010ð\u0001\u001a\u00020\u001dH\u0096\u0001J*\u0010ñ\u0001\u001a\u00020\u00182\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u000e\u00102\u001a\n 1*\u0004\u0018\u00010a0aH\u0096\u0001J\u0013\u0010ò\u0001\u001a\u00020(2\u0007\u0010ó\u0001\u001a\u00020\u0018H\u0096\u0001J\u001b\u0010ô\u0001\u001a\u00020(2\u000f\u0010õ\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ö\u0001H\u0096\u0001J!\u0010ø\u0001\u001a\u00020(2\u0015\u0010Ò\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cH\u0096\u0001J\u0013\u0010ù\u0001\u001a\u00020(2\u0007\u0010ú\u0001\u001a\u00020\u0016H\u0096\u0001J\u0012\u0010û\u0001\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0018H\u0096\u0001J\u0012\u0010ü\u0001\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0018H\u0096\u0001J\n\u0010ý\u0001\u001a\u00020(H\u0096\u0001J\u001a\u0010þ\u0001\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010000H\u0096\u0001J*\u0010þ\u0001\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u000100002\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0018H\u0096\u0001J\u001c\u0010ÿ\u0001\u001a\u00020(2\u0010\u0010/\u001a\f 1*\u0005\u0018\u00010\u0080\u00020\u0080\u0002H\u0096\u0001J\t\u0010\u0081\u0002\u001a\u00020\u0018H\u0016J\n\u0010\u0082\u0002\u001a\u00020(H\u0096\u0001J\n\u0010\u0083\u0002\u001a\u00020(H\u0096\u0001J!\u0010\u0084\u0002\u001a\u00020(2\n\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u009b\u00012\n\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J*\u0010\u0087\u0002\u001a\u00020(2\n\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010\u0098\u0001\u001a\u00020I2\n\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J,\u0010\u0088\u0002\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010\u001d0\u001d2\u0010\u00102\u001a\f 1*\u0005\u0018\u00010¼\u00010¼\u0001H\u0096\u0001J\u001a\u0010\u0089\u0002\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010F0FH\u0096\u0001JF\u0010\u0089\u0002\u001a\u00020(2\u000e\u0010/\u001a\n 1*\u0004\u0018\u00010F0F2\u0010\u00102\u001a\f 1*\u0005\u0018\u00010\u008a\u00020\u008a\u00022\u0006\u00103\u001a\u00020I2\u0007\u0010\u008b\u0002\u001a\u00020I2\u0007\u0010\u008c\u0002\u001a\u00020IH\u0096\u0001J\t\u0010\u008d\u0002\u001a\u00020(H\u0004J\u008e\u0001\u0010\u008e\u0002\u001a\u00020(2*\u0010/\u001a&\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F 1*\u0012\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F\u0018\u00010R0R2*\u00102\u001a&\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F 1*\u0012\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F\u0018\u00010R0R2*\u00103\u001a&\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F 1*\u0012\u0012\f\u0012\n 1*\u0004\u0018\u00010F0F\u0018\u00010R0RH\u0096\u0001J\u0012\u0010\u008f\u0002\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0012\u0010\u0090\u0002\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0012\u0010\u0091\u0002\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0012\u0010\u0092\u0002\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0012\u0010\u0093\u0002\u001a\n 1*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\u0095\u0002"}, d2 = {"Lcom/dianping/agentsdk/fragment/AgentManagerFragment;", "Lcom/dianping/portal/fragment/HoloFragment;", "Lcom/dianping/agentsdk/framework/AgentCellBridgeInterface;", "Lcom/dianping/shield/framework/ShieldContainerInterface;", "Lcom/dianping/portal/feature/LoginListenerInterface;", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "Lcom/dianping/shield/monitor/ShieldGAInterface;", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView$PageLoadFinishListener;", "Lcom/dianping/shield/lifecycle/NestedPageInterface;", "Lcom/dianping/shield/lifecycle/PageLifecycleCallbacks;", "Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;", "shieldLifeCycler", "Lcom/dianping/shield/framework/HoloShieldLifeCycler;", "(Lcom/dianping/shield/framework/HoloShieldLifeCycler;)V", "agentManager", "Lcom/dianping/agentsdk/framework/AgentManagerInterface;", "cellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "createSpeedData", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "defaultGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "interceptPageLifecycle", "", "lifeCycleCallbacks", "Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;", "mapArguments", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "refreshSubscription", "Lrx/Subscription;", "getShieldLifeCycler", "()Lcom/dianping/shield/framework/HoloShieldLifeCycler;", "whiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "addContentScrollOffsetListener", "", "contentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "addLayoutParamCalFinishCallBack", "anchorViewLayoutParamInfo", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo;", "addRightViewItem", "p0", "Landroid/view/View;", "kotlin.jvm.PlatformType", VersionInfo.P1, "p2", "Landroid/view/View$OnClickListener;", "appendUrlParms", "bindCaptureProvider", "callExposeAction", "action", "Lcom/dianping/shield/entity/ExposeAction;", Constants.Environment.KEY_CITYID, "", "convertCellInterfaceToItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "dispatchPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "dispatchPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "findAgent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "name", "findFirstVisibleItemPosition", "", "completely", "findLastVisibleItemPosition", "findRightViewItemByTag", "findViewAtPosition", "position", "isBizView", "fingerPrint", "generaterConfigs", "Ljava/util/ArrayList;", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "generaterDefaultConfigAgentList", "getAgentInfoByGlobalPosition", "Lcom/dianping/shield/entity/NodeInfo;", "globalPosition", "getAgentManager", "getCellManager", "getChildAdapterPosition", "child", "getChildAtIndex", "index", "getChildCount", "getConfigProperty", "getConfigPropertyHolder", "Lcom/dianping/portal/feature/PropertyHolderInterface;", "getDelayForAutoExpose", Constants.Func.GET_FEATURE, "getHostAgentManager", "getHostCellManager", "getItemView", "getItemViewBottom", "getItemViewHeight", "getItemViewLeft", "getItemViewRight", "getItemViewTop", "getItemViewWidth", "getMaxTopViewY", "getNodeGlobalPosition", "nodeInfo", "getPageContainer", "getPageLifecycleObserver", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "getRecyclerViewLayout", "Landroid/widget/FrameLayout;", "getScTitleBar", "Lcom/dianping/shield/component/widgets/ScTitleBar;", "getShieldArguments", "getShieldGAInfo", "getToken", "getUser", "Lcom/dianping/portal/model/CommonUser;", "getViewParentRect", "Landroid/graphics/Rect;", "rootBizView", "getViewTopBottom", "Landroid/util/Pair;", "getWhiteBoard", "getZFrameLayout", "gotoLogin", "hideTitlebar", "initAgentManger", "initCellManager", "initWhiteBoard", "initializePageContainer", "isLogin", "isNewShieldCellManager", "currentClassSimpleName", "isWhiteBoardShared", "isShared", Constants.PRIVACY.KEY_LATITUDE, "", "logout", Constants.PRIVACY.KEY_LONGITUDE, "mapiService", "Lcom/dianping/dataservice/mapi/MApiService;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCountFinish", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDetach", "onLogin", "onPageAppear", "onPageDisappear", "onPageScrolled", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "onPause", "onPullRefresh", "Lrx/Observable;", "", d.p, "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", Constants.EventType.VIEW, "onViewHeightFinish", "registerConfigProperty", "Lcom/dianping/portal/feature/ConfigPropertyChangeListener;", "removeAllRightViewItem", "removeContentScrollOffsetListener", "removeLayoutParamCalFinishCallBack", "layoutParamCalFinishListener", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo$LayoutParamCalFinishListener;", "removeRightViewItem", "resetAgents", "scrollToNode", "params", "Lcom/dianping/shield/entity/AgentScrollerParams;", "scrollToPositionWithOffset", "offset", "isSmoothScroll", "scrollSpeed", "", "listeners", "Lcom/dianping/agentsdk/sectionrecycler/layoutmanager/OnSmoothScrollListener;", "Lkotlin/collections/ArrayList;", "setAgentContainerView", "containerView", "setArguments", "arguments", "setBarSubtitle", "", "setBarTitle", "setDelayForAutoExpose", "delayMilliseconds", "(Ljava/lang/Integer;)V", "setDisableDecoration", "disableDecoration", "setError", "setExposeComputeMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "setExtraLayoutSpace", "extraLayoutSpace", "setFocusChildScrollOnScreenWhenBack", "setFrozenInfo", "enableFrozen", "frozenModuleKey", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "setHoverContainerView", "setInterceptPageLifecycle", "intercept", "setIsTransparentTitleBar", "setPageAgentsPersistenceInfo", "persistenceParams", "Lcom/dianping/shield/entity/PageAgentsPersistenceParams;", "setPageDividerTheme", "Lcom/dianping/shield/entity/PageDividerThemeParams;", "setPageName", "pageName", "setPropertyHolderInterface", "setScrollEnabled", "scrollEnabled", "setSectionBgViewMap", "childBgInfoArray", "Landroid/util/SparseArray;", "Lcom/dianping/agentsdk/framework/BackgroundViewInfo;", "setShieldArguments", "setShieldGAInfo", "shieldGAInfo", "setShowLeftButton", "setShowRightButton", "setSuccess", "setTitleCustomView", "setTitlebarBackground", "Landroid/graphics/drawable/Drawable;", "shouldInterceptPageLifecycle", "showTitlebar", "simulateDragRefresh", "startActivity", "intent", "options", "startActivityForResult", "unRegisterConfigProperty", "updateAgentCell", "Lcom/dianping/agentsdk/framework/UpdateAgentType;", VersionInfo.P3, VersionInfo.P4, "updateAgentContainer", "updateCells", "utmCampaign", "utmContent", "utmMedium", "utmSource", "utmTerm", "Companion", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class AgentManagerFragment extends HoloFragment implements com.dianping.agentsdk.framework.a, v, ShieldGlobalFeatureInterface, PageContainerRecyclerView.PageLoadFinishListener, ShieldContainerInterface, NestedPageInterface, PageLifecycleCallbacks, PageLifecycleDispatcher, ShieldGAInterface {
    public static final a Companion = new a(null);
    private static final String TAG = AgentManagerFragment.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    @JvmField
    @Nullable
    public com.dianping.agentsdk.framework.d agentManager;
    @JvmField
    @Nullable
    public j<?> cellManager;
    private ShieldSpeedData createSpeedData;
    private ShieldGAInfo defaultGAInfo;
    private boolean interceptPageLifecycle;
    private FragmentManager.FragmentLifecycleCallbacks lifeCycleCallbacks;
    private HashMap<String, Serializable> mapArguments;
    @JvmField
    @Nullable
    public ab<?> pageContainer;
    private k refreshSubscription;
    @NotNull
    private final HoloShieldLifeCycler shieldLifeCycler;
    @JvmField
    @Nullable
    public ar whiteBoard;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012,\u0010\u0004\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "args", "call", "([Ljava/lang/Object;)[Ljava/lang/Object;"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c<R> implements rx.functions.k<R> {
        public static final c a = new c();

        @Override // rx.functions.k
        public final /* bridge */ /* synthetic */ Object call(Object[] objArr) {
            return objArr;
        }
    }

    public AgentManagerFragment() {
        this(null, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "866fd16dc607b7d338e5bf5d9e881b19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "866fd16dc607b7d338e5bf5d9e881b19");
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db17e8dc2c8b5c2d0d9d09045b466855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db17e8dc2c8b5c2d0d9d09045b466855");
            return;
        }
        h.b(contentOffsetListener, "contentOffsetListener");
        this.shieldLifeCycler.addContentScrollOffsetListener(contentOffsetListener);
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addLayoutParamCalFinishCallBack(@NotNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9c992fcb2406c8022dda5776dc102b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9c992fcb2406c8022dda5776dc102b3");
            return;
        }
        h.b(eVar, "anchorViewLayoutParamInfo");
        this.shieldLifeCycler.addLayoutParamCalFinishCallBack(eVar);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void addRightViewItem(View view, String str, View.OnClickListener onClickListener) {
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93fa297ada55fa3fbf1910c76e6aefa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93fa297ada55fa3fbf1910c76e6aefa8");
        } else {
            this.shieldLifeCycler.addRightViewItem(view, str, onClickListener);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.h
    public String appendUrlParms(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8416c0c5e832978dcfcb1d28ed882063", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8416c0c5e832978dcfcb1d28ed882063") : this.shieldLifeCycler.appendUrlParms(str);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.a
    public void bindCaptureProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48924ec5d2e2636c69ad61f928c5c2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48924ec5d2e2636c69ad61f928c5c2a4");
        } else {
            this.shieldLifeCycler.bindCaptureProvider();
        }
    }

    @Override // com.dianping.shield.bridge.feature.ExposeControlActionInterface
    public void callExposeAction(@NotNull ExposeAction exposeAction) {
        Object[] objArr = {exposeAction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea34d5847ebb1026a3352015cd63293e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea34d5847ebb1026a3352015cd63293e");
            return;
        }
        h.b(exposeAction, "action");
        this.shieldLifeCycler.callExposeAction(exposeAction);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.d
    public long cityid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d0fc9c3b0005908e5c5165725c8c9d5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d0fc9c3b0005908e5c5165725c8c9d5")).longValue() : this.shieldLifeCycler.cityid();
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    @Nullable
    public ShieldSectionCellItem convertCellInterfaceToItem(@NotNull af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08a4731b382ca2d71331382fb7cd6e18", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08a4731b382ca2d71331382fb7cd6e18");
        }
        h.b(afVar, "sci");
        return this.shieldLifeCycler.convertCellInterfaceToItem(afVar);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4147ffeea8d933fd56836c637522556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4147ffeea8d933fd56836c637522556");
            return;
        }
        h.b(pageAppearType, "type");
        this.shieldLifeCycler.dispatchPageAppear(pageAppearType);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c27a393e6ed5d179238d4088adc0f147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c27a393e6ed5d179238d4088adc0f147");
            return;
        }
        h.b(pageDisappearType, "type");
        this.shieldLifeCycler.dispatchPageDisappear(pageDisappearType);
    }

    @Override // com.dianping.shield.bridge.feature.AgentFinderInterface
    @Nullable
    public AgentInterface findAgent(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c68d5288dac80645179beddebe7180", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c68d5288dac80645179beddebe7180");
        }
        h.b(str, "name");
        return this.shieldLifeCycler.findAgent(str);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findFirstVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a0ffcebf672623af458fd8c33d702d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a0ffcebf672623af458fd8c33d702d")).intValue() : this.shieldLifeCycler.findFirstVisibleItemPosition(z);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findLastVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ec01a1a45bfb61ffeea6c01b8fcb96f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ec01a1a45bfb61ffeea6c01b8fcb96f")).intValue() : this.shieldLifeCycler.findLastVisibleItemPosition(z);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public View findRightViewItemByTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b5bc0e09f713dbd7cc637776fdb2e00", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b5bc0e09f713dbd7cc637776fdb2e00") : this.shieldLifeCycler.findRightViewItemByTag(str);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View findViewAtPosition(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6559ab48faf2931398853a4231492f12", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6559ab48faf2931398853a4231492f12") : this.shieldLifeCycler.findViewAtPosition(i, z);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String fingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93fd956674a564710fb510db11a5fc0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93fd956674a564710fb510db11a5fc0") : this.shieldLifeCycler.fingerPrint();
    }

    @Nullable
    public abstract ArrayList<com.dianping.agentsdk.framework.c> generaterDefaultConfigAgentList();

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    @Nullable
    public NodeInfo getAgentInfoByGlobalPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35918c658bddda252af475d1a5341aa6", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35918c658bddda252af475d1a5341aa6") : this.shieldLifeCycler.getAgentInfoByGlobalPosition(i);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildAdapterPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3055a2709aad9737a51216add4b7abd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3055a2709aad9737a51216add4b7abd")).intValue();
        }
        h.b(view, "child");
        return this.shieldLifeCycler.getChildAdapterPosition(view);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View getChildAtIndex(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57acf19c7315425b2db1ced16a877137", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57acf19c7315425b2db1ced16a877137") : this.shieldLifeCycler.getChildAtIndex(i, z);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a582addf06bf4788d39c669d546d9cf5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a582addf06bf4788d39c669d546d9cf5")).intValue() : this.shieldLifeCycler.getChildCount();
    }

    @Override // com.dianping.portal.feature.c
    public String getConfigProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f4bc576409a3d8d3cc5160eaa22ad7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f4bc576409a3d8d3cc5160eaa22ad7c") : this.shieldLifeCycler.getConfigProperty(str);
    }

    @Override // com.dianping.portal.feature.c
    public g getConfigPropertyHolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c737af00a9649e2e644d8cd82ca02656", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c737af00a9649e2e644d8cd82ca02656") : this.shieldLifeCycler.getConfigPropertyHolder(str);
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public com.dianping.agentsdk.framework.d getHostAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39a91864aeed5dafecc335e6120bf2e4", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39a91864aeed5dafecc335e6120bf2e4") : this.shieldLifeCycler.getHostAgentManager();
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public j<?> getHostCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "022eda3829ca63a00d20fddbd32fbdc4", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "022eda3829ca63a00d20fddbd32fbdc4") : this.shieldLifeCycler.getHostCellManager();
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public View getItemView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd575e28e02521477102c52c43c26bf", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd575e28e02521477102c52c43c26bf") : this.shieldLifeCycler.getItemView(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewBottom(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8503eba2ae6fb34da0cece25de84b2ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8503eba2ae6fb34da0cece25de84b2ed")).intValue() : this.shieldLifeCycler.getItemViewBottom(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewHeight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41f1fa562f4c77c2327ee2dbd7546988", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41f1fa562f4c77c2327ee2dbd7546988")).intValue() : this.shieldLifeCycler.getItemViewHeight(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewLeft(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a853508a547a06966f326ba744847ce9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a853508a547a06966f326ba744847ce9")).intValue() : this.shieldLifeCycler.getItemViewLeft(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewRight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27587abee371d89f5b58c77e9e26cdde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27587abee371d89f5b58c77e9e26cdde")).intValue() : this.shieldLifeCycler.getItemViewRight(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewTop(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb52f04d8ae965d3a018d54d43414e89", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb52f04d8ae965d3a018d54d43414e89")).intValue() : this.shieldLifeCycler.getItemViewTop(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewWidth(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31bc9838d56954308d95a6cca0c606c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31bc9838d56954308d95a6cca0c606c")).intValue() : this.shieldLifeCycler.getItemViewWidth(view);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public int getMaxTopViewY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd1cab75f11af346f106d98f8b589f6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd1cab75f11af346f106d98f8b589f6d")).intValue() : this.shieldLifeCycler.getMaxTopViewY();
    }

    @Override // com.dianping.shield.bridge.feature.AgentGlobalPositionInterface
    public int getNodeGlobalPosition(@NotNull NodeInfo nodeInfo) {
        Object[] objArr = {nodeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0385ed5951df023146da97fdf45771f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0385ed5951df023146da97fdf45771f")).intValue();
        }
        h.b(nodeInfo, "nodeInfo");
        return this.shieldLifeCycler.getNodeGlobalPosition(nodeInfo);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    @NotNull
    public PageLifecycleObserver getPageLifecycleObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27fad1cf1e8b7e80db7bbdd94194e605", RobustBitConfig.DEFAULT_VALUE) ? (PageLifecycleObserver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27fad1cf1e8b7e80db7bbdd94194e605") : this.shieldLifeCycler.getPageLifecycleObserver();
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    @Nullable
    public FrameLayout getRecyclerViewLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ea4ab1b23e3ebd49e8965801c9e8e4c", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ea4ab1b23e3ebd49e8965801c9e8e4c") : this.shieldLifeCycler.getRecyclerViewLayout();
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    public ScTitleBar getScTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "444501540fa8df71bc568e5f4c130fc6", RobustBitConfig.DEFAULT_VALUE) ? (ScTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "444501540fa8df71bc568e5f4c130fc6") : this.shieldLifeCycler.getScTitleBar();
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    @Nullable
    public HashMap<String, Serializable> getShieldArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5986759247b97ba3a7c4b4853beb9d4b", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5986759247b97ba3a7c4b4853beb9d4b") : this.shieldLifeCycler.getShieldArguments();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.e
    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9bce860517a495e0f59629455746a59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9bce860517a495e0f59629455746a59") : this.shieldLifeCycler.getToken();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.e
    public com.dianping.portal.model.a getUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c25b66179faa5ffc418aad5dba79cc5", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.portal.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c25b66179faa5ffc418aad5dba79cc5") : this.shieldLifeCycler.getUser();
    }

    @Override // com.dianping.shield.bridge.feature.ViewRectInterface
    @Nullable
    public Rect getViewParentRect(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f56bf18fbe4c1b3d831989e08fd0382", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f56bf18fbe4c1b3d831989e08fd0382") : this.shieldLifeCycler.getViewParentRect(view);
    }

    @Override // com.dianping.shield.bridge.feature.RecyclerviewPositionInterface
    @NotNull
    public Pair<Integer, Integer> getViewTopBottom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f34c4c12f140c049161d0fca24db4b1", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f34c4c12f140c049161d0fca24db4b1") : this.shieldLifeCycler.getViewTopBottom(i);
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    @Nullable
    public FrameLayout getZFrameLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a013e55533481de864d9e2f15f98d1c3", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a013e55533481de864d9e2f15f98d1c3") : this.shieldLifeCycler.getZFrameLayout();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.e
    public void gotoLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "864418139ab4ceb3bbbaffbd8e3c2a0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "864418139ab4ceb3bbbaffbd8e3c2a0b");
        } else {
            this.shieldLifeCycler.gotoLogin();
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void hideTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9585e10feb4106f007b46cad4d063b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9585e10feb4106f007b46cad4d063b");
        } else {
            this.shieldLifeCycler.hideTitlebar();
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.e
    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bfec64bff33cdafae6e959f59a671b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bfec64bff33cdafae6e959f59a671b")).booleanValue() : this.shieldLifeCycler.isLogin();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.d
    public double latitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb5549b9b1d08d32be0a2e62bf319bab", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb5549b9b1d08d32be0a2e62bf319bab")).doubleValue() : this.shieldLifeCycler.latitude();
    }

    @Override // com.dianping.portal.fragment.HoloFragment
    public void logout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d22e088b11ed3687e6c99cf406a8c5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d22e088b11ed3687e6c99cf406a8c5da");
        } else {
            this.shieldLifeCycler.logout();
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.d
    public double longitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f32e6f7954a9866b0f3c3430d7e80a1", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f32e6f7954a9866b0f3c3430d7e80a1")).doubleValue() : this.shieldLifeCycler.longitude();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.h
    public com.dianping.dataservice.mapi.g mapiService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0211add184d99f13988eb1753033922d", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.dataservice.mapi.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0211add184d99f13988eb1753033922d") : this.shieldLifeCycler.mapiService();
    }

    @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView.PageLoadFinishListener
    public void onCountFinish() {
    }

    @Override // android.support.v4.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onLogin(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8917fdf73cbac9bbec7a1bfc4bcb90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8917fdf73cbac9bbec7a1bfc4bcb90e");
        } else {
            this.shieldLifeCycler.onLogin(z);
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12b5a34812f71d8a4915bb0bd8302cad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12b5a34812f71d8a4915bb0bd8302cad");
            return;
        }
        h.b(pageAppearType, "type");
        this.shieldLifeCycler.onPageAppear(pageAppearType);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c920ebe2d41abeca4e21bb1b125fac47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c920ebe2d41abeca4e21bb1b125fac47");
            return;
        }
        h.b(pageDisappearType, "type");
        this.shieldLifeCycler.onPageDisappear(pageDisappearType);
    }

    @Override // com.dianping.shield.lifecycle.NestedPageInterface
    public void onPageScrolled(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75a3e83e895ec204997b4509f5cc13f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75a3e83e895ec204997b4509f5cc13f1");
            return;
        }
        h.b(scrollDirection, "direction");
        this.shieldLifeCycler.onPageScrolled(scrollDirection);
    }

    @Nullable
    public rx.d<Object> onRefresh() {
        return null;
    }

    @Override // com.dianping.portal.feature.c
    public void registerConfigProperty(String str, com.dianping.portal.feature.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a9162bec33a939963bc184a971f846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a9162bec33a939963bc184a971f846");
        } else {
            this.shieldLifeCycler.registerConfigProperty(str, bVar);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void removeAllRightViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d1d06149ebbd0da083ef75551405ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d1d06149ebbd0da083ef75551405ad9");
        } else {
            this.shieldLifeCycler.removeAllRightViewItem();
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "788b373edd7eda5e341ca6548e856997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "788b373edd7eda5e341ca6548e856997");
            return;
        }
        h.b(contentOffsetListener, "contentOffsetListener");
        this.shieldLifeCycler.removeContentScrollOffsetListener(contentOffsetListener);
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeLayoutParamCalFinishCallBack(@NotNull e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aca05156c40724eb19f558b07f6673bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aca05156c40724eb19f558b07f6673bc");
            return;
        }
        h.b(aVar, "layoutParamCalFinishListener");
        this.shieldLifeCycler.removeLayoutParamCalFinishCallBack(aVar);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void removeRightViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f1536d6f16c7b672998684910da908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f1536d6f16c7b672998684910da908");
        } else {
            this.shieldLifeCycler.removeRightViewItem(str);
        }
    }

    @Override // com.dianping.shield.bridge.feature.AgentScrollerInterface
    public void scrollToNode(@NotNull AgentScrollerParams agentScrollerParams) {
        Object[] objArr = {agentScrollerParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20a9eed57aefc9868a7026d2ed8560b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20a9eed57aefc9868a7026d2ed8560b9");
            return;
        }
        h.b(agentScrollerParams, "params");
        this.shieldLifeCycler.scrollToNode(agentScrollerParams);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0b8d22a214abb371a23be279321202c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0b8d22a214abb371a23be279321202c");
        } else {
            this.shieldLifeCycler.scrollToPositionWithOffset(i, i2, z);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d40cd7182fc338a10caaafdc690c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d40cd7182fc338a10caaafdc690c34");
        } else {
            this.shieldLifeCycler.scrollToPositionWithOffset(i, i2, z, f);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b5dae3eca0b97b1277611c6510d4f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b5dae3eca0b97b1277611c6510d4f0f");
        } else {
            this.shieldLifeCycler.scrollToPositionWithOffset(i, i2, z, f, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75392c75c13690782e6eb966914d1251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75392c75c13690782e6eb966914d1251");
        } else {
            this.shieldLifeCycler.scrollToPositionWithOffset(i, i2, z, arrayList);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setBarSubtitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f00c942d6de199a5039fae24ab682d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f00c942d6de199a5039fae24ab682d");
        } else {
            this.shieldLifeCycler.setBarSubtitle(charSequence);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b7cd0d2314b9a04b42e58ae99cde902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b7cd0d2314b9a04b42e58ae99cde902");
        } else {
            this.shieldLifeCycler.setBarTitle(charSequence);
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setDisableDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0182d5ec1c6e13090ef48853d19dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0182d5ec1c6e13090ef48853d19dc2");
        } else {
            this.shieldLifeCycler.setDisableDecoration(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b3e97af03267e965ed4a8503e67cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b3e97af03267e965ed4a8503e67cf0");
        } else {
            this.shieldLifeCycler.setError();
        }
    }

    @Override // com.dianping.shield.bridge.feature.ExposeControlActionInterface
    public void setExposeComputeMode(@NotNull f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4dd17ac2ab0cf70e14487fc4280eac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4dd17ac2ab0cf70e14487fc4280eac0");
            return;
        }
        h.b(aVar, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        this.shieldLifeCycler.setExposeComputeMode(aVar);
    }

    @Override // com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface
    public void setExtraLayoutSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50059f1cafe3d42742aff6583bd90fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50059f1cafe3d42742aff6583bd90fbb");
        } else {
            this.shieldLifeCycler.setExtraLayoutSpace(i);
        }
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f621477daf7d656eb8236a539ba2ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f621477daf7d656eb8236a539ba2ec5");
        } else {
            this.shieldLifeCycler.setFocusChildScrollOnScreenWhenBack(z);
        }
    }

    @Override // com.dianping.shield.feature.FrozenInfoInterface
    public void setFrozenInfo(@Nullable Boolean bool, @Nullable String str) {
        Object[] objArr = {bool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d58496e591a5ea6cf777a05b947ed0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d58496e591a5ea6cf777a05b947ed0e");
        } else {
            this.shieldLifeCycler.setFrozenInfo(bool, str);
        }
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    public void setIsTransparentTitleBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5427ada82957069c2ba7930b579aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5427ada82957069c2ba7930b579aca");
        } else {
            this.shieldLifeCycler.setIsTransparentTitleBar(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface
    public void setPageAgentsPersistenceInfo(@NotNull PageAgentsPersistenceParams pageAgentsPersistenceParams) {
        Object[] objArr = {pageAgentsPersistenceParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b4b0883dfa160c5645a0daa99b50b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b4b0883dfa160c5645a0daa99b50b75");
            return;
        }
        h.b(pageAgentsPersistenceParams, "persistenceParams");
        this.shieldLifeCycler.setPageAgentsPersistenceInfo(pageAgentsPersistenceParams);
    }

    @Override // com.dianping.shield.bridge.feature.PageDividerControlInterface
    public void setPageDividerTheme(@NotNull PageDividerThemeParams pageDividerThemeParams) {
        Object[] objArr = {pageDividerThemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3115135e1c50546040096807fc333b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3115135e1c50546040096807fc333b9");
            return;
        }
        h.b(pageDividerThemeParams, "params");
        this.shieldLifeCycler.setPageDividerTheme(pageDividerThemeParams);
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setPageName(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "665049ddc039a8d39e8e31ac6f12cf95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "665049ddc039a8d39e8e31ac6f12cf95");
            return;
        }
        h.b(str, "pageName");
        this.shieldLifeCycler.setPageName(str);
    }

    @Override // com.dianping.portal.feature.c
    public boolean setPropertyHolderInterface(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23d5450215eb6fb3fa55b2c5aee1f499", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23d5450215eb6fb3fa55b2c5aee1f499")).booleanValue() : this.shieldLifeCycler.setPropertyHolderInterface(str, gVar);
    }

    @Override // com.dianping.shield.bridge.feature.PageScrollEnabledInterface
    public void setScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c84d1d3871cc06fbfa62f7983f4dad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c84d1d3871cc06fbfa62f7983f4dad2");
        } else {
            this.shieldLifeCycler.setScrollEnabled(z);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback
    public void setSectionBgViewMap(@NotNull SparseArray<com.dianping.agentsdk.framework.g> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8cee7b20e82eb1c1a5c48f92d7ee6c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8cee7b20e82eb1c1a5c48f92d7ee6c4");
            return;
        }
        h.b(sparseArray, "childBgInfoArray");
        this.shieldLifeCycler.setSectionBgViewMap(sparseArray);
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    public void setShieldArguments(@Nullable HashMap<String, Serializable> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e88b6f45dc29f7882f1ece88e25c018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e88b6f45dc29f7882f1ece88e25c018");
        } else {
            this.shieldLifeCycler.setShieldArguments(hashMap);
        }
    }

    @Override // com.dianping.shield.bridge.feature.CellManagerCommonFunctionInterface
    public void setShieldGAInfo(@NotNull ShieldGAInfo shieldGAInfo) {
        Object[] objArr = {shieldGAInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a78113e030b780fc3421433a1dcc09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a78113e030b780fc3421433a1dcc09d");
            return;
        }
        h.b(shieldGAInfo, "shieldGAInfo");
        this.shieldLifeCycler.setShieldGAInfo(shieldGAInfo);
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setShowLeftButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2c4924ab15709eeadf630c8cab5f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2c4924ab15709eeadf630c8cab5f36");
        } else {
            this.shieldLifeCycler.setShowLeftButton(z);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setShowRightButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983f08c8d1efaff92e7a5aa4cea1c03a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983f08c8d1efaff92e7a5aa4cea1c03a");
        } else {
            this.shieldLifeCycler.setShowRightButton(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37c011eb55e9825bc6063053300d1044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37c011eb55e9825bc6063053300d1044");
        } else {
            this.shieldLifeCycler.setSuccess();
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setTitleCustomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922312924a1bccfb00133a62133852b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922312924a1bccfb00133a62133852b2");
        } else {
            this.shieldLifeCycler.setTitleCustomView(view);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setTitleCustomView(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4575b2f9d683629e9a5aca1785b0e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4575b2f9d683629e9a5aca1785b0e38");
        } else {
            this.shieldLifeCycler.setTitleCustomView(view, z, z2);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void setTitlebarBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16374af257d326b1c5aa80753f70175d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16374af257d326b1c5aa80753f70175d");
        } else {
            this.shieldLifeCycler.setTitlebarBackground(drawable);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.i
    public void showTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04920da453f0e769025607714fe2a6fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04920da453f0e769025607714fe2a6fa");
        } else {
            this.shieldLifeCycler.showTitlebar();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void simulateDragRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f985edc67249075afa35eed191640685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f985edc67249075afa35eed191640685");
        } else {
            this.shieldLifeCycler.simulateDragRefresh();
        }
    }

    @Override // com.dianping.portal.feature.c
    public void unRegisterConfigProperty(String str, com.dianping.portal.feature.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77d576ab3b26f68f5fb06c71d8661070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77d576ab3b26f68f5fb06c71d8661070");
        } else {
            this.shieldLifeCycler.unRegisterConfigProperty(str, bVar);
        }
    }

    @Override // com.dianping.agentsdk.framework.u
    public void updateAgentCell(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3275afcefb06338b4a8deadc5a92aa8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3275afcefb06338b4a8deadc5a92aa8b");
        } else {
            this.shieldLifeCycler.updateAgentCell(agentInterface);
        }
    }

    @Override // com.dianping.agentsdk.framework.ao
    public void updateAgentCell(AgentInterface agentInterface, ap apVar, int i, int i2, int i3) {
        Object[] objArr = {agentInterface, apVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f70aaf481e0e82fa838aec3d273d81f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f70aaf481e0e82fa838aec3d273d81f");
        } else {
            this.shieldLifeCycler.updateAgentCell(agentInterface, apVar, i, i2, i3);
        }
    }

    @Override // com.dianping.agentsdk.framework.a
    public void updateCells(ArrayList<AgentInterface> arrayList, ArrayList<AgentInterface> arrayList2, ArrayList<AgentInterface> arrayList3) {
        Object[] objArr = {arrayList, arrayList2, arrayList3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da7011fa87597c578ede3bca23c2145e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da7011fa87597c578ede3bca23c2145e");
        } else {
            this.shieldLifeCycler.updateCells(arrayList, arrayList2, arrayList3);
        }
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String utmCampaign() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9e37ffa8e52df3a944994572db7e2b7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9e37ffa8e52df3a944994572db7e2b7") : this.shieldLifeCycler.utmCampaign();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String utmContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd129cf3230686136ba5c2034ae298f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd129cf3230686136ba5c2034ae298f8") : this.shieldLifeCycler.utmContent();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String utmMedium() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84653e4e8364e1f549a17be36b3865c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84653e4e8364e1f549a17be36b3865c") : this.shieldLifeCycler.utmMedium();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String utmSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "600aef3abc7f0816ee069cca460f089f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "600aef3abc7f0816ee069cca460f089f") : this.shieldLifeCycler.utmSource();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, com.dianping.portal.feature.j
    public String utmTerm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f796bf543aef9ec5d01e1165050f4339", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f796bf543aef9ec5d01e1165050f4339") : this.shieldLifeCycler.utmTerm();
    }

    public /* synthetic */ AgentManagerFragment(HoloShieldLifeCycler holoShieldLifeCycler, int i, kotlin.jvm.internal.f fVar) {
        this((i & 1) != 0 ? new HoloShieldLifeCycler(null, 1, null) : holoShieldLifeCycler);
    }

    @NotNull
    public final HoloShieldLifeCycler getShieldLifeCycler() {
        return this.shieldLifeCycler;
    }

    public AgentManagerFragment(@NotNull HoloShieldLifeCycler holoShieldLifeCycler) {
        ar arVar;
        h.b(holoShieldLifeCycler, "shieldLifeCycler");
        Object[] objArr = {holoShieldLifeCycler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8d6523d798ac76c823f098e7ef53980", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8d6523d798ac76c823f098e7ef53980");
            return;
        }
        this.shieldLifeCycler = holoShieldLifeCycler;
        ShieldGAType shieldGAType = ShieldGAType.NATIVEMODULESVC;
        String name = getClass().getName();
        h.a((Object) name, "this.javaClass.name");
        this.defaultGAInfo = new ShieldGAInfo(shieldGAType, name);
        ShieldMonitorUtil.Companion companion = ShieldMonitorUtil.Companion;
        String name2 = getClass().getName();
        h.a((Object) name2, "javaClass.name");
        this.createSpeedData = new ShieldSpeedData(companion.getPageKey(name2, 1));
        this.lifeCycleCallbacks = new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.dianping.agentsdk.fragment.AgentManagerFragment$lifeCycleCallbacks$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public final void onFragmentViewCreated(@Nullable FragmentManager fragmentManager, @Nullable Fragment fragment, @Nullable View view, @Nullable Bundle bundle) {
                ShieldSpeedData shieldSpeedData;
                Object[] objArr2 = {fragmentManager, fragment, view, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a44f48ef87f3166d772a0737bb24a44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a44f48ef87f3166d772a0737bb24a44");
                    return;
                }
                super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
                if (fragment == AgentManagerFragment.this) {
                    shieldSpeedData = AgentManagerFragment.this.createSpeedData;
                    shieldSpeedData.addEvent(ShieldSpeedStep.MF_STEP_LOAD_VIEW.getStep());
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public final void onFragmentCreated(@Nullable FragmentManager fragmentManager, @Nullable Fragment fragment, @Nullable Bundle bundle) {
                ShieldSpeedData shieldSpeedData;
                Object[] objArr2 = {fragmentManager, fragment, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc773c7b7519ec20d236787536f94aab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc773c7b7519ec20d236787536f94aab");
                    return;
                }
                super.onFragmentCreated(fragmentManager, fragment, bundle);
                if (fragment == AgentManagerFragment.this) {
                    shieldSpeedData = AgentManagerFragment.this.createSpeedData;
                    shieldSpeedData.addEvent(ShieldSpeedStep.MF_STEP_INIT.getStep());
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public final void onFragmentActivityCreated(@Nullable FragmentManager fragmentManager, @Nullable Fragment fragment, @Nullable Bundle bundle) {
                ShieldSpeedData shieldSpeedData;
                Object[] objArr2 = {fragmentManager, fragment, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "547290e60260ffa85d13f9a361815add", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "547290e60260ffa85d13f9a361815add");
                    return;
                }
                super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
                if (h.a(fragment, AgentManagerFragment.this)) {
                    ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
                    List<Float> asList = Arrays.asList(Float.valueOf(1.0f));
                    h.a((Object) asList, "Arrays.asList(1f)");
                    obtain.addValues(ShieldMonitorKey.MFControllerLoad, asList).addTag("type", AgentManagerFragment.this.getShieldGAInfo().getType().getType()).addTag(ShieldMonitorKey.TAG_BUSINESS, AgentManagerFragment.this.getShieldGAInfo().getBusiness()).send();
                    shieldSpeedData = AgentManagerFragment.this.createSpeedData;
                    shieldSpeedData.addEvent(ShieldSpeedStep.MF_STEP_VIEW_DID_LOAD.getStep());
                    ShieldMonitorUtil.Companion companion2 = ShieldMonitorUtil.Companion;
                    String business = AgentManagerFragment.this.getShieldGAInfo().getBusiness();
                    if (business == null) {
                        business = shieldSpeedData.getClass().getName();
                        h.a((Object) business, "javaClass.name");
                    }
                    shieldSpeedData.setPage(companion2.getPageKey(business, 1));
                }
            }
        };
        this.createSpeedData.startEvent();
        this.shieldLifeCycler.setHostFragment(this);
        this.whiteBoard = this.shieldLifeCycler.getHostWhiteBoard();
        String configProperty = getConfigProperty("WhiteBoardPersist");
        if (configProperty == null || TextUtils.isEmpty(configProperty) || !h.a((Object) "true", (Object) configProperty) || (arVar = this.whiteBoard) == null) {
            return;
        }
        arVar.e = true;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dianping/agentsdk/fragment/AgentManagerFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$shield_release", "()Ljava/lang/String;", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "956fc2fe83cd4ef882e914cac807205f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "956fc2fe83cd4ef882e914cac807205f");
            return;
        }
        super.onAttach(context);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.registerFragmentLifecycleCallbacks(this.lifeCycleCallbacks, false);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6996d189b325db9400adab4a4653bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6996d189b325db9400adab4a4653bd1");
            return;
        }
        super.onCreate(bundle);
        this.whiteBoard = initWhiteBoard();
        ar arVar = this.whiteBoard;
        if (arVar != null) {
            this.shieldLifeCycler.setWhiteBoard(arVar);
        }
        this.shieldLifeCycler.onCreate(bundle);
        ShieldRuntimeInterface shieldRuntimeImpl = ShieldEnvironment.INSTANCE.getShieldRuntimeImpl();
        if (shieldRuntimeImpl != null) {
            shieldRuntimeImpl.switchMonitorConfigure();
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60f15f015a31d052a65d15734f513b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60f15f015a31d052a65d15734f513b2");
        }
        h.b(layoutInflater, "inflater");
        this.pageContainer = initializePageContainer();
        this.shieldLifeCycler.setPageContainer(this.pageContainer);
        return this.shieldLifeCycler.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87ac15fdba5daf68a51326b0a87ea0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87ac15fdba5daf68a51326b0a87ea0dc");
            return;
        }
        h.b(view, Constants.EventType.VIEW);
        super.onViewCreated(view, bundle);
        if (this.pageContainer == null) {
            this.pageContainer = initializePageContainer();
        }
        this.shieldLifeCycler.setPageContainer(this.pageContainer);
        ab<?> abVar = this.pageContainer;
        if (!(abVar instanceof CommonPageContainer)) {
            abVar = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
        if (commonPageContainer != null) {
            commonPageContainer.addPageLoadFinishListener(this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e98664aa208d6d6c98d1df472649790b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e98664aa208d6d6c98d1df472649790b");
            return;
        }
        super.onActivityCreated(bundle);
        this.cellManager = initCellManager();
        j<?> jVar = this.cellManager;
        if (jVar != null) {
            this.shieldLifeCycler.setCellManager(jVar);
        }
        this.agentManager = initAgentManger();
        com.dianping.agentsdk.framework.d dVar = this.agentManager;
        if (dVar != null) {
            this.shieldLifeCycler.setAgentManager(dVar);
        }
        this.shieldLifeCycler.setShieldArguments(this.mapArguments);
        this.shieldLifeCycler.setShieldGAInfo(getShieldGAInfo());
        this.shieldLifeCycler.setShieldConfigs(generaterConfigs());
        this.shieldLifeCycler.onActivityCreated(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25a23c790b9f04a20ff8ceb942d609f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25a23c790b9f04a20ff8ceb942d609f");
            return;
        }
        super.onStart();
        this.shieldLifeCycler.onStart();
    }

    @Nullable
    public final rx.d<Object> onPullRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e6847cd0f474d06d188f73dc64c7a8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e6847cd0f474d06d188f73dc64c7a8d");
        }
        k kVar = this.refreshSubscription;
        if (kVar != null) {
            kVar.unsubscribe();
        }
        rx.d<Object> onRefresh = onRefresh();
        List<rx.d<Object>> onRefresh2 = this.shieldLifeCycler.onRefresh();
        if (onRefresh != null) {
            onRefresh2.add(onRefresh);
        }
        if (!onRefresh2.isEmpty()) {
            rx.d<Object> a2 = rx.d.a((List) onRefresh2, (rx.functions.k) c.a).a(1);
            this.refreshSubscription = a2.c(new b());
            return a2;
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b<T> implements rx.functions.b<Object> {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // rx.functions.b
        public final void call(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ac3b28a2bdd5d925cac9b6314fdcbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ac3b28a2bdd5d925cac9b6314fdcbb");
                return;
            }
            ab<?> abVar = AgentManagerFragment.this.pageContainer;
            if (!(abVar instanceof PageContainerCommonFunctionInterface)) {
                abVar = null;
            }
            PageContainerCommonFunctionInterface pageContainerCommonFunctionInterface = (PageContainerCommonFunctionInterface) abVar;
            if (pageContainerCommonFunctionInterface != null) {
                pageContainerCommonFunctionInterface.setSuccess();
            }
            AgentManagerFragment agentManagerFragment = AgentManagerFragment.this;
            ExposeAction startExpose = ExposeAction.startExpose(AgentManagerFragment.this.getDelayForAutoExpose());
            h.a((Object) startExpose, "ExposeAction.startExpose(getDelayForAutoExpose())");
            agentManagerFragment.callExposeAction(startExpose);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edd6a0631045f5ee5237f2cc8fe95775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edd6a0631045f5ee5237f2cc8fe95775");
            return;
        }
        super.onResume();
        this.shieldLifeCycler.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "200aaa5f3d9bcafd32cd48746d8618d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "200aaa5f3d9bcafd32cd48746d8618d4");
            return;
        }
        this.shieldLifeCycler.onPause();
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ea8c7e7315daec336bb8b071ffea1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ea8c7e7315daec336bb8b071ffea1d");
            return;
        }
        this.shieldLifeCycler.onStop();
        super.onStop();
    }

    @Override // com.dianping.portal.fragment.HoloFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3772f85ce79a0cc66bda85c28ed968f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3772f85ce79a0cc66bda85c28ed968f3");
            return;
        }
        this.shieldLifeCycler.onDestroy();
        this.agentManager = null;
        this.cellManager = null;
        this.pageContainer = null;
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b807fcb66987df5988f03426b88343e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b807fcb66987df5988f03426b88343e3");
            return;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(this.lifeCycleCallbacks);
        }
        super.onDetach();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f083379bdcffbf1e16ae6dd22aaa5f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f083379bdcffbf1e16ae6dd22aaa5f8a");
            return;
        }
        h.b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.shieldLifeCycler.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467a6a3fa4840c4a3f70944b094e25de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467a6a3fa4840c4a3f70944b094e25de");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.shieldLifeCycler.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Deprecated(message = "override getCellManager method to custom your CellManager is easy confused and plan to be deprecated,use override initCellManager() method instead and initCellManager() method will be called on the fragment's onActivityCreated lifecycle onceif your only want to get CellManager instance of this page,use com.dianping.shield.framework.ShieldContainerInterface.getHostCellManager() method")
    @Nullable
    public j<?> getCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57ef81e0c362821cdf7f7d91af13026", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57ef81e0c362821cdf7f7d91af13026");
        }
        if (this.cellManager == null) {
            if (isNewShieldCellManager("AgentManagerFragment")) {
                Context context = getContext();
                if (context == null) {
                    h.a();
                }
                this.cellManager = new ShieldNodeCellManager(context);
            } else {
                this.cellManager = new com.dianping.agentsdk.manager.b(getContext());
            }
        }
        return this.cellManager;
    }

    @Deprecated(message = "override getAgentManager method to custom your AgentManager is easy confused and plan to be deprecated,use override initAgentManger() method instead and initAgentManger() method will be called on the fragment's onActivityCreated lifecycle once if your only want to get AgentManager instance of this page,use com.dianping.shield.framework.ShieldContainerInterface.getHostAgentManager() method")
    @Nullable
    public com.dianping.agentsdk.framework.d getAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ec881478577993626dd830a32d262a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ec881478577993626dd830a32d262a1");
        }
        if (this.agentManager == null) {
            this.agentManager = new CommonAgentManager(this, this.shieldLifeCycler, this, this.shieldLifeCycler.getPageContainer());
        }
        return this.agentManager;
    }

    @Nullable
    public ab<?> getPageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8960da541a6a3daaf75e0c716dce61a", RobustBitConfig.DEFAULT_VALUE) ? (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8960da541a6a3daaf75e0c716dce61a") : this.shieldLifeCycler.getPageContainer();
    }

    @NotNull
    public j<?> initCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03fc5360777e3e75ff04a6f4e0fb970c", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03fc5360777e3e75ff04a6f4e0fb970c");
        }
        if (isNewShieldCellManager("AgentManagerFragment")) {
            j<?> cellManager = getCellManager();
            if (cellManager == null) {
                Context context = getContext();
                if (context == null) {
                    h.a();
                }
                return new ShieldNodeCellManager(context);
            }
            return cellManager;
        }
        j<?> cellManager2 = getCellManager();
        return cellManager2 == null ? new com.dianping.agentsdk.manager.b(getContext()) : cellManager2;
    }

    @NotNull
    public com.dianping.agentsdk.framework.d initAgentManger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "262a4478e08820cb7cfbf7b74dd186d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "262a4478e08820cb7cfbf7b74dd186d2");
        }
        com.dianping.agentsdk.framework.d agentManager = getAgentManager();
        return agentManager == null ? new CommonAgentManager(this, this.shieldLifeCycler, this, this.shieldLifeCycler.getPageContainer()) : agentManager;
    }

    @Nullable
    public ab<?> initializePageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b13099fd2ddd18fb028433c27a8b856c", RobustBitConfig.DEFAULT_VALUE) ? (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b13099fd2ddd18fb028433c27a8b856c") : getPageContainer();
    }

    @NotNull
    public ar initWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30850692d6e1173d72075f12a727657f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30850692d6e1173d72075f12a727657f");
        }
        ar whiteBoard = getWhiteBoard();
        return whiteBoard == null ? this.shieldLifeCycler.getHostWhiteBoard() : whiteBoard;
    }

    public void isWhiteBoardShared(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0129a18a91d6ba9d6d3de90a0ec5d9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0129a18a91d6ba9d6d3de90a0ec5d9b7");
        } else {
            this.shieldLifeCycler.setWhiteBoardShared(z);
        }
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public void resetAgents(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89729aa8408254cb4844c87d08395ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89729aa8408254cb4844c87d08395ee3");
            return;
        }
        this.shieldLifeCycler.setShieldConfigs(generaterConfigs());
        this.shieldLifeCycler.resetAgents(bundle);
    }

    public final void setAgentContainerView(@NotNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d122ebe694a90ae763ecc619bd080b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d122ebe694a90ae763ecc619bd080b8b");
            return;
        }
        h.b(viewGroup, "containerView");
        this.shieldLifeCycler.setAgentContainerView(viewGroup);
    }

    public final void setHoverContainerView(@NotNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78a0d9f0c1fe42726517fba58399814f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78a0d9f0c1fe42726517fba58399814f");
            return;
        }
        h.b(viewGroup, "container");
        this.shieldLifeCycler.setHoverContainerView(viewGroup);
    }

    public final void updateAgentContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99398164e307cb63c73d6e8f0cc25f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99398164e307cb63c73d6e8f0cc25f2c");
        } else {
            this.shieldLifeCycler.updateAgentContainer();
        }
    }

    @Override // com.dianping.agentsdk.framework.u
    @Nullable
    public ar getWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9e5b4abf024dd84caa318ce837c4053", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9e5b4abf024dd84caa318ce837c4053") : this.shieldLifeCycler.getHostWhiteBoard();
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public ArrayList<com.dianping.agentsdk.framework.c> generaterConfigs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "736527e5771620a1290e4da5cfea339f", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "736527e5771620a1290e4da5cfea339f") : generaterDefaultConfigAgentList();
    }

    public final boolean isNewShieldCellManager(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d3f2d712fec868d656d33b0416dc01c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d3f2d712fec868d656d33b0416dc01c")).booleanValue();
        }
        h.b(str, "currentClassSimpleName");
        g configPropertyHolder = getConfigPropertyHolder("SwitchOldConfig");
        return (configPropertyHolder != null && (configPropertyHolder instanceof SwitchShieldConfigPropertyHolder) && ((SwitchShieldConfigPropertyHolder) configPropertyHolder).configswitch.contains(str)) ? false : true;
    }

    @Nullable
    public final ShieldGlobalFeatureInterface getFeature() {
        return this;
    }

    @Override // com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public ShieldGAInfo getShieldGAInfo() {
        return this.defaultGAInfo;
    }

    public final void setArguments(@Nullable HashMap<String, Serializable> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd842894795559f1ca7485275d5224e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd842894795559f1ca7485275d5224e");
            return;
        }
        this.mapArguments = hashMap;
        this.shieldLifeCycler.setShieldArguments(this.mapArguments);
    }

    @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView.PageLoadFinishListener
    public void onViewHeightFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a808ccd1ba7ac3241eeea82a28803d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a808ccd1ba7ac3241eeea82a28803d");
        } else {
            this.createSpeedData.addEvent(ShieldSpeedStep.MF_STEP_PAGE_LOAD.getStep()).send();
        }
    }

    @Override // com.dianping.shield.lifecycle.NestedPageInterface
    public boolean shouldInterceptPageLifecycle() {
        return this.interceptPageLifecycle;
    }

    public void setInterceptPageLifecycle(boolean z) {
        this.interceptPageLifecycle = z;
    }

    @Override // android.support.v4.app.Fragment
    public void startActivity(@Nullable Intent intent, @Nullable Bundle bundle) {
        ShieldRuntimeInterface shieldRuntimeImpl;
        Object[] objArr = {intent, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af9803ff098c334732e8c09f752442cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af9803ff098c334732e8c09f752442cc");
            return;
        }
        if (intent != null && (shieldRuntimeImpl = ShieldEnvironment.INSTANCE.getShieldRuntimeImpl()) != null) {
            Context context = getContext();
            h.a((Object) context, "context");
            shieldRuntimeImpl.prefetch(context, intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void startActivityForResult(@Nullable Intent intent, int i, @Nullable Bundle bundle) {
        ShieldRuntimeInterface shieldRuntimeImpl;
        Object[] objArr = {intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1deb737834a60323b3323a4a4f17a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1deb737834a60323b3323a4a4f17a44");
            return;
        }
        if (intent != null && (shieldRuntimeImpl = ShieldEnvironment.INSTANCE.getShieldRuntimeImpl()) != null) {
            Context context = getContext();
            h.a((Object) context, "context");
            shieldRuntimeImpl.prefetch(context, intent);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public final long getDelayForAutoExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e447a63a9912ba4a7973ccd9e6055b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e447a63a9912ba4a7973ccd9e6055b")).longValue() : this.shieldLifeCycler.getDelayForAutoExpose();
    }

    public final void setDelayForAutoExpose(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2f695d547e11960df8cc1c563b16cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2f695d547e11960df8cc1c563b16cb3");
        } else {
            this.shieldLifeCycler.setDelayForAutoExpose(num);
        }
    }
}
